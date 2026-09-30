package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkhc;", "Ls09;", "Lyhc;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class khc extends s09 {
    public final zhc a;
    public final ks9 b;
    public final boolean c;
    public final boolean d;
    public final t69 e;

    public khc(zhc zhcVar, ks9 ks9Var, boolean z, boolean z2, t69 t69Var) {
        this.a = zhcVar;
        this.b = ks9Var;
        this.c = z;
        this.d = z2;
        this.e = t69Var;
    }

    @Override // defpackage.s09
    public final i09 create() {
        return new yhc(null, null, this.e, this.b, null, this.a, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof khc)) {
            return false;
        }
        khc khcVar = (khc) obj;
        return pa7.t(this.a, khcVar.a) && this.b == khcVar.b && this.c == khcVar.c && this.d == khcVar.d && pa7.t(this.e, khcVar.e);
    }

    public final int hashCode() {
        int iD = ub3.d(ub3.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 961, 31, this.c), 961, this.d);
        t69 t69Var = this.e;
        return (iD + (t69Var != null ? t69Var.hashCode() : 0)) * 31;
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        ((yhc) i09Var).G1(null, null, this.e, this.b, null, this.a, this.c, this.d);
    }
}
