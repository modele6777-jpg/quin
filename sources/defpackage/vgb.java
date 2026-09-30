package defpackage;

import android.graphics.Bitmap;
import com.adjust.sdk.Constants;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vgb {
    public static final pr4 a = new pr4(1, new i7b(22));
    public static final pr4 b = new pr4(1, new i7b(23));
    public static final pr4 c = new pr4(1, new i7b(24));

    public static final ks a(int i, String str) throws vcg {
        bv4 bv4Var = bv4.c;
        iy9 iy9Var = new iy9(bv4Var, 4);
        bv4 bv4Var2 = bv4.b;
        int i2 = urg.u(str, 0, 0, bm8.H(iy9Var, new iy9(bv4Var2, Constants.ENCODING))).a * 2;
        if (i < i2) {
            i = i2;
        }
        sy0 sy0VarU = urg.u(str, 0, 0, bm8.H(new iy9(bv4Var, 4), new iy9(bv4Var2, Constants.ENCODING)));
        int i3 = i * i;
        int[] iArr = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i * 2;
            iArr[i4] = sy0VarU.a(((((i4 % i) * 2) + 1) * sy0VarU.a) / i5, ((((i4 / i) * 2) + 1) * sy0VarU.b) / i5) ? -16777216 : -1;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, i, i, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        return new ks(bitmapCreateBitmap);
    }
}
