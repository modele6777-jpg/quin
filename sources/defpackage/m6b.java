package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m6b extends gbe implements a26 {
    final /* synthetic */ String $accountId;
    final /* synthetic */ List<String> $keepChatIds;
    int label;
    final /* synthetic */ n6b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6b(n6b n6bVar, String str, List list, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = n6bVar;
        this.$accountId = str;
        this.$keepChatIds = list;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new m6b(this.this$0, this.$accountId, this.$keepChatIds, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return obj;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        n6b n6bVar = this.this$0;
        String str = this.$accountId;
        List<String> list = this.$keepChatIds;
        this.label = 1;
        n6bVar.getClass();
        Object objB = g6b.b(n6bVar, str, list, this);
        bw2 bw2Var = bw2.a;
        return objB == bw2Var ? bw2Var : objB;
    }
}
