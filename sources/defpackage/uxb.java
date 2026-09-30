package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uxb {
    public final Bitmap a;
    public final boolean b;

    public uxb(Bitmap bitmap, boolean z) {
        this.a = bitmap;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxb)) {
            return false;
        }
        uxb uxbVar = (uxb) obj;
        return pa7.t(this.a, uxbVar.a) && this.b == uxbVar.b;
    }

    public final int hashCode() {
        Bitmap bitmap = this.a;
        return Boolean.hashCode(this.b) + ((bitmap == null ? 0 : bitmap.hashCode()) * 31);
    }

    public final String toString() {
        return "ResourceBitmap(bitmap=" + this.a + ", isResolved=" + this.b + ")";
    }
}
