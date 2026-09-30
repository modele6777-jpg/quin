package defpackage;

import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cw0 {
    public static final pr4 a = new pr4(1, new jl0(8));
    public static Boolean b;

    public static final void a(final k00 k00Var, final mue mueVar, final xp5 xp5Var, final List list, final boolean z, l46 l46Var) {
        Executor executor = (Executor) l46Var.k(a);
        if (executor == null || !b(k00Var.b.length())) {
            l46Var.f0(317137883);
            l46Var.r(false);
            return;
        }
        l46Var.f0(315439796);
        final cv7 cv7Var = (cv7) l46Var.k(zg2.n);
        final sw3 sw3Var = (sw3) l46Var.k(zg2.h);
        try {
            executor.execute(new Runnable() { // from class: aw0
                @Override // java.lang.Runnable
                public final void run() {
                    c89 c89VarC;
                    mue mueVar2 = mueVar;
                    cv7 cv7Var2 = cv7Var;
                    k00 k00Var2 = k00Var;
                    sw3 sw3Var2 = sw3Var;
                    xp5 xp5Var2 = xp5Var;
                    boolean z2 = z;
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
                                mue mueVarK = a6c.k(mueVar2, cv7Var2);
                                List list2 = list;
                                if (list2 == null) {
                                    list2 = pu4.a;
                                }
                                a82 a82Var = new a82(k00Var2, sw3Var2, xp5Var2, mueVarK, list2, z2);
                                a82Var.i();
                                a82Var.g();
                                ird.q(irdVarJ);
                                c89VarC.w().m();
                                c89VarC.c();
                                Trace.endSection();
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
                }
            });
        } catch (RejectedExecutionException unused) {
        }
        l46Var.r(false);
    }

    public static final boolean b(int i) {
        if (Build.VERSION.SDK_INT >= 28 && i >= 8 && i < 1000) {
            Boolean boolValueOf = b;
            if (boolValueOf == null) {
                boolValueOf = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
                b = boolValueOf;
            }
            if (boolValueOf.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
