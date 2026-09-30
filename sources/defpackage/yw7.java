package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yw7 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e89 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ List d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ yw7(e89 e89Var, ArrayList arrayList, List list, boolean z, int i) {
        this.a = i;
        this.b = e89Var;
        this.c = arrayList;
        this.d = list;
        this.e = z;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        boolean z = this.e;
        List list = this.d;
        ArrayList arrayList = this.c;
        e89 e89Var = this.b;
        wef wefVar = wef.a;
        bea beaVar = (bea) obj;
        switch (i) {
            case 0:
                beaVar.a = true;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((ax7) arrayList.get(i2)).c(beaVar, z);
                }
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((ax7) list.get(i3)).c(beaVar, z);
                }
                beaVar.a = false;
                e89Var.getValue();
                break;
            default:
                beaVar.a = true;
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    ((c18) arrayList.get(i4)).d(beaVar, z);
                }
                int size4 = list.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    ((c18) list.get(i5)).d(beaVar, z);
                }
                beaVar.a = false;
                e89Var.getValue();
                break;
        }
        return wefVar;
    }
}
