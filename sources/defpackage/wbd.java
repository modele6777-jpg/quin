package defpackage;

import ai.askquin.ui.share.SharedConversationEntry;
import ai.askquin.ui.share.SharedConversationEntryType;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wbd implements w56 {
    public static final wbd a;
    private static final nyc descriptor;

    static {
        wbd wbdVar = new wbd();
        a = wbdVar;
        gia giaVar = new gia("ai.askquin.ui.share.SharedConversationEntry", wbdVar, 3);
        giaVar.k("type", false);
        giaVar.k("text", false);
        giaVar.k("cards", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        SharedConversationEntry sharedConversationEntry = (SharedConversationEntry) obj;
        sharedConversationEntry.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        SharedConversationEntry.write$Self$Quin_conversation_gpRelease(sharedConversationEntry, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = SharedConversationEntry.$childSerializers;
        boolean z = true;
        int i = 0;
        SharedConversationEntryType sharedConversationEntryType = null;
        String strO = null;
        List list = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                sharedConversationEntryType = (SharedConversationEntryType) zf2VarC.s(nycVar, 0, (xn7) lw7VarArr[0].getValue(), sharedConversationEntryType);
                i |= 1;
            } else if (iJ == 1) {
                strO = zf2VarC.o(nycVar, 1);
                i |= 2;
            } else {
                if (iJ != 2) {
                    s8f.f(iJ);
                    return null;
                }
                list = (List) zf2VarC.s(nycVar, 2, (xn7) lw7VarArr[2].getValue(), list);
                i |= 4;
            }
        }
        zf2VarC.b(nycVar);
        return new SharedConversationEntry(i, sharedConversationEntryType, strO, list, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = SharedConversationEntry.$childSerializers;
        return new xn7[]{lw7VarArr[0].getValue(), p4e.a, lw7VarArr[2].getValue()};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
