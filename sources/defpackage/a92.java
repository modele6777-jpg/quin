package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a92 {
    public static final c92 a = new c92(xc0.c, ndb.Y);

    public static final c92 a(wc0 wc0Var, xi xiVar, l46 l46Var, int i) {
        if (wc0Var.equals(xc0.c) && pa7.t(xiVar, ndb.Y)) {
            l46Var.f0(-1446604504);
            l46Var.r(false);
            return a;
        }
        l46Var.f0(-1446550657);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && l46Var.g(wc0Var)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !l46Var.g(xiVar)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objR = l46Var.R();
        if (z3 || objR == sf2.a) {
            objR = new c92(wc0Var, xiVar);
            l46Var.p0(objR);
        }
        c92 c92Var = (c92) objR;
        l46Var.r(false);
        return c92Var;
    }
}
