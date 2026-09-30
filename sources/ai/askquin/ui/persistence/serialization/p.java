package ai.askquin.ui.persistence.serialization;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.ag2;
import defpackage.ev4;
import defpackage.g11;
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
public final /* synthetic */ class p implements w56 {
    public static final p a;
    private static final nyc descriptor;

    static {
        p pVar = new p();
        a = pVar;
        gia giaVar = new gia("ai.askquin.ui.persistence.serialization.SerializableDivinationState.WaitConfirm", pVar, 9);
        giaVar.k("question", false);
        giaVar.k("isCanTarot", true);
        giaVar.k("editQuestion", true);
        giaVar.k("editQuestions", true);
        giaVar.k("isSuitable", true);
        giaVar.k("suggestions", true);
        giaVar.k("isAdditionalInfoNeeded", true);
        giaVar.k("additionalInfoQuestion", true);
        giaVar.k("needsRevision", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        SerializableDivinationState.WaitConfirm waitConfirm = (SerializableDivinationState.WaitConfirm) obj;
        waitConfirm.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        SerializableDivinationState.WaitConfirm.write$Self$Quin_conversation_gpRelease(waitConfirm, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = SerializableDivinationState.WaitConfirm.$childSerializers;
        Boolean bool = null;
        boolean z = true;
        String str = null;
        int i = 0;
        String strO = null;
        Boolean bool2 = null;
        String str2 = null;
        List list = null;
        Boolean bool3 = null;
        String str3 = null;
        Boolean bool4 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            switch (iJ) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strO = zf2VarC.o(nycVar, 0);
                    i |= 1;
                    break;
                case 1:
                    bool2 = (Boolean) zf2VarC.y(nycVar, 1, g11.a, bool2);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) zf2VarC.y(nycVar, 2, p4e.a, str2);
                    i |= 4;
                    break;
                case 3:
                    list = (List) zf2VarC.y(nycVar, 3, (xn7) lw7VarArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    bool3 = (Boolean) zf2VarC.y(nycVar, 4, g11.a, bool3);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) zf2VarC.y(nycVar, 5, p4e.a, str3);
                    i |= 32;
                    break;
                case 6:
                    bool4 = (Boolean) zf2VarC.y(nycVar, 6, g11.a, bool4);
                    i |= 64;
                    break;
                case 7:
                    str = (String) zf2VarC.y(nycVar, 7, p4e.a, str);
                    i |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    break;
                case 8:
                    bool = (Boolean) zf2VarC.y(nycVar, 8, g11.a, bool);
                    i |= 256;
                    break;
                default:
                    s8f.f(iJ);
                    return null;
            }
        }
        zf2VarC.b(nycVar);
        return new SerializableDivinationState.WaitConfirm(i, strO, bool2, str2, list, bool3, str3, bool4, str, bool, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = SerializableDivinationState.WaitConfirm.$childSerializers;
        p4e p4eVar = p4e.a;
        g11 g11Var = g11.a;
        return new xn7[]{p4eVar, t72.F(g11Var), t72.F(p4eVar), t72.F((xn7) lw7VarArr[3].getValue()), t72.F(g11Var), t72.F(p4eVar), t72.F(g11Var), t72.F(p4eVar), t72.F(g11Var)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
