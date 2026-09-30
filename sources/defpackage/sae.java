package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sae implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vae b;
    public final /* synthetic */ lq0 c;

    public /* synthetic */ sae(vae vaeVar, lq0 lq0Var, int i) {
        this.a = i;
        this.b = vaeVar;
        this.c = lq0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        lq0 lq0Var = this.c;
        vae vaeVar = this.b;
        switch (i) {
            case 0:
                vaeVar.e(lq0Var);
                break;
            default:
                vaeVar.e(lq0Var);
                break;
        }
    }
}
