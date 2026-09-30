package defpackage;

import ai.askquin.ui.share.SharedDivination;
import android.graphics.Bitmap;
import androidx.compose.foundation.layout.b;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hk6 implements o26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ hk6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        Object obj9 = this.c;
        Object obj10 = this.b;
        switch (i) {
            case 0:
                bx9 bx9Var = (bx9) obj10;
                x16 x16Var = (x16) obj9;
                x16 x16Var2 = (x16) obj8;
                a26 a26Var = (a26) obj7;
                a26 a26Var2 = (a26) obj6;
                a26 a26Var3 = (a26) obj5;
                cn6 cn6Var = (cn6) obj2;
                l46 l46Var = (l46) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((ly) obj).getClass();
                cn6Var.getClass();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= l46Var.g(cn6Var) ? 32 : 16;
                }
                if (!l46Var.W(iIntValue & 1, (iIntValue & 145) != 144)) {
                    l46Var.Z();
                } else {
                    kn2.j(b.c, bx9Var, cn6Var.g, cn6Var.m, cn6Var.d, cn6Var.c, cn6Var.b, cn6Var.n, x16Var, x16Var2, a26Var, a26Var2, a26Var3, l46Var, 518);
                }
                break;
            default:
                e89 e89Var = (e89) obj10;
                ihb ihbVar = (ihb) obj9;
                SharedDivination sharedDivination = (SharedDivination) obj8;
                x6d x6dVar = (x6d) obj7;
                String str = (String) obj6;
                Bitmap bitmap = (Bitmap) obj5;
                int iIntValue2 = ((Integer) obj).intValue();
                a26 a26Var4 = (a26) obj2;
                l46 l46Var2 = (l46) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                a26Var4.getClass();
                int i2 = (iIntValue3 & 6) == 0 ? (l46Var2.e(iIntValue2) ? 4 : 2) | iIntValue3 : iIntValue3;
                if ((iIntValue3 & 48) == 0) {
                    i2 |= l46Var2.i(a26Var4) ? 32 : 16;
                }
                if (!l46Var2.W(i2 & 1, (i2 & 147) != 146)) {
                    l46Var2.Z();
                } else {
                    fhb fhbVar = (fhb) e89Var.getValue();
                    ehb ehbVar = fhbVar instanceof ehb ? (ehb) fhbVar : null;
                    if (ehbVar != null) {
                        l46Var2.f0(94992708);
                        l46Var2.r(false);
                        e8d e8dVar = (e8d) x6dVar.c.get(iIntValue2);
                        mh3.a(vgb.c.a((String) bm8.B(ehbVar.a, e8dVar)), af1.b0(203320894, new r19(e8dVar, bitmap, a26Var4, sharedDivination, 15), l46Var2), l46Var2, 56);
                    } else {
                        l46Var2.f0(94564102);
                        a26 a26Var5 = (a26) l46Var2.k(sad.d);
                        fhb fhbVar2 = (fhb) e89Var.getValue();
                        boolean zG = l46Var2.g(a26Var5) | l46Var2.g(e89Var) | l46Var2.i(ihbVar) | l46Var2.i(sharedDivination) | l46Var2.i(x6dVar) | l46Var2.g(str);
                        Object objR = l46Var2.R();
                        if (zG || objR == sf2.a) {
                            f7d f7dVar = new f7d(a26Var5, e89Var, ihbVar, sharedDivination, x6dVar, str, null);
                            l46Var2.p0(f7dVar);
                            objR = f7dVar;
                        }
                        af1.o((l26) objR, l46Var2, fhbVar2);
                        l46Var2.r(false);
                    }
                }
                break;
        }
        return wefVar;
    }
}
