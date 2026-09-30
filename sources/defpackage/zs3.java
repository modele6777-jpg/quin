package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zs3 implements wkd {
    public final OutputStream a;
    public final tsd b;
    public final /* synthetic */ szc c;

    public zs3(szc szcVar) {
        this.c = szcVar;
        Socket socket = (Socket) szcVar.b;
        this.a = socket.getOutputStream();
        this.b = new tsd(socket);
    }

    @Override // defpackage.wkd
    public final void M0(f41 f41Var, long j) throws IOException {
        vpf.s(f41Var.b, 0L, j);
        while (j > 0) {
            tsd tsdVar = this.b;
            tsdVar.f();
            qtc qtcVar = f41Var.a;
            qtcVar.getClass();
            int iMin = (int) Math.min(j, qtcVar.c - qtcVar.b);
            tsdVar.h();
            try {
                try {
                    this.a.write(qtcVar.a, qtcVar.b, iMin);
                    if (tsdVar.i()) {
                        throw tsdVar.k(null);
                    }
                    int i = qtcVar.b + iMin;
                    qtcVar.b = i;
                    long j2 = iMin;
                    j -= j2;
                    f41Var.b -= j2;
                    if (i == qtcVar.c) {
                        f41Var.a = qtcVar.a();
                        ttc.a(qtcVar);
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
    }

    @Override // defpackage.wkd, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
        OutputStream outputStream = this.a;
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
                    if ((i2 & 1) != 0) {
                        i = 0;
                        break;
                    }
                    int i3 = i2 | 1;
                    if (atomicInteger.compareAndSet(i2, i3)) {
                        i = i3;
                        break;
                    }
                }
                if (i == 0) {
                    tsdVar.i();
                    return;
                }
                if (i != 3) {
                    if (!socket.isClosed() && !socket.isOutputShutdown()) {
                        outputStream.flush();
                        try {
                            socket.shutdownOutput();
                        } catch (UnsupportedOperationException unused) {
                            outputStream.close();
                        }
                    }
                    tsdVar.i();
                    return;
                }
                socket.close();
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

    @Override // defpackage.wkd, java.io.Flushable
    public final void flush() throws IOException {
        tsd tsdVar = this.b;
        tsdVar.h();
        try {
            try {
                this.a.flush();
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

    @Override // defpackage.wkd
    public final jye j() {
        return this.b;
    }

    public final String toString() {
        return "sink(" + ((Socket) this.c.b) + ')';
    }
}
