package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class e99 implements ol1, fzf {
    public final pl1 a;
    public final /* synthetic */ f99 b;

    public e99(f99 f99Var, pl1 pl1Var) {
        this.b = f99Var;
        this.a = pl1Var;
    }

    @Override // defpackage.fzf
    public final void a(rtc rtcVar, int i) {
        this.a.a(rtcVar, i);
    }

    @Override // defpackage.xn2
    public final void g(Object obj) {
        this.a.g(obj);
    }

    @Override // defpackage.xn2
    public final pv2 getContext() {
        return this.a.e;
    }

    @Override // defpackage.ol1
    public final ig4 j(Object obj, n26 n26Var) {
        f99 f99Var = this.b;
        g20 g20Var = new g20(21, f99Var, this);
        ig4 ig4VarH = this.a.H((wef) obj, g20Var);
        if (ig4VarH != null) {
            f99.w.set(f99Var, null);
        }
        return ig4VarH;
    }

    @Override // defpackage.ol1
    public final void n(Object obj, n26 n26Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f99.w;
        f99 f99Var = this.b;
        atomicReferenceFieldUpdater.set(f99Var, null);
        p59 p59Var = new p59(1, f99Var, this);
        pl1 pl1Var = this.a;
        pl1Var.E((wef) obj, pl1Var.c, new g20(6, p59Var));
    }

    @Override // defpackage.ol1
    public final boolean p(Throwable th) {
        return this.a.p(th);
    }

    @Override // defpackage.ol1
    public final void q(Object obj) {
        this.a.q(obj);
    }
}
