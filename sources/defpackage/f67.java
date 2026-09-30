package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class f67 extends OutputStream {
    public final OutputStream a;
    public final oye b;
    public final ke9 c;
    public long d = -1;

    public f67(OutputStream outputStream, ke9 ke9Var, oye oyeVar) {
        this.a = outputStream;
        this.c = ke9Var;
        this.b = oyeVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        long j = this.d;
        ke9 ke9Var = this.c;
        if (j != -1) {
            ke9Var.e(j);
        }
        oye oyeVar = this.b;
        long jB = oyeVar.b();
        fe9 fe9Var = ke9Var.d;
        fe9Var.i();
        ((je9) fe9Var.b).U(jB);
        try {
            this.a.close();
        } catch (IOException e) {
            ub3.t(oyeVar, ke9Var, ke9Var);
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        try {
            this.a.flush();
        } catch (IOException e) {
            oye oyeVar = this.b;
            ke9 ke9Var = this.c;
            ub3.t(oyeVar, ke9Var, ke9Var);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        ke9 ke9Var = this.c;
        try {
            this.a.write(i);
            long j = this.d + 1;
            this.d = j;
            ke9Var.e(j);
        } catch (IOException e) {
            ub3.t(this.b, ke9Var, ke9Var);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        ke9 ke9Var = this.c;
        try {
            this.a.write(bArr);
            long length = this.d + ((long) bArr.length);
            this.d = length;
            ke9Var.e(length);
        } catch (IOException e) {
            ub3.t(this.b, ke9Var, ke9Var);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        ke9 ke9Var = this.c;
        try {
            this.a.write(bArr, i, i2);
            long j = this.d + ((long) i2);
            this.d = j;
            ke9Var.e(j);
        } catch (IOException e) {
            ub3.t(this.b, ke9Var, ke9Var);
            throw e;
        }
    }
}
