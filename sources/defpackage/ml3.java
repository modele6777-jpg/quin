package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ml3 extends gbe implements l26 {
    Object L$0;
    int label;
    final /* synthetic */ ol3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml3(ol3 ol3Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = ol3Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ml3(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        xj5 xj5Var;
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                ol3 ol3Var = this.this$0;
                xj5Var = ol3Var.y;
                rw8 rw8Var = ol3Var.f;
                this.L$0 = xj5Var;
                this.label = 1;
                obj = rw8Var.d(this);
                bw2 bw2Var = bw2.a;
                if (obj == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xj5Var = (h89) this.L$0;
                jzb.q(obj);
            }
            ((s0e) xj5Var).m(obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            this.this$0.G0 = false;
            tec.t(hf8.Q, "DeckSelection", "Failed to start mixed deck downloads", e2);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ml3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
