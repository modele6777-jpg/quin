package defpackage;

import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vy5 implements Window.OnFrameMetricsAvailableListener {
    public final /* synthetic */ veh a;

    public vy5(veh vehVar) {
        this.a = vehVar;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        veh vehVar = this.a;
        int i2 = vehVar.b;
        if ((i2 & 1) != 0) {
            veh.d(((SparseIntArray[]) vehVar.c)[0], frameMetrics.getMetric(8));
        }
        if ((i2 & 2) != 0) {
            veh.d(((SparseIntArray[]) vehVar.c)[1], frameMetrics.getMetric(1));
        }
        if ((i2 & 4) != 0) {
            veh.d(((SparseIntArray[]) vehVar.c)[2], frameMetrics.getMetric(3));
        }
        if ((i2 & 8) != 0) {
            veh.d(((SparseIntArray[]) vehVar.c)[3], frameMetrics.getMetric(4));
        }
        if ((i2 & 16) != 0) {
            veh.d(((SparseIntArray[]) vehVar.c)[4], frameMetrics.getMetric(5));
        }
        if ((i2 & 64) != 0) {
            veh.d(((SparseIntArray[]) vehVar.c)[6], frameMetrics.getMetric(7));
        }
        if ((i2 & 32) != 0) {
            veh.d(((SparseIntArray[]) vehVar.c)[5], frameMetrics.getMetric(6));
        }
        if ((i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            veh.d(((SparseIntArray[]) vehVar.c)[7], frameMetrics.getMetric(0));
        }
        if ((i2 & 256) != 0) {
            veh.d(((SparseIntArray[]) vehVar.c)[8], frameMetrics.getMetric(2));
        }
    }
}
