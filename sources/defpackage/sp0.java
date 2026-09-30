package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sp0 {
    public final Object a;
    public final e35 b;
    public final int c;
    public final Size d;
    public final Rect e;
    public final int f;
    public final Matrix g;
    public final oe1 h;

    public sp0(Object obj, e35 e35Var, int i, Size size, Rect rect, int i2, Matrix matrix, oe1 oe1Var) {
        if (obj == null) {
            r82.g("Null data");
            throw null;
        }
        this.a = obj;
        this.b = e35Var;
        this.c = i;
        this.d = size;
        this.e = rect;
        this.f = i2;
        this.g = matrix;
        if (oe1Var != null) {
            this.h = oe1Var;
        } else {
            r82.g("Null cameraCaptureResult");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sp0) {
            sp0 sp0Var = (sp0) obj;
            if (this.a.equals(sp0Var.a)) {
                e35 e35Var = sp0Var.b;
                e35 e35Var2 = this.b;
                if (e35Var2 == null) {
                    if (e35Var == null) {
                    }
                } else if (e35Var2 != e35Var) {
                    return false;
                }
                if (this.c == sp0Var.c && this.d.equals(sp0Var.d) && this.e.equals(sp0Var.e) && this.f == sp0Var.f && this.g.equals(sp0Var.g) && this.h.equals(sp0Var.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        e35 e35Var = this.b;
        return this.h.hashCode() ^ ((((((((((((iHashCode ^ (e35Var == null ? 0 : e35Var.hashCode())) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Packet{data=" + this.a + ", exif=" + this.b + ", format=" + this.c + ", size=" + this.d + ", cropRect=" + this.e + ", rotationDegrees=" + this.f + ", sensorToBufferTransform=" + this.g + ", cameraCaptureResult=" + this.h + "}";
    }
}
