package com.lishuaihua.banner.transformer

import android.view.View

class StackTransformer : ABaseTransformer() {
    override fun onTransform(view: View, position: Float) {
        view.translationX = if (position < 0.0f) 0.0f else (-view.width).toFloat() * position
    }
}