package defpackage;

import ai.askquin.MainActivity;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class sj8 extends gbe implements l26 {
    final /* synthetic */ vx8 $mixpanelAuthorizationContext;
    final /* synthetic */ ru7 $state;
    int label;
    final /* synthetic */ MainActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj8(MainActivity mainActivity, ru7 ru7Var, vx8 vx8Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = mainActivity;
        this.$state = ru7Var;
        this.$mixpanelAuthorizationContext = vx8Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new sj8(this.this$0, this.$state, this.$mixpanelAuthorizationContext, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Exception {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            MainActivity mainActivity = this.this$0;
            ru7 ru7Var = this.$state;
            vx8 vx8Var = this.$mixpanelAuthorizationContext;
            this.label = 1;
            Object objX = mainActivity.x(ru7Var, true, vx8Var, this);
            bw2 bw2Var = bw2.a;
            if (objX == bw2Var) {
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
        return ((sj8) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
