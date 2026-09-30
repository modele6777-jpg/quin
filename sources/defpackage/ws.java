package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ws extends gbe implements l26 {
    final /* synthetic */ hga $$this$launchTextInputSession;
    final /* synthetic */ a26 $initializeRequest;
    final /* synthetic */ f38 $node;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ys this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws(hga hgaVar, a26 a26Var, ys ysVar, f38 f38Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$$this$launchTextInputSession = hgaVar;
        this.$initializeRequest = a26Var;
        this.this$0 = ysVar;
        this.$node = f38Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ws wsVar = new ws(this.$$this$launchTextInputSession, this.$initializeRequest, this.this$0, this.$node, xn2Var);
        wsVar.L$0 = obj;
        return wsVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        bw2 bw2Var = bw2.a;
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
                throw new nt7();
            }
            jzb.q(obj);
            aw2 aw2Var = (aw2) this.L$0;
            g38 g38Var = h38.a;
            View view = ((iu) this.$$this$launchTextInputSession).a;
            g38Var.getClass();
            k47 k47Var = new k47(view);
            s38 s38Var = new s38(((iu) this.$$this$launchTextInputSession).a, new vs(this.$node), k47Var);
            if (g6e.a) {
                ynb.V(aw2Var, null, null, new us(this.this$0, k47Var, null), 3);
            }
            a26 a26Var = this.$initializeRequest;
            if (a26Var != null) {
                a26Var.d(s38Var);
            }
            this.this$0.c = s38Var;
            hga hgaVar = this.$$this$launchTextInputSession;
            this.label = 1;
            ((iu) hgaVar).a(s38Var, this);
            return bw2Var;
        } catch (Throwable th) {
            this.this$0.c = null;
            throw th;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ((ws) k((xn2) obj2, (aw2) obj)).r(wef.a);
        return bw2.a;
    }
}
