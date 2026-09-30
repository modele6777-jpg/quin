package defpackage;

import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.draw.model.DrawCardSaves;
import android.content.Context;
import com.adjust.sdk.Constants;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wr2 extends gbe implements l26 {
    final /* synthetic */ Context $context;
    final /* synthetic */ m25 $eventViewModel;
    final /* synthetic */ dc9 $navigationViewModel;
    final /* synthetic */ tr2 $this_ConsumeLaunchArgumentsEffect;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr2(dc9 dc9Var, tr2 tr2Var, Context context, m25 m25Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$navigationViewModel = dc9Var;
        this.$this_ConsumeLaunchArgumentsEffect = tr2Var;
        this.$context = context;
        this.$eventViewModel = m25Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        wr2 wr2Var = new wr2(this.$navigationViewModel, this.$this_ConsumeLaunchArgumentsEffect, this.$context, this.$eventViewModel, xn2Var);
        wr2Var.L$0 = obj;
        return wr2Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        wr2 wr2Var;
        ir2 ir2Var;
        aw2 aw2Var = (aw2) this.L$0;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            dc9 dc9Var = this.$navigationViewModel;
            ir2 ir2Var2 = (ir2) dc9Var.b.getValue();
            dc9Var.h(null);
            dc9 dc9Var2 = this.$navigationViewModel;
            dc9Var2.c.setValue(null);
            dc9Var2.d = Constants.NORMAL;
            if (ir2Var2 instanceof fr2) {
                r0 r0Var = this.$this_ConsumeLaunchArgumentsEffect.c;
                Context context = this.$context;
                this.L$0 = null;
                this.L$1 = ir2Var2;
                this.label = 1;
                wr2Var = this;
                obj = r0.Q0(r0Var, context, null, null, wr2Var, 6);
                bw2 bw2Var = bw2.a;
                if (obj == bw2Var) {
                    return bw2Var;
                }
                ir2Var = ir2Var2;
            } else if (ir2Var2 instanceof hr2) {
                ynb.V(aw2Var, null, null, new vr2(this.$this_ConsumeLaunchArgumentsEffect, this.$context, ir2Var2, null), 3);
            }
            return wef.a;
        }
        if (i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ir2Var = (ir2) this.L$1;
        jzb.q(obj);
        wr2Var = this;
        DrawCardSaves drawCardSaves = (DrawCardSaves) obj;
        if (drawCardSaves != null) {
            tr2 tr2Var = wr2Var.$this_ConsumeLaunchArgumentsEffect;
            m25 m25Var = wr2Var.$eventViewModel;
            tr2Var.a(drawCardSaves);
            String id = ((fr2) ir2Var).a.getId();
            m25Var.getClass();
            id.getClass();
            qn2 qn2Var = lw2.a;
            js3 js3Var = ga4.a;
            ynb.V(qn2Var, hr3.c, null, new y05(m25Var, id, null), 2);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((wr2) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
