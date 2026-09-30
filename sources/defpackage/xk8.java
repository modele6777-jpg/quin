package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xk8 implements lla {
    public final ssg a;
    public e77 b;
    public cv7 c;
    public e77 d;
    public w67 e;

    public xk8(ssg ssgVar) {
        this.a = ssgVar;
    }

    @Override // defpackage.lla
    public final long x(a77 a77Var, long j, cv7 cv7Var, long j2) {
        w67 w67Var = this.e;
        if (w67Var != null) {
            e77 e77Var = this.b;
            if ((e77Var == null ? false : e77.b(e77Var.a, j)) && this.c == cv7Var) {
                e77 e77Var2 = this.d;
                if (e77Var2 != null ? e77.b(e77Var2.a, j2) : false) {
                    return w67Var.a;
                }
            }
        }
        long jX = this.a.x(a77Var, j, cv7Var, j2);
        this.b = new e77(j);
        this.c = cv7Var;
        this.d = new e77(j2);
        this.e = new w67(jX);
        return jX;
    }
}
