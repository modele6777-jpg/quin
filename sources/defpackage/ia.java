package defpackage;

import ai.askquin.ui.conversation.PhysicalDeckReading;
import ai.askquin.ui.conversation.SceneTarot;
import ai.askquin.ui.persistence.database.InterruptedDrawing;
import ai.askquin.ui.persistence.database.d;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ia implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ ia(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) throws Exception {
        Object dzbVar;
        int i = this.a;
        Boolean boolValueOf = null;
        List list = null;
        li liVar = null;
        String strT0 = null;
        Instant instantI = null;
        String strT1 = null;
        Instant instantI2 = null;
        boolValueOf = null;
        boolean z = true;
        wef wefVar = wef.a;
        String str = this.b;
        switch (i) {
            case 0:
                l1f l1fVar = (l1f) obj;
                l1fVar.getClass();
                l1fVar.a(str, "reading_pack_test_group");
                return wefVar;
            case 1:
                l1f l1fVar2 = (l1f) obj;
                kv2.y(l1fVar2, "product_id", str, "trigger_by", "annual_fortune");
                l1fVar2.a("annual_fortune", "triggered_by");
                return wefVar;
            case 2:
                l1f l1fVar3 = (l1f) obj;
                kv2.y(l1fVar3, "product_id", str, "trigger_by", "annual_fortune");
                l1fVar3.a("annual_fortune", "triggered_by");
                return wefVar;
            case 3:
                l1f l1fVar4 = (l1f) obj;
                l1fVar4.getClass();
                l1fVar4.a(str, "product_id");
                return wefVar;
            case 4:
                hxc hxcVar = (hxc) obj;
                exc.j(hxcVar, 1);
                exc.k(hxcVar, str);
                return wefVar;
            case 5:
                exc.f((hxc) obj, str);
                return wefVar;
            case 6:
                jcc.l(str);
                return wefVar;
            case 7:
                hxc hxcVar2 = (hxc) obj;
                k00 k00Var = new k00(str);
                wn7[] wn7VarArr = exc.a;
                hxcVar2.c(cxc.C, t72.H(k00Var));
                exc.m(hxcVar2, 0);
                return wefVar;
            case 8:
                hxc hxcVar3 = (hxc) obj;
                k00 k00Var2 = new k00(str);
                wn7[] wn7VarArr2 = exc.a;
                hxcVar3.c(cxc.C, t72.H(k00Var2));
                exc.m(hxcVar3, 0);
                return wefVar;
            case 9:
                exc.k((hxc) obj, str);
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                hxc hxcVar4 = (hxc) obj;
                exc.j(hxcVar4, 0);
                exc.f(hxcVar4, str);
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                exc.k((hxc) obj, str);
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                q8c q8cVar = (q8c) obj;
                q8cVar.getClass();
                x8c x8cVarW0 = q8cVar.W0("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                try {
                    x8cVarW0.Q(1, str);
                    return Boolean.valueOf(x8cVarW0.R0() ? ((int) x8cVarW0.getLong(0)) != 0 : false);
                } finally {
                    x8cVarW0.close();
                }
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                q8c q8cVar2 = (q8c) obj;
                q8cVar2.getClass();
                x8c x8cVarW1 = q8cVar2.W0("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
                try {
                    x8cVarW1.Q(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (x8cVarW1.R0()) {
                        arrayList.add(x8cVarW1.t0(0));
                    }
                    x8cVarW1.close();
                    return arrayList;
                } catch (Throwable th) {
                    x8cVarW1.close();
                    throw th;
                }
            case 14:
                q8c q8cVar3 = (q8c) obj;
                q8cVar3.getClass();
                x8c x8cVarW2 = q8cVar3.W0("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                try {
                    x8cVarW2.Q(1, str);
                    return Boolean.valueOf(x8cVarW2.R0() ? ((int) x8cVarW2.getLong(0)) != 0 : false);
                } finally {
                    x8cVarW2.close();
                }
            case 15:
                hxc hxcVar5 = (hxc) obj;
                hxcVar5.getClass();
                wn7[] wn7VarArr3 = exc.a;
                gxc gxcVar = cxc.b;
                wn7 wn7Var = exc.a[0];
                gxcVar.getClass();
                hxcVar5.c(gxcVar, str);
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                q8c q8cVar4 = (q8c) obj;
                q8cVar4.getClass();
                x8c x8cVarW3 = q8cVar4.W0("SELECT isLocalOnly FROM divination WHERE id = ? LIMIT 1");
                try {
                    x8cVarW3.Q(1, str);
                    if (x8cVarW3.R0()) {
                        Integer numValueOf = x8cVarW3.isNull(0) ? null : Integer.valueOf((int) x8cVarW3.getLong(0));
                        if (numValueOf != null) {
                            if (numValueOf.intValue() == 0) {
                                z = false;
                            }
                            boolValueOf = Boolean.valueOf(z);
                        }
                        break;
                    }
                    return boolValueOf;
                } finally {
                    x8cVarW3.close();
                }
            case 17:
                q8c q8cVar5 = (q8c) obj;
                q8cVar5.getClass();
                x8c x8cVarW4 = q8cVar5.W0("SELECT syncedAt FROM divination WHERE id = ? LIMIT 1");
                try {
                    x8cVarW4.Q(1, str);
                    if (x8cVarW4.R0()) {
                        if (!x8cVarW4.isNull(0)) {
                            strT1 = x8cVarW4.t0(0);
                        }
                        instantI2 = yx4.i(strT1);
                        break;
                    }
                    return instantI2;
                } finally {
                    x8cVarW4.close();
                }
            case 18:
                q8c q8cVar6 = (q8c) obj;
                q8cVar6.getClass();
                x8c x8cVarW5 = q8cVar6.W0("SELECT deletedAt FROM divination WHERE id = ? LIMIT 1");
                try {
                    x8cVarW5.Q(1, str);
                    if (x8cVarW5.R0()) {
                        if (!x8cVarW5.isNull(0)) {
                            strT0 = x8cVarW5.t0(0);
                        }
                        instantI = yx4.i(strT0);
                        break;
                    }
                    return instantI;
                } finally {
                    x8cVarW5.close();
                }
            case 19:
                q8c q8cVar7 = (q8c) obj;
                q8cVar7.getClass();
                x8c x8cVarW6 = q8cVar7.W0("SELECT id FROM divination WHERE syncedAt IS NULL AND deletedAt IS NULL AND accountId = ?");
                try {
                    x8cVarW6.Q(1, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (x8cVarW6.R0()) {
                        arrayList2.add(x8cVarW6.t0(0));
                    }
                    x8cVarW6.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    x8cVarW6.close();
                    throw th2;
                }
            case 20:
                q8c q8cVar8 = (q8c) obj;
                q8cVar8.getClass();
                x8c x8cVarW7 = q8cVar8.W0("SELECT id FROM divination WHERE syncedAt IS NOT NULL AND deletedAt IS NULL AND accountId = ?");
                try {
                    x8cVarW7.Q(1, str);
                    ArrayList arrayList3 = new ArrayList();
                    while (x8cVarW7.R0()) {
                        arrayList3.add(x8cVarW7.t0(0));
                    }
                    x8cVarW7.close();
                    return arrayList3;
                } catch (Throwable th3) {
                    x8cVarW7.close();
                    throw th3;
                }
            case 21:
                q8c q8cVar9 = (q8c) obj;
                q8cVar9.getClass();
                x8c x8cVarW8 = q8cVar9.W0("SELECT aiRecommendedSpreads FROM divination WHERE id = ? LIMIT 1");
                try {
                    x8cVarW8.Q(1, str);
                    if (x8cVarW8.R0()) {
                        String strT2 = x8cVarW8.isNull(0) ? null : x8cVarW8.t0(0);
                        dd0 dd0Var = ki.a;
                        xh7 xh7Var = fzc.a;
                        dd0 dd0Var2 = ki.a;
                        if (strT2 != null) {
                            list = (List) xh7Var.b(dd0Var2, strT2);
                        }
                        liVar = new li(list);
                    }
                    return liVar;
                } finally {
                    x8cVarW8.close();
                }
            case 22:
                q8c q8cVar10 = (q8c) obj;
                q8cVar10.getClass();
                x8c x8cVarW9 = q8cVar10.W0("SELECT EXISTS(SELECT 1 FROM divination WHERE syncedAt IS NULL AND isLocalOnly = 0 AND deletedAt IS NULL AND accountId = ?)");
                try {
                    x8cVarW9.Q(1, str);
                    return Boolean.valueOf(x8cVarW9.R0() ? ((int) x8cVarW9.getLong(0)) != 0 : false);
                } finally {
                    x8cVarW9.close();
                }
            case 23:
                q8c q8cVar11 = (q8c) obj;
                q8cVar11.getClass();
                x8c x8cVarW10 = q8cVar11.W0("SELECT id,createAt,updateAt,drawnAt,title,messageCount,hasFeedback,sceneTarot,interruptedDrawing,divinationType,usedSkinType,selectedAiSpreadIndex,physicalDeckReading,previewMessage,readState,summaryCards,isLocalOnly FROM divination WHERE deletedAt IS NULL AND accountId = ? ORDER BY createAt DESC");
                try {
                    x8cVarW10.Q(1, str);
                    ArrayList arrayList4 = new ArrayList();
                    while (x8cVarW10.R0()) {
                        String strT3 = x8cVarW10.t0(0);
                        Instant instantI3 = yx4.i(x8cVarW10.isNull(1) ? null : x8cVarW10.t0(1));
                        if (instantI3 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                        }
                        Instant instantI4 = yx4.i(x8cVarW10.isNull(2) ? null : x8cVarW10.t0(2));
                        if (instantI4 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                        }
                        Instant instantI5 = yx4.i(x8cVarW10.isNull(3) ? null : x8cVarW10.t0(3));
                        String strT4 = x8cVarW10.t0(4);
                        int i2 = (int) x8cVarW10.getLong(5);
                        boolean z2 = ((int) x8cVarW10.getLong(6)) != 0;
                        String strT5 = x8cVarW10.isNull(7) ? null : x8cVarW10.t0(7);
                        xh7 xh7Var2 = fzc.a;
                        SceneTarot sceneTarot = strT5 == null ? null : (SceneTarot) xh7Var2.b(SceneTarot.Companion.serializer(), strT5);
                        String strT6 = x8cVarW10.isNull(8) ? null : x8cVarW10.t0(8);
                        InterruptedDrawing interruptedDrawing = strT6 == null ? null : (InterruptedDrawing) xh7Var2.b(InterruptedDrawing.Companion.serializer(), strT6);
                        String strT7 = x8cVarW10.isNull(9) ? null : x8cVarW10.t0(9);
                        String strT8 = x8cVarW10.isNull(10) ? null : x8cVarW10.t0(10);
                        Integer numValueOf2 = x8cVarW10.isNull(11) ? null : Integer.valueOf((int) x8cVarW10.getLong(11));
                        String strT9 = x8cVarW10.isNull(12) ? null : x8cVarW10.t0(12);
                        PhysicalDeckReading physicalDeckReading = strT9 == null ? null : (PhysicalDeckReading) xh7Var2.b(PhysicalDeckReading.Companion.serializer(), strT9);
                        String strT10 = x8cVarW10.t0(13);
                        String strT11 = x8cVarW10.t0(14);
                        strT11.getClass();
                        try {
                            dzbVar = tdb.valueOf(strT11);
                        } catch (Throwable th4) {
                            dzbVar = new dzb(th4);
                        }
                        tdb tdbVar = tdb.b;
                        boolean z3 = dzbVar instanceof dzb;
                        Object obj2 = dzbVar;
                        if (z3) {
                            obj2 = tdbVar;
                        }
                        arrayList4.add(new lc4(strT3, instantI3, instantI4, instantI5, strT4, i2, z2, sceneTarot, interruptedDrawing, strT7, strT8, numValueOf2, physicalDeckReading, strT10, (tdb) obj2, d.b(x8cVarW10.isNull(15) ? null : x8cVarW10.t0(15)), ((int) x8cVarW10.getLong(16)) != 0));
                        break;
                    }
                    x8cVarW10.close();
                    return arrayList4;
                } catch (Throwable th5) {
                    x8cVarW10.close();
                    throw th5;
                }
            case 24:
                q8c q8cVar12 = (q8c) obj;
                q8cVar12.getClass();
                x8c x8cVarW11 = q8cVar12.W0("UPDATE divination SET accountId = ? WHERE accountId = ''");
                try {
                    x8cVarW11.Q(1, str);
                    x8cVarW11.R0();
                    return Integer.valueOf(r8c.h(q8cVar12));
                } finally {
                    x8cVarW11.close();
                }
            case 25:
                ot8 ot8Var = (ot8) obj;
                ot8Var.getClass();
                return Boolean.valueOf((ot8Var instanceof mh6) && pa7.t(((mh6) ot8Var).getId(), str));
            case 26:
                kv2.y((l1f) obj, "btn", "listen_reading", "pathway", str);
                return wefVar;
            case 27:
                kv2.y((l1f) obj, "btn", "choose_preset_question", "question", str);
                return wefVar;
            case 28:
                kv2.y((l1f) obj, "btn", "playcard_entry", "pathway", str);
                return wefVar;
            default:
                hxc hxcVar6 = (hxc) obj;
                hxcVar6.getClass();
                hxcVar6.c(cxc.A, str.concat("-checkbox"));
                return wefVar;
        }
    }

    public /* synthetic */ ia(String str, vb4 vb4Var, int i) {
        this.a = i;
        this.b = str;
    }
}
