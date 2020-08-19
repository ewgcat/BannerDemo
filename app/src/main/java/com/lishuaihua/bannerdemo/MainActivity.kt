package com.lishuaihua.bannerdemo

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.lishuaihua.banner.BannerConfig
import com.lishuaihua.banner.Transformer
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONObject
import java.util.ArrayList

class MainActivity : AppCompatActivity(), ViewPager.OnPageChangeListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val images = ArrayList<String>()
        images.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1597827464352&di=7ddaacdf5781c916de934d2bd3fe4224&imgtype=0&src=http%3A%2F%2Fa2.att.hudong.com%2F36%2F48%2F19300001357258133412489354717.jpg")
        images.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1597827464351&di=4c0a5fe7896e1b97aa1a28d084790f92&imgtype=0&src=http%3A%2F%2Fa1.att.hudong.com%2F68%2F42%2F01300000165488121456425486010.jpg")
        images.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1597827464351&di=754781de744e02bf1cc932ad04c03564&imgtype=0&src=http%3A%2F%2Fa4.att.hudong.com%2F52%2F52%2F01200000169026136208529565374.jpg")
        images.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1597827464350&di=7badd8ac3d33131f0bc04713717f4234&imgtype=0&src=http%3A%2F%2Fi.jianbihua.cc%2Fuploads%2Fallimg%2F140426%2F15-140426164630l9.jpg")

        //设置banner样式
        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR)
        //设置图片加载器
        banner.setImageLoader(GlideRoundImageLoader())
        //设置图片集合
        //设置banner动画效果
        banner.setBannerAnimation(Transformer.DepthPage)
        //设置自动轮播，默认为true
        banner.isAutoPlay(true)
        //设置轮播时间
        banner.setDelayTime(5000)
        //设置指示器位置（当banner模式中有指示器时）
        banner.setIndicatorGravity(BannerConfig.RIGHT)
        banner.setImages(images)
        banner.setOnPageChangeListener(this)
        banner.start()
        banner.setOnBannerListener{
            Toast.makeText(MainActivity@this,"点击了"+it,Toast.LENGTH_LONG).show()
        }
    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

    }

    override fun onPageSelected(position: Int) {
    }

    override fun onPageScrollStateChanged(state: Int) {
    }
}