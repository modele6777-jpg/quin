package defpackage;

import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gu1 implements x16 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ e89 b;
    public final /* synthetic */ gh6 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ n69 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;

    public /* synthetic */ gu1(float f, nu1 nu1Var, gh6 gh6Var, e89 e89Var, tt1 tt1Var, x16 x16Var, n69 n69Var) {
        this.d = f;
        this.f = nu1Var;
        this.c = gh6Var;
        this.b = e89Var;
        this.g = tt1Var;
        this.v = x16Var;
        this.e = n69Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        TarotCardType tarotCardType;
        int i = this.a;
        wef wefVar = wef.a;
        Object obj = this.v;
        Object obj2 = this.g;
        Object obj3 = this.f;
        String cardKey = null;
        switch (i) {
            case 0:
                nu1 nu1Var = (nu1) obj3;
                tt1 tt1Var = (tt1) obj2;
                x16 x16Var = (x16) obj;
                qz9 qz9Var = (qz9) this.e;
                float fJ = qz9Var.j();
                float f = this.d;
                if (fJ < (-f) && nu1Var.d) {
                    this.c.a();
                    x16 x16Var2 = (x16) this.b.getValue();
                    if (x16Var2 != null) {
                        x16Var2.invoke();
                    }
                    nu1 nu1Var2 = (nu1) tt1Var.b.getValue();
                    if (nu1Var2 != null && (tarotCardType = nu1Var2.a) != null) {
                        cardKey = tarotCardType.getCardKey();
                    }
                    tt1Var.g.setValue(cardKey);
                } else if (Math.abs(qz9Var.j()) > f) {
                    x16Var.invoke();
                }
                qz9Var.k(0.0f);
                break;
            default:
                aw2 aw2Var = (aw2) obj3;
                e89 e89Var = (e89) obj2;
                jx jxVar = (jx) obj;
                e89 e89Var2 = this.b;
                if (((xh3) e89Var2.getValue()) == xh3.b) {
                    e89Var.setValue(Boolean.FALSE);
                    e89Var2.setValue(xh3.c);
                    ynb.V(aw2Var, null, null, new tj3(this.c, jxVar, this.d, this.e, e89Var2, null), 3);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ gu1(aw2 aw2Var, e89 e89Var, e89 e89Var2, gh6 gh6Var, jx jxVar, float f, n69 n69Var) {
        this.f = aw2Var;
        this.b = e89Var;
        this.g = e89Var2;
        this.c = gh6Var;
        this.v = jxVar;
        this.d = f;
        this.e = n69Var;
    }
}
