package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l6b extends gbe implements a26 {
    final /* synthetic */ List<x6b> $snapshots;
    int label;
    final /* synthetic */ n6b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6b(n6b n6bVar, List list, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = n6bVar;
        this.$snapshots = list;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new l6b(this.this$0, this.$snapshots, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            n6b n6bVar = this.this$0;
            List<x6b> list = this.$snapshots;
            this.label = 1;
            n6bVar.getClass();
            Object objA = g6b.a(n6bVar, list, this);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }
}
