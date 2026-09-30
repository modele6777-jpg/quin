package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class q1d implements vs4 {
    public final k00 a;
    public final int b;

    public q1d(String str, int i) {
        this.a = new k00(str);
        this.b = i;
    }

    @Override // defpackage.vs4
    public final void a(er0 er0Var) {
        String str = this.a.b;
        int i = er0Var.d;
        if (i != -1) {
            er0Var.o(i, er0Var.e, str);
            if (str.length() > 0) {
                er0Var.p(i, str.length() + i);
            }
        } else {
            int i2 = er0Var.b;
            er0Var.o(i2, er0Var.c, str);
            if (str.length() > 0) {
                er0Var.p(i2, str.length() + i2);
            }
        }
        int i3 = er0Var.b;
        int i4 = er0Var.c;
        int i5 = i3 == i4 ? i4 : -1;
        int i6 = this.b;
        int iO = mh3.o(i6 > 0 ? (i5 + i6) - 1 : (i5 + i6) - str.length(), 0, ((p90) er0Var.f).C());
        er0Var.s(iO, iO);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1d)) {
            return false;
        }
        q1d q1dVar = (q1d) obj;
        return pa7.t(this.a.b, q1dVar.a.b) && this.b == q1dVar.b;
    }

    public final int hashCode() {
        return (this.a.b.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "SetComposingTextCommand(text='" + this.a.b + "', newCursorPosition=" + this.b + ")";
    }
}
