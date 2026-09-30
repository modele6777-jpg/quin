package defpackage;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class dj7 extends h2 {
    public final ti7 f;
    public final nyc g;
    public int h;
    public boolean i;

    public dj7(wg7 wg7Var, ti7 ti7Var, String str, int i) {
        super(wg7Var, (i & 4) != 0 ? null : str);
        this.f = ti7Var;
        this.g = null;
    }

    @Override // defpackage.h2
    public nh7 F(String str) {
        str.getClass();
        return (nh7) bm8.B(T(), str);
    }

    @Override // defpackage.h2
    public String R(nyc nycVar, int i) {
        nycVar.getClass();
        wg7 wg7Var = this.c;
        pi7.d(wg7Var, nycVar);
        String strF = nycVar.f(i);
        if (this.e.h && !T().a.keySet().contains(strF)) {
            kb6 kb6Var = wg7Var.c;
            jf6 jf6Var = new jf6(12, nycVar, wg7Var);
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) kb6Var.b;
            Map map = (Map) concurrentHashMap.get(nycVar);
            Object obj = null;
            gec gecVar = pi7.a;
            Object objInvoke = map != null ? map.get(gecVar) : null;
            if (objInvoke == null) {
                objInvoke = null;
            }
            if (objInvoke == null) {
                objInvoke = jf6Var.invoke();
                Object concurrentHashMap2 = concurrentHashMap.get(nycVar);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(nycVar, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(gecVar, objInvoke);
            }
            Map map2 = (Map) objInvoke;
            for (Object obj2 : T().a.keySet()) {
                Integer num = (Integer) map2.get((String) obj2);
                if (num != null && num.intValue() == i) {
                    obj = obj2;
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                return str;
            }
        }
        return strF;
    }

    @Override // defpackage.h2
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public ti7 T() {
        return this.f;
    }

    public final boolean Z(nyc nycVar, int i) {
        boolean z = (this.c.a.d || nycVar.j(i) || !nycVar.i(i).c()) ? false : true;
        this.i = z;
        return z;
    }

    @Override // defpackage.h2, defpackage.zf2
    public void b(nyc nycVar) {
        Set setM;
        nycVar.getClass();
        wg7 wg7Var = this.c;
        if (pi7.c(wg7Var, nycVar) || (nycVar.g() instanceof zia)) {
            return;
        }
        pi7.d(wg7Var, nycVar);
        if (this.e.h) {
            Set setY = hkg.Y(nycVar);
            Map map = (Map) ((ConcurrentHashMap) wg7Var.c.b).get(nycVar);
            Object obj = map != null ? map.get(pi7.a) : null;
            if (obj == null) {
                obj = null;
            }
            Map map2 = (Map) obj;
            Set setKeySet = map2 != null ? map2.keySet() : null;
            if (setKeySet == null) {
                setKeySet = xu4.a;
            }
            setM = n3d.m(setY, setKeySet);
        } else {
            setM = hkg.Y(nycVar);
        }
        for (String str : T().a.keySet()) {
            if (!setM.contains(str) && !pa7.t(str, this.d)) {
                String strG = ks0.g('\'', "Encountered an unknown key '", str);
                String strV = V();
                String string = wg7Var.a.j ? kj0.n0(T().toString(), -1).toString() : null;
                throw new lh7(kj0.b0(strG, strV, "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.", -1, string), strG, strV, -1, string, "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.");
            }
        }
    }

    @Override // defpackage.h2, defpackage.om3
    public final zf2 c(nyc nycVar) {
        nycVar.getClass();
        nyc nycVar2 = this.g;
        if (nycVar != nycVar2) {
            return super.c(nycVar);
        }
        nh7 nh7VarG = G();
        String strA = nycVar2.a();
        boolean z = nh7VarG instanceof ti7;
        wg7 wg7Var = this.c;
        if (z) {
            return new dj7(wg7Var, (ti7) nh7VarG, this.d, nycVar2);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        kob kobVar = job.a;
        sb.append(kobVar.b(ti7.class).r());
        sb.append(", but had ");
        sb.append(kobVar.b(nh7VarG.getClass()).r());
        String strL = ks0.l(sb, " as the serialized body of ", strA);
        String strV = V();
        String string = wg7Var.a.j ? kj0.n0(nh7VarG.toString(), -1).toString() : null;
        throw new lh7(kj0.b0(strL, strV, null, -1, string), strL, strV, -1, string, null);
    }

    @Override // defpackage.zf2
    public int j(nyc nycVar) {
        nycVar.getClass();
        while (this.h < nycVar.e()) {
            int i = this.h;
            this.h = i + 1;
            String strS = S(nycVar, i);
            int i2 = this.h - 1;
            this.i = false;
            if (T().containsKey(strS) || Z(nycVar, i2)) {
                if (this.e.f) {
                    boolean zJ = nycVar.j(i2);
                    nyc nycVarI = nycVar.i(i2);
                    if (!zJ || nycVarI.c() || !(((nh7) T().get(strS)) instanceof qi7)) {
                        if (pa7.t(nycVarI.g(), ryc.c) && (!nycVarI.c() || !(((nh7) T().get(strS)) instanceof qi7))) {
                            nh7 nh7Var = (nh7) T().get(strS);
                            String strC = null;
                            yi7 yi7Var = nh7Var instanceof yi7 ? (yi7) nh7Var : null;
                            if (yi7Var != null) {
                                e37 e37Var = oh7.a;
                                if (!(yi7Var instanceof qi7)) {
                                    strC = yi7Var.c();
                                }
                            }
                            if (strC != null) {
                                wg7 wg7Var = this.c;
                                int iA = pi7.a(nycVarI, wg7Var, strC);
                                boolean z = !wg7Var.a.d && nycVarI.c();
                                if (iA != -3 || ((!zJ && !z) || Z(nycVar, i2))) {
                                }
                            }
                        }
                    }
                }
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.h2, defpackage.om3
    public final boolean x() {
        return !this.i && super.x();
    }

    public dj7(wg7 wg7Var, ti7 ti7Var, String str, nyc nycVar) {
        super(wg7Var, str);
        this.f = ti7Var;
        this.g = nycVar;
    }
}
