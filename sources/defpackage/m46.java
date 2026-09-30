package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m46 implements ng2 {
    public final kg2 a;

    public m46(kg2 kg2Var) {
        this.a = kg2Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m46) {
            return this.a.equals(((m46) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
