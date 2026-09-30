package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class r25 extends ks5 {
    public final long b;
    public final boolean c;
    public boolean d;
    public long e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ zi0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r25(zi0 zi0Var, wkd wkdVar, long j, boolean z) {
        super(wkdVar);
        wkdVar.getClass();
        this.v = zi0Var;
        this.b = j;
        this.c = z;
        this.f = z;
    }

    @Override // defpackage.ks5, defpackage.wkd
    public final void M0(f41 f41Var, long j) throws IOException {
        if (this.g) {
            qc0.p("closed");
            return;
        }
        long j2 = this.b;
        if (j2 != -1 && this.e + j > j2) {
            throw new ProtocolException("expected " + this.b + " bytes but received " + (this.e + j));
        }
        try {
            if (this.f) {
                this.f = false;
                ((cib) this.v.b).d.getClass();
            }
            this.a.M0(f41Var, j);
            this.e += j;
        } catch (IOException e) {
            IOException iOExceptionB = b(e);
            iOExceptionB.getClass();
            throw iOExceptionB;
        }
    }

    public final IOException b(IOException iOException) {
        if (this.d) {
            return iOException;
        }
        this.d = true;
        return zi0.d(this.v, this.c, iOException, 4);
    }

    @Override // defpackage.ks5, defpackage.wkd, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.g) {
            return;
        }
        this.g = true;
        long j = this.b;
        if (j != -1 && this.e != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            b(null);
        } catch (IOException e) {
            IOException iOExceptionB = b(e);
            iOExceptionB.getClass();
            throw iOExceptionB;
        }
    }

    @Override // defpackage.ks5, defpackage.wkd, java.io.Flushable
    public final void flush() throws IOException {
        try {
            super.flush();
        } catch (IOException e) {
            IOException iOExceptionB = b(e);
            iOExceptionB.getClass();
            throw iOExceptionB;
        }
    }
}
