package defpackage;

import ai.askquin.ui.annual.AnnualNicknameRoute;
import ai.askquin.ui.annual.AnnualReportGeneratingRoute;
import ai.askquin.ui.annual.h;
import ai.askquin.ui.annual.model.AnnualActionFor;
import java.util.List;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d40 extends gbe implements l26 {
    final /* synthetic */ AnnualActionFor $actionFor;
    final /* synthetic */ List<TarotCardChoice> $cards;
    final /* synthetic */ ka9 $navController;
    final /* synthetic */ h $sharedViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d40(h hVar, AnnualActionFor annualActionFor, List list, ka9 ka9Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$sharedViewModel = hVar;
        this.$actionFor = annualActionFor;
        this.$cards = list;
        this.$navController = ka9Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new d40(this.$sharedViewModel, this.$actionFor, this.$cards, this.$navController, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            h hVar = this.$sharedViewModel;
            AnnualActionFor annualActionFor = this.$actionFor;
            List<TarotCardChoice> list = this.$cards;
            this.label = 1;
            obj = hVar.k(annualActionFor, list, this);
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
        int iOrdinal = ((q40) obj).ordinal();
        if (iOrdinal == 0) {
            ka9.e(this.$navController, new AnnualReportGeneratingRoute(this.$actionFor), null, 6);
        } else if (iOrdinal == 1) {
            this.$navController.d(new zv(18), AnnualNicknameRoute.INSTANCE);
        } else if (iOrdinal != 2) {
            ap.c();
            return null;
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((d40) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
