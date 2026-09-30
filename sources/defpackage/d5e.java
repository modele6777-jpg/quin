package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d5e extends un4 {
    public final float a;
    public final float b;
    public final int c;
    public final int d;
    public final au e;

    public d5e(float f, float f2, int i, int i2, au auVar, int i3) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        auVar = (i3 & 16) != 0 ? null : auVar;
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
        this.e = auVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5e)) {
            return false;
        }
        d5e d5eVar = (d5e) obj;
        return this.a == d5eVar.a && this.b == d5eVar.b && this.c == d5eVar.c && this.d == d5eVar.d && pa7.t(this.e, d5eVar.e);
    }

    public final int hashCode() {
        int iB = ub3.b(this.d, ub3.b(this.c, ub3.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
        au auVar = this.e;
        return iB + (auVar != null ? auVar.hashCode() : 0);
    }

    public final String toString() {
        String str;
        String str2 = "Unknown";
        int i = this.c;
        if (i == 0) {
            str = "Butt";
        } else if (i == 1) {
            str = "Round";
        } else {
            str = i == 2 ? "Square" : "Unknown";
        }
        int i2 = this.d;
        if (i2 == 0) {
            str2 = "Miter";
        } else if (i2 == 1) {
            str2 = "Round";
        } else if (i2 == 2) {
            str2 = "Bevel";
        }
        StringBuilder sbO = tec.o("Stroke(width=", this.a, ", miter=", this.b, ", cap=");
        ub3.v(sbO, str, ", join=", str2, ", pathEffect=");
        sbO.append(this.e);
        sbO.append(")");
        return sbO.toString();
    }
}
