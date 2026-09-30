package defpackage;

import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class iq0 {
    public final Size a;
    public final Rect b;
    public final pg1 c;
    public final int d;
    public final boolean e;

    public iq0(Size size, Rect rect, pg1 pg1Var, int i, boolean z) {
        if (size == null) {
            r82.g("Null inputSize");
            throw null;
        }
        this.a = size;
        this.b = rect;
        this.c = pg1Var;
        this.d = i;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iq0)) {
            return false;
        }
        iq0 iq0Var = (iq0) obj;
        if (!this.a.equals(iq0Var.a) || !this.b.equals(iq0Var.b)) {
            return false;
        }
        pg1 pg1Var = iq0Var.c;
        pg1 pg1Var2 = this.c;
        if (pg1Var2 == null) {
            if (pg1Var != null) {
                return false;
            }
        } else if (!pg1Var2.equals(pg1Var)) {
            return false;
        }
        return this.d == iq0Var.d && this.e == iq0Var.e;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        pg1 pg1Var = this.c;
        return (this.e ? 1231 : 1237) ^ ((((iHashCode ^ (pg1Var == null ? 0 : pg1Var.hashCode())) * 1000003) ^ this.d) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraInputInfo{inputSize=");
        sb.append(this.a);
        sb.append(", inputCropRect=");
        sb.append(this.b);
        sb.append(", cameraInternal=");
        sb.append(this.c);
        sb.append(", rotationDegrees=");
        sb.append(this.d);
        sb.append(", mirroring=");
        return ub3.m(sb, this.e, "}");
    }
}
