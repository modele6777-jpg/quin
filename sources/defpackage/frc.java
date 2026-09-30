package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class frc {
    public final zqc a;
    public final arc b;

    public frc(zqc zqcVar, arc arcVar) {
        this.a = zqcVar;
        this.b = arcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frc)) {
            return false;
        }
        frc frcVar = (frc) obj;
        return this.a.equals(frcVar.a) && this.b.equals(frcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "KeyedCreationInput(key=" + this.a + ", input=" + this.b + ")";
    }
}
