package io.sentry.android.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import defpackage.a80;
import defpackage.bm8;
import defpackage.ja9;
import defpackage.ka9;
import defpackage.pa7;
import defpackage.qu4;
import defpackage.rl2;
import defpackage.t72;
import defpackage.ua9;
import defpackage.v4e;
import defpackage.xag;
import defpackage.z7c;
import io.sentry.android.replay.capture.v;
import io.sentry.g;
import io.sentry.g1;
import io.sentry.h7;
import io.sentry.k4;
import io.sentry.l0;
import io.sentry.m7;
import io.sentry.n7;
import io.sentry.o5;
import io.sentry.protocol.h0;
import io.sentry.q1;
import io.sentry.q5;
import io.sentry.util.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/sentry/android/navigation/SentryNavigationListener;", "Lja9;", "sentry-android-navigation_release"}, k = 1, mv = {1, 9, 0}, xi = z7c.f)
public final class SentryNavigationListener implements ja9 {
    public static final /* synthetic */ int g = 0;
    public final g1 a = k4.a;
    public final boolean b;
    public final boolean c;
    public WeakReference d;
    public Bundle e;
    public q1 f;

    static {
        o5.d().b("maven:io.sentry:sentry-android-navigation", "8.53.0");
    }

    public SentryNavigationListener(boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
        b.a("NavigationListener");
    }

    public static Map b(Bundle bundle) {
        if (bundle == null) {
            return qu4.a;
        }
        Set<String> setKeySet = bundle.keySet();
        setKeySet.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (!pa7.t((String) obj, "android-support-nav:controller:deepLinkIntent")) {
                arrayList.add(obj);
            }
        }
        int iF = bm8.F(t72.u(arrayList, 10));
        if (iF < 16) {
            iF = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF);
        for (Object obj2 : arrayList) {
            linkedHashMap.put(obj2, bundle.get((String) obj2));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c1 A[PHI: r2
  0x00c1: PHI (r2v16 java.lang.String) = (r2v2 java.lang.String), (r2v5 java.lang.String) binds: [B:24:0x009d, B:28:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.ja9
    public final void a(ka9 ka9Var, ua9 ua9Var, Bundle bundle) {
        String strConcat;
        ua9 ua9Var2;
        ua9Var.getClass();
        a80 a80Var = ua9Var.b;
        Map mapB = b(bundle);
        boolean z = this.b;
        g1 g1Var = this.a;
        if (z) {
            g gVar = new g();
            gVar.e = "navigation";
            gVar.g = "navigation";
            WeakReference weakReference = this.d;
            String str = (weakReference == null || (ua9Var2 = (ua9) weakReference.get()) == null) ? null : (String) ua9Var2.b.f;
            if (str != null) {
                Map mapB2 = gVar.b();
                mapB2.getClass();
                mapB2.put("from", "/".concat(str));
            }
            Map mapB3 = b(this.e);
            if (!mapB3.isEmpty()) {
                Map mapB4 = gVar.b();
                mapB4.getClass();
                mapB4.put("from_arguments", mapB3);
            }
            String str2 = (String) a80Var.f;
            if (str2 != null) {
                Map mapB5 = gVar.b();
                mapB5.getClass();
                mapB5.put("to", "/".concat(str2));
            }
            if (!mapB.isEmpty()) {
                Map mapB6 = gVar.b();
                mapB6.getClass();
                mapB6.put("to_arguments", mapB);
            }
            gVar.w = q5.INFO;
            l0 l0Var = new l0();
            l0Var.d(ua9Var, "android:navigationDestination");
            g1Var.i(gVar, l0Var);
        }
        Context context = ka9Var.a;
        String resourceEntryName = (String) a80Var.f;
        if (resourceEntryName == null) {
            try {
                resourceEntryName = context.getResources().getResourceEntryName(a80Var.b);
            } catch (Resources.NotFoundException unused) {
                g1Var.o().getLogger().i(q5.DEBUG, "Destination id cannot be retrieved from Resources, no transaction captured.", new Object[0]);
                resourceEntryName = null;
            }
            if (resourceEntryName == null) {
                strConcat = null;
            } else {
                strConcat = "/".concat(v4e.i0(resourceEntryName, '/'));
            }
        } else {
            strConcat = "/".concat(v4e.i0(resourceEntryName, '/'));
        }
        if (strConcat != null) {
            if (g1Var.o().isEnableScreenTracking()) {
                g1Var.n(new rl2(strConcat, 9));
            }
            if (g1Var.o().isTracingEnabled() && this.c) {
                q1 q1Var = this.f;
                if (q1Var != null) {
                    h7 h7VarA = q1Var.a();
                    if (h7VarA == null) {
                        h7VarA = h7.OK;
                    }
                    h7VarA.getClass();
                    q1 q1Var2 = this.f;
                    if (q1Var2 != null) {
                        q1Var2.h(h7VarA);
                    }
                    g1Var.n(new xag(12, this));
                    this.f = null;
                }
                if (pa7.t(ua9Var.a, "activity")) {
                    g1Var.o().getLogger().i(q5.DEBUG, "Navigating to activity destination, no transaction captured.", new Object[0]);
                } else {
                    n7 n7Var = new n7();
                    n7Var.f = true;
                    n7Var.g = g1Var.o().getIdleTimeout();
                    long deadlineTimeout = g1Var.o().getDeadlineTimeout();
                    n7Var.v = deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout);
                    n7Var.a = true;
                    q1 q1VarM = g1Var.m(new m7(strConcat, h0.ROUTE, "navigation", null), n7Var);
                    q1VarM.getClass();
                    q1VarM.u().w = "auto.navigation.".concat("jetpack_compose");
                    if (!mapB.isEmpty()) {
                        q1VarM.k(mapB, "arguments");
                    }
                    g1Var.n(new io.sentry.android.core.g(q1VarM));
                    this.f = q1VarM;
                }
            } else {
                g1Var.n(new v(4));
            }
        }
        this.d = new WeakReference(ua9Var);
        this.e = bundle;
    }
}
