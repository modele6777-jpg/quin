package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mf1 {
    public final yd1 a;

    public mf1(yd1 yd1Var) {
        yd1Var.getClass();
        this.a = yd1Var;
    }

    public static ArrayList a(mf1 mf1Var) {
        ArrayList arrayListD;
        gd1 gd1Var = ((nb1) mf1Var.d()).b;
        synchronized (gd1Var.f) {
            arrayListD = gd1Var.g;
        }
        if (arrayListD == null) {
            arrayListD = gd1Var.d();
        }
        if (arrayListD == null) {
            b1.l("CXCP", "Failed to load cameraIds from " + ((Object) wd1.a("CXCP-Camera2")));
        }
        return arrayListD;
    }

    public static yg1 b(mf1 mf1Var, String str) {
        mf1Var.getClass();
        str.getClass();
        return ((nb1) mf1Var.d()).c.a(str);
    }

    public static Set c(mf1 mf1Var) {
        gd1 gd1Var = ((nb1) mf1Var.d()).b;
        if (Build.VERSION.SDK_INT < 30) {
            gd1Var.getClass();
            return xu4.a;
        }
        synchronized (gd1Var.f) {
        }
        CameraManager cameraManager = (CameraManager) gd1Var.a.get();
        try {
            cameraManager.getClass();
            Set setD = p6.d(cameraManager);
            Log.d("CXCP", "Loaded ConcurrentCameraIdsSet " + setD);
            Set<Set> set = setD;
            ArrayList arrayList = new ArrayList(t72.u(set, 10));
            for (Set<String> set2 : set) {
                ArrayList arrayList2 = new ArrayList(t72.u(set2, 10));
                for (String str : set2) {
                    ig1.a(str);
                    arrayList2.add(new ig1(str));
                }
                arrayList.add(s72.o1(arrayList2));
            }
            return s72.o1(arrayList);
        } catch (CameraAccessException e) {
            b1.n("CXCP", "Failed to query CameraManager#getConcurrentStreamingCameraIds", e);
            return null;
        }
    }

    public final vd1 d() {
        yd1 yd1Var = this.a;
        try {
            Trace.beginSection("getCameraBackend");
            yd1Var.d.getClass();
            vd1 vd1VarA = yd1Var.a("CXCP-Camera2");
            if (vd1VarA != null) {
                Trace.endSection();
                return vd1VarA;
            }
            throw new IllegalStateException(("Failed to load CameraBackend " + ((Object) wd1.a("CXCP-Camera2"))).toString());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
