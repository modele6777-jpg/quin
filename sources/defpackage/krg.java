package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.adjust.sdk.sig.r3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import tech.chatmind.api.credits.UsageBillingBalance;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class krg extends wbh {
    public final irg e;
    public final d82 f;
    public static final String[] g = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] v = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};
    public static final String[] w = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] x = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;", "last_diagnostics_signal_upload_timestamp", "ALTER TABLE apps ADD COLUMN last_diagnostics_signal_upload_timestamp INTEGER;"};
    public static final String[] y = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;", "elapsed_time", "ALTER TABLE raw_events ADD COLUMN elapsed_time INTEGER;"};
    public static final String[] z = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] X = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] Y = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] Z = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public static final String[] E0 = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    public static final String[] F0 = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    public krg(ich ichVar) {
        super(ichVar);
        this.f = new d82(((w3h) this.b).y);
        qqg qqgVar = ((w3h) this.b).d;
        this.e = new irg(this, ((w3h) this.b).a);
    }

    public static final String f1(List list) {
        return list.isEmpty() ? "" : ib8.j(" AND (upload_type IN (", TextUtils.join(", ", list), "))");
    }

    public static final void n1(ContentValues contentValues, Object obj) {
        oa7.x("value");
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
            return;
        }
        if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            qc0.j("Invalid value type");
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0110  */
    /* JADX WARN: Code duplicated, block: B:39:0x0116  */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x00f0: MOVE (r7 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:241), block:B:29:0x00f0 */
    public final wog A1(String str, String str2) throws Throwable {
        String str3;
        Cursor cursorQuery;
        Cursor cursor;
        w3h w3hVar = (w3h) this.b;
        oa7.x(str);
        oa7.x(str2);
        A0();
        B0();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = r1().query("conditional_properties", new String[]{"origin", "value", UsageBillingBalance.STATUS_ACTIVE, "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    String str4 = string;
                    Object objN0 = N0(cursorQuery, 1);
                    boolean z2 = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j = cursorQuery.getLong(4);
                    lch lchVar = this.c.g;
                    ich.S(lchVar);
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<hsg> creator = hsg.CREATOR;
                    hsg hsgVar = (hsg) lchVar.d1(blob, creator);
                    long j2 = cursorQuery.getLong(6);
                    ich.S(lchVar);
                    hsg hsgVar2 = (hsg) lchVar.d1(cursorQuery.getBlob(7), creator);
                    long j3 = cursorQuery.getLong(8);
                    long j4 = cursorQuery.getLong(9);
                    ich.S(lchVar);
                    str3 = str2;
                    try {
                        wog wogVar = new wog(str, str4, new mch(j3, objN0, str3, str4), j2, z2, string2, hsgVar, j, hsgVar2, j4, (hsg) lchVar.d1(cursorQuery.getBlob(10), creator));
                        if (cursorQuery.moveToNext()) {
                            w0h w0hVar = w3hVar.f;
                            w3h.h(w0hVar);
                            w0hVar.g.c(w0h.E0(str), w3hVar.x.c(str3), "Got multiple records for conditional property, expected one");
                        }
                        cursorQuery.close();
                        return wogVar;
                    } catch (SQLiteException e) {
                        e = e;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    str3 = str2;
                }
            } catch (SQLiteException e3) {
                e = e3;
                str3 = str2;
                cursorQuery = null;
            } catch (Throwable th) {
                th = th;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            cursor2 = cursor;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        w0h w0hVar2 = w3hVar.f;
        w3h.h(w0hVar2);
        w0hVar2.g.d("Error querying conditional property", w0h.E0(str), w3hVar.x.c(str3), e);
    }

    public final void B1(String str, String str2) {
        oa7.x(str);
        oa7.x(str2);
        A0();
        B0();
        try {
            r1().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            w3h w3hVar = (w3h) this.b;
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.g.d("Error deleting conditional property", w0h.E0(str), w3hVar.x.c(str2), e);
        }
    }

    public final List C1(String str, String str2, String str3) {
        oa7.x(str);
        A0();
        B0();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return D1(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @Override // defpackage.wbh
    public final void D0() {
        w3h w3hVar = (w3h) this.b;
        if (w3hVar.d.L0(null, bzg.e1)) {
            m3h m3hVar = w3hVar.g;
            w3h.h(m3hVar);
            m3hVar.J0(new jfg(8, this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    public final List D1(String str, String[] strArr) {
        w3h w3hVar = (w3h) this.b;
        A0();
        B0();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseR1 = r1();
                String[] strArr2 = {"app_id", "origin", "name", "value", UsageBillingBalance.STATUS_ACTIVE, "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"};
                qqg qqgVar = w3hVar.d;
                cursorQuery = sQLiteDatabaseR1.query("conditional_properties", strArr2, str, strArr, null, null, "rowid", "1001");
                if (cursorQuery.moveToFirst()) {
                    do {
                        if (arrayList.size() >= 1000) {
                            w0h w0hVar = w3hVar.f;
                            w3h.h(w0hVar);
                            w0hVar.g.b(1000, "Read more than the max allowed conditional properties, ignoring extra");
                            break;
                        }
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        String string3 = cursorQuery.getString(2);
                        Object objN0 = N0(cursorQuery, 3);
                        boolean z2 = cursorQuery.getInt(4) != 0;
                        String string4 = cursorQuery.getString(5);
                        long j = cursorQuery.getLong(6);
                        lch lchVar = this.c.g;
                        ich.S(lchVar);
                        byte[] blob = cursorQuery.getBlob(7);
                        Parcelable.Creator<hsg> creator = hsg.CREATOR;
                        hsg hsgVar = (hsg) lchVar.d1(blob, creator);
                        long j2 = cursorQuery.getLong(8);
                        ich.S(lchVar);
                        hsg hsgVar2 = (hsg) lchVar.d1(cursorQuery.getBlob(9), creator);
                        long j3 = cursorQuery.getLong(10);
                        long j4 = cursorQuery.getLong(11);
                        ich.S(lchVar);
                        arrayList.add(new wog(string, string2, new mch(j3, objN0, string3, string2), j2, z2, string4, hsgVar, j, hsgVar2, j4, (hsg) lchVar.d1(cursorQuery.getBlob(12), creator)));
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e) {
                w0h w0hVar2 = w3hVar.f;
                w3h.h(w0hVar2);
                w0hVar2.g.b(e, "Error querying conditional user property value");
                arrayList = Collections.EMPTY_LIST;
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    public final long E0(String str, t3h t3hVar, String str2, Map map, s8h s8hVar, Long l) {
        int iDelete;
        w3h w3hVar = (w3h) this.b;
        A0();
        B0();
        oa7.A(t3hVar);
        oa7.x(str);
        A0();
        B0();
        if (l1()) {
            ich ichVar = this.c;
            long jA = ichVar.w.g.a();
            hj6 hj6Var = w3hVar.y;
            w0h w0hVar = w3hVar.f;
            hj6Var.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jA) > ((Long) bzg.M.a(null)).longValue()) {
                ichVar.w.g.b(jElapsedRealtime);
                A0();
                B0();
                if (l1() && (iDelete = r1().delete("upload_queue", e1(), new String[0])) > 0) {
                    w3h.h(w0hVar);
                    w0hVar.Z.b(Integer.valueOf(iDelete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                }
                oa7.x(str);
                A0();
                B0();
                try {
                    int iJ0 = w3hVar.d.J0(str, bzg.A);
                    if (iJ0 > 0) {
                        r1().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iJ0)});
                    }
                } catch (SQLiteException e) {
                    w3h.h(w0hVar);
                    w0hVar.g.c(w0h.E0(str), e, "Error deleting over the limit queued batches. appId");
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb.append(str3);
            sb.append("=");
            sb.append(str4);
            arrayList.add(sb.toString());
        }
        byte[] bArrA = t3hVar.a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", bArrA);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", TextUtils.join("\r\n", arrayList));
        contentValues.put("upload_type", Integer.valueOf(s8hVar.a()));
        hj6 hj6Var2 = w3hVar.y;
        w0h w0hVar2 = w3hVar.f;
        hj6Var2.getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l != null) {
            contentValues.put("associated_row_id", l);
        }
        try {
            long jInsert = r1().insert("upload_queue", null, contentValues);
            if (jInsert != -1) {
                return jInsert;
            }
            w3h.h(w0hVar2);
            w0hVar2.g.b(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
            return -1L;
        } catch (SQLiteException e2) {
            w3h.h(w0hVar2);
            w0hVar2.g.c(str, e2, "Error storing MeasurementBatch to upload_queue. appId");
            return -1L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:131:0x0407  */
    public final k1h E1(String str) {
        Cursor cursorQuery;
        Boolean boolValueOf;
        String string;
        w3h w3hVar = (w3h) this.b;
        oa7.x(str);
        A0();
        B0();
        Cursor cursor = null;
        try {
            cursorQuery = r1().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility", "last_diagnostics_signal_upload_timestamp"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        ich ichVar = this.c;
                        k1h k1hVar = new k1h(ichVar.z, str);
                        w3h w3hVar2 = k1hVar.a;
                        q5h q5hVarA = ichVar.a(str);
                        o5h o5hVar = o5h.ANALYTICS_STORAGE;
                        if (q5hVarA.i(o5hVar)) {
                            k1hVar.G(cursorQuery.getString(0));
                        }
                        boolean z2 = true;
                        k1hVar.I(cursorQuery.getString(1));
                        if (ichVar.a(str).i(o5h.AD_STORAGE)) {
                            k1hVar.J(cursorQuery.getString(2));
                        }
                        k1hVar.e(cursorQuery.getLong(3));
                        k1hVar.M(cursorQuery.getLong(4));
                        k1hVar.N(cursorQuery.getLong(5));
                        k1hVar.P(cursorQuery.getString(6));
                        k1hVar.S(cursorQuery.getString(7));
                        k1hVar.T(cursorQuery.getLong(8));
                        k1hVar.a(cursorQuery.getLong(9));
                        k1hVar.d(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                        k1hVar.i(cursorQuery.getLong(11));
                        k1hVar.j(cursorQuery.getLong(12));
                        k1hVar.k(cursorQuery.getLong(13));
                        k1hVar.l(cursorQuery.getLong(14));
                        k1hVar.f(cursorQuery.getLong(15));
                        k1hVar.g(cursorQuery.getLong(16));
                        k1hVar.R(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                        k1hVar.L(cursorQuery.getString(18));
                        k1hVar.n(cursorQuery.getLong(19));
                        k1hVar.m(cursorQuery.getLong(20));
                        k1hVar.w(cursorQuery.getString(21));
                        boolean z3 = cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0;
                        m3h m3hVar = w3hVar2.g;
                        w3h.h(m3hVar);
                        m3hVar.A0();
                        k1hVar.R |= k1hVar.p != z3;
                        k1hVar.p = z3;
                        k1hVar.c(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                        if (!cursorQuery.isNull(26)) {
                            k1hVar.y(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                        }
                        if (ichVar.a(str).i(o5hVar)) {
                            String string2 = cursorQuery.getString(28);
                            m3h m3hVar2 = w3hVar2.g;
                            w3h.h(m3hVar2);
                            m3hVar2.A0();
                            k1hVar.R |= !Objects.equals(k1hVar.t, string2);
                            k1hVar.t = string2;
                        }
                        boolean z4 = (cursorQuery.isNull(29) || cursorQuery.getInt(29) == 0) ? false : true;
                        m3h m3hVar3 = w3hVar2.g;
                        w3h.h(m3hVar3);
                        m3hVar3.A0();
                        k1hVar.R |= k1hVar.u != z4;
                        k1hVar.u = z4;
                        k1hVar.r(cursorQuery.getLong(39));
                        String string3 = cursorQuery.getString(36);
                        m3h m3hVar4 = w3hVar2.g;
                        w3h.h(m3hVar4);
                        m3hVar4.A0();
                        k1hVar.R |= k1hVar.C != string3;
                        k1hVar.C = string3;
                        k1hVar.A(cursorQuery.getLong(30));
                        k1hVar.B(cursorQuery.getLong(31));
                        upg.a();
                        if (w3hVar.d.L0(str, bzg.O0)) {
                            int i = cursorQuery.getInt(32);
                            m3h m3hVar5 = w3hVar2.g;
                            w3h.h(m3hVar5);
                            m3hVar5.A0();
                            k1hVar.R |= k1hVar.x != i;
                            k1hVar.x = i;
                            k1hVar.C(cursorQuery.getLong(35));
                        }
                        boolean z5 = (cursorQuery.isNull(33) || cursorQuery.getInt(33) == 0) ? false : true;
                        m3h m3hVar6 = w3hVar2.g;
                        w3h.h(m3hVar6);
                        m3hVar6.A0();
                        k1hVar.R |= k1hVar.y != z5;
                        k1hVar.y = z5;
                        if (cursorQuery.isNull(34)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getInt(34) != 0);
                        }
                        m3h m3hVar7 = w3hVar2.g;
                        w3h.h(m3hVar7);
                        m3hVar7.A0();
                        k1hVar.R |= !Objects.equals(k1hVar.q, boolValueOf);
                        k1hVar.q = boolValueOf;
                        k1hVar.p(cursorQuery.getInt(37));
                        k1hVar.q(cursorQuery.getInt(38));
                        if (cursorQuery.isNull(40)) {
                            string = "";
                        } else {
                            string = cursorQuery.getString(40);
                            oa7.A(string);
                        }
                        m3h m3hVar8 = w3hVar2.g;
                        w3h.h(m3hVar8);
                        m3hVar8.A0();
                        k1hVar.R |= k1hVar.G != string;
                        k1hVar.G = string;
                        if (!cursorQuery.isNull(41)) {
                            Long lValueOf = Long.valueOf(cursorQuery.getLong(41));
                            m3h m3hVar9 = w3hVar2.g;
                            w3h.h(m3hVar9);
                            m3hVar9.A0();
                            k1hVar.R |= !Objects.equals(k1hVar.z, lValueOf);
                            k1hVar.z = lValueOf;
                        }
                        if (!cursorQuery.isNull(42)) {
                            Long lValueOf2 = Long.valueOf(cursorQuery.getLong(42));
                            m3h m3hVar10 = w3hVar2.g;
                            w3h.h(m3hVar10);
                            m3hVar10.A0();
                            k1hVar.R |= !Objects.equals(k1hVar.A, lValueOf2);
                            k1hVar.A = lValueOf2;
                        }
                        byte[] blob = cursorQuery.getBlob(43);
                        m3h m3hVar11 = w3hVar2.g;
                        w3h.h(m3hVar11);
                        m3hVar11.A0();
                        k1hVar.R |= k1hVar.H != blob;
                        k1hVar.H = blob;
                        if (!cursorQuery.isNull(44)) {
                            int i2 = cursorQuery.getInt(44);
                            m3h m3hVar12 = w3hVar2.g;
                            w3h.h(m3hVar12);
                            m3hVar12.A0();
                            boolean z6 = k1hVar.R;
                            if (k1hVar.I == i2) {
                                z2 = false;
                            }
                            k1hVar.R = z2 | z6;
                            k1hVar.I = i2;
                        }
                        if (w3hVar.d.L0(str, bzg.j1) && !cursorQuery.isNull(45)) {
                            k1hVar.u(cursorQuery.getLong(45));
                        }
                        m3h m3hVar13 = w3hVar2.g;
                        w3h.h(m3hVar13);
                        m3hVar13.A0();
                        k1hVar.R = false;
                        if (cursorQuery.moveToNext()) {
                            w0h w0hVar = w3hVar.f;
                            w3h.h(w0hVar);
                            w0hVar.g.b(w0h.E0(str), "Got multiple records for app, expected one. appId");
                        }
                        cursorQuery.close();
                        return k1hVar;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e) {
                e = e;
                w0h w0hVar2 = w3hVar.f;
                w3h.h(w0hVar2);
                w0hVar2.g.c(w0h.E0(str), e, "Error querying app. appId");
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public final List F0(String str, sbh sbhVar, int i) {
        ?? arrayList;
        oa7.x(str);
        A0();
        B0();
        Cursor cursorQuery = null;
        try {
            SQLiteDatabase sQLiteDatabaseR1 = r1();
            String[] strArr = {"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"};
            String strF1 = f1(sbhVar.a);
            String strE1 = e1();
            StringBuilder sb = new StringBuilder(strF1.length() + 17 + strE1.length());
            sb.append("app_id=?");
            sb.append(strF1);
            sb.append(" AND NOT ");
            sb.append(strE1);
            cursorQuery = sQLiteDatabaseR1.query("upload_queue", strArr, sb.toString(), new String[]{str}, null, null, "creation_timestamp ASC", i > 0 ? String.valueOf(i) : null);
            arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                kch kchVarD1 = d1(str, cursorQuery.getLong(0), cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                if (kchVarD1 != null) {
                    arrayList.add(kchVarD1);
                }
            }
        } catch (SQLiteException e) {
            w0h w0hVar = ((w3h) this.b).f;
            w3h.h(w0hVar);
            w0hVar.g.c(str, e, "Error to querying MeasurementBatch from upload_queue. appId");
            arrayList = Collections.EMPTY_LIST;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        return arrayList;
    }

    public final void F1(k1h k1hVar, boolean z2) {
        w3h w3hVar = (w3h) this.b;
        w3h w3hVar2 = k1hVar.a;
        A0();
        B0();
        String strE = k1hVar.E();
        oa7.A(strE);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strE);
        o5h o5hVar = o5h.ANALYTICS_STORAGE;
        ich ichVar = this.c;
        if (z2) {
            contentValues.put("app_instance_id", (String) null);
        } else if (ichVar.a(strE).i(o5hVar)) {
            contentValues.put("app_instance_id", k1hVar.F());
        }
        contentValues.put("gmp_app_id", k1hVar.H());
        if (ichVar.a(strE).i(o5h.AD_STORAGE)) {
            m3h m3hVar = w3hVar2.g;
            w3h.h(m3hVar);
            m3hVar.A0();
            contentValues.put("resettable_device_id_hash", k1hVar.e);
        }
        m3h m3hVar2 = w3hVar2.g;
        w3h.h(m3hVar2);
        m3hVar2.A0();
        contentValues.put("last_bundle_index", Long.valueOf(k1hVar.g));
        m3h m3hVar3 = w3hVar2.g;
        w3h.h(m3hVar3);
        m3hVar3.A0();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(k1hVar.h));
        m3h m3hVar4 = w3hVar2.g;
        w3h.h(m3hVar4);
        m3hVar4.A0();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(k1hVar.i));
        contentValues.put("app_version", k1hVar.O());
        m3h m3hVar5 = w3hVar2.g;
        w3h.h(m3hVar5);
        m3hVar5.A0();
        contentValues.put("app_store", k1hVar.l);
        m3h m3hVar6 = w3hVar2.g;
        w3h.h(m3hVar6);
        m3hVar6.A0();
        contentValues.put("gmp_version", Long.valueOf(k1hVar.m));
        m3h m3hVar7 = w3hVar2.g;
        w3h.h(m3hVar7);
        m3hVar7.A0();
        contentValues.put("dev_cert_hash", Long.valueOf(k1hVar.n));
        m3h m3hVar8 = w3hVar2.g;
        w3h.h(m3hVar8);
        m3hVar8.A0();
        contentValues.put("measurement_enabled", Boolean.valueOf(k1hVar.o));
        m3h m3hVar9 = w3hVar2.g;
        m3h m3hVar10 = w3hVar2.g;
        w3h.h(m3hVar9);
        m3hVar9.A0();
        contentValues.put("day", Long.valueOf(k1hVar.K));
        w3h.h(m3hVar10);
        m3hVar10.A0();
        contentValues.put("daily_public_events_count", Long.valueOf(k1hVar.L));
        w3h.h(m3hVar10);
        m3hVar10.A0();
        contentValues.put("daily_events_count", Long.valueOf(k1hVar.M));
        w3h.h(m3hVar10);
        m3hVar10.A0();
        contentValues.put("daily_conversions_count", Long.valueOf(k1hVar.N));
        m3h m3hVar11 = w3hVar2.g;
        w3h.h(m3hVar11);
        m3hVar11.A0();
        contentValues.put("config_fetched_time", Long.valueOf(k1hVar.S));
        m3h m3hVar12 = w3hVar2.g;
        w3h.h(m3hVar12);
        m3hVar12.A0();
        contentValues.put("failed_config_fetch_time", Long.valueOf(k1hVar.T));
        contentValues.put("app_version_int", Long.valueOf(k1hVar.Q()));
        contentValues.put("firebase_instance_id", k1hVar.K());
        w3h.h(m3hVar10);
        m3hVar10.A0();
        contentValues.put("daily_error_events_count", Long.valueOf(k1hVar.O));
        w3h.h(m3hVar10);
        m3hVar10.A0();
        contentValues.put("daily_realtime_events_count", Long.valueOf(k1hVar.P));
        w3h.h(m3hVar10);
        m3hVar10.A0();
        contentValues.put("health_monitor_sample", k1hVar.Q);
        contentValues.put("android_id", (Long) 0L);
        m3h m3hVar13 = w3hVar2.g;
        w3h.h(m3hVar13);
        m3hVar13.A0();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(k1hVar.p));
        contentValues.put("dynamite_version", Long.valueOf(k1hVar.b()));
        if (ichVar.a(strE).i(o5hVar)) {
            m3h m3hVar14 = w3hVar2.g;
            w3h.h(m3hVar14);
            m3hVar14.A0();
            contentValues.put("session_stitching_token", k1hVar.t);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(k1hVar.z()));
        m3h m3hVar15 = w3hVar2.g;
        w3h.h(m3hVar15);
        m3hVar15.A0();
        contentValues.put("target_os_version", Long.valueOf(k1hVar.v));
        m3h m3hVar16 = w3hVar2.g;
        w3h.h(m3hVar16);
        m3hVar16.A0();
        contentValues.put("session_stitching_token_hash", Long.valueOf(k1hVar.w));
        upg.a();
        qqg qqgVar = w3hVar.d;
        w0h w0hVar = w3hVar.f;
        if (qqgVar.L0(strE, bzg.O0)) {
            m3h m3hVar17 = w3hVar2.g;
            w3h.h(m3hVar17);
            m3hVar17.A0();
            contentValues.put("ad_services_version", Integer.valueOf(k1hVar.x));
            m3h m3hVar18 = w3hVar2.g;
            w3h.h(m3hVar18);
            m3hVar18.A0();
            contentValues.put("attribution_eligibility_status", Long.valueOf(k1hVar.B));
        }
        m3h m3hVar19 = w3hVar2.g;
        w3h.h(m3hVar19);
        m3hVar19.A0();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(k1hVar.y));
        contentValues.put("npa_metadata_value", k1hVar.x());
        m3h m3hVar20 = w3hVar2.g;
        w3h.h(m3hVar20);
        m3hVar20.A0();
        contentValues.put("bundle_delivery_index", Long.valueOf(k1hVar.F));
        contentValues.put("sgtm_preview_key", k1hVar.D());
        w3h.h(m3hVar10);
        m3hVar10.A0();
        contentValues.put("dma_consent_state", Integer.valueOf(k1hVar.D));
        w3h.h(m3hVar10);
        m3hVar10.A0();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(k1hVar.E));
        contentValues.put("serialized_npa_metadata", k1hVar.s());
        contentValues.put("client_upload_eligibility", Integer.valueOf(k1hVar.t()));
        m3h m3hVar21 = w3hVar2.g;
        w3h.h(m3hVar21);
        m3hVar21.A0();
        ArrayList arrayList = k1hVar.s;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                w3h.h(w0hVar);
                w0hVar.x.b(strE, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        ((gpg) fpg.b.a.get()).getClass();
        if (qqgVar.L0(null, bzg.K0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        m3h m3hVar22 = w3hVar2.g;
        w3h.h(m3hVar22);
        m3hVar22.A0();
        contentValues.put("unmatched_pfo", k1hVar.z);
        m3h m3hVar23 = w3hVar2.g;
        w3h.h(m3hVar23);
        m3hVar23.A0();
        contentValues.put("unmatched_uwa", k1hVar.A);
        m3h m3hVar24 = w3hVar2.g;
        w3h.h(m3hVar24);
        m3hVar24.A0();
        contentValues.put("ad_campaign_info", k1hVar.H);
        if (qqgVar.L0(strE, bzg.j1)) {
            m3h m3hVar25 = w3hVar2.g;
            w3h.h(m3hVar25);
            m3hVar25.A0();
            contentValues.put("last_diagnostics_signal_upload_timestamp", Long.valueOf(k1hVar.J));
        }
        try {
            SQLiteDatabase sQLiteDatabaseR1 = r1();
            if (sQLiteDatabaseR1.update("apps", contentValues, "app_id = ?", new String[]{strE}) == 0 && sQLiteDatabaseR1.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                w3h.h(w0hVar);
                w0hVar.g.b(w0h.E0(strE), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e) {
            w3h.h(w0hVar);
            w0hVar.g.c(w0h.E0(strE), e, "Error storing app. appId");
        }
    }

    public final boolean G0(String str) {
        s8h[] s8hVarArr = {s8h.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(s8hVarArr[0].a()));
        String strF1 = f1(arrayList);
        String strE1 = e1();
        return W0(ks0.m(new StringBuilder((strF1.length() + 61) + strE1.length()), "SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?", strF1, " AND NOT ", strE1), new String[]{str}) != 0;
    }

    public final drg G1(long j, String str, boolean z2, boolean z3, boolean z4, boolean z5) {
        return H1(j, str, 1L, false, false, z2, false, z3, z4, z5);
    }

    public final void H0(Long l) {
        w3h w3hVar = (w3h) this.b;
        A0();
        B0();
        try {
            if (r1().delete("upload_queue", "rowid=?", new String[]{l.toString()}) != 1) {
                w0h w0hVar = w3hVar.f;
                w3h.h(w0hVar);
                w0hVar.x.a("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e) {
            w0h w0hVar2 = w3hVar.f;
            w3h.h(w0hVar2);
            w0hVar2.g.b(e, "Failed to delete a MeasurementBatch in a upload_queue table");
            throw e;
        }
    }

    public final drg H1(long j, String str, long j2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        w3h w3hVar = (w3h) this.b;
        oa7.x(str);
        A0();
        B0();
        String[] strArr = {str};
        drg drgVar = new drg();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseR1 = r1();
                cursorQuery = sQLiteDatabaseR1.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getLong(0) == j) {
                        drgVar.b = cursorQuery.getLong(1);
                        drgVar.a = cursorQuery.getLong(2);
                        drgVar.c = cursorQuery.getLong(3);
                        drgVar.d = cursorQuery.getLong(4);
                        drgVar.e = cursorQuery.getLong(5);
                        drgVar.f = cursorQuery.getLong(6);
                        drgVar.g = cursorQuery.getLong(7);
                    }
                    if (z2) {
                        drgVar.b += j2;
                    }
                    if (z3) {
                        drgVar.a += j2;
                    }
                    if (z4) {
                        drgVar.c += j2;
                    }
                    if (z5) {
                        drgVar.d += j2;
                    }
                    if (z6) {
                        drgVar.e += j2;
                    }
                    if (z7) {
                        drgVar.f += j2;
                    }
                    if (z8) {
                        drgVar.g += j2;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j));
                    contentValues.put("daily_public_events_count", Long.valueOf(drgVar.a));
                    contentValues.put("daily_events_count", Long.valueOf(drgVar.b));
                    contentValues.put("daily_conversions_count", Long.valueOf(drgVar.c));
                    contentValues.put("daily_error_events_count", Long.valueOf(drgVar.d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(drgVar.e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(drgVar.f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(drgVar.g));
                    sQLiteDatabaseR1.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    w0h w0hVar = w3hVar.f;
                    w3h.h(w0hVar);
                    w0hVar.x.b(w0h.E0(str), "Not updating daily counts, app is not known. appId");
                }
            } catch (SQLiteException e) {
                w0h w0hVar2 = w3hVar.f;
                w3h.h(w0hVar2);
                w0hVar2.g.c(w0h.E0(str), e, "Error updating daily counts. appId");
            }
            return drgVar;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public final String I0() throws Throwable {
        SQLiteException e;
        Cursor cursorRawQuery;
        SQLiteDatabase sQLiteDatabaseR1 = r1();
        ?? r1 = 0;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseR1.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        String string = cursorRawQuery.getString(0);
                        cursorRawQuery.close();
                        return string;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    w0h w0hVar = ((w3h) this.b).f;
                    w3h.h(w0hVar);
                    w0hVar.g.b(e, "Database error getting next bundle app id");
                }
            } catch (SQLiteException e3) {
                e = e3;
                cursorRawQuery = null;
            } catch (Throwable th) {
                th = th;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            r1 = sQLiteDatabaseR1;
            if (r1 != 0) {
                r1.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
    /* JADX WARN: Code duplicated, block: B:35:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public final psd I1(String str) {
        Throwable th;
        Cursor cursorQuery;
        w3h w3hVar = (w3h) this.b;
        oa7.x(str);
        A0();
        B0();
        ?? r2 = 0;
        try {
            try {
                cursorQuery = r1().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        byte[] blob = cursorQuery.getBlob(0);
                        String string = cursorQuery.getString(1);
                        String string2 = cursorQuery.getString(2);
                        if (cursorQuery.moveToNext()) {
                            w0h w0hVar = w3hVar.f;
                            w3h.h(w0hVar);
                            w0hVar.g.b(w0h.E0(str), "Got multiple records for app config, expected one. appId");
                        }
                        if (blob != null) {
                            psd psdVar = new psd(blob, string, string2, 21);
                            cursorQuery.close();
                            return psdVar;
                        }
                    }
                } catch (SQLiteException e) {
                    e = e;
                    w0h w0hVar2 = w3hVar.f;
                    w3h.h(w0hVar2);
                    w0hVar2.g.c(w0h.E0(str), e, "Error querying remote config. appId");
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursorQuery = null;
            } catch (Throwable th2) {
                th = th2;
                if (r2 != 0) {
                    throw th;
                }
                r2.close();
                throw th;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            r2 = this;
            if (r2 != 0) {
                throw th;
            }
            r2.close();
            throw th;
        }
    }

    public final void J0(long j) {
        A0();
        B0();
        try {
            if (r1().delete("queue", "rowid=?", new String[]{String.valueOf(j)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e) {
            w0h w0hVar = ((w3h) this.b).f;
            w3h.h(w0hVar);
            w0hVar.g.b(e, "Failed to delete a bundle in a queue table");
            throw e;
        }
    }

    public final void J1(z3h z3hVar, boolean z2) {
        A0();
        B0();
        oa7.x(z3hVar.r());
        if (!z3hVar.e2()) {
            r3.l();
            return;
        }
        K0();
        w3h w3hVar = (w3h) this.b;
        hj6 hj6Var = w3hVar.y;
        w0h w0hVar = w3hVar.f;
        hj6Var.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jF2 = z3hVar.f2();
        azg azgVar = bzg.R;
        if (jF2 < jCurrentTimeMillis - ((Long) azgVar.a(null)).longValue() || z3hVar.f2() > ((Long) azgVar.a(null)).longValue() + jCurrentTimeMillis) {
            w3h.h(w0hVar);
            w0hVar.x.d("Storing bundle outside of the max uploading time span. appId, now, timestamp", w0h.E0(z3hVar.r()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(z3hVar.f2()));
        }
        byte[] bArrA = z3hVar.a();
        try {
            lch lchVar = this.c.g;
            ich.S(lchVar);
            byte[] bArrK1 = lchVar.k1(bArrA);
            w3h.h(w0hVar);
            w0hVar.Z.b(Integer.valueOf(bArrK1.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", z3hVar.r());
            contentValues.put("bundle_end_timestamp", Long.valueOf(z3hVar.f2()));
            contentValues.put("data", bArrK1);
            contentValues.put("has_realtime", Integer.valueOf(z2 ? 1 : 0));
            if (z3hVar.r0()) {
                contentValues.put("retry_count", Integer.valueOf(z3hVar.s0()));
            }
            try {
                if (r1().insert("queue", null, contentValues) == -1) {
                    w3h.h(w0hVar);
                    w0hVar.g.b(w0h.E0(z3hVar.r()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e) {
                w3h.h(w0hVar);
                w0hVar.g.c(w0h.E0(z3hVar.r()), e, "Error storing bundle. appId");
            }
        } catch (IOException e2) {
            w3h.h(w0hVar);
            w0hVar.g.c(w0h.E0(z3hVar.r()), e2, "Data loss. Failed to serialize bundle. appId");
        }
    }

    public final void K0() {
        A0();
        B0();
        if (l1()) {
            ich ichVar = this.c;
            long jA = ichVar.w.f.a();
            w3h w3hVar = (w3h) this.b;
            w3hVar.y.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jA) > ((Long) bzg.M.a(null)).longValue()) {
                ichVar.w.f.b(jElapsedRealtime);
                A0();
                B0();
                if (l1()) {
                    SQLiteDatabase sQLiteDatabaseR1 = r1();
                    w3hVar.y.getClass();
                    int iDelete = sQLiteDatabaseR1.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) bzg.R.a(null)).longValue())});
                    if (iDelete > 0) {
                        w0h w0hVar = w3hVar.f;
                        w3h.h(w0hVar);
                        w0hVar.Z.b(Integer.valueOf(iDelete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final void L0(ArrayList arrayList) {
        w3h w3hVar = (w3h) this.b;
        A0();
        B0();
        oa7.A(arrayList);
        if (arrayList.size() == 0) {
            qc0.j("Given Integer is zero");
            return;
        }
        if (l1()) {
            String strJoin = TextUtils.join(",", arrayList);
            String strM = ib8.m(new StringBuilder(String.valueOf(strJoin).length() + 2), "(", strJoin, ")");
            if (W0(ib8.m(new StringBuilder(strM.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", strM, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                w0h w0hVar = w3hVar.f;
                w3h.h(w0hVar);
                w0hVar.x.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseR1 = r1();
                StringBuilder sb = new StringBuilder(strM.length() + 127);
                sb.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb.append(strM);
                sb.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseR1.execSQL(sb.toString());
            } catch (SQLiteException e) {
                w0h w0hVar2 = w3hVar.f;
                w3h.h(w0hVar2);
                w0hVar2.g.b(e, "Error incrementing retry count. error");
            }
        }
    }

    public final void M0(Long l) {
        w3h w3hVar = (w3h) this.b;
        A0();
        B0();
        if (l1()) {
            StringBuilder sb = new StringBuilder(l.toString().length() + 86);
            sb.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb.append(l);
            sb.append(" AND retry_count =  2147483647 LIMIT 1");
            if (W0(sb.toString(), null) > 0) {
                w0h w0hVar = w3hVar.f;
                w3h.h(w0hVar);
                w0hVar.x.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseR1 = r1();
                w3hVar.y.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sb2 = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 60);
                sb2.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb2.append(jCurrentTimeMillis);
                String string = sb2.toString();
                StringBuilder sb3 = new StringBuilder(string.length() + 34 + l.toString().length() + 29);
                sb3.append("UPDATE upload_queue");
                sb3.append(string);
                sb3.append(" WHERE rowid = ");
                sb3.append(l);
                sb3.append(" AND retry_count < 2147483647");
                sQLiteDatabaseR1.execSQL(sb3.toString());
            } catch (SQLiteException e) {
                w0h w0hVar2 = w3hVar.f;
                w3h.h(w0hVar2);
                w0hVar2.g.b(e, "Error incrementing retry count. error");
            }
        }
    }

    public final Object N0(Cursor cursor, int i) {
        w3h w3hVar = (w3h) this.b;
        int type = cursor.getType(i);
        if (type == 0) {
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.g.a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i));
        }
        if (type == 3) {
            return cursor.getString(i);
        }
        if (type != 4) {
            w0h w0hVar2 = w3hVar.f;
            w3h.h(w0hVar2);
            w0hVar2.g.b(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
            return null;
        }
        w0h w0hVar3 = w3hVar.f;
        w3h.h(w0hVar3);
        w0hVar3.g.a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0093 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x00a6 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
    public final long O0(String str) {
        long j;
        ContentValues contentValues;
        w3h w3hVar = (w3h) this.b;
        oa7.x(str);
        oa7.x("first_open_count");
        A0();
        B0();
        SQLiteDatabase sQLiteDatabaseR1 = r1();
        sQLiteDatabaseR1.beginTransaction();
        long j2 = 0;
        try {
            try {
                StringBuilder sb = new StringBuilder(48);
                sb.append("select first_open_count from app2 where app_id=?");
                j = -1;
                long jX0 = X0(sb.toString(), new String[]{str}, -1L);
                if (jX0 == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseR1.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        w0h w0hVar = w3hVar.f;
                        w3h.h(w0hVar);
                        w0hVar.g.c(w0h.E0(str), "first_open_count", "Failed to insert column (got -1). appId");
                    } else {
                        jX0 = 0;
                        try {
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str);
                            contentValues.put("first_open_count", Long.valueOf(1 + jX0));
                            if (sQLiteDatabaseR1.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                                w0h w0hVar2 = w3hVar.f;
                                w3h.h(w0hVar2);
                                w0hVar2.g.c(w0h.E0(str), "first_open_count", "Failed to update column (got 0). appId");
                            } else {
                                sQLiteDatabaseR1.setTransactionSuccessful();
                                j = jX0;
                            }
                        } catch (SQLiteException e) {
                            e = e;
                            j2 = jX0;
                            w0h w0hVar3 = w3hVar.f;
                            w3h.h(w0hVar3);
                            w0hVar3.g.d("Error inserting column. appId", w0h.E0(str), "first_open_count", e);
                            j = j2;
                        }
                    }
                } else {
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", Long.valueOf(1 + jX0));
                    if (sQLiteDatabaseR1.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                        w0h w0hVar4 = w3hVar.f;
                        w3h.h(w0hVar4);
                        w0hVar4.g.c(w0h.E0(str), "first_open_count", "Failed to update column (got 0). appId");
                    } else {
                        sQLiteDatabaseR1.setTransactionSuccessful();
                        j = jX0;
                    }
                }
            } finally {
                sQLiteDatabaseR1.endTransaction();
            }
        } catch (SQLiteException e2) {
            e = e2;
        }
        return j;
    }

    public final boolean P0(String str, String str2) {
        return W0("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    public final void Q0(List list) {
        oa7.A(list);
        A0();
        B0();
        StringBuilder sb = new StringBuilder("rowid in (");
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(((Long) list.get(i)).longValue());
        }
        sb.append(")");
        int iDelete = r1().delete("raw_events", sb.toString(), null);
        if (iDelete != list.size()) {
            w0h w0hVar = ((w3h) this.b).f;
            w3h.h(w0hVar);
            w0hVar.g.c(Integer.valueOf(iDelete), Integer.valueOf(list.size()), "Deleted fewer rows from raw events table than expected");
        }
    }

    public final long R0(String str) {
        oa7.x(str);
        return X0("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final void S0(String str, Long l, long j, v2h v2hVar) {
        A0();
        B0();
        oa7.A(v2hVar);
        oa7.x(str);
        w3h w3hVar = (w3h) this.b;
        byte[] bArrA = v2hVar.a();
        w0h w0hVar = w3hVar.f;
        w0h w0hVar2 = w3hVar.f;
        w3h.h(w0hVar);
        w0hVar.Z.c(w3hVar.x.a(str), Integer.valueOf(bArrA.length), "Saving complex main event, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", bArrA);
        try {
            if (r1().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                w3h.h(w0hVar2);
                w0hVar2.g.b(w0h.E0(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e) {
            w3h.h(w0hVar2);
            w0hVar2.g.c(w0h.E0(str), e, "Error storing complex main event. appId");
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[LOOP:2: B:51:0x011f->B:127:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0117  */
    /* JADX WARN: Code duplicated, block: B:53:0x0125  */
    public final void T0(String str, Long l, String str2, Bundle bundle) {
        xj0 xj0Var;
        w0h w0hVar;
        Bundle bundle2;
        String str3;
        long j;
        ContentValues contentValues;
        w0h w0hVar2;
        z3h z3hVar;
        Iterator it;
        krg krgVar = this;
        String str4 = str;
        w3h w3hVar = (w3h) krgVar.b;
        oa7.A(bundle);
        krgVar.A0();
        krgVar.B0();
        if (l != null) {
            long jLongValue = l.longValue();
            xj0Var = new xj0();
            xj0Var.c = krgVar;
            oa7.x(str4);
            xj0Var.b = str4;
            xj0Var.a = krgVar.X0("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str4, String.valueOf(jLongValue)}, -1L);
        } else {
            xj0Var = new xj0();
            xj0Var.c = krgVar;
            oa7.x(str4);
            xj0Var.b = str4;
            xj0Var.a = -1L;
        }
        xj0 xj0Var2 = xj0Var;
        List<frg> listJ = xj0Var2.j();
        while (!listJ.isEmpty()) {
            for (frg frgVar : listJ) {
                try {
                    if (!TextUtils.isEmpty(str2)) {
                        Cursor cursor = null;
                        z3h z3hVar2 = null;
                        Cursor cursor2 = null;
                        try {
                            try {
                                Cursor cursorQuery = krgVar.r1().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str4, Long.toString(frgVar.b)}, null, null, "rowid", "2");
                                try {
                                    try {
                                        if (cursorQuery.moveToFirst()) {
                                            try {
                                                z3hVar = (z3h) ((u3h) lch.l1(z3h.W(), cursorQuery.getBlob(0))).e();
                                                try {
                                                    if (cursorQuery.moveToNext()) {
                                                        w0h w0hVar3 = w3hVar.f;
                                                        w3h.h(w0hVar3);
                                                        w0hVar3.x.b(w0h.E0(str4), "Get multiple raw event metadata records, expected one. appId");
                                                    }
                                                    cursorQuery.close();
                                                    cursorQuery.close();
                                                } catch (SQLiteException e) {
                                                    e = e;
                                                    cursor = cursorQuery;
                                                    w0h w0hVar4 = w3hVar.f;
                                                    w3h.h(w0hVar4);
                                                    w0hVar4.g.c(w0h.E0(str4), e, "Data loss. Error selecting raw event. appId");
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                }
                                                z3hVar2 = z3hVar;
                                            } catch (IOException e2) {
                                                w0h w0hVar5 = w3hVar.f;
                                                w3h.h(w0hVar5);
                                                w0hVar5.g.c(w0h.E0(str4), e2, "Data loss. Failed to merge raw event metadata. appId");
                                                cursorQuery.close();
                                            }
                                            if (z3hVar2 != null) {
                                                it = z3hVar2.X1().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        if (((p4h) it.next()).t().equals(str2)) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            w0h w0hVar6 = w3hVar.f;
                                            w3h.h(w0hVar6);
                                            w0hVar6.g.b(w0h.E0(str4), "Raw event metadata record is missing. appId");
                                        }
                                        cursorQuery.close();
                                    } catch (Throwable th) {
                                        th = th;
                                        cursor2 = cursorQuery;
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteException e3) {
                                    e = e3;
                                    z3hVar = null;
                                }
                            } catch (SQLiteException e4) {
                                e = e4;
                                z3hVar = null;
                            }
                            if (z3hVar2 != null) {
                                it = z3hVar2.X1().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((p4h) it.next()).t().equals(str2)) {
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    long jUpdate = r1().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j)});
                    if (jUpdate != 1) {
                        w3h.h(w0hVar);
                        w0hVar2 = w0hVar;
                        try {
                            w0hVar2.g.c(w0h.E0(str3), Long.valueOf(jUpdate), "Failed to update raw event. appId, updatedRows");
                        } catch (SQLiteException e5) {
                            e = e5;
                            w3h.h(w0hVar2);
                            w0hVar2.g.c(w0h.E0(str3), e, "Error updating raw event. appId");
                        }
                    }
                } catch (SQLiteException e6) {
                    e = e6;
                    w0hVar2 = w0hVar;
                }
                lch lchVar = krgVar.c.g;
                ich.S(lchVar);
                v2h v2hVar = frgVar.d;
                Bundle bundle3 = new Bundle();
                for (e3h e3hVar : v2hVar.t()) {
                    if (e3hVar.z()) {
                        bundle3.putDouble(e3hVar.s(), e3hVar.A());
                    } else if (e3hVar.x()) {
                        bundle3.putFloat(e3hVar.s(), e3hVar.y());
                    } else if (e3hVar.v()) {
                        bundle3.putLong(e3hVar.s(), e3hVar.w());
                    } else if (e3hVar.t()) {
                        bundle3.putString(e3hVar.s(), e3hVar.u());
                    } else if (e3hVar.B().isEmpty()) {
                        w0h w0hVar7 = ((w3h) lchVar.b).f;
                        w3h.h(w0hVar7);
                        w0hVar7.g.b(e3hVar, "Unexpected parameter type for parameter");
                    } else {
                        bundle3.putParcelableArray(e3hVar.s(), lch.n1(e3hVar.B()));
                    }
                }
                String string = bundle3.getString("_o");
                bundle3.remove("_o");
                String strW = v2hVar.w();
                if (string == null) {
                    string = "";
                }
                qch qchVar = w3hVar.w;
                w0hVar = w3hVar.f;
                w3h.f(qchVar);
                if (strW.equals("_cmp")) {
                    bundle2 = new Bundle(bundle);
                    for (String str5 : bundle.keySet()) {
                        frg frgVar2 = frgVar;
                        if (str5.startsWith("gad_")) {
                            bundle2.remove(str5);
                        }
                        frgVar = frgVar2;
                    }
                } else {
                    bundle2 = bundle;
                }
                frg frgVar3 = frgVar;
                qchVar.N0(bundle3, bundle2);
                yl ylVar = new yl((w3h) krgVar.b, string, str4, v2hVar.w(), v2hVar.y(), v2hVar.G(), v2hVar.A(), bundle3);
                str3 = (String) ylVar.e;
                j = frgVar3.a;
                long j2 = frgVar3.b;
                boolean z2 = frgVar3.c;
                A0();
                B0();
                oa7.x(str3);
                ich.S(lchVar);
                byte[] bArrA = lchVar.a1(ylVar).a();
                contentValues = new ContentValues();
                contentValues.put("app_id", str3);
                contentValues.put("name", (String) ylVar.f);
                contentValues.put("timestamp", Long.valueOf(ylVar.b));
                contentValues.put("metadata_fingerprint", Long.valueOf(j2));
                contentValues.put("data", bArrA);
                contentValues.put("realtime", Integer.valueOf(z2 ? 1 : 0));
                contentValues.put("elapsed_time", Long.valueOf(ylVar.c));
                krgVar = this;
                str4 = str;
            }
            listJ = xj0Var2.j();
            krgVar = this;
            str4 = str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0061 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v0, types: [krg, m4, wbh] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.database.Cursor] */
    public final q5h U0(String str) {
        Throwable th;
        SQLiteException e;
        w3h w3hVar = (w3h) this.b;
        oa7.A(str);
        A0();
        B0();
        ?? r2 = 0;
        q5hVarC = null;
        q5hVarC = null;
        q5h q5hVarC = null;
        try {
            try {
                this = r1().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str});
                try {
                    if (this.moveToFirst()) {
                        q5hVarC = q5h.c(this.getInt(1), this.getString(0));
                    } else {
                        w0h w0hVar = w3hVar.f;
                        w3h.h(w0hVar);
                        w0hVar.Z.a("No data found");
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    w0h w0hVar2 = w3hVar.f;
                    w3h.h(w0hVar2);
                    w0hVar2.g.b(e, "Error querying database.");
                    if (this != 0) {
                    }
                    if (q5hVarC == null) {
                        return q5h.c;
                    }
                    return q5hVarC;
                }
            } catch (SQLiteException e3) {
                e = e3;
                this = 0;
            } catch (Throwable th2) {
                th = th2;
                if (r2 != 0) {
                    r2.close();
                }
                throw th;
            }
            this.close();
            if (q5hVarC == null) {
                return q5h.c;
            }
            return q5hVarC;
        } catch (Throwable th3) {
            th = th3;
            r2 = this;
            if (r2 != 0) {
                r2.close();
            }
            throw th;
        }
    }

    public final void V0(String str, kbh kbhVar) {
        A0();
        B0();
        oa7.x(str);
        w3h w3hVar = (w3h) this.b;
        hj6 hj6Var = w3hVar.y;
        w0h w0hVar = w3hVar.f;
        hj6Var.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        azg azgVar = bzg.u0;
        long jLongValue = jCurrentTimeMillis - ((Long) azgVar.a(null)).longValue();
        long j = kbhVar.b;
        if (j < jLongValue || j > ((Long) azgVar.a(null)).longValue() + jCurrentTimeMillis) {
            w3h.h(w0hVar);
            w0hVar.x.d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", w0h.E0(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j));
        }
        w3h.h(w0hVar);
        w0hVar.Z.a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", kbhVar.a);
        contentValues.put("source", Integer.valueOf(kbhVar.c));
        contentValues.put("timestamp_millis", Long.valueOf(j));
        try {
            if (r1().insert("trigger_uris", null, contentValues) == -1) {
                w3h.h(w0hVar);
                w0hVar.g.b(w0h.E0(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e) {
            w3h.h(w0hVar);
            w0hVar.g.c(w0h.E0(str), e, "Error storing trigger URI. appId");
        }
    }

    public final long W0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = r1().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e) {
                w0h w0hVar = ((w3h) this.b).f;
                w3h.h(w0hVar);
                w0hVar.g.c(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long X0(String str, String[] strArr, long j) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = r1().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    j = cursorRawQuery.getLong(0);
                }
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e) {
                w0h w0hVar = ((w3h) this.b).f;
                w3h.h(w0hVar);
                w0hVar.g.c(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    public final String Y0(String str, String[] strArr) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = r1().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return "";
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e) {
                w0h w0hVar = ((w3h) this.b).f;
                w3h.h(w0hVar);
                w0hVar.g.c(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        throw th;
    }

    public final void Z0(ContentValues contentValues) {
        w3h w3hVar = (w3h) this.b;
        try {
            SQLiteDatabase sQLiteDatabaseR1 = r1();
            String asString = contentValues.getAsString("app_id");
            if (asString == null) {
                w0h w0hVar = w3hVar.f;
                w3h.h(w0hVar);
                w0hVar.w.b(w0h.E0("app_id"), "Value of the primary key is not set.");
                return;
            }
            StringBuilder sb = new StringBuilder(10);
            sb.append("app_id = ?");
            if (sQLiteDatabaseR1.update("consent_settings", contentValues, sb.toString(), new String[]{asString}) == 0 && sQLiteDatabaseR1.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                w0h w0hVar2 = w3hVar.f;
                w3h.h(w0hVar2);
                w0hVar2.g.c(w0h.E0("consent_settings"), w0h.E0("app_id"), "Failed to insert/update table (got -1). key");
            }
        } catch (SQLiteException e) {
            w0h w0hVar3 = w3hVar.f;
            w3h.h(w0hVar3);
            w0hVar3.g.d("Error storing into table. key", w0h.E0("consent_settings"), w0h.E0("app_id"), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0129  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v5 */
    public final bsg a1(String str, String str2, String str3) {
        Cursor cursorQuery;
        Boolean boolValueOf;
        w3h w3hVar = (w3h) this.b;
        oa7.x(str2);
        oa7.x(str3);
        A0();
        B0();
        ArrayList arrayList = new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count"));
        ?? r3 = 0;
        try {
            try {
                cursorQuery = r1().query(str, (String[]) arrayList.toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j = cursorQuery.getLong(0);
                        long j2 = cursorQuery.getLong(1);
                        long j3 = cursorQuery.getLong(2);
                        long j4 = 0;
                        long j5 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                        Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                        Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                        Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                        if (cursorQuery.isNull(7)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                        }
                        if (!cursorQuery.isNull(8)) {
                            j4 = cursorQuery.getLong(8);
                        }
                        bsg bsgVar = new bsg(str2, str3, j, j2, j4, j3, j5, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                        if (cursorQuery.moveToNext()) {
                            w0h w0hVar = w3hVar.f;
                            w3h.h(w0hVar);
                            w0hVar.g.b(w0h.E0(str2), "Got multiple records for event aggregates, expected one. appId");
                        }
                        cursorQuery.close();
                        return bsgVar;
                    }
                } catch (SQLiteException e) {
                    e = e;
                    w0h w0hVar2 = w3hVar.f;
                    w3h.h(w0hVar2);
                    w0hVar2.g.d("Error querying events. appId", w0h.E0(str2), w3hVar.x.a(str3), e);
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursorQuery = null;
            } catch (Throwable th) {
                th = th;
                if (r3 != 0) {
                    r3.close();
                }
                throw th;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            r3 = arrayList;
            if (r3 != 0) {
                r3.close();
            }
            throw th;
        }
    }

    public final void b1(String str, bsg bsgVar) {
        w3h w3hVar = (w3h) this.b;
        oa7.A(bsgVar);
        A0();
        B0();
        ContentValues contentValues = new ContentValues();
        String str2 = bsgVar.a;
        contentValues.put("app_id", str2);
        contentValues.put("name", bsgVar.b);
        contentValues.put("lifetime_count", Long.valueOf(bsgVar.c));
        contentValues.put("current_bundle_count", Long.valueOf(bsgVar.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(bsgVar.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(bsgVar.g));
        contentValues.put("last_bundled_day", bsgVar.h);
        contentValues.put("last_sampled_complex_event_id", bsgVar.i);
        contentValues.put("last_sampling_rate", bsgVar.j);
        contentValues.put("current_session_count", Long.valueOf(bsgVar.e));
        Boolean bool = bsgVar.k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (r1().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                w0h w0hVar = w3hVar.f;
                w3h.h(w0hVar);
                w0hVar.g.b(w0h.E0(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e) {
            w0h w0hVar2 = w3hVar.f;
            w3h.h(w0hVar2);
            w0hVar2.g.c(w0h.E0(str2), e, "Error storing event aggregates. appId");
        }
    }

    public final void c1(String str, String str2) {
        oa7.x(str2);
        A0();
        B0();
        try {
            r1().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e) {
            w0h w0hVar = ((w3h) this.b).f;
            w3h.h(w0hVar);
            w0hVar.g.c(w0h.E0(str2), e, "Error deleting snapshot. appId");
        }
    }

    public final kch d1(String str, long j, byte[] bArr, String str2, String str3, int i, int i2, long j2, long j3, long j4) {
        w3h w3hVar = (w3h) this.b;
        if (TextUtils.isEmpty(str2)) {
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.Y.a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            n3h n3hVar = (n3h) lch.l1(t3h.y(), bArr);
            s8h s8hVarB = s8h.b(i);
            if (s8hVarB != s8h.GOOGLE_SIGNAL && s8hVarB != s8h.GOOGLE_SIGNAL_PENDING && i2 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = Collections.unmodifiableList(((t3h) n3hVar.b).r()).iterator();
                while (it.hasNext()) {
                    u3h u3hVar = (u3h) ((z3h) it.next()).i();
                    u3hVar.c();
                    ((z3h) u3hVar.b).V0(i2);
                    arrayList.add((z3h) u3hVar.e());
                }
                n3hVar.c();
                ((t3h) n3hVar.b).D();
                n3hVar.c();
                ((t3h) n3hVar.b).C(arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                for (String str4 : str3.split("\r\n")) {
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit = str4.split("=", 2);
                    if (strArrSplit.length != 2) {
                        w0h w0hVar2 = w3hVar.f;
                        w3h.h(w0hVar2);
                        w0hVar2.g.b(str4, "Invalid upload header: ");
                        break;
                    }
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            return new kch(j, (t3h) n3hVar.e(), str2, map, s8hVarB, j2, j3, j4, i2);
        } catch (IOException e) {
            w0h w0hVar3 = w3hVar.f;
            w3h.h(w0hVar3);
            w0hVar3.g.c(str, e, "Failed to queued MeasurementBatch from upload_queue. appId");
            return null;
        }
    }

    public final String e1() {
        ((w3h) this.b).y.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        s8h s8hVar = s8h.GOOGLE_SIGNAL;
        int iA = s8hVar.a();
        Long l = (Long) bzg.S.a(null);
        l.getClass();
        String str = "(upload_type = " + iA + " AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + l + ")";
        String str2 = "(upload_type != " + s8hVar.a() + " AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + ((Long) bzg.R.a(null)).longValue() + ")";
        StringBuilder sb = new StringBuilder(str.length() + 5 + str2.length() + 1);
        ub3.v(sb, "(", str, " OR ", str2);
        sb.append(")");
        return sb.toString();
    }

    public final void g1(String str, q5h q5hVar) {
        oa7.A(str);
        oa7.A(q5hVar);
        A0();
        B0();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", q5hVar.g());
        contentValues.put("consent_source", Integer.valueOf(q5hVar.b));
        Z0(contentValues);
    }

    public final List h1(String str) {
        List list;
        String string;
        w3h w3hVar = (w3h) this.b;
        A0();
        B0();
        ArrayList arrayList = new ArrayList();
        try {
            SQLiteDatabase sQLiteDatabaseR1 = r1();
            sQLiteDatabaseR1.beginTransaction();
            Cursor cursorQuery = null;
            try {
                try {
                    cursorQuery = sQLiteDatabaseR1.query("diagnostic_signals", new String[]{"signal_name", "metadata", "count"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                    if (cursorQuery.moveToFirst()) {
                        boolean zIsEmpty = str.isEmpty();
                        do {
                            String string2 = cursorQuery.getString(0);
                            if (cursorQuery.isNull(1)) {
                                string = "";
                            } else {
                                string = cursorQuery.getString(1);
                                oa7.A(string);
                            }
                            if (string2 == null) {
                                w0h w0hVar = w3hVar.f;
                                w3h.h(w0hVar);
                                w0hVar.g.b(w0h.E0(str), "Read null value from diagnostic signals table, ignoring it. appId");
                            } else {
                                long j = cursorQuery.getLong(2);
                                eyg eygVarR = gyg.r();
                                eygVarR.c();
                                ((gyg) eygVarR.b).s(string2);
                                eygVarR.c();
                                ((gyg) eygVarR.b).v(j);
                                eygVarR.c();
                                ((gyg) eygVarR.b).u(string);
                                if (zIsEmpty) {
                                    eygVarR.c();
                                    ((gyg) eygVarR.b).t();
                                }
                                arrayList.add((gyg) eygVarR.e());
                            }
                        } while (cursorQuery.moveToNext());
                        sQLiteDatabaseR1.delete("diagnostic_signals", "app_id=?", new String[]{str});
                        sQLiteDatabaseR1.setTransactionSuccessful();
                        list = arrayList;
                    } else {
                        sQLiteDatabaseR1.setTransactionSuccessful();
                    }
                } catch (SQLiteException e) {
                    w0h w0hVar2 = w3hVar.f;
                    w3h.h(w0hVar2);
                    w0hVar2.g.c(w0h.E0(str), e, "Error querying or deleting diagnostic signals. appId");
                    list = Collections.EMPTY_LIST;
                }
                if (cursorQuery != null) {
                    list = arrayList;
                    cursorQuery.close();
                }
                list = arrayList;
                sQLiteDatabaseR1.endTransaction();
                return list;
            } catch (Throwable th) {
                if (0 != 0) {
                    cursorQuery.close();
                }
                sQLiteDatabaseR1.endTransaction();
                throw th;
            }
        } catch (SQLiteException e2) {
            w0h w0hVar3 = w3hVar.f;
            w3h.h(w0hVar3);
            w0hVar3.g.c(w0h.E0(str), e2, "Error opening database for diagnostic signals. appId");
            return Collections.EMPTY_LIST;
        }
    }

    public final void i1(String str, q5h q5hVar) {
        oa7.A(str);
        A0();
        B0();
        g1(str, U0(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", q5hVar.g());
        Z0(contentValues);
    }

    public final q5h j1(String str) {
        oa7.A(str);
        A0();
        B0();
        return q5h.c(100, Y0("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    public final bsg k1(String str, v2h v2hVar, String str2) {
        bsg bsgVarA1 = a1("events", str, v2hVar.w());
        if (bsgVarA1 != null) {
            long j = bsgVarA1.e + 1;
            long j2 = bsgVarA1.d + 1;
            return new bsg(bsgVarA1.a, bsgVarA1.b, bsgVarA1.c + 1, j2, j, bsgVarA1.f, bsgVarA1.g, bsgVarA1.h, bsgVarA1.i, bsgVarA1.j, bsgVarA1.k);
        }
        w3h w3hVar = (w3h) this.b;
        w0h w0hVar = w3hVar.f;
        w3h.h(w0hVar);
        w0hVar.x.c(w0h.E0(str), w3hVar.x.a(str2), "Event aggregate wasn't created during raw event logging. appId, event");
        return new bsg(str, v2hVar.w(), 1L, 1L, 1L, v2hVar.y(), 0L, null, null, null, null);
    }

    public final boolean l1() {
        return ((w3h) this.b).a.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ef A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0101 A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TRY_LEAVE, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x011b A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0140  */
    /* JADX WARN: Code duplicated, block: B:52:0x0144  */
    /* JADX WARN: Code duplicated, block: B:53:0x0146 A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x014f  */
    /* JADX WARN: Code duplicated, block: B:61:0x015e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x0160  */
    /* JADX WARN: Code duplicated, block: B:66:0x018c A[Catch: all -> 0x0079, SQLiteException -> 0x007c, LOOP:0: B:66:0x018c->B:101:?, LOOP_START, TRY_LEAVE, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01e2 A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01e9 A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01d0 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void m1(String str, long j, long j2, oa5 oa5Var) {
        ?? IsEmpty;
        ?? string;
        String str2;
        String[] strArr;
        String string2;
        ?? r3;
        long jX0;
        long j3;
        String[] strArr2;
        String str3;
        long j4;
        t2h t2hVar;
        w3h w3hVar = (w3h) this.b;
        A0();
        B0();
        Cursor cursorRawQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseR1 = r1();
                IsEmpty = TextUtils.isEmpty(str);
                String str4 = "";
                if (IsEmpty != 0) {
                    String[] strArr3 = j2 != -1 ? new String[]{String.valueOf(j2), String.valueOf(j)} : new String[]{String.valueOf(j)};
                    str4 = j2 != -1 ? "rowid <= ? and " : "";
                    StringBuilder sb = new StringBuilder(str4.length() + 148);
                    sb.append("select app_id, metadata_fingerprint from raw_events where ");
                    sb.append(str4);
                    sb.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                    cursorRawQuery = sQLiteDatabaseR1.rawQuery(sb.toString(), strArr3);
                    try {
                        if (cursorRawQuery.moveToFirst()) {
                            string = cursorRawQuery.getString(0);
                            try {
                                string2 = cursorRawQuery.getString(1);
                                cursorRawQuery.close();
                                r3 = string;
                                cursorRawQuery = sQLiteDatabaseR1.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{r3, string2}, null, null, "rowid", "2");
                                if (cursorRawQuery.moveToFirst()) {
                                    try {
                                        z3h z3hVar = (z3h) ((u3h) lch.l1(z3h.W(), cursorRawQuery.getBlob(0))).e();
                                        if (cursorRawQuery.moveToNext()) {
                                            w0h w0hVar = w3hVar.f;
                                            w3h.h(w0hVar);
                                            w0hVar.x.b(w0h.E0(r3), "Get multiple raw event metadata records, expected one. appId");
                                        }
                                        cursorRawQuery.close();
                                        oa5Var.b = z3hVar;
                                        jX0 = X0("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{r3, string2}, -1L);
                                        if (j2 == -1) {
                                            if (jX0 != -1) {
                                                j3 = -1;
                                            } else {
                                                str3 = "app_id = ? and metadata_fingerprint = ?";
                                                strArr2 = new String[]{r3, string2};
                                            }
                                            cursorRawQuery = sQLiteDatabaseR1.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                            if (cursorRawQuery.moveToFirst()) {
                                                do {
                                                    j4 = cursorRawQuery.getLong(0);
                                                    byte[] blob = cursorRawQuery.getBlob(3);
                                                    long j5 = cursorRawQuery.getLong(4);
                                                    try {
                                                        t2hVar = (t2h) lch.l1(v2h.H(), blob);
                                                        t2hVar.o(cursorRawQuery.getString(1));
                                                        long j6 = cursorRawQuery.getLong(2);
                                                        t2hVar.c();
                                                        ((v2h) t2hVar.b).O(j6);
                                                        t2hVar.c();
                                                        ((v2h) t2hVar.b).r(j5);
                                                        if (!oa5Var.e(j4, (v2h) t2hVar.e())) {
                                                            break;
                                                        }
                                                    } catch (IOException e) {
                                                        w0h w0hVar2 = w3hVar.f;
                                                        w3h.h(w0hVar2);
                                                        w0hVar2.g.c(w0h.E0(r3), e, "Data loss. Failed to merge raw event. appId");
                                                    }
                                                } while (cursorRawQuery.moveToNext());
                                            } else {
                                                w0h w0hVar3 = w3hVar.f;
                                                w3h.h(w0hVar3);
                                                w0hVar3.x.b(w0h.E0(r3), "Raw event data disappeared while in transaction. appId");
                                            }
                                        } else {
                                            j3 = j2;
                                        }
                                        if (j3 == -1 && jX0 != -1) {
                                            jX0 = Math.min(j3, jX0);
                                        } else if (j3 != -1) {
                                            jX0 = j3;
                                        }
                                        str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr2 = new String[]{r3, string2, String.valueOf(jX0)};
                                        cursorRawQuery = sQLiteDatabaseR1.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                        if (cursorRawQuery.moveToFirst()) {
                                            do {
                                                j4 = cursorRawQuery.getLong(0);
                                                byte[] blob2 = cursorRawQuery.getBlob(3);
                                                long j7 = cursorRawQuery.getLong(4);
                                                t2hVar = (t2h) lch.l1(v2h.H(), blob2);
                                                t2hVar.o(cursorRawQuery.getString(1));
                                                long j8 = cursorRawQuery.getLong(2);
                                                t2hVar.c();
                                                ((v2h) t2hVar.b).O(j8);
                                                t2hVar.c();
                                                ((v2h) t2hVar.b).r(j7);
                                                if (!oa5Var.e(j4, (v2h) t2hVar.e())) {
                                                    break;
                                                    break;
                                                }
                                            } while (cursorRawQuery.moveToNext());
                                        } else {
                                            w0h w0hVar4 = w3hVar.f;
                                            w3h.h(w0hVar4);
                                            w0hVar4.x.b(w0h.E0(r3), "Raw event data disappeared while in transaction. appId");
                                        }
                                    } catch (IOException e2) {
                                        w0h w0hVar5 = w3hVar.f;
                                        w3h.h(w0hVar5);
                                        w0hVar5.g.c(w0h.E0(r3), e2, "Data loss. Failed to merge raw event metadata. appId");
                                    }
                                } else {
                                    w0h w0hVar6 = w3hVar.f;
                                    w3h.h(w0hVar6);
                                    w0hVar6.g.b(w0h.E0(r3), "Raw event metadata record is missing. appId");
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                w0h w0hVar7 = w3hVar.f;
                                w3h.h(w0hVar7);
                                w0hVar7.g.c(w0h.E0(string), e, "Data loss. Error selecting raw event. appId");
                            }
                        }
                    } catch (SQLiteException e4) {
                        e = e4;
                        string = str;
                    }
                } else {
                    try {
                        if (j2 != -1) {
                            String str5 = str;
                            strArr = new String[]{str5, String.valueOf(j2)};
                            IsEmpty = str5;
                        } else {
                            str2 = str;
                            strArr = new String[]{str2};
                        }
                        if (j2 != -1) {
                            IsEmpty = str2;
                            str4 = " and rowid <= ?";
                        }
                        IsEmpty = str2;
                        StringBuilder sb2 = new StringBuilder(str4.length() + 84);
                        sb2.append("select metadata_fingerprint from raw_events where app_id = ?");
                        sb2.append(str4);
                        sb2.append(" order by rowid limit 1;");
                        cursorRawQuery = sQLiteDatabaseR1.rawQuery(sb2.toString(), strArr);
                        if (cursorRawQuery.moveToFirst()) {
                            string2 = cursorRawQuery.getString(0);
                            cursorRawQuery.close();
                            r3 = IsEmpty;
                            cursorRawQuery = sQLiteDatabaseR1.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{r3, string2}, null, null, "rowid", "2");
                            if (cursorRawQuery.moveToFirst()) {
                                w0h w0hVar8 = w3hVar.f;
                                w3h.h(w0hVar8);
                                w0hVar8.g.b(w0h.E0(r3), "Raw event metadata record is missing. appId");
                            } else {
                                z3h z3hVar2 = (z3h) ((u3h) lch.l1(z3h.W(), cursorRawQuery.getBlob(0))).e();
                                if (cursorRawQuery.moveToNext()) {
                                    w0h w0hVar9 = w3hVar.f;
                                    w3h.h(w0hVar9);
                                    w0hVar9.x.b(w0h.E0(r3), "Get multiple raw event metadata records, expected one. appId");
                                }
                                cursorRawQuery.close();
                                oa5Var.b = z3hVar2;
                                jX0 = X0("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{r3, string2}, -1L);
                                if (j2 == -1) {
                                    if (jX0 != -1) {
                                        j3 = -1;
                                    } else {
                                        str3 = "app_id = ? and metadata_fingerprint = ?";
                                        strArr2 = new String[]{r3, string2};
                                    }
                                    cursorRawQuery = sQLiteDatabaseR1.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                    if (cursorRawQuery.moveToFirst()) {
                                        do {
                                            j4 = cursorRawQuery.getLong(0);
                                            byte[] blob3 = cursorRawQuery.getBlob(3);
                                            long j9 = cursorRawQuery.getLong(4);
                                            t2hVar = (t2h) lch.l1(v2h.H(), blob3);
                                            t2hVar.o(cursorRawQuery.getString(1));
                                            long j10 = cursorRawQuery.getLong(2);
                                            t2hVar.c();
                                            ((v2h) t2hVar.b).O(j10);
                                            t2hVar.c();
                                            ((v2h) t2hVar.b).r(j9);
                                            if (!oa5Var.e(j4, (v2h) t2hVar.e())) {
                                                break;
                                                break;
                                            }
                                        } while (cursorRawQuery.moveToNext());
                                    } else {
                                        w0h w0hVar10 = w3hVar.f;
                                        w3h.h(w0hVar10);
                                        w0hVar10.x.b(w0h.E0(r3), "Raw event data disappeared while in transaction. appId");
                                    }
                                } else {
                                    j3 = j2;
                                }
                                if (j3 == -1) {
                                    if (j3 != -1) {
                                        jX0 = j3;
                                    }
                                } else if (j3 != -1) {
                                    jX0 = j3;
                                }
                                str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                strArr2 = new String[]{r3, string2, String.valueOf(jX0)};
                                cursorRawQuery = sQLiteDatabaseR1.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                if (cursorRawQuery.moveToFirst()) {
                                    do {
                                        j4 = cursorRawQuery.getLong(0);
                                        byte[] blob4 = cursorRawQuery.getBlob(3);
                                        long j11 = cursorRawQuery.getLong(4);
                                        t2hVar = (t2h) lch.l1(v2h.H(), blob4);
                                        t2hVar.o(cursorRawQuery.getString(1));
                                        long j12 = cursorRawQuery.getLong(2);
                                        t2hVar.c();
                                        ((v2h) t2hVar.b).O(j12);
                                        t2hVar.c();
                                        ((v2h) t2hVar.b).r(j11);
                                        if (!oa5Var.e(j4, (v2h) t2hVar.e())) {
                                            break;
                                            break;
                                        }
                                    } while (cursorRawQuery.moveToNext());
                                } else {
                                    w0h w0hVar11 = w3hVar.f;
                                    w3h.h(w0hVar11);
                                    w0hVar11.x.b(w0h.E0(r3), "Raw event data disappeared while in transaction. appId");
                                }
                            }
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        string = IsEmpty;
                        w0h w0hVar12 = w3hVar.f;
                        w3h.h(w0hVar12);
                        w0hVar12.g.c(w0h.E0(string), e, "Data loss. Error selecting raw event. appId");
                    }
                }
            } finally {
                if (0 != 0) {
                    cursorRawQuery.close();
                }
            }
        } catch (SQLiteException e6) {
            e = e6;
            IsEmpty = str;
        }
    }

    public final void o1() {
        B0();
        r1().beginTransaction();
    }

    public final void p1() {
        B0();
        r1().setTransactionSuccessful();
    }

    public final void q1() {
        B0();
        r1().endTransaction();
    }

    public final SQLiteDatabase r1() {
        A0();
        try {
            return this.e.getWritableDatabase();
        } catch (SQLiteException e) {
            w0h w0hVar = ((w3h) this.b).f;
            w3h.h(w0hVar);
            w0hVar.x.b(e, "Error opening database");
            throw e;
        }
    }

    public final void s1(String str) {
        bsg bsgVarA1;
        c1("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = r1().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string != null && (bsgVarA1 = a1("events", str, string)) != null) {
                            b1("events_snapshot", bsgVarA1);
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e) {
                w0h w0hVar = ((w3h) this.b).f;
                w3h.h(w0hVar);
                w0hVar.g.c(w0h.E0(str), e, "Error creating snapshot. appId");
            }
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0054  */
    /* JADX WARN: Code duplicated, block: B:9:0x005b  */
    public final void t1(String str) throws Throwable {
        boolean z2;
        bsg bsgVarA1;
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
        bsg bsgVarA2 = a1("events", str, "_f");
        bsg bsgVarA3 = a1("events", str, "_v");
        c1("events", str);
        Cursor cursorQuery = null;
        boolean z3 = false;
        try {
            cursorQuery = r1().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                boolean z4 = false;
                z2 = false;
                do {
                    try {
                        String string = cursorQuery.getString(0);
                        if (cursorQuery.getLong(1) >= 1) {
                            if ("_f".equals(string)) {
                                z4 = true;
                            } else if ("_v".equals(string)) {
                                z2 = true;
                            }
                        }
                        if (string != null && (bsgVarA1 = a1("events_snapshot", str, string)) != null) {
                            b1("events", bsgVarA1);
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        z3 = z4;
                        try {
                            w0h w0hVar = ((w3h) this.b).f;
                            w3h.h(w0hVar);
                            w0hVar.g.c(w0h.E0(str), e, "Error querying snapshot. appId");
                            z4 = z3;
                        } catch (Throwable th) {
                            th = th;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (z3 && bsgVarA2 != null) {
                                b1("events", bsgVarA2);
                            } else if (!z2 && bsgVarA3 != null) {
                                b1("events", bsgVarA3);
                            }
                            c1("events_snapshot", str);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z3 = z4;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (z3) {
                            if (!z2) {
                                b1("events", bsgVarA3);
                            }
                        } else if (!z2) {
                            b1("events", bsgVarA3);
                        }
                        c1("events_snapshot", str);
                        throw th;
                    }
                } while (cursorQuery.moveToNext());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (!z4 && bsgVarA2 != null) {
                    b1("events", bsgVarA2);
                } else if (!z2 && bsgVarA3 != null) {
                    b1("events", bsgVarA3);
                }
            } else {
                cursorQuery.close();
                if (bsgVarA2 != null) {
                    b1("events", bsgVarA2);
                } else if (bsgVarA3 != null) {
                    b1("events", bsgVarA3);
                }
            }
        } catch (SQLiteException e2) {
            e = e2;
            z2 = false;
        } catch (Throwable th3) {
            th = th3;
            z2 = false;
        }
        c1("events_snapshot", str);
    }

    public final void u1(String str, String str2) {
        oa7.x(str);
        oa7.x(str2);
        A0();
        B0();
        try {
            r1().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            w3h w3hVar = (w3h) this.b;
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.g.d("Error deleting user property. appId", w0h.E0(str), w3hVar.x.c(str2), e);
        }
    }

    public final boolean v1(och ochVar) {
        w3h w3hVar = (w3h) this.b;
        String str = ochVar.b;
        A0();
        B0();
        String str2 = ochVar.a;
        String str3 = ochVar.c;
        if (w1(str2, str3) == null) {
            if (qch.B1(str3)) {
                if (W0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(w3hVar.d.J0(str2, bzg.V), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3)) {
                long jW0 = W0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
                qqg qqgVar = w3hVar.d;
                if (jW0 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str2);
        contentValues.put("origin", str);
        contentValues.put("name", str3);
        contentValues.put("set_timestamp", Long.valueOf(ochVar.d));
        n1(contentValues, ochVar.e);
        try {
            if (r1().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.g.b(w0h.E0(str2), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e) {
            w0h w0hVar2 = w3hVar.f;
            w3h.h(w0hVar2);
            w0hVar2.g.c(w0h.E0(str2), e, "Error storing user property. appId");
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    /* JADX WARN: Code duplicated, block: B:43:? A[SYNTHETIC] */
    public final och w1(String str, String str2) {
        Throwable th;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursorQuery;
        w3h w3hVar = (w3h) this.b;
        oa7.x(str);
        oa7.x(str2);
        A0();
        B0();
        Cursor cursor = null;
        try {
            cursorQuery = r1().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j = cursorQuery.getLong(0);
                        Object objN0 = N0(cursorQuery, 1);
                        if (objN0 != null) {
                            str3 = str;
                            str4 = str2;
                            try {
                                och ochVar = new och(str3, cursorQuery.getString(2), str4, j, objN0);
                                if (cursorQuery.moveToNext()) {
                                    w0h w0hVar = w3hVar.f;
                                    w3h.h(w0hVar);
                                    w0hVar.g.b(w0h.E0(str3), "Got multiple records for user property, expected one. appId");
                                }
                                cursorQuery.close();
                                return ochVar;
                            } catch (SQLiteException e) {
                                e = e;
                            }
                        }
                        sQLiteException = e;
                        w0h w0hVar2 = w3hVar.f;
                        w3h.h(w0hVar2);
                        w0hVar2.g.d("Error querying user property. appId", w0h.E0(str3), w3hVar.x.c(str4), sQLiteException);
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    str3 = str;
                    str4 = str2;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    throw th;
                }
                cursor.close();
                throw th;
            }
        } catch (SQLiteException e3) {
            str3 = str;
            str4 = str2;
            sQLiteException = e3;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                throw th;
            }
            cursor.close();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public final List x1(String str) {
        String str2;
        SQLiteException sQLiteException;
        w3h w3hVar = (w3h) this.b;
        oa7.x(str);
        A0();
        B0();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                qqg qqgVar = w3hVar.d;
                cursorQuery = r1().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    while (true) {
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        if (string2 == null) {
                            string2 = "";
                        }
                        String str3 = string2;
                        long j = cursorQuery.getLong(2);
                        Object objN0 = N0(cursorQuery, 3);
                        if (objN0 == null) {
                            try {
                                w0h w0hVar = w3hVar.f;
                                w3h.h(w0hVar);
                                w0hVar.g.b(w0h.E0(str), "Read invalid user property value, ignoring it. appId");
                                str2 = str;
                            } catch (SQLiteException e) {
                                sQLiteException = e;
                                str2 = str;
                                w0h w0hVar2 = w3hVar.f;
                                w3h.h(w0hVar2);
                                w0hVar2.g.c(w0h.E0(str2), sQLiteException, "Error querying user properties. appId");
                                arrayList = Collections.EMPTY_LIST;
                            }
                        } else {
                            str2 = str;
                            arrayList.add(new och(str2, str3, string, j, objN0));
                        }
                        try {
                            if (!cursorQuery.moveToNext()) {
                                break;
                            }
                            str = str2;
                        } catch (SQLiteException e2) {
                            e = e2;
                            sQLiteException = e;
                            w0h w0hVar3 = w3hVar.f;
                            w3h.h(w0hVar3);
                            w0hVar3.g.c(w0h.E0(str2), sQLiteException, "Error querying user properties. appId");
                            arrayList = Collections.EMPTY_LIST;
                        }
                    }
                }
            } finally {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            str2 = str;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x012d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0134  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    public final List y1(String str, String str2, String str3) throws Throwable {
        Cursor cursor;
        String str4;
        String str5;
        w3h w3hVar = (w3h) this.b;
        oa7.x(str);
        A0();
        B0();
        ?? arrayList = new ArrayList();
        try {
            ArrayList arrayList2 = new ArrayList(3);
            String str6 = str;
            arrayList2.add(str6);
            StringBuilder sb = new StringBuilder("app_id=?");
            if (!TextUtils.isEmpty(str2)) {
                arrayList2.add(str2);
                sb.append(" and origin=?");
            }
            if (!TextUtils.isEmpty(str3)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1);
                sb2.append(str3);
                sb2.append("*");
                arrayList2.add(sb2.toString());
                sb.append(" and name glob ?");
            }
            String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            String string = sb.toString();
            qqg qqgVar = w3hVar.d;
            w0h w0hVar = w3hVar.f;
            Cursor cursorQuery = r1().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, string, strArr, null, null, "rowid", "1001");
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        str4 = str2;
                        while (true) {
                            try {
                                if (arrayList.size() >= 1000) {
                                    w3h.h(w0hVar);
                                    w0hVar.g.b(1000, "Read more than the max allowed user properties, ignoring excess");
                                    break;
                                }
                                String string2 = cursorQuery.getString(0);
                                long j = cursorQuery.getLong(1);
                                Object objN0 = N0(cursorQuery, 2);
                                String string3 = cursorQuery.getString(3);
                                if (objN0 == null) {
                                    try {
                                        w3h.h(w0hVar);
                                        w0hVar.g.d("(2)Read invalid user property value, ignoring it", w0h.E0(str6), string3, str3);
                                        str5 = string3;
                                    } catch (SQLiteException e) {
                                        e = e;
                                        str5 = string3;
                                        cursor = cursorQuery;
                                        str4 = str5;
                                        try {
                                            w0h w0hVar2 = w3hVar.f;
                                            w3h.h(w0hVar2);
                                            w0hVar2.g.d("(2)Error querying user properties", w0h.E0(str), str4, e);
                                            arrayList = Collections.EMPTY_LIST;
                                            cursorQuery = cursor;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            return arrayList;
                                        } catch (Throwable th) {
                                            th = th;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            throw th;
                                        }
                                    }
                                } else {
                                    str5 = string3;
                                    arrayList.add(new och(str, str5, string2, j, objN0));
                                }
                                try {
                                    if (!cursorQuery.moveToNext()) {
                                        break;
                                    }
                                    str6 = str;
                                    str4 = str5;
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    cursor = cursorQuery;
                                    str4 = str5;
                                    w0h w0hVar3 = w3hVar.f;
                                    w3h.h(w0hVar3);
                                    w0hVar3.g.d("(2)Error querying user properties", w0h.E0(str), str4, e);
                                    arrayList = Collections.EMPTY_LIST;
                                    cursorQuery = cursor;
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                cursor = cursorQuery;
                                w0h w0hVar4 = w3hVar.f;
                                w3h.h(w0hVar4);
                                w0hVar4.g.d("(2)Error querying user properties", w0h.E0(str), str4, e);
                                arrayList = Collections.EMPTY_LIST;
                                cursorQuery = cursor;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                return arrayList;
                            }
                        }
                    }
                } catch (SQLiteException e4) {
                    e = e4;
                    str4 = str2;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e5) {
            e = e5;
            str4 = str2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    public final boolean z1(wog wogVar) {
        w3h w3hVar = (w3h) this.b;
        A0();
        B0();
        String str = wogVar.a;
        oa7.A(str);
        if (w1(str, wogVar.c.b) == null) {
            long jW0 = W0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            qqg qqgVar = w3hVar.d;
            if (jW0 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", wogVar.b);
        contentValues.put("name", wogVar.c.b);
        Object objC = wogVar.c.c();
        oa7.A(objC);
        n1(contentValues, objC);
        contentValues.put(UsageBillingBalance.STATUS_ACTIVE, Boolean.valueOf(wogVar.e));
        contentValues.put("trigger_event_name", wogVar.f);
        contentValues.put("trigger_timeout", Long.valueOf(wogVar.v));
        hsg hsgVar = wogVar.g;
        qch qchVar = w3hVar.w;
        w0h w0hVar = w3hVar.f;
        w3h.f(qchVar);
        contentValues.put("timed_out_event", qch.k1(hsgVar));
        contentValues.put("creation_timestamp", Long.valueOf(wogVar.d));
        w3h.f(qchVar);
        contentValues.put("triggered_event", qch.k1(wogVar.w));
        contentValues.put("triggered_timestamp", Long.valueOf(wogVar.c.c));
        contentValues.put("time_to_live", Long.valueOf(wogVar.x));
        contentValues.put("expired_event", qch.k1(wogVar.y));
        try {
            if (r1().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            w3h.h(w0hVar);
            w0hVar.g.b(w0h.E0(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e) {
            w3h.h(w0hVar);
            w0hVar.g.c(w0h.E0(str), e, "Error storing conditional user property");
            return true;
        }
    }
}
