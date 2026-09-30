package defpackage;

import ai.askquin.model.reviewreward.ReviewRewardState;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class i2c extends gbe implements l26 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ k2c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2c(k2c k2cVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = k2cVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        i2c i2cVar = new i2c(this.this$0, xn2Var);
        i2cVar.L$0 = obj;
        return i2cVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        String str = (String) this.L$0;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            p1c p1cVar = this.this$0.a;
            String strI = ib8.i();
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.L$0 = str;
            this.label = 1;
            if (v4e.Q(strI)) {
                qc0.j("exposureId must not be blank");
                return null;
            }
            if (jCurrentTimeMillis <= 0) {
                qc0.j("exposedAtEpochMillis must be positive");
                return null;
            }
            obj = p1cVar.i(this, new v0c(p1cVar, strI, jCurrentTimeMillis), str);
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
        ReviewRewardState reviewRewardState = (ReviewRewardState) obj;
        k2c k2cVar = this.this$0;
        String str2 = (String) k2cVar.d.remove(str);
        if (str2 != null) {
            ConcurrentHashMap.KeySetView keySetView = k2cVar.c;
            keySetView.getClass();
            keySetView.remove(str2);
        }
        String snackbarExposureId = reviewRewardState.getSnackbarExposureId();
        if (snackbarExposureId != null) {
            this.this$0.d.put(str, snackbarExposureId);
        }
        return reviewRewardState;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((i2c) k((xn2) obj2, (String) obj)).r(wef.a);
    }
}
