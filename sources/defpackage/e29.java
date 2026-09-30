package defpackage;

import android.app.Application;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class e29 implements wj5 {
    public final /* synthetic */ yk5 a;
    public final /* synthetic */ Application b;

    public e29(yk5 yk5Var, Application application) {
        this.a = yk5Var;
        this.b = application;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        b29 b29Var;
        if (xn2Var instanceof b29) {
            b29Var = (b29) xn2Var;
            int i = b29Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                b29Var.label = i - Integer.MIN_VALUE;
            } else {
                b29Var = new b29(this, xn2Var);
            }
        } else {
            b29Var = new b29(this, xn2Var);
        }
        Object obj = b29Var.result;
        int i2 = b29Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            d29 d29Var = new d29(xj5Var, this.b);
            b29Var.L$0 = null;
            b29Var.L$1 = null;
            b29Var.L$2 = null;
            b29Var.label = 1;
            Object objB = this.a.b(d29Var, b29Var);
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
