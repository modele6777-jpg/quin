package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z3g {
    public final ks a;
    public final ks b;
    public final float c;

    public z3g(ks ksVar, ks ksVar2, float f) {
        this.a = ksVar;
        this.b = ksVar2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z3g) {
            z3g z3gVar = (z3g) obj;
            if (this.a == z3gVar.a && this.b == z3gVar.b && Float.compare(this.c, z3gVar.c) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "WidgetCardArt(image=" + this.a + ", backdrop=" + this.b + ", hue=" + this.c + ")";
    }
}
