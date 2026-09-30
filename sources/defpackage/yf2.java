package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yf2 implements a26 {
    public final /* synthetic */ int a;
    public final dx5 b;

    public /* synthetic */ yf2(dx5 dx5Var, int i) {
        this.a = i;
        this.b = dx5Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        dx5 dx5Var = this.b;
        switch (i) {
            case 0:
                h10 h10Var = (h10) obj;
                h10Var.getClass();
                return h10Var.R(dx5Var);
            default:
                dx5 dx5Var2 = (dx5) obj;
                dx5Var2.getClass();
                return Boolean.valueOf(!dx5Var2.a.c() && dx5Var2.b().equals(dx5Var));
        }
    }
}
