package com.zhpan.viewpagerindicator;

import android.app.Application;

import com.zhpan.indicator.utils.IndicatorUtils;

/**
 * <pre>
 *   Created by zhangpan on 2019-08-14.
 *   Description:
 * </pre>
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        IndicatorUtils.setDebugMode(true);
    }
}
