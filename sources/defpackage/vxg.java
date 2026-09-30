package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vxg {
    public static volatile vxg h;
    public final ExecutorService a;
    public final AppMeasurementSdk b;
    public final ArrayList c;
    public int d;
    public boolean e;
    public volatile mug f;
    public volatile long g;

    public vxg(Context context, Bundle bundle) {
        pf1 pf1Var = new pf1(this);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), pf1Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.b = new AppMeasurementSdk(this);
        this.c = new ArrayList();
        try {
            if (rfc.t(context, ndc.n(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, vxg.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.e = true;
                    b1.l("FA", "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        c(new axg(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            b1.l("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new ya5(2, this));
        }
    }

    public static vxg e(Context context, Bundle bundle) {
        oa7.A(context);
        if (h == null) {
            synchronized (vxg.class) {
                try {
                    if (h == null) {
                        h = new vxg(context, bundle == null ? new Bundle() : new Bundle(bundle));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return h;
    }

    public final Map a(String str, String str2, boolean z) {
        fug fugVar = new fug();
        c(new owg(this, str, str2, z, fugVar));
        Bundle bundleE = fugVar.e(5000L);
        if (bundleE == null || bundleE.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleE.size());
        for (String str3 : bundleE.keySet()) {
            Object obj = bundleE.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final int b(String str) {
        fug fugVar = new fug();
        c(new axg(this, str, fugVar));
        Integer num = (Integer) fug.f(fugVar.e(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final void c(oxg oxgVar) {
        this.a.execute(oxgVar);
    }

    public final void d(Exception exc, boolean z, boolean z2) {
        this.e |= z;
        if (z) {
            b1.n("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            c(new qwg(this, exc));
        }
        b1.n("FA", "Error with data collection. Data lost.", exc);
    }

    public final List f(String str, String str2) {
        fug fugVar = new fug();
        c(new rwg(this, str, str2, fugVar));
        List list = (List) fug.f(fugVar.e(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public final long g() {
        fug fugVar = new fug();
        c(new cxg(this, fugVar, 2));
        Long l = (Long) fug.f(fugVar.e(500L), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i = this.d + 1;
        this.d = i;
        return jNextLong + ((long) i);
    }
}
