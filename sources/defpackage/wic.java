package defpackage;

import ai.askquin.ui.router.AppRoute;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wic extends gbe implements l26 {
    final /* synthetic */ h0e $entry$delegate;
    final /* synthetic */ boolean $initiallyPending;
    final /* synthetic */ e89 $paywallEntered$delegate;
    final /* synthetic */ h0e $stage$delegate;
    final /* synthetic */ e89 $waitingForPaywall$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wic(boolean z, h0e h0eVar, e89 e89Var, h0e h0eVar2, e89 e89Var2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$initiallyPending = z;
        this.$entry$delegate = h0eVar;
        this.$paywallEntered$delegate = e89Var;
        this.$stage$delegate = h0eVar2;
        this.$waitingForPaywall$delegate = e89Var2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new wic(this.$initiallyPending, this.$entry$delegate, this.$paywallEntered$delegate, this.$stage$delegate, this.$waitingForPaywall$delegate, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005a  */
    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        da9 da9Var;
        ua9 ua9Var;
        ua9 ua9Var2;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        da9 da9Var2 = (da9) this.$entry$delegate.getValue();
        if (da9Var2 != null && (ua9Var2 = da9Var2.b) != null) {
            int i = ua9.e;
            if (kj0.k0(ua9Var2, job.a.b(AppRoute.Paywall.class))) {
                this.$paywallEntered$delegate.setValue(Boolean.TRUE);
            }
        }
        if (((Boolean) this.$paywallEntered$delegate.getValue()).booleanValue() && (da9Var = (da9) this.$entry$delegate.getValue()) != null && (ua9Var = da9Var.b) != null) {
            int i2 = ua9.e;
            if (kj0.k0(ua9Var, job.a.b(AppRoute.Main.class))) {
                this.$waitingForPaywall$delegate.setValue(Boolean.FALSE);
            } else if (this.$initiallyPending) {
                this.$waitingForPaywall$delegate.setValue(Boolean.FALSE);
            }
        } else if (this.$initiallyPending && v4e.Q((String) this.$stage$delegate.getValue())) {
            this.$waitingForPaywall$delegate.setValue(Boolean.FALSE);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        wic wicVar = (wic) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        wicVar.r(wefVar);
        return wefVar;
    }
}
