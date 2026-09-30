package defpackage;

import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.draw.model.DrawCardSaves;
import ai.askquin.ui.draw.navhost.UnifiedDrawingRoute;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jzd extends gbe implements l26 {
    Object L$0;
    int label;
    final /* synthetic */ kzd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzd(kzd kzdVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = kzdVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new jzd(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        ale aleVarW;
        int i = this.label;
        wef wefVar = wef.a;
        if (i == 0) {
            jzb.q(obj);
            aleVarW = this.this$0.b.W();
            if (aleVarW != null) {
                kzd kzdVar = this.this$0;
                r0 r0Var = kzdVar.b;
                Context context = kzdVar.a;
                this.L$0 = aleVarW;
                this.label = 1;
                obj = r0Var.A0(context, aleVarW, this);
                bw2 bw2Var = bw2.a;
                if (obj == bw2Var) {
                    return bw2Var;
                }
            }
            return wefVar;
        }
        if (i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        aleVarW = (ale) this.L$0;
        jzb.q(obj);
        DrawCardSaves drawCardSaves = (DrawCardSaves) obj;
        if (drawCardSaves != null) {
            kzd kzdVar2 = this.this$0;
            String id = aleVarW.getId();
            int i2 = kzd.e;
            kzdVar2.a(drawCardSaves, id);
            r0 r0Var2 = this.this$0.b;
            r0Var2.getClass();
            r0Var2.z1(drawCardSaves);
            this.this$0.c.d(new znd(11), new UnifiedDrawingRoute(false, true, 1, (rp3) null));
            return wefVar;
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((jzd) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
