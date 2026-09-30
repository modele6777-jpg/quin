package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ujf {
    public final ckf a;
    public final xle b;
    public final Object c;
    public za2 d;
    public final wh0 e;
    public final ad0 f;
    public boolean g;
    public final LinkedHashMap h;
    public final LinkedHashMap i;
    public final LinkedHashSet j;
    public final LinkedHashSet k;
    public ttb l;
    public th m;
    public uh n;
    public vr0 o;
    public final qjf p;
    public final wh0 q;

    public ujf(ckf ckfVar, xle xleVar) {
        ckfVar.getClass();
        this.a = ckfVar;
        this.b = xleVar;
        this.c = new Object();
        this.e = vpf.n(0);
        this.f = new ad0();
        this.h = new LinkedHashMap();
        this.i = new LinkedHashMap();
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
        this.p = new qjf(this);
        this.q = vpf.n(0);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0139  */
    /* JADX WARN: Code duplicated, block: B:72:0x0153 A[Catch: all -> 0x015c, TRY_LEAVE, TryCatch #4 {, blocks: (B:70:0x014f, B:72:0x0153), top: B:92:0x014f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:92:0x014f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:67:0x0139, please report this as an issue */
    public final Object a(zn2 zn2Var) {
        sjf sjfVar;
        mmb mmbVar;
        ctb ctbVar;
        za2 za2Var;
        int iIncrementAndGet;
        if (zn2Var instanceof sjf) {
            sjfVar = (sjf) zn2Var;
            int i = sjfVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sjfVar.label = i - Integer.MIN_VALUE;
            } else {
                sjfVar = new sjf(this, zn2Var);
            }
        } else {
            sjfVar = new sjf(this, zn2Var);
        }
        Object objH = sjfVar.result;
        bw2 bw2Var = bw2.a;
        int i2 = sjfVar.label;
        if (i2 == 0) {
            mmb mmbVarD = ks0.d(objH);
            try {
                yf1 yf1VarA = this.a.a();
                sjfVar.L$0 = mmbVarD;
                sjfVar.label = 1;
                objH = ((dg1) yf1VarA).h(sjfVar);
                if (objH == bw2Var) {
                    return bw2Var;
                }
                mmbVar = mmbVarD;
            } catch (CancellationException e) {
                e = e;
                mmbVar = mmbVarD;
                if (b21.F(3, "CXCP")) {
                    Log.d("CXCP", "Cannot acquire session at " + this, e);
                }
                synchronized (this.c) {
                    if (this.g) {
                        this.g = false;
                        mmbVar.element = this.d;
                        this.d = null;
                    }
                }
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mmbVar = (mmb) sjfVar.L$0;
            try {
                jzb.q(objH);
            } catch (CancellationException e2) {
                e = e2;
                if (b21.F(3, "CXCP")) {
                    Log.d("CXCP", "Cannot acquire session at " + this, e);
                }
                synchronized (this.c) {
                    if (this.g) {
                        this.g = false;
                        mmbVar.element = this.d;
                        this.d = null;
                    }
                }
            }
        }
        AutoCloseable autoCloseable = (AutoCloseable) objH;
        try {
            gg1 gg1Var = (gg1) autoCloseable;
            synchronized (this.c) {
                if (this.j.isEmpty()) {
                    ctbVar = null;
                } else {
                    ttb ttbVar = this.l;
                    List listJ1 = s72.j1(this.j);
                    LinkedHashMap linkedHashMapL = bm8.L(this.b.a(this.l), bm8.X(this.h));
                    LinkedHashMap linkedHashMapY = bm8.Y(this.i);
                    ru8 ru8Var = yde.b;
                    wh0 wh0Var = this.e;
                    wh0Var.getClass();
                    linkedHashMapY.put(ru8Var, new Integer(wh0.b.incrementAndGet(wh0Var)));
                    ArrayList arrayListL1 = s72.l1(this.k);
                    arrayListL1.add(this.p);
                    ctbVar = new ctb(listJ1, linkedHashMapL, linkedHashMapY, arrayListL1, ttbVar, 32);
                }
                za2Var = this.d;
                this.g = false;
                this.d = null;
            }
            if (ctbVar == null) {
                gg1Var.u();
                mmbVar.element = za2Var;
            } else {
                if (za2Var != null) {
                    synchronized (this.c) {
                        this.f.addLast(new rjf(this.e.a, za2Var));
                        wh0 wh0Var2 = this.q;
                        wh0Var2.getClass();
                        iIncrementAndGet = wh0.b.incrementAndGet(wh0Var2);
                    }
                    ok8.j(iIncrementAndGet);
                }
                if (b21.F(3, "CXCP")) {
                    Log.d("CXCP", "Update RepeatingRequest: " + ctbVar);
                }
                gg1Var.getClass();
                ctbVar.getClass();
                if (gg1Var.a.a()) {
                    r82.e(gg1Var, " after close.", "Cannot call startRepeating on ");
                } else {
                    gg1Var.b.d(ctbVar);
                }
                b(gg1Var, ctbVar.b);
            }
            cgg.t(autoCloseable, null);
            ya2 ya2Var = (ya2) mmbVar.element;
            if (ya2Var != null) {
                ((za2) ya2Var).R(wef.a);
            }
            return wef.a;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                cgg.t(autoCloseable, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(gg1 gg1Var, Map map) {
        th thVarN;
        uh uhVar;
        Object next;
        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
        key.getClass();
        Object obj = null;
        Object obj2 = map != null ? map.get(key) : null;
        Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
        if (num != null) {
            int iIntValue = num.intValue();
            List list = th.b;
            thVarN = x57.N(iIntValue);
        } else {
            thVarN = null;
        }
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AF_MODE;
        key2.getClass();
        Object obj3 = map != null ? map.get(key2) : null;
        Integer num2 = obj3 instanceof Integer ? (Integer) obj3 : null;
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            Iterator it = uh.b.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((uh) next).a != iIntValue2);
            uhVar = (uh) next;
        } else {
            uhVar = null;
        }
        CaptureRequest.Key key3 = CaptureRequest.CONTROL_AWB_MODE;
        key3.getClass();
        Object obj4 = map != null ? map.get(key3) : null;
        Integer num3 = obj4 instanceof Integer ? (Integer) obj4 : null;
        if (num3 != null) {
            int iIntValue3 = num3.intValue();
            for (Object obj5 : vr0.b) {
                if (((vr0) obj5).a == iIntValue3) {
                    obj = obj5;
                    break;
                }
            }
            obj = (vr0) obj;
        }
        vr0 vr0Var = obj;
        boolean z = false;
        boolean z2 = (thVarN == null || thVarN.equals(this.m)) ? false : true;
        boolean z3 = (uhVar == null || uhVar.equals(this.n)) ? false : true;
        if (vr0Var != 0 && !vr0Var.equals(this.o)) {
            z = true;
        }
        if (z2 || z3 || z) {
            if (b21.F(3, "CXCP")) {
                Log.d("CXCP", "UseCaseCameraState: Updating 3A modes: AE(" + thVarN + ", changed=" + z2 + "), AF(" + uhVar + ", changed=" + z3 + "), AWB(" + vr0Var + ", changed=" + z + ')');
            }
            hf1.b(gg1Var, thVarN, uhVar, vr0Var, null, null, null, 56);
            if (thVarN != null) {
                this.m = thVarN;
            }
            if (uhVar != null) {
                this.n = uhVar;
            }
            if (vr0Var != 0) {
                this.o = vr0Var;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object c(LinkedHashMap linkedHashMap, Map map, Set set, ttb ttbVar, Set set2, zn2 zn2Var) {
        tjf tjfVar;
        mmb mmbVar;
        if (zn2Var instanceof tjf) {
            tjfVar = (tjf) zn2Var;
            int i = tjfVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tjfVar.label = i - Integer.MIN_VALUE;
            } else {
                tjfVar = new tjf(this, zn2Var);
            }
        } else {
            tjfVar = new tjf(this, zn2Var);
        }
        Object obj = tjfVar.result;
        Object obj2 = bw2.a;
        int i2 = tjfVar.label;
        if (i2 == 0) {
            mmb mmbVarD = ks0.d(obj);
            synchronized (this.c) {
                try {
                    if (b21.F(3, "CXCP")) {
                        Log.d("CXCP", "UseCaseCameraState#updateState: parameters = " + linkedHashMap + ", internalParameters = " + map + ", streams = " + set + ", template = " + ttbVar);
                    }
                    if (linkedHashMap != null) {
                        this.h.clear();
                        this.h.putAll(linkedHashMap);
                    }
                    if (map != null) {
                        this.i.clear();
                        this.i.putAll(map);
                    }
                    if (set != null) {
                        this.j.clear();
                        this.j.addAll(set);
                    }
                    if (ttbVar != null) {
                        this.l = ttbVar;
                    }
                    if (set2 != null) {
                        this.k.clear();
                        this.k.addAll(set2);
                    }
                    za2 za2Var = this.d;
                    if (za2Var == null) {
                        za2Var = new za2();
                        this.d = za2Var;
                    }
                    if (this.g) {
                        return za2Var;
                    }
                    this.g = true;
                    mmbVarD.element = za2Var;
                    tjfVar.L$0 = mmbVarD;
                    tjfVar.label = 1;
                    if (a(tjfVar) == obj2) {
                        return obj2;
                    }
                    mmbVar = mmbVarD;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mmbVar = (mmb) tjfVar.L$0;
            jzb.q(obj);
        }
        return mmbVar.element;
    }
}
