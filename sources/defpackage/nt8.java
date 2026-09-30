package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nt8 implements ot8, mh6 {
    public final String a;
    public final String b;

    public nt8(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt8)) {
            return false;
        }
        nt8 nt8Var = (nt8) obj;
        return pa7.t(this.a, nt8Var.a) && pa7.t(this.b, nt8Var.b);
    }

    @Override // defpackage.mh6
    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return tec.m("UserMessage(text=", this.a, ", id=", this.b, ")");
    }
}
