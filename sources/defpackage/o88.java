package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o88 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ la1 c;
    public final /* synthetic */ x16 d;

    public /* synthetic */ o88(AtomicBoolean atomicBoolean, la1 la1Var, x16 x16Var, int i) {
        this.a = i;
        this.b = atomicBoolean;
        this.c = la1Var;
        this.d = x16Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        x16 x16Var = this.d;
        la1 la1Var = this.c;
        AtomicBoolean atomicBoolean = this.b;
        switch (i) {
            case 0:
                if (!atomicBoolean.get()) {
                    try {
                        la1Var.b(x16Var.invoke());
                    } catch (Throwable th) {
                        la1Var.d(th);
                        return;
                    }
                    break;
                }
                break;
            default:
                if (!atomicBoolean.get()) {
                    try {
                        la1Var.b(x16Var.invoke());
                    } catch (Throwable th2) {
                        la1Var.d(th2);
                    }
                    break;
                }
                break;
        }
    }
}
