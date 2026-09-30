package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cp8 implements ruf {
    public final /* synthetic */ gp8 b;

    public cp8(gp8 gp8Var) {
        this.b = gp8Var;
    }

    @Override // defpackage.ruf
    public final void b() {
        gp8 gp8Var = this.b;
        Surface surface = gp8Var.p2;
        if (surface != null) {
            lqb lqbVar = gp8Var.W1;
            Handler handler = (Handler) lqbVar.b;
            if (handler != null) {
                handler.post(new ae1(lqbVar, surface, SystemClock.elapsedRealtime(), 3));
            }
            gp8Var.s2 = true;
        }
    }

    @Override // defpackage.ruf
    public final void c() {
        gp8 gp8Var = this.b;
        if (gp8Var.p2 != null) {
            gp8Var.U0(0, 1);
        }
    }

    @Override // defpackage.ruf
    public final void d() {
        b55 b55Var = this.b.W0;
        if (b55Var != null) {
            b55Var.a();
        }
    }

    @Override // defpackage.ruf
    public final void a(uuf uufVar) {
    }
}
