package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;
import tech.chatmind.api.TarotCardInfo;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xhe implements w56 {
    public static final xhe a;
    private static final nyc descriptor;

    static {
        xhe xheVar = new xhe();
        a = xheVar;
        gia giaVar = new gia("tech.chatmind.api.TarotCardInfo", xheVar, 11);
        giaVar.k("cardKey", false);
        giaVar.k("englishName", false);
        giaVar.k("name", false);
        giaVar.k("element", true);
        giaVar.k("planet", true);
        giaVar.k("zodiac", true);
        giaVar.k("keywords", true);
        giaVar.k("uprightKeywords", true);
        giaVar.k("reversedKeywords", true);
        giaVar.k("meaning", true);
        giaVar.k("description", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        TarotCardInfo tarotCardInfo = (TarotCardInfo) obj;
        tarotCardInfo.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        TarotCardInfo.write$Self$Quin_core_base_api_release(tarotCardInfo, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = TarotCardInfo.$childSerializers;
        List list = null;
        boolean z = true;
        List list2 = null;
        int i = 0;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list3 = null;
        String strO4 = null;
        String strO5 = null;
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
                    strO3 = zf2VarC.o(nycVar, 2);
                    i |= 4;
                    break;
                case 3:
                    str = (String) zf2VarC.y(nycVar, 3, p4e.a, str);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) zf2VarC.y(nycVar, 4, p4e.a, str2);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) zf2VarC.y(nycVar, 5, p4e.a, str3);
                    i |= 32;
                    break;
                case 6:
                    list3 = (List) zf2VarC.s(nycVar, 6, (xn7) lw7VarArr[6].getValue(), list3);
                    i |= 64;
                    break;
                case 7:
                    list2 = (List) zf2VarC.s(nycVar, 7, (xn7) lw7VarArr[7].getValue(), list2);
                    i |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    break;
                case 8:
                    list = (List) zf2VarC.s(nycVar, 8, (xn7) lw7VarArr[8].getValue(), list);
                    i |= 256;
                    break;
                case 9:
                    strO4 = zf2VarC.o(nycVar, 9);
                    i |= 512;
                    break;
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    strO5 = zf2VarC.o(nycVar, 10);
                    i |= UserMetadata.MAX_ATTRIBUTE_SIZE;
                    break;
                default:
                    s8f.f(iJ);
                    return null;
            }
        }
        zf2VarC.b(nycVar);
        return new TarotCardInfo(i, strO, strO2, strO3, str, str2, str3, list3, list2, list, strO4, strO5, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = TarotCardInfo.$childSerializers;
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, p4eVar, p4eVar, t72.F(p4eVar), t72.F(p4eVar), t72.F(p4eVar), lw7VarArr[6].getValue(), lw7VarArr[7].getValue(), lw7VarArr[8].getValue(), p4eVar, p4eVar};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
