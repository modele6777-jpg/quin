package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class y6h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ c8h c;

    public y6h(c8h c8hVar, AtomicReference atomicReference, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = atomicReference;
                Objects.requireNonNull(c8hVar);
                this.c = c8hVar;
                break;
            default:
                this.b = atomicReference;
                Objects.requireNonNull(c8hVar);
                this.c = c8hVar;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AtomicReference atomicReference = this.b;
                synchronized (atomicReference) {
                    try {
                        try {
                            w3h w3hVar = (w3h) this.c.b;
                            atomicReference.set(w3hVar.d.H0(w3hVar.l().G0(), bzg.b0));
                            this.b.notify();
                        } catch (Throwable th) {
                            this.b.notify();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                AtomicReference atomicReference2 = this.b;
                synchronized (atomicReference2) {
                    try {
                        try {
                            w3h w3hVar2 = (w3h) this.c.b;
                            atomicReference2.set(Double.valueOf(w3hVar2.d.K0(w3hVar2.l().G0(), bzg.e0)));
                            this.b.notify();
                        } catch (Throwable th3) {
                            this.b.notify();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return;
        }
    }
}
