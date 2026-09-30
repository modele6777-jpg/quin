package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import com.adjust.sdk.sig.r3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r5c {
    public final em7 a;
    public final Context b;
    public final String c;
    public Executor f;
    public Executor g;
    public cu7 h;
    public boolean i;
    public boolean o;
    public boolean p;
    public pv2 q;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final u5c j = new u5c(0);
    public final LinkedHashSet k = new LinkedHashSet();
    public final LinkedHashSet l = new LinkedHashSet();
    public final ArrayList m = new ArrayList();
    public boolean n = true;

    public r5c(Context context, Class cls, String str) {
        this.a = job.a.b(cls);
        this.b = context;
        this.c = str;
    }

    public final void a(nv8... nv8VarArr) {
        for (nv8 nv8Var : nv8VarArr) {
            Integer numValueOf = Integer.valueOf(nv8Var.a);
            LinkedHashSet linkedHashSet = this.l;
            linkedHashSet.add(numValueOf);
            linkedHashSet.add(Integer.valueOf(nv8Var.b));
        }
        for (nv8 nv8Var2 : (nv8[]) Arrays.copyOf(nv8VarArr, nv8VarArr.length)) {
            this.j.a(nv8Var2);
        }
    }

    public final w5c b() {
        String name;
        gt4 gt4VarE;
        h9e h9eVarB;
        h9e h9eVarB2;
        Executor ea4Var;
        pv2 pv2VarP0;
        boolean zContainsKey;
        Executor executor = this.f;
        if (executor == null && this.g == null) {
            mc0 mc0Var = nc0.c;
            this.g = mc0Var;
            this.f = mc0Var;
        } else if (executor != null && this.g == null) {
            this.g = executor;
        } else if (executor == null) {
            this.f = this.g;
        }
        LinkedHashSet linkedHashSet = this.l;
        boolean zIsEmpty = linkedHashSet.isEmpty();
        LinkedHashSet linkedHashSet2 = this.k;
        if (!zIsEmpty) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (linkedHashSet2.contains(Integer.valueOf(iIntValue))) {
                    qc0.o(tec.e(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
                    return null;
                }
            }
        }
        g9e eu4Var = this.h;
        if (eu4Var == null) {
            eu4Var = new eu4(5);
        }
        g9e g9eVar = eu4Var;
        boolean z = this.i;
        Context context = this.b;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        t5c t5cVar = (activityManager == null || activityManager.isLowRamDevice()) ? t5c.a : t5c.b;
        Executor executor2 = this.f;
        if (executor2 == null) {
            qc0.j("Required value was null.");
            return null;
        }
        Executor executor3 = this.g;
        if (executor3 == null) {
            qc0.j("Required value was null.");
            return null;
        }
        boolean z2 = this.n;
        boolean z3 = this.o;
        boolean z4 = this.p;
        pv2 pv2Var = this.q;
        sd3 sd3Var = new sd3(context, this.c, g9eVar, this.j, this.d, z, t5cVar, executor2, executor3, null, z2, z3, linkedHashSet2, null, null, null, this.e, this.m, z4, null, pv2Var);
        Class clsR = af1.R(this.a);
        Package r0 = clsR.getPackage();
        if (r0 == null || (name = r0.getName()) == null) {
            name = "";
        }
        String canonicalName = clsR.getCanonicalName();
        canonicalName.getClass();
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String strReplace = canonicalName.replace('.', '_');
        strReplace.getClass();
        String strConcat = strReplace.concat("_Impl");
        try {
            Class<?> cls = Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, clsR.getClassLoader());
            cls.getClass();
            w5c w5cVar = (w5c) cls.getDeclaredConstructor(null).newInstance(null);
            w5cVar.getClass();
            w5cVar.k = true;
            try {
                gt4VarE = w5cVar.e();
                gt4VarE.getClass();
            } catch (wg9 unused) {
                gt4VarE = null;
            }
            if (gt4VarE == null) {
                new ld5(sd3Var, new a4c(w5cVar), new v5c(2, w5cVar, z5c.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 0));
                throw null;
            }
            w5cVar.e = new ld5(sd3Var, gt4VarE, new v5c(2, w5cVar, z5c.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 1));
            w5cVar.f = w5cVar.d();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Set setI = w5cVar.i();
            List list = sd3Var.n;
            int size = list.size();
            boolean[] zArr = new boolean[size];
            Iterator it2 = setI.iterator();
            while (true) {
                int i = -1;
                if (!it2.hasNext()) {
                    int size2 = list.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i2 = size2 - 1;
                            if (size2 >= size || !zArr[size2]) {
                                qc0.j("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                return null;
                            }
                            if (i2 < 0) {
                                break;
                            }
                            size2 = i2;
                        }
                    }
                    for (nv8 nv8Var : w5cVar.c(linkedHashMap)) {
                        int i3 = nv8Var.a;
                        int i4 = nv8Var.b;
                        u5c u5cVar = sd3Var.d;
                        LinkedHashMap linkedHashMap2 = u5cVar.a;
                        if (linkedHashMap2.containsKey(Integer.valueOf(i3))) {
                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(i3));
                            if (map == null) {
                                map = qu4.a;
                            }
                            zContainsKey = map.containsKey(Integer.valueOf(i4));
                        } else {
                            zContainsKey = false;
                        }
                        if (!zContainsKey) {
                            u5cVar.a(nv8Var);
                        }
                    }
                    LinkedHashMap linkedHashMapJ = w5cVar.j();
                    List list2 = sd3Var.m;
                    boolean[] zArr2 = new boolean[list2.size()];
                    for (Map.Entry entry : linkedHashMapJ.entrySet()) {
                        em7 em7Var = (em7) entry.getKey();
                        for (em7 em7Var2 : (List) entry.getValue()) {
                            int size3 = list2.size() - 1;
                            if (size3 < 0) {
                                size3 = -1;
                                break;
                            }
                            while (true) {
                                int i5 = size3 - 1;
                                if (em7Var2.D(list2.get(size3))) {
                                    zArr2[size3] = true;
                                    break;
                                }
                                if (i5 < 0) {
                                    size3 = -1;
                                    break;
                                }
                                size3 = i5;
                            }
                            if (size3 < 0) {
                                cva.o("A required type converter (", em7Var2.g(), ") for ", em7Var.g(), " is missing in the database configuration.");
                                return null;
                            }
                            Object obj = list2.get(size3);
                            em7Var2.getClass();
                            obj.getClass();
                            w5cVar.j.put(em7Var2, obj);
                        }
                    }
                    int size4 = list2.size() - 1;
                    if (size4 >= 0) {
                        while (true) {
                            int i6 = size4 - 1;
                            if (!zArr2[size4]) {
                                r3.m(list2.get(size4), ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.", "Unexpected type converter ");
                                return null;
                            }
                            if (i6 < 0) {
                                break;
                            }
                            size4 = i6;
                        }
                    }
                    if (pv2Var != null) {
                        nv2 nv2VarF0 = pv2Var.F0(hj6.Z);
                        nv2VarF0.getClass();
                        sv2 sv2Var = (sv2) nv2VarF0;
                        c35 c35Var = sv2Var instanceof c35 ? (c35) sv2Var : null;
                        if (c35Var == null || (ea4Var = c35Var.d1()) == null) {
                            ea4Var = new ea4(sv2Var);
                        }
                        w5cVar.c = ea4Var;
                        w5cVar.d = new h80(ea4Var);
                        w5cVar.a = jgb.k(pv2Var.p0(new t8e((dg7) pv2Var.F0(ndb.Y0))));
                        boolean zK = w5cVar.k();
                        qn2 qn2Var = w5cVar.a;
                        if (zK) {
                            if (qn2Var == null) {
                                pa7.g0("coroutineScope");
                                throw null;
                            }
                            pv2VarP0 = qn2Var.a.p0(sv2Var.c1(1));
                        } else {
                            if (qn2Var == null) {
                                pa7.g0("coroutineScope");
                                throw null;
                            }
                            pv2VarP0 = qn2Var.a;
                        }
                        w5cVar.b = pv2VarP0;
                    } else {
                        w5cVar.c = sd3Var.h;
                        w5cVar.d = new h80(sd3Var.i);
                        Executor executor4 = w5cVar.c;
                        if (executor4 == null) {
                            pa7.g0("internalQueryExecutor");
                            throw null;
                        }
                        qn2 qn2VarK = jgb.k(i7h.I(t72.z(executor4), iqf.d()));
                        w5cVar.a = qn2VarK;
                        pv2 pv2Var2 = qn2VarK.a;
                        h80 h80Var = w5cVar.d;
                        if (h80Var == null) {
                            pa7.g0("internalTransactionExecutor");
                            throw null;
                        }
                        w5cVar.b = pv2Var2.p0(t72.z(h80Var));
                    }
                    w5cVar.h = sd3Var.f;
                    ld5 ld5Var = w5cVar.e;
                    if (ld5Var == null) {
                        pa7.g0("connectionManager");
                        throw null;
                    }
                    h9e h9eVar = (h9e) ld5Var.h;
                    if (h9eVar == null) {
                        h9eVarB = null;
                        break;
                    }
                    h9eVarB = h9eVar;
                    while (!(h9eVarB instanceof zoa)) {
                        if (!(h9eVarB instanceof tv3)) {
                            h9eVarB = null;
                            break;
                        }
                        h9eVarB = ((tv3) h9eVarB).b();
                    }
                    ld5 ld5Var2 = w5cVar.e;
                    if (ld5Var2 == null) {
                        pa7.g0("connectionManager");
                        throw null;
                    }
                    h9e h9eVar2 = (h9e) ld5Var2.h;
                    if (h9eVar2 == null) {
                        h9eVarB2 = null;
                        break;
                    }
                    h9eVarB2 = h9eVar2;
                    while (!(h9eVarB2 instanceof lm0)) {
                        if (!(h9eVarB2 instanceof tv3)) {
                            h9eVarB2 = null;
                            break;
                        }
                        h9eVarB2 = ((tv3) h9eVarB2).b();
                    }
                    return w5cVar;
                }
                em7 em7Var3 = (em7) it2.next();
                int size5 = list.size() - 1;
                if (size5 >= 0) {
                    while (true) {
                        int i7 = size5 - 1;
                        if (em7Var3.D(list.get(size5))) {
                            zArr[size5] = true;
                            i = size5;
                            break;
                        }
                        if (i7 < 0) {
                            break;
                        }
                        size5 = i7;
                    }
                }
                if (i < 0) {
                    cva.u(em7Var3.g(), ") is missing in the database configuration.", "A required auto migration spec (");
                    return null;
                }
                linkedHashMap.put(em7Var3, list.get(i));
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Cannot find implementation for " + clsR.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot access the constructor " + clsR.getCanonicalName(), e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Failed to create an instance of " + clsR.getCanonicalName(), e3);
        }
    }
}
