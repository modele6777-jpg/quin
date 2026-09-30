package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import com.canhub.cropper.CropImageActivity;
import com.canhub.cropper.CropImageView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class uy0 extends gbe implements l26 {
    final /* synthetic */ ty0 $result;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ xy0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uy0(xy0 xy0Var, ty0 ty0Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = xy0Var;
        this.$result = ty0Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        uy0 uy0Var = new uy0(this.this$0, this.$result, xn2Var);
        uy0Var.L$0 = obj;
        return uy0Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        CropImageView cropImageView;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (!jgb.Y((aw2) this.L$0) || (cropImageView = (CropImageView) this.this$0.b.get()) == null) {
            Bitmap bitmap = this.$result.a;
            if (bitmap != null) {
                bitmap.recycle();
            }
        } else {
            ty0 ty0Var = this.$result;
            ty0Var.getClass();
            cropImageView.d1 = null;
            cropImageView.h();
            nz2 nz2Var = cropImageView.T0;
            if (nz2Var != null) {
                Uri uri = ty0Var.b;
                Exception exc = ty0Var.c;
                float[] cropPoints = cropImageView.getCropPoints();
                cropImageView.getCropRect();
                cropImageView.getWholeImageRect();
                cropImageView.getRotatedDegrees();
                int i = ty0Var.d;
                cropPoints.getClass();
                ((CropImageActivity) nz2Var).v(uri, exc, i);
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        uy0 uy0Var = (uy0) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        uy0Var.r(wefVar);
        return wefVar;
    }
}
