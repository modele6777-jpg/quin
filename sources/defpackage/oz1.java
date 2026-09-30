package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oz1 {
    public final LinkedHashMap a;

    public oz1(int i) {
        switch (i) {
            case 1:
                this.a = new LinkedHashMap();
                break;
            case 2:
                this.a = new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                this.a = new LinkedHashMap();
                break;
        }
    }

    public void a(nz1 nz1Var) {
        long[] jArr = nz1Var.e;
        if (jArr.length > 0) {
            Long lValueOf = Long.valueOf(jArr[0]);
            LinkedHashMap linkedHashMap = this.a;
            if (linkedHashMap.containsKey(lValueOf)) {
                return;
            }
            linkedHashMap.put(Long.valueOf(nz1Var.e[0]), nz1Var);
        }
    }

    public void b(em7 em7Var, a26 a26Var) {
        em7Var.getClass();
        a26Var.getClass();
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap.containsKey(em7Var)) {
            qc0.o(ib8.j("A `initializer` with the same `clazz` has already been added: ", em7Var.g(), "."));
        } else {
            linkedHashMap.put(em7Var, new gwf(em7Var, a26Var));
        }
    }

    public d37 c() {
        Collection collectionValues = this.a.values();
        collectionValues.getClass();
        gwf[] gwfVarArr = (gwf[]) collectionValues.toArray(new gwf[0]);
        return new d37((gwf[]) Arrays.copyOf(gwfVarArr, gwfVarArr.length));
    }

    public nz1 d() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (nz1 nz1Var : this.a.values()) {
            arrayList.add(nz1Var.b);
            arrayList2.add(nz1Var.c);
            arrayList3.add(nz1Var.d);
            arrayList4.add(nz1Var.e);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long length = 0;
        for (int[] iArr2 : iArr) {
            length += (long) iArr2.length;
        }
        int i = (int) length;
        pa7.x(length, length == ((long) i), "the total number of elements (%s) in the arrays must fit in an int");
        int[] iArr3 = new int[i];
        int length2 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, length2, iArr4.length);
            length2 += iArr4.length;
        }
        return new nz1(iArr3, kn2.C((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), kn2.C((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), kn2.C((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }
}
