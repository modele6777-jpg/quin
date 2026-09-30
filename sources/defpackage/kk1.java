package defpackage;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kk1 extends ik1 {
    public static final kk1 b = new kk1();

    @Override // defpackage.ik1
    public final void a(iv6 iv6Var, r1f r1fVar) {
        super.a(iv6Var, r1fVar);
        k79 k79VarJ = k79.j();
        if (((ImageCapturePixelHDRPlusQuirk) s74.a().b(ImageCapturePixelHDRPlusQuirk.class)) != null) {
            no0 no0Var = iv6.b;
            if (iv6Var.h(no0Var)) {
                int iIntValue = ((Integer) iv6Var.c(no0Var)).intValue();
                if (iIntValue == 0) {
                    CaptureRequest.Key key = CaptureRequest.CONTROL_ENABLE_ZSL;
                    key.getClass();
                    k79VarJ.p(af1.D(key), Boolean.TRUE);
                } else if (iIntValue == 1) {
                    CaptureRequest.Key key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
                    key2.getClass();
                    k79VarJ.p(af1.D(key2), Boolean.FALSE);
                }
            }
        }
        r1fVar.e(new od1(7, bs9.d(k79VarJ)));
    }
}
