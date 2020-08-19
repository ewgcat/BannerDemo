package com.lishuaihua.banner.transformer

import android.view.View

class CubeOutTransformer : ABaseTransformer() {
    override fun onTransform(view: View, position: Float) {
        view.pivotX = if (position < 0.0f) view.width.toFloat() else 0.0f
        view.pivotY = view.height.toFloat() * 0.5f
        view.rotationY = 90.0f * position
    }

    override val isPagingEnabled: Boolean
        get() = true
}