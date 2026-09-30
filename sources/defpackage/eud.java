package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class eud {
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final int e;

    public eud(float f, float f2, float f3, int i, int i2) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eud)) {
            return false;
        }
        eud eudVar = (eud) obj;
        return yi4.b(this.a, eudVar.a) && yi4.b(this.b, eudVar.b) && yi4.b(this.c, eudVar.c) && this.d == eudVar.d && this.e == eudVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ub3.b(this.d, ub3.a(this.c, ub3.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        String strC = yi4.c(this.a);
        String strC2 = yi4.c(this.b);
        String strC3 = yi4.c(this.c);
        StringBuilder sbO = ib8.o("SparkleStarConfig(x=", strC, ", y=", strC2, ", size=");
        sbO.append(strC3);
        sbO.append(", durationMillis=");
        sbO.append(this.d);
        sbO.append(", delayMillis=");
        return tec.g(this.e, ")", sbO);
    }
}
