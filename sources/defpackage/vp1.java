package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tech.chatmind.api.ArcanaGroup;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vp1 implements xj5 {
    public final /* synthetic */ xj5 a;
    public final /* synthetic */ xp1 b;
    public final /* synthetic */ int c;

    public vp1(xj5 xj5Var, xp1 xp1Var, int i) {
        this.a = xj5Var;
        this.b = xp1Var;
        this.c = i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        up1 up1Var;
        Set setO1;
        List list;
        Iterator it;
        zhe zheVarA;
        int i;
        if (xn2Var instanceof up1) {
            up1Var = (up1) xn2Var;
            int i2 = up1Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                up1Var.label = i2 - Integer.MIN_VALUE;
            } else {
                up1Var = new up1(this, xn2Var);
            }
        } else {
            up1Var = new up1(this, xn2Var);
        }
        Object obj2 = up1Var.result;
        int i3 = up1Var.label;
        if (i3 == 0) {
            jzb.q(obj2);
            List list2 = (List) obj;
            xp1 xp1Var = this.b;
            LinkedHashMap linkedHashMap = xp1Var.f;
            boolean z = xp1Var.b;
            int i4 = 10;
            int iF = bm8.F(t72.u(list2, 10));
            if (iF < 16) {
                iF = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iF);
            for (Object obj3 : list2) {
                linkedHashMap2.put(((TarotCardChoice) obj3).getCard(), obj3);
            }
            if (z) {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    ArcanaGroup arcanaGroup = (ArcanaGroup) xp1Var.e.get(((TarotCardChoice) it2.next()).getCard());
                    if (arcanaGroup != null) {
                        arrayList.add(arcanaGroup);
                    }
                }
                setO1 = s72.o1(arrayList);
            } else {
                setO1 = xu4.a;
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(bm8.F(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object key = entry.getKey();
                ArcanaGroup arcanaGroup2 = (ArcanaGroup) entry.getKey();
                List list3 = (List) entry.getValue();
                ArrayList arrayList2 = new ArrayList(t72.u(list3, i4));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    zhe zheVar = (zhe) it3.next();
                    TarotCardType tarotCardType = zheVar.a;
                    boolean z2 = zheVar.d;
                    TarotCardChoice tarotCardChoice = (TarotCardChoice) linkedHashMap2.get(tarotCardType);
                    if (tarotCardChoice != null) {
                        boolean zIsReversed = tarotCardChoice.isReversed();
                        Iterator it4 = list2.iterator();
                        int i5 = 0;
                        while (true) {
                            if (!it4.hasNext()) {
                                list = list2;
                                it = it3;
                                i = -1;
                                break;
                            }
                            list = list2;
                            it = it3;
                            if (tarotCardChoice.getCard() == ((TarotCardChoice) it4.next()).getCard()) {
                                i = i5;
                                break;
                            }
                            i5++;
                            list2 = list;
                            it3 = it;
                        }
                        zheVarA = zhe.a(zheVar, i, zIsReversed, z2, 1);
                    } else {
                        list = list2;
                        it = it3;
                        zheVarA = zhe.a(zheVar, -1, false, z2 || (z && setO1.contains(arcanaGroup2)), 5);
                    }
                    arrayList2.add(zheVarA);
                    list2 = list;
                    it3 = it;
                }
                linkedHashMap3.put(key, arrayList2);
                i4 = 10;
            }
            eie eieVar = new eie(linkedHashMap3, list2.size() >= this.c);
            up1Var.L$0 = null;
            up1Var.L$1 = null;
            up1Var.L$2 = null;
            up1Var.L$3 = null;
            up1Var.label = 1;
            Object objA = this.a.a(eieVar, up1Var);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i3 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj2);
        }
        return wef.a;
    }
}
