package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fj3 implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ m26 e;

    public /* synthetic */ fj3(long j, rh5 rh5Var, x16 x16Var, x16 x16Var2) {
        this.b = j;
        this.c = rh5Var;
        this.d = x16Var;
        this.e = x16Var2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = 1;
        m26 m26Var = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                TarotCardType tarotCardType = (TarotCardType) obj;
                String str = (String) obj2;
                tarotCardType.getClass();
                str.getClass();
                tt1.c((tt1) obj4, tarotCardType, (TarotSkinIdentify) obj3, abg.Z(this.b), true, new n43(i2, (a26) m26Var, str), null, null, false, 480);
                break;
            default:
                rh5 rh5Var = (rh5) obj4;
                x16 x16Var = (x16) obj3;
                x16 x16Var2 = (x16) m26Var;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    n16.m(null, this.b, rh5Var, x16Var, x16Var2, l46Var, 0);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ fj3(tt1 tt1Var, TarotSkinIdentify tarotSkinIdentify, long j, a26 a26Var) {
        this.c = tt1Var;
        this.d = tarotSkinIdentify;
        this.b = j;
        this.e = a26Var;
    }
}
