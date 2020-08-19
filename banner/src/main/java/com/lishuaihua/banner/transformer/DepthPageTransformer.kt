package com.lishuaihua.banner.transformer

import android.view.View

class DepthPageTransformer : ABaseTransformer() {
    override fun onTransform(view: View, position: Float) {
        if (position <= 0.0f) {
            view.translationX = 0.0f
            view.scaleX = 1.0f
            view.scaleY = 1.0f
        } else if (position <= 1.0f) {
            val scaleFactor = 0.75f + 0.25f * (1.0f - Math.abs(position))
            view.alpha = 1.0f - position
            view.pivotY = 0.5f * view.height.toFloat()
            view.translationX = view.width.toFloat() * -position
            view.scaleX = scaleFactor
            view.scaleY = scaleFactor
        }
    }

    protected override val isPagingEnabled: Boolean
        protected get() = true

    companion object {
        private const val MIN_SCALE = 0.75f
    }
}