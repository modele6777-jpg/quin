package com.adjust.sdk;

import android.content.Intent;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements Runnable {
    public final /* synthetic */ Uri a;
    public final /* synthetic */ Intent b;
    public final /* synthetic */ ActivityHandler c;

    public f(Intent intent, Uri uri, ActivityHandler activityHandler) {
        this.c = activityHandler;
        this.a = uri;
        this.b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActivityHandler activityHandler = this.c;
        AdjustConfig adjustConfig = activityHandler.adjustConfig;
        if (adjustConfig == null) {
            return;
        }
        OnDeferredDeeplinkResponseListener onDeferredDeeplinkResponseListener = adjustConfig.onDeferredDeeplinkResponseListener;
        Uri uri = this.a;
        if (onDeferredDeeplinkResponseListener != null ? onDeferredDeeplinkResponseListener.launchReceivedDeeplink(uri) : true) {
            activityHandler.launchDeeplinkMain(this.b, uri);
        }
    }
}
