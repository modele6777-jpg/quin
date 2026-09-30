package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lqs0;", "Ls09;", "Lss0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class qs0 extends s09 {
    public final long a;
    public final b41 b;
    public final x4d c;

    public qs0(long j, b41 b41Var, x4d x4dVar, int i) {
        j = (i & 1) != 0 ? y72.k : j;
        b41Var = (i & 2) != 0 ? null : b41Var;
        this.a = j;
        this.b = b41Var;
        this.c = x4dVar;
    }

    @Override // defpackage.s09
    public final i09 create() {
        ss0 ss0Var = new ss0();
        ss0Var.Z = this.a;
        ss0Var.E0 = this.b;
        ss0Var.F0 = 1.0f;
        ss0Var.G0 = this.c;
        ss0Var.H0 = 9205357640488583168L;
        return ss0Var;
    }

    public final boolean equals(Object obj) {
        qs0 qs0Var = obj instanceof qs0 ? (qs0) obj : null;
        if (qs0Var == null) {
            return false;
        }
        long j = qs0Var.a;
        int i = y72.l;
        return faf.a(this.a, j) && pa7.t(this.b, qs0Var.b) && pa7.t(this.c, qs0Var.c);
    }

    public final int hashCode() {
        int i = y72.l;
        int iHashCode = Long.hashCode(this.a) * 31;
        b41 b41Var = this.b;
        return this.c.hashCode() + ub3.a(1.0f, (iHashCode + (b41Var != null ? b41Var.hashCode() : 0)) * 31, 31);
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        ss0 ss0Var = (ss0) i09Var;
        ss0Var.Z = this.a;
        ss0Var.E0 = this.b;
        ss0Var.F0 = 1.0f;
        x4d x4dVar = ss0Var.G0;
        x4d x4dVar2 = this.c;
        if (!pa7.t(x4dVar, x4dVar2)) {
            ss0Var.G0 = x4dVar2;
            scc.k(ss0Var);
        }
        qn4.G(ss0Var);
    }
}
