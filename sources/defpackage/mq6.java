package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lmq6;", "Ls09;", "Lnq6;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final class mq6 extends s09 {
    public final jx0 a;

    public mq6(jx0 jx0Var) {
        this.a = jx0Var;
    }

    @Override // defpackage.s09
    public final i09 create() {
        nq6 nq6Var = new nq6();
        nq6Var.Z = this.a;
        return nq6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        mq6 mq6Var = obj instanceof mq6 ? (mq6) obj : null;
        if (mq6Var == null) {
            return false;
        }
        return this.a.equals(mq6Var.a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a.a);
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        ((nq6) i09Var).Z = this.a;
    }
}
