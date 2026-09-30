package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ss6 {
    static {
        a71 a71Var = a71.c;
        m8c.u("\"\\");
        m8c.u("\t ,=");
    }

    public static final boolean a(ryb rybVar) {
        if (pa7.t(rybVar.a.b, "HEAD")) {
            return false;
        }
        int i = rybVar.d;
        if (((i < 100 || i >= 200) && i != 204 && i != 304) || keg.e(rybVar) != -1) {
            return true;
        }
        String strC = rybVar.f.c("Transfer-Encoding");
        if (strC == null) {
            strC = null;
        }
        return "chunked".equalsIgnoreCase(strC);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0078  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a8  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(fu2 fu2Var, ct6 ct6Var, si6 si6Var) {
        List listUnmodifiableList;
        int i;
        eu2 eu2Var;
        eu2 eu2Var2;
        String strSubstring;
        fu2Var.getClass();
        ct6Var.getClass();
        si6Var.getClass();
        if (fu2Var == fu2.s) {
            return;
        }
        Pattern pattern = eu2.k;
        List listE = si6Var.e("Set-Cookie");
        int size = listE.size();
        int i2 = 0;
        int i3 = 0;
        ArrayList arrayList = null;
        while (i3 < size) {
            String str = (String) listE.get(i3);
            str.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            byte[] bArr = ieg.a;
            char c = ';';
            int iE = ieg.e(str, ';', i2, str.length());
            char c2 = '=';
            int iE2 = ieg.e(str, '=', i2, iE);
            if (iE2 == iE) {
                i = i2;
                eu2Var = null;
            } else {
                int i4 = ieg.i(i2, iE2, str);
                String strSubstring2 = str.substring(i4, ieg.j(i4, iE2, str));
                if (strSubstring2.length() != 0 && ieg.h(strSubstring2) == -1) {
                    int i5 = ieg.i(iE2 + 1, iE, str);
                    String strSubstring3 = str.substring(i5, ieg.j(i5, iE, str));
                    if (ieg.h(strSubstring3) == -1) {
                        int i6 = iE + 1;
                        int length = str.length();
                        long j = 253402300799999L;
                        int i7 = i2;
                        int i8 = i7;
                        int i9 = i8;
                        long J = 253402300799999L;
                        String str2 = null;
                        String strSubstring4 = null;
                        long j2 = -1;
                        boolean z = true;
                        String str3 = null;
                        while (true) {
                            if (i6 >= length) {
                                if (j2 == Long.MIN_VALUE) {
                                    j = Long.MIN_VALUE;
                                } else if (j2 != -1) {
                                    long j3 = jCurrentTimeMillis + (j2 <= 9223372036854775L ? j2 * 1000 : Long.MAX_VALUE);
                                    if (j3 >= jCurrentTimeMillis && j3 <= 253402300799999L) {
                                        j = j3;
                                    }
                                } else {
                                    j = J;
                                }
                                String str4 = ct6Var.d;
                                if (str2 != null) {
                                    if (!cgg.w(str4, str2)) {
                                        i = 0;
                                        eu2Var2 = null;
                                    }
                                    eu2Var = eu2Var2;
                                    break;
                                }
                                str2 = str4;
                                if (str4.length() == str2.length() || l2b.d.a(str2) != null) {
                                    i = 0;
                                    if (strSubstring4 == null || !c5e.C(strSubstring4, "/", false)) {
                                        String strB = ct6Var.b();
                                        int iS = v4e.S(strB, '/', 0, 6);
                                        strSubstring4 = iS != 0 ? strB.substring(0, iS) : "/";
                                    }
                                    eu2Var2 = new eu2(strSubstring2, strSubstring3, j, str2, strSubstring4, i9, i7, i8, z, str3);
                                } else {
                                    i = 0;
                                    eu2Var2 = null;
                                }
                                eu2Var = eu2Var2;
                                break;
                            }
                            int iE3 = ieg.e(str, c, i6, length);
                            int iE4 = ieg.e(str, c2, i6, iE3);
                            int i10 = ieg.i(i6, iE4, str);
                            String strSubstring5 = str.substring(i10, ieg.j(i10, iE4, str));
                            if (iE4 < iE3) {
                                int i11 = ieg.i(iE4 + 1, iE3, str);
                                strSubstring = str.substring(i11, ieg.j(i11, iE3, str));
                            } else {
                                strSubstring = "";
                            }
                            if (strSubstring5.equalsIgnoreCase("expires")) {
                                try {
                                    J = cgg.J(strSubstring.length(), strSubstring);
                                    i8 = 1;
                                } catch (NumberFormatException | IllegalArgumentException unused) {
                                }
                            } else if (strSubstring5.equalsIgnoreCase("max-age")) {
                                try {
                                    long j4 = Long.parseLong(strSubstring);
                                    j2 = j4 <= 0 ? Long.MIN_VALUE : j4;
                                } catch (NumberFormatException e) {
                                    if (!new rob("-?\\d+").g(strSubstring)) {
                                        throw e;
                                    }
                                    j2 = c5e.C(strSubstring, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                }
                                i8 = 1;
                            } else if (strSubstring5.equalsIgnoreCase("domain")) {
                                if (c5e.u(strSubstring, ".", false)) {
                                    throw new IllegalArgumentException("Failed requirement.");
                                }
                                String strB2 = geg.b(v4e.Y(".", strSubstring));
                                if (strB2 == null) {
                                    throw new IllegalArgumentException();
                                }
                                str2 = strB2;
                                z = false;
                            } else if (strSubstring5.equalsIgnoreCase("path")) {
                                strSubstring4 = strSubstring;
                            } else if (strSubstring5.equalsIgnoreCase("secure")) {
                                i9 = 1;
                            } else if (strSubstring5.equalsIgnoreCase("httponly")) {
                                i7 = 1;
                            } else if (strSubstring5.equalsIgnoreCase("samesite")) {
                                str3 = strSubstring;
                            }
                            i6 = iE3 + 1;
                            c = ';';
                            c2 = '=';
                        }
                    } else {
                        i = i2;
                        eu2Var = null;
                    }
                } else {
                    i = i2;
                    eu2Var = null;
                }
            }
            if (eu2Var != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(eu2Var);
            }
            i3++;
            i2 = i;
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            listUnmodifiableList.getClass();
        } else {
            listUnmodifiableList = null;
        }
        if (listUnmodifiableList == null) {
            listUnmodifiableList = pu4.a;
        }
        if (listUnmodifiableList.isEmpty()) {
            return;
        }
        fu2Var.c(ct6Var, listUnmodifiableList);
    }
}
