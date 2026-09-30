package defpackage;

import ai.askquin.ui.web.WebViewActivity;
import android.content.Context;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ksf implements a26 {
    public final /* synthetic */ int a;

    public /* synthetic */ ksf(int i) {
        this.a = i;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        bxf bxfVar;
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                yz yzVar = (yz) obj;
                return new aj4((((long) Float.floatToRawIntBits(yzVar.a)) << 32) | (((long) Float.floatToRawIntBits(yzVar.b)) & 4294967295L));
            case 1:
                ald aldVar = (ald) obj;
                return new yz(Float.intBitsToFloat((int) (aldVar.a >> 32)), Float.intBitsToFloat((int) (aldVar.a & 4294967295L)));
            case 2:
                yz yzVar2 = (yz) obj;
                return new ald((((long) Float.floatToRawIntBits(yzVar2.a)) << 32) | (((long) Float.floatToRawIntBits(yzVar2.b)) & 4294967295L));
            case 3:
                hl9 hl9Var = (hl9) obj;
                return new yz(Float.intBitsToFloat((int) (hl9Var.a >> 32)), Float.intBitsToFloat((int) (hl9Var.a & 4294967295L)));
            case 4:
                yz yzVar3 = (yz) obj;
                return new hl9((((long) Float.floatToRawIntBits(yzVar3.a)) << 32) | (((long) Float.floatToRawIntBits(yzVar3.b)) & 4294967295L));
            case 5:
                long j = ((w67) obj).a;
                return new yz((int) (j >> 32), (int) (j & 4294967295L));
            case 6:
                yz yzVar4 = (yz) obj;
                return new w67((((long) Math.round(yzVar4.a)) << 32) | (((long) Math.round(yzVar4.b)) & 4294967295L));
            case 7:
                long j2 = ((e77) obj).a;
                return new yz((int) (j2 >> 32), (int) (j2 & 4294967295L));
            case 8:
                yz yzVar5 = (yz) obj;
                int iRound = Math.round(yzVar5.a);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(yzVar5.b);
                return new e77((((long) (iRound2 >= 0 ? iRound2 : 0)) & 4294967295L) | (((long) iRound) << 32));
            case 9:
                hkb hkbVar = (hkb) obj;
                return new a00(hkbVar.a, hkbVar.b, hkbVar.c, hkbVar.d);
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                a00 a00Var = (a00) obj;
                return new hkb(a00Var.a, a00Var.b, a00Var.c, a00Var.d);
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return Float.valueOf(((xz) obj).a);
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return new cxf((Context) obj);
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return new exf((Context) obj);
            case 14:
                exf exfVar = (exf) obj;
                fxf attachedState = exfVar.getAttachedState();
                if (attachedState != null && (bxfVar = attachedState.g) != null && !bxfVar.c) {
                    ((bae) bxfVar.d).a();
                    bxfVar.b.c();
                    bxfVar.c = true;
                }
                exfVar.setAttachedState(null);
                return wefVar;
            case 15:
                rzf rzfVar = (rzf) obj;
                rzfVar.getClass();
                return hfc.d(rzfVar);
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                rzf rzfVar2 = (rzf) obj;
                rzfVar2.getClass();
                return rzfVar2.getId();
            case 17:
                l1f l1fVar = (l1f) obj;
                int i2 = WebViewActivity.T0;
                l1fVar.getClass();
                l1fVar.a("annualReport_share", "btn");
                return wefVar;
            case 18:
                List list = (List) obj;
                list.getClass();
                Object obj2 = list.get(0);
                obj2.getClass();
                LocalDate localDate = (LocalDate) obj2;
                Object obj3 = list.get(1);
                obj3.getClass();
                LocalDate localDate2 = (LocalDate) obj3;
                Object obj4 = list.get(2);
                obj4.getClass();
                LocalDate localDate3 = (LocalDate) obj4;
                Object obj5 = list.get(3);
                obj5.getClass();
                DayOfWeek dayOfWeek = (DayOfWeek) obj5;
                Object obj6 = list.get(4);
                obj6.getClass();
                int iIntValue = ((Integer) obj6).intValue();
                Object obj7 = list.get(5);
                obj7.getClass();
                return new t2g(localDate, localDate2, localDate3, dayOfWeek, new ryf(iIntValue, ((Integer) obj7).intValue()));
            case 19:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 20:
                sn4 sn4Var = (sn4) obj;
                sn4Var.getClass();
                zt ztVarA = cu.a();
                ztVarA.h(0.0f, 0.0f);
                ztVarA.g(Float.intBitsToFloat((int) (sn4Var.f() >> 32)), Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L)) / 2.0f);
                ztVarA.g(0.0f, Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L)));
                sn4.R(sn4Var, ztVarA, h4g.e, new d5e(Float.intBitsToFloat((int) (sn4Var.f() >> 32)) * 0.25f, 0.0f, 0, 0, null, 30), 52);
                return wefVar;
            case 21:
                g0c g0cVar = (g0c) obj;
                g0cVar.getClass();
                g0cVar.p(15.0f);
                return wefVar;
            case 22:
                g0c g0cVar2 = (g0c) obj;
                g0cVar2.getClass();
                g0cVar2.p(-8.0f);
                return wefVar;
            case 23:
                ((l1f) obj).getClass();
                return wefVar;
            case 24:
                l1f l1fVar2 = (l1f) obj;
                kv2.y(l1fVar2, "btn", "how_to_add", "pathway", "widget_onboarding");
                l1fVar2.a(1, "layer");
                return wefVar;
            case 25:
                l1f l1fVar3 = (l1f) obj;
                kv2.y(l1fVar3, "btn", "go_to_homescreen", "pathway", "widget_onboarding");
                l1fVar3.a(2, "layer");
                return wefVar;
            case 26:
                ((l1f) obj).a("widget_onboarding", "popup");
                return wefVar;
            case 27:
                kv2.y((l1f) obj, "btn", "go_to_homescreen", "pathway", "account_widget_onboarding");
                return wefVar;
            case 28:
                return ((m8g) obj).g;
            default:
                return ((m8g) obj).f;
        }
    }
}
