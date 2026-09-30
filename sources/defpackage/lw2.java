package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class lw2 {
    public static final qn2 a = jgb.k(iqf.d());
    public static final d35 b;

    static {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new iw2(0));
        executorServiceNewSingleThreadExecutor.getClass();
        b = new d35(executorServiceNewSingleThreadExecutor);
    }

    public static final void a(l26 l26Var) {
        js3 js3Var = ga4.a;
        ynb.V(a, mk8.a, null, new jw2(l26Var, null), 2);
    }

    public static final Object b(l26 l26Var, xn2 xn2Var) {
        return ynb.p0(b, new kw2(l26Var, null), xn2Var);
    }
}
