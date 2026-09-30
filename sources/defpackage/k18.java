package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k18 {
    public static final b18 a = new b18(null, 0, false, 0.0f, new kx7(1), 0.0f, false, jgb.k(nu4.a), g21.b(), ll2.b(0, 0, 0, 0, 15), 0, pu4.a, 0, 0, 0, ks9.a, 0, 0);

    public static final j18 a(int i, int i2, l46 l46Var) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        vea veaVar = j18.y;
        boolean zE = l46Var.e(i) | l46Var.e(0);
        Object objR = l46Var.R();
        if (zE || objR == sf2.a) {
            objR = new a12(i, 3);
            l46Var.p0(objR);
        }
        return (j18) vfh.J(objArr, veaVar, (x16) objR, l46Var, 0);
    }
}
