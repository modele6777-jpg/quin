package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class h77 implements j7f {
    public final Set a;
    public final ace b;

    public h77(Set set) {
        e7f.b.getClass();
        e7f e7fVar = e7f.c;
        e7fVar.getClass();
        rxg.U(sy4.a(ny4.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"), e7fVar, this, pu4.a, false);
        this.b = new ace(new tq0(19, this));
        this.a = set;
    }

    @Override // defpackage.j7f
    public final Collection e() {
        return (List) this.b.getValue();
    }

    @Override // defpackage.j7f
    public final xr7 f() {
        throw null;
    }

    @Override // defpackage.j7f
    public final List getParameters() {
        return pu4.a;
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
        return "IntegerLiteralType".concat("[" + s72.D0(this.a, ",", null, null, z03.Q0, 30) + ']');
    }
}
