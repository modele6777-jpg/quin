package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.time.OffsetDateTime;
import tech.chatmind.api.message.model.InAppMessage;
import tech.chatmind.api.message.model.InAppMessageIntensity;
import tech.chatmind.api.message.model.InAppMessageMetadata;
import tech.chatmind.api.message.model.InAppMessageType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zy6 implements w56 {
    public static final zy6 a;
    private static final nyc descriptor;

    static {
        zy6 zy6Var = new zy6();
        a = zy6Var;
        gia giaVar = new gia("tech.chatmind.api.message.model.InAppMessage", zy6Var, 17);
        giaVar.k("action", true);
        giaVar.k("actionTips", true);
        giaVar.k("attach", true);
        giaVar.k("content", false);
        giaVar.k("createdAt", false);
        giaVar.k("data", true);
        giaVar.k("imageUrl", true);
        giaVar.k("intensity", true);
        giaVar.k("isAllVersions", true);
        giaVar.k("maxAppVersion", true);
        giaVar.k("messageId", true);
        giaVar.k("messageType", true);
        giaVar.k("metadata", true);
        giaVar.k("minAppVersion", true);
        giaVar.k("region", true);
        giaVar.k("title", true);
        giaVar.k("validPlatforms", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        InAppMessage inAppMessage = (InAppMessage) obj;
        inAppMessage.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        InAppMessage.write$Self$Quin_core_base_api_release(inAppMessage, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        lw7[] lw7VarArr;
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr2 = InAppMessage.$childSerializers;
        String str = null;
        InAppMessageMetadata inAppMessageMetadata = null;
        InAppMessageType inAppMessageType = null;
        boolean z = true;
        InAppMessageIntensity inAppMessageIntensity = null;
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String strO = null;
        OffsetDateTime offsetDateTime = null;
        String strO2 = null;
        String str5 = null;
        boolean z2 = false;
        String strO3 = null;
        String strO4 = null;
        String strO5 = null;
        String strO6 = null;
        String strO7 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            switch (iJ) {
                case -1:
                    z = false;
                    break;
                case 0:
                    lw7VarArr = lw7VarArr2;
                    str2 = (String) zf2VarC.y(nycVar, 0, p4e.a, str2);
                    i |= 1;
                    lw7VarArr2 = lw7VarArr;
                    z = z;
                    break;
                case 1:
                    lw7VarArr = lw7VarArr2;
                    str3 = (String) zf2VarC.y(nycVar, 1, p4e.a, str3);
                    i |= 2;
                    lw7VarArr2 = lw7VarArr;
                    z = z;
                    break;
                case 2:
                    lw7VarArr = lw7VarArr2;
                    str4 = (String) zf2VarC.y(nycVar, 2, p4e.a, str4);
                    i |= 4;
                    lw7VarArr2 = lw7VarArr;
                    z = z;
                    break;
                case 3:
                    strO = zf2VarC.o(nycVar, 3);
                    i |= 8;
                    lw7VarArr2 = lw7VarArr2;
                    break;
                case 4:
                    lw7VarArr = lw7VarArr2;
                    offsetDateTime = (OffsetDateTime) zf2VarC.s(nycVar, 4, (xn7) lw7VarArr[4].getValue(), offsetDateTime);
                    i |= 16;
                    lw7VarArr2 = lw7VarArr;
                    z = z;
                    break;
                case 5:
                    strO2 = zf2VarC.o(nycVar, 5);
                    i |= 32;
                    lw7VarArr2 = lw7VarArr2;
                    break;
                case 6:
                    lw7VarArr = lw7VarArr2;
                    str5 = (String) zf2VarC.y(nycVar, 6, p4e.a, str5);
                    i |= 64;
                    lw7VarArr2 = lw7VarArr;
                    z = z;
                    break;
                case 7:
                    lw7VarArr = lw7VarArr2;
                    inAppMessageIntensity = (InAppMessageIntensity) zf2VarC.s(nycVar, 7, (xn7) lw7VarArr[7].getValue(), inAppMessageIntensity);
                    i |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    lw7VarArr2 = lw7VarArr;
                    z = z;
                    break;
                case 8:
                    z2 = zf2VarC.z(nycVar, 8);
                    i |= 256;
                    lw7VarArr2 = lw7VarArr2;
                    break;
                case 9:
                    strO3 = zf2VarC.o(nycVar, 9);
                    i |= 512;
                    lw7VarArr2 = lw7VarArr2;
                    break;
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    strO4 = zf2VarC.o(nycVar, 10);
                    i |= UserMetadata.MAX_ATTRIBUTE_SIZE;
                    lw7VarArr2 = lw7VarArr2;
                    break;
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    lw7VarArr = lw7VarArr2;
                    inAppMessageType = (InAppMessageType) zf2VarC.s(nycVar, 11, (xn7) lw7VarArr[11].getValue(), inAppMessageType);
                    i |= 2048;
                    lw7VarArr2 = lw7VarArr;
                    z = z;
                    break;
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    lw7VarArr = lw7VarArr2;
                    inAppMessageMetadata = (InAppMessageMetadata) zf2VarC.y(nycVar, 12, hz6.a, inAppMessageMetadata);
                    i |= 4096;
                    lw7VarArr2 = lw7VarArr;
                    z = z;
                    break;
                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    strO5 = zf2VarC.o(nycVar, 13);
                    i |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    lw7VarArr2 = lw7VarArr2;
                    break;
                case 14:
                    strO6 = zf2VarC.o(nycVar, 14);
                    i |= 16384;
                    lw7VarArr2 = lw7VarArr2;
                    break;
                case 15:
                    lw7VarArr = lw7VarArr2;
                    str = (String) zf2VarC.y(nycVar, 15, p4e.a, str);
                    i |= 32768;
                    lw7VarArr2 = lw7VarArr;
                    z = z;
                    break;
                case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                    strO7 = zf2VarC.o(nycVar, 16);
                    i |= 65536;
                    lw7VarArr2 = lw7VarArr2;
                    break;
                default:
                    s8f.f(iJ);
                    return null;
            }
        }
        zf2VarC.b(nycVar);
        return new InAppMessage(i, str2, str3, str4, strO, offsetDateTime, strO2, str5, inAppMessageIntensity, z2, strO3, strO4, inAppMessageType, inAppMessageMetadata, strO5, strO6, str, strO7, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = InAppMessage.$childSerializers;
        p4e p4eVar = p4e.a;
        return new xn7[]{t72.F(p4eVar), t72.F(p4eVar), t72.F(p4eVar), p4eVar, lw7VarArr[4].getValue(), p4eVar, t72.F(p4eVar), lw7VarArr[7].getValue(), g11.a, p4eVar, p4eVar, lw7VarArr[11].getValue(), t72.F(hz6.a), p4eVar, p4eVar, t72.F(p4eVar), p4eVar};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
