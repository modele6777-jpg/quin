package defpackage;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class tah implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ ebh c;

    public tah(ebh ebhVar, long j, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = j;
                Objects.requireNonNull(ebhVar);
                this.c = ebhVar;
                break;
            default:
                this.b = j;
                Objects.requireNonNull(ebhVar);
                this.c = ebhVar;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00af  */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ebh ebhVar = this.c;
        switch (i) {
            case 0:
                y21 y21Var = ebhVar.g;
                ebhVar.A0();
                ebhVar.E0();
                w3h w3hVar = (w3h) ebhVar.b;
                w0h w0hVar = w3hVar.f;
                w3h.h(w0hVar);
                tz0 tz0Var = w0hVar.Z;
                long j = this.b;
                tz0Var.b(Long.valueOf(j), "Activity resumed, time");
                qqg qqgVar = w3hVar.d;
                if (qqgVar.L0(null, bzg.S0)) {
                    if (qqgVar.P0() || ebhVar.e) {
                        ((ebh) y21Var.d).A0();
                        ((xah) y21Var.c).c();
                        y21Var.a = j;
                        y21Var.b = j;
                    }
                } else if (qqgVar.P0()) {
                    ((ebh) y21Var.d).A0();
                    ((xah) y21Var.c).c();
                    y21Var.a = j;
                    y21Var.b = j;
                } else {
                    c2h c2hVar = w3hVar.e;
                    w3h.f(c2hVar);
                    if (c2hVar.I0.a()) {
                        ((ebh) y21Var.d).A0();
                        ((xah) y21Var.c).c();
                        y21Var.a = j;
                        y21Var.b = j;
                    }
                }
                m7h m7hVar = ebhVar.v;
                ebh ebhVar2 = (ebh) m7hVar.b;
                ebhVar2.A0();
                vah vahVar = (vah) m7hVar.a;
                if (vahVar != null) {
                    ebhVar2.d.removeCallbacks(vahVar);
                }
                c2h c2hVar2 = ((w3h) ebhVar2.b).e;
                w3h.f(c2hVar2);
                c2hVar2.I0.b(false);
                ebhVar2.A0();
                ebhVar2.e = false;
                vrb vrbVar = ebhVar.f;
                ebh ebhVar3 = (ebh) vrbVar.b;
                ebhVar3.A0();
                w3h w3hVar2 = (w3h) ebhVar3.b;
                boolean zA = w3hVar2.a();
                hj6 hj6Var = w3hVar2.y;
                if (zA) {
                    hj6Var.getClass();
                    vrbVar.m(System.currentTimeMillis(), w3hVar2.d.L0(null, bzg.e1) ? SystemClock.elapsedRealtime() : 0L);
                    break;
                }
                break;
            default:
                ebhVar.A0();
                ebhVar.E0();
                w3h w3hVar3 = (w3h) ebhVar.b;
                w0h w0hVar2 = w3hVar3.f;
                w3h.h(w0hVar2);
                tz0 tz0Var2 = w0hVar2.Z;
                long j2 = this.b;
                tz0Var2.b(Long.valueOf(j2), "Activity paused, time");
                m7h m7hVar2 = ebhVar.v;
                ebh ebhVar4 = (ebh) m7hVar2.b;
                ((w3h) ebhVar4.b).y.getClass();
                vah vahVar2 = new vah(m7hVar2, System.currentTimeMillis(), j2);
                m7hVar2.a = vahVar2;
                ebhVar4.d.postDelayed(vahVar2, 2000L);
                if (w3hVar3.d.P0()) {
                    ((xah) ebhVar.g.c).c();
                }
                break;
        }
    }
}
