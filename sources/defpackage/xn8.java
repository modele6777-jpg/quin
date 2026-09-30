package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public interface xn8 {
    default int a(ga7 ga7Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new gr3((tn8) list.get(i3), ha7.b, la7.a, i2));
        }
        return b(new ua7(ga7Var, ((yf9) ga7Var).J0.P0), arrayList, ll2.b(0, 0, 0, i, 7)).d();
    }

    yn8 b(zn8 zn8Var, List list, long j);

    default int c(ga7 ga7Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new gr3((tn8) list.get(i3), ha7.a, la7.a, i2));
        }
        return b(new ua7(ga7Var, ((yf9) ga7Var).J0.P0), arrayList, ll2.b(0, 0, 0, i, 7)).d();
    }

    default int d(ga7 ga7Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new gr3((tn8) list.get(i3), ha7.b, la7.b, i2));
        }
        return b(new ua7(ga7Var, ((yf9) ga7Var).J0.P0), arrayList, ll2.b(0, i, 0, 0, 13)).c();
    }

    default int e(ga7 ga7Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new gr3((tn8) list.get(i3), ha7.a, la7.b, i2));
        }
        return b(new ua7(ga7Var, ((yf9) ga7Var).J0.P0), arrayList, ll2.b(0, i, 0, 0, 13)).c();
    }
}
