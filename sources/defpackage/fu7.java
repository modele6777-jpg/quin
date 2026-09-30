package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fu7 {
    public final String a;
    public final String b;

    static {
        pqf.D(0);
        pqf.D(1);
    }

    public fu7(String str, String str2) {
        this.a = pqf.I(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fu7.class == obj.getClass()) {
            fu7 fu7Var = (fu7) obj;
            if (Objects.equals(this.a, fu7Var.a) && Objects.equals(this.b, fu7Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{ lang=");
        sb.append(this.a);
        sb.append(", '");
        return ks0.l(sb, this.b, "' }");
    }
}
