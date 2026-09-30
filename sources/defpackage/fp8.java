package defpackage;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fp8 implements Handler.Callback {
    public final Handler a;
    public final /* synthetic */ gp8 b;

    public fp8(gp8 gp8Var, po8 po8Var) {
        this.b = gp8Var;
        Handler handlerN = pqf.n(this);
        this.a = handlerN;
        po8Var.r(this, handlerN);
    }

    public final void a(long j) {
        Surface surface;
        gp8 gp8Var = this.b;
        lqb lqbVar = gp8Var.W1;
        if (this != gp8Var.K2 || gp8Var.a1 == null) {
            return;
        }
        if (j == Long.MAX_VALUE) {
            gp8Var.H1 = true;
            return;
        }
        try {
            gp8Var.F0(j);
            uuf uufVar = gp8Var.F2;
            if (!uufVar.equals(uuf.d) && !uufVar.equals(gp8Var.G2)) {
                gp8Var.G2 = uufVar;
                lqbVar.z(uufVar);
            }
            gp8Var.J1.e++;
            iuf iufVar = gp8Var.Z1;
            boolean z = iufVar.e != 3;
            iufVar.e = 3;
            iufVar.k.getClass();
            iufVar.g = pqf.H(SystemClock.elapsedRealtime());
            if (z && (surface = gp8Var.p2) != null) {
                Handler handler = (Handler) lqbVar.b;
                if (handler != null) {
                    handler.post(new ae1(lqbVar, surface, SystemClock.elapsedRealtime(), 3));
                }
                gp8Var.s2 = true;
            }
            gp8Var.k0(j);
        } catch (g45 e) {
            gp8Var.I1 = e;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i = message.arg1;
        int i2 = message.arg2;
        String str = pqf.a;
        a(((((long) i) & 4294967295L) << 32) | (4294967295L & ((long) i2)));
        return true;
    }
}
