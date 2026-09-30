package defpackage;

import java.util.concurrent.CancellationException;
import tech.chatmind.api.giftcard.GiftCardSku;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class i96 extends gbe implements l26 {
    final /* synthetic */ n07 $product;
    final /* synthetic */ f96 $state;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ j96 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i96(j96 j96Var, f96 f96Var, n07 n07Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = j96Var;
        this.$state = f96Var;
        this.$product = n07Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        i96 i96Var = new i96(this.this$0, this.$state, this.$product, xn2Var);
        i96Var.L$0 = obj;
        return i96Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        Object dzbVar;
        Object value;
        Object value2;
        int i = this.label;
        wef wefVar = wef.a;
        try {
            if (i == 0) {
                jzb.q(obj);
                j96 j96Var = this.this$0;
                f96 f96Var = this.$state;
                u96 u96Var = j96Var.R0;
                GiftCardSku giftCardSku = f96Var.a;
                String str = f96Var.b;
                String str2 = f96Var.c;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                Object objB = u96Var.b(giftCardSku, str, str2, this);
                bw2 bw2Var = bw2.a;
                if (objB == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            dzbVar = wefVar;
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        j96 j96Var2 = this.this$0;
        f96 f96Var2 = this.$state;
        n07 n07Var = this.$product;
        if (!(dzbVar instanceof dzb)) {
            j96Var2.T0.e("Gift card draft ready; launching payment: sku=" + f96Var2.a);
            m8b m8bVar = j96Var2.T0;
            s0e s0eVar = j96Var2.U0;
            m8bVar.e("Gift card payment launch started: sku=" + ((f96) s0eVar.getValue()).a);
            do {
                value2 = s0eVar.getValue();
            } while (!s0eVar.l(value2, f96.a((f96) value2, null, null, null, null, x86.a, null, null, 111)));
            j96Var2.H(n07Var, ((mo3) j96Var2.P0).a());
        }
        j96 j96Var3 = this.this$0;
        f96 f96Var3 = this.$state;
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            if (thA instanceof CancellationException) {
                throw thA;
            }
            j96Var3.T0.c("Gift card draft submission failed: sku=" + f96Var3.a, thA);
            s0e s0eVar2 = j96Var3.U0;
            do {
                value = s0eVar2.getValue();
            } while (!s0eVar2.l(value, f96.a((f96) value, null, null, null, null, b96.a, null, thA, 47)));
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((i96) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
