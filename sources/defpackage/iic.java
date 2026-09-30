package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class iic {
    public static final iic b;
    public final ry6 a;

    static {
        kd9 kd9Var = new kd9(28, false);
        kd9Var.b = ry6.m(2, 1, 5);
        b = new iic(kd9Var);
    }

    public iic(kd9 kd9Var) {
        this.a = (ry6) kd9Var.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof iic) && this.a.equals(((iic) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool, bool);
    }
}
