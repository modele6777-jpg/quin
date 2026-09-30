package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkl9;", "Ls09;", "Ltl9;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class kl9 extends s09 {
    public final float a;
    public final float b;

    public kl9(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.s09
    public final i09 create() {
        tl9 tl9Var = new tl9();
        tl9Var.Z = this.a;
        tl9Var.E0 = this.b;
        tl9Var.F0 = true;
        return tl9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        kl9 kl9Var = obj instanceof kl9 ? (kl9) obj : null;
        return kl9Var != null && yi4.b(this.a, kl9Var.a) && yi4.b(this.b, kl9Var.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ub3.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return tec.m("OffsetModifierElement(x=", yi4.c(this.a), ", y=", yi4.c(this.b), ", rtlAware=true)");
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        tl9 tl9Var = (tl9) i09Var;
        float f = tl9Var.Z;
        float f2 = this.a;
        boolean zB = yi4.b(f, f2);
        float f3 = this.b;
        if (!zB || !yi4.b(tl9Var.E0, f3) || !tl9Var.F0) {
            vd0.s0(tl9Var).t0(false);
        }
        tl9Var.Z = f2;
        tl9Var.E0 = f3;
        tl9Var.F0 = true;
    }
}
