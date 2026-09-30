package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rde {
    public final ArrayList a;
    public final ArrayList b;

    public rde(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rde)) {
            return false;
        }
        rde rdeVar = (rde) obj;
        return this.a.equals(rdeVar.a) && this.b.equals(rdeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TableLayoutResult(rowOffsets=" + this.a + ", columnOffsets=" + this.b + ")";
    }
}
