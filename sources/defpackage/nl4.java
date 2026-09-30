package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class nl4 extends gbe implements l26 {
    final /* synthetic */ e89 $dragOffset$delegate;
    final /* synthetic */ e89 $dragStartVisualBounds$delegate;
    final /* synthetic */ s69 $draggedIndex$delegate;
    final /* synthetic */ float $minOverlapThreshold;
    final /* synthetic */ s69 $potentialTargetIndex$delegate;
    final /* synthetic */ ghc $scrollState;
    final /* synthetic */ Map<Integer, ol4> $slotBoundsWithScroll;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nl4(ghc ghcVar, s69 s69Var, e89 e89Var, e89 e89Var2, float f, Map map, s69 s69Var2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$scrollState = ghcVar;
        this.$draggedIndex$delegate = s69Var;
        this.$dragStartVisualBounds$delegate = e89Var;
        this.$dragOffset$delegate = e89Var2;
        this.$minOverlapThreshold = f;
        this.$slotBoundsWithScroll = map;
        this.$potentialTargetIndex$delegate = s69Var2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new nl4(this.$scrollState, this.$draggedIndex$delegate, this.$dragStartVisualBounds$delegate, this.$dragOffset$delegate, this.$minOverlapThreshold, this.$slotBoundsWithScroll, this.$potentialTargetIndex$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (((sz9) this.$draggedIndex$delegate).j() >= 0 && ((hkb) this.$dragStartVisualBounds$delegate.getValue()) != null) {
            ghc ghcVar = this.$scrollState;
            int iJ = ghcVar != null ? ghcVar.a.j() : 0;
            hkb hkbVar = (hkb) this.$dragStartVisualBounds$delegate.getValue();
            hkbVar.getClass();
            ((sz9) this.$potentialTargetIndex$delegate).k(y7h.d(this.$minOverlapThreshold, this.$slotBoundsWithScroll, hkbVar.k(((hl9) this.$dragOffset$delegate.getValue()).a), ((sz9) this.$draggedIndex$delegate).j(), iJ));
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        nl4 nl4Var = (nl4) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        nl4Var.r(wefVar);
        return wefVar;
    }
}
