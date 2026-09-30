package io.sentry.cache.tape;

import defpackage.qc0;
import defpackage.s8f;
import defpackage.tec;
import defpackage.ub3;
import defpackage.yg5;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements Closeable, Iterable {
    public static final byte[] z = new byte[4096];
    public RandomAccessFile a;
    public final File b;
    public long c;
    public int d;
    public g e;
    public g f;
    public final byte[] g = new byte[32];
    public int v = 0;
    public final int w;
    public final boolean x;
    public boolean y;

    public i(File file, RandomAccessFile randomAccessFile, int i, boolean z2) throws IOException {
        this.b = file;
        this.a = randomAccessFile;
        this.w = i;
        this.x = z2;
        C0();
    }

    public static int H0(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public static long L0(byte[] bArr, int i) {
        return ((((long) bArr[i]) & 255) << 56) + ((((long) bArr[i + 1]) & 255) << 48) + ((((long) bArr[i + 2]) & 255) << 40) + ((((long) bArr[i + 3]) & 255) << 32) + ((((long) bArr[i + 4]) & 255) << 24) + ((((long) bArr[i + 5]) & 255) << 16) + ((((long) bArr[i + 6]) & 255) << 8) + (((long) bArr[i + 7]) & 255);
    }

    public static void d1(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    public static void e1(int i, long j, byte[] bArr) {
        bArr[i] = (byte) (j >> 56);
        bArr[i + 1] = (byte) (j >> 48);
        bArr[i + 2] = (byte) (j >> 40);
        bArr[i + 3] = (byte) (j >> 32);
        bArr[i + 4] = (byte) (j >> 24);
        bArr[i + 5] = (byte) (j >> 16);
        bArr[i + 6] = (byte) (j >> 8);
        bArr[i + 7] = (byte) j;
    }

    public static RandomAccessFile x(File file, boolean z2) throws IOException {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                randomAccessFile.writeInt(-2147483647);
                randomAccessFile.writeLong(4096L);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    yg5.m("Rename failed!");
                    return null;
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        return new RandomAccessFile(file, z2 ? "rwd" : "rw");
    }

    public final void C0() throws IOException {
        this.a.seek(0L);
        RandomAccessFile randomAccessFile = this.a;
        byte[] bArr = this.g;
        randomAccessFile.readFully(bArr);
        this.c = L0(bArr, 4);
        this.d = H0(bArr, 12);
        long jL0 = L0(bArr, 16);
        long jL1 = L0(bArr, 24);
        long j = this.c;
        long length = this.a.length();
        long j2 = this.c;
        if (j > length) {
            StringBuilder sbP = ub3.p("File is truncated. Expected length: ", ", Actual length: ", j2);
            sbP.append(this.a.length());
            throw new IOException(sbP.toString());
        }
        if (j2 > 32) {
            this.e = U(jL0);
            this.f = U(jL1);
        } else {
            yg5.m(tec.h(this.c, ") is invalid.", new StringBuilder("File is corrupt; length stored in header (")));
        }
    }

    public final g U(long j) {
        if (j != 0) {
            byte[] bArr = this.g;
            if (Z0(4, j, bArr)) {
                return new g(j, H0(bArr, 0));
            }
        }
        return g.c;
    }

    public final void U0(int i) throws IOException {
        if (i < 0) {
            qc0.j(tec.f(i, "Cannot remove negative (", ") number of elements."));
            return;
        }
        if (i == 0) {
            return;
        }
        int i2 = this.d;
        if (i == i2) {
            clear();
            return;
        }
        if (i2 == 0) {
            s8f.c();
            return;
        }
        if (i > i2) {
            qc0.j(tec.g(this.d, ").", ub3.n(i, "Cannot remove more elements (", ") than present in queue (")));
            return;
        }
        g gVar = this.e;
        long j = gVar.a;
        int iH0 = gVar.b;
        long jB1 = j;
        long j2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            j2 += (long) (iH0 + 4);
            jB1 = b1(jB1 + 4 + ((long) iH0));
            byte[] bArr = this.g;
            if (!Z0(4, jB1, bArr)) {
                return;
            }
            iH0 = H0(bArr, 0);
        }
        c1(this.d - i, this.c, jB1, this.f.a);
        this.d -= i;
        this.v++;
        this.e = new g(jB1, iH0);
        while (j2 > 0) {
            int iMin = (int) Math.min(j2, 4096L);
            a1(iMin, j, z);
            long j3 = iMin;
            j2 -= j3;
            j += j3;
        }
    }

    public final void V0() throws IOException {
        this.a.close();
        File file = this.b;
        file.delete();
        this.a = x(file, this.x);
        C0();
    }

    public final boolean Z0(int i, long j, byte[] bArr) throws IOException {
        try {
            long jB1 = b1(j);
            long j2 = ((long) i) + jB1;
            long j3 = this.c;
            RandomAccessFile randomAccessFile = this.a;
            if (j2 <= j3) {
                randomAccessFile.seek(jB1);
                this.a.readFully(bArr, 0, i);
                return true;
            }
            int i2 = (int) (j3 - jB1);
            randomAccessFile.seek(jB1);
            this.a.readFully(bArr, 0, i2);
            this.a.seek(32L);
            this.a.readFully(bArr, i2, i - i2);
            return true;
        } catch (EOFException unused) {
            V0();
            return false;
        } catch (IOException e) {
            throw e;
        } catch (Throwable unused2) {
            V0();
            return false;
        }
    }

    public final void a1(int i, long j, byte[] bArr) throws IOException {
        long jB1 = b1(j);
        long j2 = ((long) i) + jB1;
        long j3 = this.c;
        RandomAccessFile randomAccessFile = this.a;
        if (j2 <= j3) {
            randomAccessFile.seek(jB1);
            this.a.write(bArr, 0, i);
            return;
        }
        int i2 = (int) (j3 - jB1);
        randomAccessFile.seek(jB1);
        this.a.write(bArr, 0, i2);
        this.a.seek(32L);
        this.a.write(bArr, i2, i - i2);
    }

    public final long b1(long j) {
        long j2 = this.c;
        return j < j2 ? j : (j + 32) - j2;
    }

    public final void c1(int i, long j, long j2, long j3) throws IOException {
        this.a.seek(0L);
        byte[] bArr = this.g;
        d1(bArr, 0, -2147483647);
        e1(4, j, bArr);
        d1(bArr, 12, i);
        e1(16, j2, bArr);
        e1(24, j3, bArr);
        this.a.write(bArr, 0, 32);
    }

    public final void clear() throws IOException {
        if (this.y) {
            qc0.p("closed");
            return;
        }
        c1(0, 4096L, 0L, 0L);
        this.a.seek(32L);
        this.a.write(z, 0, 4064);
        this.d = 0;
        g gVar = g.c;
        this.e = gVar;
        this.f = gVar;
        if (this.c > 4096) {
            this.a.setLength(4096L);
            this.a.getChannel().force(true);
        }
        this.c = 4096L;
        this.v++;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.y = true;
        this.a.close();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new h(this);
    }

    public final String toString() {
        return "QueueFile{file=" + this.b + ", zero=true, length=" + this.c + ", size=" + this.d + ", first=" + this.e + ", last=" + this.f + '}';
    }
}
