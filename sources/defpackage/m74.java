package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class m74 {
    public static final ct c = ct.d();
    public static m74 d;
    public volatile SharedPreferences a;
    public final ExecutorService b;

    public m74(ExecutorService executorService) {
        this.b = executorService;
    }

    public static Context a() {
        try {
            ff5.d();
            ff5 ff5VarD = ff5.d();
            ff5VarD.a();
            return ff5VarD.a;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public static synchronized m74 b() {
        m74 m74Var;
        m74Var = d;
        if (m74Var == null) {
            m74Var = new m74(Executors.newSingleThreadExecutor());
            d = m74Var;
        }
        return m74Var;
    }

    public final synchronized void c(Context context) {
        if (this.a == null && context != null) {
            this.b.execute(new ny2(14, this, context));
        }
    }

    public final void d(long j, String str) {
        if (this.a == null) {
            c(a());
            if (this.a == null) {
                return;
            }
        }
        this.a.edit().putLong(str, j).apply();
    }

    public final void e(String str, double d2) {
        if (this.a == null) {
            c(a());
            if (this.a == null) {
                return;
            }
        }
        this.a.edit().putLong(str, Double.doubleToRawLongBits(d2)).apply();
    }

    public final void f(String str, String str2) {
        if (this.a == null) {
            c(a());
            if (this.a == null) {
                return;
            }
        }
        SharedPreferences sharedPreferences = this.a;
        if (str2 == null) {
            sharedPreferences.edit().remove(str).apply();
        } else {
            sharedPreferences.edit().putString(str, str2).apply();
        }
    }

    public final void g(String str, boolean z) {
        if (this.a == null) {
            c(a());
            if (this.a == null) {
                return;
            }
        }
        this.a.edit().putBoolean(str, z).apply();
    }
}
