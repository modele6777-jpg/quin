package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ebd {
    public final cbd a;
    public final bbd b;

    public ebd(cbd cbdVar, bbd bbdVar) {
        this.a = cbdVar;
        this.b = bbdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebd)) {
            return false;
        }
        ebd ebdVar = (ebd) obj;
        return this.a.equals(ebdVar.a) && this.b == ebdVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShareTerminalResultReduction(state=" + this.a + ", feedback=" + this.b + ")";
    }
}
