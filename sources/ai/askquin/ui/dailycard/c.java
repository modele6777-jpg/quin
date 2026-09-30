package ai.askquin.ui.dailycard;

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
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements w56 {
    public static final c a;
    private static final nyc descriptor;

    static {
        c cVar = new c();
        a = cVar;
        gia giaVar = new gia("ai.askquin.ui.dailycard.DailyCardShareRoute", cVar, 10);
        giaVar.k("date", false);
        giaVar.k("affirmation", false);
        giaVar.k("cardType", false);
        giaVar.k("isReversed", false);
        giaVar.k("cardDescription", false);
        giaVar.k("explain", false);
        giaVar.k("dos", true);
        giaVar.k("donts", true);
        giaVar.k("skinName", true);
        giaVar.k("source", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        DailyCardShareRoute dailyCardShareRoute = (DailyCardShareRoute) obj;
        dailyCardShareRoute.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        DailyCardShareRoute.write$Self$Quin_conversation_gpRelease(dailyCardShareRoute, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = DailyCardShareRoute.$childSerializers;
        String str = null;
        boolean z = true;
        List list = null;
        int i = 0;
        String strO = null;
        String strO2 = null;
        TarotCardType tarotCardType = null;
        boolean z2 = false;
        String strO3 = null;
        String str2 = null;
        List list2 = null;
        String strO4 = null;
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
                    strO2 = zf2VarC.o(nycVar, 1);
                    i |= 2;
                    break;
                case 2:
                    tarotCardType = (TarotCardType) zf2VarC.s(nycVar, 2, (xn7) lw7VarArr[2].getValue(), tarotCardType);
                    i |= 4;
                    break;
                case 3:
                    z2 = zf2VarC.z(nycVar, 3);
                    i |= 8;
                    break;
                case 4:
                    strO3 = zf2VarC.o(nycVar, 4);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) zf2VarC.y(nycVar, 5, p4e.a, str2);
                    i |= 32;
                    break;
                case 6:
                    list2 = (List) zf2VarC.s(nycVar, 6, (xn7) lw7VarArr[6].getValue(), list2);
                    i |= 64;
                    break;
                case 7:
                    list = (List) zf2VarC.s(nycVar, 7, (xn7) lw7VarArr[7].getValue(), list);
                    i |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    break;
                case 8:
                    str = (String) zf2VarC.y(nycVar, 8, p4e.a, str);
                    i |= 256;
                    break;
                case 9:
                    strO4 = zf2VarC.o(nycVar, 9);
                    i |= 512;
                    break;
                default:
                    s8f.f(iJ);
                    return null;
            }
        }
        zf2VarC.b(nycVar);
        return new DailyCardShareRoute(i, strO, strO2, tarotCardType, z2, strO3, str2, list2, list, str, strO4, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = DailyCardShareRoute.$childSerializers;
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, p4eVar, lw7VarArr[2].getValue(), g11.a, p4eVar, t72.F(p4eVar), lw7VarArr[6].getValue(), lw7VarArr[7].getValue(), t72.F(p4eVar), p4eVar};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
