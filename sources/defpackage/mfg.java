package defpackage;

import io.sentry.android.core.d1;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class mfg extends InputStream {
    public final /* synthetic */ int a = 1;
    public long b;
    public final InputStream c;

    public mfg(BufferedInputStream bufferedInputStream, int i) {
        this.c = bufferedInputStream;
        this.b = i;
    }

    @Override // java.io.InputStream
    public int available() {
        switch (this.a) {
            case 1:
                return Math.min(((BufferedInputStream) this.c).available(), (int) this.b);
            default:
                return super.available();
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.a;
        InputStream inputStream = this.c;
        switch (i) {
            case 0:
                super.close();
                ((FileInputStream) inputStream).close();
                this.b = 0L;
                break;
            default:
                d1.d((BufferedInputStream) inputStream, this.b);
                this.b = 0L;
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.a;
        InputStream inputStream = this.c;
        int i4 = -1;
        switch (i3) {
            case 0:
                long j = this.b;
                if (j <= 0) {
                    return -1;
                }
                int i5 = ((FileInputStream) inputStream).read(bArr, i, (int) Math.min(i2, j));
                if (i5 != -1) {
                    this.b -= (long) i5;
                }
                return i5;
            default:
                long j2 = this.b;
                if (j2 > 0) {
                    i4 = ((BufferedInputStream) inputStream).read(bArr, i, Math.min(i2, (int) j2));
                    if (i4 > 0) {
                        this.b -= (long) i4;
                    }
                }
                return i4;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        switch (this.a) {
            case 1:
                long jSkip = ((BufferedInputStream) this.c).skip(Math.min(j, this.b));
                this.b -= jSkip;
                return jSkip;
            default:
                return super.skip(j);
        }
    }

    public mfg(FileInputStream fileInputStream, long j) {
        this.c = fileInputStream;
        this.b = j;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.a;
        InputStream inputStream = this.c;
        switch (i) {
            case 0:
                long j = this.b;
                if (j <= 0) {
                    return -1;
                }
                this.b = j - 1;
                return ((FileInputStream) inputStream).read();
            default:
                if (this.b <= 0) {
                    return -1;
                }
                int i2 = ((BufferedInputStream) inputStream).read();
                if (i2 != -1) {
                    this.b--;
                }
                return i2;
        }
    }
}
