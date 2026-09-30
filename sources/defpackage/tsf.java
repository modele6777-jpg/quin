package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tsf {
    public final pj5 a;
    public b00 b;
    public b00 c;
    public b00 d;
    public final float e;

    public tsf(pj5 pj5Var) {
        this.a = pj5Var;
        this.e = pj5Var.e();
    }

    public final b00 a(long j, b00 b00Var, b00 b00Var2) {
        b00 b00VarC = this.c;
        if (b00VarC == null) {
            b00VarC = b00Var.c();
            this.c = b00VarC;
        }
        int iB = b00VarC.b();
        int i = 0;
        while (true) {
            b00 b00Var3 = this.c;
            if (i >= iB) {
                if (b00Var3 != null) {
                    return b00Var3;
                }
                pa7.g0("velocityVector");
                throw null;
            }
            if (b00Var3 == null) {
                pa7.g0("velocityVector");
                throw null;
            }
            b00Var.getClass();
            b00Var3.e(i, this.a.o(j, b00Var2.a(i)));
            i++;
        }
    }
}
