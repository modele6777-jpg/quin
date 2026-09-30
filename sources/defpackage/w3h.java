package defpackage;

import android.app.Application;
import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class w3h implements i5h {
    public static volatile w3h U0;
    public final String E0;
    public f0h F0;
    public lah G0;
    public yrg H0;
    public xzg I0;
    public o8h J0;
    public Boolean L0;
    public long M0;
    public volatile Boolean N0;
    public volatile boolean O0;
    public int P0;
    public int Q0;
    public final long S0;
    public final long T0;
    public final c8h X;
    public final bwg Y;
    public final m8h Z;
    public final Context a;
    public final boolean b;
    public final w1e c;
    public final qqg d;
    public final c2h e;
    public final w0h f;
    public final m3h g;
    public final ebh v;
    public final qch w;
    public final i0h x;
    public final hj6 y;
    public final b9h z;
    public boolean K0 = false;
    public final AtomicInteger R0 = new AtomicInteger(0);

    public w3h(a6h a6hVar) {
        Context applicationContext;
        long jCurrentTimeMillis;
        long jElapsedRealtime;
        boolean z = false;
        Context context = a6hVar.a;
        w1e w1eVar = new w1e(16);
        this.c = w1eVar;
        y8c.b = w1eVar;
        this.a = context;
        this.b = a6hVar.e;
        this.N0 = a6hVar.b;
        this.E0 = a6hVar.h;
        boolean z2 = true;
        this.O0 = true;
        if (v8h.b == null) {
            Object obj = v8h.a;
            synchronized (obj) {
                try {
                    if (v8h.b == null) {
                        synchronized (obj) {
                            try {
                                s7h s7hVar = v8h.b;
                                Context applicationContext2 = context.getApplicationContext();
                                if (applicationContext2 == null) {
                                    applicationContext2 = context;
                                }
                                if (s7hVar == null || s7hVar.a != applicationContext2) {
                                    if (s7hVar != null) {
                                        Iterator it = u7h.a.values().iterator();
                                        if (it.hasNext()) {
                                            if (it.next() != null) {
                                                throw new ClassCastException();
                                            }
                                            throw null;
                                        }
                                        a9h.a();
                                    }
                                    v8h.b = new s7h(applicationContext2, vtb.r(new i8h(applicationContext2, 2)));
                                    v8h.c.incrementAndGet();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.y = hj6.E0;
        w6h w6hVar = new w6h(context, h6h.a, k60.h, yb6.c);
        String strConcat = "com.google.android.gms.measurement#".concat(String.valueOf(context.getPackageName()));
        j27 j27VarB = j27.b();
        j27VarB.c = new gsg(strConcat, new String[0]);
        w6hVar.b(0, j27VarB.a());
        AtomicReference atomicReference = f8h.k;
        if (atomicReference.get() == null) {
            try {
                applicationContext = context.getApplicationContext();
            } catch (NullPointerException unused) {
                f8h.b();
                sfc.n(Level.WARNING, (Executor) f8h.m.get(), null, "context.getApplicationContext() yielded NullPointerException", new Object[0]);
                applicationContext = null;
            }
            if (applicationContext != null) {
                while (!atomicReference.compareAndSet(null, applicationContext) && atomicReference.get() == null) {
                }
            }
        }
        Long l = a6hVar.f;
        if (l != null) {
            jCurrentTimeMillis = l.longValue();
        } else {
            this.y.getClass();
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        this.S0 = jCurrentTimeMillis;
        Long l2 = a6hVar.g;
        if (l2 != null) {
            jElapsedRealtime = l2.longValue();
        } else {
            this.y.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.T0 = jElapsedRealtime;
        qqg qqgVar = new qqg(this);
        qqgVar.e = pzd.c;
        this.d = qqgVar;
        c2h c2hVar = new c2h(this);
        c2hVar.D0();
        this.e = c2hVar;
        w0h w0hVar = new w0h(this);
        w0hVar.D0();
        this.f = w0hVar;
        qch qchVar = new qch(this);
        qchVar.D0();
        this.w = qchVar;
        this.x = new i0h(new oid(a6hVar, this));
        this.Y = new bwg(this);
        b9h b9hVar = new b9h(this);
        b9hVar.C0();
        this.z = b9hVar;
        c8h c8hVar = new c8h(this);
        c8hVar.C0();
        this.X = c8hVar;
        ebh ebhVar = new ebh(this);
        ebhVar.C0();
        this.v = ebhVar;
        m8h m8hVar = new m8h(this);
        ((w3h) m8hVar.b).P0++;
        m8hVar.D0();
        this.Z = m8hVar;
        m3h m3hVar = new m3h(this);
        m3hVar.D0();
        this.g = m3hVar;
        gwg gwgVar = a6hVar.d;
        if (gwgVar != null && gwgVar.b != 0) {
            z2 = false;
        }
        if (this.a.getApplicationContext() instanceof Application) {
            g(c8hVar);
            if (((w3h) c8hVar.b).a.getApplicationContext() instanceof Application) {
                Application application = (Application) ((w3h) c8hVar.b).a.getApplicationContext();
                ya5 ya5Var = c8hVar.d;
                if (ya5Var == null) {
                    ya5Var = new ya5(3, c8hVar);
                    c8hVar.d = ya5Var;
                }
                if (z2) {
                    application.unregisterActivityLifecycleCallbacks(ya5Var);
                    application.registerActivityLifecycleCallbacks(c8hVar.d);
                    w0h w0hVar2 = ((w3h) c8hVar.b).f;
                    h(w0hVar2);
                    w0hVar2.Z.a("Registered activity lifecycle callback");
                }
            }
        } else {
            h(w0hVar);
            w0hVar.x.a("Application context is not an Application");
        }
        m3hVar.J0(new v36(this, a6hVar, z, 27));
    }

    public static final void e(cyg cygVar) {
        if (cygVar != null) {
            return;
        }
        qc0.p("Component not created");
    }

    public static final void f(m4 m4Var) {
        if (m4Var != null) {
            return;
        }
        qc0.p("Component not created");
    }

    public static final void g(fzg fzgVar) {
        if (fzgVar == null) {
            qc0.p("Component not created");
        } else {
            if (fzgVar.c) {
                return;
            }
            qc0.p("Component not initialized: ".concat(String.valueOf(fzgVar.getClass())));
        }
    }

    public static final void h(g5h g5hVar) {
        if (g5hVar == null) {
            qc0.p("Component not created");
        } else {
            if (g5hVar.c) {
                return;
            }
            qc0.p("Component not initialized: ".concat(String.valueOf(g5hVar.getClass())));
        }
    }

    public static w3h m(Context context, gwg gwgVar, Long l, Long l2) {
        Bundle bundle;
        if (gwgVar != null) {
            Bundle bundle2 = gwgVar.d;
            gwgVar = new gwg(gwgVar.a, gwgVar.b, gwgVar.c, bundle2, null);
        }
        oa7.A(context);
        oa7.A(context.getApplicationContext());
        if (U0 == null) {
            synchronized (w3h.class) {
                try {
                    if (U0 == null) {
                        U0 = new w3h(new a6h(context, gwgVar, l, l2));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (gwgVar != null && (bundle = gwgVar.d) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            oa7.A(U0);
            U0.N0 = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        oa7.A(U0);
        return U0;
    }

    @Override // defpackage.i5h
    public final hj6 E() {
        return this.y;
    }

    @Override // defpackage.i5h
    public final m3h Z() {
        m3h m3hVar = this.g;
        h(m3hVar);
        return m3hVar;
    }

    public final boolean a() {
        return b() == 0;
    }

    @Override // defpackage.i5h
    public final Context a0() {
        return this.a;
    }

    public final int b() {
        m3h m3hVar = this.g;
        h(m3hVar);
        m3hVar.A0();
        qqg qqgVar = this.d;
        if (qqgVar.O0()) {
            return 1;
        }
        h(m3hVar);
        m3hVar.A0();
        if (!this.O0) {
            return 8;
        }
        c2h c2hVar = this.e;
        f(c2hVar);
        c2hVar.A0();
        Boolean boolValueOf = c2hVar.E0().contains("measurement_enabled") ? Boolean.valueOf(c2hVar.E0().getBoolean("measurement_enabled", true)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue() ? 0 : 3;
        }
        w1e w1eVar = ((w3h) qqgVar.b).c;
        Boolean boolN0 = qqgVar.N0("firebase_analytics_collection_enabled");
        if (boolN0 != null) {
            return boolN0.booleanValue() ? 0 : 4;
        }
        return (this.N0 == null || this.N0.booleanValue()) ? 0 : 7;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    public final boolean c() {
        qch qchVar;
        Context context;
        boolean z = false;
        if (!this.K0) {
            qc0.p("AppMeasurement is not initialized");
            return false;
        }
        m3h m3hVar = this.g;
        h(m3hVar);
        m3hVar.A0();
        Boolean bool = this.L0;
        hj6 hj6Var = this.y;
        if (bool == null || this.M0 == 0) {
            hj6Var.getClass();
            this.M0 = SystemClock.elapsedRealtime();
            qchVar = this.w;
            f(qchVar);
            if (qchVar.e1("android.permission.INTERNET") && qchVar.e1("android.permission.ACCESS_NETWORK_STATE")) {
                context = this.a;
                if (rcg.a(context).c() || this.d.D0() || (qch.w1(context) && qch.V0(context))) {
                    z = true;
                }
            }
            this.L0 = Boolean.valueOf(z);
            if (z) {
                this.L0 = Boolean.valueOf(qchVar.G0(l().H0()));
            }
        } else if (!bool.booleanValue()) {
            hj6Var.getClass();
            if (Math.abs(SystemClock.elapsedRealtime() - this.M0) > 1000) {
                hj6Var.getClass();
                this.M0 = SystemClock.elapsedRealtime();
                qchVar = this.w;
                f(qchVar);
                if (qchVar.e1("android.permission.INTERNET")) {
                    context = this.a;
                    if (rcg.a(context).c()) {
                        z = true;
                    } else {
                        z = true;
                    }
                }
                this.L0 = Boolean.valueOf(z);
                if (z) {
                    this.L0 = Boolean.valueOf(qchVar.G0(l().H0()));
                }
            }
        }
        return this.L0.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    public final void d(int i, Throwable th, byte[] bArr) {
        w0h w0hVar;
        w0h w0hVar2;
        int i2 = i;
        w0h w0hVar3 = this.f;
        if (i2 == 200 || i2 == 204) {
            if (th == null) {
                c2h c2hVar = this.e;
                f(c2hVar);
                c2hVar.J0.b(true);
                if (bArr != null || bArr.length == 0) {
                    h(w0hVar3);
                    w0hVar3.Y.a("Deferred Deep Link response empty.");
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String strOptString = jSONObject.optString(Constants.DEEPLINK, "");
                    if (TextUtils.isEmpty(strOptString)) {
                        h(w0hVar3);
                        w0hVar3.Y.a("Deferred Deep Link is empty.");
                        return;
                    }
                    String strOptString2 = jSONObject.optString("gclid", "");
                    String strOptString3 = jSONObject.optString("gbraid", "");
                    String strOptString4 = jSONObject.optString("gad_source", "");
                    double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                    Bundle bundle = new Bundle();
                    qch qchVar = this.w;
                    f(qchVar);
                    w3h w3hVar = (w3h) qchVar.b;
                    if (TextUtils.isEmpty(strOptString)) {
                        w0hVar2 = w0hVar3;
                    } else {
                        Context context = w3hVar.a;
                        w0hVar2 = w0hVar3;
                        try {
                            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0);
                            if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                                if (!TextUtils.isEmpty(strOptString3)) {
                                    bundle.putString("gbraid", strOptString3);
                                }
                                if (!TextUtils.isEmpty(strOptString4)) {
                                    bundle.putString("gad_source", strOptString4);
                                }
                                bundle.putString("gclid", strOptString2);
                                bundle.putString("_cis", "ddp");
                                this.X.H0("auto", "_cmp", bundle);
                                if (TextUtils.isEmpty(strOptString)) {
                                    return;
                                }
                                try {
                                    SharedPreferences.Editor editorEdit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                    editorEdit.putString(Constants.DEEPLINK, strOptString);
                                    editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                                    if (editorEdit.commit()) {
                                        Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                        Context context2 = w3hVar.a;
                                        if (Build.VERSION.SDK_INT < 34) {
                                            context2.sendBroadcast(intent);
                                            return;
                                        } else {
                                            context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                            return;
                                        }
                                    }
                                    return;
                                } catch (RuntimeException e) {
                                    w0h w0hVar4 = ((w3h) qchVar.b).f;
                                    h(w0hVar4);
                                    w0hVar4.g.b(e, "Failed to persist Deferred Deep Link. exception");
                                    return;
                                }
                            }
                        } catch (JSONException e2) {
                            e = e2;
                            w0hVar = w0hVar2;
                            h(w0hVar);
                            w0hVar.g.b(e, "Failed to parse the Deferred Deep Link response. exception");
                            return;
                        }
                    }
                    h(w0hVar2);
                    w0hVar = w0hVar2;
                    try {
                        w0hVar.x.d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                        return;
                    } catch (JSONException e3) {
                        e = e3;
                        h(w0hVar);
                        w0hVar.g.b(e, "Failed to parse the Deferred Deep Link response. exception");
                        return;
                    }
                } catch (JSONException e4) {
                    e = e4;
                    w0hVar = w0hVar3;
                }
            }
        } else if (i2 == 304) {
            i2 = 304;
            if (th == null) {
                c2h c2hVar2 = this.e;
                f(c2hVar2);
                c2hVar2.J0.b(true);
                if (bArr != null) {
                }
                h(w0hVar3);
                w0hVar3.Y.a("Deferred Deep Link response empty.");
                return;
            }
        }
        h(w0hVar3);
        w0hVar3.x.c(Integer.valueOf(i2), th, "Network Request for Deferred Deep Link failed. response, exception");
    }

    public final f0h i() {
        g(this.F0);
        return this.F0;
    }

    public final lah j() {
        g(this.G0);
        return this.G0;
    }

    public final yrg k() {
        h(this.H0);
        return this.H0;
    }

    public final xzg l() {
        g(this.I0);
        return this.I0;
    }

    @Override // defpackage.i5h
    public final w1e p() {
        return this.c;
    }

    @Override // defpackage.i5h
    public final w0h v() {
        w0h w0hVar = this.f;
        h(w0hVar);
        return w0hVar;
    }
}
