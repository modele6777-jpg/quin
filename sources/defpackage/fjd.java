package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lfjd;", "Ls09;", "Lgjd;", "ui"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final /* data */ class fjd extends s09 {
    public final x4d a;
    public final n4d b;

    public fjd(x4d x4dVar, n4d n4dVar) {
        this.a = x4dVar;
        this.b = n4dVar;
    }

    @Override // defpackage.s09
    public final i09 create() {
        gjd gjdVar = new gjd();
        gjdVar.Z = this.a;
        gjdVar.E0 = this.b;
        return gjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fjd)) {
            return false;
        }
        fjd fjdVar = (fjd) obj;
        return pa7.t(this.a, fjdVar.a) && this.b.equals(fjdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SimpleDropShadowElement(shape=" + this.a + ", shadow=" + this.b + ")";
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        gjd gjdVar = (gjd) i09Var;
        x4d x4dVar = gjdVar.Z;
        x4d x4dVar2 = this.a;
        boolean zT = pa7.t(x4dVar, x4dVar2);
        n4d n4dVar = this.b;
        if (!zT || !pa7.t(gjdVar.E0, n4dVar)) {
            gjdVar.F0 = null;
        }
        gjdVar.Z = x4dVar2;
        gjdVar.E0 = n4dVar;
    }
}
