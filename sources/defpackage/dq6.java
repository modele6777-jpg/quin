package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dq6 implements xj5 {
    public final /* synthetic */ xj5 a;

    public dq6(xj5 xj5Var) {
        this.a = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        cq6 cq6Var;
        if (xn2Var instanceof cq6) {
            cq6Var = (cq6) xn2Var;
            int i = cq6Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cq6Var.label = i - Integer.MIN_VALUE;
            } else {
                cq6Var = new cq6(this, xn2Var);
            }
        } else {
            cq6Var = new cq6(this, xn2Var);
        }
        Object obj2 = cq6Var.result;
        int i2 = cq6Var.label;
        if (i2 == 0) {
            jzb.q(obj2);
            List list = ((lb8) obj).n;
            cq6Var.L$0 = null;
            cq6Var.L$1 = null;
            cq6Var.L$2 = null;
            cq6Var.L$3 = null;
            cq6Var.label = 1;
            Object objA = this.a.a(list, cq6Var);
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
