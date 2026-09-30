package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lro5;", "Ls09;", "Lvo5;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class ro5 extends s09 {
    public final t69 a;

    public ro5(t69 t69Var) {
        this.a = t69Var;
    }

    @Override // defpackage.s09
    public final i09 create() {
        return new vo5(this.a, (loe) null, 6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ro5) {
            return pa7.t(this.a, ((ro5) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        t69 t69Var = this.a;
        if (t69Var != null) {
            return t69Var.hashCode();
        }
        return 0;
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        ((vo5) i09Var).p1(this.a);
    }
}
