package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ive implements xj5 {
    public final /* synthetic */ xj5 a;

    public ive(xj5 xj5Var) {
        this.a = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        hve hveVar;
        Object next;
        if (xn2Var instanceof hve) {
            hveVar = (hve) xn2Var;
            int i = hveVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                hveVar.label = i - Integer.MIN_VALUE;
            } else {
                hveVar = new hve(this, xn2Var);
            }
        } else {
            hveVar = new hve(this, xn2Var);
        }
        Object obj2 = hveVar.result;
        int i2 = hveVar.label;
        if (i2 == 0) {
            jzb.q(obj2);
            yof yofVar = (yof) obj;
            Iterator<E> it = TarotSkinIdentify.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((TarotSkinIdentify) next).getKey() != yofVar.g);
            TarotSkinIdentify tarotSkinIdentifyD = (TarotSkinIdentify) next;
            if (tarotSkinIdentifyD == null) {
                tarotSkinIdentifyD = r8c.d();
            }
            hveVar.L$0 = null;
            hveVar.L$1 = null;
            hveVar.L$2 = null;
            hveVar.L$3 = null;
            hveVar.label = 1;
            Object objA = this.a.a(tarotSkinIdentifyD, hveVar);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj2);
        }
        return wef.a;
    }
}
