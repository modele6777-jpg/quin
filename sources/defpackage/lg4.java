package defpackage;

import java.util.List;
import tech.chatmind.api.annual.model.DomainContent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lg4 implements w56 {
    public static final lg4 a;
    private static final nyc descriptor;

    static {
        lg4 lg4Var = new lg4();
        a = lg4Var;
        gia giaVar = new gia("tech.chatmind.api.annual.model.DomainContent", lg4Var, 5);
        giaVar.k("annualLuckItem", false);
        giaVar.k("annualSummary", false);
        giaVar.k("annualSummaryHighlight", false);
        giaVar.k("domainReports", false);
        giaVar.k("domainSummary", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        DomainContent domainContent = (DomainContent) obj;
        domainContent.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        DomainContent.write$Self$Quin_core_base_api_release(domainContent, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = DomainContent.$childSerializers;
        boolean z = true;
        int i = 0;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        List list = null;
        String strO4 = null;
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
                strO3 = zf2VarC.o(nycVar, 2);
                i |= 4;
            } else if (iJ == 3) {
                list = (List) zf2VarC.s(nycVar, 3, (xn7) lw7VarArr[3].getValue(), list);
                i |= 8;
            } else {
                if (iJ != 4) {
                    s8f.f(iJ);
                    return null;
                }
                strO4 = zf2VarC.o(nycVar, 4);
                i |= 16;
            }
        }
        zf2VarC.b(nycVar);
        return new DomainContent(i, strO, strO2, strO3, list, strO4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = DomainContent.$childSerializers;
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, p4eVar, p4eVar, lw7VarArr[3].getValue(), p4eVar};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
