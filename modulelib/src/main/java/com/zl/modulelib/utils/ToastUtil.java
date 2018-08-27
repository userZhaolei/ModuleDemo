package com.zl.modulelib.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Zhaolei
 * 时间:2018/8/20
 */

public class ToastUtil {

    public static void showToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
