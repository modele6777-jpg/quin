package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class p6h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ c8h c;

    public p6h(c8h c8hVar, long j, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = j;
                this.c = c8hVar;
                break;
            default:
                this.b = j;
                Objects.requireNonNull(c8hVar);
                this.c = c8hVar;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.b;
        c8h c8hVar = this.c;
        switch (i) {
            case 0:
                w3h w3hVar = (w3h) c8hVar.b;
                c2h c2hVar = w3hVar.e;
                w3h.f(c2hVar);
                c2hVar.z.b(j);
                w0h w0hVar = w3hVar.f;
                w3h.h(w0hVar);
                w0hVar.Y.b(Long.valueOf(j), "Session timeout duration set");
                break;
            default:
                c8hVar.A0();
                c8hVar.B0();
                w3h w3hVar2 = (w3h) c8hVar.b;
                w0h w0hVar2 = w3hVar2.f;
                w3h.h(w0hVar2);
                w0hVar2.Y.a("Resetting analytics data (FE)");
                ebh ebhVar = w3hVar2.v;
                w3h.g(ebhVar);
                ebhVar.A0();
                y21 y21Var = ebhVar.g;
                ((xah) y21Var.c).c();
                ((w3h) ((ebh) y21Var.d).b).y.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                y21Var.a = jElapsedRealtime;
                y21Var.b = jElapsedRealtime;
                w3hVar2.l().F0();
                boolean z = !w3hVar2.a();
                c2h c2hVar2 = w3hVar2.e;
                w3h.f(c2hVar2);
                c2hVar2.g.b(j);
                w3h w3hVar3 = (w3h) c2hVar2.b;
                c2h c2hVar3 = w3hVar3.e;
                w3h.f(c2hVar3);
                if (!TextUtils.isEmpty(c2hVar3.L0.C())) {
                    c2hVar2.L0.D(null);
                }
                c2hVar2.F0.b(0L);
                c2hVar2.G0.b(0L);
                if (!w3hVar3.d.O0()) {
                    c2hVar2.I0(z);
                }
                c2hVar2.M0.D(null);
                c2hVar2.N0.b(0L);
                c2hVar2.O0.q(null);
                lah lahVarJ = w3hVar2.j();
                lahVarJ.A0();
                lahVarJ.B0();
                ndh ndhVarQ0 = lahVarJ.Q0(false);
                lahVarJ.M0();
                ((w3h) lahVarJ.b).i().E0();
                lahVarJ.O0(new n6h(4, lahVarJ, ndhVarQ0));
                w3h.g(ebhVar);
                ebhVar.f.k();
                c8hVar.H0 = z;
                w3hVar2.j().E0(new AtomicReference());
                break;
        }
    }
}
