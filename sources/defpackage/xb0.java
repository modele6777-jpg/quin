package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xb0 {
    public final String a;
    public final wo b;

    public xb0(String str, wo woVar) {
        tec.x(str, Build.MODEL, Build.VERSION.RELEASE);
        this.a = str;
        this.b = woVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xb0)) {
            return false;
        }
        xb0 xb0Var = (xb0) obj;
        if (!pa7.t(this.a, xb0Var.a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!pa7.t(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return pa7.t(str2, str2) && this.b.equals(xb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((te8.LOG_ENVIRONMENT_PROD.hashCode() + ub3.c((((Build.MODEL.hashCode() + (this.a.hashCode() * 31)) * 31) + 48517566) * 31, 31, Build.VERSION.RELEASE)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=3.0.7, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + te8.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.b + ')';
    }
}
