package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zhb implements Runnable {
    public final ws4 a;
    public volatile AtomicInteger b = new AtomicInteger(0);
    public final /* synthetic */ cib c;

    public zhb(cib cibVar, ws4 ws4Var) {
        this.c = cibVar;
        this.a = ws4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        da4 da4Var;
        String strConcat = "OkHttp ".concat(this.c.b.a.i());
        cib cibVar = this.c;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strConcat);
        try {
            cibVar.e.h();
            boolean z = false;
            try {
                try {
                    try {
                        this.a.d(cibVar, cibVar.e());
                        da4Var = cibVar.a.a;
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            sea seaVar = sea.a;
                            sea seaVar2 = sea.a;
                            StringBuilder sb = new StringBuilder("Callback failure for ");
                            sb.append((cibVar.F0 ? "canceled " : "") + "call to " + cibVar.b.a.i());
                            seaVar2.i(4, sb.toString(), e);
                        } else {
                            this.a.h(cibVar, e);
                        }
                        da4Var = cibVar.a.a;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        cibVar.cancel();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            iOException.initCause(th);
                            this.a.h(cibVar, iOException);
                        }
                        if (!(th instanceof InterruptedException)) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        da4Var = cibVar.a.a;
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th2) {
                    th = th2;
                }
                da4Var.getClass();
                da4.e(da4Var, null, null, this, 3);
                threadCurrentThread.setName(name);
            } catch (Throwable th3) {
                da4 da4Var2 = cibVar.a.a;
                da4Var2.getClass();
                da4.e(da4Var2, null, null, this, 3);
                throw th3;
            }
        } catch (Throwable th4) {
            threadCurrentThread.setName(name);
            throw th4;
        }
    }
}
