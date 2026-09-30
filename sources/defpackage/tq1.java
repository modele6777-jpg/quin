package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import java.util.List;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tq1 implements o26 {
    public final /* synthetic */ List a;
    public final /* synthetic */ TarotCardType b;
    public final /* synthetic */ TarotSkinIdentify c;
    public final /* synthetic */ l26 d;
    public final /* synthetic */ a26 e;
    public final /* synthetic */ a26 f;

    public tq1(List list, TarotCardType tarotCardType, TarotSkinIdentify tarotSkinIdentify, l26 l26Var, a26 a26Var, a26 a26Var2) {
        this.a = list;
        this.b = tarotCardType;
        this.c = tarotSkinIdentify;
        this.d = l26Var;
        this.e = a26Var;
        this.f = a26Var2;
    }

    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        mx7 mx7Var = (mx7) obj;
        int iIntValue = ((Number) obj2).intValue();
        l46 l46Var = (l46) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (l46Var.g(mx7Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= l46Var.e(iIntValue) ? 32 : 16;
        }
        if (l46Var.W(i & 1, (i & 147) != 146)) {
            bod bodVar = (bod) this.a.get(iIntValue);
            l46Var.f0(-1313475700);
            l26 l26Var = this.d;
            boolean zG = l46Var.g(l26Var) | l46Var.g(bodVar);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (zG || objR == i8cVar) {
                objR = new d5(6, l26Var, bodVar);
                l46Var.p0(objR);
            }
            a26 a26Var = (a26) objR;
            a26 a26Var2 = this.e;
            boolean zG2 = l46Var.g(a26Var2) | l46Var.g(bodVar);
            Object objR2 = l46Var.R();
            if (zG2 || objR2 == i8cVar) {
                objR2 = new sq1(a26Var2, bodVar, 0);
                l46Var.p0(objR2);
            }
            x16 x16Var = (x16) objR2;
            a26 a26Var3 = this.f;
            boolean zG3 = l46Var.g(a26Var3) | l46Var.g(bodVar);
            Object objR3 = l46Var.R();
            if (zG3 || objR3 == i8cVar) {
                objR3 = new sq1(a26Var3, bodVar, 1);
                l46Var.p0(objR3);
            }
            uq1.j(bodVar, this.b, this.c, a26Var, x16Var, (x16) objR3, l46Var, 0);
            l46Var.r(false);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }
}
