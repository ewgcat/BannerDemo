package com.lishuaihua.banner.transformer

import android.view.View

class RotateDownTransformer : ABaseTransformer() {
    override fun onTransform(view: View, position: Float) {
        val width = view.width.toFloat()
        val height = view.height.toFloat()
        val rotation = -15.0f * position * -1.25f
        view.pivotX = width * 0.5f
        view.pivotY = height
        view.rotation = rotation
    }

    protected override val isPagingEnabled: Boolean
        protected get() = true

    companion object {
        private const val ROT_MOD = -15.0f
    }
}