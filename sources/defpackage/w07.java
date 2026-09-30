package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class w07 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final fv8 d;
    public final String e;

    public w07(Object obj, Object obj2, fv8 fv8Var, fv8 fv8Var2, String str) {
        this.a = obj;
        this.b = obj2;
        this.c = fv8Var;
        this.d = fv8Var2;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w07)) {
            return false;
        }
        w07 w07Var = (w07) obj;
        return this.a.equals(w07Var.a) && pa7.t(this.b, w07Var.b) && pa7.t(this.c, w07Var.c) && this.d.equals(w07Var.d) && this.e.equals(w07Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IncompatibleVersionErrorData(actualVersion=");
        sb.append(this.a);
        sb.append(", compilerVersion=");
        sb.append(this.b);
        sb.append(", languageVersion=");
        sb.append(this.c);
        sb.append(", expectedVersion=");
        sb.append(this.d);
        sb.append(", filePath=");
        return ub3.l(sb, this.e, ')');
    }
}
