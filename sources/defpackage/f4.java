package defpackage;

import ai.askquin.R;
import android.text.TextUtils;
import defpackage.e3a;
import defpackage.k47;
import defpackage.m8b;
import defpackage.o2b;
import defpackage.pa7;
import defpackage.qc0;
import defpackage.qx0;
import defpackage.rx0;
import defpackage.szc;
import defpackage.t72;
import defpackage.tx0;
import defpackage.v71;
import defpackage.vpf;
import defpackage.ynb;
import defpackage.z6e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.xmind.donut.gp.BillingSession;
import net.xmind.donut.gp.BillingSessionOwner;
import net.xmind.donut.gp.GooglePay;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f4 extends gbe implements l26 {
    final /* synthetic */ z6e $product;
    final /* synthetic */ String $profileId;
    int label;
    final /* synthetic */ g4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(g4 g4Var, z6e z6eVar, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = g4Var;
        this.$product = z6eVar;
        this.$profileId = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new f4(this.this$0, this.$product, this.$profileId, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        final BillingSession billingSession;
        wef wefVar = wef.a;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        g4 g4Var = this.this$0;
        if (g4Var.w) {
            kv2.u(R.string.chat_mind_pricing_google_billing_unavailable, 1);
            return wefVar;
        }
        njd njdVar = g4Var.x;
        s2a s2aVar = njdVar instanceof s2a ? (s2a) njdVar : null;
        if (s2aVar != null && g4Var.h(s2aVar) == null) {
            g4 g4Var2 = this.this$0;
            g4Var2.v = true;
            g4Var2.X = ym8.P(this.$product);
            this.this$0.Y = this.$product.h().b();
            g4 g4Var3 = this.this$0;
            g4Var3.E0 = false;
            g4Var3.F0++;
            final z6e z6eVar = this.$product;
            final String str = this.$profileId;
            final GooglePay googlePay = (GooglePay) s2aVar;
            z6eVar.getClass();
            BillingSessionOwner billingSessionOwner = googlePay.e;
            synchronized (billingSessionOwner.b) {
                billingSession = billingSessionOwner.d;
            }
            if (billingSession != null) {
                ox0 ox0Var = billingSession.a;
                e4b e4bVar = new e4b();
                e4bVar.a = "subs";
                ox0Var.d(e4bVar.a(), new q2b() { // from class: net.xmind.donut.gp.a
                    @Override // defpackage.q2b
                    public final void a(tx0 tx0Var, List list) {
                        o2b o2bVar;
                        Object next;
                        int i = GooglePay.g;
                        tx0Var.getClass();
                        list.getClass();
                        GooglePay googlePay2 = googlePay;
                        BillingSessionOwner billingSessionOwner2 = googlePay2.e;
                        BillingSession billingSession2 = billingSession;
                        if (billingSessionOwner2.b(billingSession2)) {
                            boolean z = true;
                            if (tx0Var.a == 0) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                    o2b o2bVar2 = (o2b) next;
                                    if (o2bVar2.b() == 1) {
                                        k47 k47VarA = o2bVar2.a();
                                        if (pa7.t(k47VarA != null ? (String) k47VarA.b : null, googlePay2.b)) {
                                            break;
                                        }
                                    }
                                }
                                o2bVar = (o2b) next;
                            } else {
                                o2bVar = null;
                            }
                            if (o2bVar == null) {
                                googlePay2.j("Fail to query current subscription purchases: " + tx0Var.a + ", " + tx0Var.c);
                                googlePay2.d.a(e3a.a);
                                return;
                            }
                            m8b m8bVarD = googlePay2.d();
                            StringBuilder sb = new StringBuilder("Upgrade: ");
                            sb.append(o2bVar);
                            sb.append(" -> ");
                            z6e z6eVar2 = z6eVar;
                            sb.append(z6eVar2);
                            m8bVarD.e(sb.toString());
                            szc szcVar = new szc(8, false);
                            v71 v71Var = new v71();
                            v71Var.b = 0;
                            v71Var.a = true;
                            szcVar.e = v71Var;
                            String str2 = googlePay2.b;
                            str2.getClass();
                            szcVar.b = str2;
                            String str3 = str;
                            if (str3 == null) {
                                str3 = googlePay2.b;
                                str3.getClass();
                            }
                            szcVar.c = str3;
                            szcVar.d = new ArrayList(t72.H((qx0) z6eVar2.a));
                            String strC = o2bVar.c();
                            if (TextUtils.isEmpty(strC) && TextUtils.isEmpty(null)) {
                                z = false;
                            }
                            boolean zIsEmpty = TextUtils.isEmpty(null);
                            if (z && !zIsEmpty) {
                                qc0.j("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                                return;
                            }
                            if (!z && zIsEmpty) {
                                qc0.j("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                                return;
                            }
                            rx0 rx0Var = new rx0();
                            rx0Var.a = strC;
                            rx0Var.b = 5;
                            v71 v71Var2 = new v71();
                            v71Var2.c = rx0Var.a;
                            v71Var2.b = rx0Var.b;
                            szcVar.e = v71Var2;
                            ynb.V(vpf.H(googlePay2.a), null, null, new GooglePay$upgrade$1$2(googlePay2, billingSession2, szcVar.B(), null), 3);
                        }
                    }
                });
                return wefVar;
            }
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        f4 f4Var = (f4) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        f4Var.r(wefVar);
        return wefVar;
    }
}
