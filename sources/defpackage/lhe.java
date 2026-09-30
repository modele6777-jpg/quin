package defpackage;

import android.graphics.Bitmap;
import android.graphics.Color;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lhe {
    public static final psd a;
    public static final int b;
    public static final List c;

    static {
        ond ondVar = new ond(25);
        jhe jheVar = jhe.a;
        a = new psd(ondVar);
        b = -8419585;
        c = t72.I(new axe(4.6f, new float[]{1.0f, 1.0f, 1.0f}, new float[]{-0.433f, -0.5f, -0.75f}), new axe(1.5f, new float[]{1.0f, 1.0f, 1.0f}, new float[]{0.0f, 0.0f, -1.0f}), new axe(1.5f, new float[]{1.0f, 1.0f, 1.0f}, new float[]{0.0f, 1.0f, 0.0f}));
    }

    public static final int a(Bitmap bitmap) {
        if (bitmap == null) {
            return b;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, 16, 16, true);
        bitmapCreateScaledBitmap.getClass();
        int[] iArr = new int[256];
        bitmapCreateScaledBitmap.getPixels(iArr, 0, 16, 0, 0, 16, 16);
        if (bitmapCreateScaledBitmap != bitmap) {
            bitmapCreateScaledBitmap.recycle();
        }
        int i = iArr[0];
        khe kheVar = new khe(Color.red(i), Color.green(i), Color.blue(i));
        Integer[] numArrJ0 = qd0.J0(iArr);
        qd0.z0(kheVar, numArrJ0);
        List listAsList = Arrays.asList(numArrJ0);
        listAsList.getClass();
        List listC1 = s72.c1(listAsList, Math.max(4, 51));
        Iterator it = listC1.iterator();
        long jRed = 0;
        long jGreen = 0;
        long jBlue = 0;
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            jRed += (long) Color.red(iIntValue);
            jGreen += (long) Color.green(iIntValue);
            jBlue += (long) Color.blue(iIntValue);
        }
        long size = listC1.size();
        iy9 iy9Var = new iy9(Integer.valueOf(i), Integer.valueOf(Color.rgb((int) (jRed / size), (int) (jGreen / size), (int) (jBlue / size))));
        int iIntValue2 = ((Number) iy9Var.a()).intValue();
        int iIntValue3 = ((Number) iy9Var.b()).intValue();
        float[] fArr = new float[3];
        Color.colorToHSV(iIntValue2, fArr);
        if (fArr[1] < 0.12f) {
            float[] fArr2 = new float[3];
            Color.colorToHSV(iIntValue3, fArr2);
            if (fArr2[1] >= 0.12f) {
                return iIntValue3;
            }
        }
        return iIntValue2;
    }
}
