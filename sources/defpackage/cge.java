package defpackage;

import com.adjust.sdk.network.ErrorCodes;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cge {
    public static final cge g = new cge(22.0d, -5.0d, 0.0d, 660, ErrorCodes.THROWABLE);
    public static final cge h = new cge(-32.0d, -11.0d, -9.0d, 660, 1155);
    public static final cge i = new cge(-38.0d, -32.0d, -3.0d, 1000, 1155);
    public static final cge j = new cge(18.0d, -11.0d, 0.0d, 780, 1120, 1.27f);
    public final double a;
    public final double b;
    public final double c;
    public final int d;
    public final int e;
    public final float f;

    public cge(double d, double d2, double d3, int i2, int i3, float f) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = i2;
        this.e = i3;
        this.f = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cge)) {
            return false;
        }
        cge cgeVar = (cge) obj;
        return Double.compare(this.a, cgeVar.a) == 0 && Double.compare(this.b, cgeVar.b) == 0 && Double.compare(this.c, cgeVar.c) == 0 && this.d == cgeVar.d && this.e == cgeVar.e && Float.compare(this.f, cgeVar.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + ub3.b(this.e, ub3.b(this.d, (Double.hashCode(this.c) + ((Double.hashCode(this.b) + (Double.hashCode(this.a) * 31)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TarotBoxPose(yawDegrees=");
        sb.append(this.a);
        sb.append(", pitchDegrees=");
        sb.append(this.b);
        sb.append(", rollDegrees=");
        sb.append(this.c);
        sb.append(", canvasWidthPx=");
        ub3.u(sb, this.d, ", canvasHeightPx=", this.e, ", scale=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ cge(double d, double d2, double d3, int i2, int i3) {
        this(d, d2, d3, i2, i3, 1.0f);
    }
}
