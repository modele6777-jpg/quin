package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hxe implements w56 {
    public static final hxe a;
    private static final nyc descriptor;

    static {
        hxe hxeVar = new hxe();
        a = hxeVar;
        gia giaVar = new gia("com.google.firebase.sessions.Time", hxeVar, 3);
        giaVar.k("ms", false);
        giaVar.k("us", true);
        giaVar.k("seconds", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        jxe jxeVar = (jxe) obj;
        jxeVar.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        long j = jxeVar.a;
        long j2 = jxeVar.c;
        long j3 = jxeVar.b;
        ag2VarC.k(nycVar, 0, j);
        if (ag2VarC.g(nycVar) || j3 != j * 1000) {
            ag2VarC.k(nycVar, 1, j3);
        }
        if (ag2VarC.g(nycVar) || j2 != j / 1000) {
            ag2VarC.k(nycVar, 2, j2);
        }
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
        long jD = 0;
        long jD2 = 0;
        long jD3 = 0;
        boolean z = true;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                jD = zf2VarC.D(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                jD2 = zf2VarC.D(nycVar, 1);
                i |= 2;
            } else {
                if (iJ != 2) {
                    s8f.f(iJ);
                    return null;
                }
                jD3 = zf2VarC.D(nycVar, 2);
                i |= 4;
            }
        }
        zf2VarC.b(nycVar);
        return new jxe(i, jD, jD2, jD3);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        eg8 eg8Var = eg8.a;
        return new xn7[]{eg8Var, eg8Var, eg8Var};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
