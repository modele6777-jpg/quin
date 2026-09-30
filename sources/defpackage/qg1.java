package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qg1 extends gbe implements l26 {
    int label;
    final /* synthetic */ sg1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg1(sg1 sg1Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = sg1Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new qg1(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        bw2 bw2Var = bw2.a;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            aj1 aj1Var = this.this$0.e;
            io0 io0Var = new io0(8);
            synchronized (aj1Var.a) {
                try {
                    if (!aj1Var.g) {
                        if (b21.F(3, "CXCP")) {
                            Log.d("CXCP", "Camera is removed, forcing state to CLOSED.");
                        }
                        aj1Var.g = true;
                        og1 og1Var = og1.a;
                        aj1Var.e = og1Var;
                        aj1Var.f = io0Var;
                        aj1Var.c(og1Var, io0Var);
                        aj1Var.d = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ekf ekfVar = this.this$0.a;
            this.label = 1;
            if (ekfVar.e(this) == bw2Var) {
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
        return ((qg1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
