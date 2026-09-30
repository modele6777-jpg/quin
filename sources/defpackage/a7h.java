package defpackage;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a7h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c8h b;
    public final /* synthetic */ AtomicReference c;

    public a7h(c8h c8hVar, AtomicReference atomicReference) {
        this.a = 0;
        this.c = atomicReference;
        Objects.requireNonNull(c8hVar);
        this.b = c8hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AtomicReference atomicReference = this.c;
                synchronized (atomicReference) {
                    try {
                        try {
                            w3h w3hVar = (w3h) this.b.b;
                            atomicReference.set(Long.valueOf(w3hVar.d.I0(w3hVar.l().G0(), bzg.c0)));
                            this.c.notify();
                        } catch (Throwable th) {
                            this.c.notify();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 1:
                c8h c8hVar = this.b;
                c2h c2hVar = ((w3h) c8hVar.b).e;
                w3h.f(c2hVar);
                Bundle bundleL = c2hVar.Z.l();
                lah lahVarJ = ((w3h) c8hVar.b).j();
                AtomicReference atomicReference2 = this.c;
                lahVarJ.A0();
                lahVarJ.B0();
                lahVarJ.O0(new qu1(lahVarJ, atomicReference2, lahVarJ.Q0(false), bundleL, false, 11));
                return;
            default:
                lah lahVarJ2 = ((w3h) this.b.b).j();
                sbh sbhVarC = sbh.c(s8h.SGTM_CLIENT);
                AtomicReference atomicReference3 = this.c;
                lahVarJ2.A0();
                lahVarJ2.B0();
                lahVarJ2.O0(new qu1(lahVarJ2, atomicReference3, lahVarJ2.Q0(false), sbhVarC, false, 12));
                return;
        }
    }

    public /* synthetic */ a7h(c8h c8hVar, AtomicReference atomicReference, int i) {
        this.a = i;
        this.b = c8hVar;
        this.c = atomicReference;
    }
}
