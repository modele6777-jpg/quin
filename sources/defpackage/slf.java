package defpackage;

import ai.askquin.ui.account.navigation.AuthNavigation$Terminal;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class slf extends gbe implements l26 {
    final /* synthetic */ boolean $isNewUser;
    final /* synthetic */ String $quinAuth;
    int label;
    final /* synthetic */ qmf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public slf(xn2 xn2Var, qmf qmfVar, String str, boolean z) {
        super(2, xn2Var);
        this.this$0 = qmfVar;
        this.$isNewUser = z;
        this.$quinAuth = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new slf(xn2Var, this.this$0, this.$quinAuth, this.$isNewUser);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            rlf rlfVar = new rlf(null, this.this$0, this.$quinAuth, this.$isNewUser);
            this.label = 1;
            Object objB = lw2.b(rlfVar, this);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        qmf qmfVar = this.this$0;
        AuthNavigation$Terminal authNavigation$Terminal = new AuthNavigation$Terminal(this.$isNewUser, "dev");
        int i2 = qmf.Z;
        qmfVar.l(authNavigation$Terminal);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((slf) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
