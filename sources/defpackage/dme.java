package defpackage;

import ai.askquin.model.Scene;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dme extends gbe implements l26 {
    int label;
    final /* synthetic */ fme this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dme(fme fmeVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = fmeVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new dme(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws IOException {
        Object next;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        List listC = this.this$0.e.c();
        fme fmeVar = this.this$0;
        Iterator it = listC.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!pa7.t(((Scene) next).getId(), ((zle) fmeVar.f).a));
        Scene scene = (Scene) next;
        List<String> guessQuestions = scene != null ? scene.getGuessQuestions() : null;
        return guessQuestions == null ? pu4.a : guessQuestions;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((dme) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
