package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lkf {
    public final qn2 a;
    public final Executor b;
    public final lyc c;
    public final ThreadLocal d;
    public final vp e;
    public final qn2 f;

    public lkf(qn2 qn2Var, Executor executor, sv2 sv2Var) {
        executor.getClass();
        this.a = qn2Var;
        this.b = executor;
        new Handler(Looper.getMainLooper());
        this.c = new lyc(executor);
        this.d = new ThreadLocal();
        vp vpVar = new vp(2, this);
        this.e = vpVar;
        this.f = jgb.k(qn2Var.a.p0(iqf.d()).p0(t72.z(vpVar)));
    }
}
