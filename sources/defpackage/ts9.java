package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ts9 extends vs9 {
    public final hkb a;

    public ts9(hkb hkbVar) {
        this.a = hkbVar;
    }

    @Override // defpackage.vs9
    public final hkb a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ts9) {
            return this.a.equals(((ts9) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
