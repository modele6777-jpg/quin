package ai.askquin.ui.conversation;

import defpackage.gbe;
import defpackage.jzb;
import defpackage.n26;
import defpackage.pa7;
import defpackage.qc0;
import defpackage.s12;
import defpackage.wef;
import defpackage.xn2;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends gbe implements n26 {
    final /* synthetic */ String $requestMessageId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(r0 r0Var, String str, xn2 xn2Var) {
        super(3, xn2Var);
        this.this$0 = r0Var;
        this.$requestMessageId = str;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        q0 q0Var = new q0(this.this$0, this.$requestMessageId, (xn2) obj3);
        q0Var.L$0 = (Throwable) obj2;
        wef wefVar = wef.a;
        q0Var.r(wefVar);
        return wefVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Throwable th = (Throwable) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (!(th instanceof CancellationException) && pa7.t(this.this$0.n(this.$requestMessageId), ClarifyingCardDrawActionState.Loading.INSTANCE)) {
            this.this$0.U0.put(this.$requestMessageId, s12.a);
            this.this$0.T0.put(this.$requestMessageId, new ClarifyingCardDrawActionState.Failed(FailReason.Network.INSTANCE));
        }
        return wef.a;
    }
}
