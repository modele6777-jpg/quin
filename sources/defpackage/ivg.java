package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ivg implements vwg {
    public static final Object d = new Object();
    public static final l18 e = new l18(zwg.class, 1);
    public static final boolean f;
    public static final m7c g;
    public volatile Object a;
    public volatile bvg b;
    public volatile gvg c;

    static {
        boolean z;
        m7c evgVar;
        Throwable th;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f = z;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th3 = null;
        if (property == null || property.contains("Android")) {
            try {
                evgVar = new fvg();
            } catch (Error | Exception e2) {
                try {
                    evgVar = new dvg();
                } catch (Error | Exception e3) {
                    th3 = e3;
                    evgVar = new evg();
                }
                th = th3;
                th2 = e2;
            }
        } else {
            try {
                evgVar = new dvg();
            } catch (NoClassDefFoundError unused2) {
                evgVar = new evg();
            }
        }
        th = null;
        th2 = null;
        g = evgVar;
        if (th != null) {
            l18 l18Var = e;
            Logger loggerB = l18Var.b();
            Level level = Level.SEVERE;
            loggerB.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            l18Var.b().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    public final void a(gvg gvgVar) {
        gvgVar.a = null;
        while (true) {
            gvg gvgVar2 = this.c;
            if (gvgVar2 != gvg.c) {
                gvg gvgVar3 = null;
                while (gvgVar2 != null) {
                    gvg gvgVar4 = gvgVar2.b;
                    if (gvgVar2.a != null) {
                        gvgVar3 = gvgVar2;
                    } else if (gvgVar3 != null) {
                        gvgVar3.b = gvgVar4;
                        if (gvgVar3.a == null) {
                        }
                    } else if (!g.C(this, gvgVar2, gvgVar4)) {
                    }
                    gvgVar2 = gvgVar4;
                }
                return;
            }
            return;
        }
    }

    public abstract Throwable d();
}
