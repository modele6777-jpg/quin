package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mrf {
    public static final yl9 a = new yl9(rl9.a, 0, 0);

    public static final w2f a(syf syfVar, k00 k00Var) {
        w2f w2fVarA = syfVar.a(k00Var);
        int length = k00Var.b.length();
        k00 k00Var2 = w2fVarA.a;
        sl9 sl9Var = w2fVarA.b;
        int length2 = k00Var2.b.length();
        int iMin = Math.min(length, 100);
        for (int i = 0; i < iMin; i++) {
            b(sl9Var.v(i), length2, i);
        }
        b(sl9Var.v(length), length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < iMin2; i2++) {
            c(sl9Var.j(i2), length, i2);
        }
        c(sl9Var.j(length2), length, length2);
        return new w2f(k00Var2, new yl9(sl9Var, k00Var.b.length(), k00Var2.b.length()));
    }

    public static final void b(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbN = ib8.n(i3, i, "OffsetMapping.originalToTransformed returned invalid mapping: ", " -> ", " is not in range of transformed text [0, ");
        sbN.append(i2);
        sbN.append("]");
        l37.c(sbN.toString());
    }

    public static final void c(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbN = ib8.n(i3, i, "OffsetMapping.transformedToOriginal returned invalid mapping: ", " -> ", " is not in range of original text [0, ");
        sbN.append(i2);
        sbN.append("]");
        l37.c(sbN.toString());
    }
}
