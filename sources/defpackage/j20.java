package defpackage;

import ai.askquin.R;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j20 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n07 b;
    public final /* synthetic */ a26 c;

    public /* synthetic */ j20(a26 a26Var, n07 n07Var) {
        this.a = 2;
        this.c = a26Var;
        this.b = n07Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        n07 n07Var = this.b;
        a26 a26Var = this.c;
        switch (i) {
            case 0:
                if (n07Var == null) {
                    jcc.k(1, Integer.valueOf(R.string.chat_mind_pricing_loading_failed));
                } else {
                    a26Var.d(n07Var);
                }
                break;
            case 1:
                if (n07Var == null) {
                    jcc.k(1, Integer.valueOf(R.string.chat_mind_pricing_loading_failed));
                } else {
                    a26Var.d(n07Var);
                }
                break;
            default:
                a26Var.d(n07Var);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ j20(n07 n07Var, a26 a26Var, int i) {
        this.a = i;
        this.b = n07Var;
        this.c = a26Var;
    }
}
