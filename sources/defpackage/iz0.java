package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.canhub.cropper.CropImageActivity;
import com.canhub.cropper.CropImageView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class iz0 extends gbe implements l26 {
    final /* synthetic */ hz0 $result;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ kz0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz0(kz0 kz0Var, hz0 hz0Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = kz0Var;
        this.$result = hz0Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        iz0 iz0Var = new iz0(this.this$0, this.$result, xn2Var);
        iz0Var.L$0 = obj;
        return iz0Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        CropImageView cropImageView;
        CropImageView cropImageView2;
        CropImageView cropImageView3;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (!jgb.Y((aw2) this.L$0) || (cropImageView = (CropImageView) this.this$0.e.get()) == null) {
            Bitmap bitmap = this.$result.b;
            if (bitmap != null) {
                bitmap.recycle();
            }
        } else {
            hz0 hz0Var = this.$result;
            hz0Var.getClass();
            cropImageView.c1 = null;
            cropImageView.h();
            Exception exc = hz0Var.g;
            if (exc == null) {
                int i = hz0Var.d;
                cropImageView.x = i;
                cropImageView.z = hz0Var.e;
                cropImageView.E0 = hz0Var.f;
                cropImageView.f(hz0Var.b, 0, hz0Var.a, hz0Var.c, i);
            }
            rz2 rz2Var = cropImageView.S0;
            if (rz2Var != null) {
                CropImageActivity cropImageActivity = (CropImageActivity) rz2Var;
                if (exc == null) {
                    jz2 jz2Var = cropImageActivity.R0;
                    if (jz2Var == null) {
                        pa7.g0("cropImageOptions");
                        throw null;
                    }
                    Rect rect = jz2Var.l1;
                    if (rect != null && (cropImageView3 = cropImageActivity.S0) != null) {
                        cropImageView3.setCropRect(rect);
                    }
                    jz2 jz2Var2 = cropImageActivity.R0;
                    if (jz2Var2 == null) {
                        pa7.g0("cropImageOptions");
                        throw null;
                    }
                    int i2 = jz2Var2.m1;
                    if (i2 > 0 && (cropImageView2 = cropImageActivity.S0) != null) {
                        cropImageView2.setRotatedDegrees(i2);
                    }
                    jz2 jz2Var3 = cropImageActivity.R0;
                    if (jz2Var3 == null) {
                        pa7.g0("cropImageOptions");
                        throw null;
                    }
                    if (jz2Var3.v1) {
                        cropImageActivity.u();
                    }
                } else {
                    cropImageActivity.v(null, exc, 1);
                }
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        iz0 iz0Var = (iz0) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        iz0Var.r(wefVar);
        return wefVar;
    }
}
