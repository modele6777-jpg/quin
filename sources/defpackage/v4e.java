package defpackage;

import com.adjust.sdk.sig.r3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v4e extends c5e {
    public static boolean F(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (charSequence2 instanceof String) {
            if (O(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (M(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean G(CharSequence charSequence, char c) {
        charSequence.getClass();
        return N(charSequence, c, 0, 2) >= 0;
    }

    public static String H(int i, String str) {
        str.getClass();
        if (i < 0) {
            qc0.o(tec.f(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(i);
    }

    public static boolean I(CharSequence charSequence, char c) {
        charSequence.getClass();
        return charSequence.length() > 0 && tq.w(charSequence.charAt(charSequence.length() - 1), c, false);
    }

    public static boolean J(CharSequence charSequence, String str) {
        return charSequence instanceof String ? c5e.u((String) charSequence, str, false) : X(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static Character K(CharSequence charSequence, int i) {
        charSequence.getClass();
        if (i < 0 || i >= charSequence.length()) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i));
    }

    public static final int L(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        return (z || !(charSequence instanceof String)) ? M(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    public static final int M(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        x67 x67Var;
        if (z2) {
            charSequence.getClass();
            int length = charSequence.length() - 1;
            if (i > length) {
                i = length;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            x67Var = new x67(i, i2, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length2 = charSequence.length();
            if (i2 > length2) {
                i2 = length2;
            }
            x67Var = new z67(i, i2, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i3 = x67Var.c;
        int i4 = x67Var.b;
        int i5 = x67Var.a;
        if (!z3 || !(charSequence2 instanceof String)) {
            boolean z4 = z;
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z5 = z4;
                    z4 = z5;
                    if (X(charSequence4, 0, charSequence3, i5, charSequence2.length(), z5)) {
                        return i5;
                    }
                    if (i5 != i4) {
                        i5 += i3;
                        charSequence2 = charSequence4;
                        charSequence = charSequence3;
                    }
                }
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            int i6 = i5;
            while (true) {
                String str = (String) charSequence2;
                boolean z6 = z;
                if (c5e.x(0, i6, str.length(), str, (String) charSequence, z6)) {
                    return i6;
                }
                if (i6 != i4) {
                    i6 += i3;
                    z = z6;
                }
            }
        }
        return -1;
    }

    public static int N(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        return !(charSequence instanceof String) ? P(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int O(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return L(charSequence, str, i, z);
    }

    public static final int P(CharSequence charSequence, char[] cArr, int i, boolean z) {
        charSequence.getClass();
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(qd0.x0(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (tq.w(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == length) {
                return -1;
            }
            i++;
        }
    }

    public static boolean Q(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!tq.G(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static char R(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(charSequence.length() - 1);
        }
        r3.n("Char sequence is empty.");
        return (char) 0;
    }

    public static int S(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = charSequence.length() - 1;
        }
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(qd0.x0(cArr), i);
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            i = length;
        }
        while (-1 < i) {
            if (tq.w(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static int T(CharSequence charSequence, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            charSequence.getClass();
            i = charSequence.length() - 1;
        }
        int i3 = i;
        charSequence.getClass();
        str.getClass();
        return !(charSequence instanceof String) ? M(charSequence, str, i3, 0, false, true) : ((String) charSequence).lastIndexOf(str, i3);
    }

    public static List U(CharSequence charSequence) {
        charSequence.getClass();
        g68 g68Var = new g68(charSequence);
        if (!g68Var.hasNext()) {
            return pu4.a;
        }
        Object next = g68Var.next();
        if (!g68Var.hasNext()) {
            return t72.H(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (g68Var.hasNext()) {
            arrayList.add(g68Var.next());
        }
        return arrayList;
    }

    public static String V(int i, String str) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i < 0) {
            qc0.j(tec.f(i, "Desired length ", " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            sb.append((CharSequence) str);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(' ');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static String W(int i, String str) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i < 0) {
            qc0.j(tec.f(i, "Desired length ", " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static final boolean X(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!tq.w(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String Y(CharSequence charSequence, String str) {
        CharSequence charSequence2;
        String str2;
        boolean zX;
        str.getClass();
        if (charSequence instanceof String) {
            zX = c5e.C(str, (String) charSequence, false);
            charSequence2 = charSequence;
            str2 = str;
        } else {
            charSequence2 = charSequence;
            str2 = str;
            zX = X(str2, 0, charSequence2, 0, charSequence.length(), false);
        }
        return zX ? str2.substring(charSequence2.length()) : str2;
    }

    public static String Z(String str, String str2) {
        return J(str, str2) ? str.substring(0, str.length() - str2.length()) : str;
    }

    public static final void a0(int i) {
        if (i >= 0) {
            return;
        }
        qc0.o(tec.e(i, "Limit must be non-negative, but was "));
    }

    public static final List b0(CharSequence charSequence, String str, int i) {
        a0(i);
        int iL = L(charSequence, str, 0, false);
        if (iL == -1 || i == 1) {
            return t72.H(charSequence.toString());
        }
        boolean z = i > 0;
        int i2 = 10;
        if (z && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iL).toString());
            length = str.length() + iL;
            if (z && arrayList.size() == i - 1) {
                break;
            }
            iL = L(charSequence, str, length, false);
        } while (iL != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List c0(CharSequence charSequence, String[] strArr, int i) {
        int i2 = 2;
        byte b = 0;
        int i3 = (i & 4) != 0 ? 0 : 2;
        charSequence.getClass();
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() > 0) {
                return b0(charSequence, str, i3);
            }
        }
        a0(i3);
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        nw3<z67> nw3Var = new nw3(charSequence, i3, new ch3(listAsList, 3, b));
        ArrayList arrayList = new ArrayList(t72.u(new sd0(i2, nw3Var), 10));
        for (z67 z67Var : nw3Var) {
            z67Var.getClass();
            arrayList.add(charSequence.subSequence(z67Var.a, z67Var.b + 1).toString());
        }
        return arrayList;
    }

    public static List d0(String str, char[] cArr, int i) {
        int i2 = (i & 4) != 0 ? 0 : 3;
        str.getClass();
        if (cArr.length == 1) {
            return b0(str, String.valueOf(cArr[0]), i2);
        }
        a0(i2);
        nw3<z67> nw3Var = new nw3(str, i2, new z8d(6, cArr));
        ArrayList arrayList = new ArrayList(t72.u(new sd0(2, nw3Var), 10));
        for (z67 z67Var : nw3Var) {
            z67Var.getClass();
            arrayList.add(str.subSequence(z67Var.a, z67Var.b + 1).toString());
        }
        return arrayList;
    }

    public static boolean e0(String str, char c) {
        str.getClass();
        return str.length() > 0 && tq.w(str.charAt(0), c, false);
    }

    public static String f0(String str, String str2, String str3) {
        tec.x(str, str2, str3);
        int iO = O(str, str2, 0, false, 6);
        return iO == -1 ? str3 : str.substring(str2.length() + iO, str.length());
    }

    public static String g0(char c, String str, String str2) {
        str.getClass();
        str2.getClass();
        int iS = S(str, c, 0, 6);
        return iS == -1 ? str2 : str.substring(iS + 1, str.length());
    }

    public static String h0(String str) {
        str.getClass();
        str.getClass();
        int iT = T(str, ".", 0, 6);
        return iT == -1 ? str : str.substring(1 + iT, str.length());
    }

    public static String i0(String str, char c) {
        str.getClass();
        str.getClass();
        int iN = N(str, c, 0, 6);
        return iN == -1 ? str : str.substring(0, iN);
    }

    public static String j0(String str, String str2) {
        str.getClass();
        str.getClass();
        int iO = O(str, str2, 0, false, 6);
        return iO == -1 ? str : str.substring(0, iO);
    }

    public static String k0(String str, char c) {
        str.getClass();
        str.getClass();
        int iS = S(str, c, 0, 6);
        return iS == -1 ? str : str.substring(0, iS);
    }

    public static CharSequence l0(CharSequence charSequence, int i) {
        charSequence.getClass();
        if (i < 0) {
            qc0.o(tec.f(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = charSequence.length();
        if (i > length) {
            i = length;
        }
        return charSequence.subSequence(0, i);
    }

    public static String m0(int i, String str) {
        str.getClass();
        if (i < 0) {
            qc0.o(tec.f(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static boolean n0(String str) {
        str.getClass();
        if (str.equals("true")) {
            return true;
        }
        if (str.equals("false")) {
            return false;
        }
        qc0.j("The string doesn't represent a boolean value: ".concat(str));
        return false;
    }

    public static CharSequence o0(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zG = tq.G(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zG) {
                    break;
                }
                length--;
            } else if (zG) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static String p0(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            int length2 = cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    i2 = -1;
                    break;
                }
                if (cCharAt == cArr[i2]) {
                    break;
                }
                i2++;
            }
            if (i2 < 0) {
                charSequenceSubSequence = str.subSequence(i, str.length());
                return charSequenceSubSequence.toString();
            }
        }
        charSequenceSubSequence = "";
        return charSequenceSubSequence.toString();
    }
}
