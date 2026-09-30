package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bbg {
    public final h80 a;
    public final sv2 b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final dd7 d = new dd7(3, this);

    public bbg(ExecutorService executorService) {
        h80 h80Var = new h80(executorService);
        this.a = h80Var;
        this.b = t72.z(h80Var);
    }

    public final void a(Runnable runnable) {
        this.a.execute(runnable);
    }
}
