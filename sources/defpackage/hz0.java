package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hz0 {
    public final Uri a;
    public final Bitmap b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final Exception g;

    public hz0(Uri uri, Bitmap bitmap, int i, int i2, boolean z, boolean z2, Exception exc) {
        this.a = uri;
        this.b = bitmap;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = z2;
        this.g = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hz0)) {
            return false;
        }
        hz0 hz0Var = (hz0) obj;
        return this.a.equals(hz0Var.a) && pa7.t(this.b, hz0Var.b) && this.c == hz0Var.c && this.d == hz0Var.d && this.e == hz0Var.e && this.f == hz0Var.f && pa7.t(this.g, hz0Var.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Bitmap bitmap = this.b;
        int iD = ub3.d(ub3.d(ub3.b(this.d, ub3.b(this.c, (iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31, 31), 31), 31, this.e), 31, this.f);
        Exception exc = this.g;
        return iD + (exc != null ? exc.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(uri=");
        sb.append(this.a);
        sb.append(", bitmap=");
        sb.append(this.b);
        sb.append(", loadSampleSize=");
        ub3.u(sb, this.c, ", degreesRotated=", this.d, ", flipHorizontally=");
        ib8.w(sb, this.e, ", flipVertically=", this.f, ", error=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
