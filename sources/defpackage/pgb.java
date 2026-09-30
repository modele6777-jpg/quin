package defpackage;

import java.util.List;
import tech.chatmind.api.ReadingResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pgb implements w56 {
    public static final pgb a;
    private static final nyc descriptor;

    static {
        pgb pgbVar = new pgb();
        a = pgbVar;
        gia giaVar = new gia("tech.chatmind.api.ReadingResponse", pgbVar, 7);
        giaVar.k("isCanTarot", false);
        giaVar.k("isSuitable", false);
        giaVar.k("isAdditionalInfoNeeded", false);
        giaVar.k("additionalInfoQuestion", false);
        giaVar.k("suggestions", false);
        giaVar.k("userQuestionRecommendations", false);
        giaVar.k("needsRevision", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        ReadingResponse readingResponse = (ReadingResponse) obj;
        readingResponse.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        ReadingResponse.write$Self$Quin_core_base_api_release(readingResponse, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = ReadingResponse.$childSerializers;
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        String str = null;
        String str2 = null;
        List list = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            switch (iJ) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    z2 = zf2VarC.z(nycVar, 0);
                    i |= 1;
                    break;
                case 1:
                    z3 = zf2VarC.z(nycVar, 1);
                    i |= 2;
                    break;
                case 2:
                    z4 = zf2VarC.z(nycVar, 2);
                    i |= 4;
                    break;
                case 3:
                    str = (String) zf2VarC.y(nycVar, 3, p4e.a, str);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) zf2VarC.y(nycVar, 4, p4e.a, str2);
                    i |= 16;
                    break;
                case 5:
                    list = (List) zf2VarC.y(nycVar, 5, (xn7) lw7VarArr[5].getValue(), list);
                    i |= 32;
                    break;
                case 6:
                    z5 = zf2VarC.z(nycVar, 6);
                    i |= 64;
                    continue;
                default:
                    s8f.f(iJ);
                    return obj;
            }
            obj = null;
        }
        zf2VarC.b(nycVar);
        return new ReadingResponse(i, z2, z3, z4, str, str2, list, z5, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = ReadingResponse.$childSerializers;
        p4e p4eVar = p4e.a;
        xn7 xn7VarF = t72.F(p4eVar);
        xn7 xn7VarF2 = t72.F(p4eVar);
        xn7 xn7VarF3 = t72.F((xn7) lw7VarArr[5].getValue());
        g11 g11Var = g11.a;
        return new xn7[]{g11Var, g11Var, g11Var, xn7VarF, xn7VarF2, xn7VarF3, g11Var};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
