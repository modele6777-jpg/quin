package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zk0 {
    public final Handler a;
    public final yk0 b;
    public final /* synthetic */ al0 c;

    public zk0(al0 al0Var) {
        this.c = al0Var;
        Handler handlerN = pqf.n(null);
        this.a = handlerN;
        yk0 yk0Var = new yk0(this);
        this.b = yk0Var;
        al0Var.a.registerStreamEventCallback(new xk0(handlerN, 0), yk0Var);
    }

    public final void a() {
        this.c.a.unregisterStreamEventCallback(this.b);
        this.a.removeCallbacksAndMessages(null);
    }
}
