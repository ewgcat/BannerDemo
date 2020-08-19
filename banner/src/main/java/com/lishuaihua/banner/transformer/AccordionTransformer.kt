package com.lishuaihua.banner.transformer

import android.view.View

class AccordionTransformer : ABaseTransformer() {
    override fun onTransform(view: View, position: Float) {
        view.pivotX = if (position < 0.0f) 0.0f else view.width.toFloat()
        view.scaleX = if (position < 0.0f) 1.0f + position else 1.0f - position
    }
}