package io.sentry.util;

import io.sentry.q5;
import io.sentry.q6;
import io.sentry.z0;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class g {
    public static final HashMap a;

    static {
        HashMap map = new HashMap();
        a = map;
        Boolean bool = Boolean.TRUE;
        map.put("androidx.compose.ui.node.Owner", bool);
        map.put("androidx.core.view.ScrollingView", bool);
        map.put("androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks", bool);
        map.put("androidx.lifecycle.Lifecycle", bool);
        map.put("io.sentry.android.distribution.DistributionIntegration", Boolean.FALSE);
        map.put("io.sentry.android.fragment.FragmentLifecycleIntegration", bool);
        map.put("io.sentry.android.replay.ReplayIntegration", bool);
        map.put("io.sentry.android.timber.SentryTimberIntegration", bool);
        map.put("io.sentry.compose.gestures.ComposeGestureTargetLocator", bool);
        map.put("io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter", bool);
        map.put("timber.log.Timber", bool);
    }

    public static boolean a(z0 z0Var, String str) {
        Boolean bool;
        HashMap map = a;
        if (map == null || (bool = (Boolean) map.get(str)) == null) {
            return c(z0Var, str, false) != null;
        }
        if (!bool.booleanValue() && z0Var != null) {
            z0Var.i(q5.INFO, "Class not available: ".concat(str), new Object[0]);
        }
        return bool.booleanValue();
    }

    public static boolean b(q6 q6Var, String str) {
        return a(q6Var != null ? q6Var.getLogger() : null, str);
    }

    public static Class c(z0 z0Var, String str, boolean z) {
        try {
            return Class.forName(str, z, g.class.getClassLoader());
        } catch (ClassNotFoundException unused) {
            if (z0Var == null) {
                return null;
            }
            z0Var.i(q5.INFO, "Class not available: ".concat(str), new Object[0]);
            return null;
        } catch (UnsatisfiedLinkError e) {
            if (z0Var == null) {
                return null;
            }
            z0Var.d(q5.ERROR, "Failed to load (UnsatisfiedLinkError) ".concat(str), e);
            return null;
        } catch (Throwable th) {
            if (z0Var == null) {
                return null;
            }
            z0Var.d(q5.ERROR, "Failed to initialize ".concat(str), th);
            return null;
        }
    }
}
