package defpackage;

import android.content.SharedPreferences;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v6a {
    public static final Object b = new Object();
    public final SharedPreferences a;

    public v6a(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public static String b(String str, String str2) {
        return str.length() + ":" + str + ":" + str2;
    }

    public final u6a a(String str, String str2, String str3) {
        u6a u6aVarC;
        str.getClass();
        synchronized (b) {
            u6aVarC = c(str, str2);
            if (u6aVarC == null || !u6aVarC.a.equals(str3) || u6aVarC.d) {
                u6aVarC = null;
            } else {
                String str4 = u6aVarC.a;
                String str5 = u6aVarC.b;
                String string = new JSONObject().put("scope", str4).put("productId", str5).put("storeProductId", u6aVarC.c).put("completed", true).put("currencyCode", u6aVarC.e).toString();
                string.getClass();
                this.a.edit().putString(b(str, str2), string).apply();
            }
        }
        return u6aVarC;
    }

    public final u6a c(String str, String str2) {
        u6a u6aVar;
        Object dzbVar;
        str.getClass();
        synchronized (b) {
            SharedPreferences sharedPreferences = this.a;
            String strB = b(str, str2);
            u6aVar = null;
            Object obj = null;
            String string = sharedPreferences.getString(strB, null);
            if (string != null) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    String string2 = jSONObject.getString("scope");
                    string2.getClass();
                    String string3 = jSONObject.getString("productId");
                    string3.getClass();
                    String string4 = jSONObject.getString("storeProductId");
                    string4.getClass();
                    boolean z = jSONObject.getBoolean("completed");
                    String strOptString = jSONObject.optString("currencyCode");
                    strOptString.getClass();
                    dzbVar = new u6a(string2, string3, z, string4, !v4e.Q(strOptString) ? strOptString : null);
                } catch (Throwable th) {
                    dzbVar = new dzb(th);
                }
                if (!(dzbVar instanceof dzb)) {
                    obj = dzbVar;
                }
                u6aVar = (u6a) obj;
            }
        }
        return u6aVar;
    }
}
