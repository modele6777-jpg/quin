package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class w4e extends sfc {
    public static String o(String str) {
        return fyc.v(fyc.x(new td0(6, str), new alc("    ", 8)), "\n");
    }

    public static String p(String str) throws IOException {
        int length;
        str.getClass();
        List listU = v4e.U(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listU) {
            if (!v4e.Q((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(t72.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!tq.G(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Integer num = (Integer) s72.K0(arrayList2);
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listU.size();
        int size = listU.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listU) {
            int i = length + 1;
            if (length < 0) {
                t72.Z();
                throw null;
            }
            String str3 = (String) obj2;
            String strH = ((length == 0 || length == size) && v4e.Q(str3)) ? null : v4e.H(iIntValue, str3);
            if (strH != null) {
                arrayList3.add(strH);
            }
            length = i;
        }
        StringBuilder sb = new StringBuilder(length3);
        s72.C0(arrayList3, sb, "\n", null, null, null, 124);
        return sb.toString();
    }

    public static String q(String str) throws IOException {
        if (v4e.Q("|")) {
            qc0.j("marginPrefix must be non-blank string.");
            return null;
        }
        List listU = v4e.U(str);
        int length = str.length();
        listU.size();
        int size = listU.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listU) {
            int i2 = i + 1;
            if (i < 0) {
                t72.Z();
                throw null;
            }
            String str2 = (String) obj;
            if ((i == 0 || i == size) && v4e.Q(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!tq.G(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                String strSubstring = (i3 != -1 && c5e.B(i3, str2, "|", false)) ? str2.substring("|".length() + i3) : null;
                if (strSubstring != null) {
                    str2 = strSubstring;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        s72.C0(arrayList, sb, "\n", null, null, null, 124);
        return sb.toString();
    }
}
