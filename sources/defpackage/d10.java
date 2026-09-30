package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class d10 implements a26 {
    public final /* synthetic */ int a;
    public final xr7 b;

    public /* synthetic */ d10(xr7 xr7Var, int i) {
        this.a = i;
        this.b = xr7Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        xr7 xr7Var = this.b;
        switch (i) {
            case 0:
                w09 w09Var = (w09) obj;
                w09Var.getClass();
                return w09Var.f().h(xr7Var.v());
            default:
                t99 t99Var = (t99) obj;
                x09 x09VarL = xr7Var.l();
                dx5 dx5Var = tyd.k;
                p18 p18Var = x09VarL.W(dx5Var).v;
                if (p18Var == null) {
                    xr7.a(11);
                    throw null;
                }
                y22 y22VarE = p18Var.e(t99Var, lf9.a);
                if (y22VarE == null) {
                    ho7.l(dx5Var.a(t99Var), " is not found", "Built-in class ");
                    return null;
                }
                if (y22VarE instanceof u09) {
                    return (u09) y22VarE;
                }
                throw new AssertionError("Must be a class descriptor " + t99Var + ", but was " + y22VarE);
        }
    }
}
