package defpackage;

import com.adjust.sdk.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class bt6 {
    public final /* synthetic */ int a;
    public final ArrayList b;
    public ArrayList c;
    public int d;
    public Serializable e;
    public Serializable f;
    public Serializable g;
    public Object h;
    public Serializable i;

    public bt6(g0a g0aVar) {
        this.a = 1;
        ArrayList arrayList = g0aVar.a;
        LinkedHashSet linkedHashSet = g0aVar.g;
        LinkedHashSet linkedHashSet2 = hg4.w;
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList2.add((i01) hg4.x.get((Class) it.next()));
        }
        this.b = arrayList2;
        u37 ho7Var = g0aVar.h;
        ho7Var = ho7Var == null ? new ho7(26) : ho7Var;
        this.h = ho7Var;
        this.i = g0aVar.e;
        ArrayList arrayList3 = g0aVar.b;
        this.c = arrayList3;
        ArrayList arrayList4 = g0aVar.c;
        this.e = arrayList4;
        ArrayList arrayList5 = g0aVar.d;
        this.f = arrayList5;
        HashSet hashSet = g0aVar.f;
        this.g = hashSet;
        this.d = g0aVar.i;
        ho7Var.a(new a80(arrayList3, arrayList4, arrayList5, hashSet, 100, new kd9(9)));
    }

    public static ArrayList e(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iN = v4e.N(str, '&', i, 4);
            if (iN == -1) {
                iN = str.length();
            }
            int iN2 = v4e.N(str, '=', i, 4);
            if (iN2 == -1 || iN2 > iN) {
                arrayList.add(str.substring(i, iN));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iN2));
                arrayList.add(str.substring(iN2 + 1, iN));
            }
            i = iN + 1;
        }
        return arrayList;
    }

    public ct6 a() {
        ArrayList arrayList;
        String str = (String) this.e;
        if (str == null) {
            qc0.p("scheme == null");
            return null;
        }
        String strR = n16.R((String) this.f, 0, 0, 7);
        String strR2 = n16.R((String) this.g, 0, 0, 7);
        String str2 = (String) this.h;
        if (str2 == null) {
            qc0.p("host == null");
            return null;
        }
        int iB = b();
        ArrayList arrayList2 = this.b;
        ArrayList arrayList3 = new ArrayList(t72.u(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(n16.R((String) it.next(), 0, 0, 7));
        }
        ArrayList<String> arrayList4 = this.c;
        if (arrayList4 != null) {
            arrayList = new ArrayList(t72.u(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList.add(str3 != null ? n16.R(str3, 0, 0, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = (String) this.i;
        return new ct6(str, strR, strR2, str2, iB, arrayList3, arrayList, str4 != null ? n16.R(str4, 0, 0, 7) : null, toString());
    }

    public int b() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        String str = (String) this.e;
        str.getClass();
        if (str.equals("http")) {
            return 80;
        }
        return str.equals(Constants.SCHEME) ? 443 : -1;
    }

    public bg4 c(String str) {
        Objects.requireNonNull(str, "input must not be null");
        hg4 hg4Var = new hg4(this.b, (u37) this.h, this.c, (ArrayList) this.e, (ArrayList) this.f, (HashSet) this.g, this.d);
        int i = 0;
        while (true) {
            int length = str.length();
            int i2 = i;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                char cCharAt = str.charAt(i2);
                if (cCharAt == '\n' || cCharAt == '\r') {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                break;
            }
            hg4Var.h(i, str.substring(i, i2));
            i = i2 + 1;
            if (i < str.length() && str.charAt(i2) == '\r' && str.charAt(i) == '\n') {
                i = i2 + 2;
            }
        }
        if (!str.isEmpty() && (i == 0 || i < str.length())) {
            hg4Var.h(i, str.substring(i));
        }
        hg4Var.e(hg4Var.u.size());
        t37 t37VarA = hg4Var.k.a(new a80(hg4Var.l, hg4Var.m, hg4Var.n, hg4Var.o, hg4Var.r, hg4Var.t));
        Iterator it = hg4Var.v.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).i(t37VarA);
        }
        bg4 bg4Var = (bg4) hg4Var.s.b;
        for (ar0 ar0Var : (ArrayList) this.i) {
            ar0Var.getClass();
            bg4Var.a(new sug(ar0Var));
        }
        return bg4Var;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0028  */
    public void d(ct6 ct6Var, String str) {
        int i;
        int i2;
        int iF;
        int i3;
        int i4;
        char cCharAt;
        str.getClass();
        byte[] bArr = ieg.a;
        int i5 = ieg.i(0, str.length(), str);
        int iJ = ieg.j(i5, str.length(), str);
        byte b = -1;
        if (iJ - i5 >= 2) {
            char cCharAt2 = str.charAt(i5);
            if ((pa7.L(cCharAt2, 97) >= 0 && pa7.L(cCharAt2, 122) <= 0) || (pa7.L(cCharAt2, 65) >= 0 && pa7.L(cCharAt2, 90) <= 0)) {
                i = i5 + 1;
                while (true) {
                    if (i < iJ) {
                        char cCharAt3 = str.charAt(i);
                        if (('a' > cCharAt3 || cCharAt3 >= '{') && (('A' > cCharAt3 || cCharAt3 >= '[') && !(('0' <= cCharAt3 && cCharAt3 < ':') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                            if (cCharAt3 == ':') {
                                break;
                            } else {
                                break;
                            }
                        }
                        i++;
                    }
                    i = -1;
                    break;
                }
            } else {
                i = -1;
                break;
            }
        } else {
            i = -1;
            break;
        }
        int i6 = 1;
        if (i != -1) {
            if (c5e.B(i5, str, "https:", true)) {
                this.e = Constants.SCHEME;
                i5 += 6;
            } else {
                if (!c5e.B(i5, str, "http:", true)) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, i) + '\'');
                }
                this.e = "http";
                i5 += 5;
            }
        } else {
            if (ct6Var == null) {
                qc0.j("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str.length() > 6 ? v4e.m0(6, str).concat("...") : str));
                return;
            }
            this.e = ct6Var.a;
        }
        int i7 = i5;
        int i8 = 0;
        while (true) {
            i2 = i6;
            if (i7 >= iJ || !((cCharAt = str.charAt(i7)) == '/' || cCharAt == '\\')) {
                break;
            }
            i8++;
            i7++;
            i6 = i2;
        }
        ArrayList arrayList = this.b;
        byte b2 = 35;
        if (i8 >= 2 || ct6Var == null || !pa7.t(ct6Var.a, (String) this.e)) {
            int i9 = i5 + i8;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                iF = ieg.f(str, i9, "@/\\?#", iJ);
                byte bCharAt = iF != iJ ? str.charAt(iF) : b;
                if (bCharAt == b || bCharAt == b2 || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                    break;
                }
                if (bCharAt == 64) {
                    if (i10 == 0) {
                        int iE = ieg.e(str, ':', i9, iF);
                        String strX = n16.x(i9, iE, 112, str, " \"':;<=>@[]^`{}|/\\?#");
                        if (i11 != 0) {
                            strX = ks0.l(new StringBuilder((String) this.f), "%40", strX);
                        }
                        this.f = strX;
                        if (iE != iF) {
                            this.g = n16.x(iE + 1, iF, 112, str, " \"':;<=>@[]^`{}|/\\?#");
                            i10 = i2;
                        }
                        i11 = i2;
                    } else {
                        this.g = ((String) this.g) + "%40" + n16.x(i9, iF, 112, str, " \"':;<=>@[]^`{}|/\\?#");
                    }
                    i9 = iF + 1;
                    b2 = 35;
                    b = -1;
                }
            }
            int i12 = i9;
            while (true) {
                if (i12 < iF) {
                    char cCharAt4 = str.charAt(i12);
                    if (cCharAt4 == ':') {
                        break;
                    }
                    if (cCharAt4 == '[') {
                        do {
                            i12++;
                            if (i12 >= iF) {
                                break;
                            }
                        } while (str.charAt(i12) != ']');
                    }
                    i12++;
                } else {
                    i12 = iF;
                    break;
                }
            }
            int i13 = i12 + 1;
            if (i13 < iF) {
                this.h = geg.b(n16.R(str, i9, i12, 4));
                try {
                    i4 = Integer.parseInt(n16.x(i13, iF, 120, str, ""));
                    if (i2 > i4 || i4 >= 65536) {
                        i4 = -1;
                    }
                } catch (NumberFormatException unused) {
                }
                this.d = i4;
                if (i4 == -1) {
                    yg5.i(34, str.substring(i13, iF), "Invalid URL port: \"");
                    return;
                }
            } else {
                this.h = geg.b(n16.R(str, i9, i12, 4));
                String str2 = (String) this.e;
                str2.getClass();
                if (str2.equals("http")) {
                    i3 = 80;
                } else {
                    i3 = str2.equals(Constants.SCHEME) ? 443 : -1;
                }
                this.d = i3;
            }
            if (((String) this.h) == null) {
                yg5.i(34, str.substring(i9, i12), "Invalid URL host: \"");
                return;
            }
            i5 = iF;
        } else {
            this.f = ct6Var.e();
            this.g = ct6Var.a();
            this.h = ct6Var.d;
            this.d = ct6Var.e;
            arrayList.clear();
            arrayList.addAll(ct6Var.c());
            if (i5 == iJ || str.charAt(i5) == '#') {
                String strD = ct6Var.d();
                this.c = strD != null ? e(n16.x(0, 0, 83, strD, " \"'<>#")) : null;
            }
        }
        int iF2 = ieg.f(str, i5, "?#", iJ);
        if (i5 != iF2) {
            char cCharAt5 = str.charAt(i5);
            if (cCharAt5 == '/' || cCharAt5 == '\\') {
                arrayList.clear();
                arrayList.add("");
                i5++;
            } else {
                arrayList.set(arrayList.size() - 1, "");
            }
            while (i5 < iF2) {
                int iF3 = ieg.f(str, i5, "/\\", iF2);
                boolean z = iF3 < iF2;
                String strX2 = n16.x(i5, iF3, 112, str, " \"<>^`{}|/\\?#");
                if (!strX2.equals(".") && !strX2.equalsIgnoreCase("%2e")) {
                    if (!strX2.equals("..") && !strX2.equalsIgnoreCase("%2e.") && !strX2.equalsIgnoreCase(".%2e") && !strX2.equalsIgnoreCase("%2e%2e")) {
                        if (((CharSequence) ks0.f(1, arrayList)).length() == 0) {
                            arrayList.set(arrayList.size() - 1, strX2);
                        } else {
                            arrayList.add(strX2);
                        }
                        if (z) {
                            arrayList.add("");
                        }
                    } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                        arrayList.add("");
                    } else {
                        arrayList.set(arrayList.size() - 1, "");
                    }
                }
                i5 = z ? iF3 + 1 : iF3;
            }
        }
        if (iF2 < iJ && str.charAt(iF2) == '?') {
            int iE2 = ieg.e(str, '#', iF2, iJ);
            this.c = e(n16.x(iF2 + 1, iE2, 80, str, " \"'<>#"));
            iF2 = iE2;
        }
        if (iF2 >= iJ || str.charAt(iF2) != '#') {
            return;
        }
        this.i = n16.x(iF2 + 1, iJ, 48, str, "");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ab  */
    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                String str = (String) this.e;
                if (str != null) {
                    sb.append(str);
                    sb.append("://");
                } else {
                    sb.append("//");
                }
                if (((String) this.f).length() > 0 || ((String) this.g).length() > 0) {
                    sb.append((String) this.f);
                    if (((String) this.g).length() > 0) {
                        sb.append(':');
                        sb.append((String) this.g);
                    }
                    sb.append('@');
                }
                String str2 = (String) this.h;
                if (str2 != null) {
                    if (v4e.G(str2, ':')) {
                        sb.append('[');
                        sb.append((String) this.h);
                        sb.append(']');
                    } else {
                        sb.append((String) this.h);
                    }
                }
                int i = -1;
                if (this.d != -1 || ((String) this.e) != null) {
                    int iB = b();
                    String str3 = (String) this.e;
                    if (str3 == null) {
                        sb.append(':');
                        sb.append(iB);
                    } else {
                        if (str3.equals("http")) {
                            i = 80;
                        } else if (str3.equals(Constants.SCHEME)) {
                            i = 443;
                        }
                        if (iB != i) {
                            sb.append(':');
                            sb.append(iB);
                        }
                    }
                }
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    sb.append('/');
                    sb.append((String) arrayList.get(i2));
                }
                if (this.c != null) {
                    sb.append('?');
                    ArrayList arrayList2 = this.c;
                    arrayList2.getClass();
                    k99.M(sb, arrayList2);
                }
                if (((String) this.i) != null) {
                    sb.append('#');
                    sb.append((String) this.i);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public bt6() {
        this.a = 0;
        this.f = "";
        this.g = "";
        this.d = -1;
        this.b = t72.K("");
    }
}
