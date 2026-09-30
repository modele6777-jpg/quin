package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rx4 extends bl2 {
    public final j22 b;
    public final t99 c;

    public rx4(j22 j22Var, t99 t99Var) {
        super(new iy9(j22Var, t99Var));
        this.b = j22Var;
        this.c = t99Var;
    }

    @Override // defpackage.bl2
    public final tt7 a(w09 w09Var) {
        tjd tjdVarS;
        w09Var.getClass();
        j22 j22Var = this.b;
        u09 u09VarP = od4.p(w09Var, j22Var);
        if (u09VarP != null) {
            int i = oz3.a;
            if (!oz3.l(u09VarP, l22.ENUM_CLASS)) {
                u09VarP = null;
            }
            if (u09VarP != null && (tjdVarS = u09VarP.S()) != null) {
                return tjdVarS;
            }
        }
        String string = j22Var.toString();
        String str = this.c.a;
        str.getClass();
        return sy4.c(qy4.N0, string, str);
    }

    @Override // defpackage.bl2
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b.f());
        sb.append('.');
        sb.append(this.c);
        return sb.toString();
    }
}
