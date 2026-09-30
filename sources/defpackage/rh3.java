package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rh3 implements Comparable {
    public final int a;
    public final int b;

    public rh3(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i2 >= 0) {
            return;
        }
        qc0.o(tec.e(i2, "Digits must be non-negative, but was "));
        throw null;
    }

    public final int a(int i) {
        int[] iArr = kn2.v;
        int i2 = this.a;
        int i3 = this.b;
        if (i == i3) {
            return i2;
        }
        return i > i3 ? i2 * iArr[i - i3] : i2 / iArr[i3 - i];
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        rh3 rh3Var = (rh3) obj;
        rh3Var.getClass();
        int iMax = Math.max(this.b, rh3Var.b);
        return pa7.L(a(iMax), rh3Var.a(iMax));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rh3)) {
            return false;
        }
        rh3 rh3Var = (rh3) obj;
        int iMax = Math.max(this.b, rh3Var.b);
        return pa7.L(a(iMax), rh3Var.a(iMax)) == 0;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException("DecimalFraction is not supposed to be used as a hash key");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = kn2.v[this.b];
        int i2 = this.a;
        sb.append(i2 / i);
        sb.append('.');
        sb.append(v4e.Y("1", String.valueOf((i2 % i) + i)));
        return sb.toString();
    }
}
