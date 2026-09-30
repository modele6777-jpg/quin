package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v08 extends qn4 {
    public final os s = new os(7, (byte) 0);

    public v08(a26 a26Var) {
        a26Var.d(this);
    }

    public static /* synthetic */ void W(v08 v08Var, String str, dd2 dd2Var, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        v08Var.V(str, null, dd2Var);
    }

    public static /* synthetic */ void Y(v08 v08Var, int i, a26 a26Var, dd2 dd2Var, int i2) {
        if ((i2 & 2) != 0) {
            a26Var = null;
        }
        v08Var.X(i, a26Var, tj7.J0, dd2Var);
    }

    @Override // defpackage.qn4
    public final os D() {
        return this.s;
    }

    public final void V(Object obj, String str, dd2 dd2Var) {
        int i = 0;
        this.s.a(1, new t08(obj != null ? new u08(i, obj) : null, new u08(i, str), new dd2(new uu0(dd2Var, 4), true, -857469575)));
    }

    public final void X(int i, a26 a26Var, a26 a26Var2, dd2 dd2Var) {
        this.s.a(i, new t08(a26Var, a26Var2, dd2Var));
    }
}
