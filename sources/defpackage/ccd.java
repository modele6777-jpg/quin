package defpackage;

import ai.askquin.ui.draw.mixed.MixedDeckSnapshot;
import ai.askquin.ui.share.SharedDivination;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ccd implements w56 {
    public static final ccd a;
    private static final nyc descriptor;

    static {
        ccd ccdVar = new ccd();
        a = ccdVar;
        gia giaVar = new gia("ai.askquin.ui.share.SharedDivination", ccdVar, 7);
        giaVar.k("divinationId", false);
        giaVar.k("question", false);
        giaVar.k("content", false);
        giaVar.k("cards", false);
        giaVar.k("extraCards", true);
        giaVar.k("followUpEntries", true);
        giaVar.k("mixedDeck", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        SharedDivination sharedDivination = (SharedDivination) obj;
        sharedDivination.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        SharedDivination.write$Self$Quin_conversation_gpRelease(sharedDivination, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = SharedDivination.$childSerializers;
        Object obj = null;
        boolean z = true;
        int i = 0;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        MixedDeckSnapshot mixedDeckSnapshot = null;
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
                    strO3 = zf2VarC.o(nycVar, 2);
                    i |= 4;
                    break;
                case 3:
                    list = (List) zf2VarC.s(nycVar, 3, (xn7) lw7VarArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    list2 = (List) zf2VarC.s(nycVar, 4, (xn7) lw7VarArr[4].getValue(), list2);
                    i |= 16;
                    break;
                case 5:
                    list3 = (List) zf2VarC.s(nycVar, 5, (xn7) lw7VarArr[5].getValue(), list3);
                    i |= 32;
                    break;
                case 6:
                    mixedDeckSnapshot = (MixedDeckSnapshot) zf2VarC.y(nycVar, 6, hx8.a, mixedDeckSnapshot);
                    i |= 64;
                    break;
                default:
                    s8f.f(iJ);
                    return obj;
            }
            obj = null;
        }
        zf2VarC.b(nycVar);
        return new SharedDivination(i, strO, strO2, strO3, list, list2, list3, mixedDeckSnapshot, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = SharedDivination.$childSerializers;
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, p4eVar, p4eVar, lw7VarArr[3].getValue(), lw7VarArr[4].getValue(), lw7VarArr[5].getValue(), t72.F(hx8.a)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
