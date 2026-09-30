package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vif extends gbe implements l26 {
    final /* synthetic */ boolean $enabled$inlined;
    int label;
    final /* synthetic */ xif this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vif(xn2 xn2Var, xif xifVar, boolean z) {
        super(2, xn2Var);
        this.this$0 = xifVar;
        this.$enabled$inlined = z;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new vif(xn2Var, this.this$0, this.$enabled$inlined);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (!this.this$0.h.b()) {
            yf1 yf1VarA = this.this$0.a.a();
            boolean z = this.$enabled$inlined;
            gc1 gc1Var = ((dg1) yf1VarA).e;
            synchronized (gc1Var.q) {
                gc1Var.r = z;
            }
        } else if (b21.F(3, "CXCP")) {
            Log.d("CXCP", "UseCaseCamera is closed before setActiveResumeMode, skipping setup.");
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        vif vifVar = (vif) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        vifVar.r(wefVar);
        return wefVar;
    }
}
