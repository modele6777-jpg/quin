package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class p1e extends er8 {
    public static final /* synthetic */ wn7[] f = {new aya(p1e.class, "functions", "getFunctions()Ljava/util/List;", 0), new aya(p1e.class, "properties", "getProperties()Ljava/util/List;", 0)};
    public final d04 b;
    public final boolean c;
    public final ee8 d;
    public final ee8 e;

    public p1e(ge8 ge8Var, d04 d04Var, boolean z) {
        ge8Var.getClass();
        this.b = d04Var;
        this.c = z;
        this.d = new ee8(ge8Var, new o1e(this, 0));
        this.e = new ee8(ge8Var, new o1e(this, 1));
    }

    @Override // defpackage.er8, defpackage.dr8
    public final Collection a(ez3 ez3Var, a26 a26Var) {
        ez3Var.getClass();
        wn7[] wn7VarArr = f;
        return s72.Q0((List) gdc.f(this.d, wn7VarArr[0]), (List) gdc.f(this.e, wn7VarArr[1]));
    }

    @Override // defpackage.er8, defpackage.dr8
    public final Collection b(t99 t99Var, lf9 lf9Var) {
        t99Var.getClass();
        List list = (List) gdc.f(this.d, f[0]);
        cqd cqdVar = new cqd();
        for (Object obj : list) {
            if (pa7.t(((hjd) obj).getName(), t99Var)) {
                cqdVar.add(obj);
            }
        }
        return cqdVar;
    }

    @Override // defpackage.er8, defpackage.dr8
    public final y22 e(t99 t99Var, lf9 lf9Var) {
        t99Var.getClass();
        lf9Var.getClass();
        return null;
    }

    @Override // defpackage.er8, defpackage.dr8
    public final Collection f(t99 t99Var, lf9 lf9Var) {
        t99Var.getClass();
        List list = (List) gdc.f(this.e, f[1]);
        cqd cqdVar = new cqd();
        for (Object obj : list) {
            if (pa7.t(((wxa) obj).getName(), t99Var)) {
                cqdVar.add(obj);
            }
        }
        return cqdVar;
    }
}
