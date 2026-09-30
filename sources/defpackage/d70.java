package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d70 extends ru6 {
    public final String b;
    public final String c;
    public final int d;
    public final byte[] e;

    public d70(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = bArr;
    }

    @Override // defpackage.qu8
    public final void b(r23 r23Var) {
        r23Var.b(this.e, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d70.class != obj.getClass()) {
            return false;
        }
        d70 d70Var = (d70) obj;
        return this.d == d70Var.d && this.b.equals(d70Var.b) && Objects.equals(this.c, d70Var.c) && Arrays.equals(this.e, d70Var.e);
    }

    public final int hashCode() {
        int iC = ub3.c((527 + this.d) * 31, 31, this.b);
        String str = this.c;
        return Arrays.hashCode(this.e) + ((iC + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.ru6
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", description=" + this.c;
    }
}
