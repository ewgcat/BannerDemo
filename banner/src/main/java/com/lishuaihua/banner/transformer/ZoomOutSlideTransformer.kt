package com.lishuaihua.banner.transformer

import android.view.View

class ZoomOutSlideTransformer : ABaseTransformer() {
    override fun onTransform(view: View, position: Float) {
        if (position >= -1.0f || position <= 1.0f) {
            val height = view.height.toFloat()
            val width = view.width.toFloat()
            val scaleFactor = Math.max(0.85f, 1.0f - Math.abs(position))
            val vertMargin = height * (1.0f - scaleFactor) / 2.0f
            val horzMargin = width * (1.0f - scaleFactor) / 2.0f
            view.pivotY = 0.5f * height
            view.pivotX = 0.5f * width
            if (position < 0.0f) {
                view.translationX = horzMargin - vertMargin / 2.0f
            } else {
                view.translationX = -horzMargin + vertMargin / 2.0f
            }
            view.scaleX = scaleFactor
            view.scaleY = scaleFactor
            view.alpha = 0.5f + (scaleFactor - 0.85f) / 0.14999998f * 0.5f
        }
    }

    companion object {
        private const val MIN_SCALE = 0.85f
        private const val MIN_ALPHA = 0.5f
    }
}