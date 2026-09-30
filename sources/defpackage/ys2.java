package defpackage;

import ai.askquin.ui.paywall.PaywallRoute;
import ai.askquin.ui.paywall.d;
import ai.askquin.ui.paywall.g;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ys2 extends h36 implements x16 {
    final /* synthetic */ tr2 $this_ConversationContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys2(tr2 tr2Var) {
        super(0, oa7.class, "openUsageEmptyAddonPaywall", "ConversationContent$lambda$42$2$1$3$openUsageEmptyAddonPaywall(Lai/askquin/ui/conversation/ConversationRouteScope;)V", 0);
        this.$this_ConversationContent = tr2Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        d.b(this.$this_ConversationContent.a, g.b(PaywallRoute.Companion, false, 3));
        return wef.a;
    }
}
