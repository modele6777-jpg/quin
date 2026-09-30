package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ex9 implements fx9 {
    public final float a;

    public ex9(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex9)) {
            return false;
        }
        return yi4.b(this.a, ((ex9) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    @Override // defpackage.fx9
    public final int l(sw3 sw3Var, int i) {
        return sw3Var.D0(this.a);
    }
}
