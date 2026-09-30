package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lfv7;", "Ls09;", "Lgv7;", "ui"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final /* data */ class fv7 extends s09 {
    public final Object a;

    public fv7(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.s09
    public final i09 create() {
        gv7 gv7Var = new gv7();
        gv7Var.Z = this.a;
        return gv7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fv7) && this.a.equals(((fv7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.a + ")";
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        ((gv7) i09Var).Z = this.a;
    }
}
