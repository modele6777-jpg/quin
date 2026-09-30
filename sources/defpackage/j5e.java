package defpackage;

import android.os.SystemClock;
import com.adjust.sdk.network.ErrorCodes;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j5e {
    public Object a;
    public int b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public long g;
    public final /* synthetic */ wo0 h;

    public j5e(wo0 wo0Var) {
        this.h = wo0Var;
    }

    public final void a() {
        long j;
        wo0 wo0Var = this.h;
        if (((y45) wo0Var.b).r() != 2 || !((y45) wo0Var.b).q() || ((y45) wo0Var.b).s() != 0) {
            if (this.f) {
                ((jce) wo0Var.g).f(1);
            }
            this.f = false;
            return;
        }
        gye gyeVarM = ((y45) wo0Var.b).m();
        Object objL = gyeVarM.p() ? null : gyeVarM.l(((y45) wo0Var.b).j());
        int iG = ((y45) wo0Var.b).g();
        int iH = ((y45) wo0Var.b).h();
        long jD = ((y45) wo0Var.b).d();
        long jMax = Math.max(0L, jD - ((y45) wo0Var.b).k());
        y45 y45Var = (y45) wo0Var.b;
        y45Var.Z();
        long jMax2 = Math.max(0L, pqf.R(y45Var.n0.r) - jMax);
        if (objL != null && iG == -1) {
            jD -= pqf.R(gyeVarM.g(objL, (eye) wo0Var.f).e);
        }
        ((ece) wo0Var.e).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f && Objects.equals(objL, this.a) && iG == this.b && iH == this.c) {
            j = 600000;
            if (jD == this.d && jMax2 == this.e) {
                if (jElapsedRealtime - this.g >= 600000) {
                    ((t45) wo0Var.d).a.U(new g45(2, new n5e(1, 600000), ErrorCodes.MALFORMED_URL_EXCEPTION));
                    return;
                }
                return;
            }
        } else {
            j = 600000;
        }
        this.f = true;
        this.g = jElapsedRealtime;
        this.a = objL;
        this.b = iG;
        this.c = iH;
        this.d = jD;
        this.e = jMax2;
        ((jce) wo0Var.g).f(1);
        ((jce) wo0Var.g).a.sendEmptyMessageDelayed(1, j);
    }
}
