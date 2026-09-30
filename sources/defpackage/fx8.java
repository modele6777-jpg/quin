package defpackage;

import ai.askquin.qa.bridge.QaResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fx8 extends gbe implements l26 {
    int label;
    final /* synthetic */ gx8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx8(gx8 gx8Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = gx8Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new fx8(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            rw8 rw8Var = this.this$0.a;
            this.label = 1;
            Object objE = rw8Var.e(this);
            bw2 bw2Var = bw2.a;
            if (objE == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return new QaResult.Ok((ti7) null, 1, (rp3) null);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((fx8) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
