package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class d17 implements cdg, gu2 {
    public Integer a;
    public Integer b;

    public d17(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    @Override // defpackage.gu2
    public final Object copy() {
        return new d17(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d17)) {
            return false;
        }
        d17 d17Var = (d17) obj;
        return pa7.t(this.a, d17Var.a) && pa7.t(this.b, d17Var.b);
    }

    @Override // defpackage.cdg
    public final void g(Integer num) {
        this.b = num;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // defpackage.cdg
    public final Integer l() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Object obj = this.a;
        if (obj == null) {
            obj = "??";
        }
        sb.append(obj);
        sb.append('-');
        Integer num = this.b;
        sb.append(num != null ? num : "??");
        return sb.toString();
    }

    @Override // defpackage.cdg
    public final void v(Integer num) {
        this.a = num;
    }

    @Override // defpackage.cdg
    public final Integer y() {
        return this.b;
    }
}
