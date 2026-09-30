package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t58 {
    public final ArrayList a;
    public final ArrayList b;

    public t58(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t58)) {
            return false;
        }
        t58 t58Var = (t58) obj;
        return this.a.equals(t58Var.a) && this.b.equals(t58Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LineChartData(points=" + this.a + ", highlightedPoints=" + this.b + ")";
    }
}
