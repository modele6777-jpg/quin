package defpackage;

import ai.askquin.ui.draw.model.CardBoxState;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kp1 implements w56 {
    public static final kp1 a;
    private static final nyc descriptor;

    static {
        kp1 kp1Var = new kp1();
        a = kp1Var;
        gia giaVar = new gia("ai.askquin.ui.draw.model.CardBoxState", kp1Var, 4);
        giaVar.k("tarotCard", true);
        giaVar.k("shouldShareAnimation", true);
        giaVar.k("highlights", true);
        giaVar.k("boxName", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        CardBoxState cardBoxState = (CardBoxState) obj;
        cardBoxState.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        CardBoxState.write$Self$Quin_conversation_gpRelease(cardBoxState, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        TarotCardChoice tarotCardChoice = null;
        String str = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                tarotCardChoice = (TarotCardChoice) zf2VarC.y(nycVar, 0, rhe.a, tarotCardChoice);
                i |= 1;
            } else if (iJ == 1) {
                z2 = zf2VarC.z(nycVar, 1);
                i |= 2;
            } else if (iJ == 2) {
                z3 = zf2VarC.z(nycVar, 2);
                i |= 4;
            } else {
                if (iJ != 3) {
                    s8f.f(iJ);
                    return null;
                }
                str = (String) zf2VarC.y(nycVar, 3, p4e.a, str);
                i |= 8;
            }
        }
        zf2VarC.b(nycVar);
        return new CardBoxState(i, tarotCardChoice, z2, z3, str, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        xn7 xn7VarF = t72.F(rhe.a);
        xn7 xn7VarF2 = t72.F(p4e.a);
        g11 g11Var = g11.a;
        return new xn7[]{xn7VarF, g11Var, g11Var, xn7VarF2};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
