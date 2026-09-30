package defpackage;

import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nw implements Choreographer.FrameCallback {
    public final /* synthetic */ pl1 a;
    public final /* synthetic */ a26 b;

    public nw(pl1 pl1Var, ow owVar, a26 a26Var) {
        this.a = pl1Var;
        this.b = a26Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object dzbVar;
        try {
            dzbVar = this.b.d(Long.valueOf(j));
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        this.a.g(dzbVar);
    }
}
