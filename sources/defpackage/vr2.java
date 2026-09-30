package defpackage;

import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.draw.model.DrawCardSaves;
import ai.askquin.ui.draw.navhost.UnifiedDrawingRoute;
import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vr2 extends gbe implements l26 {
    final /* synthetic */ ir2 $arguments;
    final /* synthetic */ Context $context;
    final /* synthetic */ tr2 $this_ConsumeLaunchArgumentsEffect;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr2(tr2 tr2Var, Context context, ir2 ir2Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$this_ConsumeLaunchArgumentsEffect = tr2Var;
        this.$context = context;
        this.$arguments = ir2Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new vr2(this.$this_ConsumeLaunchArgumentsEffect, this.$context, this.$arguments, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        tr2 tr2Var = this.$this_ConsumeLaunchArgumentsEffect;
        r0 r0Var = tr2Var.c;
        Context context = this.$context;
        hr2 hr2Var = (hr2) this.$arguments;
        String str = hr2Var.c;
        List list = hr2Var.d;
        String str2 = hr2Var.f;
        String str3 = hr2Var.e;
        r0Var.getClass();
        context.getClass();
        DrawCardSaves drawCardSaves = (DrawCardSaves) y41.L(r0Var.y, context, r0Var.m0(), new m8(r0Var, str, list, str2, str3, 10));
        if (drawCardSaves != null) {
            r0 r0Var2 = tr2Var.c;
            r0Var2.getClass();
            r0Var2.z1(drawCardSaves);
            ka9.e(tr2Var.b, new UnifiedDrawingRoute(true, false, 2, (rp3) null), null, 6);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        vr2 vr2Var = (vr2) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        vr2Var.r(wefVar);
        return wefVar;
    }
}
