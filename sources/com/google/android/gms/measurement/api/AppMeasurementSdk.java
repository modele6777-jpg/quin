package com.google.android.gms.measurement.api;

import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Pair;
import defpackage.cxg;
import defpackage.fug;
import defpackage.owg;
import defpackage.pxg;
import defpackage.qwg;
import defpackage.uvg;
import defpackage.uwg;
import defpackage.vxg;
import io.sentry.android.core.b1;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class AppMeasurementSdk {
    public final vxg a;

    public AppMeasurementSdk(vxg vxgVar) {
        this.a = vxgVar;
    }

    public static AppMeasurementSdk getInstance(Context context) {
        return vxg.e(context, null).b;
    }

    public final void a(uvg uvgVar) {
        vxg vxgVar = this.a;
        ArrayList arrayList = vxgVar.c;
        synchronized (arrayList) {
            for (int i = 0; i < arrayList.size(); i++) {
                try {
                    if (uvgVar.equals(((Pair) arrayList.get(i)).first)) {
                        b1.l("FA", "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            pxg pxgVar = new pxg(uvgVar);
            arrayList.add(new Pair(uvgVar, pxgVar));
            if (vxgVar.f != null) {
                try {
                    vxgVar.f.registerOnMeasurementEventListener(pxgVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    b1.l("FA", "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            vxgVar.c(new qwg(vxgVar, pxgVar, 4));
        }
    }

    public void beginAdUnitExposure(String str) {
        vxg vxgVar = this.a;
        vxgVar.c(new uwg(vxgVar, str, 1));
    }

    public void endAdUnitExposure(String str) {
        vxg vxgVar = this.a;
        vxgVar.c(new uwg(vxgVar, str, 2));
    }

    public long generateEventId() {
        return this.a.g();
    }

    public String getAppInstanceId() {
        fug fugVar = new fug();
        vxg vxgVar = this.a;
        vxgVar.c(new cxg(vxgVar, fugVar, 1));
        return (String) fug.f(fugVar.e(50L), String.class);
    }

    public String getGmpAppId() {
        fug fugVar = new fug();
        vxg vxgVar = this.a;
        vxgVar.c(new cxg(vxgVar, fugVar, 0));
        return (String) fug.f(fugVar.e(500L), String.class);
    }

    public void logEvent(String str, String str2, Bundle bundle) {
        vxg vxgVar = this.a;
        vxgVar.c(new owg(vxgVar, str, str2, bundle, true));
    }
}
