package defpackage;

import ai.askquin.R;
import java.util.concurrent.CancellationException;
import net.xmind.donut.gp.GooglePay;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x3 extends gbe implements l26 {
    final /* synthetic */ njd $currentPay;
    final /* synthetic */ bwa $product;
    final /* synthetic */ String $profileId;
    int label;
    final /* synthetic */ g4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(njd njdVar, bwa bwaVar, String str, g4 g4Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$currentPay = njdVar;
        this.$product = bwaVar;
        this.$profileId = str;
        this.this$0 = g4Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new x3(this.$currentPay, this.$product, this.$profileId, this.this$0, xn2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        wef wefVar = wef.a;
        try {
            if (i == 0) {
                jzb.q(obj);
                njd njdVar = this.$currentPay;
                bwa bwaVar = this.$product;
                String str = this.$profileId;
                this.label = 1;
                ((GooglePay) njdVar).f(bwaVar, str);
                bw2 bw2Var = bw2.a;
                this = bw2Var;
                if (wefVar == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
                this = this;
            }
        } catch (CancellationException e) {
            g4 g4Var = this.this$0;
            int i2 = g4.O0;
            g4Var.v = false;
            g4Var.K(false);
            g4Var.X = null;
            g4Var.Y = null;
            throw e;
        } catch (Exception e2) {
            this.this$0.d().c("Payment launch failed", e2);
            jcc.k(1, new Integer(R.string.chat_mind_pricing_purchase_fail));
            g4 g4Var2 = this.this$0;
            int i3 = g4.O0;
            if (g4Var2.v) {
                String str2 = g4Var2.X;
                g4Var2.v = false;
                g4Var2.K(false);
                g4Var2.X = null;
                g4Var2.A(str2, "launch_exception");
            }
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((x3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
