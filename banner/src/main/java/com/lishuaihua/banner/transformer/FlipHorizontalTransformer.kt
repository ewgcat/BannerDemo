package com.lishuaihua.banner.transformer

import android.view.View

class FlipHorizontalTransformer : ABaseTransformer() {
    override fun onTransform(view: View, position: Float) {
        val rotation = 180.0f * position
        view.alpha = if (rotation <= 90.0f && rotation >= -90.0f) 1.0f else 0.0f
        view.pivotX = view.width.toFloat() * 0.5f
        view.pivotY = view.height.toFloat() * 0.5f
        view.rotationY = rotation
    }

    override fun onPostTransform(page: View, position: Float) {
        super.onPostTransform(page, position)
        if (position > -0.5f && position < 0.5f) {
            page.visibility = View.VISIBLE
        } else {
            page.visibility = View.INVISIBLE
        }
    }
}