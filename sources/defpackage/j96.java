package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import tech.chatmind.api.credits.QuotaUsage;
import tech.chatmind.api.giftcard.GiftCardSku;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j96 extends yu0 {
    public static final /* synthetic */ int Y0 = 0;
    public final t7 P0;
    public final fab Q0;
    public final u96 R0;
    public final n26 S0;
    public final m8b T0;
    public final s0e U0;
    public final whb V0;
    public m86 W0;
    public final LinkedHashSet X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j96(t7 t7Var, fab fabVar, u96 u96Var) {
        super(t7Var, hwa.b);
        g96 g96Var = g96.a;
        this.P0 = t7Var;
        this.Q0 = fabVar;
        this.R0 = u96Var;
        this.S0 = g96Var;
        hf8.Q.getClass();
        this.T0 = ef8.a("GiftCardPurchase");
        s0e s0eVarA = t0e.a(new f96(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127));
        this.U0 = s0eVarA;
        this.V0 = if9.n(s0eVarA);
        this.X0 = new LinkedHashSet();
    }

    @Override // defpackage.g4
    public final void A(String str, String str2) {
        Object value;
        f96 f96VarA;
        s0e s0eVar = this.U0;
        String strI = cgg.I(((f96) s0eVar.getValue()).e);
        StringBuilder sbO = ib8.o("Gift card payment failed: plan=", str, ", errorCode=", str2, ", phase=");
        sbO.append(strI);
        this.T0.g(sbO.toString());
        do {
            value = s0eVar.getValue();
            f96VarA = (f96) value;
            e96 e96Var = f96VarA.e;
            if ((e96Var instanceof d96) || (e96Var instanceof x86)) {
                f96VarA = f96.a(f96VarA, null, null, null, null, b96.a, null, null, 111);
            }
        } while (!s0eVar.l(value, f96VarA));
    }

    @Override // defpackage.yu0
    /* JADX INFO: renamed from: O */
    public final boolean r(QuotaUsage quotaUsage) {
        quotaUsage.getClass();
        return false;
    }

    @Override // defpackage.yu0
    /* JADX INFO: renamed from: P */
    public final boolean s(QuotaUsage quotaUsage) {
        quotaUsage.getClass();
        return true;
    }

    public final void Q() {
        Object value;
        f96 f96VarA;
        s0e s0eVar = this.U0;
        e96 e96Var = ((f96) s0eVar.getValue()).e;
        y86 y86Var = e96Var instanceof y86 ? (y86) e96Var : null;
        if (y86Var != null) {
            this.T0.e("Gift card confirmation failure dismissed: orderRef=" + y86Var.a);
        }
        do {
            value = s0eVar.getValue();
            f96VarA = (f96) value;
            e96 e96Var2 = f96VarA.e;
            y86 y86Var2 = e96Var2 instanceof y86 ? (y86) e96Var2 : null;
            if (y86Var2 != null) {
                String str = y86Var2.a;
                Throwable th = y86Var2.b;
                str.getClass();
                th.getClass();
                f96VarA = f96.a(f96VarA, null, null, null, null, new y86(str, th, false), null, null, 111);
            }
        } while (!s0eVar.l(value, f96VarA));
    }

    @Override // defpackage.hf8
    public final m8b d() {
        return this.T0;
    }

    @Override // defpackage.yu0, defpackage.g4
    public final Object i(zn2 zn2Var) {
        return ((rab) this.Q0).b(zn2Var);
    }

    @Override // defpackage.g4
    public final boolean n() {
        return false;
    }

    @Override // defpackage.yu0, defpackage.g4
    public final boolean r(Object obj) {
        ((QuotaUsage) obj).getClass();
        return false;
    }

    @Override // defpackage.yu0, defpackage.g4
    public final boolean s(Object obj) {
        ((QuotaUsage) obj).getClass();
        return true;
    }

    @Override // defpackage.g4
    public final void u(Object obj, List list) throws IOException {
        o07 o07Var;
        String str;
        Object value;
        Object value2;
        Object next;
        String str2;
        m86 m86Var = this.W0;
        s0e s0eVar = this.U0;
        if (m86Var == null) {
            n07 n07Var = (n07) ((f96) s0eVar.getValue()).d.get(((f96) s0eVar.getValue()).a);
            p07 p07VarG = n07Var != null ? n07Var.g() : null;
            m86Var = p07VarG instanceof m86 ? (m86) p07VarG : null;
        }
        String str3 = "Gift card payment callback received: expectedType=" + m86Var + ", details=" + list.size();
        m8b m8bVar = this.T0;
        m8bVar.e(str3);
        if (m86Var != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                o07 o07Var2 = (o07) next;
                if (o07Var2.e == m86Var && (str2 = o07Var2.b) != null && !v4e.Q(str2)) {
                    break;
                }
            }
            o07Var = (o07) next;
        } else {
            o07Var = null;
        }
        if (o07Var == null || (str = o07Var.b) == null || v4e.Q(str)) {
            str = null;
        }
        if (str != null) {
            m8bVar.e("Gift card order confirmation started: orderRef=".concat(str));
            do {
                value = s0eVar.getValue();
            } while (!s0eVar.l(value, f96.a((f96) value, null, null, null, null, new z86(str), null, null, 47)));
            ynb.V(hwf.a(this), null, null, new h96(this, str, null), 3);
            return;
        }
        m8bVar.g("Gift card payment callback missing matching orderRef: expectedType=" + m86Var + ", details=[" + s72.D0(list, null, null, null, new oz5(9), 31) + "]");
        do {
            value2 = s0eVar.getValue();
        } while (!s0eVar.l(value2, f96.a((f96) value2, null, null, null, null, a96.a, null, null, 47)));
    }

    @Override // defpackage.g4
    public final void w(ArrayList arrayList) {
        s0e s0eVar;
        Object value;
        iy9 iy9Var;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            n07 n07Var = (n07) it.next();
            p07 p07VarG = n07Var.g();
            if (p07VarG == m86.a) {
                iy9Var = new iy9(GiftCardSku.OneMonth, n07Var);
            } else {
                iy9Var = p07VarG == m86.b ? new iy9(GiftCardSku.OneYear, n07Var) : null;
            }
            if (iy9Var != null) {
                arrayList2.add(iy9Var);
            }
        }
        Map mapW = bm8.W(arrayList2);
        do {
            s0eVar = this.U0;
            value = s0eVar.getValue();
        } while (!s0eVar.l(value, f96.a((f96) value, null, null, null, mapW, null, null, null, 119)));
        this.T0.e("Gift card product prices updated: received=" + arrayList.size() + ", availableSkus=" + mapW.keySet());
    }

    @Override // defpackage.g4
    public final void z() {
        s0e s0eVar;
        Object value;
        this.T0.b("Gift card product prices unavailable");
        do {
            s0eVar = this.U0;
            value = s0eVar.getValue();
        } while (!s0eVar.l(value, f96.a((f96) value, null, null, null, null, null, null, new IllegalStateException("Gift card prices unavailable"), 63)));
    }
}
