package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pp5 {
    public final ArrayList a;
    public final LinkedHashMap b;
    public final List c;
    public final LinkedHashMap d;
    public final String e;
    public final boolean f;

    public pp5(ArrayList arrayList, LinkedHashMap linkedHashMap, List list, LinkedHashMap linkedHashMap2, String str, boolean z) {
        this.a = arrayList;
        this.b = linkedHashMap;
        this.c = list;
        this.d = linkedHashMap2;
        this.e = str;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pp5)) {
            return false;
        }
        pp5 pp5Var = (pp5) obj;
        return this.a.equals(pp5Var.a) && this.b.equals(pp5Var.b) && this.c.equals(pp5Var.c) && this.d.equals(pp5Var.d) && pa7.t(this.e, pp5Var.e) && this.f == pp5Var.f;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + tec.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31;
        String str = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "FollowUpTimelineProjection(renderMessages=" + this.a + ", clarifyingCards=" + this.b + ", extraCards=" + this.c + ", newReadings=" + this.d + ", latestClarifyingRequestId=" + this.e + ", isFollowUpInputBlocked=" + this.f + ")";
    }
}
