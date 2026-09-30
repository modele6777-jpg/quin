package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class of2 implements l26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ qf2 b;
    public final /* synthetic */ AndroidComposeView c;
    public final /* synthetic */ dd2 d;

    public /* synthetic */ of2(qf2 qf2Var, AndroidComposeView androidComposeView, dd2 dd2Var, int i) {
        this.b = qf2Var;
        this.c = androidComposeView;
        this.d = dd2Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        dd2 dd2Var = this.d;
        AndroidComposeView androidComposeView = this.c;
        qf2 qf2Var = this.b;
        l46 l46Var = (l46) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    l46Var.f0(866651995);
                    zg2.a(androidComposeView, qf2Var.l, dd2Var, l46Var, 0);
                    l46Var.r(false);
                }
                break;
            default:
                num.getClass();
                qf2Var.a(androidComposeView, dd2Var, l46Var, k99.P(1));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ of2(AndroidComposeView androidComposeView, qf2 qf2Var, dd2 dd2Var) {
        this.c = androidComposeView;
        this.b = qf2Var;
        this.d = dd2Var;
    }
}
