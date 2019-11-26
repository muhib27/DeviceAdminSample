package com.classtune.deviceadminsample;

import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyPolicyReceiver extends DeviceAdminReceiver {
    private static final String PREFIX = MyPolicyReceiver.class.getSimpleName() + ": ";

    @Override
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);

    }

    @Override
    public void onEnabled(Context context, Intent intent) {
        super.onEnabled(context, intent);

    }

    @Override
    public void onDisabled(Context context, Intent intent) {
        super.onDisabled(context, intent);

    }


}