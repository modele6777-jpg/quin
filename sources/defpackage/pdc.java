package defpackage;

import ai.askquin.data.SeasonalDraftStore$Draft;
import ai.askquin.ui.seasonal.SeasonalEntry;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.List;
import java.util.Map;
import tech.chatmind.api.seasonal.model.SeasonalHistoryItem;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pdc implements a26 {
    public final /* synthetic */ int a;

    public /* synthetic */ pdc(int i) {
        this.a = i;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        j00 j00Var;
        y72 y72Var;
        y72 y72Var2;
        int i = 5;
        int i2 = 2;
        ty9 ty9Var = null;
        xt4Var = null;
        xt4 xt4Var = null;
        o4dVar = null;
        o4d o4dVar = null;
        cueVar = null;
        cue cueVar = null;
        j68Var = null;
        j68 j68Var = null;
        k68Var = null;
        k68 k68Var = null;
        shfVar = null;
        shf shfVar = null;
        ftfVar = null;
        ftf ftfVar = null;
        xtdVar = null;
        xtd xtdVar = null;
        ty9Var = null;
        switch (this.a) {
            case 0:
                obj.getClass();
                return new x58(((Integer) obj).intValue());
            case 1:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                a10 a10Var = obj2 != null ? (a10) obj2 : null;
                a10Var.getClass();
                Object obj3 = list.get(2);
                Integer num = obj3 != null ? (Integer) obj3 : null;
                num.getClass();
                int iIntValue = num.intValue();
                Object obj4 = list.get(3);
                Integer num2 = obj4 != null ? (Integer) obj4 : null;
                num2.getClass();
                int iIntValue2 = num2.intValue();
                Object obj5 = list.get(4);
                String str = obj5 != null ? (String) obj5 : null;
                str.getClass();
                switch (a10Var.ordinal()) {
                    case 0:
                        Object obj6 = list.get(1);
                        vea veaVar = sdc.h;
                        if (!pa7.t(obj6, Boolean.FALSE) && obj6 != null) {
                            ty9Var = (ty9) ((a26) veaVar.c).d(obj6);
                        }
                        ty9Var.getClass();
                        j00Var = new j00(ty9Var, iIntValue, iIntValue2, str);
                        break;
                    case 1:
                        Object obj7 = list.get(1);
                        vea veaVar2 = sdc.i;
                        if (!pa7.t(obj7, Boolean.FALSE) && obj7 != null) {
                            xtdVar = (xtd) ((a26) veaVar2.c).d(obj7);
                        }
                        xtdVar.getClass();
                        j00Var = new j00(xtdVar, iIntValue, iIntValue2, str);
                        break;
                    case 2:
                        Object obj8 = list.get(1);
                        vea veaVar3 = sdc.d;
                        if (!pa7.t(obj8, Boolean.FALSE) && obj8 != null) {
                            ftfVar = (ftf) ((a26) veaVar3.c).d(obj8);
                        }
                        ftfVar.getClass();
                        j00Var = new j00(ftfVar, iIntValue, iIntValue2, str);
                        break;
                    case 3:
                        Object obj9 = list.get(1);
                        vea veaVar4 = sdc.e;
                        if (!pa7.t(obj9, Boolean.FALSE) && obj9 != null) {
                            shfVar = (shf) ((a26) veaVar4.c).d(obj9);
                        }
                        shfVar.getClass();
                        j00Var = new j00(shfVar, iIntValue, iIntValue2, str);
                        break;
                    case 4:
                        Object obj10 = list.get(1);
                        vea veaVar5 = sdc.f;
                        if (!pa7.t(obj10, Boolean.FALSE) && obj10 != null) {
                            k68Var = (k68) ((a26) veaVar5.c).d(obj10);
                        }
                        k68Var.getClass();
                        j00Var = new j00(k68Var, iIntValue, iIntValue2, str);
                        break;
                    case 5:
                        Object obj11 = list.get(1);
                        vea veaVar6 = sdc.g;
                        if (!pa7.t(obj11, Boolean.FALSE) && obj11 != null) {
                            j68Var = (j68) ((a26) veaVar6.c).d(obj11);
                        }
                        j68Var.getClass();
                        j00Var = new j00(j68Var, iIntValue, iIntValue2, str);
                        break;
                    case 6:
                        Object obj12 = list.get(1);
                        String str2 = obj12 != null ? (String) obj12 : null;
                        str2.getClass();
                        j00Var = new j00(new m4e(str2), iIntValue, iIntValue2, str);
                        break;
                    default:
                        ap.c();
                        return null;
                }
                return j00Var;
            case 2:
                obj.getClass();
                return new w58(((Integer) obj).intValue());
            case 3:
                String str3 = obj != null ? (String) obj : null;
                str3.getClass();
                return new ftf(str3);
            case 4:
                String str4 = obj != null ? (String) obj : null;
                str4.getClass();
                return new shf(str4);
            case 5:
                obj.getClass();
                List list2 = (List) obj;
                Object obj13 = list2.get(0);
                rdc rdcVar = sdc.s;
                Boolean bool = Boolean.FALSE;
                pa7.t(obj13, bool);
                jme jmeVar = obj13 != null ? (jme) rdcVar.b.d(obj13) : null;
                jmeVar.getClass();
                int i3 = jmeVar.a;
                Object obj14 = list2.get(1);
                rdc rdcVar2 = sdc.t;
                pa7.t(obj14, bool);
                pne pneVar = obj14 != null ? (pne) rdcVar2.b.d(obj14) : null;
                pneVar.getClass();
                int i4 = pneVar.a;
                Object obj15 = list2.get(2);
                xue[] xueVarArr = wue.b;
                rdc rdcVar3 = sdc.x;
                pa7.t(obj15, bool);
                wue wueVar = obj15 != null ? (wue) rdcVar3.b.d(obj15) : null;
                wueVar.getClass();
                long j = wueVar.a;
                Object obj16 = list2.get(3);
                ete eteVar = ete.c;
                ete eteVar2 = (pa7.t(obj16, bool) || obj16 == null) ? null : (ete) ((a26) sdc.m.c).d(obj16);
                Object obj17 = list2.get(4);
                ofa ofaVar = (pa7.t(obj17, bool) || obj17 == null) ? null : (ofa) ((a26) kn2.w.c).d(obj17);
                Object obj18 = list2.get(5);
                y58 y58Var = y58.d;
                y58 y58Var2 = (pa7.t(obj18, bool) || obj18 == null) ? null : (y58) ((a26) sdc.C.c).d(obj18);
                Object obj19 = list2.get(6);
                q58 q58Var = (pa7.t(obj19, bool) || obj19 == null) ? null : (q58) ((a26) kn2.y.c).d(obj19);
                q58Var.getClass();
                int i5 = q58Var.a;
                Object obj20 = list2.get(7);
                rdc rdcVar4 = sdc.u;
                pa7.t(obj20, bool);
                ft6 ft6Var = obj20 != null ? (ft6) rdcVar4.b.d(obj20) : null;
                ft6Var.getClass();
                int i6 = ft6Var.a;
                Object obj21 = list2.get(8);
                vea veaVar7 = kn2.z;
                if (!pa7.t(obj21, bool) && obj21 != null) {
                    cueVar = (cue) ((a26) veaVar7.c).d(obj21);
                }
                return new ty9(i3, i4, j, eteVar2, ofaVar, y58Var2, i5, i6, cueVar);
            case 6:
                obj.getClass();
                List list3 = (List) obj;
                Object obj22 = list3.get(0);
                int i7 = y72.l;
                Boolean bool2 = Boolean.FALSE;
                pa7.t(obj22, bool2);
                if (obj22 != null) {
                    y72Var = obj22.equals(bool2) ? new y72(y72.k) : new y72(abg.c(((Integer) obj22).intValue()));
                } else {
                    y72Var = null;
                }
                y72Var.getClass();
                long j2 = y72Var.a;
                Object obj23 = list3.get(1);
                xue[] xueVarArr2 = wue.b;
                a26 a26Var = sdc.x.b;
                pa7.t(obj23, bool2);
                wue wueVar2 = obj23 != null ? (wue) a26Var.d(obj23) : null;
                wueVar2.getClass();
                long j3 = wueVar2.a;
                Object obj24 = list3.get(2);
                ar5 ar5Var = ar5.b;
                ar5 ar5Var2 = (pa7.t(obj24, bool2) || obj24 == null) ? null : (ar5) ((a26) sdc.n.c).d(obj24);
                Object obj25 = list3.get(3);
                wq5 wq5Var = (pa7.t(obj25, bool2) || obj25 == null) ? null : (wq5) ((a26) sdc.v.c).d(obj25);
                Object obj26 = list3.get(4);
                xq5 xq5Var = (pa7.t(obj26, bool2) || obj26 == null) ? null : (xq5) ((a26) sdc.w.c).d(obj26);
                Object obj27 = list3.get(6);
                String str5 = obj27 != null ? (String) obj27 : null;
                Object obj28 = list3.get(7);
                pa7.t(obj28, bool2);
                wue wueVar3 = obj28 != null ? (wue) a26Var.d(obj28) : null;
                wueVar3.getClass();
                long j4 = wueVar3.a;
                Object obj29 = list3.get(8);
                ou0 ou0Var = (pa7.t(obj29, bool2) || obj29 == null) ? null : (ou0) ((a26) sdc.o.c).d(obj29);
                Object obj30 = list3.get(9);
                cte cteVar = (pa7.t(obj30, bool2) || obj30 == null) ? null : (cte) ((a26) sdc.l.c).d(obj30);
                Object obj31 = list3.get(10);
                sd8 sd8Var = sd8.c;
                sd8 sd8Var2 = (pa7.t(obj31, bool2) || obj31 == null) ? null : (sd8) ((a26) sdc.A.c).d(obj31);
                Object obj32 = list3.get(11);
                pa7.t(obj32, bool2);
                if (obj32 != null) {
                    y72Var2 = obj32.equals(bool2) ? new y72(y72.k) : new y72(abg.c(((Integer) obj32).intValue()));
                } else {
                    y72Var2 = null;
                }
                y72Var2.getClass();
                long j5 = y72Var2.a;
                Object obj33 = list3.get(12);
                mne mneVar = (pa7.t(obj33, bool2) || obj33 == null) ? null : (mne) ((a26) sdc.k.c).d(obj33);
                Object obj34 = list3.get(13);
                o4d o4dVar2 = o4d.d;
                vea veaVar8 = sdc.q;
                if (!pa7.t(obj34, bool2) && obj34 != null) {
                    o4dVar = (o4d) ((a26) veaVar8.c).d(obj34);
                }
                return new xtd(j2, j3, ar5Var2, wq5Var, xq5Var, null, str5, j4, ou0Var, cteVar, sd8Var2, j5, mneVar, o4dVar, 49184);
            case 7:
                obj.getClass();
                List list4 = (List) obj;
                Object obj35 = list4.get(0);
                Boolean bool3 = obj35 != null ? (Boolean) obj35 : null;
                bool3.getClass();
                boolean zBooleanValue = bool3.booleanValue();
                Object obj36 = list4.get(1);
                vea veaVar9 = kn2.x;
                if (!pa7.t(obj36, Boolean.FALSE) && obj36 != null) {
                    xt4Var = (xt4) ((a26) veaVar9.c).d(obj36);
                }
                xt4Var.getClass();
                return new ofa(xt4Var.a, zBooleanValue);
            case 8:
                obj.getClass();
                return new xt4(((Integer) obj).intValue());
            case 9:
                obj.getClass();
                return new q58(((Integer) obj).intValue());
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                obj.getClass();
                List list5 = (List) obj;
                Object obj37 = list5.get(0);
                bue bueVar = (pa7.t(obj37, Boolean.FALSE) || obj37 == null) ? null : (bue) ((a26) kn2.X.c).d(obj37);
                bueVar.getClass();
                int i8 = bueVar.a;
                Object obj38 = list5.get(1);
                Boolean bool4 = obj38 != null ? (Boolean) obj38 : null;
                bool4.getClass();
                return new cue(i8, bool4.booleanValue());
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                obj.getClass();
                return new bue(((Integer) obj).intValue());
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                Map map = (Map) obj;
                map.getClass();
                x1f x1fVar = x1f.a;
                if (x1f.d()) {
                    x1f.h("screen_shot", m1f.a, new xq2(i2, map));
                }
                return wef.a;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return Integer.valueOf(((sgc) obj).b);
            case 14:
                return Integer.valueOf(((sgc) obj).c.b());
            case 15:
                return new ghc(((Integer) obj).intValue());
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((ra4) obj).getClass();
                String str6 = ir5.d;
                ir5.d = "ai.askquin.ui.draw.CardWheel";
                return new o02(str6, 2);
            case 17:
                ((SeasonalDraftStore$Draft) obj).getClass();
                return new SeasonalDraftStore$Draft((String) null, (String) null, (String) null, (String) null, (List) null, (List) null, 63, (rp3) null);
            case 18:
                my myVar = (my) obj;
                myVar.getClass();
                return (myVar.b() == tn4.a && myVar.d() == tn4.c) ? myVar.a(kn2.c0(rw4.m(b21.T(450, 0, null, 6), new hl4(i)).a(rw4.f(b21.T(450, 0, null, 6), 2)), rw4.o(b21.T(300, 0, null, 6), new pdc(19)).a(rw4.g(b21.T(300, 0, null, 6), 2))), new ild(false, hy.b)) : rs0.p(myVar);
            case 19:
                return Integer.valueOf(((Integer) obj).intValue() / 4);
            case 20:
                kv2.y((l1f) obj, "btn", "SR_XZ_startReading", "pathway", "SR_XZ_spreadResult");
                return wef.a;
            case 21:
                kv2.y((l1f) obj, "btn", "SR_XZ_startShuffle", "pathway", "SR_XZ_spreadPreview");
                return wef.a;
            case 22:
                kv2.y((l1f) obj, "btn", "SR_XZ_startDraw", "pathway", "SR_XZ_drawPreview");
                return wef.a;
            case 23:
                kv2.y((l1f) obj, "btn", "SR_XZ_physicalEntry", "pathway", "SR_XZ_spreadPreview");
                return wef.a;
            case 24:
                l1f l1fVar = (l1f) obj;
                l1fVar.getClass();
                l1fVar.a("SR_XZ_infoGender", "page_name");
                return wef.a;
            case 25:
                kv2.y((l1f) obj, "btn", "SR_XZ_infoGenderNext", "pathway", "SR_XZ_infoGender");
                return wef.a;
            case 26:
                SeasonalHistoryItem seasonalHistoryItem = (SeasonalHistoryItem) obj;
                seasonalHistoryItem.getClass();
                return seasonalHistoryItem.getYear() + "-" + seasonalHistoryItem.getSolarTerm();
            case 27:
                ((sn4) obj).getClass();
                return wef.a;
            case 28:
                qb9 qb9Var = (qb9) obj;
                qb9Var.getClass();
                SeasonalEntry seasonalEntry = SeasonalEntry.INSTANCE;
                seasonalEntry.getClass();
                qb9Var.h = seasonalEntry;
                qb9Var.e = false;
                qb9Var.a(-1);
                wef wefVar = wef.a;
                qb9Var.e = true;
                qb9Var.f = false;
                return wefVar;
            default:
                l1f l1fVar2 = (l1f) obj;
                l1fVar2.getClass();
                l1fVar2.a("SR_XZ_physicalDraw", "page_name");
                return wef.a;
        }
    }
}
