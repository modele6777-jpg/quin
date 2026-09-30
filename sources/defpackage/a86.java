package defpackage;

import java.util.concurrent.CancellationException;
import tech.chatmind.api.giftcard.GiftCardItem;
import tech.chatmind.api.giftcard.GiftCardStatus;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a86 extends gbe implements l26 {
    int label;
    final /* synthetic */ b86 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a86(b86 b86Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = b86Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new a86(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object value;
        Object value2;
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                b86 b86Var = this.this$0;
                u96 u96Var = b86Var.b;
                String str = b86Var.c;
                this.label = 1;
                obj = u96Var.a.e(str, this);
                bw2 bw2Var = bw2.a;
                if (obj == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            y76 y76Var = (y76) obj;
            b86 b86Var2 = this.this$0;
            m8b m8bVar = b86Var2.d;
            String str2 = b86Var2.c;
            boolean z = y76Var.c;
            GiftCardItem giftCardItem = y76Var.a;
            GiftCardStatus status = giftCardItem != null ? giftCardItem.getStatus() : null;
            GiftCardItem giftCardItem2 = y76Var.b;
            m8bVar.e("Gift card detail load succeeded: cardId=" + str2 + ", issuing=" + z + ", sentStatus=" + status + ", receivedStatus=" + (giftCardItem2 != null ? giftCardItem2.getStatus() : null));
            s0e s0eVar = this.this$0.e;
            do {
                value2 = s0eVar.getValue();
            } while (!s0eVar.l(value2, z76.a((z76) value2, y76Var, false, null, 4)));
        } catch (CancellationException e) {
            b86 b86Var3 = this.this$0;
            b86Var3.d.e("Gift card detail load cancelled: cardId=" + b86Var3.c);
            throw e;
        } catch (Exception e2) {
            b86 b86Var4 = this.this$0;
            b86Var4.d.c("Gift card detail load failed: cardId=" + b86Var4.c, e2);
            s0e s0eVar2 = this.this$0.e;
            do {
                value = s0eVar2.getValue();
            } while (!s0eVar2.l(value, z76.a((z76) value, null, false, e2, 1)));
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((a86) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
