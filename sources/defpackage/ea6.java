package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.giftcard.GiftCardItem;
import tech.chatmind.api.giftcard.GiftCardSku;
import tech.chatmind.api.giftcard.GiftCardStatus;
import tech.chatmind.api.server.NullableServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ea6 implements hf8 {
    public final r76 a;
    public final m8b b;

    public ea6(r76 r76Var) {
        this.a = r76Var;
        hf8.Q.getClass();
        this.b = ef8.a("GiftCardRequester");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(GiftCardSku giftCardSku, String str, String str2, zn2 zn2Var) throws e86 {
        v96 v96Var;
        if (zn2Var instanceof v96) {
            v96Var = (v96) zn2Var;
            int i = v96Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                v96Var.label = i - Integer.MIN_VALUE;
            } else {
                v96Var = new v96(this, zn2Var);
            }
        } else {
            v96Var = new v96(this, zn2Var);
        }
        Object obj = v96Var.result;
        int i2 = v96Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            a26 w96Var = new w96(this, giftCardSku, str, str2, null);
            v96Var.L$0 = null;
            v96Var.L$1 = null;
            v96Var.L$2 = null;
            v96Var.label = 1;
            Object objH = h(w96Var, v96Var);
            Object obj2 = bw2.a;
            if (objH == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    public final y76 b(nh7 nh7Var) {
        Boolean boolB;
        ti7 ti7VarH = oh7.h(nh7Var);
        nh7 nh7Var2 = (nh7) ti7VarH.get("sent");
        if (nh7Var2 == null || (nh7Var2 instanceof qi7)) {
            nh7Var2 = null;
        }
        nh7 nh7Var3 = (nh7) ti7VarH.get("received");
        if (nh7Var3 == null || (nh7Var3 instanceof qi7)) {
            nh7Var3 = null;
        }
        GiftCardItem giftCardItemC = nh7Var2 != null ? c(nh7Var2) : null;
        GiftCardItem giftCardItemC2 = nh7Var3 != null ? c(nh7Var3) : null;
        m8b m8bVar = this.b;
        if (nh7Var2 != null && giftCardItemC == null) {
            m8bVar.g("Gift card detail dropped invalid sent item");
        }
        if (nh7Var3 != null && giftCardItemC2 == null) {
            m8bVar.g("Gift card detail dropped invalid received item");
        }
        nh7 nh7Var4 = (nh7) ti7VarH.get("issuing");
        return new y76(giftCardItemC, giftCardItemC2, (nh7Var4 == null || (boolB = n4e.b(oh7.i(nh7Var4).c())) == null) ? false : boolB.booleanValue());
    }

    public final GiftCardItem c(nh7 nh7Var) {
        Object dzbVar;
        Object dzbVar2;
        try {
            dzbVar = (GiftCardItem) fzc.a.a(GiftCardItem.Companion.serializer(), nh7Var);
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        Throwable thA = ezb.a(dzbVar);
        m8b m8bVar = this.b;
        if (thA != null) {
            try {
                dzbVar2 = s72.a1(oh7.h(nh7Var).a.keySet());
            } catch (Throwable th2) {
                dzbVar2 = new dzb(th2);
            }
            if (dzbVar2 instanceof dzb) {
                dzbVar2 = pu4.a;
            }
            m8bVar.g("Failed to decode gift card item: errorType=" + thA.getClass().getSimpleName() + ", fields=" + ((List) dzbVar2));
        }
        if (dzbVar instanceof dzb) {
            dzbVar = null;
        }
        GiftCardItem giftCardItem = (GiftCardItem) dzbVar;
        if (giftCardItem == null) {
            return null;
        }
        if (!v4e.Q(giftCardItem.getCardId()) && giftCardItem.getSku() != GiftCardSku.Unknown && giftCardItem.getStatus() != GiftCardStatus.Unknown) {
            return giftCardItem;
        }
        m8bVar.g("Dropped invalid gift card item: hasCardId=" + (!v4e.Q(giftCardItem.getCardId())) + ", sku=" + giftCardItem.getSku() + ", status=" + giftCardItem.getStatus());
        return null;
    }

    @Override // defpackage.hf8
    public final m8b d() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, zn2 zn2Var) throws e86 {
        x96 x96Var;
        if (zn2Var instanceof x96) {
            x96Var = (x96) zn2Var;
            int i = x96Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                x96Var.label = i - Integer.MIN_VALUE;
            } else {
                x96Var = new x96(this, zn2Var);
            }
        } else {
            x96Var = new x96(this, zn2Var);
        }
        Object objH = x96Var.result;
        int i2 = x96Var.label;
        if (i2 == 0) {
            jzb.q(objH);
            y96 y96Var = new y96(this, str, null);
            x96Var.L$0 = null;
            x96Var.L$1 = this;
            x96Var.label = 1;
            objH = h(y96Var, x96Var);
            bw2 bw2Var = bw2.a;
            if (objH == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = (ea6) x96Var.L$1;
            jzb.q(objH);
        }
        return this.b((nh7) objH);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(String str, zn2 zn2Var) throws e86 {
        z96 z96Var;
        if (zn2Var instanceof z96) {
            z96Var = (z96) zn2Var;
            int i = z96Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                z96Var.label = i - Integer.MIN_VALUE;
            } else {
                z96Var = new z96(this, zn2Var);
            }
        } else {
            z96Var = new z96(this, zn2Var);
        }
        Object objH = z96Var.result;
        int i2 = z96Var.label;
        if (i2 == 0) {
            jzb.q(objH);
            aa6 aa6Var = new aa6(this, str, null);
            z96Var.L$0 = null;
            z96Var.L$1 = this;
            z96Var.label = 1;
            objH = h(aa6Var, z96Var);
            bw2 bw2Var = bw2.a;
            if (objH == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = (ea6) z96Var.L$1;
            jzb.q(objH);
        }
        return this.b((nh7) objH);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(wa6 wa6Var, xn2 xn2Var) throws e86 {
        ba6 ba6Var;
        if (xn2Var instanceof ba6) {
            ba6Var = (ba6) xn2Var;
            int i = ba6Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ba6Var.label = i - Integer.MIN_VALUE;
            } else {
                ba6Var = new ba6(this, (zn2) xn2Var);
            }
        } else {
            ba6Var = new ba6(this, (zn2) xn2Var);
        }
        Object objH = ba6Var.result;
        int i2 = ba6Var.label;
        if (i2 == 0) {
            jzb.q(objH);
            a26 ca6Var = new ca6(this, wa6Var, null);
            ba6Var.L$0 = wa6Var;
            ba6Var.label = 1;
            objH = h(ca6Var, ba6Var);
            Object obj = bw2.a;
            if (objH == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wa6Var = (wa6) ba6Var.L$0;
            jzb.q(objH);
        }
        Object obj2 = oh7.h((nh7) objH).get("items");
        yg7 yg7Var = obj2 instanceof yg7 ? (yg7) obj2 : null;
        m8b m8bVar = this.b;
        if (yg7Var == null) {
            m8bVar.g("Gift card list response missing items: tab=" + wa6Var.a());
            return pu4.a;
        }
        List list = yg7Var.a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GiftCardItem giftCardItemC = c((nh7) it.next());
            if (giftCardItemC != null) {
                arrayList.add(giftCardItemC);
            }
        }
        int size = list.size() - arrayList.size();
        if (size > 0) {
            String strA = wa6Var.a();
            int size2 = list.size();
            int size3 = arrayList.size();
            StringBuilder sbP = ks0.p("Gift card list dropped invalid items: tab=", strA, ", raw=", size2, ", decoded=");
            sbP.append(size3);
            sbP.append(", dropped=");
            sbP.append(size);
            m8bVar.g(sbP.toString());
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(a26 a26Var, zn2 zn2Var) throws e86 {
        da6 da6Var;
        if (zn2Var instanceof da6) {
            da6Var = (da6) zn2Var;
            int i = da6Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                da6Var.label = i - Integer.MIN_VALUE;
            } else {
                da6Var = new da6(this, zn2Var);
            }
        } else {
            da6Var = new da6(this, zn2Var);
        }
        Object objD = da6Var.result;
        int i2 = da6Var.label;
        try {
            if (i2 == 0) {
                jzb.q(objD);
                da6Var.L$0 = null;
                da6Var.label = 1;
                objD = a26Var.d(da6Var);
                Object obj = bw2.a;
                if (objD == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(objD);
            }
            NullableServerResponse nullableServerResponse = (NullableServerResponse) objD;
            nh7 nh7Var = (nh7) nullableServerResponse.getData();
            if (nh7Var != null) {
                nh7 nh7Var2 = nullableServerResponse.getSuccess() ? nh7Var : null;
                if (nh7Var2 != null) {
                    return nh7Var2;
                }
            }
            int errorCode = nullableServerResponse.getErrorCode();
            String errorMessage = nullableServerResponse.getErrorMessage();
            errorMessage.getClass();
            throw new e86(200, errorCode, errorMessage, null, null, 248);
        } catch (qs6 e) {
            Throwable thB = nzc.b(e);
            jzc jzcVar = thB instanceof jzc ? (jzc) thB : null;
            if (jzcVar == null) {
                throw e;
            }
            int iA = e.a();
            int errorCode2 = jzcVar.getErrorCode();
            String message = jzcVar.getMessage();
            if (message == null) {
                message = "";
            }
            throw new e86(iA, errorCode2, message, null, null, 248);
        }
    }
}
