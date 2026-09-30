package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qz7 {
    public final qcc a;
    public final ok3 b;
    public final w79 c;

    public qz7(qcc qccVar, ok3 ok3Var) {
        this.a = qccVar;
        this.b = ok3Var;
        long[] jArr = jec.a;
        this.c = new w79();
    }

    public final l26 a(int i, Object obj, Object obj2) {
        w79 w79Var = this.c;
        pz7 pz7Var = (pz7) w79Var.g(obj);
        int i2 = 7;
        if (pz7Var != null && pz7Var.c == i && pa7.t(pz7Var.b, obj2)) {
            dd2 dd2Var = pz7Var.d;
            if (dd2Var != null) {
                return dd2Var;
            }
            dd2 dd2Var2 = new dd2(new rk6(i2, pz7Var.e, pz7Var), true, 818252804);
            pz7Var.d = dd2Var2;
            return dd2Var2;
        }
        pz7 pz7Var2 = new pz7(this, i, obj, obj2);
        w79Var.m(obj, pz7Var2);
        dd2 dd2Var3 = pz7Var2.d;
        if (dd2Var3 != null) {
            return dd2Var3;
        }
        dd2 dd2Var4 = new dd2(new rk6(i2, this, pz7Var2), true, 818252804);
        pz7Var2.d = dd2Var4;
        return dd2Var4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        pz7 pz7Var = (pz7) this.c.g(obj);
        if (pz7Var != null) {
            return pz7Var.b;
        }
        rz7 rz7Var = (rz7) this.b.invoke();
        int iE = rz7Var.e(obj);
        if (iE != -1) {
            return rz7Var.c(iE);
        }
        return null;
    }
}
