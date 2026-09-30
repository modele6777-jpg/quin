package defpackage;

import ai.askquin.model.CardAffirmationInfo;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hp1 implements w56 {
    public static final hp1 a;
    private static final nyc descriptor;

    static {
        hp1 hp1Var = new hp1();
        a = hp1Var;
        gia giaVar = new gia("ai.askquin.model.CardAffirmationInfo", hp1Var, 9);
        giaVar.k("card_affirmations_cn", false);
        giaVar.k("card_affirmations_en", false);
        giaVar.k("card_desc_cn", false);
        giaVar.k("card_desc_en", false);
        giaVar.k("card_key", false);
        giaVar.k("reversed_card_affirmations_cn", false);
        giaVar.k("reversed_card_affirmations_en", false);
        giaVar.k("reversed_card_desc_cn", false);
        giaVar.k("reversed_card_desc_en", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        CardAffirmationInfo cardAffirmationInfo = (CardAffirmationInfo) obj;
        cardAffirmationInfo.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        CardAffirmationInfo.write$Self$Quin_core_model(cardAffirmationInfo, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = CardAffirmationInfo.$childSerializers;
        Object obj = null;
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        List list3 = null;
        List list4 = null;
        String strO4 = null;
        String strO5 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            switch (iJ) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    list = (List) zf2VarC.s(nycVar, 0, (xn7) lw7VarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    list2 = (List) zf2VarC.s(nycVar, 1, (xn7) lw7VarArr[1].getValue(), list2);
                    i |= 2;
                    break;
                case 2:
                    strO = zf2VarC.o(nycVar, 2);
                    i |= 4;
                    break;
                case 3:
                    strO2 = zf2VarC.o(nycVar, 3);
                    i |= 8;
                    break;
                case 4:
                    strO3 = zf2VarC.o(nycVar, 4);
                    i |= 16;
                    break;
                case 5:
                    list3 = (List) zf2VarC.s(nycVar, 5, (xn7) lw7VarArr[5].getValue(), list3);
                    i |= 32;
                    break;
                case 6:
                    list4 = (List) zf2VarC.s(nycVar, 6, (xn7) lw7VarArr[6].getValue(), list4);
                    i |= 64;
                    break;
                case 7:
                    strO4 = zf2VarC.o(nycVar, 7);
                    i |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    continue;
                case 8:
                    strO5 = zf2VarC.o(nycVar, 8);
                    i |= 256;
                    continue;
                default:
                    s8f.f(iJ);
                    return obj;
            }
            obj = null;
        }
        zf2VarC.b(nycVar);
        return new CardAffirmationInfo(i, list, list2, strO, strO2, strO3, list3, list4, strO4, strO5, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = CardAffirmationInfo.$childSerializers;
        p4e p4eVar = p4e.a;
        return new xn7[]{lw7VarArr[0].getValue(), lw7VarArr[1].getValue(), p4eVar, p4eVar, p4eVar, lw7VarArr[5].getValue(), lw7VarArr[6].getValue(), p4eVar, p4eVar};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
