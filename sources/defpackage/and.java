package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import tech.chatmind.api.credits.QuotaUsage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class and extends g4 {
    public static final /* synthetic */ int q1 = 0;
    public final t7 P0;
    public final o9 Q0;
    public final s0e R0;
    public final vz9 S0;
    public final vz9 T0;
    public final vz9 U0;
    public final vz9 V0;
    public final vz9 W0;
    public final vz9 X0;
    public List Y0;
    public boolean Z0;
    public final vz9 a1;
    public final whb b1;
    public final vz9 c1;
    public z6e d1;
    public final vz9 e1;
    public final vz9 f1;
    public tnd g1;
    public final LinkedHashMap h1;
    public final LinkedHashMap i1;
    public boolean j1;
    public final vz9 k1;
    public boolean l1;
    public p07 m1;
    public Set n1;
    public TarotSkinIdentify o1;
    public boolean p1;

    public and(t7 t7Var, o9 o9Var, boolean z) {
        super(t7Var, null);
        this.P0 = t7Var;
        this.Q0 = o9Var;
        zmd zmdVar = new zmd(o9Var.a.b);
        pu4 pu4Var = pu4.a;
        s0e s0eVarA = t0e.a(pu4Var);
        this.R0 = s0eVarA;
        this.S0 = q1c.f(Boolean.TRUE);
        Boolean bool = Boolean.FALSE;
        this.T0 = q1c.f(bool);
        this.U0 = q1c.f(bool);
        this.V0 = q1c.f(bool);
        this.W0 = q1c.f(bool);
        this.X0 = q1c.f(bool);
        this.Y0 = pu4Var;
        this.a1 = q1c.f(null);
        this.b1 = if9.F(new tm5(new wj5[]{zmdVar, s0eVarA, k8b.a}, new vmd(z, null), 0), hwf.a(this), new xzd(5000L, Long.MAX_VALUE), new zke(pu4Var, pu4Var));
        this.c1 = q1c.f("");
        this.e1 = q1c.f(bool);
        this.f1 = q1c.f(null);
        this.g1 = tnd.TarotStore;
        this.h1 = new LinkedHashMap();
        this.i1 = new LinkedHashMap();
        this.k1 = q1c.f(null);
        this.n1 = xu4.a;
    }

    @Override // defpackage.g4
    public final void A(String str, String str2) {
        a0(null);
        this.Y0 = pu4.a;
        this.Z0 = false;
        this.V0.setValue(Boolean.FALSE);
        Z(false);
        O();
    }

    @Override // defpackage.g4
    public final void D(ArrayList arrayList) {
        Object next;
        String strY;
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((z6e) next).h() != u7e.c);
        z6e z6eVar = (z6e) next;
        this.d1 = z6eVar;
        if (z6eVar == null || (strY = z6eVar.y()) == null) {
            strY = "";
        }
        this.c1.setValue(strY);
    }

    @Override // defpackage.g4
    public final void E(String str) {
        str.getClass();
        x1f x1fVar = x1f.a;
        x1f.k(new r05("subscribe_succeeded"), new smd(this, str, 1), 2);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x002c  */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    @Override // defpackage.g4
    public final boolean G(String str, String str2) {
        String strX;
        str.getClass();
        this.V0.setValue(Boolean.FALSE);
        Z(true);
        String str3 = null;
        if (str2 == null) {
            strX = X(str);
            if (strX != null && !v4e.Q(strX)) {
                str3 = strX;
            }
            if (str3 == null) {
                return false;
            }
            str2 = str3;
        } else {
            if (v4e.Q(str2)) {
                str2 = null;
            }
            if (str2 == null) {
                strX = X(str);
                if (strX != null) {
                    str3 = strX;
                }
                if (str3 == null) {
                    return false;
                }
                str2 = str3;
            }
        }
        this.i1.put(str, str2);
        this.m1 = hj6.t(str);
        return true;
    }

    public final void O() {
        this.j1 = false;
        this.m1 = null;
        this.n1 = xu4.a;
        this.o1 = null;
        this.p1 = false;
    }

    public final ij P() {
        QuotaUsage quotaUsage;
        n07 n07Var = (n07) this.f1.getValue();
        if (n07Var == null || (quotaUsage = (QuotaUsage) this.k1.getValue()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = mfc.d.iterator();
        while (it.hasNext()) {
            x72.g0(arrayList, r8c.c((mfc) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!r8c.k((TarotSkinIdentify) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(t72.u(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((TarotSkinIdentify) it2.next()).getKey());
        }
        return new ij(n07Var, s72.o1(arrayList3), quotaUsage.getHasPurchasedAllTarotCards());
    }

    public final boolean Q() {
        return ((Boolean) this.e1.getValue()).booleanValue();
    }

    public final boolean R(p07 p07Var, yof yofVar) {
        QuotaUsage quotaUsage;
        if (p07Var != hj.CurrentDecks) {
            lx4<TarotSkinIdentify> entries = TarotSkinIdentify.getEntries();
            if (entries != null && entries.isEmpty()) {
                return false;
            }
            for (TarotSkinIdentify tarotSkinIdentify : entries) {
                if (hfc.h(tarotSkinIdentify) != p07Var || !yofVar.f.contains(tarotSkinIdentify.getKey())) {
                }
            }
            return false;
        }
        if (!this.l1 || (quotaUsage = (QuotaUsage) this.k1.getValue()) == null || !quotaUsage.getHasPurchasedAllTarotCards() || !yofVar.f.containsAll(this.n1)) {
            return false;
        }
        return true;
    }

    public final boolean S() {
        return ((Boolean) this.W0.getValue()).booleanValue();
    }

    public final boolean T() {
        return ((Boolean) this.V0.getValue()).booleanValue();
    }

    @Override // defpackage.g4
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final void u(yof yofVar, List list) {
        list.getClass();
        d().e("onInAppPurchase: " + list);
        if (list.isEmpty()) {
            return;
        }
        this.V0.setValue(Boolean.FALSE);
        this.Y0 = list;
        boolean z = false;
        this.Z0 = false;
        p07 p07Var = this.m1;
        ynd xndVar = null;
        if (p07Var == null) {
            o07 o07Var = (o07) s72.Z0(list);
            p07Var = o07Var != null ? o07Var.e : null;
        }
        if (yofVar != null && p07Var != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((o07) it.next()).e.equals(p07Var)) {
                    if (!R(p07Var, yofVar)) {
                        break;
                    }
                    z = true;
                    break;
                }
            }
        }
        TarotSkinIdentify tarotSkinIdentify = this.o1;
        if (z && this.j1 && tarotSkinIdentify != null) {
            if (p07Var != hj.CurrentDecks) {
                xndVar = new xnd(tarotSkinIdentify);
            } else if (this.p1) {
                xndVar = new und(this.n1.size(), tarotSkinIdentify);
            }
        }
        a0(xndVar);
        Z(!z);
        if (z) {
            this.Y0 = pu4.a;
            O();
        }
    }

    @Override // defpackage.g4
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final void C(yof yofVar) {
        this.Z0 = true;
        boolean z = yofVar != null && Q();
        a0((z && this.j1) ? vnd.a : null);
        Z(!z);
        if (z) {
            O();
        }
    }

    public final void W(n07 n07Var, TarotSkinIdentify tarotSkinIdentify, boolean z) {
        ij ijVarP;
        if (q() || T() || S() || Q()) {
            return;
        }
        List<mmd> list = ((zke) this.b1.a.getValue()).b;
        if (list == null || !list.isEmpty()) {
            for (mmd mmdVar : list) {
                n07 n07Var2 = mmdVar.b;
                if (pa7.t(n07Var2 != null ? n07Var2.g() : null, n07Var.g()) && mmdVar.c) {
                    return;
                }
            }
        }
        if (!(n07Var.g() instanceof hj) || ((ijVarP = P()) != null && ijVarP.a())) {
            this.Z0 = false;
            this.m1 = n07Var.g();
            p07 p07VarG = n07Var.g();
            hj hjVar = hj.CurrentDecks;
            Set set = xu4.a;
            if (p07VarG == hjVar) {
                ij ijVarP2 = P();
                Set set2 = ijVarP2 != null ? ijVarP2.b : null;
                if (set2 != null) {
                    set = set2;
                }
            }
            this.n1 = set;
            this.o1 = tarotSkinIdentify;
            this.p1 = z;
            Y(n07Var);
        }
    }

    public final String X(String str) {
        Object next;
        String strA;
        String strA2;
        String str2 = (String) this.i1.get(str);
        if (str2 != null) {
            if (v4e.Q(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                return str2;
            }
        }
        Iterator it = ((Iterable) this.R0.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!pa7.t(ym8.P((n07) next), str));
        n07 n07Var = (n07) next;
        if (n07Var == null || (strA = n07Var.a()) == null || v4e.Q(strA)) {
            strA = null;
        }
        if (strA != null) {
            return strA;
        }
        z6e z6eVar = this.d1;
        if (z6eVar != null) {
            if (!pa7.t(ym8.P(z6eVar), str)) {
                z6eVar = null;
            }
            if (z6eVar != null && (strA2 = z6eVar.a()) != null && !v4e.Q(strA2)) {
                return strA2;
            }
        }
        return null;
    }

    public final void Y(bwa bwaVar) {
        String strA;
        if (q() || T() || S()) {
            return;
        }
        String strP = ym8.P(bwaVar);
        if (bwaVar instanceof z6e) {
            strA = ((z6e) bwaVar).a();
        } else {
            if (!(bwaVar instanceof n07)) {
                ap.c();
                return;
            }
            strA = ((n07) bwaVar).a();
        }
        String strB = bwaVar.f() instanceof String ? strP : bwaVar.getType().b();
        LinkedHashMap linkedHashMap = this.h1;
        linkedHashMap.put(strP, strB);
        this.i1.put(strP, strA);
        String str = (String) linkedHashMap.get(strP);
        if (str != null) {
            strP = str;
        }
        int iOrdinal = this.g1.ordinal();
        if (iOrdinal == 0) {
            x1f x1fVar = x1f.a;
            x1f.k(new r05("paywall_action"), new bv9(bwaVar, this, strP, 13), 2);
        } else if (iOrdinal != 1) {
            ap.c();
            return;
        } else {
            x1f x1fVar2 = x1f.a;
            x1f.k(p05.a, new smd(this, strP, 0), 2);
        }
        this.j1 = true;
        H(bwaVar, ((mo3) this.P0).a());
    }

    public final void Z(boolean z) {
        this.W0.setValue(Boolean.valueOf(z));
    }

    public final void a0(ynd yndVar) {
        this.a1.setValue(yndVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bb, code lost:
    
        if (r8 == r5) goto L50;
     */
    @Override // defpackage.g4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(defpackage.zn2 r8) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.and.i(zn2):java.lang.Object");
    }

    @Override // defpackage.g4
    public final String m() {
        return this.g1.a();
    }

    @Override // defpackage.g4
    public final boolean r(Object obj) {
        ((yof) obj).getClass();
        return Q();
    }

    @Override // defpackage.g4
    public final boolean s(Object obj) {
        yof yofVar = (yof) obj;
        yofVar.getClass();
        p07 p07Var = this.m1;
        return p07Var != null && R(p07Var, yofVar);
    }

    @Override // defpackage.g4
    public final void v() {
        this.V0.setValue(Boolean.TRUE);
        Z(false);
        a0(null);
    }

    @Override // defpackage.g4
    public final void w(ArrayList arrayList) {
        s0e s0eVar;
        Object value;
        d().e("onInAppPurchasePricesUpdate: " + arrayList);
        do {
            s0eVar = this.R0;
            value = s0eVar.getValue();
        } while (!s0eVar.l(value, arrayList));
        for (Object obj : arrayList) {
            if (((n07) obj).g() == hj.CurrentDecks) {
                this.f1.setValue((n07) obj);
            }
        }
        obj = null;
        this.f1.setValue((n07) obj);
    }

    @Override // defpackage.g4
    public final void x(String str, List list) {
        str.getClass();
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p07 p07Var = ((o07) it.next()).e;
            if ((p07Var instanceof lmd) || (p07Var instanceof hj)) {
                x1f x1fVar = x1f.a;
                x1f.k(new r05("purchase_succeeded"), new smd(this, str, 2), 2);
                return;
            }
        }
    }

    @Override // defpackage.g4
    public final void z() {
        d().b("onPricesUpdateFailed");
    }
}
