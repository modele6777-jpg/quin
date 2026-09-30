package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import android.util.SparseArray;
import android.view.View;
import android.view.autofill.AutofillManager;
import com.adjust.sdk.sig.r3;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.assetpacks.b;
import com.google.android.play.core.assetpacks.k;
import com.google.android.play.core.assetpacks.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vea implements zx0, h1b, odc, f1b, s36, ssc, f8e, stc, lgg, cfg, xm9, csg {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public vea(int i) {
        this.a = i;
        switch (i) {
            case 4:
                this.b = new LinkedHashMap();
                this.c = new LinkedHashMap();
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                break;
            case 21:
                this.b = new d0a();
                this.c = new m1g();
                break;
            case 26:
                this.b = Collections.synchronizedMap(new WeakHashMap());
                this.c = Collections.synchronizedMap(new WeakHashMap());
                break;
            case 28:
                this.b = new HashMap();
                this.c = new hrg(6);
                hrg hrgVar = new hrg(0);
                isg isgVar = isg.BITWISE_AND;
                ArrayList arrayList = hrgVar.a;
                arrayList.add(isgVar);
                arrayList.add(isg.BITWISE_LEFT_SHIFT);
                arrayList.add(isg.BITWISE_NOT);
                arrayList.add(isg.BITWISE_OR);
                arrayList.add(isg.BITWISE_RIGHT_SHIFT);
                arrayList.add(isg.BITWISE_UNSIGNED_RIGHT_SHIFT);
                arrayList.add(isg.BITWISE_XOR);
                F(hrgVar);
                hrg hrgVar2 = new hrg(1);
                isg isgVar2 = isg.EQUALS;
                ArrayList arrayList2 = hrgVar2.a;
                arrayList2.add(isgVar2);
                arrayList2.add(isg.GREATER_THAN);
                arrayList2.add(isg.GREATER_THAN_EQUALS);
                arrayList2.add(isg.IDENTITY_EQUALS);
                arrayList2.add(isg.IDENTITY_NOT_EQUALS);
                arrayList2.add(isg.LESS_THAN);
                arrayList2.add(isg.LESS_THAN_EQUALS);
                arrayList2.add(isg.NOT_EQUALS);
                F(hrgVar2);
                hrg hrgVar3 = new hrg(2);
                isg isgVar3 = isg.APPLY;
                ArrayList arrayList3 = hrgVar3.a;
                arrayList3.add(isgVar3);
                arrayList3.add(isg.BLOCK);
                arrayList3.add(isg.BREAK);
                arrayList3.add(isg.CASE);
                arrayList3.add(isg.DEFAULT);
                arrayList3.add(isg.CONTINUE);
                arrayList3.add(isg.DEFINE_FUNCTION);
                arrayList3.add(isg.FN);
                arrayList3.add(isg.IF);
                arrayList3.add(isg.QUOTE);
                arrayList3.add(isg.RETURN);
                arrayList3.add(isg.SWITCH);
                arrayList3.add(isg.TERNARY);
                F(hrgVar3);
                hrg hrgVar4 = new hrg(3);
                isg isgVar4 = isg.AND;
                ArrayList arrayList4 = hrgVar4.a;
                arrayList4.add(isgVar4);
                arrayList4.add(isg.NOT);
                arrayList4.add(isg.OR);
                F(hrgVar4);
                hrg hrgVar5 = new hrg(4);
                isg isgVar5 = isg.FOR_IN;
                ArrayList arrayList5 = hrgVar5.a;
                arrayList5.add(isgVar5);
                arrayList5.add(isg.FOR_IN_CONST);
                arrayList5.add(isg.FOR_IN_LET);
                arrayList5.add(isg.FOR_LET);
                arrayList5.add(isg.FOR_OF);
                arrayList5.add(isg.FOR_OF_CONST);
                arrayList5.add(isg.FOR_OF_LET);
                arrayList5.add(isg.WHILE);
                F(hrgVar5);
                hrg hrgVar6 = new hrg(5);
                isg isgVar6 = isg.ADD;
                ArrayList arrayList6 = hrgVar6.a;
                arrayList6.add(isgVar6);
                arrayList6.add(isg.DIVIDE);
                arrayList6.add(isg.MODULUS);
                arrayList6.add(isg.MULTIPLY);
                arrayList6.add(isg.NEGATE);
                arrayList6.add(isg.POST_DECREMENT);
                arrayList6.add(isg.POST_INCREMENT);
                arrayList6.add(isg.PRE_DECREMENT);
                arrayList6.add(isg.PRE_INCREMENT);
                arrayList6.add(isg.SUBTRACT);
                F(hrgVar6);
                hrg hrgVar7 = new hrg(7);
                isg isgVar7 = isg.ASSIGN;
                ArrayList arrayList7 = hrgVar7.a;
                arrayList7.add(isgVar7);
                arrayList7.add(isg.CONST);
                arrayList7.add(isg.CREATE_ARRAY);
                arrayList7.add(isg.CREATE_OBJECT);
                arrayList7.add(isg.EXPRESSION_LIST);
                arrayList7.add(isg.GET);
                arrayList7.add(isg.GET_INDEX);
                arrayList7.add(isg.GET_PROPERTY);
                arrayList7.add(isg.NULL);
                arrayList7.add(isg.SET_PROPERTY);
                arrayList7.add(isg.TYPEOF);
                arrayList7.add(isg.UNDEFINED);
                arrayList7.add(isg.VAR);
                F(hrgVar7);
                break;
            default:
                this.b = null;
                this.c = null;
                break;
        }
    }

    public void A(String str, idc idcVar) {
        jdc jdcVar = (jdc) this.b;
        synchronized (jdcVar.c) {
            if (jdcVar.d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            jdcVar.d.put(str, idcVar);
        }
    }

    public void B() {
        if (!((jdc) this.b).h) {
            qc0.p("Can not perform this action after onSaveInstanceState");
            return;
        }
        w70 w70Var = (w70) this.c;
        if (w70Var == null) {
            w70Var = new w70(this);
        }
        this.c = w70Var;
        try {
            i38.class.getDeclaredConstructor(null);
            w70 w70Var2 = (w70) this.c;
            if (w70Var2 != null) {
                ((LinkedHashSet) w70Var2.b).add(i38.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + i38.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:47:0x0119  */
    /* JADX WARN: Code duplicated, block: B:71:0x019a  */
    public o1d C(q8f q8fVar, List list, tf7 tf7Var) {
        jgf jgfVarU;
        o8f o8fVar = q8fVar.a;
        o1d o1dVar = new o1d();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            tt7 tt7Var = (tt7) it.next();
            y22 y22VarM = tt7Var.c0().m();
            if (y22VarM instanceof u09) {
                Set set = tf7Var.e;
                jgf jgfVarK0 = tt7Var.k0();
                if (jgfVarK0 instanceof bj5) {
                    bj5 bj5Var = (bj5) jgfVarK0;
                    tjd tjdVarU = bj5Var.b;
                    if (!tjdVarU.c0().getParameters().isEmpty() && tjdVarU.c0().m() != null) {
                        List<c8f> parameters = tjdVarU.c0().getParameters();
                        parameters.getClass();
                        ArrayList arrayList = new ArrayList(t72.u(parameters, 10));
                        for (c8f c8fVar : parameters) {
                            i8f dzdVar = (i8f) s72.y0(c8fVar.getIndex(), tt7Var.Z());
                            boolean z = set != null && set.contains(c8fVar);
                            if (dzdVar == null || z) {
                                dzdVar = new dzd(c8fVar);
                            } else {
                                tt7 tt7VarB = dzdVar.b();
                                tt7VarB.getClass();
                                if (o8fVar.d(tt7VarB) == null) {
                                    dzdVar = new dzd(c8fVar);
                                }
                            }
                            arrayList.add(dzdVar);
                        }
                        tjdVarU = w6c.u(tjdVarU, arrayList, null, 2);
                    }
                    tjd tjdVarU2 = bj5Var.c;
                    if (!tjdVarU2.c0().getParameters().isEmpty() && tjdVarU2.c0().m() != null) {
                        List<c8f> parameters2 = tjdVarU2.c0().getParameters();
                        parameters2.getClass();
                        ArrayList arrayList2 = new ArrayList(t72.u(parameters2, 10));
                        for (c8f c8fVar2 : parameters2) {
                            i8f dzdVar2 = (i8f) s72.y0(c8fVar2.getIndex(), tt7Var.Z());
                            boolean z2 = set != null && set.contains(c8fVar2);
                            if (dzdVar2 == null || z2) {
                                dzdVar2 = new dzd(c8fVar2);
                            } else {
                                tt7 tt7VarB2 = dzdVar2.b();
                                tt7VarB2.getClass();
                                if (o8fVar.d(tt7VarB2) == null) {
                                    dzdVar2 = new dzd(c8fVar2);
                                }
                            }
                            arrayList2.add(dzdVar2);
                        }
                        tjdVarU2 = w6c.u(tjdVarU2, arrayList2, null, 2);
                    }
                    jgfVarU = rxg.E(tjdVarU, tjdVarU2);
                } else {
                    if (!(jgfVarK0 instanceof tjd)) {
                        ap.c();
                        return null;
                    }
                    tjd tjdVar = (tjd) jgfVarK0;
                    if (tjdVar.c0().getParameters().isEmpty() || tjdVar.c0().m() == null) {
                        jgfVarU = tjdVar;
                    } else {
                        List<c8f> parameters3 = tjdVar.c0().getParameters();
                        parameters3.getClass();
                        ArrayList arrayList3 = new ArrayList(t72.u(parameters3, 10));
                        for (c8f c8fVar3 : parameters3) {
                            i8f dzdVar3 = (i8f) s72.y0(c8fVar3.getIndex(), tt7Var.Z());
                            boolean z3 = set != null && set.contains(c8fVar3);
                            if (dzdVar3 == null || z3) {
                                dzdVar3 = new dzd(c8fVar3);
                            } else {
                                tt7 tt7VarB3 = dzdVar3.b();
                                tt7VarB3.getClass();
                                if (o8fVar.d(tt7VarB3) == null) {
                                    dzdVar3 = new dzd(c8fVar3);
                                }
                            }
                            arrayList3.add(dzdVar3);
                        }
                        jgfVarU = w6c.u(tjdVar, arrayList3, null, 2);
                    }
                }
                o1dVar.add(q8fVar.f(q7c.p(jgfVarU, jgfVarK0), dsf.OUT_VARIANCE));
            } else if (y22VarM instanceof c8f) {
                Set set2 = tf7Var.e;
                if (set2 == null || !set2.contains(y22VarM)) {
                    List upperBounds = ((c8f) y22VarM).getUpperBounds();
                    upperBounds.getClass();
                    o1dVar.addAll(C(q8fVar, upperBounds, tf7Var));
                } else {
                    o1dVar.add(t(tf7Var));
                }
            }
        }
        return o1dVar.d();
    }

    public synchronized void D(boolean z, boolean z2) {
        boolean z3 = false;
        if (z) {
            if (((PowerManager.WakeLock) this.c) == null) {
                if (((Context) this.b).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                    xo1.V("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                    return;
                }
                PowerManager powerManager = (PowerManager) ((Context) this.b).getSystemService("power");
                if (powerManager == null) {
                    xo1.V("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                    return;
                } else {
                    PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    this.c = wakeLockNewWakeLock;
                    wakeLockNewWakeLock.setReferenceCounted(false);
                }
            }
        }
        PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.c;
        if (wakeLock == null) {
            return;
        }
        if (z && z2) {
            z3 = true;
        }
        if (z3) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    public void E(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        Map map3 = (Map) this.b;
        synchronized (map3) {
            map = new HashMap(map3);
        }
        Map map4 = (Map) this.c;
        synchronized (map4) {
            map2 = new HashMap(map4);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).c(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((gle) entry2.getKey()).b(new x60(status));
            }
        }
    }

    public void F(hrg hrgVar) {
        Iterator it = hrgVar.a.iterator();
        while (it.hasNext()) {
            ((HashMap) this.b).put(((isg) it.next()).a().toString(), hrgVar);
        }
    }

    public vqg G(kxa kxaVar, vqg vqgVar) {
        jcc.w(kxaVar);
        if (!(vqgVar instanceof yqg)) {
            return vqgVar;
        }
        yqg yqgVar = (yqg) vqgVar;
        ArrayList arrayList = yqgVar.b;
        String str = yqgVar.a;
        HashMap map = (HashMap) this.b;
        return (map.containsKey(str) ? (hrg) map.get(str) : (hrg) this.c).a(str, kxaVar, arrayList);
    }

    @Override // defpackage.odc
    public Object N(pcc pccVar, Object obj) {
        return ((l26) this.b).z(pccVar, obj);
    }

    @Override // defpackage.lgg
    public Object a() {
        switch (this.a) {
            case 24:
                k kVar = (k) this.b;
                List list = (List) this.c;
                HashMap map = new HashMap();
                for (jgg jggVar : kVar.c.values()) {
                    String str = jggVar.c.a;
                    if (list.contains(str)) {
                        jgg jggVar2 = (jgg) map.get(str);
                        if ((jggVar2 == null ? -1 : jggVar2.a) < jggVar.a) {
                            map.put(str, jggVar);
                        }
                    }
                }
                return map;
            default:
                return new o((b) ((bfg) this.b).a(), new bfg(new fnb((yea) this.c)));
        }
    }

    @Override // defpackage.ssc
    public void c(d0a d0aVar) {
        zu1 zu1Var = (zu1) this.b;
        v5f v5fVar = (v5f) this.c;
        SparseArray sparseArray = v5fVar.g;
        if (d0aVar.z() == 0 && (d0aVar.z() & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            d0aVar.N(6);
            int iA = d0aVar.a() / 4;
            for (int i = 0; i < iA; i++) {
                d0aVar.k(zu1Var.b, 0, 4);
                zu1Var.m(0);
                int iG = zu1Var.g(16);
                zu1Var.o(3);
                if (iG == 0) {
                    zu1Var.o(13);
                } else {
                    int iG2 = zu1Var.g(13);
                    if (sparseArray.get(iG2) == null) {
                        sparseArray.put(iG2, new tsc(new r1f(v5fVar, iG2)));
                        v5fVar.m++;
                    }
                }
            }
            sparseArray.remove(0);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:39:0x00e3
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // defpackage.zx0
    public defpackage.yx0 d(defpackage.m95 r17, long r18) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vea.d(m95, long):yx0");
    }

    @Override // defpackage.stc
    public int e(int i) {
        CharSequence charSequence = (CharSequence) this.b;
        do {
            i = ((p90) this.c).L(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // defpackage.csg
    public kxa f(vqg vqgVar) {
        kxa kxaVarV = ((kxa) this.b).v();
        kxaVarV.y((String) this.c, vqgVar);
        return kxaVarV;
    }

    @Override // defpackage.h1b
    public Object get() {
        switch (this.a) {
            case 5:
                w1e w1eVar = new w1e(10);
                g3e g3eVar = new g3e(7);
                Object obj = ((h1b) this.b).get();
                h1b h1bVar = (h1b) this.c;
                return new w8c(w1eVar, g3eVar, yo0.f, (jfc) obj, h1bVar);
            default:
                return new t0d((yxe) ((f1b) this.b).get(), (grf) ((f1b) this.c).get());
        }
    }

    @Override // defpackage.stc
    public int h(int i) {
        do {
            i = ((p90) this.c).a0(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.b).charAt(i - 1)));
        return i;
    }

    @Override // defpackage.s36
    public void i(Throwable th) {
        switch (this.a) {
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                int i = ((iae) this.b).f;
                if (i == 2 && (th instanceof CancellationException)) {
                    b21.q("SurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                } else {
                    b21.X("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + u3c.f(i), th);
                }
                break;
            default:
                cee ceeVar = (cee) this.c;
                k47 k47Var = (k47) this.b;
                if (!((utb) k47Var.c).g) {
                    Object obj = ((im1) ((ArrayList) k47Var.b).get(0)).e.a.get("CAPTURE_CONFIG_ID_KEY");
                    int iIntValue = obj == null ? -1 : ((Integer) obj).intValue();
                    boolean z = th instanceof jv6;
                    szc szcVar = ceeVar.c;
                    if (z) {
                        nq0 nq0Var = new nq0(iIntValue, (jv6) th);
                        szcVar.getClass();
                        p8c.m();
                        ((ko0) szcVar.e).k.accept(nq0Var);
                    } else {
                        nq0 nq0Var2 = new nq0(iIntValue, new jv6(2, "Failed to submit capture request", th));
                        szcVar.getClass();
                        p8c.m();
                        ((ko0) szcVar.e).k.accept(nq0Var2);
                    }
                    ceeVar.b.s();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.stc
    public int j(int i) {
        do {
            i = ((p90) this.c).a0(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.b).charAt(i)));
        return i;
    }

    @Override // defpackage.xm9
    public void k(Task task) {
        ((Map) ((vea) this.c).c).remove((gle) this.b);
    }

    @Override // defpackage.stc
    public int l(int i) {
        do {
            i = ((p90) this.c).L(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.b).charAt(i - 1)));
        return i;
    }

    @Override // defpackage.zx0
    public void m() {
        d0a d0aVar = (d0a) this.c;
        byte[] bArr = pqf.b;
        d0aVar.K(bArr, bArr.length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean, int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public m3e n(int i, ng1 ng1Var, ArrayList arrayList, ArrayList arrayList2, te1 te1Var, Range range, boolean z) {
        int i2;
        Rect rectG;
        t9e t9eVar;
        boolean z2;
        boolean z3;
        LinkedHashMap linkedHashMap;
        boolean z4;
        boolean z5;
        int i3;
        int i4;
        int i5;
        r9e r9eVar;
        yae yaeVarO;
        t9e t9eVar2;
        ng1Var.getClass();
        te1Var.getClass();
        range.getClass();
        ArrayList arrayList3 = new ArrayList();
        String strD = ng1Var.d();
        strD.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            oif oifVar = (oif) it.next();
            hq0 hq0Var = oifVar.j;
            if (hq0Var == null) {
                qc0.j("Attached stream spec cannot be null for already attached use cases.");
                return null;
            }
            zj1 zj1Var = (zj1) this.c;
            if (zj1Var == null) {
                qc0.p("Required value was null.");
                return null;
            }
            int iL = oifVar.i.l();
            Size sizeC = oifVar.c();
            if (sizeC == null) {
                qc0.j("Attached surface resolution cannot be null for already attached use cases.");
                return null;
            }
            n3e n3eVarR = oifVar.i.r();
            Iterator it2 = it;
            ok8.k("No such camera id in supported combination list: ".concat(strD), zj1Var.d.containsKey(strD));
            synchronized (zj1Var.c) {
                t9eVar2 = (t9e) zj1Var.d.get(strD);
            }
            if (t9eVar2 == null) {
                qc0.j("No such camera id in supported combination list: ".concat(strD));
                return null;
            }
            z9e z9eVarP = t9eVar2.p(i, iL, sizeC, n3eVarR);
            int iL2 = oifVar.i.l();
            Size sizeC2 = oifVar.c();
            sizeC2.getClass();
            qr4 qr4Var = hq0Var.c;
            ArrayList arrayList4 = new ArrayList();
            if (oifVar instanceof k3e) {
                Iterator it3 = ((k3e) oifVar).s.a.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(((oif) it3.next()).i.s());
                }
            } else {
                arrayList4.add(oifVar.i.s());
            }
            qh2 qh2Var = hq0Var.f;
            int iIntValue = ((Integer) oifVar.i.a(xjf.j0, 0)).intValue();
            Range range2 = (Range) oifVar.i.a(xjf.k0, hq0.h);
            if (range2 == null) {
                qc0.j("Required value was null.");
                return null;
            }
            Boolean bool = (Boolean) oifVar.i.a(xjf.l0, Boolean.FALSE);
            Objects.requireNonNull(bool);
            boolean zBooleanValue = bool.booleanValue();
            xjf xjfVar = oifVar.i;
            Size sizeC3 = oifVar.c();
            sizeC3.getClass();
            eo0 eo0Var = new eo0(z9eVarP, iL2, sizeC2, qr4Var, arrayList4, qh2Var, iIntValue, range2, zBooleanValue, xjfVar.v(sizeC3));
            arrayList3.add(eo0Var);
            linkedHashMap3.put(eo0Var, oifVar);
            linkedHashMap2.put(oifVar, hq0Var);
            it = it2;
        }
        Pair pair = new Pair(linkedHashMap2, linkedHashMap3);
        Object obj = pair.second;
        obj.getClass();
        Map map = (Map) obj;
        HashMap mapW = lk1.w(arrayList, (akf) te1Var.a(te1.j, akf.a), (mk1) this.b, range);
        String strD2 = ng1Var.d();
        strD2.getClass();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        if (arrayList.isEmpty()) {
            i2 = Integer.MAX_VALUE;
        } else {
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
            try {
                rectG = ng1Var.g();
            } catch (NullPointerException unused) {
                rectG = null;
            }
            psd psdVar = new psd(ng1Var, rectG != null ? s2f.f(rectG) : null);
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                oif oifVar2 = (oif) it4.next();
                Object obj2 = mapW.get(oifVar2);
                if (obj2 == null) {
                    qc0.j("Required value was null.");
                    return null;
                }
                hk1 hk1Var = (hk1) obj2;
                xjf xjfVarO = oifVar2.o(ng1Var, hk1Var.a, hk1Var.b);
                xjfVarO.getClass();
                linkedHashMap5.put(xjfVarO, oifVar2);
                linkedHashMap6.put(xjfVarO, psdVar.t(xjfVarO));
            }
            vuf vufVarI = tgc.i(arrayList, new i2e(1, mapW, ng1Var));
            zj1 zj1Var2 = (zj1) this.c;
            if (zj1Var2 == null) {
                qc0.p("Required value was null.");
                return null;
            }
            ArrayList arrayList5 = new ArrayList(map.keySet());
            boolean zD = tgc.d(arrayList);
            ok8.k("No such camera id in supported combination list: ".concat(strD2), zj1Var2.d.containsKey(strD2));
            synchronized (zj1Var2.c) {
                t9eVar = (t9e) zj1Var2.d.get(strD2);
            }
            if (t9eVar == null) {
                qc0.j("No such camera id in supported combination list: ".concat(strD2));
                return null;
            }
            ja4 ja4Var = t9eVar.y;
            synchronized (ja4Var.c) {
                ja4Var.f = ja4Var.a();
            }
            if (t9eVar.v == null) {
                t9eVar.b();
            } else {
                t9eVar.v = new mq0(t9eVar.l().a, t9eVar.l().b, t9eVar.y.c(), t9eVar.l().d, t9eVar.l().e, t9eVar.l().f, t9eVar.l().g, t9eVar.l().h, t9eVar.l().i);
            }
            Range range3 = uj6.f;
            Set setKeySet = linkedHashMap6.keySet();
            setKeySet.getClass();
            ArrayList arrayList6 = new ArrayList(t72.u(arrayList5, 10));
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                arrayList6.add(Integer.valueOf(((eo0) it5.next()).g));
            }
            Set set = setKeySet;
            ArrayList arrayList7 = new ArrayList(t72.u(set, 10));
            Iterator it6 = set.iterator();
            while (it6.hasNext()) {
                Integer num = (Integer) ((xjf) it6.next()).a(xjf.j0, 0);
                num.getClass();
                arrayList7.add(num);
            }
            ArrayList arrayListQ0 = s72.Q0(arrayList6, arrayList7);
            if (arrayListQ0.isEmpty()) {
                z2 = false;
                break;
            }
            Iterator it7 = arrayListQ0.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    z2 = false;
                    break;
                }
                if (((Number) it7.next()).intValue() == 1) {
                    z2 = true;
                    break;
                }
            }
            if (z2 && !arrayListQ0.isEmpty()) {
                Iterator it8 = arrayListQ0.iterator();
                while (it8.hasNext()) {
                    if (((Number) it8.next()).intValue() != 1) {
                        qc0.j("All sessionTypes should be high-speed when any of them is high-speed");
                        return null;
                    }
                }
            }
            if (z2) {
                uj6 uj6Var = t9eVar.C;
                uj6Var.getClass();
                List listA = uj6.a(s72.j1(linkedHashMap6.values()));
                ArrayList arrayList8 = new ArrayList();
                for (Object obj3 : listA) {
                    boolean z6 = zD;
                    if (((List) uj6Var.e.getValue()).contains((Size) obj3)) {
                        arrayList8.add(obj3);
                    }
                    zD = z6;
                }
                z3 = zD;
                LinkedHashMap linkedHashMap7 = new LinkedHashMap(bm8.F(linkedHashMap6.size()));
                Iterator it9 = linkedHashMap6.entrySet().iterator();
                while (it9.hasNext()) {
                    Map.Entry entry = (Map.Entry) it9.next();
                    Object key = entry.getKey();
                    List list = (List) entry.getValue();
                    ArrayList arrayList9 = new ArrayList();
                    for (Object obj4 : list) {
                        Iterator it10 = it9;
                        if (arrayList8.contains((Size) obj4)) {
                            arrayList9.add(obj4);
                        }
                        it9 = it10;
                    }
                    linkedHashMap7.put(key, arrayList9);
                }
                linkedHashMap = linkedHashMap7;
            } else {
                z3 = zD;
                linkedHashMap = linkedHashMap6;
            }
            List<xjf> listJ1 = s72.j1(linkedHashMap.keySet());
            ArrayList arrayList10 = new ArrayList();
            ArrayList arrayList11 = new ArrayList();
            Iterator it11 = listJ1.iterator();
            while (it11.hasNext()) {
                Integer num2 = (Integer) ((xjf) it11.next()).a(xjf.i0, 0);
                num2.getClass();
                if (!arrayList11.contains(num2)) {
                    arrayList11.add(num2);
                }
            }
            w72.e0(arrayList11);
            Collections.reverse(arrayList11);
            Iterator it12 = arrayList11.iterator();
            while (it12.hasNext()) {
                int iIntValue2 = ((Number) it12.next()).intValue();
                for (xjf xjfVar2 : listJ1) {
                    if (iIntValue2 == ((Integer) xjfVar2.a(xjf.i0, 0)).intValue()) {
                        arrayList10.add(Integer.valueOf(listJ1.indexOf(xjfVar2)));
                    }
                }
            }
            LinkedHashMap linkedHashMapJ = t9eVar.B.j(arrayList5, listJ1, arrayList10);
            if (b21.F(3, "CXCP")) {
                Log.d("CXCP", "resolvedDynamicRanges = " + linkedHashMapJ);
            }
            Iterator it13 = arrayList5.iterator();
            while (true) {
                if (!it13.hasNext()) {
                    Iterator it14 = linkedHashMap.keySet().iterator();
                    while (true) {
                        if (!it14.hasNext()) {
                            z4 = false;
                            break;
                        }
                        if (((xjf) it14.next()).l() == 4101) {
                        }
                    }
                } else if (((eo0) it13.next()).b == 4101) {
                }
                z4 = true;
                break;
            }
            Iterator it15 = arrayList5.iterator();
            Boolean boolValueOf = null;
            while (it15.hasNext()) {
                boolean z7 = ((eo0) it15.next()).i;
                if (boolValueOf != null && !boolValueOf.equals(Boolean.valueOf(z7))) {
                    qc0.p("All isStrictFpsRequired should be the same");
                    return null;
                }
                boolValueOf = Boolean.valueOf(z7);
            }
            Iterator it16 = listJ1.iterator();
            while (it16.hasNext()) {
                boolean z8 = z4;
                Boolean bool2 = (Boolean) ((xjf) it16.next()).a(xjf.l0, Boolean.FALSE);
                Objects.requireNonNull(bool2);
                if (boolValueOf != null && !boolValueOf.equals(bool2)) {
                    qc0.p("All isStrictFpsRequired should be the same");
                    return null;
                }
                boolValueOf = bool2;
                z4 = z8;
            }
            boolean z9 = z4;
            boolean zBooleanValue2 = boolValueOf != null ? boolValueOf.booleanValue() : false;
            Range rangeN = hq0.h;
            rangeN.getClass();
            Iterator it17 = arrayList5.iterator();
            while (it17.hasNext()) {
                Range range4 = ((eo0) it17.next()).h;
                range4.getClass();
                rangeN = t9e.n(range4, rangeN, zBooleanValue2);
            }
            Iterator it18 = arrayList10.iterator();
            while (it18.hasNext()) {
                List list2 = listJ1;
                Range range5 = (Range) ((xjf) listJ1.get(((Number) it18.next()).intValue())).a(xjf.k0, hq0.h);
                range5.getClass();
                rangeN = t9e.n(range5, rangeN, zBooleanValue2);
                listJ1 = list2;
            }
            List list3 = listJ1;
            iy9 iy9Var = new iy9(Boolean.valueOf(zBooleanValue2), rangeN);
            boolean zBooleanValue3 = ((Boolean) iy9Var.a()).booleanValue();
            Range range6 = (Range) iy9Var.b();
            boolean z10 = vufVarI == vuf.e;
            if (b21.F(3, "CXCP")) {
                StringBuilder sb = new StringBuilder("getSuggestedStreamSpecifications: isPreviewStabilizationSupported = ");
                sb.append(t9eVar.t);
                sb.append(", isFeatureComboInvocation = ");
                z5 = z;
                sb.append(z5);
                Log.d("CXCP", sb.toString());
            } else {
                z5 = z;
            }
            if (z10 && !t9eVar.t && z5) {
                qc0.j("Preview stabilization is not supported by the camera.");
                return null;
            }
            range6.getClass();
            Iterator it19 = linkedHashMapJ.values().iterator();
            do {
                if (!it19.hasNext()) {
                    i3 = 8;
                    break;
                }
                i3 = 10;
            } while (((qr4) it19.next()).b != 10);
            t9e t9eVar3 = t9eVar;
            s9e s9eVar = new s9e(i, i3, z3, vufVarI, z9, z2, z5, false, range6, zBooleanValue3);
            t9eVar3.s(s9eVar);
            Collection collectionValues = linkedHashMapJ.values();
            if (z) {
                ?? Contains = collectionValues.contains(qr4.e);
                Integer num3 = (Integer) range6.getUpper();
                if (num3 != null && num3.intValue() == 60) {
                    i4 = Contains;
                    i4 = Contains;
                    i4 = Contains + 1;
                }
                i4 = Contains;
                i4 = Contains;
                i4 = Contains;
                if (vufVarI == vuf.d || vufVarI == vuf.e) {
                    i5 = i4;
                    i5 = i4 + 1;
                }
                if (z9) {
                    i5++;
                }
                r9eVar = i5 > 1 ? r9e.b : i5 == 1 ? r9e.c : r9e.a;
            } else {
                r9eVar = r9e.a;
            }
            if (b21.F(3, "CXCP")) {
                Log.d("CXCP", "resolveSpecsByCheckingMethod: checkingMethod = " + r9eVar);
            }
            int iOrdinal = r9eVar.ordinal();
            if (iOrdinal == 0) {
                s9e s9eVarA = s9e.a(s9eVar, false, null, 895);
                t9eVar3.s(s9eVarA);
                yaeVarO = t9eVar3.o(s9eVarA, arrayList5, linkedHashMap, list3, arrayList10, linkedHashMapJ);
            } else if (iOrdinal == 1) {
                if (z) {
                    Range range7 = hq0.h;
                }
                s9e s9eVarA2 = s9e.a(s9eVar, true, range6, 639);
                t9eVar3.s(s9eVarA2);
                yaeVarO = t9eVar3.o(s9eVarA2, arrayList5, linkedHashMap, list3, arrayList10, linkedHashMapJ);
            } else {
                if (iOrdinal != 2) {
                    ap.c();
                    return null;
                }
                try {
                    s9e s9eVarA3 = s9e.a(s9eVar, false, null, 895);
                    t9eVar3.s(s9eVarA3);
                    try {
                        yaeVarO = t9eVar3.o(s9eVarA3, arrayList5, linkedHashMap, list3, arrayList10, linkedHashMapJ);
                    } catch (IllegalArgumentException e) {
                        e = e;
                        t9eVar3 = t9eVar3;
                        if (b21.F(3, "CXCP")) {
                            Log.d("CXCP", "Failed to find a supported combination without feature combo, trying again with feature combo", e);
                        }
                        s9e s9eVarA4 = s9e.a(s9eVar, true, null, 895);
                        t9eVar3.s(s9eVarA4);
                        yaeVarO = t9eVar3.o(s9eVarA4, arrayList5, linkedHashMap, list3, arrayList10, linkedHashMapJ);
                    }
                } catch (IllegalArgumentException e2) {
                    e = e2;
                }
            }
            LinkedHashMap linkedHashMap8 = yaeVarO.a;
            LinkedHashMap linkedHashMap9 = yaeVarO.b;
            i2 = yaeVarO.c;
            for (Map.Entry entry2 : linkedHashMap5.entrySet()) {
                Object value = entry2.getValue();
                Object obj5 = linkedHashMap8.get(entry2.getKey());
                if (obj5 == null) {
                    qc0.j("Required value was null.");
                    return null;
                }
                linkedHashMap4.put(value, obj5);
            }
            for (Map.Entry entry3 : linkedHashMap9.entrySet()) {
                if (map.containsKey(entry3.getKey())) {
                    Object obj6 = map.get(entry3.getKey());
                    if (obj6 == null) {
                        qc0.j("Required value was null.");
                        return null;
                    }
                    linkedHashMap4.put(obj6, entry3.getValue());
                }
            }
        }
        Object obj7 = pair.first;
        obj7.getClass();
        return new m3e(i2, bm8.L((Map) obj7, linkedHashMap4));
    }

    public Bundle o(String str) {
        Bundle bundle;
        jdc jdcVar = (jdc) this.b;
        if (!jdcVar.g) {
            qc0.p("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle2 = jdcVar.f;
        if (bundle2 == null) {
            return null;
        }
        if (bundle2.containsKey(str)) {
            bundle = bundle2.getBundle(str);
            if (bundle == null) {
                gdc.h(str);
                throw null;
            }
        } else {
            bundle = null;
        }
        bundle2.remove(str);
        if (bundle2.isEmpty()) {
            jdcVar.f = null;
        }
        return bundle;
    }

    public Object p() {
        Object objRemoveLast;
        synchronized (this.c) {
            objRemoveLast = ((ArrayDeque) this.b).removeLast();
        }
        return objRemoveLast;
    }

    public View q(int i, int i2, int i3, int i4) {
        zuf zufVar = (zuf) this.c;
        avf avfVar = (avf) this.b;
        int iK = avfVar.k();
        int iO = avfVar.o();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewU = avfVar.u(i);
            int iB = avfVar.b(viewU);
            int iV = avfVar.v(viewU);
            zufVar.b = iK;
            zufVar.c = iO;
            zufVar.d = iB;
            zufVar.e = iV;
            if (i3 != 0) {
                zufVar.a = i3;
                if (zufVar.a()) {
                    return viewU;
                }
            }
            if (i4 != 0) {
                zufVar.a = i4;
                if (zufVar.a()) {
                    view = viewU;
                }
            }
            i += i5;
        }
        return view;
    }

    public void r(String str, String str2, a26 a26Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) ((oid) this.c).b;
        nid nidVar = new nid(this, str, str2);
        a26Var.d(nidVar);
        String str3 = (String) this.b;
        ArrayList arrayList = nidVar.b;
        ArrayList arrayList2 = new ArrayList(t72.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((iy9) it.next()).d());
        }
        String strG = (String) nidVar.c.d();
        strG.getClass();
        StringBuilder sb = new StringBuilder(str);
        sb.append('(');
        sb.append(s72.D0(arrayList2, "", null, null, vic.z, 30));
        sb.append(')');
        if (strG.length() > 1) {
            strG = ks0.g(';', "L", strG);
        }
        sb.append(strG);
        String str4 = str3 + '.' + sb.toString();
        q7f q7fVar = (q7f) nidVar.c.e();
        ArrayList arrayList3 = new ArrayList(t72.u(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add((q7f) ((iy9) it2.next()).e());
        }
        iy9 iy9Var = new iy9(str4, new lpa(q7fVar, arrayList3, nidVar.a));
        linkedHashMap.put(iy9Var.d(), iy9Var.e());
    }

    /* JADX WARN: Code duplicated, block: B:121:0x022d  */
    /* JADX WARN: Code duplicated, block: B:130:0x024e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0259  */
    /* JADX WARN: Code duplicated, block: B:133:0x0262  */
    /* JADX WARN: Code duplicated, block: B:134:0x026c  */
    /* JADX WARN: Code duplicated, block: B:136:0x0274  */
    /* JADX WARN: Code duplicated, block: B:138:0x027c  */
    /* JADX WARN: Code duplicated, block: B:139:0x0280  */
    /* JADX WARN: Code duplicated, block: B:141:0x0288  */
    /* JADX WARN: Code duplicated, block: B:142:0x028f  */
    /* JADX WARN: Code duplicated, block: B:144:0x0297  */
    /* JADX WARN: Code duplicated, block: B:150:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:152:0x02af  */
    /* JADX WARN: Code duplicated, block: B:154:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:156:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:157:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:159:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:160:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:162:0x02db  */
    /* JADX WARN: Code duplicated, block: B:164:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:165:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:167:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:169:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:171:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:173:0x0305  */
    /* JADX WARN: Code duplicated, block: B:175:0x0315  */
    /* JADX WARN: Code duplicated, block: B:176:0x032f  */
    /* JADX WARN: Code duplicated, block: B:179:0x0340  */
    /* JADX WARN: Code duplicated, block: B:182:0x0349  */
    /* JADX WARN: Code duplicated, block: B:183:0x034b  */
    /* JADX WARN: Code duplicated, block: B:186:0x0354  */
    /* JADX WARN: Code duplicated, block: B:187:0x0356  */
    /* JADX WARN: Code duplicated, block: B:190:0x035f  */
    /* JADX WARN: Code duplicated, block: B:194:0x0367  */
    /* JADX WARN: Code duplicated, block: B:195:0x036c  */
    /* JADX WARN: Code duplicated, block: B:196:0x0371  */
    /* JADX WARN: Code duplicated, block: B:198:0x0384  */
    /* JADX WARN: Code duplicated, block: B:239:0x0363 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:175:0x0315, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v25 */
    @Override // defpackage.f8e
    public void s(byte[] bArr, int i, int i2, e8e e8eVar, xl2 xl2Var) {
        o1g o1gVarD;
        String strTrim;
        int i3;
        String string;
        int i4;
        Matcher matcher;
        String strGroup;
        byte b;
        boolean z;
        vea veaVar = this;
        d0a d0aVar = (d0a) veaVar.b;
        d0aVar.K(bArr, i + i2);
        d0aVar.M(i);
        ArrayList arrayList = new ArrayList();
        try {
            u1g.c(d0aVar);
            while (!TextUtils.isEmpty(d0aVar.n(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                boolean z2 = false;
                int i5 = -1;
                int i6 = 0;
                byte b2 = -1;
                while (true) {
                    int i7 = 1;
                    if (b2 == -1) {
                        i6 = d0aVar.b;
                        String strN = d0aVar.n(StandardCharsets.UTF_8);
                        if (strN == null) {
                            b2 = 0;
                        } else if ("STYLE".equals(strN)) {
                            b2 = 2;
                        } else {
                            b2 = strN.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                        }
                    } else {
                        d0aVar.M(i6);
                        if (b2 == 0) {
                            z5c.L(new psd(arrayList2), e8eVar, xl2Var);
                            return;
                        }
                        if (b2 == 1) {
                            while (!TextUtils.isEmpty(d0aVar.n(StandardCharsets.UTF_8))) {
                            }
                        } else {
                            String str = null;
                            if (b2 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    qc0.j("A style block was found after the first cue.");
                                    return;
                                }
                                d0aVar.n(StandardCharsets.UTF_8);
                                m1g m1gVar = (m1g) veaVar.c;
                                d0a d0aVar2 = m1gVar.a;
                                StringBuilder sb = m1gVar.b;
                                sb.setLength(0);
                                int i8 = d0aVar.b;
                                while (!TextUtils.isEmpty(d0aVar.n(StandardCharsets.UTF_8))) {
                                }
                                d0aVar2.K(d0aVar.a, d0aVar.b);
                                d0aVar2.M(i8);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    m1g.c(d0aVar2);
                                    if (d0aVar2.a() >= 5 && "::cue".equals(d0aVar2.x(5, StandardCharsets.UTF_8))) {
                                        int i9 = d0aVar2.b;
                                        String strB = m1g.b(d0aVar2, sb);
                                        if (strB == null) {
                                            strTrim = str;
                                        } else if ("{".equals(strB)) {
                                            d0aVar2.M(i9);
                                            strTrim = "";
                                        } else {
                                            if ("(".equals(strB)) {
                                                int i10 = d0aVar2.b;
                                                int i11 = d0aVar2.c;
                                                int i12 = z2 ? 1 : 0;
                                                while (i10 < i11 && i12 == 0) {
                                                    int i13 = i10 + 1;
                                                    i12 = ((char) d0aVar2.a[i10]) == ')' ? i7 : z2 ? 1 : 0;
                                                    i10 = i13;
                                                }
                                                strTrim = d0aVar2.x((i10 - 1) - d0aVar2.b, StandardCharsets.UTF_8).trim();
                                            } else {
                                                strTrim = str;
                                            }
                                            if (!")".equals(m1g.b(d0aVar2, sb))) {
                                                strTrim = str;
                                            }
                                        }
                                    } else {
                                        strTrim = str;
                                    }
                                    if (strTrim != null && "{".equals(m1g.b(d0aVar2, sb))) {
                                        n1g n1gVar = new n1g();
                                        n1gVar.a = "";
                                        n1gVar.b = "";
                                        n1gVar.c = Collections.EMPTY_SET;
                                        n1gVar.d = "";
                                        n1gVar.e = str;
                                        n1gVar.g = z2;
                                        n1gVar.i = z2;
                                        n1gVar.j = i5;
                                        n1gVar.k = i5;
                                        n1gVar.l = i5;
                                        n1gVar.m = i5;
                                        n1gVar.n = i5;
                                        n1gVar.p = i5;
                                        n1gVar.q = z2;
                                        if (!strTrim.isEmpty()) {
                                            int iIndexOf = strTrim.indexOf(91);
                                            if (iIndexOf != i5) {
                                                Matcher matcher2 = m1g.c.matcher(strTrim.substring(iIndexOf));
                                                if (matcher2.matches()) {
                                                    String strGroup2 = matcher2.group(i7);
                                                    strGroup2.getClass();
                                                    n1gVar.d = strGroup2;
                                                }
                                                strTrim = strTrim.substring(z2 ? 1 : 0, iIndexOf);
                                            }
                                            String str2 = pqf.a;
                                            String[] strArrSplit = strTrim.split("\\.", i5);
                                            String str3 = strArrSplit[z2 ? 1 : 0];
                                            int iIndexOf2 = str3.indexOf(35);
                                            if (iIndexOf2 != i5) {
                                                n1gVar.b = str3.substring(z2 ? 1 : 0, iIndexOf2);
                                                n1gVar.a = str3.substring(iIndexOf2 + 1);
                                            } else {
                                                n1gVar.b = str3;
                                            }
                                            if (strArrSplit.length > i7) {
                                                int length = strArrSplit.length;
                                                pa7.A(length <= strArrSplit.length ? i7 : z2 ? 1 : 0);
                                                n1gVar.c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(strArrSplit, i7, length)));
                                            }
                                        }
                                        ?? r8 = z2 ? 1 : 0;
                                        String strB2 = str;
                                        while (r8 == 0) {
                                            int i14 = d0aVar2.b;
                                            strB2 = m1g.b(d0aVar2, sb);
                                            ?? r15 = (strB2 == null || "}".equals(strB2)) ? i7 : z2;
                                            if (r15 == 0) {
                                                d0aVar2.M(i14);
                                                m1g.c(d0aVar2);
                                                String strA = m1g.a(d0aVar2, sb);
                                                if (!strA.isEmpty() && ":".equals(m1g.b(d0aVar2, sb))) {
                                                    m1g.c(d0aVar2);
                                                    StringBuilder sb2 = new StringBuilder();
                                                    boolean z3 = false;
                                                    while (true) {
                                                        if (z3) {
                                                            string = sb2.toString();
                                                        } else {
                                                            int i15 = d0aVar2.b;
                                                            String strB3 = m1g.b(d0aVar2, sb);
                                                            if (strB3 == null) {
                                                                string = null;
                                                            } else if ("}".equals(strB3) || ";".equals(strB3)) {
                                                                d0aVar2.M(i15);
                                                                z3 = true;
                                                            } else {
                                                                sb2.append(strB3);
                                                            }
                                                        }
                                                    }
                                                    if (string == null || string.isEmpty()) {
                                                        i3 = 1;
                                                    } else {
                                                        int i16 = d0aVar2.b;
                                                        String strB4 = m1g.b(d0aVar2, sb);
                                                        if (";".equals(strB4)) {
                                                            if ("color".equals(strA)) {
                                                                i4 = 1;
                                                                n1gVar.f = j82.a(string, true);
                                                                n1gVar.g = true;
                                                            } else {
                                                                i4 = 1;
                                                                if ("background-color".equals(strA)) {
                                                                    n1gVar.h = j82.a(string, true);
                                                                    n1gVar.i = true;
                                                                } else if ("ruby-position".equals(strA)) {
                                                                    if ("text-combine-upright".equals(strA)) {
                                                                        if ("all".equals(string)) {
                                                                            z = true;
                                                                        } else {
                                                                            z = true;
                                                                        }
                                                                        n1gVar.q = z;
                                                                    } else if ("text-decoration".equals(strA)) {
                                                                        if ("underline".equals(string)) {
                                                                            i4 = 1;
                                                                            n1gVar.k = 1;
                                                                        }
                                                                    } else if ("font-family".equals(strA)) {
                                                                        n1gVar.e = bm8.V(string);
                                                                    } else if ("font-weight".equals(strA)) {
                                                                        i4 = 1;
                                                                        if ("font-style".equals(strA)) {
                                                                            if ("italic".equals(string)) {
                                                                                n1gVar.m = 1;
                                                                            }
                                                                        } else if ("font-size".equals(strA)) {
                                                                            matcher = m1g.d.matcher(bm8.V(string));
                                                                            if (matcher.matches()) {
                                                                                strGroup = matcher.group(2);
                                                                                strGroup.getClass();
                                                                                switch (strGroup.hashCode()) {
                                                                                    case 37:
                                                                                        if (!strGroup.equals("%")) {
                                                                                            b = 0;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                n1gVar.n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                n1gVar.n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                n1gVar.n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                r3.l();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup3 = matcher.group(i3);
                                                                                        strGroup3.getClass();
                                                                                        n1gVar.o = Float.parseFloat(strGroup3);
                                                                                        break;
                                                                                    case 3240:
                                                                                        if (!strGroup.equals("em")) {
                                                                                            b = 1;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                n1gVar.n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                n1gVar.n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                n1gVar.n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                r3.l();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup4 = matcher.group(i3);
                                                                                        strGroup4.getClass();
                                                                                        n1gVar.o = Float.parseFloat(strGroup4);
                                                                                        break;
                                                                                    case 3592:
                                                                                        if (!strGroup.equals("px")) {
                                                                                            b = 2;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                n1gVar.n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                n1gVar.n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                n1gVar.n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                r3.l();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup5 = matcher.group(i3);
                                                                                        strGroup5.getClass();
                                                                                        n1gVar.o = Float.parseFloat(strGroup5);
                                                                                        break;
                                                                                }
                                                                                b = -1;
                                                                                switch (b) {
                                                                                    case 0:
                                                                                        i3 = 1;
                                                                                        n1gVar.n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i3 = 1;
                                                                                        n1gVar.n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i3 = 1;
                                                                                        n1gVar.n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        r3.l();
                                                                                        return;
                                                                                }
                                                                                String strGroup6 = matcher.group(i3);
                                                                                strGroup6.getClass();
                                                                                n1gVar.o = Float.parseFloat(strGroup6);
                                                                            } else {
                                                                                xo1.V("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                            }
                                                                        }
                                                                    } else if ("bold".equals(string)) {
                                                                        i4 = 1;
                                                                        n1gVar.l = 1;
                                                                    }
                                                                    i3 = 1;
                                                                } else if ("over".equals(string)) {
                                                                    n1gVar.p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    n1gVar.p = 2;
                                                                    i3 = 1;
                                                                } else {
                                                                    i3 = 1;
                                                                }
                                                            }
                                                            i3 = i4;
                                                        } else if ("}".equals(strB4)) {
                                                            d0aVar2.M(i16);
                                                            if ("color".equals(strA)) {
                                                                i4 = 1;
                                                                n1gVar.f = j82.a(string, true);
                                                                n1gVar.g = true;
                                                            } else {
                                                                i4 = 1;
                                                                if ("background-color".equals(strA)) {
                                                                    n1gVar.h = j82.a(string, true);
                                                                    n1gVar.i = true;
                                                                } else if ("ruby-position".equals(strA)) {
                                                                    if ("text-combine-upright".equals(strA)) {
                                                                        if ("all".equals(string) || string.startsWith("digits")) {
                                                                            z = true;
                                                                        } else {
                                                                            z = false;
                                                                        }
                                                                        n1gVar.q = z;
                                                                    } else if ("text-decoration".equals(strA)) {
                                                                        if ("underline".equals(string)) {
                                                                            i4 = 1;
                                                                            n1gVar.k = 1;
                                                                        }
                                                                    } else if ("font-family".equals(strA)) {
                                                                        n1gVar.e = bm8.V(string);
                                                                    } else if ("font-weight".equals(strA)) {
                                                                        i4 = 1;
                                                                        if ("font-style".equals(strA)) {
                                                                            if ("italic".equals(string)) {
                                                                                n1gVar.m = 1;
                                                                            }
                                                                        } else if ("font-size".equals(strA)) {
                                                                            matcher = m1g.d.matcher(bm8.V(string));
                                                                            if (matcher.matches()) {
                                                                                xo1.V("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                            } else {
                                                                                strGroup = matcher.group(2);
                                                                                strGroup.getClass();
                                                                                switch (strGroup.hashCode()) {
                                                                                    case 37:
                                                                                        if (!strGroup.equals("%")) {
                                                                                            b = 0;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                n1gVar.n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                n1gVar.n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                n1gVar.n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                r3.l();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup7 = matcher.group(i3);
                                                                                        strGroup7.getClass();
                                                                                        n1gVar.o = Float.parseFloat(strGroup7);
                                                                                        break;
                                                                                    case 3240:
                                                                                        if (!strGroup.equals("em")) {
                                                                                            b = 1;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                n1gVar.n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                n1gVar.n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                n1gVar.n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                r3.l();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup8 = matcher.group(i3);
                                                                                        strGroup8.getClass();
                                                                                        n1gVar.o = Float.parseFloat(strGroup8);
                                                                                        break;
                                                                                    case 3592:
                                                                                        if (!strGroup.equals("px")) {
                                                                                            b = 2;
                                                                                        }
                                                                                        switch (b) {
                                                                                            case 0:
                                                                                                i3 = 1;
                                                                                                n1gVar.n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i3 = 1;
                                                                                                n1gVar.n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i3 = 1;
                                                                                                n1gVar.n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                r3.l();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup9 = matcher.group(i3);
                                                                                        strGroup9.getClass();
                                                                                        n1gVar.o = Float.parseFloat(strGroup9);
                                                                                        break;
                                                                                }
                                                                                b = -1;
                                                                                switch (b) {
                                                                                    case 0:
                                                                                        i3 = 1;
                                                                                        n1gVar.n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i3 = 1;
                                                                                        n1gVar.n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i3 = 1;
                                                                                        n1gVar.n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        r3.l();
                                                                                        return;
                                                                                }
                                                                                String strGroup10 = matcher.group(i3);
                                                                                strGroup10.getClass();
                                                                                n1gVar.o = Float.parseFloat(strGroup10);
                                                                            }
                                                                        }
                                                                    } else if ("bold".equals(string)) {
                                                                        i4 = 1;
                                                                        n1gVar.l = 1;
                                                                    }
                                                                    i3 = 1;
                                                                } else if ("over".equals(string)) {
                                                                    n1gVar.p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    n1gVar.p = 2;
                                                                    i3 = 1;
                                                                } else {
                                                                    i3 = 1;
                                                                }
                                                            }
                                                            i3 = i4;
                                                        } else {
                                                            i3 = 1;
                                                        }
                                                    }
                                                } else {
                                                    i3 = i7;
                                                }
                                            } else {
                                                i3 = i7;
                                            }
                                            i7 = i3;
                                            r8 = r15;
                                            z2 = false;
                                        }
                                        int i17 = i7;
                                        if ("}".equals(strB2)) {
                                            arrayList3.add(n1gVar);
                                        }
                                        i7 = i17;
                                        z2 = false;
                                        i5 = -1;
                                        str = null;
                                    }
                                }
                                arrayList.addAll(arrayList3);
                            } else if (b2 == 3) {
                                Pattern pattern = t1g.a;
                                Charset charset = StandardCharsets.UTF_8;
                                String strN2 = d0aVar.n(charset);
                                if (strN2 == null) {
                                    o1gVarD = null;
                                } else {
                                    Pattern pattern2 = t1g.a;
                                    Matcher matcher3 = pattern2.matcher(strN2);
                                    if (matcher3.matches()) {
                                        o1gVarD = t1g.d(null, matcher3, d0aVar, arrayList);
                                    } else {
                                        o1gVarD = null;
                                        String strN3 = d0aVar.n(charset);
                                        if (strN3 != null) {
                                            Matcher matcher4 = pattern2.matcher(strN3);
                                            if (matcher4.matches()) {
                                                o1gVarD = t1g.d(strN2.trim(), matcher4, d0aVar, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (o1gVarD != null) {
                                    arrayList2.add(o1gVarD);
                                }
                            }
                            veaVar = this;
                        }
                    }
                }
            }
        } catch (l0a e) {
            throw new IllegalArgumentException(e);
        }
    }

    public jgf t(tf7 tf7Var) {
        jgf jgfVarZ;
        tjd tjdVar = tf7Var.f;
        return (tjdVar == null || (jgfVarZ = o7c.z(tjdVar)) == null) ? (oy4) ((ace) this.b).getValue() : jgfVarZ;
    }

    public tt7 u(c8f c8fVar, tf7 tf7Var) {
        c8fVar.getClass();
        tf7Var.getClass();
        return (tt7) ((be8) this.c).d(new h8f(c8fVar, tf7Var));
    }

    @Override // defpackage.odc
    public Object v(Object obj) {
        return ((a26) this.c).d(obj);
    }

    public AutofillManager w() {
        AutofillManager autofillManager = (AutofillManager) this.c;
        if (autofillManager != null) {
            return autofillManager;
        }
        AutofillManager autofillManager2 = (AutofillManager) ((Context) this.b).getSystemService(AutofillManager.class);
        if (autofillManager2 != null) {
            this.c = autofillManager2;
            return autofillManager2;
        }
        qc0.p("Could not locate AutofillManager from context");
        return null;
    }

    public idc x(String str) {
        idc idcVar;
        jdc jdcVar = (jdc) this.b;
        synchronized (jdcVar.c) {
            Iterator it = jdcVar.d.entrySet().iterator();
            do {
                idcVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                idc idcVar2 = (idc) entry.getValue();
                if (pa7.t(str2, str)) {
                    idcVar = idcVar2;
                }
            } while (idcVar == null);
        }
        return idcVar;
    }

    public boolean y(View view) {
        zuf zufVar = (zuf) this.c;
        avf avfVar = (avf) this.b;
        int iK = avfVar.k();
        int iO = avfVar.o();
        int iB = avfVar.b(view);
        int iV = avfVar.v(view);
        zufVar.b = iK;
        zufVar.c = iO;
        zufVar.d = iB;
        zufVar.e = iV;
        zufVar.a = 24579;
        return zufVar.a();
    }

    public void z(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            sq0.a(view, w(), i, z);
        }
    }

    @Override // defpackage.ssc
    public void b(rye ryeVar, n95 n95Var, xg3 xg3Var) {
    }

    @Override // defpackage.s36
    public void a(Object obj) {
        switch (this.a) {
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                oae oaeVar = (oae) obj;
                oaeVar.getClass();
                ((ft3) ((psd) this.c).b).c(oaeVar);
                break;
            default:
                ((cee) this.c).b.s();
                break;
        }
    }

    public /* synthetic */ vea(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ vea(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public vea(vea veaVar, gle gleVar) {
        this.a = 27;
        this.b = gleVar;
        Objects.requireNonNull(veaVar);
        this.c = veaVar;
    }

    public vea(jy4 jy4Var) {
        this.a = 17;
        ge8 ge8Var = new ge8("Type parameter upper bound erasure results");
        this.b = new ace(new wj7(21, this));
        this.c = ge8Var.b(new ymb(8, this));
    }

    public vea(Object obj) {
        this.a = 10;
        this.b = obj;
        this.c = Thread.currentThread();
    }

    public vea(s8f s8fVar) {
        this.a = 23;
        this.c = new Object();
        this.b = new ArrayDeque(3);
    }

    public /* synthetic */ vea(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public vea(rye ryeVar) {
        this.a = 1;
        this.b = ryeVar;
        this.c = new d0a();
    }

    public vea(mk1 mk1Var) {
        this.a = 12;
        this.b = mk1Var;
        this.c = null;
    }

    public vea(avf avfVar) {
        this.a = 19;
        this.b = avfVar;
        zuf zufVar = new zuf();
        zufVar.a = 0;
        this.c = zufVar;
    }

    public vea(v5f v5fVar) {
        this.a = 16;
        this.c = v5fVar;
        this.b = new zu1(new byte[4], 4);
    }
}
