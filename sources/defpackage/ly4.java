package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ly4 implements zw6 {
    public final bv6 a;
    public final sw6 b;
    public final Throwable c;

    public ly4(bv6 bv6Var, sw6 sw6Var, Throwable th) {
        this.a = bv6Var;
        this.b = sw6Var;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ly4)) {
            return false;
        }
        ly4 ly4Var = (ly4) obj;
        return pa7.t(this.a, ly4Var.a) && pa7.t(this.b, ly4Var.b) && this.c.equals(ly4Var.c);
    }

    @Override // defpackage.zw6
    public final sw6 h() {
        return this.b;
    }

    public final int hashCode() {
        bv6 bv6Var = this.a;
        int iHashCode = bv6Var == null ? 0 : bv6Var.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }

    @Override // defpackage.zw6
    public final bv6 r() {
        return this.a;
    }

    public final String toString() {
        return "ErrorResult(image=" + this.a + ", request=" + this.b + ", throwable=" + this.c + ")";
    }
}
