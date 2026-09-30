package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class qx7 implements x16 {
    public final /* synthetic */ int a;
    public final rx7 b;

    public /* synthetic */ qx7(rx7 rx7Var, int i) {
        this.a = i;
        this.b = rx7Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        rx7 rx7Var = this.b;
        switch (i) {
            case 0:
                if (qz3.f(rx7Var) == null) {
                    return null;
                }
                Object obj = rx7Var.g.b;
                return null;
            case 1:
                enb enbVar = rx7Var.v;
                ArrayList<tnb> typeParameters = enbVar.getTypeParameters();
                ArrayList arrayList = new ArrayList(t72.u(typeParameters, 10));
                for (tnb tnbVar : typeParameters) {
                    c8f c8fVarI = ((f8f) rx7Var.x.c).i(tnbVar);
                    if (c8fVarI == null) {
                        throw new AssertionError("Parameter " + tnbVar + " surely belongs to class " + enbVar + ", so it must be resolved");
                    }
                    arrayList.add(c8fVarI);
                }
                return arrayList;
            default:
                return a6c.g(rx7Var);
        }
    }
}
