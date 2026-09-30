package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a02 extends gbe implements l26 {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        a02 a02Var = new a02(2, xn2Var);
        a02Var.L$0 = obj;
        return a02Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        List list = (List) this.L$0;
        if (this.label == 0) {
            jzb.q(obj);
            return Boolean.valueOf(!list.isEmpty());
        }
        qc0.p("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((a02) k((xn2) obj2, (List) obj)).r(wef.a);
    }
}
