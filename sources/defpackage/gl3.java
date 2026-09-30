package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gl3 implements xj5 {
    public final /* synthetic */ xj5 a;

    public gl3(xj5 xj5Var) {
        this.a = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        fl3 fl3Var;
        if (xn2Var instanceof fl3) {
            fl3Var = (fl3) xn2Var;
            int i = fl3Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fl3Var.label = i - Integer.MIN_VALUE;
            } else {
                fl3Var = new fl3(this, xn2Var);
            }
        } else {
            fl3Var = new fl3(this, xn2Var);
        }
        Object obj2 = fl3Var.result;
        int i2 = fl3Var.label;
        if (i2 == 0) {
            jzb.q(obj2);
            Set setO1 = s72.o1(((yof) obj).f);
            fl3Var.L$0 = null;
            fl3Var.L$1 = null;
            fl3Var.L$2 = null;
            fl3Var.L$3 = null;
            fl3Var.label = 1;
            Object objA = this.a.a(setO1, fl3Var);
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
