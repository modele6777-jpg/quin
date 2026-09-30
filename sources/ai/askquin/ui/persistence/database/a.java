package ai.askquin.ui.persistence.database;

import defpackage.ag2;
import defpackage.ev4;
import defpackage.g11;
import defpackage.gia;
import defpackage.nyc;
import defpackage.om3;
import defpackage.p4e;
import defpackage.s8f;
import defpackage.t72;
import defpackage.w56;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.zf2;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements w56 {
    public static final a a;
    private static final nyc descriptor;

    static {
        a aVar = new a();
        a = aVar;
        gia giaVar = new gia("ai.askquin.ui.persistence.database.TarotCardChoiceListConverter.PersistedSummaryCard", aVar, 4);
        giaVar.k("card", true);
        giaVar.k("isReversed", false);
        giaVar.k("tarotCardDesc", true);
        giaVar.k("skin", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        TarotCardChoiceListConverter$PersistedSummaryCard tarotCardChoiceListConverter$PersistedSummaryCard = (TarotCardChoiceListConverter$PersistedSummaryCard) obj;
        tarotCardChoiceListConverter$PersistedSummaryCard.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        TarotCardChoiceListConverter$PersistedSummaryCard.write$Self$Quin_conversation_gpRelease(tarotCardChoiceListConverter$PersistedSummaryCard, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                str = (String) zf2VarC.y(nycVar, 0, p4e.a, str);
                i |= 1;
            } else if (iJ == 1) {
                z2 = zf2VarC.z(nycVar, 1);
                i |= 2;
            } else if (iJ == 2) {
                str2 = (String) zf2VarC.y(nycVar, 2, p4e.a, str2);
                i |= 4;
            } else {
                if (iJ != 3) {
                    s8f.f(iJ);
                    return null;
                }
                str3 = (String) zf2VarC.y(nycVar, 3, p4e.a, str3);
                i |= 8;
            }
        }
        zf2VarC.b(nycVar);
        return new TarotCardChoiceListConverter$PersistedSummaryCard(i, str, z2, str2, str3, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        p4e p4eVar = p4e.a;
        return new xn7[]{t72.F(p4eVar), g11.a, t72.F(p4eVar), t72.F(p4eVar)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
