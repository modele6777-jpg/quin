package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rse {
    public cv7 a;
    public sw3 b;
    public xp5 c;
    public mue d;
    public Object e;
    public final vz9 f = q1c.f(Boolean.TRUE);
    public long g = 0;

    public rse(cv7 cv7Var, sw3 sw3Var, xp5 xp5Var, mue mueVar, Object obj) {
        this.a = cv7Var;
        this.b = sw3Var;
        this.c = xp5Var;
        this.d = mueVar;
        this.e = obj;
    }

    public static void a(rse rseVar, cv7 cv7Var, sw3 sw3Var, mue mueVar, int i) {
        if ((i & 1) != 0) {
            cv7Var = rseVar.a;
        }
        if ((i & 2) != 0) {
            sw3Var = rseVar.b;
        }
        xp5 xp5Var = rseVar.c;
        if ((i & 8) != 0) {
            mueVar = rseVar.d;
        }
        Object obj = rseVar.e;
        cv7 cv7Var2 = rseVar.a;
        vz9 vz9Var = rseVar.f;
        if (cv7Var == cv7Var2 && pa7.t(sw3Var, rseVar.b) && pa7.t(xp5Var, rseVar.c) && pa7.t(mueVar, rseVar.d)) {
            if (pa7.t(obj, rseVar.e)) {
                return;
            }
            rseVar.e = obj;
            vz9Var.setValue(Boolean.TRUE);
            return;
        }
        rseVar.a = cv7Var;
        rseVar.b = sw3Var;
        rseVar.c = xp5Var;
        rseVar.d = mueVar;
        vz9Var.setValue(Boolean.TRUE);
    }
}
