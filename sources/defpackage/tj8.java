package defpackage;

import ai.askquin.MainActivity;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tj8 extends gbe implements l26 {
    final /* synthetic */ ru7 $it;
    int label;
    final /* synthetic */ MainActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj8(MainActivity mainActivity, ru7 ru7Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = mainActivity;
        this.$it = ru7Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new tj8(this.this$0, this.$it, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Exception {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            MainActivity mainActivity = this.this$0;
            ru7 ru7Var = this.$it;
            this.label = 1;
            int i2 = MainActivity.Z0;
            Object objX = mainActivity.x(ru7Var, false, x57.b0(ru7Var), this);
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
        return ((tj8) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
