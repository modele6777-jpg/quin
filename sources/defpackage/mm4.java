package defpackage;

import ai.askquin.ui.draw.mixed.MixedDeckSnapshot;
import ai.askquin.ui.draw.model.DrawCardSaves;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mm4 implements w56 {
    public static final mm4 a;
    private static final nyc descriptor;

    static {
        mm4 mm4Var = new mm4();
        a = mm4Var;
        gia giaVar = new gia("ai.askquin.ui.draw.model.DrawCardSaves", mm4Var, 5);
        giaVar.k("chatId", false);
        giaVar.k("patterns", false);
        giaVar.k("choices", false);
        giaVar.k("drawnIndexes", false);
        giaVar.k("mixedDeck", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        DrawCardSaves drawCardSaves = (DrawCardSaves) obj;
        drawCardSaves.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        DrawCardSaves.write$Self$Quin_conversation_gpRelease(drawCardSaves, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = DrawCardSaves.$childSerializers;
        boolean z = true;
        int i = 0;
        String strO = null;
        List list = null;
        List list2 = null;
        List list3 = null;
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
                list3 = (List) zf2VarC.s(nycVar, 3, (xn7) lw7VarArr[3].getValue(), list3);
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
        return new DrawCardSaves(i, strO, list, list2, list3, mixedDeckSnapshot, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = DrawCardSaves.$childSerializers;
        return new xn7[]{p4e.a, lw7VarArr[1].getValue(), lw7VarArr[2].getValue(), lw7VarArr[3].getValue(), t72.F(hx8.a)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
