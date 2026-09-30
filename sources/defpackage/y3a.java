package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y3a extends yu0 {
    public static final /* synthetic */ int c1 = 0;
    public final t7 P0;
    public final fab Q0;
    public final q9b R0;
    public final p5a S0;
    public final String T0;
    public final s0e U0;
    public bwa V0;
    public final LinkedHashSet W0;
    public final LinkedHashSet X0;
    public final vz9 Y0;
    public final s0e Z0;
    public final s0e a1;
    public final whb b1;

    public y3a(t7 t7Var, fab fabVar, q9b q9bVar, p5a p5aVar, String str) {
        super(t7Var, null);
        this.P0 = t7Var;
        this.Q0 = fabVar;
        this.R0 = q9bVar;
        this.S0 = p5aVar;
        this.T0 = str;
        this.U0 = t0e.a(null);
        this.W0 = new LinkedHashSet();
        this.X0 = new LinkedHashSet();
        this.Y0 = q1c.f(Boolean.FALSE);
        s0e s0eVarA = t0e.a(null);
        this.Z0 = s0eVarA;
        s0e s0eVarA2 = t0e.a(null);
        this.a1 = s0eVarA2;
        int i = 0;
        this.b1 = if9.F(new kl5(new tm5(new wj5[]{s0eVarA, s0eVarA2, new v3a(jzb.p(new q3a(this, i)))}, new w3a(this, null), i), new x3a(this, null), 1), hwf.a(this), new xzd(3000L, Long.MAX_VALUE), w5a.a);
    }

    @Override // defpackage.g4
    public final void A(String str, String str2) {
        String strB;
        if (pa7.t(this.T0, "onboarding_finish")) {
            bwa bwaVar = this.V0;
            if (bwaVar != null && (strB = z3a.b(bwaVar)) != null) {
                str = strB;
            } else if (str == null) {
                str = "";
            }
            if (str2.equals("cancel")) {
                bt5 bt5Var = new bt5(str, 17);
                ca2.a.getClass();
                if (ca2.c) {
                    x1f x1fVar = x1f.a;
                    x1f.k(new r05("subscription_cancel"), bt5Var, 2);
                }
            } else {
                z53 z53Var = new z53(str, str2, 4);
                ca2.a.getClass();
                if (ca2.c) {
                    x1f x1fVar2 = x1f.a;
                    x1f.k(new r05("subscription_fail"), z53Var, 2);
                }
            }
        }
        this.V0 = null;
    }

    @Override // defpackage.g4
    public final void B(boolean z) {
        tj7 tj7Var = tj7.L0;
        if (pa7.t(this.T0, "onboarding_finish")) {
            if (z) {
                ca2.a.getClass();
                if (ca2.c) {
                    x1f x1fVar = x1f.a;
                    x1f.k(new r05("restore_purchase_success"), tj7Var, 2);
                }
                this.Y0.setValue(Boolean.TRUE);
                return;
            }
            ca2.a.getClass();
            if (ca2.c) {
                x1f x1fVar2 = x1f.a;
                x1f.k(new r05("restore_purchase_fail"), tj7Var, 2);
            }
        }
    }

    @Override // defpackage.g4
    public final void D(ArrayList arrayList) {
        d().e("onSubscriptionPricesUpdate: " + arrayList);
        List listB1 = s72.b1(arrayList, new kv8(5));
        s0e s0eVar = this.Z0;
        s0eVar.getClass();
        s0eVar.n(null, listB1);
    }

    @Override // defpackage.g4
    public final void E(String str) {
        str.getClass();
        if (this.X0.add(str)) {
            bwa bwaVar = this.V0;
            if (pa7.t(this.T0, "onboarding_finish") && bwaVar != null) {
                String strB = z3a.b(bwaVar);
                double dC = z3a.c(bwaVar);
                String strA = z3a.a(bwaVar);
                strB.getClass();
                strA.getClass();
                tp9 tp9Var = new tp9(strB, "subscription", dC, strA);
                ca2.a.getClass();
                if (ca2.c) {
                    x1f x1fVar = x1f.a;
                    x1f.k(new r05("subscription_success"), tp9Var, 2);
                }
                this.Y0.setValue(Boolean.TRUE);
            }
            this.V0 = null;
            x1f x1fVar2 = x1f.a;
            x1f.g(new r05("subscription_paywall_success"), m1f.b, new p3a(this, str, 0));
            x1f.k(new r05("subscribe_succeeded"), new p3a(this, str, 1), 2);
        }
    }

    @Override // defpackage.g4
    public final void M(vb2 vb2Var) {
        y41.N(this.P0, vb2Var, new p59(12, this), 2);
        super.M(vb2Var);
    }

    @Override // defpackage.g4
    public final void w(ArrayList arrayList) {
        d().e("onInAppPurchasePricesUpdate: " + arrayList);
        List listB1 = s72.b1(arrayList, new kv8(4));
        s0e s0eVar = this.a1;
        s0eVar.getClass();
        s0eVar.n(null, listB1);
    }

    @Override // defpackage.g4
    public final void x(String str, List list) {
        Object next;
        String strA;
        str.getClass();
        d().e("onInAppPurchaseSucceeded: " + list);
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!s72.o0(z3a.a, ((o07) next).e));
        o07 o07Var = (o07) next;
        if (o07Var == null) {
            return;
        }
        String str2 = o07Var.b;
        if (str2 == null && (str2 = o07Var.a) == null) {
            str2 = str + ":" + o07Var.c;
        }
        if (this.W0.add(str2)) {
            bwa bwaVar = this.V0;
            int i = 2;
            if (pa7.t(this.T0, "onboarding_finish") && bwaVar != null) {
                String strB = z3a.b(bwaVar);
                double dC = z3a.c(bwaVar);
                String strA2 = z3a.a(bwaVar);
                strB.getClass();
                strA2.getClass();
                tp9 tp9Var = new tp9(strB, "one_time", dC, strA2);
                ca2.a.getClass();
                if (ca2.c) {
                    x1f x1fVar = x1f.a;
                    x1f.k(new r05("subscription_success"), tp9Var, 2);
                }
                this.Y0.setValue(Boolean.TRUE);
            }
            this.V0 = null;
            p07 p07Var = o07Var.e;
            if (p07Var == u7e.b) {
                strA = "month";
            } else {
                strA = p07Var == u7e.c ? "year" : p07Var.a();
            }
            x1f x1fVar2 = x1f.a;
            x1f.k(new r05("subscription_paywall_success"), new p3a(this, strA, i), 2);
            x1f.k(new r05("purchase_succeeded"), new p3a(str, this), 2);
        }
    }

    @Override // defpackage.g4
    public final void z() {
        s0e s0eVar;
        Object value;
        List list;
        pu4 pu4Var;
        s0e s0eVar2;
        Object value2;
        List list2;
        d().b("onPricesUpdateFailed");
        do {
            s0eVar = this.Z0;
            value = s0eVar.getValue();
            list = (List) value;
            pu4Var = pu4.a;
            if (list == null) {
                list = pu4Var;
            }
        } while (!s0eVar.l(value, list));
        do {
            s0eVar2 = this.a1;
            value2 = s0eVar2.getValue();
            list2 = (List) value2;
            if (list2 == null) {
                list2 = pu4Var;
            }
        } while (!s0eVar2.l(value2, list2));
    }
}
