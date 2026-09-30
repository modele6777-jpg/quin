package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class tr6 extends qr6 {
    public long e;
    public final /* synthetic */ vr6 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tr6(vr6 vr6Var, ct6 ct6Var, long j) {
        super(vr6Var, ct6Var);
        ct6Var.getClass();
        this.f = vr6Var;
        this.e = j;
        if (j == 0) {
            b(si6.b);
        }
    }

    @Override // defpackage.qr6, defpackage.mtd
    public final long c0(f41 f41Var, long j) throws IOException {
        f41Var.getClass();
        if (j < 0) {
            qc0.o(ks0.i(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.c) {
            qc0.p("closed");
            return 0L;
        }
        long j2 = this.e;
        if (j2 == 0) {
            return -1L;
        }
        long jC0 = super.c0(f41Var, Math.min(j2, j));
        if (jC0 == -1) {
            this.f.b.e();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b(vr6.f);
            throw protocolException;
        }
        long j3 = this.e - jC0;
        this.e = j3;
        if (j3 == 0) {
            b(si6.b);
        }
        return jC0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zG;
        if (this.c) {
            return;
        }
        if (this.e != 0) {
            TimeZone timeZone = keg.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zG = keg.g(this, 100);
            } catch (IOException unused) {
                zG = false;
            }
            if (!zG) {
                this.f.b.e();
                b(vr6.f);
            }
        }
        this.c = true;
    }
}
