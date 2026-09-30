package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lnu9;", "Ls09;", "Lou9;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class nu9 extends s09 {
    public final lu9 a;

    public nu9(lu9 lu9Var) {
        this.a = lu9Var;
    }

    @Override // defpackage.s09
    public final i09 create() {
        lu9 lu9Var = this.a;
        rv3 rv3VarC = lu9Var != null ? lu9Var.c() : null;
        ou9 ou9Var = new ou9();
        ou9Var.F0 = rv3VarC;
        return ou9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nu9) {
            return pa7.t(this.a, ((nu9) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        lu9 lu9Var = this.a;
        if (lu9Var != null) {
            return lu9Var.hashCode();
        }
        return 0;
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        ou9 ou9Var = (ou9) i09Var;
        rv3 rv3Var = null;
        lu9 lu9Var = this.a;
        rv3 rv3VarC = lu9Var != null ? lu9Var.c() : null;
        rv3 rv3Var2 = ou9Var.F0;
        if (rv3Var2 != null) {
            ou9Var.m1(rv3Var2);
        }
        ou9Var.F0 = rv3VarC;
        if (rv3VarC != null && !((i09) rv3VarC).a.Y) {
            ou9Var.l1(rv3VarC);
            rv3Var = rv3VarC;
        }
        ou9Var.F0 = rv3Var;
    }
}
