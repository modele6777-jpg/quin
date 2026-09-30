package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Range;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o3e {
    public static final no0 a;
    public static final fl8 b;
    public static final fl8 c;

    static {
        Class cls = Long.TYPE;
        cls.getClass();
        a = new no0("camera2.streamSpec.streamUseCase", cls, null);
        fl8 fl8Var = new fl8();
        int i = Build.VERSION.SDK_INT;
        zjf zjfVar = zjf.d;
        zjf zjfVar2 = zjf.a;
        zjf zjfVar3 = zjf.b;
        if (i >= 33) {
            zjf zjfVar4 = zjf.f;
            zjf zjfVar5 = zjf.c;
            fl8Var.put(4L, qd0.I0(new zjf[]{zjfVar3, zjfVar4, zjfVar5}));
            fl8Var.put(1L, qd0.I0(new zjf[]{zjfVar3, zjfVar4, zjfVar5}));
            fl8Var.put(2L, n3d.p(zjfVar2));
            fl8Var.put(3L, n3d.p(zjfVar));
        }
        b = fl8Var.j();
        fl8 fl8Var2 = new fl8();
        if (i >= 33) {
            fl8Var2.put(4L, qd0.I0(new zjf[]{zjfVar3, zjfVar2, zjfVar}));
            fl8Var2.put(3L, qd0.I0(new zjf[]{zjfVar3, zjfVar}));
        }
        c = fl8Var2.j();
    }

    public static boolean a(yg1 yg1Var, List list) {
        yg1Var.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            CameraCharacteristics.Key key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
            key.getClass();
            long[] jArr = (long[]) ((nc1) yg1Var).c(key);
            if (jArr != null && jArr.length != 0) {
                HashSet hashSet = new HashSet();
                for (long j : jArr) {
                    hashSet.add(Long.valueOf(j));
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!hashSet.contains(Long.valueOf(((z9e) it.next()).c.a()))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static od1 b(qh2 qh2Var, Long l) {
        no0 no0Var = a;
        if (qh2Var.h(no0Var) && pa7.t(qh2Var.c(no0Var), l)) {
            return null;
        }
        k79 k79VarM = k79.m(qh2Var);
        k79VarM.p(no0Var, l);
        return new od1(7, k79VarM);
    }

    public static boolean c(zjf zjfVar, long j, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (zjfVar != zjf.e) {
            Long lValueOf = Long.valueOf(j);
            fl8 fl8Var = b;
            if (!fl8Var.containsKey(lValueOf)) {
                return false;
            }
            Object obj = fl8Var.get(Long.valueOf(j));
            obj.getClass();
            return ((Set) obj).contains(zjfVar);
        }
        Long lValueOf2 = Long.valueOf(j);
        fl8 fl8Var2 = c;
        if (!fl8Var2.containsKey(lValueOf2)) {
            return false;
        }
        Object obj2 = fl8Var2.get(Long.valueOf(j));
        obj2.getClass();
        Set set = (Set) obj2;
        if (list.size() != set.size()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains((zjf) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(yg1 yg1Var) {
        yg1Var.getClass();
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
        key.getClass();
        long[] jArr = (long[]) ((nc1) yg1Var).c(key);
        return (jArr == null || jArr.length == 0) ? false : true;
    }

    public static boolean e(qh2 qh2Var, zjf zjfVar) {
        Object objA = qh2Var.a(xjf.n0, Boolean.FALSE);
        objA.getClass();
        if (((Boolean) objA).booleanValue()) {
            return false;
        }
        no0 no0Var = iv6.b;
        if (!qh2Var.h(no0Var)) {
            return false;
        }
        Object objC = qh2Var.c(no0Var);
        objC.getClass();
        return zjfVar.ordinal() == 0 && ((Number) objC).intValue() == 2;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a7  */
    public static boolean f(yg1 yg1Var, ArrayList arrayList, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        boolean z;
        boolean z2;
        yg1Var.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            ArrayList<xjf> arrayList2 = new ArrayList(linkedHashMap.keySet());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((eo0) it.next()).f == null) {
                    qc0.p("Required value was null.");
                    return false;
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object obj = linkedHashMap.get((xjf) it2.next());
                if (obj == null) {
                    qc0.p("Required value was null.");
                    return false;
                }
                if (((hq0) obj).f == null) {
                    qc0.p("Required value was null.");
                    return false;
                }
            }
            CameraCharacteristics.Key key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
            key.getClass();
            long[] jArr = (long[]) ((nc1) yg1Var).c(key);
            if (jArr != null && jArr.length != 0) {
                HashSet hashSet = new HashSet();
                for (long j : jArr) {
                    hashSet.add(Long.valueOf(j));
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it3 = arrayList.iterator();
                if (it3.hasNext()) {
                    eo0 eo0Var = (eo0) it3.next();
                    qh2 qh2Var = eo0Var.f;
                    qh2Var.getClass();
                    no0 no0Var = od1.v;
                    if (qh2Var.h(no0Var)) {
                        qh2 qh2Var2 = eo0Var.f;
                        qh2Var2.getClass();
                        Object objC = qh2Var2.c(no0Var);
                        objC.getClass();
                        if (((Number) objC).longValue() == 0) {
                            z = false;
                            z2 = true;
                        } else {
                            z2 = false;
                            z = true;
                        }
                    } else {
                        z = false;
                        z2 = true;
                    }
                } else {
                    z = false;
                    z2 = false;
                }
                for (xjf xjfVar : arrayList2) {
                    no0 no0Var2 = od1.v;
                    if (xjfVar.h(no0Var2)) {
                        Object objC2 = xjfVar.c(no0Var2);
                        objC2.getClass();
                        long jLongValue = ((Number) objC2).longValue();
                        if (jLongValue != 0) {
                            if (z2) {
                                qc0.j("Either all use cases must have non-default stream use case assigned or none should have it");
                                return false;
                            }
                            linkedHashSet.add(Long.valueOf(jLongValue));
                            z = true;
                        } else if (z) {
                            qc0.j("Either all use cases must have non-default stream use case assigned or none should have it");
                            return false;
                        }
                    } else if (z) {
                        qc0.j("Either all use cases must have non-default stream use case assigned or none should have it");
                        return false;
                    }
                    z2 = true;
                }
                if (!z2) {
                    Iterator it4 = linkedHashSet.iterator();
                    while (it4.hasNext()) {
                        if (!hashSet.contains(Long.valueOf(((Number) it4.next()).longValue()))) {
                        }
                    }
                    Iterator it5 = arrayList.iterator();
                    while (it5.hasNext()) {
                        eo0 eo0Var2 = (eo0) it5.next();
                        qh2 qh2Var3 = eo0Var2.f;
                        qh2Var3.getClass();
                        od1 od1VarB = b(qh2Var3, (Long) qh2Var3.c(od1.v));
                        if (od1VarB != null) {
                            hc2 hc2VarA = hq0.a(eo0Var2.c);
                            hc2VarA.e = Integer.valueOf(eo0Var2.g);
                            Range range = eo0Var2.h;
                            if (range == null) {
                                r82.g("Null expectedFrameRateRange");
                                return false;
                            }
                            hc2VarA.f = range;
                            qr4 qr4Var = eo0Var2.d;
                            if (qr4Var == null) {
                                r82.g("Null dynamicRange");
                                return false;
                            }
                            hc2VarA.d = qr4Var;
                            hc2VarA.g = od1VarB;
                            linkedHashMap2.put(eo0Var2, hc2VarA.c());
                        }
                    }
                    for (xjf xjfVar2 : arrayList2) {
                        hq0 hq0Var = (hq0) linkedHashMap.get(xjfVar2);
                        hq0Var.getClass();
                        qh2 qh2Var4 = hq0Var.f;
                        qh2Var4.getClass();
                        od1 od1VarB2 = b(qh2Var4, (Long) qh2Var4.c(od1.v));
                        if (od1VarB2 != null) {
                            hc2 hc2VarB = hq0Var.b();
                            hc2VarB.g = od1VarB2;
                            linkedHashMap.put(xjfVar2, hc2VarB.c());
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
