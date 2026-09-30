package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fge extends gbe implements l26 {
    final /* synthetic */ List<Bitmap> $bitmaps;
    final /* synthetic */ ege $session;
    final /* synthetic */ TarotSkinIdentify $skin;
    int label;
    final /* synthetic */ lge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fge(lge lgeVar, ege egeVar, TarotSkinIdentify tarotSkinIdentify, List list, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = lgeVar;
        this.$session = egeVar;
        this.$skin = tarotSkinIdentify;
        this.$bitmaps = list;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new fge(this.this$0, this.$session, this.$skin, this.$bitmaps, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        lge lgeVar = this.this$0;
        boolean z = lgeVar.v;
        wef wefVar = wef.a;
        if (!z && lgeVar.k == this.$session) {
            ArrayList arrayList = lgeVar.m;
            TarotSkinIdentify tarotSkinIdentify = this.$skin;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    age ageVar = ((dge) it.next()).d;
                    if ((ageVar != null ? ageVar.a : null) == tarotSkinIdentify) {
                        List listB = (List) this.this$0.r.get(this.$skin);
                        if (listB == null) {
                            listB = xge.b(this.this$0.b, this.$bitmaps);
                            lge lgeVar2 = this.this$0;
                            TarotSkinIdentify tarotSkinIdentify2 = this.$skin;
                            LinkedHashMap linkedHashMap = lgeVar2.r;
                            if (linkedHashMap.size() >= 3) {
                                ArrayList arrayList2 = lgeVar2.m;
                                HashSet hashSet = new HashSet();
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    age ageVar2 = ((dge) it2.next()).d;
                                    TarotSkinIdentify tarotSkinIdentify3 = ageVar2 != null ? ageVar2.a : null;
                                    if (tarotSkinIdentify3 != null) {
                                        hashSet.add(tarotSkinIdentify3);
                                    }
                                }
                                Set setKeySet = linkedHashMap.keySet();
                                setKeySet.getClass();
                                lgeVar2.e(mge.a(s72.j1(setKeySet), hashSet, 2));
                            }
                            linkedHashMap.put(tarotSkinIdentify2, listB);
                        }
                        lge lgeVar3 = this.this$0;
                        ArrayList<dge> arrayList3 = lgeVar3.m;
                        TarotSkinIdentify tarotSkinIdentify4 = this.$skin;
                        for (dge dgeVar : arrayList3) {
                            age ageVar3 = dgeVar.d;
                            if ((ageVar3 != null ? ageVar3.a : null) == tarotSkinIdentify4) {
                                lgeVar3.a(dgeVar, listB);
                            }
                        }
                        this.this$0.b.w();
                        this.$session.c.remove(this.$skin);
                        lge lgeVar4 = this.this$0;
                        ArrayList arrayList4 = lgeVar4.m;
                        HashSet hashSet2 = new HashSet();
                        Iterator it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            age ageVar4 = ((dge) it3.next()).d;
                            TarotSkinIdentify tarotSkinIdentify5 = ageVar4 != null ? ageVar4.a : null;
                            if (tarotSkinIdentify5 != null) {
                                hashSet2.add(tarotSkinIdentify5);
                            }
                        }
                        Set setKeySet2 = lgeVar4.r.keySet();
                        setKeySet2.getClass();
                        List list = mge.a;
                        if (!hashSet2.isEmpty()) {
                            Iterator it4 = hashSet2.iterator();
                            while (it4.hasNext()) {
                                if (!setKeySet2.contains(it4.next())) {
                                    lgeVar4.h();
                                    return wefVar;
                                }
                            }
                        }
                        lgeVar4.b();
                        break;
                    }
                }
            }
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        fge fgeVar = (fge) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        fgeVar.r(wefVar);
        return wefVar;
    }
}
