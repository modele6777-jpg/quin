package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r66 implements x4d {
    public final n26 a;

    public r66(n26 n26Var) {
        this.a = n26Var;
    }

    @Override // defpackage.x4d
    public final vs9 a(long j, cv7 cv7Var, sw3 sw3Var) {
        zt ztVarA = cu.a();
        this.a.m(ztVarA, new ald(j), cv7Var);
        ztVarA.e();
        return new ss9(ztVarA);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        r66 r66Var = obj instanceof r66 ? (r66) obj : null;
        return (r66Var != null ? r66Var.a : null) == this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
