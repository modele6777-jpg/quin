package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c17 implements ypf, gu2 {
    public Boolean a;
    public Integer b;
    public Integer c;
    public Integer d;

    public c17(Boolean bool, Integer num, Integer num2, Integer num3) {
        this.a = bool;
        this.b = num;
        this.c = num2;
        this.d = num3;
    }

    @Override // defpackage.ypf
    public final Boolean D() {
        return this.a;
    }

    @Override // defpackage.ypf
    public final Integer c() {
        return this.d;
    }

    @Override // defpackage.gu2
    public final Object copy() {
        return new c17(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.ypf
    public final void d(Integer num) {
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c17)) {
            return false;
        }
        c17 c17Var = (c17) obj;
        return pa7.t(this.a, c17Var.a) && pa7.t(this.b, c17Var.b) && pa7.t(this.c, c17Var.c) && pa7.t(this.d, c17Var.d);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = bool != null ? bool.hashCode() : 0;
        Integer num = this.b;
        int iHashCode2 = iHashCode + (num != null ? num.hashCode() : 0);
        Integer num2 = this.c;
        int iHashCode3 = iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        Integer num3 = this.d;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // defpackage.ypf
    public final void i(Integer num) {
        this.c = num;
    }

    @Override // defpackage.ypf
    public final void j(Integer num) {
        this.b = num;
    }

    @Override // defpackage.ypf
    public final void p(Boolean bool) {
        this.a = bool;
    }

    public final String toString() {
        String str;
        Boolean bool = this.a;
        if (bool != null) {
            str = bool.booleanValue() ? "-" : "+";
        } else {
            str = " ";
        }
        StringBuilder sb = new StringBuilder(str);
        Object obj = this.b;
        if (obj == null) {
            obj = "??";
        }
        sb.append(obj);
        sb.append(':');
        Object obj2 = this.c;
        if (obj2 == null) {
            obj2 = "??";
        }
        sb.append(obj2);
        sb.append(':');
        Integer num = this.d;
        sb.append(num != null ? num : "??");
        return sb.toString();
    }

    @Override // defpackage.ypf
    public final Integer w() {
        return this.b;
    }

    @Override // defpackage.ypf
    public final Integer x() {
        return this.c;
    }
}
