package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vcf extends gbe implements o26 {
    /* synthetic */ int I$0;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.pt0
    public final Object r(Object obj) throws IOException {
        g8d g8dVar = (g8d) this.L$0;
        d6d d6dVar = (d6d) this.L$1;
        int i = this.I$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        g8dVar.getClass();
        int i2 = g8dVar.b;
        d6dVar.getClass();
        BitmapRegionDecoder bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(g8dVar.a.getAbsolutePath(), false);
        if (bitmapRegionDecoderNewInstance == null) {
            qc0.p("Required value was null.");
            return null;
        }
        int i3 = 1;
        while (true) {
            int i4 = i3 * 2;
            try {
                if (i2 / i4 < (i < 1 ? 1 : i)) {
                    break;
                }
                i3 = i4;
            } catch (Throwable th) {
                bitmapRegionDecoderNewInstance.recycle();
                throw th;
            }
        }
        int i5 = d6dVar.a;
        Rect rect = new Rect(0, i5, i2, d6dVar.b + i5);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i3;
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap bitmapDecodeRegion = bitmapRegionDecoderNewInstance.decodeRegion(rect, options);
        if (bitmapDecodeRegion == null) {
            throw new IllegalStateException("Required value was null.");
        }
        bitmapRegionDecoderNewInstance.recycle();
        return bitmapDecodeRegion;
    }

    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj3).intValue();
        vcf vcfVar = new vcf(4, (xn2) obj4);
        vcfVar.L$0 = (g8d) obj;
        vcfVar.L$1 = (d6d) obj2;
        vcfVar.I$0 = iIntValue;
        return vcfVar.r(wef.a);
    }
}
