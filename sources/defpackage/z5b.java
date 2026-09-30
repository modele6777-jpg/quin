package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z5b extends gbe implements n26 {
    /* synthetic */ int I$0;
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        z5b z5bVar = new z5b(3, (xn2) obj3);
        z5bVar.I$0 = iIntValue;
        z5bVar.L$0 = (List) obj2;
        return z5bVar.r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.I$0;
        List list = (List) this.L$0;
        if (this.label == 0) {
            jzb.q(obj);
            return new t5b(list, i);
        }
        qc0.p("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
