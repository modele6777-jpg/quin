package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wo {
    public final String a;
    public final String b;
    public final String c;
    public final jva d;
    public final ArrayList e;

    public wo(String str, String str2, String str3, jva jvaVar, ArrayList arrayList) {
        tec.x(str2, str3, Build.MANUFACTURER);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = jvaVar;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wo)) {
            return false;
        }
        wo woVar = (wo) obj;
        if (!this.a.equals(woVar.a) || !pa7.t(this.b, woVar.b) || !pa7.t(this.c, woVar.c)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return pa7.t(str, str) && this.d.equals(woVar.d) && this.e.equals(woVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ub3.c(ub3.c(ub3.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, Build.MANUFACTURER)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.a + ", versionName=" + this.b + ", appBuildVersion=" + this.c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.e + ')';
    }
}
