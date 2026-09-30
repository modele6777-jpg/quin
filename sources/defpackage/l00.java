package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l00 {
    public static final k00 a = new k00("");

    public static final List a(k00 k00Var, int i, int i2, zv zvVar) {
        List list;
        if (i == i2 || (list = k00Var.a) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0 && i2 >= k00Var.b.length()) {
            if (zvVar == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            while (i3 < size) {
                Object obj = list.get(i3);
                if (((Boolean) zvVar.d(((j00) obj).a)).booleanValue()) {
                    arrayList.add(obj);
                }
                i3++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        while (i3 < size2) {
            j00 j00Var = (j00) list.get(i3);
            if (zvVar != null ? ((Boolean) zvVar.d(j00Var.a)).booleanValue() : true) {
                int i4 = j00Var.b;
                int i5 = j00Var.c;
                if (b(i, i2, i4, i5)) {
                    arrayList2.add(new j00((g00) j00Var.a, mh3.o(j00Var.b, i, i2) - i, mh3.o(i5, i, i2) - i, j00Var.d));
                }
            }
            i3++;
        }
        return arrayList2;
    }

    public static final boolean b(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}
