package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class shg {
    public final b70 a;
    public final za5 b;

    public /* synthetic */ shg(b70 b70Var, za5 za5Var) {
        this.a = b70Var;
        this.b = za5Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof shg)) {
            return false;
        }
        shg shgVar = (shg) obj;
        return ym8.w(this.a, shgVar.a) && ym8.w(this.b, shgVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        w84 w84Var = new w84(this);
        w84Var.G0(this.a, "key");
        w84Var.G0(this.b, "feature");
        return w84Var.toString();
    }
}
