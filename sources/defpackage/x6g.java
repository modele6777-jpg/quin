package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x6g implements is8 {
    public final hx0 a;

    public x6g(hx0 hx0Var) {
        this.a = hx0Var;
    }

    @Override // defpackage.is8
    public final int a(a77 a77Var, long j, int i, cv7 cv7Var) {
        int i2 = (int) (j >> 32);
        if (i >= i2) {
            return Math.round((1.0f + (cv7Var == cv7.a ? 0.0f : -0.0f)) * ((i2 - i) / 2.0f));
        }
        return mh3.o(this.a.a(i, i2, cv7Var), 0, i2 - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x6g) && this.a.equals(((x6g) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.a + ", margin=0)";
    }
}
