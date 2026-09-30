package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rp5 {
    public final String a;
    public final Map b;

    public rp5(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rp5)) {
            return false;
        }
        rp5 rp5Var = (rp5) obj;
        return this.a.equals(rp5Var.a) && this.b.equals(rp5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FollowUpTrackingEvent(name=" + this.a + ", params=" + this.b + ")";
    }
}
