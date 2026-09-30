package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a4c implements a26 {
    public final /* synthetic */ int a;

    @Override // defpackage.a26
    public final Object d(Object obj) {
        y72 y72Var;
        int i = this.a;
        wef wefVar = wef.a;
        xtd xtdVar = null;
        zteVar = null;
        zte zteVar = null;
        zteVar = null;
        zte zteVar2 = null;
        xtdVar = null;
        int i2 = 0;
        switch (i) {
            case 0:
                ((ste) obj).getClass();
                return wefVar;
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                String strY = v4e.Y("inline:", str);
                if (strY == str) {
                    strY = null;
                }
                if (strY == null) {
                    return null;
                }
                value.getClass();
                return new iy9(strY, (o37) value);
            case 2:
                ((sd3) obj).getClass();
                throw new wg9(0);
            case 3:
                return wefVar;
            case 4:
                return new rcc((Map) obj);
            case 5:
                return obj;
            case 6:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                a26 a26Var = (a26) sdc.i.c;
                Boolean bool = Boolean.FALSE;
                xtd xtdVar2 = (pa7.t(obj2, bool) || obj2 == null) ? null : (xtd) a26Var.d(obj2);
                Object obj3 = list.get(1);
                xtd xtdVar3 = (pa7.t(obj3, bool) || obj3 == null) ? null : (xtd) a26Var.d(obj3);
                Object obj4 = list.get(2);
                xtd xtdVar4 = (pa7.t(obj4, bool) || obj4 == null) ? null : (xtd) a26Var.d(obj4);
                Object obj5 = list.get(3);
                if (!pa7.t(obj5, bool) && obj5 != null) {
                    xtdVar = (xtd) a26Var.d(obj5);
                }
                return new zte(xtdVar2, xtdVar3, xtdVar4, xtdVar);
            case 7:
                obj.getClass();
                List list2 = (List) obj;
                Object obj6 = list2.get(1);
                List list3 = (pa7.t(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((a26) sdc.b.c).d(obj6);
                Object obj7 = list2.get(0);
                String str2 = obj7 != null ? (String) obj7 : null;
                str2.getClass();
                return new k00(list3, str2);
            case 8:
                obj.getClass();
                return new mne(((Integer) obj).intValue());
            case 9:
                obj.getClass();
                List list4 = (List) obj;
                return new cte(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                obj.getClass();
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                xue[] xueVarArr = wue.b;
                a26 a26Var2 = sdc.x.b;
                Boolean bool2 = Boolean.FALSE;
                pa7.t(obj8, bool2);
                wue wueVar = obj8 != null ? (wue) a26Var2.d(obj8) : null;
                wueVar.getClass();
                long j = wueVar.a;
                Object obj9 = list5.get(1);
                pa7.t(obj9, bool2);
                wue wueVar2 = obj9 != null ? (wue) a26Var2.d(obj9) : null;
                wueVar2.getClass();
                return new ete(j, wueVar2.a);
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                obj.getClass();
                return new ar5(((Integer) obj).intValue());
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                obj.getClass();
                return new ou0(((Float) obj).floatValue());
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                obj.getClass();
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                Integer num = obj10 != null ? (Integer) obj10 : null;
                num.getClass();
                int iIntValue = num.intValue();
                Object obj11 = list6.get(1);
                Integer num2 = obj11 != null ? (Integer) obj11 : null;
                num2.getClass();
                return new eue(u3c.b(iIntValue, num2.intValue()));
            case 14:
                obj.getClass();
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                int i3 = y72.l;
                Boolean bool3 = Boolean.FALSE;
                pa7.t(obj12, bool3);
                if (obj12 != null) {
                    y72Var = obj12.equals(bool3) ? new y72(y72.k) : new y72(abg.c(((Integer) obj12).intValue()));
                } else {
                    y72Var = null;
                }
                y72Var.getClass();
                long j2 = y72Var.a;
                Object obj13 = list7.get(1);
                rdc rdcVar = sdc.z;
                pa7.t(obj13, bool3);
                hl9 hl9Var = obj13 != null ? (hl9) rdcVar.b.d(obj13) : null;
                hl9Var.getClass();
                long j3 = hl9Var.a;
                Object obj14 = list7.get(2);
                Float f = obj14 != null ? (Float) obj14 : null;
                f.getClass();
                return new o4d(j2, j3, f.floatValue());
            case 15:
                obj.getClass();
                return new jme(((Integer) obj).intValue());
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                obj.getClass();
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                String str3 = obj15 != null ? (String) obj15 : null;
                str3.getClass();
                Object obj16 = list8.get(1);
                vea veaVar = sdc.j;
                if (!pa7.t(obj16, Boolean.FALSE) && obj16 != null) {
                    zteVar2 = (zte) ((a26) veaVar.c).d(obj16);
                }
                return new k68(str3, zteVar2);
            case 17:
                obj.getClass();
                return new pne(((Integer) obj).intValue());
            case 18:
                obj.getClass();
                return new ft6(((Integer) obj).intValue());
            case 19:
                obj.getClass();
                List list9 = (List) obj;
                ArrayList arrayList = new ArrayList(list9.size());
                int size = list9.size();
                while (i2 < size) {
                    Object obj17 = list9.get(i2);
                    j00 j00Var = (pa7.t(obj17, Boolean.FALSE) || obj17 == null) ? null : (j00) ((a26) sdc.c.c).d(obj17);
                    j00Var.getClass();
                    arrayList.add(j00Var);
                    i2++;
                }
                return arrayList;
            case 20:
                obj.getClass();
                return new wq5(((Integer) obj).intValue());
            case 21:
                obj.getClass();
                return new xq5(((Integer) obj).intValue());
            case 22:
                Boolean bool4 = Boolean.FALSE;
                if (pa7.t(obj, bool4)) {
                    return new wue(wue.c);
                }
                obj.getClass();
                List list10 = (List) obj;
                Object obj18 = list10.get(0);
                Float f2 = obj18 != null ? (Float) obj18 : null;
                f2.getClass();
                float fFloatValue = f2.floatValue();
                Object obj19 = list10.get(1);
                rdc rdcVar2 = sdc.y;
                pa7.t(obj19, bool4);
                xue xueVar = obj19 != null ? (xue) rdcVar2.b.d(obj19) : null;
                xueVar.getClass();
                return new wue(w6c.r(xueVar.a, fFloatValue));
            case 23:
                if (pa7.t(obj, 0)) {
                    return new xue(8589934592L);
                }
                return pa7.t(obj, 1) ? new xue(4294967296L) : new xue(0L);
            case 24:
                if (pa7.t(obj, Boolean.FALSE)) {
                    return new hl9(9205357640488583168L);
                }
                obj.getClass();
                List list11 = (List) obj;
                Object obj20 = list11.get(0);
                Float f3 = obj20 != null ? (Float) obj20 : null;
                f3.getClass();
                float fFloatValue2 = f3.floatValue();
                Object obj21 = list11.get(1);
                Float f4 = obj21 != null ? (Float) obj21 : null;
                f4.getClass();
                return new hl9((((long) Float.floatToRawIntBits(f4.floatValue())) & 4294967295L) | (((long) Float.floatToRawIntBits(fFloatValue2)) << 32));
            case 25:
                obj.getClass();
                List list12 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list12.size());
                int size2 = list12.size();
                while (i2 < size2) {
                    Object obj22 = list12.get(i2);
                    rd8 rd8Var = (pa7.t(obj22, Boolean.FALSE) || obj22 == null) ? null : (rd8) ((a26) sdc.B.c).d(obj22);
                    rd8Var.getClass();
                    arrayList2.add(rd8Var);
                    i2++;
                }
                return new sd8(arrayList2);
            case 26:
                obj.getClass();
                String str4 = (String) obj;
                Locale localeForLanguageTag = Locale.forLanguageTag(str4);
                if (pa7.t(localeForLanguageTag.toLanguageTag(), "und")) {
                    System.err.println("The language tag " + str4 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new rd8(localeForLanguageTag);
            case 27:
                obj.getClass();
                List list13 = (List) obj;
                Object obj23 = list13.get(0);
                String str5 = obj23 != null ? (String) obj23 : null;
                str5.getClass();
                Object obj24 = list13.get(1);
                vea veaVar2 = sdc.j;
                if (!pa7.t(obj24, Boolean.FALSE) && obj24 != null) {
                    zteVar = (zte) ((a26) veaVar2.c).d(obj24);
                }
                return new j68(str5, zteVar);
            case 28:
                obj.getClass();
                List list14 = (List) obj;
                Object obj25 = list14.get(0);
                float f5 = v58.b;
                rdc rdcVar3 = sdc.D;
                Boolean bool5 = Boolean.FALSE;
                pa7.t(obj25, bool5);
                v58 v58Var = obj25 != null ? (v58) rdcVar3.b.d(obj25) : null;
                v58Var.getClass();
                float f6 = v58Var.a;
                Object obj26 = list14.get(1);
                rdc rdcVar4 = sdc.E;
                pa7.t(obj26, bool5);
                x58 x58Var = obj26 != null ? (x58) rdcVar4.b.d(obj26) : null;
                x58Var.getClass();
                int i4 = x58Var.a;
                Object obj27 = list14.get(2);
                rdc rdcVar5 = sdc.F;
                pa7.t(obj27, bool5);
                w58 w58Var = obj27 != null ? (w58) rdcVar5.b.d(obj27) : null;
                w58Var.getClass();
                return new y58(f6, i4, w58Var.a);
            default:
                obj.getClass();
                float fFloatValue3 = ((Float) obj).floatValue();
                v58.a(fFloatValue3);
                return new v58(fFloatValue3);
        }
    }

    public /* synthetic */ a4c(int i) {
        this.a = i;
    }
}
