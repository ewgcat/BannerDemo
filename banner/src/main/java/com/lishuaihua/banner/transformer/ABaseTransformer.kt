package com.lishuaihua.banner.transformer

import android.view.View
import androidx.viewpager.widget.ViewPager.PageTransformer

abstract class ABaseTransformer : PageTransformer {
    protected abstract fun onTransform(var1: View, var2: Float)
    override fun transformPage(page: View, position: Float) {
        onPreTransform(page, position)
        onTransform(page, position)
        onPostTransform(page, position)
    }

    protected fun hideOffscreenPages(): Boolean {
        return true
    }

    protected open val isPagingEnabled: Boolean
        protected get() = false

    protected fun onPreTransform(page: View, position: Float) {
        val width = page.width.toFloat()
        page.rotationX = 0.0f
        page.rotationY = 0.0f
        page.rotation = 0.0f
        page.scaleX = 1.0f
        page.scaleY = 1.0f
        page.pivotX = 0.0f
        page.pivotY = 0.0f
        page.translationY = 0.0f
        page.translationX = if (isPagingEnabled) 0.0f else -width * position
        if (hideOffscreenPages()) {
            page.alpha = if (position > -1.0f && position < 1.0f) 1.0f else 0.0f
        } else {
            page.alpha = 1.0f
        }
    }

    protected open fun onPostTransform(page: View, position: Float) {}

    companion object {
        @JvmStatic
        protected fun min(`val`: Float, min: Float): Float {
            return if (`val` < min) min else `val`
        }
    }
}