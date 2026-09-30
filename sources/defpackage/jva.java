package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jva {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public jva(String str, int i, int i2, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jva)) {
            return false;
        }
        jva jvaVar = (jva) obj;
        return this.a.equals(jvaVar.a) && this.b == jvaVar.b && this.c == jvaVar.c && this.d == jvaVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ub3.b(this.c, ub3.b(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.a + ", pid=" + this.b + ", importance=" + this.c + ", isDefaultProcess=" + this.d + ')';
    }
}
