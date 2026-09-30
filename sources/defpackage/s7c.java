package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s7c {
    public static final t7c a = new t7c(xc0.a, ndb.y);

    public static final t7c a(tc0 tc0Var, kx0 kx0Var, l46 l46Var, int i) {
        if (pa7.t(tc0Var, xc0.a) && pa7.t(kx0Var, ndb.y)) {
            l46Var.f0(-1073830487);
            l46Var.r(false);
            return a;
        }
        l46Var.f0(-1073779616);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && l46Var.g(tc0Var)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !l46Var.g(kx0Var)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objR = l46Var.R();
        if (z3 || objR == sf2.a) {
            objR = new t7c(tc0Var, kx0Var);
            l46Var.p0(objR);
        }
        t7c t7cVar = (t7c) objR;
        l46Var.r(false);
        return t7cVar;
    }
}
