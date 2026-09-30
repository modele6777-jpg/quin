package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class mud {
    public final String a;
    public final t99 b;
    public final String c;
    public final String d;
    public final String e;

    public mud(String str, t99 t99Var, String str2, String str3) {
        t99Var.getClass();
        this.a = str;
        this.b = t99Var;
        this.c = str2;
        this.d = str3;
        this.e = str + '.' + (t99Var + '(' + str2 + ')' + str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mud)) {
            return false;
        }
        mud mudVar = (mud) obj;
        return this.a.equals(mudVar.a) && pa7.t(this.b, mudVar.b) && this.c.equals(mudVar.c) && this.d.equals(mudVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ub3.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NameAndSignature(classInternalName=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", parameters=");
        sb.append(this.c);
        sb.append(", returnType=");
        return ub3.l(sb, this.d, ')');
    }
}
