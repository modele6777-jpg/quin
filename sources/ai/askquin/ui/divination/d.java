package ai.askquin.ui.divination;

import ai.askquin.ui.conversation.dialogue.NewReadingState;
import defpackage.ag2;
import defpackage.ev4;
import defpackage.gia;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.om3;
import defpackage.p4e;
import defpackage.s8f;
import defpackage.t72;
import defpackage.w56;
import defpackage.xn7;
import defpackage.zf2;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements w56 {
    public static final d a;
    private static final nyc descriptor;

    static {
        d dVar = new d();
        a = dVar;
        gia giaVar = new gia("ai.askquin.ui.divination.OverviewItem.NewReadingItem", dVar, 4);
        giaVar.k("messageId", false);
        giaVar.k("question", false);
        giaVar.k("childReadingId", false);
        giaVar.k("state", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        OverviewItem.NewReadingItem newReadingItem = (OverviewItem.NewReadingItem) obj;
        newReadingItem.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        OverviewItem.NewReadingItem.write$Self$Quin_conversation_gpRelease(newReadingItem, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = OverviewItem.NewReadingItem.$childSerializers;
        boolean z = true;
        int i = 0;
        String strO = null;
        String strO2 = null;
        String str = null;
        NewReadingState newReadingState = null;
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
                str = (String) zf2VarC.y(nycVar, 2, p4e.a, str);
                i |= 4;
            } else {
                if (iJ != 3) {
                    s8f.f(iJ);
                    return null;
                }
                newReadingState = (NewReadingState) zf2VarC.s(nycVar, 3, (xn7) lw7VarArr[3].getValue(), newReadingState);
                i |= 8;
            }
        }
        zf2VarC.b(nycVar);
        return new OverviewItem.NewReadingItem(i, strO, strO2, str, newReadingState, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = OverviewItem.NewReadingItem.$childSerializers;
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, p4eVar, t72.F(p4eVar), lw7VarArr[3].getValue()};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
