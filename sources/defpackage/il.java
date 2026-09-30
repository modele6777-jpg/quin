package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import tech.chatmind.api.credits.UsageBillingBalance;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class il implements Application.ActivityLifecycleCallbacks {
    public static final il a = new il();
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static final LinkedHashSet d = new LinkedHashSet();

    public static String a() {
        return c.get() ? UsageBillingBalance.STATUS_ACTIVE : "background";
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
        LinkedHashSet linkedHashSet = d;
        linkedHashSet.remove(activity);
        c.set(!linkedHashSet.isEmpty());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
        LinkedHashSet linkedHashSet = d;
        linkedHashSet.remove(activity);
        c.set(!linkedHashSet.isEmpty());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        d.add(activity);
        c.set(true);
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
}
