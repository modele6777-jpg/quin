package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class w6e extends er8 {
    public final w09 b;
    public final dx5 c;

    public w6e(w09 w09Var, dx5 dx5Var) {
        w09Var.getClass();
        dx5Var.getClass();
        this.b = w09Var;
        this.c = dx5Var;
    }

    @Override // defpackage.er8, defpackage.dr8
    public final Collection a(ez3 ez3Var, a26 a26Var) {
        ez3Var.getClass();
        if (ez3Var.a(ez3.h)) {
            dx5 dx5Var = this.c;
            if (!dx5Var.a.c() || !ez3Var.a.contains(bz3.a)) {
                w09 w09Var = this.b;
                Collection collectionM = w09Var.m(dx5Var, a26Var);
                ArrayList arrayList = new ArrayList(collectionM.size());
                Iterator it = collectionM.iterator();
                while (it.hasNext()) {
                    t99 t99VarG = ((dx5) it.next()).a.g();
                    if (((Boolean) a26Var.d(t99VarG)).booleanValue()) {
                        n18 n18Var = null;
                        if (!t99VarG.b) {
                            n18 n18VarW = w09Var.W(dx5Var.a(t99VarG));
                            if (!((Boolean) gdc.f(n18VarW.g, n18.w[1])).booleanValue()) {
                                n18Var = n18VarW;
                            }
                        }
                        if (n18Var != null) {
                            arrayList.add(n18Var);
                        }
                    }
                }
                return arrayList;
            }
        }
        return pu4.a;
    }

    @Override // defpackage.er8, defpackage.dr8
    public final Set d() {
        return xu4.a;
    }

    public final String toString() {
        return "subpackages of " + this.c + " from " + this.b;
    }
}
