package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ba2 implements vs4 {
    public final k00 a;
    public final int b;

    public ba2(String str, int i) {
        this(new k00(str), i);
    }

    @Override // defpackage.vs4
    public final void a(er0 er0Var) {
        int i = er0Var.d;
        k00 k00Var = this.a;
        if (i != -1) {
            er0Var.o(i, er0Var.e, k00Var.b);
        } else {
            er0Var.o(er0Var.b, er0Var.c, k00Var.b);
        }
        int i2 = er0Var.b;
        int i3 = er0Var.c;
        int i4 = i2 == i3 ? i3 : -1;
        int i5 = this.b;
        int iO = mh3.o(i5 > 0 ? (i4 + i5) - 1 : (i4 + i5) - k00Var.b.length(), 0, ((p90) er0Var.f).C());
        er0Var.s(iO, iO);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba2)) {
            return false;
        }
        ba2 ba2Var = (ba2) obj;
        return pa7.t(this.a.b, ba2Var.a.b) && this.b == ba2Var.b;
    }

    public final int hashCode() {
        return (this.a.b.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "CommitTextCommand(text='" + this.a.b + "', newCursorPosition=" + this.b + ")";
    }

    public ba2(k00 k00Var, int i) {
        this.a = k00Var;
        this.b = i;
    }
}
