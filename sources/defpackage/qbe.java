package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qbe {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public qbe(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qbe)) {
            return false;
        }
        qbe qbeVar = (qbe) obj;
        return Float.compare(this.a, qbeVar.a) == 0 && Float.compare(this.b, qbeVar.b) == 0 && Float.compare(this.c, qbeVar.c) == 0 && Float.compare(this.d, qbeVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + ub3.a(this.c, ub3.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbO = tec.o("ViewBox(left=", this.a, ", top=", this.b, ", right=");
        sbO.append(this.c);
        sbO.append(", bottom=");
        sbO.append(this.d);
        sbO.append(")");
        return sbO.toString();
    }
}
