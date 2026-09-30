package defpackage;

import android.content.Context;
import android.util.Log;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zl {
    public static final HashMap e = new HashMap();
    public volatile gk2 a;
    public final yl b;
    public final Context c;
    public final gj8 d;

    public zl(Context context, gj8 gj8Var) {
        this.c = context;
        this.d = gj8Var;
        gj8Var.getClass();
        this.b = new yl(this);
        gk2 gk2VarB = b();
        gk2VarB.getClass();
        new Thread(new m45(5, gk2VarB)).start();
    }

    public static void a(JSONObject jSONObject, Set set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!jy8.d.contains(str)) {
                jSONObject.remove(str);
            }
        }
    }

    public static void c(Exception exc, String str) {
        StringBuilder sbQ = kv2.q(str, " (Thread ");
        sbQ.append(Thread.currentThread().getId());
        sbQ.append(")");
        String string = sbQ.toString();
        if (db6.L0(2)) {
            Log.v("MixpanelAPI.Messages", string, exc);
        }
    }

    public static void d(String str) {
        StringBuilder sbQ = kv2.q(str, " (Thread ");
        sbQ.append(Thread.currentThread().getId());
        sbQ.append(")");
        db6.f1("MixpanelAPI.Messages", sbQ.toString());
    }

    public final gk2 b() {
        String host;
        if (this.a == null) {
            String str = this.d.i;
            try {
                host = new URL(str).getHost();
            } catch (Exception e2) {
                db6.G("MixpanelAPI.Messages", "Could not extract host from URL " + str + ". Using default host instead.", e2);
                host = "api.mixpanel.com";
            }
            gj8 gj8Var = this.d;
            this.a = new gk2(gj8Var.t, host, gj8Var.o);
        } else {
            this.a.c = this.d.t;
            this.a.getClass();
        }
        return this.a;
    }
}
