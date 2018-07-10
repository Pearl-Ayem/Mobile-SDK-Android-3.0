package com.dji.sdk.sample.internal.controller;
import android.app.Application;
import android.content.Context;
import com.secneo.sdk.Helper;
import android.support.multidex.MultiDex;

import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;

import dji.sdk.base.BaseProduct;
import dji.sdk.products.Aircraft;
import dji.sdk.products.HandHeld;
import dji.sdk.sdkmanager.BluetoothProductConnector;
import dji.sdk.sdkmanager.DJISDKManager;

/**
 * Created by Pearl on 2018-07-10.
 */

public class MApplication extends Application{
    @Override
    protected void attachBaseContext(Context paramContext) {
        super.attachBaseContext(paramContext);
        Helper.install(MApplication.this);
    }
}
