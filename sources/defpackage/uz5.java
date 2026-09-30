package defpackage;

import androidx.compose.ui.tooling.PreviewActivity;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uz5 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ uz5(String str, int i, String str2, int i2) {
        this.a = i2;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) throws Exception {
        int i = this.a;
        wef wefVar = wef.a;
        String str = this.c;
        String str2 = this.b;
        l46 l46Var = (l46) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                eb3.n(str2, str, l46Var, k99.P(1));
                break;
            case 1:
                int iIntValue = num.intValue();
                int i2 = PreviewActivity.L0;
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    y41.x(str2, str, l46Var, new Object[0]);
                }
                break;
            case 2:
                num.getClass();
                ksb.h(str2, str, l46Var, k99.P(1));
                break;
            case 3:
                int iIntValue2 = num.intValue();
                if (!l46Var.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var.Z();
                } else {
                    vtb.e(str2, str, l46Var, 0);
                }
                break;
            case 4:
                int iIntValue3 = num.intValue();
                if (!l46Var.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    l46Var.Z();
                } else {
                    vtb.h(str2, str, l46Var, 0);
                }
                break;
            case 5:
                num.getClass();
                vtb.e(str2, str, l46Var, k99.P(1));
                break;
            default:
                num.getClass();
                vtb.h(str2, str, l46Var, k99.P(1));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ uz5(String str, String str2, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }
}
