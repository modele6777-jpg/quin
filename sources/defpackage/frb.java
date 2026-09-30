package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class frb {
    public static final frb c = new frb(0, false);
    public final int a;
    public final boolean b;

    public frb(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || frb.class != obj.getClass()) {
            return false;
        }
        frb frbVar = (frb) obj;
        return this.a == frbVar.a && this.b == frbVar.b;
    }

    public final int hashCode() {
        return (this.a << 1) + (this.b ? 1 : 0);
    }
}
