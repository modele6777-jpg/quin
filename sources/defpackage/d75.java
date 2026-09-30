package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d75 extends gbe implements o26 {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        String str = (String) this.L$0;
        String str2 = (String) this.L$1;
        List<nn4> list = (List) this.L$2;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        int i = 0;
        if (list == null || !list.isEmpty()) {
            for (nn4 nn4Var : list) {
                if (pa7.t(nn4Var.a, str) && pa7.t(nn4Var.b, str2) && (i = i + 1) < 0) {
                    t72.Y();
                    throw null;
                }
            }
        }
        return new Integer(i);
    }

    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        d75 d75Var = new d75(4, (xn2) obj4);
        d75Var.L$0 = (String) obj;
        d75Var.L$1 = (String) obj2;
        d75Var.L$2 = (List) obj3;
        return d75Var.r(wef.a);
    }
}
