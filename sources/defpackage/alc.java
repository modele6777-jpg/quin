package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class alc implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ alc(String str, int i) {
        this.a = i;
        this.b = str;
    }

    /* JADX WARN: Code duplicated, block: B:94:0x01ac  */
    @Override // defpackage.a26
    public final Object d(Object obj) throws Exception {
        lbg lbgVar;
        vag vagVarU;
        int iH;
        int i = this.a;
        wef wefVar = wef.a;
        String str = this.b;
        switch (i) {
            case 0:
                l1f l1fVar = (l1f) obj;
                l1fVar.getClass();
                l1fVar.a(str, "page_name");
                return wefVar;
            case 1:
                kv2.y((l1f) obj, "page_name", "seasonal_reading_loading", "seasonal_period", str);
                return wefVar;
            case 2:
                l1f l1fVar2 = (l1f) obj;
                kv2.y(l1fVar2, "btn", "seasonal_reading_view_summary", "pathway", "seasonal_reading_reading");
                l1fVar2.a(str, "seasonal_period");
                return wefVar;
            case 3:
                l1f l1fVar3 = (l1f) obj;
                l1fVar3.getClass();
                l1fVar3.a(str, "seasonal_period");
                return wefVar;
            case 4:
                exc.f((hxc) obj, str);
                return wefVar;
            case 5:
                hxc hxcVar = (hxc) obj;
                hxcVar.getClass();
                exc.f(hxcVar, str);
                return wefVar;
            case 6:
                l1f l1fVar4 = (l1f) obj;
                l1fVar4.getClass();
                l1fVar4.a("rate_on_app_store", "btn");
                if (str != null) {
                    l1fVar4.a(str, "source");
                }
                return wefVar;
            case 7:
                kv2.y((l1f) obj, "pathway", "app_update_popup", "upgrade_type", str);
                return wefVar;
            case 8:
                String str2 = (String) obj;
                str2.getClass();
                if (v4e.Q(str2)) {
                    return str2.length() < str.length() ? str : str2;
                }
                return str.concat(str2);
            case 9:
                q8c q8cVar = (q8c) obj;
                q8cVar.getClass();
                x8c x8cVarW0 = q8cVar.W0("DELETE FROM SystemIdInfo where work_spec_id=?");
                try {
                    x8cVarW0.Q(1, str);
                    x8cVarW0.R0();
                    return wefVar;
                } finally {
                    x8cVarW0.close();
                }
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                l1f l1fVar5 = (l1f) obj;
                l1fVar5.getClass();
                l1fVar5.a("cardSale_detail", "btn");
                if (!v4e.Q(str)) {
                    l1fVar5.a(str, "pathway");
                }
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                wn7[] wn7VarArr = exc.a;
                ((hxc) obj).c(cxc.O, str);
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                l1f l1fVar6 = (l1f) obj;
                kv2.y(l1fVar6, "btn", "choose_theme", "choice", str);
                l1fVar6.a("account", "pathway");
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                kv2.y((l1f) obj, "to", str, "pathway", "account");
                return wefVar;
            case 14:
                l1f l1fVar7 = (l1f) obj;
                l1fVar7.getClass();
                l1fVar7.a(str, "theme");
                return wefVar;
            case 15:
                kv2.y((l1f) obj, "btn", "how_to_read_quin", "pathway", str);
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                l1f l1fVar8 = (l1f) obj;
                l1fVar8.getClass();
                l1fVar8.a(str, "method");
                return wefVar;
            case 17:
                q8c q8cVar2 = (q8c) obj;
                q8cVar2.getClass();
                x8c x8cVarW1 = q8cVar2.W0("SELECT name FROM workname WHERE work_spec_id=?");
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
            case 18:
                q8c q8cVar3 = (q8c) obj;
                q8cVar3.getClass();
                x8c x8cVarW2 = q8cVar3.W0("DELETE from WorkProgress where work_spec_id=?");
                try {
                    x8cVarW2.Q(1, str);
                    x8cVarW2.R0();
                    return wefVar;
                } finally {
                    x8cVarW2.close();
                }
            case 19:
                q8c q8cVar4 = (q8c) obj;
                q8cVar4.getClass();
                x8c x8cVarW3 = q8cVar4.W0("SELECT * FROM workspec WHERE id=?");
                try {
                    x8cVarW3.Q(1, str);
                    int iK = y8c.k(x8cVarW3, "id");
                    int iK2 = y8c.k(x8cVarW3, "state");
                    int iK3 = y8c.k(x8cVarW3, "worker_class_name");
                    int iK4 = y8c.k(x8cVarW3, "input_merger_class_name");
                    int iK5 = y8c.k(x8cVarW3, "input");
                    int iK6 = y8c.k(x8cVarW3, "output");
                    int iK7 = y8c.k(x8cVarW3, "initial_delay");
                    int iK8 = y8c.k(x8cVarW3, "interval_duration");
                    int iK9 = y8c.k(x8cVarW3, "flex_duration");
                    int iK10 = y8c.k(x8cVarW3, "run_attempt_count");
                    int iK11 = y8c.k(x8cVarW3, "backoff_policy");
                    int iK12 = y8c.k(x8cVarW3, "backoff_delay_duration");
                    int iK13 = y8c.k(x8cVarW3, "last_enqueue_time");
                    int iK14 = y8c.k(x8cVarW3, "minimum_retention_duration");
                    int iK15 = y8c.k(x8cVarW3, "schedule_requested_at");
                    int iK16 = y8c.k(x8cVarW3, "run_in_foreground");
                    int iK17 = y8c.k(x8cVarW3, "out_of_quota_policy");
                    int iK18 = y8c.k(x8cVarW3, "period_count");
                    int iK19 = y8c.k(x8cVarW3, "generation");
                    int iK20 = y8c.k(x8cVarW3, "next_schedule_time_override");
                    int iK21 = y8c.k(x8cVarW3, "next_schedule_time_override_generation");
                    int iK22 = y8c.k(x8cVarW3, "stop_reason");
                    int iK23 = y8c.k(x8cVarW3, "trace_tag");
                    int iK24 = y8c.k(x8cVarW3, "backoff_on_system_interruptions");
                    int iK25 = y8c.k(x8cVarW3, "required_network_type");
                    int iK26 = y8c.k(x8cVarW3, "required_network_request");
                    int iK27 = y8c.k(x8cVarW3, "requires_charging");
                    int iK28 = y8c.k(x8cVarW3, "requires_device_idle");
                    int iK29 = y8c.k(x8cVarW3, "requires_battery_not_low");
                    int iK30 = y8c.k(x8cVarW3, "requires_storage_not_low");
                    int iK31 = y8c.k(x8cVarW3, "trigger_content_update_delay");
                    int iK32 = y8c.k(x8cVarW3, "trigger_max_content_delay");
                    int iK33 = y8c.k(x8cVarW3, "content_uri_triggers");
                    if (x8cVarW3.R0()) {
                        String strT0 = x8cVarW3.t0(iK);
                        vag vagVarU2 = gcc.u((int) x8cVarW3.getLong(iK2));
                        String strT1 = x8cVarW3.t0(iK3);
                        String strT2 = x8cVarW3.t0(iK4);
                        byte[] blob = x8cVarW3.getBlob(iK5);
                        bb3 bb3Var = bb3.b;
                        bb3 bb3VarW = bm8.w(blob);
                        bb3 bb3VarW2 = bm8.w(x8cVarW3.getBlob(iK6));
                        long j = x8cVarW3.getLong(iK7);
                        long j2 = x8cVarW3.getLong(iK8);
                        long j3 = x8cVarW3.getLong(iK9);
                        int i2 = (int) x8cVarW3.getLong(iK10);
                        us0 us0VarR = gcc.r((int) x8cVarW3.getLong(iK11));
                        long j4 = x8cVarW3.getLong(iK12);
                        long j5 = x8cVarW3.getLong(iK13);
                        long j6 = x8cVarW3.getLong(iK14);
                        long j7 = x8cVarW3.getLong(iK15);
                        boolean z = ((int) x8cVarW3.getLong(iK16)) != 0;
                        rs9 rs9VarT = gcc.t((int) x8cVarW3.getLong(iK17));
                        int i3 = (int) x8cVarW3.getLong(iK18);
                        int i4 = (int) x8cVarW3.getLong(iK19);
                        long j8 = x8cVarW3.getLong(iK20);
                        int i5 = (int) x8cVarW3.getLong(iK21);
                        int i6 = (int) x8cVarW3.getLong(iK22);
                        String strT3 = x8cVarW3.isNull(iK23) ? null : x8cVarW3.t0(iK23);
                        Integer numValueOf = x8cVarW3.isNull(iK24) ? null : Integer.valueOf((int) x8cVarW3.getLong(iK24));
                        lbgVar = new lbg(strT0, vagVarU2, strT1, strT2, bb3VarW, bb3VarW2, j, j2, j3, new jl2(gcc.F(x8cVarW3.getBlob(iK26)), gcc.s((int) x8cVarW3.getLong(iK25)), ((int) x8cVarW3.getLong(iK27)) != 0, ((int) x8cVarW3.getLong(iK28)) != 0, ((int) x8cVarW3.getLong(iK29)) != 0, ((int) x8cVarW3.getLong(iK30)) != 0, x8cVarW3.getLong(iK31), x8cVarW3.getLong(iK32), gcc.e(x8cVarW3.getBlob(iK33))), i2, us0VarR, j4, j5, j6, j7, z, rs9VarT, i3, i4, j8, i5, i6, strT3, numValueOf != null ? Boolean.valueOf(numValueOf.intValue() != 0) : null);
                    } else {
                        lbgVar = null;
                    }
                    return lbgVar;
                } finally {
                    x8cVarW3.close();
                }
            case 20:
                q8c q8cVar5 = (q8c) obj;
                q8cVar5.getClass();
                x8c x8cVarW4 = q8cVar5.W0("SELECT state FROM workspec WHERE id=?");
                try {
                    x8cVarW4.Q(1, str);
                    if (x8cVarW4.R0()) {
                        Integer numValueOf2 = x8cVarW4.isNull(0) ? null : Integer.valueOf((int) x8cVarW4.getLong(0));
                        if (numValueOf2 != null) {
                            vagVarU = gcc.u(numValueOf2.intValue());
                        } else {
                            vagVarU = null;
                        }
                        break;
                    } else {
                        vagVarU = null;
                    }
                    return vagVarU;
                } finally {
                    x8cVarW4.close();
                }
            case 21:
                q8c q8cVar6 = (q8c) obj;
                q8cVar6.getClass();
                x8c x8cVarW5 = q8cVar6.W0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    x8cVarW5.Q(1, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (x8cVarW5.R0()) {
                        arrayList2.add(x8cVarW5.t0(0));
                    }
                    x8cVarW5.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    x8cVarW5.close();
                    throw th2;
                }
            case 22:
                q8c q8cVar7 = (q8c) obj;
                q8cVar7.getClass();
                x8c x8cVarW6 = q8cVar7.W0("UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?");
                try {
                    x8cVarW6.Q(1, str);
                    x8cVarW6.R0();
                    iH = r8c.h(q8cVar7);
                } finally {
                    x8cVarW6.close();
                }
                break;
            case 23:
                q8c q8cVar8 = (q8c) obj;
                q8cVar8.getClass();
                x8c x8cVarW7 = q8cVar8.W0("UPDATE workspec SET run_attempt_count=0 WHERE id=?");
                try {
                    x8cVarW7.Q(1, str);
                    x8cVarW7.R0();
                    iH = r8c.h(q8cVar8);
                } finally {
                    x8cVarW7.close();
                }
                break;
            case 24:
                q8c q8cVar9 = (q8c) obj;
                q8cVar9.getClass();
                x8c x8cVarW8 = q8cVar9.W0("UPDATE workspec SET period_count=period_count+1 WHERE id=?");
                try {
                    x8cVarW8.Q(1, str);
                    x8cVarW8.R0();
                    return wefVar;
                } finally {
                    x8cVarW8.close();
                }
            case 25:
                q8c q8cVar10 = (q8c) obj;
                q8cVar10.getClass();
                x8c x8cVarW9 = q8cVar10.W0("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                try {
                    x8cVarW9.Q(1, str);
                    ArrayList arrayList3 = new ArrayList();
                    while (x8cVarW9.R0()) {
                        byte[] blob2 = x8cVarW9.getBlob(0);
                        bb3 bb3Var2 = bb3.b;
                        arrayList3.add(bm8.w(blob2));
                    }
                    x8cVarW9.close();
                    return arrayList3;
                } catch (Throwable th3) {
                    x8cVarW9.close();
                    throw th3;
                }
            case 26:
                q8c q8cVar11 = (q8c) obj;
                q8cVar11.getClass();
                x8c x8cVarW10 = q8cVar11.W0("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?");
                try {
                    x8cVarW10.Q(1, str);
                    x8cVarW10.R0();
                    iH = r8c.h(q8cVar11);
                } finally {
                    x8cVarW10.close();
                }
                break;
            case 27:
                q8c q8cVar12 = (q8c) obj;
                q8cVar12.getClass();
                x8c x8cVarW11 = q8cVar12.W0("DELETE FROM workspec WHERE id=?");
                try {
                    x8cVarW11.Q(1, str);
                    x8cVarW11.R0();
                    return wefVar;
                } finally {
                    x8cVarW11.close();
                }
            case 28:
                q8c q8cVar13 = (q8c) obj;
                q8cVar13.getClass();
                x8c x8cVarW12 = q8cVar13.W0("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    x8cVarW12.Q(1, str);
                    ArrayList arrayList4 = new ArrayList();
                    while (x8cVarW12.R0()) {
                        String strT4 = x8cVarW12.t0(0);
                        vag vagVarU3 = gcc.u((int) x8cVarW12.getLong(1));
                        strT4.getClass();
                        jbg jbgVar = new jbg();
                        jbgVar.a = strT4;
                        jbgVar.b = vagVarU3;
                        arrayList4.add(jbgVar);
                    }
                    x8cVarW12.close();
                    return arrayList4;
                } catch (Throwable th4) {
                    x8cVarW12.close();
                    throw th4;
                }
            default:
                q8c q8cVar14 = (q8c) obj;
                q8cVar14.getClass();
                x8c x8cVarW13 = q8cVar14.W0("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
                try {
                    x8cVarW13.Q(1, str);
                    ArrayList arrayList5 = new ArrayList();
                    while (x8cVarW13.R0()) {
                        arrayList5.add(x8cVarW13.t0(0));
                    }
                    x8cVarW13.close();
                    return arrayList5;
                } catch (Throwable th5) {
                    x8cVarW13.close();
                    throw th5;
                }
        }
        return Integer.valueOf(iH);
    }
}
