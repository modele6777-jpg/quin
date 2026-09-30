package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class dp implements re1 {
    public final fp a;
    public final CameraCaptureSession b;
    public final nd1 c;
    public final Handler d;

    public dp(fp fpVar, CameraCaptureSession cameraCaptureSession, nd1 nd1Var, Handler handler) {
        nd1Var.getClass();
        handler.getClass();
        this.a = fpVar;
        this.b = cameraCaptureSession;
        this.c = nd1Var;
        this.d = handler;
        wh0 wh0Var = ug1.a;
        wh0Var.getClass();
        wh0.b.incrementAndGet(wh0Var);
    }

    @Override // defpackage.re1
    public final boolean B0() throws Throwable {
        double d;
        wef wefVar;
        StringBuilder sb = new StringBuilder("CXCP#stopRepeating-");
        String str = this.a.c;
        sb.append(str);
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            nd1 nd1Var = this.c;
            try {
                this.b.stopRepeating();
                wefVar = wef.a;
                d = 1000000.0d;
            } catch (Exception e) {
                d = 1000000.0d;
                try {
                    if (e instanceof CameraAccessException) {
                        b1.l("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                        CameraAccessException cameraAccessException = (CameraAccessException) e;
                        int reason = cameraAccessException.getReason();
                        int i = 3;
                        if (reason != 1) {
                            if (reason == 2) {
                                i = 6;
                            } else if (reason == 3) {
                                i = 0;
                            } else if (reason == 4) {
                                i = 1;
                            } else if (reason != 5) {
                                b1.l("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                i = 11;
                            } else {
                                i = 2;
                            }
                        }
                        nd1Var.a(i, str, true);
                    } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                        b1.l("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                        nd1Var.a(9, str, false);
                    } else {
                        if (!(e instanceof IllegalStateException)) {
                            throw e;
                        }
                        Log.d("CXCP", "Failed to execute call: Camera may be closed");
                    }
                    wefVar = null;
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", kv2.q(string, " - ")));
                    throw th;
                }
            }
            Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", kv2.q(string, " - ")));
            return wefVar != null;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
        }
    }

    @Override // defpackage.yff
    public Object H0(em7 em7Var) {
        em7Var.getClass();
        if (em7Var.equals(job.a.b(CameraCaptureSession.class))) {
            return this.b;
        }
        return null;
    }

    @Override // defpackage.re1
    public final Integer K(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws Throwable {
        double d;
        Integer numValueOf;
        captureRequest.getClass();
        StringBuilder sb = new StringBuilder("CXCP#capture-");
        String str = this.a.c;
        sb.append(str);
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(string);
                nd1 nd1Var = this.c;
                try {
                    d = 1000000.0d;
                    try {
                        numValueOf = Integer.valueOf(this.b.capture(captureRequest, captureCallback, this.d));
                    } catch (Exception e) {
                        e = e;
                        int i = 0;
                        if (e instanceof CameraAccessException) {
                            b1.l("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                            CameraAccessException cameraAccessException = (CameraAccessException) e;
                            int reason = cameraAccessException.getReason();
                            if (reason == 1) {
                                i = 3;
                            } else if (reason == 2) {
                                i = 6;
                            } else if (reason != 3) {
                                if (reason == 4) {
                                    i = 1;
                                } else if (reason != 5) {
                                    b1.l("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                    i = 11;
                                } else {
                                    i = 2;
                                }
                            }
                            nd1Var.a(i, str, true);
                        } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                            b1.l("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                            nd1Var.a(9, str, false);
                        } else {
                            if (!(e instanceof IllegalStateException)) {
                                throw e;
                            }
                            Log.d("CXCP", "Failed to execute call: Camera may be closed");
                        }
                        numValueOf = null;
                    }
                } catch (Exception e2) {
                    e = e2;
                    d = 1000000.0d;
                }
                Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", kv2.q(string, " - ")));
                return numValueOf;
            } catch (Throwable th) {
                th = th;
                Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", kv2.q(string, " - ")));
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", kv2.q(string, " - ")));
            throw th;
        }
    }

    @Override // defpackage.re1
    public final Integer K0(ArrayList arrayList, CameraCaptureSession.CaptureCallback captureCallback) throws Throwable {
        double d;
        Integer numValueOf;
        StringBuilder sb = new StringBuilder("CXCP#setRepeatingBurst-");
        String str = this.a.c;
        sb.append(str);
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(string);
                nd1 nd1Var = this.c;
                try {
                    d = 1000000.0d;
                    try {
                        numValueOf = Integer.valueOf(this.b.setRepeatingBurst(arrayList, captureCallback, this.d));
                    } catch (Exception e) {
                        e = e;
                        int i = 0;
                        if (e instanceof CameraAccessException) {
                            b1.l("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                            CameraAccessException cameraAccessException = (CameraAccessException) e;
                            int reason = cameraAccessException.getReason();
                            if (reason == 1) {
                                i = 3;
                            } else if (reason == 2) {
                                i = 6;
                            } else if (reason != 3) {
                                if (reason == 4) {
                                    i = 1;
                                } else if (reason != 5) {
                                    b1.l("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                    i = 11;
                                } else {
                                    i = 2;
                                }
                            }
                            nd1Var.a(i, str, true);
                        } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                            b1.l("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                            nd1Var.a(9, str, false);
                        } else {
                            if (!(e instanceof IllegalStateException)) {
                                throw e;
                            }
                            Log.d("CXCP", "Failed to execute call: Camera may be closed");
                        }
                        numValueOf = null;
                    }
                } catch (Exception e2) {
                    e = e2;
                    d = 1000000.0d;
                }
                Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", kv2.q(string, " - ")));
                return numValueOf;
            } catch (Throwable th) {
                th = th;
                Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", kv2.q(string, " - ")));
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", kv2.q(string, " - ")));
            throw th;
        }
    }

    @Override // defpackage.re1
    public final Integer O0(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws Throwable {
        double d;
        Integer numValueOf;
        captureRequest.getClass();
        StringBuilder sb = new StringBuilder("CXCP#setRepeatingRequest-");
        String str = this.a.c;
        sb.append(str);
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(string);
                nd1 nd1Var = this.c;
                try {
                    d = 1000000.0d;
                    try {
                        numValueOf = Integer.valueOf(this.b.setRepeatingRequest(captureRequest, captureCallback, this.d));
                    } catch (Exception e) {
                        e = e;
                        int i = 0;
                        if (e instanceof CameraAccessException) {
                            b1.l("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                            CameraAccessException cameraAccessException = (CameraAccessException) e;
                            int reason = cameraAccessException.getReason();
                            if (reason == 1) {
                                i = 3;
                            } else if (reason == 2) {
                                i = 6;
                            } else if (reason != 3) {
                                if (reason == 4) {
                                    i = 1;
                                } else if (reason != 5) {
                                    b1.l("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                    i = 11;
                                } else {
                                    i = 2;
                                }
                            }
                            nd1Var.a(i, str, true);
                        } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                            b1.l("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                            nd1Var.a(9, str, false);
                        } else {
                            if (!(e instanceof IllegalStateException)) {
                                throw e;
                            }
                            Log.d("CXCP", "Failed to execute call: Camera may be closed");
                        }
                        numValueOf = null;
                    }
                } catch (Exception e2) {
                    e = e2;
                    d = 1000000.0d;
                }
                Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", kv2.q(string, " - ")));
                return numValueOf;
            } catch (Throwable th) {
                th = th;
                Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", kv2.q(string, " - ")));
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", kv2.q(string, " - ")));
            throw th;
        }
    }

    @Override // defpackage.re1
    public final Integer Q0(ArrayList arrayList, CameraCaptureSession.CaptureCallback captureCallback) throws Throwable {
        double d;
        Integer numValueOf;
        StringBuilder sb = new StringBuilder("CXCP#captureBurst-");
        String str = this.a.c;
        sb.append(str);
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(string);
                nd1 nd1Var = this.c;
                try {
                    d = 1000000.0d;
                    try {
                        numValueOf = Integer.valueOf(this.b.captureBurst(arrayList, captureCallback, this.d));
                    } catch (Exception e) {
                        e = e;
                        int i = 0;
                        if (e instanceof CameraAccessException) {
                            b1.l("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                            CameraAccessException cameraAccessException = (CameraAccessException) e;
                            int reason = cameraAccessException.getReason();
                            if (reason == 1) {
                                i = 3;
                            } else if (reason == 2) {
                                i = 6;
                            } else if (reason != 3) {
                                if (reason == 4) {
                                    i = 1;
                                } else if (reason != 5) {
                                    b1.l("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                    i = 11;
                                } else {
                                    i = 2;
                                }
                            }
                            nd1Var.a(i, str, true);
                        } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                            b1.l("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                            nd1Var.a(9, str, false);
                        } else {
                            if (!(e instanceof IllegalStateException)) {
                                throw e;
                            }
                            Log.d("CXCP", "Failed to execute call: Camera may be closed");
                        }
                        numValueOf = null;
                    }
                } catch (Exception e2) {
                    e = e2;
                    d = 1000000.0d;
                }
                Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", kv2.q(string, " - ")));
                return numValueOf;
            } catch (Throwable th) {
                th = th;
                Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", kv2.q(string, " - ")));
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", kv2.q(string, " - ")));
            throw th;
        }
    }

    @Override // defpackage.re1
    public final boolean b0() throws Throwable {
        double d;
        wef wefVar;
        StringBuilder sb = new StringBuilder("CXCP#abortCaptures-");
        String str = this.a.c;
        sb.append(str);
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            nd1 nd1Var = this.c;
            try {
                this.b.abortCaptures();
                wefVar = wef.a;
                d = 1000000.0d;
            } catch (Exception e) {
                d = 1000000.0d;
                try {
                    if (e instanceof CameraAccessException) {
                        b1.l("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                        CameraAccessException cameraAccessException = (CameraAccessException) e;
                        int reason = cameraAccessException.getReason();
                        int i = 3;
                        if (reason != 1) {
                            if (reason == 2) {
                                i = 6;
                            } else if (reason == 3) {
                                i = 0;
                            } else if (reason == 4) {
                                i = 1;
                            } else if (reason != 5) {
                                b1.l("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                i = 11;
                            } else {
                                i = 2;
                            }
                        }
                        nd1Var.a(i, str, true);
                    } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                        b1.l("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                        nd1Var.a(9, str, false);
                    } else {
                        if (!(e instanceof IllegalStateException)) {
                            throw e;
                        }
                        Log.d("CXCP", "Failed to execute call: Camera may be closed");
                    }
                    wefVar = null;
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", kv2.q(string, " - ")));
                    throw th;
                }
            }
            Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", kv2.q(string, " - ")));
            return wefVar != null;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    @Override // defpackage.re1
    public final Surface getInputSurface() {
        return this.b.getInputSurface();
    }

    @Override // defpackage.re1
    public final lf1 m0() {
        return this.a;
    }

    @Override // defpackage.re1
    public final boolean z0(List list) throws Throwable {
        double d;
        wef wefVar;
        StringBuilder sb = new StringBuilder("CXCP#finalizeOutputConfigurations-");
        String str = this.a.c;
        sb.append(str);
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            nd1 nd1Var = this.c;
            try {
                CameraCaptureSession cameraCaptureSession = this.b;
                d = 1000000.0d;
                try {
                    try {
                        ArrayList arrayList = new ArrayList(t72.u(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add((OutputConfiguration) ((ot) it.next()).H0(job.a.b(OutputConfiguration.class)));
                        }
                        cameraCaptureSession.finalizeOutputConfigurations(arrayList);
                        wefVar = wef.a;
                    } catch (Throwable th) {
                        th = th;
                        Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", kv2.q(string, " - ")));
                        throw th;
                    }
                } catch (Exception e) {
                    e = e;
                    if (e instanceof CameraAccessException) {
                        b1.l("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                        CameraAccessException cameraAccessException = (CameraAccessException) e;
                        int reason = cameraAccessException.getReason();
                        int i = 3;
                        if (reason != 1) {
                            if (reason == 2) {
                                i = 6;
                            } else if (reason == 3) {
                                i = 0;
                            } else if (reason == 4) {
                                i = 1;
                            } else if (reason != 5) {
                                b1.l("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                i = 11;
                            } else {
                                i = 2;
                            }
                        }
                        nd1Var.a(i, str, true);
                    } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                        b1.l("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                        nd1Var.a(9, str, false);
                    } else {
                        if (!(e instanceof IllegalStateException)) {
                            throw e;
                        }
                        Log.d("CXCP", "Failed to execute call: Camera may be closed");
                    }
                    wefVar = null;
                }
            } catch (Exception e2) {
                e = e2;
                d = 1000000.0d;
            }
            Log.d("CXCP", kv2.p(new Object[]{Double.valueOf(kv2.b(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", kv2.q(string, " - ")));
            return wefVar != null;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
        }
    }
}
