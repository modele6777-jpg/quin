package defpackage;

import java.util.List;
import tech.chatmind.api.annual.model.AnnualLuckResponse;
import tech.chatmind.api.annual.model.DomainContent;
import tech.chatmind.api.annual.model.MonthlyContent;
import tech.chatmind.api.annual.model.UserPostContent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u30 implements w56 {
    public static final u30 a;
    private static final nyc descriptor;

    static {
        u30 u30Var = new u30();
        a = u30Var;
        gia giaVar = new gia("tech.chatmind.api.annual.model.AnnualLuckResponse", u30Var, 6);
        giaVar.k("domainsCards", false);
        giaVar.k("monthlyCards", false);
        giaVar.k("status", false);
        giaVar.k("step1", true);
        giaVar.k("step2", true);
        giaVar.k("user", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        AnnualLuckResponse annualLuckResponse = (AnnualLuckResponse) obj;
        annualLuckResponse.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        AnnualLuckResponse.write$Self$Quin_core_base_api_release(annualLuckResponse, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = AnnualLuckResponse.$childSerializers;
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        String strO = null;
        MonthlyContent monthlyContent = null;
        DomainContent domainContent = null;
        UserPostContent userPostContent = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            switch (iJ) {
                case -1:
                    z = false;
                    break;
                case 0:
                    list = (List) zf2VarC.y(nycVar, 0, (xn7) lw7VarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    list2 = (List) zf2VarC.y(nycVar, 1, (xn7) lw7VarArr[1].getValue(), list2);
                    i |= 2;
                    break;
                case 2:
                    strO = zf2VarC.o(nycVar, 2);
                    i |= 4;
                    break;
                case 3:
                    monthlyContent = (MonthlyContent) zf2VarC.y(nycVar, 3, k19.a, monthlyContent);
                    i |= 8;
                    break;
                case 4:
                    domainContent = (DomainContent) zf2VarC.y(nycVar, 4, lg4.a, domainContent);
                    i |= 16;
                    break;
                case 5:
                    userPostContent = (UserPostContent) zf2VarC.y(nycVar, 5, vnf.a, userPostContent);
                    i |= 32;
                    break;
                default:
                    s8f.f(iJ);
                    return null;
            }
        }
        zf2VarC.b(nycVar);
        return new AnnualLuckResponse(i, list, list2, strO, monthlyContent, domainContent, userPostContent, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = AnnualLuckResponse.$childSerializers;
        return new xn7[]{t72.F((xn7) lw7VarArr[0].getValue()), t72.F((xn7) lw7VarArr[1].getValue()), p4e.a, t72.F(k19.a), t72.F(lg4.a), t72.F(vnf.a)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
