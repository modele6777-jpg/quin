package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lka7;", "Ls09;", "Lma7;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class ka7 extends s09 {
    @Override // defpackage.s09
    public final i09 create() {
        ma7 ma7Var = new ma7(0);
        ma7Var.E0 = ia7.b;
        ma7Var.F0 = true;
        return ma7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ka7 ? (ka7) obj : null) != null;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (ia7.b.hashCode() * 31);
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        ma7 ma7Var = (ma7) i09Var;
        ma7Var.E0 = ia7.b;
        ma7Var.F0 = true;
    }
}
