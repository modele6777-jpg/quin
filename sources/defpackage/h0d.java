package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h0d implements w56 {
    public static final h0d a;
    private static final nyc descriptor;

    static {
        h0d h0dVar = new h0d();
        a = h0dVar;
        gia giaVar = new gia("com.google.firebase.sessions.SessionData", h0dVar, 3);
        giaVar.k("sessionDetails", false);
        giaVar.k("backgroundTime", true);
        giaVar.k("processDataMap", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        j0d j0dVar = (j0d) obj;
        j0dVar.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        lw7[] lw7VarArr = j0d.d;
        l0d l0dVar = l0d.a;
        n0d n0dVar = j0dVar.a;
        Map map = j0dVar.c;
        jxe jxeVar = j0dVar.b;
        ag2VarC.p(nycVar, 0, l0dVar, n0dVar);
        if (ag2VarC.g(nycVar) || jxeVar != null) {
            ag2VarC.A(nycVar, 1, hxe.a, jxeVar);
        }
        if (ag2VarC.g(nycVar) || map != null) {
            ag2VarC.A(nycVar, 2, (xn7) lw7VarArr[2].getValue(), map);
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
        lw7[] lw7VarArr = j0d.d;
        boolean z = true;
        int i = 0;
        n0d n0dVar = null;
        jxe jxeVar = null;
        Map map = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                n0dVar = (n0d) zf2VarC.s(nycVar, 0, l0d.a, n0dVar);
                i |= 1;
            } else if (iJ == 1) {
                jxeVar = (jxe) zf2VarC.y(nycVar, 1, hxe.a, jxeVar);
                i |= 2;
            } else {
                if (iJ != 2) {
                    s8f.f(iJ);
                    return null;
                }
                map = (Map) zf2VarC.y(nycVar, 2, (xn7) lw7VarArr[2].getValue(), map);
                i |= 4;
            }
        }
        zf2VarC.b(nycVar);
        return new j0d(i, n0dVar, jxeVar, map);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{l0d.a, t72.F(hxe.a), t72.F((xn7) j0d.d[2].getValue())};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
