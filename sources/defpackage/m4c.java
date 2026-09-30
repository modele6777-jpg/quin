package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m4c {
    public final k00 a;
    public final Map b;

    public m4c(k00 k00Var, Map map) {
        this.a = k00Var;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4c)) {
            return false;
        }
        m4c m4cVar = (m4c) obj;
        return this.a.equals(m4cVar.a) && this.b.equals(m4cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
