package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lu5e;", "Ls09;", "Lz5e;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final /* data */ class u5e extends s09 {
    public final l89 a;
    public final p5e b;

    public u5e(l89 l89Var, p5e p5eVar) {
        this.a = l89Var;
        this.b = p5eVar;
    }

    @Override // defpackage.s09
    public final i09 create() {
        return new z5e(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5e)) {
            return false;
        }
        u5e u5eVar = (u5e) obj;
        return pa7.t(u5eVar.b, this.b) && pa7.t(u5eVar.a, this.a);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "StyleElement(styleState=" + this.a + ", style=" + this.b + ")";
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        z5e z5eVar = (z5e) i09Var;
        z5eVar.G0 = this.b;
        z5eVar.r1(false);
        l89 l89Var = this.a;
        if (l89Var == null) {
            l89Var = new l89(null);
        }
        if (pa7.t(z5eVar.N0, l89Var)) {
            return;
        }
        z5eVar.N0 = l89Var;
        z5eVar.r1(false);
        w5e w5eVar = z5eVar.F0;
        if (w5eVar != null) {
            rs0.E(w5eVar);
        } else {
            qc0.p("StyleOuterNode with no corresponding StyleInnerNode");
        }
    }
}
