package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qjf implements atb {
    public final /* synthetic */ ujf a;

    public qjf(ujf ujfVar) {
        this.a = ujfVar;
    }

    @Override // defpackage.atb
    public final void R(qtb qtbVar, long j, ds dsVar) {
        Integer num;
        if (this.a.q.a == 0 || (num = (Integer) qtbVar.b(yde.b)) == null) {
            return;
        }
        ujf ujfVar = this.a;
        int iIntValue = num.intValue();
        synchronized (ujfVar.c) {
            ad0 ad0Var = ujfVar.f;
            while (!ad0Var.isEmpty() && ((rjf) ad0Var.first()).a <= iIntValue) {
                ((za2) ((rjf) ad0Var.first()).b).R(wef.a);
                x72.j0(ad0Var);
                this.a.q.a();
            }
        }
    }

    @Override // defpackage.atb
    public final void g0(qtb qtbVar, long j, ptb ptbVar) {
        Integer num;
        if (this.a.q.a == 0 || (num = (Integer) qtbVar.b(yde.b)) == null) {
            return;
        }
        ujf ujfVar = this.a;
        int iIntValue = num.intValue();
        synchronized (ujfVar.c) {
            ad0 ad0Var = ujfVar.f;
            Throwable th = new Throwable("Failed in framework level".concat(" with CaptureFailure.reason = " + ptbVar.U()));
            while (!ad0Var.isEmpty() && ((rjf) ad0Var.first()).a <= iIntValue) {
                ((za2) ((rjf) ad0Var.first()).b).i0(th);
                x72.j0(ad0Var);
                this.a.q.a();
            }
        }
    }
}
