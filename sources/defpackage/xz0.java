package defpackage;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xz0 extends c82 {
    public final long b;
    public final int c;

    /* JADX WARN: Illegal instructions before constructor call */
    public xz0(long j, int i) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            fv.i();
            porterDuffColorFilter = fv.a(abg.Z(j), bp.U(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(abg.Z(j), bp.X(i));
        }
        super(porterDuffColorFilter);
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xz0)) {
            return false;
        }
        xz0 xz0Var = (xz0) obj;
        long j = xz0Var.b;
        int i = y72.l;
        return faf.a(this.b, j) && this.c == xz0Var.c;
    }

    public final int hashCode() {
        int i = y72.l;
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return tec.m("BlendModeColorFilter(color=", y72.h(this.b), ", blendMode=", kn2.Z(this.c), ")");
    }
}
