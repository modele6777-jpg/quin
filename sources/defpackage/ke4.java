package defpackage;

import ai.askquin.ui.conversation.r0;
import tech.chatmind.api.ReadingFeedbackData;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ke4 extends gbe implements l26 {
    final /* synthetic */ String $chatId;
    int label;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke4(r0 r0Var, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = r0Var;
        this.$chatId = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ke4(this.this$0, this.$chatId, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        Object obj2 = null;
        if (i == 0) {
            jzb.q(obj);
            zb5 zb5Var = this.this$0.c;
            String str = this.$chatId;
            this.label = 1;
            ec5 ec5Var = (ec5) zb5Var;
            ec5Var.getClass();
            js3 js3Var = ga4.a;
            obj = ynb.p0(hr3.c, new ac5(ec5Var, str, null), this);
            bw2 bw2Var = bw2.a;
            if (obj == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        ReadingFeedbackData readingFeedbackData = (ReadingFeedbackData) obj;
        wef wefVar = wef.a;
        if (readingFeedbackData == null) {
            return wefVar;
        }
        r0 r0Var = this.this$0;
        int i2 = r0.j2;
        r0Var.t1.setValue(Boolean.FALSE);
        r0 r0Var2 = this.this$0;
        mx4 mx4Var = sfb.e;
        mx4Var.getClass();
        l2 l2Var = new l2(0, mx4Var);
        while (l2Var.hasNext()) {
            Object next = l2Var.next();
            if (pa7.t(((sfb) next).a(), readingFeedbackData.getFeedbackType())) {
                obj2 = next;
                break;
            }
        }
        r0Var2.r1.setValue((sfb) obj2);
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ke4) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
