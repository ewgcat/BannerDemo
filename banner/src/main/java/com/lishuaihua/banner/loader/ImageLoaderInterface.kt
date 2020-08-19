package com.lishuaihua.banner.loader

import android.content.Context
import android.view.View
import java.io.Serializable

interface ImageLoaderInterface<T : View> : Serializable {
    fun displayImage(context: Context?, o: Any?, t: T)
    fun createImageView(context: Context?): T
}