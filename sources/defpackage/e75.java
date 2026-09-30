package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class e75 extends gbe implements n26 {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        e75 e75Var = new e75(3, (xn2) obj3);
        e75Var.L$0 = (List) obj;
        e75Var.L$1 = (List) obj2;
        return e75Var.r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        List list = (List) this.L$0;
        List list2 = (List) this.L$1;
        if (this.label == 0) {
            jzb.q(obj);
            return s72.Q0(list, list2);
        }
        qc0.p("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
