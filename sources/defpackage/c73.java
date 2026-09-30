package defpackage;

import ai.askquin.model.DailyFortuneContent;
import ai.askquin.model.DailyFortuneDirectionContent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c73 implements w56 {
    public static final c73 a;
    private static final nyc descriptor;

    static {
        c73 c73Var = new c73();
        a = c73Var;
        gia giaVar = new gia("ai.askquin.model.DailyFortuneContent", c73Var, 3);
        giaVar.k("card_key", false);
        giaVar.k("upright", false);
        giaVar.k("reversed", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        DailyFortuneContent dailyFortuneContent = (DailyFortuneContent) obj;
        dailyFortuneContent.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        DailyFortuneContent.write$Self$Quin_core_model(dailyFortuneContent, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        boolean z = true;
        int i = 0;
        String strO = null;
        DailyFortuneDirectionContent dailyFortuneDirectionContent = null;
        DailyFortuneDirectionContent dailyFortuneDirectionContent2 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                strO = zf2VarC.o(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                dailyFortuneDirectionContent = (DailyFortuneDirectionContent) zf2VarC.s(nycVar, 1, f73.a, dailyFortuneDirectionContent);
                i |= 2;
            } else {
                if (iJ != 2) {
                    s8f.f(iJ);
                    return null;
                }
                dailyFortuneDirectionContent2 = (DailyFortuneDirectionContent) zf2VarC.s(nycVar, 2, f73.a, dailyFortuneDirectionContent2);
                i |= 4;
            }
        }
        zf2VarC.b(nycVar);
        return new DailyFortuneContent(i, strO, dailyFortuneDirectionContent, dailyFortuneDirectionContent2, null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        f73 f73Var = f73.a;
        return new xn7[]{p4e.a, f73Var, f73Var};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
