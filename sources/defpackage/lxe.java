package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class lxe implements xn7 {
    public static final lxe a = new lxe();
    public static final lw7 b = eb3.N(z18.b, new mie(16));

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        tg3 tg3Var = (tg3) obj;
        tg3Var.getClass();
        nyc nycVarE = e();
        ag2 ag2VarC = ev4Var.c(nycVarE);
        ag2VarC.k(a.e(), 0, tg3Var.b);
        ag2VarC.b(nycVarE);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVarE = e();
        zf2 zf2VarC = om3Var.c(nycVarE);
        long jD = 0;
        boolean z = false;
        while (true) {
            lxe lxeVar = a;
            int iJ = zf2VarC.j(lxeVar.e());
            if (iJ == -1) {
                zf2VarC.b(nycVarE);
                if (z) {
                    return new tg3(jD);
                }
                throw new ew8("nanoseconds", e().a());
            }
            if (iJ != 0) {
                t72.a0(iJ);
                throw null;
            }
            jD = zf2VarC.D(lxeVar.e(), 0);
            z = true;
        }
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return (nyc) b.getValue();
    }
}
