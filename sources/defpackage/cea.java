package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cea {
    public int a;
    public int b;
    public long c = 0;
    public long d = dea.b;
    public long e = 0;

    public Object E() {
        return null;
    }

    public abstract int W(zi ziVar);

    public int X() {
        return (int) (this.c & 4294967295L);
    }

    public int Y() {
        return (int) (this.c >> 32);
    }

    public final void a0() {
        this.a = mh3.o((int) (this.c >> 32), kl2.j(this.d), kl2.h(this.d));
        int iO = mh3.o((int) (this.c & 4294967295L), kl2.i(this.d), kl2.g(this.d));
        this.b = iO;
        int i = this.a;
        long j = this.c;
        this.e = (((long) ((i - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iO - ((int) (j & 4294967295L))) / 2)));
    }

    public abstract void b0(long j, float f, a26 a26Var);

    public void e0(long j, float f, ke6 ke6Var) {
        b0(j, f, null);
    }

    public final void f0(long j) {
        if (e77.b(this.c, j)) {
            return;
        }
        this.c = j;
        a0();
    }

    public final void i0(long j) {
        if (kl2.b(this.d, j)) {
            return;
        }
        this.d = j;
        a0();
    }
}
