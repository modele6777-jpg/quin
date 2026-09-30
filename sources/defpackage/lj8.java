package defpackage;

import android.view.View;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llj8;", "Ls09;", "Loj8;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final class lj8 extends s09 {
    public final a26 a;
    public final a26 b;
    public final efa c;

    public lj8(a26 a26Var, a26 a26Var2, efa efaVar) {
        this.a = a26Var;
        this.b = a26Var2;
        this.c = efaVar;
    }

    @Override // defpackage.s09
    public final i09 create() {
        return new oj8(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ub3.d(ub3.a(Float.NaN, ub3.a(Float.NaN, ib8.b(ub3.d(ub3.a(Float.NaN, this.a.hashCode() * 961, 31), 31, true), 31, 9205357640488583168L), 31), 31), 31, true)) * 31);
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        oj8 oj8Var = (oj8) i09Var;
        float f = oj8Var.F0;
        long j = oj8Var.H0;
        float f2 = oj8Var.I0;
        boolean z = oj8Var.G0;
        float f3 = oj8Var.J0;
        boolean z2 = oj8Var.K0;
        efa efaVar = oj8Var.L0;
        View view = oj8Var.M0;
        sw3 sw3Var = oj8Var.N0;
        oj8Var.Z = this.a;
        oj8Var.F0 = Float.NaN;
        oj8Var.G0 = true;
        oj8Var.H0 = 9205357640488583168L;
        oj8Var.I0 = Float.NaN;
        oj8Var.J0 = Float.NaN;
        oj8Var.K0 = true;
        oj8Var.E0 = this.b;
        efa efaVar2 = this.c;
        oj8Var.L0 = efaVar2;
        View viewX0 = kj0.x0(oj8Var);
        sw3 sw3Var2 = vd0.s0(oj8Var).O0;
        if (oj8Var.O0 != null) {
            gxc gxcVar = pj8.a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(f)) && Float.NaN != f && !efaVar2.a()) || 9205357640488583168L != j || !yi4.b(Float.NaN, f2) || !yi4.b(Float.NaN, f3) || true != z || true != z2 || !efaVar2.equals(efaVar) || !viewX0.equals(view) || !pa7.t(sw3Var2, sw3Var)) {
                oj8Var.m1();
            }
        }
        oj8Var.n1();
    }
}
