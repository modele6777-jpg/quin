package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ni5 {
    public final /* synthetic */ int a;
    public final int b;
    public final int c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ni5(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, 1, (byte) 0);
        this.a = 1;
    }

    public static mi5 a(ni5 ni5Var, j87[] j87VarArr) {
        return new mi5(ni5Var.b + ni5Var.c, j87VarArr);
    }

    public static li5 b(ni5 ni5Var) {
        byte b = 0;
        return new li5(ni5Var.b + ni5Var.c, 1, b, b);
    }

    public static li5 c() {
        return new li5(0, 1, 0, (byte) 0);
    }

    public abstract void d(k01 k01Var, ac0 ac0Var, opd opdVar, bw bwVar, qr9 qr9Var);

    public abstract Object e(int i);

    public f46 f(k01 k01Var) {
        return null;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                String strR = job.a.b(getClass()).r();
                return strR == null ? "" : strR;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ni5(int i, int i2, int i3, byte b) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }
}
