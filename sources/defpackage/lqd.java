package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lqd implements fqd {
    public final uqd a;
    public final pl1 b;

    public lqd(uqd uqdVar, pl1 pl1Var) {
        this.a = uqdVar;
        this.b = pl1Var;
    }

    public final void a() {
        pl1 pl1Var = this.b;
        if (pl1Var.u() instanceof sg9) {
            pl1Var.g(tqd.a);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lqd.class == obj.getClass()) {
            lqd lqdVar = (lqd) obj;
            return pa7.t(this.a, lqdVar.a) && this.b == lqdVar.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
