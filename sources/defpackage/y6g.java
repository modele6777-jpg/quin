package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y6g implements js8 {
    public final kx0 a;
    public final int b;

    public y6g(kx0 kx0Var, int i) {
        this.a = kx0Var;
        this.b = i;
    }

    @Override // defpackage.js8
    public final int a(a77 a77Var, long j, int i) {
        int i2 = (int) (j & 4294967295L);
        int i3 = this.b;
        return i >= i2 - (i3 * 2) ? Math.round(((i2 - i) / 2.0f) * 1.0f) : mh3.o(this.a.a(i, i2), i3, (i2 - i3) - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6g)) {
            return false;
        }
        y6g y6gVar = (y6g) obj;
        return this.a.equals(y6gVar.a) && this.b == y6gVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(alignment=");
        sb.append(this.a);
        sb.append(", margin=");
        return tec.n(sb, this.b, ')');
    }
}
