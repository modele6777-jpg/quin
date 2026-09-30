package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v7d implements r7d {
    public final k00 a;
    public final mue b;
    public final boolean c;

    public v7d(k00 k00Var, mue mueVar, boolean z) {
        this.a = k00Var;
        this.b = mueVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7d)) {
            return false;
        }
        v7d v7dVar = (v7d) obj;
        return pa7.t(this.a, v7dVar.a) && pa7.t(this.b, v7dVar.b) && this.c == v7dVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + tec.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareDocumentText(text=");
        sb.append((Object) this.a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", fillWidth=");
        return ub3.m(sb, this.c, ")");
    }
}
