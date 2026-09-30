package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.b;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dv implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x16 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ dv(x16 x16Var, boolean z, int i) {
        this.a = i;
        this.b = x16Var;
        this.c = z;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        wef wefVar = wef.a;
        x16 x16Var = this.b;
        i8c i8cVar = sf2.a;
        boolean z = this.c;
        switch (i) {
            case 0:
                j09 j09Var = (j09) obj;
                l46 l46Var = (l46) obj2;
                ((Integer) obj3).getClass();
                l46Var.f0(-196777734);
                long j = ((hue) l46Var.k(iue.a)).a;
                boolean zF = l46Var.f(j) | l46Var.g(x16Var) | l46Var.h(z);
                Object objR = l46Var.R();
                if (zF || objR == i8cVar) {
                    objR = new ev(j, x16Var, z);
                    l46Var.p0(objR);
                }
                j09 j09VarT = b21.t(j09Var, (a26) objR);
                l46Var.r(false);
                return j09VarT;
            case 1:
                l46 l46Var2 = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((oz) obj).getClass();
                if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    bm8.h(this.b, null, false, null, null, af1.b0(-1775233988, new ci1(z, 2), l46Var2), l46Var2, 1572864, 62);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            case 2:
                j09 j09Var2 = (j09) obj;
                l46 l46Var3 = (l46) obj2;
                ((Integer) obj3).getClass();
                j09Var2.getClass();
                l46Var3.f0(218381749);
                Object objR2 = l46Var3.R();
                if (objR2 == i8cVar) {
                    objR2 = ib8.e(l46Var3);
                }
                j09 j09VarB = b.b(j09Var2, (t69) objR2, null, this.c, null, this.b, 24);
                l46Var3.r(false);
                return j09VarB;
            default:
                l46 l46Var4 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (l46Var4.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    nte.b(afc.q(R.string.chat_content_error_no_free_count, l46Var4), ynb.Z(g09.a, 16.0f), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var4, 48, 0, 262140);
                    String strQ = afc.q(R.string.button_retry, l46Var4);
                    boolean zH = l46Var4.h(z) | l46Var4.g(x16Var);
                    Object objR3 = l46Var4.R();
                    if (zH || objR3 == i8cVar) {
                        objR3 = new on2(z, x16Var, 3);
                        l46Var4.p0(objR3);
                    }
                    ynb.c(strQ, (x16) objR3, l46Var4, 0);
                } else {
                    l46Var4.Z();
                }
                return wefVar;
        }
    }

    public /* synthetic */ dv(boolean z, x16 x16Var, int i) {
        this.a = i;
        this.c = z;
        this.b = x16Var;
    }
}
