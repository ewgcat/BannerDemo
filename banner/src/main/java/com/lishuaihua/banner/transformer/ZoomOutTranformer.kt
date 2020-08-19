package com.lishuaihua.banner.transformer

import android.view.View

class ZoomOutTranformer : ABaseTransformer() {
    override fun onTransform(view: View, position: Float) {
        val scale = 1.0f + Math.abs(position)
        view.scaleX = scale
        view.scaleY = scale
        view.pivotX = view.width.toFloat() * 0.5f
        view.pivotY = view.height.toFloat() * 0.5f
        view.alpha = if (position >= -1.0f && position <= 1.0f) 1.0f - (scale - 1.0f) else 0.0f
        if (position == -1.0f) {
            view.translationX = (view.width * -1).toFloat()
        }
    }
}