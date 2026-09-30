package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ymd implements xj5 {
    public final /* synthetic */ xj5 a;

    public ymd(xj5 xj5Var) {
        this.a = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        xmd xmdVar;
        if (xn2Var instanceof xmd) {
            xmdVar = (xmd) xn2Var;
            int i = xmdVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                xmdVar.label = i - Integer.MIN_VALUE;
            } else {
                xmdVar = new xmd(this, xn2Var);
            }
        } else {
            xmdVar = new xmd(this, xn2Var);
        }
        Object obj2 = xmdVar.result;
        int i2 = xmdVar.label;
        if (i2 == 0) {
            jzb.q(obj2);
            List list = ((yof) obj).f;
            xmdVar.L$0 = null;
            xmdVar.L$1 = null;
            xmdVar.L$2 = null;
            xmdVar.L$3 = null;
            xmdVar.label = 1;
            Object objA = this.a.a(list, xmdVar);
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
