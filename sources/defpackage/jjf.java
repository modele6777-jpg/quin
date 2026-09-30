package defpackage;

import android.util.Log;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jjf extends gbe implements a26 {
    final /* synthetic */ int $aeMode;
    int I$0;
    int label;
    final /* synthetic */ pjf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjf(pjf pjfVar, int i, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = pjfVar;
        this.$aeMode = i;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new jjf(this.this$0, this.$aeMode, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i;
        za2 za2VarB;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                if (b21.F(3, "CXCP")) {
                    Log.d("CXCP", "UseCaseCameraRequestControlImpl#setTorchOffAsync");
                }
                pjf pjfVar = this.this$0;
                int i3 = this.$aeMode;
                yf1 yf1VarA = pjfVar.c.a();
                this.I$0 = i3;
                this.label = 1;
                obj = ((dg1) yf1VarA).h(this);
                bw2 bw2Var = bw2.a;
                if (obj == bw2Var) {
                    return bw2Var;
                }
                i = i3;
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = this.I$0;
                jzb.q(obj);
            }
            AutoCloseable autoCloseable = (AutoCloseable) obj;
            try {
                gg1 gg1Var = (gg1) autoCloseable;
                th thVar = new th(i);
                if (gg1Var.a.a()) {
                    r82.e(gg1Var, " after close.", "Cannot call setTorchOff on ");
                    za2VarB = null;
                } else {
                    ho2 ho2Var = gg1Var.c;
                    ho2Var.getClass();
                    za2VarB = ho2.b(ho2Var, thVar, null, null, new yi5(0), null, null, null, 118);
                }
                cgg.t(autoCloseable, null);
                return za2VarB;
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
