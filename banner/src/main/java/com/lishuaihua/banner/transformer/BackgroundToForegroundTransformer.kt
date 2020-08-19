package com.lishuaihua.banner.transformer

import android.view.View

class BackgroundToForegroundTransformer : ABaseTransformer() {
    override fun onTransform(view: View, position: Float) {
        val height = view.height.toFloat()
        val width = view.width.toFloat()
        val scale: Float = ABaseTransformer.Companion.min(if (position < 0.0f) 1.0f else Math.abs(1.0f - position), 0.5f)
        view.scaleX = scale
        view.scaleY = scale
        view.pivotX = width * 0.5f
        view.pivotY = height * 0.5f
        view.translationX = if (position < 0.0f) width * position else -width * position * 0.25f
    }
}