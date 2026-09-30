package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zx7 implements nw9 {
    public final szc a;
    public final be8 b;

    public zx7(mf7 mf7Var) {
        this.a = new szc(mf7Var, qfc.v, new b37(null));
        this.b = new be8(mf7Var.a, new ConcurrentHashMap(3, 1.0f, 2), new qqf(6), 0);
    }

    @Override // defpackage.nw9
    public final boolean a(dx5 dx5Var) {
        dx5Var.getClass();
        return false;
    }

    @Override // defpackage.nw9
    public final void b(dx5 dx5Var, ArrayList arrayList) {
        dx5Var.getClass();
        arrayList.add(c(dx5Var));
    }

    public final yx7 c(dx5 dx5Var) {
        dx5Var.getClass();
        Object objD = this.b.d(new ce8(dx5Var, new n5(this, new pnb(dx5Var), false, 20)));
        if (objD != null) {
            return (yx7) objD;
        }
        be8.a(3);
        throw null;
    }

    @Override // defpackage.nw9
    public final Collection m(dx5 dx5Var, a26 a26Var) {
        dx5Var.getClass();
        List list = (List) c(dx5Var).z.invoke();
        return list == null ? pu4.a : list;
    }

    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + ((mf7) this.a.b).h;
    }
}
