package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import io.sentry.android.core.b1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vz0 {
    public static final Rect a = new Rect();
    public static final RectF b = new RectF();
    public static final RectF c = new RectF();
    public static final float[] d = new float[6];
    public static final float[] e = new float[6];
    public static int f;
    public static Pair g;

    public static int a(int i, int i2) {
        int iMax = f;
        int i3 = 1;
        if (iMax == 0) {
            iMax = 2048;
            try {
                EGL egl = EGLContext.getEGL();
                egl.getClass();
                EGL10 egl10 = (EGL10) egl;
                EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                egl10.eglInitialize(eGLDisplayEglGetDisplay, new int[2]);
                int[] iArr = new int[1];
                egl10.eglGetConfigs(eGLDisplayEglGetDisplay, null, 0, iArr);
                int i4 = iArr[0];
                EGLConfig[] eGLConfigArr = new EGLConfig[i4];
                egl10.eglGetConfigs(eGLDisplayEglGetDisplay, eGLConfigArr, i4, iArr);
                int[] iArr2 = new int[1];
                int i5 = iArr[0];
                int i6 = 0;
                for (int i7 = 0; i7 < i5; i7++) {
                    egl10.eglGetConfigAttrib(eGLDisplayEglGetDisplay, eGLConfigArr[i7], 12332, iArr2);
                    int i8 = iArr2[0];
                    if (i6 < i8) {
                        i6 = i8;
                    }
                }
                egl10.eglTerminate(eGLDisplayEglGetDisplay);
                iMax = Math.max(i6, 2048);
            } catch (Exception unused) {
            }
            f = iMax;
        }
        if (iMax > 0) {
            while (true) {
                int i9 = i2 / i3;
                int i10 = f;
                if (i9 <= i10 && i / i3 <= i10) {
                    break;
                }
                i3 *= 2;
            }
        }
        return i3;
    }

    public static int b(int i, int i2, int i3, int i4) {
        int i5 = 1;
        if (i2 <= i4 && i <= i3) {
            return 1;
        }
        while ((i2 / 2) / i5 > i4 && (i / 2) / i5 > i3) {
            i5 *= 2;
        }
        return i5;
    }

    public static sz0 c(Context context, Uri uri, float[] fArr, int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7, boolean z2, boolean z3) {
        fArr.getClass();
        int i8 = 1;
        do {
            try {
                uri.getClass();
                return d(context, uri, fArr, i, i2, i3, z, i4, i5, i6, i7, z2, z3, i8);
            } catch (OutOfMemoryError e2) {
                i8 *= 2;
            }
        } while (i8 <= 16);
        throw new RuntimeException("Failed to handle OOM by sampling (" + i8 + "): " + uri + "\r\n" + e2.getMessage(), e2);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x007e A[Catch: OutOfMemoryError -> 0x0082, TRY_LEAVE, TryCatch #8 {OutOfMemoryError -> 0x0082, blocks: (B:31:0x0071, B:33:0x007e), top: B:91:0x0071 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0088 A[Catch: OutOfMemoryError -> 0x0097, TRY_LEAVE, TryCatch #3 {OutOfMemoryError -> 0x0097, blocks: (B:37:0x0084, B:39:0x0088), top: B:83:0x0084 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d6 A[Catch: all -> 0x00e1, TRY_LEAVE, TryCatch #1 {all -> 0x00e1, blocks: (B:52:0x00cc, B:54:0x00d6), top: B:79:0x00cc }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00fe A[Catch: Exception -> 0x0102, OutOfMemoryError -> 0x0104, TryCatch #10 {Exception -> 0x0102, OutOfMemoryError -> 0x0104, blocks: (B:50:0x00aa, B:60:0x00f8, B:62:0x00fe, B:68:0x0107, B:69:0x010a), top: B:95:0x00aa }] */
    /* JADX WARN: Code duplicated, block: B:79:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static sz0 d(Context context, Uri uri, float[] fArr, int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7, boolean z2, boolean z3, int i8) throws Throwable {
        Uri uri2;
        Bitmap bitmap;
        Bitmap bitmapCreateBitmap;
        int i9;
        BitmapFactory.Options options;
        Bitmap bitmapH;
        Bitmap bitmap2;
        int length;
        float[] fArr2;
        int i10;
        Bitmap bitmap3;
        int i11;
        Rect rectM = m(fArr, i2, i3, z, i4, i5);
        int iWidth = i6 > 0 ? i6 : rectM.width();
        int iHeight = i7 > 0 ? i7 : rectM.height();
        Bitmap bitmapF = null;
        try {
            sz0 sz0VarJ = j(context, uri, rectM, iWidth, iHeight, i8);
            uri2 = uri;
            try {
                bitmap = sz0VarJ.a;
                try {
                    bitmapCreateBitmap = bitmap;
                    i9 = sz0VarJ.b;
                } catch (Exception unused) {
                    bitmapCreateBitmap = bitmap;
                    i9 = 1;
                }
            } catch (Exception unused2) {
                bitmap = null;
                bitmapCreateBitmap = bitmap;
                i9 = 1;
                if (bitmapCreateBitmap == null) {
                    try {
                        options = new BitmapFactory.Options();
                        int iB = b(rectM.width(), rectM.height(), iWidth, iHeight) * i8;
                        options.inSampleSize = iB;
                        ContentResolver contentResolver = context.getContentResolver();
                        contentResolver.getClass();
                        bitmapH = h(contentResolver, uri2, options);
                        if (bitmapH != null) {
                            try {
                                length = fArr.length;
                                fArr2 = new float[length];
                                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                                for (i10 = 0; i10 < length; i10++) {
                                    fArr2[i10] = fArr2[i10] / options.inSampleSize;
                                }
                                bitmap2 = bitmapH;
                                try {
                                    bitmapF = f(bitmap2, fArr2, i, z, i4, i5, 1.0f, z2, z3);
                                    if (!pa7.t(bitmapF, bitmap2)) {
                                        bitmap2.recycle();
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    bitmap2.recycle();
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                bitmap2 = bitmapH;
                            }
                        }
                        return new sz0(bitmapF, iB);
                    } catch (Exception e2) {
                        throw new bz2.b(uri2, e2.getMessage());
                    } catch (OutOfMemoryError e3) {
                        if (0 != 0) {
                            bitmapF.recycle();
                        }
                        throw e3;
                    }
                }
                if (i > 0) {
                    Matrix matrix = new Matrix();
                    matrix.setRotate(i);
                    if (z2) {
                        i11 = -1;
                    } else {
                        i11 = 1;
                    }
                    matrix.postScale(i11, z3 ? -1 : 1);
                    bitmap3 = bitmapCreateBitmap;
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmap3, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, false);
                    bitmapCreateBitmap.getClass();
                    if (!bitmapCreateBitmap.equals(bitmap3)) {
                        bitmap3.recycle();
                    }
                    if (i % 90 != 0) {
                        bitmapCreateBitmap = g(bitmapCreateBitmap, fArr, rectM, i, z, i4, i5);
                    }
                    return new sz0(bitmapCreateBitmap, i9);
                }
                try {
                    Matrix matrix2 = new Matrix();
                    matrix2.setRotate(i);
                    if (z2) {
                        i11 = -1;
                    } else {
                        i11 = 1;
                    }
                    matrix2.postScale(i11, z3 ? -1 : 1);
                    bitmap3 = bitmapCreateBitmap;
                    try {
                        bitmapCreateBitmap = Bitmap.createBitmap(bitmap3, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix2, false);
                        bitmapCreateBitmap.getClass();
                        if (!bitmapCreateBitmap.equals(bitmap3)) {
                            bitmap3.recycle();
                        }
                        try {
                            if (i % 90 != 0) {
                                bitmapCreateBitmap = g(bitmapCreateBitmap, fArr, rectM, i, z, i4, i5);
                            }
                            return new sz0(bitmapCreateBitmap, i9);
                        } catch (OutOfMemoryError e4) {
                            e = e4;
                            bitmapCreateBitmap.recycle();
                            throw e;
                        }
                    } catch (OutOfMemoryError e5) {
                        e = e5;
                        bitmapCreateBitmap = bitmap3;
                        bitmapCreateBitmap.recycle();
                        throw e;
                    }
                } catch (OutOfMemoryError e6) {
                    e = e6;
                    bitmap3 = bitmapCreateBitmap;
                }
                bitmapCreateBitmap.recycle();
                throw e;
            }
        } catch (Exception unused3) {
            uri2 = uri;
        }
        if (bitmapCreateBitmap == null) {
            if (i > 0 || z2 || z3) {
                Matrix matrix3 = new Matrix();
                matrix3.setRotate(i);
                if (z2) {
                    i11 = -1;
                } else {
                    i11 = 1;
                }
                matrix3.postScale(i11, z3 ? -1 : 1);
                bitmap3 = bitmapCreateBitmap;
                bitmapCreateBitmap = Bitmap.createBitmap(bitmap3, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix3, false);
                bitmapCreateBitmap.getClass();
                if (!bitmapCreateBitmap.equals(bitmap3)) {
                    bitmap3.recycle();
                }
            }
            if (i % 90 != 0) {
                bitmapCreateBitmap = g(bitmapCreateBitmap, fArr, rectM, i, z, i4, i5);
            }
            return new sz0(bitmapCreateBitmap, i9);
        }
        options = new BitmapFactory.Options();
        int iB2 = b(rectM.width(), rectM.height(), iWidth, iHeight) * i8;
        options.inSampleSize = iB2;
        ContentResolver contentResolver2 = context.getContentResolver();
        contentResolver2.getClass();
        bitmapH = h(contentResolver2, uri2, options);
        if (bitmapH != null) {
            length = fArr.length;
            fArr2 = new float[length];
            System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
            while (i10 < length) {
                fArr2[i10] = fArr2[i10] / options.inSampleSize;
            }
            bitmap2 = bitmapH;
            bitmapF = f(bitmap2, fArr2, i, z, i4, i5, 1.0f, z2, z3);
            if (!pa7.t(bitmapF, bitmap2)) {
                bitmap2.recycle();
            }
        }
        return new sz0(bitmapF, iB2);
    }

    public static sz0 e(Bitmap bitmap, float[] fArr, int i, boolean z, int i2, int i3, boolean z2, boolean z3) {
        fArr.getClass();
        int i4 = 1;
        do {
            try {
                bitmap.getClass();
                return new sz0(f(bitmap, fArr, i, z, i2, i3, 1.0f / i4, z2, z3), i4);
            } catch (OutOfMemoryError e2) {
                i4 *= 2;
            }
        } while (i4 <= 8);
        throw e2;
    }

    public static Bitmap f(Bitmap bitmap, float[] fArr, int i, boolean z, int i2, int i3, float f2, boolean z2, boolean z3) {
        Rect rectM = m(fArr, bitmap.getWidth(), bitmap.getHeight(), z, i2, i3);
        Matrix matrix = new Matrix();
        matrix.setRotate(i, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        matrix.postScale(z2 ? -f2 : f2, z3 ? -f2 : f2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, rectM.left, rectM.top, rectM.width(), rectM.height(), matrix, true);
        bitmapCreateBitmap.getClass();
        if (bitmapCreateBitmap.equals(bitmap)) {
            bitmapCreateBitmap = bitmap.copy(bitmap.getConfig(), false);
        }
        Bitmap bitmap2 = bitmapCreateBitmap;
        return i % 90 != 0 ? g(bitmap2, fArr, rectM, i, z, i2, i3) : bitmap2;
    }

    public static Bitmap g(Bitmap bitmap, float[] fArr, Rect rect, int i, boolean z, int i2, int i3) {
        int iAbs;
        int iAbs2;
        int iAbs3;
        if (i % 90 == 0) {
            return bitmap;
        }
        double radians = Math.toRadians(i);
        int i4 = (i < 90 || (181 <= i && i < 270)) ? rect.left : rect.right;
        int iAbs4 = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= fArr.length) {
                iAbs = 0;
                iAbs2 = 0;
                iAbs3 = 0;
                break;
            }
            float f2 = fArr[i5];
            if (f2 >= i4 - 1 && f2 <= i4 + 1) {
                int i6 = i5 + 1;
                iAbs4 = (int) Math.abs(Math.sin(radians) * ((double) (rect.bottom - fArr[i6])));
                iAbs2 = (int) Math.abs(Math.cos(radians) * ((double) (fArr[i6] - rect.top)));
                iAbs3 = (int) Math.abs(((double) (fArr[i6] - rect.top)) / Math.sin(radians));
                iAbs = (int) Math.abs(((double) (rect.bottom - fArr[i6])) / Math.cos(radians));
                break;
            }
            i5 += 2;
        }
        rect.set(iAbs4, iAbs2, iAbs3 + iAbs4, iAbs + iAbs2);
        if (z) {
            k(rect, i2, i3);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
        if (!pa7.t(bitmap, bitmapCreateBitmap)) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap h(ContentResolver contentResolver, Uri uri, BitmapFactory.Options options) throws bz2.a, FileNotFoundException {
        do {
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            try {
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, a, options);
                    ym8.t(inputStreamOpenInputStream, null);
                    return bitmapDecodeStream;
                } catch (OutOfMemoryError unused) {
                    options.inSampleSize *= 2;
                    ym8.t(inputStreamOpenInputStream, null);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ym8.t(inputStreamOpenInputStream, th);
                    throw th2;
                }
            }
        } while (options.inSampleSize <= 512);
        uri.getClass();
        throw new bz2.a("crop: Failed to decode image: " + uri);
    }

    public static sz0 i(Context context, Uri uri, int i, int i2) throws bz2.b {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            contentResolver.getClass();
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(inputStreamOpenInputStream, a, options);
                options.inJustDecodeBounds = false;
                ym8.t(inputStreamOpenInputStream, null);
                int i3 = options.outWidth;
                if (i3 == -1 && options.outHeight == -1) {
                    throw new RuntimeException("File is not a picture");
                }
                options.inSampleSize = Math.max(b(i3, options.outHeight, i, i2), a(options.outWidth, options.outHeight));
                return new sz0(h(contentResolver, uri, options), options.inSampleSize);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ym8.t(inputStreamOpenInputStream, th);
                    throw th2;
                }
            }
        } catch (Exception e2) {
            throw new bz2.b(uri, e2.getMessage());
        }
    }

    public static sz0 j(Context context, Uri uri, Rect rect, int i, int i2, int i3) throws bz2.b {
        BitmapRegionDecoder bitmapRegionDecoderNewInstance;
        int i4;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = i3 * b(rect.width(), rect.height(), i, i2);
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                if (Build.VERSION.SDK_INT >= 31) {
                    inputStreamOpenInputStream.getClass();
                    bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStreamOpenInputStream);
                } else {
                    inputStreamOpenInputStream.getClass();
                    bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStreamOpenInputStream, false);
                }
                do {
                    try {
                        try {
                            bitmapRegionDecoderNewInstance.getClass();
                            sz0 sz0Var = new sz0(bitmapRegionDecoderNewInstance.decodeRegion(rect, options), options.inSampleSize);
                            bitmapRegionDecoderNewInstance.recycle();
                            ym8.t(inputStreamOpenInputStream, null);
                            return sz0Var;
                        } catch (Throwable th) {
                            if (bitmapRegionDecoderNewInstance != null) {
                                bitmapRegionDecoderNewInstance.recycle();
                            }
                            throw th;
                        }
                    } catch (OutOfMemoryError unused) {
                        i4 = options.inSampleSize * 2;
                        options.inSampleSize = i4;
                    }
                } while (i4 <= 512);
                if (bitmapRegionDecoderNewInstance != null) {
                    bitmapRegionDecoderNewInstance.recycle();
                }
                ym8.t(inputStreamOpenInputStream, null);
                return new sz0(null, 1);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ym8.t(inputStreamOpenInputStream, th2);
                    throw th3;
                }
            }
        } catch (Exception e2) {
            throw new bz2.b(uri, e2.getMessage());
        }
    }

    public static void k(Rect rect, int i, int i2) {
        if (i != i2 || rect.width() == rect.height()) {
            return;
        }
        if (rect.height() > rect.width()) {
            rect.bottom -= rect.height() - rect.width();
        } else {
            rect.right -= rect.width() - rect.height();
        }
    }

    public static float l(float[] fArr) {
        fArr.getClass();
        return Math.max(Math.max(Math.max(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    public static Rect m(float[] fArr, int i, int i2, boolean z, int i3, int i4) {
        fArr.getClass();
        Rect rect = new Rect(ym8.L(Math.max(0.0f, n(fArr))), ym8.L(Math.max(0.0f, p(fArr))), ym8.L(Math.min(i, o(fArr))), ym8.L(Math.min(i2, l(fArr))));
        if (z) {
            k(rect, i3, i4);
        }
        return rect;
    }

    public static float n(float[] fArr) {
        fArr.getClass();
        return Math.min(Math.min(Math.min(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    public static float o(float[] fArr) {
        fArr.getClass();
        return Math.max(Math.max(Math.max(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    public static float p(float[] fArr) {
        fArr.getClass();
        return Math.min(Math.min(Math.min(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    public static Bitmap q(Bitmap bitmap, int i, int i2, sz2 sz2Var) {
        Bitmap bitmapCreateScaledBitmap;
        sz2Var.getClass();
        if (i > 0 && i2 > 0) {
            try {
                sz2 sz2Var2 = sz2.d;
                sz2 sz2Var3 = sz2.e;
                if (sz2Var == sz2Var2 || sz2Var == sz2.c || sz2Var == sz2Var3) {
                    if (sz2Var == sz2Var3) {
                        bitmap.getClass();
                        bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, false);
                    } else {
                        bitmap.getClass();
                        float width = bitmap.getWidth();
                        float height = bitmap.getHeight();
                        float fMax = Math.max(width / i, height / i2);
                        bitmapCreateScaledBitmap = (fMax > 1.0f || sz2Var == sz2Var2) ? Bitmap.createScaledBitmap(bitmap, (int) (width / fMax), (int) (height / fMax), false) : null;
                    }
                    if (bitmapCreateScaledBitmap != null) {
                        if (!bitmapCreateScaledBitmap.equals(bitmap)) {
                            bitmap.recycle();
                        }
                        return bitmapCreateScaledBitmap;
                    }
                }
            } catch (Exception e2) {
                b1.n("AIC", "Failed to resize cropped image, return bitmap before resize", e2);
            }
        }
        bitmap.getClass();
        return bitmap;
    }

    public static Uri r(Context context, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i, Uri uri) {
        String str;
        Uri uriFromFile;
        List listI;
        bitmap.getClass();
        compressFormat.getClass();
        if (uri == null) {
            try {
                int i2 = uz0.a[compressFormat.ordinal()];
                if (i2 != 1) {
                    str = i2 != 2 ? ".webp" : ".png";
                } else {
                    str = ".jpg";
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    File fileCreateTempFile = File.createTempFile("cropped", str, context.getCacheDir());
                    fileCreateTempFile.getClass();
                    uriFromFile = ynb.M(context, fileCreateTempFile);
                } else {
                    uriFromFile = Uri.fromFile(File.createTempFile("cropped", str, context.getCacheDir()));
                }
            } catch (IOException e2) {
                cva.q("Failed to create temp file for output image", e2);
                return null;
            }
        } else {
            uriFromFile = uri;
        }
        if (uri != null) {
            if (!pa7.t(uri.getScheme(), "content")) {
                throw new SecurityException(ib8.j("Only content:// URIs are allowed for security reasons. Received: ", uri.getScheme(), "://"));
            }
            String path = uri.getPath();
            if (path == null) {
                path = uri.toString();
                path.getClass();
            }
            int i3 = uz0.a[compressFormat.ordinal()];
            if (i3 != 1) {
                listI = i3 != 2 ? t72.H(".webp") : t72.H(".png");
            } else {
                listI = t72.I(".jpg", ".jpeg");
            }
            List list = listI;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                do {
                    if (it.hasNext()) {
                    }
                } while (!c5e.u(path, (String) it.next(), true));
            }
            throw new SecurityException("File extension does not match compress format. Expected one of: " + s72.D0(list, ", ", null, null, null, 62) + ", Format: " + compressFormat + ", Path: " + path);
        }
        OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uriFromFile, "wt");
        outputStreamOpenOutputStream.getClass();
        try {
            bitmap.compress(compressFormat, i, outputStreamOpenOutputStream);
            outputStreamOpenOutputStream.close();
            return uriFromFile;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ym8.t(outputStreamOpenOutputStream, th);
                throw th2;
            }
        }
    }
}
