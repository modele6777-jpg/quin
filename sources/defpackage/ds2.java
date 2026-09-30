package defpackage;

import ai.askquin.ui.router.AppRoute;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ds2 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tr2 b;

    public /* synthetic */ ds2(tr2 tr2Var, int i) {
        this.a = i;
        this.b = tr2Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        tr2 tr2Var = this.b;
        switch (i) {
            case 0:
                ka9.h(tr2Var.a, AppRoute.Main.INSTANCE, false);
                break;
            default:
                ka9.h(tr2Var.a, AppRoute.Main.INSTANCE, false);
                break;
        }
        return wefVar;
    }
}
