package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.compose.ui.node.LayoutNode;
import com.google.android.play.core.assetpacks.b;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wo0 implements cfg {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object v;
    public Object w;
    public Object x;
    public Object y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, wo0] */
    /* JADX WARN: Type inference failed for: r7v7, types: [pu4] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.ArrayList] */
    public wo0(ace aceVar, Context context, jo0 jo0Var, k47 k47Var, xi1 xi1Var, vea veaVar, uk1 uk1Var) {
        ?? arrayList;
        this.a = 1;
        this.b = aceVar;
        this.c = xi1Var;
        this.d = veaVar;
        this.e = uk1Var;
        this.f = new if1((hh1) aceVar.getValue(), ((hh1) aceVar.getValue()).b());
        ace aceVar2 = new ace(new jr(context, jo0Var, (Object) this, k47Var, 3));
        this.v = aceVar2;
        this.w = xu4.a;
        this.x = new Object();
        this.y = new AtomicBoolean(false);
        ArrayList arrayListA = mf1.a(((n23) aceVar2.getValue()).a());
        if (arrayListA != null) {
            arrayList = new ArrayList(t72.u(arrayListA, 10));
            Iterator it = arrayListA.iterator();
            while (it.hasNext()) {
                arrayList.add(((ig1) it.next()).a);
            }
        } else {
            arrayList = pu4.a;
        }
        uhb uhbVar = ((nb1) ((hh1) ((ace) this.b).getValue()).b().d()).b.k;
        Executor executor = jo0Var.a;
        executor.getClass();
        this.g = new zda(uhbVar, jgb.k(t72.z(executor)), arrayList, context);
        j(arrayList);
    }

    public static i09 e(h09 h09Var, i09 i09Var) {
        i09 i09VarCreate;
        if (h09Var instanceof s09) {
            i09VarCreate = ((s09) h09Var).create();
            i09VarCreate.c = zf9.f(i09VarCreate);
        } else {
            at0 at0Var = new at0();
            at0Var.c = zf9.d(h09Var);
            at0Var.Z = h09Var;
            at0Var.F0 = new HashSet();
            i09VarCreate = at0Var;
        }
        if (i09VarCreate.Y) {
            i37.c("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        i09VarCreate.w = true;
        i09 i09Var2 = i09Var.f;
        if (i09Var2 != null) {
            i09Var2.e = i09VarCreate;
            i09VarCreate.f = i09Var2;
        }
        i09Var.f = i09VarCreate;
        i09VarCreate.e = i09Var;
        return i09VarCreate;
    }

    public static i09 f(i09 i09Var) {
        boolean z = i09Var.Y;
        if (z) {
            e79 e79Var = zf9.a;
            if (!z) {
                i37.c("autoInvalidateRemovedNode called on unattached node");
            }
            zf9.a(i09Var, -1, 2);
            i09Var.i1();
            i09Var.c1();
        }
        i09 i09Var2 = i09Var.f;
        i09 i09Var3 = i09Var.e;
        if (i09Var2 != null) {
            i09Var2.e = i09Var3;
            i09Var.f = null;
        }
        if (i09Var3 != null) {
            i09Var3.f = i09Var2;
            i09Var.e = null;
        }
        i09Var3.getClass();
        return i09Var3;
    }

    public static void o(h09 h09Var, h09 h09Var2, i09 i09Var) {
        if ((h09Var instanceof s09) && (h09Var2 instanceof s09)) {
            i09Var.getClass();
            ((s09) h09Var2).update(i09Var);
            if (i09Var.Y) {
                zf9.c(i09Var);
                return;
            } else {
                i09Var.x = true;
                return;
            }
        }
        if (!(i09Var instanceof at0)) {
            i37.c("Unknown Modifier.Node type");
            return;
        }
        at0 at0Var = (at0) i09Var;
        if (at0Var.Y) {
            at0Var.m1();
        }
        at0Var.Z = h09Var2;
        at0Var.c = zf9.d(h09Var2);
        if (at0Var.Y) {
            at0Var.l1(false);
        }
        if (i09Var.Y) {
            zf9.c(i09Var);
        } else {
            i09Var.x = true;
        }
    }

    @Override // defpackage.cfg
    public Object a() {
        Object objA = ((bfg) this.b).a();
        bfg bfgVar = new bfg(new fnb((yea) this.c));
        Object objA2 = ((bfg) this.d).a();
        Object objA3 = ((bfg) this.e).a();
        Object objA4 = ((bfg) this.g).a();
        Object objA5 = ((bfg) this.v).a();
        Object objA6 = ((bfg) this.w).a();
        bfg bfgVar2 = new bfg(new fnb((bfg) this.x));
        return new dhg((b) objA, bfgVar, (hfg) objA2, bfgVar2);
    }

    public void b(String str, String str2) {
        HashMap map = (HashMap) this.w;
        if (map != null) {
            map.put(str, str2);
        } else {
            qc0.p("Property \"autoMetadata\" has not been set");
        }
    }

    public xo0 c() {
        String strConcat = ((String) this.b) == null ? " transportName" : "";
        if (((cv4) this.f) == null) {
            strConcat = strConcat.concat(" encodedPayload");
        }
        if (((Long) this.g) == null) {
            strConcat = strConcat.concat(" eventMillis");
        }
        if (((Long) this.v) == null) {
            strConcat = strConcat.concat(" uptimeMillis");
        }
        if (((HashMap) this.w) == null) {
            strConcat = strConcat.concat(" autoMetadata");
        }
        if (strConcat.isEmpty()) {
            return new xo0((String) this.b, (Integer) this.d, (cv4) this.f, ((Long) this.g).longValue(), ((Long) this.v).longValue(), (HashMap) this.w, (Integer) this.e, (String) this.c, (byte[]) this.x, (byte[]) this.y);
        }
        qc0.p("Missing required properties:".concat(strConcat));
        return null;
    }

    public LinkedHashSet d(List list) throws a37 {
        String strE;
        ace aceVar = (ace) this.v;
        n23 n23Var = (n23) aceVar.getValue();
        xi1 xi1Var = (xi1) this.c;
        List<String> listJ1 = s72.j1(list);
        vea veaVar = (vea) this.d;
        n23Var.getClass();
        try {
            ArrayList arrayList = new ArrayList();
            mf1 mf1VarA = n23Var.a();
            if (xi1Var != null) {
                try {
                    strE = db6.E(mf1VarA, xi1Var.b());
                } catch (IllegalStateException e) {
                    if (b21.F(3, "CXCP")) {
                        Log.d("CXCP", "Unable to get Metadata for cameraID 0 and/or 1", e);
                    }
                    strE = null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : listJ1) {
                    if (!pa7.t(str, strE)) {
                        n23 n23Var2 = n23Var.b;
                        ig1.a(str);
                        ng1 ng1VarQ = ((pg1) new o23(n23Var2, new ue1(str, 0), veaVar).z.get()).q();
                        ng1VarQ.getClass();
                        arrayList2.add(ng1VarQ);
                    }
                }
                for (kg1 kg1Var : xi1Var.a(arrayList2)) {
                    kg1Var.getClass();
                    String strD = ((ng1) kg1Var).d();
                    strD.getClass();
                    arrayList.add(strD);
                }
                listJ1 = arrayList;
            }
            mf1 mf1VarA2 = ((n23) aceVar.getValue()).a();
            ArrayList arrayList3 = new ArrayList();
            for (String str2 : listJ1) {
                if (pa7.t(str2, "0") || pa7.t(str2, "1")) {
                    arrayList3.add(str2);
                } else if (cn1.G(mf1VarA2, str2)) {
                    arrayList3.add(str2);
                } else if (b21.F(3, "CXCP")) {
                    Log.d("CXCP", "Camera " + str2 + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
                }
            }
            return new LinkedHashSet(arrayList3);
        } catch (IllegalStateException e2) {
            if (b21.F(6, "CXCP")) {
                b1.e("CXCP", "Error while accessing info about cameras.", e2);
            }
            throw new a37(e2);
        }
    }

    public Set g() {
        synchronized (this.x) {
            if (((AtomicBoolean) this.y).get()) {
                return xu4.a;
            }
            return new LinkedHashSet((Set) this.w);
        }
    }

    public pg1 h(String str) throws dk1 {
        str.getClass();
        if (((AtomicBoolean) this.y).get()) {
            throw new dk1("CameraFactory has been shut down.");
        }
        n23 n23Var = ((n23) ((ace) this.v).getValue()).b;
        ig1.a(str);
        return (pg1) new o23(n23Var, new ue1(str, 0), (vea) this.d).z.get();
    }

    public boolean i(int i) {
        return (((i09) this.g).d & i) != 0;
    }

    public void j(List list) {
        if (((AtomicBoolean) this.y).get()) {
            return;
        }
        LinkedHashSet linkedHashSetD = d(list);
        synchronized (this.x) {
            try {
                if (((AtomicBoolean) this.y).get()) {
                    return;
                }
                if (pa7.t((Set) this.w, linkedHashSetD)) {
                    return;
                }
                if (b21.F(3, "CXCP")) {
                    Log.d("CXCP", "Updated available camera list: " + ((Set) this.w) + " -> " + linkedHashSetD);
                }
                this.w = linkedHashSetD;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k(i09 i09Var, yf9 yf9Var) {
        for (i09 i09Var2 = i09Var.e; i09Var2 != null; i09Var2 = i09Var2.e) {
            if (i09Var2 == ((uf9) this.c)) {
                LayoutNode layoutNodeF = ((LayoutNode) this.b).F();
                yf9Var.N0 = layoutNodeF != null ? (c47) layoutNodeF.V0.d : null;
                this.e = yf9Var;
                return;
            } else {
                if ((i09Var2.c & 2) != 0) {
                    return;
                }
                i09Var2.k1(yf9Var);
            }
        }
    }

    public void l() {
        for (i09 i09Var = (i09) this.g; i09Var != null; i09Var = i09Var.f) {
            i09Var.h1();
            if (i09Var.w) {
                e79 e79Var = zf9.a;
                if (!i09Var.Y) {
                    i37.c("autoInvalidateInsertedNode called on unattached node");
                }
                zf9.a(i09Var, -1, 1);
            }
            if (i09Var.x) {
                zf9.c(i09Var);
            }
            i09Var.w = false;
            i09Var.x = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:174:0x0147 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:37:0x0102  */
    /* JADX WARN: Code duplicated, block: B:40:0x0110 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x0123  */
    /* JADX WARN: Code duplicated, block: B:48:0x012d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0145  */
    /* JADX WARN: Code duplicated, block: B:72:0x018f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0192  */
    /* JADX WARN: Code duplicated, block: B:75:0x0196  */
    /* JADX WARN: Code duplicated, block: B:76:0x0199  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:78:0x01a5
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public void m(int r32, defpackage.i79 r33, defpackage.i79 r34, defpackage.i09 r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 968
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wo0.m(int, i79, i79, i09, boolean):void");
    }

    public void n() {
        nv7 nv7Var;
        ew9 ew9Var;
        LayoutNode layoutNode = (LayoutNode) this.b;
        yf9 yf9Var = (c47) this.d;
        for (i09 i09Var = ((zde) this.f).e; i09Var != null; i09Var = i09Var.e) {
            kv7 kv7VarL = vd0.L(i09Var);
            if (kv7VarL != null) {
                yf9 yf9Var2 = i09Var.v;
                if (yf9Var2 != null) {
                    nv7Var = (nv7) yf9Var2;
                    kv7 kv7Var = nv7Var.t1;
                    nv7Var.L1(kv7VarL);
                    if (kv7Var != i09Var && (ew9Var = nv7Var.k1) != null) {
                        ((ne6) ew9Var).c();
                    }
                } else {
                    nv7Var = new nv7(layoutNode, kv7VarL);
                    i09Var.k1(nv7Var);
                }
                yf9Var.N0 = nv7Var;
                nv7Var.M0 = yf9Var;
                yf9Var = nv7Var;
            } else {
                i09Var.k1(yf9Var);
            }
        }
        LayoutNode layoutNodeF = layoutNode.F();
        yf9Var.N0 = layoutNodeF != null ? (c47) layoutNodeF.V0.d : null;
        this.e = yf9Var;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                StringBuilder sb = new StringBuilder("[");
                i09 i09Var = (i09) this.g;
                zde zdeVar = (zde) this.f;
                if (i09Var == zdeVar) {
                    sb.append("]");
                } else {
                    while (i09Var != null && i09Var != zdeVar) {
                        sb.append(String.valueOf(i09Var));
                        if (i09Var.f == zdeVar) {
                            sb.append("]");
                        } else {
                            sb.append(",");
                            i09Var = i09Var.f;
                        }
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public wo0(bfg bfgVar, yea yeaVar, bfg bfgVar2, bfg bfgVar3, bfg bfgVar4, bfg bfgVar5, bfg bfgVar6, bfg bfgVar7, bfg bfgVar8, bfg bfgVar9) {
        this.a = 4;
        this.b = bfgVar;
        this.c = yeaVar;
        this.d = bfgVar2;
        this.e = bfgVar3;
        this.f = bfgVar4;
        this.g = bfgVar5;
        this.v = bfgVar6;
        this.w = bfgVar7;
        this.x = bfgVar8;
        this.y = bfgVar9;
    }

    public wo0(LayoutNode layoutNode) {
        this.a = 2;
        this.b = layoutNode;
        uf9 uf9Var = new uf9(0);
        uf9Var.d = -1;
        this.c = uf9Var;
        c47 c47Var = new c47(layoutNode);
        this.d = c47Var;
        this.e = c47Var;
        zde zdeVar = c47Var.t1;
        this.f = zdeVar;
        this.g = zdeVar;
        this.v = new i79();
    }

    public /* synthetic */ wo0() {
        this.a = 0;
    }

    public wo0(y45 y45Var, t45 t45Var, ece eceVar, int i, int i2) {
        this.a = 3;
        this.b = y45Var;
        this.d = t45Var;
        this.e = eceVar;
        this.f = new eye();
        this.g = eceVar.a(y45Var.t, new b98(1, this));
        this.v = new j5e(this);
        this.w = new k5e(this, i);
        this.x = new l5e(this, i2);
        this.y = new m5e(this);
        i5e i5eVar = new i5e(this);
        this.c = i5eVar;
        y45Var.m.a(i5eVar);
    }
}
