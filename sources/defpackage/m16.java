package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m16 {
    public final t05 a;
    public final Map b;

    public m16(t05 t05Var, Map map) {
        this.a = t05Var;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m16)) {
            return false;
        }
        m16 m16Var = (m16) obj;
        return this.a.equals(m16Var.a) && this.b.equals(m16Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FriendCouponTrackingEvent(eventType=" + this.a + ", parameters=" + this.b + ")";
    }
}
