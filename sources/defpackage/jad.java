package defpackage;

import android.graphics.Bitmap;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jad implements AutoCloseable {
    public final int a;
    public final int b;
    public final DataOutputStream c;
    public final int[] d;
    public final byte[] e;
    public final byte[] f;
    public final CRC32 g;
    public int v;
    public int w;
    public boolean x;
    public final Deflater y;
    public static final byte[] z = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] X = {73, 72, 68, 82};
    public static final byte[] Y = {73, 68, 65, 84};
    public static final byte[] Z = {73, 69, 78, 68};

    public jad(BufferedOutputStream bufferedOutputStream, int i, int i2) {
        this.a = i;
        this.b = i2;
        if (1 > i || i >= 715827883) {
            qc0.o(tec.e(i, "Invalid PNG width: "));
            throw null;
        }
        if (i2 <= 0) {
            qc0.o(tec.e(i2, "Invalid PNG height: "));
            throw null;
        }
        DataOutputStream dataOutputStream = new DataOutputStream(bufferedOutputStream);
        this.c = dataOutputStream;
        this.d = new int[i];
        this.e = new byte[(i * 3) + 1];
        this.f = new byte[32768];
        this.g = new CRC32();
        this.y = new Deflater();
        try {
            dataOutputStream.write(z);
            byte[] bArrArray = ByteBuffer.allocate(13).putInt(i).putInt(i2).put((byte) 8).put((byte) 2).array();
            byte[] bArr = X;
            bArrArray.getClass();
            h(bArr, bArrArray, bArrArray.length);
        } catch (Throwable th) {
            this.x = true;
            this.y.end();
            throw th;
        }
    }

    public final void b() throws IOException {
        int i = this.v;
        byte[] bArr = this.f;
        int length = bArr.length - i;
        Deflater deflater = this.y;
        int iDeflate = deflater.deflate(bArr, i, length);
        if (iDeflate <= 0 && !deflater.needsInput() && !deflater.finished()) {
            qc0.p("PNG compressor made no progress");
            return;
        }
        int i2 = this.v + iDeflate;
        this.v = i2;
        if (i2 == bArr.length) {
            h(Y, bArr, i2);
            this.v = 0;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Deflater deflater = this.y;
        if (this.x) {
            return;
        }
        try {
            int i = this.w;
            int i2 = this.b;
            if (i != i2) {
                throw new IllegalStateException(("Expected " + i2 + " PNG rows, received " + i).toString());
            }
            deflater.finish();
            while (!deflater.finished()) {
                b();
            }
            int i3 = this.v;
            byte[] bArr = this.f;
            if (i3 > 0) {
                h(Y, bArr, i3);
                this.v = 0;
            }
            h(Z, bArr, 0);
            this.x = true;
            deflater.end();
        } catch (Throwable th) {
            this.x = true;
            deflater.end();
            throw th;
        }
    }

    public final void h(byte[] bArr, byte[] bArr2, int i) throws IOException {
        CRC32 crc32 = this.g;
        crc32.reset();
        crc32.update(bArr);
        crc32.update(bArr2, 0, i);
        DataOutputStream dataOutputStream = this.c;
        dataOutputStream.writeInt(i);
        dataOutputStream.write(bArr);
        dataOutputStream.write(bArr2, 0, i);
        dataOutputStream.writeInt((int) crc32.getValue());
    }

    public final void l(Bitmap bitmap, int i) {
        Deflater deflater = this.y;
        byte[] bArr = this.e;
        if (this.x) {
            qc0.p("PNG writer is closed");
            return;
        }
        if (bitmap.isRecycled()) {
            qc0.j("Strip bitmap is recycled");
            return;
        }
        int width = bitmap.getWidth();
        int i2 = this.a;
        if (width != i2) {
            qc0.o(tec.e(i2, "Strip width must be "));
            return;
        }
        if (1 > i || i > bitmap.getHeight()) {
            qc0.o(tec.e(i, "Invalid strip row count: "));
            return;
        }
        int i3 = this.w;
        int i4 = this.b;
        if (i > i4 - i3) {
            qc0.o(tec.e(i4, "Strip exceeds PNG height "));
            return;
        }
        int i5 = 0;
        int i6 = 0;
        while (i6 < i) {
            try {
                int[] iArr = this.d;
                int i7 = this.a;
                bitmap.getPixels(iArr, 0, i7, 0, i6, i7, 1);
                bArr[i5] = 1;
                int[] iArr2 = this.d;
                int length = iArr2.length;
                int i8 = 1;
                int i9 = i5;
                int i10 = i9;
                int i11 = i10;
                int i12 = i11;
                while (i9 < length) {
                    int i13 = iArr2[i9];
                    int i14 = (i13 >>> 16) & 255;
                    int i15 = (i13 >>> 8) & 255;
                    int i16 = i13 & 255;
                    bArr[i8] = (byte) (i14 - i10);
                    int i17 = i8 + 2;
                    bArr[i8 + 1] = (byte) (i15 - i11);
                    i8 += 3;
                    bArr[i17] = (byte) (i16 - i12);
                    i9++;
                    i11 = i15;
                    i12 = i16;
                    i10 = i14;
                }
                deflater.setInput(bArr);
                while (!deflater.needsInput()) {
                    b();
                }
                this.w++;
                i6++;
                i5 = 0;
            } catch (Throwable th) {
                this.x = true;
                deflater.end();
                throw th;
            }
        }
    }
}
