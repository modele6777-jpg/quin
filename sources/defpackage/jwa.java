package defpackage;

import java.util.List;
import tech.chatmind.api.personality.ProfessionSection;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jwa implements w56 {
    public static final jwa a;
    private static final nyc descriptor;

    static {
        jwa jwaVar = new jwa();
        a = jwaVar;
        gia giaVar = new gia("tech.chatmind.api.personality.ProfessionSection", jwaVar, 2);
        giaVar.k("title", false);
        giaVar.k("list", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        ProfessionSection professionSection = (ProfessionSection) obj;
        professionSection.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        ProfessionSection.write$Self$Quin_core_base_api_release(professionSection, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = ProfessionSection.$childSerializers;
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        String strO = null;
        List list = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                strO = zf2VarC.o(nycVar, 0);
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
        return new ProfessionSection(i, strO, list, xycVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{p4e.a, ProfessionSection.$childSerializers[1].getValue()};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
