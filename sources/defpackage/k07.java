package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k07 implements xj5 {
    public final /* synthetic */ xj5 a;

    public k07(xj5 xj5Var) {
        this.a = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        j07 j07Var;
        if (xn2Var instanceof j07) {
            j07Var = (j07) xn2Var;
            int i = j07Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                j07Var.label = i - Integer.MIN_VALUE;
            } else {
                j07Var = new j07(this, xn2Var);
            }
        } else {
            j07Var = new j07(this, xn2Var);
        }
        Object obj2 = j07Var.result;
        int i2 = j07Var.label;
        if (i2 == 0) {
            jzb.q(obj2);
            List list = (List) obj;
            Object f07Var = list.isEmpty() ? d07.a : new f07(list);
            j07Var.L$0 = null;
            j07Var.L$1 = null;
            j07Var.L$2 = null;
            j07Var.L$3 = null;
            j07Var.label = 1;
            Object objA = this.a.a(f07Var, j07Var);
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
