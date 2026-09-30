package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class e31 implements c31 {
    public final sw3 a;
    public final long b;

    public e31(r6e r6eVar, long j) {
        this.a = r6eVar;
        this.b = j;
    }

    @Override // defpackage.c31
    public final j09 a(j09 j09Var, yi yiVar) {
        return j09Var.D(new q21(yiVar, false));
    }

    @Override // defpackage.c31
    public final j09 b(j09 j09Var) {
        return new q21(ndb.f, true);
    }

    public final float c() {
        long j = this.b;
        if (!kl2.c(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.a.Z(kl2.g(j));
    }

    public final float d() {
        long j = this.b;
        if (!kl2.d(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.a.Z(kl2.h(j));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e31)) {
            return false;
        }
        e31 e31Var = (e31) obj;
        return pa7.t(this.a, e31Var.a) && kl2.b(this.b, e31Var.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.a + ", constraints=" + kl2.l(this.b) + ")";
    }
}
