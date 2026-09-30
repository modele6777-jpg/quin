package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lvwe;", "Ls09;", "Lzwe;", "material3"}, k = 1, mv = {2, 0, 0}, xi = z7c.f)
final /* data */ class vwe extends s09 {
    public final m77 a;
    public final boolean b;
    public final fxd c;

    public vwe(m77 m77Var, boolean z, fxd fxdVar) {
        this.a = m77Var;
        this.b = z;
        this.c = fxdVar;
    }

    @Override // defpackage.s09
    public final i09 create() {
        zwe zweVar = new zwe();
        zweVar.Z = this.a;
        zweVar.E0 = this.b;
        zweVar.F0 = this.c;
        zweVar.J0 = Float.NaN;
        zweVar.K0 = Float.NaN;
        return zweVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwe)) {
            return false;
        }
        vwe vweVar = (vwe) obj;
        return pa7.t(this.a, vweVar.a) && this.b == vweVar.b && this.c.equals(vweVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ub3.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.a + ", checked=" + this.b + ", animationSpec=" + this.c + ')';
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        zwe zweVar = (zwe) i09Var;
        zweVar.Z = this.a;
        boolean z = zweVar.E0;
        boolean z2 = this.b;
        if (z != z2) {
            rs0.F(zweVar);
        }
        zweVar.E0 = z2;
        zweVar.F0 = this.c;
        if (zweVar.I0 == null && !Float.isNaN(zweVar.K0)) {
            zweVar.I0 = qk2.d(zweVar.K0);
        }
        if (zweVar.H0 != null || Float.isNaN(zweVar.J0)) {
            return;
        }
        zweVar.H0 = qk2.d(zweVar.J0);
    }
}
