package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mt9 {
    public final ArrayList a;
    public final LinkedHashMap b;
    public final ot c;
    public final LinkedHashMap d;

    public mt9(ArrayList arrayList, LinkedHashMap linkedHashMap, ot otVar, LinkedHashMap linkedHashMap2) {
        this.a = arrayList;
        this.b = linkedHashMap;
        this.c = otVar;
        this.d = linkedHashMap2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mt9)) {
            return false;
        }
        mt9 mt9Var = (mt9) obj;
        return this.a.equals(mt9Var.a) && this.b.equals(mt9Var.b) && pa7.t(this.c, mt9Var.c) && this.d.equals(mt9Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        ot otVar = this.c;
        return this.d.hashCode() + ((iHashCode + (otVar == null ? 0 : otVar.hashCode())) * 31);
    }

    public final String toString() {
        return "OutputConfigurations(all=" + this.a + ", deferred=" + this.b + ", postviewOutput=" + this.c + ", outputSurfaceMap=" + this.d + ')';
    }
}
