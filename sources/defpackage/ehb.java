package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ehb implements fhb {
    public final Map a;
    public final Map b;

    public ehb(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        this.a = map;
        this.b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehb)) {
            return false;
        }
        ehb ehbVar = (ehb) obj;
        return pa7.t(this.a, ehbVar.a) && pa7.t(this.b, ehbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Ready(links=" + this.a + ", requests=" + this.b + ")";
    }
}
