package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yd1 {
    public final Map a;
    public final Object b = new Object();
    public final LinkedHashMap c = new LinkedHashMap();
    public final vd1 d;

    public yd1(String str, Map map, Context context, qwe qweVar, nh1 nh1Var) {
        this.a = map;
        nh1Var.a(kh1.a, new j1(13, this));
        vd1 vd1VarA = a(str);
        if (vd1VarA != null) {
            this.d = vd1VarA;
            return;
        }
        StringBuilder sb = new StringBuilder("Failed to load the default backend for ");
        sb.append((Object) wd1.a(str));
        qc0.m(sb, "! Available backends are ", map.keySet());
        throw null;
    }

    public final vd1 a(String str) {
        str.getClass();
        synchronized (this.b) {
            try {
                vd1 vd1Var = (vd1) this.c.get(new wd1(str));
                if (vd1Var != null) {
                    return vd1Var;
                }
                oh1 oh1Var = (oh1) this.a.get(new wd1(str));
                vd1 vd1Var2 = oh1Var != null ? oh1Var.a : null;
                if (vd1Var2 != null) {
                    if (!str.equals("CXCP-Camera2")) {
                        throw new IllegalStateException(("Unexpected backend id! Expected " + ((Object) wd1.a(str)) + " but it was actually " + ((Object) wd1.a("CXCP-Camera2"))).toString());
                    }
                    this.c.put(new wd1(str), vd1Var2);
                }
                return vd1Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
