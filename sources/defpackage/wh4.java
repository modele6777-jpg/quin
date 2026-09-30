package defpackage;

import android.app.Application;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wh4 implements wj5 {
    public final /* synthetic */ yk5 a;
    public final /* synthetic */ Application b;
    public final /* synthetic */ boolean c;

    public wh4(yk5 yk5Var, Application application, boolean z) {
        this.a = yk5Var;
        this.b = application;
        this.c = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        qh4 qh4Var;
        if (xn2Var instanceof qh4) {
            qh4Var = (qh4) xn2Var;
            int i = qh4Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                qh4Var.label = i - Integer.MIN_VALUE;
            } else {
                qh4Var = new qh4(this, xn2Var);
            }
        } else {
            qh4Var = new qh4(this, xn2Var);
        }
        Object obj = qh4Var.result;
        int i2 = qh4Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            uh4 uh4Var = new uh4(xj5Var, this.b, this.c);
            qh4Var.L$0 = null;
            qh4Var.L$1 = null;
            qh4Var.L$2 = null;
            qh4Var.label = 1;
            Object objB = this.a.b(uh4Var, qh4Var);
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
