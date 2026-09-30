package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class mc5 extends b0 {
    public final lc5 a;
    public final char b;
    public final int c;
    public String d;
    public final StringBuilder e;

    public mc5(int i, int i2, char c) {
        lc5 lc5Var = new lc5();
        this.a = lc5Var;
        this.e = new StringBuilder();
        this.b = c;
        this.c = i;
        lc5Var.g = String.valueOf(c);
        Integer numValueOf = Integer.valueOf(i);
        if (i < 3) {
            qc0.j("openingFenceLength needs to be >= 3");
            throw null;
        }
        Integer num = lc5Var.i;
        if (num != null && num.intValue() < i) {
            qc0.j("fence lengths required to be: closingFenceLength >= openingFenceLength");
            throw null;
        }
        lc5Var.h = numValueOf;
        lc5Var.j = i2;
    }

    @Override // defpackage.b0
    public final void a(std stdVar) {
        String str = this.d;
        CharSequence charSequence = stdVar.a;
        if (str == null) {
            this.d = charSequence.toString();
            return;
        }
        StringBuilder sb = this.e;
        sb.append(charSequence);
        sb.append('\n');
    }

    @Override // defpackage.b0
    public final void e() {
        String strB = uy4.b(this.d.trim());
        lc5 lc5Var = this.a;
        lc5Var.k = strB;
        lc5Var.l = this.e.toString();
    }

    @Override // defpackage.b0
    public final yz0 f() {
        return this.a;
    }

    @Override // defpackage.b0
    public final c72 j(hg4 hg4Var) {
        int i = hg4Var.f;
        int i2 = hg4Var.c;
        CharSequence charSequence = hg4Var.a.a;
        int i3 = hg4Var.h;
        lc5 lc5Var = this.a;
        if (i3 < 4 && i < charSequence.length()) {
            int length = charSequence.length();
            for (int i4 = i; i4 < length; i4++) {
                if (charSequence.charAt(i4) != this.b) {
                    length = i4;
                    break;
                }
            }
            int i5 = length - i;
            if (i5 >= this.c && vfh.O(charSequence, i + i5, charSequence.length()) == charSequence.length()) {
                Integer numValueOf = Integer.valueOf(i5);
                if (i5 < 3) {
                    qc0.j("closingFenceLength needs to be >= 3");
                    return null;
                }
                Integer num = lc5Var.h;
                if (num == null || i5 >= num.intValue()) {
                    lc5Var.i = numValueOf;
                    return new c72(-1, -1, true);
                }
                qc0.j("fence lengths required to be: closingFenceLength >= openingFenceLength");
                return null;
            }
        }
        int length2 = charSequence.length();
        for (int i6 = lc5Var.j; i6 > 0 && i2 < length2 && charSequence.charAt(i2) == ' '; i6--) {
            i2++;
        }
        return c72.a(i2);
    }
}
