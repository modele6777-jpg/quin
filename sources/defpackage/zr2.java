package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.paywall.PaywallRoute;
import ai.askquin.ui.paywall.c;
import ai.askquin.ui.popup.dailyfortune.v;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zr2 implements x16 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;

    public /* synthetic */ zr2(tr2 tr2Var, x16 x16Var, mma mmaVar, Context context, r0 r0Var, TarotSkinIdentify tarotSkinIdentify, e89 e89Var, e89 e89Var2) {
        this.d = tr2Var;
        this.e = mmaVar;
        this.f = context;
        this.g = r0Var;
        this.v = tarotSkinIdentify;
        this.b = e89Var;
        this.c = e89Var2;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        int i2 = 1;
        wef wefVar = wef.a;
        Object obj = this.v;
        Object obj2 = this.g;
        Object obj3 = this.c;
        Object obj4 = this.b;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        switch (i) {
            case 0:
                lt2.c((mma) obj6, (Context) obj5, (r0) obj2, (TarotSkinIdentify) obj, (e89) obj4, (e89) obj3, new ds2((tr2) obj7, 0));
                break;
            case 1:
                l26 l26Var = (l26) obj7;
                s69 s69Var = (s69) obj2;
                e89 e89Var = (e89) obj4;
                s69 s69Var2 = (s69) obj;
                e89 e89Var2 = (e89) obj3;
                ((qz9) ((n69) obj6)).k(0.0f);
                sz9 sz9Var = (sz9) ((s69) obj5);
                if (sz9Var.j() >= 0) {
                    sz9 sz9Var2 = (sz9) s69Var;
                    if (sz9Var2.j() >= 0) {
                        l26Var.z(Integer.valueOf(sz9Var.j()), Integer.valueOf(sz9Var2.j()));
                    }
                }
                sz9Var.k(-1);
                e89Var.setValue(new hl9(0L));
                ((sz9) s69Var).k(-1);
                ((sz9) s69Var2).k(0);
                e89Var2.setValue(null);
                break;
            case 2:
                ynb.V((aw2) obj7, null, null, new kp4((sdd) obj6, (e89) obj4, (a26) obj5, (e89) obj3, (e89) obj2, (String) obj, null), 3);
                break;
            case 3:
                aw2 aw2Var = (aw2) obj6;
                PaywallRoute.InterceptPaywall interceptPaywall = (PaywallRoute.InterceptPaywall) obj5;
                v vVar = (v) obj2;
                cb9 cb9Var = (cb9) obj;
                q9b q9bVar = (q9b) obj4;
                dc9 dc9Var = (dc9) obj3;
                if (((k4a) obj7).a.compareAndSet(false, true)) {
                    ynb.V(aw2Var, null, null, new c(interceptPaywall, vVar, cb9Var, q9bVar, dc9Var, null), 3);
                }
                break;
            default:
                y3a y3aVar = (y3a) obj7;
                x16 x16Var = (x16) obj6;
                Context context = (Context) obj5;
                e89 e89Var3 = (e89) obj4;
                e89 e89Var4 = (e89) obj3;
                String str = (String) obj2;
                p5a p5aVar = (p5a) obj;
                if (!y3aVar.q()) {
                    y5a y5aVar = (y5a) e89Var3.getValue();
                    x5a x5aVar = y5aVar instanceof x5a ? (x5a) y5aVar : null;
                    if (x5aVar != null && x5aVar.g.contains((bwa) e89Var4.getValue())) {
                        if (!x5aVar.b) {
                            x16Var.invoke();
                        } else {
                            bwa bwaVar = (bwa) e89Var4.getValue();
                            if (bwaVar != null) {
                                String strI = ym8.I(bwaVar);
                                String strP = ym8.P(bwaVar);
                                x1f x1fVar = x1f.a;
                                x1f.k(new r05("paywall_action"), new wg(strI, str, (Object) strP, (Object) p5aVar, 29), 2);
                            }
                            context.getClass();
                            bwa bwaVar2 = (bwa) y3aVar.U0.getValue();
                            if (bwaVar2 != null) {
                                Object value = y3aVar.b1.a.getValue();
                                x5a x5aVar2 = value instanceof x5a ? (x5a) value : null;
                                if (x5aVar2 != null) {
                                    if (!x5aVar2.g.contains(bwaVar2)) {
                                        y3aVar.d().b("cannot purchase or upgrade, product not purchasable: " + bwaVar2 + ", state: " + x5aVar2);
                                        jcc.k(0, Integer.valueOf(R.string.unknown_error));
                                    } else {
                                        y3aVar.V0 = bwaVar2;
                                        y3aVar.Y0.setValue(Boolean.FALSE);
                                        if (pa7.t(y3aVar.T0, "onboarding_finish")) {
                                            final String strB = z3a.b(bwaVar2);
                                            final double dC = z3a.c(bwaVar2);
                                            final String strA = z3a.a(bwaVar2);
                                            strB.getClass();
                                            strA.getClass();
                                            a26 a26Var = new a26() { // from class: sp9
                                                @Override // defpackage.a26
                                                public final Object d(Object obj8) {
                                                    l1f l1fVar = (l1f) obj8;
                                                    l1fVar.getClass();
                                                    l1fVar.a(strB, "plan");
                                                    l1fVar.a(Double.valueOf(dC), "price");
                                                    l1fVar.a(strA, "currency");
                                                    return wef.a;
                                                }
                                            };
                                            ca2.a.getClass();
                                            if (ca2.c) {
                                                x1f x1fVar2 = x1f.a;
                                                x1f.k(new r05("subscription_tap"), a26Var, 2);
                                            }
                                        }
                                        y41.N(y3aVar.P0, context, new bv9(bwaVar2, x5aVar2, y3aVar, i2), 2);
                                    }
                                }
                            }
                        }
                    }
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ zr2(aw2 aw2Var, sdd sddVar, e89 e89Var, a26 a26Var, e89 e89Var2, e89 e89Var3, String str) {
        this.d = aw2Var;
        this.e = sddVar;
        this.b = e89Var;
        this.f = a26Var;
        this.c = e89Var2;
        this.g = e89Var3;
        this.v = str;
    }

    public /* synthetic */ zr2(l26 l26Var, n69 n69Var, s69 s69Var, s69 s69Var2, e89 e89Var, s69 s69Var3, e89 e89Var2) {
        this.d = l26Var;
        this.e = n69Var;
        this.f = s69Var;
        this.g = s69Var2;
        this.b = e89Var;
        this.v = s69Var3;
        this.c = e89Var2;
    }

    public /* synthetic */ zr2(y3a y3aVar, x16 x16Var, Context context, e89 e89Var, e89 e89Var2, String str, p5a p5aVar) {
        this.d = y3aVar;
        this.e = x16Var;
        this.f = context;
        this.b = e89Var;
        this.c = e89Var2;
        this.g = str;
        this.v = p5aVar;
    }

    public /* synthetic */ zr2(k4a k4aVar, aw2 aw2Var, PaywallRoute.InterceptPaywall interceptPaywall, v vVar, cb9 cb9Var, q9b q9bVar, dc9 dc9Var) {
        this.d = k4aVar;
        this.e = aw2Var;
        this.f = interceptPaywall;
        this.g = vVar;
        this.v = cb9Var;
        this.b = q9bVar;
        this.c = dc9Var;
    }
}
