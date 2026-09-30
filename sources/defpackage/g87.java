package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import tech.chatmind.api.credits.QuotaUsage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g87 extends yu0 {
    public static final Set Z0 = qd0.I0(new thb[]{thb.a, thb.b, thb.e, thb.v});
    public final t7 P0;
    public final fab Q0;
    public final q9b R0;
    public final p5a S0;
    public final String T0;
    public final vz9 U0;
    public final vz9 V0;
    public final LinkedHashSet W0;
    public final LinkedHashSet X0;
    public boolean Y0;

    public g87(t7 t7Var, fab fabVar, q9b q9bVar, p5a p5aVar, String str) {
        super(t7Var, null);
        this.P0 = t7Var;
        this.Q0 = fabVar;
        this.R0 = q9bVar;
        this.S0 = p5aVar;
        this.T0 = str;
        this.U0 = q1c.f(null);
        this.V0 = q1c.f(new c87(null, null, null, pa7.t(pa7.b0(4, ((u5a) p5aVar).a("reading-pack-test-202609"), false), "g2_6_readings") ? 6 : 5, false, false));
        this.W0 = new LinkedHashSet();
        this.X0 = new LinkedHashSet();
        ynb.V(hwf.a(this), null, null, new e87(this, null), 3);
    }

    @Override // defpackage.g4
    public final void C(Object obj) {
        QuotaUsage quotaUsage = (QuotaUsage) obj;
        this.V0.setValue(c87.a(Q(), null, null, null, quotaUsage != null ? pa7.t(quotaUsage.getNeverPurchased(), Boolean.TRUE) : false, false, 47));
        if (quotaUsage == null || !quotaUsage.getHasSubscription()) {
            return;
        }
        this.U0.setValue(izb.a);
    }

    @Override // defpackage.g4
    public final void D(ArrayList arrayList) {
        Object obj;
        Object next;
        c87 c87VarQ = Q();
        Iterator it = arrayList.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((z6e) next).h() != u7e.b);
        z6e z6eVar = (z6e) next;
        for (Object obj2 : arrayList) {
            if (((z6e) obj2).h() == u7e.c) {
                obj = obj2;
                break;
            }
        }
        this.V0.setValue(c87.a(c87VarQ, null, z6eVar, (z6e) obj, false, false, 25));
    }

    @Override // defpackage.g4
    public final void E(String str) {
        str.getClass();
        if (this.X0.add(str)) {
            x1f x1fVar = x1f.a;
            x1f.k(new r05("subscribe_succeeded"), new d87(this, str), 2);
        }
    }

    @Override // defpackage.g4
    public final void M(vb2 vb2Var) {
        if (Q().a == null) {
            ynb.V(hwf.a(this), null, null, new f87(this, null), 3);
        }
        super.M(vb2Var);
    }

    @Override // defpackage.yu0, defpackage.g4
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final boolean s(QuotaUsage quotaUsage) {
        quotaUsage.getClass();
        return quotaUsage.getCountData().a();
    }

    public final c87 Q() {
        return (c87) this.V0.getValue();
    }

    @Override // defpackage.g4
    public final void u(Object obj, List list) {
        d().e("InterceptPaywall onInAppPurchase: " + list);
        this.U0.setValue(izb.a);
    }

    @Override // defpackage.g4
    public final void w(ArrayList arrayList) {
        c87 c87VarQ = Q();
        for (Object obj : arrayList) {
            if (s72.o0(Z0, ((n07) obj).g())) {
                this.V0.setValue(c87.a(c87VarQ, (n07) obj, null, null, false, false, 30));
            }
        }
        obj = null;
        this.V0.setValue(c87.a(c87VarQ, (n07) obj, null, null, false, false, 30));
    }

    @Override // defpackage.g4
    public final void x(String str, List list) {
        Object next;
        str.getClass();
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!s72.o0(Z0, ((o07) next).e));
        o07 o07Var = (o07) next;
        if (o07Var == null) {
            return;
        }
        String str2 = o07Var.b;
        if (str2 == null && (str2 = o07Var.a) == null) {
            str2 = str + ":" + o07Var.c;
        }
        if (this.W0.add(str2)) {
            x1f x1fVar = x1f.a;
            x1f.k(new r05("purchase_succeeded"), new d87(str, this), 2);
        }
    }

    @Override // defpackage.g4
    public final void z() {
        this.V0.setValue(c87.a(Q(), null, null, null, false, true, 31));
    }
}
