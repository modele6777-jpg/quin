package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ma9 {
    public final ka9 a;
    public final vw5 b;
    public ya9 c;
    public Bundle d;
    public Bundle[] e;
    public final ad0 f = new ad0();
    public final s0e g;
    public final s0e h;
    public final whb i;
    public final LinkedHashMap j;
    public final LinkedHashMap k;
    public final LinkedHashMap l;
    public final LinkedHashMap m;
    public x48 n;
    public na9 o;
    public final ArrayList p;
    public g48 q;
    public final y6 r;
    public final gc9 s;
    public final LinkedHashMap t;
    public a26 u;
    public fl0 v;
    public final LinkedHashMap w;
    public int x;
    public final ArrayList y;
    public final ncd z;

    public ma9(ka9 ka9Var, vw5 vw5Var) {
        this.a = ka9Var;
        this.b = vw5Var;
        pu4 pu4Var = pu4.a;
        this.g = t0e.a(pu4Var);
        s0e s0eVarA = t0e.a(pu4Var);
        this.h = s0eVarA;
        this.i = if9.n(s0eVarA);
        this.j = new LinkedHashMap();
        this.k = new LinkedHashMap();
        this.l = new LinkedHashMap();
        this.m = new LinkedHashMap();
        this.p = new ArrayList();
        this.q = g48.b;
        this.r = new y6(4, this);
        this.s = new gc9();
        this.t = new LinkedHashMap();
        this.w = new LinkedHashMap();
        this.y = new ArrayList();
        this.z = ocd.b(1, 0, i41.b, 2);
    }

    public static ua9 e(int i, ua9 ua9Var, ua9 ua9Var2, boolean z) {
        if (ua9Var.b.b == i && (ua9Var2 == null || (ua9Var.equals(ua9Var2) && pa7.t(ua9Var.c, ua9Var2.c)))) {
            return ua9Var;
        }
        ya9 ya9Var = ua9Var instanceof ya9 ? (ya9) ua9Var : null;
        if (ya9Var == null) {
            ya9Var = ua9Var.c;
            ya9Var.getClass();
        }
        return ya9Var.f.m(i, ya9Var, ua9Var2, z);
    }

    public static /* synthetic */ void s(ma9 ma9Var, da9 da9Var) {
        ma9Var.r(da9Var, false, new ad0());
    }

    public final void a(ua9 ua9Var, Bundle bundle, da9 da9Var, List list) {
        Object objPrevious;
        Object objPrevious2;
        bs bsVar = this.a.c;
        ua9 ua9Var2 = da9Var.b;
        boolean z = ua9Var2 instanceof p84;
        ad0 ad0Var = this.f;
        if (!z) {
            while (!ad0Var.isEmpty() && (((da9) ad0Var.last()).b instanceof p84) && p(((da9) ad0Var.last()).b.b.b, true, false)) {
            }
        }
        ad0<da9> ad0Var2 = new ad0();
        Object obj = null;
        if (ua9Var instanceof ya9) {
            ua9 ua9Var3 = ua9Var2;
            do {
                ua9Var3.getClass();
                ua9Var3 = ua9Var3.c;
                if (ua9Var3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            objPrevious2 = null;
                            break;
                        }
                        objPrevious2 = listIterator.previous();
                    } while (!pa7.t(((da9) objPrevious2).b, ua9Var3));
                    da9 da9VarF = (da9) objPrevious2;
                    if (da9VarF == null) {
                        da9VarF = y25.f(bsVar, ua9Var3, bundle, k(), this.o);
                    }
                    ad0Var2.addFirst(da9VarF);
                    if (!ad0Var.isEmpty() && ((da9) ad0Var.last()).b == ua9Var3) {
                        s(this, (da9) ad0Var.last());
                    }
                }
                if (ua9Var3 == null) {
                    break;
                }
            } while (ua9Var3 != ua9Var);
        }
        ua9 ua9Var4 = ad0Var2.isEmpty() ? ua9Var2 : ((da9) ad0Var2.first()).b;
        while (ua9Var4 != null && d(ua9Var4.b.b, ua9Var4) != ua9Var4) {
            ua9Var4 = ua9Var4.c;
            if (ua9Var4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator2.previous();
                } while (!pa7.t(((da9) objPrevious).b, ua9Var4));
                da9 da9VarF2 = (da9) objPrevious;
                if (da9VarF2 == null) {
                    da9VarF2 = y25.f(bsVar, ua9Var4, ua9Var4.c(bundle2), k(), this.o);
                }
                ad0Var2.addFirst(da9VarF2);
            }
        }
        if (!ad0Var2.isEmpty()) {
            ua9Var2 = ((da9) ad0Var2.first()).b;
        }
        while (!ad0Var.isEmpty() && (((da9) ad0Var.last()).b instanceof ya9)) {
            ua9 ua9Var5 = ((da9) ad0Var.last()).b;
            ua9Var5.getClass();
            if (abg.q((fud) ((ya9) ua9Var5).f.c, ua9Var2.b.b) != null) {
                break;
            } else {
                s(this, (da9) ad0Var.last());
            }
        }
        da9 da9Var2 = (da9) ad0Var.i();
        if (da9Var2 == null) {
            da9Var2 = (da9) ad0Var2.i();
        }
        if (!pa7.t(da9Var2 != null ? da9Var2.b : null, this.c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (listIterator3.hasPrevious()) {
                Object objPrevious3 = listIterator3.previous();
                ua9 ua9Var6 = ((da9) objPrevious3).b;
                ya9 ya9Var = this.c;
                ya9Var.getClass();
                if (pa7.t(ua9Var6, ya9Var)) {
                    obj = objPrevious3;
                    break;
                }
            }
            da9 da9VarF3 = (da9) obj;
            if (da9VarF3 == null) {
                ya9 ya9Var2 = this.c;
                ya9Var2.getClass();
                ya9 ya9Var3 = this.c;
                ya9Var3.getClass();
                da9VarF3 = y25.f(bsVar, ya9Var2, ya9Var3.c(bundle), k(), this.o);
            }
            ad0Var2.addFirst(da9VarF3);
        }
        for (da9 da9Var3 : ad0Var2) {
            Object obj2 = this.t.get(this.s.b(da9Var3.b.a));
            if (obj2 == null) {
                ho7.j(ks0.l(new StringBuilder("NavigatorBackStack for "), ua9Var.a, " should already be created"));
                return;
            }
            ((ia9) obj2).a(da9Var3);
        }
        ad0Var.addAll(ad0Var2);
        ad0Var.addLast(da9Var);
        for (da9 da9Var4 : s72.R0(ad0Var2, da9Var)) {
            ya9 ya9Var4 = da9Var4.b.c;
            if (ya9Var4 != null) {
                m(da9Var4, g(ya9Var4.b.b));
            }
        }
    }

    public final boolean b() {
        ad0 ad0Var;
        while (true) {
            ad0Var = this.f;
            if (ad0Var.isEmpty() || !(((da9) ad0Var.last()).b instanceof ya9)) {
                break;
            }
            s(this, (da9) ad0Var.last());
        }
        da9 da9Var = (da9) ad0Var.k();
        ArrayList arrayList = this.y;
        if (da9Var != null) {
            arrayList.add(da9Var);
        }
        this.x++;
        w();
        int i = this.x - 1;
        this.x = i;
        if (i == 0) {
            ArrayList<da9> arrayListL1 = s72.l1(arrayList);
            arrayList.clear();
            for (da9 da9Var2 : arrayListL1) {
                Iterator it = s72.j1(this.p).iterator();
                while (it.hasNext()) {
                    ((ja9) it.next()).a(this.a, da9Var2.b, da9Var2.v.a());
                }
                this.z.i(da9Var2);
            }
            ArrayList arrayList2 = new ArrayList(ad0Var);
            s0e s0eVar = this.g;
            s0eVar.getClass();
            s0eVar.n(null, arrayList2);
            ArrayList arrayListT = t();
            s0e s0eVar2 = this.h;
            s0eVar2.getClass();
            s0eVar2.n(null, arrayListT);
        }
        return da9Var != null;
    }

    public final boolean c(ArrayList arrayList, ua9 ua9Var, boolean z, boolean z2) {
        final ma9 ma9Var;
        boolean z3;
        imb imbVar = new imb();
        ad0 ad0Var = new ad0();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                ma9Var = this;
                z3 = z2;
                break;
            }
            fc9 fc9Var = (fc9) it.next();
            imb imbVar2 = new imb();
            da9 da9Var = (da9) this.f.last();
            ma9Var = this;
            z3 = z2;
            fl0 fl0Var = new fl0(imbVar2, imbVar, ma9Var, z3, ad0Var, 3);
            fc9Var.getClass();
            da9Var.getClass();
            ma9Var.v = fl0Var;
            fc9Var.e(da9Var, z3);
            ma9Var.v = null;
            if (!imbVar2.element) {
                break;
            }
            this = ma9Var;
            z2 = z3;
        }
        if (z3) {
            LinkedHashMap linkedHashMap = ma9Var.l;
            if (!z) {
                final int i = 0;
                ue5 ue5Var = new ue5(new ie5(fyc.u(new d59(7), ua9Var), new a26(ma9Var) { // from class: la9
                    public final /* synthetic */ ma9 b;

                    {
                        this.b = ma9Var;
                    }

                    @Override // defpackage.a26
                    public final Object d(Object obj) {
                        boolean zContainsKey;
                        int i2 = i;
                        ma9 ma9Var2 = this.b;
                        ua9 ua9Var2 = (ua9) obj;
                        switch (i2) {
                            case 0:
                                ua9Var2.getClass();
                                zContainsKey = ma9Var2.l.containsKey(Integer.valueOf(ua9Var2.b.b));
                                break;
                            default:
                                ua9Var2.getClass();
                                zContainsKey = ma9Var2.l.containsKey(Integer.valueOf(ua9Var2.b.b));
                                break;
                        }
                        return Boolean.valueOf(!zContainsKey);
                    }
                }));
                while (ue5Var.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((ua9) ue5Var.next()).b.b);
                    ga9 ga9Var = (ga9) ad0Var.i();
                    linkedHashMap.put(numValueOf, ga9Var != null ? (String) ga9Var.a.c : null);
                }
            }
            if (!ad0Var.isEmpty()) {
                veh vehVar = ((ga9) ad0Var.first()).a;
                String str = (String) vehVar.c;
                final int i2 = 1;
                ue5 ue5Var2 = new ue5(new ie5(fyc.u(new d59(8), ma9Var.d(vehVar.b, null)), new a26(ma9Var) { // from class: la9
                    public final /* synthetic */ ma9 b;

                    {
                        this.b = ma9Var;
                    }

                    @Override // defpackage.a26
                    public final Object d(Object obj) {
                        boolean zContainsKey;
                        int i3 = i2;
                        ma9 ma9Var2 = this.b;
                        ua9 ua9Var2 = (ua9) obj;
                        switch (i3) {
                            case 0:
                                ua9Var2.getClass();
                                zContainsKey = ma9Var2.l.containsKey(Integer.valueOf(ua9Var2.b.b));
                                break;
                            default:
                                ua9Var2.getClass();
                                zContainsKey = ma9Var2.l.containsKey(Integer.valueOf(ua9Var2.b.b));
                                break;
                        }
                        return Boolean.valueOf(!zContainsKey);
                    }
                }));
                while (ue5Var2.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((ua9) ue5Var2.next()).b.b), str);
                }
                if (linkedHashMap.values().contains(str)) {
                    ma9Var.m.put(str, ad0Var);
                }
            }
        }
        ma9Var.b.invoke();
        return imbVar.element;
    }

    public final ua9 d(int i, ua9 ua9Var) {
        ua9 ua9Var2;
        ya9 ya9Var = this.c;
        if (ya9Var == null) {
            return null;
        }
        if (ya9Var.b.b == i) {
            if (ua9Var == null) {
                return ya9Var;
            }
            if (pa7.t(ya9Var, ua9Var) && ua9Var.c == null) {
                return this.c;
            }
        }
        da9 da9Var = (da9) this.f.k();
        if (da9Var == null || (ua9Var2 = da9Var.b) == null) {
            ua9Var2 = this.c;
            ua9Var2.getClass();
        }
        return e(i, ua9Var2, ua9Var, false);
    }

    public final String f(Object obj) {
        obj.getClass();
        Class<?> cls = obj.getClass();
        kob kobVar = job.a;
        ua9 ua9VarE = e(m7c.e(hfc.l(kobVar.b(cls))), j(), null, true);
        if (ua9VarE == null) {
            ho7.x("Destination with route ", kobVar.b(obj.getClass()).r(), " cannot be found in navigation graph ", this.c);
            return null;
        }
        Map mapD = ua9VarE.d();
        LinkedHashMap linkedHashMap = new LinkedHashMap(bm8.F(mapD.size()));
        for (Map.Entry entry : mapD.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((ca9) entry.getValue()).a);
        }
        return m7c.f(obj, linkedHashMap);
    }

    public final da9 g(int i) {
        Object objPrevious;
        ad0 ad0Var = this.f;
        ListIterator<E> listIterator = ad0Var.listIterator(ad0Var.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (((da9) objPrevious).b.b.b != i);
        da9 da9Var = (da9) objPrevious;
        if (da9Var != null) {
            return da9Var;
        }
        StringBuilder sbN = ub3.n(i, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        sbN.append(i());
        throw new IllegalArgumentException(sbN.toString().toString());
    }

    public final da9 h() {
        return (da9) this.f.k();
    }

    public final ua9 i() {
        da9 da9VarH = h();
        if (da9VarH != null) {
            return da9VarH.b;
        }
        return null;
    }

    public final ya9 j() {
        ya9 ya9Var = this.c;
        if (ya9Var != null) {
            ya9Var.getClass();
            return ya9Var;
        }
        qc0.p("You must call setGraph() before calling getGraph()");
        return null;
    }

    public final g48 k() {
        return this.n == null ? g48.c : this.q;
    }

    public final ya9 l() {
        ua9 ua9Var;
        da9 da9Var = (da9) this.f.k();
        if (da9Var == null || (ua9Var = da9Var.b) == null) {
            ua9Var = this.c;
            ua9Var.getClass();
        }
        ya9 ya9Var = ua9Var instanceof ya9 ? (ya9) ua9Var : null;
        if (ya9Var != null) {
            return ya9Var;
        }
        ya9 ya9Var2 = ua9Var.c;
        ya9Var2.getClass();
        return ya9Var2;
    }

    public final void m(da9 da9Var, da9 da9Var2) {
        this.j.put(da9Var, da9Var2);
        LinkedHashMap linkedHashMap = this.k;
        if (linkedHashMap.get(da9Var2) == null) {
            linkedHashMap.put(da9Var2, new vh0());
        }
        Object obj = linkedHashMap.get(da9Var2);
        obj.getClass();
        ((vh0) obj).a.incrementAndGet();
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x01a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x01b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0211 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[LOOP:7: B:78:0x01fb->B:127:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0061  */
    /* JADX WARN: Code duplicated, block: B:55:0x0131  */
    /* JADX WARN: Code duplicated, block: B:58:0x013e A[LOOP:4: B:56:0x0136->B:58:0x013e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x0191  */
    /* JADX WARN: Code duplicated, block: B:64:0x019d  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:80:0x0201 A[Catch: all -> 0x0216, TryCatch #0 {all -> 0x0216, blocks: (B:77:0x01e5, B:78:0x01fb, B:80:0x0201, B:82:0x0211, B:86:0x0219), top: B:108:0x01e5 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0229  */
    public final void n(ua9 ua9Var, Bundle bundle, pb9 pb9Var) {
        boolean z;
        boolean z2;
        int iNextIndex;
        ua9 ua9Var2;
        ad0<da9> ad0Var;
        fc9 fc9VarB;
        ua9 ua9Var3;
        ia9 ia9VarB;
        ListIterator listIterator;
        int iNextIndex2;
        ya9 ya9Var;
        boolean zP;
        ua9Var.getClass();
        Iterator it = this.t.values().iterator();
        while (it.hasNext()) {
            ((ia9) it.next()).d = true;
        }
        imb imbVar = new imb();
        if (pb9Var == null) {
            z = false;
        } else {
            em7 em7Var = pb9Var.h;
            if (em7Var != null) {
                zP = p(m7c.e(hfc.l(em7Var)), pb9Var.d, pb9Var.e);
            } else {
                Object obj = pb9Var.i;
                if (obj != null) {
                    zP = q(f(obj), pb9Var.d, pb9Var.e);
                } else {
                    int i = pb9Var.c;
                    if (i != -1) {
                        zP = p(i, pb9Var.d, pb9Var.e);
                    } else {
                        z = false;
                    }
                }
            }
            z = zP;
        }
        Bundle bundleC = ua9Var.c(bundle);
        if (pb9Var != null && pb9Var.b && this.l.containsKey(Integer.valueOf(ua9Var.b.b))) {
            imbVar.element = u(ua9Var.b.b, bundleC, pb9Var);
            z2 = false;
        } else {
            if (pb9Var == null || !pb9Var.a) {
                z2 = false;
            } else {
                da9 da9VarH = h();
                ad0 ad0Var2 = this.f;
                ListIterator listIterator2 = ad0Var2.listIterator(ad0Var2.c());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        if (((da9) listIterator2.previous()).b == ua9Var) {
                            iNextIndex = listIterator2.nextIndex();
                            break;
                        }
                    } else {
                        iNextIndex = -1;
                        break;
                    }
                }
                if (iNextIndex == -1) {
                    z2 = false;
                } else if (ua9Var instanceof ya9) {
                    int i2 = ya9.g;
                    List listA = fyc.A(fyc.x(fyc.u(new d59(12), (ya9) ua9Var), new d59(9)));
                    if (this.f.c - iNextIndex == listA.size()) {
                        ad0 ad0Var3 = this.f;
                        List listSubList = ad0Var3.subList(iNextIndex, ad0Var3.c);
                        ArrayList arrayList = new ArrayList(t72.u(listSubList, 10));
                        Iterator it2 = listSubList.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(Integer.valueOf(((da9) it2.next()).b.b.b));
                        }
                        if (arrayList.equals(listA)) {
                            ad0Var = new ad0();
                            while (t72.E(this.f) >= iNextIndex) {
                                da9 da9Var = (da9) x72.k0(this.f);
                                v(da9Var);
                                da9 da9Var2 = new da9(da9Var.a, da9Var.b, da9Var.b.c(bundle), da9Var.d, da9Var.e, da9Var.f, da9Var.g);
                                fa9 fa9Var = da9Var2.v;
                                g48 g48Var = da9Var.d;
                                fa9Var.getClass();
                                g48Var.getClass();
                                fa9Var.d = g48Var;
                                fa9 fa9Var2 = da9Var2.v;
                                fa9Var2.k = da9Var.v.k;
                                fa9Var2.b();
                                ad0Var.addFirst(da9Var2);
                            }
                            for (da9 da9Var3 : ad0Var) {
                                ya9Var = da9Var3.b.c;
                                if (ya9Var != null) {
                                    m(da9Var3, g(ya9Var.b.b));
                                }
                                this.f.addLast(da9Var3);
                            }
                            for (da9 da9Var4 : ad0Var) {
                                fc9VarB = this.s.b(da9Var4.b.a);
                                ua9Var3 = da9Var4.b;
                                if (ua9Var3 == null) {
                                    ua9Var3 = null;
                                }
                                if (ua9Var3 == null) {
                                    cn1.I(new d59(17));
                                    fc9VarB.c(ua9Var3);
                                    ia9VarB = fc9VarB.b();
                                    synchronized (ia9VarB.a) {
                                        try {
                                            ArrayList arrayListL1 = s72.l1((Collection) ia9VarB.e.a.getValue());
                                            listIterator = arrayListL1.listIterator(arrayListL1.size());
                                            while (true) {
                                                if (listIterator.hasPrevious()) {
                                                    if (((da9) listIterator.previous()).f.equals(da9Var4.f)) {
                                                        iNextIndex2 = listIterator.nextIndex();
                                                        break;
                                                    }
                                                } else {
                                                    iNextIndex2 = -1;
                                                    break;
                                                }
                                            }
                                            arrayListL1.set(iNextIndex2, da9Var4);
                                            ia9VarB.b.n(null, arrayListL1);
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            }
                            z2 = true;
                        }
                    }
                    z2 = false;
                } else if (da9VarH == null || (ua9Var2 = da9VarH.b) == null || ua9Var.b.b != ua9Var2.b.b) {
                    z2 = false;
                } else {
                    ad0Var = new ad0();
                    while (t72.E(this.f) >= iNextIndex) {
                        da9 da9Var5 = (da9) x72.k0(this.f);
                        v(da9Var5);
                        da9 da9Var6 = new da9(da9Var5.a, da9Var5.b, da9Var5.b.c(bundle), da9Var5.d, da9Var5.e, da9Var5.f, da9Var5.g);
                        fa9 fa9Var3 = da9Var6.v;
                        g48 g48Var2 = da9Var5.d;
                        fa9Var3.getClass();
                        g48Var2.getClass();
                        fa9Var3.d = g48Var2;
                        fa9 fa9Var4 = da9Var6.v;
                        fa9Var4.k = da9Var5.v.k;
                        fa9Var4.b();
                        ad0Var.addFirst(da9Var6);
                    }
                    while (r0.hasNext()) {
                        ya9Var = da9Var3.b.c;
                        if (ya9Var != null) {
                            m(da9Var3, g(ya9Var.b.b));
                        }
                        this.f.addLast(da9Var3);
                    }
                    while (r0.hasNext()) {
                        fc9VarB = this.s.b(da9Var4.b.a);
                        ua9Var3 = da9Var4.b;
                        if (ua9Var3 == null) {
                            ua9Var3 = null;
                        }
                        if (ua9Var3 == null) {
                            cn1.I(new d59(17));
                            fc9VarB.c(ua9Var3);
                            ia9VarB = fc9VarB.b();
                            synchronized (ia9VarB.a) {
                                ArrayList arrayListL2 = s72.l1((Collection) ia9VarB.e.a.getValue());
                                listIterator = arrayListL2.listIterator(arrayListL2.size());
                                while (true) {
                                    if (listIterator.hasPrevious()) {
                                        if (((da9) listIterator.previous()).f.equals(da9Var4.f)) {
                                            iNextIndex2 = listIterator.nextIndex();
                                            break;
                                        }
                                    } else {
                                        iNextIndex2 = -1;
                                        break;
                                    }
                                }
                                arrayListL2.set(iNextIndex2, da9Var4);
                                ia9VarB.b.n(null, arrayListL2);
                            }
                        }
                    }
                    z2 = true;
                }
            }
            if (!z2) {
                da9 da9VarF = y25.f(this.a.c, ua9Var, bundleC, k(), this.o);
                fc9 fc9VarB2 = this.s.b(ua9Var.a);
                List listH = t72.H(da9VarF);
                this.u = new wg(imbVar, this, ua9Var, bundleC, 22);
                fc9VarB2.d(listH, pb9Var);
                this.u = null;
            }
        }
        this.b.invoke();
        Iterator it3 = this.t.values().iterator();
        while (it3.hasNext()) {
            ((ia9) it3.next()).d = false;
        }
        if (z || imbVar.element || z2) {
            b();
        } else {
            w();
        }
    }

    public final void o(Object obj, pb9 pb9Var) {
        obj.getClass();
        String strF = f(obj);
        if (this.c == null) {
            ho7.p("Cannot navigate to ", strF, ". Navigation graph has not been set for NavController ", this, 46);
            return;
        }
        ya9 ya9VarL = l();
        ta9 ta9VarI = ya9VarL.i(strF, true, ya9VarL);
        if (ta9VarI == null) {
            qc0.l(tec.p("Navigation destination that matches route ", strF, " cannot be found in the navigation graph "), this.c);
            return;
        }
        ua9 ua9Var = ta9VarI.a;
        Bundle bundleC = ua9Var.c(ta9VarI.b);
        if (bundleC == null) {
            bundleC = feg.r((iy9[]) Arrays.copyOf(new iy9[0], 0));
        }
        int i = ua9.e;
        String str = (String) ua9Var.b.f;
        Uri uri = Uri.parse(str != null ? "android-app://androidx.navigation/".concat(str) : "");
        uri.getClass();
        Intent intent = new Intent();
        intent.setDataAndType(uri, null);
        intent.setAction(null);
        bundleC.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        n(ua9Var, bundleC, pb9Var);
    }

    public final boolean p(int i, boolean z, boolean z2) {
        ua9 ua9Var;
        a80 a80Var;
        ad0 ad0Var = this.f;
        if (ad0Var.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = s72.V0(ad0Var).iterator();
        do {
            if (!it.hasNext()) {
                ua9Var = null;
                break;
            }
            ua9Var = ((da9) it.next()).b;
            String str = ua9Var.a;
            a80Var = ua9Var.b;
            fc9 fc9VarB = this.s.b(str);
            if (z || a80Var.b != i) {
                arrayList.add(fc9VarB);
            }
        } while (a80Var.b != i);
        if (ua9Var != null) {
            return c(arrayList, ua9Var, z, z2);
        }
        int i2 = ua9.e;
        Log.i("NavController", "Ignoring popBackStack to destination " + kj0.g0(this.a.c, i) + " as it was not found on the current back stack");
        return false;
    }

    public final boolean q(String str, boolean z, boolean z2) {
        Object objPrevious;
        boolean zE;
        str.getClass();
        ad0 ad0Var = this.f;
        if (ad0Var.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = ad0Var.listIterator(ad0Var.c());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            da9 da9Var = (da9) objPrevious;
            zE = da9Var.b.e(str, da9Var.v.a());
            if (z || !zE) {
                arrayList.add(this.s.b(da9Var.b.a));
            }
        } while (!zE);
        da9 da9Var2 = (da9) objPrevious;
        ua9 ua9Var = da9Var2 != null ? da9Var2.b : null;
        if (ua9Var != null) {
            return c(arrayList, ua9Var, z, z2);
        }
        Log.i("NavController", "Ignoring popBackStack to route " + str + " as it was not found on the current back stack");
        return false;
    }

    public final void r(da9 da9Var, boolean z, ad0 ad0Var) {
        na9 na9Var;
        Set set;
        da9Var.getClass();
        ad0 ad0Var2 = this.f;
        da9 da9Var2 = (da9) ad0Var2.last();
        if (!pa7.t(da9Var2, da9Var)) {
            StringBuilder sb = new StringBuilder("Attempted to pop ");
            sb.append(da9Var.b);
            ua9 ua9Var = da9Var2.b;
            sb.append(", which is not the top of the back stack (");
            sb.append(ua9Var);
            sb.append(')');
            throw new IllegalStateException(sb.toString().toString());
        }
        x72.k0(ad0Var2);
        ia9 ia9Var = (ia9) this.t.get(this.s.b(da9Var2.b.a));
        boolean z2 = true;
        if ((ia9Var == null || (set = (Set) ia9Var.f.a.getValue()) == null || !set.contains(da9Var2)) && !this.k.containsKey(da9Var2)) {
            z2 = false;
        }
        g48 g48Var = da9Var2.v.j.i;
        g48 g48Var2 = g48.c;
        if (g48Var.compareTo(g48Var2) >= 0) {
            if (z) {
                da9Var2.d(g48Var2);
                ad0Var.addFirst(new ga9(da9Var2));
            }
            if (z2) {
                da9Var2.d(g48Var2);
            } else {
                da9Var2.d(g48.a);
                v(da9Var2);
            }
        }
        if (z || z2 || (na9Var = this.o) == null) {
            return;
        }
        owf owfVar = (owf) na9Var.b.remove(da9Var2.f);
        if (owfVar != null) {
            owfVar.a();
        }
    }

    public final ArrayList t() {
        g48 g48Var;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.t.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            g48Var = g48.d;
            if (!zHasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((ia9) it.next()).f.a.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                da9 da9Var = (da9) obj;
                if (!arrayList.contains(da9Var) && da9Var.v.k.compareTo(g48Var) < 0) {
                    arrayList2.add(obj);
                }
            }
            x72.g0(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : this.f) {
            da9 da9Var2 = (da9) obj2;
            if (!arrayList.contains(da9Var2) && da9Var2.v.k.compareTo(g48Var) >= 0) {
                arrayList3.add(obj2);
            }
        }
        x72.g0(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!(((da9) obj3).b instanceof ya9)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    public final boolean u(int i, Bundle bundle, pb9 pb9Var) {
        ua9 ua9VarJ;
        da9 da9Var;
        ua9 ua9Var;
        Bundle bundle2;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.l;
        if (!linkedHashMap.containsKey(numValueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        Collection collectionValues = linkedHashMap.values();
        collectionValues.getClass();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            if (pa7.t((String) it.next(), str)) {
                it.remove();
            }
        }
        ad0<ga9> ad0Var = (ad0) z7f.q(this.m).remove(str);
        bs bsVar = this.a.c;
        ArrayList arrayList = new ArrayList();
        da9 da9Var2 = (da9) this.f.k();
        if (da9Var2 == null || (ua9VarJ = da9Var2.b) == null) {
            ua9VarJ = j();
        }
        if (ad0Var != null) {
            for (ga9 ga9Var : ad0Var) {
                veh vehVar = ga9Var.a;
                veh vehVar2 = ga9Var.a;
                ua9 ua9VarE = e(vehVar.b, ua9VarJ, null, true);
                if (ua9VarE == null) {
                    int i2 = ua9.e;
                    ho7.u("Restore State failed: destination ", kj0.g0(bsVar, vehVar2.b), " cannot be found from the current destination ", ua9VarJ);
                    return false;
                }
                g48 g48VarK = k();
                na9 na9Var = this.o;
                bsVar.getClass();
                g48VarK.getClass();
                Bundle bundle3 = (Bundle) vehVar2.d;
                if (bundle3 != null) {
                    Context context = bsVar.a;
                    bundle3.setClassLoader(context != null ? context.getClassLoader() : null);
                    bundle2 = bundle3;
                } else {
                    bundle2 = null;
                }
                arrayList.add(new da9(bsVar, ua9VarE, bundle2, g48VarK, na9Var, (String) vehVar2.c, (Bundle) vehVar2.e));
                ua9VarJ = ua9VarE;
            }
        }
        ArrayList<List> arrayList2 = new ArrayList();
        ArrayList<da9> arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (!(((da9) obj).b instanceof ya9)) {
                arrayList3.add(obj);
            }
        }
        for (da9 da9Var3 : arrayList3) {
            List list = (List) s72.H0(arrayList2);
            if (pa7.t((list == null || (da9Var = (da9) s72.F0(list)) == null || (ua9Var = da9Var.b) == null) ? null : ua9Var.a, da9Var3.b.a)) {
                list.add(da9Var3);
            } else {
                arrayList2.add(t72.K(da9Var3));
            }
        }
        imb imbVar = new imb();
        for (List list2 : arrayList2) {
            fc9 fc9VarB = this.s.b(((da9) s72.v0(list2)).b.a);
            ArrayList arrayList4 = arrayList;
            this.u = new kf(imbVar, arrayList4, new kmb(), this, bundle, 15);
            fc9VarB.d(list2, pb9Var);
            this.u = null;
            arrayList = arrayList4;
        }
        return imbVar.element;
    }

    public final void v(da9 da9Var) {
        da9Var.getClass();
        da9 da9Var2 = (da9) this.j.remove(da9Var);
        if (da9Var2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.k;
        vh0 vh0Var = (vh0) linkedHashMap.get(da9Var2);
        Integer numValueOf = vh0Var != null ? Integer.valueOf(vh0Var.a.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            ia9 ia9Var = (ia9) this.t.get(this.s.b(da9Var2.b.a));
            if (ia9Var != null) {
                ia9Var.c(da9Var2);
            }
            linkedHashMap.remove(da9Var2);
        }
    }

    public final void w() {
        vh0 vh0Var;
        Set set;
        ArrayList<da9> arrayListL1 = s72.l1(this.f);
        if (arrayListL1.isEmpty()) {
            return;
        }
        ArrayList arrayListK = t72.K(((da9) s72.F0(arrayListL1)).b);
        ArrayList arrayList = new ArrayList();
        if (s72.F0(arrayListK) instanceof p84) {
            Iterator it = s72.V0(arrayListL1).iterator();
            while (it.hasNext()) {
                ua9 ua9Var = ((da9) it.next()).b;
                arrayList.add(ua9Var);
                if (!(ua9Var instanceof p84) && !(ua9Var instanceof ya9)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (da9 da9Var : s72.V0(arrayListL1)) {
            g48 g48Var = da9Var.v.k;
            ua9 ua9Var2 = da9Var.b;
            ua9 ua9Var3 = (ua9) s72.x0(arrayListK);
            g48 g48Var2 = g48.e;
            g48 g48Var3 = g48.d;
            if (ua9Var3 != null && ua9Var3.b.b == ua9Var2.b.b) {
                if (g48Var != g48Var2) {
                    ia9 ia9Var = (ia9) this.t.get(this.s.b(da9Var.b.a));
                    if (pa7.t((ia9Var == null || (set = (Set) ia9Var.f.a.getValue()) == null) ? null : Boolean.valueOf(set.contains(da9Var)), Boolean.TRUE) || ((vh0Var = (vh0) this.k.get(da9Var)) != null && vh0Var.a.get() == 0)) {
                        map.put(da9Var, g48Var3);
                    } else {
                        map.put(da9Var, g48Var2);
                    }
                }
                ua9 ua9Var4 = (ua9) s72.x0(arrayList);
                if (ua9Var4 != null && ua9Var4.b.b == ua9Var2.b.b) {
                    x72.j0(arrayList);
                }
                x72.j0(arrayListK);
                ya9 ya9Var = ua9Var2.c;
                if (ya9Var != null) {
                    arrayListK.add(ya9Var);
                }
            } else if (arrayList.isEmpty() || ua9Var2.b.b != ((ua9) s72.v0(arrayList)).b.b) {
                da9Var.d(g48.c);
            } else {
                ua9 ua9Var5 = (ua9) x72.j0(arrayList);
                if (g48Var == g48Var2) {
                    da9Var.d(g48Var3);
                } else if (g48Var != g48Var3) {
                    map.put(da9Var, g48Var3);
                }
                ya9 ya9Var2 = ua9Var5.c;
                if (ya9Var2 != null && !arrayList.contains(ya9Var2)) {
                    arrayList.add(ya9Var2);
                }
            }
        }
        for (da9 da9Var2 : arrayListL1) {
            g48 g48Var4 = (g48) map.get(da9Var2);
            if (g48Var4 != null) {
                da9Var2.d(g48Var4);
            } else {
                da9Var2.v.b();
            }
        }
    }
}
