package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yr6 implements x16 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ yr6(ds6 ds6Var, int i, f41 f41Var, int i2, boolean z) {
        this.d = ds6Var;
        this.b = i;
        this.e = f41Var;
        this.c = i2;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        switch (this.a) {
            case 0:
                ds6 ds6Var = (ds6) this.d;
                int i = this.b;
                f41 f41Var = (f41) this.e;
                int i2 = this.c;
                try {
                    ds6Var.y.getClass();
                    f41Var.c1(i2);
                    ds6Var.L0.G(i, ay4.CANCEL);
                    synchronized (ds6Var) {
                        ds6Var.N0.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
                return wef.a;
            default:
                qea qeaVar = (qea) this.d;
                CharSequence charSequence = (CharSequence) this.e;
                int i3 = this.b;
                return "Expected " + qeaVar.a + " but got " + charSequence.subSequence(i3, this.c + i3 + 1).toString();
        }
    }

    public /* synthetic */ yr6(qea qeaVar, CharSequence charSequence, int i, int i2) {
        this.d = qeaVar;
        this.e = charSequence;
        this.b = i;
        this.c = i2;
    }
}
