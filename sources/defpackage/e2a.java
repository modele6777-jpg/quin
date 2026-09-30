package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class e2a {
    public final String a;
    public final String b;
    public final List c;

    public e2a(String str, String str2, List list) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2a)) {
            return false;
        }
        e2a e2aVar = (e2a) obj;
        return pa7.t(this.a, e2aVar.a) && pa7.t(this.b, e2aVar.b) && this.c.equals(e2aVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return ks0.n(ib8.o("Pattern(reply=", this.a, ", pattern=", this.b, ", patternData="), this.c, ")");
    }
}
