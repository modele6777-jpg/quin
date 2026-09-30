package defpackage;

import ai.askquin.ui.conversation.r0;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class we4 implements wj5 {
    public final /* synthetic */ kl5 a;
    public final /* synthetic */ r0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ zc4 d;
    public final /* synthetic */ Context e;

    public we4(kl5 kl5Var, r0 r0Var, String str, zc4 zc4Var, Context context) {
        this.a = kl5Var;
        this.b = r0Var;
        this.c = str;
        this.d = zc4Var;
        this.e = context;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        te4 te4Var;
        if (xn2Var instanceof te4) {
            te4Var = (te4) xn2Var;
            int i = te4Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                te4Var.label = i - Integer.MIN_VALUE;
            } else {
                te4Var = new te4(this, xn2Var);
            }
        } else {
            te4Var = new te4(this, xn2Var);
        }
        Object obj = te4Var.result;
        int i2 = te4Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            ve4 ve4Var = new ve4(xj5Var, this.b, this.c, this.d, this.e);
            te4Var.L$0 = null;
            te4Var.L$1 = null;
            te4Var.L$2 = null;
            te4Var.label = 1;
            Object objB = this.a.b(ve4Var, te4Var);
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
