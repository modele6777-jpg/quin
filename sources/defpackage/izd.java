package defpackage;

import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.draw.model.DrawCardSaves;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class izd extends gbe implements l26 {
    Object L$0;
    int label;
    final /* synthetic */ kzd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izd(kzd kzdVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = kzdVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new izd(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        izd izdVar;
        String str;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            ale aleVar = (ale) this.this$0.b.a2.getValue();
            String id = aleVar != null ? aleVar.getId() : null;
            kzd kzdVar = this.this$0;
            r0 r0Var = kzdVar.b;
            Context context = kzdVar.a;
            this.L$0 = id;
            this.label = 1;
            izdVar = this;
            obj = r0.Q0(r0Var, context, null, id, izdVar, 2);
            bw2 bw2Var = bw2.a;
            if (obj == bw2Var) {
                return bw2Var;
            }
            str = id;
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) this.L$0;
            jzb.q(obj);
            izdVar = this;
        }
        DrawCardSaves drawCardSaves = (DrawCardSaves) obj;
        wef wefVar = wef.a;
        if (drawCardSaves == null) {
            return wefVar;
        }
        if (izdVar.this$0.b.C() != null) {
            izdVar.this$0.a(drawCardSaves, str);
        }
        izdVar.this$0.d.d(drawCardSaves);
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((izd) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
