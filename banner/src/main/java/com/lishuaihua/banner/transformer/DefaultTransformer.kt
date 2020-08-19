package com.lishuaihua.banner.transformer

import android.view.View

class DefaultTransformer : ABaseTransformer() {
    override fun onTransform(view: View, position: Float) {}
    override val isPagingEnabled: Boolean
        get() = true
}