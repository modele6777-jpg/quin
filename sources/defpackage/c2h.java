package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import io.sentry.android.core.v;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c2h extends g5h {
    public static final Pair P0 = new Pair("", 0L);
    public final t1h E0;
    public final v F0;
    public final v G0;
    public boolean H0;
    public final t1h I0;
    public final t1h J0;
    public final v K0;
    public final zi0 L0;
    public final zi0 M0;
    public final v N0;
    public final kxa O0;
    public final t1h X;
    public final zi0 Y;
    public final kxa Z;
    public SharedPreferences d;
    public SharedPreferences e;
    public zy1 f;
    public final v g;
    public final zi0 v;
    public String w;
    public boolean x;
    public long y;
    public final v z;

    public c2h(w3h w3hVar) {
        super(w3hVar);
        this.z = new v(this, "session_timeout", 1800000L);
        this.X = new t1h(this, "start_new_session", true);
        this.F0 = new v(this, "last_pause_time", 0L);
        this.G0 = new v(this, "session_id", 0L);
        this.Y = new zi0(this, "non_personalized_ads");
        this.Z = new kxa(this, "last_received_uri_timestamps_by_source");
        this.E0 = new t1h(this, "allow_remote_dynamite", false);
        this.g = new v(this, "first_open_time", 0L);
        oa7.x("app_install_time");
        this.v = new zi0(this, "app_instance_id");
        this.I0 = new t1h(this, "app_backgrounded", false);
        this.J0 = new t1h(this, "deep_link_retrieval_complete", false);
        this.K0 = new v(this, "deep_link_retrieval_attempts", 0L);
        this.L0 = new zi0(this, "firebase_feature_rollouts");
        this.M0 = new zi0(this, "deferred_attribution_cache");
        this.N0 = new v(this, "deferred_attribution_cache_timestamp", 0L);
        this.O0 = new kxa(this, "default_event_parameters");
    }

    @Override // defpackage.g5h
    public final boolean B0() {
        return true;
    }

    public final SharedPreferences E0() {
        A0();
        C0();
        oa7.A(this.d);
        return this.d;
    }

    public final SharedPreferences F0() {
        A0();
        C0();
        SharedPreferences sharedPreferences = this.e;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        w3h w3hVar = (w3h) this.b;
        String strValueOf = String.valueOf(w3hVar.a.getPackageName());
        w0h w0hVar = w3hVar.f;
        w3h.h(w0hVar);
        tz0 tz0Var = w0hVar.Z;
        String strConcat = strValueOf.concat("_preferences");
        tz0Var.b(strConcat, "Default prefs file");
        SharedPreferences sharedPreferences2 = w3hVar.a.getSharedPreferences(strConcat, 0);
        this.e = sharedPreferences2;
        return sharedPreferences2;
    }

    public final SparseArray G0() {
        Bundle bundleL = this.Z.l();
        int[] intArray = bundleL.getIntArray("uriSources");
        long[] longArray = bundleL.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            w0h w0hVar = ((w3h) this.b).f;
            w3h.h(w0hVar);
            w0hVar.g.a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    public final q5h H0() {
        A0();
        return q5h.c(E0().getInt("consent_source", 100), E0().getString("consent_settings", "G1"));
    }

    public final void I0(boolean z) {
        A0();
        w0h w0hVar = ((w3h) this.b).f;
        w3h.h(w0hVar);
        w0hVar.Z.b(Boolean.valueOf(z), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = E0().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z);
        editorEdit.apply();
    }

    public final boolean J0(long j) {
        return j - this.z.a() > this.F0.a();
    }
}
