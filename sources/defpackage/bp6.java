package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bp6 implements xj5 {
    public final /* synthetic */ xj5 a;

    public bp6(xj5 xj5Var) {
        this.a = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        ap6 ap6Var;
        if (xn2Var instanceof ap6) {
            ap6Var = (ap6) xn2Var;
            int i = ap6Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ap6Var.label = i - Integer.MIN_VALUE;
            } else {
                ap6Var = new ap6(this, xn2Var);
            }
        } else {
            ap6Var = new ap6(this, xn2Var);
        }
        Object obj2 = ap6Var.result;
        int i2 = ap6Var.label;
        if (i2 == 0) {
            jzb.q(obj2);
            xke xkeVar = TarotSkinIdentify.Companion;
            n2f n2fVar = ((yof) obj).g;
            xkeVar.getClass();
            TarotSkinIdentify tarotSkinIdentifyA = xke.a(n2fVar);
            ap6Var.L$0 = null;
            ap6Var.L$1 = null;
            ap6Var.L$2 = null;
            ap6Var.L$3 = null;
            ap6Var.label = 1;
            Object objA = this.a.a(tarotSkinIdentifyA, ap6Var);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj2);
        }
        return wef.a;
    }
}
