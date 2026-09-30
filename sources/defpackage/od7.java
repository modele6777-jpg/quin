package defpackage;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class od7 implements x16 {
    public final /* synthetic */ int a;
    public final pd7 b;

    public /* synthetic */ od7(pd7 pd7Var, int i) {
        this.a = i;
        this.b = pd7Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        pd7 pd7Var = this.b;
        switch (i) {
            case 0:
                return s72.D0(pd7Var.getParameters(), "", "<init>(", ")V", z03.S0, 24);
            case 1:
                return tm7.u(pd7Var.c);
            case 2:
                sd0 sd0VarQ1 = s72.q1(pd7Var.d);
                ArrayList arrayList = new ArrayList(t72.u(sd0VarQ1, 10));
                Iterator it = sd0VarQ1.iterator();
                while (true) {
                    iq4 iq4Var = (iq4) it;
                    if (!iq4Var.b.hasNext()) {
                        return arrayList;
                    }
                    n17 n17Var = (n17) iq4Var.next();
                    int i2 = n17Var.a;
                    Method method = (Method) n17Var.b;
                    method.getClass();
                    arrayList.add(new qd7(pd7Var, method, i2));
                }
                break;
            case 3:
                Class clsR = af1.R(pd7Var.c);
                List list = pd7Var.d;
                ArrayList arrayList2 = new ArrayList(t72.u(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((Method) it2.next()).getName());
                }
                return new r00(clsR, arrayList2, p00.b, q00.a, pd7Var.d);
            default:
                Class clsR2 = af1.R(pd7Var.c);
                List list2 = pd7Var.d;
                ArrayList arrayList3 = new ArrayList(t72.u(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((Method) it3.next()).getName());
                }
                return new r00(clsR2, arrayList3, p00.a, q00.a, pd7Var.d);
        }
    }
}
