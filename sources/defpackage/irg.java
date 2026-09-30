package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class irg extends SQLiteOpenHelper {
    public final /* synthetic */ int a;
    public final /* synthetic */ m4 b;

    public irg(Context context, String str) {
        super(context, true == str.equals("") ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        int i = this.a;
        m4 m4Var = this.b;
        switch (i) {
            case 0:
                krg krgVar = (krg) m4Var;
                w3h w3hVar = (w3h) krgVar.b;
                qqg qqgVar = w3hVar.d;
                d82 d82Var = krgVar.f;
                if (d82Var.b != 0 && SystemClock.elapsedRealtime() - d82Var.b < 3600000) {
                    throw new SQLiteException("Database open failed");
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    d82Var.getClass();
                    d82Var.b = SystemClock.elapsedRealtime();
                    w0h w0hVar = w3hVar.f;
                    w3h.h(w0hVar);
                    w0hVar.g.a("Opening the database failed, dropping and recreating it");
                    if (!w3hVar.a.getDatabasePath("google_app_measurement.db").delete()) {
                        w0h w0hVar2 = w3hVar.f;
                        w3h.h(w0hVar2);
                        w0hVar2.g.b("google_app_measurement.db", "Failed to delete corrupted db file");
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        d82Var.b = 0L;
                        return writableDatabase;
                    } catch (SQLiteException e) {
                        w0h w0hVar3 = w3hVar.f;
                        w3h.h(w0hVar3);
                        w0hVar3.g.b(e, "Failed to open freshly created database");
                        throw e;
                    }
                }
            default:
                w3h w3hVar2 = (w3h) ((f0h) m4Var).b;
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e2) {
                    throw e2;
                } catch (SQLiteException unused2) {
                    w0h w0hVar4 = w3hVar2.f;
                    w3h.h(w0hVar4);
                    w0hVar4.g.a("Opening the local database failed, dropping and recreating it");
                    if (!w3hVar2.a.getDatabasePath("google_app_measurement_local.db").delete()) {
                        w0h w0hVar5 = w3hVar2.f;
                        w3h.h(w0hVar5);
                        w0hVar5.g.b("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e3) {
                        w0h w0hVar6 = w3hVar2.f;
                        w3h.h(w0hVar6);
                        w0hVar6.g.b(e3, "Failed to open local database. Events will bypass local storage");
                        return null;
                    }
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i = this.a;
        m4 m4Var = this.b;
        switch (i) {
            case 0:
                w0h w0hVar = ((w3h) ((krg) m4Var).b).f;
                w3h.h(w0hVar);
                mxb.p(w0hVar, sQLiteDatabase);
                break;
            default:
                w0h w0hVar2 = ((w3h) ((f0h) m4Var).b).f;
                w3h.h(w0hVar2);
                mxb.p(w0hVar2, sQLiteDatabase);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = this.a;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        int i = this.a;
        m4 m4Var = this.b;
        switch (i) {
            case 0:
                w3h w3hVar = (w3h) ((krg) m4Var).b;
                w0h w0hVar = w3hVar.f;
                w3h.h(w0hVar);
                mxb.n(w0hVar, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", krg.g);
                w0h w0hVar2 = w3hVar.f;
                w3h.h(w0hVar2);
                mxb.n(w0hVar2, sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
                w3h.h(w0hVar2);
                mxb.n(w0hVar2, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
                w3h.h(w0hVar2);
                mxb.n(w0hVar2, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", krg.w);
                w3h.h(w0hVar2);
                mxb.n(w0hVar2, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", krg.x);
                w3h.h(w0hVar2);
                mxb.n(w0hVar2, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", krg.z);
                w3h.h(w0hVar2);
                mxb.n(w0hVar2, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
                w3h.h(w0hVar2);
                mxb.n(w0hVar2, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", krg.y);
                w3h.h(w0hVar2);
                mxb.n(w0hVar2, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", krg.X);
                w3h.h(w0hVar2);
                mxb.n(w0hVar2, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", krg.Y);
                w3h.h(w0hVar2);
                mxb.n(w0hVar2, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
                w3h.h(w0hVar2);
                mxb.n(w0hVar2, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", krg.Z);
                w3h.h(w0hVar2);
                mxb.n(w0hVar2, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
                w3h.h(w0hVar2);
                mxb.n(w0hVar2, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
                w3h.h(w0hVar2);
                mxb.n(w0hVar2, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", krg.E0);
                upg.a();
                w3h.h(w0hVar2);
                mxb.n(w0hVar2, sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", krg.F0);
                w3h.h(w0hVar2);
                mxb.n(w0hVar2, sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", krg.v);
                w3h.h(w0hVar2);
                mxb.n(w0hVar2, sQLiteDatabase, "diagnostic_signals", "CREATE TABLE IF NOT EXISTS diagnostic_signals ( app_id TEXT NOT NULL, signal_name TEXT NOT NULL, metadata TEXT NOT NULL, count INTEGER NOT NULL, last_increment_timestamp INTEGER NOT NULL);", "app_id,signal_name,metadata,count,last_increment_timestamp", null);
                ((epg) dpg.b.a.get()).getClass();
                w3h.h(w0hVar2);
                mxb.n(w0hVar2, sQLiteDatabase, "no_data_mode_events", "CREATE TABLE IF NOT EXISTS no_data_mode_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, data BLOB NOT NULL, timestamp_millis INTEGER NOT NULL);", "app_id,name,data,timestamp_millis", null);
                break;
            default:
                w0h w0hVar3 = ((w3h) ((f0h) m4Var).b).f;
                w3h.h(w0hVar3);
                mxb.n(w0hVar3, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", f0h.f);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = this.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public irg(f0h f0hVar, Context context) {
        this(context, "google_app_measurement_local.db");
        this.a = 1;
        this.b = f0hVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public irg(krg krgVar, Context context) {
        this(context, "google_app_measurement.db");
        this.a = 0;
        this.b = krgVar;
    }

    private final void b(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void h(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void l(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void u(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
