package defpackage;

import android.util.Range;
import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hq0 {
    public static final Range h = new Range(0, 0);
    public final Size a;
    public final Size b;
    public final qr4 c;
    public final int d;
    public final Range e;
    public final qh2 f;
    public final boolean g;

    public hq0(Size size, Size size2, qr4 qr4Var, int i, Range range, qh2 qh2Var, boolean z) {
        this.a = size;
        this.b = size2;
        this.c = qr4Var;
        this.d = i;
        this.e = range;
        this.f = qh2Var;
        this.g = z;
    }

    public static hc2 a(Size size) {
        hc2 hc2Var = new hc2();
        if (size == null) {
            r82.g("Null resolution");
            return null;
        }
        hc2Var.b = size;
        hc2Var.c = size;
        hc2Var.e = 0;
        Range range = h;
        if (range == null) {
            r82.g("Null expectedFrameRateRange");
            return null;
        }
        hc2Var.f = range;
        hc2Var.d = qr4.d;
        hc2Var.v = Boolean.FALSE;
        return hc2Var;
    }

    public final hc2 b() {
        hc2 hc2Var = new hc2();
        hc2Var.b = this.a;
        hc2Var.c = this.b;
        hc2Var.d = this.c;
        hc2Var.e = Integer.valueOf(this.d);
        hc2Var.f = this.e;
        hc2Var.g = this.f;
        hc2Var.v = Boolean.valueOf(this.g);
        return hc2Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hq0) {
            hq0 hq0Var = (hq0) obj;
            if (this.a.equals(hq0Var.a) && this.b.equals(hq0Var.b) && this.c.equals(hq0Var.c) && this.d == hq0Var.d && this.e.equals(hq0Var.e)) {
                qh2 qh2Var = hq0Var.f;
                qh2 qh2Var2 = this.f;
                if (qh2Var2 != null ? qh2Var2.equals(qh2Var) : qh2Var == null) {
                    if (this.g == hq0Var.g) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        qh2 qh2Var = this.f;
        return (this.g ? 1231 : 1237) ^ ((iHashCode ^ (qh2Var == null ? 0 : qh2Var.hashCode())) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamSpec{resolution=");
        sb.append(this.a);
        sb.append(", originalConfiguredResolution=");
        sb.append(this.b);
        sb.append(", dynamicRange=");
        sb.append(this.c);
        sb.append(", sessionType=");
        sb.append(this.d);
        sb.append(", expectedFrameRateRange=");
        sb.append(this.e);
        sb.append(", implementationOptions=");
        sb.append(this.f);
        sb.append(", zslDisabled=");
        return ub3.m(sb, this.g, "}");
    }
}
