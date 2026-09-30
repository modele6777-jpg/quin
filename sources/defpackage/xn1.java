package defpackage;

import android.hardware.camera2.CaptureResult;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xn1 implements pm1 {
    public final km1 a;
    public final xi5 b;
    public final s0f c;
    public final yuf d;
    public final lkf e;
    public final w92 f;
    public final qkf g;
    public final h1b h;
    public final ckf i;
    public final ace j;
    public final ace k;
    public int l;
    public es m;
    public final ym1 n;

    public xn1(km1 km1Var, xi5 xi5Var, s0f s0fVar, yuf yufVar, lkf lkfVar, w92 w92Var, qkf qkfVar, gh1 gh1Var, h1b h1bVar, ckf ckfVar) {
        km1Var.getClass();
        xi5Var.getClass();
        s0fVar.getClass();
        yufVar.getClass();
        lkfVar.getClass();
        w92Var.getClass();
        gh1Var.getClass();
        h1bVar.getClass();
        ckfVar.getClass();
        this.a = km1Var;
        this.b = xi5Var;
        this.c = s0fVar;
        this.d = yufVar;
        this.e = lkfVar;
        this.f = w92Var;
        this.g = qkfVar;
        this.h = h1bVar;
        this.i = ckfVar;
        this.j = new ace(new qm1(gh1Var, 0));
        this.k = new ace(new p(19, this));
        this.l = 1;
        this.n = new ym1();
    }

    @Override // defpackage.pm1
    public final dn1 a(int i, int i2, int i3) {
        return new dn1(this, i, i2, i3);
    }

    @Override // defpackage.pm1
    public final void b(int i) {
        this.l = i;
    }

    @Override // defpackage.pm1
    public final Object c(List list, int i, qh2 qh2Var, int i2, int i3, int i4, zn2 zn2Var) {
        return h(t72.I(sm1.a, sm1.b, sm1.c), i2, i4, i3, new rm1(list, i, qh2Var), zn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0139  */
    /* JADX WARN: Code duplicated, block: B:64:0x0140 A[Catch: all -> 0x0049, TRY_LEAVE, TryCatch #2 {all -> 0x0049, blocks: (B:14:0x0044, B:62:0x013a, B:64:0x0140, B:21:0x0065, B:58:0x0122), top: B:95:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:67:0x014f  */
    /* JADX WARN: Code duplicated, block: B:76:0x016b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0171  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x0178  */
    /* JADX WARN: Code duplicated, block: B:82:0x0182  */
    /* JADX WARN: Code duplicated, block: B:84:0x018a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0191  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27, types: [dw2, pv2, xn2] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final Object d(rm1 rm1Var, long j, int i, List list, zn2 zn2Var) {
        um1 um1Var;
        Throwable th;
        ?? r4;
        rm1 rm1Var2;
        int i2;
        xn1 xn1Var;
        rm1 rm1Var3;
        long j2;
        int i3;
        xn1 xn1Var2;
        AutoCloseable autoCloseable;
        AutoCloseable autoCloseable2;
        rm1 rm1Var4;
        List list2;
        int i4;
        xn1 xn1Var3;
        ?? r2;
        List listH;
        List list3 = list;
        if (zn2Var instanceof um1) {
            um1Var = (um1) zn2Var;
            int i5 = um1Var.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                um1Var.label = i5 - Integer.MIN_VALUE;
            } else {
                um1Var = new um1(this, zn2Var);
            }
        } else {
            um1Var = new um1(this, zn2Var);
        }
        Object objH = um1Var.result;
        ?? r5 = um1Var.label;
        bw2 bw2Var = bw2.a;
        try {
            try {
                if (r5 == 0) {
                    jzb.q(objH);
                    if (b21.F(3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#aePreCaptureApplyCapture");
                    }
                    if (b21.F(3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: tasks = " + list3);
                    }
                    if (list3.contains(sm1.a)) {
                        if (b21.F(3, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting PRE_CAPTURE");
                        }
                        if (b21.F(3, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#aePreCaptureApplyCapture: Acquiring session for locking 3A");
                        }
                        yf1 yf1VarA = this.i.a();
                        um1Var.L$0 = this;
                        um1Var.L$1 = list3;
                        rm1Var3 = rm1Var;
                        um1Var.L$2 = rm1Var3;
                        j2 = j;
                        um1Var.J$0 = j2;
                        i3 = i;
                        um1Var.I$0 = i3;
                        um1Var.label = 1;
                        objH = ((dg1) yf1VarA).h(um1Var);
                        if (objH != bw2Var) {
                            xn1Var2 = this;
                        }
                        return bw2Var;
                    }
                    rm1Var2 = rm1Var;
                    i2 = i;
                    xn1Var = this;
                    if (list3.contains(sm1.b)) {
                        if (b21.F(3, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                        }
                        if (rm1Var2 == null) {
                            qc0.p("Required value was null.");
                            return null;
                        }
                        ArrayList arrayListN = xn1Var.n(rm1Var2);
                        if (b21.F(3, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                        }
                        listH = arrayListN;
                        r2 = 0;
                    } else {
                        r2 = 0;
                        listH = t72.H(y7h.b(null));
                    }
                    if (list3.contains(sm1.c)) {
                        ynb.V(xn1Var.e.f, r2, r2, new tm1(listH, r2, this, i2), 3);
                    }
                    return listH;
                }
                if (r5 == 1) {
                    int i6 = um1Var.I$0;
                    j2 = um1Var.J$0;
                    rm1Var3 = (rm1) um1Var.L$2;
                    List list4 = (List) um1Var.L$1;
                    xn1Var2 = (xn1) um1Var.L$0;
                    jzb.q(objH);
                    i3 = i6;
                    list3 = list4;
                } else {
                    if (r5 == 2) {
                        i4 = um1Var.I$0;
                        AutoCloseable autoCloseable3 = (AutoCloseable) um1Var.L$3;
                        rm1Var4 = (rm1) um1Var.L$2;
                        list2 = (List) um1Var.L$1;
                        xn1Var3 = (xn1) um1Var.L$0;
                        jzb.q(objH);
                        autoCloseable2 = autoCloseable3;
                        um1Var.L$0 = xn1Var3;
                        um1Var.L$1 = list2;
                        um1Var.L$2 = rm1Var4;
                        um1Var.L$3 = autoCloseable2;
                        um1Var.I$0 = i4;
                        um1Var.label = 3;
                        if (((rg7) ((nu3) objH)).U0(um1Var) != bw2Var) {
                            xn1Var = xn1Var3;
                            r5 = autoCloseable2;
                        }
                        return bw2Var;
                    }
                    if (r5 != 3) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i4 = um1Var.I$0;
                    AutoCloseable autoCloseable4 = (AutoCloseable) um1Var.L$3;
                    rm1Var4 = (rm1) um1Var.L$2;
                    list2 = (List) um1Var.L$1;
                    xn1Var = (xn1) um1Var.L$0;
                    jzb.q(objH);
                    r5 = autoCloseable4;
                }
                if (b21.F(3, "CXCP")) {
                    Log.d("CXCP", "CapturePipeline#aePreCaptureApplyCapture: Locking 3A for capture done");
                }
                cgg.t(r5, null);
                if (b21.F(3, "CXCP")) {
                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                }
                i2 = i4;
                rm1Var2 = rm1Var4;
                list3 = list2;
                if (list3.contains(sm1.b)) {
                    if (b21.F(3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                    }
                    if (rm1Var2 == null) {
                        qc0.p("Required value was null.");
                        return null;
                    }
                    ArrayList arrayListN2 = xn1Var.n(rm1Var2);
                    if (b21.F(3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                    }
                    listH = arrayListN2;
                    r2 = 0;
                } else {
                    r2 = 0;
                    listH = t72.H(y7h.b(null));
                }
                if (list3.contains(sm1.c)) {
                    ynb.V(xn1Var.e.f, r2, r2, new tm1(listH, r2, this, i2), 3);
                }
                return listH;
                gg1 gg1Var = (gg1) autoCloseable;
                if (b21.F(3, "CXCP")) {
                    Log.d("CXCP", "CapturePipeline#aePreCaptureApplyCapture: Locking 3A for capture");
                }
                boolean z = i3 == 0;
                boolean z2 = i3 == 0;
                um1Var.L$0 = xn1Var2;
                um1Var.L$1 = list3;
                um1Var.L$2 = rm1Var3;
                um1Var.L$3 = autoCloseable;
                um1Var.I$0 = i3;
                um1Var.label = 2;
                za2 za2VarH = gg1.h(gg1Var, z, z2, j2);
                if (za2VarH != bw2Var) {
                    rm1 rm1Var5 = rm1Var3;
                    autoCloseable2 = autoCloseable;
                    objH = za2VarH;
                    rm1Var4 = rm1Var5;
                    list2 = list3;
                    i4 = i3;
                    xn1Var3 = xn1Var2;
                    um1Var.L$0 = xn1Var3;
                    um1Var.L$1 = list2;
                    um1Var.L$2 = rm1Var4;
                    um1Var.L$3 = autoCloseable2;
                    um1Var.I$0 = i4;
                    um1Var.label = 3;
                    if (((rg7) ((nu3) objH)).U0(um1Var) != bw2Var) {
                        xn1Var = xn1Var3;
                        r5 = autoCloseable2;
                        if (b21.F(3, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#aePreCaptureApplyCapture: Locking 3A for capture done");
                        }
                        cgg.t(r5, null);
                        if (b21.F(3, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                        }
                        i2 = i4;
                        rm1Var2 = rm1Var4;
                        list3 = list2;
                        if (list3.contains(sm1.b)) {
                            if (b21.F(3, "CXCP")) {
                                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                            }
                            if (rm1Var2 == null) {
                                qc0.p("Required value was null.");
                                return null;
                            }
                            ArrayList arrayListN3 = xn1Var.n(rm1Var2);
                            if (b21.F(3, "CXCP")) {
                                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                            }
                            listH = arrayListN3;
                            r2 = 0;
                        } else {
                            r2 = 0;
                            listH = t72.H(y7h.b(null));
                        }
                        if (list3.contains(sm1.c)) {
                            ynb.V(xn1Var.e.f, r2, r2, new tm1(listH, r2, this, i2), 3);
                        }
                        return listH;
                    }
                }
                return bw2Var;
            } catch (Throwable th2) {
                th = th2;
                r4 = autoCloseable;
                try {
                    throw th;
                } catch (Throwable th3) {
                    cgg.t(r4, th);
                    throw th3;
                }
            }
            autoCloseable = (AutoCloseable) objH;
        } catch (Throwable th4) {
            th = th4;
            r4 = r5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object e(rm1 rm1Var, int i, int i2, List list, zn2 zn2Var) {
        vm1 vm1Var;
        if (zn2Var instanceof vm1) {
            vm1Var = (vm1) zn2Var;
            int i3 = vm1Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vm1Var.label = i3 - Integer.MIN_VALUE;
            } else {
                vm1Var = new vm1(this, zn2Var);
            }
        } else {
            vm1Var = new vm1(this, zn2Var);
        }
        vm1 vm1Var2 = vm1Var;
        Object objK = vm1Var2.result;
        int i4 = vm1Var2.label;
        Object obj = bw2.a;
        if (i4 == 0) {
            jzb.q(objK);
            if (((Boolean) this.j.getValue()).booleanValue()) {
                vm1Var2.L$0 = rm1Var;
                vm1Var2.L$1 = list;
                vm1Var2.I$0 = i;
                vm1Var2.label = 1;
                objK = k(i2, vm1Var2);
                if (objK != obj) {
                }
            } else {
                vm1Var2.label = 4;
                Object objF = f(rm1Var, i, list, vm1Var2);
                if (objF != obj) {
                    return objF;
                }
            }
            return obj;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                jzb.q(objK);
                return objK;
            }
            if (i4 == 3) {
                jzb.q(objK);
                return objK;
            }
            if (i4 == 4) {
                jzb.q(objK);
                return objK;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = vm1Var2.I$0;
        list = (List) vm1Var2.L$1;
        rm1Var = (rm1) vm1Var2.L$0;
        jzb.q(objK);
        List list2 = list;
        boolean zBooleanValue = ((Boolean) objK).booleanValue();
        long j = zBooleanValue ? 5000000000L : 1000000000L;
        if (zBooleanValue || i == 0) {
            vm1Var2.L$0 = null;
            vm1Var2.L$1 = null;
            vm1Var2.label = 2;
            Object objD = d(rm1Var, j, i, list2, vm1Var2);
            if (objD != obj) {
                return objD;
            }
        } else {
            vm1Var2.L$0 = null;
            vm1Var2.L$1 = null;
            vm1Var2.label = 3;
            Object objF2 = f(rm1Var, i, list2, vm1Var2);
            if (objF2 != obj) {
                return objF2;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00db  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(rm1 rm1Var, int i, List list, zn2 zn2Var) {
        xm1 xm1Var;
        int i2;
        xn1 xn1Var;
        List listH;
        if (zn2Var instanceof xm1) {
            xm1Var = (xm1) zn2Var;
            int i3 = xm1Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                xm1Var.label = i3 - Integer.MIN_VALUE;
            } else {
                xm1Var = new xm1(this, zn2Var);
            }
        } else {
            xm1Var = new xm1(this, zn2Var);
        }
        Object obj = xm1Var.result;
        int i4 = xm1Var.label;
        if (i4 == 0) {
            jzb.q(obj);
            if (b21.F(3, "CXCP")) {
                Log.d("CXCP", "CapturePipeline#defaultNoFlashCapture");
            }
            i2 = i == 0 ? 1 : 0;
            if (b21.F(3, "CXCP")) {
                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: tasks = " + list);
            }
            if (list.contains(sm1.a)) {
                if (b21.F(3, "CXCP")) {
                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting PRE_CAPTURE");
                }
                if (i2 != 0) {
                    if (b21.F(3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#defaultNoFlashCapture: Locking 3A");
                    }
                    xm1Var.L$0 = this;
                    xm1Var.L$1 = list;
                    xm1Var.L$2 = rm1Var;
                    xm1Var.I$0 = i2;
                    xm1Var.label = 1;
                    Object objL = l(1000000000L, false, xm1Var);
                    bw2 bw2Var = bw2.a;
                    if (objL == bw2Var) {
                        return bw2Var;
                    }
                    xn1Var = this;
                } else {
                    xn1Var = this;
                }
                if (b21.F(3, "CXCP")) {
                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                }
            } else {
                xn1Var = this;
            }
            if (list.contains(sm1.b)) {
                if (b21.F(3, "CXCP")) {
                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                }
                if (rm1Var != null) {
                    qc0.p("Required value was null.");
                    return null;
                }
                listH = xn1Var.n(rm1Var);
                if (b21.F(3, "CXCP")) {
                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                }
            } else {
                listH = t72.H(y7h.b(null));
            }
            if (list.contains(sm1.c)) {
                ynb.V(xn1Var.e.f, null, null, new wm1(listH, null, i2 != 0, this), 3);
            }
            return listH;
        }
        if (i4 != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i5 = xm1Var.I$0;
        rm1 rm1Var2 = (rm1) xm1Var.L$2;
        list = (List) xm1Var.L$1;
        xn1Var = (xn1) xm1Var.L$0;
        jzb.q(obj);
        i2 = i5;
        rm1Var = rm1Var2;
        if (b21.F(3, "CXCP")) {
            Log.d("CXCP", "CapturePipeline#defaultNoFlashCapture: Locking 3A done");
        }
        if (b21.F(3, "CXCP")) {
            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
        }
        if (list.contains(sm1.b)) {
            if (b21.F(3, "CXCP")) {
                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
            }
            if (rm1Var != null) {
                qc0.p("Required value was null.");
                return null;
            }
            listH = xn1Var.n(rm1Var);
            if (b21.F(3, "CXCP")) {
                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
            }
        } else {
            listH = t72.H(y7h.b(null));
        }
        if (list.contains(sm1.c)) {
            ynb.V(xn1Var.e.f, null, null, new wm1(listH, null, i2 != 0, this), 3);
        }
        return listH;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:29:0x006d, please report this as an issue */
    public final Object g(zn2 zn2Var) {
        en1 en1Var;
        xn1 xn1Var;
        if (zn2Var instanceof en1) {
            en1Var = (en1) zn2Var;
            int i = en1Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                en1Var.label = i - Integer.MIN_VALUE;
            } else {
                en1Var = new en1(this, zn2Var);
            }
        } else {
            en1Var = new en1(this, zn2Var);
        }
        Object objR = en1Var.result;
        int i2 = en1Var.label;
        if (i2 == 0) {
            jzb.q(objR);
            if (this.m == null) {
                if (b21.F(3, "CXCP")) {
                    Log.d("CXCP", "getFrameMetadata: waiting for result");
                }
                en1Var.L$0 = this;
                en1Var.label = 1;
                objR = r(1000000000L, new wu0(13), en1Var);
                bw2 bw2Var = bw2.a;
                if (objR == bw2Var) {
                    return bw2Var;
                }
                xn1Var = this;
            }
            if (b21.F(3, "CXCP")) {
                Log.d("CXCP", "getFrameMetadata: frameMetadata = " + this.m);
            }
            return this.m;
        }
        if (i2 != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        xn1Var = (xn1) en1Var.L$0;
        jzb.q(objR);
        uy5 uy5Var = (uy5) objR;
        xn1Var.m = uy5Var != null ? uy5Var.k() : null;
        if (b21.F(3, "CXCP")) {
            Log.d("CXCP", "getFrameMetadata: frameMetadata = " + this.m);
        }
        return this.m;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(List list, int i, int i2, int i3, rm1 rm1Var, zn2 zn2Var) {
        fn1 fn1Var;
        Object objA;
        if (zn2Var instanceof fn1) {
            fn1Var = (fn1) zn2Var;
            int i4 = fn1Var.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                fn1Var.label = i4 - Integer.MIN_VALUE;
            } else {
                fn1Var = new fn1(this, zn2Var);
            }
        } else {
            fn1Var = new fn1(this, zn2Var);
        }
        Object obj = fn1Var.result;
        int i5 = fn1Var.label;
        Object obj2 = bw2.a;
        if (i5 == 0) {
            jzb.q(obj);
            if (b21.F(3, "CXCP")) {
                Log.d("CXCP", "CapturePipeline#invokeCaptureTasks: tasks = " + list + ", captureMode = " + i + ", flashMode = " + i2 + ", flashType = " + i3);
            }
            this.m = null;
            if (list.contains(sm1.b) && rm1Var == null) {
                qc0.p("Must not be null for PipelineType.MAIN_CAPTURE");
                return null;
            }
            if (i2 == 3) {
                fn1Var.label = 1;
                Object objM = m(rm1Var, i, list, fn1Var);
                if (objM != obj2) {
                    return objM;
                }
            } else {
                fn1Var.L$0 = list;
                fn1Var.L$1 = rm1Var;
                fn1Var.I$0 = i;
                fn1Var.I$1 = i2;
                fn1Var.label = 2;
                if (this.l == 3 || i3 == 1) {
                    objA = Boolean.TRUE;
                } else {
                    objA = this.g.a(new jn1(this, null), fn1Var);
                }
                obj = objA;
                if (obj != obj2) {
                }
            }
            return obj2;
        }
        if (i5 == 1) {
            jzb.q(obj);
            return obj;
        }
        if (i5 != 2) {
            if (i5 == 3) {
                jzb.q(obj);
                return obj;
            }
            if (i5 == 4) {
                jzb.q(obj);
                return obj;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i2 = fn1Var.I$1;
        i = fn1Var.I$0;
        rm1Var = (rm1) fn1Var.L$1;
        list = (List) fn1Var.L$0;
        jzb.q(obj);
        List list2 = list;
        rm1 rm1Var2 = rm1Var;
        if (((Boolean) obj).booleanValue()) {
            fn1Var.L$0 = null;
            fn1Var.L$1 = null;
            fn1Var.label = 3;
            Object objP = p(rm1Var2, i, i2, list2, fn1Var);
            if (objP != obj2) {
                return objP;
            }
        } else {
            fn1 fn1Var2 = fn1Var;
            fn1Var2.L$0 = null;
            fn1Var2.L$1 = null;
            fn1Var2.label = 4;
            Object objE = e(rm1Var2, i, i2, list2, fn1Var2);
            if (objE != obj2) {
                return objE;
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0085 A[Catch: all -> 0x008b, TryCatch #2 {all -> 0x008b, blocks: (B:33:0x007c, B:35:0x0085, B:41:0x0094), top: B:58:0x007c }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0092  */
    /* JADX WARN: Code duplicated, block: B:40:0x0093  */
    /* JADX WARN: Code duplicated, block: B:44:0x009f  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a6 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:14:0x0030, B:45:0x00a0, B:47:0x00a6), top: B:56:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(int i, zn2 zn2Var) {
        gn1 gn1Var;
        int i2;
        AutoCloseable autoCloseable;
        Throwable th;
        AutoCloseable autoCloseable2;
        gg1 gg1Var;
        if (zn2Var instanceof gn1) {
            gn1Var = (gn1) zn2Var;
            int i3 = gn1Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gn1Var.label = i3 - Integer.MIN_VALUE;
            } else {
                gn1Var = new gn1(this, zn2Var);
            }
        } else {
            gn1Var = new gn1(this, zn2Var);
        }
        Object objH = gn1Var.result;
        int i4 = gn1Var.label;
        boolean z = true;
        bw2 bw2Var = bw2.a;
        if (i4 == 0) {
            jzb.q(objH);
            gn1Var.I$0 = i;
            gn1Var.label = 1;
            if (this.b.f(gn1Var) != bw2Var) {
            }
            return bw2Var;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                autoCloseable2 = (AutoCloseable) gn1Var.L$0;
                try {
                    jzb.q(objH);
                    if (b21.F(3, "CXCP")) {
                        Log.d("CXCP", "screenFlashPostCapture: Unlocking 3A done");
                    }
                    cgg.t(autoCloseable2, null);
                    return wef.a;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        cgg.t(autoCloseable2, th);
                        throw th3;
                    }
                }
            }
            i2 = gn1Var.I$0;
            jzb.q(objH);
            autoCloseable = (AutoCloseable) objH;
            try {
                gg1Var = (gg1) autoCloseable;
                if (b21.F(3, "CXCP")) {
                    Log.d("CXCP", "screenFlashPostCapture: Unlocking 3A");
                }
                if (i2 == 0) {
                    z = false;
                }
                gn1Var.L$0 = autoCloseable;
                gn1Var.label = 3;
                if (gg1Var.G(z) != bw2Var) {
                    autoCloseable2 = autoCloseable;
                    if (b21.F(3, "CXCP")) {
                        Log.d("CXCP", "screenFlashPostCapture: Unlocking 3A done");
                    }
                    cgg.t(autoCloseable2, null);
                    return wef.a;
                }
                return bw2Var;
            } catch (Throwable th4) {
                th = th4;
                autoCloseable2 = autoCloseable;
                throw th;
            }
        }
        i = gn1Var.I$0;
        jzb.q(objH);
        if (b21.F(3, "CXCP")) {
            Log.d("CXCP", "screenFlashPostCapture: Acquiring session for unlocking 3A");
        }
        yf1 yf1VarA = this.i.a();
        gn1Var.I$0 = i;
        gn1Var.label = 2;
        objH = ((dg1) yf1VarA).h(gn1Var);
        if (objH != bw2Var) {
            i2 = i;
            autoCloseable = (AutoCloseable) objH;
            gg1Var = (gg1) autoCloseable;
            if (b21.F(3, "CXCP")) {
                Log.d("CXCP", "screenFlashPostCapture: Unlocking 3A");
            }
            if (i2 == 0) {
                z = false;
            }
            gn1Var.L$0 = autoCloseable;
            gn1Var.label = 3;
            if (gg1Var.G(z) != bw2Var) {
                autoCloseable2 = autoCloseable;
                if (b21.F(3, "CXCP")) {
                    Log.d("CXCP", "screenFlashPostCapture: Unlocking 3A done");
                }
                cgg.t(autoCloseable2, null);
                return wef.a;
            }
        }
        return bw2Var;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0087 A[Catch: all -> 0x008d, TryCatch #2 {all -> 0x008d, blocks: (B:34:0x007e, B:36:0x0087, B:42:0x0097), top: B:62:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0094  */
    /* JADX WARN: Code duplicated, block: B:41:0x0096  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b0, code lost:
    
        if (r15 == r9) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [xn1] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v15, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(int r14, defpackage.zn2 r15) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xn1.j(int, zn2):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0041  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(int i, zn2 zn2Var) {
        in1 in1Var;
        if (zn2Var instanceof in1) {
            in1Var = (in1) zn2Var;
            int i2 = in1Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                in1Var.label = i2 - Integer.MIN_VALUE;
            } else {
                in1Var = new in1(this, zn2Var);
            }
        } else {
            in1Var = new in1(this, zn2Var);
        }
        Object objG = in1Var.result;
        int i3 = in1Var.label;
        boolean z = false;
        if (i3 == 0) {
            jzb.q(objG);
            if (i == 0) {
                in1Var.label = 1;
                objG = g(in1Var);
                Object obj = bw2.a;
                if (objG == obj) {
                    return obj;
                }
            } else if (i == 1) {
                z = true;
            } else if (i != 2 && i != 3) {
                throw new AssertionError(i);
            }
            return Boolean.valueOf(z);
        }
        if (i3 != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(objG);
        es esVar = (es) objG;
        if (esVar != null) {
            CaptureResult.Key key = CaptureResult.CONTROL_AE_STATE;
            key.getClass();
            Integer num = (Integer) esVar.a.get(key);
            if (num != null && num.intValue() == 4) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00ba A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object l(long j, boolean z, zn2 zn2Var) {
        kn1 kn1Var;
        boolean z2;
        long j2;
        AutoCloseable autoCloseable;
        Throwable th;
        AutoCloseable autoCloseable2;
        gg1 gg1Var;
        xd8 xd8Var;
        bs0 bs0Var;
        Object objH0;
        if (zn2Var instanceof kn1) {
            kn1Var = (kn1) zn2Var;
            int i = kn1Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kn1Var.label = i - Integer.MIN_VALUE;
            } else {
                kn1Var = new kn1(this, zn2Var);
            }
        } else {
            kn1Var = new kn1(this, zn2Var);
        }
        kn1 kn1Var2 = kn1Var;
        Object objH = kn1Var2.result;
        int i2 = kn1Var2.label;
        int i3 = 2;
        bw2 bw2Var = bw2.a;
        try {
            try {
                try {
                    if (i2 == 0) {
                        jzb.q(objH);
                        yf1 yf1VarA = this.i.a();
                        kn1Var2.J$0 = j;
                        z2 = z;
                        kn1Var2.Z$0 = z2;
                        kn1Var2.label = 1;
                        objH = ((dg1) yf1VarA).h(kn1Var2);
                        if (objH != bw2Var) {
                            j2 = j;
                        }
                        return bw2Var;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                jzb.q(objH);
                                return objH;
                            }
                            qc0.p("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        autoCloseable2 = (AutoCloseable) kn1Var2.L$0;
                        try {
                            jzb.q(objH);
                            nu3 nu3Var = (nu3) objH;
                            cgg.t(autoCloseable2, null);
                            kn1Var2.L$0 = null;
                            kn1Var2.label = 3;
                            objH0 = nu3Var.H0(kn1Var2);
                            if (objH0 != bw2Var) {
                                return bw2Var;
                            }
                            return objH0;
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                cgg.t(autoCloseable2, th);
                                throw th3;
                            }
                        }
                    }
                    z2 = kn1Var2.Z$0;
                    j2 = kn1Var2.J$0;
                    jzb.q(objH);
                    if (gg1Var.a.a()) {
                        r82.e(gg1Var, " after close.", "Cannot call lock3A on ");
                        objH = null;
                    } else {
                        objH = gg1Var.c.a(xd8Var, bs0Var, 60, new Long(j2), new Long(1000000000L), kn1Var2);
                    }
                    if (objH != bw2Var) {
                        autoCloseable2 = autoCloseable;
                        nu3 nu3Var2 = (nu3) objH;
                        cgg.t(autoCloseable2, null);
                        kn1Var2.L$0 = null;
                        kn1Var2.label = 3;
                        objH0 = nu3Var2.H0(kn1Var2);
                        if (objH0 != bw2Var) {
                            return objH0;
                        }
                    }
                    return bw2Var;
                } catch (Throwable th4) {
                    th = th4;
                    th = th;
                    autoCloseable2 = autoCloseable;
                    throw th;
                }
                xd8Var = new xd8();
                bs0Var = new bs0(this, z2, i3);
                kn1Var2.L$0 = autoCloseable;
                kn1Var2.label = 2;
            } catch (Throwable th5) {
                th = th5;
            }
            gg1Var = (gg1) autoCloseable;
        } catch (Throwable th6) {
            th = th6;
        }
        autoCloseable = (AutoCloseable) objH;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(rm1 rm1Var, int i, List list, zn2 zn2Var) {
        mn1 mn1Var;
        xn1 xn1Var;
        List listH;
        if (zn2Var instanceof mn1) {
            mn1Var = (mn1) zn2Var;
            int i2 = mn1Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mn1Var.label = i2 - Integer.MIN_VALUE;
            } else {
                mn1Var = new mn1(this, zn2Var);
            }
        } else {
            mn1Var = new mn1(this, zn2Var);
        }
        Object obj = mn1Var.result;
        int i3 = mn1Var.label;
        if (i3 == 0) {
            jzb.q(obj);
            if (b21.F(3, "CXCP")) {
                Log.d("CXCP", "CapturePipeline#screenFlashCapture");
            }
            if (b21.F(3, "CXCP")) {
                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: tasks = " + list);
            }
            if (list.contains(sm1.a)) {
                if (b21.F(3, "CXCP")) {
                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting PRE_CAPTURE");
                }
                mn1Var.L$0 = this;
                mn1Var.L$1 = list;
                mn1Var.L$2 = rm1Var;
                mn1Var.I$0 = i;
                mn1Var.label = 1;
                Object objJ = j(i, mn1Var);
                bw2 bw2Var = bw2.a;
                if (objJ == bw2Var) {
                    return bw2Var;
                }
                xn1Var = this;
            } else {
                xn1Var = this;
            }
            if (list.contains(sm1.b)) {
                if (b21.F(3, "CXCP")) {
                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                }
                if (rm1Var != null) {
                    qc0.p("Required value was null.");
                    return null;
                }
                listH = xn1Var.n(rm1Var);
                if (b21.F(3, "CXCP")) {
                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                }
            } else {
                listH = t72.H(y7h.b(null));
            }
            if (list.contains(sm1.c)) {
                ynb.V(xn1Var.e.f, null, null, new ln1(listH, null, this, i), 3);
            }
            return listH;
        }
        if (i3 != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = mn1Var.I$0;
        rm1Var = (rm1) mn1Var.L$2;
        list = (List) mn1Var.L$1;
        xn1Var = (xn1) mn1Var.L$0;
        jzb.q(obj);
        if (b21.F(3, "CXCP")) {
            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
        }
        if (list.contains(sm1.b)) {
            if (b21.F(3, "CXCP")) {
                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
            }
            if (rm1Var != null) {
                qc0.p("Required value was null.");
                return null;
            }
            listH = xn1Var.n(rm1Var);
            if (b21.F(3, "CXCP")) {
                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
            }
        } else {
            listH = t72.H(y7h.b(null));
        }
        if (list.contains(sm1.c)) {
            ynb.V(xn1Var.e.f, null, null, new ln1(listH, null, this, i), 3);
        }
        return listH;
    }

    public final ArrayList n(rm1 rm1Var) {
        List list = rm1Var.a;
        if (b21.F(3, "CXCP")) {
            Log.d("CXCP", "CapturePipeline#submitRequestInternal; Submitting " + list + " with CameraPipe");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            ctb ctbVarA = null;
            if (!it.hasNext()) {
                break;
            }
            im1 im1Var = (im1) it.next();
            za2 za2Var = new za2();
            arrayList.add(za2Var);
            try {
                ctbVarA = this.a.a(im1Var, rm1Var.b, rm1Var.c, t72.H(new on1(za2Var)));
            } catch (IllegalStateException e) {
                if (b21.F(4, "CXCP")) {
                    Log.i("CXCP", "CapturePipeline#submitRequestInternal: configAdapter.mapToRequest failed!", e);
                }
                za2Var.i0(new jv6(2, "Capture request failed with reason " + e.getMessage(), e));
            }
            if (ctbVarA != null) {
                arrayList2.add(ctbVarA);
            }
        }
        if (arrayList2.isEmpty()) {
            return arrayList;
        }
        ynb.V(this.e.f, null, null, new nn1(null, this, arrayList, arrayList2), 3);
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x026e  */
    /* JADX WARN: Code duplicated, block: B:105:0x027b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0282  */
    /* JADX WARN: Code duplicated, block: B:109:0x028a  */
    /* JADX WARN: Code duplicated, block: B:113:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:116:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:117:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:120:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:125:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:127:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:129:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:131:0x0300  */
    /* JADX WARN: Code duplicated, block: B:132:0x0306  */
    /* JADX WARN: Code duplicated, block: B:134:0x030e  */
    /* JADX WARN: Code duplicated, block: B:137:0x0320  */
    /* JADX WARN: Code duplicated, block: B:139:0x032a  */
    /* JADX WARN: Code duplicated, block: B:140:0x032c  */
    /* JADX WARN: Code duplicated, block: B:142:0x032f  */
    /* JADX WARN: Code duplicated, block: B:143:0x0331  */
    /* JADX WARN: Code duplicated, block: B:146:0x033c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0174  */
    /* JADX WARN: Code duplicated, block: B:60:0x0187  */
    /* JADX WARN: Code duplicated, block: B:62:0x018d  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:78:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0212  */
    /* JADX WARN: Code duplicated, block: B:82:0x0214  */
    /* JADX WARN: Code duplicated, block: B:86:0x0224  */
    /* JADX WARN: Code duplicated, block: B:94:0x0245 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0247 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0249  */
    /* JADX WARN: Code duplicated, block: B:98:0x0250  */
    /* JADX WARN: Instruction removed from duplicated block: B:86:0x0224, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v40 */
    public final Object o(rm1 rm1Var, int i, long j, List list, boolean z, zn2 zn2Var) {
        rn1 rn1Var;
        Throwable th;
        ?? r7;
        int i2;
        rm1 rm1Var2;
        boolean z2;
        int i3;
        List list2;
        xn1 xn1Var;
        int i4;
        boolean z3;
        rm1 rm1Var3;
        long j2;
        List list3;
        int i5;
        int i6;
        rm1 rm1Var4;
        x xVar;
        xn1 xn1Var2;
        Object objH;
        xn1 xn1Var3;
        int i7;
        int i8;
        long j3;
        rm1 rm1Var5;
        List list4;
        AutoCloseable autoCloseable;
        boolean z4;
        boolean z5;
        int i9;
        za2 za2VarH;
        AutoCloseable autoCloseable2;
        xn1 xn1Var4;
        xn1 xn1Var5;
        rm1 rm1Var6;
        List list5;
        fzb fzbVar;
        List listH;
        int i10;
        boolean z6;
        boolean z7;
        int i11 = i;
        if (zn2Var instanceof rn1) {
            rn1Var = (rn1) zn2Var;
            int i12 = rn1Var.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                rn1Var.label = i12 - Integer.MIN_VALUE;
            } else {
                rn1Var = new rn1(this, zn2Var);
            }
        } else {
            rn1Var = new rn1(this, zn2Var);
        }
        Object objH0 = rn1Var.result;
        int i13 = rn1Var.label;
        ?? r8 = 2;
        int i14 = 3;
        bw2 bw2Var = bw2.a;
        try {
            switch (i13) {
                case 0:
                    jzb.q(objH0);
                    if (b21.F(3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#torchApplyCapture");
                    }
                    s0f s0fVar = this.c;
                    Integer num = (Integer) s0fVar.e.d();
                    int i15 = (num != null && num.intValue() == 0) ? 1 : 0;
                    i2 = (i15 != 0 || i11 == 0) ? 1 : 0;
                    if (b21.F(3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: tasks = " + list);
                    }
                    if (list.contains(sm1.a)) {
                        if (b21.F(3, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting PRE_CAPTURE");
                        }
                        if (i15 != 0) {
                            if (b21.F(3, "CXCP")) {
                                Log.d("CXCP", "CapturePipeline#torchApplyCapture: Setting torch");
                            }
                            za2 za2VarC = s0fVar.c(2, true, (6 & 4) == 0);
                            rn1Var.L$0 = this;
                            rn1Var.L$1 = list;
                            rm1Var3 = rm1Var;
                            rn1Var.L$2 = rm1Var3;
                            rn1Var.I$0 = i11;
                            j2 = j;
                            rn1Var.J$0 = j2;
                            rn1Var.Z$0 = z;
                            rn1Var.I$1 = i15;
                            rn1Var.I$2 = i2;
                            rn1Var.label = 1;
                            if (za2VarC.U0(rn1Var) != bw2Var) {
                                list3 = list;
                                i4 = i15;
                                z3 = z;
                                xn1Var = this;
                                if (b21.F(3, "CXCP")) {
                                    Log.d("CXCP", "CapturePipeline#torchApplyCapture: Setting torch done");
                                }
                                if (!z3) {
                                    if (b21.F(3, "CXCP")) {
                                        Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A for capture");
                                    }
                                    yf1 yf1VarA = this.i.a();
                                    rn1Var.L$0 = xn1Var;
                                    rn1Var.L$1 = list3;
                                    rn1Var.L$2 = rm1Var3;
                                    rn1Var.I$0 = i11;
                                    rn1Var.J$0 = j2;
                                    rn1Var.Z$0 = z3;
                                    rn1Var.I$1 = i4;
                                    rn1Var.I$2 = i2;
                                    rn1Var.label = 2;
                                    objH = ((dg1) yf1VarA).h(rn1Var);
                                    if (objH != bw2Var) {
                                        xn1Var3 = xn1Var;
                                        objH0 = objH;
                                        rm1 rm1Var7 = rm1Var3;
                                        i7 = i11;
                                        i8 = i2;
                                        j3 = j2;
                                        rm1Var5 = rm1Var7;
                                        list4 = list3;
                                        autoCloseable = (AutoCloseable) objH0;
                                        try {
                                            gg1 gg1Var = (gg1) autoCloseable;
                                            if (i7 == 0) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            if (i7 == 0) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            rn1Var.L$0 = xn1Var3;
                                            rn1Var.L$1 = list4;
                                            rn1Var.L$2 = rm1Var5;
                                            rn1Var.L$3 = autoCloseable;
                                            rn1Var.I$0 = i7;
                                            rn1Var.Z$0 = z3;
                                            rn1Var.I$1 = i4;
                                            rn1Var.I$2 = i8;
                                            rn1Var.label = 3;
                                            i9 = i8;
                                            za2VarH = gg1.h(gg1Var, z4, z5, j3);
                                            if (za2VarH != bw2Var) {
                                                autoCloseable2 = autoCloseable;
                                                i5 = i7;
                                                xn1Var4 = xn1Var3;
                                                objH0 = za2VarH;
                                                i6 = i9;
                                                rn1Var.L$0 = xn1Var4;
                                                rn1Var.L$1 = list4;
                                                rn1Var.L$2 = rm1Var5;
                                                rn1Var.L$3 = autoCloseable2;
                                                rn1Var.I$0 = i5;
                                                rn1Var.Z$0 = z3;
                                                rn1Var.I$1 = i4;
                                                rn1Var.I$2 = i6;
                                                rn1Var.label = 4;
                                                objH0 = ((nu3) objH0).H0(rn1Var);
                                                if (objH0 == bw2Var) {
                                                    xn1Var5 = xn1Var4;
                                                    rm1Var6 = rm1Var5;
                                                    list5 = list4;
                                                    r8 = autoCloseable2;
                                                    fzbVar = (fzb) objH0;
                                                    cgg.t(r8, null);
                                                    if (b21.F(3, "CXCP")) {
                                                        Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A for capture done, result3A = " + fzbVar);
                                                    }
                                                    xn1Var = xn1Var5;
                                                    rm1Var4 = rm1Var6;
                                                    list2 = list5;
                                                    i14 = 3;
                                                    z2 = true;
                                                    if (b21.F(i14, "CXCP")) {
                                                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                                                    }
                                                    rm1Var2 = rm1Var4;
                                                    i3 = i5;
                                                    i2 = i6;
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            r7 = autoCloseable;
                                            try {
                                                throw th;
                                            } catch (Throwable th3) {
                                                cgg.t(r7, th);
                                                throw th3;
                                            }
                                        }
                                    }
                                } else {
                                    if (i2 == 0) {
                                        i14 = 3;
                                        z2 = true;
                                        int i16 = i2;
                                        i5 = i11;
                                        i6 = i16;
                                        rm1Var4 = rm1Var3;
                                        list2 = list3;
                                    } else if (i11 == 0) {
                                        if (b21.F(3, "CXCP")) {
                                            Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A");
                                        }
                                        rn1Var.L$0 = xn1Var;
                                        rn1Var.L$1 = list3;
                                        rn1Var.L$2 = rm1Var3;
                                        rn1Var.I$0 = i11;
                                        rn1Var.Z$0 = z3;
                                        rn1Var.I$1 = i4;
                                        rn1Var.I$2 = i2;
                                        rn1Var.label = 5;
                                        z2 = true;
                                        if (l(j2, true, rn1Var) != bw2Var) {
                                            int i17 = i2;
                                            i5 = i11;
                                            i6 = i17;
                                            xn1Var2 = xn1Var;
                                            rm1Var4 = rm1Var3;
                                            list2 = list3;
                                            i14 = 3;
                                            if (b21.F(i14, "CXCP")) {
                                                Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A done");
                                            }
                                            xn1Var = xn1Var2;
                                        }
                                    } else {
                                        z2 = true;
                                        if (b21.F(3, "CXCP")) {
                                            Log.d("CXCP", "CapturePipeline#torchApplyCapture: Awaiting 3A convergence");
                                        }
                                        xVar = new x(11, this);
                                        rn1Var.L$0 = xn1Var;
                                        rn1Var.L$1 = list3;
                                        rn1Var.L$2 = rm1Var3;
                                        rn1Var.I$0 = i11;
                                        rn1Var.Z$0 = z3;
                                        rn1Var.I$1 = i4;
                                        rn1Var.I$2 = i2;
                                        rn1Var.label = 6;
                                        if (r(j2, xVar, rn1Var) != bw2Var) {
                                            int i18 = i2;
                                            i5 = i11;
                                            i6 = i18;
                                            xn1Var2 = xn1Var;
                                            rm1Var4 = rm1Var3;
                                            list2 = list3;
                                            i14 = 3;
                                            if (b21.F(i14, "CXCP")) {
                                                Log.d("CXCP", "CapturePipeline#torchApplyCapture: 3A convergence waiting done");
                                            }
                                            xn1Var = xn1Var2;
                                        }
                                    }
                                    if (b21.F(i14, "CXCP")) {
                                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                                    }
                                    rm1Var2 = rm1Var4;
                                    i3 = i5;
                                    i2 = i6;
                                }
                            }
                        } else {
                            rm1Var3 = rm1Var;
                            j2 = j;
                            list3 = list;
                            i4 = i15;
                            z3 = z;
                            xn1Var = this;
                            if (!z3) {
                                if (b21.F(3, "CXCP")) {
                                    Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A for capture");
                                }
                                yf1 yf1VarA2 = this.i.a();
                                rn1Var.L$0 = xn1Var;
                                rn1Var.L$1 = list3;
                                rn1Var.L$2 = rm1Var3;
                                rn1Var.I$0 = i11;
                                rn1Var.J$0 = j2;
                                rn1Var.Z$0 = z3;
                                rn1Var.I$1 = i4;
                                rn1Var.I$2 = i2;
                                rn1Var.label = 2;
                                objH = ((dg1) yf1VarA2).h(rn1Var);
                                if (objH != bw2Var) {
                                    xn1Var3 = xn1Var;
                                    objH0 = objH;
                                    rm1 rm1Var8 = rm1Var3;
                                    i7 = i11;
                                    i8 = i2;
                                    j3 = j2;
                                    rm1Var5 = rm1Var8;
                                    list4 = list3;
                                    autoCloseable = (AutoCloseable) objH0;
                                    gg1 gg1Var2 = (gg1) autoCloseable;
                                    if (i7 == 0) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (i7 == 0) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    rn1Var.L$0 = xn1Var3;
                                    rn1Var.L$1 = list4;
                                    rn1Var.L$2 = rm1Var5;
                                    rn1Var.L$3 = autoCloseable;
                                    rn1Var.I$0 = i7;
                                    rn1Var.Z$0 = z3;
                                    rn1Var.I$1 = i4;
                                    rn1Var.I$2 = i8;
                                    rn1Var.label = 3;
                                    i9 = i8;
                                    za2VarH = gg1.h(gg1Var2, z4, z5, j3);
                                    if (za2VarH != bw2Var) {
                                        autoCloseable2 = autoCloseable;
                                        i5 = i7;
                                        xn1Var4 = xn1Var3;
                                        objH0 = za2VarH;
                                        i6 = i9;
                                        rn1Var.L$0 = xn1Var4;
                                        rn1Var.L$1 = list4;
                                        rn1Var.L$2 = rm1Var5;
                                        rn1Var.L$3 = autoCloseable2;
                                        rn1Var.I$0 = i5;
                                        rn1Var.Z$0 = z3;
                                        rn1Var.I$1 = i4;
                                        rn1Var.I$2 = i6;
                                        rn1Var.label = 4;
                                        objH0 = ((nu3) objH0).H0(rn1Var);
                                        if (objH0 == bw2Var) {
                                            xn1Var5 = xn1Var4;
                                            rm1Var6 = rm1Var5;
                                            list5 = list4;
                                            r8 = autoCloseable2;
                                            fzbVar = (fzb) objH0;
                                            cgg.t(r8, null);
                                            if (b21.F(3, "CXCP")) {
                                                Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A for capture done, result3A = " + fzbVar);
                                            }
                                            xn1Var = xn1Var5;
                                            rm1Var4 = rm1Var6;
                                            list2 = list5;
                                            i14 = 3;
                                            z2 = true;
                                            if (b21.F(i14, "CXCP")) {
                                                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                                            }
                                            rm1Var2 = rm1Var4;
                                            i3 = i5;
                                            i2 = i6;
                                        }
                                    }
                                }
                            } else {
                                if (i2 == 0) {
                                    i14 = 3;
                                    z2 = true;
                                    int i19 = i2;
                                    i5 = i11;
                                    i6 = i19;
                                    rm1Var4 = rm1Var3;
                                    list2 = list3;
                                } else if (i11 == 0) {
                                    if (b21.F(3, "CXCP")) {
                                        Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A");
                                    }
                                    rn1Var.L$0 = xn1Var;
                                    rn1Var.L$1 = list3;
                                    rn1Var.L$2 = rm1Var3;
                                    rn1Var.I$0 = i11;
                                    rn1Var.Z$0 = z3;
                                    rn1Var.I$1 = i4;
                                    rn1Var.I$2 = i2;
                                    rn1Var.label = 5;
                                    z2 = true;
                                    if (l(j2, true, rn1Var) != bw2Var) {
                                        int i110 = i2;
                                        i5 = i11;
                                        i6 = i110;
                                        xn1Var2 = xn1Var;
                                        rm1Var4 = rm1Var3;
                                        list2 = list3;
                                        i14 = 3;
                                        if (b21.F(i14, "CXCP")) {
                                            Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A done");
                                        }
                                        xn1Var = xn1Var2;
                                    }
                                } else {
                                    z2 = true;
                                    if (b21.F(3, "CXCP")) {
                                        Log.d("CXCP", "CapturePipeline#torchApplyCapture: Awaiting 3A convergence");
                                    }
                                    xVar = new x(11, this);
                                    rn1Var.L$0 = xn1Var;
                                    rn1Var.L$1 = list3;
                                    rn1Var.L$2 = rm1Var3;
                                    rn1Var.I$0 = i11;
                                    rn1Var.Z$0 = z3;
                                    rn1Var.I$1 = i4;
                                    rn1Var.I$2 = i2;
                                    rn1Var.label = 6;
                                    if (r(j2, xVar, rn1Var) != bw2Var) {
                                        int i111 = i2;
                                        i5 = i11;
                                        i6 = i111;
                                        xn1Var2 = xn1Var;
                                        rm1Var4 = rm1Var3;
                                        list2 = list3;
                                        i14 = 3;
                                        if (b21.F(i14, "CXCP")) {
                                            Log.d("CXCP", "CapturePipeline#torchApplyCapture: 3A convergence waiting done");
                                        }
                                        xn1Var = xn1Var2;
                                    }
                                }
                                if (b21.F(i14, "CXCP")) {
                                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                                }
                                rm1Var2 = rm1Var4;
                                i3 = i5;
                                i2 = i6;
                            }
                        }
                        return bw2Var;
                    }
                    rm1Var2 = rm1Var;
                    z2 = true;
                    i3 = i11;
                    list2 = list;
                    xn1Var = this;
                    i4 = i15;
                    z3 = z;
                    if (list2.contains(sm1.b)) {
                        if (b21.F(i14, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                        }
                        if (rm1Var2 != null) {
                            qc0.p("Required value was null.");
                            return null;
                        }
                        listH = xn1Var.n(rm1Var2);
                        if (b21.F(i14, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                        }
                    } else {
                        listH = t72.H(y7h.b(null));
                    }
                    if (list2.contains(sm1.c)) {
                        return listH;
                    }
                    qn2 qn2Var = xn1Var.e.f;
                    i10 = i4;
                    List list6 = listH;
                    if (i10 != 0) {
                        z6 = z2;
                    } else {
                        z6 = false;
                    }
                    if (i2 != 0) {
                        z7 = z2;
                    } else {
                        z7 = false;
                    }
                    ynb.V(qn2Var, null, null, new qn1(list6, null, z6, this, z3, z7, i3), 3);
                    return list6;
                case 1:
                    int i20 = rn1Var.I$2;
                    i4 = rn1Var.I$1;
                    z3 = rn1Var.Z$0;
                    j2 = rn1Var.J$0;
                    int i21 = rn1Var.I$0;
                    rm1 rm1Var9 = (rm1) rn1Var.L$2;
                    list3 = (List) rn1Var.L$1;
                    xn1 xn1Var6 = (xn1) rn1Var.L$0;
                    jzb.q(objH0);
                    xn1Var = xn1Var6;
                    i2 = i20;
                    i11 = i21;
                    rm1Var3 = rm1Var9;
                    if (b21.F(3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#torchApplyCapture: Setting torch done");
                    }
                    if (!z3) {
                        if (i2 == 0) {
                            i14 = 3;
                            z2 = true;
                            int i112 = i2;
                            i5 = i11;
                            i6 = i112;
                            rm1Var4 = rm1Var3;
                            list2 = list3;
                        } else if (i11 == 0) {
                            if (b21.F(3, "CXCP")) {
                                Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A");
                            }
                            rn1Var.L$0 = xn1Var;
                            rn1Var.L$1 = list3;
                            rn1Var.L$2 = rm1Var3;
                            rn1Var.I$0 = i11;
                            rn1Var.Z$0 = z3;
                            rn1Var.I$1 = i4;
                            rn1Var.I$2 = i2;
                            rn1Var.label = 5;
                            z2 = true;
                            if (l(j2, true, rn1Var) != bw2Var) {
                                int i113 = i2;
                                i5 = i11;
                                i6 = i113;
                                xn1Var2 = xn1Var;
                                rm1Var4 = rm1Var3;
                                list2 = list3;
                                i14 = 3;
                                if (b21.F(i14, "CXCP")) {
                                    Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A done");
                                }
                                xn1Var = xn1Var2;
                            }
                        } else {
                            z2 = true;
                            if (b21.F(3, "CXCP")) {
                                Log.d("CXCP", "CapturePipeline#torchApplyCapture: Awaiting 3A convergence");
                            }
                            xVar = new x(11, this);
                            rn1Var.L$0 = xn1Var;
                            rn1Var.L$1 = list3;
                            rn1Var.L$2 = rm1Var3;
                            rn1Var.I$0 = i11;
                            rn1Var.Z$0 = z3;
                            rn1Var.I$1 = i4;
                            rn1Var.I$2 = i2;
                            rn1Var.label = 6;
                            if (r(j2, xVar, rn1Var) != bw2Var) {
                                int i114 = i2;
                                i5 = i11;
                                i6 = i114;
                                xn1Var2 = xn1Var;
                                rm1Var4 = rm1Var3;
                                list2 = list3;
                                i14 = 3;
                                if (b21.F(i14, "CXCP")) {
                                    Log.d("CXCP", "CapturePipeline#torchApplyCapture: 3A convergence waiting done");
                                }
                                xn1Var = xn1Var2;
                            }
                        }
                        if (b21.F(i14, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                        }
                        rm1Var2 = rm1Var4;
                        i3 = i5;
                        i2 = i6;
                        if (list2.contains(sm1.b)) {
                            if (b21.F(i14, "CXCP")) {
                                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                            }
                            if (rm1Var2 != null) {
                                qc0.p("Required value was null.");
                                return null;
                            }
                            listH = xn1Var.n(rm1Var2);
                            if (b21.F(i14, "CXCP")) {
                                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                            }
                        } else {
                            listH = t72.H(y7h.b(null));
                        }
                        if (list2.contains(sm1.c)) {
                            return listH;
                        }
                        qn2 qn2Var2 = xn1Var.e.f;
                        i10 = i4;
                        List list7 = listH;
                        if (i10 != 0) {
                            z6 = z2;
                        } else {
                            z6 = false;
                        }
                        if (i2 != 0) {
                            z7 = z2;
                        } else {
                            z7 = false;
                        }
                        ynb.V(qn2Var2, null, null, new qn1(list7, null, z6, this, z3, z7, i3), 3);
                        return list7;
                    }
                    if (b21.F(3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A for capture");
                    }
                    yf1 yf1VarA3 = this.i.a();
                    rn1Var.L$0 = xn1Var;
                    rn1Var.L$1 = list3;
                    rn1Var.L$2 = rm1Var3;
                    rn1Var.I$0 = i11;
                    rn1Var.J$0 = j2;
                    rn1Var.Z$0 = z3;
                    rn1Var.I$1 = i4;
                    rn1Var.I$2 = i2;
                    rn1Var.label = 2;
                    objH = ((dg1) yf1VarA3).h(rn1Var);
                    if (objH != bw2Var) {
                        xn1Var3 = xn1Var;
                        objH0 = objH;
                        rm1 rm1Var10 = rm1Var3;
                        i7 = i11;
                        i8 = i2;
                        j3 = j2;
                        rm1Var5 = rm1Var10;
                        list4 = list3;
                        autoCloseable = (AutoCloseable) objH0;
                        gg1 gg1Var3 = (gg1) autoCloseable;
                        if (i7 == 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (i7 == 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        rn1Var.L$0 = xn1Var3;
                        rn1Var.L$1 = list4;
                        rn1Var.L$2 = rm1Var5;
                        rn1Var.L$3 = autoCloseable;
                        rn1Var.I$0 = i7;
                        rn1Var.Z$0 = z3;
                        rn1Var.I$1 = i4;
                        rn1Var.I$2 = i8;
                        rn1Var.label = 3;
                        i9 = i8;
                        za2VarH = gg1.h(gg1Var3, z4, z5, j3);
                        if (za2VarH != bw2Var) {
                            autoCloseable2 = autoCloseable;
                            i5 = i7;
                            xn1Var4 = xn1Var3;
                            objH0 = za2VarH;
                            i6 = i9;
                            rn1Var.L$0 = xn1Var4;
                            rn1Var.L$1 = list4;
                            rn1Var.L$2 = rm1Var5;
                            rn1Var.L$3 = autoCloseable2;
                            rn1Var.I$0 = i5;
                            rn1Var.Z$0 = z3;
                            rn1Var.I$1 = i4;
                            rn1Var.I$2 = i6;
                            rn1Var.label = 4;
                            objH0 = ((nu3) objH0).H0(rn1Var);
                            if (objH0 == bw2Var) {
                                xn1Var5 = xn1Var4;
                                rm1Var6 = rm1Var5;
                                list5 = list4;
                                r8 = autoCloseable2;
                                fzbVar = (fzb) objH0;
                                cgg.t(r8, null);
                                if (b21.F(3, "CXCP")) {
                                    Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A for capture done, result3A = " + fzbVar);
                                }
                                xn1Var = xn1Var5;
                                rm1Var4 = rm1Var6;
                                list2 = list5;
                                i14 = 3;
                                z2 = true;
                                if (b21.F(i14, "CXCP")) {
                                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                                }
                                rm1Var2 = rm1Var4;
                                i3 = i5;
                                i2 = i6;
                                if (list2.contains(sm1.b)) {
                                    if (b21.F(i14, "CXCP")) {
                                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                                    }
                                    if (rm1Var2 != null) {
                                        qc0.p("Required value was null.");
                                        return null;
                                    }
                                    listH = xn1Var.n(rm1Var2);
                                    if (b21.F(i14, "CXCP")) {
                                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                                    }
                                } else {
                                    listH = t72.H(y7h.b(null));
                                }
                                if (list2.contains(sm1.c)) {
                                    return listH;
                                }
                                qn2 qn2Var3 = xn1Var.e.f;
                                i10 = i4;
                                List list8 = listH;
                                if (i10 != 0) {
                                    z6 = z2;
                                } else {
                                    z6 = false;
                                }
                                if (i2 != 0) {
                                    z7 = z2;
                                } else {
                                    z7 = false;
                                }
                                ynb.V(qn2Var3, null, null, new qn1(list8, null, z6, this, z3, z7, i3), 3);
                                return list8;
                            }
                        }
                    }
                    return bw2Var;
                case 2:
                    i8 = rn1Var.I$2;
                    i4 = rn1Var.I$1;
                    z3 = rn1Var.Z$0;
                    j3 = rn1Var.J$0;
                    i7 = rn1Var.I$0;
                    rm1Var5 = (rm1) rn1Var.L$2;
                    list4 = (List) rn1Var.L$1;
                    xn1Var3 = (xn1) rn1Var.L$0;
                    jzb.q(objH0);
                    autoCloseable = (AutoCloseable) objH0;
                    gg1 gg1Var4 = (gg1) autoCloseable;
                    if (i7 == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (i7 == 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    rn1Var.L$0 = xn1Var3;
                    rn1Var.L$1 = list4;
                    rn1Var.L$2 = rm1Var5;
                    rn1Var.L$3 = autoCloseable;
                    rn1Var.I$0 = i7;
                    rn1Var.Z$0 = z3;
                    rn1Var.I$1 = i4;
                    rn1Var.I$2 = i8;
                    rn1Var.label = 3;
                    i9 = i8;
                    za2VarH = gg1.h(gg1Var4, z4, z5, j3);
                    if (za2VarH != bw2Var) {
                        autoCloseable2 = autoCloseable;
                        i5 = i7;
                        xn1Var4 = xn1Var3;
                        objH0 = za2VarH;
                        i6 = i9;
                        rn1Var.L$0 = xn1Var4;
                        rn1Var.L$1 = list4;
                        rn1Var.L$2 = rm1Var5;
                        rn1Var.L$3 = autoCloseable2;
                        rn1Var.I$0 = i5;
                        rn1Var.Z$0 = z3;
                        rn1Var.I$1 = i4;
                        rn1Var.I$2 = i6;
                        rn1Var.label = 4;
                        objH0 = ((nu3) objH0).H0(rn1Var);
                        if (objH0 == bw2Var) {
                            xn1Var5 = xn1Var4;
                            rm1Var6 = rm1Var5;
                            list5 = list4;
                            r8 = autoCloseable2;
                            fzbVar = (fzb) objH0;
                            cgg.t(r8, null);
                            if (b21.F(3, "CXCP")) {
                                Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A for capture done, result3A = " + fzbVar);
                            }
                            xn1Var = xn1Var5;
                            rm1Var4 = rm1Var6;
                            list2 = list5;
                            i14 = 3;
                            z2 = true;
                            if (b21.F(i14, "CXCP")) {
                                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                            }
                            rm1Var2 = rm1Var4;
                            i3 = i5;
                            i2 = i6;
                            if (list2.contains(sm1.b)) {
                                if (b21.F(i14, "CXCP")) {
                                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                                }
                                if (rm1Var2 != null) {
                                    qc0.p("Required value was null.");
                                    return null;
                                }
                                listH = xn1Var.n(rm1Var2);
                                if (b21.F(i14, "CXCP")) {
                                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                                }
                            } else {
                                listH = t72.H(y7h.b(null));
                            }
                            if (list2.contains(sm1.c)) {
                                return listH;
                            }
                            qn2 qn2Var4 = xn1Var.e.f;
                            i10 = i4;
                            List list9 = listH;
                            if (i10 != 0) {
                                z6 = z2;
                            } else {
                                z6 = false;
                            }
                            if (i2 != 0) {
                                z7 = z2;
                            } else {
                                z7 = false;
                            }
                            ynb.V(qn2Var4, null, null, new qn1(list9, null, z6, this, z3, z7, i3), 3);
                            return list9;
                        }
                    }
                    return bw2Var;
                case 3:
                    i6 = rn1Var.I$2;
                    i4 = rn1Var.I$1;
                    z3 = rn1Var.Z$0;
                    i5 = rn1Var.I$0;
                    AutoCloseable autoCloseable3 = (AutoCloseable) rn1Var.L$3;
                    rm1Var5 = (rm1) rn1Var.L$2;
                    list4 = (List) rn1Var.L$1;
                    xn1Var4 = (xn1) rn1Var.L$0;
                    jzb.q(objH0);
                    autoCloseable2 = autoCloseable3;
                    rn1Var.L$0 = xn1Var4;
                    rn1Var.L$1 = list4;
                    rn1Var.L$2 = rm1Var5;
                    rn1Var.L$3 = autoCloseable2;
                    rn1Var.I$0 = i5;
                    rn1Var.Z$0 = z3;
                    rn1Var.I$1 = i4;
                    rn1Var.I$2 = i6;
                    rn1Var.label = 4;
                    objH0 = ((nu3) objH0).H0(rn1Var);
                    if (objH0 == bw2Var) {
                        return bw2Var;
                    }
                    xn1Var5 = xn1Var4;
                    rm1Var6 = rm1Var5;
                    list5 = list4;
                    r8 = autoCloseable2;
                    fzbVar = (fzb) objH0;
                    cgg.t(r8, null);
                    if (b21.F(3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A for capture done, result3A = " + fzbVar);
                    }
                    xn1Var = xn1Var5;
                    rm1Var4 = rm1Var6;
                    list2 = list5;
                    i14 = 3;
                    z2 = true;
                    if (b21.F(i14, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                    }
                    rm1Var2 = rm1Var4;
                    i3 = i5;
                    i2 = i6;
                    if (list2.contains(sm1.b)) {
                        if (b21.F(i14, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                        }
                        if (rm1Var2 != null) {
                            qc0.p("Required value was null.");
                            return null;
                        }
                        listH = xn1Var.n(rm1Var2);
                        if (b21.F(i14, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                        }
                    } else {
                        listH = t72.H(y7h.b(null));
                    }
                    if (list2.contains(sm1.c)) {
                        return listH;
                    }
                    qn2 qn2Var5 = xn1Var.e.f;
                    i10 = i4;
                    List list10 = listH;
                    if (i10 != 0) {
                        z6 = z2;
                    } else {
                        z6 = false;
                    }
                    if (i2 != 0) {
                        z7 = z2;
                    } else {
                        z7 = false;
                    }
                    ynb.V(qn2Var5, null, null, new qn1(list10, null, z6, this, z3, z7, i3), 3);
                    return list10;
                case 4:
                    i6 = rn1Var.I$2;
                    i4 = rn1Var.I$1;
                    z3 = rn1Var.Z$0;
                    i5 = rn1Var.I$0;
                    AutoCloseable autoCloseable4 = (AutoCloseable) rn1Var.L$3;
                    rm1Var6 = (rm1) rn1Var.L$2;
                    list5 = (List) rn1Var.L$1;
                    xn1Var5 = (xn1) rn1Var.L$0;
                    jzb.q(objH0);
                    r8 = autoCloseable4;
                    fzbVar = (fzb) objH0;
                    cgg.t(r8, null);
                    if (b21.F(3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A for capture done, result3A = " + fzbVar);
                    }
                    xn1Var = xn1Var5;
                    rm1Var4 = rm1Var6;
                    list2 = list5;
                    i14 = 3;
                    z2 = true;
                    if (b21.F(i14, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                    }
                    rm1Var2 = rm1Var4;
                    i3 = i5;
                    i2 = i6;
                    if (list2.contains(sm1.b)) {
                        if (b21.F(i14, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                        }
                        if (rm1Var2 != null) {
                            qc0.p("Required value was null.");
                            return null;
                        }
                        listH = xn1Var.n(rm1Var2);
                        if (b21.F(i14, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                        }
                    } else {
                        listH = t72.H(y7h.b(null));
                    }
                    if (list2.contains(sm1.c)) {
                        return listH;
                    }
                    qn2 qn2Var6 = xn1Var.e.f;
                    i10 = i4;
                    List list11 = listH;
                    if (i10 != 0) {
                        z6 = z2;
                    } else {
                        z6 = false;
                    }
                    if (i2 != 0) {
                        z7 = z2;
                    } else {
                        z7 = false;
                    }
                    ynb.V(qn2Var6, null, null, new qn1(list11, null, z6, this, z3, z7, i3), 3);
                    return list11;
                case 5:
                    i6 = rn1Var.I$2;
                    i4 = rn1Var.I$1;
                    z3 = rn1Var.Z$0;
                    i5 = rn1Var.I$0;
                    rm1Var4 = (rm1) rn1Var.L$2;
                    list2 = (List) rn1Var.L$1;
                    xn1Var2 = (xn1) rn1Var.L$0;
                    jzb.q(objH0);
                    z2 = true;
                    if (b21.F(i14, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A done");
                    }
                    xn1Var = xn1Var2;
                    if (b21.F(i14, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                    }
                    rm1Var2 = rm1Var4;
                    i3 = i5;
                    i2 = i6;
                    if (list2.contains(sm1.b)) {
                        if (b21.F(i14, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                        }
                        if (rm1Var2 != null) {
                            qc0.p("Required value was null.");
                            return null;
                        }
                        listH = xn1Var.n(rm1Var2);
                        if (b21.F(i14, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                        }
                    } else {
                        listH = t72.H(y7h.b(null));
                    }
                    if (list2.contains(sm1.c)) {
                        return listH;
                    }
                    qn2 qn2Var7 = xn1Var.e.f;
                    i10 = i4;
                    List list12 = listH;
                    if (i10 != 0) {
                        z6 = z2;
                    } else {
                        z6 = false;
                    }
                    if (i2 != 0) {
                        z7 = z2;
                    } else {
                        z7 = false;
                    }
                    ynb.V(qn2Var7, null, null, new qn1(list12, null, z6, this, z3, z7, i3), 3);
                    return list12;
                case 6:
                    i6 = rn1Var.I$2;
                    i4 = rn1Var.I$1;
                    z3 = rn1Var.Z$0;
                    i5 = rn1Var.I$0;
                    rm1Var4 = (rm1) rn1Var.L$2;
                    list2 = (List) rn1Var.L$1;
                    xn1Var2 = (xn1) rn1Var.L$0;
                    jzb.q(objH0);
                    z2 = true;
                    if (b21.F(i14, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#torchApplyCapture: 3A convergence waiting done");
                    }
                    xn1Var = xn1Var2;
                    if (b21.F(i14, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                    }
                    rm1Var2 = rm1Var4;
                    i3 = i5;
                    i2 = i6;
                    if (list2.contains(sm1.b)) {
                        if (b21.F(i14, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                        }
                        if (rm1Var2 != null) {
                            qc0.p("Required value was null.");
                            return null;
                        }
                        listH = xn1Var.n(rm1Var2);
                        if (b21.F(i14, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                        }
                    } else {
                        listH = t72.H(y7h.b(null));
                    }
                    if (list2.contains(sm1.c)) {
                        return listH;
                    }
                    qn2 qn2Var8 = xn1Var.e.f;
                    i10 = i4;
                    List list13 = listH;
                    if (i10 != 0) {
                        z6 = z2;
                    } else {
                        z6 = false;
                    }
                    if (i2 != 0) {
                        z7 = z2;
                    } else {
                        z7 = false;
                    }
                    ynb.V(qn2Var8, null, null, new qn1(list13, null, z6, this, z3, z7, i3), 3);
                    return list13;
                default:
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (Throwable th4) {
            th = th4;
            r7 = r8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object p(rm1 rm1Var, int i, int i2, List list, zn2 zn2Var) {
        sn1 sn1Var;
        Object objF;
        boolean z;
        if (zn2Var instanceof sn1) {
            sn1Var = (sn1) zn2Var;
            int i3 = sn1Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sn1Var.label = i3 - Integer.MIN_VALUE;
            } else {
                sn1Var = new sn1(this, zn2Var);
            }
        } else {
            sn1Var = new sn1(this, zn2Var);
        }
        sn1 sn1Var2 = sn1Var;
        Object objK = sn1Var2.result;
        Object obj = bw2.a;
        int i4 = sn1Var2.label;
        if (i4 == 0) {
            jzb.q(objK);
            if (b21.F(3, "CXCP")) {
                Log.d("CXCP", "CapturePipeline#torchAsFlashCapture");
            }
            if (((Boolean) this.j.getValue()).booleanValue()) {
                sn1Var2.L$0 = rm1Var;
                sn1Var2.L$1 = list;
                sn1Var2.I$0 = i;
                sn1Var2.label = 1;
                objK = k(i2, sn1Var2);
                if (objK != obj) {
                }
            } else {
                sn1Var2.L$0 = null;
                sn1Var2.L$1 = null;
                sn1Var2.label = 3;
                objF = f(rm1Var, i, list, sn1Var2);
                if (objF == obj) {
                    return objF;
                }
            }
            return obj;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                jzb.q(objK);
                return objK;
            }
            if (i4 == 3) {
                jzb.q(objK);
                return objK;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = sn1Var2.I$0;
        list = (List) sn1Var2.L$1;
        rm1Var = (rm1) sn1Var2.L$0;
        jzb.q(objK);
        if (((Boolean) objK).booleanValue()) {
            if (!this.g.e()) {
                int i5 = this.d.a.a;
                if (b21.F(3, "CXCP")) {
                    Log.d("CXCP", "isInVideoUsage: videoUsage = " + i5);
                }
                z = i5 <= 0;
            }
            boolean z2 = z;
            sn1Var2.L$0 = null;
            sn1Var2.L$1 = null;
            sn1Var2.label = 2;
            Object objO = o(rm1Var, i, 5000000000L, list, z2, sn1Var2);
            if (objO != obj) {
                return objO;
            }
        } else {
            sn1Var2.L$0 = null;
            sn1Var2.L$1 = null;
            sn1Var2.label = 3;
            objF = f(rm1Var, i, list, sn1Var2);
            if (objF == obj) {
                return objF;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [xn1] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.AutoCloseable] */
    public final Object q(long j, zn2 zn2Var) {
        tn1 tn1Var;
        Object objH0;
        if (zn2Var instanceof tn1) {
            tn1Var = (tn1) zn2Var;
            int i = tn1Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tn1Var.label = i - Integer.MIN_VALUE;
            } else {
                tn1Var = new tn1(this, zn2Var);
            }
        } else {
            tn1Var = new tn1(this, zn2Var);
        }
        Object objH = tn1Var.result;
        int i2 = tn1Var.label;
        bw2 bw2Var = bw2.a;
        try {
            if (i2 == 0) {
                jzb.q(objH);
                yf1 yf1VarA = this.i.a();
                tn1Var.J$0 = j;
                tn1Var.label = 1;
                objH = ((dg1) yf1VarA).h(tn1Var);
                if (objH != bw2Var) {
                }
                return bw2Var;
            }
            if (i2 == 1) {
                j = tn1Var.J$0;
                jzb.q(objH);
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        jzb.q(objH);
                        return objH;
                    }
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AutoCloseable autoCloseable = (AutoCloseable) tn1Var.L$0;
                jzb.q(objH);
                this = autoCloseable;
            }
            nu3 nu3Var = (nu3) objH;
            cgg.t(this, null);
            tn1Var.L$0 = null;
            tn1Var.label = 3;
            objH0 = nu3Var.H0(tn1Var);
            if (objH0 != bw2Var) {
                return bw2Var;
            }
            return objH0;
            AutoCloseable autoCloseable2 = (AutoCloseable) objH;
            tn1Var.L$0 = autoCloseable2;
            tn1Var.label = 2;
            objH = gg1.E((gg1) autoCloseable2, j, 29);
            this = autoCloseable2;
            if (objH != bw2Var) {
                nu3 nu3Var2 = (nu3) objH;
                cgg.t(this, null);
                tn1Var.L$0 = null;
                tn1Var.label = 3;
                objH0 = nu3Var2.H0(tn1Var);
                if (objH0 != bw2Var) {
                    return objH0;
                }
            }
            return bw2Var;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                cgg.t(this, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(long j, a26 a26Var, zn2 zn2Var) {
        un1 un1Var;
        kzb kzbVar;
        if (zn2Var instanceof un1) {
            un1Var = (un1) zn2Var;
            int i = un1Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                un1Var.label = i - Integer.MIN_VALUE;
            } else {
                un1Var = new un1(this, zn2Var);
            }
        } else {
            un1Var = new un1(this, zn2Var);
        }
        Object obj = un1Var.result;
        int i2 = un1Var.label;
        w92 w92Var = this.f;
        if (i2 == 0) {
            jzb.q(obj);
            kzb kzbVar2 = new kzb(j, a26Var);
            lkf lkfVar = this.e;
            w92Var.a(kzbVar2, lkfVar.e);
            ynb.V(lkfVar.f, null, null, new wn1(kzbVar2, this, null), 3);
            vn1 vn1Var = new vn1(kzbVar2, null);
            un1Var.L$0 = kzbVar2;
            un1Var.label = 1;
            Object objS = rs0.S(j / 1000000, vn1Var, un1Var);
            bw2 bw2Var = bw2.a;
            if (objS == bw2Var) {
                return bw2Var;
            }
            obj = objS;
            kzbVar = kzbVar2;
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kzbVar = (kzb) un1Var.L$0;
            jzb.q(obj);
        }
        if (((uy5) obj) == null) {
            w92Var.b(kzbVar);
        }
        return obj;
    }
}
