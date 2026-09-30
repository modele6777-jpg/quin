package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class at3 implements mtd {
    public final InputStream a;
    public final tsd b;
    public final /* synthetic */ szc c;

    public at3(szc szcVar) {
        this.c = szcVar;
        Socket socket = (Socket) szcVar.b;
        this.a = socket.getInputStream();
        this.b = new tsd(socket);
    }

    @Override // defpackage.mtd
    public final long c0(f41 f41Var, long j) throws IOException {
        f41Var.getClass();
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            qc0.o(ks0.i(j, "byteCount < 0: "));
            return 0L;
        }
        tsd tsdVar = this.b;
        tsdVar.f();
        qtc qtcVarE1 = f41Var.e1(1);
        int iMin = (int) Math.min(j, 8192 - qtcVarE1.c);
        try {
            tsdVar.h();
            try {
                try {
                    int i = this.a.read(qtcVarE1.a, qtcVarE1.c, iMin);
                    if (tsdVar.i()) {
                        throw tsdVar.k(null);
                    }
                    if (i != -1) {
                        qtcVarE1.c += i;
                        long j2 = i;
                        f41Var.b += j2;
                        return j2;
                    }
                    if (qtcVarE1.b != qtcVarE1.c) {
                        return -1L;
                    }
                    f41Var.a = qtcVarE1.a();
                    ttc.a(qtcVarE1);
                    return -1L;
                } catch (IOException e) {
                    if (tsdVar.i()) {
                        throw tsdVar.k(e);
                    }
                    throw e;
                }
            } catch (Throwable th) {
                tsdVar.i();
                throw th;
            }
        } catch (AssertionError e2) {
            if (heg.a(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
        szc szcVar = this.c;
        tsd tsdVar = this.b;
        tsdVar.h();
        try {
            try {
                AtomicInteger atomicInteger = (AtomicInteger) szcVar.c;
                Socket socket = (Socket) szcVar.b;
                atomicInteger.getClass();
                while (true) {
                    int i2 = atomicInteger.get();
                    if ((i2 & 2) != 0) {
                        i = 0;
                        break;
                    }
                    int i3 = i2 | 2;
                    if (atomicInteger.compareAndSet(i2, i3)) {
                        i = i3;
                        break;
                    }
                }
                if (i == 0) {
                    tsdVar.i();
                    return;
                }
                if (i == 3) {
                    socket.close();
                } else if (socket.isClosed() || socket.isInputShutdown()) {
                    tsdVar.i();
                    return;
                } else {
                    try {
                        socket.shutdownInput();
                    } catch (UnsupportedOperationException unused) {
                        this.a.close();
                    }
                }
                if (tsdVar.i()) {
                    throw tsdVar.k(null);
                }
            } catch (IOException e) {
                if (!tsdVar.i()) {
                    throw e;
                }
                throw tsdVar.k(e);
            }
        } catch (Throwable th) {
            tsdVar.i();
            throw th;
        }
    }

    @Override // defpackage.mtd
    public final jye j() {
        return this.b;
    }

    public final String toString() {
        return "source(" + ((Socket) this.c.b) + ')';
    }
}
