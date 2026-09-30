package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class k5 implements j7f {
    public final /* synthetic */ s04 a;

    public k5(s04 s04Var) {
        this.a = s04Var;
    }

    @Override // defpackage.j7f
    public final Collection e() {
        Collection collectionE = this.a.F0().c0().e();
        collectionE.getClass();
        return collectionE;
    }

    @Override // defpackage.j7f
    public final xr7 f() {
        return qz3.e(this.a);
    }

    @Override // defpackage.j7f
    public final List getParameters() {
        List list = this.a.F0;
        if (list != null) {
            return list;
        }
        pa7.g0("typeConstructorParameters");
        throw null;
    }

    @Override // defpackage.j7f
    public final y22 m() {
        return this.a;
    }

    @Override // defpackage.j7f
    public final boolean t() {
        return true;
    }

    public final String toString() {
        return "[typealias " + this.a.getName().b() + ']';
    }
}
