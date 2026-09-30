package defpackage;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kic extends k4 {
    public final em7 a;
    public final List b;
    public final lw7 c;
    public final Map d;
    public final LinkedHashMap e;

    public kic(String str, em7 em7Var, em7[] em7VarArr, xn7[] xn7VarArr) {
        em7Var.getClass();
        this.a = em7Var;
        this.b = pu4.a;
        this.c = eb3.N(z18.b, new ek9(28, str, this));
        if (em7VarArr.length != xn7VarArr.length) {
            yg5.q(em7Var.r(), " should be marked @Serializable", "All subclasses of sealed class ");
            throw null;
        }
        Map mapW = bm8.W(qd0.K0(em7VarArr, xn7VarArr));
        this.d = mapW;
        Set<Map.Entry> setEntrySet = mapW.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : setEntrySet) {
            String strA = ((xn7) entry.getValue()).e().a();
            Object obj = linkedHashMap.get(strA);
            if (obj == null) {
                linkedHashMap.containsKey(strA);
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                StringBuilder sb = new StringBuilder("Multiple sealed subclasses of '");
                sb.append(this.a);
                sb.append("' have the same serial name '");
                sb.append(strA);
                sb.append("': '");
                sb.append(entry2.getKey());
                Object key = entry.getKey();
                sb.append("', '");
                sb.append(key);
                sb.append('\'');
                throw new IllegalStateException(sb.toString().toString());
            }
            linkedHashMap.put(strA, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(bm8.F(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (xn7) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.e = linkedHashMap2;
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return (nyc) this.c.getValue();
    }

    @Override // defpackage.k4
    public final xn7 f(zf2 zf2Var, String str) {
        xn7 xn7Var = (xn7) this.e.get(str);
        return xn7Var != null ? xn7Var : super.f(zf2Var, str);
    }

    @Override // defpackage.k4
    public final xn7 g(ev4 ev4Var, Object obj) {
        obj.getClass();
        xn7 xn7Var = (xn7) this.d.get(job.a.b(obj.getClass()));
        xn7 xn7VarG = xn7Var != null ? xn7Var : super.g(ev4Var, obj);
        if (xn7VarG != null) {
            return xn7VarG;
        }
        return null;
    }

    @Override // defpackage.k4
    public final em7 h() {
        return this.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kic(String str, em7 em7Var, em7[] em7VarArr, xn7[] xn7VarArr, Annotation[] annotationArr) {
        this(str, em7Var, em7VarArr, xn7VarArr);
        em7Var.getClass();
        List listAsList = Arrays.asList(annotationArr);
        listAsList.getClass();
        this.b = listAsList;
    }
}
