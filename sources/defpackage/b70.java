package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class b70 {
    public final int a;
    public final k47 b;
    public final k60 c;
    public final String d;

    public b70(k47 k47Var, k60 k60Var, String str) {
        this.b = k47Var;
        this.c = k60Var;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{k47Var, k60Var, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b70)) {
            return false;
        }
        b70 b70Var = (b70) obj;
        return ym8.w(this.b, b70Var.b) && ym8.w(this.c, b70Var.c) && ym8.w(this.d, b70Var.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
