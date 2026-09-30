package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xs3 implements wj5 {
    public final /* synthetic */ wj5 a;
    public final /* synthetic */ TarotSkinIdentify b;

    public xs3(s0e s0eVar, TarotSkinIdentify tarotSkinIdentify) {
        this.a = s0eVar;
        this.b = tarotSkinIdentify;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        us3 us3Var;
        if (xn2Var instanceof us3) {
            us3Var = (us3) xn2Var;
            int i = us3Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                us3Var.label = i - Integer.MIN_VALUE;
            } else {
                us3Var = new us3(this, xn2Var);
            }
        } else {
            us3Var = new us3(this, xn2Var);
        }
        Object obj = us3Var.result;
        int i2 = us3Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            ws3 ws3Var = new ws3(xj5Var, this.b);
            us3Var.L$0 = null;
            us3Var.L$1 = null;
            us3Var.L$2 = null;
            us3Var.label = 1;
            Object objB = this.a.b(ws3Var, us3Var);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }
}
