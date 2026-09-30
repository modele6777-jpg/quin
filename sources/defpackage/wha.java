package defpackage;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wha {
    public final vha a;
    public final g55 b;
    public int c;
    public Object d;
    public final Looper e;
    public boolean f;

    public wha(g55 g55Var, vha vhaVar, gye gyeVar, int i, Looper looper) {
        this.b = g55Var;
        this.a = vhaVar;
        this.e = looper;
    }

    public final synchronized void a(boolean z) {
        notifyAll();
    }

    public final void b() {
        pa7.J(!this.f);
        this.f = true;
        g55 g55Var = this.b;
        if (!g55Var.V0 && g55Var.w.getThread().isAlive()) {
            g55Var.g.c(14, this).b();
        } else {
            xo1.V("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            a(false);
        }
    }
}
