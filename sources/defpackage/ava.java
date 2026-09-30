package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ava extends ru6 {
    public final String b;
    public final byte[] c;

    public ava(String str, byte[] bArr) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ava.class != obj.getClass()) {
            return false;
        }
        ava avaVar = (ava) obj;
        return this.b.equals(avaVar.b) && Arrays.equals(this.c, avaVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + ub3.c(527, 31, this.b);
    }

    @Override // defpackage.ru6
    public final String toString() {
        return this.a + ": owner=" + this.b;
    }
}
