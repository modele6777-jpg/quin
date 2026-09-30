package defpackage;

import java.time.Instant;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yb4 {
    public final String a;
    public final Instant b;
    public final Instant c;
    public final String d;
    public final List e;

    public yb4(String str, Instant instant, Instant instant2, String str2, List list) {
        str.getClass();
        this.a = str;
        this.b = instant;
        this.c = instant2;
        this.d = str2;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yb4)) {
            return false;
        }
        yb4 yb4Var = (yb4) obj;
        return pa7.t(this.a, yb4Var.a) && this.b.equals(yb4Var.b) && pa7.t(this.c, yb4Var.c) && pa7.t(this.d, yb4Var.d) && pa7.t(this.e, yb4Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Instant instant = this.c;
        int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        String str = this.d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.e;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DivinationDrawnItem(id=");
        sb.append(this.a);
        sb.append(", createAt=");
        sb.append(this.b);
        sb.append(", drawnAt=");
        sb.append(this.c);
        sb.append(", usedSkinType=");
        sb.append(this.d);
        sb.append(", summaryCards=");
        return ks0.n(sb, this.e, ")");
    }
}
