package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class mw9 implements nw9 {
    public final ArrayList a;

    public mw9(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.nw9
    public final boolean a(dx5 dx5Var) {
        dx5Var.getClass();
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (pa7.t(((lw9) ((kw9) it.next())).f, dx5Var)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.nw9
    public final void b(dx5 dx5Var, ArrayList arrayList) {
        dx5Var.getClass();
        for (Object obj : this.a) {
            if (pa7.t(((lw9) ((kw9) obj)).f, dx5Var)) {
                arrayList.add(obj);
            }
        }
    }

    @Override // defpackage.nw9
    public final Collection m(dx5 dx5Var, a26 a26Var) {
        dx5Var.getClass();
        return fyc.A(new ve5(fyc.x(new td0(1, this.a), tj7.P0), true, new yf2(dx5Var, 1)));
    }
}
