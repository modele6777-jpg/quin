package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l0d implements w56 {
    public static final l0d a;
    private static final nyc descriptor;

    static {
        l0d l0dVar = new l0d();
        a = l0dVar;
        gia giaVar = new gia("com.google.firebase.sessions.SessionDetails", l0dVar, 4);
        giaVar.k("sessionId", false);
        giaVar.k("firstSessionId", false);
        giaVar.k("sessionIndex", false);
        giaVar.k("sessionStartTimestampUs", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        n0d n0dVar = (n0d) obj;
        n0dVar.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        ag2VarC.w(nycVar, 0, n0dVar.a);
        ag2VarC.w(nycVar, 1, n0dVar.b);
        ag2VarC.v(2, n0dVar.c, nycVar);
        ag2VarC.k(nycVar, 3, n0dVar.d);
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
        int i = 0;
        int iT = 0;
        String strO = null;
        String strO2 = null;
        long jD = 0;
        boolean z = true;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                strO = zf2VarC.o(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                strO2 = zf2VarC.o(nycVar, 1);
                i |= 2;
            } else if (iJ == 2) {
                iT = zf2VarC.t(nycVar, 2);
                i |= 4;
            } else {
                if (iJ != 3) {
                    s8f.f(iJ);
                    return null;
                }
                jD = zf2VarC.D(nycVar, 3);
                i |= 8;
            }
        }
        zf2VarC.b(nycVar);
        return new n0d(i, iT, jD, strO, strO2);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, p4eVar, c77.a, eg8.a};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
