package ai.askquin.ui.persistence.serialization;

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
import defpackage.xyc;
import defpackage.zf2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements w56 {
    public static final t a;
    private static final nyc descriptor;

    static {
        t tVar = new t();
        a = tVar;
        gia giaVar = new gia("ai.askquin.ui.persistence.serialization.SerializableDrawBeforeQuestion", tVar, 5);
        giaVar.k("origin", true);
        giaVar.k("spreadId", true);
        giaVar.k("patternData", false);
        giaVar.k("cards", false);
        giaVar.k("completedAt", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        SerializableDrawBeforeQuestion serializableDrawBeforeQuestion = (SerializableDrawBeforeQuestion) obj;
        serializableDrawBeforeQuestion.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        SerializableDrawBeforeQuestion.write$Self$Quin_conversation_gpRelease(serializableDrawBeforeQuestion, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = SerializableDrawBeforeQuestion.$childSerializers;
        boolean z = true;
        int i = 0;
        String strO = null;
        String str = null;
        List list = null;
        List list2 = null;
        String str2 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                strO = zf2VarC.o(nycVar, 0);
                i |= 1;
            } else if (iJ == 1) {
                str = (String) zf2VarC.y(nycVar, 1, p4e.a, str);
                i |= 2;
            } else if (iJ == 2) {
                list = (List) zf2VarC.s(nycVar, 2, (xn7) lw7VarArr[2].getValue(), list);
                i |= 4;
            } else if (iJ == 3) {
                list2 = (List) zf2VarC.s(nycVar, 3, (xn7) lw7VarArr[3].getValue(), list2);
                i |= 8;
            } else {
                if (iJ != 4) {
                    s8f.f(iJ);
                    return null;
                }
                str2 = (String) zf2VarC.y(nycVar, 4, p4e.a, str2);
                i |= 16;
            }
        }
        zf2VarC.b(nycVar);
        return new SerializableDrawBeforeQuestion(i, strO, str, list, list2, str2, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = SerializableDrawBeforeQuestion.$childSerializers;
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, t72.F(p4eVar), lw7VarArr[2].getValue(), lw7VarArr[3].getValue(), t72.F(p4eVar)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
