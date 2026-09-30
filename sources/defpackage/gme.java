package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gme {
    public final String a;
    public final Uri b;

    public gme(Uri uri, String str) {
        this.a = str;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gme)) {
            return false;
        }
        gme gmeVar = (gme) obj;
        return this.a.equals(gmeVar.a) && pa7.t(this.b, gmeVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return iHashCode + (uri == null ? 0 : uri.hashCode());
    }

    public final String toString() {
        return "TestResult(message=" + this.a + ", uri=" + this.b + ")";
    }
}
