package defpackage;

import android.os.Build;
import android.os.Trace;
import io.sentry.android.core.b1;
import java.util.ArrayDeque;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class dfh {
    public static final AtomicReference a;
    public static final mwg b;
    public static final WeakHashMap c;
    public static final kw d;

    static {
        ry6.m(5, "androidx.fragment.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl");
        a = new AtomicReference(fpb.x);
        b = new mwg(21);
        c = new WeakHashMap();
        d = new kw(16);
        new ArrayDeque();
        new ArrayDeque();
    }

    public static weh a() {
        qfh qfhVarC = c();
        weh wehVar = qfhVarC.b;
        if (wehVar != null && wehVar != kfh.g) {
            return wehVar;
        }
        zeh zehVar = jfh.f;
        efh efhVar = efh.c;
        long jA = efhVar.a() & (-61441);
        long jA2 = efhVar.a() >>> 2;
        UUID uuid = efhVar.a;
        UUID uuid2 = new UUID(jA ^ uuid.getMostSignificantBits(), jA2 ^ uuid.getLeastSignificantBits());
        String strB = weh.b(uuid2);
        ry6 ry6Var = (ry6) a.get();
        if (!ry6Var.isEmpty()) {
            ry6Var.forEach(new ifh());
        }
        zeh zehVar2 = jfh.f;
        return new jfh("<missing root>", uuid2, strB, qfhVarC);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    public static weh b(qfh qfhVar, weh wehVar) {
        boolean zEquals;
        qfhVar.getClass();
        weh wehVar2 = qfhVar.b;
        if (wehVar2 != wehVar) {
            if (wehVar2 == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    zEquals = Trace.isEnabled();
                } else {
                    rdh.a.getClass();
                    b.getClass();
                    String str = "false";
                    try {
                        str = (String) sdh.a.invoke(null, "tiktok_systrace", "false");
                    } catch (Exception e) {
                        b1.e("SystemProperties", "get error", e);
                    }
                    zEquals = str.equals("true");
                }
                qfhVar.a = zEquals;
            }
            if (qfhVar.a) {
                if (wehVar2 != null) {
                    if (wehVar != null) {
                        if (wehVar2.a == wehVar && !jrb.v(wehVar2)) {
                            Trace.endSection();
                        } else if (wehVar2 == wehVar.a && !jrb.v(wehVar)) {
                            jrb.x(wehVar);
                        }
                    }
                    jrb.t(wehVar2);
                    if (wehVar != null) {
                        jrb.r(wehVar);
                    }
                } else if (wehVar != null) {
                    jrb.r(wehVar);
                }
            }
            if (wehVar2 != wehVar) {
                qfhVar.b = wehVar;
                return wehVar2;
            }
        }
        return wehVar;
    }

    public static qfh c() {
        return (qfh) d.get();
    }
}
