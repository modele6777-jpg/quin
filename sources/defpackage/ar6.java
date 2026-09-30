package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lar6;", "Ls09;", "Lfr6;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class ar6 extends s09 {
    public final t69 a;

    public ar6(t69 t69Var) {
        this.a = t69Var;
    }

    @Override // defpackage.s09
    public final i09 create() {
        fr6 fr6Var = new fr6();
        fr6Var.Z = this.a;
        return fr6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ar6) && pa7.t(((ar6) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        fr6 fr6Var = (fr6) i09Var;
        t69 t69Var = fr6Var.Z;
        t69 t69Var2 = this.a;
        if (pa7.t(t69Var, t69Var2)) {
            return;
        }
        fr6Var.n1();
        fr6Var.Z = t69Var2;
    }
}
