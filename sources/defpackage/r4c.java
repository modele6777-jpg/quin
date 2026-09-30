package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r4c {
    public static final r4c e = new r4c();
    public final l26 a;
    public final o26 b;
    public final l26 c;
    public final o26 d;

    public r4c(l26 l26Var, o26 o26Var, l26 l26Var2, o26 o26Var2) {
        l26Var.getClass();
        o26Var.getClass();
        l26Var2.getClass();
        o26Var2.getClass();
        this.a = l26Var;
        this.b = o26Var;
        this.c = l26Var2;
        this.d = o26Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4c)) {
            return false;
        }
        r4c r4cVar = (r4c) obj;
        return pa7.t(this.a, r4cVar.a) && pa7.t(this.b, r4cVar.b) && pa7.t(this.c, r4cVar.c) && pa7.t(this.d, r4cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RichTextThemeConfiguration(textStyleProvider=" + this.a + ", textStyleBackProvider=" + this.b + ", contentColorProvider=" + this.c + ", contentColorBackProvider=" + this.d + ")";
    }

    public r4c() {
        this(new b3b(29), fe2.a, y.K0, fe2.b);
    }
}
