package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class tx8 {
    public static final HashMap q = new HashMap();
    public static final vrb r = new vrb(2);
    public static FutureTask s;
    public final Context a;
    public final zl b;
    public final gj8 c;
    public final Boolean d;
    public final p9a g;
    public final Map h;
    public final HashMap i;
    public final v0d j;
    public final gb5 k;
    public final Set l;
    public final fb5 m;
    public final gk2 n;
    public final AtomicBoolean o = new AtomicBoolean(false);
    public final AtomicBoolean p = new AtomicBoolean(false);
    public final String e = "b41fb6ae2d9a804340593124ab7792c3";
    public final ssg f = new ssg(26, this);

    public tx8(Context context, Future future, gj8 gj8Var, jy8 jy8Var) {
        HashMap mapC;
        JSONObject jSONObject;
        this.a = context;
        new HashMap();
        this.c = gj8Var;
        String strSubstring = jy8Var.b;
        if (strSubstring != null) {
            if (!strSubstring.isEmpty() && strSubstring.endsWith("/")) {
                strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
            }
            gj8Var.i = gj8.a(strSubstring.concat("/track/"), gj8Var.r);
            gj8Var.j = gj8.a(strSubstring.concat("/engage/"), gj8Var.r);
            gj8Var.k = gj8.a(strSubstring.concat("/groups/"), gj8Var.r);
            gj8Var.b(strSubstring);
        }
        this.d = Boolean.FALSE;
        HashMap map = new HashMap();
        map.put("$android_lib_version", "8.9.0");
        map.put("$android_os", "Android");
        String str = Build.VERSION.RELEASE;
        map.put("$android_os_version", str == null ? "UNKNOWN" : str);
        String str2 = Build.MANUFACTURER;
        map.put("$android_manufacturer", str2 == null ? "UNKNOWN" : str2);
        String str3 = Build.BRAND;
        map.put("$android_brand", str3 == null ? "UNKNOWN" : str3);
        String str4 = Build.MODEL;
        map.put("$android_model", str4 == null ? "UNKNOWN" : str4);
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            map.put("$android_app_version", packageInfo.versionName);
            map.put("$android_app_version_code", Integer.toString(packageInfo.versionCode));
        } catch (PackageManager.NameNotFoundException e) {
            db6.G("MixpanelAPI.API", "Exception getting app version name", e);
        }
        this.h = Collections.unmodifiableMap(map);
        this.j = new v0d();
        this.b = d();
        mjg mjgVar = new mjg(this);
        vrb vrbVar = r;
        p9a p9aVar = new p9a(future, vrbVar.g(context, "com.mixpanel.android.mpmetrics.MixpanelAPI_b41fb6ae2d9a804340593124ab7792c3", mjgVar), vrbVar.g(context, "com.mixpanel.android.mpmetrics.MixpanelAPI.TimeEvents_b41fb6ae2d9a804340593124ab7792c3", null), vrbVar.g(context, "com.mixpanel.android.mpmetrics.Mixpanel", null));
        this.g = p9aVar;
        synchronized (p9aVar.q) {
            try {
                if (p9aVar.p != null) {
                    mapC = new HashMap(p9aVar.p);
                } else if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                    mapC = new HashMap();
                    if (!p9aVar.r) {
                        p9aVar.r = true;
                        new Thread(new m45(12, p9aVar)).start();
                    }
                } else {
                    mapC = p9aVar.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.i = mapC;
        gb5 gb5Var = jy8Var.a;
        this.k = gb5Var;
        Set set = jy8Var.c;
        this.l = set;
        if (set.contains("mp_lib") || set.contains("$lib_version")) {
            db6.h1("MixpanelAPI.API", "MixpanelOptions.excludeProperties is stripping 'mp_lib' and/or '$lib_version'. These are not required for ingestion or identity, but Mixpanel uses them to identify the SDK source and version of each event — stripping them is not recommended.");
        }
        esf esfVar = gb5Var.b;
        FutureTask futureTaskG = vrbVar.g(context, "com.mixpanel.android.mpmetrics.MixpanelAPI_b41fb6ae2d9a804340593124ab7792c3", null);
        gk2 gk2Var = this.n;
        if (gk2Var == null) {
            gk2Var = new gk2(null, null, false);
            this.n = gk2Var;
        }
        try {
            jSONObject = new JSONObject(gb5Var.a.toString());
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        fb5 fb5Var = new fb5(this, gk2Var, new gb5(jSONObject, esfVar), futureTaskG);
        this.m = fb5Var;
        Context context2 = this.a;
        if (context2.getApplicationContext() instanceof Application) {
            ((Application) context2.getApplicationContext()).registerActivityLifecycleCallbacks(new ux8(this, this.c));
        } else if (db6.L0(4)) {
            Log.i("MixpanelAPI.API", "Context is not an Application, Mixpanel won't be able to automatically flush on an app background.");
        }
        new Handler(Looper.getMainLooper()).post(new m45(10, this));
        if (this.d.booleanValue()) {
            try {
                sl slVar = new sl(this.e, a("$ae_first_open", null, null), this.g, new r45(13, fb5Var));
                zl zlVar = this.b;
                zlVar.getClass();
                Message messageObtain = Message.obtain();
                messageObtain.what = 10;
                messageObtain.obj = slVar;
                zlVar.b.a(messageObtain);
            } catch (JSONException e2) {
                db6.G("MixpanelAPI.API", "Exception preparing first launch check", e2);
            }
        }
        if (!this.c.g && this.d.booleanValue()) {
            k("$app_open", null);
        }
        p9a p9aVar2 = this.g;
        String str5 = (String) map.get("$android_app_version_code");
        synchronized (p9aVar2) {
            if (str5 != null) {
                try {
                    Integer numValueOf = Integer.valueOf(str5);
                    try {
                        try {
                            if (p9a.s == null) {
                                int i = ((SharedPreferences) p9aVar2.d.get()).getInt("latest_version_code", -1);
                                p9a.s = Integer.valueOf(i);
                                if (i == -1) {
                                    p9a.s = numValueOf;
                                    SharedPreferences.Editor editorEdit = ((SharedPreferences) p9aVar2.d.get()).edit();
                                    editorEdit.putInt("latest_version_code", numValueOf.intValue());
                                    editorEdit.apply();
                                }
                            }
                            if (p9a.s.intValue() < numValueOf.intValue()) {
                                SharedPreferences.Editor editorEdit2 = ((SharedPreferences) p9aVar2.d.get()).edit();
                                editorEdit2.putInt("latest_version_code", numValueOf.intValue());
                                editorEdit2.apply();
                                if (this.d.booleanValue()) {
                                    try {
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put("$ae_updated_version", map.get("$android_app_version"));
                                        l("$ae_updated", jSONObject2, true);
                                    } catch (JSONException unused2) {
                                    }
                                }
                            }
                        } catch (InterruptedException e3) {
                            db6.G("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel from shared preferences.", e3);
                        }
                    } catch (ExecutionException e4) {
                        db6.G("MixpanelAPI.PIdentity", "Couldn't write internal Mixpanel shared preferences.", e4.getCause());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (!this.c.h && q25.b == null) {
            synchronized (q25.class) {
                try {
                    if (q25.b == null) {
                        q25.b = new q25();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        if (this.c.s) {
            zl zlVar2 = this.b;
            File file = new File(this.a.getApplicationInfo().dataDir);
            zlVar2.getClass();
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = 9;
            messageObtain2.obj = file;
            zlVar2.b.a(messageObtain2);
        }
        if (Build.VERSION.SDK_INT < 33 || context.getPackageManager().isInstantApp()) {
            return;
        }
        bp.H(this.a.getApplicationContext(), new z0d(this), z0d.b, null, 4);
    }

    public static void b(Context context) {
        if (!(context instanceof Activity)) {
            db6.D("MixpanelAPI.AL", "Context is not an instance of Activity. To detect inbound App Links, pass an instance of an Activity to getInstance.");
            return;
        }
        try {
            Class.forName("bolts.AppLinks").getMethod("getTargetUrlFromInboundIntent", Context.class, Intent.class).invoke(null, context, ((Activity) context).getIntent());
        } catch (ClassNotFoundException e) {
            db6.D("MixpanelAPI.AL", "Please install the Bolts library >= 1.1.2 to track App Links: " + e.getMessage());
        } catch (IllegalAccessException e2) {
            db6.D("MixpanelAPI.AL", "Unable to detect inbound App Links: " + e2.getMessage());
        } catch (NoSuchMethodException e3) {
            db6.D("MixpanelAPI.AL", "Please install the Bolts library >= 1.1.2 to track App Links: " + e3.getMessage());
        } catch (InvocationTargetException e4) {
            if (db6.L0(3)) {
                Log.d("MixpanelAPI.AL", "Failed to invoke bolts.AppLinks.getTargetUrlFromInboundIntent() -- Unable to detect inbound App Links", e4);
            }
        }
    }

    public static void i(Context context, tx8 tx8Var) {
        try {
            ja8.class.getMethod("registerReceiver", BroadcastReceiver.class, IntentFilter.class).invoke(ja8.class.getMethod("getInstance", Context.class).invoke(null, context), new n80(4, tx8Var), new IntentFilter("com.parse.bolts.measurement_event"));
        } catch (ClassNotFoundException e) {
            db6.D("MixpanelAPI.AL", "To enable App Links tracking, add implementation 'androidx.localbroadcastmanager:localbroadcastmanager:1.0.0': " + e.getMessage());
        } catch (IllegalAccessException e2) {
            db6.D("MixpanelAPI.AL", "App Links tracking will not be enabled due to this exception: " + e2.getMessage());
        } catch (NoSuchMethodException e3) {
            db6.D("MixpanelAPI.AL", "To enable App Links tracking, add implementation 'androidx.localbroadcastmanager:localbroadcastmanager:1.0.0': " + e3.getMessage());
        } catch (InvocationTargetException e4) {
            if (db6.L0(3)) {
                Log.d("MixpanelAPI.AL", "Failed to invoke LocalBroadcastManager.registerReceiver() -- App Links tracking will not be enabled due to this exception", e4);
            }
        }
    }

    public final rl a(String str, JSONObject jSONObject, Long l) throws JSONException {
        String str2;
        boolean z;
        JSONObject jSONObject2 = new JSONObject();
        p9a p9aVar = this.g;
        p9aVar.getClass();
        synchronized (p9a.v) {
            try {
                if (p9a.u || p9aVar.h == null) {
                    p9aVar.f();
                    p9a.u = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Map.Entry entry : p9aVar.h.entrySet()) {
            jSONObject2.put((String) entry.getKey(), (String) entry.getValue());
        }
        p9a p9aVar2 = this.g;
        synchronized (p9aVar2.g) {
            if (p9aVar2.f == null) {
                p9aVar2.g();
            }
            JSONObject jSONObject3 = p9aVar2.f;
            Iterator<String> itKeys = jSONObject3.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    jSONObject2.put(next, jSONObject3.get(next));
                } catch (JSONException e) {
                    db6.G("MixpanelAPI.PIdentity", "Object read from one JSON Object cannot be written to another", e);
                }
            }
        }
        double dCurrentTimeMillis = System.currentTimeMillis() / 1000.0d;
        String strA = this.g.a();
        String strE = e();
        p9a p9aVar3 = this.g;
        synchronized (p9aVar3) {
            try {
                if (!p9aVar3.i) {
                    p9aVar3.d();
                }
                str2 = p9aVar3.k ? p9aVar3.j : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        jSONObject2.put("time", System.currentTimeMillis());
        jSONObject2.put("distinct_id", strA);
        p9a p9aVar4 = this.g;
        synchronized (p9aVar4) {
            try {
                if (!p9aVar4.i) {
                    p9aVar4.d();
                }
                z = p9aVar4.n;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        jSONObject2.put("$had_persisted_distinct_id", z);
        if (strE != null) {
            jSONObject2.put("$device_id", strE);
        }
        if (str2 != null) {
            jSONObject2.put("$user_id", str2);
        }
        if (l != null) {
            jSONObject2.put("$duration", dCurrentTimeMillis - (l.longValue() / 1000.0d));
        }
        if (jSONObject != null) {
            Iterator<String> itKeys2 = jSONObject.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                jSONObject2.put(next2, jSONObject.opt(next2));
            }
        }
        return new rl(str, jSONObject2, this.e, this.j.a(true), this.l);
    }

    public final void c() {
        if (f()) {
            return;
        }
        zl zlVar = this.b;
        zlVar.getClass();
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.obj = this.e;
        messageObtain.arg1 = 0;
        zlVar.b.a(messageObtain);
    }

    public final zl d() {
        zl zlVar;
        Context context = this.a;
        gj8 gj8Var = this.c;
        HashMap map = zl.e;
        synchronized (map) {
            try {
                Context applicationContext = context.getApplicationContext();
                gj8Var.getClass();
                if (map.containsKey(null)) {
                    zlVar = (zl) map.get(null);
                } else {
                    zlVar = new zl(applicationContext, gj8Var);
                    map.put(null, zlVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zlVar;
    }

    public final String e() {
        String str;
        p9a p9aVar = this.g;
        synchronized (p9aVar) {
            try {
                if (!p9aVar.i) {
                    p9aVar.d();
                }
                str = p9aVar.m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final boolean f() {
        boolean zBooleanValue;
        p9a p9aVar = this.g;
        String str = this.e;
        synchronized (p9aVar) {
            try {
                Boolean bool = p9aVar.o;
                if (bool == null) {
                    p9aVar.e(str);
                    bool = p9aVar.o;
                    if (bool == null) {
                        bool = Boolean.FALSE;
                        p9aVar.o = bool;
                    }
                }
                zBooleanValue = bool.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public final void g(String str, boolean z) {
        if (f()) {
            return;
        }
        if (str == null) {
            db6.F("MixpanelAPI.API", "Can't identify with null distinct_id.");
            return;
        }
        synchronized (this.g) {
            try {
                String strA = this.g.a();
                if (!str.equals(strA)) {
                    if (str.startsWith("$device:")) {
                        db6.F("MixpanelAPI.API", "Can't identify with '$device:' distinct_id.");
                        return;
                    }
                    p9a p9aVar = this.g;
                    synchronized (p9aVar) {
                        try {
                            if (!p9aVar.i) {
                                p9aVar.d();
                            }
                            p9aVar.j = str;
                            p9aVar.k();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    p9a p9aVar2 = this.g;
                    synchronized (p9aVar2) {
                        try {
                            if (!p9aVar2.i) {
                                p9aVar2.d();
                            }
                            if (p9aVar2.m == null) {
                                p9aVar2.m = strA;
                                p9aVar2.n = true;
                                p9aVar2.k();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    p9a p9aVar3 = this.g;
                    synchronized (p9aVar3) {
                        try {
                            if (!p9aVar3.i) {
                                p9aVar3.d();
                            }
                            p9aVar3.k = true;
                            p9aVar3.k();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    if (this.o.get()) {
                        fb5 fb5Var = this.m;
                        fb5Var.e.post(new eb5(fb5Var, 0));
                        qi qiVar = this.m.e;
                        qiVar.sendMessage(qiVar.obtainMessage(0));
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("$anon_distinct_id", strA);
                        k("$identify", jSONObject);
                    } catch (JSONException unused) {
                        db6.F("MixpanelAPI.API", "Could not track $identify event");
                    }
                }
                if (z) {
                    this.f.J(str);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void h(JSONObject jSONObject) {
        if (f()) {
            return;
        }
        vl vlVar = new vl(this.e, jSONObject);
        zl zlVar = this.b;
        zlVar.getClass();
        Message messageObtain = Message.obtain();
        messageObtain.what = 0;
        messageObtain.obj = vlVar;
        zlVar.b.a(messageObtain);
    }

    public final void j(JSONObject jSONObject) {
        if (f()) {
            return;
        }
        p9a p9aVar = this.g;
        synchronized (p9aVar.g) {
            if (p9aVar.f == null) {
                p9aVar.g();
            }
            JSONObject jSONObject2 = p9aVar.f;
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    jSONObject2.put(next, jSONObject.get(next));
                } catch (JSONException e) {
                    db6.G("MixpanelAPI.PIdentity", "Exception registering super property.", e);
                }
            }
            p9aVar.j();
        }
    }

    public final void k(String str, JSONObject jSONObject) {
        if (f()) {
            return;
        }
        l(str, jSONObject, false);
    }

    public final void l(String str, JSONObject jSONObject, boolean z) {
        Long l;
        if (f()) {
            return;
        }
        if (!z || this.d.booleanValue()) {
            synchronized (this.i) {
                l = (Long) this.i.get(str);
                this.i.remove(str);
                this.g.h(str);
            }
            try {
                rl rlVarA = a(str, jSONObject, l);
                zl zlVar = this.b;
                zlVar.getClass();
                Message messageObtain = Message.obtain();
                messageObtain.what = 1;
                messageObtain.obj = rlVarA;
                zlVar.b.a(messageObtain);
                fb5 fb5Var = this.m;
                if (fb5Var != null) {
                    fb5Var.e.post(new c0(fb5Var, str, rlVarA.b, 19));
                }
            } catch (JSONException e) {
                db6.G("MixpanelAPI.API", "Exception tracking event " + str, e);
            }
        }
    }
}
