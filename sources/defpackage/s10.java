package defpackage;

import ai.askquin.ui.annual.ResumeRoute;
import ai.askquin.ui.annual.c;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class s10 extends gbe implements l26 {
    int label;
    final /* synthetic */ w10 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s10(w10 w10Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = w10Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new s10(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            c cVar = this.this$0.z;
            this.label = 1;
            int i2 = c.b;
            obj = cVar.b(System.currentTimeMillis(), this);
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
        p40 p40Var = (p40) obj;
        ResumeRoute resumeRouteR = p40Var != null ? eb3.R(p40Var) : null;
        ResumeRoute.Drawing drawing = resumeRouteR instanceof ResumeRoute.Drawing ? (ResumeRoute.Drawing) resumeRouteR : null;
        if (drawing != null) {
            w10 w10Var = this.this$0;
            List<TarotCardChoice> drawnCards = drawing.getDrawnCards();
            w10Var.d().e("Resumed drawing progress: " + drawnCards);
            Iterator<T> it = drawnCards.iterator();
            while (it.hasNext()) {
                w10Var.f.add((TarotCardChoice) it.next());
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((s10) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
