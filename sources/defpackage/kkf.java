package defpackage;

import android.util.Log;
import android.view.Surface;
import io.sentry.android.core.b1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kkf {
    public final lkf a;
    public final hh1 b;
    public final t07 c;
    public final c0d d;
    public final Object e;
    public pu3 f;
    public final LinkedHashMap g;
    public LinkedHashMap h;
    public za2 i;

    public kkf(lkf lkfVar, hh1 hh1Var, t07 t07Var, c0d c0dVar) {
        lkfVar.getClass();
        c0dVar.getClass();
        this.a = lkfVar;
        this.b = hh1Var;
        this.c = t07Var;
        this.d = c0dVar;
        this.e = new Object();
        this.g = new LinkedHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(kkf kkfVar, zn2 zn2Var) throws Throwable {
        fkf fkfVar;
        if (zn2Var instanceof fkf) {
            fkfVar = (fkf) zn2Var;
            int i = fkfVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fkfVar.label = i - Integer.MIN_VALUE;
            } else {
                fkfVar = new fkf(kkfVar, zn2Var);
            }
        } else {
            fkfVar = new fkf(kkfVar, zn2Var);
        }
        Object obj = fkfVar.result;
        bw2 bw2Var = bw2.a;
        int i2 = fkfVar.label;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    jzb.q(obj);
                    return obj;
                }
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
            synchronized (kkfVar.e) {
                pu3 pu3Var = kkfVar.f;
                if (pu3Var == null || kkfVar.i != null) {
                    return Boolean.FALSE;
                }
                fkfVar.label = 1;
                Object objS = pu3Var.s(fkfVar);
                return objS == bw2Var ? bw2Var : objS;
            }
        } catch (CancellationException unused) {
            if (b21.F(5, "CXCP")) {
                b1.l("CXCP", "Surface setup was cancelled");
            }
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(List list, long j, zn2 zn2Var) {
        gkf gkfVar;
        if (zn2Var instanceof gkf) {
            gkfVar = (gkf) zn2Var;
            int i = gkfVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                gkfVar.label = i - Integer.MIN_VALUE;
            } else {
                gkfVar = new gkf(this, zn2Var);
            }
        } else {
            gkfVar = new gkf(this, zn2Var);
        }
        Object objS = gkfVar.result;
        int i2 = gkfVar.label;
        if (i2 == 0) {
            jzb.q(objS);
            hkf hkfVar = new hkf(list, null);
            gkfVar.label = 1;
            objS = rs0.S(j, hkfVar, gkfVar);
            bw2 bw2Var = bw2.a;
            if (objS == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objS);
        }
        List list2 = (List) objS;
        return list2 == null ? pu4.a : list2;
    }

    public final void c(Surface surface) {
        lu3 lu3Var;
        surface.getClass();
        synchronized (this.e) {
            try {
                LinkedHashMap linkedHashMap = this.h;
                if (linkedHashMap != null && (lu3Var = (lu3) linkedHashMap.get(surface)) != null && !this.g.containsKey(surface)) {
                    if (b21.F(3, "CXCP")) {
                        Log.d("CXCP", "SurfaceActive " + lu3Var + " in " + this);
                    }
                    this.g.put(surface, lu3Var);
                    try {
                        lu3Var.d();
                    } catch (ju3 e) {
                        if (b21.F(5, "CXCP")) {
                            b1.n("CXCP", "Error when " + surface + " going to increase the use count.", e);
                        }
                        c0d c0dVar = this.d;
                        lu3 lu3VarA = e.a();
                        lu3VarA.getClass();
                        c0dVar.a(lu3VarA);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        Set setKeySet;
        bk1 bk1VarA = this.b.a();
        bk1VarA.getClass();
        synchronized (bk1VarA.a) {
            try {
                bk1VarA.c.add(this);
                LinkedHashMap linkedHashMap = bk1VarA.b;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (((Number) entry.getValue()).intValue() > 0) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                setKeySet = linkedHashMap2.keySet();
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            c((Surface) it.next());
        }
    }

    public final void e() {
        synchronized (this.e) {
            try {
                if (this.g.isEmpty() && this.h == null) {
                    if (b21.F(3, "CXCP")) {
                        Log.d("CXCP", this + " remove surface listener");
                    }
                    bk1 bk1VarA = this.b.a();
                    bk1VarA.getClass();
                    synchronized (bk1VarA.a) {
                        bk1VarA.c.remove(this);
                    }
                    za2 za2Var = this.i;
                    if (za2Var != null) {
                        za2Var.R(wef.a);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
