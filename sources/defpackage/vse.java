package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lvse;", "Ls09;", "Lwse;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final class vse extends s09 {
    public final ute a;
    public final z2f b;
    public final mue c;
    public final boolean d;
    public final l26 e;
    public final wo7 f;

    public vse(ute uteVar, z2f z2fVar, mue mueVar, boolean z, l26 l26Var, wo7 wo7Var) {
        this.a = uteVar;
        this.b = z2fVar;
        this.c = mueVar;
        this.d = z;
        this.e = l26Var;
        this.f = wo7Var;
    }

    @Override // defpackage.s09
    public final i09 create() {
        return new wse(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vse)) {
            return false;
        }
        vse vseVar = (vse) obj;
        return this.d == vseVar.d && pa7.t(this.a, vseVar.a) && pa7.t(this.b, vseVar.b) && pa7.t(this.c, vseVar.c) && this.e == vseVar.e && this.f.equals(vseVar.f);
    }

    public final int hashCode() {
        int iB = tec.b(this.c, (this.b.hashCode() + ((this.a.hashCode() + (Boolean.hashCode(this.d) * 31)) * 31)) * 31, 31);
        l26 l26Var = this.e;
        return this.f.hashCode() + ((iB + (l26Var != null ? l26Var.hashCode() : 0)) * 31);
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        wse wseVar = (wse) i09Var;
        ute uteVar = wseVar.F0;
        ute uteVar2 = this.a;
        wseVar.F0 = uteVar2;
        uteVar2.b = this.e;
        boolean z = this.d;
        wseVar.G0 = z;
        uteVar2.a.a.setValue(new upe(this.b, this.c, z, !z, this.f.c == 4));
        if (pa7.t(uteVar, uteVar2)) {
            return;
        }
        wseVar.H0.l1(uteVar2.h);
    }
}
