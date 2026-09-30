package defpackage;

import java.util.List;
import tech.chatmind.api.annual.model.MonthlyReportRequestBody;
import tech.chatmind.api.annual.model.UserPostContent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i29 implements w56 {
    public static final i29 a;
    private static final nyc descriptor;

    static {
        i29 i29Var = new i29();
        a = i29Var;
        gia giaVar = new gia("tech.chatmind.api.annual.model.MonthlyReportRequestBody", i29Var, 2);
        giaVar.k("user", false);
        giaVar.k("monthlyCards", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        MonthlyReportRequestBody monthlyReportRequestBody = (MonthlyReportRequestBody) obj;
        monthlyReportRequestBody.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        MonthlyReportRequestBody.write$Self$Quin_core_base_api_release(monthlyReportRequestBody, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = MonthlyReportRequestBody.$childSerializers;
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        UserPostContent userPostContent = null;
        List list = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                userPostContent = (UserPostContent) zf2VarC.s(nycVar, 0, vnf.a, userPostContent);
                i |= 1;
            } else {
                if (iJ != 1) {
                    s8f.f(iJ);
                    return null;
                }
                list = (List) zf2VarC.s(nycVar, 1, (xn7) lw7VarArr[1].getValue(), list);
                i |= 2;
            }
        }
        zf2VarC.b(nycVar);
        return new MonthlyReportRequestBody(i, userPostContent, list, xycVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{vnf.a, MonthlyReportRequestBody.$childSerializers[1].getValue()};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
