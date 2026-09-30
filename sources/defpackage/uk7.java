package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class uk7 implements Comparable {
    public final int a;
    public final int b;
    public final int c;

    static {
        new uk7(fv8.g.a);
        new uk7(fv8.h.a);
    }

    public uk7(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        if (i < 0) {
            qc0.j("Major version should be not less than 0");
            throw null;
        }
        if (i2 < 0) {
            qc0.j("Minor version should be not less than 0");
            throw null;
        }
        if (i3 >= 0) {
            return;
        }
        qc0.j("Patch version should be not less than 0");
        throw null;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(uk7 uk7Var) {
        uk7Var.getClass();
        int iL = pa7.L(this.a, uk7Var.a);
        if (iL != 0) {
            return iL;
        }
        int iL2 = pa7.L(this.b, uk7Var.b);
        return iL2 != 0 ? iL2 : pa7.L(this.c, uk7Var.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!uk7.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        uk7 uk7Var = (uk7) obj;
        return this.a == uk7Var.a && this.b == uk7Var.b && this.c == uk7Var.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('.');
        sb.append(this.b);
        sb.append('.');
        sb.append(this.c);
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public uk7(int[] iArr) {
        this(iArr[0], iArr[1], iArr[2]);
        iArr.getClass();
    }
}
