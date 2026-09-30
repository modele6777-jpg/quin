package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Trace;
import android.util.ArrayMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ds implements uy5 {
    public final TotalCaptureResult a;
    public final es b;

    public ds(TotalCaptureResult totalCaptureResult, String str, qtb qtbVar) {
        Map mapB;
        str.getClass();
        qtbVar.getClass();
        this.a = totalCaptureResult;
        this.b = new es(totalCaptureResult, str);
        try {
            Trace.beginSection("physicalCaptureResults");
            int i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                mapB = xq.o(totalCaptureResult);
                mapB.getClass();
            } else {
                mapB = i >= 28 ? s.B(totalCaptureResult) : qu4.a;
            }
            if (mapB != null && !mapB.isEmpty()) {
                ArrayMap arrayMap = new ArrayMap(mapB.size());
                for (Map.Entry entry : mapB.entrySet()) {
                    String str2 = (String) entry.getKey();
                    ig1.a(str2);
                    arrayMap.put(new ig1(str2), new es((CaptureResult) entry.getValue(), str2));
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.yff
    public final Object H0(em7 em7Var) {
        em7Var.getClass();
        kob kobVar = job.a;
        if (em7Var.equals(kobVar.b(CaptureResult.class)) || em7Var.equals(kobVar.b(TotalCaptureResult.class))) {
            return this.a;
        }
        return null;
    }

    @Override // defpackage.uy5
    public final es k() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FrameInfo(camera: ");
        es esVar = this.b;
        sb.append((Object) ig1.b(esVar.b));
        sb.append(", frameNumber: ");
        sb.append(esVar.a.getFrameNumber());
        sb.append(')');
        return sb.toString();
    }
}
