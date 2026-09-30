package ai.askquin.ui.persistence.serialization;

import defpackage.ag2;
import defpackage.ev4;
import defpackage.f1d;
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
public final /* synthetic */ class d implements w56 {
    public static final d a;
    private static final nyc descriptor;

    static {
        d dVar = new d();
        a = dVar;
        gia giaVar = new gia("ai.askquin.ui.persistence.serialization.SerializableDivinationState.Analysis", dVar, 7);
        giaVar.k("question", false);
        giaVar.k("pattern", false);
        giaVar.k("patternData", false);
        giaVar.k("prev", false);
        giaVar.k("source", true);
        giaVar.k("aid", true);
        giaVar.k("spreadId", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        SerializableDivinationState.Analysis analysis = (SerializableDivinationState.Analysis) obj;
        analysis.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        SerializableDivinationState.Analysis.write$Self$Quin_conversation_gpRelease(analysis, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = SerializableDivinationState.Analysis.$childSerializers;
        Object obj = null;
        boolean z = true;
        int i = 0;
        String strO = null;
        String strO2 = null;
        List list = null;
        SerializableDivinationState.Patternable patternable = null;
        f1d f1dVar = null;
        String str = null;
        String str2 = null;
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
                    list = (List) zf2VarC.s(nycVar, 2, (xn7) lw7VarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    patternable = (SerializableDivinationState.Patternable) zf2VarC.s(nycVar, 3, (xn7) lw7VarArr[3].getValue(), patternable);
                    i |= 8;
                    break;
                case 4:
                    f1dVar = (f1d) zf2VarC.y(nycVar, 4, (xn7) lw7VarArr[4].getValue(), f1dVar);
                    i |= 16;
                    break;
                case 5:
                    str = (String) zf2VarC.y(nycVar, 5, p4e.a, str);
                    i |= 32;
                    break;
                case 6:
                    str2 = (String) zf2VarC.y(nycVar, 6, p4e.a, str2);
                    i |= 64;
                    break;
                default:
                    s8f.f(iJ);
                    return obj;
            }
            obj = null;
        }
        zf2VarC.b(nycVar);
        return new SerializableDivinationState.Analysis(i, strO, strO2, list, patternable, f1dVar, str, str2, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = SerializableDivinationState.Analysis.$childSerializers;
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, p4eVar, lw7VarArr[2].getValue(), lw7VarArr[3].getValue(), t72.F((xn7) lw7VarArr[4].getValue()), t72.F(p4eVar), t72.F(p4eVar)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
