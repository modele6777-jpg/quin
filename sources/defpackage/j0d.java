package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
public final class j0d {
    public static final i0d Companion = new i0d();
    public static final lw7[] d = {null, null, eb3.N(z18.b, new gpc(23))};
    public final n0d a;
    public final jxe b;
    public final Map c;

    public /* synthetic */ j0d(int i, n0d n0dVar, jxe jxeVar, Map map) {
        if (1 != (i & 1)) {
            an1.R(i, 1, h0d.a.e());
            throw null;
        }
        this.a = n0dVar;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = jxeVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = map;
        }
    }

    public static j0d a(j0d j0dVar, n0d n0dVar, jxe jxeVar, Map map, int i) {
        if ((i & 1) != 0) {
            n0dVar = j0dVar.a;
        }
        if ((i & 2) != 0) {
            jxeVar = j0dVar.b;
        }
        if ((i & 4) != 0) {
            map = j0dVar.c;
        }
        j0dVar.getClass();
        n0dVar.getClass();
        return new j0d(n0dVar, jxeVar, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0d)) {
            return false;
        }
        j0d j0dVar = (j0d) obj;
        return pa7.t(this.a, j0dVar.a) && pa7.t(this.b, j0dVar.b) && pa7.t(this.c, j0dVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        jxe jxeVar = this.b;
        int iHashCode2 = (iHashCode + (jxeVar == null ? 0 : Long.hashCode(jxeVar.a))) * 31;
        Map map = this.c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "SessionData(sessionDetails=" + this.a + ", backgroundTime=" + this.b + ", processDataMap=" + this.c + ')';
    }

    public j0d(n0d n0dVar, jxe jxeVar, Map map) {
        n0dVar.getClass();
        this.a = n0dVar;
        this.b = jxeVar;
        this.c = map;
    }
}
