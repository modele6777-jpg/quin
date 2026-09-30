package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qhg implements os0 {
    public final /* synthetic */ ec6 a;

    public qhg(ec6 ec6Var) {
        this.a = ec6Var;
    }

    @Override // defpackage.os0
    public final void a(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        sig sigVar = this.a.X;
        sigVar.sendMessage(sigVar.obtainMessage(1, boolValueOf));
    }
}
