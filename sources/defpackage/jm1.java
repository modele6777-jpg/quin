package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jm1 implements atb {
    public final /* synthetic */ AtomicReference a;

    public jm1(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.atb
    public final void R(qtb qtbVar, long j, ds dsVar) throws Exception {
        iw6 iw6Var = (iw6) this.a.getAndSet(null);
        if (iw6Var != null) {
            iw6Var.close();
        }
    }

    @Override // defpackage.atb
    public final void g0(qtb qtbVar, long j, ptb ptbVar) throws Exception {
        iw6 iw6Var = (iw6) this.a.getAndSet(null);
        if (iw6Var != null) {
            iw6Var.close();
        }
    }

    @Override // defpackage.atb
    public final void h0(qtb qtbVar, long j, ds dsVar) throws Exception {
        iw6 iw6Var = (iw6) this.a.getAndSet(null);
        if (iw6Var != null) {
            iw6Var.close();
        }
    }

    @Override // defpackage.atb
    public final void k0(ctb ctbVar) throws Exception {
        ctbVar.getClass();
        iw6 iw6Var = (iw6) this.a.getAndSet(null);
        if (iw6Var != null) {
            iw6Var.close();
        }
    }
}
