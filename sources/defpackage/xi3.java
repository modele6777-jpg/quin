package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xi3 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ xi3(t9e t9eVar, s9e s9eVar, ArrayList arrayList, LinkedHashMap linkedHashMap, List list, ArrayList arrayList2) {
        this.a = 5;
        this.c = t9eVar;
        this.d = s9eVar;
        this.e = arrayList;
        this.f = linkedHashMap;
        this.b = list;
        this.g = arrayList2;
    }

    @Override // defpackage.x16
    public final Object invoke() throws Throwable {
        f6d f6dVarA;
        int i = this.a;
        int i2 = 1;
        int i3 = 16;
        p05 p05Var = p05.a;
        int i4 = 0;
        wef wefVar = wef.a;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                List list = (List) obj6;
                cs3 cs3Var = (cs3) obj4;
                List list2 = (List) obj5;
                Map map = (Map) obj3;
                a26 a26Var = (a26) obj2;
                n26 n26Var = (n26) obj;
                if (!list.isEmpty()) {
                    TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) list.get(((sz9) cs3Var.d.c).j() % list.size());
                    pl3 pl3VarS = xj3.s(tarotSkinIdentify, list2, map);
                    if (pl3VarS == pl3.a) {
                        a26Var.d(tarotSkinIdentify);
                    } else {
                        n26Var.m(tarotSkinIdentify, "tap", Boolean.valueOf(pl3VarS == pl3.c));
                    }
                }
                return wefVar;
            case 1:
                ((qz9) ((n69) obj6)).k(0.0f);
                ((sz9) ((s69) obj5)).k(-1);
                ((e89) obj4).setValue(new hl9(0L));
                ((sz9) ((s69) obj3)).k(-1);
                ((sz9) ((s69) obj2)).k(0);
                ((e89) obj).setValue(null);
                return wefVar;
            case 2:
                Context context = (Context) obj6;
                aw2 aw2Var = (aw2) obj5;
                e89 e89Var = (e89) obj4;
                e89 e89Var2 = (e89) obj3;
                t7 t7Var = (t7) obj2;
                e89 e89Var3 = (e89) obj;
                if (xo1.o(context)) {
                    e89Var2.setValue(Boolean.TRUE);
                    e89Var.setValue("Running EXIF write test...");
                    ynb.V(aw2Var, null, null, new x35(context, t7Var, e89Var, e89Var3, e89Var2, null), 3);
                } else {
                    e89Var.setValue("❌ Storage permission not granted\nPlease grant permission and try again");
                }
                return wefVar;
            case 3:
                Context context2 = (Context) obj6;
                g6d g6dVar = (g6d) obj5;
                yx9 yx9Var = (yx9) obj4;
                aw2 aw2Var2 = (aw2) obj3;
                String str = (String) obj2;
                t7 t7Var2 = (t7) obj;
                x1f x1fVar = x1f.a;
                x1f.k(new r05("card_share"), new j38(yx9Var, i4), 2);
                if (xo1.o(context2) && (f6dVarA = g6dVar.a(Integer.valueOf(((sz9) yx9Var.d.c).j()))) != null) {
                    ynb.V(aw2Var2, null, null, new n38(str, t7Var2, f6dVarA, context2, null), 3);
                }
                return wefVar;
            case 4:
                pcc pccVar = (pcc) obj6;
                odc odcVar = (odc) obj5;
                ucc uccVar = (ucc) obj4;
                String str2 = (String) obj3;
                Object[] objArr = (Object[]) obj;
                if (pccVar.b != uccVar) {
                    pccVar.b = uccVar;
                    i4 = 1;
                }
                if (pa7.t(pccVar.c, str2)) {
                    i2 = i4;
                } else {
                    pccVar.c = str2;
                }
                pccVar.a = odcVar;
                pccVar.d = obj2;
                pccVar.e = objArr;
                tcc tccVar = pccVar.f;
                if (tccVar != null && i2 != 0) {
                    ((gg7) tccVar).z();
                    pccVar.f = null;
                    pccVar.b();
                }
                return wefVar;
            case 5:
                return Boolean.valueOf(((t9e) obj5).a((s9e) obj4, (ArrayList) obj3, (LinkedHashMap) obj2, (List) obj6, (ArrayList) obj));
            case 6:
                String str3 = (String) obj5;
                x16 x16Var = (x16) obj;
                ksf ksfVar = new ksf(23);
                x1f x1fVar2 = x1f.a;
                x1f.k(p05Var, new b92("go_to_homescreen", (String) obj6, 2, str3, ksfVar, 5), 2);
                h5g h5gVar = h5g.a;
                h5g.g((r4g) obj4, w4g.WidgetOnboarding, str3);
                ynb.V((aw2) obj3, null, null, new l4g(null, x16Var, (ted) obj2), 3);
                return wefVar;
            case 7:
                String str4 = (String) obj6;
                aw2 aw2Var3 = (aw2) obj5;
                e89 e89Var4 = (e89) obj4;
                ted tedVar = (ted) obj3;
                x16 x16Var2 = (x16) obj2;
                x16 x16Var3 = (x16) obj;
                alc alcVar = new alc(v2c.k(e89Var4) ? "optout" : "tap_close", i3);
                x1f x1fVar3 = x1f.a;
                x1f.k(p05Var, new b92("close", str4, 1, (Object) null, alcVar, 5), 2);
                ynb.V(aw2Var3, null, null, new p4g(tedVar, x16Var2, x16Var3, e89Var4, null), 3);
                return wefVar;
            default:
                String str5 = (String) obj6;
                String str6 = (String) obj4;
                aw2 aw2Var4 = (aw2) obj3;
                ted tedVar2 = (ted) obj2;
                x16 x16Var4 = (x16) obj;
                alc alcVar2 = new alc(((Boolean) ((x16) obj5).invoke()).booleanValue() ? "swipe_down" : "tap_scrim", i3);
                x1f x1fVar4 = x1f.a;
                x1f.k(p05Var, new b92("close", str5, 2, str6, alcVar2, 5), 2);
                ynb.V(aw2Var4, null, null, new n4g(null, x16Var4, tedVar2), 3);
                return wefVar;
        }
    }

    public /* synthetic */ xi3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    public /* synthetic */ xi3(List list, cs3 cs3Var, List list2, Map map, a26 a26Var, n26 n26Var) {
        this.a = 0;
        this.b = list;
        this.d = cs3Var;
        this.c = list2;
        this.e = map;
        this.f = a26Var;
        this.g = n26Var;
    }
}
