package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lcg implements lu9 {
    public final lu9 a;
    public final rv3 b = new uf9(2);

    public lcg(lu9 lu9Var) {
        this.a = lu9Var;
    }

    @Override // defpackage.lu9
    public final Object a(long j, l26 l26Var, xn2 xn2Var) {
        Object objA = this.a.a(j, l26Var, xn2Var);
        return objA == bw2.a ? objA : wef.a;
    }

    @Override // defpackage.lu9
    public final long b(long j, int i, a26 a26Var) {
        return this.a.b(j, i, a26Var);
    }

    @Override // defpackage.lu9
    public final rv3 c() {
        return this.b;
    }

    @Override // defpackage.lu9
    public final boolean d() {
        return this.a.d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lcg) && this.a.equals(((lcg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + ub3.d(Boolean.hashCode(false) * 31, 31, true);
    }
}
