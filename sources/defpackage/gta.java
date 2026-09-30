package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gta extends vr9 {
    private static final long serialVersionUID = 0;
    private final Object reference;

    public gta(Object obj) {
        this.reference = obj;
    }

    @Override // defpackage.vr9
    public final Object a() {
        return this.reference;
    }

    @Override // defpackage.vr9
    public final boolean b() {
        return true;
    }

    @Override // defpackage.vr9
    public final Object c() {
        return this.reference;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gta) {
            return this.reference.equals(((gta) obj).reference);
        }
        return false;
    }

    public final int hashCode() {
        return this.reference.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.reference + ")";
    }
}
