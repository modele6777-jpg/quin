package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lde {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public lde(String str, String str2, List list, List list2, String str3) {
        tec.x(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lde)) {
            return false;
        }
        lde ldeVar = (lde) obj;
        if (pa7.t(this.a, ldeVar.a) && pa7.t(this.b, ldeVar.b) && pa7.t(this.c, ldeVar.c) && this.d.equals(ldeVar.d)) {
            return this.e.equals(ldeVar.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + tec.a(ub3.c(ub3.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return w4e.o(w4e.q("\n            |ForeignKey {\n            |   referenceTable = '" + this.a + "',\n            |   onDelete = '" + this.b + "',\n            |   onUpdate = '" + this.c + "',\n            |   columnNames = {" + v2c.w(s72.a1(this.d)) + "\n            |   referenceColumnNames = {" + v2c.v(s72.a1(this.e)) + "\n            |}\n        "));
    }
}
