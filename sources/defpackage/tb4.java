package defpackage;

import java.time.Instant;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tb4 extends gbe implements a26 {
    final /* synthetic */ String $accountId;
    final /* synthetic */ Instant $deletedAt;
    final /* synthetic */ List<String> $keepChatIds;
    int label;
    final /* synthetic */ vb4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb4(vb4 vb4Var, String str, List list, Instant instant, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = vb4Var;
        this.$accountId = str;
        this.$keepChatIds = list;
        this.$deletedAt = instant;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new tb4(this.this$0, this.$accountId, this.$keepChatIds, this.$deletedAt, (xn2) obj).r(wef.a);
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
        vb4 vb4Var = this.this$0;
        String str = this.$accountId;
        List<String> list = this.$keepChatIds;
        Instant instant = this.$deletedAt;
        this.label = 1;
        vb4Var.getClass();
        Object objD = nb4.d(vb4Var, str, list, instant, this);
        bw2 bw2Var = bw2.a;
        return objD == bw2Var ? bw2Var : objD;
    }
}
