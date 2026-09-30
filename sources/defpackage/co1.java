package defpackage;

import android.hardware.camera2.CaptureResult;
import android.util.Log;
import io.sentry.android.core.b1;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class co1 implements oe1, yff {
    public final qtb a;
    public final uy5 b;

    public co1(qtb qtbVar, uy5 uy5Var) {
        qtbVar.getClass();
        this.a = qtbVar;
        this.b = uy5Var;
    }

    @Override // defpackage.yff
    public final Object H0(em7 em7Var) {
        em7Var.getClass();
        boolean zEquals = em7Var.equals(job.a.b(uy5.class));
        uy5 uy5Var = this.b;
        return zEquals ? uy5Var : uy5Var.H0(em7Var);
    }

    @Override // defpackage.oe1
    public final void b(i35 i35Var) {
        String strValueOf;
        ArrayList arrayList = i35Var.a;
        super.b(i35Var);
        es esVarK = this.b.k();
        try {
            CaptureResult.Key key = CaptureResult.JPEG_ORIENTATION;
            key.getClass();
            esVarK.getClass();
            Integer num = (Integer) esVarK.a.get(key);
            if (num != null) {
                i35Var.d(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            if (b21.F(5, "CXCP")) {
                b1.l("CXCP", "Failed to get JPEG orientation.");
            }
        }
        CaptureResult.Key key2 = CaptureResult.SENSOR_EXPOSURE_TIME;
        key2.getClass();
        esVarK.getClass();
        CaptureResult captureResult = esVarK.a;
        Long l = (Long) captureResult.get(key2);
        if (l != null) {
            i35Var.c("ExposureTime", String.valueOf(l.longValue() / 1.0E9d), arrayList);
        }
        CaptureResult.Key key3 = CaptureResult.LENS_APERTURE;
        key3.getClass();
        Float f = (Float) captureResult.get(key3);
        if (f != null) {
            i35Var.c("FNumber", String.valueOf(f.floatValue()), arrayList);
        }
        CaptureResult.Key key4 = CaptureResult.SENSOR_SENSITIVITY;
        key4.getClass();
        Integer num2 = (Integer) captureResult.get(key4);
        if (num2 != null) {
            int iIntValue = num2.intValue();
            i35Var.c("SensitivityType", String.valueOf(3), arrayList);
            i35Var.c("PhotographicSensitivity", String.valueOf(Math.min(65535, iIntValue)), arrayList);
            CaptureResult.Key key5 = CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST;
            key5.getClass();
            Integer num3 = (Integer) captureResult.get(key5);
            if (num3 != null) {
                int iIntValue2 = iIntValue * ((int) (num3.intValue() / 100.0f));
                i35Var.c("SensitivityType", String.valueOf(3), arrayList);
                i35Var.c("PhotographicSensitivity", String.valueOf(Math.min(65535, iIntValue2)), arrayList);
            }
        }
        CaptureResult.Key key6 = CaptureResult.LENS_FOCAL_LENGTH;
        key6.getClass();
        Float f2 = (Float) captureResult.get(key6);
        if (f2 != null) {
            i35Var.c("FocalLength", ((long) (f2.floatValue() * 1000.0f)) + "/1000", arrayList);
        }
        CaptureResult.Key key7 = CaptureResult.CONTROL_AWB_MODE;
        key7.getClass();
        Integer num4 = (Integer) captureResult.get(key7);
        if (num4 != null) {
            int iB = kv2.B(num4.intValue() == 0 ? 2 : 1);
            if (iB != 0) {
                strValueOf = iB != 1 ? null : String.valueOf(1);
            } else {
                strValueOf = String.valueOf(0);
            }
            i35Var.c("WhiteBalance", strValueOf, arrayList);
        }
    }

    @Override // defpackage.oe1
    public final wde c() {
        return (wde) this.a.a(yde.a, wde.b);
    }

    @Override // defpackage.oe1
    public final int e() {
        es esVarK = this.b.k();
        CaptureResult.Key key = CaptureResult.FLASH_STATE;
        key.getClass();
        esVarK.getClass();
        CaptureResult captureResult = esVarK.a;
        Integer num = (Integer) captureResult.get(key);
        int i = 2;
        if ((num == null || num.intValue() != 0) && (num == null || num.intValue() != 1)) {
            if (num != null && num.intValue() == 2) {
                return 3;
            }
            i = 4;
            if ((num == null || num.intValue() != 3) && (num == null || num.intValue() != 4)) {
                if (num != null && b21.F(3, "CXCP")) {
                    Log.d("CXCP", "Unknown flash state (" + num.intValue() + ") for " + ((Object) yy5.a(captureResult.getFrameNumber())) + '!');
                }
                return 1;
            }
        }
        return i;
    }

    @Override // defpackage.oe1
    public final long i() {
        es esVarK = this.b.k();
        CaptureResult.Key key = CaptureResult.SENSOR_TIMESTAMP;
        key.getClass();
        esVarK.getClass();
        Object obj = esVarK.a.get(key);
        return ((Number) (obj != null ? obj : -1L)).longValue();
    }

    @Override // defpackage.oe1
    public final me1 n() {
        es esVarK = this.b.k();
        CaptureResult.Key key = CaptureResult.CONTROL_AWB_STATE;
        key.getClass();
        esVarK.getClass();
        CaptureResult captureResult = esVarK.a;
        Integer num = (Integer) captureResult.get(key);
        if (num != null && num.intValue() == 0) {
            return me1.b;
        }
        if (num != null && num.intValue() == 1) {
            return me1.c;
        }
        if (num != null && num.intValue() == 2) {
            return me1.d;
        }
        if (num != null && num.intValue() == 3) {
            return me1.e;
        }
        me1 me1Var = me1.a;
        if (num != null && b21.F(3, "CXCP")) {
            Log.d("CXCP", "Unknown AWB state (" + num.intValue() + ") for " + ((Object) yy5.a(captureResult.getFrameNumber())) + '!');
        }
        return me1Var;
    }

    @Override // defpackage.oe1
    public final ke1 t() {
        es esVarK = this.b.k();
        CaptureResult.Key key = CaptureResult.CONTROL_AE_STATE;
        key.getClass();
        esVarK.getClass();
        CaptureResult captureResult = esVarK.a;
        Integer num = (Integer) captureResult.get(key);
        if (num != null && num.intValue() == 0) {
            return ke1.b;
        }
        if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 5)) {
            return ke1.c;
        }
        if (num != null && num.intValue() == 4) {
            return ke1.d;
        }
        if (num != null && num.intValue() == 2) {
            return ke1.e;
        }
        if (num != null && num.intValue() == 3) {
            return ke1.f;
        }
        ke1 ke1Var = ke1.a;
        if (num != null && b21.F(3, "CXCP")) {
            Log.d("CXCP", "Unknown AE state (" + num.intValue() + ") for " + ((Object) yy5.a(captureResult.getFrameNumber())) + '!');
        }
        return ke1Var;
    }

    @Override // defpackage.oe1
    public final le1 y() {
        es esVarK = this.b.k();
        CaptureResult.Key key = CaptureResult.CONTROL_AF_STATE;
        key.getClass();
        esVarK.getClass();
        CaptureResult captureResult = esVarK.a;
        Integer num = (Integer) captureResult.get(key);
        if (num != null && num.intValue() == 0) {
            return le1.b;
        }
        if ((num != null && num.intValue() == 3) || (num != null && num.intValue() == 1)) {
            return le1.c;
        }
        if (num != null && num.intValue() == 4) {
            return le1.f;
        }
        if (num != null && num.intValue() == 5) {
            return le1.g;
        }
        if (num != null && num.intValue() == 2) {
            return le1.d;
        }
        if (num != null && num.intValue() == 6) {
            return le1.e;
        }
        le1 le1Var = le1.a;
        if (num != null && b21.F(3, "CXCP")) {
            Log.d("CXCP", "Unknown AF state (" + num.intValue() + ") for " + ((Object) yy5.a(captureResult.getFrameNumber())) + '!');
        }
        return le1Var;
    }
}
