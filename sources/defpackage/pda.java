package defpackage;

import ai.askquin.ui.draw.photo.homepage.PhysicalDeckCameraRoute;
import ai.askquin.ui.draw.photo.homepage.QuestionInputRoute;
import java.util.List;
import tech.chatmind.api.PatternData;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pda extends gbe implements l26 {
    final /* synthetic */ jr2 $conversationLauncher;
    final /* synthetic */ ka9 $navController;
    final /* synthetic */ List<PatternData> $patterns;
    final /* synthetic */ String $question;
    final /* synthetic */ QuestionInputRoute $route;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pda(jr2 jr2Var, QuestionInputRoute questionInputRoute, List list, String str, ka9 ka9Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$conversationLauncher = jr2Var;
        this.$route = questionInputRoute;
        this.$patterns = list;
        this.$question = str;
        this.$navController = ka9Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new pda(this.$conversationLauncher, this.$route, this.$patterns, this.$question, this.$navController, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        jr2 jr2Var = this.$conversationLauncher;
        List<TarotCardChoice> cards = this.$route.getCards();
        List<PatternData> list = this.$patterns;
        String str = this.$question;
        jr2Var.getClass();
        cards.getClass();
        list.getClass();
        str.getClass();
        jr2Var.b.h(new gr2(str, cards, list));
        jr2Var.b();
        this.$navController.f(job.a.b(PhysicalDeckCameraRoute.class), true);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        pda pdaVar = (pda) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        pdaVar.r(wefVar);
        return wefVar;
    }
}
