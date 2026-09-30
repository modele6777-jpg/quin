package defpackage;

import android.app.Activity;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xy5 {
    public static final ct e = ct.d();
    public final Activity a;
    public final FrameMetricsAggregator b;
    public final HashMap c;
    public boolean d;

    public xy5(Activity activity) {
        FrameMetricsAggregator frameMetricsAggregator = new FrameMetricsAggregator();
        HashMap map = new HashMap();
        this.d = false;
        this.a = activity;
        this.b = frameMetricsAggregator;
        this.c = map;
    }

    public final ur9 a() {
        boolean z = this.d;
        ct ctVar = e;
        if (!z) {
            ctVar.a("No recording has been started.");
            return new ur9();
        }
        SparseIntArray[] sparseIntArrayArr = (SparseIntArray[]) this.b.a.c;
        if (sparseIntArrayArr == null) {
            ctVar.a("FrameMetricsAggregator.mMetrics is uninitialized.");
            return new ur9();
        }
        SparseIntArray sparseIntArray = sparseIntArrayArr[0];
        if (sparseIntArray == null) {
            ctVar.a("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
            return new ur9();
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
            int iKeyAt = sparseIntArray.keyAt(i4);
            int iValueAt = sparseIntArray.valueAt(i4);
            i += iValueAt;
            if (iKeyAt > 700) {
                i3 += iValueAt;
            }
            if (iKeyAt > 16) {
                i2 += iValueAt;
            }
        }
        return new ur9(new wy5(i, i2, i3));
    }
}
