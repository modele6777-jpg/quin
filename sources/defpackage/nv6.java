package defpackage;

import android.net.Uri;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class nv6 extends ov6 {
    public final File a;
    public final Uri b;

    public nv6(File file, Uri uri) {
        this.a = file;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nv6)) {
            return false;
        }
        nv6 nv6Var = (nv6) obj;
        return pa7.t(this.a, nv6Var.a) && this.b.equals(nv6Var.b);
    }

    public final int hashCode() {
        File file = this.a;
        return this.b.hashCode() + ((file == null ? 0 : file.hashCode()) * 31);
    }

    public final String toString() {
        return "Success(file=" + this.a + ", uri=" + this.b + ")";
    }
}
