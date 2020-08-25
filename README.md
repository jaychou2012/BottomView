BottomView
==========

Android BottomView2014, update for Android Studio


BottomView is for Android， you can easyly set a custom View to your App's bottom.

# Usage

## Put the libray jar to your Application:
You should put bottomView.jar to your libs.(the bottomView.jar can get from this demo).

## Set the BottomView's Theme:
Copy this two style to your application res/values/styles.xml

`<!--Translucent Theme-->
   <style name="BottomViewTheme_Defalut">
        <item name="android:windowFrame">@null</item>
        <item name="android:windowContentOverlay">@null</item>
        <item name="android:windowIsFloating">true</item>
        <item name="android:windowIsTranslucent">false</item>
        <item name="android:windowNoTitle">true</item>
        <item name="android:windowBackground">@color/white</item>
        <item name="android:backgroundDimEnabled">true</item>
        <item name="android:windowFullscreen">true</item>
    </style>
<!--Transparent Theme-->
    <style name="BottomViewTheme_Transparent">
        <item name="android:windowFrame">@null</item>
        <item name="android:windowIsFloating">true</item>
        <!-- Transparent -->
        <item name="android:windowIsTranslucent">false</item>
        <item name="android:windowContentOverlay">@null</item>
        <item name="android:windowNoTitle">true</item>
        <item name="android:windowBackground">@color/white</item>
        <item name="android:backgroundDimEnabled">false</item>
    </style>
`

if you want the bottomView has a animation,you can put the animation theme to the res/values/styles.xml  or user library inside anim.

`<style name="BottomToTopAnim" parent="android:Animation">
        <item name="@android:windowEnterAnimation">@anim/bottomview_anim_enter</item>
        <item name="@android:windowExitAnimation">@anim/bottomview_anim_exit</item>
    </style>`

res/anim/bottomview_anim_enter.xml
`<?xml version="1.0" encoding="utf-8"?>
<set xmlns:android="http://schemas.android.com/apk/res/android" >

    <translate
        android:duration="500"
        android:fromYDelta="100%p" />

</set>`

res/anim/bottomview_anim_exit.xml

`<?xml version="1.0" encoding="utf-8"?>
<set xmlns:android="http://schemas.android.com/apk/res/android" >

    <translate
        android:duration="500"
        android:toYDelta="100%p" />

</set>`

# Key Code

`BottomView bottomView = new BottomView(this,
                    R.style.BottomViewTheme_Defalut, R.layout.bottom_view);
            bottomView.setAnimation(R.style.BottomToTopAnim);//set animation
            bottomView.showBottomView(false);`

If you want to get the view, use .getView()

# Effect
![](https://github.com/jaychou2012/BottomView/blob/master/Screenshot_20170826-132058.png)


## 《Android开发进阶实战：拓展与提升》已出版


### 新书涵盖Android最新的技术和内容，包括：新布局方式ConstraintLayout 、AndroidX、Jetpack、TV开发等，值得购买阅读。


![Android开发进阶实战：拓展与提升](http://img13.360buyimg.com/n1/jfs/t1/113550/10/7905/112523/5ec79791E6bf5d507/7169944c4d0d6669.jpg "Android开发进阶实战：拓展与提升")


### 纸质书购买：

[京东](https://item.jd.com/69496918930.html "京东")         [天猫](https://detail.tmall.com/item.htm?spm=a220m.1000858.1000725.6.7103434dRkHC8S&id=618745314823&user_id=3446196188&cat_id=2&is_b=1&rn=45bd1618b102199a8f9794a7b8431df4 "天猫")  [当当](http://product.dangdang.com/28552590.html "当当")
