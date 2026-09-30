package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jy0 {
    public final use a;
    public final boolean b;

    public jy0(use useVar, boolean z) {
        this.a = useVar;
        this.b = z;
    }

    public static jy0 a(jy0 jy0Var, boolean z) {
        use useVar = jy0Var.a;
        jy0Var.getClass();
        return new jy0(useVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jy0) {
            jy0 jy0Var = (jy0) obj;
            if (this.a == jy0Var.a && this.b == jy0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BindPhoneUiState(phoneNumber=" + this.a + ", showHasBoundPhoneDialog=" + this.b + ")";
    }
}
