package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ep7 {
    public static final w84 a = w84.b1("k");

    public static ArrayList a(cj7 cj7Var, uh8 uh8Var, float f, yrf yrfVar, boolean z) {
        cj7 cj7Var2;
        uh8 uh8Var2;
        float f2;
        yrf yrfVar2;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (cj7Var.l() == 6) {
            uh8Var.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        cj7Var.beginObject();
        while (cj7Var.hasNext()) {
            if (cj7Var.x(a) != 0) {
                cj7Var.skipValue();
            } else if (cj7Var.l() == 1) {
                cj7Var.beginArray();
                if (cj7Var.l() == 7) {
                    cj7 cj7Var3 = cj7Var;
                    uh8 uh8Var3 = uh8Var;
                    float f3 = f;
                    yrf yrfVar3 = yrfVar;
                    boolean z3 = z;
                    bp7 bp7VarB = dp7.b(cj7Var3, uh8Var3, f3, yrfVar3, false, z3);
                    cj7Var2 = cj7Var3;
                    uh8Var2 = uh8Var3;
                    f2 = f3;
                    yrfVar2 = yrfVar3;
                    z2 = z3;
                    arrayList.add(bp7VarB);
                } else {
                    cj7Var2 = cj7Var;
                    uh8Var2 = uh8Var;
                    f2 = f;
                    yrfVar2 = yrfVar;
                    z2 = z;
                    while (cj7Var2.hasNext()) {
                        arrayList.add(dp7.b(cj7Var2, uh8Var2, f2, yrfVar2, true, z2));
                    }
                }
                cj7Var2.endArray();
                cj7Var = cj7Var2;
                uh8Var = uh8Var2;
                f = f2;
                yrfVar = yrfVar2;
                z = z2;
            } else {
                cj7 cj7Var4 = cj7Var;
                arrayList.add(dp7.b(cj7Var4, uh8Var, f, yrfVar, false, z));
                cj7Var = cj7Var4;
            }
        }
        cj7Var.endObject();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i;
        Object obj;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            bp7 bp7Var = (bp7) arrayList.get(i2);
            i2++;
            bp7 bp7Var2 = (bp7) arrayList.get(i2);
            bp7Var.h = Float.valueOf(bp7Var2.g);
            if (bp7Var.c == null && (obj = bp7Var2.b) != null) {
                bp7Var.c = obj;
                if (bp7Var instanceof i1a) {
                    ((i1a) bp7Var).d();
                }
            }
        }
        bp7 bp7Var3 = (bp7) arrayList.get(i);
        if ((bp7Var3.b == null || bp7Var3.c == null) && arrayList.size() > 1) {
            arrayList.remove(bp7Var3);
        }
    }
}
