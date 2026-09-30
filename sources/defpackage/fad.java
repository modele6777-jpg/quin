package defpackage;

import ai.askquin.ui.draw.mixed.MixedDeckSnapshot;
import ai.askquin.ui.share.SharePayload$DrawnCards;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fad implements w56 {
    public static final fad a;
    private static final nyc descriptor;

    static {
        fad fadVar = new fad();
        a = fadVar;
        gia giaVar = new gia("ai.askquin.ui.share.SharePayload.DrawnCards", fadVar, 5);
        giaVar.k("divinationId", false);
        giaVar.k("cards", false);
        giaVar.k("patternData", false);
        giaVar.k("skinType", false);
        giaVar.k("mixedDeck", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        SharePayload$DrawnCards sharePayload$DrawnCards = (SharePayload$DrawnCards) obj;
        sharePayload$DrawnCards.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        SharePayload$DrawnCards.write$Self$Quin_conversation_gpRelease(sharePayload$DrawnCards, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = SharePayload$DrawnCards.$childSerializers;
        boolean z = true;
        int i = 0;
        String strO = null;
        List list = null;
        List list2 = null;
        String str = null;
        MixedDeckSnapshot mixedDeckSnapshot = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                strO = zf2VarC.o(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                list = (List) zf2VarC.s(nycVar, 1, (xn7) lw7VarArr[1].getValue(), list);
                i |= 2;
            } else if (iJ == 2) {
                list2 = (List) zf2VarC.s(nycVar, 2, (xn7) lw7VarArr[2].getValue(), list2);
                i |= 4;
            } else if (iJ == 3) {
                str = (String) zf2VarC.y(nycVar, 3, p4e.a, str);
                i |= 8;
            } else {
                if (iJ != 4) {
                    s8f.f(iJ);
                    return null;
                }
                mixedDeckSnapshot = (MixedDeckSnapshot) zf2VarC.y(nycVar, 4, hx8.a, mixedDeckSnapshot);
                i |= 16;
            }
        }
        zf2VarC.b(nycVar);
        return new SharePayload$DrawnCards(i, strO, list, list2, str, mixedDeckSnapshot, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = SharePayload$DrawnCards.$childSerializers;
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, lw7VarArr[1].getValue(), lw7VarArr[2].getValue(), t72.F(p4eVar), t72.F(hx8.a)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
