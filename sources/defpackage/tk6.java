package defpackage;

import ai.askquin.data.InAppMessageUiModel;
import ai.askquin.model.Scene;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import tech.chatmind.api.message.model.InAppMessageIntensity;
import tech.chatmind.api.message.model.InAppMessageType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tk6 implements a26 {
    public final /* synthetic */ int a;

    public /* synthetic */ tk6(int i) {
        this.a = i;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) throws Exception {
        int i = this.a;
        boolean z = true;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                fl6 fl6Var = (fl6) obj;
                fl6Var.getClass();
                return job.a.b(fl6Var.getClass());
            case 1:
                return qk2.d(((Float) obj).floatValue());
            case 2:
                ((Long) obj).getClass();
                return wefVar;
            case 3:
                ((Long) obj).getClass();
                return wefVar;
            case 4:
                kv2.y((l1f) obj, "btn", "widget", "pathway", "homepage");
                return wefVar;
            case 5:
                l1f l1fVar = (l1f) obj;
                l1fVar.getClass();
                l1fVar.a("history", "btn");
                return wefVar;
            case 6:
                kv2.y((l1f) obj, "btn", "enter_reading", "pathway", "homepage_photoReading");
                return wefVar;
            case 7:
                kv2.y((l1f) obj, "btn", "enter_reading", "pathway", "general");
                return wefVar;
            case 8:
                String str = (String) obj;
                str.getClass();
                hf8.Q.getClass();
                ef8.a("Quin.ExploreBanner").b("Failed to open explore banner link: ".concat(str));
                return wefVar;
            case 9:
                Scene scene = (Scene) obj;
                scene.getClass();
                return scene.getId();
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                Scene scene2 = (Scene) obj;
                scene2.getClass();
                return scene2.getId();
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((hxc) obj).getClass();
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ((hxc) obj).getClass();
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((hxc) obj).getClass();
                return wefVar;
            case 14:
                hxc hxcVar = (hxc) obj;
                hxcVar.getClass();
                exc.j(hxcVar, 0);
                return wefVar;
            case 15:
                ((Long) obj).getClass();
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((xq6) obj).getClass();
                return Boolean.TRUE;
            case 17:
                return wefVar;
            case 18:
                ((une) obj).g(null);
                return wefVar;
            case 19:
                q8c q8cVar = (q8c) obj;
                q8cVar.getClass();
                x8c x8cVarW0 = q8cVar.W0("SELECT * FROM tb_in_app_message ORDER BY created_at DESC LIMIT 300");
                try {
                    int iK = y8c.k(x8cVarW0, "message_id");
                    int iK2 = y8c.k(x8cVarW0, "message_type");
                    int iK3 = y8c.k(x8cVarW0, "region");
                    int iK4 = y8c.k(x8cVarW0, "title");
                    int iK5 = y8c.k(x8cVarW0, "content");
                    int iK6 = y8c.k(x8cVarW0, "image_url");
                    int iK7 = y8c.k(x8cVarW0, "intensity");
                    int iK8 = y8c.k(x8cVarW0, "action");
                    int iK9 = y8c.k(x8cVarW0, "action_tips");
                    int iK10 = y8c.k(x8cVarW0, "attach");
                    int iK11 = y8c.k(x8cVarW0, "created_at");
                    ArrayList arrayList = new ArrayList();
                    while (x8cVarW0.R0()) {
                        String strT0 = x8cVarW0.t0(iK);
                        String strT1 = x8cVarW0.t0(iK2);
                        strT1.getClass();
                        InAppMessageType inAppMessageTypeValueOf = InAppMessageType.valueOf(strT1);
                        String strT2 = x8cVarW0.t0(iK3);
                        String strT3 = x8cVarW0.isNull(iK4) ? null : x8cVarW0.t0(iK4);
                        String strT4 = x8cVarW0.t0(iK5);
                        String strT5 = x8cVarW0.isNull(iK6) ? null : x8cVarW0.t0(iK6);
                        String strT6 = x8cVarW0.t0(iK7);
                        strT6.getClass();
                        InAppMessageIntensity inAppMessageIntensityValueOf = InAppMessageIntensity.valueOf(strT6);
                        String strT7 = x8cVarW0.isNull(iK8) ? null : x8cVarW0.t0(iK8);
                        String strT8 = x8cVarW0.isNull(iK9) ? null : x8cVarW0.t0(iK9);
                        String strT9 = x8cVarW0.isNull(iK10) ? null : x8cVarW0.t0(iK10);
                        String strT10 = x8cVarW0.isNull(iK11) ? null : x8cVarW0.t0(iK11);
                        DateTimeFormatter dateTimeFormatter = il9.a;
                        OffsetDateTime offsetDateTime = strT10 != null ? OffsetDateTime.parse(strT10, il9.a) : null;
                        if (offsetDateTime == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.time.OffsetDateTime', but it was NULL.");
                        }
                        arrayList.add(new dz6(strT0, inAppMessageTypeValueOf, strT2, strT3, strT4, strT5, inAppMessageIntensityValueOf, strT7, strT8, strT9, offsetDateTime));
                    }
                    x8cVarW0.close();
                    return arrayList;
                } catch (Throwable th) {
                    x8cVarW0.close();
                    throw th;
                }
            case 20:
                q8c q8cVar2 = (q8c) obj;
                q8cVar2.getClass();
                x8c x8cVarW1 = q8cVar2.W0("SELECT * FROM tb_in_app_message ORDER BY created_at DESC LIMIT 300");
                try {
                    int iK12 = y8c.k(x8cVarW1, "message_id");
                    int iK13 = y8c.k(x8cVarW1, "message_type");
                    int iK14 = y8c.k(x8cVarW1, "region");
                    int iK15 = y8c.k(x8cVarW1, "title");
                    int iK16 = y8c.k(x8cVarW1, "content");
                    int iK17 = y8c.k(x8cVarW1, "image_url");
                    int iK18 = y8c.k(x8cVarW1, "intensity");
                    int iK19 = y8c.k(x8cVarW1, "action");
                    int iK20 = y8c.k(x8cVarW1, "action_tips");
                    int iK21 = y8c.k(x8cVarW1, "attach");
                    int iK22 = y8c.k(x8cVarW1, "created_at");
                    ArrayList arrayList2 = new ArrayList();
                    while (x8cVarW1.R0()) {
                        String strT11 = x8cVarW1.t0(iK12);
                        String strT12 = x8cVarW1.t0(iK13);
                        strT12.getClass();
                        InAppMessageType inAppMessageTypeValueOf2 = InAppMessageType.valueOf(strT12);
                        String strT13 = x8cVarW1.t0(iK14);
                        String strT14 = x8cVarW1.isNull(iK15) ? null : x8cVarW1.t0(iK15);
                        String strT15 = x8cVarW1.t0(iK16);
                        String strT16 = x8cVarW1.isNull(iK17) ? null : x8cVarW1.t0(iK17);
                        String strT17 = x8cVarW1.t0(iK18);
                        strT17.getClass();
                        InAppMessageIntensity inAppMessageIntensityValueOf2 = InAppMessageIntensity.valueOf(strT17);
                        String strT18 = x8cVarW1.isNull(iK19) ? null : x8cVarW1.t0(iK19);
                        String strT19 = x8cVarW1.isNull(iK20) ? null : x8cVarW1.t0(iK20);
                        String strT20 = x8cVarW1.isNull(iK21) ? null : x8cVarW1.t0(iK21);
                        String strT21 = x8cVarW1.isNull(iK22) ? null : x8cVarW1.t0(iK22);
                        DateTimeFormatter dateTimeFormatter2 = il9.a;
                        OffsetDateTime offsetDateTime2 = strT21 != null ? OffsetDateTime.parse(strT21, il9.a) : null;
                        if (offsetDateTime2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.time.OffsetDateTime', but it was NULL.");
                        }
                        arrayList2.add(new dz6(strT11, inAppMessageTypeValueOf2, strT13, strT14, strT15, strT16, inAppMessageIntensityValueOf2, strT18, strT19, strT20, offsetDateTime2));
                    }
                    x8cVarW1.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    x8cVarW1.close();
                    throw th2;
                }
            case 21:
                q8c q8cVar3 = (q8c) obj;
                q8cVar3.getClass();
                x8c x8cVarW2 = q8cVar3.W0("DELETE FROM tb_in_app_message");
                try {
                    x8cVarW2.R0();
                    return wefVar;
                } finally {
                    x8cVarW2.close();
                }
            case 22:
                InAppMessageUiModel inAppMessageUiModel = (InAppMessageUiModel) obj;
                inAppMessageUiModel.getClass();
                return inAppMessageUiModel.getMessageId();
            case 23:
                ((bea) obj).getClass();
                return wefVar;
            case 24:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 25:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 26:
                char cCharValue = ((Character) obj).charValue();
                if (cCharValue != 'T' && cCharValue != 't') {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 27:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 28:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            default:
                char cCharValue2 = ((Character) obj).charValue();
                return Boolean.valueOf('0' <= cCharValue2 && cCharValue2 < ':');
        }
    }
}
