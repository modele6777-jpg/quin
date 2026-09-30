package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ti8 {
    public final uh8 a;
    public final Throwable b;

    public ti8(uh8 uh8Var) {
        this.a = uh8Var;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ti8)) {
            return false;
        }
        ti8 ti8Var = (ti8) obj;
        uh8 uh8Var = this.a;
        if (uh8Var != null && uh8Var == ti8Var.a) {
            return true;
        }
        Throwable th = this.b;
        if (th == null || ti8Var.b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public ti8(Throwable th) {
        this.b = th;
        this.a = null;
    }
}
