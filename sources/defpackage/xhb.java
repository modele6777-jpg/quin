package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xhb implements u41 {
    public final wkd a;
    public final f41 b;
    public boolean c;

    public xhb(wkd wkdVar) {
        wkdVar.getClass();
        this.a = wkdVar;
        this.b = new f41();
    }

    @Override // defpackage.wkd
    public final void M0(f41 f41Var, long j) {
        f41Var.getClass();
        if (this.c) {
            qc0.p("closed");
        } else {
            this.b.M0(f41Var, j);
            b();
        }
    }

    @Override // defpackage.u41
    public final u41 T0(long j) {
        if (this.c) {
            qc0.p("closed");
            return null;
        }
        this.b.j1(j);
        b();
        return this;
    }

    @Override // defpackage.u41
    public final u41 X0(a71 a71Var) {
        a71Var.getClass();
        if (this.c) {
            qc0.p("closed");
            return null;
        }
        this.b.f1(a71Var);
        b();
        return this;
    }

    @Override // defpackage.u41
    public final u41 Y(byte[] bArr, int i) {
        bArr.getClass();
        if (this.c) {
            qc0.p("closed");
            return null;
        }
        this.b.g1(bArr, i);
        b();
        return this;
    }

    public final u41 b() {
        if (this.c) {
            qc0.p("closed");
            return null;
        }
        f41 f41Var = this.b;
        long jH = f41Var.h();
        if (jH > 0) {
            this.a.M0(f41Var, jH);
        }
        return this;
    }

    @Override // defpackage.wkd, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        wkd wkdVar = this.a;
        if (this.c) {
            return;
        }
        f41 f41Var = this.b;
        long j = f41Var.b;
        if (j > 0) {
            wkdVar.M0(f41Var, j);
        }
        th = null;
        try {
            wkdVar.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.wkd, java.io.Flushable
    public final void flush() {
        if (this.c) {
            qc0.p("closed");
            return;
        }
        f41 f41Var = this.b;
        long j = f41Var.b;
        wkd wkdVar = this.a;
        if (j > 0) {
            wkdVar.M0(f41Var, j);
        }
        wkdVar.flush();
    }

    public final u41 h(int i) {
        if (this.c) {
            qc0.p("closed");
            return null;
        }
        this.b.l1(i);
        b();
        return this;
    }

    @Override // defpackage.u41
    public final f41 i() {
        return this.b;
    }

    @Override // defpackage.u41
    public final u41 i0(String str) {
        str.getClass();
        if (this.c) {
            qc0.p("closed");
            return null;
        }
        this.b.n1(str);
        b();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // defpackage.wkd
    public final jye j() {
        return this.a.j();
    }

    public final String toString() {
        return "buffer(" + this.a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (this.c) {
            qc0.p("closed");
            return 0;
        }
        int iWrite = this.b.write(byteBuffer);
        b();
        return iWrite;
    }

    @Override // defpackage.u41
    public final u41 writeByte(int i) {
        if (this.c) {
            qc0.p("closed");
            return null;
        }
        this.b.i1(i);
        b();
        return this;
    }

    @Override // defpackage.u41
    public final u41 write(byte[] bArr) {
        bArr.getClass();
        if (!this.c) {
            this.b.g1(bArr, bArr.length);
            b();
            return this;
        }
        qc0.p("closed");
        return null;
    }
}
