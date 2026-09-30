package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import java.time.LocalDateTime;
import java.time.ZoneId;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ep6 extends gbe implements p26 {
    /* synthetic */ int I$0;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.p26
    public final Object C(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Number) obj3).intValue();
        ep6 ep6Var = new ep6(5, (xn2) obj5);
        ep6Var.L$0 = (lb8) obj;
        ep6Var.L$1 = (TarotSkinIdentify) obj2;
        ep6Var.I$0 = iIntValue;
        return ep6Var.r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        boolean z;
        lb8 lb8Var = (lb8) this.L$0;
        TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) this.L$1;
        int i = this.I$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        pu4 pu4Var = pu4.a;
        boolean z2 = lb8Var.j;
        LocalDateTime localDateTime = xs5.a;
        Long l = g3b.a;
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        zoneIdSystemDefault.getClass();
        LocalDateTime localDateTimeA = g3b.a(zoneIdSystemDefault);
        mic.a.getClass();
        mic.b.getClass();
        hs3 hs3Var = xqa.v;
        boolean z3 = true;
        boolean zB = ((Boolean) z5c.I(nu4.a, new ts5(hs3Var.a, hs3Var.b, null))).booleanValue() ? true : cr0.b(localDateTimeA);
        if (i != 0) {
            if (i != 1) {
                z = zB;
            }
            return new oo6(true, z2, pu4Var, tarotSkinIdentify, z);
        }
        z3 = false;
        z = z3;
        return new oo6(true, z2, pu4Var, tarotSkinIdentify, z);
    }
}
