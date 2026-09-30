package io.sentry.android.fragment;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks;
import defpackage.kx5;
import defpackage.mmb;
import defpackage.rl2;
import defpackage.zx5;
import io.sentry.g;
import io.sentry.g1;
import io.sentry.h7;
import io.sentry.l0;
import io.sentry.o1;
import io.sentry.q5;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends FragmentManager$FragmentLifecycleCallbacks {
    public final g1 a;
    public final Set b;
    public final boolean c;
    public final WeakHashMap d;

    public d(g1 g1Var, Set set, boolean z) {
        g1Var.getClass();
        set.getClass();
        this.a = g1Var;
        this.b = set;
        this.c = z;
        this.d = new WeakHashMap();
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void a(zx5 zx5Var, kx5 kx5Var, Context context) {
        k(kx5Var, b.ATTACHED);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void b(zx5 zx5Var, kx5 kx5Var) {
        k(kx5Var, b.CREATED);
        if (kx5Var.n()) {
            String canonicalName = kx5Var.getClass().getCanonicalName();
            if (canonicalName == null) {
                canonicalName = kx5Var.getClass().getSimpleName();
            }
            g1 g1Var = this.a;
            if (g1Var.o().isEnableScreenTracking()) {
                g1Var.n(new rl2(canonicalName, 8));
            }
            if (g1Var.o().isTracingEnabled() && this.c) {
                WeakHashMap weakHashMap = this.d;
                if (weakHashMap.containsKey(kx5Var)) {
                    return;
                }
                mmb mmbVar = new mmb();
                g1Var.n(new c(mmbVar, 0));
                o1 o1Var = (o1) mmbVar.element;
                o1 o1VarY = o1Var != null ? o1Var.y("ui.load", canonicalName) : null;
                if (o1VarY != null) {
                    weakHashMap.put(kx5Var, o1VarY);
                    o1VarY.u().w = "auto.ui.fragment";
                }
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void c(zx5 zx5Var, kx5 kx5Var) {
        k(kx5Var, b.DESTROYED);
        l(kx5Var);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void d(zx5 zx5Var, kx5 kx5Var) {
        k(kx5Var, b.DETACHED);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void e(zx5 zx5Var, kx5 kx5Var) {
        k(kx5Var, b.PAUSED);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void f(zx5 zx5Var, kx5 kx5Var) {
        k(kx5Var, b.RESUMED);
        l(kx5Var);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void g(zx5 zx5Var, kx5 kx5Var, Bundle bundle) {
        k(kx5Var, b.SAVE_INSTANCE_STATE);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void h(zx5 zx5Var, kx5 kx5Var) {
        k(kx5Var, b.STARTED);
        l(kx5Var);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void i(zx5 zx5Var, kx5 kx5Var) {
        k(kx5Var, b.STOPPED);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    public final void j(zx5 zx5Var, kx5 kx5Var) {
        k(kx5Var, b.VIEW_DESTROYED);
        l(kx5Var);
    }

    public final void k(kx5 kx5Var, b bVar) {
        if (this.b.contains(bVar)) {
            g gVar = new g();
            gVar.e = "navigation";
            gVar.d(bVar.getBreadcrumbName$sentry_android_fragment_release(), "state");
            String canonicalName = kx5Var.getClass().getCanonicalName();
            if (canonicalName == null) {
                canonicalName = kx5Var.getClass().getSimpleName();
            }
            gVar.d(canonicalName, "screen");
            gVar.g = "ui.fragment.lifecycle";
            gVar.w = q5.INFO;
            l0 l0Var = new l0();
            l0Var.d(kx5Var, "android:fragment");
            this.a.i(gVar, l0Var);
        }
    }

    public final void l(kx5 kx5Var) {
        o1 o1Var;
        if (this.a.o().isTracingEnabled() && this.c) {
            WeakHashMap weakHashMap = this.d;
            if (weakHashMap.containsKey(kx5Var) && (o1Var = (o1) weakHashMap.get(kx5Var)) != null) {
                h7 h7VarA = o1Var.a();
                if (h7VarA == null) {
                    h7VarA = h7.OK;
                }
                o1Var.h(h7VarA);
            }
        }
    }
}
