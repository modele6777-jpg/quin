package androidx.compose.foundation;

import defpackage.i09;
import defpackage.n92;
import defpackage.pa7;
import defpackage.s09;
import defpackage.scc;
import defpackage.t69;
import defpackage.ub3;
import defpackage.x16;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/CombinedClickableElement;", "Ls09;", "Ln92;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class CombinedClickableElement extends s09 {
    public final t69 a;
    public final boolean b;
    public final x16 c;
    public final x16 d;

    public CombinedClickableElement(x16 x16Var, x16 x16Var2, t69 t69Var, boolean z) {
        this.a = t69Var;
        this.b = z;
        this.c = x16Var;
        this.d = x16Var2;
    }

    @Override // defpackage.s09
    public final i09 create() {
        return new n92(this.c, this.d, this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedClickableElement.class != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return pa7.t(this.a, combinedClickableElement.a) && this.b == combinedClickableElement.b && this.c == combinedClickableElement.c && this.d == combinedClickableElement.d;
    }

    public final int hashCode() {
        t69 t69Var = this.a;
        int iHashCode = (this.c.hashCode() + ub3.d(ub3.d((t69Var != null ? t69Var.hashCode() : 0) * 961, 31, this.b), 29791, true)) * 961;
        x16 x16Var = this.d;
        return Boolean.hashCode(true) + ((iHashCode + (x16Var != null ? x16Var.hashCode() : 0)) * 961);
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        boolean z;
        n92 n92Var = (n92) i09Var;
        n92Var.a1 = true;
        boolean z2 = n92Var.Z0 == null;
        x16 x16Var = this.d;
        if (z2 != (x16Var == null)) {
            n92Var.q1();
            scc.k(n92Var);
            z = true;
        } else {
            z = false;
        }
        n92Var.Z0 = x16Var;
        boolean z3 = !n92Var.K0 ? true : z;
        n92Var.B1(this.a, null, this.b, true, null, null, this.c);
        if (z3) {
            n92Var.C1(false);
            n92Var.C1(true);
        }
    }
}
