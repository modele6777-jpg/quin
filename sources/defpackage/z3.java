package defpackage;

import ai.askquin.R;
import net.xmind.donut.gp.BillingSession;
import net.xmind.donut.gp.BillingSessionOwner;
import net.xmind.donut.gp.GooglePay;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z3 extends gbe implements l26 {
    int label;
    final /* synthetic */ g4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(g4 g4Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = g4Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new z3(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        BillingSession billingSession;
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
            g4Var2.L0 = true;
            g4Var2.X = null;
            GooglePay googlePay = (GooglePay) s2aVar;
            googlePay.d().e("Start querying purchases...");
            BillingSessionOwner billingSessionOwner = googlePay.e;
            synchronized (billingSessionOwner.b) {
                billingSession = billingSessionOwner.d;
            }
            if (billingSession != null) {
                ox0 ox0Var = billingSession.a;
                e4b e4bVar = new e4b();
                e4bVar.a = "subs";
                ox0Var.d(e4bVar.a(), new kc6(googlePay, billingSession, 0));
                return wefVar;
            }
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        z3 z3Var = (z3) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        z3Var.r(wefVar);
        return wefVar;
    }
}
