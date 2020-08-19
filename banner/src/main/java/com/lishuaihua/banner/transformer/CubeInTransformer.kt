package com.lishuaihua.banner.transformer

import android.view.View

class CubeInTransformer : ABaseTransformer() {
    override fun onTransform(view: View, position: Float) {
        view.pivotX = if (position > 0.0f) 0.0f else view.width.toFloat()
        view.pivotY = 0.0f
        view.rotationY = -90.0f * position
    }

    override val isPagingEnabled: Boolean
        get() = true
}