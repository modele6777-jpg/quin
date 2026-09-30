package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class uah {
    public final eah a;
    public final h71 b;

    public uah(eah eahVar, h71 h71Var) {
        this.a = eahVar;
        this.b = h71Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uah) {
            uah uahVar = (uah) obj;
            eah eahVar = uahVar.a;
            eah eahVar2 = this.a;
            if (eahVar2 != null ? eahVar2 == eahVar : eahVar == null) {
                return this.b == uahVar.b;
            }
        }
        return false;
    }

    public final int hashCode() {
        eah eahVar = this.a;
        return this.b.hashCode() ^ (((eahVar == null ? 0 : eahVar.hashCode()) ^ 1000003) * 1000003);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String string = this.b.toString();
        StringBuilder sb = new StringBuilder(strValueOf.length() + 52 + string.length() + 1);
        ub3.v(sb, "SnapshotBlobAndResult{snapshotBlob=", strValueOf, ", snapshotResult=", string);
        sb.append("}");
        return sb.toString();
    }
}
