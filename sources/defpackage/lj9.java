package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lj9 {
    public final Set a;
    public final String b;

    public lj9(String str, Set set) {
        str.getClass();
        this.a = set;
        this.b = str;
    }

    public final boolean a(int i) {
        return this.a.contains(Integer.valueOf(i));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj9)) {
            return false;
        }
        lj9 lj9Var = (lj9) obj;
        return this.a.equals(lj9Var.a) && pa7.t(this.b, lj9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NotificationTouchpointPreferenceState(shownTouchpointIds=" + this.a + ", lastTp1OrTp2ShownDate=" + this.b + ")";
    }
}
