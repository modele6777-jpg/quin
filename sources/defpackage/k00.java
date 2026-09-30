package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k00 implements CharSequence {
    public static final vea e = sdc.a;
    public final List a;
    public final String b;
    public final ArrayList c;
    public final ArrayList d;

    public k00(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.a = list;
        this.b = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                j00 j00Var = (j00) list.get(i);
                Object obj = j00Var.a;
                if (obj instanceof xtd) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(j00Var);
                } else if (obj instanceof ty9) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(j00Var);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.c = arrayList;
        this.d = arrayList2;
        List listB1 = arrayList2 != null ? s72.b1(arrayList2, new ww2(11)) : null;
        if (listB1 == null || listB1.isEmpty()) {
            return;
        }
        int i2 = ((j00) s72.v0(listB1)).c;
        p69 p69Var = s67.a;
        p69 p69Var2 = new p69(1);
        p69Var2.c(i2);
        int size2 = listB1.size();
        for (int i3 = 1; i3 < size2; i3++) {
            j00 j00Var2 = (j00) listB1.get(i3);
            while (p69Var2.b != 0) {
                int iB = p69Var2.b();
                if (j00Var2.b < iB) {
                    int i4 = j00Var2.c;
                    if (i4 > iB) {
                        j37.a("Paragraph overlap not allowed, end " + i4 + " should be less than or equal to " + iB);
                        break;
                    }
                    break;
                }
                p69Var2.e(p69Var2.b - 1);
            }
            p69Var2.c(j00Var2.c);
        }
    }

    public final List a(int i) {
        List list = this.a;
        if (list == null) {
            return pu4.a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            j00 j00Var = (j00) obj;
            if ((j00Var.a instanceof l68) && l00.b(0, i, j00Var.b, j00Var.c)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List b(int i, String str) {
        List list = this.a;
        if (list == null) {
            return pu4.a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            j00 j00Var = (j00) list.get(i2);
            Object obj = j00Var.a;
            int i3 = j00Var.c;
            int i4 = j00Var.b;
            String str2 = j00Var.d;
            if ((obj instanceof m4e) && pa7.t(str, str2) && l00.b(0, i, i4, i3)) {
                Object obj2 = j00Var.a;
                obj2.getClass();
                arrayList.add(new j00(((m4e) obj2).a, i4, i3, str2));
            }
        }
        return arrayList;
    }

    public final k00 c(a26 a26Var) {
        i00 i00Var = new i00(this);
        ArrayList arrayList = i00Var.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            j00 j00Var = (j00) a26Var.d(((h00) arrayList.get(i)).a(Integer.MIN_VALUE));
            arrayList.set(i, new h00(j00Var.a, j00Var.b, j00Var.c, j00Var.d));
        }
        return i00Var.l();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.b.charAt(i);
    }

    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final k00 subSequence(int i, int i2) {
        if (!(i <= i2)) {
            j37.a("start (" + i + ") should be less or equal to end (" + i2 + ")");
        }
        String str = this.b;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i, i2);
        k00 k00Var = l00.a;
        if (i > i2) {
            j37.a("start (" + i + ") should be less than or equal to end (" + i2 + ")");
        }
        List list = this.a;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                j00 j00Var = (j00) list.get(i3);
                int i4 = j00Var.b;
                int i5 = j00Var.c;
                if (l00.b(i, i2, i4, i5)) {
                    arrayList2.add(new j00(j00Var.a, Math.max(i, j00Var.b) - i, Math.min(i2, i5) - i, j00Var.d));
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return new k00(arrayList, strSubstring);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k00)) {
            return false;
        }
        k00 k00Var = (k00) obj;
        return pa7.t(this.b, k00Var.b) && pa7.t(this.a, k00Var.a);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        List list = this.a;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.b.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.b;
    }

    public /* synthetic */ k00(String str) {
        this(str, pu4.a);
    }

    public k00(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
