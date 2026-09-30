package defpackage;

import ai.askquin.ui.draw.mixed.MixedDeckSnapshot;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hx8 implements w56 {
    public static final hx8 a;
    private static final nyc descriptor;

    static {
        hx8 hx8Var = new hx8();
        a = hx8Var;
        gia giaVar = new gia("ai.askquin.ui.draw.mixed.MixedDeckSnapshot", hx8Var, 4);
        giaVar.k("readingId", false);
        giaVar.k("skinsByCard", false);
        giaVar.k("cardOrder", true);
        giaVar.k("version", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        MixedDeckSnapshot mixedDeckSnapshot = (MixedDeckSnapshot) obj;
        mixedDeckSnapshot.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        MixedDeckSnapshot.write$Self$Quin_conversation_gpRelease(mixedDeckSnapshot, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = MixedDeckSnapshot.$childSerializers;
        boolean z = true;
        int i = 0;
        int iT = 0;
        String strO = null;
        Map map = null;
        List list = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                strO = zf2VarC.o(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                map = (Map) zf2VarC.s(nycVar, 1, (xn7) lw7VarArr[1].getValue(), map);
                i |= 2;
            } else if (iJ == 2) {
                list = (List) zf2VarC.s(nycVar, 2, (xn7) lw7VarArr[2].getValue(), list);
                i |= 4;
            } else {
                if (iJ != 3) {
                    s8f.f(iJ);
                    return null;
                }
                iT = zf2VarC.t(nycVar, 3);
                i |= 8;
            }
        }
        zf2VarC.b(nycVar);
        return new MixedDeckSnapshot(i, strO, map, list, iT, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = MixedDeckSnapshot.$childSerializers;
        return new xn7[]{p4e.a, lw7VarArr[1].getValue(), lw7VarArr[2].getValue(), c77.a};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
