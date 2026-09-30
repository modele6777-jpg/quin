package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vhf extends ru6 {
    public final String b;
    public final String c;

    public vhf(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vhf.class != obj.getClass()) {
            return false;
        }
        vhf vhfVar = (vhf) obj;
        return this.a.equals(vhfVar.a) && Objects.equals(this.b, vhfVar.b) && this.c.equals(vhfVar.c);
    }

    public final int hashCode() {
        int iC = ub3.c(527, 31, this.a);
        String str = this.b;
        return this.c.hashCode() + ((iC + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.ru6
    public final String toString() {
        return this.a + ": url=" + this.c;
    }
}
