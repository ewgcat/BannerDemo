package com.lishuaihua.banner.transformer

import android.view.View

class RotateUpTransformer : ABaseTransformer() {
    override fun onTransform(view: View, position: Float) {
        val width = view.width.toFloat()
        val rotation = -15.0f * position
        view.pivotX = width * 0.5f
        view.pivotY = 0.0f
        view.translationX = 0.0f
        view.rotation = rotation
    }

    protected override val isPagingEnabled: Boolean
        protected get() = true

    companion object {
        private const val ROT_MOD = -15.0f
    }
}