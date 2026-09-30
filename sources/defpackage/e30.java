package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class e30 extends g4 {
    public static final /* synthetic */ int U0 = 0;
    public final t7 P0;
    public final v40 Q0;
    public final s0e R0;
    public final whb S0;
    public boolean T0;

    public e30(t7 t7Var, v40 v40Var) {
        super(t7Var, null);
        this.P0 = t7Var;
        this.Q0 = v40Var;
        s0e s0eVarA = t0e.a(new a30(null, null, false));
        this.R0 = s0eVarA;
        this.S0 = if9.n(s0eVarA);
        ok8.C(new kl5(if9.n(v40Var.b), new b30(this, null), 1), hwf.a(this));
    }

    @Override // defpackage.g4
    public final void D(ArrayList arrayList) {
        Object next;
        s0e s0eVar;
        Object value;
        d().e("onSubscriptionPricesUpdate: " + arrayList);
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((z6e) next).h() != u7e.c);
        z6e z6eVar = (z6e) next;
        if (z6eVar == null) {
            d().g("Yearly subscription not found in prices");
            return;
        }
        do {
            s0eVar = this.R0;
            value = s0eVar.getValue();
        } while (!s0eVar.l(value, a30.a((a30) value, null, z6eVar, false, 5)));
    }

    @Override // defpackage.g4
    public final void E(String str) {
        str.getClass();
        d().e("AnnualIntro subscription purchase succeeded");
        x1f x1fVar = x1f.a;
        x1f.k(new r05("subscribe_succeeded"), new ia(str, 1), 2);
    }

    @Override // defpackage.g4
    public final void M(vb2 vb2Var) {
        super.M(vb2Var);
        this.Q0.b();
        ynb.V(hwf.a(this), null, null, new d30(vb2Var, this, null), 3);
    }

    @Override // defpackage.g4
    public final Object i(zn2 zn2Var) {
        return this.Q0.a(zn2Var);
    }

    @Override // defpackage.g4
    public final boolean r(Object obj) {
        f30 f30Var = (f30) obj;
        f30Var.getClass();
        return f30Var.d != v50.a;
    }

    @Override // defpackage.g4
    public final boolean s(Object obj) {
        f30 f30Var = (f30) obj;
        f30Var.getClass();
        return f30Var.d != v50.a;
    }

    @Override // defpackage.g4
    public final void w(ArrayList arrayList) {
        Object next;
        s0e s0eVar;
        Object value;
        d().e("onInAppPurchasePricesUpdate: " + arrayList);
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((n07) next).g() != e56.YEARLY_READING_2026);
        n07 n07Var = (n07) next;
        if (n07Var == null) {
            d().g("Annual Fortune 2026 product not found in prices");
            return;
        }
        do {
            s0eVar = this.R0;
            value = s0eVar.getValue();
        } while (!s0eVar.l(value, a30.a((a30) value, n07Var, null, false, 6)));
    }

    @Override // defpackage.g4
    public final void x(String str, List list) {
        str.getClass();
        d().e("AnnualIntro in-app purchase succeeded: " + list);
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((o07) it.next()).e == e56.YEARLY_READING_2026) {
                x1f x1fVar = x1f.a;
                x1f.k(new r05("purchase_succeeded"), new ia(str, 2), 2);
                return;
            }
        }
    }

    @Override // defpackage.g4
    public final void z() {
        d().b("onPricesUpdateFailed");
    }
}
