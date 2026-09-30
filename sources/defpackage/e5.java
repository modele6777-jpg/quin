package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e5 implements x16 {
    public final /* synthetic */ int a = 1;
    public final List b;

    public e5(List list, xs6 xs6Var) {
        this.b = list;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        List<xt7> list = this.b;
        switch (i) {
            case 0:
                ArrayList arrayList = new ArrayList();
                for (xt7 xt7Var : list) {
                    xt7Var.getClass();
                    tt7 tt7VarL = q7c.l((tt7) xt7Var);
                    if (tt7VarL != null) {
                        arrayList.add(tt7VarL);
                    }
                }
                return arrayList;
            default:
                return list;
        }
    }

    public e5(List list) {
        this.b = list;
    }
}
