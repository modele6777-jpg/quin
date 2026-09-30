package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wg6 extends sv2 implements ov3 {
    public final Handler c;
    public final String d;
    public final boolean e;
    public final wg6 f;

    public wg6(Handler handler, String str, boolean z) {
        this.c = handler;
        this.d = str;
        this.e = z;
        this.f = z ? this : new wg6(handler, str, true);
    }

    @Override // defpackage.ov3
    public final ta4 R(long j, Runnable runnable, pv2 pv2Var) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(runnable, j)) {
            return new vg6(0, this, runnable);
        }
        d1(pv2Var, runnable);
        return hg9.a;
    }

    @Override // defpackage.sv2
    public final void Z0(pv2 pv2Var, Runnable runnable) {
        if (this.c.post(runnable)) {
            return;
        }
        d1(pv2Var, runnable);
    }

    @Override // defpackage.sv2
    public final boolean b1(pv2 pv2Var) {
        return (this.e && pa7.t(Looper.myLooper(), this.c.getLooper())) ? false : true;
    }

    @Override // defpackage.sv2
    public final sv2 c1(int i) {
        abg.p(i);
        return this;
    }

    public final void d1(pv2 pv2Var, Runnable runnable) {
        tq.n(pv2Var, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        js3 js3Var = ga4.a;
        hr3.c.Z0(pv2Var, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wg6)) {
            return false;
        }
        wg6 wg6Var = (wg6) obj;
        return wg6Var.c == this.c && wg6Var.e == this.e;
    }

    public final int hashCode() {
        return (this.e ? 1231 : 1237) ^ System.identityHashCode(this.c);
    }

    @Override // defpackage.ov3
    public final void k0(long j, pl1 pl1Var) {
        ny2 ny2Var = new ny2(19, pl1Var, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(ny2Var, j)) {
            pl1Var.x(new so5(7, this, ny2Var));
        } else {
            d1(pl1Var.e, ny2Var);
        }
    }

    @Override // defpackage.sv2
    public final String toString() {
        wg6 wg6Var;
        String str;
        js3 js3Var = ga4.a;
        wg6 wg6Var2 = mk8.a;
        if (this == wg6Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                wg6Var = wg6Var2.f;
            } catch (UnsupportedOperationException unused) {
                wg6Var = null;
            }
            str = this == wg6Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.d;
        if (string == null) {
            string = this.c.toString();
        }
        return this.e ? tec.l(string, ".immediate") : string;
    }

    public wg6(Handler handler) {
        this(handler, null, false);
    }
}
