package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class aa2 extends ru6 {
    public final String b;
    public final String c;
    public final String d;

    public aa2(String str, String str2, String str3) {
        super("COMM");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || aa2.class != obj.getClass()) {
            return false;
        }
        aa2 aa2Var = (aa2) obj;
        return this.c.equals(aa2Var.c) && this.b.equals(aa2Var.b) && Objects.equals(this.d, aa2Var.d);
    }

    public final int hashCode() {
        int iC = ub3.c(ub3.c(527, 31, this.b), 31, this.c);
        String str = this.d;
        return iC + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.ru6
    public final String toString() {
        return this.a + ": language=" + this.b + ", description=" + this.c + ", text=" + this.d;
    }
}
