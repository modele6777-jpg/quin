package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import defpackage.a7h;
import defpackage.b9h;
import defpackage.bwg;
import defpackage.bzg;
import defpackage.c8h;
import defpackage.dwg;
import defpackage.e1h;
import defpackage.esg;
import defpackage.gsg;
import defpackage.gwg;
import defpackage.hsg;
import defpackage.hvg;
import defpackage.iwg;
import defpackage.kd0;
import defpackage.kug;
import defpackage.lwg;
import defpackage.m3h;
import defpackage.m6h;
import defpackage.m8h;
import defpackage.n6h;
import defpackage.nvg;
import defpackage.oa7;
import defpackage.p6h;
import defpackage.pe;
import defpackage.psd;
import defpackage.q8h;
import defpackage.qbh;
import defpackage.qc0;
import defpackage.qch;
import defpackage.qqg;
import defpackage.qu1;
import defpackage.t6h;
import defpackage.t8h;
import defpackage.tk9;
import defpackage.tug;
import defpackage.tz0;
import defpackage.vbh;
import defpackage.vt6;
import defpackage.w0h;
import defpackage.w1e;
import defpackage.w36;
import defpackage.w3h;
import defpackage.wch;
import defpackage.x5h;
import defpackage.xzg;
import defpackage.y6h;
import defpackage.ya5;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class AppMeasurementDynamiteService extends kug {
    public w3h d;
    public final kd0 e;

    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.d = null;
        this.e = new kd0(0);
    }

    @Override // defpackage.mug
    public void beginAdUnitExposure(String str, long j) {
        e();
        bwg bwgVar = this.d.Y;
        w3h.e(bwgVar);
        bwgVar.B0(j, str);
    }

    @Override // defpackage.mug
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        e();
        c8h c8hVar = this.d.X;
        w3h.g(c8hVar);
        c8hVar.O0(str, str2, bundle);
    }

    @Override // defpackage.mug
    public void clearMeasurementEnabled(long j) {
        e();
        c8h c8hVar = this.d.X;
        w3h.g(c8hVar);
        c8hVar.B0();
        m3h m3hVar = ((w3h) c8hVar.b).g;
        w3h.h(m3hVar);
        m3hVar.J0(new w36(c8hVar, null, false, 25));
    }

    public final void e() {
        if (this.d != null) {
            return;
        }
        qc0.p("Attempting to perform action before initialize.");
    }

    @Override // defpackage.mug
    public void endAdUnitExposure(String str, long j) {
        e();
        bwg bwgVar = this.d.Y;
        w3h.e(bwgVar);
        bwgVar.C0(j, str);
    }

    public final void f(String str, tug tugVar) {
        e();
        qch qchVar = this.d.w;
        w3h.f(qchVar);
        qchVar.o1(str, tugVar);
    }

    @Override // defpackage.mug
    public void generateEventId(tug tugVar) {
        e();
        qch qchVar = this.d.w;
        w3h.f(qchVar);
        long jZ1 = qchVar.z1();
        e();
        qch qchVar2 = this.d.w;
        w3h.f(qchVar2);
        qchVar2.p1(tugVar, jZ1);
    }

    @Override // defpackage.mug
    public void getAppInstanceId(tug tugVar) {
        e();
        m3h m3hVar = this.d.g;
        w3h.h(m3hVar);
        m3hVar.J0(new w36(this, tugVar, false, 22));
    }

    @Override // defpackage.mug
    public void getCachedAppInstanceId(tug tugVar) {
        e();
        c8h c8hVar = this.d.X;
        w3h.g(c8hVar);
        f((String) c8hVar.v.get(), tugVar);
    }

    @Override // defpackage.mug
    public void getConditionalUserProperties(String str, String str2, tug tugVar) {
        e();
        m3h m3hVar = this.d.g;
        w3h.h(m3hVar);
        m3hVar.J0(new qu1(this, tugVar, str, str2, 9));
    }

    @Override // defpackage.mug
    public void getCurrentScreenClass(tug tugVar) {
        e();
        c8h c8hVar = this.d.X;
        w3h.g(c8hVar);
        b9h b9hVar = ((w3h) c8hVar.b).z;
        w3h.g(b9hVar);
        t8h t8hVar = b9hVar.d;
        f(t8hVar != null ? t8hVar.b : null, tugVar);
    }

    @Override // defpackage.mug
    public void getCurrentScreenName(tug tugVar) {
        e();
        c8h c8hVar = this.d.X;
        w3h.g(c8hVar);
        b9h b9hVar = ((w3h) c8hVar.b).z;
        w3h.g(b9hVar);
        t8h t8hVar = b9hVar.d;
        f(t8hVar != null ? t8hVar.a : null, tugVar);
    }

    @Override // defpackage.mug
    public void getGmpAppId(tug tugVar) {
        e();
        c8h c8hVar = this.d.X;
        w3h.g(c8hVar);
        f(c8hVar.P0(), tugVar);
    }

    @Override // defpackage.mug
    public void getMaxUserProperties(String str, tug tugVar) {
        e();
        c8h c8hVar = this.d.X;
        w3h.g(c8hVar);
        oa7.x(str);
        qqg qqgVar = ((w3h) c8hVar.b).d;
        e();
        qch qchVar = this.d.w;
        w3h.f(qchVar);
        qchVar.q1(tugVar, 25);
    }

    @Override // defpackage.mug
    public void getSessionId(tug tugVar) {
        e();
        c8h c8hVar = this.d.X;
        w3h.g(c8hVar);
        m3h m3hVar = ((w3h) c8hVar.b).g;
        w3h.h(m3hVar);
        m3hVar.J0(new lwg(c8hVar, tugVar));
    }

    @Override // defpackage.mug
    public void getTestFlag(tug tugVar, int i) {
        e();
        if (i == 0) {
            qch qchVar = this.d.w;
            w3h.f(qchVar);
            c8h c8hVar = this.d.X;
            w3h.g(c8hVar);
            AtomicReference atomicReference = new AtomicReference();
            m3h m3hVar = ((w3h) c8hVar.b).g;
            w3h.h(m3hVar);
            qchVar.o1((String) m3hVar.K0(atomicReference, 15000L, "String test flag value", new y6h(c8hVar, atomicReference, 0)), tugVar);
            return;
        }
        if (i == 1) {
            qch qchVar2 = this.d.w;
            w3h.f(qchVar2);
            c8h c8hVar2 = this.d.X;
            w3h.g(c8hVar2);
            AtomicReference atomicReference2 = new AtomicReference();
            m3h m3hVar2 = ((w3h) c8hVar2.b).g;
            w3h.h(m3hVar2);
            qchVar2.p1(tugVar, ((Long) m3hVar2.K0(atomicReference2, 15000L, "long test flag value", new a7h(c8hVar2, atomicReference2))).longValue());
            return;
        }
        if (i == 2) {
            qch qchVar3 = this.d.w;
            w3h.f(qchVar3);
            c8h c8hVar3 = this.d.X;
            w3h.g(c8hVar3);
            AtomicReference atomicReference3 = new AtomicReference();
            m3h m3hVar3 = ((w3h) c8hVar3.b).g;
            w3h.h(m3hVar3);
            double dDoubleValue = ((Double) m3hVar3.K0(atomicReference3, 15000L, "double test flag value", new y6h(c8hVar3, atomicReference3, 1))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", dDoubleValue);
            try {
                tugVar.x(bundle);
                return;
            } catch (RemoteException e) {
                w0h w0hVar = ((w3h) qchVar3.b).f;
                w3h.h(w0hVar);
                w0hVar.x.b(e, "Error returning double value to wrapper");
                return;
            }
        }
        if (i == 3) {
            qch qchVar4 = this.d.w;
            w3h.f(qchVar4);
            c8h c8hVar4 = this.d.X;
            w3h.g(c8hVar4);
            AtomicReference atomicReference4 = new AtomicReference();
            m3h m3hVar4 = ((w3h) c8hVar4.b).g;
            w3h.h(m3hVar4);
            qchVar4.q1(tugVar, ((Integer) m3hVar4.K0(atomicReference4, 15000L, "int test flag value", new t6h(c8hVar4, atomicReference4, 1))).intValue());
            return;
        }
        if (i != 4) {
            return;
        }
        qch qchVar5 = this.d.w;
        w3h.f(qchVar5);
        c8h c8hVar5 = this.d.X;
        w3h.g(c8hVar5);
        AtomicReference atomicReference5 = new AtomicReference();
        m3h m3hVar5 = ((w3h) c8hVar5.b).g;
        w3h.h(m3hVar5);
        qchVar5.s1(tugVar, ((Boolean) m3hVar5.K0(atomicReference5, 15000L, "boolean test flag value", new t6h(c8hVar5, atomicReference5, 0))).booleanValue());
    }

    @Override // defpackage.mug
    public void getUserProperties(String str, String str2, boolean z, tug tugVar) {
        e();
        m3h m3hVar = this.d.g;
        w3h.h(m3hVar);
        m3hVar.J0(new m6h(this, tugVar, str, str2, z));
    }

    @Override // defpackage.mug
    public void initForTests(Map map) {
        e();
    }

    @Override // defpackage.mug
    public void initialize(vt6 vt6Var, gwg gwgVar, long j) {
        w3h w3hVar = this.d;
        if (w3hVar == null) {
            Context context = (Context) tk9.N(vt6Var);
            oa7.A(context);
            this.d = w3h.m(context, gwgVar, Long.valueOf(j), null);
        } else {
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.x.a("Attempting to initialize multiple times");
        }
    }

    @Override // defpackage.mug
    public void initializeWithElapsedTime(vt6 vt6Var, gwg gwgVar, long j, long j2) {
        w3h w3hVar = this.d;
        if (w3hVar == null) {
            Context context = (Context) tk9.N(vt6Var);
            oa7.A(context);
            this.d = w3h.m(context, gwgVar, Long.valueOf(j), Long.valueOf(j2));
        } else {
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.x.a("Attempting to initialize multiple times");
        }
    }

    @Override // defpackage.mug
    public void isDataCollectionEnabled(tug tugVar) {
        e();
        m3h m3hVar = this.d.g;
        w3h.h(m3hVar);
        m3hVar.J0(new lwg(this, tugVar, false, 29));
    }

    @Override // defpackage.mug
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        e();
        c8h c8hVar = this.d.X;
        w3h.g(c8hVar);
        c8hVar.F0(str, str2, bundle, z, z2, j, 0L);
    }

    @Override // defpackage.mug
    public void logEventAndBundle(String str, String str2, Bundle bundle, tug tugVar, long j) {
        e();
        oa7.x(str2);
        String str3 = true != this.d.d.L0(null, bzg.f1) ? "app" : "auto";
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", str3);
        hsg hsgVar = new hsg(str2, new esg(bundle), str3, j, 0L);
        m3h m3hVar = this.d.g;
        w3h.h(m3hVar);
        m3hVar.J0(new qu1(this, tugVar, hsgVar, str, 4));
    }

    @Override // defpackage.mug
    public void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) {
        e();
        c8h c8hVar = this.d.X;
        w3h.g(c8hVar);
        c8hVar.F0(str, str2, bundle, z, z2, j, j2);
    }

    @Override // defpackage.mug
    public void logHealthData(int i, String str, vt6 vt6Var, vt6 vt6Var2, vt6 vt6Var3) {
        e();
        Object objN = vt6Var == null ? null : tk9.N(vt6Var);
        Object objN2 = vt6Var2 == null ? null : tk9.N(vt6Var2);
        Object objN3 = vt6Var3 != null ? tk9.N(vt6Var3) : null;
        w0h w0hVar = this.d.f;
        w3h.h(w0hVar);
        w0hVar.F0(i, true, false, str, objN, objN2, objN3);
    }

    @Override // defpackage.mug
    public void onActivityCreated(vt6 vt6Var, Bundle bundle, long j) {
        e();
        Activity activity = (Activity) tk9.N(vt6Var);
        oa7.A(activity);
        onActivityCreatedByScionActivityInfo(iwg.c(activity), bundle, j);
    }

    @Override // defpackage.mug
    public void onActivityCreatedByScionActivityInfo(iwg iwgVar, Bundle bundle, long j) {
        e();
        c8h c8hVar = this.d.X;
        w3h.g(c8hVar);
        ya5 ya5Var = c8hVar.d;
        if (ya5Var != null) {
            c8h c8hVar2 = this.d.X;
            w3h.g(c8hVar2);
            c8hVar2.T0();
            ya5Var.i(iwgVar, bundle);
        }
    }

    @Override // defpackage.mug
    public void onActivityDestroyed(vt6 vt6Var, long j) {
        e();
        Activity activity = (Activity) tk9.N(vt6Var);
        oa7.A(activity);
        onActivityDestroyedByScionActivityInfo(iwg.c(activity), j);
    }

    @Override // defpackage.mug
    public void onActivityDestroyedByScionActivityInfo(iwg iwgVar, long j) {
        e();
        c8h c8hVar = this.d.X;
        w3h.g(c8hVar);
        ya5 ya5Var = c8hVar.d;
        if (ya5Var != null) {
            c8h c8hVar2 = this.d.X;
            w3h.g(c8hVar2);
            c8hVar2.T0();
            ya5Var.j(iwgVar);
        }
    }

    @Override // defpackage.mug
    public void onActivityPaused(vt6 vt6Var, long j) {
        e();
        Activity activity = (Activity) tk9.N(vt6Var);
        oa7.A(activity);
        onActivityPausedByScionActivityInfo(iwg.c(activity), j);
    }

    @Override // defpackage.mug
    public void onActivityPausedByScionActivityInfo(iwg iwgVar, long j) {
        e();
        c8h c8hVar = this.d.X;
        w3h.g(c8hVar);
        ya5 ya5Var = c8hVar.d;
        if (ya5Var != null) {
            c8h c8hVar2 = this.d.X;
            w3h.g(c8hVar2);
            c8hVar2.T0();
            ya5Var.k(iwgVar);
        }
    }

    @Override // defpackage.mug
    public void onActivityResumed(vt6 vt6Var, long j) {
        e();
        Activity activity = (Activity) tk9.N(vt6Var);
        oa7.A(activity);
        onActivityResumedByScionActivityInfo(iwg.c(activity), j);
    }

    @Override // defpackage.mug
    public void onActivityResumedByScionActivityInfo(iwg iwgVar, long j) {
        e();
        c8h c8hVar = this.d.X;
        w3h.g(c8hVar);
        ya5 ya5Var = c8hVar.d;
        if (ya5Var != null) {
            c8h c8hVar2 = this.d.X;
            w3h.g(c8hVar2);
            c8hVar2.T0();
            ya5Var.l(iwgVar);
        }
    }

    @Override // defpackage.mug
    public void onActivitySaveInstanceState(vt6 vt6Var, tug tugVar, long j) {
        e();
        Activity activity = (Activity) tk9.N(vt6Var);
        oa7.A(activity);
        onActivitySaveInstanceStateByScionActivityInfo(iwg.c(activity), tugVar, j);
    }

    @Override // defpackage.mug
    public void onActivitySaveInstanceStateByScionActivityInfo(iwg iwgVar, tug tugVar, long j) {
        e();
        c8h c8hVar = this.d.X;
        w3h.g(c8hVar);
        ya5 ya5Var = c8hVar.d;
        Bundle bundle = new Bundle();
        if (ya5Var != null) {
            c8h c8hVar2 = this.d.X;
            w3h.g(c8hVar2);
            c8hVar2.T0();
            ya5Var.m(iwgVar, bundle);
        }
        try {
            tugVar.x(bundle);
        } catch (RemoteException e) {
            w0h w0hVar = this.d.f;
            w3h.h(w0hVar);
            w0hVar.x.b(e, "Error returning bundle value to wrapper");
        }
    }

    @Override // defpackage.mug
    public void onActivityStarted(vt6 vt6Var, long j) {
        e();
        Activity activity = (Activity) tk9.N(vt6Var);
        oa7.A(activity);
        onActivityStartedByScionActivityInfo(iwg.c(activity), j);
    }

    @Override // defpackage.mug
    public void onActivityStartedByScionActivityInfo(iwg iwgVar, long j) {
        e();
        c8h c8hVar = this.d.X;
        w3h.g(c8hVar);
        if (c8hVar.d != null) {
            c8h c8hVar2 = this.d.X;
            w3h.g(c8hVar2);
            c8hVar2.T0();
        }
    }

    @Override // defpackage.mug
    public void onActivityStopped(vt6 vt6Var, long j) {
        e();
        Activity activity = (Activity) tk9.N(vt6Var);
        oa7.A(activity);
        onActivityStoppedByScionActivityInfo(iwg.c(activity), j);
    }

    @Override // defpackage.mug
    public void onActivityStoppedByScionActivityInfo(iwg iwgVar, long j) {
        e();
        c8h c8hVar = this.d.X;
        w3h.g(c8hVar);
        if (c8hVar.d != null) {
            c8h c8hVar2 = this.d.X;
            w3h.g(c8hVar2);
            c8hVar2.T0();
        }
    }

    @Override // defpackage.mug
    public void performAction(Bundle bundle, tug tugVar, long j) {
        e();
        tugVar.x(null);
    }

    @Override // defpackage.mug
    public void registerOnMeasurementEventListener(nvg nvgVar) {
        Object wchVar;
        e();
        kd0 kd0Var = this.e;
        synchronized (kd0Var) {
            try {
                wchVar = (x5h) kd0Var.get(Integer.valueOf(nvgVar.c()));
                if (wchVar == null) {
                    wchVar = new wch(this, nvgVar);
                    kd0Var.put(Integer.valueOf(nvgVar.c()), wchVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c8h c8hVar = this.d.X;
        w3h.g(c8hVar);
        c8hVar.B0();
        if (c8hVar.f.add(wchVar)) {
            return;
        }
        w0h w0hVar = ((w3h) c8hVar.b).f;
        w3h.h(w0hVar);
        w0hVar.x.a("OnEventListener already registered");
    }

    @Override // defpackage.mug
    @Deprecated
    public void resetAnalyticsData(long j) {
        e();
        c8h c8hVar = this.d.X;
        w3h.g(c8hVar);
        c8hVar.v.set(null);
        m3h m3hVar = ((w3h) c8hVar.b).g;
        w3h.h(m3hVar);
        m3hVar.J0(new p6h(c8hVar, j, 1));
    }

    @Override // defpackage.mug
    public void resetAnalyticsDataWithElapsedTime(long j, long j2) {
        e();
        c8h c8hVar = this.d.X;
        w3h.g(c8hVar);
        c8hVar.v.set(null);
        m3h m3hVar = ((w3h) c8hVar.b).g;
        w3h.h(m3hVar);
        m3hVar.J0(new p6h(c8hVar, j, 1));
    }

    @Override // defpackage.mug
    public void retrieveAndUploadBatches(hvg hvgVar) {
        q8h q8hVar;
        e();
        c8h c8hVar = this.d.X;
        w3h.g(c8hVar);
        c8hVar.B0();
        w3h w3hVar = (w3h) c8hVar.b;
        m3h m3hVar = w3hVar.g;
        w3h.h(m3hVar);
        if (m3hVar.G0()) {
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.g.a("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        m3h m3hVar2 = w3hVar.g;
        w3h.h(m3hVar2);
        if (Thread.currentThread() == m3hVar2.e) {
            w0h w0hVar2 = w3hVar.f;
            w3h.h(w0hVar2);
            w0hVar2.g.a("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        boolean zM = w1e.m();
        w0h w0hVar3 = w3hVar.f;
        if (zM) {
            w3h.h(w0hVar3);
            w0hVar3.g.a("Cannot retrieve and upload batches from main thread");
            return;
        }
        w3h.h(w0hVar3);
        w0hVar3.Z.a("[sgtm] Started client-side batch upload work.");
        boolean z = false;
        int size = 0;
        int i = 0;
        while (!z) {
            w0h w0hVar4 = w3hVar.f;
            w3h.h(w0hVar4);
            w0hVar4.Z.a("[sgtm] Getting upload batches from service (FE)");
            AtomicReference atomicReference = new AtomicReference();
            m3h m3hVar3 = w3hVar.g;
            w3h.h(m3hVar3);
            m3hVar3.K0(atomicReference, 10000L, "[sgtm] Getting upload batches", new a7h(c8hVar, atomicReference, 2));
            vbh vbhVar = (vbh) atomicReference.get();
            if (vbhVar == null) {
                break;
            }
            List list = vbhVar.a;
            if (list.isEmpty()) {
                break;
            }
            w0h w0hVar5 = w3hVar.f;
            w3h.h(w0hVar5);
            w0hVar5.Z.b(Integer.valueOf(list.size()), "[sgtm] Retrieved upload batches. count");
            size += list.size();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                qbh qbhVar = (qbh) it.next();
                try {
                    URL url = new URI(qbhVar.c).toURL();
                    AtomicReference atomicReference2 = new AtomicReference();
                    xzg xzgVarL = ((w3h) c8hVar.b).l();
                    xzgVarL.B0();
                    oa7.A(xzgVarL.v);
                    String str = xzgVarL.v;
                    w3h w3hVar2 = (w3h) c8hVar.b;
                    w0h w0hVar6 = w3hVar2.f;
                    w3h.h(w0hVar6);
                    tz0 tz0Var = w0hVar6.Z;
                    Long lValueOf = Long.valueOf(qbhVar.a);
                    tz0Var.d("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, qbhVar.c, Integer.valueOf(qbhVar.b.length));
                    if (!TextUtils.isEmpty(qbhVar.g)) {
                        w0h w0hVar7 = w3hVar2.f;
                        w3h.h(w0hVar7);
                        w0hVar7.Z.c(lValueOf, qbhVar.g, "[sgtm] Uploading data from app. row_id");
                    }
                    HashMap map = new HashMap();
                    Bundle bundle = qbhVar.d;
                    for (String str2 : bundle.keySet()) {
                        String string = bundle.getString(str2);
                        if (!TextUtils.isEmpty(string)) {
                            map.put(str2, string);
                        }
                    }
                    m8h m8hVar = w3hVar2.Z;
                    w3h.h(m8hVar);
                    byte[] bArr = qbhVar.b;
                    psd psdVar = new psd(c8hVar, atomicReference2, qbhVar);
                    m8hVar.C0();
                    oa7.A(url);
                    oa7.A(bArr);
                    m3h m3hVar4 = ((w3h) m8hVar.b).g;
                    w3h.h(m3hVar4);
                    m3hVar4.M0(new e1h(m8hVar, str, url, bArr, map, psdVar));
                    try {
                        qch qchVar = w3hVar2.w;
                        w3h.f(qchVar);
                        w3h w3hVar3 = (w3h) qchVar.b;
                        w3hVar3.y.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis() + 60000;
                        synchronized (atomicReference2) {
                            for (long jCurrentTimeMillis2 = 60000; atomicReference2.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = jCurrentTimeMillis - System.currentTimeMillis()) {
                                try {
                                    atomicReference2.wait(jCurrentTimeMillis2);
                                    w3hVar3.y.getClass();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    } catch (InterruptedException unused) {
                        w0h w0hVar8 = ((w3h) c8hVar.b).f;
                        w3h.h(w0hVar8);
                        w0hVar8.x.a("[sgtm] Interrupted waiting for uploading batch");
                    }
                    q8hVar = atomicReference2.get() == null ? q8h.UNKNOWN : (q8h) atomicReference2.get();
                } catch (MalformedURLException | URISyntaxException e) {
                    w0h w0hVar9 = ((w3h) c8hVar.b).f;
                    w3h.h(w0hVar9);
                    w0hVar9.g.d("[sgtm] Bad upload url for row_id", qbhVar.c, Long.valueOf(qbhVar.a), e);
                    q8hVar = q8h.FAILURE;
                }
                if (q8hVar != q8h.SUCCESS) {
                    if (q8hVar == q8h.BACKOFF) {
                        z = true;
                        break;
                    }
                } else {
                    i++;
                }
            }
        }
        w0h w0hVar10 = w3hVar.f;
        w3h.h(w0hVar10);
        w0hVar10.Z.c(Integer.valueOf(size), Integer.valueOf(i), "[sgtm] Completed client-side batch upload work. total, success");
        try {
            hvgVar.a();
        } catch (RemoteException e2) {
            w3h w3hVar4 = this.d;
            oa7.A(w3hVar4);
            w0h w0hVar11 = w3hVar4.f;
            w3h.h(w0hVar11);
            w0hVar11.x.b(e2, "Failed to call IDynamiteUploadBatchesCallback");
        }
    }

    @Override // defpackage.mug
    public void setConditionalUserProperty(Bundle bundle, long j) {
        e();
        w3h w3hVar = this.d;
        if (bundle == null) {
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.g.a("Conditional user property must not be null");
        } else {
            c8h c8hVar = w3hVar.X;
            w3h.g(c8hVar);
            c8hVar.N0(bundle, j);
        }
    }

    @Override // defpackage.mug
    public void setConsentThirdParty(Bundle bundle, long j) {
        e();
        c8h c8hVar = this.d.X;
        w3h.g(c8hVar);
        c8hVar.U0(bundle, -20, j);
    }

    @Override // defpackage.mug
    public void setCurrentScreen(vt6 vt6Var, String str, String str2, long j) {
        e();
        Activity activity = (Activity) tk9.N(vt6Var);
        oa7.A(activity);
        setCurrentScreenByScionActivityInfo(iwg.c(activity), str, str2, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
    
        if (r2 > 500) goto L27;
     */
    @Override // defpackage.mug
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setCurrentScreenByScionActivityInfo(defpackage.iwg r5, java.lang.String r6, java.lang.String r7, long r8) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreenByScionActivityInfo(iwg, java.lang.String, java.lang.String, long):void");
    }

    @Override // defpackage.mug
    public void setDataCollectionEnabled(boolean z) {
        e();
        c8h c8hVar = this.d.X;
        w3h.g(c8hVar);
        c8hVar.B0();
        m3h m3hVar = ((w3h) c8hVar.b).g;
        w3h.h(m3hVar);
        m3hVar.J0(new pe(c8hVar, z));
    }

    @Override // defpackage.mug
    public void setDefaultEventParameters(Bundle bundle) {
        e();
        c8h c8hVar = this.d.X;
        w3h.g(c8hVar);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        m3h m3hVar = ((w3h) c8hVar.b).g;
        w3h.h(m3hVar);
        m3hVar.J0(new lwg(27, c8hVar, bundle2));
    }

    @Override // defpackage.mug
    public void setEventInterceptor(nvg nvgVar) {
        e();
        gsg gsgVar = new gsg(this, nvgVar, false);
        m3h m3hVar = this.d.g;
        w3h.h(m3hVar);
        boolean zG0 = m3hVar.G0();
        w3h w3hVar = this.d;
        if (!zG0) {
            m3h m3hVar2 = w3hVar.g;
            w3h.h(m3hVar2);
            m3hVar2.J0(new n6h(2, this, gsgVar));
            return;
        }
        c8h c8hVar = w3hVar.X;
        w3h.g(c8hVar);
        c8hVar.A0();
        c8hVar.B0();
        gsg gsgVar2 = c8hVar.e;
        if (gsgVar != gsgVar2) {
            oa7.C("EventInterceptor already set.", gsgVar2 == null);
        }
        c8hVar.e = gsgVar;
    }

    @Override // defpackage.mug
    public void setInstanceIdProvider(dwg dwgVar) {
        e();
    }

    @Override // defpackage.mug
    public void setMeasurementEnabled(boolean z, long j) {
        e();
        c8h c8hVar = this.d.X;
        w3h.g(c8hVar);
        Boolean boolValueOf = Boolean.valueOf(z);
        c8hVar.B0();
        m3h m3hVar = ((w3h) c8hVar.b).g;
        w3h.h(m3hVar);
        m3hVar.J0(new w36(c8hVar, boolValueOf, false, 25));
    }

    @Override // defpackage.mug
    public void setMinimumSessionDuration(long j) {
        e();
    }

    @Override // defpackage.mug
    public void setSessionTimeoutDuration(long j) {
        e();
        c8h c8hVar = this.d.X;
        w3h.g(c8hVar);
        m3h m3hVar = ((w3h) c8hVar.b).g;
        w3h.h(m3hVar);
        m3hVar.J0(new p6h(c8hVar, j, 0));
    }

    @Override // defpackage.mug
    public void setSgtmDebugInfo(Intent intent) {
        e();
        c8h c8hVar = this.d.X;
        w3h.g(c8hVar);
        w3h w3hVar = (w3h) c8hVar.b;
        Uri data = intent.getData();
        if (data == null) {
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.X.a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            w0h w0hVar2 = w3hVar.f;
            w3h.h(w0hVar2);
            w0hVar2.X.a("[sgtm] Preview Mode was not enabled.");
            w3hVar.d.d = null;
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (TextUtils.isEmpty(queryParameter2)) {
            return;
        }
        w0h w0hVar3 = w3hVar.f;
        w3h.h(w0hVar3);
        w0hVar3.X.b(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
        w3hVar.d.d = queryParameter2;
    }

    @Override // defpackage.mug
    public void setUserId(String str, long j) {
        e();
        c8h c8hVar = this.d.X;
        w3h.g(c8hVar);
        w3h w3hVar = (w3h) c8hVar.b;
        if (str != null && TextUtils.isEmpty(str)) {
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.x.a("User ID must be non-empty or null");
        } else {
            m3h m3hVar = w3hVar.g;
            w3h.h(m3hVar);
            m3hVar.J0(new n6h(c8hVar, str, false, 3));
            c8hVar.K0(null, "_id", str, true, j);
        }
    }

    @Override // defpackage.mug
    public void setUserProperty(String str, String str2, vt6 vt6Var, boolean z, long j) {
        e();
        Object objN = tk9.N(vt6Var);
        c8h c8hVar = this.d.X;
        w3h.g(c8hVar);
        c8hVar.K0(str, str2, objN, z, j);
    }

    @Override // defpackage.mug
    public void unregisterOnMeasurementEventListener(nvg nvgVar) {
        Object wchVar;
        e();
        kd0 kd0Var = this.e;
        synchronized (kd0Var) {
            wchVar = (x5h) kd0Var.remove(Integer.valueOf(nvgVar.c()));
        }
        if (wchVar == null) {
            wchVar = new wch(this, nvgVar);
        }
        c8h c8hVar = this.d.X;
        w3h.g(c8hVar);
        c8hVar.B0();
        if (c8hVar.f.remove(wchVar)) {
            return;
        }
        w0h w0hVar = ((w3h) c8hVar.b).f;
        w3h.h(w0hVar);
        w0hVar.x.a("OnEventListener had not been registered");
    }

    @Override // defpackage.mug
    public void setConsent(Bundle bundle, long j) {
    }
}
