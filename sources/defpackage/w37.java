package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class w37 {
    public final /* synthetic */ int a;
    public String b;
    public String c;

    public w37(String str, String str2) {
        this.a = 0;
        this.b = str;
        this.c = str2;
    }

    public d4b a() {
        String str = this.c;
        if ("first_party".equals(str)) {
            qc0.j("Serialized doc id must be provided for first party products.");
            return null;
        }
        if (this.b == null) {
            qc0.j("Product id must be provided.");
            return null;
        }
        if (str != null) {
            return new d4b(this);
        }
        qc0.j("Product type must be provided.");
        return null;
    }

    public boolean equals(Object obj) {
        switch (this.a) {
            case 1:
                if (!(obj instanceof jy9)) {
                    return false;
                }
                jy9 jy9Var = (jy9) obj;
                Object obj2 = jy9Var.a;
                String str = this.b;
                if (obj2 != str && !obj2.equals(str)) {
                    return false;
                }
                Object obj3 = jy9Var.b;
                String str2 = this.c;
                return obj3 == str2 || obj3.equals(str2);
            default:
                return super.equals(obj);
        }
    }

    public int hashCode() {
        switch (this.a) {
            case 1:
                String str = this.b;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = this.c;
                return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "Pair{" + ((Object) this.b) + " " + ((Object) this.c) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ w37(int i) {
        this.a = i;
    }
}
