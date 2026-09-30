package androidx.camera.core;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.Surface;
import defpackage.b21;
import defpackage.bkd;
import defpackage.hw6;
import defpackage.iw6;
import defpackage.ok8;
import defpackage.qc0;
import defpackage.s8f;
import defpackage.sbc;
import java.nio.ByteBuffer;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ImageProcessingUtil {
    public static int a;

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static iw6 a(sbc sbcVar, byte[] bArr) {
        ok8.l(sbcVar.v() == 256);
        bArr.getClass();
        Surface surface = sbcVar.getSurface();
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            b21.v("ImageProcessingUtil", "Failed to enqueue JPEG image.");
            return null;
        }
        iw6 iw6VarQ = sbcVar.q();
        if (iw6VarQ == null) {
            b21.v("ImageProcessingUtil", "Failed to get acquire JPEG image.");
        }
        return iw6VarQ;
    }

    public static Bitmap b(iw6 iw6Var) {
        if (iw6Var.getFormat() != 35) {
            qc0.j("Input image format must be YUV_420_888");
            return null;
        }
        int iD = iw6Var.d();
        int iC = iw6Var.c();
        int iF = iw6Var.v()[0].F();
        int iF2 = iw6Var.v()[1].F();
        int iF3 = iw6Var.v()[2].F();
        int iE = iw6Var.v()[0].E();
        int iE2 = iw6Var.v()[1].E();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iw6Var.d(), iw6Var.c(), Bitmap.Config.ARGB_8888);
        if (nativeConvertAndroid420ToBitmap(iw6Var.v()[0].v(), iF, iw6Var.v()[1].v(), iF2, iw6Var.v()[2].v(), iF3, iE, iE2, bitmapCreateBitmap, bitmapCreateBitmap.getRowBytes(), iD, iC) == 0) {
            return bitmapCreateBitmap;
        }
        s8f.i("YUV to RGB conversion failed");
        return null;
    }

    public static bkd c(iw6 iw6Var, sbc sbcVar, ByteBuffer byteBuffer, int i) {
        if (iw6Var.getFormat() != 35 || iw6Var.v().length != 3) {
            b21.v("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            b21.v("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        if (nativeConvertAndroid420ToABGR(iw6Var.v()[0].v(), iw6Var.v()[0].F(), iw6Var.v()[1].v(), iw6Var.v()[1].F(), iw6Var.v()[2].v(), iw6Var.v()[2].F(), iw6Var.v()[0].E(), iw6Var.v()[1].E(), sbcVar.getSurface(), byteBuffer, iw6Var.d(), iw6Var.c(), 0, 0, 0, i) != 0) {
            b21.v("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            Locale locale = Locale.US;
            b21.q("ImageProcessingUtil", "Image processing performance profiling, duration: [" + (System.currentTimeMillis() - jCurrentTimeMillis) + "], image count: " + a);
            a = a + 1;
        }
        iw6 iw6VarQ = sbcVar.q();
        if (iw6VarQ == null) {
            b21.v("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        bkd bkdVar = new bkd(iw6VarQ);
        bkdVar.b(new hw6(iw6VarQ, iw6Var));
        return bkdVar;
    }

    public static void d(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public static void e(byte[] bArr, Surface surface) {
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            b21.v("ImageProcessingUtil", "Failed to enqueue JPEG image.");
        }
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Surface surface, ByteBuffer byteBuffer4, int i6, int i7, int i8, int i9, int i10, int i11);

    private static native int nativeConvertAndroid420ToBitmap(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Bitmap bitmap, int i6, int i7, int i8);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, boolean z);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);
}
