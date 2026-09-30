package defpackage;

import ai.askquin.model.DailyFortuneDirectionContent;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f73 implements w56 {
    public static final f73 a;
    private static final nyc descriptor;

    static {
        f73 f73Var = new f73();
        a = f73Var;
        gia giaVar = new gia("ai.askquin.model.DailyFortuneDirectionContent", f73Var, 5);
        giaVar.k("affirmation", false);
        giaVar.k("reading", false);
        giaVar.k("questions", false);
        giaVar.k("dos", true);
        giaVar.k("donts", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        DailyFortuneDirectionContent dailyFortuneDirectionContent = (DailyFortuneDirectionContent) obj;
        dailyFortuneDirectionContent.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        DailyFortuneDirectionContent.write$Self$Quin_core_model(dailyFortuneDirectionContent, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = DailyFortuneDirectionContent.$childSerializers;
        boolean z = true;
        int i = 0;
        String strO = null;
        String strO2 = null;
        List list = null;
        List list2 = null;
        List list3 = null;
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
                list = (List) zf2VarC.s(nycVar, 2, (xn7) lw7VarArr[2].getValue(), list);
                i |= 4;
            } else if (iJ == 3) {
                list2 = (List) zf2VarC.s(nycVar, 3, (xn7) lw7VarArr[3].getValue(), list2);
                i |= 8;
            } else {
                if (iJ != 4) {
                    s8f.f(iJ);
                    return null;
                }
                list3 = (List) zf2VarC.s(nycVar, 4, (xn7) lw7VarArr[4].getValue(), list3);
                i |= 16;
            }
        }
        zf2VarC.b(nycVar);
        return new DailyFortuneDirectionContent(i, strO, strO2, list, list2, list3, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = DailyFortuneDirectionContent.$childSerializers;
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, p4eVar, lw7VarArr[2].getValue(), lw7VarArr[3].getValue(), lw7VarArr[4].getValue()};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
