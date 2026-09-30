package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ey7 extends ly7 {
    public final pnb n;
    public final yx7 o;
    public final de8 p;
    public final mz0 q;

    public ey7(szc szcVar, pnb pnbVar, yx7 yx7Var) {
        super(szcVar, null);
        this.n = pnbVar;
        this.o = yx7Var;
        ge8 ge8Var = ((mf7) szcVar.b).a;
        this.p = new de8(ge8Var, new wj7(10, szcVar, this));
        this.q = ge8Var.c(new d5(23, this, szcVar));
    }

    @Override // defpackage.iy7, defpackage.er8, defpackage.dr8
    public final Collection a(ez3 ez3Var, a26 a26Var) {
        ez3Var.getClass();
        if (!ez3Var.a(ez3.l | ez3.e)) {
            return pu4.a;
        }
        Iterable iterable = (Iterable) this.d.invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            bm3 bm3Var = (bm3) obj;
            if (bm3Var instanceof u09) {
                t99 name = ((u09) bm3Var).getName();
                name.getClass();
                if (((Boolean) a26Var.d(name)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.er8, defpackage.dr8
    public final y22 e(t99 t99Var, lf9 lf9Var) {
        t99Var.getClass();
        lf9Var.getClass();
        return v(t99Var, null);
    }

    @Override // defpackage.iy7, defpackage.er8, defpackage.dr8
    public final Collection f(t99 t99Var, lf9 lf9Var) {
        t99Var.getClass();
        return pu4.a;
    }

    @Override // defpackage.iy7
    public final Set h(ez3 ez3Var, a26 a26Var) {
        ez3Var.getClass();
        if (!ez3Var.a(ez3.e)) {
            return xu4.a;
        }
        Set set = (Set) this.p.invoke();
        if (set == null) {
            this.n.getClass();
            return new LinkedHashSet();
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(t99.e((String) it.next()));
        }
        return hashSet;
    }

    @Override // defpackage.iy7
    public final Set i(ez3 ez3Var, a26 a26Var) {
        ez3Var.getClass();
        return xu4.a;
    }

    @Override // defpackage.iy7
    public final im3 k() {
        return hm3.a;
    }

    @Override // defpackage.iy7
    public final Set o(ez3 ez3Var) {
        ez3Var.getClass();
        return xu4.a;
    }

    @Override // defpackage.iy7
    public final bm3 q() {
        return this.o;
    }

    public final u09 v(t99 t99Var, enb enbVar) {
        t99 t99Var2 = sud.a;
        t99Var.getClass();
        String strB = t99Var.b();
        strB.getClass();
        if (strB.length() <= 0 || t99Var.b) {
            return null;
        }
        Set set = (Set) this.p.invoke();
        if (enbVar == null && set != null && !set.contains(t99Var.b())) {
            return null;
        }
        return (u09) this.q.d(new ay7(t99Var, enbVar));
    }

    @Override // defpackage.iy7
    public final void m(LinkedHashSet linkedHashSet, t99 t99Var) {
    }
}
