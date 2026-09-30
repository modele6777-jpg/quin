package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import java.time.Instant;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cc4 {
    public static final rob a = new rob("[\\t ]*[\\r\\n]+[\\t ]*");

    /* JADX WARN: Multi-variable type inference failed */
    public static final zb4 a(lc4 lc4Var, a26 a26Var) {
        Object dzbVar;
        List list;
        lc4Var.getClass();
        String str = lc4Var.a;
        Instant instant = lc4Var.b;
        List list2 = lc4Var.p;
        pu4 pu4Var = pu4.a;
        if (list2 == null) {
            list2 = pu4Var;
        }
        String str2 = lc4Var.e;
        String strH = a.h(lc4Var.n, " ");
        tdb tdbVar = lc4Var.o;
        w57 w57VarY = vpf.Y(instant);
        Instant instant2 = lc4Var.d;
        Object obj = null;
        w57 w57VarY2 = instant2 != null ? vpf.Y(instant2) : null;
        boolean z = list2 instanceof ld4;
        ld4 ld4Var = z ? (ld4) list2 : null;
        List list3 = (ld4Var == null || (list = ld4Var.a) == null) ? list2 : list;
        ld4 ld4Var2 = z ? (ld4) list2 : null;
        List list4 = ld4Var2 != null ? ld4Var2.b : null;
        List list5 = list4 == null ? pu4Var : list4;
        ld4 ld4Var3 = z ? (ld4) list2 : null;
        Map map = ld4Var3 != null ? ld4Var3.c : null;
        if (map == null) {
            map = qu4.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(bm8.F(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), eb3.Q((String) entry.getValue()));
        }
        fc4 fc4Var = new fc4(str, instant);
        String str3 = lc4Var.k;
        if (str3 != null) {
            try {
                xke xkeVar = TarotSkinIdentify.Companion;
                n2f n2fVarValueOf = n2f.valueOf(str3);
                xkeVar.getClass();
                dzbVar = xke.a(n2fVarValueOf);
            } catch (Throwable th) {
                dzbVar = new dzb(th);
            }
            obj = (TarotSkinIdentify) (dzbVar instanceof dzb ? null : dzbVar);
        }
        return new zb4(str, str2, strH, tdbVar, w57VarY, w57VarY2, list3, list5, new er2(new ec4(lc4Var.a, instant, lc4Var.c, lc4Var.e, lc4Var.f, lc4Var.d, lc4Var.g, lc4Var.h, lc4Var.i, lc4Var.j, lc4Var.k, null, lc4Var.l, lc4Var.m, lc4Var.q), (wj5) a26Var.d(str)), fc4Var, obj, linkedHashMap);
    }

    public static final ac4 b(x6b x6bVar) {
        Object next;
        x6bVar.getClass();
        Instant instant = x6bVar.g;
        Iterator<E> it = TarotCardType.getEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!pa7.t(((TarotCardType) next).getCardKey(), x6bVar.b));
        TarotCardType tarotCardType = (TarotCardType) next;
        return new ac4(x6bVar.a, x6bVar.b, tarotCardType != null ? tarotCardType.getTitleRes() : 0, x6bVar.c, x6bVar.d, vpf.Y(instant), vpf.Y(instant));
    }
}
