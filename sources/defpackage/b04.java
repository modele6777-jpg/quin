package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class b04 extends o04 {
    public final zt7 g;
    public final ee8 h;
    public final ee8 i;
    public final /* synthetic */ d04 j;

    public b04(d04 d04Var, zt7 zt7Var) {
        this.j = d04Var;
        lp0 lp0Var = d04Var.z;
        nya nyaVar = d04Var.e;
        List listR0 = nyaVar.r0();
        listR0.getClass();
        List listW0 = nyaVar.w0();
        listW0.getClass();
        List listA0 = nyaVar.A0();
        listA0.getClass();
        List listV0 = nyaVar.v0();
        listV0.getClass();
        u99 u99Var = (u99) d04Var.z.c;
        ArrayList arrayList = new ArrayList(t72.u(listV0, 10));
        Iterator it = listV0.iterator();
        while (it.hasNext()) {
            arrayList.add(i7h.v(u99Var, ((Number) it.next()).intValue()));
        }
        super(lp0Var, listR0, listW0, listA0, new yz3(0, arrayList));
        tz3 tz3Var = (tz3) lp0Var.b;
        this.g = zt7Var;
        ge8 ge8Var = tz3Var.a;
        zz3 zz3Var = new zz3(this, 0);
        ge8Var.getClass();
        this.h = new ee8(ge8Var, zz3Var);
        ge8 ge8Var2 = tz3Var.a;
        zz3 zz3Var2 = new zz3(this, 1);
        ge8Var2.getClass();
        this.i = new ee8(ge8Var2, zz3Var2);
    }

    @Override // defpackage.er8, defpackage.dr8
    public final Collection a(ez3 ez3Var, a26 a26Var) {
        ez3Var.getClass();
        return (Collection) this.h.invoke();
    }

    @Override // defpackage.o04, defpackage.er8, defpackage.dr8
    public final Collection b(t99 t99Var, lf9 lf9Var) {
        t99Var.getClass();
        s(t99Var, lf9Var);
        return super.b(t99Var, lf9Var);
    }

    @Override // defpackage.o04, defpackage.er8, defpackage.dr8
    public final y22 e(t99 t99Var, lf9 lf9Var) {
        u09 u09Var;
        t99Var.getClass();
        lf9Var.getClass();
        s(t99Var, lf9Var);
        szc szcVar = this.j.E0;
        return (szcVar == null || (u09Var = (u09) ((mz0) szcVar.c).d(t99Var)) == null) ? super.e(t99Var, lf9Var) : u09Var;
    }

    @Override // defpackage.o04, defpackage.er8, defpackage.dr8
    public final Collection f(t99 t99Var, lf9 lf9Var) {
        t99Var.getClass();
        s(t99Var, lf9Var);
        return super.f(t99Var, lf9Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v3, types: [pu4] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    @Override // defpackage.o04
    public final void h(ArrayList arrayList, a26 a26Var) {
        ?? arrayList2;
        szc szcVar = this.j.E0;
        if (szcVar != null) {
            Set<t99> setKeySet = ((LinkedHashMap) szcVar.b).keySet();
            arrayList2 = new ArrayList();
            for (t99 t99Var : setKeySet) {
                t99Var.getClass();
                u09 u09Var = (u09) ((mz0) szcVar.c).d(t99Var);
                if (u09Var != null) {
                    arrayList2.add(u09Var);
                }
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = pu4.a;
        }
        arrayList.addAll(arrayList2);
    }

    @Override // defpackage.o04
    public final void j(t99 t99Var, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.i.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((tt7) it.next()).F().b(t99Var, lf9.c));
        }
        lp0 lp0Var = this.b;
        arrayList.addAll(((tz3) lp0Var.b).n.g(t99Var, this.j));
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((cf9) ((tz3) lp0Var.b).q).d.h(t99Var, arrayList2, arrayList3, this.j, new a04(arrayList, 0));
    }

    @Override // defpackage.o04
    public final void k(t99 t99Var, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.i.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((tt7) it.next()).F().f(t99Var, lf9.c));
        }
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((cf9) ((tz3) this.b.b).q).d.h(t99Var, arrayList2, arrayList3, this.j, new a04(arrayList, 0));
    }

    @Override // defpackage.o04
    public final j22 l(t99 t99Var) {
        t99Var.getClass();
        return this.j.v.d(t99Var);
    }

    @Override // defpackage.o04
    public final Set n() {
        List listE = this.j.Y.e();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            Set setD = ((tt7) it.next()).F().d();
            if (setD == null) {
                return null;
            }
            x72.g0(linkedHashSet, setD);
        }
        return linkedHashSet;
    }

    @Override // defpackage.o04
    public final Set o() {
        d04 d04Var = this.j;
        List listE = d04Var.Y.e();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            x72.g0(linkedHashSet, ((tt7) it.next()).F().c());
        }
        linkedHashSet.addAll(((tz3) this.b.b).n.d(d04Var));
        return linkedHashSet;
    }

    @Override // defpackage.o04
    public final Set p() {
        List listE = this.j.Y.e();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            x72.g0(linkedHashSet, ((tt7) it.next()).F().g());
        }
        return linkedHashSet;
    }

    @Override // defpackage.o04
    public final boolean r(r04 r04Var) {
        return ((tz3) this.b.b).o.k(this.j, r04Var);
    }

    public final void s(t99 t99Var, lf9 lf9Var) {
        t99Var.getClass();
        lf9Var.getClass();
        ((tz3) this.b.b).i.getClass();
        this.j.getClass();
    }
}
