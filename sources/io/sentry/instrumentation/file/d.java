package io.sentry.instrumentation.file;

import defpackage.t8c;
import defpackage.xh2;
import io.sentry.o1;
import io.sentry.q4;
import io.sentry.util.j;
import io.sentry.y6;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends FileInputStream {
    public final FileInputStream a;
    public final xh2 b;

    /* JADX WARN: Illegal instructions before constructor call */
    public d(b bVar) throws FileNotFoundException {
        FileInputStream fileInputStream = (FileInputStream) bVar.d;
        try {
            super(fileInputStream.getFD());
            this.b = new xh2(bVar.b, bVar.a, bVar.c);
            this.a = fileInputStream;
        } catch (IOException unused) {
            throw new FileNotFoundException("No file descriptor");
        }
    }

    public static b b(File file, FileInputStream fileInputStream) {
        o1 o1VarP = j.a ? q4.b().p() : q4.b().b();
        o1 o1VarR = o1VarP != null ? o1VarP.r("file.read") : null;
        if (fileInputStream == null) {
            fileInputStream = new FileInputStream(file);
        }
        return new b(file, o1VarR, fileInputStream, q4.b().o());
    }

    @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.b.a(this.a);
        super.close();
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int read() throws IOException {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.b.c(new y6(8, this, atomicInteger));
        return atomicInteger.get();
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final long skip(long j) {
        return ((Long) this.b.c(new t8c(this, j))).longValue();
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return ((Integer) this.b.c(new y6(7, this, bArr))).intValue();
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return ((Integer) this.b.c(new c(this, bArr, i, i2, 0))).intValue();
    }

    public d(b bVar, FileDescriptor fileDescriptor) {
        super(fileDescriptor);
        this.b = new xh2(bVar.b, bVar.a, bVar.c);
        this.a = (FileInputStream) bVar.d;
    }
}
