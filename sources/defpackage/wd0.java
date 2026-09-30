package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lwd0;", "Ls09;", "Lyd0;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class wd0 extends s09 {
    public final float a;

    public wd0(float f) {
        this.a = f;
        if (f > 0.0f) {
            return;
        }
        g37.a("aspectRatio " + f + " must be > 0");
    }

    @Override // defpackage.s09
    public final i09 create() {
        yd0 yd0Var = new yd0();
        yd0Var.Z = this.a;
        return yd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        wd0 wd0Var = obj instanceof wd0 ? (wd0) obj : null;
        if (wd0Var == null || this.a != wd0Var.a) {
            return false;
        }
        ((wd0) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Float.hashCode(this.a) * 31);
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        ((yd0) i09Var).Z = this.a;
    }
}
