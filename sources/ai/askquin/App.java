package ai.askquin;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.SystemClock;
import androidx.lifecycle.ProcessLifecycleOwner;
import defpackage.ad1;
import defpackage.af8;
import defpackage.ai;
import defpackage.ap;
import defpackage.bsc;
import defpackage.c1;
import defpackage.c38;
import defpackage.ca2;
import defpackage.db6;
import defpackage.dc2;
import defpackage.di2;
import defpackage.di9;
import defpackage.dsc;
import defpackage.dzb;
import defpackage.ec2;
import defpackage.ef8;
import defpackage.eu4;
import defpackage.ezb;
import defpackage.g60;
import defpackage.gg2;
import defpackage.h5g;
import defpackage.h70;
import defpackage.hf8;
import defpackage.hr7;
import defpackage.hs3;
import defpackage.hy8;
import defpackage.i60;
import defpackage.i8c;
import defpackage.ik9;
import defpackage.il;
import defpackage.ir5;
import defpackage.ir7;
import defpackage.isa;
import defpackage.job;
import defpackage.jr7;
import defpackage.k27;
import defpackage.k70;
import defpackage.k8b;
import defpackage.kd9;
import defpackage.kob;
import defpackage.kt4;
import defpackage.l1e;
import defpackage.l70;
import defpackage.lc9;
import defpackage.lgc;
import defpackage.li4;
import defpackage.lw2;
import defpackage.m70;
import defpackage.m8b;
import defpackage.mib;
import defpackage.n70;
import defpackage.n8b;
import defpackage.nfc;
import defpackage.nu4;
import defpackage.o05;
import defpackage.o70;
import defpackage.o76;
import defpackage.oa7;
import defpackage.ov8;
import defpackage.p10;
import defpackage.p70;
import defpackage.pd9;
import defpackage.qc0;
import defpackage.qhf;
import defpackage.qn2;
import defpackage.r70;
import defpackage.rkd;
import defpackage.t09;
import defpackage.t72;
import defpackage.th9;
import defpackage.trd;
import defpackage.vpf;
import defpackage.w;
import defpackage.wn7;
import defpackage.x1f;
import defpackage.xa0;
import defpackage.xh9;
import defpackage.xn9;
import defpackage.xqa;
import defpackage.xy;
import defpackage.y37;
import defpackage.ya5;
import defpackage.ynb;
import defpackage.yx4;
import defpackage.z5c;
import defpackage.znd;
import io.sentry.android.core.performance.g;
import io.sentry.android.core.performance.h;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes2.dex */
public class App extends Application implements rkd, hf8 {
    public static final /* synthetic */ int a = 0;

    @Override // defpackage.rkd
    public final mib a(Context context) {
        context.getClass();
        di2 di2Var = new di2(this);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        arrayList4.add(new ad1(6, new pd9(new ik9(new p10(19))), job.a.b(qhf.class)));
        int i = 0;
        arrayList5.add(new dc2(new l1e(), i));
        if (Build.VERSION.SDK_INT >= 28) {
            arrayList5.add(new dc2(new xy(), i));
        } else {
            arrayList5.add(new dc2(new o76(), i));
        }
        di2Var.g = new ec2(vpf.T(arrayList), vpf.T(arrayList2), vpf.T(arrayList3), vpf.T(arrayList4), vpf.T(arrayList5));
        return di2Var.c();
    }

