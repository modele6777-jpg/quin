package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b6d {
    public final String a;
    public final Map b;

    public b6d(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6d)) {
            return false;
        }
        b6d b6dVar = (b6d) obj;
        return this.a.equals(b6dVar.a) && this.b.equals(b6dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShareAnalyticsEvent(name=" + this.a + ", parameters=" + this.b + ")";
    }
}
