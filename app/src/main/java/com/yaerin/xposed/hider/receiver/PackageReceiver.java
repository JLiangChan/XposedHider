package com.yaerin.xposed.hider.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.yaerin.xposed.hider.util.Utilities;

public class PackageReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        new Thread(() -> Utilities.updateAppList(context)).start();
    }
}
