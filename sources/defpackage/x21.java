package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x21 {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final d0a f;
    public final d0a g;
    public int h;
    public int i;

    public x21(d0a d0aVar, d0a d0aVar2, boolean z) throws l0a {
        this.g = d0aVar;
        this.f = d0aVar2;
        this.e = z;
        d0aVar2.M(12);
        this.a = d0aVar2.D();
        d0aVar.M(12);
        this.i = d0aVar.D();
        rs0.n("first_chunk must be 1", d0aVar.m() == 1);
        this.b = -1;
    }

    public final boolean a() {
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        boolean z = this.e;
        d0a d0aVar = this.f;
        this.d = z ? d0aVar.F() : d0aVar.B();
        if (this.b == this.h) {
            d0a d0aVar2 = this.g;
            this.c = d0aVar2.D();
            d0aVar2.N(4);
            int i2 = this.i - 1;
            this.i = i2;
            this.h = i2 > 0 ? d0aVar2.D() - 1 : -1;
        }
        return true;
    }
}
