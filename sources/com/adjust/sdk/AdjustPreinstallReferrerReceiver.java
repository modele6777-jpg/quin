package com.adjust.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class AdjustPreinstallReferrerReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String stringExtra;
        if (intent == null || (stringExtra = intent.getStringExtra(Constants.EXTRA_SYSTEM_INSTALLER_REFERRER)) == null) {
            return;
        }
        Adjust.getDefaultInstance().sendPreinstallReferrer(stringExtra, context);
    }
}
