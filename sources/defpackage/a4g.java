package defpackage;

import android.graphics.Bitmap;
import android.graphics.Color;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a4g {
    public static final int a = c(0.0f, 0.4f, 0.4f);

    public static int a(Bitmap bitmap) {
        try {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, 16, 16, true);
            bitmapCreateScaledBitmap.getClass();
            try {
                return b(bitmapCreateScaledBitmap);
            } finally {
                if (bitmapCreateScaledBitmap != bitmap) {
                    bitmapCreateScaledBitmap.recycle();
                }
            }
        } catch (Exception unused) {
            return a;
        }
    }

    public static int b(Bitmap bitmap) {
        float[] fArr = new float[3];
        long[] jArr = new long[12];
        long[] jArr2 = new long[12];
        long[] jArr3 = new long[12];
        int[] iArr = new int[12];
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= 16) {
                break;
            }
            int i3 = 0;
            for (int i4 = 16; i3 < i4; i4 = 16) {
                int pixel = bitmap.getPixel(i3, i);
                int i5 = i3;
                long[] jArr4 = jArr;
                long[] jArr5 = jArr2;
                long[] jArr6 = jArr3;
                int[] iArr2 = iArr;
                long jRed = Color.red(pixel);
                j += jRed;
                long jGreen = Color.green(pixel);
                j2 += jGreen;
                long jBlue = Color.blue(pixel);
                j3 += jBlue;
                i2++;
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
                i3 = i5 + 1;
                jArr = jArr4;
                jArr2 = jArr5;
                jArr3 = jArr6;
                iArr = iArr2;
                fArr = fArr;
            }
            i++;
            fArr = fArr;
        }
        long[] jArr7 = jArr;
        long[] jArr8 = jArr2;
        long[] jArr9 = jArr3;
        int[] iArr3 = iArr;
        int i6 = -1;
        for (int i7 = 0; i7 < 12; i7++) {
            int i8 = iArr3[i7];
            if (i8 > 0 && (i6 < 0 || i8 > iArr3[i6])) {
                i6 = i7;
            }
        }
        if (i6 >= 0) {
            long j4 = iArr3[i6];
            return Color.rgb((int) (jArr7[i6] / j4), (int) (jArr8[i6] / j4), (int) (jArr9[i6] / j4));
        }
        if (i2 <= 0) {
            return a;
        }
        long j5 = i2;
        return Color.rgb((int) (j / j5), (int) (j2 / j5), (int) (j3 / j5));
    }

    public static int c(float f, float f2, float f3) {
        return Color.HSVToColor(new float[]{f, f2, f3});
    }
}
