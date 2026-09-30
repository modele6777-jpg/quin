package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class o04 extends er8 {
    public static final /* synthetic */ wn7[] f = {new aya(o04.class, "classNames", "getClassNames$org_jetbrains_kotlin_deserialization()Ljava/util/Set;", 0), new aya(o04.class, "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;", 0)};
    public final lp0 b;
    public final n04 c;
    public final ee8 d;
    public final de8 e;

    public o04(lp0 lp0Var, List list, List list2, List list3, x16 x16Var) {
        lp0Var.getClass();
        this.b = lp0Var;
        tz3 tz3Var = (tz3) lp0Var.b;
        tz3Var.c.getClass();
        this.c = new n04(this, list, list2, list3);
        ge8 ge8Var = tz3Var.a;
        j04 j04Var = new j04(0, x16Var);
        ge8Var.getClass();
        this.d = new ee8(ge8Var, j04Var);
        j5 j5Var = new j5(17, this);
        ge8Var.getClass();
        this.e = new de8(ge8Var, j5Var);
    }

    @Override // defpackage.er8, defpackage.dr8
    public Collection b(t99 t99Var, lf9 lf9Var) {
        t99Var.getClass();
        n04 n04Var = this.c;
        n04Var.getClass();
        return !((Set) gdc.f(n04Var.g, n04.j[0])).contains(t99Var) ? pu4.a : (Collection) n04Var.d.d(t99Var);
    }

    @Override // defpackage.er8, defpackage.dr8
    public final Set c() {
        return (Set) gdc.f(this.c.g, n04.j[0]);
    }

    @Override // defpackage.er8, defpackage.dr8
    public final Set d() {
        wn7 wn7Var = f[1];
        de8 de8Var = this.e;
        de8Var.getClass();
        wn7Var.getClass();
        return (Set) de8Var.invoke();
    }

    @Override // defpackage.er8, defpackage.dr8
    public y22 e(t99 t99Var, lf9 lf9Var) {
        t99Var.getClass();
        lf9Var.getClass();
        if (q(t99Var)) {
            tz3 tz3Var = (tz3) this.b.b;
            j22 j22VarL = l(t99Var);
            h22 h22Var = tz3Var.t;
            Set set = h22.c;
            return h22Var.a(j22VarL, null);
        }
        n04 n04Var = this.c;
        if (!n04Var.c.keySet().contains(t99Var)) {
            return null;
        }
        n04Var.getClass();
        return (s04) n04Var.f.d(t99Var);
    }

    @Override // defpackage.er8, defpackage.dr8
    public Collection f(t99 t99Var, lf9 lf9Var) {
        t99Var.getClass();
        n04 n04Var = this.c;
        n04Var.getClass();
        return !((Set) gdc.f(n04Var.h, n04.j[1])).contains(t99Var) ? pu4.a : (Collection) n04Var.e.d(t99Var);
    }

    @Override // defpackage.er8, defpackage.dr8
    public final Set g() {
        return (Set) gdc.f(this.c.h, n04.j[1]);
    }

    public abstract void h(ArrayList arrayList, a26 a26Var);

    public final List i(ez3 ez3Var, a26 a26Var) {
        ez3Var.getClass();
        ArrayList arrayList = new ArrayList(0);
        if (ez3Var.a(ez3.f)) {
            h(arrayList, a26Var);
        }
        n04 n04Var = this.c;
        n04Var.getClass();
        ee8 ee8Var = n04Var.g;
        ee8 ee8Var2 = n04Var.h;
        ww2 ww2Var = ww2.e;
        boolean zA = ez3Var.a(ez3.j);
        pu4 pu4Var = pu4.a;
        if (zA) {
            Set<t99> set = (Set) gdc.f(ee8Var2, n04.j[1]);
            ArrayList arrayList2 = new ArrayList();
            for (t99 t99Var : set) {
                if (((Boolean) a26Var.d(t99Var)).booleanValue()) {
                    t99Var.getClass();
                    arrayList2.addAll(!((Set) gdc.f(ee8Var2, n04.j[1])).contains(t99Var) ? pu4Var : (Collection) n04Var.e.d(t99Var));
                }
            }
            w72.f0(arrayList2, ww2Var);
            arrayList.addAll(arrayList2);
        }
        if (ez3Var.a(ez3.i)) {
            Set<t99> set2 = (Set) gdc.f(ee8Var, n04.j[0]);
            ArrayList arrayList3 = new ArrayList();
            for (t99 t99Var2 : set2) {
                if (((Boolean) a26Var.d(t99Var2)).booleanValue()) {
                    t99Var2.getClass();
                    arrayList3.addAll(!((Set) gdc.f(ee8Var, n04.j[0])).contains(t99Var2) ? pu4Var : (Collection) n04Var.d.d(t99Var2));
                }
            }
            w72.f0(arrayList3, ww2Var);
            arrayList.addAll(arrayList3);
        }
        if (ez3Var.a(ez3.l)) {
            for (t99 t99Var3 : m()) {
                if (((Boolean) a26Var.d(t99Var3)).booleanValue()) {
                    tz3 tz3Var = (tz3) this.b.b;
                    j22 j22VarL = l(t99Var3);
                    h22 h22Var = tz3Var.t;
                    Set set3 = h22.c;
                    u09 u09VarA = h22Var.a(j22VarL, null);
                    if (u09VarA != null) {
                        arrayList.add(u09VarA);
                    }
                }
            }
        }
        if (ez3Var.a(ez3.g)) {
            for (t99 t99Var4 : n04Var.c.keySet()) {
                if (((Boolean) a26Var.d(t99Var4)).booleanValue()) {
                    n04Var.getClass();
                    t99Var4.getClass();
                    s04 s04Var = (s04) n04Var.f.d(t99Var4);
                    if (s04Var != null) {
                        arrayList.add(s04Var);
                    }
                }
            }
        }
        return z7f.z(arrayList);
    }

    public abstract j22 l(t99 t99Var);

    public final Set m() {
        return (Set) gdc.f(this.d, f[0]);
    }

    public abstract Set n();

    public abstract Set o();

    public abstract Set p();

    public boolean q(t99 t99Var) {
        t99Var.getClass();
        return m().contains(t99Var);
    }

    public boolean r(r04 r04Var) {
        return true;
    }

    public void j(t99 t99Var, ArrayList arrayList) {
    }

    public void k(t99 t99Var, ArrayList arrayList) {
    }
}
