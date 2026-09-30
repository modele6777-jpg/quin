package defpackage;

import android.hardware.camera2.CaptureResult;
import android.os.Build;
import android.util.Log;
import io.sentry.android.core.b1;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class skf implements qkf {
    public final ui1 a;
    public final mf1 b;
    public final na7 c;
    public final ace d = new ace(new h2e(19, this));

    public skf(ui1 ui1Var, mf1 mf1Var, na7 na7Var) {
        this.a = ui1Var;
        this.b = mf1Var;
        this.c = na7Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.qkf
    public final Object a(jn1 jn1Var, xn2 xn2Var) {
        rkf rkfVar;
        Float fValueOf;
        if (xn2Var instanceof rkf) {
            rkfVar = (rkf) xn2Var;
            int i = rkfVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rkfVar.label = i - Integer.MIN_VALUE;
            } else {
                rkfVar = new rkf(this, (zn2) xn2Var);
            }
        } else {
            rkfVar = new rkf(this, (zn2) xn2Var);
        }
        Object objD = rkfVar.result;
        int i2 = rkfVar.label;
        Boolean boolValueOf = null;
        if (i2 == 0) {
            jzb.q(objD);
            StringBuilder sb = new StringBuilder("shouldUseTorchAsFlash: hasUwCameraUnderexposedFlashCaptureQuirk = ");
            ace aceVar = this.d;
            sb.append(((Boolean) aceVar.getValue()).booleanValue());
            Log.d("CXCP", sb.toString());
            if (!((Boolean) aceVar.getValue()).booleanValue()) {
                return Boolean.TRUE;
            }
            if (Build.VERSION.SDK_INT < 29) {
                b1.l("CXCP", "shouldUseTorchAsFlash: API level is too low to know if it's ultra wide camera, defaulting to workaround for safety.");
                return Boolean.TRUE;
            }
            rkfVar.label = 1;
            objD = jn1Var.d(rkfVar);
            Object obj = bw2.a;
            if (objD == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objD);
        }
        es esVar = (es) objD;
        if (esVar == null) {
            b1.l("CXCP", "shouldUseTorchAsFlash: frameMetadata is null, defaulting to workaround for safety.");
            return Boolean.TRUE;
        }
        CaptureResult.Key key = CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID;
        key.getClass();
        String str = (String) esVar.a.get(key);
        if (str == null) {
            b1.l("CXCP", "isUltraWideCamera: could not get active physical camera ID to identify if it's ultra wide camera.");
        } else {
            ig1.a(str);
            yg1 yg1VarB = mf1.b(this.b, str);
            try {
                try {
                    fValueOf = Float.valueOf(this.c.b(yg1VarB) / na7.a(na7.c(yg1VarB), na7.d(yg1VarB)));
                } catch (Exception e) {
                    throw new IllegalStateException("Failed to get a valid view angle", e);
                }
            } catch (Exception e2) {
                b1.e("CXCP", "Failed to get the intrinsic zoom ratio", e2);
                fValueOf = null;
            }
            if (fValueOf != null) {
                float fFloatValue = fValueOf.floatValue();
                Log.d("CXCP", "isUltraWideCamera: cameraId = " + str + ", intrinsicZoomRatio = " + fFloatValue);
                boolValueOf = Boolean.valueOf(fFloatValue < 1.0f);
            } else {
                b1.l("CXCP", "isUltraWideCamera: could not calculate intrinsic zoom ratio.");
            }
        }
        return Boolean.valueOf(boolValueOf != null ? boolValueOf.booleanValue() : true);
    }

    @Override // defpackage.qkf
    public final boolean e() {
        return !((Boolean) this.d.getValue()).booleanValue();
    }
}
