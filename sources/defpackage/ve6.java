package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ve6 implements bfc, ym9, a35 {
    public static final String Z = ff8.n("GreedyScheduler");
    public final bbg X;
    public final kxa Y;
    public final Context a;
    public final qv3 c;
    public boolean d;
    public final vva g;
    public final lqb v;
    public final si2 w;
    public Boolean y;
    public final iag z;
    public final HashMap b = new HashMap();
    public final Object e = new Object();
    public final lqb f = new lqb(new u5c(1));
    public final HashMap x = new HashMap();

    public ve6(Context context, si2 si2Var, y1f y1fVar, vva vvaVar, lqb lqbVar, bbg bbgVar) {
        this.a = context;
        mjg mjgVar = si2Var.e;
        this.c = new qv3(this, mjgVar, si2Var.d);
        kxa kxaVar = new kxa();
        kxaVar.a = mjgVar;
        kxaVar.b = lqbVar;
        kxaVar.c = new Object();
        kxaVar.d = new LinkedHashMap();
        this.Y = kxaVar;
        this.X = bbgVar;
        this.z = new iag(y1fVar);
        this.w = si2Var;
        this.g = vvaVar;
        this.v = lqbVar;
    }

    @Override // defpackage.ym9
    public final void a(lbg lbgVar, ql2 ql2Var) {
        tag tagVarH = fbc.h(lbgVar);
        boolean z = ql2Var instanceof ol2;
        lqb lqbVar = this.v;
        kxa kxaVar = this.Y;
        String str = Z;
        lqb lqbVar2 = this.f;
        if (z) {
            if (lqbVar2.d(tagVarH)) {
                return;
            }
            ff8.h().e(str, "Constraints met: Scheduling work ID " + tagVarH);
            nzd nzdVarY = lqbVar2.y(tagVarH);
            kxaVar.k(nzdVarY);
            lqbVar.getClass();
            lqbVar.w(nzdVarY, null);
            return;
        }
        ff8.h().e(str, "Constraints not met: Cancelling work ID " + tagVarH);
        nzd nzdVarT = lqbVar2.t(tagVarH);
        if (nzdVarT != null) {
            kxaVar.d(nzdVarT);
            int i = ((pl2) ql2Var).a;
            lqbVar.getClass();
            lqbVar.x(nzdVarT, i);
        }
    }

    @Override // defpackage.a35
    public final void b(tag tagVar, boolean z) {
        dg7 dg7Var;
        nzd nzdVarT = this.f.t(tagVar);
        if (nzdVarT != null) {
            this.Y.d(nzdVarT);
        }
        synchronized (this.e) {
            dg7Var = (dg7) this.b.remove(tagVar);
        }
        if (dg7Var != null) {
            ff8.h().e(Z, "Stopping tracking for " + tagVar);
            dg7Var.h(null);
        }
        if (z) {
            return;
        }
        synchronized (this.e) {
            this.x.remove(tagVar);
        }
    }

    @Override // defpackage.bfc
    public final boolean c() {
        return false;
    }

    @Override // defpackage.bfc
    public final void d(String str) {
        List<nzd> listC;
        Runnable runnable;
        String str2 = Z;
        Boolean boolValueOf = this.y;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ova.a(this.a, this.w));
            this.y = boolValueOf;
        }
        if (!boolValueOf.booleanValue()) {
            ff8.h().l(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.d) {
            this.g.a(this);
            this.d = true;
        }
        ff8.h().e(str2, "Cancelling work ID " + str);
        qv3 qv3Var = this.c;
        if (qv3Var != null && (runnable = (Runnable) qv3Var.c.remove(str)) != null) {
            ((Handler) qv3Var.b.a).removeCallbacks(runnable);
        }
        lqb lqbVar = this.f;
        lqbVar.getClass();
        str.getClass();
        synchronized (lqbVar.c) {
            listC = ((u5c) lqbVar.b).c(str);
        }
        for (nzd nzdVar : listC) {
            this.Y.d(nzdVar);
            lqb lqbVar2 = this.v;
            lqbVar2.getClass();
            lqbVar2.x(nzdVar, -512);
        }
    }

    @Override // defpackage.bfc
    public final void e(lbg... lbgVarArr) {
        long jMax;
        Boolean boolValueOf = this.y;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ova.a(this.a, this.w));
            this.y = boolValueOf;
        }
        if (!boolValueOf.booleanValue()) {
            ff8.h().l(Z, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.d) {
            this.g.a(this);
            this.d = true;
        }
        HashSet<lbg> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        boolean z = false;
        for (lbg lbgVar : lbgVarArr) {
            if (!this.f.d(fbc.h(lbgVar))) {
                synchronized (this.e) {
                    try {
                        tag tagVarH = fbc.h(lbgVar);
                        ue6 ue6Var = (ue6) this.x.get(tagVarH);
                        if (ue6Var == null) {
                            int i = lbgVar.k;
                            uzd uzdVar = this.w.d;
                            ue6Var = new ue6(i, System.currentTimeMillis());
                            this.x.put(tagVarH, ue6Var);
                        }
                        jMax = (((long) Math.max((lbgVar.k - ue6Var.a) - 5, 0)) * 30000) + ue6Var.b;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                long jMax2 = Math.max(lbgVar.a(), jMax);
                uzd uzdVar2 = this.w.d;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (lbgVar.b == vag.a) {
                    if (jCurrentTimeMillis < jMax2) {
                        qv3 qv3Var = this.c;
                        if (qv3Var != null) {
                            mjg mjgVar = qv3Var.b;
                            HashMap map = qv3Var.c;
                            Runnable runnable = (Runnable) map.remove(lbgVar.a);
                            if (runnable != null) {
                                ((Handler) mjgVar.a).removeCallbacks(runnable);
                            }
                            lwg lwgVar = new lwg(qv3Var, lbgVar, z, 12);
                            map.put(lbgVar.a, lwgVar);
                            ((Handler) mjgVar.a).postDelayed(lwgVar, jMax2 - System.currentTimeMillis());
                        }
                    } else if (!pa7.t(jl2.j, lbgVar.j)) {
                        jl2 jl2Var = lbgVar.j;
                        if (jl2Var.d) {
                            ff8.h().e(Z, "Ignoring " + lbgVar + ". Requires device idle.");
                        } else if (jl2Var.i.isEmpty()) {
                            hashSet.add(lbgVar);
                            hashSet2.add(lbgVar.a);
                        } else {
                            ff8.h().e(Z, "Ignoring " + lbgVar + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.f.d(fbc.h(lbgVar))) {
                        ff8.h().e(Z, "Starting work for " + lbgVar.a);
                        lqb lqbVar = this.f;
                        lqbVar.getClass();
                        nzd nzdVarY = lqbVar.y(fbc.h(lbgVar));
                        this.Y.k(nzdVarY);
                        lqb lqbVar2 = this.v;
                        lqbVar2.getClass();
                        lqbVar2.w(nzdVarY, null);
                    }
                }
            }
        }
        synchronized (this.e) {
            try {
                if (!hashSet.isEmpty()) {
                    ff8.h().e(Z, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    for (lbg lbgVar2 : hashSet) {
                        tag tagVarH2 = fbc.h(lbgVar2);
                        if (!this.b.containsKey(tagVarH2)) {
                            this.b.put(tagVarH2, kag.a(this.z, lbgVar2, this.X.b, this));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
