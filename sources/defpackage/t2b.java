package defpackage;

import android.app.Application;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t2b {
    public static Map a;
    public static final AtomicBoolean b = new AtomicBoolean(false);

    public static void a(Application application) {
        if (b.compareAndSet(false, true)) {
            Map map = a;
            if (map == null) {
                pa7.g0("supportedPushComponentInitializers");
                throw null;
            }
            for (u2b u2bVar : map.keySet()) {
                try {
                    u2bVar.getClass();
                    Map map2 = a;
                    if (map2 == null) {
                        pa7.g0("supportedPushComponentInitializers");
                        throw null;
                    }
                    Class cls = (Class) map2.get(u2bVar);
                    if ((cls != null ? (eg5) ta0.v(application).n(cls) : null) != null) {
                        try {
                            hf8.Q.getClass();
                            ef8.a("FirebasePushService").e("Firebase Push service initialized");
                        } catch (Exception e) {
                            hf8.Q.getClass();
                            ef8.a("FirebasePushService").c("Firebase Push initialization failed", e);
                        }
                    }
                } catch (Exception e2) {
                    ynb.h0(e2);
                    hf8.Q.getClass();
                    ef8.a("PushServiceInitializer").c("Push service initialization failed for " + u2bVar, e2);
                }
                ynb.h0(e2);
                hf8.Q.getClass();
                ef8.a("PushServiceInitializer").c("Push service initialization failed for " + u2bVar, e2);
            }
        }
    }
}
