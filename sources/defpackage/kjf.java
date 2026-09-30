package defpackage;

import android.util.Log;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kjf extends gbe implements a26 {
    int label;
    final /* synthetic */ pjf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kjf(pjf pjfVar, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = pjfVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new kjf(this.this$0, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                if (b21.F(3, "CXCP")) {
                    Log.d("CXCP", "UseCaseCameraRequestControlImpl#setTorchOnAsync");
                }
                yf1 yf1VarA = this.this$0.c.a();
                this.label = 1;
                obj = ((dg1) yf1VarA).h(this);
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
            AutoCloseable autoCloseable = (AutoCloseable) obj;
            try {
                za2 za2VarL = ((gg1) autoCloseable).l();
                cgg.t(autoCloseable, null);
                return za2VarL;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    cgg.t(autoCloseable, th);
                    throw th2;
                }
            }
        } catch (CancellationException e) {
            if (b21.F(3, "CXCP")) {
                Log.d("CXCP", "Cannot acquire the CameraGraph.Session", e);
            }
            return pjf.l;
        }
    }
}
