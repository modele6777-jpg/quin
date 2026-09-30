package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wsc {
    public final zsc a;
    public final zsc b;

    public wsc(zsc zscVar, zsc zscVar2) {
        this.a = zscVar;
        this.b = zscVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wsc.class != obj.getClass()) {
            return false;
        }
        wsc wscVar = (wsc) obj;
        return this.a.equals(wscVar.a) && this.b.equals(wscVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        zsc zscVar = this.a;
        sb.append(zscVar);
        zsc zscVar2 = this.b;
        if (zscVar.equals(zscVar2)) {
            str = "";
        } else {
            str = ", " + zscVar2;
        }
        return ks0.l(sb, str, "]");
    }
}
