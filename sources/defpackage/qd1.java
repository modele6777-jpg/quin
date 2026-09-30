package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qd1 implements rd1 {
    public final Context a;
    public final qwe b;
    public final s8a c;
    public final a90 d;
    public final uce e;
    public final ArrayMap f;
    public final ArrayMap g;
    public final ArrayMap h;

    public qd1(Context context, qwe qweVar, s8a s8aVar, a90 a90Var, uce uceVar) {
        qweVar.getClass();
        s8aVar.getClass();
        uceVar.getClass();
        this.a = context;
        this.b = qweVar;
        this.c = s8aVar;
        this.d = a90Var;
        this.e = uceVar;
        this.f = new ArrayMap();
        this.g = new ArrayMap();
        this.h = new ArrayMap();
    }

    public final yg1 a(String str) {
        yg1 yg1VarC;
        str.getClass();
        try {
            Trace.beginSection(((Object) ig1.b(str)) + "#awaitMetadata");
            synchronized (this.f) {
                yg1VarC = (yg1) this.f.get(str);
                if (yg1VarC == null) {
                    if (e()) {
                        yg1VarC = c(str, true);
                    } else {
                        yg1VarC = c(str, false);
                        this.f.put(str, yg1VarC);
                    }
                }
            }
            Trace.endSection();
            return yg1VarC;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final kc1 b(int i, String str, boolean z) {
        String str2;
        this.e.getClass();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(((Object) ig1.b(str)) + "#readCameraExtensionMetadata");
            try {
                Log.d("CXCP", "Loading extension metadata for " + ((Object) ig1.b(str)));
                kc1 kc1Var = new kc1(str, i, d(str));
                long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
                if (!z) {
                    str2 = "";
                } else {
                    if (!z) {
                        throw new rf9();
                    }
                    str2 = " (redacted)";
                }
                Log.i("CXCP", "Loaded extension metadata for " + ((Object) ig1.b(str)) + " in " + String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jElapsedRealtimeNanos2 / 1000000.0d)}, 1)) + str2);
                Trace.endSection();
                return kc1Var;
            } catch (Throwable th) {
                throw new IllegalStateException("Failed to load extension metadata for " + ((Object) ig1.b(str)) + '!', th);
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final nc1 c(String str, boolean z) {
        Iterable iterableN;
        String str2;
        a90 a90Var = this.d;
        Map map = (Map) a90Var.c;
        this.e.getClass();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(((Object) ig1.b(str)) + "#readCameraMetadata");
            String methodName = null;
            try {
                Log.d("CXCP", "Loading metadata for " + ((Object) ig1.b(str)));
                Object systemService = this.a.getSystemService("camera");
                systemService.getClass();
                CameraCharacteristics cameraCharacteristics = ((CameraManager) systemService).getCameraCharacteristics(str);
                cameraCharacteristics.getClass();
                if (Build.VERSION.SDK_INT < 32 || cameraCharacteristics.get(CameraCharacteristics.INFO_DEVICE_STATE_SENSOR_ORIENTATION_MAP) == null) {
                    iterableN = (Set) map.get(new ig1(str));
                } else {
                    Set set = (Set) map.get(new ig1(str));
                    if (set == null) {
                        set = xu4.a;
                    }
                    iterableN = n3d.n(set, CameraCharacteristics.SENSOR_ORIENTATION);
                }
                Set setM = (Set) a90Var.b;
                if (iterableN != null) {
                    setM = n3d.m(setM, iterableN);
                }
                nc1 nc1Var = new nc1(str, cameraCharacteristics, this, setM);
                long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
                if (!z) {
                    str2 = "";
                } else {
                    if (!z) {
                        throw new rf9();
                    }
                    str2 = " (redacted)";
                }
                Log.i("CXCP", "Loaded metadata for " + ((Object) ig1.b(str)) + " in " + String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jElapsedRealtimeNanos2 / 1000000.0d)}, 1)) + str2);
                Trace.endSection();
                return nc1Var;
            } catch (Throwable th) {
                if (Build.VERSION.SDK_INT == 28) {
                    boolean zT = false;
                    if (th instanceof RuntimeException) {
                        StackTraceElement[] stackTrace = th.getStackTrace();
                        stackTrace.getClass();
                        if (stackTrace.length != 0) {
                            methodName = stackTrace[0].getMethodName();
                        }
                        zT = pa7.t(methodName, "_enableShutterSound");
                    }
                    if (zT) {
                        throw new ag4("Failed to load metadata: Do Not Disturb mode is on!");
                    }
                }
                throw new IllegalStateException("Failed to load metadata for " + ((Object) ig1.b(str)) + '!', th);
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final CameraExtensionCharacteristics d(String str) throws CameraAccessException {
        synchronized (this.h) {
            CameraExtensionCharacteristics cameraExtensionCharacteristics = (CameraExtensionCharacteristics) this.h.get(str);
            if (cameraExtensionCharacteristics != null) {
                return cameraExtensionCharacteristics;
            }
            Log.d("CXCP", "Retrieving CameraExtensionCharacteristics for " + ((Object) ig1.b(str)));
            Object systemService = this.a.getSystemService("camera");
            systemService.getClass();
            str.getClass();
            CameraExtensionCharacteristics cameraExtensionCharacteristics2 = ((CameraManager) systemService).getCameraExtensionCharacteristics(str);
            cameraExtensionCharacteristics2.getClass();
            return cameraExtensionCharacteristics2;
        }
    }

    public final boolean e() {
        boolean z;
        s8a s8aVar = this.c;
        s8aVar.getClass();
        if (pa7.t(Build.FINGERPRINT, "robolectric")) {
            z = true;
        } else {
            if (!s8aVar.b) {
                Trace.beginSection("CXCP#checkCameraPermission");
                if (s8aVar.a.checkSelfPermission("android.permission.CAMERA") == 0) {
                    s8aVar.b = true;
                }
                Trace.endSection();
            }
            z = s8aVar.b;
        }
        return !z;
    }
}
