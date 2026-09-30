package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vq9 extends ni5 {
    public static final vq9 e;
    public static final vq9 f;
    public static final vq9 g;
    public static final vq9 h;
    public final /* synthetic */ int d;

    static {
        int i = 1;
        e = new vq9(i, 2, 0);
        int i2 = 1;
        f = new vq9(i2, i2, 1);
        g = new vq9(i, 2, 2);
        int i3 = 1;
        h = new vq9(i3, i3, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vq9(int i, int i2, int i3) {
        super(i, i2, 1, (byte) 0);
        this.d = i3;
    }

    @Override // defpackage.ni5
    public final void d(k01 k01Var, ac0 ac0Var, opd opdVar, bw bwVar, qr9 qr9Var) {
        switch (this.d) {
            case 0:
                Object objInvoke = ((x16) k01Var.c(0)).invoke();
                f46 f46Var = (f46) k01Var.c(1);
                int iB = k01Var.b(0);
                f46Var.getClass();
                opdVar.W(opdVar.c(f46Var), objInvoke);
                ac0Var.m(iB, objInvoke);
                ac0Var.d(objInvoke);
                break;
            case 1:
                f46 f46Var2 = (f46) k01Var.c(0);
                int iB2 = k01Var.b(0);
                ac0Var.l();
                f46Var2.getClass();
                ac0Var.a(iB2, opdVar.D(opdVar.c(f46Var2)));
                break;
            case 2:
                Object objC = k01Var.c(0);
                f46 f46Var3 = (f46) k01Var.c(1);
                int iB3 = k01Var.b(0);
                if (objC instanceof p46) {
                    p46 p46Var = (p46) objC;
                    ((p89) bwVar.e).b(p46Var);
                    ((x79) bwVar.d).e(p46Var);
                }
                Object objL = opdVar.L(opdVar.c(f46Var3), objC, iB3);
                if (objL instanceof p46) {
                    bwVar.i((p46) objL);
                } else if (objL instanceof ojb) {
                    ((ojb) objL).c();
                }
                break;
            default:
                Object objC2 = k01Var.c(0);
                int iB4 = k01Var.b(0);
                if (objC2 instanceof p46) {
                    p46 p46Var2 = (p46) objC2;
                    ((p89) bwVar.e).b(p46Var2);
                    ((x79) bwVar.d).e(p46Var2);
                }
                Object objL2 = opdVar.L(opdVar.t, objC2, iB4);
                if (objL2 instanceof p46) {
                    bwVar.i((p46) objL2);
                } else if (objL2 instanceof ojb) {
                    ((ojb) objL2).c();
                }
                break;
        }
    }

    @Override // defpackage.ni5
    public f46 f(k01 k01Var) {
        switch (this.d) {
            case 0:
                return (f46) k01Var.c(1);
            case 1:
                return (f46) k01Var.c(0);
            default:
                return super.f(k01Var);
        }
    }
}
