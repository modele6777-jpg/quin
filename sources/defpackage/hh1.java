package defpackage;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hh1 {
    public final r23 a;
    public final int b;
    public final Object c;
    public boolean d;

    public hh1(r23 r23Var) {
        this.a = r23Var;
        wh0 wh0Var = jh1.a;
        wh0Var.getClass();
        this.b = wh0.b.incrementAndGet(wh0Var);
        this.c = new Object();
    }

    public final bk1 a() {
        bk1 bk1Var;
        synchronized (this.c) {
            if (this.d) {
                throw new IllegalStateException("Check failed.");
            }
            bk1Var = (bk1) ((g1b) this.a.y).get();
        }
        return bk1Var;
    }

    public final mf1 b() {
        mf1 mf1Var;
        synchronized (this.c) {
            if (this.d) {
                throw new IllegalStateException("Check failed.");
            }
            mf1Var = (mf1) ((g1b) this.a.w).get();
        }
        return mf1Var;
    }

    public final yf1 c(uf1 uf1Var, bg1 bg1Var) {
        try {
            Trace.beginSection("CXCP#CameraGraph-" + ((Object) ig1.b(uf1Var.a)));
            return (yf1) new q23((r23) this.a.c, new k47(16, uf1Var, bg1Var)).s.get();
        } finally {
            Trace.endSection();
        }
    }

    public final String toString() {
        return "CameraPipe-" + this.b;
    }
}
