package defpackage;

import com.google.android.gms.tasks.Task;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gg5 {
    public final bf5 a;
    public final Executor b;
    public final wh2 c;
    public final wh2 d;
    public final di2 e;
    public final ei2 f;
    public final li2 g;
    public final k47 h;
    public final kxa i;

    public gg5(bf5 bf5Var, Executor executor, wh2 wh2Var, wh2 wh2Var2, wh2 wh2Var3, di2 di2Var, ei2 ei2Var, li2 li2Var, k47 k47Var, kxa kxaVar) {
        this.a = bf5Var;
        this.b = executor;
        this.c = wh2Var;
        this.d = wh2Var2;
        this.e = di2Var;
        this.f = ei2Var;
        this.g = li2Var;
        this.h = k47Var;
        this.i = kxaVar;
    }

    public static ArrayList e(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    public final Task a() {
        di2 di2Var = this.e;
        long j = ((li2) di2Var.g).a.getLong("minimum_fetch_interval_in_seconds", 43200L);
        HashMap map = new HashMap((Map) di2Var.v);
        map.put("X-Firebase-RC-Fetch-Type", ci2.BASE.a() + "/1");
        return ((wh2) di2Var.e).b().g((Executor) di2Var.c, new zh2(di2Var, j, map)).o(if5.a, new pd4(28)).o(this.b, new fg5(this));
    }

    public final HashMap b() {
        HashSet<String> hashSet = new HashSet();
        ei2 ei2Var = this.f;
        hashSet.addAll(ei2.a(ei2Var.c));
        hashSet.addAll(ei2.a(ei2Var.d));
        HashMap map = new HashMap();
        for (String str : hashSet) {
            map.put(str, ei2Var.b(str));
        }
        return map;
    }

    public final ff8 c() {
        ff8 ff8Var;
        li2 li2Var = this.g;
        synchronized (li2Var.b) {
            try {
                li2Var.a.getLong("last_fetch_time_in_millis", -1L);
                int i = li2Var.a.getInt("last_fetch_status", 0);
                long j = li2Var.a.getLong("fetch_timeout_in_seconds", 60L);
                if (j < 0) {
                    throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j)));
                }
                long j2 = li2Var.a.getLong("minimum_fetch_interval_in_seconds", 43200L);
                if (j2 < 0) {
                    throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j2 + " is an invalid argument");
                }
                ff8Var = new ff8(i, 7);
            } catch (Throwable th) {
                throw th;
            }
        }
        return ff8Var;
    }

    public final void d(boolean z) {
        HttpURLConnection httpURLConnection;
        k47 k47Var = this.h;
        synchronized (k47Var) {
            ii2 ii2Var = (ii2) k47Var.c;
            synchronized (ii2Var.q) {
                try {
                    ii2Var.e = z;
                    th2 th2Var = ii2Var.g;
                    if (th2Var != null) {
                        th2Var.a = z;
                    }
                    if (z && (httpURLConnection = ii2Var.f) != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z) {
                synchronized (k47Var) {
                    if (!((LinkedHashSet) k47Var.b).isEmpty()) {
                        ((ii2) k47Var.c).e(0L);
                    }
                }
            }
        }
    }
}
