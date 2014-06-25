BottomView
==========

Android BottomView2014


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
Then res/values/color.xml  put

`<color name="white">#ffffff</color>`

if you want the bottomView has a animation,you can put the animation theme to the res/values/styles.xml

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

Like this:
![](http://img.blog.csdn.net/20140624223226218)

# Key Code

`BottomView bottomView = new BottomView(this,
                    R.style.BottomViewTheme_Defalut, R.layout.bottom_view);
            bottomView.setAnimation(R.style.BottomToTopAnim);//set animation
            bottomView.showBottomView(false);`

If you want to get the view, use .getView()

# Effect
![](http://img.blog.csdn.net/20140624222106656)
