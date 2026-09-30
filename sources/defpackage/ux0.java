package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ux0 extends ru6 {
    public final byte[] b;

    public ux0(String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ux0.class != obj.getClass()) {
            return false;
        }
        ux0 ux0Var = (ux0) obj;
        return this.a.equals(ux0Var.a) && Arrays.equals(this.b, ux0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + ub3.c(527, 31, this.a);
    }
}
