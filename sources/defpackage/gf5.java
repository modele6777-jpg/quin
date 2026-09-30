package defpackage;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gf5 implements o05, whd {
    public final FirebaseAnalytics a;
    public String b;
    public boolean c;
    public boolean d;

    public gf5(FirebaseAnalytics firebaseAnalytics) {
        this.a = firebaseAnalytics;
    }

    @Override // defpackage.o05
    public final synchronized void a() {
        vxg vxgVar = this.a.a;
        Boolean bool = Boolean.TRUE;
        vxgVar.getClass();
        vxgVar.c(new qwg(vxgVar, bool));
        this.c = true;
    }

    @Override // defpackage.o05
    public final synchronized void b(String str) {
        if (str == null) {
            try {
                if (this.d) {
                    this.a.a(str);
                    this.b = str;
                    this.d = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            this.a.a(str);
            this.b = str;
            this.d = false;
        }
    }

    @Override // defpackage.o05
    public final synchronized void c(String str, trd trdVar) {
        str.getClass();
        if (!this.d || g()) {
            l1f l1fVar = new l1f();
            l1fVar.a("android", "platform");
            ca2.a.getClass();
            l1fVar.a(ca2.c ? "global" : "cn", "region");
            trdVar.d(l1fVar);
            Bundle bundle = new Bundle();
            for (Map.Entry entry : l1fVar.a.entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    bundle.putString(str2, (String) value);
                } else if (value instanceof Integer) {
                    bundle.putInt(str2, ((Number) value).intValue());
                } else if (value instanceof Long) {
                    bundle.putLong(str2, ((Number) value).longValue());
                } else if (value instanceof Double) {
                    bundle.putDouble(str2, ((Number) value).doubleValue());
                } else if (value instanceof Boolean) {
                    bundle.putBoolean(str2, ((Boolean) value).booleanValue());
                } else {
                    bundle.putString(str2, value.toString());
                }
            }
            vxg vxgVar = this.a.a;
            vxgVar.getClass();
            vxgVar.c(new owg(vxgVar, (String) null, str, bundle, false));
        }
    }

    @Override // defpackage.whd
    public final synchronized boolean d(s7a s7aVar) {
        try {
            if (!this.c) {
                return false;
            }
            Bundle bundle = new Bundle();
            for (Map.Entry entry : s7aVar.b.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            bundle.putString("uid", s7aVar.a);
            bundle.putLong("registration_occurred_at_ms", s7aVar.c);
            try {
                this.a.a(s7aVar.a);
                vxg vxgVar = this.a.a;
                vxgVar.getClass();
                vxgVar.c(new owg(vxgVar, (String) null, "sign_up_completed", bundle, false));
                g();
                return true;
            } catch (Throwable th) {
                g();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // defpackage.o05
    public final synchronized void e(a26 a26Var) {
        if (!this.d || g()) {
            l1f l1fVar = new l1f();
            a26Var.d(l1fVar);
            for (Map.Entry entry : l1fVar.a.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                FirebaseAnalytics firebaseAnalytics = this.a;
                String string = value.toString();
                vxg vxgVar = firebaseAnalytics.a;
                vxgVar.getClass();
                vxgVar.c(new owg(vxgVar, (String) null, str, (Object) string, false));
            }
        }
    }

    @Override // defpackage.o05
    public final synchronized void f(String str) {
        this.a.a(str);
        this.b = str;
        this.d = false;
    }

    public final boolean g() {
        Object dzbVar;
        try {
            this.a.a(this.b);
            this.d = false;
            dzbVar = wef.a;
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            this.d = true;
            hf8.Q.getClass();
            ef8.a("FirebaseEventTracker").c("Failed to restore analytics identity", thA);
        }
        return !(dzbVar instanceof dzb);
    }

    @Override // defpackage.o05
    public final synchronized void reset() {
        vxg vxgVar = this.a.a;
        vxgVar.getClass();
        vxgVar.c(new ywg(vxgVar));
        this.b = null;
        this.d = false;
    }
}
