package defpackage;

import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q7a implements w56 {
    public static final q7a a;
    private static final nyc descriptor;

    static {
        q7a q7aVar = new q7a();
        a = q7aVar;
        gia giaVar = new gia("net.xmind.donut.common.track.PendingSignUp", q7aVar, 6);
        giaVar.k("uid", false);
        giaVar.k("properties", false);
        giaVar.k("occurredAtMillis", false);
        giaVar.k("insertId", false);
        giaVar.k("mixpanelDeviceId", true);
        giaVar.k("pendingDestinations", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        s7a s7aVar = (s7a) obj;
        s7aVar.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        lw7[] lw7VarArr = s7a.g;
        String str = s7aVar.a;
        Set set = s7aVar.f;
        String str2 = s7aVar.e;
        ag2VarC.w(nycVar, 0, str);
        ag2VarC.p(nycVar, 1, (xn7) lw7VarArr[1].getValue(), s7aVar.b);
        ag2VarC.k(nycVar, 2, s7aVar.c);
        ag2VarC.w(nycVar, 3, s7aVar.d);
        if (ag2VarC.g(nycVar) || str2 != null) {
            ag2VarC.A(nycVar, 4, p4e.a, str2);
        }
        if (ag2VarC.g(nycVar) || !pa7.t(set, s72.o1(vhd.c))) {
            ag2VarC.p(nycVar, 5, (xn7) lw7VarArr[5].getValue(), set);
        }
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = s7a.g;
        Object obj = null;
        int i = 0;
        String strO = null;
        Map map = null;
        String strO2 = null;
        String str = null;
        long jD = 0;
        boolean z = true;
        Set set = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            switch (iJ) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strO = zf2VarC.o(nycVar, 0);
                    i |= 1;
                    break;
                case 1:
                    map = (Map) zf2VarC.s(nycVar, 1, (xn7) lw7VarArr[1].getValue(), map);
                    i |= 2;
                    break;
                case 2:
                    jD = zf2VarC.D(nycVar, 2);
                    i |= 4;
                    break;
                case 3:
                    strO2 = zf2VarC.o(nycVar, 3);
                    i |= 8;
                    break;
                case 4:
                    str = (String) zf2VarC.y(nycVar, 4, p4e.a, str);
                    i |= 16;
                    break;
                case 5:
                    set = (Set) zf2VarC.s(nycVar, 5, (xn7) lw7VarArr[5].getValue(), set);
                    i |= 32;
                    break;
                default:
                    s8f.f(iJ);
                    return obj;
            }
            obj = null;
        }
        zf2VarC.b(nycVar);
        return new s7a(i, strO, map, jD, strO2, str, set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = s7a.g;
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, lw7VarArr[1].getValue(), eg8.a, p4eVar, t72.F(p4eVar), lw7VarArr[5].getValue()};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
