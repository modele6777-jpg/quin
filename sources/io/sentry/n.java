package io.sentry;

import android.database.CrossProcessCursor;
import defpackage.x16;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements e1 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public n(String str) {
        this.a = 3;
        k4 k4Var = k4.a;
        this.b = k4Var;
        this.c = str;
        this.d = new d(2, k4Var.o());
        o5.d().a("SQLite");
    }

    @Override // io.sentry.e1
    public j1 A() {
        j1 j1VarA = ((e1) this.d).A();
        if (!(j1VarA instanceof c3)) {
            return j1VarA;
        }
        j1 j1VarA2 = ((e1) this.c).A();
        return !(j1VarA2 instanceof c3) ? j1VarA2 : ((e1) this.b).A();
    }

    @Override // io.sentry.e1
    public Map B() {
        Map mapB = ((e1) this.b).B();
        Map mapB2 = ((e1) this.c).B();
        Map mapB3 = ((e1) this.d).B();
        boolean zIsEmpty = mapB.isEmpty();
        boolean zIsEmpty2 = mapB2.isEmpty();
        boolean zIsEmpty3 = mapB3.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            return (Map) a(mapB, mapB2, mapB3);
        }
        if (zIsEmpty2 && zIsEmpty3) {
            return mapB;
        }
        if (zIsEmpty && zIsEmpty3) {
            return mapB2;
        }
        if (zIsEmpty && zIsEmpty2) {
            return mapB3;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(mapB);
        concurrentHashMap.putAll(mapB2);
        concurrentHashMap.putAll(mapB3);
        return concurrentHashMap;
    }

    @Override // io.sentry.e1
    public List C() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(((e1) this.b).C());
        copyOnWriteArrayList.addAll(((e1) this.c).C());
        copyOnWriteArrayList.addAll(((e1) this.d).C());
        Collections.sort(copyOnWriteArrayList);
        return copyOnWriteArrayList;
    }

    @Override // io.sentry.e1
    public List D() {
        List listD = ((e1) this.b).D();
        List listD2 = ((e1) this.c).D();
        List listD3 = ((e1) this.d).D();
        boolean zIsEmpty = listD.isEmpty();
        boolean zIsEmpty2 = listD2.isEmpty();
        boolean zIsEmpty3 = listD3.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            return (List) a(listD, listD2, listD3);
        }
        if (zIsEmpty2 && zIsEmpty3) {
            return listD;
        }
        if (zIsEmpty && zIsEmpty3) {
            return listD2;
        }
        if (zIsEmpty && zIsEmpty2) {
            return listD3;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(listD);
        copyOnWriteArrayList.addAll(listD2);
        copyOnWriteArrayList.addAll(listD3);
        return copyOnWriteArrayList;
    }

    @Override // io.sentry.e1
    public void E(i5 i5Var) {
        ((e1) this.b).E(i5Var);
    }

    @Override // io.sentry.e1
    public io.sentry.protocol.e F() {
        e1 e1Var = (e1) this.b;
        return new l(e1Var.F(), ((e1) this.c).F(), ((e1) this.d).F(), e1Var.o().getDefaultScopeType());
    }

    @Override // io.sentry.e1
    public w3 G(b4 b4Var) {
        return e(null).G(b4Var);
    }

    @Override // io.sentry.e1
    public String H() {
        String strH = ((e1) this.d).H();
        if (strH != null) {
            return strH;
        }
        String strH2 = ((e1) this.c).H();
        return strH2 != null ? strH2 : ((e1) this.b).H();
    }

    @Override // io.sentry.e1
    public void I(d4 d4Var) {
        e(null).I(d4Var);
    }

    @Override // io.sentry.e1
    public void J(io.sentry.protocol.w wVar) {
        ((e1) this.b).J(wVar);
        ((e1) this.c).J(wVar);
        ((e1) this.d).J(wVar);
    }

    @Override // io.sentry.e1
    public void K(q1 q1Var) {
        e(null).K(q1Var);
    }

    @Override // io.sentry.e1
    public List L() {
        List listL = ((e1) this.d).L();
        if (!listL.isEmpty()) {
            return listL;
        }
        List listL2 = ((e1) this.c).L();
        return !listL2.isEmpty() ? listL2 : ((e1) this.b).L();
    }

    @Override // io.sentry.e1
    public io.sentry.protocol.i0 M() {
        io.sentry.protocol.i0 i0VarM = ((e1) this.d).M();
        if (i0VarM != null) {
            return i0VarM;
        }
        io.sentry.protocol.i0 i0VarM2 = ((e1) this.c).M();
        return i0VarM2 != null ? i0VarM2 : ((e1) this.b).M();
    }

    @Override // io.sentry.e1
    public List N() {
        return io.sentry.util.b.w((CopyOnWriteArrayList) C());
    }

    @Override // io.sentry.e1
    public String O() {
        String strO = ((e1) this.d).O();
        if (strO != null) {
            return strO;
        }
        String strO2 = ((e1) this.c).O();
        return strO2 != null ? strO2 : ((e1) this.b).O();
    }

    @Override // io.sentry.e1
    public void P(w3 w3Var) {
        e(null).P(w3Var);
    }

    public Object a(Object obj, Object obj2, Object obj3) {
        int i = m.a[((e1) this.b).o().getDefaultScopeType().ordinal()];
        if (i != 2) {
            return i != 3 ? obj3 : obj;
        }
        return obj2;
    }

    @Override // io.sentry.e1
    public o1 b() {
        o1 o1VarB = ((e1) this.d).b();
        if (o1VarB != null) {
            return o1VarB;
        }
        o1 o1VarB2 = ((e1) this.c).b();
        return o1VarB2 != null ? o1VarB2 : ((e1) this.b).b();
    }

    @Override // io.sentry.e1
    public void c(io.sentry.protocol.i0 i0Var) {
        e(null).c(i0Var);
    }

    @Override // io.sentry.e1
    public void clear() {
        e(null).clear();
    }

    @Override // io.sentry.e1
    public e1 clone() {
        return new n((e1) this.b, ((e1) this.c).clone(), ((e1) this.d).clone(), 0);
    }

    @Override // io.sentry.e1
    public void d(Throwable th, d7 d7Var, String str) {
        ((e1) this.b).d(th, d7Var, str);
    }

    public e1 e(i4 i4Var) {
        e1 e1Var = (e1) this.c;
        e1 e1Var2 = (e1) this.d;
        e1 e1Var3 = (e1) this.b;
        if (i4Var != null) {
            int i = m.a[i4Var.ordinal()];
            if (i == 1) {
                return e1Var2;
            }
            if (i == 2) {
                return e1Var;
            }
            if (i == 3) {
                return e1Var3;
            }
            if (i == 4) {
                return this;
            }
        }
        int i2 = m.a[e1Var3.o().getDefaultScopeType().ordinal()];
        if (i2 == 1) {
            return e1Var2;
        }
        if (i2 != 2) {
            return i2 != 3 ? e1Var2 : e1Var3;
        }
        return e1Var;
    }

    public Object f(String str, x16 x16Var) {
        o1 o1VarI;
        d dVar;
        e7 e7VarU;
        d dVar2 = (d) this.d;
        String str2 = (String) this.c;
        str.getClass();
        g1 g1Var = (g1) this.b;
        z4 z4VarA = g1Var.o().getDateProvider().a();
        try {
            Object objInvoke = x16Var.invoke();
            if (objInvoke instanceof CrossProcessCursor) {
                return new io.sentry.android.sqlite.d((CrossProcessCursor) objInvoke, this, str);
            }
            o1 o1VarB = g1Var.b();
            o1VarI = o1VarB != null ? o1VarB.i("db.sql.query", str, z4VarA, v1.SENTRY) : null;
            if (o1VarI != null) {
                try {
                    e7VarU = o1VarI.u();
                } catch (Throwable th) {
                    th = th;
                    try {
                        o1 o1VarB2 = g1Var.b();
                        if (o1VarB2 != null) {
                            dVar = dVar2;
                            try {
                                o1VarI = o1VarB2.i("db.sql.query", str, z4VarA, v1.SENTRY);
                            } catch (Throwable th2) {
                                th = th2;
                                if (o1VarI != null) {
                                    boolean zC = g1Var.o().getThreadChecker().c();
                                    o1VarI.k(Boolean.valueOf(zC), "blocked_main_thread");
                                    if (zC) {
                                        o1VarI.k(dVar.d(), "call_stack");
                                    }
                                    if (str2 != null) {
                                        o1VarI.k("sqlite", "db.system");
                                        o1VarI.k(str2, "db.name");
                                    } else {
                                        o1VarI.k("in-memory", "db.system");
                                    }
                                    o1VarI.j();
                                }
                                throw th;
                            }
                        } else {
                            dVar = dVar2;
                            o1VarI = null;
                        }
                        e7 e7VarU2 = o1VarI != null ? o1VarI.u() : null;
                        if (e7VarU2 != null) {
                            e7VarU2.w = "auto.db.sqlite";
                        }
                        if (o1VarI != null) {
                            o1VarI.b(h7.INTERNAL_ERROR);
                        }
                        if (o1VarI != null) {
                            o1VarI.g(th);
                        }
                        throw th;
                    } catch (Throwable th3) {
                        th = th3;
                        dVar = dVar2;
                    }
                }
            } else {
                e7VarU = null;
            }
            if (e7VarU != null) {
                e7VarU.w = "auto.db.sqlite";
            }
            if (o1VarI != null) {
                o1VarI.b(h7.OK);
            }
            if (o1VarI != null) {
                boolean zC2 = g1Var.o().getThreadChecker().c();
                o1VarI.k(Boolean.valueOf(zC2), "blocked_main_thread");
                if (zC2) {
                    o1VarI.k(dVar2.d(), "call_stack");
                }
                if (str2 != null) {
                    o1VarI.k("sqlite", "db.system");
                    o1VarI.k(str2, "db.name");
                } else {
                    o1VarI.k("in-memory", "db.system");
                }
                o1VarI.j();
            }
            return objInvoke;
        } catch (Throwable th4) {
            th = th4;
            o1VarI = null;
        }
    }

    @Override // io.sentry.e1
    public Map getAttributes() {
        Map attributes = ((e1) this.b).getAttributes();
        Map attributes2 = ((e1) this.c).getAttributes();
        Map attributes3 = ((e1) this.d).getAttributes();
        boolean zIsEmpty = attributes.isEmpty();
        boolean zIsEmpty2 = attributes2.isEmpty();
        boolean zIsEmpty3 = attributes3.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            return (Map) a(attributes, attributes2, attributes3);
        }
        if (zIsEmpty2 && zIsEmpty3) {
            return attributes;
        }
        if (zIsEmpty && zIsEmpty3) {
            return attributes2;
        }
        if (zIsEmpty && zIsEmpty2) {
            return attributes3;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(attributes);
        concurrentHashMap.putAll(attributes2);
        concurrentHashMap.putAll(attributes3);
        return concurrentHashMap;
    }

    @Override // io.sentry.e1
    public Map getExtras() {
        Map extras = ((e1) this.b).getExtras();
        Map extras2 = ((e1) this.c).getExtras();
        Map extras3 = ((e1) this.d).getExtras();
        boolean zIsEmpty = extras.isEmpty();
        boolean zIsEmpty2 = extras2.isEmpty();
        boolean zIsEmpty3 = extras3.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            return (Map) a(extras, extras2, extras3);
        }
        if (zIsEmpty2 && zIsEmpty3) {
            return extras;
        }
        if (zIsEmpty && zIsEmpty3) {
            return extras2;
        }
        if (zIsEmpty && zIsEmpty2) {
            return extras3;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(extras);
        concurrentHashMap.putAll(extras2);
        concurrentHashMap.putAll(extras3);
        return concurrentHashMap;
    }

    @Override // io.sentry.e1
    public io.sentry.protocol.r h() {
        io.sentry.protocol.r rVarH = ((e1) this.d).h();
        if (rVarH != null) {
            return rVarH;
        }
        io.sentry.protocol.r rVarH2 = ((e1) this.c).h();
        return rVarH2 != null ? rVarH2 : ((e1) this.b).h();
    }

    @Override // io.sentry.e1
    public void i(g gVar, l0 l0Var) {
        e(null).i(gVar, l0Var);
    }

    @Override // io.sentry.e1
    public io.sentry.protocol.j j() {
        return t().j();
    }

    @Override // io.sentry.e1
    public io.sentry.protocol.w l() {
        io.sentry.protocol.w wVarL = ((e1) this.d).l();
        io.sentry.protocol.w wVar = io.sentry.protocol.w.b;
        if (!wVar.equals(wVarL)) {
            return wVarL;
        }
        io.sentry.protocol.w wVarL2 = ((e1) this.c).l();
        return !wVar.equals(wVarL2) ? wVarL2 : ((e1) this.b).l();
    }

    @Override // io.sentry.e1
    public void m(String str, String str2) {
        e(null).m(str, str2);
    }

    @Override // io.sentry.e1
    public void n(io.sentry.protocol.w wVar) {
        e(null).n(wVar);
    }

    @Override // io.sentry.e1
    public q6 o() {
        return ((e1) this.b).o();
    }

    @Override // io.sentry.e1
    public q1 p() {
        q1 q1VarP = ((e1) this.d).p();
        if (q1VarP != null) {
            return q1VarP;
        }
        q1 q1VarP2 = ((e1) this.c).p();
        return q1VarP2 != null ? q1VarP2 : ((e1) this.b).p();
    }

    @Override // io.sentry.e1
    public c7 q() {
        return e(null).q();
    }

    @Override // io.sentry.e1
    public io.sentry.internal.debugmeta.c r() {
        return e(null).r();
    }

    @Override // io.sentry.e1
    public void s() {
        e(null).s();
    }

    @Override // io.sentry.e1
    public io.sentry.featureflags.b t() {
        q6 q6VarO = ((e1) this.b).o();
        io.sentry.featureflags.b bVarT = ((e1) this.b).t();
        io.sentry.featureflags.b bVarT2 = ((e1) this.c).t();
        io.sentry.featureflags.b bVarT3 = ((e1) this.d).t();
        io.sentry.featureflags.c cVar = io.sentry.featureflags.c.a;
        int maxFeatureFlags = q6VarO.getMaxFeatureFlags();
        if (maxFeatureFlags > 0) {
            io.sentry.featureflags.a aVar = bVarT instanceof io.sentry.featureflags.a ? (io.sentry.featureflags.a) bVarT : null;
            io.sentry.featureflags.a aVar2 = bVarT2 instanceof io.sentry.featureflags.a ? (io.sentry.featureflags.a) bVarT2 : null;
            io.sentry.featureflags.a aVar3 = bVarT3 instanceof io.sentry.featureflags.a ? (io.sentry.featureflags.a) bVarT3 : null;
            CopyOnWriteArrayList copyOnWriteArrayList = aVar == null ? null : aVar.a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = aVar2 == null ? null : aVar2.a;
            CopyOnWriteArrayList copyOnWriteArrayList3 = aVar3 == null ? null : aVar3.a;
            int size = copyOnWriteArrayList == null ? 0 : copyOnWriteArrayList.size();
            int size2 = copyOnWriteArrayList2 == null ? 0 : copyOnWriteArrayList2.size();
            int size3 = copyOnWriteArrayList3 != null ? copyOnWriteArrayList3.size() : 0;
            if (size != 0 || size2 != 0 || size3 != 0) {
                int i = size - 1;
                int i2 = size2 - 1;
                int i3 = size3 - 1;
                if (copyOnWriteArrayList != null && i >= 0 && copyOnWriteArrayList.get(i) != null) {
                    com.adjust.sdk.sig.r3.f();
                    return null;
                }
                if (copyOnWriteArrayList2 != null && i2 >= 0 && copyOnWriteArrayList2.get(i2) != null) {
                    com.adjust.sdk.sig.r3.f();
                    return null;
                }
                if (copyOnWriteArrayList3 != null && i3 >= 0 && copyOnWriteArrayList3.get(i3) != null) {
                    com.adjust.sdk.sig.r3.f();
                    return null;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(maxFeatureFlags);
                linkedHashMap.size();
                ArrayList arrayList = new ArrayList(linkedHashMap.values());
                Collections.reverse(arrayList);
                return new io.sentry.featureflags.a(maxFeatureFlags, new CopyOnWriteArrayList(arrayList));
            }
        }
        return cVar;
    }

    @Override // io.sentry.e1
    public c7 u() {
        c7 c7VarU = ((e1) this.d).u();
        if (c7VarU != null) {
            return c7VarU;
        }
        c7 c7VarU2 = ((e1) this.c).u();
        return c7VarU2 != null ? c7VarU2 : ((e1) this.b).u();
    }

    @Override // io.sentry.e1
    public Queue v() {
        Queue queueV = ((e1) this.b).v();
        Queue queueV2 = ((e1) this.c).v();
        e1 e1Var = (e1) this.d;
        Queue queueV3 = e1Var.v();
        boolean zIsEmpty = queueV.isEmpty();
        boolean zIsEmpty2 = queueV2.isEmpty();
        boolean zIsEmpty3 = queueV3.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            return (Queue) a(queueV, queueV2, queueV3);
        }
        if (zIsEmpty2 && zIsEmpty3) {
            return queueV;
        }
        if (zIsEmpty && zIsEmpty3) {
            return queueV2;
        }
        if (zIsEmpty && zIsEmpty2) {
            return queueV3;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(queueV);
        arrayList.addAll(queueV2);
        arrayList.addAll(queueV3);
        Collections.sort(arrayList);
        Queue queueA = e4.a(e1Var.o().getMaxBreadcrumbs());
        queueA.addAll(arrayList);
        return queueA;
    }

    @Override // io.sentry.e1
    public q5 w() {
        q5 q5VarW = ((e1) this.d).w();
        if (q5VarW != null) {
            return q5VarW;
        }
        q5 q5VarW2 = ((e1) this.c).w();
        return q5VarW2 != null ? q5VarW2 : ((e1) this.b).w();
    }

    @Override // io.sentry.e1
    public w3 x() {
        return e(null).x();
    }

    @Override // io.sentry.e1
    public c7 y(c4 c4Var) {
        return e(null).y(c4Var);
    }

    @Override // io.sentry.e1
    public void z(String str) {
        e(null).z(str);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m26clone() {
        switch (this.a) {
            case 0:
                return clone();
            default:
                return super.clone();
        }
    }

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
