package com.adjust.sdk.network;

import com.adjust.sdk.ActivityPackage;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Runnable {
    public final /* synthetic */ IActivityPackageSender.ResponseDataCallbackSubscriber a;
    public final /* synthetic */ ActivityPackage b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ ActivityPackageSender d;

    public a(ActivityPackageSender activityPackageSender, IActivityPackageSender.ResponseDataCallbackSubscriber responseDataCallbackSubscriber, ActivityPackage activityPackage, Map map) {
        this.d = activityPackageSender;
        this.a = responseDataCallbackSubscriber;
        this.b = activityPackage;
        this.c = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.onResponseDataCallback(this.d.sendActivityPackageSync(this.b, this.c));
    }
}
