package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import tech.chatmind.api.giftcard.GiftCardItem;
import tech.chatmind.api.giftcard.GiftCardSku;
import tech.chatmind.api.giftcard.GiftCardStatus;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n86 implements w56 {
    public static final n86 a;
    private static final nyc descriptor;

    static {
        n86 n86Var = new n86();
        a = n86Var;
        gia giaVar = new gia("tech.chatmind.api.giftcard.GiftCardItem", n86Var, 12);
        giaVar.k("cardId", true);
        giaVar.k("sku", true);
        giaVar.k("status", true);
        giaVar.k("purchasedAt", true);
        giaVar.k("redeemCode", true);
        giaVar.k("shareUrl", true);
        giaVar.k("nickname", true);
        giaVar.k("fromNickname", true);
        giaVar.k("blessing", true);
        giaVar.k("claimedAt", true);
        giaVar.k("effectiveFrom", true);
        giaVar.k("expireAt", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        GiftCardItem giftCardItem = (GiftCardItem) obj;
        giftCardItem.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        GiftCardItem.write$Self$Quin_core_base_api_release(giftCardItem, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = GiftCardItem.$childSerializers;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z = true;
        String str5 = null;
        int i = 0;
        String strO = null;
        GiftCardSku giftCardSku = null;
        GiftCardStatus giftCardStatus = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        int i2 = 1;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            switch (iJ) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    i |= 1;
                    i2 = i2;
                    strO = zf2VarC.o(nycVar, 0);
                    z = z;
                    continue;
                case 1:
                    giftCardSku = (GiftCardSku) zf2VarC.s(nycVar, i2, (xn7) lw7VarArr[i2].getValue(), giftCardSku);
                    i |= 2;
                    break;
                case 2:
                    giftCardStatus = (GiftCardStatus) zf2VarC.s(nycVar, 2, (xn7) lw7VarArr[2].getValue(), giftCardStatus);
                    i |= 4;
                    break;
                case 3:
                    str6 = (String) zf2VarC.y(nycVar, 3, p4e.a, str6);
                    i |= 8;
                    break;
                case 4:
                    str7 = (String) zf2VarC.y(nycVar, 4, p4e.a, str7);
                    i |= 16;
                    break;
                case 5:
                    str8 = (String) zf2VarC.y(nycVar, 5, p4e.a, str8);
                    i |= 32;
                    break;
                case 6:
                    str9 = (String) zf2VarC.y(nycVar, 6, p4e.a, str9);
                    i |= 64;
                    break;
                case 7:
                    str5 = (String) zf2VarC.y(nycVar, 7, p4e.a, str5);
                    i |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    break;
                case 8:
                    str4 = (String) zf2VarC.y(nycVar, 8, p4e.a, str4);
                    i |= 256;
                    break;
                case 9:
                    str3 = (String) zf2VarC.y(nycVar, 9, p4e.a, str3);
                    i |= 512;
                    break;
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    str2 = (String) zf2VarC.y(nycVar, 10, p4e.a, str2);
                    i |= UserMetadata.MAX_ATTRIBUTE_SIZE;
                    break;
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    str = (String) zf2VarC.y(nycVar, 11, p4e.a, str);
                    i |= 2048;
                    break;
                default:
                    s8f.f(iJ);
                    return null;
            }
            z = z;
            strO = strO;
        }
        zf2VarC.b(nycVar);
        return new GiftCardItem(i, strO, giftCardSku, giftCardStatus, str6, str7, str8, str9, str5, str4, str3, str2, str, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = GiftCardItem.$childSerializers;
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, lw7VarArr[1].getValue(), lw7VarArr[2].getValue(), t72.F(p4eVar), t72.F(p4eVar), t72.F(p4eVar), t72.F(p4eVar), t72.F(p4eVar), t72.F(p4eVar), t72.F(p4eVar), t72.F(p4eVar), t72.F(p4eVar)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
