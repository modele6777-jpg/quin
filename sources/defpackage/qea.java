package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qea implements m0a {
    public final String a;

    public qea(String str) {
        str.getClass();
        this.a = str;
        if (str.length() <= 0) {
            qc0.j("Empty string is not allowed");
            throw null;
        }
        if (uyb.t(str.charAt(0))) {
            qc0.o(ib8.j("String '", str, "' starts with a digit"));
            throw null;
        }
        if (uyb.t(str.charAt(str.length() - 1))) {
            qc0.o(ib8.j("String '", str, "' ends with a digit"));
            throw null;
        }
    }

    @Override // defpackage.m0a
    public final Object a(gu2 gu2Var, CharSequence charSequence, int i) {
        charSequence.getClass();
        String str = this.a;
        if (str.length() + i > charSequence.length()) {
            return new e0a(i, new zv6(28, this));
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (charSequence.charAt(i + i2) != str.charAt(i2)) {
                return new e0a(i, new yr6(this, charSequence, i, i2));
            }
        }
        return Integer.valueOf(str.length() + i);
    }

    public final String toString() {
        return ub3.l(new StringBuilder("'"), this.a, '\'');
    }
}
