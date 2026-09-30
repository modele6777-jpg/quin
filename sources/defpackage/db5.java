package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class db5 implements bb5 {
    public final yg1 a;
    public final hh1 b;
    public final ui1 c;

    public db5(yg1 yg1Var, hh1 hh1Var, ui1 ui1Var) {
        this.a = yg1Var;
        this.b = hh1Var;
        this.c = ui1Var;
    }

    @Override // defpackage.bb5
    public final boolean c(zzc zzcVar) {
        ge1 ge1Var = new ge1();
        w92 w92Var = new w92();
        yg1 yg1Var = this.a;
        ue1 ue1Var = new ue1(((nc1) yg1Var).a, 0);
        eeg eegVar = new eeg();
        ui1 ui1Var = this.c;
        ag1 ag1Var = new ag1(ge1Var, w92Var, ue1Var, ui1Var, eegVar, new ym5(ui1Var.a()), yg1Var, null, null);
        qu4 qu4Var = qu4.a;
        return ((Boolean) z5c.I(nu4.a, new cb5(this, ag1Var.a(0, zzcVar, true, null, null, qu4Var, qu4Var), null))).booleanValue();
    }
}
