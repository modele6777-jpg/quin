package defpackage;

import ai.askquin.ui.conversation.ClarifyingCardDrawActionState;
import ai.askquin.ui.conversation.FailReason;
import ai.askquin.ui.conversation.r0;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qr2 extends gbe implements l26 {
    final /* synthetic */ da9 $backStackEntry;
    final /* synthetic */ h0e $followUpActionPaywallResult$delegate;
    final /* synthetic */ tr2 $scope;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr2(da9 da9Var, tr2 tr2Var, h0e h0eVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$backStackEntry = da9Var;
        this.$scope = tr2Var;
        this.$followUpActionPaywallResult$delegate = h0eVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new qr2(this.$backStackEntry, this.$scope, this.$followUpActionPaywallResult$delegate, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0050  */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (((Boolean) this.$followUpActionPaywallResult$delegate.getValue()).booleanValue()) {
            this.$backStackEntry.a().c("followup_action_paywall");
            r0 r0Var = this.$scope.c;
            String str = r0Var.P().e;
            if (str != null) {
                ClarifyingCardDrawActionState clarifyingCardDrawActionStateN = r0Var.n(str);
                ClarifyingCardDrawActionState.Failed failed = clarifyingCardDrawActionStateN instanceof ClarifyingCardDrawActionState.Failed ? (ClarifyingCardDrawActionState.Failed) clarifyingCardDrawActionStateN : null;
                if (!((failed != null ? failed.getReason() : null) instanceof FailReason.UsageBlocked) || ((j6a) r0Var.V0.get(str)) == null) {
                    str = null;
                }
            } else {
                str = null;
            }
            ynb.V(hwf.a(r0Var), null, null, new ne4(r0Var, str, null), 3);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        qr2 qr2Var = (qr2) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        qr2Var.r(wefVar);
        return wefVar;
    }
}
