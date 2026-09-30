package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class p7d implements r7d {
    public final List a;
    public final xw9 b;
    public final float c;
    public final xi d;
    public final boolean e;
    public final float f;
    public final a26 g;
    public final a26 h;

    public p7d(List list, bx9 bx9Var, float f, jx0 jx0Var, float f2, a26 a26Var, a26 a26Var2, int i) {
        bx9Var = (i & 2) != 0 ? new bx9(0.0f, 0.0f, 0.0f, 0.0f) : bx9Var;
        f = (i & 4) != 0 ? 0.0f : f;
        jx0Var = (i & 8) != 0 ? ndb.Y : jx0Var;
        boolean z = (i & 16) != 0;
        f2 = (i & 32) != 0 ? 0.0f : f2;
        a26Var = (i & 64) != 0 ? null : a26Var;
        a26Var2 = (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? null : a26Var2;
        list.getClass();
        this.a = list;
        this.b = bx9Var;
        this.c = f;
        this.d = jx0Var;
        this.e = z;
        this.f = f2;
        this.g = a26Var;
        this.h = a26Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p7d)) {
            return false;
        }
        p7d p7dVar = (p7d) obj;
        return pa7.t(this.a, p7dVar.a) && this.b.equals(p7dVar.b) && yi4.b(this.c, p7dVar.c) && this.d.equals(p7dVar.d) && this.e == p7dVar.e && Float.compare(this.f, p7dVar.f) == 0 && pa7.t(this.g, p7dVar.g) && pa7.t(this.h, p7dVar.h);
    }

    public final int hashCode() {
        int iA = ub3.a(this.f, ub3.d((this.d.hashCode() + ub3.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31)) * 31, 31, this.e), 31);
        a26 a26Var = this.g;
        int iHashCode = (iA + (a26Var == null ? 0 : a26Var.hashCode())) * 31;
        a26 a26Var2 = this.h;
        return iHashCode + (a26Var2 != null ? a26Var2.hashCode() : 0);
    }

    public final String toString() {
        return "ShareDocumentColumn(children=" + this.a + ", padding=" + this.b + ", spacing=" + yi4.c(this.c) + ", horizontalAlignment=" + this.d + ", fillWidth=" + this.e + ", minHeightToWidthRatio=" + this.f + ", background=" + this.g + ", foreground=" + this.h + ")";
    }
}
