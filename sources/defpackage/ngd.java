package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ngd implements m0a {
    public final z8d a;
    public final String b;

    public ngd(z8d z8dVar, String str) {
        this.a = z8dVar;
        this.b = str;
    }

    @Override // defpackage.m0a
    public final Object a(gu2 gu2Var, CharSequence charSequence, int i) {
        charSequence.getClass();
        if (i >= charSequence.length()) {
            return Integer.valueOf(i);
        }
        final char cCharAt = charSequence.charAt(i);
        z8d z8dVar = this.a;
        if (cCharAt == '-') {
            z8dVar.z(gu2Var, Boolean.TRUE);
            return Integer.valueOf(i + 1);
        }
        if (cCharAt != '+') {
            return new e0a(i, new x16() { // from class: mgd
                @Override // defpackage.x16
                public final Object invoke() {
                    return "Expected " + this.a.b + " but got " + cCharAt;
                }
            });
        }
        z8dVar.z(gu2Var, Boolean.FALSE);
        return Integer.valueOf(i + 1);
    }

    public final String toString() {
        return this.b;
    }
}
