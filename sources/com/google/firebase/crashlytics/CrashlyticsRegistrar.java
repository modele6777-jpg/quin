package com.google.firebase.crashlytics;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import defpackage.ff5;
import defpackage.h1d;
import defpackage.jv2;
import defpackage.kb2;
import defpackage.l01;
import defpackage.l58;
import defpackage.lb2;
import defpackage.lg5;
import defpackage.ml;
import defpackage.ns0;
import defpackage.of5;
import defpackage.vg5;
import defpackage.xb2;
import defpackage.xg5;
import defpackage.xw3;
import defpackage.y3b;
import defpackage.z7f;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-cls";
    private final y3b backgroundExecutorService = new y3b(ns0.class, ExecutorService.class);
    private final y3b blockingExecutorService = new y3b(l01.class, ExecutorService.class);
    private final y3b lightweightExecutorService = new y3b(l58.class, ExecutorService.class);

    static {
        Map map = xg5.b;
        h1d h1dVar = h1d.a;
        if (map.containsKey(h1dVar)) {
            Log.d("FirebaseSessions", "Dependency " + h1dVar + " already added.");
            return;
        }
        map.put(h1dVar, new vg5(new CountDownLatch(1)));
        Log.d("FirebaseSessions", "Dependency to " + h1dVar + " added.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FirebaseCrashlytics buildCrashlytics(xb2 xb2Var) {
        CrashlyticsWorkers.setEnforcement(false);
        long jCurrentTimeMillis = System.currentTimeMillis();
        FirebaseCrashlytics firebaseCrashlyticsInit = FirebaseCrashlytics.init((ff5) xb2Var.a(ff5.class), (of5) xb2Var.a(of5.class), xb2Var.u(CrashlyticsNativeComponent.class), xb2Var.u(ml.class), xb2Var.u(lg5.class), (ExecutorService) xb2Var.r(this.backgroundExecutorService), (ExecutorService) xb2Var.r(this.blockingExecutorService), (ExecutorService) xb2Var.r(this.lightweightExecutorService));
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (jCurrentTimeMillis2 > 16) {
            Logger.getLogger().d("Initializing Crashlytics blocked main for " + jCurrentTimeMillis2 + " ms");
        }
        return firebaseCrashlyticsInit;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<lb2> getComponents() {
        kb2 kb2VarB = lb2.b(FirebaseCrashlytics.class);
        kb2VarB.a = LIBRARY_NAME;
        kb2VarB.a(xw3.c(ff5.class));
        kb2VarB.a(xw3.c(of5.class));
        kb2VarB.a(xw3.b(this.backgroundExecutorService));
        kb2VarB.a(xw3.b(this.blockingExecutorService));
        kb2VarB.a(xw3.b(this.lightweightExecutorService));
        kb2VarB.a(new xw3(0, 2, CrashlyticsNativeComponent.class));
        kb2VarB.a(new xw3(0, 2, ml.class));
        kb2VarB.a(new xw3(0, 2, lg5.class));
        kb2VarB.f = new jv2(16, this);
        kb2VarB.c(2);
        return Arrays.asList(kb2VarB.b(), z7f.B(LIBRARY_NAME, BuildConfig.VERSION_NAME));
    }
}
