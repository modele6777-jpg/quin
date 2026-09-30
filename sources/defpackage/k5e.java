package defpackage;

import android.os.SystemClock;
import com.adjust.sdk.network.ErrorCodes;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k5e {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public long e;
    public boolean f;
    public long g;
    public final /* synthetic */ wo0 h;

    public k5e(wo0 wo0Var, int i) {
        this.h = wo0Var;
        this.a = i;
    }

    public final void a() {
        wo0 wo0Var = this.h;
        jce jceVar = (jce) wo0Var.g;
        y45 y45Var = (y45) wo0Var.b;
        if (!y45Var.x()) {
            if (this.f) {
                jceVar.f(2);
            }
            this.f = false;
            return;
        }
        gye gyeVarM = y45Var.m();
        Object objL = gyeVarM.p() ? null : gyeVarM.l(y45Var.j());
        int iG = y45Var.g();
        int iH = y45Var.h();
        long jK = y45Var.k();
        if (objL != null && iG == -1) {
            jK -= pqf.R(gyeVarM.g(objL, (eye) wo0Var.f).e);
        }
        ((ece) wo0Var.e).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.f;
        int i = this.a;
        if (z && Objects.equals(objL, this.b) && iG == this.c && iH == this.d && jK == this.e) {
            if (jElapsedRealtime - this.g >= i) {
                ((t45) wo0Var.d).a.U(new g45(2, new n5e(2, i), ErrorCodes.MALFORMED_URL_EXCEPTION));
                return;
            }
            return;
        }
        this.f = true;
        this.g = jElapsedRealtime;
        this.b = objL;
        this.c = iG;
        this.d = iH;
        this.e = jK;
        jceVar.f(2);
        jceVar.a.sendEmptyMessageDelayed(2, i);
    }
}
