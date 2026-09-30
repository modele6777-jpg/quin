package defpackage;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class p9a {
    public static Integer s = null;
    public static Boolean t = null;
    public static boolean u = true;
    public static final Object v = new Object();
    public final FutureTask a;
    public final Future b;
    public final FutureTask c;
    public final FutureTask d;
    public final o9a e;
    public JSONObject f;
    public HashMap h;
    public boolean i;
    public String j;
    public boolean k;
    public String l;
    public String m;
    public boolean n;
    public Boolean o;
    public final Object q;
    public boolean r;
    public final Object g = new Object();
    public HashMap p = null;

    /* JADX WARN: Type inference failed for: r4v1, types: [o9a] */
    public p9a(Future future, FutureTask futureTask, FutureTask futureTask2, FutureTask futureTask3) {
        Object obj = new Object();
        this.q = obj;
        this.r = false;
        this.b = future;
        this.a = futureTask;
        this.c = futureTask2;
        this.d = futureTask3;
        this.f = null;
        this.h = null;
        this.i = false;
        this.e = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: o9a
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                p9a p9aVar = this.a;
                synchronized (p9a.v) {
                    p9aVar.f();
                    p9a.u = false;
                }
            }
        };
        synchronized (obj) {
            try {
                if (this.p == null && !this.r) {
                    this.r = true;
                    new Thread(new m45(12, this)).start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized String a() {
        try {
            if (!this.i) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.j;
    }

    public final synchronized boolean b(String str, boolean z) {
        try {
            if (t == null) {
                try {
                    if (((SharedPreferences) this.d.get()).getBoolean("has_launched_" + str, false)) {
                        t = Boolean.FALSE;
                    } else {
                        t = Boolean.valueOf(!z);
                        if (z) {
                            i(str);
                        }
                    }
                } catch (InterruptedException | ExecutionException unused) {
                    t = Boolean.FALSE;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return t.booleanValue();
    }

    public final HashMap c() {
        synchronized (this.q) {
            try {
                if (this.p != null) {
                    return new HashMap(this.p);
                }
                this.p = new HashMap();
                try {
                    try {
                        for (Map.Entry<String, ?> entry : ((SharedPreferences) this.c.get()).getAll().entrySet()) {
                            this.p.put(entry.getKey(), Long.valueOf(entry.getValue().toString()));
                        }
                    } catch (InterruptedException e) {
                        db6.G("MixpanelAPI.PIdentity", "Failed to load time events", e);
                    } catch (ExecutionException e2) {
                        db6.G("MixpanelAPI.PIdentity", "Failed to load time events", e2.getCause());
                    }
                    this.r = false;
                    return new HashMap(this.p);
                } catch (Throwable th) {
                    this.r = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        SharedPreferences sharedPreferences;
        try {
            sharedPreferences = (SharedPreferences) this.a.get();
        } catch (InterruptedException e) {
            db6.G("MixpanelAPI.PIdentity", "Cannot read distinct ids from sharedPreferences.", e);
            sharedPreferences = null;
        } catch (ExecutionException e2) {
            db6.G("MixpanelAPI.PIdentity", "Cannot read distinct ids from sharedPreferences.", e2.getCause());
            sharedPreferences = null;
        }
        if (sharedPreferences == null) {
            return;
        }
        this.j = sharedPreferences.getString("events_distinct_id", null);
        this.k = sharedPreferences.getBoolean("events_user_id_present", false);
        this.l = sharedPreferences.getString("people_distinct_id", null);
        this.m = sharedPreferences.getString("anonymous_id", null);
        this.n = sharedPreferences.getBoolean("had_persisted_distinct_id", false);
        if (this.j == null) {
            this.m = UUID.randomUUID().toString();
            this.j = "$device:" + this.m;
            this.k = false;
            k();
        }
        this.i = true;
    }

    public final void e(String str) {
        SharedPreferences sharedPreferences;
        try {
            sharedPreferences = (SharedPreferences) this.d.get();
        } catch (InterruptedException e) {
            db6.G("MixpanelAPI.PIdentity", "Cannot read opt out flag from sharedPreferences.", e);
            sharedPreferences = null;
        } catch (ExecutionException e2) {
            db6.G("MixpanelAPI.PIdentity", "Cannot read opt out flag from sharedPreferences.", e2.getCause());
            sharedPreferences = null;
        }
        if (sharedPreferences == null) {
            return;
        }
        this.o = Boolean.valueOf(sharedPreferences.getBoolean("opt_out_" + str, false));
    }

    public final void f() {
        o9a o9aVar = this.e;
        this.h = new HashMap();
        try {
            SharedPreferences sharedPreferences = (SharedPreferences) this.b.get();
            sharedPreferences.unregisterOnSharedPreferenceChangeListener(o9aVar);
            sharedPreferences.registerOnSharedPreferenceChangeListener(o9aVar);
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                this.h.put(entry.getKey(), entry.getValue().toString());
            }
        } catch (InterruptedException e) {
            db6.G("MixpanelAPI.PIdentity", "Cannot load referrer properties from shared preferences.", e);
        } catch (ExecutionException e2) {
            db6.G("MixpanelAPI.PIdentity", "Cannot load referrer properties from shared preferences.", e2.getCause());
        }
    }

    public final void g() {
        JSONObject jSONObject;
        try {
            try {
                String string = ((SharedPreferences) this.a.get()).getString("super_properties", "{}");
                db6.f1("MixpanelAPI.PIdentity", "Loading Super Properties " + string);
                this.f = new JSONObject(string);
            } catch (InterruptedException e) {
                db6.G("MixpanelAPI.PIdentity", "Cannot load superProperties from SharedPreferences.", e);
                if (this.f == null) {
                    jSONObject = new JSONObject();
                    this.f = jSONObject;
                }
            } catch (ExecutionException e2) {
                db6.G("MixpanelAPI.PIdentity", "Cannot load superProperties from SharedPreferences.", e2.getCause());
                if (this.f == null) {
                    jSONObject = new JSONObject();
                    this.f = jSONObject;
                }
            } catch (JSONException unused) {
                db6.F("MixpanelAPI.PIdentity", "Cannot parse stored superProperties");
                j();
                if (this.f == null) {
                    jSONObject = new JSONObject();
                    this.f = jSONObject;
                }
            }
        } catch (Throwable th) {
            if (this.f == null) {
                this.f = new JSONObject();
            }
            throw th;
        }
    }

    public final void h(String str) {
        try {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) this.c.get()).edit();
            editorEdit.remove(str);
            editorEdit.apply();
            synchronized (this.q) {
                try {
                    HashMap map = this.p;
                    if (map != null) {
                        map.remove(str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (InterruptedException e) {
            db6.G("MixpanelAPI.PIdentity", "Failed to remove time event", e);
        } catch (ExecutionException e2) {
            db6.G("MixpanelAPI.PIdentity", "Failed to remove time event", e2.getCause());
        }
    }

    public final synchronized void i(String str) {
        try {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) this.d.get()).edit();
            editorEdit.putBoolean("has_launched_" + str, true);
            editorEdit.apply();
        } catch (InterruptedException e) {
            db6.G("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel shared preferences.", e);
        } catch (ExecutionException e2) {
            db6.G("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel shared preferences.", e2.getCause());
        }
    }

    public final void j() {
        JSONObject jSONObject = this.f;
        if (jSONObject == null) {
            db6.F("MixpanelAPI.PIdentity", "storeSuperProperties should not be called with uninitialized superPropertiesCache.");
            return;
        }
        String string = jSONObject.toString();
        db6.f1("MixpanelAPI.PIdentity", "Storing Super Properties " + string);
        try {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) this.a.get()).edit();
            editorEdit.putString("super_properties", string);
            editorEdit.apply();
        } catch (InterruptedException e) {
            db6.G("MixpanelAPI.PIdentity", "Cannot store superProperties in shared preferences.", e);
        } catch (ExecutionException e2) {
            db6.G("MixpanelAPI.PIdentity", "Cannot store superProperties in shared preferences.", e2.getCause());
        }
    }

    public final void k() {
        try {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) this.a.get()).edit();
            editorEdit.putString("events_distinct_id", this.j);
            editorEdit.putBoolean("events_user_id_present", this.k);
            editorEdit.putString("people_distinct_id", this.l);
            editorEdit.putString("anonymous_id", this.m);
            editorEdit.putBoolean("had_persisted_distinct_id", this.n);
            editorEdit.apply();
        } catch (InterruptedException e) {
            db6.G("MixpanelAPI.PIdentity", "Can't write distinct ids to shared preferences.", e);
        } catch (ExecutionException e2) {
            db6.G("MixpanelAPI.PIdentity", "Can't write distinct ids to shared preferences.", e2.getCause());
        }
    }

    public final void l(String str) {
        try {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) this.d.get()).edit();
            editorEdit.putBoolean("opt_out_" + str, this.o.booleanValue());
            editorEdit.apply();
        } catch (InterruptedException e) {
            db6.G("MixpanelAPI.PIdentity", "Can't write opt-out shared preferences.", e);
        } catch (ExecutionException e2) {
            db6.G("MixpanelAPI.PIdentity", "Can't write opt-out shared preferences.", e2.getCause());
        }
    }
}
