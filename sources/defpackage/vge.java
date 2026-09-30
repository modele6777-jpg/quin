package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vge extends gbe implements l26 {
    final /* synthetic */ a26 $consume;
    final /* synthetic */ Context $context;
    final /* synthetic */ TarotSkinIdentify $skin;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ wge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vge(wge wgeVar, a26 a26Var, Context context, TarotSkinIdentify tarotSkinIdentify, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = wgeVar;
        this.$consume = a26Var;
        this.$context = context;
        this.$skin = tarotSkinIdentify;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new vge(this.this$0, this.$consume, this.$context, this.$skin, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008c A[Catch: all -> 0x0019, TryCatch #1 {all -> 0x0019, blocks: (B:7:0x0015, B:22:0x007c, B:24:0x0082, B:25:0x0086, B:27:0x008c, B:29:0x0094, B:34:0x009d, B:35:0x00a1, B:37:0x00a7, B:39:0x00af, B:40:0x00b3, B:23:0x007e), top: B:47:0x0015, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0086 A[SYNTHETIC] */
    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        wge wgeVar;
        d99 d99Var;
        Context context;
        a26 a26Var;
        TarotSkinIdentify tarotSkinIdentify;
        Throwable th;
        d99 d99Var2;
        a26 a26Var2;
        List<Bitmap> list;
        int i = this.label;
        bw2 bw2Var = bw2.a;
        try {
            if (i == 0) {
                jzb.q(obj);
                wgeVar = this.this$0;
                d99Var = wgeVar.c;
                a26 a26Var3 = this.$consume;
                Context context2 = this.$context;
                TarotSkinIdentify tarotSkinIdentify2 = this.$skin;
                this.L$0 = d99Var;
                this.L$1 = wgeVar;
                this.L$2 = a26Var3;
                this.L$3 = context2;
                this.L$4 = tarotSkinIdentify2;
                this.label = 1;
                if (d99Var.b(this) != bw2Var) {
                    context = context2;
                    a26Var = a26Var3;
                    tarotSkinIdentify = tarotSkinIdentify2;
                }
                return bw2Var;
            }
            if (i != 1) {
                if (i != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a26Var2 = (a26) this.L$1;
                d99Var2 = (d99) this.L$0;
                try {
                    jzb.q(obj);
                    list = (List) obj;
                    try {
                        Object objD = a26Var2.d(list);
                        for (Bitmap bitmap : list) {
                            if (bitmap != null) {
                                bitmap.recycle();
                            }
                        }
                        d99Var2.h(null);
                        return objD;
                    } catch (Throwable th2) {
                        for (Bitmap bitmap2 : list) {
                            if (bitmap2 != null) {
                                bitmap2.recycle();
                            }
                        }
                        throw th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    d99Var2.h(null);
                    throw th;
                }
            }
            tarotSkinIdentify = (TarotSkinIdentify) this.L$4;
            context = (Context) this.L$3;
            a26Var = (a26) this.L$2;
            wgeVar = (wge) this.L$1;
            d99 d99Var3 = (d99) this.L$0;
            jzb.q(obj);
            d99Var = d99Var3;
            sv2 sv2Var = wgeVar.b;
            uge ugeVar = new uge(wgeVar, context, tarotSkinIdentify, null);
            this.L$0 = d99Var;
            this.L$1 = a26Var;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 2;
            Object objP0 = ynb.p0(sv2Var, ugeVar, this);
            if (objP0 != bw2Var) {
                d99 d99Var4 = d99Var;
                obj = objP0;
                d99Var2 = d99Var4;
                a26Var2 = a26Var;
                list = (List) obj;
                Object objD2 = a26Var2.d(list);
                while (r11.hasNext()) {
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
                d99Var2.h(null);
                return objD2;
            }
            return bw2Var;
        } catch (Throwable th4) {
            d99 d99Var5 = d99Var;
            th = th4;
            d99Var2 = d99Var5;
            d99Var2.h(null);
            throw th;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((vge) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
