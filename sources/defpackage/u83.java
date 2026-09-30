package defpackage;

import ai.askquin.ui.popup.dailyfortune.v;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u83 extends gbe implements l26 {
    final /* synthetic */ v $dailyFortuneGuideStore;
    final /* synthetic */ d83 $promptMode;
    final /* synthetic */ int $touchpointId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u83(int i, d83 d83Var, v vVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$touchpointId = i;
        this.$promptMode = d83Var;
        this.$dailyFortuneGuideStore = vVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new u83(this.$touchpointId, this.$promptMode, this.$dailyFortuneGuideStore, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            fg9 fg9Var = fg9.b;
            t83 t83Var = new t83(this.$touchpointId, this.$promptMode, this.$dailyFortuneGuideStore, null);
            this.label = 1;
            Object objP0 = ynb.p0(fg9Var, t83Var, this);
            bw2 bw2Var = bw2.a;
            if (objP0 == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        int i2 = this.$touchpointId;
        d83 d83Var = this.$promptMode;
        d83Var.getClass();
        x1f x1fVar = x1f.a;
        x1f.k(new r05("popup_view"), new vj(d83Var, i2, 10), 2);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((u83) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
