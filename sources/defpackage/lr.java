package defpackage;

import com.google.firebase.crashlytics.KeyValueBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lr implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ lr(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        int i2 = 0;
        wef wefVar = wef.a;
        ArrayList<iy9> arrayList = this.b;
        switch (i) {
            case 0:
                bea beaVar = (bea) obj;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    beaVar.k((cea) arrayList.get(i3), 0, 0, 0.0f);
                }
                break;
            case 1:
                bea beaVar2 = (bea) obj;
                int size2 = arrayList.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    beaVar2.k((cea) arrayList.get(i4), 0, 0, 0.0f);
                }
                break;
            case 2:
                KeyValueBuilder keyValueBuilder = (KeyValueBuilder) obj;
                keyValueBuilder.getClass();
                for (iy9 iy9Var : arrayList) {
                    keyValueBuilder.key((String) iy9Var.a(), (String) iy9Var.b());
                }
                break;
            case 3:
                bea beaVar3 = (bea) obj;
                beaVar3.getClass();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    beaVar3.g((cea) it.next(), 0, 0, 0.0f);
                }
                break;
            case 4:
                bea beaVar4 = (bea) obj;
                int size3 = arrayList.size();
                int i5 = 0;
                while (i5 < size3) {
                    ao8 ao8Var = (ao8) arrayList.get(i5);
                    List list = ao8Var.b;
                    boolean z = ao8Var.g;
                    if (ao8Var.k == Integer.MIN_VALUE) {
                        l37.a("position() should be called first");
                    }
                    int size4 = list.size();
                    int i6 = i2;
                    while (i6 < size4) {
                        cea ceaVar = (cea) list.get(i6);
                        int[] iArr = ao8Var.i;
                        int i7 = i6 * 2;
                        wef wefVar2 = wefVar;
                        long jD = w67.d((((long) iArr[i7 + 1]) & 4294967295L) | (((long) iArr[i7]) << 32), ao8Var.c);
                        if (z) {
                            bea.r(beaVar4, ceaVar, jD);
                        } else {
                            bea.p(beaVar4, ceaVar, jD);
                        }
                        i6++;
                        wefVar = wefVar2;
                    }
                    i5++;
                    i2 = 0;
                }
                break;
            case 5:
                bea beaVar5 = (bea) obj;
                int size5 = arrayList.size();
                for (int i8 = 0; i8 < size5; i8++) {
                    bea.n(beaVar5, (cea) arrayList.get(i8), 0, 0);
                }
                break;
            default:
                bea beaVar6 = (bea) obj;
                int size6 = arrayList.size();
                for (int i9 = 0; i9 < size6; i9++) {
                    beaVar6.g((cea) arrayList.get(i9), 0, 0, 0.0f);
                }
                break;
        }
        return wefVar;
    }
}
