package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ljne;", "Ls09;", "Llne;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class jne extends s09 {
    public final tze a;
    public final a26 b;
    public final a26 c;
    public final a26 d;

    public jne(tze tzeVar, a26 a26Var, a26 a26Var2, a26 a26Var3) {
        this.a = tzeVar;
        this.b = a26Var;
        this.c = a26Var2;
        this.d = a26Var3;
    }

    @Override // defpackage.s09
    public final i09 create() {
        return new lne(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jne)) {
            return false;
        }
        jne jneVar = (jne) obj;
        return this.a == jneVar.a && this.b == jneVar.b && this.c == jneVar.c && this.d == jneVar.d;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        a26 a26Var = this.c;
        return this.d.hashCode() + ((iHashCode + (a26Var != null ? a26Var.hashCode() : 0)) * 31);
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        lne lneVar = (lne) i09Var;
        lneVar.F0.a = null;
        tze tzeVar = this.a;
        lneVar.F0 = tzeVar;
        tzeVar.a = lneVar;
        tzeVar.b = lneVar.Y ? sze.c : sze.b;
        lneVar.G0 = this.b;
        lneVar.H0 = this.c;
        lneVar.I0 = this.d;
    }
}
