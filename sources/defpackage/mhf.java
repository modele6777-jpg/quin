package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import tech.chatmind.api.credits.QuotaUsage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mhf extends yu0 {
    public static final /* synthetic */ int a1 = 0;
    public final t7 P0;
    public final q9b Q0;
    public final int R0;
    public final s0e S0;
    public final whb T0;
    public ArrayList U0;
    public ArrayList V0;
    public bwa W0;
    public final LinkedHashSet X0;
    public boolean Y0;
    public boolean Z0;

    public mhf(t7 t7Var, q9b q9bVar, int i) {
        super(t7Var, null);
        this.P0 = t7Var;
        this.Q0 = q9bVar;
        this.R0 = i;
        s0e s0eVarA = t0e.a(new jhf(pu4.a, null, true, false, false, false, false, false));
        this.S0 = s0eVarA;
        this.T0 = if9.n(s0eVarA);
        this.X0 = new LinkedHashSet();
        if (i < 0 || i >= 2) {
            qc0.j("Failed requirement.");
            throw null;
        }
        ynb.V(hwf.a(this), null, null, new khf(this, null), 3);
    }

    public static void Q(mhf mhfVar, String str, String str2, String str3, int i) {
        String str4 = (i & 2) != 0 ? null : str2;
        String str5 = (i & 4) != 0 ? null : str3;
        mhfVar.getClass();
        x1f x1fVar = x1f.a;
        x1f.k(new r05(str), new wca(mhfVar, str, str4, str5, 8), 2);
    }

    @Override // defpackage.g4
    public final void A(String str, String str2) {
        this.W0 = null;
    }

    @Override // defpackage.g4
    public final void C(Object obj) {
        QuotaUsage quotaUsage = (QuotaUsage) obj;
        if (quotaUsage != null) {
            S(quotaUsage);
        }
    }

    @Override // defpackage.g4
    public final void D(ArrayList arrayList) {
        this.U0 = arrayList;
        R();
    }

    @Override // defpackage.g4
    public final void E(String str) {
        s0e s0eVar;
        Object value;
        str.getClass();
        if (this.W0 instanceof z6e) {
            this.W0 = null;
            do {
                s0eVar = this.S0;
                value = s0eVar.getValue();
            } while (!s0eVar.l(value, jhf.a((jhf) value, null, null, false, false, false, false, 223)));
            Q(this, "subscribe_succeeded", null, str, 2);
        }
    }

    public final void R() {
        ArrayList arrayList;
        Object next;
        Object next2;
        Object next3;
        s0e s0eVar;
        Object value;
        jhf jhfVar;
        Object next4;
        bwa bwaVar;
        boolean z;
        cwa type;
        bwa bwaVar2;
        Object next5;
        ArrayList arrayList2 = this.U0;
        if (arrayList2 == null || (arrayList = this.V0) == null) {
            return;
        }
        Iterator it = arrayList2.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((z6e) next).h() != u7e.b);
        z6e z6eVar = (z6e) next;
        Iterator it2 = arrayList2.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (((z6e) next2).h() != u7e.c);
        z6e z6eVar2 = (z6e) next2;
        Iterator it3 = arrayList.iterator();
        do {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
        } while (((n07) next3).g() != thb.a);
        n07 n07Var = (n07) next3;
        if (n07Var == null) {
            Iterator it4 = arrayList.iterator();
            do {
                if (!it4.hasNext()) {
                    next5 = null;
                    break;
                }
                next5 = it4.next();
            } while (((n07) next5).g() != thb.e);
            n07Var = (n07) next5;
        }
        List listK0 = qd0.k0(new bwa[]{z6eVar, z6eVar2, n07Var});
        do {
            s0eVar = this.S0;
            value = s0eVar.getValue();
            jhfVar = (jhf) value;
            ArrayList arrayList3 = (ArrayList) listK0;
            Iterator it5 = arrayList3.iterator();
            do {
                if (!it5.hasNext()) {
                    next4 = null;
                    break;
                } else {
                    next4 = it5.next();
                    type = ((bwa) next4).getType();
                    bwaVar2 = jhfVar.b;
                }
            } while (!pa7.t(type, bwaVar2 != null ? bwaVar2.getType() : null));
            bwa bwaVar3 = (bwa) next4;
            bwaVar = bwaVar3 == null ? z6eVar2 : bwaVar3;
            if (arrayList3.size() != 3) {
                z = true;
            } else {
                if (!arrayList3.isEmpty()) {
                    Iterator it6 = arrayList3.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            if (v4e.Q(((bwa) it6.next()).y())) {
                                z = true;
                            }
                        }
                    }
                }
                z = false;
            }
        } while (!s0eVar.l(value, jhf.a(jhfVar, listK0, bwaVar, z, false, false, false, 240)));
    }

    public final void S(QuotaUsage quotaUsage) {
        s0e s0eVar;
        Object value;
        do {
            s0eVar = this.S0;
            value = s0eVar.getValue();
        } while (!s0eVar.l(value, jhf.a((jhf) value, null, null, false, quotaUsage != null ? pa7.t(quotaUsage.getNeverPurchased(), Boolean.TRUE) : false, quotaUsage != null && quotaUsage.getHasSubscription(), false, 175)));
    }

    @Override // defpackage.g4
    public final void w(ArrayList arrayList) {
        this.V0 = arrayList;
        R();
    }

    @Override // defpackage.g4
    public final void x(String str, List list) {
        Object next;
        str.getClass();
        bwa bwaVar = this.W0;
        n07 n07Var = bwaVar instanceof n07 ? (n07) bwaVar : null;
        if (n07Var == null) {
            return;
        }
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((o07) next).e.equals(n07Var.g()));
        o07 o07Var = (o07) next;
        if (o07Var == null) {
            return;
        }
        String str2 = o07Var.b;
        if (str2 == null && (str2 = o07Var.a) == null) {
            str2 = str + ":" + o07Var.c;
        }
        if (this.X0.add(str2)) {
            this.W0 = null;
            Q(this, "purchase_succeeded", null, thb.a.a(), 2);
        }
    }

    @Override // defpackage.g4
    public final void z() {
        s0e s0eVar;
        Object value;
        do {
            s0eVar = this.S0;
            value = s0eVar.getValue();
        } while (!s0eVar.l(value, jhf.a((jhf) value, null, null, true, false, false, false, 243)));
    }
}
