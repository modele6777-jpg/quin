package defpackage;

import android.os.Handler;
import android.util.Log;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qwe {
    public final aw2 a;
    public final aw2 b;
    public final Executor c;
    public final sv2 d;
    public final Executor e;
    public final sv2 f;
    public final Executor g;
    public final sv2 h;
    public final ace i;
    public final ace j;

    public qwe(aw2 aw2Var, aw2 aw2Var2, Executor executor, sv2 sv2Var, Executor executor2, sv2 sv2Var2, Executor executor3, sv2 sv2Var3, x16 x16Var, ykc ykcVar) {
        aw2Var.getClass();
        aw2Var2.getClass();
        this.a = aw2Var;
        this.b = aw2Var2;
        this.c = executor;
        this.d = sv2Var;
        this.e = executor2;
        this.f = sv2Var2;
        this.g = executor3;
        this.h = sv2Var3;
        this.i = new ace(new yca(16, x16Var));
        this.j = new ace(new h2e(13, ykcVar));
    }

    public final Handler a() {
        return (Handler) this.i.getValue();
    }

    public final Object b(long j, a26 a26Var) {
        try {
            return z5c.I(this.d, new pwe(this, a26Var, j, null));
        } catch (InterruptedException e) {
            Log.i("CXCP", "runBlockingCheckedOrNull cancelled by thread interruption", e);
            return null;
        }
    }
}
