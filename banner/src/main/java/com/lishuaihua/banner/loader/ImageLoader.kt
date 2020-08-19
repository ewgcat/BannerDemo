package com.lishuaihua.banner.loader

import android.content.Context
import android.widget.ImageView

abstract class ImageLoader : ImageLoaderInterface<ImageView> {
    override fun createImageView(context: Context?): ImageView {
        return ImageView(context)
    }
}