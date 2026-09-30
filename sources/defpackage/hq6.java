package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hq6 implements xj5 {
    public final /* synthetic */ xj5 a;

    public hq6(xj5 xj5Var) {
        this.a = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        gq6 gq6Var;
        if (xn2Var instanceof gq6) {
            gq6Var = (gq6) xn2Var;
            int i = gq6Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                gq6Var.label = i - Integer.MIN_VALUE;
            } else {
                gq6Var = new gq6(this, xn2Var);
            }
        } else {
            gq6Var = new gq6(this, xn2Var);
        }
        Object obj2 = gq6Var.result;
        int i2 = gq6Var.label;
        if (i2 == 0) {
            jzb.q(obj2);
            xke xkeVar = TarotSkinIdentify.Companion;
            n2f n2fVar = ((yof) obj).g;
            xkeVar.getClass();
            TarotSkinIdentify tarotSkinIdentifyA = xke.a(n2fVar);
            gq6Var.L$0 = null;
            gq6Var.L$1 = null;
            gq6Var.L$2 = null;
            gq6Var.L$3 = null;
            gq6Var.label = 1;
            Object objA = this.a.a(tarotSkinIdentifyA, gq6Var);
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
