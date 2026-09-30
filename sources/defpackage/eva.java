package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class eva implements w56 {
    public static final eva a;
    private static final nyc descriptor;

    static {
        eva evaVar = new eva();
        a = evaVar;
        gia giaVar = new gia("com.google.firebase.sessions.ProcessData", evaVar, 2);
        giaVar.k("pid", false);
        giaVar.k("uuid", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        gva gvaVar = (gva) obj;
        gvaVar.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        ag2VarC.v(0, gvaVar.a, nycVar);
        ag2VarC.w(nycVar, 1, gvaVar.b);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.w56
    public final xn7[] b() {
        return lmg.v;
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        boolean z = true;
        int i = 0;
        int iT = 0;
        String strO = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                iT = zf2VarC.t(nycVar, 0);
                i |= 1;
            } else {
                if (iJ != 1) {
                    s8f.f(iJ);
                    return null;
                }
                strO = zf2VarC.o(nycVar, 1);
                i |= 2;
            }
        }
        zf2VarC.b(nycVar);
        return new gva(i, iT, strO);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{c77.a, p4e.a};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
