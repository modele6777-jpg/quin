package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class i68 extends sf9 {
    public final String g;
    public final String h;

    public i68(String str, String str2) {
        this.g = str;
        this.h = str2;
    }

    @Override // defpackage.sf9
    public final void a(sug sugVar) {
        sugVar.b++;
        sf9 sf9Var = this.b;
        while (sf9Var != null) {
            sf9 sf9Var2 = sf9Var.e;
            sf9Var.a(sugVar);
            sf9Var = sf9Var2;
        }
        sugVar.b--;
    }

    @Override // defpackage.sf9
    public final String h() {
        return ub3.k("destination=", this.g, ", title=", this.h);
    }
}
