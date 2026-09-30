package defpackage;

import java.util.Iterator;
import tech.chatmind.api.RecommendQuestionType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ijb implements xn7 {
    public static final ijb a = new ijb();
    public static final hua b = eec.c("RecommendQuestionType");

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        RecommendQuestionType recommendQuestionType = (RecommendQuestionType) obj;
        recommendQuestionType.getClass();
        ev4Var.D(recommendQuestionType.getWireValue());
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        Object next;
        String strU = om3Var.u();
        Iterator<E> it = RecommendQuestionType.getEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!pa7.t(((RecommendQuestionType) next).getWireValue(), strU));
        RecommendQuestionType recommendQuestionType = (RecommendQuestionType) next;
        return recommendQuestionType == null ? RecommendQuestionType.UNKNOWN : recommendQuestionType;
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return b;
    }
}
