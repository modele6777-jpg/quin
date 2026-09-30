package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lc32;", "Ls09;", "Lku2;", "Luwc;", "ui"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final class c32 extends s09 implements uwc {
    public final a26 a;

    public c32(a26 a26Var) {
        this.a = a26Var;
    }

    @Override // defpackage.uwc
    public final twc T0() {
        twc twcVar = new twc();
        twcVar.c = false;
        twcVar.d = true;
        this.a.d(twcVar);
        return twcVar;
    }

    @Override // defpackage.s09
    public final i09 create() {
        return new ku2(false, true, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c32) {
            return this.a == ((c32) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        ((ku2) i09Var).F0 = this.a;
    }
}
