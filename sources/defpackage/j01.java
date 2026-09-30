package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class j01 extends b0 {
    public final e01 a = new e01();

    @Override // defpackage.b0
    public final yz0 f() {
        return this.a;
    }

    @Override // defpackage.b0
    public final c72 j(hg4 hg4Var) {
        char cCharAt;
        int i = hg4Var.f;
        CharSequence charSequence = hg4Var.a.a;
        if (hg4Var.h >= 4 || i >= charSequence.length() || charSequence.charAt(i) != '>') {
            return null;
        }
        int i2 = hg4Var.d + hg4Var.h;
        int i3 = i2 + 1;
        CharSequence charSequence2 = hg4Var.a.a;
        int i4 = i + 1;
        if (i4 < charSequence2.length() && ((cCharAt = charSequence2.charAt(i4)) == '\t' || cCharAt == ' ')) {
            i3 = i2 + 2;
        }
        return new c72(-1, i3, false);
    }
}
