package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class eyf implements yxf {
    public final String a;
    public final ud6 b;
    public final aw2 c;
    public final int d;
    public final Object e;
    public boolean f;
    public wxf g;
    public final ncd h;
    public final wj5 i;
    public yi1 j;
    public lyd k;
    public h99 l;

    public eyf(String str, ud6 ud6Var, aw2 aw2Var) {
        str.getClass();
        aw2Var.getClass();
        this.a = str;
        this.b = ud6Var;
        this.c = aw2Var;
        wh0 wh0Var = cyf.a;
        wh0Var.getClass();
        this.d = wh0.b.incrementAndGet(wh0Var);
        this.e = new Object();
        ncd ncdVarB = ocd.b(1, 3, null, 4);
        this.h = ncdVarB;
        this.i = dj6.I(ncdVarB);
        qj1 qj1Var = qj1.a;
        this.j = qj1Var;
        if (ncdVarB.i(qj1Var)) {
            return;
        }
        qc0.p("Check failed.");
        throw null;
    }

    public final void a(nf1 nf1Var) {
        yi1 yi1Var;
        synchronized (this.e) {
            try {
                if (this.f) {
                    return;
                }
                this.f = true;
                Log.i("CXCP", "Disconnecting " + this);
                wxf wxfVar = this.g;
                if (wxfVar != null) {
                    synchronized (wxfVar.b) {
                        wxfVar.c = true;
                    }
                }
                lyd lydVar = this.k;
                if (lydVar != null) {
                    lydVar.h(null);
                }
                h99 h99Var = this.l;
                if (h99Var != null) {
                    h99Var.b();
                }
                synchronized (this.e) {
                    yi1Var = this.j;
                }
                if (!(yi1Var instanceof bj1)) {
                    if (!(yi1Var instanceof cj1)) {
                        b(new cj1(null));
                    }
                    b(new bj1(this.a, d62.b, null, null, null, null, null, null, nf1Var));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(yi1 yi1Var) {
        this.j = yi1Var;
        if (this.h.i(yi1Var)) {
            return;
        }
        ho7.u("Failed to emit ", yi1Var, " in ", this);
    }

    public final String toString() {
        return "VirtualCamera-" + this.d;
    }
}
