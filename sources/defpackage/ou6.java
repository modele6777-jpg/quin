package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ou6 implements qu8 {
    public final byte[] a;
    public final String b;
    public final String c;

    public ou6(String str, String str2, byte[] bArr) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.qu8
    public final void b(r23 r23Var) {
        String str = this.b;
        if (str != null) {
            r23Var.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ou6.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((ou6) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return tec.g(this.a.length, "\"", ib8.o("ICY: title=\"", this.b, "\", url=\"", this.c, "\", rawMetadata.length=\""));
    }
}
