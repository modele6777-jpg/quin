package defpackage;

import android.util.Log;
import io.sentry.android.core.b1;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ct {
    public static volatile ct b;
    public boolean a;

    public static ct d() {
        if (b == null) {
            synchronized (ct.class) {
                if (b == null) {
                    ct ctVar = new ct();
                    ctVar.a = false;
                    synchronized (af8.class) {
                        if (af8.b == null) {
                            af8.b = new af8(0);
                        }
                    }
                    b = ctVar;
                }
            }
        }
        return b;
    }

    public final void a(String str) {
        if (this.a) {
            Log.d("FirebasePerformance", str);
        }
    }

    public final void b(String str, Object... objArr) {
        if (this.a) {
            Log.d("FirebasePerformance", String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public final void c(String str, Object... objArr) {
        if (this.a) {
            b1.d("FirebasePerformance", String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public final void e(String str, Object... objArr) {
        if (this.a) {
            Log.i("FirebasePerformance", String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public final void f(String str) {
        if (this.a) {
            b1.l("FirebasePerformance", str);
        }
    }

    public final void g(String str, Object... objArr) {
        if (this.a) {
            b1.l("FirebasePerformance", String.format(Locale.ENGLISH, str, objArr));
        }
    }
}
