package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kt8 implements ot8, mh6 {
    public final String a;
    public final String b;

    public kt8(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kt8)) {
            return false;
        }
        kt8 kt8Var = (kt8) obj;
        return pa7.t(this.a, kt8Var.a) && pa7.t(this.b, kt8Var.b);
    }

    @Override // defpackage.mh6
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tec.m("QuestionAnalysis(id=", this.a, ", text=", this.b, ")");
    }
}
