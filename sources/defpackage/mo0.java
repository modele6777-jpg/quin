package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class mo0 extends hb2 {
    public final bp0 a;

    public mo0(bp0 bp0Var) {
        gb2 gb2Var = gb2.EVENT_OVERRIDE;
        this.a = bp0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hb2)) {
            return false;
        }
        if (!this.a.equals(((mo0) ((hb2) obj)).a)) {
            return false;
        }
        Object obj2 = gb2.EVENT_OVERRIDE;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ gb2.EVENT_OVERRIDE.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.a + ", productIdOrigin=" + gb2.EVENT_OVERRIDE + "}";
    }
}
