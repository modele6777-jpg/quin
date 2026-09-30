package defpackage;

import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.draw.model.DrawCardSaves;
import android.content.Context;
import tech.chatmind.api.events.model.EventType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ej4 extends gbe implements l26 {
    final /* synthetic */ Context $context;
    final /* synthetic */ m25 $eventViewModel;
    final /* synthetic */ zc4 $precedingState;
    final /* synthetic */ tr2 $this_DraftingQuestion;
    final /* synthetic */ r0 $vm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej4(r0 r0Var, Context context, zc4 zc4Var, tr2 tr2Var, m25 m25Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$vm = r0Var;
        this.$context = context;
        this.$precedingState = zc4Var;
        this.$this_DraftingQuestion = tr2Var;
        this.$eventViewModel = m25Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ej4(this.$vm, this.$context, this.$precedingState, this.$this_DraftingQuestion, this.$eventViewModel, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        ej4 ej4Var;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            r0 r0Var = this.$vm;
            Context context = this.$context;
            zc4 zc4Var = this.$precedingState;
            this.label = 1;
            ej4Var = this;
            obj = r0.Q0(r0Var, context, zc4Var, null, ej4Var, 4);
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
            ej4Var = this;
        }
        DrawCardSaves drawCardSaves = (DrawCardSaves) obj;
        if (drawCardSaves != null) {
            tr2 tr2Var = ej4Var.$this_DraftingQuestion;
            m25 m25Var = ej4Var.$eventViewModel;
            zc4 zc4Var2 = ej4Var.$precedingState;
            tr2Var.b(drawCardSaves);
            String str = zc4Var2.f;
            if (str == null) {
                str = "";
            }
            m25Var.getClass();
            qn2 qn2Var = lw2.a;
            js3 js3Var = ga4.a;
            hr3 hr3Var = hr3.c;
            ynb.V(qn2Var, hr3Var, null, new y05(m25Var, str, null), 2);
            if (zc4Var2.e == f1d.b) {
                EventType eventType = EventType.DAILY;
                String str2 = zc4Var2.f;
                String str3 = str2 != null ? str2 : "";
                eventType.getClass();
                ynb.V(qn2Var, hr3Var, null, new g15(eventType, str3, null), 2);
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ej4) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
