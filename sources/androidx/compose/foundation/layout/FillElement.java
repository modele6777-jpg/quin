package androidx.compose.foundation.layout;

import defpackage.i09;
import defpackage.j94;
import defpackage.qe5;
import defpackage.s09;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/FillElement;", "Ls09;", "Lqe5;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final class FillElement extends s09 {
    public final j94 a;
    public final float b;

    public FillElement(j94 j94Var, float f) {
        this.a = j94Var;
        this.b = f;
    }

    @Override // defpackage.s09
    public final i09 create() {
        qe5 qe5Var = new qe5();
        qe5Var.Z = this.a;
        qe5Var.E0 = this.b;
        return qe5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.a == fillElement.a && this.b == fillElement.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        qe5 qe5Var = (qe5) i09Var;
        qe5Var.Z = this.a;
        qe5Var.E0 = this.b;
    }
}
