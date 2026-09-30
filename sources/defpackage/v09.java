package defpackage;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class v09 {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    /* JADX WARN: Code duplicated, block: B:21:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:22:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:25:0x016d  */
    /* JADX WARN: Code duplicated, block: B:31:0x017f  */
    /* JADX WARN: Code duplicated, block: B:36:0x018c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0258  */
    /* JADX WARN: Code duplicated, block: B:44:0x0261 A[LOOP:0: B:38:0x0246->B:44:0x0261, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x0257 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0260 A[SYNTHETIC] */
    public static final k8c a(Class cls) {
        g5b g5bVar;
        csb csbVar;
        csb csbVar2;
        e0g e0gVar;
        ConcurrentHashMap concurrentHashMap;
        yj7 yj7Var;
        fg fgVarK;
        wea weaVarK;
        k8c k8cVar;
        e0g e0gVar2;
        ConcurrentHashMap concurrentHashMap2;
        WeakReference weakReference;
        k8c k8cVar2;
        cls.getClass();
        ClassLoader classLoaderD = smb.d(cls);
        e0g e0gVar3 = new e0g(classLoaderD);
        ConcurrentHashMap concurrentHashMap3 = a;
        WeakReference weakReference2 = (WeakReference) concurrentHashMap3.get(e0gVar3);
        if (weakReference2 != null) {
            k8c k8cVar3 = (k8c) weakReference2.get();
            if (k8cVar3 != null) {
                return k8cVar3;
            }
            concurrentHashMap3.remove(e0gVar3, weakReference2);
        }
        ndb ndbVar = ndb.Z0;
        g5b g5bVar2 = new g5b(2, classLoaderD);
        ClassLoader classLoader = wef.class.getClassLoader();
        classLoader.getClass();
        g5b g5bVar3 = new g5b(2, classLoader);
        fnb fnbVar = new fnb(classLoaderD);
        i8c i8cVar = i8c.b;
        ge8 ge8Var = new ge8("DeserializationComponentsForJava.ModuleData");
        yj7 yj7Var2 = new yj7(ge8Var);
        x09 x09Var = new x09(t99.g("<" + ("runtime module for " + classLoaderD) + '>'), ge8Var, yj7Var2, 56);
        mjd mjdVar = ge8Var.a;
        mjdVar.lock();
        try {
            if (yj7Var2.a != null) {
                throw new AssertionError("Built-ins module is already set: " + yj7Var2.a + " (attempting to reset to " + x09Var + ")");
            }
            yj7Var2.a = x09Var;
            mjdVar.unlock();
            yj7Var2.f = new vj7(x09Var, 0);
            h04 h04Var = new h04();
            fnb fnbVar2 = new fnb();
            szc szcVar = new szc(ge8Var, x09Var);
            ndb ndbVar2 = ndb.g1;
            bu7 bu7Var = new bu7(1, 9, 0);
            kf7 kf7Var = jf7.d;
            bu7 bu7Var2 = kf7Var.b;
            if (bu7Var2 != null) {
                g5bVar = g5bVar3;
                if (bu7Var2.d - bu7Var.d <= 0) {
                    csbVar = kf7Var.c;
                }
                csbVar.getClass();
                if (csbVar == csb.WARN) {
                    csbVar2 = null;
                } else {
                    csbVar2 = csbVar;
                }
                egh eghVar = new egh(new nj7(csbVar, csbVar2), new x(18, bu7Var));
                y25 y25Var = new y25(ge8Var);
                pob pobVar = new pob(x09Var, szcVar);
                b10 b10Var = new b10(eghVar);
                y25 y25Var2 = new y25(27, new eu4(9));
                bf9.b.getClass();
                cf9 cf9Var = af9.b;
                e0gVar = e0gVar3;
                concurrentHashMap = concurrentHashMap3;
                g5b g5bVar4 = g5bVar;
                zx7 zx7Var = new zx7(new mf7(ge8Var, fnbVar, g5bVar2, h04Var, y25Var, fnbVar2, ndbVar2, x09Var, pobVar, b10Var, y25Var2, cf9Var, eghVar, new qfc()));
                fv8 fv8Var = fv8.g;
                fv8Var.getClass();
                fz3 fz3Var = new fz3(14, g5bVar2, h04Var);
                hbc hbcVar = new hbc();
                hbcVar.a = g5bVar2;
                hbcVar.b = ge8Var.b(new x(0, hbcVar));
                hbcVar.c = x09Var;
                hbcVar.d = szcVar;
                hbcVar.e = new a90(x09Var, szcVar);
                hbcVar.f = fv8.g;
                hbcVar.f = fv8Var;
                List listH = t72.H(cu3.a);
                xr7 xr7Var = x09Var.e;
                yj7Var = xr7Var instanceof yj7 ? (yj7) xr7Var : null;
                qk6 qk6Var = qk6.G0;
                if (yj7Var != null || (fgVarK = yj7Var.K()) == null) {
                    fgVarK = af8.c;
                }
                if (yj7Var != null || (weaVarK = yj7Var.K()) == null) {
                    weaVarK = qk6.Q0;
                }
                tz3 tz3Var = new tz3(ge8Var, x09Var, fz3Var, hbcVar, zx7Var, i8cVar, qk6Var, pu4.a, szcVar, fgVarK, weaVarK, sl7.a, cf9Var, new y25(ge8Var), listH, ndbVar);
                h04Var.a = tz3Var;
                fnbVar2.a = new vd9(22, zx7Var);
                bk7 bk7VarK = yj7Var2.K();
                bk7 bk7VarK2 = yj7Var2.K();
                y25 y25Var3 = new y25(ge8Var);
                bk7VarK.getClass();
                bk7VarK2.getClass();
                dk7 dk7Var = new dk7(ge8Var, g5bVar4, x09Var);
                kd9 kd9Var = new kd9(10, dk7Var);
                f51 f51Var = f51.m;
                dk7Var.c = new tz3(ge8Var, x09Var, kd9Var, new k47(x09Var, szcVar, f51Var), dk7Var, t72.I(new d51(ge8Var, x09Var), new uj7(ge8Var, x09Var)), szcVar, bk7VarK, bk7VarK2, f51Var.a, cf9Var, y25Var3, 262144);
                x09Var.v = new bu3(qd0.G0(new x09[]{x09Var}));
                x09Var.w = new fg2(t72.I(zx7Var, dk7Var), "CompositeProvider@RuntimeModuleData for " + x09Var);
                k8cVar = new k8c(tz3Var, new gg7(h04Var, g5bVar2));
                while (true) {
                    e0gVar2 = e0gVar;
                    concurrentHashMap2 = concurrentHashMap;
                    weakReference = (WeakReference) concurrentHashMap2.putIfAbsent(e0gVar2, new WeakReference(k8cVar));
                    if (weakReference == null) {
                        return k8cVar;
                    }
                    k8cVar2 = (k8c) weakReference.get();
                    if (k8cVar2 != null) {
                        return k8cVar2;
                    }
                    concurrentHashMap2.remove(e0gVar2, weakReference);
                    e0gVar = e0gVar2;
                    concurrentHashMap = concurrentHashMap2;
                }
            } else {
                g5bVar = g5bVar3;
            }
            csbVar = kf7Var.a;
            csbVar.getClass();
            if (csbVar == csb.WARN) {
                csbVar2 = null;
            } else {
                csbVar2 = csbVar;
            }
            egh eghVar2 = new egh(new nj7(csbVar, csbVar2), new x(18, bu7Var));
            y25 y25Var4 = new y25(ge8Var);
            pob pobVar2 = new pob(x09Var, szcVar);
            b10 b10Var2 = new b10(eghVar2);
            y25 y25Var5 = new y25(27, new eu4(9));
            bf9.b.getClass();
            cf9 cf9Var2 = af9.b;
            e0gVar = e0gVar3;
            concurrentHashMap = concurrentHashMap3;
            g5b g5bVar5 = g5bVar;
            zx7 zx7Var2 = new zx7(new mf7(ge8Var, fnbVar, g5bVar2, h04Var, y25Var4, fnbVar2, ndbVar2, x09Var, pobVar2, b10Var2, y25Var5, cf9Var2, eghVar2, new qfc()));
            fv8 fv8Var2 = fv8.g;
            fv8Var2.getClass();
            fz3 fz3Var2 = new fz3(14, g5bVar2, h04Var);
            hbc hbcVar2 = new hbc();
            hbcVar2.a = g5bVar2;
            hbcVar2.b = ge8Var.b(new x(0, hbcVar2));
            hbcVar2.c = x09Var;
            hbcVar2.d = szcVar;
            hbcVar2.e = new a90(x09Var, szcVar);
            hbcVar2.f = fv8.g;
            hbcVar2.f = fv8Var2;
            List listH2 = t72.H(cu3.a);
            xr7 xr7Var2 = x09Var.e;
            if (xr7Var2 instanceof yj7) {
            }
            qk6 qk6Var2 = qk6.G0;
            if (yj7Var != null) {
                fgVarK = af8.c;
            } else {
                fgVarK = af8.c;
            }
            if (yj7Var != null) {
                weaVarK = qk6.Q0;
            } else {
                weaVarK = qk6.Q0;
            }
            tz3 tz3Var2 = new tz3(ge8Var, x09Var, fz3Var2, hbcVar2, zx7Var2, i8cVar, qk6Var2, pu4.a, szcVar, fgVarK, weaVarK, sl7.a, cf9Var2, new y25(ge8Var), listH2, ndbVar);
            h04Var.a = tz3Var2;
            fnbVar2.a = new vd9(22, zx7Var2);
            bk7 bk7VarK3 = yj7Var2.K();
            bk7 bk7VarK4 = yj7Var2.K();
            y25 y25Var6 = new y25(ge8Var);
            bk7VarK3.getClass();
            bk7VarK4.getClass();
            dk7 dk7Var2 = new dk7(ge8Var, g5bVar5, x09Var);
            kd9 kd9Var2 = new kd9(10, dk7Var2);
            f51 f51Var2 = f51.m;
            dk7Var2.c = new tz3(ge8Var, x09Var, kd9Var2, new k47(x09Var, szcVar, f51Var2), dk7Var2, t72.I(new d51(ge8Var, x09Var), new uj7(ge8Var, x09Var)), szcVar, bk7VarK3, bk7VarK4, f51Var2.a, cf9Var2, y25Var6, 262144);
            x09Var.v = new bu3(qd0.G0(new x09[]{x09Var}));
            x09Var.w = new fg2(t72.I(zx7Var2, dk7Var2), "CompositeProvider@RuntimeModuleData for " + x09Var);
            k8cVar = new k8c(tz3Var2, new gg7(h04Var, g5bVar2));
            while (true) {
                e0gVar2 = e0gVar;
                concurrentHashMap2 = concurrentHashMap;
                weakReference = (WeakReference) concurrentHashMap2.putIfAbsent(e0gVar2, new WeakReference(k8cVar));
                if (weakReference == null) {
                    return k8cVar;
                }
                k8cVar2 = (k8c) weakReference.get();
                if (k8cVar2 != null) {
                    return k8cVar2;
                }
                concurrentHashMap2.remove(e0gVar2, weakReference);
                e0gVar = e0gVar2;
                concurrentHashMap = concurrentHashMap2;
            }
        } catch (Throwable th) {
            try {
                ge8Var.b.getClass();
                throw th;
            } catch (Throwable th2) {
                mjdVar.unlock();
                throw th2;
            }
        }
    }
}
