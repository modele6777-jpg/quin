package defpackage;

import android.content.SharedPreferences;
import com.adjust.sdk.sig.r3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class eb5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fb5 b;

    public /* synthetic */ eb5(fb5 fb5Var, int i) {
        this.a = i;
        this.b = fb5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SharedPreferences sharedPreferencesA;
        SharedPreferences sharedPreferencesA2;
        String string;
        int i = this.a;
        vd9 vd9Var = null;
        fb5 fb5Var = this.b;
        switch (i) {
            case 0:
                fb5Var.n++;
                synchronized (fb5Var.g) {
                    fb5Var.i = null;
                    break;
                }
                fb5Var.j.clear();
                fb5Var.l = Collections.synchronizedMap(new HashMap());
                fb5Var.m.clear();
                if (fb5Var.h != null && (sharedPreferencesA = fb5Var.a()) != null) {
                    sharedPreferencesA.edit().remove("mixpanel.flags.persistence").apply();
                }
                ArrayList arrayList = fb5Var.k;
                fb5Var.k = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        r3.f();
                        return;
                    }
                }
                return;
            case 1:
                if (fb5Var.h != null && (sharedPreferencesA2 = fb5Var.a()) != null && (string = sharedPreferencesA2.getString("mixpanel.flags.persistence", null)) != null) {
                    tx8 tx8Var = (tx8) fb5Var.a.get();
                    String strA = tx8Var == null ? null : tx8Var.g.a();
                    if (strA != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(string);
                            if (strA.equals(jSONObject.optString("distinctId", null))) {
                                long jOptLong = jSONObject.optLong("persistedAt", 0L);
                                esf esfVar = fb5Var.b.b;
                                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("response");
                                if (jSONObjectOptJSONObject != null) {
                                    vd9Var = new vd9(jOptLong, jSONObjectOptJSONObject);
                                }
                            } else {
                                db6.D("MixpanelAPI.FeatureFlagManager", "Persisted flags belong to a different distinct_id; ignoring persisted blob.");
                            }
                        } catch (JSONException e) {
                            db6.i1("MixpanelAPI.FeatureFlagManager", "Failed to parse persisted flags blob; clearing.", e);
                            sharedPreferencesA2.edit().remove("mixpanel.flags.persistence").apply();
                        } catch (Exception e2) {
                            db6.G("MixpanelAPI.FeatureFlagManager", "Unexpected error loading persisted flags", e2);
                        }
                    }
                    break;
                }
                if (vd9Var == null) {
                    return;
                }
                HashMap mapE = fb5.e(b21.K((JSONObject) vd9Var.b));
                synchronized (fb5Var.g) {
                    try {
                        if (fb5Var.i == null) {
                            fb5Var.i = Collections.unmodifiableMap(mapE);
                            fb5Var.l = fb5.c((JSONObject) vd9Var.b);
                            db6.f1("MixpanelAPI.FeatureFlagManager", "Loaded " + mapE.size() + " persisted variants into memory.");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                SharedPreferences sharedPreferencesA3 = fb5Var.a();
                if (sharedPreferencesA3 != null) {
                    sharedPreferencesA3.edit().remove("mixpanel.flags.persistence").apply();
                    return;
                }
                return;
        }
    }
}
