package defpackage;

import android.app.PendingIntent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class tjg extends q0c {
    public final PendingIntent a;
    public final boolean b;

    public tjg(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent == null) {
            r82.g("Null pendingIntent");
            throw null;
        }
        this.a = pendingIntent;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q0c) {
            tjg tjgVar = (tjg) ((q0c) obj);
            if (this.a.equals(tjgVar.a) && this.b == tjgVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.b ? 1237 : 1231) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return ub3.m(tec.p("ReviewInfo{pendingIntent=", this.a.toString(), ", isNoOp="), this.b, "}");
    }
}
