package defpackage;

import ai.askquin.App;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r70 extends gbe implements l26 {
    int label;
    final /* synthetic */ App this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r70(App app, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = app;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new r70(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            x1f x1fVar = x1f.a;
            this.label = 1;
            obj = x1fVar.e(true, true, this);
            bw2 bw2Var = bw2.a;
            if (obj == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        if (((zx8) obj).a) {
            lw2.a(new q70(this.this$0, null));
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((r70) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
