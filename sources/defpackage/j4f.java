package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lj4f;", "Ls09;", "Lk4f;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final /* data */ class j4f extends s09 {
    public final e08 a;

    public j4f(e08 e08Var) {
        this.a = e08Var;
    }

    @Override // defpackage.s09
    public final i09 create() {
        k4f k4fVar = new k4f();
        k4fVar.Z = this.a;
        return k4fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j4f) && pa7.t(this.a, ((j4f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.a + ")";
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        ((k4f) i09Var).Z = this.a;
    }
}
