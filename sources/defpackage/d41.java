package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d41 implements bte {
    public final l4d a;
    public final float b;

    public d41(l4d l4dVar, float f) {
        this.a = l4dVar;
        this.b = f;
    }

    @Override // defpackage.bte
    public final float a() {
        return this.b;
    }

    @Override // defpackage.bte
    public final long b() {
        int i = y72.l;
        return y72.k;
    }

    @Override // defpackage.bte
    public final b41 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d41)) {
            return false;
        }
        d41 d41Var = (d41) obj;
        return this.a.equals(d41Var.a) && Float.compare(this.b, d41Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BrushStyle(value=" + this.a + ", alpha=" + this.b + ")";
    }
}
