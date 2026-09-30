package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class on1 implements atb {
    public final /* synthetic */ za2 a;

    public on1(za2 za2Var) {
        this.a = za2Var;
    }

    @Override // defpackage.atb
    public final void R(qtb qtbVar, long j, ds dsVar) {
        this.a.R(null);
    }

    @Override // defpackage.atb
    public final void g0(qtb qtbVar, long j, ptb ptbVar) {
        this.a.i0(new jv6(2, "Capture request failed with reason " + ptbVar.U(), null));
    }

    @Override // defpackage.atb
    public final void k0(ctb ctbVar) {
        ctbVar.getClass();
        this.a.i0(new jv6(3, "Capture request is cancelled because camera is closed", null));
    }
}
