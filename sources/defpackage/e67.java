package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class e67 extends InputStream {
    public final InputStream a;
    public final ke9 b;
    public final oye c;
    public long e;
    public long d = -1;
    public long f = -1;

    public e67(InputStream inputStream, ke9 ke9Var, oye oyeVar) {
        this.c = oyeVar;
        this.a = inputStream;
        this.b = ke9Var;
        this.e = ((je9) ke9Var.d.b).C();
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        try {
            return this.a.available();
        } catch (IOException e) {
            oye oyeVar = this.c;
            ke9 ke9Var = this.b;
            ub3.t(oyeVar, ke9Var, ke9Var);
            throw e;
        }
    }

    public final void b(long j) {
        long j2 = this.d;
        if (j2 == -1) {
            this.d = j;
        } else {
            this.d = j2 + j;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ke9 ke9Var = this.b;
        oye oyeVar = this.c;
        long jB = oyeVar.b();
        if (this.f == -1) {
            this.f = jB;
        }
        try {
            this.a.close();
            long j = this.d;
            if (j != -1) {
                ke9Var.h(j);
            }
            long j2 = this.e;
            if (j2 != -1) {
                fe9 fe9Var = ke9Var.d;
                fe9Var.i();
                ((je9) fe9Var.b).W(j2);
            }
            ke9Var.i(this.f);
            ke9Var.b();
        } catch (IOException e) {
            ub3.t(oyeVar, ke9Var, ke9Var);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.a.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.a.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        oye oyeVar = this.c;
        ke9 ke9Var = this.b;
        try {
            int i = this.a.read();
            long jB = oyeVar.b();
            if (this.e == -1) {
                this.e = jB;
            }
            if (i != -1 || this.f != -1) {
                b(1L);
                ke9Var.h(this.d);
                return i;
            }
            this.f = jB;
            ke9Var.i(jB);
            ke9Var.b();
            return i;
        } catch (IOException e) {
            ub3.t(oyeVar, ke9Var, ke9Var);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        try {
            this.a.reset();
        } catch (IOException e) {
            oye oyeVar = this.c;
            ke9 ke9Var = this.b;
            ub3.t(oyeVar, ke9Var, ke9Var);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        oye oyeVar = this.c;
        ke9 ke9Var = this.b;
        try {
            long jSkip = this.a.skip(j);
            long jB = oyeVar.b();
            if (this.e == -1) {
                this.e = jB;
            }
            if (jSkip == 0 && j != 0 && this.f == -1) {
                this.f = jB;
                ke9Var.i(jB);
                return jSkip;
            }
            b(jSkip);
            ke9Var.h(this.d);
            return jSkip;
        } catch (IOException e) {
            ub3.t(oyeVar, ke9Var, ke9Var);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        oye oyeVar = this.c;
        ke9 ke9Var = this.b;
        try {
            int i3 = this.a.read(bArr, i, i2);
            long jB = oyeVar.b();
            if (this.e == -1) {
                this.e = jB;
            }
            if (i3 == -1 && this.f == -1) {
                this.f = jB;
                ke9Var.i(jB);
                ke9Var.b();
                return i3;
            }
            b(i3);
            ke9Var.h(this.d);
            return i3;
        } catch (IOException e) {
            ub3.t(oyeVar, ke9Var, ke9Var);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        oye oyeVar = this.c;
        ke9 ke9Var = this.b;
        try {
            int i = this.a.read(bArr);
            long jB = oyeVar.b();
            if (this.e == -1) {
                this.e = jB;
            }
            if (i == -1 && this.f == -1) {
                this.f = jB;
                ke9Var.i(jB);
                ke9Var.b();
                return i;
            }
            b(i);
            ke9Var.h(this.d);
            return i;
        } catch (IOException e) {
            ub3.t(oyeVar, ke9Var, ke9Var);
            throw e;
        }
    }
}
