package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k2e implements Runnable {
    public final vva a;
    public final nzd b;
    public final boolean c;
    public final int d;

    public k2e(vva vvaVar, nzd nzdVar, boolean z, int i) {
        vvaVar.getClass();
        nzdVar.getClass();
        this.a = vvaVar;
        this.b = nzdVar;
        this.c = z;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zD;
        ccg ccgVarB;
        boolean z = this.c;
        vva vvaVar = this.a;
        nzd nzdVar = this.b;
        if (z) {
            int i = this.d;
            vvaVar.getClass();
            String str = nzdVar.a.a;
            synchronized (vvaVar.k) {
                ccgVarB = vvaVar.b(str);
            }
            zD = vva.d(str, ccgVarB, i);
        } else {
            int i2 = this.d;
            vvaVar.getClass();
            String str2 = nzdVar.a.a;
            synchronized (vvaVar.k) {
                try {
                    if (vvaVar.f.get(str2) != null) {
                        ff8.h().e(vva.l, "Ignored stopWork. WorkerWrapper " + str2 + " is in foreground");
                    } else {
                        Set set = (Set) vvaVar.h.get(str2);
                        if (set != null && set.contains(nzdVar)) {
                            zD = vva.d(str2, vvaVar.b(str2), i2);
                        }
                    }
                    zD = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        ff8.h().e(ff8.n("StopWorkRunnable"), "StopWorkRunnable for " + this.b.a.a + "; Processor.stopWork = " + zD);
    }
}
