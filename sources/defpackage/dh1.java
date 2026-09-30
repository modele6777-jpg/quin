package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dh1 {
    public final Context a;
    public final fh1 b;
    public final a90 c;
    public final ssg d;
    public final ch1 e;
    public final eh1 f;

    public dh1(Context context, fh1 fh1Var, ch1 ch1Var) {
        a90 a90Var = new a90(17);
        ssg ssgVar = new ssg(6);
        eh1 eh1Var = new eh1();
        this.a = context;
        this.b = fh1Var;
        this.c = a90Var;
        this.d = ssgVar;
        this.e = ch1Var;
        this.f = eh1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dh1) {
            dh1 dh1Var = (dh1) obj;
            if (this.a.equals(dh1Var.a) && this.b.equals(dh1Var.b) && this.c == dh1Var.c && this.d == dh1Var.d && this.e.equals(dh1Var.e) && this.f.equals(dh1Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ub3.d((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 961, 31, false);
    }

    public final String toString() {
        return "Config(appContext=" + this.a + ", threadConfig=" + this.b + ", cameraMetadataConfig=" + this.c + ", cameraBackendConfig=" + this.d + ", cameraInteropConfig=" + this.e + ", imageSources=null, flags=" + this.f + ", platformApiCompat=null)";
    }
}
