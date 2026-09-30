package defpackage;

import android.graphics.RenderEffect;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class q01 extends nqb {
    public final float b;
    public final float c;
    public final int d;

    public q01(float f, float f2, int i) {
        this.b = f;
        this.c = f2;
        this.d = i;
    }

    @Override // defpackage.nqb
    public final RenderEffect b() {
        return xq.c(this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q01)) {
            return false;
        }
        q01 q01Var = (q01) obj;
        return this.b == q01Var.b && this.c == q01Var.c && this.d == q01Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ub3.a(this.c, Float.hashCode(this.b) * 31, 31);
    }

    public final String toString() {
        return ks0.l(tec.o("BlurEffect(renderEffect=null, radiusX=", this.b, ", radiusY=", this.c, ", edgeTreatment="), y8c.q(this.d), ")");
    }
}
