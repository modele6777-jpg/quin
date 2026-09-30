package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qhe {
    public final String a;
    public final int b;

    public qhe(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public static qhe a(qhe qheVar) {
        String str = qheVar.a;
        str.getClass();
        return new qhe(str, 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qhe)) {
            return false;
        }
        qhe qheVar = (qhe) obj;
        return pa7.t(this.a, qheVar.a) && this.b == qheVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tec.m("TarotCard(key=", this.a, ", orientation=", this.b == 1 ? "Upright" : "Reversed", ")");
    }
}
