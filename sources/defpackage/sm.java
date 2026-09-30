package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Lsm;", "T", "Ls09;", "Lrn;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class sm<T> extends s09 {
    public final mo a;
    public final lu9 b;

    public sm(mo moVar, lu9 lu9Var) {
        this.a = moVar;
        this.b = lu9Var;
    }

    @Override // defpackage.s09
    public final i09 create() {
        rn rnVar = new rn(jn.a, true, null, ks9.b);
        rnVar.Y0 = this.a;
        rnVar.Z0 = this.b;
        return rnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sm)) {
            return false;
        }
        sm smVar = (sm) obj;
        return pa7.t(this.a, smVar.a) && this.b.equals(smVar.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() + ub3.d((ks9.b.hashCode() + (this.a.hashCode() * 31)) * 31, 923521, true)) * 31;
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        boolean z;
        boolean z2;
        rn rnVar = (rn) i09Var;
        rnVar.getClass();
        mo moVar = rnVar.Y0;
        mo moVar2 = this.a;
        if (pa7.t(moVar, moVar2)) {
            z = false;
        } else {
            rnVar.Y0 = moVar2;
            rnVar.J1();
            z = true;
        }
        ks9 ks9Var = rnVar.F0;
        ks9 ks9Var2 = ks9.b;
        if (ks9Var != ks9Var2) {
            rnVar.F0 = ks9Var2;
            z2 = true;
        } else {
            z2 = z;
        }
        rnVar.Z0 = this.b;
        rnVar.F1(rnVar.G0, true, null, ks9Var2, z2);
    }
}
