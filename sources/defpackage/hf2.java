package defpackage;

import android.os.CancellationSignal;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hf2 implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hf2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((lyd) obj).h(null);
                break;
            case 1:
                z2f z2fVar = (z2f) obj;
                use useVar = z2fVar.a;
                u47 u47Var = z2fVar.b;
                useVar.b.a().v();
                une uneVar = useVar.b;
                uneVar.x = null;
                z2fVar.l(uneVar);
                useVar.b(u47Var, true, fpe.a);
                useVar.g(true);
                useVar.f(useVar.b.e);
                break;
            default:
                cre creVar = (cre) obj;
                if (creVar != null) {
                    r38 r38Var = creVar.d;
                    if (r38Var != null) {
                        r38Var.e(eue.b);
                    }
                    r38 r38Var2 = creVar.d;
                    if (r38Var2 != null) {
                        r38Var2.f(eue.b);
                    }
                }
                break;
        }
    }
}
