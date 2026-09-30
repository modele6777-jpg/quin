package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m1g {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final d0a a = new d0a();
    public final StringBuilder b = new StringBuilder();

    public static String a(d0a d0aVar, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = d0aVar.b;
        int i2 = d0aVar.c;
        while (i < i2 && !z) {
            char c2 = (char) d0aVar.a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        d0aVar.N(i - d0aVar.b);
        return sb.toString();
    }

    public static String b(d0a d0aVar, StringBuilder sb) {
        c(d0aVar);
        if (d0aVar.a() == 0) {
            return null;
        }
        String strA = a(d0aVar, sb);
        if (!strA.isEmpty()) {
            return strA;
        }
        return "" + ((char) d0aVar.z());
    }

    public static void c(d0a d0aVar) {
        while (true) {
            for (boolean z = true; d0aVar.a() > 0 && z; z = false) {
                int i = d0aVar.b;
                byte[] bArr = d0aVar.a;
                byte b = bArr[i];
                char c2 = (char) b;
                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
                    d0aVar.N(1);
                } else {
                    int i2 = d0aVar.c;
                    int i3 = i + 2;
                    if (i3 <= i2) {
                        int i4 = i + 1;
                        if (b == 47 && bArr[i4] == 42) {
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= i2) {
                                    break;
                                }
                                if (((char) bArr[i3]) == '*' && ((char) bArr[i5]) == '/') {
                                    i3 += 2;
                                    i2 = i3;
                                } else {
                                    i3 = i5;
                                }
                            }
                            d0aVar.N(i2 - d0aVar.b);
                        }
                    }
                }
            }
            return;
        }
    }
}
