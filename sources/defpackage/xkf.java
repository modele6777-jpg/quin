package defpackage;

import ai.askquin.ui.account.component.AuthOption;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xkf implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qmf b;
    public final /* synthetic */ vb2 c;
    public final /* synthetic */ AuthOption d;

    public /* synthetic */ xkf(qmf qmfVar, vb2 vb2Var, AuthOption authOption, int i) {
        this.a = i;
        this.b = qmfVar;
        this.c = vb2Var;
        this.d = authOption;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        AuthOption authOption = this.d;
        vb2 vb2Var = this.c;
        qmf qmfVar = this.b;
        switch (i) {
            case 0:
                qmfVar.i(vb2Var, authOption.getLoginWay());
                break;
            default:
                qmfVar.i(vb2Var, authOption.getLoginWay());
                break;
        }
        return wefVar;
    }
}
