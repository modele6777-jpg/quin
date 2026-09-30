package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f95 {
    public static final f95 a = new f95();
    public static final long[] b = {0, 300000, 1800000};
    public static final Set c = qd0.I0(new String[]{"Completed", "Cancelled"});

    public static boolean h(e95 e95Var) {
        return pa7.t(e95Var.e, "share") && s72.o0(c, e95Var.h);
    }

    public static e95 j(Context context, String str) {
        f95 f95Var = a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f95Var) {
            try {
                context.getClass();
                str.getClass();
                e95 e95VarK = f95Var.k(context, str);
                e95 e95Var = null;
                if (e95VarK != null) {
                    if (e95VarK.h != null || !pa7.t(e95VarK.e, "share")) {
                        e95VarK = null;
                    }
                    if (e95VarK != null) {
                        String str2 = e95VarK.g;
                        if (str2 != null && !v4e.Q(str2)) {
                            return f95Var.e(context, e95VarK.a, "Completed", e95VarK.g);
                        }
                        if (e95VarK.i != null) {
                            String str3 = e95VarK.a;
                            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("external_share_operation", 0);
                            if (pa7.t(sharedPreferences.getString("active_id", null), str3)) {
                                sharedPreferences.edit().remove("active_id").commit();
                            }
                            return e95VarK;
                        }
                        Long lValueOf = Long.valueOf(jCurrentTimeMillis + 2000);
                        e95 e95Var2 = e95VarK;
                        e95 e95VarA = e95.a(e95Var2, null, null, lValueOf, 0, null, null, 32511);
                        if (!context.getApplicationContext().getSharedPreferences("external_share_operation", 0).edit().putString(l(e95VarA.a), q(e95VarA).toString()).commit()) {
                            e95VarA = null;
                        }
                        if (e95VarA != null) {
                            String str4 = e95Var2.a;
                            SharedPreferences sharedPreferences2 = context.getApplicationContext().getSharedPreferences("external_share_operation", 0);
                            if (pa7.t(sharedPreferences2.getString("active_id", null), str4)) {
                                sharedPreferences2.edit().remove("active_id").commit();
                            }
                            d95 d95Var = d95.a;
                            d95.a(context, 2000L);
                            e95Var = e95VarA;
                        }
                        return e95Var;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String l(String str) {
        return ub3.i("operation.", str);
    }

    public static List m(Context context) {
        Map<String, ?> all = context.getApplicationContext().getSharedPreferences("external_share_operation", 0).getAll();
        all.getClass();
        return fyc.A(fyc.y(new ve5(s72.m0(all.entrySet()), true, new hl4(14)), new hl4(15)));
    }

    public static Long n(String str, JSONObject jSONObject) {
        long jOptLong = jSONObject.optLong(str);
        Long lValueOf = Long.valueOf(jOptLong);
        if (jOptLong > 0) {
            return lValueOf;
        }
        return null;
    }

    public static JSONObject q(e95 e95Var) {
        return new JSONObject().put("id", e95Var.a).put("source", e95Var.b).put("format", e95Var.c).put("scene", e95Var.d).put("pathway", e95Var.e).put("startedAt", e95Var.f).put("target", e95Var.g).put("result", e95Var.h).put("chooserCleanupAfter", e95Var.i).put("qqLaunchStartedAt", e95Var.j).put("analyticsAttemptCount", e95Var.k).put("analyticsLastAttemptAt", e95Var.l).put("terminalFailureFeedbackConsumed", e95Var.m).put("resultAppState", e95Var.n).put("resultAppVersion", e95Var.o);
    }

    public static e95 r(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("id");
        string.getClass();
        String string2 = jSONObject.getString("source");
        string2.getClass();
        String string3 = jSONObject.getString("format");
        string3.getClass();
        String string4 = jSONObject.getString("scene");
        string4.getClass();
        String string5 = jSONObject.getString("pathway");
        string5.getClass();
        long j = jSONObject.getLong("startedAt");
        String strOptString = jSONObject.optString("target");
        if (v4e.Q(strOptString)) {
            strOptString = null;
        }
        String strOptString2 = jSONObject.optString("result");
        String str = !v4e.Q(strOptString2) ? strOptString2 : null;
        Long lN = n("chooserCleanupAfter", jSONObject);
        if (lN == null) {
            lN = n("chooserCancelAfter", jSONObject);
        }
        Long l = lN;
        Long lN2 = n("qqLaunchStartedAt", jSONObject);
        int iOptInt = jSONObject.optInt("analyticsAttemptCount");
        Long lN3 = n("analyticsLastAttemptAt", jSONObject);
        boolean zOptBoolean = jSONObject.optBoolean("terminalFailureFeedbackConsumed");
        String strOptString3 = jSONObject.optString("resultAppState");
        String str2 = !v4e.Q(strOptString3) ? strOptString3 : null;
        String strOptString4 = jSONObject.optString("resultAppVersion");
        return new e95(string, string2, string3, string4, string5, j, strOptString, str, l, lN2, iOptInt, lN3, zOptBoolean, str2, !v4e.Q(strOptString4) ? strOptString4 : null);
    }

    public final synchronized e95 a(Context context) {
        context.getClass();
        String string = context.getApplicationContext().getSharedPreferences("external_share_operation", 0).getString("active_id", null);
        if (string == null) {
            return null;
        }
        return k(context, string);
    }

    public final synchronized boolean b(Context context, String str) {
        SharedPreferences.Editor editorRemove;
        try {
            context.getClass();
            str.getClass();
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("external_share_operation", 0);
            editorRemove = sharedPreferences.edit().remove(l(str));
            if (pa7.t(sharedPreferences.getString("active_id", null), str)) {
                editorRemove.remove("active_id");
            }
        } catch (Throwable th) {
            throw th;
        }
        return editorRemove.commit();
    }

    public final synchronized e95 c(String str, long j, Context context) {
        try {
            context.getClass();
            str.getClass();
            e95 e95VarK = k(context, str);
            if (e95VarK != null) {
                if (e95VarK.h != null || !pa7.t(e95VarK.e, "share")) {
                    e95VarK = null;
                }
                if (e95VarK != null) {
                    Long l = e95VarK.i;
                    if (l == null) {
                        return null;
                    }
                    if (j < l.longValue()) {
                        return null;
                    }
                    String str2 = e95VarK.a;
                    String str3 = e95VarK.g;
                    return e(context, str2, (str3 == null || v4e.Q(str3)) ? "Cancelled" : "Completed", e95VarK.g);
                }
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized e95 d(String str, long j, Context context) {
        try {
            context.getClass();
            str.getClass();
            e95 e95VarK = k(context, str);
            if (e95VarK != null) {
                if (e95VarK.h != null || j - e95VarK.f < 1800000) {
                    e95VarK = null;
                }
                if (e95VarK != null) {
                    return a.b(context, e95VarK.a) ? e95VarK : null;
                }
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized e95 e(Context context, String str, String str2, String str3) {
        context.getClass();
        str.getClass();
        e95 e95VarK = k(context, str);
        if (e95VarK == null) {
            return null;
        }
        if (e95VarK.h != null) {
            return e95VarK;
        }
        e95 e95Var = (e95) new z53(str3, str2, 2).d(e95VarK);
        e95 e95Var2 = context.getApplicationContext().getSharedPreferences("external_share_operation", 0).edit().putString(l(e95Var.a), q(e95Var).toString()).commit() ? e95Var : null;
        if (e95Var2 != null && h(e95Var2)) {
            d95 d95Var = d95.a;
            d95.a(context, 0L);
        }
        return e95Var2;
    }

    public final synchronized e95 f(Context context) {
        e95 e95VarA;
        context.getClass();
        e95VarA = a(context);
        if (e95VarA == null || e95VarA.h != null) {
            e95VarA = null;
        }
        return e95VarA;
    }

    public final synchronized boolean g(Context context) {
        boolean z;
        try {
            if (f(context) == null) {
                List listM = m(context);
                if (!listM.isEmpty()) {
                    Iterator it = listM.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            e95 e95Var = (e95) it.next();
                            if (e95Var.h != null || !pa7.t(e95Var.e, "share") || e95Var.i == null) {
                                if (!h(e95Var) || e95Var.k >= 3) {
                                }
                            }
                            z = true;
                        }
                    }
                }
                z = false;
            } else {
                z = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    public final e95 i(String str, long j, Context context) {
        e95 e95VarK = k(context, str);
        if (e95VarK != null) {
            e95 e95Var = h(e95VarK) ? e95VarK : null;
            if (e95Var != null) {
                e95 e95VarA = e95.a(e95Var, null, null, null, 3, Long.valueOf(j), null, 29695);
                if (context.getApplicationContext().getSharedPreferences("external_share_operation", 0).edit().putString(l(e95VarA.a), q(e95VarA).toString()).commit()) {
                    return e95VarA;
                }
            }
        }
        return null;
    }

    public final synchronized e95 k(Context context, String str) {
        Object dzbVar;
        context.getClass();
        str.getClass();
        Object obj = null;
        String string = context.getApplicationContext().getSharedPreferences("external_share_operation", 0).getString(l(str), null);
        if (string == null) {
            return null;
        }
        try {
            dzbVar = r(new JSONObject(string));
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        if (!(dzbVar instanceof dzb)) {
            obj = dzbVar;
        }
        return (e95) obj;
    }

    public final synchronized void o(Context context, long j) {
        try {
            List listM = m(context);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM) {
                e95 e95Var = (e95) obj;
                long j2 = j - e95Var.f;
                if (e95Var.h != null) {
                    if (h(e95Var)) {
                        if (e95Var.k > 0 && j2 >= 604800000) {
                            arrayList.add(obj);
                        }
                    } else if (j2 >= 86400000) {
                        arrayList.add(obj);
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a.b(context, ((e95) it.next()).a);
            }
            arrayList.size();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void p(Context context, String str, String str2) {
        try {
            str.getClass();
            e95 e95VarK = k(context, str);
            if (e95VarK != null) {
                if (e95VarK.h != null || !pa7.t(e95VarK.e, "share")) {
                    e95VarK = null;
                }
                if (e95VarK != null) {
                    if (v4e.Q(str2)) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        a.e(context, e95VarK.a, "Completed", str2);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
