package defpackage;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class my7 extends k2 {
    public final tnb X;
    public final szc z;

    public my7(szc szcVar, tnb tnbVar, int i, bm3 bm3Var) {
        super(i, new px7(szcVar, tnbVar, false), bm3Var, ((mf7) szcVar.b).a, t99.e(tnbVar.a.getName()), dsf.INVARIANT, false);
        this.z = szcVar;
        this.X = tnbVar;
    }

    @Override // defpackage.p5
    public final List D0(List list) {
        my7 my7Var;
        y25 y25Var;
        tt7 tt7Var;
        tt7 tt7VarI;
        szc szcVar = this.z;
        y25 y25Var2 = ((mf7) szcVar.b).k;
        ArrayList arrayList = new ArrayList(t72.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tt7 tt7Var2 = (tt7) it.next();
            vic vicVar = vic.Z;
            tt7Var2.getClass();
            if (w8f.c(tt7Var2, vicVar, null)) {
                my7Var = this;
                y25Var = y25Var2;
                tt7Var = tt7Var2;
            } else {
                my7Var = this;
                y25Var = y25Var2;
                tt7Var = tt7Var2;
                tt7VarI = y25Var.i(new xs6((f00) my7Var, false, szcVar, y00.TYPE_PARAMETER_BOUNDS, false), tt7Var, pu4.a, null, false);
                if (tt7VarI == null) {
                }
                arrayList.add(tt7VarI);
                this = my7Var;
                y25Var2 = y25Var;
            }
            tt7VarI = tt7Var;
            arrayList.add(tt7VarI);
            this = my7Var;
            y25Var2 = y25Var;
        }
        return arrayList;
    }

    @Override // defpackage.p5
    public final List E0() {
        Type[] bounds = this.X.a.getBounds();
        bounds.getClass();
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new hnb(type));
        }
        hnb hnbVar = (hnb) s72.Z0(arrayList);
        Collection collection = arrayList;
        if (pa7.t(hnbVar != null ? hnbVar.a : null, Object.class)) {
            collection = pu4.a;
        }
        boolean zIsEmpty = collection.isEmpty();
        szc szcVar = this.z;
        if (zIsEmpty) {
            return t72.H(rxg.E(((mf7) szcVar.b).h.e.e(), ((mf7) szcVar.b).h.e.p()));
        }
        ArrayList arrayList2 = new ArrayList(t72.u(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ta0) szcVar.e).T((hnb) it.next(), vfh.Q(t8f.b, false, this, 3)));
        }
        return arrayList2;
    }
}
