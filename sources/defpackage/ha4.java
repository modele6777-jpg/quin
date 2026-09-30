package defpackage;

import android.os.Build;
import android.view.DisplayCutout;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ha4 {
    public final DisplayCutout a;

    public ha4(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final x47 a() {
        return Build.VERSION.SDK_INT >= 30 ? x47.c(p6.i(this.a)) : x47.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ha4.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((ha4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
