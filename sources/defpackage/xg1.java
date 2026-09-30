package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xg1 {
    public static final /* synthetic */ xg1 a = new xg1();
    public static final int[] b;

    static {
        HashMap map = ru8.c;
        kob kobVar = job.a;
        af1.C(kobVar.b(yj1.class), "androidx.camera.camera2.pipe.scalar.streamConfigurationMap");
        af1.C(kobVar.b(bh1.class), "androidx.camera.camera2.pipe.scalar.multiResolutionStreamConfigurationMap");
        af1.C(kobVar.b(se1.class), "androidx.camera.camera2.pipe.request.availableColorSpaceProfilesMap");
        b = new int[0];
    }

    public static boolean a(yg1 yg1Var) {
        yg1Var.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE;
        key.getClass();
        nc1 nc1Var = (nc1) yg1Var;
        Float f = (Float) nc1Var.c(key);
        if (f == null) {
            CameraCharacteristics.Key key2 = CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES;
            key2.getClass();
            int[] iArr = (int[]) nc1Var.c(key2);
            if (iArr == null) {
                return false;
            }
            if (!qd0.T(iArr, 1) && !qd0.T(iArr, 2) && !qd0.T(iArr, 4) && !qd0.T(iArr, 3)) {
                return false;
            }
        } else if (f.floatValue() <= 0.0f) {
            return false;
        }
        return true;
    }

    public static boolean b(yg1 yg1Var) {
        yg1Var.getClass();
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        yg1.o.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES;
        key.getClass();
        int[] iArr = (int[]) ((nc1) yg1Var).c(key);
        if (iArr == null) {
            iArr = b;
        }
        return qd0.T(iArr, 2);
    }

    public static boolean c(yg1 yg1Var) {
        yg1Var.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        key.getClass();
        Integer num = (Integer) ((nc1) yg1Var).c(key);
        return num != null && num.intValue() == 2;
    }
}
