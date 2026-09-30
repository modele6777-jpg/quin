package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.util.Range;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wy4 implements sif {
    public final yy4 a;
    public zy4 b;
    public ajf c;

    public wy4(yy4 yy4Var) {
        yy4Var.getClass();
        this.a = yy4Var;
        this.b = new zy4(yy4Var.d, 0, yy4Var.c, yy4Var.e);
    }

    public final za2 a(boolean z) {
        yy4 yy4Var = this.a;
        boolean z2 = yy4Var.d;
        Range range = yy4Var.c;
        if (!z2) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("ExposureCompensation is not supported");
            za2 za2Var = new za2();
            za2Var.i0(illegalArgumentException);
            return za2Var;
        }
        if (!range.contains(0)) {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Requested ExposureCompensation 0 is not within valid range [" + range.getUpper() + " .. " + range.getLower() + ']');
            za2 za2Var2 = new za2();
            za2Var2.i0(illegalArgumentException2);
            return za2Var2;
        }
        ajf ajfVar = this.c;
        if (ajfVar == null) {
            ye1 ye1Var = new ye1("Camera is not active.");
            za2 za2Var3 = yy4Var.f;
            if (za2Var3 != null) {
                za2Var3.i0(ye1Var);
            }
            za2 za2Var4 = new za2();
            za2Var4.i0(ye1Var);
            return za2Var4;
        }
        zy4 zy4Var = this.b;
        this.b = new zy4(zy4Var.a, 0, zy4Var.c, zy4Var.d);
        w92 w92Var = yy4Var.b;
        za2 za2Var5 = new za2();
        za2 za2Var6 = yy4Var.f;
        if (za2Var6 != null) {
            if (z) {
                za2Var6.i0(new ye1("Cancelled by another setExposureCompensationIndex()"));
            } else {
                lmg.o0(za2Var5, za2Var6);
            }
        }
        yy4Var.f = za2Var5;
        xy4 xy4Var = yy4Var.g;
        if (xy4Var != null) {
            w92Var.b(xy4Var);
            yy4Var.g = null;
        }
        ajf.b(ajfVar, bm8.G(new iy9(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, 0)));
        xy4 xy4Var2 = new xy4(za2Var5);
        w92Var.a(xy4Var2, yy4Var.a.e);
        za2Var5.E(new ks2(27, yy4Var, xy4Var2));
        yy4Var.g = xy4Var2;
        return za2Var5;
    }

    @Override // defpackage.sif
    public final void b(ajf ajfVar) {
        this.c = ajfVar;
        a(false);
    }

    @Override // defpackage.sif
    public final void reset() {
        zy4 zy4Var = this.b;
        this.b = new zy4(zy4Var.a, 0, zy4Var.c, zy4Var.d);
        a(true);
    }
}
