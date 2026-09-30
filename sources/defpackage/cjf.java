package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cjf {
    public final vd9 a;
    public final Map b;
    public final Set c;
    public ttb d;

    public /* synthetic */ cjf(vd9 vd9Var, LinkedHashMap linkedHashMap, ttb ttbVar, int i) {
        this((i & 1) != 0 ? new vd9(8) : vd9Var, (i & 2) != 0 ? new LinkedHashMap() : linkedHashMap, new LinkedHashSet(), (i & 8) != 0 ? null : ttbVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjf)) {
            return false;
        }
        cjf cjfVar = (cjf) obj;
        return pa7.t(this.a, cjfVar.a) && pa7.t(this.b, cjfVar.b) && pa7.t(this.c, cjfVar.c) && pa7.t(this.d, cjfVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ib8.c(this.b, this.a.hashCode() * 31, 31)) * 31;
        ttb ttbVar = this.d;
        return iHashCode + (ttbVar == null ? 0 : Integer.hashCode(ttbVar.a));
    }

    public final String toString() {
        return "InfoBundle(options=" + this.a + ", tags=" + this.b + ", listeners=" + this.c + ", template=" + this.d + ')';
    }

    public cjf(vd9 vd9Var, Map map, Set set, ttb ttbVar) {
        vd9Var.getClass();
        map.getClass();
        this.a = vd9Var;
        this.b = map;
        this.c = set;
        this.d = ttbVar;
    }
}
