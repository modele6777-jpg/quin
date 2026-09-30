package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qh6 extends e1 {
    public final xn7 a;
    public final xn7 b;
    public final /* synthetic */ int c;
    public final ph6 d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qh6(xn7 xn7Var, xn7 xn7Var2, int i) {
        this(xn7Var, xn7Var2, (byte) 0);
        this.c = i;
        xn7Var.getClass();
        xn7Var2.getClass();
        switch (i) {
            case 1:
                this(xn7Var, xn7Var2, (byte) 0);
                nyc nycVarE = xn7Var.e();
                nyc nycVarE2 = xn7Var2.e();
                nycVarE.getClass();
                nycVarE2.getClass();
                this.d = new ph6("kotlin.collections.LinkedHashMap", nycVarE, nycVarE2);
                break;
            default:
                nyc nycVarE3 = xn7Var.e();
                nyc nycVarE4 = xn7Var2.e();
                nycVarE3.getClass();
                nycVarE4.getClass();
                this.d = new ph6("kotlin.collections.HashMap", nycVarE3, nycVarE4);
                break;
        }
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        i(obj);
        nyc nycVarE = e();
        nycVarE.getClass();
        ag2 ag2VarC = ev4Var.c(nycVarE);
        Iterator itH = h(obj);
        int i = 0;
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            ag2VarC.p(e(), i, this.a, key);
            i += 2;
            ag2VarC.p(e(), i2, this.b, value);
        }
        ag2VarC.b(nycVarE);
    }

    @Override // defpackage.xn7
    public final nyc e() {
        int i = this.c;
        return this.d;
    }

    @Override // defpackage.e1
    public final Object f() {
        switch (this.c) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // defpackage.e1
    public final int g(Object obj) {
        int size;
        switch (this.c) {
            case 0:
                HashMap map = (HashMap) obj;
                map.getClass();
                size = map.size();
                break;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                linkedHashMap.getClass();
                size = linkedHashMap.size();
                break;
        }
        return size * 2;
    }

    @Override // defpackage.e1
    public final Iterator h(Object obj) {
        switch (this.c) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                return map.entrySet().iterator();
            default:
                Map map2 = (Map) obj;
                map2.getClass();
                return map2.entrySet().iterator();
        }
    }

    @Override // defpackage.e1
    public final int i(Object obj) {
        switch (this.c) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                return map.size();
            default:
                Map map2 = (Map) obj;
                map2.getClass();
                return map2.size();
        }
    }

    @Override // defpackage.e1
    public final void k(zf2 zf2Var, int i, Object obj) {
        Map map = (Map) obj;
        map.getClass();
        Object objS = zf2Var.s(e(), i, this.a, null);
        int iJ = zf2Var.j(e());
        if (iJ != i + 1) {
            qc0.o(ks0.k("Value must follow key in a map, index for key: ", i, ", returned index for value: ", iJ));
            return;
        }
        boolean zContainsKey = map.containsKey(objS);
        xn7 xn7Var = this.b;
        map.put(objS, (!zContainsKey || (xn7Var.e().g() instanceof fua)) ? zf2Var.s(e(), iJ, xn7Var, null) : zf2Var.s(e(), iJ, xn7Var, bm8.B(map, objS)));
    }

    @Override // defpackage.e1
    public final Object l(Object obj) {
        switch (this.c) {
            case 0:
                throw null;
            default:
                throw null;
        }
    }

    @Override // defpackage.e1
    public final Object m(Object obj) {
        switch (this.c) {
            case 0:
                HashMap map = (HashMap) obj;
                map.getClass();
                return map;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                linkedHashMap.getClass();
                return linkedHashMap;
        }
    }

    public qh6(xn7 xn7Var, xn7 xn7Var2, byte b) {
        this.a = xn7Var;
        this.b = xn7Var2;
    }
}
