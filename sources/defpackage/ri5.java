package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ri5 extends gbe implements l26 {
    final /* synthetic */ gv6 $screenFlashListener;
    final /* synthetic */ long $timeoutMillis;
    int label;
    final /* synthetic */ xi5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri5(long j, xi5 xi5Var, gv6 gv6Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$timeoutMillis = j;
        this.this$0 = xi5Var;
        this.$screenFlashListener = gv6Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ri5(this.$timeoutMillis, this.this$0, this.$screenFlashListener, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        long jCurrentTimeMillis = System.currentTimeMillis() + this.$timeoutMillis;
        vfc vfcVar = this.this$0.h;
        if (vfcVar != null) {
            vfcVar.a(this.$screenFlashListener);
        }
        if (b21.F(3, "CXCP")) {
            Log.d("CXCP", "applyScreenFlash: ScreenFlash.apply() invoked, expirationTimeMillis = " + jCurrentTimeMillis);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ri5 ri5Var = (ri5) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        ri5Var.r(wefVar);
        return wefVar;
    }
}
