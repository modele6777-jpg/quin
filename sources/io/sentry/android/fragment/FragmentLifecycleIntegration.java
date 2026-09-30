package io.sentry.android.fragment;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import defpackage.nx5;
import defpackage.pa7;
import defpackage.qx5;
import defpackage.w84;
import defpackage.xu4;
import defpackage.z7c;
import defpackage.zx5;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.g1;
import io.sentry.k4;
import io.sentry.o5;
import io.sentry.q5;
import io.sentry.w1;
import java.io.Closeable;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\rB!\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/sentry/android/fragment/FragmentLifecycleIntegration;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Lio/sentry/w1;", "Ljava/io/Closeable;", "Landroid/app/Application;", "application", "", "Lio/sentry/android/fragment/b;", "filterFragmentLifecycleBreadcrumbs", "", "enableAutoFragmentLifecycleTracing", "<init>", "(Landroid/app/Application;Ljava/util/Set;Z)V", "(Landroid/app/Application;)V", "enableFragmentLifecycleBreadcrumbs", "(Landroid/app/Application;ZZ)V", "sentry-android-fragment_release"}, k = 1, mv = {1, 9, 0}, xi = z7c.f)
public final class FragmentLifecycleIntegration implements Application.ActivityLifecycleCallbacks, w1, Closeable {
    public final Application a;
    public final Set b;
    public final boolean c;
    public g1 d;
    public SentryAndroidOptions e;

    static {
        o5.d().b("maven:io.sentry:sentry-android-fragment", "8.53.0");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentLifecycleIntegration(Application application, boolean z, boolean z2) {
        application.getClass();
        b.Companion.getClass();
        Set set = z ? b.states : null;
        this(application, (Set<? extends b>) (set == null ? xu4.a : set), z2);
    }

    @Override // io.sentry.w1
    public final void R(SentryAndroidOptions sentryAndroidOptions) {
        this.d = k4.a;
        this.e = sentryAndroidOptions;
        this.a.registerActivityLifecycleCallbacks(this);
        sentryAndroidOptions.getLogger().i(q5.DEBUG, "FragmentLifecycleIntegration installed.", new Object[0]);
        io.sentry.util.b.a("FragmentLifecycle");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.e;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().i(q5.DEBUG, "FragmentLifecycleIntegration removed.", new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        nx5 nx5Var = activity instanceof nx5 ? (nx5) activity : null;
        if (nx5Var != null) {
            zx5 zx5VarQ = nx5Var.q();
            g1 g1Var = this.d;
            if (g1Var == null) {
                pa7.g0("scopes");
                throw null;
            }
            d dVar = new d(g1Var, this.b, this.c);
            w84 w84Var = zx5VarQ.o;
            w84Var.getClass();
            ((CopyOnWriteArrayList) w84Var.c).add(new qx5(dVar));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentLifecycleIntegration(Application application) {
        this(application, (Set<? extends b>) b.states, false);
        application.getClass();
        b.Companion.getClass();
    }

    public FragmentLifecycleIntegration(Application application, Set<? extends b> set, boolean z) {
        application.getClass();
        set.getClass();
        this.a = application;
        this.b = set;
        this.c = z;
    }
}
