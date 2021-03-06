// ======================================================================
// Project Name    : android_plugin
//
// Copyright © 2019 U-CREATES. All rights reserved.
//
// This source code is the property of U-CREATES.
// If such findings are accepted at any time.
// We hope the tips and helpful in developing.
// ======================================================================
package com.ucreates.client;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.frontend.notify.FCMNotifierPlugin;
public class FCMNotifierPluginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fcmnotifierplugin);
        FCMNotifierPlugin plugin = FCMNotifierPlugin.getInstance();
        plugin.register(this);
        return;
    }
}
