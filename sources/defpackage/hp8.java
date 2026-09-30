package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class hp8 {
    public final long a;

    static {
        new hp8(new d82());
        pqf.D(0);
        pqf.D(1);
        pqf.D(2);
        pqf.D(3);
        pqf.D(4);
        pqf.D(5);
        pqf.D(6);
        pqf.D(7);
    }

    public hp8(d82 d82Var) {
        d82Var.getClass();
        String str = pqf.a;
        this.a = d82Var.b;
    }

    public final d82 a() {
        d82 d82Var = new d82(false);
        d82Var.b = this.a;
        return d82Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hp8) && this.a == ((hp8) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return ((int) (j ^ (j >>> 32))) * 923521;
    }
}
