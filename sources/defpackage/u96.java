package defpackage;

import java.util.concurrent.CancellationException;
import tech.chatmind.api.giftcard.GiftCardSku;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u96 implements hf8 {
    public static final /* synthetic */ int c = 0;
    public final ea6 a;
    public final m8b b;

    public u96(ea6 ea6Var) {
        this.a = ea6Var;
        hf8.Q.getClass();
        this.b = ef8.a("GiftCardRepository");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0099  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00de  */
    /* JADX WARN: Code duplicated, block: B:35:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:46:0x0144  */
    /* JADX WARN: Code duplicated, block: B:48:0x0148  */
    /* JADX WARN: Code duplicated, block: B:51:0x0163  */
    /* JADX WARN: Code duplicated, block: B:53:0x016b  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0163 -> B:52:0x0167). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x016b -> B:54:0x0171). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(java.lang.String r25, int r26, long r27, defpackage.zn2 r29) {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u96.a(java.lang.String, int, long, zn2):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object b(GiftCardSku giftCardSku, String str, String str2, zn2 zn2Var) throws Exception {
        t96 t96Var;
        if (zn2Var instanceof t96) {
            t96Var = (t96) zn2Var;
            int i = t96Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                t96Var.label = i - Integer.MIN_VALUE;
            } else {
                t96Var = new t96(this, zn2Var);
            }
        } else {
            t96Var = new t96(this, zn2Var);
        }
        Object obj = t96Var.result;
        int i2 = t96Var.label;
        m8b m8bVar = this.b;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                m8bVar.e("Gift card draft requested: sku=" + giftCardSku + ", hasNickname=" + (!v4e.Q(str)) + ", hasBlessing=" + (!v4e.Q(str2)));
                ea6 ea6Var = this.a;
                t96Var.L$0 = giftCardSku;
                t96Var.L$1 = null;
                t96Var.L$2 = null;
                t96Var.label = 1;
                Object objA = ea6Var.a(giftCardSku, str, str2, t96Var);
                bw2 bw2Var = bw2.a;
                if (objA == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                giftCardSku = (GiftCardSku) t96Var.L$0;
                jzb.q(obj);
            }
            m8bVar.e("Gift card draft created: sku=" + giftCardSku);
            return wef.a;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            m8bVar.c("Gift card draft failed: sku=" + giftCardSku, e2);
            throw e2;
        }
    }

    @Override // defpackage.hf8
    public final m8b d() {
        throw null;
    }
}
