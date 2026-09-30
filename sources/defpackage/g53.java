package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g53 implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ m26 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ g53(int i, jx jxVar, x16 x16Var, x16 x16Var2, e89 e89Var, e89 e89Var2, e89 e89Var3, e89 e89Var4, TarotSkinIdentify tarotSkinIdentify) {
        this.c = e89Var;
        this.d = x16Var;
        this.e = x16Var2;
        this.f = e89Var2;
        this.g = tarotSkinIdentify;
        this.v = jxVar;
        this.w = e89Var3;
        this.x = e89Var4;
        this.b = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj3 = this.x;
        Object obj4 = this.w;
        Object obj5 = this.v;
        Object obj6 = this.g;
        Object obj7 = this.f;
        m26 m26Var = this.e;
        Object obj8 = this.d;
        Object obj9 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                x57.q((d63) obj9, (xw9) obj8, (a26) m26Var, (l26) obj4, (a26) obj7, (a26) obj6, (y72) obj3, (a26) obj5, (l46) obj, k99.P(this.b | 1));
                break;
            default:
                final e89 e89Var = (e89) obj9;
                final x16 x16Var = (x16) obj8;
                final x16 x16Var2 = (x16) m26Var;
                final e89 e89Var2 = (e89) obj7;
                final TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) obj6;
                final jx jxVar = (jx) obj5;
                final e89 e89Var3 = (e89) obj4;
                final e89 e89Var4 = (e89) obj3;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    xh3 xh3Var = ((xh3) e89Var.getValue()) == xh3.c ? xh3.d : (xh3) e89Var.getValue();
                    final int i2 = this.b;
                    cn1.f(xh3Var, null, null, "deckTopBar", af1.b0(1521674554, new n26() { // from class: bj3
                        @Override // defpackage.n26
                        public final Object m(Object obj10, Object obj11, Object obj12) {
                            xh3 xh3Var2 = (xh3) obj10;
                            l46 l46Var2 = (l46) obj11;
                            int iIntValue2 = ((Integer) obj12).intValue();
                            xh3Var2.getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= l46Var2.e(xh3Var2.ordinal()) ? 4 : 2;
                            }
                            if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                int iOrdinal = xh3Var2.ordinal();
                                if (iOrdinal == 0) {
                                    l46Var2.f0(-1173084357);
                                    pa7.d(null, y72.j, 0L, null, x57.d, null, false, x16Var, l46Var2, 24624, 109);
                                    l46Var2.r(false);
                                } else if (iOrdinal == 1) {
                                    l46Var2.f0(-1172727206);
                                    long j = y72.j;
                                    Object objR = l46Var2.R();
                                    if (objR == sf2.a) {
                                        objR = new i8(e89Var2, 27);
                                        l46Var2.p0(objR);
                                    }
                                    pa7.a(null, j, 0L, null, null, null, false, false, (x16) objR, l46Var2, 100663344, 253);
                                    l46Var2.r(false);
                                } else {
                                    if (iOrdinal != 2 && iOrdinal != 3) {
                                        throw tec.d(2040369388, l46Var2, false);
                                    }
                                    l46Var2.f0(-1172464884);
                                    long j2 = y72.j;
                                    TarotSkinIdentify tarotSkinIdentify2 = tarotSkinIdentify;
                                    pa7.a(null, j2, 0L, null, af1.b0(680153648, new h8(24, tarotSkinIdentify2, jxVar), l46Var2), af1.b0(644521895, new gj3(e89Var3, tarotSkinIdentify2, e89Var4, i2, e89Var), l46Var2), false, false, x16Var2, l46Var2, 221232, 205);
                                    l46Var2.r(false);
                                }
                            } else {
                                l46Var2.Z();
                            }
                            return wef.a;
                        }
                    }, l46Var), l46Var, 27648, 6);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ g53(d63 d63Var, xw9 xw9Var, a26 a26Var, l26 l26Var, a26 a26Var2, a26 a26Var3, y72 y72Var, a26 a26Var4, int i) {
        this.c = d63Var;
        this.d = xw9Var;
        this.e = a26Var;
        this.w = l26Var;
        this.f = a26Var2;
        this.g = a26Var3;
        this.x = y72Var;
        this.v = a26Var4;
        this.b = i;
    }
}
