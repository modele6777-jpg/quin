package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qqg extends m4 {
    public Boolean c;
    public String d;
    public pqg e;
    public Boolean f;

    public final boolean B0(String str) {
        w3h.f(((w3h) this.b).w);
        if (qch.d1((String) bzg.g1.a(null), str) || qch.d1((String) bzg.h1.a(null), str) || qch.d1((String) bzg.i1.a(null), str)) {
            return true;
        }
        return "1".equals(this.e.M(str, "gaia_collection_enabled"));
    }

    public final boolean C0(String str) {
        return "1".equals(this.e.M(str, "measurement.event_sampling_enabled"));
    }

    public final boolean D0() {
        Boolean boolN0 = this.c;
        if (boolN0 == null) {
            boolN0 = N0("app_measurement_lite");
            this.c = boolN0;
            if (boolN0 == null) {
                boolN0 = Boolean.FALSE;
                this.c = boolN0;
            }
        }
        return boolN0.booleanValue() || !((w3h) this.b).b;
    }

    public final String E0(String str) {
        w3h w3hVar = (w3h) this.b;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            oa7.A(str2);
            return str2;
        } catch (ClassNotFoundException e) {
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.g.b(e, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e2) {
            w0h w0hVar2 = w3hVar.f;
            w3h.h(w0hVar2);
            w0hVar2.g.b(e2, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e3) {
            w0h w0hVar3 = w3hVar.f;
            w3h.h(w0hVar3);
            w0hVar3.g.b(e3, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e4) {
            w0h w0hVar4 = w3hVar.f;
            w3h.h(w0hVar4);
            w0hVar4.g.b(e4, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final int F0(String str, boolean z) {
        return Math.max(z ? Math.max(Math.min(J0(str, bzg.g0), 500), 100) : 500, 256);
    }

    public final void G0() {
        ((w3h) this.b).getClass();
    }

    public final String H0(String str, azg azgVar) {
        return TextUtils.isEmpty(str) ? (String) azgVar.a(null) : (String) azgVar.a(this.e.M(str, azgVar.a));
    }

    public final long I0(String str, azg azgVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) azgVar.a(null)).longValue();
        }
        String strM = this.e.M(str, azgVar.a);
        if (TextUtils.isEmpty(strM)) {
            return ((Long) azgVar.a(null)).longValue();
        }
        try {
            return ((Long) azgVar.a(Long.valueOf(Long.parseLong(strM)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) azgVar.a(null)).longValue();
        }
    }

    public final int J0(String str, azg azgVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) azgVar.a(null)).intValue();
        }
        String strM = this.e.M(str, azgVar.a);
        if (TextUtils.isEmpty(strM)) {
            return ((Integer) azgVar.a(null)).intValue();
        }
        try {
            return ((Integer) azgVar.a(Integer.valueOf(Integer.parseInt(strM)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) azgVar.a(null)).intValue();
        }
    }

    public final double K0(String str, azg azgVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) azgVar.a(null)).doubleValue();
        }
        String strM = this.e.M(str, azgVar.a);
        if (TextUtils.isEmpty(strM)) {
            return ((Double) azgVar.a(null)).doubleValue();
        }
        try {
            return ((Double) azgVar.a(Double.valueOf(Double.parseDouble(strM)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) azgVar.a(null)).doubleValue();
        }
    }

    public final boolean L0(String str, azg azgVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) azgVar.a(null)).booleanValue();
        }
        String strM = this.e.M(str, azgVar.a);
        return TextUtils.isEmpty(strM) ? ((Boolean) azgVar.a(null)).booleanValue() : ((Boolean) azgVar.a(Boolean.valueOf("1".equals(strM)))).booleanValue();
    }

    public final Bundle M0() {
        w3h w3hVar = (w3h) this.b;
        try {
            Context context = w3hVar.a;
            Context context2 = w3hVar.a;
            w0h w0hVar = w3hVar.f;
            if (context.getPackageManager() == null) {
                w3h.h(w0hVar);
                w0hVar.g.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoA = rcg.a(context2).a(UserMetadata.MAX_ROLLOUT_ASSIGNMENTS, context2.getPackageName());
            if (applicationInfoA != null) {
                return applicationInfoA.metaData;
            }
            w3h.h(w0hVar);
            w0hVar.g.a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            w0h w0hVar2 = w3hVar.f;
            w3h.h(w0hVar2);
            w0hVar2.g.b(e, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final Boolean N0(String str) {
        oa7.x(str);
        Bundle bundleM0 = M0();
        if (bundleM0 != null) {
            if (bundleM0.containsKey(str)) {
                return Boolean.valueOf(bundleM0.getBoolean(str));
            }
            return null;
        }
        w0h w0hVar = ((w3h) this.b).f;
        w3h.h(w0hVar);
        w0hVar.g.a("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    public final boolean O0() {
        ((w3h) this.b).getClass();
        Boolean boolN0 = N0("firebase_analytics_collection_deactivated");
        return boolN0 != null && boolN0.booleanValue();
    }

    public final boolean P0() {
        Boolean boolN0 = N0("google_analytics_automatic_screen_reporting_enabled");
        return boolN0 == null || boolN0.booleanValue();
    }

    public final k5h Q0(String str, boolean z) {
        Object obj;
        oa7.x(str);
        w3h w3hVar = (w3h) this.b;
        Bundle bundleM0 = M0();
        if (bundleM0 == null) {
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.g.a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleM0.get(str);
        }
        k5h k5hVar = k5h.UNINITIALIZED;
        if (obj == null) {
            return k5hVar;
        }
        if (Boolean.TRUE.equals(obj)) {
            return k5h.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return k5h.DENIED;
        }
        if (z && "eu_consent_policy".equals(obj)) {
            return k5h.POLICY;
        }
        w0h w0hVar2 = w3hVar.f;
        w3h.h(w0hVar2);
        w0hVar2.x.b(str, "Invalid manifest metadata for");
        return k5hVar;
    }
}
