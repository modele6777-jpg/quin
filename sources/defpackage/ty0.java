package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ty0 {
    public final Bitmap a;
    public final Uri b;
    public final Exception c;
    public final int d;

    public ty0(Bitmap bitmap, Uri uri, Exception exc, int i) {
        this.a = bitmap;
        this.b = uri;
        this.c = exc;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty0)) {
            return false;
        }
        ty0 ty0Var = (ty0) obj;
        return pa7.t(this.a, ty0Var.a) && pa7.t(this.b, ty0Var.b) && pa7.t(this.c, ty0Var.c) && this.d == ty0Var.d;
    }

    public final int hashCode() {
        Bitmap bitmap = this.a;
        int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        Uri uri = this.b;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Exception exc = this.c;
        return Integer.hashCode(this.d) + ((iHashCode2 + (exc != null ? exc.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Result(bitmap=" + this.a + ", uri=" + this.b + ", error=" + this.c + ", sampleSize=" + this.d + ")";
    }
}
