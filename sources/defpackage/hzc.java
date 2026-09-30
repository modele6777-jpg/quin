package defpackage;

import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hzc implements xt0 {
    public boolean a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public final Object f;

    public hzc() {
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = new HashMap();
    }

    @Override // defpackage.xt0
    public void a(ConnectionResult connectionResult) {
        ((ec6) this.f).X.post(new lwg(this, connectionResult, false, 20));
    }

    public void b(em7 em7Var, xn7 xn7Var) {
        em7Var.getClass();
        tn2 tn2Var = new tn2(xn7Var);
        HashMap map = (HashMap) this.b;
        em7Var.getClass();
        vn2 vn2Var = (vn2) map.get(em7Var);
        if (vn2Var != null && !vn2Var.equals(tn2Var)) {
            throw new dzc("Contextual serializer or serializer provider for " + em7Var + " already registered in this module");
        }
        map.put(em7Var, tn2Var);
        if (af1.R(em7Var).isInterface()) {
            this.a = true;
        }
    }

    public xn7 c(em7 em7Var, List list) {
        em7Var.getClass();
        list.getClass();
        vn2 vn2Var = (vn2) ((Map) this.b).get(em7Var);
        xn7 xn7VarA = vn2Var != null ? vn2Var.a(list) : null;
        if (xn7VarA instanceof xn7) {
            return xn7VarA;
        }
        return null;
    }

    public void d(em7 em7Var, em7 em7Var2, xn7 xn7Var) {
        Object next;
        em7 em7Var3;
        em7Var.getClass();
        em7Var2.getClass();
        xn7Var.getClass();
        String strA = xn7Var.e().a();
        HashMap map = (HashMap) this.c;
        Object map2 = map.get(em7Var);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(em7Var, map2);
        }
        Map map3 = (Map) map2;
        HashMap map4 = (HashMap) this.e;
        Object map5 = map4.get(em7Var);
        if (map5 == null) {
            map5 = new HashMap();
            map4.put(em7Var, map5);
        }
        Map map6 = (Map) map5;
        xn7 xn7Var2 = (xn7) map3.get(em7Var2);
        if (xn7Var2 != null && !xn7Var2.equals(xn7Var)) {
            throw new dzc("Serializer for " + em7Var2 + " already registered in the scope of " + em7Var);
        }
        xn7 xn7Var3 = (xn7) map6.get(strA);
        if (xn7Var3 == null || xn7Var3.equals(xn7Var)) {
            map3.put(em7Var2, xn7Var);
            map6.put(strA, xn7Var);
            return;
        }
        Iterator it = ((Iterable) s72.m0(map3.entrySet()).b).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Map.Entry) next).getValue() != xn7Var3);
        Map.Entry entry = (Map.Entry) next;
        if (entry == null || (em7Var3 = (em7) entry.getKey()) == null) {
            cva.w(strA, " is registered in the module but no Kotlin class is associated with it.", "Name ");
            return;
        }
        throw new IllegalArgumentException("Multiple polymorphic serializers in a scope of '" + em7Var + "' have the same serial name '" + strA + "': " + xn7Var + " for '" + em7Var2 + "' and " + xn7Var3 + " for '" + em7Var3 + '\'');
    }

    public void e(em7 em7Var, a26 a26Var) {
        em7Var.getClass();
        HashMap map = (HashMap) this.f;
        a26 a26Var2 = (a26) map.get(em7Var);
        if (a26Var2 == null || a26Var2.equals(a26Var)) {
            map.put(em7Var, a26Var);
        } else {
            s8f.k("Default deserializers provider for ", em7Var, " is already registered: ", a26Var2);
        }
    }

    public void f(ConnectionResult connectionResult) {
        rhg rhgVar = (rhg) ((ec6) this.f).x.get((b70) this.c);
        if (rhgVar != null) {
            rhgVar.n(connectionResult);
        }
    }

    public hzc(Map map, Map map2, Map map3, Map map4, Map map5, boolean z) {
        this.b = map;
        this.c = map2;
        this.d = map3;
        this.e = map4;
        this.f = map5;
        this.a = z;
    }

    public hzc(int i, float f, yx9 yx9Var) {
        this.b = yx9Var;
        this.c = new sz9(i);
        this.d = new qz9(f);
        this.f = new wz7(i, 30, 100);
    }

    public hzc(ec6 ec6Var, xb6 xb6Var, b70 b70Var) {
        Objects.requireNonNull(ec6Var);
        this.f = ec6Var;
        this.d = null;
        this.e = null;
        this.a = false;
        this.b = xb6Var;
        this.c = b70Var;
    }
}
