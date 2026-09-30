package defpackage;

import ai.askquin.model.Scene;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sn6 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a26 b;
    public final /* synthetic */ Scene c;

    public /* synthetic */ sn6(a26 a26Var, Scene scene, int i) {
        this.a = i;
        this.b = a26Var;
        this.c = scene;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        Scene scene = this.c;
        a26 a26Var = this.b;
        switch (i) {
            case 0:
                a26Var.d(scene);
                break;
            default:
                a26Var.d(scene);
                break;
        }
        return wefVar;
    }
}
