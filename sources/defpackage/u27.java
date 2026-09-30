package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u27 implements z27 {
    public final String a;
    public final String b;
    public final List c;
    public final String d;

    public u27(String str, List list, String str2, String str3) {
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u27)) {
            return false;
        }
        u27 u27Var = (u27) obj;
        return this.a.equals(u27Var.a) && this.b.equals(u27Var.b) && this.c.equals(u27Var.c) && pa7.t(this.d, u27Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + tec.a(ub3.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbO = ib8.o("EventConversation(question=", this.a, ", pattern=", this.b, ", patternData=");
        sbO.append(this.c);
        sbO.append(", eventId=");
        sbO.append(this.d);
        sbO.append(")");
        return sbO.toString();
    }
}
