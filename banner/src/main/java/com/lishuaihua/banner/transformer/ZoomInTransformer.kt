package com.lishuaihua.banner.transformer

import android.view.View

class ZoomInTransformer : ABaseTransformer() {
    override fun onTransform(view: View, position: Float) {
        val scale = if (position < 0.0f) position + 1.0f else Math.abs(1.0f - position)
        view.scaleX = scale
        view.scaleY = scale
        view.pivotX = view.width.toFloat() * 0.5f
        view.pivotY = view.height.toFloat() * 0.5f
        view.alpha = if (position >= -1.0f && position <= 1.0f) 1.0f - (scale - 1.0f) else 0.0f
    }
}