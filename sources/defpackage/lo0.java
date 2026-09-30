package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class lo0 extends y42 {
    public final do0 a;

    public lo0(do0 do0Var) {
        this.a = do0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y42)) {
            return false;
        }
        y42 y42Var = (y42) obj;
        Object obj2 = x42.ANDROID_FIREBASE;
        if (obj2.equals(obj2)) {
            return this.a.equals(((lo0) y42Var).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ ((x42.ANDROID_FIREBASE.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + x42.ANDROID_FIREBASE + ", androidClientInfo=" + this.a + "}";
    }
}
