package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d4f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e4f b;

    public /* synthetic */ d4f(e4f e4fVar, int i) {
        this.a = i;
        this.b = e4fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yi2 yi2Var;
        String str;
        int i = this.a;
        e4f e4fVar = this.b;
        switch (i) {
            case 0:
                qbb qbbVar = e4fVar.z;
                boolean z = e4fVar.F0;
                qbbVar.d.a(z);
                qbbVar.e.a(z);
                return;
            default:
                ff5 ff5Var = e4fVar.d;
                ff5Var.a();
                Context context = ff5Var.a;
                e4fVar.x = context;
                e4fVar.Z = context.getPackageName();
                e4fVar.y = ji2.e();
                e4fVar.z = new qbb(e4fVar.x, new ip3(100L, TimeUnit.MINUTES, 1L));
                e4fVar.X = gb0.a();
                i1b i1bVar = e4fVar.g;
                ji2 ji2Var = e4fVar.y;
                ji2Var.getClass();
                yi2 yi2Var2 = yi2.l;
                synchronized (yi2.class) {
                    yi2Var = yi2.l;
                    if (yi2Var == null) {
                        yi2Var = new yi2();
                        yi2.l = yi2Var;
                    }
                    break;
                }
                Long l = (Long) ji2Var.a.getRemoteConfigValueOrDefault("fpr_log_source", -1L);
                l.getClass();
                Map map = yi2.m;
                if (!map.containsKey(l) || (str = (String) map.get(l)) == null) {
                    ur9 ur9VarD = ji2Var.d(yi2Var);
                    str = ur9VarD.b() ? (String) ur9VarD.a() : "FIREPERF";
                } else {
                    ji2Var.c.f("com.google.firebase.perf.LogSourceName", str);
                }
                e4fVar.v = new fj5(i1bVar, str);
                ConcurrentLinkedQueue concurrentLinkedQueue = e4fVar.b;
                gb0 gb0Var = e4fVar.X;
                WeakReference weakReference = new WeakReference(e4f.H0);
                synchronized (gb0Var.f) {
                    gb0Var.f.add(weakReference);
                    break;
                }
                vb0 vb0VarY = yb0.y();
                e4fVar.Y = vb0VarY;
                ff5 ff5Var2 = e4fVar.d;
                ff5Var2.a();
                String str2 = ff5Var2.c.b;
                vb0VarY.i();
                ((yb0) vb0VarY.b).C(str2);
                vo voVarU = xo.u();
                String str3 = e4fVar.Z;
                voVarU.i();
                ((xo) voVarU.b).v(str3);
                voVarU.i();
                ((xo) voVarU.b).w();
                Context context2 = e4fVar.x;
                String str4 = "";
                try {
                    String str5 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
                    if (str5 != null) {
                        str4 = str5;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                voVarU.i();
                ((xo) voVarU.b).x(str4);
                vb0VarY.i();
                ((yb0) vb0VarY.b).z((xo) voVarU.h());
                e4fVar.c.set(true);
                while (!concurrentLinkedQueue.isEmpty()) {
                    s6a s6aVar = (s6a) concurrentLinkedQueue.poll();
                    if (s6aVar != null) {
                        e4fVar.w.execute(new xu8(23, e4fVar, s6aVar));
                    }
                }
                return;
        }
    }
}
