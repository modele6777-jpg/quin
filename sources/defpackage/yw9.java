package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lyw9;", "Ls09;", "Lzw9;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class yw9 extends s09 {
    public final xw9 a;

    public yw9(xw9 xw9Var) {
        this.a = xw9Var;
    }

    @Override // defpackage.s09
    public final i09 create() {
        zw9 zw9Var = new zw9();
        zw9Var.F0 = this.a;
        return zw9Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yw9) {
            return pa7.t(((yw9) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        zw9 zw9Var = (zw9) i09Var;
        xw9 xw9Var = zw9Var.F0;
        xw9 xw9Var2 = this.a;
        if (pa7.t(xw9Var2, xw9Var)) {
            return;
        }
        zw9Var.F0 = xw9Var2;
        zw9Var.m1();
    }
}
