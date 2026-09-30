package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a7b {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public a7b(float f, float f2, float f3, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7b)) {
            return false;
        }
        a7b a7bVar = (a7b) obj;
        return Float.compare(this.a, a7bVar.a) == 0 && Float.compare(this.b, a7bVar.b) == 0 && Float.compare(this.c, a7bVar.c) == 0 && this.d == a7bVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ub3.a(this.c, ub3.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbO = tec.o("FanCard(cxDp=", this.a, ", cyDp=", this.b, ", figmaAngle=");
        sbO.append(this.c);
        sbO.append(", overlay=");
        sbO.append(this.d);
        sbO.append(")");
        return sbO.toString();
    }
}
