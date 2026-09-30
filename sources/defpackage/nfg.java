package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class nfg {
    public final String a;
    public final String b;

    public nfg(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nfg)) {
            return false;
        }
        nfg nfgVar = (nfg) obj;
        if (!this.a.equals(nfgVar.a)) {
            return false;
        }
        String str = nfgVar.b;
        String str2 = this.b;
        if (str2 == null) {
            return str == null;
        }
        return str2.equals(str);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        String str = this.b;
        return (str == null ? 0 : str.hashCode()) ^ ((iHashCode ^ (-721379959)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AssetPackLocation{packStorageMethod=0, path=");
        sb.append(this.a);
        sb.append(", assetsPath=");
        return ks0.l(sb, this.b, "}");
    }
}
