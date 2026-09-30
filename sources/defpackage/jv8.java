package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
import io.sentry.android.core.b1;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jv8 extends oif {
    public final gh1 r;
    public final ja4 s;
    public final Size t;
    public final Object u;
    public wzc v;
    public vx6 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:41:0x00c5  */
    public jv8(gh1 gh1Var, iv8 iv8Var, ja4 ja4Var) {
        Size[] outputSizes;
        Size[] sizeArr;
        super(iv8Var);
        gh1Var.getClass();
        ja4Var.getClass();
        this.r = gh1Var;
        this.s = ja4Var;
        Size size = lv8.a;
        yg1 yg1Var = gh1Var.b;
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
        key.getClass();
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((nc1) yg1Var).c(key);
        Size size2 = null;
        if (streamConfigurationMap == null) {
            if (b21.F(6, "CXCP")) {
                b1.d("CXCP", "Can not retrieve SCALER_STREAM_CONFIGURATION_MAP.");
            }
            outputSizes = null;
        } else {
            outputSizes = streamConfigurationMap.getOutputSizes(34);
        }
        if (outputSizes != null && outputSizes.length != 0) {
            Size size3 = p9e.a;
            if (((RepeatingStreamConstraintForVideoRecordingQuirk) s74.a().b(RepeatingStreamConstraintForVideoRecordingQuirk.class)) == null) {
                sizeArr = outputSizes;
            } else {
                ArrayList arrayList = new ArrayList();
                for (Size size4 : outputSizes) {
                    if (p9e.b.compare(size4, p9e.a) >= 0) {
                        arrayList.add(size4);
                    }
                }
                sizeArr = (Size[]) arrayList.toArray(new Size[0]);
            }
            if (sizeArr.length != 0) {
                outputSizes = sizeArr;
            } else if (b21.F(5, "CXCP")) {
                b1.l("CXCP", "No supported output size list, fallback to current list");
            }
            if (outputSizes.length > 1) {
                qd0.z0(new kv8(0), outputSizes);
            }
            Size sizeC = ja4Var.c();
            long jMin = Math.min(307200L, ((long) sizeC.getWidth()) * ((long) sizeC.getHeight()));
            int length = outputSizes.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    Size size5 = outputSizes[i];
                    long width = ((long) size5.getWidth()) * ((long) size5.getHeight());
                    if (width == jMin) {
                        size = size5;
                    } else if (width <= jMin) {
                        i++;
                        size2 = size5;
                    } else if (size2 != null) {
                        size = size2;
                    }
                }
                if (size2 == null) {
                    size = outputSizes[0];
                } else {
                    size = size2;
                }
            }
        }
        this.t = size;
        this.u = new Object();
    }

    public final vx6 E(Size size) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        vx6 vx6Var = this.w;
        if (vx6Var != null) {
            vx6Var.a();
        }
        vx6 vx6Var2 = new vx6(surface, size, this.i.l());
        this.w = vx6Var2;
        bm8.J(vx6Var2.e).b(new xu8(1, surface, surfaceTexture), g94.a());
        return vx6Var2;
    }

    public final vzc F(final Size size) {
        vx6 vx6VarE;
        synchronized (this.u) {
            vx6VarE = E(size);
        }
        wzc wzcVar = this.v;
        if (wzcVar != null) {
            wzcVar.b();
        }
        wzc wzcVar2 = new wzc(new xzc() { // from class: hv8
            @Override // defpackage.xzc
            public final void a(zzc zzcVar) {
                zzcVar.getClass();
                jv8 jv8Var = this.a;
                jv8Var.C(t72.H(jv8Var.F(size).c()));
                jv8Var.q();
            }
        });
        this.v = wzcVar2;
        vzc vzcVarD = vzc.d(new iv8(), size);
        vzcVarD.b.a = 1;
        vzcVarD.b(vx6VarE, qr4.d, -1);
        vzcVarD.f = wzcVar2;
        return vzcVarD;
    }

    @Override // defpackage.oif
    public final xjf g(boolean z, akf akfVar) {
        akfVar.getClass();
        this.r.getClass();
        this.s.getClass();
        return new iv8();
    }

    @Override // defpackage.oif
    public final wjf m(qh2 qh2Var) {
        qh2Var.getClass();
        this.r.getClass();
        this.s.getClass();
        return new y25(13);
    }

    @Override // defpackage.oif
    public final hq0 y(hq0 hq0Var, hq0 hq0Var2) {
        Size size = this.t;
        C(t72.H(F(size).c()));
        hc2 hc2VarB = hq0Var.b();
        hc2VarB.b = size;
        return hc2VarB.c();
    }

    @Override // defpackage.oif
    public final void z() {
        wzc wzcVar = this.v;
        if (wzcVar != null) {
            wzcVar.b();
        }
        this.v = null;
        synchronized (this.u) {
            try {
                vx6 vx6Var = this.w;
                if (vx6Var != null) {
                    vx6Var.a();
                }
                this.w = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
