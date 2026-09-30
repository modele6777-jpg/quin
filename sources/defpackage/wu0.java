package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import android.content.Context;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.time.DayOfWeek;
import java.time.YearMonth;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wu0 implements a26 {
    public final /* synthetic */ int a;

    public /* synthetic */ wu0(int i) {
        this.a = i;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                hxc hxcVar = (hxc) obj;
                hxcVar.getClass();
                wn7[] wn7VarArr = exc.a;
                hxcVar.c(cxc.h, wefVar);
                return wefVar;
            case 1:
                return wefVar;
            case 2:
                return wefVar;
            case 3:
                Long l = (Long) obj;
                l.longValue();
                return l;
            case 4:
                em7 em7Var = (em7) obj;
                em7Var.getClass();
                return fm7.a(em7Var);
            case 5:
                ((vv7) ((im2) obj)).a();
                return wefVar;
            case 6:
                return wefVar;
            case 7:
                return wefVar;
            case 8:
                if (((Context) ((tg2) obj).s0(uq.b)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return y31.b;
                }
                w31.a.getClass();
                return v31.c;
            case 9:
                exc.m((hxc) obj, 0);
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                List list = (List) obj;
                list.getClass();
                Object obj2 = list.get(0);
                obj2.getClass();
                YearMonth yearMonth = (YearMonth) obj2;
                Object obj3 = list.get(1);
                obj3.getClass();
                YearMonth yearMonth2 = (YearMonth) obj3;
                Object obj4 = list.get(2);
                obj4.getClass();
                YearMonth yearMonth3 = (YearMonth) obj4;
                Object obj5 = list.get(3);
                obj5.getClass();
                DayOfWeek dayOfWeek = (DayOfWeek) obj5;
                Object obj6 = list.get(4);
                obj6.getClass();
                ps9 ps9Var = (ps9) obj6;
                Object obj7 = list.get(5);
                obj7.getClass();
                int iIntValue = ((Integer) obj7).intValue();
                Object obj8 = list.get(6);
                obj8.getClass();
                return new r91(yearMonth, yearMonth2, dayOfWeek, yearMonth3, ps9Var, new ryf(iIntValue, ((Integer) obj8).intValue()));
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                sn4 sn4Var = (sn4) obj;
                sn4Var.getClass();
                float fP0 = sn4Var.p0(3.0f);
                float fP1 = sn4Var.p0(32.0f);
                float fP2 = sn4Var.p0(8.0f);
                long j = y72.e;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (sn4Var.f() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L));
                sn4.V0(sn4Var, j, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fP1)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fP2)) & 4294967295L), fP0, 1, null, 480);
                float f = fP2 * 2.0f;
                sn4Var.X0(j, -180.0f, 90.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), new d5e(fP0, 0.0f, 0, 0, null, 30));
                sn4.V0(sn4Var, j, (((long) Float.floatToRawIntBits(fP2)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(fP1)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), fP0, 1, null, 480);
                float f2 = fIntBitsToFloat - fP1;
                float f3 = fIntBitsToFloat - fP2;
                sn4.V0(sn4Var, j, (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), fP0, 1, null, 480);
                float f4 = fIntBitsToFloat - f;
                sn4Var.X0(j, -90.0f, 90.0f, (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), new d5e(fP0, 0.0f, 0, 0, null, 30));
                sn4.V0(sn4Var, j, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fP2)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fP1)) & 4294967295L), fP0, 1, null, 480);
                float f5 = fIntBitsToFloat2 - fP1;
                float f6 = fIntBitsToFloat2 - fP2;
                sn4.V0(sn4Var, j, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L), fP0, 1, null, 480);
                float f7 = fIntBitsToFloat2 - f;
                sn4Var.X0(j, 90.0f, 90.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L), (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), new d5e(fP0, 0.0f, 0, 0, null, 30));
                sn4.V0(sn4Var, j, (((long) Float.floatToRawIntBits(fP2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(fP1) << 32), fP0, 1, null, 480);
                sn4.V0(sn4Var, j, (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32), fP0, 1, null, 480);
                sn4Var.X0(j, 0.0f, 90.0f, (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L), (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), new d5e(fP0, 0.0f, 0, 0, null, 30));
                sn4.V0(sn4Var, j, (((long) Float.floatToRawIntBits(f6)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), fP0, 1, null, 480);
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                bh7 bh7Var = (bh7) obj;
                bh7Var.getClass();
                bh7Var.c = true;
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((uy5) obj).getClass();
                return Boolean.TRUE;
            case 14:
                kv2.y((l1f) obj, "btn", "next_step", "pathway", "onboarding_real_shuffle_draw");
                return wefVar;
            case 15:
                ((TarotSkinIdentify) obj).getClass();
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((TarotSkinIdentify) obj).getClass();
                return wefVar;
            case 17:
                bod bodVar = (bod) obj;
                bodVar.getClass();
                return bodVar.a.name();
            case 18:
                ((sn4) obj).getClass();
                return wefVar;
            case 19:
                Float f8 = (Float) obj;
                f8.floatValue();
                return String.format("%.1f°", Arrays.copyOf(new Object[]{f8}, 1));
            case 20:
                bh7 bh7Var2 = (bh7) obj;
                bh7Var2.getClass();
                bh7Var2.d = true;
                bh7Var2.a = true;
                return wefVar;
            case 21:
                ((ex7) obj).getClass();
                return new af6(qk2.m(3));
            case 22:
                ((ex7) obj).getClass();
                return new af6(qk2.m(3));
            case 23:
                ((Long) obj).getClass();
                return wefVar;
            case 24:
                ((Long) obj).getClass();
                return wefVar;
            case 25:
                return Integer.valueOf(((Integer) obj).intValue() / 3);
            case 26:
                return Integer.valueOf(((Integer) obj).intValue() / 3);
            case 27:
                ((Boolean) obj).getClass();
                return wefVar;
            case 28:
                q22 q22Var = (q22) obj;
                q22Var.getClass();
                p4e p4eVar = p4e.a;
                hua huaVar = p4e.b;
                q22Var.a("messageId", huaVar, true);
                q22Var.a("createdTime", huaVar, true);
                q22Var.a("role", huaVar, true);
                q22Var.a("type", huaVar, true);
                q22Var.a("content", huaVar, true);
                q22Var.a("label", t72.F(p4eVar).e(), true);
                q22Var.a("ignored", t72.F(g11.a).e(), true);
                q22Var.a("drawClarifyingCardMessageId", t72.F(p4eVar).e(), true);
                q22Var.a("interpretClarifyingCardMessageId", t72.F(p4eVar).e(), true);
                mh7 mh7Var = nh7.Companion;
                q22Var.a("cards", t72.F(mh7Var.serializer()).e(), true);
                q22Var.a("requestClarifyingCardMessageId", t72.F(p4eVar).e(), true);
                q22Var.a("interpretation", t72.F(p4eVar).e(), true);
                q22Var.a("question", t72.F(p4eVar).e(), true);
                q22Var.a("tarotReadingId", t72.F(p4eVar).e(), true);
                q22Var.a("tarotReading", t72.F(mh7Var.serializer()).e(), true);
                return wefVar;
            default:
                return wefVar;
        }
    }
}
