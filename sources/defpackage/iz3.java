package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class iz3 implements a26 {
    public final /* synthetic */ int a;
    public final jz3 b;

    public /* synthetic */ iz3(jz3 jz3Var, int i) {
        this.a = i;
        this.b = jz3Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        jz3 jz3Var = this.b;
        switch (i) {
            case 0:
                i8f i8fVar = (i8f) obj;
                i8fVar.getClass();
                if (i8fVar.c()) {
                    return "*";
                }
                tt7 tt7VarB = i8fVar.b();
                tt7VarB.getClass();
                String strP = jz3Var.P(tt7VarB);
                if (i8fVar.a() == dsf.INVARIANT) {
                    return strP;
                }
                return i8fVar.a() + ' ' + strP;
            default:
                tt7 tt7Var = (tt7) obj;
                tt7Var.getClass();
                return jz3Var.P(tt7Var);
        }
    }
}
