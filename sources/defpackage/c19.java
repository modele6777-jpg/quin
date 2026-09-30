package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c19 implements xn7 {
    public static final c19 a = new c19();
    public static final lw7 b = eb3.N(z18.b, new fk8(12));

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        rg3 rg3Var = (rg3) obj;
        rg3Var.getClass();
        nyc nycVarE = e();
        ag2 ag2VarC = ev4Var.c(nycVarE);
        ag2VarC.v(0, rg3Var.b, a.e());
        ag2VarC.b(nycVarE);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVarE = e();
        zf2 zf2VarC = om3Var.c(nycVarE);
        boolean z = false;
        int iT = 0;
        while (true) {
            c19 c19Var = a;
            int iJ = zf2VarC.j(c19Var.e());
            if (iJ == -1) {
                zf2VarC.b(nycVarE);
                if (z) {
                    return new rg3(iT);
                }
                throw new ew8("months", e().a());
            }
            if (iJ != 0) {
                t72.a0(iJ);
                throw null;
            }
            iT = zf2VarC.t(c19Var.e(), 0);
            z = true;
        }
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return (nyc) b.getValue();
    }
}
