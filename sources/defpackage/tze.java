package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tze {
    public lne a;
    public sze b = sze.a;

    public final void a() {
        ene eneVar;
        if (this.b == sze.a) {
            l37.c("ToolbarRequester is not initialized.");
        }
        lne lneVar = this.a;
        if (lneVar == null || !lneVar.Y) {
            return;
        }
        lyd lydVar = lneVar.J0;
        if ((lydVar == null || !lydVar.b()) && (eneVar = (ene) eb3.H(lneVar, fne.b)) != null) {
            lneVar.J0 = ynb.V(lneVar.Z0(), null, dw2.d, new kne(lneVar, eneVar, null), 1);
        }
    }
}
