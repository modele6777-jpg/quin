package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ws3 implements xj5 {
    public final /* synthetic */ xj5 a;
    public final /* synthetic */ TarotSkinIdentify b;

    public ws3(xj5 xj5Var, TarotSkinIdentify tarotSkinIdentify) {
        this.a = xj5Var;
        this.b = tarotSkinIdentify;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        vs3 vs3Var;
        if (xn2Var instanceof vs3) {
            vs3Var = (vs3) xn2Var;
            int i = vs3Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                vs3Var.label = i - Integer.MIN_VALUE;
            } else {
                vs3Var = new vs3(this, xn2Var);
            }
        } else {
            vs3Var = new vs3(this, xn2Var);
        }
        Object obj2 = vs3Var.result;
        int i2 = vs3Var.label;
        if (i2 == 0) {
            jzb.q(obj2);
            TarotSkinIdentify tarotSkinIdentify = this.b;
            hmd hmdVar = (hmd) ((Map) obj).get(tarotSkinIdentify);
            if (hmdVar == null) {
                hmdVar = new hmd(tarotSkinIdentify.getRequiresDownload() ? gmd.b : gmd.a, 0.0f, 6);
            }
            vs3Var.L$0 = null;
            vs3Var.L$1 = null;
            vs3Var.L$2 = null;
            vs3Var.L$3 = null;
            vs3Var.label = 1;
            Object objA = this.a.a(hmdVar, vs3Var);
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
