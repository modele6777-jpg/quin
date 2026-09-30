package defpackage;

import ai.askquin.ui.account.component.AuthOption;
import tech.chatmind.api.User;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tlf extends gbe implements l26 {
    final /* synthetic */ AuthOption $signOption;
    final /* synthetic */ User $user;
    int label;
    final /* synthetic */ qmf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlf(qmf qmfVar, User user, AuthOption authOption, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = qmfVar;
        this.$user = user;
        this.$signOption = authOption;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new tlf(this.this$0, this.$user, this.$signOption, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            qmf qmfVar = this.this$0;
            wgd wgdVar = new wgd(this.$user);
            AuthOption authOption = this.$signOption;
            this.label = 1;
            int i2 = qmf.Z;
            Object objH = qmfVar.h(wgdVar, authOption, igd.b, this);
            bw2 bw2Var = bw2.a;
            if (objH == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((tlf) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
