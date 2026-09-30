package defpackage;

import android.graphics.Bitmap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k6d extends gbe implements l26 {
    final /* synthetic */ cv6 $source;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6d(cv6 cv6Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$source = cv6Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new k6d(this.$source, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        Bitmap bitmapO = abg.o(this.$source);
        bitmapO.getClass();
        int iL = ym8.L((bitmapO.getHeight() * 196.0f) / bitmapO.getWidth());
        int i = iL < 1 ? 1 : iL;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapO, 196, i, true);
        bitmapCreateScaledBitmap.getClass();
        int iCeil = (int) Math.ceil(8.160999298095703d);
        int i2 = iCeil * 2;
        int i3 = i2 + 1;
        float[] fArr = new float[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i4 - iCeil;
            fArr[i4] = (float) Math.exp(((-i5) * i5) / 14.800425f);
        }
        float f = 0.0f;
        for (int i6 = 0; i6 < i3; i6++) {
            f += fArr[i6];
        }
        Iterator it = new z67(0, i2, 1).iterator();
        while (((y67) it).hasNext()) {
            int iNextInt = ((q67) it).nextInt();
            fArr[iNextInt] = fArr[iNextInt] / f;
        }
        int width = bitmapCreateScaledBitmap.getWidth() * bitmapCreateScaledBitmap.getHeight();
        int[] iArr = new int[width];
        bitmapCreateScaledBitmap.getPixels(iArr, 0, bitmapCreateScaledBitmap.getWidth(), 0, 0, bitmapCreateScaledBitmap.getWidth(), bitmapCreateScaledBitmap.getHeight());
        int[] iArr2 = new int[width];
        int[] iArr3 = new int[width];
        q1c.e(i, iCeil, fArr, iArr, iArr2, true);
        q1c.e(i, iCeil, fArr, iArr2, iArr3, false);
        if (bitmapCreateScaledBitmap != bitmapO) {
            bitmapCreateScaledBitmap.recycle();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr3, 196, i, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        return new ks(bitmapCreateBitmap);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((k6d) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
