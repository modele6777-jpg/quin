package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e00 {
    public static final q03 a = gs4.e;

    public static final void a(int i, dd2 dd2Var, l46 l46Var, boolean z) {
        l46Var.h0(-1746057942);
        int i2 = (l46Var.h(z) ? 4 : 2) | i;
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            q03 q03Var = a;
            m93.d(z, null, rw4.f(b21.T(200, 0, q03Var, 2), 2), rw4.g(b21.T(200, 0, q03Var, 2), 2), null, dd2Var, l46Var, (i2 & 14) | 196608, 18);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new d00(z, dd2Var, i, 0);
        }
    }
}
