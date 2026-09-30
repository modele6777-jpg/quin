package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uq8 implements x16 {
    public final /* synthetic */ int a;
    public final yq8 b;
    public final kza c;
    public final q04 d;

    public /* synthetic */ uq8(yq8 yq8Var, kza kzaVar, q04 q04Var, int i) {
        this.a = i;
        this.b = yq8Var;
        this.c = kzaVar;
        this.d = q04Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        q04 q04Var = this.d;
        kza kzaVar = this.c;
        yq8 yq8Var = this.b;
        switch (i) {
            case 0:
                ge8 ge8Var = ((tz3) yq8Var.a.b).a;
                uq8 uq8Var = new uq8(yq8Var, kzaVar, q04Var, 2);
                ge8Var.getClass();
                return new de8(ge8Var, uq8Var);
            case 1:
                ge8 ge8Var2 = ((tz3) yq8Var.a.b).a;
                uq8 uq8Var2 = new uq8(yq8Var, kzaVar, q04Var, 3);
                ge8Var2.getClass();
                return new de8(ge8Var2, uq8Var2);
            case 2:
                lp0 lp0Var = yq8Var.a;
                m0b m0bVarA = yq8Var.a((bm3) lp0Var.d);
                m0bVarA.getClass();
                n00 n00Var = ((tz3) lp0Var.b).e;
                tt7 returnType = q04Var.getReturnType();
                returnType.getClass();
                return (bl2) n00Var.g(m0bVarA, kzaVar, returnType);
            default:
                lp0 lp0Var2 = yq8Var.a;
                m0b m0bVarA2 = yq8Var.a((bm3) lp0Var2.d);
                m0bVarA2.getClass();
                n00 n00Var2 = ((tz3) lp0Var2.b).e;
                tt7 returnType2 = q04Var.getReturnType();
                returnType2.getClass();
                return (bl2) n00Var2.c(m0bVarA2, kzaVar, returnType2);
        }
    }
}
