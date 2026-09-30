package defpackage;

import java.util.concurrent.CancellationException;
import tech.chatmind.api.giftcard.GiftCardItem;
import tech.chatmind.api.giftcard.GiftCardSku;
import tech.chatmind.api.giftcard.GiftCardStatus;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h96 extends gbe implements l26 {
    final /* synthetic */ String $orderRef;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ j96 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h96(j96 j96Var, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = j96Var;
        this.$orderRef = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        h96 h96Var = new h96(this.this$0, this.$orderRef, xn2Var);
        h96Var.L$0 = obj;
        return h96Var;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00f1  */
    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        Object dzbVar;
        Object value;
        Object value2;
        Object value3;
        String strB;
        Object objA;
        int i = this.label;
        String str = null;
        try {
            if (i == 0) {
                jzb.q(obj);
                j96 j96Var = this.this$0;
                String str2 = this.$orderRef;
                u96 u96Var = j96Var.R0;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                int i2 = u96.c;
                objA = u96Var.a(str2, 10, 2000L, this);
                bw2 bw2Var = bw2.a;
                if (objA == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
                objA = obj;
            }
            dzbVar = (y76) objA;
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        j96 j96Var2 = this.this$0;
        String str3 = this.$orderRef;
        if (!(dzbVar instanceof dzb)) {
            y76 y76Var = (y76) dzbVar;
            GiftCardItem giftCardItem = y76Var != null ? y76Var.a : null;
            if (giftCardItem != null) {
                m8b m8bVar = j96Var2.T0;
                String cardId = giftCardItem.getCardId();
                GiftCardSku sku = giftCardItem.getSku();
                GiftCardStatus status = giftCardItem.getStatus();
                StringBuilder sbO = ib8.o("Gift card issued: orderRef=", str3, ", cardId=", cardId, ", sku=");
                sbO.append(sku);
                sbO.append(", status=");
                sbO.append(status);
                m8bVar.e(sbO.toString());
                s0e s0eVar = j96Var2.U0;
                do {
                    value3 = s0eVar.getValue();
                } while (!s0eVar.l(value3, f96.a((f96) value3, null, null, null, null, c96.a, giftCardItem, null, 15)));
                if (j96Var2.X0.add(str3)) {
                    GiftCardSku sku2 = giftCardItem.getSku();
                    n26 n26Var = j96Var2.S0;
                    sku2.getClass();
                    n26Var.getClass();
                    ca2.a.getClass();
                    boolean z = ca2.c;
                    int i3 = ab6.a[sku2.ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2) {
                            m86 m86Var = m86.b;
                            strB = z ? m86Var.b() : m86Var.d();
                        } else if (i3 != 3) {
                            ap.c();
                            return null;
                        }
                        if (str != null) {
                            n26Var.m(new r05("purchase_succeeded"), m1f.a, new bt5(str, 5));
                        }
                    } else {
                        m86 m86Var2 = m86.a;
                        strB = z ? m86Var2.b() : m86Var2.d();
                    }
                    str = strB;
                    if (str != null) {
                        n26Var.m(new r05("purchase_succeeded"), m1f.a, new bt5(str, 5));
                    }
                }
            } else {
                j96Var2.T0.g("Gift card issuance delayed: orderRef=" + str3);
                s0e s0eVar2 = j96Var2.U0;
                do {
                    value2 = s0eVar2.getValue();
                } while (!s0eVar2.l(value2, f96.a((f96) value2, null, null, null, null, a96.a, null, null, 47)));
            }
        }
        j96 j96Var3 = this.this$0;
        String str4 = this.$orderRef;
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            if (thA instanceof CancellationException) {
                throw thA;
            }
            kv2.A("Gift card order confirmation failed: orderRef=", str4, j96Var3.T0, thA);
            s0e s0eVar3 = j96Var3.U0;
            do {
                value = s0eVar3.getValue();
            } while (!s0eVar3.l(value, f96.a((f96) value, null, null, null, null, new y86(str4, thA, true), null, thA, 47)));
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((h96) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
