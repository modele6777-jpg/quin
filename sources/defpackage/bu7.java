package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class bu7 implements Comparable {
    public static final bu7 e = new bu7(2, 4, 10);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public bu7(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        if (i >= 0 && i < 256 && i2 >= 0 && i2 < 256 && i3 >= 0 && i3 < 256) {
            this.d = (i << 16) + (i2 << 8) + i3;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        bu7 bu7Var = (bu7) obj;
        bu7Var.getClass();
        return this.d - bu7Var.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        bu7 bu7Var = obj instanceof bu7 ? (bu7) obj : null;
        return bu7Var != null && this.d == bu7Var.d;
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('.');
        sb.append(this.b);
        sb.append('.');
        sb.append(this.c);
        return sb.toString();
    }
}
