package defpackage;

import android.content.Intent;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xah extends nrg {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xah(Object obj, i5h i5hVar, int i) {
        super(i5hVar);
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.nrg
    public final void a() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                y21 y21Var = (y21) obj;
                ebh ebhVar = (ebh) y21Var.d;
                ebhVar.A0();
                w3h w3hVar = (w3h) ebhVar.b;
                w3hVar.y.getClass();
                y21Var.n(SystemClock.elapsedRealtime(), false, false);
                bwg bwgVar = w3hVar.Y;
                w3h.e(bwgVar);
                w3hVar.y.getClass();
                bwgVar.D0(SystemClock.elapsedRealtime());
                break;
            case 1:
                mbh mbhVar = (mbh) obj;
                mbhVar.E0();
                w0h w0hVar = ((w3h) mbhVar.b).f;
                w3h.h(w0hVar);
                w0hVar.Z.a("Starting upload from DelayedRunnable");
                mbhVar.c.l();
                break;
            default:
                ich ichVar = (ich) obj;
                ichVar.Z().A0();
                String str = (String) ichVar.F0.pollFirst();
                if (str != null) {
                    ichVar.E().getClass();
                    ichVar.X0 = SystemClock.elapsedRealtime();
                    ichVar.v().Z.b(str, "Sending trigger URI notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str);
                    ich.Q(ichVar.z.a, intent);
                }
                ichVar.F();
                break;
        }
    }
}
