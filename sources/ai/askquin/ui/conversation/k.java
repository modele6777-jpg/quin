package ai.askquin.ui.conversation;

import defpackage.a26;
import defpackage.ap;
import defpackage.gbe;
import defpackage.jzb;
import defpackage.l26;
import defpackage.lp5;
import defpackage.mp5;
import defpackage.np5;
import defpackage.op5;
import defpackage.qc0;
import defpackage.v4e;
import defpackage.wef;
import defpackage.xn2;
import tech.chatmind.api.TarotReadingHistory;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends gbe implements l26 {
    final /* synthetic */ String $messageId;
    final /* synthetic */ a26 $onTextCompleted;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(a26 a26Var, r0 r0Var, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.$onTextCompleted = a26Var;
        this.this$0 = r0Var;
        this.$messageId = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        k kVar = new k(this.$onTextCompleted, this.this$0, this.$messageId, xn2Var);
        kVar.L$0 = obj;
        return kVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        op5 op5Var = (op5) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (op5Var instanceof lp5) {
            lp5 lp5Var = (lp5) op5Var;
            String str = lp5Var.a;
            if (v4e.Q(str)) {
                r0 r0Var = this.this$0;
                String str2 = this.$messageId;
                int i = r0.j2;
                r0Var.x(str2);
            } else {
                this.$onTextCompleted.d(str);
            }
            r0 r0Var2 = this.this$0;
            TarotReadingHistory tarotReadingHistory = lp5Var.b;
            int i2 = r0.j2;
            r0Var2.N0(tarotReadingHistory);
        } else if (!(op5Var instanceof np5) && !(op5Var instanceof mp5)) {
            ap.c();
            return null;
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        k kVar = (k) k((xn2) obj2, (op5) obj);
        wef wefVar = wef.a;
        kVar.r(wefVar);
        return wefVar;
    }
}
