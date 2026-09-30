package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls17;", "Ls09;", "Lx17;", "material3"}, k = 1, mv = {2, 0, 0}, xi = z7c.f)
public final /* data */ class s17 extends s09 {
    public final boolean a;
    public final m77 b;
    public final wne c;
    public final x4d d;
    public final float e;
    public final float f;

    public s17(boolean z, m77 m77Var, wne wneVar, x4d x4dVar, float f, float f2) {
        this.a = z;
        this.b = m77Var;
        this.c = wneVar;
        this.d = x4dVar;
        this.e = f;
        this.f = f2;
    }

    @Override // defpackage.s09
    public final i09 create() {
        return new x17(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s17)) {
            return false;
        }
        s17 s17Var = (s17) obj;
        return this.a == s17Var.a && pa7.t(this.b, s17Var.b) && this.c.equals(s17Var.c) && pa7.t(this.d, s17Var.d) && yi4.b(this.e, s17Var.e) && yi4.b(this.f, s17Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + ub3.d(Boolean.hashCode(this.a) * 31, 31, false)) * 31)) * 31;
        x4d x4dVar = this.d;
        return Float.hashCode(this.f) + ub3.a(this.e, (iHashCode + (x4dVar != null ? x4dVar.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "IndicatorLineElement(enabled=" + this.a + ", isError=false, interactionSource=" + this.b + ", colors=" + this.c + ", textFieldShape=" + this.d + ", focusedIndicatorLineThickness=" + ((Object) yi4.c(this.e)) + ", unfocusedIndicatorLineThickness=" + ((Object) yi4.c(this.f)) + ')';
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        boolean z;
        x17 x17Var = (x17) i09Var;
        boolean z2 = x17Var.F0;
        boolean z3 = this.a;
        boolean z4 = true;
        if (z2 != z3) {
            x17Var.F0 = z3;
            z = true;
        } else {
            z = false;
        }
        m77 m77Var = x17Var.G0;
        m77 m77Var2 = this.b;
        if (m77Var != m77Var2) {
            x17Var.G0 = m77Var2;
            lyd lydVar = x17Var.K0;
            if (lydVar != null) {
                lydVar.h(null);
            }
            x17Var.K0 = ynb.V(x17Var.Z0(), null, null, new w17(x17Var, null), 3);
        }
        wne wneVar = x17Var.L0;
        wne wneVar2 = this.c;
        if (!pa7.t(wneVar, wneVar2)) {
            x17Var.L0 = wneVar2;
            z = true;
        }
        x4d x4dVar = x17Var.N0;
        x4d x4dVar2 = this.d;
        if (!pa7.t(x4dVar, x4dVar2)) {
            if (!pa7.t(x17Var.N0, x4dVar2)) {
                x17Var.N0 = x4dVar2;
                x17Var.P0.l1();
            }
            z = true;
        }
        float f = x17Var.H0;
        float f2 = this.e;
        if (!yi4.b(f, f2)) {
            x17Var.H0 = f2;
            z = true;
        }
        float f3 = x17Var.I0;
        float f4 = this.f;
        if (yi4.b(f3, f4)) {
            z4 = z;
        } else {
            x17Var.I0 = f4;
        }
        if (z4) {
            x17Var.o1();
        }
    }
}