    @Override // android.app.Application
    public final void onCreate() throws Exception {
        Object dzbVar;
        int i;
        g gVar = g.O0;
        long jUptimeMillis = SystemClock.uptimeMillis();
        g gVarC = g.c();
        h hVar = gVarC.f;
        if (hVar.c == 0) {
            hVar.f(jUptimeMillis);
            gVarC.h(this);
        }
        super.onCreate();
        bsc bscVar = dsc.a;
        ProcessLifecycleOwner.w.f.a(dsc.a);
        int i2 = 1;
        registerActivityLifecycleCallbacks(new ya5(i2, this));
        ca2.a.getClass();
        ca2.c = true;
        kd9 kd9Var = ca2.e;
        wn7 wn7Var = ca2.b[0];
        Boolean bool = Boolean.FALSE;
        kd9Var.getClass();
        wn7Var.getClass();
        kd9Var.b = bool;
        ca2.d = "gp";
        il ilVar = il.a;
        if (il.b.compareAndSet(false, true)) {
            registerActivityLifecycleCallbacks(ilVar);
        }
        try {
            dzbVar = xh9.d(this);
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            hf8.Q.getClass();
            ef8.a("NotificationPermission").h("Failed to initialize notification permission status", thA);
        }
        c1 c1Var = new c1(7, new i8c(22));
        t09 t09Var = new t09();
        c1Var.d(t09Var);
        trd trdVar = new trd(8, new yx4(24));
        t09 t09Var2 = new t09();
        trdVar.d(t09Var2);
        znd zndVar = new znd(28);
        t09 t09Var3 = new t09();
        zndVar.d(t09Var3);
        xn9 xn9Var = new xn9(10);
        t09 t09Var4 = new t09();
        xn9Var.d(t09Var4);
        eu4 eu4Var = new eu4(17);
        t09 t09Var5 = new t09();
        kob kobVar = job.a;
        oa7.q(t09Var5, kobVar.b(y37.class), null, new ai(eu4Var, 5));
        oa7.q(t09Var5, kobVar.b(gg2.class), null, new ai(eu4Var, 6));
        List listI = t72.I(t09Var, t09Var2, t09Var3, t09Var4, t09Var5);
        c1 c1Var2 = new c1(18, this);
        synchronized (af8.Y) {
            ir7 ir7Var = new ir7();
            if (af8.Z != null) {
                throw new jr7("A Koin Application has already been started");
            }
            af8.Z = ir7Var.a;
            ir7Var.a(listI);
            c1Var2.d(ir7Var);
            ir7Var.a.a();
        }
        th9 th9Var = th9.a;
        if (th9.b.compareAndSet(false, true)) {
            th9.c = this;
            ProcessLifecycleOwner.w.f.a(th9Var);
        }
        di9 di9Var = di9.a;
        w wVar = new w(1, th9Var, th9.class, "onPermissionStatusChanged", "onPermissionStatusChanged(Lnet/xmind/donut/common/notification/NotificationPermissionStatus;)V", 0, 9);
        if (di9.b.compareAndSet(false, true)) {
            di9.c = this;
            di9.d = wVar;
            registerActivityLifecycleCallbacks(new ir5(1));
        }
        hs3 hs3Var = xqa.o;
        l70 l70Var = new l70(hs3Var.a, hs3Var.b, null);
        nu4 nu4Var = nu4.a;
        boolean zBooleanValue = ((Boolean) z5c.I(nu4Var, l70Var)).booleanValue();
        hs3 hs3Var2 = xqa.p;
        boolean zBooleanValue2 = ((Boolean) z5c.I(nu4Var, new m70(hs3Var2.a, hs3Var2.b, null))).booleanValue();
        hs3 hs3Var3 = xqa.n0;
        boolean zBooleanValue3 = ((Boolean) z5c.I(nu4Var, new n70(hs3Var3.a, hs3Var3.b, null))).booleanValue();
        hs3 hs3Var4 = xqa.o0;
        boolean zBooleanValue4 = ((Boolean) z5c.I(nu4Var, new o70(hs3Var4.a, hs3Var4.b, null))).booleanValue();
        if (zBooleanValue && zBooleanValue2 && zBooleanValue3 && zBooleanValue4) {
            x1f x1fVar = x1f.a;
            x1f.b.set(Boolean.TRUE);
            o05 o05VarB = x1f.b();
            if (o05VarB instanceof hy8) {
                hy8 hy8Var = (hy8) o05VarB;
                hy8Var.c.set(true);
                x1f.c(hy8Var);
            }
            xa0.a();
            lgc lgcVar = lgc.a;
            lgc.b = true;
            if (!lgc.c) {
                lgc.c = true;
                registerActivityLifecycleCallbacks(lgcVar);
            }
            h5g.a.b(this);
        } else {
            hs3 hs3Var5 = xqa.r;
            int iIntValue = ((Number) z5c.I(nu4Var, new p70(hs3Var5.a, hs3Var5.b, null))).intValue();
            if (zBooleanValue && zBooleanValue2 && iIntValue > 0 && !zBooleanValue3) {
                ynb.V(lw2.a, null, null, new r70(this, null), 3);
            }
        }
        registerActivityLifecycleCallbacks(ir5.b);
        int iOrdinal = k8b.c().ordinal();
        if (iOrdinal == 0) {
            i = 0;
        } else {
            if (iOrdinal != 1) {
                ap.c();
                return;
            }
            i = 2;
        }
        li4.a.k(i);
        li4.c(i);
        d().e("migrate from " + db6.O() + " to 291");
        for (ov8 ov8Var : t72.I(new n8b(), new lc9(this))) {
            if (db6.O() < ov8Var.a()) {
                ov8Var.b();
            }
        }
        if (db6.O() < 291) {
            hs3 hs3Var6 = xqa.T;
            Boolean bool2 = Boolean.FALSE;
            isa isaVar = hs3Var6.a;
            qn2 qn2Var = lw2.a;
            ynb.V(qn2Var, null, null, new k70(isaVar, bool2, null), 3);
            ynb.V(qn2Var, null, null, new h70(xqa.s.a, 291, null), 3);
        }
        m8b m8bVar = c38.a;
        Context applicationContext = getApplicationContext();
        ProcessLifecycleOwner.w.f.a(new kt4(applicationContext));
        Object systemService = applicationContext.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager != null) {
            connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), new k27(i2, applicationContext));
        }
        hr7 hr7Var = af8.Z;
        if (hr7Var == null) {
            qc0.p("KoinApplication has not been started");
            return;
        }
        i60 i60Var = (i60) ((nfc) hr7Var.c.e).g(job.a.b(i60.class), null, null);
        qn2 qn2Var2 = lw2.a;
        qn2Var2.getClass();
        ynb.V(qn2Var2, null, null, new g60(i60Var, null), 3);
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        h hVar2 = g.c().f;
        if (hVar2.c()) {
            hVar2.a = App.class.getName().concat(".onCreate");
            hVar2.d = jUptimeMillis2;
        }
    }
}
