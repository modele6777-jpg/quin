package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class n28 {
    public final String a;
    public final String b;

    public n28(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n28)) {
            return false;
        }
        n28 n28Var = (n28) obj;
        return pa7.t(this.a, n28Var.a) && this.b.equals(n28Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tec.m("LegacyImportEntryKey(accountId=", this.a, ", localChatId=", this.b, ")");
    }
}
