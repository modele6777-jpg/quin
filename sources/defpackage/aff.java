package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class aff {
    public abstract cff a(Object obj);

    public final boolean b(int i, i72 i72Var, Object obj) throws ya7 {
        h72 h72Var = i72Var.a;
        int i2 = i72Var.b;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            i72Var.w(0);
            ((cff) obj).c(i3 << 3, Long.valueOf(h72Var.s()));
            return true;
        }
        if (i4 == 1) {
            i72Var.w(1);
            ((cff) obj).c((i3 << 3) | 1, Long.valueOf(h72Var.p()));
            return true;
        }
        if (i4 == 2) {
            ((cff) obj).c((i3 << 3) | 2, i72Var.e());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw ya7.c();
            }
            i72Var.w(5);
            ((cff) obj).c(5 | (i3 << 3), Integer.valueOf(h72Var.o()));
            return true;
        }
        cff cffVar = new cff(0, new int[8], new Object[8], true);
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new ya7("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (i72Var.a() != Integer.MAX_VALUE && b(i7, i72Var, cffVar)) {
        }
        if (i6 != i72Var.b) {
            throw new ya7("Protocol message end-group tag did not match expected tag.");
        }
        if (cffVar.e) {
            cffVar.e = false;
        }
        ((cff) obj).c(i5 | 3, cffVar);
        return true;
    }
}
