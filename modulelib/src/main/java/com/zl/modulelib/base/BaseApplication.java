package com.zl.modulelib.base;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Zhaolei
 * 时间:2018/8/20
 */

public class BaseApplication extends Application {
    private boolean isDebug = true;

    @Override
    public void onCreate() {
        super.onCreate();
        if (isDebug) {
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(this);
    }

}
