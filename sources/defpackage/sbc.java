package defpackage;

import android.view.Surface;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sbc implements lw6 {
    public final lw6 d;
    public final Surface e;
    public cee f;
    public final Object a = new Object();
    public int b = 0;
    public boolean c = false;
    public final hw6 g = new hw6(this);

    public sbc(lw6 lw6Var) {
        this.d = lw6Var;
        this.e = lw6Var.getSurface();
    }

    @Override // defpackage.lw6
    public final iw6 A0() {
        bkd bkdVar;
        synchronized (this.a) {
            iw6 iw6VarA0 = this.d.A0();
            if (iw6VarA0 != null) {
                this.b++;
                bkdVar = new bkd(iw6VarA0);
                bkdVar.b(this.g);
            } else {
                bkdVar = null;
            }
        }
        return bkdVar;
    }

    @Override // defpackage.lw6
    public final void B() {
        synchronized (this.a) {
            this.d.B();
        }
    }

    public final void a() {
        synchronized (this.a) {
            try {
                this.c = true;
                this.d.B();
                if (this.b == 0) {
                    close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.lw6
    public final int c() {
        int iC;
        synchronized (this.a) {
            iC = this.d.c();
        }
        return iC;
    }

    @Override // defpackage.lw6
    public final void close() {
        synchronized (this.a) {
            try {
                Surface surface = this.e;
                if (surface != null) {
                    surface.release();
                }
                this.d.close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.lw6
    public final int d() {
        int iD;
        synchronized (this.a) {
            iD = this.d.d();
        }
        return iD;
    }

    @Override // defpackage.lw6
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.a) {
            surface = this.d.getSurface();
        }
        return surface;
    }

    @Override // defpackage.lw6
    public final void h0(kw6 kw6Var, Executor executor) {
        synchronized (this.a) {
            this.d.h0(new bo1(23, this, kw6Var), executor);
        }
    }

    @Override // defpackage.lw6
    public final iw6 q() {
        bkd bkdVar;
        synchronized (this.a) {
            iw6 iw6VarQ = this.d.q();
            if (iw6VarQ != null) {
                this.b++;
                bkdVar = new bkd(iw6VarQ);
                bkdVar.b(this.g);
            } else {
                bkdVar = null;
            }
        }
        return bkdVar;
    }

    @Override // defpackage.lw6
    public final int v() {
        int iV;
        synchronized (this.a) {
            iV = this.d.v();
        }
        return iV;
    }

    @Override // defpackage.lw6
    public final int v0() {
        int iV0;
        synchronized (this.a) {
            iV0 = this.d.v0();
        }
        return iV0;
    }
}
