package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lsy7;", "Ls09;", "Lty7;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final /* data */ class sy7 extends s09 {
    public final fxd a;
    public final fxd b;
    public final fxd c;

    public sy7(fxd fxdVar, fxd fxdVar2, fxd fxdVar3) {
        this.a = fxdVar;
        this.b = fxdVar2;
        this.c = fxdVar3;
    }

    @Override // defpackage.s09
    public final i09 create() {
        ty7 ty7Var = new ty7();
        ty7Var.Z = this.a;
        ty7Var.E0 = this.b;
        ty7Var.F0 = this.c;
        return ty7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sy7)) {
            return false;
        }
        sy7 sy7Var = (sy7) obj;
        return this.a.equals(sy7Var.a) && this.b.equals(sy7Var.b) && this.c.equals(sy7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.a + ", placementSpec=" + this.b + ", fadeOutSpec=" + this.c + ")";
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        ty7 ty7Var = (ty7) i09Var;
        ty7Var.Z = this.a;
        ty7Var.E0 = this.b;
        ty7Var.F0 = this.c;
    }
}
