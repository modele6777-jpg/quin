package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pgg extends InputStream {
    public final Enumeration a;
    public FileInputStream b;

    public pgg(Enumeration enumeration) throws IOException {
        this.a = enumeration;
        b();
    }

    public final void b() throws IOException {
        FileInputStream fileInputStream = this.b;
        if (fileInputStream != null) {
            fileInputStream.close();
        }
        Enumeration enumeration = this.a;
        if (enumeration.hasMoreElements()) {
            this.b = new FileInputStream((File) enumeration.nextElement());
        } else {
            this.b = null;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        FileInputStream fileInputStream = this.b;
        if (fileInputStream != null) {
            fileInputStream.close();
            this.b = null;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.b == null) {
            return -1;
        }
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        do {
            int i3 = this.b.read(bArr, i, i2);
            if (i3 > 0) {
                return i3;
            }
            b();
        } while (this.b != null);
        return -1;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        while (true) {
            FileInputStream fileInputStream = this.b;
            if (fileInputStream == null) {
                return -1;
            }
            int i = fileInputStream.read();
            if (i != -1) {
                return i;
            }
            b();
        }
    }
}
