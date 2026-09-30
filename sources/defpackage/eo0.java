package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class eo0 {
    public final z9e a;
    public final int b;
    public final Size c;
    public final qr4 d;
    public final List e;
    public final qh2 f;
    public final int g;
    public final Range h;
    public final boolean i;
    public final int j;

    public eo0(z9e z9eVar, int i, Size size, qr4 qr4Var, List list, qh2 qh2Var, int i2, Range range, boolean z, int i3) {
        this.a = z9eVar;
        this.b = i;
        this.c = size;
        if (qr4Var == null) {
            r82.g("Null dynamicRange");
            throw null;
        }
        this.d = qr4Var;
        this.e = list;
        this.f = qh2Var;
        this.g = i2;
        if (range == null) {
            r82.g("Null targetFrameRate");
            throw null;
        }
        this.h = range;
        this.i = z;
        this.j = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eo0)) {
            return false;
        }
        eo0 eo0Var = (eo0) obj;
        if (!this.a.equals(eo0Var.a) || this.b != eo0Var.b || !this.c.equals(eo0Var.c) || !this.d.equals(eo0Var.d) || !this.e.equals(eo0Var.e)) {
            return false;
        }
        qh2 qh2Var = eo0Var.f;
        qh2 qh2Var2 = this.f;
        if (qh2Var2 == null) {
            if (qh2Var != null) {
                return false;
            }
        } else if (!qh2Var2.equals(qh2Var)) {
            return false;
        }
        return this.g == eo0Var.g && this.h.equals(eo0Var.h) && this.i == eo0Var.i && this.j == eo0Var.j;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        qh2 qh2Var = this.f;
        return this.j ^ ((((((((iHashCode ^ (qh2Var == null ? 0 : qh2Var.hashCode())) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ (this.i ? 1231 : 1237)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachedSurfaceInfo{surfaceConfig=");
        sb.append(this.a);
        sb.append(", imageFormat=");
        sb.append(this.b);
        sb.append(", size=");
        sb.append(this.c);
        sb.append(", dynamicRange=");
        sb.append(this.d);
        sb.append(", captureTypes=");
        sb.append(this.e);
        sb.append(", implementationOptions=");
        sb.append(this.f);
        sb.append(", sessionType=");
        sb.append(this.g);
        sb.append(", targetFrameRate=");
        sb.append(this.h);
        sb.append(", strictFrameRateRequired=");
        sb.append(this.i);
        sb.append(", customMaxFrameRate=");
        return tec.g(this.j, "}", sb);
    }
}
