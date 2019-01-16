package com.goals.jcentertestlib;

import android.content.Context;
import android.widget.Toast;

/**
 * describe:
 *
 * @author HuYQ
 * date: 2019/1/16
 * email: 262489227@qq.com
 */
public class ToastUtil {
    public static void show(Context context, String message) {
        Toast.makeText(context, "DemoForJCenterLibrary：" + message, Toast.LENGTH_SHORT).show();
    }
}
