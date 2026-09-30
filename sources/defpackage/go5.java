package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lgo5;", "Ls09;", "Lio5;", "ui"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final /* data */ class go5 extends s09 {
    public final fo5 a;

    public go5(fo5 fo5Var) {
        this.a = fo5Var;
    }

    @Override // defpackage.s09
    public final i09 create() {
        io5 io5Var = new io5();
        io5Var.Z = this.a;
        return io5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof go5) && pa7.t(this.a, ((go5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.a + ")";
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        io5 io5Var = (io5) i09Var;
        io5Var.Z.a.j(io5Var);
        fo5 fo5Var = this.a;
        io5Var.Z = fo5Var;
        fo5Var.a.b(io5Var);
    }
}
