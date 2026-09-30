package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.core.b1;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ff5 {
    public static final Object k = new Object();
    public static final kd0 l = new kd0(0);
    public final Context a;
    public final String b;
    public final wf5 c;
    public final hc2 d;
    public final mw7 g;
    public final i1b h;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList j = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public ff5(Context context, String str, wf5 wf5Var) {
        ?? arrayList;
        int i = 0;
        this.a = context;
        oa7.x(str);
        this.b = str;
        this.c = wf5Var;
        fq0 fq0Var = jf5.a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                b1.l("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                if (serviceInfo == null) {
                    b1.l("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            b1.l("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            b1.l("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ac2(i, (String) it.next()));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        uaf uafVar = uaf.a;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        int i2 = 1;
        arrayList3.add(new ac2(i2, new FirebaseCommonRegistrar()));
        arrayList3.add(new ac2(i2, new ExecutorsRegistrar()));
        arrayList4.add(lb2.c(context, Context.class, new Class[0]));
        arrayList4.add(lb2.c(this, ff5.class, new Class[0]));
        arrayList4.add(lb2.c(wf5Var, wf5.class, new Class[0]));
        qfc qfcVar = new qfc();
        if (drb.h(context) && jf5.b.get()) {
            arrayList4.add(lb2.c(fq0Var, fq0.class, new Class[0]));
        }
        hc2 hc2Var = new hc2(arrayList3, arrayList4, qfcVar);
        this.d = hc2Var;
        Trace.endSection();
        this.g = new mw7(new gc2(2, this, context));
        this.h = hc2Var.e(zq3.class);
        cf5 cf5Var = new cf5(this);
        a();
        if (this.e.get()) {
            ps0.e.a.get();
        }
        this.i.add(cf5Var);
        Trace.endSection();
    }

    public static ArrayList c() {
        ArrayList arrayList;
        synchronized (k) {
            arrayList = new ArrayList(l.values());
        }
        return arrayList;
    }

    public static ff5 d() {
        ff5 ff5Var;
        synchronized (k) {
            try {
                ff5Var = (ff5) l.get("[DEFAULT]");
                if (ff5Var == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + s.y() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((zq3) ff5Var.h.get()).b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return ff5Var;
    }

    public static ff5 g(Context context, wf5 wf5Var) {
        ff5 ff5Var;
        AtomicReference atomicReference = df5.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = df5.a;
            if (atomicReference2.get() == null) {
                df5 df5Var = new df5();
                do {
                    if (atomicReference2.compareAndSet(null, df5Var)) {
                        ps0.b(application);
                        ps0.e.a(df5Var);
                        break;
                    }
                } while (atomicReference2.get() == null);
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (k) {
            kd0 kd0Var = l;
            oa7.C("FirebaseApp name [DEFAULT] already exists!", !kd0Var.containsKey("[DEFAULT]"));
            oa7.B(context, "Application context cannot be null.");
            ff5Var = new ff5(context, "[DEFAULT]", wf5Var);
            kd0Var.put("[DEFAULT]", ff5Var);
        }
        ff5Var.f();
        return ff5Var;
    }

    public final void a() {
        oa7.C("FirebaseApp was deleted", !this.f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.d.a(cls);
    }

    public final String e() {
        StringBuilder sb = new StringBuilder();
        a();
        sb.append(y7h.u(this.b.getBytes(Charset.defaultCharset())));
        sb.append("+");
        a();
        sb.append(y7h.u(this.c.b.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ff5)) {
            return false;
        }
        ff5 ff5Var = (ff5) obj;
        ff5Var.a();
        return this.b.equals(ff5Var.b);
    }

    public final void f() {
        HashMap map;
        if (!drb.h(this.a)) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.a;
            AtomicReference atomicReference = ef5.b;
            if (atomicReference.get() == null) {
                ef5 ef5Var = new ef5(context);
                while (!atomicReference.compareAndSet(null, ef5Var)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(ef5Var, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(this.b);
        Log.i("FirebaseApp", sb2.toString());
        hc2 hc2Var = this.d;
        a();
        boolean zEquals = "[DEFAULT]".equals(this.b);
        AtomicReference atomicReference2 = (AtomicReference) hc2Var.g;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (!atomicReference2.compareAndSet(null, boolValueOf)) {
            if (atomicReference2.get() != null) {
                ((zq3) this.h.get()).b();
            }
        }
        synchronized (hc2Var) {
            map = new HashMap((HashMap) hc2Var.b);
        }
        hc2Var.j(map, zEquals);
        ((zq3) this.h.get()).b();
    }

    public final boolean h() {
        boolean z;
        a();
        db3 db3Var = (db3) this.g.get();
        synchronized (db3Var) {
            z = db3Var.a;
        }
        return z;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        w84 w84Var = new w84((Object) this);
        w84Var.G0(this.b, "name");
        w84Var.G0(this.c, "options");
        return w84Var.toString();
    }
}
