package io.sentry.instrumentation.file;

import defpackage.j45;
import defpackage.xh2;
import io.sentry.o1;
import io.sentry.q4;
import io.sentry.util.j;
import io.sentry.y6;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends FileOutputStream {
    public final FileOutputStream a;
    public final xh2 b;

    /* JADX WARN: Illegal instructions before constructor call */
    public e(b bVar) throws FileNotFoundException {
        FileOutputStream fileOutputStream = (FileOutputStream) bVar.d;
        try {
            super(fileOutputStream.getFD());
            this.b = new xh2(bVar.b, bVar.a, bVar.c);
            this.a = fileOutputStream;
        } catch (IOException unused) {
            throw new FileNotFoundException("No file descriptor");
        }
    }

    public static b b(File file, FileOutputStream fileOutputStream, boolean z) {
        o1 o1VarP = j.a ? q4.b().p() : q4.b().b();
        o1 o1VarR = o1VarP != null ? o1VarP.r("file.write") : null;
        if (fileOutputStream == null) {
            fileOutputStream = new FileOutputStream(file, z);
        }
        return new b(file, o1VarR, fileOutputStream, q4.b().o());
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.b.a(this.a);
        super.close();
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.b.c(new c(this, bArr, i, i2, 1));
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.b.c(new y6(9, this, bArr));
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        this.b.c(new j45(this, i, 2));
    }
}
