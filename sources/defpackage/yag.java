package defpackage;

import android.content.Context;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yag {
    public static yag i;
    public static yag j;
    public static final Object k;
    public final Context a;
    public final si2 b;
    public final WorkDatabase c;
    public final bbg d;
    public final List e;
    public final vva f;
    public final kb6 g;
    public final y1f h;

    static {
        ff8.n("WorkManagerImpl");
        i = null;
        j = null;
        k = new Object();
    }

    public yag(Context context, final si2 si2Var, bbg bbgVar, final WorkDatabase workDatabase, final List list, vva vvaVar, y1f y1fVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext.isDeviceProtectedStorage()) {
            qc0.p("Cannot initialize WorkManager in direct boot mode");
            throw null;
        }
        ff8 ff8Var = new ff8(4, 0);
        synchronized (ff8.c) {
            try {
                if (ff8.d == null) {
                    ff8.d = ff8Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = applicationContext;
        this.d = bbgVar;
        this.c = workDatabase;
        this.f = vvaVar;
        this.h = y1fVar;
        this.b = si2Var;
        this.e = list;
        sv2 sv2Var = bbgVar.b;
        sv2Var.getClass();
        qn2 qn2VarK = jgb.k(sv2Var);
        this.g = new kb6(25, workDatabase);
        final h80 h80Var = bbgVar.a;
        String str = efc.a;
        vvaVar.a(new a35() { // from class: dfc
            @Override // defpackage.a35
            public final void b(tag tagVar, boolean z) {
                h80Var.execute(new de1(list, tagVar, si2Var, workDatabase, 5));
            }
        });
        bbgVar.a(new hr5(applicationContext, this));
        String str2 = pbf.a;
        if (ova.a(applicationContext, si2Var)) {
            ok8.C(new kl5(dj6.I(ym8.q(new gl5(z5c.t(workDatabase.x().a, new String[]{"workspec"}, new n8g(9)), new nbf(4, null)), -1)), new obf(applicationContext, null), 1), qn2VarK);
        }
    }

    public static yag b(Context context) {
        yag yagVar;
        Object obj = k;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    try {
                        yagVar = i;
                        if (yagVar == null) {
                            yagVar = j;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return yagVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (yagVar != null) {
            return yagVar;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    public final void a(String str, d45 d45Var, cq9 cq9Var) {
        new lag(this, str, d45Var, t72.H(cq9Var), 0).a();
    }

    public final void c() {
        synchronized (k) {
        }
    }

    public final void d() throws Throwable {
        i8c i8cVar = this.b.f;
        h2e h2eVar = new h2e(24, this);
        boolean zR = xdc.r();
        if (zR) {
            try {
                Trace.beginSection(xdc.v("ReschedulingWork"));
            } finally {
                if (zR) {
                    Trace.endSection();
                }
            }
        }
        h2eVar.invoke();
    }
}
