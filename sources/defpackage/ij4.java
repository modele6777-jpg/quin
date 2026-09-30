package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ij4 implements xj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ e89 c;

    public /* synthetic */ ij4(ArrayList arrayList, e89 e89Var, int i) {
        this.a = i;
        this.b = arrayList;
        this.c = e89Var;
    }

    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        int i = this.a;
        wef wefVar = wef.a;
        e89 e89Var = this.c;
        ArrayList arrayList = this.b;
        switch (i) {
            case 0:
                l77 l77Var = (l77) obj;
                if (l77Var instanceof gj4) {
                    arrayList.add(l77Var);
                } else if (l77Var instanceof hj4) {
                    arrayList.remove(((hj4) l77Var).a);
                }
                e89Var.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            case 1:
                l77 l77Var2 = (l77) obj;
                if (l77Var2 instanceof al4) {
                    arrayList.add(l77Var2);
                } else if (l77Var2 instanceof bl4) {
                    arrayList.remove(((bl4) l77Var2).a);
                } else if (l77Var2 instanceof zk4) {
                    arrayList.remove(((zk4) l77Var2).a);
                }
                e89Var.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            default:
                l77 l77Var3 = (l77) obj;
                if (l77Var3 instanceof rn5) {
                    arrayList.add(l77Var3);
                } else if (l77Var3 instanceof sn5) {
                    arrayList.remove(((sn5) l77Var3).a);
                }
                e89Var.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
        }
        return wefVar;
    }
}
