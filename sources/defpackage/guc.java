package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class guc {
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final ste f;

    public guc(long j, int i, int i2, int i3, int i4, ste steVar) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = steVar;
    }

    public final uuc a(int i) {
        return new uuc(gcc.q(this.f, i), i, this.a);
    }

    public final c03 b() {
        int i = this.c;
        int i2 = this.d;
        if (i < i2) {
            return c03.b;
        }
        return i > i2 ? c03.a : c03.c;
    }

    public final vuc c(int i, int i2) {
        return new vuc(a(i), a(i2), i > i2);
    }

    public final String toString() {
        ste steVar = this.f;
        int i = this.c;
        txb txbVarQ = gcc.q(steVar, i);
        int i2 = this.d;
        return "SelectionInfo(id=" + this.a + ", range=(" + i + "-" + txbVarQ + "," + i2 + "-" + gcc.q(steVar, i2) + "), prevOffset=" + this.e + ")";
    }
}
