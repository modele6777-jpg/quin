package defpackage;

import ai.askquin.data.quickdecision.QuickDecisionAnswer;
import ai.askquin.data.quickdecision.QuickDecisionCard;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c6b implements w56 {
    public static final c6b a;
    private static final nyc descriptor;

    static {
        c6b c6bVar = new c6b();
        a = c6bVar;
        gia giaVar = new gia("ai.askquin.data.quickdecision.QuickDecisionCard", c6bVar, 4);
        giaVar.k("cardKey", false);
        giaVar.k("answer", false);
        giaVar.k("tagline", false);
        giaVar.k("reading", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        QuickDecisionCard quickDecisionCard = (QuickDecisionCard) obj;
        quickDecisionCard.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        QuickDecisionCard.write$Self$Quin_conversation_gpRelease(quickDecisionCard, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = QuickDecisionCard.$childSerializers;
        boolean z = true;
        int i = 0;
        String strO = null;
        QuickDecisionAnswer quickDecisionAnswer = null;
        String strO2 = null;
        String strO3 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                strO = zf2VarC.o(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                quickDecisionAnswer = (QuickDecisionAnswer) zf2VarC.s(nycVar, 1, (xn7) lw7VarArr[1].getValue(), quickDecisionAnswer);
                i |= 2;
            } else if (iJ == 2) {
                strO2 = zf2VarC.o(nycVar, 2);
                i |= 4;
            } else {
                if (iJ != 3) {
                    s8f.f(iJ);
                    return null;
                }
                strO3 = zf2VarC.o(nycVar, 3);
                i |= 8;
            }
        }
        zf2VarC.b(nycVar);
        return new QuickDecisionCard(i, strO, quickDecisionAnswer, strO2, strO3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = QuickDecisionCard.$childSerializers;
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, lw7VarArr[1].getValue(), p4eVar, p4eVar};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
