package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lub0;", "Ls09;", "Lku2;", "Luwc;", "ui"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final class ub0 extends s09 implements uwc {
    public final boolean a;
    public final a26 b;

    public ub0(a26 a26Var, boolean z) {
        this.a = z;
        this.b = a26Var;
    }

    @Override // defpackage.uwc
    public final twc T0() {
        twc twcVar = new twc();
        twcVar.c = this.a;
        this.b.d(twcVar);
        return twcVar;
    }

    @Override // defpackage.s09
    public final i09 create() {
        return new ku2(this.a, false, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ub0)) {
            return false;
        }
        ub0 ub0Var = (ub0) obj;
        return this.a == ub0Var.a && this.b == ub0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        ku2 ku2Var = (ku2) i09Var;
        ku2Var.Z = this.a;
        ku2Var.F0 = this.b;
    }
}
