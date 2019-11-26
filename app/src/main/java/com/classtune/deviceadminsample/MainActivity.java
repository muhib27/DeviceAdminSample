package com.classtune.deviceadminsample;

import androidx.appcompat.app.AppCompatActivity;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private DevicePolicyManager devicePolicyManager;
    private ComponentName componentName;
    private static final int REQUEST_ENABLE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        devicePolicyManager = (DevicePolicyManager) getSystemService(Context.DEVICE_POLICY_SERVICE);
        componentName = new ComponentName(this, MyPolicyReceiver.class);

        boolean active = devicePolicyManager.isAdminActive(componentName);
        if(!active) {
            Intent intent = new Intent(DevicePolicyManager.ACTION_ADD_DEVICE_ADMIN);
            intent.putExtra(DevicePolicyManager.EXTRA_DEVICE_ADMIN, componentName);
            intent.putExtra(DevicePolicyManager.EXTRA_ADD_EXPLANATION, getString(R.string.request_explanation));
            startActivityForResult(intent, REQUEST_ENABLE);
        }
        else {
            devicePolicyManager.lockNow();
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            switch (requestCode) {
                case REQUEST_ENABLE:
//                    checkBoxAdmin.setChecked(true);
//                    AdminApp.logger(PREFIX, "Enabling Policies Now", Log.DEBUG);

//                    devicePolicyManager.setMaximumTimeToLock(componentName, 3000L);
//                    devicePolicyManager.setMaximumFailedPasswordsForWipe(componentName, 5);
//                    devicePolicyManager.setPasswordQuality(componentName, DevicePolicyManager.PASSWORD_QUALITY_UNSPECIFIED);
//                    devicePolicyManager.setCameraDisabled(componentName, false);




                    break;
            }
        } else {
//            checkBoxAdmin.setChecked(false);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        this.finish();
    }
}
