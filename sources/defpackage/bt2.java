package defpackage;

import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.paywall.PaywallRoute;
import ai.askquin.ui.paywall.d;
import ai.askquin.ui.paywall.g;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bt2 extends h36 implements x16 {
    final /* synthetic */ t7 $accountInfo;
    final /* synthetic */ tr2 $this_ConversationContent;
    final /* synthetic */ r0 $vm;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt2(tr2 tr2Var, t7 t7Var, r0 r0Var) {
        super(0, oa7.class, "openFollowUpRestrictedPaywall", "ConversationContent$lambda$42$2$1$3$openFollowUpRestrictedPaywall(Lai/askquin/ui/conversation/ConversationRouteScope;Ltech/chatmind/api/AccountInfoProvider;Lai/askquin/ui/conversation/DivinationViewModel;)V", 0);
        this.$this_ConversationContent = tr2Var;
        this.$accountInfo = t7Var;
        this.$vm = r0Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        d.b(this.$this_ConversationContent.a, g.a(PaywallRoute.Companion, ((mo3) this.$accountInfo).a(), this.$vm.E()));
        return wef.a;
    }
}
