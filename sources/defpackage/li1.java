package defpackage;

import android.graphics.Bitmap;
import android.util.Base64;
import java.io.ByteArrayOutputStream;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class li1 extends gbe implements l26 {
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ float $degrees;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li1(Bitmap bitmap, float f, xn2 xn2Var) {
        super(2, xn2Var);
        this.$bitmap = bitmap;
        this.$degrees = f;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new li1(this.$bitmap, this.$degrees, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Bitmap bitmapCreateScaledBitmap;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        Bitmap bitmapJ = xo1.J(this.$bitmap, this.$degrees);
        if (bitmapJ.getWidth() > 768 || bitmapJ.getHeight() > 768) {
            float fMax = 768.0f / Math.max(bitmapJ.getWidth(), bitmapJ.getHeight());
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapJ, (int) (bitmapJ.getWidth() * fMax), (int) (bitmapJ.getHeight() * fMax), true);
        } else {
            bitmapCreateScaledBitmap = bitmapJ;
        }
        bitmapCreateScaledBitmap.getClass();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i = 100;
            bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            while (byteArrayOutputStream.size() > 262144 && i > 5) {
                byteArrayOutputStream.reset();
                i -= 5;
                bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArray.getClass();
            return Base64.encodeToString(byteArray, 2);
        } finally {
            if (bitmapCreateScaledBitmap != bitmapJ && !bitmapCreateScaledBitmap.isRecycled()) {
                bitmapCreateScaledBitmap.recycle();
            }
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((li1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
