package defpackage;

import java.util.List;
import tech.chatmind.api.annual.model.MonthlyContent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k19 implements w56 {
    public static final k19 a;
    private static final nyc descriptor;

    static {
        k19 k19Var = new k19();
        a = k19Var;
        gia giaVar = new gia("tech.chatmind.api.annual.model.MonthlyContent", k19Var, 3);
        giaVar.k("monthlyReports", false);
        giaVar.k("scoreTrendSummary", false);
        giaVar.k("summary", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        MonthlyContent monthlyContent = (MonthlyContent) obj;
        monthlyContent.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        MonthlyContent.write$Self$Quin_core_base_api_release(monthlyContent, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = MonthlyContent.$childSerializers;
        boolean z = true;
        int i = 0;
        List list = null;
        String strO = null;
        String strO2 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                list = (List) zf2VarC.s(nycVar, 0, (xn7) lw7VarArr[0].getValue(), list);
                i |= 1;
            } else if (iJ == 1) {
                strO = zf2VarC.o(nycVar, 1);
                i |= 2;
            } else {
                if (iJ != 2) {
                    s8f.f(iJ);
                    return null;
                }
                strO2 = zf2VarC.o(nycVar, 2);
                i |= 4;
            }
        }
        zf2VarC.b(nycVar);
        return new MonthlyContent(i, list, strO, strO2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        return new xn7[]{MonthlyContent.$childSerializers[0].getValue(), p4eVar, p4eVar};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
