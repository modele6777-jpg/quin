package defpackage;

import ai.askquin.ui.conversation.r0;
import java.util.ArrayList;
import java.util.List;
import tech.chatmind.api.RecommendQuestion;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ef4 extends gbe implements l26 {
    int label;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef4(r0 r0Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = r0Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ef4(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            r0 r0Var = this.this$0;
            this.label = 1;
            obj = r0Var.F0(this);
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
        List<RecommendQuestion> list = (List) obj;
        r0 r0Var2 = this.this$0;
        if (!r0Var2.P1 && !ok8.z(r0Var2.R0)) {
            r0 r0Var3 = this.this$0;
            list.getClass();
            ArrayList arrayList = new ArrayList();
            for (RecommendQuestion recommendQuestion : list) {
                String string = v4e.o0(recommendQuestion.getText()).toString();
                if (string.length() <= 0) {
                    string = null;
                }
                RecommendQuestion recommendQuestionCopy$default = string != null ? RecommendQuestion.copy$default(recommendQuestion, null, string, 1, null) : null;
                if (recommendQuestionCopy$default != null) {
                    arrayList.add(recommendQuestionCopy$default);
                }
            }
            List listC1 = s72.c1(arrayList, 3);
            List list2 = listC1.size() == 3 ? listC1 : null;
            if (list2 == null) {
                list2 = pu4.a;
            }
            r0Var3.N1.setValue(list2);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ef4) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
