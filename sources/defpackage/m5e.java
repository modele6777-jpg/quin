package defpackage;

import android.os.SystemClock;
import com.adjust.sdk.network.ErrorCodes;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m5e {
    public int a;
    public boolean b;
    public long c;
    public final /* synthetic */ wo0 d;

    public m5e(wo0 wo0Var) {
        this.d = wo0Var;
    }

    public final void a() {
        wo0 wo0Var = this.d;
        jce jceVar = (jce) wo0Var.g;
        y45 y45Var = (y45) wo0Var.b;
        int iS = y45Var.s();
        if (!y45Var.q() || y45Var.r() == 1 || y45Var.r() == 4 || iS == 0 || iS == 1) {
            if (this.b) {
                jceVar.f(4);
            }
            this.b = false;
            return;
        }
        ((ece) wo0Var.e).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.b && this.a == iS) {
            if (jElapsedRealtime - this.c >= 600000) {
                ((t45) wo0Var.d).a.U(new g45(2, new n5e(4, 600000), ErrorCodes.MALFORMED_URL_EXCEPTION));
                return;
            }
            return;
        }
        this.b = true;
        this.c = jElapsedRealtime;
        this.a = iS;
        jceVar.f(4);
        jceVar.a.sendEmptyMessageDelayed(4, 600000L);
    }
}
