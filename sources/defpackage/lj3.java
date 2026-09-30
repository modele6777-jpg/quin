package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lj3 extends gbe implements l26 {
    final /* synthetic */ List<TarotSkinIdentify> $decks;
    final /* synthetic */ TarotSkinIdentify $initialSkin;
    final /* synthetic */ yx9 $pagerState;
    int I$0;
    int I$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj3(List list, TarotSkinIdentify tarotSkinIdentify, yx9 yx9Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$decks = list;
        this.$initialSkin = tarotSkinIdentify;
        this.$pagerState = yx9Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new lj3(this.$decks, this.$initialSkin, this.$pagerState, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        wef wefVar = wef.a;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return wefVar;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (!this.$decks.isEmpty()) {
            int iIndexOf = this.$decks.indexOf(this.$initialSkin);
            int iJ = ((sz9) this.$pagerState.d.c).j() % this.$decks.size();
            if (iIndexOf >= 0 && iIndexOf != iJ) {
                yx9 yx9Var = this.$pagerState;
                int iJ2 = (((sz9) yx9Var.d.c).j() - iJ) + iIndexOf;
                this.I$0 = iIndexOf;
                this.I$1 = iJ;
                this.label = 1;
                Object objS = yx9.s(yx9Var, iJ2, this);
                bw2 bw2Var = bw2.a;
                if (objS == bw2Var) {
                    return bw2Var;
                }
            }
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((lj3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
