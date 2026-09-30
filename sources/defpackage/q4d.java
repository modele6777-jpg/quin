package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q4d {
    public final vs9 a;
    public zt b;
    public xz0 c;
    public long d;
    public long e;
    public long f;
    public cv7 g;
    public float h;

    public q4d(vs9 vs9Var) {
        this.a = vs9Var;
        int i = y72.l;
        this.d = y72.k;
        this.e = 0L;
        this.f = 9205357640488583168L;
        this.g = cv7.a;
        this.h = 1.0f;
    }

    public abstract void a(sn4 sn4Var, long j, long j2, zt ztVar);

    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    public final void b(sn4 sn4Var, c82 c82Var, long j, long j2, b41 b41Var, float f, int i) {
        vs9 vs9Var = this.a;
        c82 c82Var2 = null;
        if (vs9Var instanceof ss9) {
            this.b = ((ss9) vs9Var).a;
            this.e = 0L;
        } else if (vs9Var instanceof us9) {
            us9 us9Var = (us9) vs9Var;
            v6c v6cVar = us9Var.a;
            if (w6c.o(v6cVar)) {
                this.b = null;
                this.e = v6cVar.e;
            } else {
                this.b = us9Var.b;
                this.e = 0L;
            }
        } else if (!(vs9Var instanceof ts9)) {
            ap.c();
            return;
        } else {
            this.b = null;
            this.e = 0L;
        }
        if (c82Var != null) {
            c82Var2 = c82Var;
        } else if (b41Var == null && j2 != 16) {
            xz0 xz0Var = this.c;
            if (xz0Var != null) {
                long j3 = this.d;
                int i2 = y72.l;
                if (!faf.a(j3, j2)) {
                    xz0Var = new xz0(j2, 5);
                    this.d = j2;
                    this.c = xz0Var;
                }
            } else {
                xz0Var = new xz0(j2, 5);
                this.d = j2;
                this.c = xz0Var;
            }
            c82Var2 = xz0Var;
        }
        long j4 = this.f;
        if (j4 == 9205357640488583168L || !ald.a(j4, j) || this.g != sn4Var.getLayoutDirection() || this.h != sn4Var.getDensity()) {
            a(sn4Var, j, this.e, this.b);
            this.f = j;
            this.g = sn4Var.getLayoutDirection();
            this.h = sn4Var.getDensity();
        }
        c(sn4Var, this.e, this.b, f, c82Var2, b41Var, i);
    }

    public abstract void c(sn4 sn4Var, long j, zt ztVar, float f, c82 c82Var, b41 b41Var, int i);
}
