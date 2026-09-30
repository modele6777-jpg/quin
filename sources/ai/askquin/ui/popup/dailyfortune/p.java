package ai.askquin.ui.popup.dailyfortune;

import defpackage.gbe;
import defpackage.jzb;
import defpackage.n26;
import defpackage.qc0;
import defpackage.wef;
import defpackage.xn2;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends gbe implements n26 {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ v this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(v vVar, xn2 xn2Var) {
        super(3, xn2Var);
        this.this$0 = vVar;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        p pVar = new p(this.this$0, (xn2) obj3);
        pVar.L$0 = (String) obj;
        pVar.L$1 = (String) obj2;
        return pVar.r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        String str = (String) this.L$0;
        String str2 = (String) this.L$1;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        v vVar = this.this$0;
        int i = v.d;
        DailyFortuneGuideStore$AccountState dailyFortuneGuideStore$AccountState = (DailyFortuneGuideStore$AccountState) vVar.g(str2).get(str);
        if (dailyFortuneGuideStore$AccountState == null || !dailyFortuneGuideStore$AccountState.getHomeTooltipPending() || dailyFortuneGuideStore$AccountState.getHomeTooltipShown()) {
            return null;
        }
        return str;
    }
}
