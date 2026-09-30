package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kj3 extends gbe implements l26 {
    final /* synthetic */ List<TarotSkinIdentify> $decks;
    final /* synthetic */ a26 $onSkinPaged;
    final /* synthetic */ yx9 $pagerState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj3(xn2 xn2Var, a26 a26Var, yx9 yx9Var, List list) {
        super(2, xn2Var);
        this.$pagerState = yx9Var;
        this.$decks = list;
        this.$onSkinPaged = a26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new kj3(xn2Var, this.$onSkinPaged, this.$pagerState, this.$decks);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        wef wefVar = wef.a;
        if (i == 0) {
            jzb.q(obj);
            ybc ybcVarP = jzb.p(new f12(this.$pagerState, 1));
            qb1 qb1Var = new qb1(3, this.$decks, this.$onSkinPaged);
            this.label = 1;
            Object objB = ybcVarP.b(new jl5(new kmb(), qb1Var), this);
            bw2 bw2Var = bw2.a;
            if (objB != bw2Var) {
                objB = wefVar;
            }
            if (objB == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((kj3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
