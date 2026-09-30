package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qk3 extends gbe implements l26 {
    final /* synthetic */ a26 $onSelect;
    final /* synthetic */ x16 $onSelectMixed;
    final /* synthetic */ yx9 $pagerState;
    final /* synthetic */ List<bk3> $skins;
    final /* synthetic */ al3 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk3(List list, yx9 yx9Var, al3 al3Var, a26 a26Var, x16 x16Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$skins = list;
        this.$pagerState = yx9Var;
        this.$state = al3Var;
        this.$onSelect = a26Var;
        this.$onSelectMixed = x16Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new qk3(this.$skins, this.$pagerState, this.$state, this.$onSelect, this.$onSelectMixed, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        bk3 bk3Var = (bk3) s72.y0(this.$pagerState.o(), this.$skins);
        if (bk3Var instanceof ak3) {
            ak3 ak3Var = (ak3) bk3Var;
            if (!ak3Var.b) {
                TarotSkinIdentify tarotSkinIdentify = ak3Var.a;
                al3 al3Var = this.$state;
                if (tarotSkinIdentify != al3Var.c || al3Var.d) {
                    this.$onSelect.d(tarotSkinIdentify);
                }
            }
        } else if (bk3Var instanceof zj3) {
            if (((zj3) bk3Var).a() && !this.$state.d) {
                this.$onSelectMixed.invoke();
            }
        } else if (bk3Var != null) {
            ap.c();
            return null;
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        qk3 qk3Var = (qk3) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        qk3Var.r(wefVar);
        return wefVar;
    }
}
