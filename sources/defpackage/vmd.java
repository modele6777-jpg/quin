package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vmd extends gbe implements o26 {
    final /* synthetic */ boolean $includeFreeSkin;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vmd(boolean z, xn2 xn2Var) {
        super(4, xn2Var);
        this.$includeFreeSkin = z;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object next;
        List list = (List) this.L$0;
        List list2 = (List) this.L$1;
        mfc mfcVar = (mfc) this.L$2;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        List<TarotSkinIdentify> listC = r8c.c(mfcVar);
        if (!this.$includeFreeSkin) {
            listC = s72.r0(listC, 1);
        }
        list.getClass();
        list2.getClass();
        ArrayList arrayList = new ArrayList(t72.u(listC, 10));
        for (TarotSkinIdentify tarotSkinIdentify : listC) {
            Iterator it = list2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((n07) next).g() != hfc.h(tarotSkinIdentify));
            arrayList.add(new mmd(tarotSkinIdentify, (n07) next, list.contains(tarotSkinIdentify.getKey()) || r8c.k(tarotSkinIdentify), gmd.a, 0.0f));
        }
        return new zke(list, arrayList);
    }

    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        vmd vmdVar = new vmd(this.$includeFreeSkin, (xn2) obj4);
        vmdVar.L$0 = (List) obj;
        vmdVar.L$1 = (List) obj2;
        vmdVar.L$2 = (mfc) obj3;
        return vmdVar.r(wef.a);
    }
}
