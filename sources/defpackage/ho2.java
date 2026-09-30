package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ho2 {
    public static final List f;
    public static final List g;
    public static final List h;
    public static final List i;
    public static final List j;
    public static final List k;
    public static final Map l;
    public static final Map m;
    public static final Map n;
    public static final Map o;
    public static final za2 p;
    public static final List q;
    public static final List r;
    public static final List s;
    public static final Map t;
    public static final Map u;
    public static final xq2 v;
    public final ud6 a;
    public final yg1 b;
    public final de6 c;
    public final y88 d;
    public za2 e;

    static {
        t72.I(2, 4, 3);
        t72.I(2, 3);
        f = t72.I(2, 6, 4, 5);
        g = t72.H(3);
        h = t72.H(3);
        i = t72.I(4, 5);
        j = t72.I(2, 4, 3);
        k = t72.I(2, 3);
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
        l = bm8.G(new iy9(key, 1));
        m = bm8.G(new iy9(key, 2));
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
        n = bm8.G(new iy9(key2, 1));
        o = bm8.H(new iy9(key, 1), new iy9(key2, 1));
        p = y7h.b(new fzb(4, null));
        q = t72.I(0, 1, 2, 4);
        List listI = t72.I(0, 3, 1, 2, 6);
        r = listI;
        s = t72.I(0, 1, 2);
        CaptureRequest.Key key3 = CaptureRequest.CONTROL_AE_LOCK;
        Boolean bool = Boolean.TRUE;
        bm8.G(new iy9(key3, bool));
        bm8.H(new iy9(key, 2), new iy9(key3, bool));
        bm8.G(new iy9(key3, Boolean.FALSE));
        t = bm8.G(new iy9(key2, 2));
        u = bm8.H(new iy9(key, 2), new iy9(key2, 2));
        v = new xq2(1, bm8.G(new iy9(CaptureResult.CONTROL_AF_STATE, listI)));
    }

    public ho2(ud6 ud6Var, yg1 yg1Var, de6 de6Var, y88 y88Var) {
        ud6Var.getClass();
        yg1Var.getClass();
        de6Var.getClass();
        y88Var.getClass();
        this.a = ud6Var;
        this.b = yg1Var;
        this.c = de6Var;
        this.d = y88Var;
    }

    public static za2 b(ho2 ho2Var, th thVar, uh uhVar, vr0 vr0Var, yi5 yi5Var, List list, List list2, List list3, int i2) {
        uh uhVar2 = (i2 & 2) != 0 ? null : uhVar;
        vr0 vr0Var2 = (i2 & 4) != 0 ? null : vr0Var;
        yi5 yi5Var2 = (i2 & 8) != 0 ? null : yi5Var;
        List list4 = (i2 & 16) != 0 ? null : list;
        List list5 = (i2 & 32) != 0 ? null : list2;
        List list6 = (i2 & 64) != 0 ? null : list3;
        if (ho2Var.a.c.l() == null) {
            de6.b(ho2Var.c, thVar, uhVar2, vr0Var2, yi5Var2, list4, list5, list6, null, null, null, 896);
            ho2Var.a.f(ho2Var.c.a());
            return p;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (thVar != null) {
            int i3 = thVar.a;
            CaptureResult.Key key = CaptureResult.CONTROL_AE_MODE;
            key.getClass();
        }
        if (uhVar2 != null) {
            int i4 = uhVar2.a;
            CaptureResult.Key key2 = CaptureResult.CONTROL_AF_MODE;
            key2.getClass();
        }
        if (vr0Var2 != null) {
            int i5 = vr0Var2.a;
            CaptureResult.Key key3 = CaptureResult.CONTROL_AWB_MODE;
            key3.getClass();
        }
        if (yi5Var2 != null) {
            int i6 = yi5Var2.a;
            CaptureResult.Key key4 = CaptureResult.FLASH_MODE;
            key4.getClass();
        }
        gzb gzbVar = new gzb(bm8.X(linkedHashMap));
        y88 y88Var = ho2Var.d;
        y88Var.getClass();
        y88Var.a.add(gzbVar);
        de6.b(ho2Var.c, thVar, uhVar2, vr0Var2, yi5Var2, list4, list5, list6, null, null, null, 896);
        ho2Var.a.f(ho2Var.c.a());
        za2 za2Var = gzbVar.d;
        synchronized (ho2Var) {
            try {
                Log.d("CXCP", "Controller3A#update3A: cancelling previous request " + ho2Var.e);
                za2 za2Var2 = ho2Var.e;
                if (za2Var2 != null) {
                    CancellationException cancellationException = new CancellationException("A newer call for 3A state update initiated.");
                    cancellationException.initCause(null);
                    za2Var2.h(cancellationException);
                }
                ho2Var.e = za2Var;
            } catch (Throwable th) {
                throw th;
            }
        }
        return za2Var;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:104:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:60:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:62:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:63:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:65:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:66:0x01df  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:69:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:71:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:79:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Code duplicated, block: B:81:0x0203  */
    /* JADX WARN: Code duplicated, block: B:83:0x020c  */
    /* JADX WARN: Code duplicated, block: B:89:0x021e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x0220  */
    /* JADX WARN: Code duplicated, block: B:91:0x0227  */
    /* JADX WARN: Code duplicated, block: B:94:0x0277  */
    /* JADX WARN: Code duplicated, block: B:96:0x027b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x027d  */
    /* JADX WARN: Code duplicated, block: B:98:0x02aa  */
    public final Object a(xd8 xd8Var, bs0 bs0Var, int i2, Long l2, Long l3, zn2 zn2Var) throws Throwable {
        go2 go2Var;
        mmb mmbVarD;
        es esVar;
        Long l4;
        xd8 xd8Var2;
        xd8 xd8Var3;
        a26 a26Var;
        th thVar;
        a26 xq2Var;
        gzb gzbVar;
        xd8 xd8Var4;
        th thVar2;
        Map linkedHashMap;
        xd8 xd8Var5;
        Integer num;
        Boolean bool;
        Boolean bool2;
        boolean z;
        boolean z2;
        boolean z3;
        Map linkedHashMap2;
        a26 xq2Var2;
        za2 za2Var;
        th thVar3;
        int i3 = i2;
        y88 y88Var = this.d;
        qu4 qu4Var = qu4.a;
        za2 za2Var2 = p;
        de6 de6Var = this.c;
        ud6 ud6Var = this.a;
        if (zn2Var instanceof go2) {
            go2Var = (go2) zn2Var;
            int i4 = go2Var.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                go2Var.label = i4 - Integer.MIN_VALUE;
            } else {
                go2Var = new go2(this, zn2Var);
            }
        } else {
            go2Var = new go2(this, zn2Var);
        }
        Object objS = go2Var.result;
        bw2 bw2Var = bw2.a;
        int i5 = go2Var.label;
        if (i5 == 0) {
            mmbVarD = ks0.d(objS);
            mmbVarD.element = xd8Var;
            xg1 xg1Var = yg1.o;
            yg1 yg1Var = this.b;
            xg1Var.getClass();
            if (xg1.a(yg1Var)) {
                esVar = null;
            } else {
                esVar = null;
                mmbVarD.element = null;
            }
            if (mmbVarD.element == null) {
                return y7h.b(new fzb(0, esVar));
            }
            de6.b(this.c, null, null, null, null, null, null, null, null, null, null, 911);
            ud6Var.f(de6Var.a());
            if (ud6Var.c.l() == null) {
                return za2Var2;
            }
            Object obj = mmbVarD.element;
            if (((xd8) obj) != null) {
                if (bs0Var == null) {
                    boolean z4 = ((xd8) obj) != null;
                    if (z4) {
                        linkedHashMap = new LinkedHashMap();
                        if (z4) {
                            linkedHashMap.put(CaptureResult.CONTROL_AF_STATE, f);
                        }
                    } else {
                        linkedHashMap = qu4Var;
                    }
                    xq2Var = new xq2(1, linkedHashMap);
                } else {
                    xq2Var = bs0Var;
                }
                gzb gzbVar2 = new gzb(xq2Var, new Integer(i3), l2);
                y88Var.getClass();
                y88Var.a.add(gzbVar2);
                ud6Var.f(de6Var.a());
                StringBuilder sb = new StringBuilder("lock3A - waiting for");
                sb.append("");
                sb.append(((xd8) mmbVarD.element) != null ? " af" : "");
                sb.append("");
                sb.append(" to converge before locking them.");
                Log.d("CXCP", sb.toString());
                za2 za2Var3 = gzbVar2.d;
                go2Var.L$0 = null;
                go2Var.L$1 = null;
                go2Var.L$2 = null;
                go2Var.L$3 = null;
                l4 = l3;
                go2Var.L$4 = l4;
                go2Var.L$5 = mmbVarD;
                go2Var.L$6 = gzbVar2;
                go2Var.I$0 = i3;
                go2Var.label = 1;
                objS = za2Var3.s(go2Var);
                if (objS == bw2Var) {
                    return bw2Var;
                }
                gzbVar = gzbVar2;
                xd8Var4 = null;
                xd8Var3 = null;
                thVar2 = null;
                a26Var = null;
            } else {
                l4 = l3;
                qu4Var = qu4Var;
                za2Var2 = za2Var2;
                xd8Var2 = null;
                xd8Var3 = null;
                a26Var = null;
                thVar = null;
            }
            xd8Var5 = (xd8) mmbVarD.element;
            num = new Integer(i3);
            if (xd8Var2 == null) {
                bool = null;
            } else {
                bool = Boolean.TRUE;
            }
            if (xd8Var3 == null) {
                bool2 = null;
            } else {
                bool2 = Boolean.TRUE;
            }
            if (bool != null) {
                z = true;
            } else {
                z = false;
            }
            if (xd8Var5 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bool2 != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z || z2 || z3) {
                linkedHashMap2 = new LinkedHashMap();
                if (z) {
                    linkedHashMap2.put(CaptureResult.CONTROL_AE_STATE, g);
                }
                if (z2) {
                    linkedHashMap2.put(CaptureResult.CONTROL_AF_STATE, i);
                }
                if (z3) {
                    linkedHashMap2.put(CaptureResult.CONTROL_AWB_STATE, h);
                }
            } else {
                linkedHashMap2 = qu4Var;
            }
            if (a26Var == null || !linkedHashMap2.isEmpty()) {
                if (a26Var == null) {
                    xq2Var2 = new xq2(1, linkedHashMap2);
                } else {
                    xq2Var2 = a26Var;
                }
                gzb gzbVar3 = new gzb(xq2Var2, num, l4);
                y88Var.getClass();
                y88Var.a.add(gzbVar3);
                de6.b(this.c, null, null, null, null, null, null, null, bool, null, bool2, 383);
                Log.d("CXCP", "lock3A - submitting request with aeLock=" + bool + " , awbLock=" + bool2);
                ud6Var.f(de6Var.a());
                za2Var = gzbVar3.d;
            } else {
                za2Var = null;
            }
            if (xd8Var5 == null) {
                za2Var.getClass();
                return za2Var;
            }
            if (thVar != null) {
                th thVar4 = ((k0e) de6Var.a.a).a;
                de6.b(this.c, thVar, null, null, null, null, null, null, null, null, null, 1022);
                ud6Var.f(de6Var.a());
                thVar3 = thVar4;
            } else {
                thVar3 = null;
            }
            Log.d("CXCP", "lock3A - submitting a request to lock af.");
            if (!ud6Var.e(l)) {
                return za2Var2;
            }
            de6.b(this.c, null, null, null, null, null, null, null, null, Boolean.TRUE, null, 767);
            if (thVar3 != null) {
                de6.b(this.c, thVar3, null, null, null, null, null, null, null, null, null, 1022);
                ud6Var.f(de6Var.a());
            }
            za2Var.getClass();
            return za2Var;
        }
        if (i5 != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i3 = go2Var.I$0;
        gzbVar = (gzb) go2Var.L$6;
        mmbVarD = (mmb) go2Var.L$5;
        l4 = (Long) go2Var.L$4;
        a26 a26Var2 = (a26) go2Var.L$3;
        thVar2 = (th) go2Var.L$2;
        xd8Var3 = (xd8) go2Var.L$1;
        xd8Var4 = (xd8) go2Var.L$0;
        jzb.q(objS);
        a26Var = a26Var2;
        fzb fzbVar = (fzb) objS;
        int i6 = i3;
        StringBuilder sb2 = new StringBuilder("lock3A - converged at frame number=");
        es esVar2 = fzbVar.b;
        sb2.append(esVar2 != null ? new Long(esVar2.a.getFrameNumber()) : null);
        sb2.append(", status=");
        sb2.append((Object) ("Status(value=" + fzbVar.a + ')'));
        Log.d("CXCP", sb2.toString());
        if (fzbVar.a != 0) {
            return gzbVar.d;
        }
        i3 = i6;
        xd8Var2 = xd8Var4;
        thVar = thVar2;
        xd8Var5 = (xd8) mmbVarD.element;
        num = new Integer(i3);
        if (xd8Var2 == null) {
            bool = null;
        } else {
            bool = Boolean.TRUE;
        }
        if (xd8Var3 == null) {
            bool2 = null;
        } else {
            bool2 = Boolean.TRUE;
        }
        if (bool != null) {
            z = true;
        } else {
            z = false;
        }
        if (xd8Var5 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (bool2 != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z) {
            linkedHashMap2 = new LinkedHashMap();
            if (z) {
                linkedHashMap2.put(CaptureResult.CONTROL_AE_STATE, g);
            }
            if (z2) {
                linkedHashMap2.put(CaptureResult.CONTROL_AF_STATE, i);
            }
            if (z3) {
                linkedHashMap2.put(CaptureResult.CONTROL_AWB_STATE, h);
            }
        } else {
            linkedHashMap2 = new LinkedHashMap();
            if (z) {
                linkedHashMap2.put(CaptureResult.CONTROL_AE_STATE, g);
            }
            if (z2) {
                linkedHashMap2.put(CaptureResult.CONTROL_AF_STATE, i);
            }
            if (z3) {
                linkedHashMap2.put(CaptureResult.CONTROL_AWB_STATE, h);
            }
        }
        if (a26Var == null) {
            if (a26Var == null) {
                xq2Var2 = new xq2(1, linkedHashMap2);
            } else {
                xq2Var2 = a26Var;
            }
            gzb gzbVar4 = new gzb(xq2Var2, num, l4);
            y88Var.getClass();
            y88Var.a.add(gzbVar4);
            de6.b(this.c, null, null, null, null, null, null, null, bool, null, bool2, 383);
            Log.d("CXCP", "lock3A - submitting request with aeLock=" + bool + " , awbLock=" + bool2);
            ud6Var.f(de6Var.a());
            za2Var = gzbVar4.d;
        } else {
            if (a26Var == null) {
                xq2Var2 = new xq2(1, linkedHashMap2);
            } else {
                xq2Var2 = a26Var;
            }
            gzb gzbVar5 = new gzb(xq2Var2, num, l4);
            y88Var.getClass();
            y88Var.a.add(gzbVar5);
            de6.b(this.c, null, null, null, null, null, null, null, bool, null, bool2, 383);
            Log.d("CXCP", "lock3A - submitting request with aeLock=" + bool + " , awbLock=" + bool2);
            ud6Var.f(de6Var.a());
            za2Var = gzbVar5.d;
        }
        if (xd8Var5 == null) {
            za2Var.getClass();
            return za2Var;
        }
        if (thVar != null) {
            th thVar5 = ((k0e) de6Var.a.a).a;
            de6.b(this.c, thVar, null, null, null, null, null, null, null, null, null, 1022);
            ud6Var.f(de6Var.a());
            thVar3 = thVar5;
        } else {
            thVar3 = null;
        }
        Log.d("CXCP", "lock3A - submitting a request to lock af.");
        if (!ud6Var.e(l)) {
            return za2Var2;
        }
        de6.b(this.c, null, null, null, null, null, null, null, null, Boolean.TRUE, null, 767);
        if (thVar3 != null) {
            de6.b(this.c, thVar3, null, null, null, null, null, null, null, null, null, 1022);
            ud6Var.f(de6Var.a());
        }
        za2Var.getClass();
        return za2Var;
    }
}
