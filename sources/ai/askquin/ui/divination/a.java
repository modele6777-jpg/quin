package ai.askquin.ui.divination;

import ai.askquin.ui.conversation.ClarifyingCardDrawActionState;
import ai.askquin.ui.conversation.ClarifyingCardSkipActionState;
import ai.askquin.ui.conversation.dialogue.ClarifyingCardState;
import defpackage.ag2;
import defpackage.ev4;
import defpackage.gia;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.om3;
import defpackage.p4e;
import defpackage.rhe;
import defpackage.s8f;
import defpackage.t72;
import defpackage.w56;
import defpackage.xn7;
import defpackage.zf2;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements w56 {
    public static final a a;
    private static final nyc descriptor;

    static {
        a aVar = new a();
        a = aVar;
        gia giaVar = new gia("ai.askquin.ui.divination.OverviewItem.ClarifyingCardItem", aVar, 7);
        giaVar.k("messageId", false);
        giaVar.k("label", false);
        giaVar.k("state", false);
        giaVar.k("card", false);
        giaVar.k("pendingCard", false);
        giaVar.k("drawActionState", false);
        giaVar.k("skipActionState", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        OverviewItem.ClarifyingCardItem clarifyingCardItem = (OverviewItem.ClarifyingCardItem) obj;
        clarifyingCardItem.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        OverviewItem.ClarifyingCardItem.write$Self$Quin_conversation_gpRelease(clarifyingCardItem, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = OverviewItem.ClarifyingCardItem.$childSerializers;
        Object obj = null;
        boolean z = true;
        int i = 0;
        String strO = null;
        String strO2 = null;
        ClarifyingCardState clarifyingCardState = null;
        TarotCardChoice tarotCardChoice = null;
        TarotCardChoice tarotCardChoice2 = null;
        ClarifyingCardDrawActionState clarifyingCardDrawActionState = null;
        ClarifyingCardSkipActionState clarifyingCardSkipActionState = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            switch (iJ) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strO = zf2VarC.o(nycVar, 0);
                    i |= 1;
                    break;
                case 1:
                    strO2 = zf2VarC.o(nycVar, 1);
                    i |= 2;
                    break;
                case 2:
                    clarifyingCardState = (ClarifyingCardState) zf2VarC.s(nycVar, 2, (xn7) lw7VarArr[2].getValue(), clarifyingCardState);
                    i |= 4;
                    break;
                case 3:
                    tarotCardChoice = (TarotCardChoice) zf2VarC.y(nycVar, 3, rhe.a, tarotCardChoice);
                    i |= 8;
                    break;
                case 4:
                    tarotCardChoice2 = (TarotCardChoice) zf2VarC.y(nycVar, 4, rhe.a, tarotCardChoice2);
                    i |= 16;
                    break;
                case 5:
                    clarifyingCardDrawActionState = (ClarifyingCardDrawActionState) zf2VarC.s(nycVar, 5, (xn7) lw7VarArr[5].getValue(), clarifyingCardDrawActionState);
                    i |= 32;
                    break;
                case 6:
                    clarifyingCardSkipActionState = (ClarifyingCardSkipActionState) zf2VarC.s(nycVar, 6, (xn7) lw7VarArr[6].getValue(), clarifyingCardSkipActionState);
                    i |= 64;
                    break;
                default:
                    s8f.f(iJ);
                    return obj;
            }
            obj = null;
        }
        zf2VarC.b(nycVar);
        return new OverviewItem.ClarifyingCardItem(i, strO, strO2, clarifyingCardState, tarotCardChoice, tarotCardChoice2, clarifyingCardDrawActionState, clarifyingCardSkipActionState, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = OverviewItem.ClarifyingCardItem.$childSerializers;
        p4e p4eVar = p4e.a;
        rhe rheVar = rhe.a;
        return new xn7[]{p4eVar, p4eVar, lw7VarArr[2].getValue(), t72.F(rheVar), t72.F(rheVar), lw7VarArr[5].getValue(), lw7VarArr[6].getValue()};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
