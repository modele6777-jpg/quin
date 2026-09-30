package defpackage;

import android.content.SharedPreferences;
import android.os.HandlerThread;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fb5 {
    public final WeakReference a;
    public final gb5 b;
    public final String c;
    public final gk2 d;
    public final qi e;
    public final ExecutorService f;
    public final FutureTask h;
    public final Object g = new Object();
    public volatile Map i = null;
    public final HashSet j = new HashSet();
    public ArrayList k = new ArrayList();
    public Map l = Collections.synchronizedMap(new HashMap());
    public final Set m = Collections.synchronizedSet(new HashSet());
    public int n = 0;

    public fb5(tx8 tx8Var, gk2 gk2Var, gb5 gb5Var, FutureTask futureTask) {
        this.a = new WeakReference(tx8Var);
        gj8 gj8Var = tx8Var.c;
        String str = gj8Var.l;
        this.c = gj8Var.m;
        this.d = gk2Var;
        this.b = gb5Var;
        this.h = futureTask;
        try {
            new JSONObject(gb5Var.a.toString());
        } catch (JSONException unused) {
            new JSONObject();
        }
        int i = 1;
        HandlerThread handlerThread = new HandlerThread("com.mixpanel.android.FeatureFlagManagerWorker", 1);
        handlerThread.start();
        int i2 = 2;
        qi qiVar = new qi(this, handlerThread.getLooper(), 2);
        this.e = qiVar;
        this.f = Executors.newSingleThreadExecutor();
        if (this.h != null) {
            if (this.b.b instanceof esf) {
                qiVar.post(new eb5(this, i2));
            } else {
                qiVar.post(new eb5(this, i));
            }
        }
    }

    public static HashMap c(JSONObject jSONObject) {
        HashMap map = new HashMap();
        try {
            if (jSONObject.has("pending_first_time_events")) {
                JSONArray jSONArray = jSONObject.getJSONArray("pending_first_time_events");
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        ch5 ch5Var = new ch5(jSONObject2.getString("flag_key"), jSONObject2.getString("flag_id"), Long.valueOf(jSONObject2.getLong("project_id")), jSONObject2.getString("first_time_event_hash"), jSONObject2.getString("event_name"), jSONObject2.optJSONObject("property_filters"), b21.J(jSONObject2.getJSONObject("pending_variant")));
                        map.put(ch5Var.a(), ch5Var);
                    } catch (Exception e) {
                        db6.F("MixpanelAPI.FeatureFlagManager", "Failed to parse pending first-time event at index " + i + ": " + e.getMessage());
                    }
                }
                db6.D("MixpanelAPI.FeatureFlagManager", "Parsed " + map.size() + " pending first-time events");
            }
        } catch (JSONException e2) {
            db6.F("MixpanelAPI.FeatureFlagManager", "Failed to parse pending_first_time_events array: " + e2.getMessage());
        }
        return map;
    }

    public static HashMap e(HashMap map) {
        HashMap map2 = new HashMap(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            iy8 iy8Var = (iy8) entry.getValue();
            map2.put(str, new iy8(iy8Var.a, iy8Var.b, iy8Var.c, iy8Var.d, iy8Var.e, 0));
        }
        return map2;
    }

    public final SharedPreferences a() {
        FutureTask futureTask = this.h;
        if (futureTask == null) {
            return null;
        }
        try {
            return (SharedPreferences) futureTask.get();
        } catch (Exception e) {
            db6.G("MixpanelAPI.FeatureFlagManager", "Failed to load SharedPreferences for persisted flags", e);
            return null;
        }
    }

    public final void b(HashMap map, HashMap map2) {
        for (String str : this.m) {
            int iIndexOf = str.indexOf(":");
            if (iIndexOf == -1) {
                db6.h1("MixpanelAPI.FeatureFlagManager", "Malformed composite key (missing colon): ".concat(str));
            } else {
                String strSubstring = str.substring(0, iIndexOf);
                synchronized (this.g) {
                    if (this.i != null && this.i.containsKey(strSubstring)) {
                        map.put(strSubstring, (iy8) this.i.get(strSubstring));
                        map2.remove(str);
                    }
                }
            }
        }
    }

    public final void d(ch5 ch5Var) {
        SSLSocketFactory sSLSocketFactory;
        tx8 tx8Var = (tx8) this.a.get();
        if (tx8Var == null) {
            db6.h1("MixpanelAPI.FeatureFlagManager", "Delegate is null, cannot record first-time event");
            return;
        }
        gj8 gj8Var = tx8Var.c;
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        String strL = ks0.l(sb, ch5Var.b, "/first-time-events");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("distinct_id", tx8Var.g.a());
        jSONObject.put("project_id", ch5Var.c);
        jSONObject.put("first_time_event_hash", ch5Var.d);
        byte[] bytes = jSONObject.toString().getBytes(StandardCharsets.UTF_8);
        String strA = jt0.a(tx8Var.e + ":");
        HashMap map = new HashMap();
        map.put("Authorization", "Basic ".concat(strA));
        map.put("Content-Type", "application/json; charset=utf-8");
        SecureRandom secureRandom = ezf.a;
        StringBuilder sb2 = new StringBuilder("00-");
        byte[] bArr = new byte[16];
        SecureRandom secureRandom2 = ezf.a;
        secureRandom2.nextBytes(bArr);
        sb2.append(ezf.a(bArr));
        sb2.append("-");
        byte[] bArr2 = new byte[8];
        secureRandom2.nextBytes(bArr2);
        sb2.append(ezf.a(bArr2));
        sb2.append("-01");
        map.put("traceparent", sb2.toString());
        gk2 gk2Var = this.d;
        gj8Var.getClass();
        synchronized (gj8Var) {
            sSLSocketFactory = gj8Var.u;
        }
        gk2Var.c(2, strL, null, map, bytes, sSLSocketFactory);
    }

    public final void f(JSONObject jSONObject) {
        SharedPreferences sharedPreferencesA = a();
        if (sharedPreferencesA == null) {
            return;
        }
        tx8 tx8Var = (tx8) this.a.get();
        String strA = tx8Var == null ? null : tx8Var.g.a();
        if (strA == null) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("persistedAt", System.currentTimeMillis());
            jSONObject2.put("distinctId", strA);
            jSONObject2.put("response", jSONObject);
            sharedPreferencesA.edit().putString("mixpanel.flags.persistence", jSONObject2.toString()).apply();
        } catch (Exception e) {
            db6.G("MixpanelAPI.FeatureFlagManager", "Failed to persist flags response", e);
        }
    }
}
