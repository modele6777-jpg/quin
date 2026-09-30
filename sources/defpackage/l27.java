package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l27 implements vz {
    public final br4 a;
    public final lrb b;
    public final long c;

    public l27(br4 br4Var, lrb lrbVar, long j) {
        this.a = br4Var;
        this.b = lrbVar;
        this.c = j;
        if (br4Var instanceof x6f) {
            x6f x6fVar = (x6f) br4Var;
            if (x6fVar.a != 0 || x6fVar.b != 0) {
                return;
            }
        } else if (br4Var instanceof grd) {
            if (((grd) br4Var).a != 0) {
                return;
            }
        } else if (!(br4Var instanceof hp7) || ((hp7) br4Var).a.a != 0) {
            return;
        }
        qc0.j("Animation to be infinitely repeated cannot have a 0-duration");
        throw null;
    }

    @Override // defpackage.vz
    public final psf a(y6f y6fVar) {
        rsf rsfVarA = this.a.a(y6fVar);
        y21 y21Var = new y21();
        y21Var.c = rsfVarA;
        y21Var.d = this.b;
        y21Var.a = ((long) (rsfVarA.s() + rsfVarA.p())) * 1000000;
        y21Var.b = this.c * 1000000;
        return y21Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l27)) {
            return false;
        }
        l27 l27Var = (l27) obj;
        return l27Var.a.equals(this.a) && l27Var.b == this.b && l27Var.c == this.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
