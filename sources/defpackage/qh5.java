package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qh5 {
    public boolean c;
    public int e;
    public long h;
    public final oh5 i;
    public ph5 a = new ph5();
    public ph5 b = new ph5();
    public long d = -9223372036854775807L;
    public float f = -1.0f;
    public float g = -1.0f;

    public qh5(oh5 oh5Var) {
        this.i = oh5Var;
    }

    public final long a() {
        if (!this.a.a()) {
            return -9223372036854775807L;
        }
        ph5 ph5Var = this.a;
        long j = ph5Var.e;
        if (j == 0) {
            return 0L;
        }
        return ph5Var.f / j;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    public final void b(long j) {
        if (j == this.d) {
            return;
        }
        this.h++;
        this.a.b(j);
        if (this.a.a()) {
            this.c = false;
        } else if (this.d != -9223372036854775807L) {
            if (this.c) {
                ph5 ph5Var = this.b;
                long j2 = ph5Var.d;
                if (j2 == 0 ? false : ph5Var.g[(int) ((j2 - 1) % 15)]) {
                    this.b.c();
                    this.b.b(this.d);
                }
            } else {
                this.b.c();
                this.b.b(this.d);
            }
            this.c = true;
            this.b.b(j);
        }
        if (this.c && this.b.a()) {
            ph5 ph5Var2 = this.a;
            this.a = this.b;
            this.b = ph5Var2;
            this.c = false;
        }
        this.d = j;
        this.e = this.a.a() ? 0 : this.e + 1;
        c();
    }

    public final void c() {
        float f;
        boolean zA = this.a.a();
        if (zA) {
            ph5 ph5Var = this.a;
            long j = ph5Var.e;
            f = (float) (1.0E9d / (j != 0 ? ph5Var.f / j : 0L));
        } else {
            f = this.f;
        }
        float f2 = this.g;
        if (f == f2) {
            return;
        }
        if (f != -1.0f && f2 != -1.0f) {
            if (Math.abs(f - f2) < ((!zA || this.a.f < 5000000000L) ? 1.0f : 0.1f)) {
                return;
            }
        } else if (f == -1.0f && this.e < 30) {
            return;
        }
        this.g = f;
        this.i.f(f);
    }
}
