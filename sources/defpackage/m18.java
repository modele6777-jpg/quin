package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class m18 implements x16 {
    public final /* synthetic */ int a;
    public final n18 b;

    public /* synthetic */ m18(n18 n18Var, int i) {
        this.a = i;
        this.b = n18Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        n18 n18Var = this.b;
        switch (i) {
            case 0:
                x09 x09Var = n18Var.d;
                x09Var.C0();
                fg2 fg2Var = (fg2) x09Var.z.getValue();
                dx5 dx5Var = n18Var.e;
                fg2Var.getClass();
                dx5Var.getClass();
                ArrayList arrayList = new ArrayList();
                fg2Var.b(dx5Var, arrayList);
                return arrayList;
            case 1:
                x09 x09Var2 = n18Var.d;
                x09Var2.C0();
                return Boolean.valueOf(af1.Y((fg2) x09Var2.z.getValue(), n18Var.e));
            default:
                ee8 ee8Var = n18Var.g;
                wn7[] wn7VarArr = n18.w;
                boolean zBooleanValue = ((Boolean) gdc.f(ee8Var, wn7VarArr[1])).booleanValue();
                dx5 dx5Var2 = n18Var.e;
                x09 x09Var3 = n18Var.d;
                if (zBooleanValue) {
                    return cr8.b;
                }
                List list = (List) gdc.f(n18Var.f, wn7VarArr[0]);
                ArrayList arrayList2 = new ArrayList(t72.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((kw9) it.next()).F());
                }
                return lmg.Z("package view scope for " + dx5Var2 + " in " + x09Var3.getName(), s72.R0(arrayList2, new w6e(x09Var3, dx5Var2)));
        }
    }
}
