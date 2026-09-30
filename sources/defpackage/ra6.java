package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ra6 {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static Float a(Bitmap bitmap) {
        Object next;
        int iRgb;
        float[] fArr = new float[3];
        long[] jArr = new long[12];
        long[] jArr2 = new long[12];
        long[] jArr3 = new long[12];
        int[] iArr = new int[12];
        int height = bitmap.getHeight();
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i = 0;
        for (int i2 = 0; i2 < height; i2++) {
            int width = bitmap.getWidth();
            int i3 = 0;
            while (i3 < width) {
                int[] iArr2 = iArr;
                long[] jArr4 = jArr;
                int pixel = bitmap.getPixel(i3, i2);
                long[] jArr5 = jArr2;
                long[] jArr6 = jArr3;
                int i4 = height;
                long jRed = Color.red(pixel);
                long j4 = j + jRed;
                long jGreen = Color.green(pixel);
                j2 += jGreen;
                long jBlue = Color.blue(pixel);
                j3 += jBlue;
                i++;
                Color.colorToHSV(pixel, fArr);
                float f = fArr[1];
                float f2 = fArr[2];
                if (f >= 0.2f && f2 >= 0.15f && f2 <= 0.95f) {
                    int iO = mh3.o((int) ((fArr[0] / 360.0f) * 12.0f), 0, 11);
                    jArr4[iO] = jArr4[iO] + jRed;
                    jArr5[iO] = jArr5[iO] + jGreen;
                    jArr6[iO] = jArr6[iO] + jBlue;
                    iArr2[iO] = iArr2[iO] + 1;
                }
                i3++;
                iArr = iArr2;
                jArr = jArr4;
                jArr2 = jArr5;
                jArr3 = jArr6;
                height = i4;
                j = j4;
            }
        }
        int[] iArr3 = iArr;
        long[] jArr7 = jArr;
        long[] jArr8 = jArr2;
        long[] jArr9 = jArr3;
        Iterator it = qd0.n0(iArr3).iterator();
        y67 y67Var = (y67) it;
        if (y67Var.c) {
            q67 q67Var = (q67) it;
            next = q67Var.next();
            if (y67Var.c) {
                int i5 = iArr3[((Number) next).intValue()];
                do {
                    Object next2 = q67Var.next();
                    int i6 = iArr3[((Number) next2).intValue()];
                    if (i5 < i6) {
                        next = next2;
                        i5 = i6;
                    }
                } while (y67Var.c);
            }
        } else {
            next = null;
        }
        Integer num = (Integer) next;
        if (num == null || iArr3[num.intValue()] <= 0) {
            num = null;
        }
        if (num != null) {
            long j5 = iArr3[num.intValue()];
            iRgb = Color.rgb((int) (jArr7[num.intValue()] / j5), (int) (jArr8[num.intValue()] / j5), (int) (jArr9[num.intValue()] / j5));
        } else {
            if (i <= 0) {
                return null;
            }
            long j6 = i;
            iRgb = Color.rgb((int) (j / j6), (int) (j2 / j6), (int) (j3 / j6));
        }
        Color.colorToHSV(iRgb, fArr);
        return Float.valueOf(fArr[0]);
    }

    public static Float b(Resources resources, int i) {
        Object dzbVar;
        Float fA;
        resources.getClass();
        Integer numValueOf = Integer.valueOf(i);
        ConcurrentHashMap concurrentHashMap = a;
        Float f = (Float) concurrentHashMap.get(numValueOf);
        if (f != null) {
            return Float.valueOf(f.floatValue());
        }
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resources, i);
        Float f2 = null;
        if (bitmapDecodeResource == null) {
            return null;
        }
        try {
            try {
                dzbVar = Bitmap.createScaledBitmap(bitmapDecodeResource, 16, 16, true);
            } catch (Throwable th) {
                dzbVar = new dzb(th);
            }
            if (dzbVar instanceof dzb) {
                dzbVar = null;
            }
            Bitmap bitmap = (Bitmap) dzbVar;
            if (bitmap == null) {
                fA = null;
            } else {
                try {
                    fA = a(bitmap);
                    if (bitmap != bitmapDecodeResource) {
                        bitmap.recycle();
                    }
                } catch (Throwable th2) {
                    if (bitmap != bitmapDecodeResource) {
                        bitmap.recycle();
                    }
                    throw th2;
                }
            }
            if (fA != null) {
                concurrentHashMap.putIfAbsent(Integer.valueOf(i), Float.valueOf(fA.floatValue()));
                f2 = fA;
            }
            bitmapDecodeResource.recycle();
            return f2;
        } catch (Throwable th3) {
            bitmapDecodeResource.recycle();
            throw th3;
        }
    }
}
