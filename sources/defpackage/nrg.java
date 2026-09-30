package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class nrg {
    public static volatile sig d;
    public final i5h a;
    public final w36 b;
    public volatile long c;

    public nrg(i5h i5hVar) {
        oa7.A(i5hVar);
        this.a = i5hVar;
        this.b = new w36(this, i5hVar, false, 20);
    }

    public abstract void a();

    public final void b(long j) {
        c();
        if (j >= 0) {
            i5h i5hVar = this.a;
            i5hVar.E().getClass();
            this.c = System.currentTimeMillis();
            if (d().postDelayed(this.b, j)) {
                return;
            }
            i5hVar.v().g.b(Long.valueOf(j), "Failed to schedule delayed post. time");
        }
    }

    public final void c() {
        this.c = 0L;
        d().removeCallbacks(this.b);
    }

    public final Handler d() {
        sig sigVar;
        if (d != null) {
            return d;
        }
        synchronized (nrg.class) {
            try {
                if (d == null) {
                    d = new sig(this.a.a0().getMainLooper(), 2);
                }
                sigVar = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sigVar;
    }
}
