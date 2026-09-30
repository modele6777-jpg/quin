package defpackage;

import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gz9 extends n16 {
    public final Method J;
    public final int K;
    public final String L;
    public final cu2 M;
    public final boolean N;

    public gz9(Method method, int i, String str, cu2 cu2Var, boolean z) {
        this.J = method;
        this.K = i;
        Objects.requireNonNull(str, "name == null");
        this.L = str;
        this.M = cu2Var;
        this.N = z;
    }

    @Override // defpackage.n16
    public final void t(htb htbVar, Object obj) {
        String strA1;
        String str = this.L;
        if (obj == null) {
            throw an1.I(this.J, this.K, ib8.j("Path parameter \"", str, "\" value must not be null."), new Object[0]);
        }
        String str2 = (String) this.M.v(obj);
        if (htbVar.c == null) {
            throw new AssertionError();
        }
        int length = str2.length();
        int iCharCount = 0;
        while (true) {
            if (iCharCount >= length) {
                strA1 = str2;
                break;
            }
            int iCodePointAt = str2.codePointAt(iCharCount);
            boolean z = this.N;
            int i = 47;
            int i2 = -1;
            int i3 = 127;
            int i4 = 32;
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                f41 f41Var = new f41();
                f41Var.m1(0, iCharCount, str2);
                f41 f41Var2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str2.codePointAt(iCharCount);
                    if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 < i4 || iCodePointAt2 >= i3 || " \"<>^`{}|\\?#".indexOf(iCodePointAt2) != i2 || (!z && (iCodePointAt2 == i || iCodePointAt2 == 37))) {
                            if (f41Var2 == null) {
                                f41Var2 = new f41();
                            }
                            f41Var2.o1(iCodePointAt2);
                            long j = f41Var2.b;
                            long j2 = 0;
                            while (j2 < j) {
                                byte bG = f41Var2.G(j2);
                                f41Var.i1(37);
                                char[] cArr = htb.l;
                                f41Var.i1(cArr[((bG & 255) >> 4) & 15]);
                                f41Var.i1(cArr[bG & 15]);
                                j2++;
                                f41Var2 = f41Var2;
                            }
                            f41Var2.b();
                        } else {
                            f41Var.o1(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i = 47;
                    i2 = -1;
                    i3 = 127;
                    i4 = 32;
                }
                strA1 = f41Var.a1();
                break;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strReplace = htbVar.c.replace("{" + str + "}", strA1);
        if (htb.m.matcher(strReplace).matches()) {
            qc0.j("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(str2));
        } else {
            htbVar.c = strReplace;
        }
    }
}
