package defpackage;

import android.hardware.camera2.CameraDevice;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import io.sentry.android.core.b1;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class id1 extends gbe implements a26 {
    final /* synthetic */ CameraDevice $cameraDevice;
    final /* synthetic */ imb $cameraDeviceClosed;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public id1(CameraDevice cameraDevice, imb imbVar, xn2 xn2Var) {
        super(1, xn2Var);
        this.$cameraDevice = cameraDevice;
        this.$cameraDeviceClosed = imbVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        id1 id1Var = new id1(this.$cameraDevice, this.$cameraDeviceClosed, (xn2) obj);
        wef wefVar = wef.a;
        id1Var.r(wefVar);
        return wefVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        CameraDevice cameraDevice = this.$cameraDevice;
        if (cameraDevice != null) {
            Log.i("CXCP", "Closing Camera " + cameraDevice.getId());
            String str = "CXCP#CameraDevice-" + cameraDevice.getId() + "#close";
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            try {
                Trace.beginSection(str);
                try {
                    cameraDevice.close();
                } catch (NullPointerException e) {
                    b1.n("CXCP", "NPE encountered during CameraDevice.close()", e);
                }
                Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", kv2.q(str, " - ")));
            } catch (Throwable th) {
                Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", kv2.q(str, " - ")));
                throw th;
            }
        }
        this.$cameraDeviceClosed.element = true;
        return wef.a;
    }
}
