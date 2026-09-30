package defpackage;

import android.os.Trace;
import android.util.Pair;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ bw0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c89 c89VarC;
        int i = this.a;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                mue mueVar = (mue) obj5;
                cv7 cv7Var = (cv7) obj4;
                String str = (String) obj3;
                sw3 sw3Var = (sw3) obj2;
                xp5 xp5Var = (xp5) obj;
                boolean z = this.b;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    ird irdVarH = qrd.h();
                    c89 c89Var = irdVarH instanceof c89 ? (c89) irdVarH : null;
                    if (c89Var == null || (c89VarC = c89Var.C(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        ird irdVarJ = c89VarC.j();
                        try {
                            mue mueVarK = a6c.k(mueVar, cv7Var);
                            pu4 pu4Var = pu4.a;
                            xt xtVar = new xt(str, mueVarK, pu4Var, pu4Var, xp5Var, sw3Var, z);
                            xtVar.i();
                            xtVar.g();
                            ird.q(irdVarJ);
                            c89VarC.w().m();
                            c89VarC.c();
                            Trace.endSection();
                            return;
                        } catch (Throwable th) {
                            ird.q(irdVarJ);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            c89VarC.c();
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    Trace.endSection();
                    throw th4;
                }
            default:
                Pair pair = (Pair) obj4;
                ((kq8) obj5).b.i.o(((Integer) pair.first).intValue(), (zp8) pair.second, (v98) obj3, (qp8) obj2, (IOException) obj, this.b);
                return;
        }
    }
}
