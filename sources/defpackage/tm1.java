package defpackage;

import android.util.Log;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tm1 extends gbe implements l26 {
    final /* synthetic */ int $captureMode$inlined;
    final /* synthetic */ List $captureSignal;
    Object L$0;
    int label;
    final /* synthetic */ xn1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm1(List list, xn2 xn2Var, xn1 xn1Var, int i) {
        super(2, xn2Var);
        this.$captureSignal = list;
        this.this$0 = xn1Var;
        this.$captureMode$inlined = i;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new tm1(this.$captureSignal, xn2Var, this.this$0, this.$captureMode$inlined);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0079 A[Catch: all -> 0x007f, TryCatch #2 {all -> 0x007f, blocks: (B:32:0x0070, B:34:0x0079, B:37:0x0084, B:41:0x008a), top: B:58:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0088  */
    /* JADX WARN: Code duplicated, block: B:40:0x0089  */
    /* JADX WARN: Code duplicated, block: B:44:0x0095  */
    /* JADX WARN: Code duplicated, block: B:47:0x009c A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #1 {all -> 0x001b, blocks: (B:8:0x0016, B:45:0x0096, B:47:0x009c), top: B:56:0x0016 }] */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        AutoCloseable autoCloseable;
        Throwable th;
        AutoCloseable autoCloseable2;
        gg1 gg1Var;
        int i = this.label;
        boolean z = true;
        bw2 bw2Var = bw2.a;
        if (i == 0) {
            jzb.q(obj);
            if (b21.F(3, "CXCP")) {
                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: Waiting for POST_CAPTURE signal");
            }
            List list = this.$captureSignal;
            this.label = 1;
            if (pa7.X(list, this) != bw2Var) {
            }
            return bw2Var;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                autoCloseable2 = (AutoCloseable) this.L$0;
                try {
                    jzb.q(obj);
                    if (b21.F(3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#aePreCaptureApplyCapture: Unlocking 3A done");
                    }
                    cgg.t(autoCloseable2, null);
                    return wef.a;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        cgg.t(autoCloseable2, th);
                        throw th3;
                    }
                }
            }
            jzb.q(obj);
            autoCloseable = (AutoCloseable) obj;
            try {
                gg1Var = (gg1) autoCloseable;
                if (b21.F(3, "CXCP")) {
                    Log.d("CXCP", "CapturePipeline#aePreCaptureApplyCapture: Unlocking 3A");
                }
                if (this.$captureMode$inlined == 0) {
                    z = false;
                }
                this.L$0 = autoCloseable;
                this.label = 3;
                if (gg1Var.G(z) != bw2Var) {
                    autoCloseable2 = autoCloseable;
                    if (b21.F(3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#aePreCaptureApplyCapture: Unlocking 3A done");
                    }
                    cgg.t(autoCloseable2, null);
                    return wef.a;
                }
                return bw2Var;
            } catch (Throwable th4) {
                th = th4;
                autoCloseable2 = autoCloseable;
                throw th;
            }
        }
        jzb.q(obj);
        if (b21.F(3, "CXCP")) {
            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: Waiting for POST_CAPTURE signal done");
        }
        if (b21.F(3, "CXCP")) {
            Log.d("CXCP", "CapturePipeline#aePreCaptureApplyCapture: Acquiring session for unlocking 3A");
        }
        yf1 yf1VarA = this.this$0.i.a();
        this.label = 2;
        obj = ((dg1) yf1VarA).h(this);
        if (obj != bw2Var) {
            autoCloseable = (AutoCloseable) obj;
            gg1Var = (gg1) autoCloseable;
            if (b21.F(3, "CXCP")) {
                Log.d("CXCP", "CapturePipeline#aePreCaptureApplyCapture: Unlocking 3A");
            }
            if (this.$captureMode$inlined == 0) {
                z = false;
            }
            this.L$0 = autoCloseable;
            this.label = 3;
            if (gg1Var.G(z) != bw2Var) {
                autoCloseable2 = autoCloseable;
                if (b21.F(3, "CXCP")) {
                    Log.d("CXCP", "CapturePipeline#aePreCaptureApplyCapture: Unlocking 3A done");
                }
                cgg.t(autoCloseable2, null);
                return wef.a;
            }
        }
        return bw2Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((tm1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
