package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tw8 {
    public final int a;
    public final boolean b;
    public final boolean c;

    public tw8(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public final boolean a() {
        return this.a >= 10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw8)) {
            return false;
        }
        tw8 tw8Var = (tw8) obj;
        return this.a == tw8Var.a && this.b == tw8Var.b && this.c == tw8Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ub3.d(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MixedDeckEntitlement(unlockedDeckCount=");
        sb.append(this.a);
        sb.append(", annualMembershipActive=");
        sb.append(this.b);
        sb.append(", ownsAllDecksPurchase=");
        return ub3.m(sb, this.c, ")");
    }
}
