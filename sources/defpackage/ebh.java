package defpackage;

import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ebh extends fzg {
    public sig d;
    public boolean e;
    public final vrb f;
    public final y21 g;
    public final m7h v;

    public ebh(w3h w3hVar) {
        super(w3hVar);
        this.e = true;
        this.f = new vrb(19, this);
        y21 y21Var = new y21();
        y21Var.d = this;
        w3h w3hVar2 = (w3h) this.b;
        y21Var.c = new xah(y21Var, w3hVar2, 0);
        w3hVar2.y.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        y21Var.a = jElapsedRealtime;
        y21Var.b = jElapsedRealtime;
        this.g = y21Var;
        m7h m7hVar = new m7h();
        m7hVar.b = this;
        this.v = m7hVar;
    }

    @Override // defpackage.fzg
    public final boolean D0() {
        return false;
    }

    public final void E0() {
        A0();
        if (this.d == null) {
            this.d = new sig(Looper.getMainLooper(), 2);
        }
    }
}
