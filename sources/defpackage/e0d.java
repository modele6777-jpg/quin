package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e0d implements w56 {
    public static final e0d a;
    private static final nyc descriptor;

    static {
        e0d e0dVar = new e0d();
        a = e0dVar;
        gia giaVar = new gia("com.google.firebase.sessions.settings.SessionConfigs", e0dVar, 5);
        giaVar.k("sessionsEnabled", false);
        giaVar.k("sessionSamplingRate", false);
        giaVar.k("sessionTimeoutSeconds", false);
        giaVar.k("cacheDurationSeconds", false);
        giaVar.k("cacheUpdatedTimeSeconds", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        g0d g0dVar = (g0d) obj;
        g0dVar.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        ag2VarC.A(nycVar, 0, g11.a, g0dVar.a);
        ag2VarC.A(nycVar, 1, vi4.a, g0dVar.b);
        c77 c77Var = c77.a;
        ag2VarC.A(nycVar, 2, c77Var, g0dVar.c);
        ag2VarC.A(nycVar, 3, c77Var, g0dVar.d);
        ag2VarC.A(nycVar, 4, eg8.a, g0dVar.e);
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
        Boolean bool = null;
        Double d = null;
        Integer num = null;
        Integer num2 = null;
        Long l = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                bool = (Boolean) zf2VarC.y(nycVar, 0, g11.a, bool);
                i |= 1;
            } else if (iJ == 1) {
                d = (Double) zf2VarC.y(nycVar, 1, vi4.a, d);
                i |= 2;
            } else if (iJ == 2) {
                num = (Integer) zf2VarC.y(nycVar, 2, c77.a, num);
                i |= 4;
            } else if (iJ == 3) {
                num2 = (Integer) zf2VarC.y(nycVar, 3, c77.a, num2);
                i |= 8;
            } else {
                if (iJ != 4) {
                    s8f.f(iJ);
                    return null;
                }
                l = (Long) zf2VarC.y(nycVar, 4, eg8.a, l);
                i |= 16;
            }
        }
        zf2VarC.b(nycVar);
        return new g0d(i, bool, d, num, num2, l);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        xn7 xn7VarF = t72.F(g11.a);
        xn7 xn7VarF2 = t72.F(vi4.a);
        c77 c77Var = c77.a;
        return new xn7[]{xn7VarF, xn7VarF2, t72.F(c77Var), t72.F(c77Var), t72.F(eg8.a)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
