package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class e52 implements occ {
    public final occ a;
    public final boolean b;
    public boolean c;
    public final /* synthetic */ f52 d;

    public e52(f52 f52Var, occ occVar, boolean z) {
        this.d = f52Var;
        this.a = occVar;
        this.b = z;
    }

    @Override // defpackage.occ
    public final boolean a() {
        return !this.d.n() && this.a.a();
    }

    @Override // defpackage.occ
    public final int b() {
        int iB = this.a.b();
        if (this.d.w != Long.MIN_VALUE) {
            iB |= 1;
        }
        return this.b ? (iB & (-3)) | 4 : iB;
    }

    @Override // defpackage.occ
    public final int c(fz3 fz3Var, tm3 tm3Var, int i) {
        f52 f52Var = this.d;
        if (f52Var.n()) {
            return -3;
        }
        if (this.c) {
            tm3Var.b = 4;
            return -4;
        }
        long jP = f52Var.p();
        int iC = this.a.c(fz3Var, tm3Var, i);
        if (f52Var.g != -9223372036854775807L && iC != -3) {
            f52Var.g = -9223372036854775807L;
        }
        if (iC != -5) {
            long j = f52Var.w;
            if (j == Long.MIN_VALUE || ((iC != -4 || tm3Var.g < j) && !(iC == -3 && jP == Long.MIN_VALUE && !tm3Var.f))) {
                return iC;
            }
            tm3Var.e();
            tm3Var.b = 4;
            this.c = true;
            return -4;
        }
        long j2 = f52Var.v;
        long j3 = f52Var.w;
        rr5 rr5Var = (rr5) fz3Var.c;
        rr5Var.getClass();
        int i2 = rr5Var.O;
        int i3 = rr5Var.N;
        if (i3 != 0 || i2 != 0) {
            if (j2 != 0) {
                i3 = 0;
            }
            if (j3 != Long.MIN_VALUE) {
                i2 = 0;
            }
            qr5 qr5VarA = rr5Var.a();
            qr5VarA.M = i3;
            qr5VarA.N = i2;
            fz3Var.c = new rr5(qr5VarA);
        }
        return -5;
    }

    @Override // defpackage.occ
    public final void d() {
        this.a.d();
    }

    @Override // defpackage.occ
    public final int e(long j) {
        if (this.d.n()) {
            return -3;
        }
        return this.a.e(j);
    }
}
