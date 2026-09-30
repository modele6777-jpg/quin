package defpackage;

import android.os.SystemClock;
import com.adjust.sdk.network.ErrorCodes;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l5e {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public boolean e;
    public long f;
    public final /* synthetic */ wo0 g;

    public l5e(wo0 wo0Var, int i) {
        this.g = wo0Var;
        this.a = i;
    }

    public final void a() {
        long jP;
        wo0 wo0Var = this.g;
        eye eyeVar = (eye) wo0Var.f;
        jce jceVar = (jce) wo0Var.g;
        y45 y45Var = (y45) wo0Var.b;
        gye gyeVarM = y45Var.m();
        Object objL = gyeVarM.p() ? null : gyeVarM.l(y45Var.j());
        int iG = y45Var.g();
        int iH = y45Var.h();
        long jK = y45Var.k();
        if (objL == null || iG != -1) {
            jP = iG != -1 ? y45Var.p() : -9223372036854775807L;
        } else {
            gyeVarM.g(objL, eyeVar);
            jK -= pqf.R(eyeVar.e);
            jP = pqf.R(eyeVar.d);
        }
        boolean zX = y45Var.x();
        if (!zX || jP == -9223372036854775807L || jK < jP) {
            jceVar.f(3);
            if (zX && jP != -9223372036854775807L) {
                y45Var.Z();
                jceVar.a.sendEmptyMessageDelayed(3, (int) Math.ceil((jP - jK) / y45Var.n0.o.a));
            }
            this.e = false;
            return;
        }
        ((ece) wo0Var.e).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.e;
        int i = this.a;
        if (z && Objects.equals(objL, this.b) && iG == this.c && iH == this.d) {
            if (jElapsedRealtime - this.f >= i) {
                ((t45) wo0Var.d).a.U(new g45(2, new n5e(3, i), ErrorCodes.MALFORMED_URL_EXCEPTION));
                return;
            }
            return;
        }
        this.e = true;
        this.f = jElapsedRealtime;
        this.b = objL;
        this.c = iG;
        this.d = iH;
        jceVar.f(3);
        jceVar.a.sendEmptyMessageDelayed(3, i);
    }
}
