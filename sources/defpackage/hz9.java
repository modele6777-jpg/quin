package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hz9 extends n16 {
    public final cu2 J;
    public final boolean K;

    public hz9(cu2 cu2Var, boolean z) {
        this.J = cu2Var;
        this.K = z;
    }

    @Override // defpackage.n16
    public final void t(htb htbVar, Object obj) {
        if (obj == null) {
            return;
        }
        htbVar.d((String) this.J.v(obj), null, this.K);
    }
}
