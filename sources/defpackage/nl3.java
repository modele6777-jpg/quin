package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nl3 extends gbe implements q26 {
    int I$0;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    /* synthetic */ Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    boolean Z$0;
    int label;
    final /* synthetic */ ol3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nl3(ol3 ol3Var, xn2 xn2Var) {
        super(6, xn2Var);
        this.this$0 = ol3Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        boolean zBooleanValue;
        zj3 zj3VarF;
        Object objB;
        List list;
        int i;
        boolean z;
        TarotSkinIdentify tarotSkinIdentify;
        int size;
        boolean z2;
        gmd gmdVar;
        yof yofVar = (yof) this.L$0;
        Map map = (Map) this.L$1;
        ck3 ck3Var = (ck3) this.L$2;
        mfc mfcVar = (mfc) this.L$3;
        sw8 sw8Var = (sw8) this.L$4;
        int i2 = this.label;
        gmd gmdVar2 = null;
        if (i2 == 0) {
            jzb.q(obj);
            hw8 hw8Var = ck3Var.c;
            if (hw8Var == null) {
                return new al3();
            }
            ol3 ol3Var = this.this$0;
            Boolean bool = ol3Var.X;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = ol3Var.z && hw8Var.a.a();
                this.this$0.X = Boolean.valueOf(zBooleanValue);
            }
            zj3VarF = i7h.F(hw8Var, map, sw8Var);
            int i3 = (ck3Var.d && zj3VarF.a()) ? 1 : 0;
            xke xkeVar = TarotSkinIdentify.Companion;
            n2f n2fVar = yofVar.g;
            xkeVar.getClass();
            TarotSkinIdentify tarotSkinIdentifyA = xke.a(n2fVar);
            List list2 = yofVar.f;
            wc8 wc8Var = this.this$0.e.d;
            this.L$0 = null;
            this.L$1 = map;
            this.L$2 = ck3Var;
            this.L$3 = mfcVar;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = zj3VarF;
            this.L$7 = tarotSkinIdentifyA;
            this.L$8 = list2;
            this.Z$0 = zBooleanValue;
            this.I$0 = i3;
            this.label = 1;
            objB = tm7.B(wc8Var, this);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
            list = list2;
            i = i3;
            z = zBooleanValue;
            tarotSkinIdentify = tarotSkinIdentifyA;
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            z = this.Z$0;
            list = (List) this.L$8;
            tarotSkinIdentify = (TarotSkinIdentify) this.L$7;
            zj3VarF = (zj3) this.L$6;
            jzb.q(obj);
            objB = obj;
        }
        Map map2 = ((lb8) objB).t;
        List<TarotSkinIdentify> listC = r8c.c(mfcVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (TarotSkinIdentify tarotSkinIdentify2 : listC) {
            if (r8c.k(tarotSkinIdentify2) || list.contains(tarotSkinIdentify2.getKey())) {
                int i4 = i;
                hmd hmdVar = (hmd) map.get(tarotSkinIdentify2);
                if (hmdVar == null || (gmdVar = hmdVar.a) == null) {
                    gmdVar = tarotSkinIdentify2.getRequiresDownload() ? gmd.b : gmd.a;
                }
                if (!tarotSkinIdentify2.getRequiresDownload() || gmdVar == gmd.e) {
                    arrayList.add(new ak3(tarotSkinIdentify2, gmdVar, hmdVar != null ? hmdVar.b : 0.0f, 2));
                } else {
                    arrayList2.add(new ak3(tarotSkinIdentify2, gmdVar, hmdVar != null ? hmdVar.b : 0.0f, 2));
                }
                i = i4;
                gmdVar2 = null;
            } else {
                arrayList3.add(new ak3(tarotSkinIdentify2, gmdVar2, 0.0f, 12));
                i = i;
            }
        }
        int i5 = i;
        TarotSkinIdentify tarotSkinIdentify3 = ck3Var.b;
        TarotSkinIdentify tarotSkinIdentify4 = (tarotSkinIdentify3 == null || !(r8c.k(tarotSkinIdentify3) || list.contains(tarotSkinIdentify3.getKey()))) ? ck3Var.a : tarotSkinIdentify3;
        List listQ0 = s72.Q0(s72.Q0(s72.b1(arrayList, new zd0(4, new zd0(5, new g63(1, tarotSkinIdentify), map2), list)), s72.b1(arrayList2, new h63(list, 1))), arrayList3);
        if (!z) {
            listQ0 = s72.b1(listQ0, new g63(2, tarotSkinIdentify));
        }
        if (z) {
            z2 = true;
            size = 0;
        } else {
            size = listQ0.size();
            z2 = true;
            if (1 <= size) {
                size = 1;
            }
        }
        c78 c78VarW = t72.w();
        c78VarW.addAll(s72.c1(listQ0, size));
        c78VarW.add(zj3VarF);
        c78VarW.addAll(s72.r0(listQ0, size));
        c78 c78VarN = c78VarW.n();
        TarotSkinIdentify tarotSkinIdentify5 = tarotSkinIdentify4 == null ? tarotSkinIdentify : tarotSkinIdentify4;
        if (tarotSkinIdentify3 != null) {
            tarotSkinIdentify = tarotSkinIdentify3;
        } else if (tarotSkinIdentify4 != null) {
            tarotSkinIdentify = tarotSkinIdentify4;
        }
        if (i5 == 0) {
            Iterator it = listQ0.iterator();
            int i6 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i6 = -1;
                    break;
                }
                if (((ak3) it.next()).a == tarotSkinIdentify) {
                    break;
                }
                i6++;
            }
            if (i6 < 0) {
                i6 = 0;
            }
            size = i6 >= size ? i6 + 1 : i6;
        }
        return new al3(c78VarN, size, tarotSkinIdentify5, i5 != 0 ? z2 : false);
    }

    @Override // defpackage.q26
    public final Object w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        nl3 nl3Var = new nl3(this.this$0, (xn2) obj6);
        nl3Var.L$0 = (yof) obj;
        nl3Var.L$1 = (Map) obj2;
        nl3Var.L$2 = (ck3) obj3;
        nl3Var.L$3 = (mfc) obj4;
        nl3Var.L$4 = (sw8) obj5;
        return nl3Var.r(wef.a);
    }
}
