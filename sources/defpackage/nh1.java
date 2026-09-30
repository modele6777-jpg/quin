package defpackage;

import android.util.Log;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nh1 {
    public final dg7 a;
    public final Object b;
    public final ArrayList c;
    public final Object d;
    public final ArrayList e;
    public final Object f;
    public final ArrayList g;

    public nh1(dg7 dg7Var) {
        dg7Var.getClass();
        this.a = dg7Var;
        this.b = new Object();
        this.c = new ArrayList();
        this.d = new Object();
        this.e = new ArrayList();
        this.f = new Object();
        this.g = new ArrayList();
    }

    public final void a(kh1 kh1Var, Runnable runnable) {
        boolean zAdd;
        int iOrdinal = kh1Var.ordinal();
        if (iOrdinal == 0) {
            synchronized (this.b) {
                zAdd = this.c.add(runnable);
            }
        } else if (iOrdinal == 1) {
            synchronized (this.d) {
                zAdd = this.e.add(runnable);
            }
        } else if (iOrdinal != 2) {
            ap.c();
            return;
        } else {
            synchronized (this.f) {
                zAdd = this.g.add(runnable);
            }
        }
        if (zAdd) {
            return;
        }
        b1.d("CXCP", "CameraPipeLifetime already shut down. This is unexpected. Executing " + kh1Var + " shutdown action immediately...");
        runnable.run();
    }

    public final void b() {
        synchronized (this.b) {
            Log.d("CXCP", "Shutting down cameras...");
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        synchronized (this.d) {
            try {
                Log.d("CXCP", "Shutting down scopes...");
                Iterator it2 = this.e.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f) {
            Log.d("CXCP", "Shutting down threads...");
            Iterator it3 = this.g.iterator();
            while (it3.hasNext()) {
                ((Runnable) it3.next()).run();
            }
        }
    }
}
