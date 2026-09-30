package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gie {
    public final float a;
    public final float b;
    public final float c;

    public gie(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gie)) {
            return false;
        }
        gie gieVar = (gie) obj;
        return Float.compare(this.a, gieVar.a) == 0 && Float.compare(this.b, gieVar.b) == 0 && Float.compare(this.c, gieVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + ub3.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbO = tec.o("TarotCutLayerPose(x=", this.a, ", y=", this.b, ", rotation=");
        sbO.append(this.c);
        sbO.append(")");
        return sbO.toString();
    }
}
