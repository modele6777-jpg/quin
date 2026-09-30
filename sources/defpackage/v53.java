package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class v53 extends gbe implements l26 {
    final /* synthetic */ List<cod> $items;
    final /* synthetic */ l26 $onSkinSelected;
    final /* synthetic */ yx9 $pagerState;
    final /* synthetic */ int $selectedIndex;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v53(yx9 yx9Var, int i, List list, l26 l26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$pagerState = yx9Var;
        this.$selectedIndex = i;
        this.$items = list;
        this.$onSkinSelected = l26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new v53(this.$pagerState, this.$selectedIndex, this.$items, this.$onSkinSelected, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        cod codVar;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        int iO = this.$pagerState.o();
        int i = this.$selectedIndex;
        if (!this.$pagerState.k.a() && iO != i && (codVar = (cod) s72.y0(iO, this.$items)) != null) {
            this.$onSkinSelected.z(new Integer(iO), codVar);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        v53 v53Var = (v53) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        v53Var.r(wefVar);
        return wefVar;
    }
}
