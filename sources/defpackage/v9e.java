package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v9e {
    public final ArrayList a = new ArrayList();

    public static void b(ArrayList arrayList, int i, int[] iArr, int i2) {
        if (i2 >= iArr.length) {
            arrayList.add((int[]) iArr.clone());
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    iArr[i2] = i3;
                    b(arrayList, i, iArr, i2 + 1);
                    break;
                } else if (i3 == iArr[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
        }
    }

    public final void a(z9e z9eVar) {
        this.a.add(z9eVar);
    }

    public final List c(ArrayList arrayList) {
        n3e n3eVar;
        n3e n3eVar2;
        n3e n3eVar3;
        if (arrayList.isEmpty()) {
            return new ArrayList();
        }
        int size = arrayList.size();
        ArrayList arrayList2 = this.a;
        if (size != arrayList2.size()) {
            return null;
        }
        int size2 = arrayList2.size();
        ArrayList<int[]> arrayList3 = new ArrayList();
        b(arrayList3, size2, new int[size2], 0);
        z9e[] z9eVarArr = new z9e[arrayList.size()];
        for (int[] iArr : arrayList3) {
            boolean z = true;
            for (int i = 0; i < arrayList2.size(); i++) {
                if (iArr[i] < arrayList.size()) {
                    z9e z9eVar = (z9e) arrayList2.get(i);
                    z9e z9eVar2 = (z9e) arrayList.get(iArr[i]);
                    z9eVar.getClass();
                    z9eVar2.getClass();
                    z &= z9eVar2.b.a() <= z9eVar.b.a() && z9eVar2.a == z9eVar.a && ((n3eVar = z9eVar.c) == (n3eVar2 = n3e.DEFAULT) || (n3eVar3 = z9eVar2.c) == n3eVar2 || n3eVar3 == n3eVar);
                    if (!z) {
                        break;
                    }
                    z9eVarArr[iArr[i]] = (z9e) arrayList2.get(i);
                }
            }
            if (z) {
                return Arrays.asList(z9eVarArr);
            }
        }
        return null;
    }
}
