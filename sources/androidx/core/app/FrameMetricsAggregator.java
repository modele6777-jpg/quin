package androidx.core.app;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import defpackage.veh;
import defpackage.vy5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class FrameMetricsAggregator {
    public final veh a;

    public FrameMetricsAggregator(int i) {
        this.a = new veh(i);
    }

    public final void a(Activity activity) {
        veh vehVar = this.a;
        vehVar.getClass();
        if (veh.g == null) {
            HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
            veh.g = handlerThread;
            handlerThread.start();
            veh.v = new Handler(veh.g.getLooper());
        }
        for (int i = 0; i <= 8; i++) {
            SparseIntArray[] sparseIntArrayArr = (SparseIntArray[]) vehVar.c;
            if (sparseIntArrayArr[i] == null && (vehVar.b & (1 << i)) != 0) {
                sparseIntArrayArr[i] = new SparseIntArray();
            }
        }
        activity.getWindow().addOnFrameMetricsAvailableListener((vy5) vehVar.e, veh.v);
        ((ArrayList) vehVar.d).add(new WeakReference(activity));
    }

    public final void b(Activity activity) {
        veh vehVar = this.a;
        ArrayList<WeakReference> arrayList = (ArrayList) vehVar.d;
        for (WeakReference weakReference : arrayList) {
            if (weakReference.get() == activity) {
                arrayList.remove(weakReference);
                break;
            }
        }
        activity.getWindow().removeOnFrameMetricsAvailableListener((vy5) vehVar.e);
    }

    public FrameMetricsAggregator() {
        this(1);
    }
}
