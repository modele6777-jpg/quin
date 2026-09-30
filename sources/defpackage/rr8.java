package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rr8 {
    public static final float a = eb3.X;
    public static final bx9 b = new bx9(12.0f, 0.0f, 12.0f, 0.0f);

    public static tr8 a(m82 m82Var) {
        tr8 tr8Var = m82Var.i0;
        if (tr8Var != null) {
            return tr8Var;
        }
        tr8 tr8Var2 = new tr8(o82.c(m82Var, cn1.F0), o82.c(m82Var, cn1.H0), o82.c(m82Var, cn1.M0), y72.b(o82.c(m82Var, cn1.y), cn1.z), y72.b(o82.c(m82Var, cn1.X), cn1.Y), y72.b(o82.c(m82Var, cn1.Z), cn1.E0));
        m82Var.i0 = tr8Var2;
        return tr8Var2;
    }
}
