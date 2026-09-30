package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ca7 implements j7f, k7f {
    public tt7 a;
    public final LinkedHashSet b;
    public final int c;

    public ca7(AbstractCollection abstractCollection) {
        abstractCollection.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(abstractCollection);
        this.b = linkedHashSet;
        this.c = linkedHashSet.hashCode();
    }

    public final tjd a() {
        e7f.b.getClass();
        return rxg.V(e7f.c, this, pu4.a, false, u3c.e("member scope for intersection type", this.b), new x(17, this));
    }

    public final String b(a26 a26Var) {
        a26Var.getClass();
        return s72.D0(s72.b1(this.b, new y85(4, a26Var)), " & ", "{", "}", new pb6(a26Var, 1), 24);
    }

    @Override // defpackage.j7f
    public final Collection e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca7)) {
            return false;
        }
        return this.b.equals(((ca7) obj).b);
    }

    @Override // defpackage.j7f
    public final xr7 f() {
        xr7 xr7VarF = ((tt7) this.b.iterator().next()).c0().f();
        xr7VarF.getClass();
        return xr7VarF;
    }

    @Override // defpackage.j7f
    public final List getParameters() {
        return pu4.a;
    }

    public final int hashCode() {
        return this.c;
    }

    @Override // defpackage.j7f
    public final y22 m() {
        return null;
    }

    @Override // defpackage.j7f
    public final boolean t() {
        return false;
    }

    public final String toString() {
        return b(z03.R0);
    }
}
