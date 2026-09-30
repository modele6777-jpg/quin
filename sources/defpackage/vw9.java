package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lvw9;", "Ls09;", "Lww9;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class vw9 extends s09 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public vw9(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        boolean z = true;
        boolean z2 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            g37.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.s09
    public final i09 create() {
        ww9 ww9Var = new ww9();
        ww9Var.Z = this.a;
        ww9Var.E0 = this.b;
        ww9Var.F0 = this.c;
        ww9Var.G0 = this.d;
        ww9Var.H0 = true;
        return ww9Var;
    }

    public final boolean equals(Object obj) {
        vw9 vw9Var = obj instanceof vw9 ? (vw9) obj : null;
        return vw9Var != null && yi4.b(this.a, vw9Var.a) && yi4.b(this.b, vw9Var.b) && yi4.b(this.c, vw9Var.c) && yi4.b(this.d, vw9Var.d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ub3.a(this.d, ub3.a(this.c, ub3.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        ww9 ww9Var = (ww9) i09Var;
        ww9Var.Z = this.a;
        ww9Var.E0 = this.b;
        ww9Var.F0 = this.c;
        ww9Var.G0 = this.d;
        ww9Var.H0 = true;
    }
}
