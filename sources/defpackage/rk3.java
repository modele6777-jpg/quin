package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rk3 extends gbe implements l26 {
    final /* synthetic */ Context $context;
    final /* synthetic */ and $purchaseViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk3(xn2 xn2Var, and andVar, Context context) {
        super(2, xn2Var);
        this.$purchaseViewModel = andVar;
        this.$context = context;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new rk3(xn2Var, this.$purchaseViewModel, this.$context);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        and andVar = this.$purchaseViewModel;
        andVar.getClass();
        tnd tndVar = andVar.g1;
        tnd tndVar2 = tnd.ReadingDeckSelect;
        if (tndVar != tndVar2) {
            if (andVar.q() || andVar.T() || andVar.S()) {
                qc0.p("Purchase pathway cannot change while a purchase is in progress");
                return null;
            }
            andVar.g1 = tndVar2;
        }
        vb2 vb2VarH = kn2.H(this.$context);
        if (vb2VarH != null) {
            this.$purchaseViewModel.M(vb2VarH);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        rk3 rk3Var = (rk3) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        rk3Var.r(wefVar);
        return wefVar;
    }
}
