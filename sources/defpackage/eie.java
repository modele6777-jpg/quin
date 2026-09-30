package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class eie {
    public final boolean a;
    public final Map b;

    public eie(Map map, boolean z) {
        map.getClass();
        this.a = z;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eie)) {
            return false;
        }
        eie eieVar = (eie) obj;
        return this.a == eieVar.a && pa7.t(this.b, eieVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TarotCardState(buttonEnable=" + this.a + ", cardGrouping=" + this.b + ")";
    }
}
