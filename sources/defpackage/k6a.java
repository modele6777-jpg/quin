package defpackage;

import ai.askquin.ui.persistence.query.PendingClarifyingCardSubmission;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k6a implements w56 {
    public static final k6a a;
    private static final nyc descriptor;

    static {
        k6a k6aVar = new k6a();
        a = k6aVar;
        gia giaVar = new gia("ai.askquin.ui.persistence.query.PendingClarifyingCardSubmission", k6aVar, 3);
        giaVar.k("requestMessageId", false);
        giaVar.k("card", false);
        giaVar.k("wheelIndex", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        PendingClarifyingCardSubmission pendingClarifyingCardSubmission = (PendingClarifyingCardSubmission) obj;
        pendingClarifyingCardSubmission.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        PendingClarifyingCardSubmission.write$Self$Quin_conversation_gpRelease(pendingClarifyingCardSubmission, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        boolean z = true;
        int i = 0;
        int iT = 0;
        String strO = null;
        TarotCardChoice tarotCardChoice = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                strO = zf2VarC.o(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                tarotCardChoice = (TarotCardChoice) zf2VarC.s(nycVar, 1, rhe.a, tarotCardChoice);
                i |= 2;
            } else {
                if (iJ != 2) {
                    s8f.f(iJ);
                    return null;
                }
                iT = zf2VarC.t(nycVar, 2);
                i |= 4;
            }
        }
        zf2VarC.b(nycVar);
        return new PendingClarifyingCardSubmission(i, strO, tarotCardChoice, iT, null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{p4e.a, rhe.a, c77.a};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
