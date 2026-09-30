package defpackage;

import android.util.Log;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d2e extends gbe implements l26 {
    final /* synthetic */ List<nu3> $deferredList;
    final /* synthetic */ y1e $request;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2e(List list, y1e y1eVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$deferredList = list;
        this.$request = y1eVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new d2e(this.$deferredList, this.$request, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            y1e y1eVar = this.$request;
            if (b21.F(3, "CXCP")) {
                Log.d("CXCP", "StillCaptureRequestControl: Waiting for deferred list from " + y1eVar);
            }
            List<nu3> list = this.$deferredList;
            this.label = 1;
            obj = pa7.u(list, this);
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
        y1e y1eVar2 = this.$request;
        if (b21.F(3, "CXCP")) {
            Log.d("CXCP", "StillCaptureRequestControl: Waiting for deferred list from " + y1eVar2 + " done");
        }
        return obj;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((d2e) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
