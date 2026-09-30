package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vj7 implements x16 {
    public final /* synthetic */ int a;
    public final x09 b;

    public /* synthetic */ vj7(x09 x09Var, int i) {
        this.a = i;
        this.b = x09Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        x09 x09Var = this.b;
        switch (i) {
            case 0:
                return new xj7(x09Var);
            case 1:
                bu3 bu3Var = x09Var.v;
                if (bu3Var == null) {
                    String str = x09Var.getName().a;
                    str.getClass();
                    ho7.l(str, " were not set before querying module content", "Dependencies of module ");
                    return null;
                }
                List list = bu3Var.a;
                x09Var.C0();
                list.contains(x09Var);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((x09) it.next()).getClass();
                }
                ArrayList arrayList = new ArrayList(t72.u(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    nw9 nw9Var = ((x09) it2.next()).w;
                    nw9Var.getClass();
                    arrayList.add(nw9Var);
                }
                return new fg2(arrayList, "CompositeProvider@ModuleDescriptor for " + x09Var.getName());
            default:
                return x09Var.W(tyd.i).v;
        }
    }
}
