package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class si6 implements Iterable, zm7 {
    public static final si6 b = new si6(new String[0]);
    public final String[] a;

    public si6(String[] strArr) {
        strArr.getClass();
        this.a = strArr;
    }

    public final String c(String str) {
        String[] strArr = this.a;
        strArr.getClass();
        int length = strArr.length - 2;
        int iG = z7f.G(length, 0, -2);
        if (iG > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == iG) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final TreeMap d() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        TreeMap treeMap = new TreeMap(comparator);
        int size = size();
        for (int i = 0; i < size; i++) {
            String strI = xdc.i(this, i);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = strI.toLowerCase(locale);
            lowerCase.getClass();
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(xdc.k(this, i));
        }
        return treeMap;
    }

    public final List e(String str) {
        str.getClass();
        int size = size();
        List listUnmodifiableList = null;
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(xdc.i(this, i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(xdc.k(this, i));
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            listUnmodifiableList.getClass();
        }
        return listUnmodifiableList == null ? pu4.a : listUnmodifiableList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof si6) {
            return Arrays.equals(this.a, ((si6) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        iy9[] iy9VarArr = new iy9[size];
        for (int i = 0; i < size; i++) {
            iy9VarArr[i] = new iy9(xdc.i(this, i), xdc.k(this, i));
        }
        return new l2(iy9VarArr);
    }

    public final int size() {
        return this.a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strI = xdc.i(this, i);
            String strK = xdc.k(this, i);
            sb.append(strI);
            sb.append(": ");
            if (ieg.l(strI)) {
                strK = "██";
            }
            sb.append(strK);
            sb.append("\n");
        }
        return sb.toString();
    }
}
