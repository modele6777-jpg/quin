package defpackage;

import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nde {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public nde(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        abstractSet.getClass();
        this.a = str;
        this.b = map;
        this.c = abstractSet;
        this.d = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nde)) {
            return false;
        }
        nde ndeVar = (nde) obj;
        if (!this.a.equals(ndeVar.a) || !this.b.equals(ndeVar.b) || !this.c.equals(ndeVar.c)) {
            return false;
        }
        Set set2 = this.d;
        if (set2 == null || (set = ndeVar.d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.c.hashCode() + ib8.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.a);
        sb.append("',\n            |    columns = {");
        sb.append(v2c.t(s72.b1(this.b.values(), new kv8(18))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(v2c.t(this.c));
        sb.append("\n            |    indices = {");
        Set set = this.d;
        sb.append(v2c.t(set != null ? s72.b1(set, new kv8(19)) : pu4.a));
        sb.append("\n            |}\n        ");
        return w4e.q(sb.toString());
    }
}
