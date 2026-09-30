package defpackage;

import tech.chatmind.api.Period;
import tech.chatmind.api.PeriodUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o8a implements w56 {
    public static final o8a a;
    private static final nyc descriptor;

    static {
        o8a o8aVar = new o8a();
        a = o8aVar;
        gia giaVar = new gia("tech.chatmind.api.Period", o8aVar, 2);
        giaVar.k("count", false);
        giaVar.k("unit", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        Period period = (Period) obj;
        period.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        Period.write$Self$Quin_core_base_api_release(period, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = Period.$childSerializers;
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        Integer num = null;
        PeriodUnit periodUnit = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                num = (Integer) zf2VarC.y(nycVar, 0, c77.a, num);
                i |= 1;
            } else {
                if (iJ != 1) {
                    s8f.f(iJ);
                    return null;
                }
                periodUnit = (PeriodUnit) zf2VarC.y(nycVar, 1, (xn7) lw7VarArr[1].getValue(), periodUnit);
                i |= 2;
            }
        }
        zf2VarC.b(nycVar);
        return new Period(i, num, periodUnit, xycVar);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{t72.F(c77.a), t72.F((xn7) Period.$childSerializers[1].getValue())};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
