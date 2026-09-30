package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ru0 implements gg9 {
    public final tc5 a;

    public ru0(tc5 tc5Var) {
        this.a = tc5Var;
    }

    @Override // defpackage.sr5
    public final as5 a() {
        return this.a.a();
    }

    @Override // defpackage.sr5
    public final n0a b() {
        return this.a.b();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ru0) {
            return this.a.equals(((ru0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BasicFormatStructure(" + this.a + ')';
    }
}
