package com.adjust.sdk;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import defpackage.pc6;
import defpackage.qc0;
import defpackage.qc6;
import defpackage.yg5;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class GooglePlayServicesClient {

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static final class GooglePlayServicesInfo {
        private final String gpsAdid;
        private final Boolean trackingEnabled;

        public GooglePlayServicesInfo(String str, Boolean bool) {
            this.gpsAdid = str;
            this.trackingEnabled = bool;
        }

        public String getGpsAdid() {
            return this.gpsAdid;
        }

        public Boolean isTrackingEnabled() {
            return this.trackingEnabled;
        }
    }

    public static GooglePlayServicesInfo getGooglePlayServicesInfo(Context context, long j) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            qc0.p("Google Play Services info can't be accessed from the main thread");
            return null;
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        pc6 pc6Var = new pc6(j);
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (!context.bindService(intent, pc6Var, 1)) {
            yg5.m("Google Play connection failed");
            return null;
        }
        try {
            try {
                qc6 qc6Var = new qc6(pc6Var.a());
                GooglePlayServicesInfo googlePlayServicesInfo = new GooglePlayServicesInfo(qc6Var.d(), qc6Var.e());
                context.unbindService(pc6Var);
                return googlePlayServicesInfo;
            } catch (Exception e) {
                throw e;
            }
        } catch (Throwable th) {
            context.unbindService(pc6Var);
            throw th;
        }
    }
}
