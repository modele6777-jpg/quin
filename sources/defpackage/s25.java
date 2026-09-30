package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class s25 extends ls5 {
    public final long b;
    public final boolean c;
    public long d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ zi0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s25(zi0 zi0Var, mtd mtdVar, long j, boolean z) {
        super(mtdVar);
        mtdVar.getClass();
        this.v = zi0Var;
        this.b = j;
        this.c = z;
        this.e = true;
        if (j == 0) {
            b(null);
        }
    }

    public final IOException b(IOException iOException) {
        if (this.f) {
            return iOException;
        }
        this.f = true;
        if (iOException == null && this.e) {
            this.e = false;
            ((cib) this.v.b).d.getClass();
        }
        return zi0.d(this.v, this.c, iOException, 8);
    }

    @Override // defpackage.ls5, defpackage.mtd
    public final long c0(f41 f41Var, long j) throws IOException {
        f41Var.getClass();
        if (this.g) {
            qc0.p("closed");
            return 0L;
        }
        try {
            long jC0 = this.a.c0(f41Var, j);
            if (this.e) {
                this.e = false;
                ((cib) this.v.b).d.getClass();
            }
            if (jC0 == -1) {
                b(null);
                return -1L;
            }
            long j2 = this.d + jC0;
            long j3 = this.b;
            if (j3 != -1 && j2 > j3) {
                throw new ProtocolException("expected " + this.b + " bytes but received " + j2);
            }
            this.d = j2;
            if (((u25) this.v.d).d()) {
                b(null);
            }
            return jC0;
        } catch (IOException e) {
            IOException iOExceptionB = b(e);
            iOExceptionB.getClass();
            throw iOExceptionB;
        }
    }

    @Override // defpackage.ls5, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.g) {
            return;
        }
        this.g = true;
        try {
            super.close();
            b(null);
        } catch (IOException e) {
            IOException iOExceptionB = b(e);
            iOExceptionB.getClass();
            throw iOExceptionB;
        }
    }
}
