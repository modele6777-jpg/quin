package defpackage;

import ai.askquin.datastore.model.InternalAnnualReportProgress;
import ai.askquin.datastore.model.LocalStorage;
import android.graphics.Typeface;
import android.os.Bundle;
import com.google.firebase.perf.session.SessionManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class y25 implements bb5, g1b, k52, czc, wjf, sl9, kga, lwa, h1b {
    public final /* synthetic */ int a;

    public y25() {
        this.a = 17;
        new od0(0);
        new HashMap();
    }

    public static da9 f(bs bsVar, ua9 ua9Var, Bundle bundle, g48 g48Var, na9 na9Var) {
        String string = UUID.randomUUID().toString();
        string.getClass();
        ua9Var.getClass();
        g48Var.getClass();
        return new da9(bsVar, ua9Var, bundle, g48Var, na9Var, string, null);
    }

    public static Typeface g(String str, ar5 ar5Var, int i) {
        if (i == 0 && pa7.t(ar5Var, ar5.w) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iD = vpf.D(ar5Var, i);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iD) : Typeface.create(str, iD);
    }

    public static a56 p(String str) {
        Object next;
        mx4 mx4Var = a56.c;
        mx4Var.getClass();
        l2 l2Var = new l2(0, mx4Var);
        while (l2Var.hasNext()) {
            next = l2Var.next();
            if (pa7.t(((a56) next).a(), str)) {
                return (a56) next;
            }
        }
        next = null;
        return (a56) next;
    }

    public static qnc q(String str) {
        Object next;
        str.getClass();
        mx4 mx4Var = qnc.c;
        mx4Var.getClass();
        l2 l2Var = new l2(0, mx4Var);
        while (l2Var.hasNext()) {
            next = l2Var.next();
            if (pa7.t(((qnc) next).b(), str)) {
                return (qnc) next;
            }
        }
        next = null;
        return (qnc) next;
    }

    public static e1a r(String str) {
        str.getClass();
        a71 a71Var = c.a;
        f41 f41Var = new f41();
        f41Var.n1(str);
        return c.d(f41Var, false);
    }

    public static a1b s(String str) throws IOException {
        a1b a1bVar = a1b.HTTP_1_0;
        if (str.equals(a1bVar.protocol)) {
            return a1bVar;
        }
        a1b a1bVar2 = a1b.HTTP_1_1;
        if (str.equals(a1bVar2.protocol)) {
            return a1bVar2;
        }
        a1b a1bVar3 = a1b.H2_PRIOR_KNOWLEDGE;
        if (str.equals(a1bVar3.protocol)) {
            return a1bVar3;
        }
        a1b a1bVar4 = a1b.HTTP_2;
        if (str.equals(a1bVar4.protocol)) {
            return a1bVar4;
        }
        a1b a1bVar5 = a1b.SPDY_3;
        if (str.equals(a1bVar5.protocol)) {
            return a1bVar5;
        }
        a1b a1bVar6 = a1b.QUIC;
        if (str.equals(a1bVar6.protocol)) {
            return a1bVar6;
        }
        a1b a1bVar7 = a1b.HTTP_3;
        if (c5e.C(str, a1bVar7.protocol, false)) {
            return a1bVar7;
        }
        yg5.m("Unexpected protocol: ".concat(str));
        return null;
    }

    public static e1a t(File file) {
        String str = e1a.b;
        String string = file.toString();
        string.getClass();
        return r(string);
    }

    @Override // defpackage.czc
    public Object B(FileInputStream fileInputStream) {
        return fzc.a.b(LocalStorage.Companion.serializer(), new String(lmg.p0(fileInputStream), ox1.a));
    }

    @Override // defpackage.k52
    public w57 a() {
        w57 w57Var = w57.a;
        return mh3.x(System.currentTimeMillis());
    }

    @Override // defpackage.kga
    public Typeface b(ar5 ar5Var, int i) {
        return g(null, ar5Var, i);
    }

    @Override // defpackage.bb5
    public boolean c(zzc zzcVar) {
        return false;
    }

    @Override // defpackage.kga
    public Typeface d(o66 o66Var, ar5 ar5Var, int i) {
        String strConcat = o66Var.f;
        int i2 = ar5Var.a / 100;
        if (i2 >= 0 && i2 < 2) {
            strConcat = strConcat.concat("-thin");
        } else if (2 <= i2 && i2 < 4) {
            strConcat = strConcat.concat("-light");
        } else if (i2 != 4) {
            if (i2 == 5) {
                strConcat = strConcat.concat("-medium");
            } else if ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) {
                strConcat = strConcat.concat("-black");
            }
        }
        Typeface typeface = null;
        if (strConcat.length() != 0) {
            Typeface typefaceG = g(strConcat, ar5Var, i);
            if (!pa7.t(typefaceG, Typeface.create(Typeface.DEFAULT, vpf.D(ar5Var, i))) && !pa7.t(typefaceG, g(null, ar5Var, i))) {
                typeface = typefaceG;
            }
        }
        return typeface == null ? g(o66Var.f, ar5Var, i) : typeface;
    }

    @Override // defpackage.czc
    public Object e() {
        return new LocalStorage((List) null, (List) null, (List) null, (List) null, false, 0, false, (String) null, (String) null, false, (List) null, 0, (String) null, (List) null, (String) null, false, false, (InternalAnnualReportProgress) null, (String) null, (Map) null, (Map) null, false, 4194303, (rp3) null);
    }

    @Override // defpackage.h1b
    public Object get() {
        switch (this.a) {
            case 2:
                SessionManager sessionManager = SessionManager.getInstance();
                nk8.o(sessionManager);
                return sessionManager;
            default:
                w1e w1eVar = new w1e(10);
                HashMap map = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    r82.g("Null flags");
                    return null;
                }
                map.put(lua.a, new dq0(30000L, 86400000L, set));
                if (set == null) {
                    r82.g("Null flags");
                    return null;
                }
                map.put(lua.c, new dq0(1000L, 86400000L, set));
                if (set == null) {
                    r82.g("Null flags");
                    return null;
                }
                Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(cfc.b)));
                if (setUnmodifiableSet == null) {
                    r82.g("Null flags");
                    return null;
                }
                map.put(lua.b, new dq0(86400000L, 86400000L, setUnmodifiableSet));
                if (map.keySet().size() >= lua.values().length) {
                    new HashMap();
                    return new cq0(w1eVar, map);
                }
                qc0.p("Not all priorities have been configured");
                return null;
        }
    }

    @Override // defpackage.e85
    public k79 h() {
        return k79.j();
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0229  */
    /* JADX WARN: Code duplicated, block: B:171:0x02df  */
    /* JADX WARN: Code duplicated, block: B:189:0x0310  */
    /* JADX WARN: Code duplicated, block: B:194:0x0328  */
    /* JADX WARN: Code duplicated, block: B:233:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:239:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:246:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:250:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:252:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:253:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:255:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:259:0x0400  */
    /* JADX WARN: Code duplicated, block: B:260:0x0402  */
    /* JADX WARN: Code duplicated, block: B:262:0x0405  */
    /* JADX WARN: Code duplicated, block: B:263:0x0407  */
    /* JADX WARN: Code duplicated, block: B:265:0x040f  */
    /* JADX WARN: Code duplicated, block: B:268:0x041e  */
    /* JADX WARN: Code duplicated, block: B:274:0x0433  */
    /* JADX WARN: Code duplicated, block: B:275:0x043a  */
    /* JADX WARN: Code duplicated, block: B:280:0x0443  */
    /* JADX WARN: Code duplicated, block: B:284:0x044a  */
    /* JADX WARN: Code duplicated, block: B:286:0x044d  */
    /* JADX WARN: Code duplicated, block: B:290:0x0454  */
    /* JADX WARN: Code duplicated, block: B:293:0x045b  */
    /* JADX WARN: Code duplicated, block: B:296:0x0465  */
    /* JADX WARN: Code duplicated, block: B:301:0x0476  */
    /* JADX WARN: Code duplicated, block: B:305:0x0487  */
    /* JADX WARN: Code duplicated, block: B:307:0x0491  */
    /* JADX WARN: Code duplicated, block: B:308:0x0493  */
    /* JADX WARN: Code duplicated, block: B:313:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:314:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:317:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:320:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:324:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:328:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:342:0x03ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:344:0x0322 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:0x03f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:350:0x0428 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:352:0x0418 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:0x0497 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x0481 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:359:0x04cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:362:0x04bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:364:0x0476 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:365:0x046f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:368:0x045f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:373:0x022d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0149  */
    /* JADX WARN: Code duplicated, block: B:96:0x0213  */
    /* JADX WARN: Code duplicated, block: B:98:0x0217  */
    /* JADX WARN: Multi-variable type inference failed */
    public tt7 i(xs6 xs6Var, tt7 tt7Var, List list, q7f q7fVar, boolean z) {
        boolean z2;
        boolean z3;
        ArrayList arrayList;
        dag dagVar;
        e8f e8fVarU;
        wf7[] wf7VarArr;
        dag dagVar2;
        dag dagVarB;
        wf7 wf7Var;
        boolean z4;
        boolean z5;
        wf7 wf7Var2;
        boolean z6;
        Iterable annotations;
        bj5 bj5VarR;
        boolean z7;
        ArrayList<wf7> arrayList2;
        Iterator it;
        boolean z8;
        boolean z9;
        h69 h69Var;
        vj9 vj9Var;
        ArrayList arrayList3;
        f00 f00Var;
        Set setO1;
        vj9 vj9Var2;
        vj9 vj9Var3;
        boolean z10;
        boolean z11;
        ArrayList arrayList4;
        h69 h69Var2;
        h69 h69Var3;
        h69 h69Var4;
        h69 h69Var5;
        h69 h69Var6;
        boolean z12;
        ArrayList arrayList5;
        Iterator it2;
        h69 h69Var7;
        h69 h69Var8;
        Iterator it3;
        wf7 wf7Var3;
        ArrayList arrayList6;
        Iterator it4;
        Set setO2;
        vj9 vj9Var4;
        vj9 vj9Var5;
        f5 f5Var;
        Object wf7Var4;
        xt7 xt7Var;
        Object objD;
        x8f x8fVarB;
        f00 f00Var2 = (f00) xs6Var.c;
        szc szcVar = (szc) xs6Var.d;
        boolean z13 = xs6Var.a;
        tt7Var.getClass();
        ArrayList arrayListG = xs6Var.g(tt7Var);
        ArrayList arrayList7 = new ArrayList(t72.u(list, 10));
        Iterator it5 = list.iterator();
        while (it5.hasNext()) {
            arrayList7.add(xs6Var.g((xt7) it5.next()));
        }
        if (!z13 || list.isEmpty()) {
            z2 = false;
            break;
        }
        Iterator it6 = list.iterator();
        while (true) {
            if (!it6.hasNext()) {
                z2 = false;
                break;
            }
            xt7 xt7Var2 = (xt7) it6.next();
            xt7Var2.getClass();
            if (!((cf9) ((mf7) szcVar.b).l).a(tt7Var, (tt7) xt7Var2)) {
                z2 = true;
                break;
            }
        }
        int size = arrayListG.size();
        wf7[] wf7VarArr2 = new wf7[size];
        int i = 0;
        while (i < size) {
            lw7 lw7VarN = eb3.N(z18.c, new vq8(xs6Var, arrayListG, i, 2));
            wf7 wf7Var5 = wf7.f;
            if (i <= 0 || !z2) {
                f5 f5Var2 = (f5) arrayListG.get(i);
                ge7 ge7Var = (ge7) lw7VarN.getValue();
                xt7 xt7Var3 = f5Var2.a;
                e8f e8fVar = f5Var2.c;
                z3 = z13;
                vj9 vj9Var6 = vj9.a;
                vj9 vj9Var7 = vj9.b;
                arrayList = arrayList7;
                Object obj = vj9.c;
                if (xt7Var3 == null) {
                    dagVar = null;
                    if (e8fVar == null) {
                        x8fVarB = null;
                    } else {
                        if (!(e8fVar instanceof c8f)) {
                            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                            sb.append(e8fVar);
                            sb.append(", ");
                            qc0.o(tec.j(job.a, e8fVar.getClass(), sb));
                            return null;
                        }
                        dsf dsfVarX = ((c8f) e8fVar).x();
                        dsfVarX.getClass();
                        x8fVarB = m7c.b(dsfVarX);
                    }
                    if (x8fVarB == x8f.IN) {
                        wf7VarArr = wf7VarArr2;
                        wf7Var2 = wf7Var5;
                        dagVar2 = null;
                    }
                    z7 = wf7Var2.d;
                    arrayList2 = new ArrayList();
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        f5Var = (f5) s72.y0(i, (List) it.next());
                        if (f5Var != null || (xt7Var = f5Var.a) == null) {
                            wf7Var4 = dagVar2;
                        } else {
                            Object objD2 = xs6.d(xt7Var);
                            if (objD2 == null) {
                                tt7 tt7VarL = q7c.l((tt7) xt7Var);
                                objD = tt7VarL != null ? xs6.d(tt7VarL) : dagVar2;
                            } else {
                                objD = objD2;
                            }
                            h69 h69VarC = xs6.c(xt7Var);
                            Object objC = xs6.c(xt7Var);
                            if (objC == null) {
                                tt7 tt7VarL2 = q7c.l((tt7) xt7Var);
                                objC = tt7VarL2 != null ? xs6.c(tt7VarL2) : dagVar2;
                            }
                            tjd tjdVarS = db6.s(xt7Var);
                            wf7Var4 = new wf7(objD, h69VarC, ((tjdVarS != null ? db6.q(tjdVarS) : dagVar2) != null) || (((tt7) xt7Var).k0() instanceof zg9), objD != objD2, objC != h69VarC);
                        }
                        if (wf7Var4 != null) {
                            arrayList2.add(wf7Var4);
                        }
                    }
                    if (i == 0 || !z3) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    if (i == 0 || !(f00Var2 instanceof xrf) || ((xrf) f00Var2).y == null) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    h69Var = wf7Var2.b;
                    vj9Var = wf7Var2.a;
                    arrayList3 = new ArrayList();
                    for (wf7 wf7Var6 : arrayList2) {
                        f00 f00Var3 = f00Var2;
                        if (wf7Var6.d) {
                            vj9Var5 = null;
                        } else {
                            vj9Var5 = wf7Var6.a;
                        }
                        if (vj9Var5 != null) {
                            arrayList3.add(vj9Var5);
                        }
                        f00Var2 = f00Var3;
                    }
                    f00Var = f00Var2;
                    setO1 = s72.o1(arrayList3);
                    if (z7) {
                        vj9Var2 = null;
                    } else {
                        vj9Var2 = vj9Var;
                    }
                    if (vj9Var2 == vj9Var6) {
                        vj9Var3 = vj9Var6;
                    } else {
                        vj9Var3 = (vj9) q3c.r(setO1, obj, vj9Var7, vj9Var2, z8);
                    }
                    if (vj9Var3 == null) {
                        arrayList6 = new ArrayList();
                        it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            vj9Var4 = ((wf7) it4.next()).a;
                            if (vj9Var4 != null) {
                                arrayList6.add(vj9Var4);
                            }
                        }
                        setO2 = s72.o1(arrayList6);
                        if (vj9Var != vj9Var6) {
                            vj9Var6 = (vj9) q3c.r(setO2, obj, vj9Var7, vj9Var, z8);
                        }
                    } else {
                        vj9Var6 = vj9Var3;
                    }
                    if (vj9Var6 != null || z || (z9 && vj9Var6 == vj9Var7)) {
                        vj9Var6 = null;
                    }
                    if (vj9Var6 == null && vj9Var3 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (vj9Var6 != obj) {
                        z11 = false;
                    } else {
                        if (z7 == z10 || !wf7Var2.c) {
                            if (!arrayList2.isEmpty()) {
                                it3 = arrayList2.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        wf7Var3 = (wf7) it3.next();
                                        if (wf7Var3.d == z10 || !wf7Var3.c) {
                                        }
                                    }
                                }
                            }
                            z11 = false;
                        }
                        z11 = true;
                    }
                    arrayList4 = new ArrayList();
                    for (wf7 wf7Var7 : arrayList2) {
                        if (wf7Var7.e) {
                            h69Var8 = null;
                        } else {
                            h69Var8 = wf7Var7.b;
                        }
                        if (h69Var8 != null) {
                            arrayList4.add(h69Var8);
                        }
                    }
                    Set setO3 = s72.o1(arrayList4);
                    if (wf7Var2.e) {
                        h69Var2 = null;
                    } else {
                        h69Var2 = h69Var;
                    }
                    h69Var3 = h69.b;
                    h69Var4 = h69.a;
                    h69Var5 = (h69) q3c.r(setO3, h69Var3, h69Var4, h69Var2, z8);
                    if (h69Var5 == null) {
                        arrayList5 = new ArrayList();
                        it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            h69Var7 = ((wf7) it2.next()).b;
                            if (h69Var7 != null) {
                                arrayList5.add(h69Var7);
                            }
                        }
                        h69Var6 = (h69) q3c.r(s72.o1(arrayList5), h69Var3, h69Var4, h69Var, z8);
                    } else {
                        h69Var6 = h69Var5;
                    }
                    if (h69Var6 == null && h69Var5 == null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    wf7Var5 = new wf7(vj9Var6, h69Var6, z11, z10, z12);
                } else {
                    dagVar = null;
                }
                boolean z14 = e8fVar == null;
                pu4 pu4Var = pu4.a;
                Iterable annotations2 = xt7Var3 != 0 ? ((tt7) xt7Var3).getAnnotations() : pu4Var;
                if (xt7Var3 == 0) {
                    e8fVarU = dagVar;
                } else {
                    tjd tjdVarS2 = db6.s(xt7Var3);
                    if (tjdVarS2 == null && ((bj5VarR = db6.r(xt7Var3)) == null || (tjdVarS2 = db6.u0(bj5VarR)) == null)) {
                        tjd tjdVarS3 = db6.s(xt7Var3);
                        tjdVarS3.getClass();
                        tjdVarS2 = tjdVarS3;
                    }
                    j7f j7fVarD1 = db6.d1(tjdVarS2);
                    if (j7fVarD1 != null) {
                        e8fVarU = db6.U(j7fVarD1);
                    } else {
                        e8fVarU = dagVar;
                    }
                }
                boolean z15 = ((y00) xs6Var.e) == y00.TYPE_PARAMETER_BOUNDS;
                if (z14) {
                    if (!z15) {
                        Object obj2 = szcVar.b;
                    }
                    if (f00Var2 == null || (annotations = f00Var2.getAnnotations()) == null) {
                        annotations = pu4Var;
                    }
                    annotations2 = s72.O0(annotations, annotations2);
                }
                dag dagVarC = b10.c(annotations2, new w(1, ((mf7) szcVar.b).j, b10.class, "extractMutability", "extractMutability(Ljava/lang/Object;)Lkotlin/reflect/jvm/internal/impl/load/java/typeEnhancement/WithMigrationStatus;", 0, 0));
                b10 b10Var = ((mf7) szcVar.b).j;
                d5 d5Var = new d5(0, xs6Var, f5Var2);
                Iterator it7 = annotations2.iterator();
                dag dagVar3 = dagVar;
                while (true) {
                    if (!it7.hasNext()) {
                        wf7VarArr = wf7VarArr2;
                        dagVar2 = dagVar;
                        break;
                    }
                    Object next = it7.next();
                    next.getClass();
                    Iterator it8 = it7;
                    dag dagVarH = b10Var.h(next, ((Boolean) d5Var.d(next)).booleanValue());
                    if (dagVarH != null) {
                        wf7VarArr = wf7VarArr2;
                        dagVar2 = dagVar;
                    } else {
                        Object objJ = b10Var.j(next);
                        if (objJ == null) {
                            wf7VarArr = wf7VarArr2;
                        } else {
                            csb csbVarI = b10Var.i(next);
                            if (csbVarI == null) {
                                csbVarI = ((nj7) b10Var.a.c).a;
                            }
                            wf7VarArr = wf7VarArr2;
                            if (csbVarI == csb.IGNORE) {
                                dagVarH = dagVar;
                                dagVar2 = dagVarH;
                            } else {
                                dag dagVarH2 = b10Var.h(objJ, ((Boolean) d5Var.d(objJ)).booleanValue());
                                if (dagVarH2 != null) {
                                    boolean zB = csbVarI.b();
                                    dagVar2 = dagVar;
                                    dagVarH = dag.a(dagVarH2, dagVar2, zB, 1);
                                }
                            }
                            if (dagVar3 == null) {
                                dagVar3 = dagVarH;
                            } else {
                                boolean z16 = dagVar3.b;
                                if (dagVarH == null && !dagVarH.equals(dagVar3) && (!(z6 = dagVarH.b) || z16)) {
                                    if (z6 || !z16) {
                                        dagVar3 = dagVar2;
                                        break;
                                    }
                                    dagVar3 = dagVarH;
                                }
                            }
                            d5Var = d5Var;
                            wf7VarArr2 = wf7VarArr;
                            it7 = it8;
                            dagVar = dagVar2;
                        }
                        dagVar2 = dagVar;
                        dagVarH = dagVar2;
                        if (dagVar3 == null) {
                            dagVar3 = dagVarH;
                        } else {
                            boolean z17 = dagVar3.b;
                            if (dagVarH == null) {
                                continue;
                            }
                        }
                        d5Var = d5Var;
                        wf7VarArr2 = wf7VarArr;
                        it7 = it8;
                        dagVar = dagVar2;
                    }
                    if (dagVar3 == null) {
                        dagVar3 = dagVarH;
                    } else {
                        boolean z18 = dagVar3.b;
                        if (dagVarH == null) {
                            continue;
                        }
                    }
                    d5Var = d5Var;
                    wf7VarArr2 = wf7VarArr;
                    it7 = it8;
                    dagVar = dagVar2;
                }
                if (dagVar3 != null) {
                    Object obj3 = dagVar3.a;
                    wf7Var = new wf7((vj9) obj3, dagVarC != null ? (h69) dagVarC.a : dagVar2, obj3 == obj && e8fVarU != null, dagVar3.b, dagVarC != null && dagVarC.b);
                } else {
                    dag dagVarB2 = e8fVarU != null ? xs6Var.b(e8fVarU) : dagVar2;
                    dag dagVarA = dagVarB2 != null ? dag.a(dagVarB2, obj, false, 2) : ge7Var != null ? ge7Var.a : dagVar2;
                    boolean z19 = (dagVarB2 != null ? (vj9) dagVarB2.a : dagVar2) == obj || !(e8fVarU == null || ge7Var == null || !ge7Var.c);
                    if (e8fVar == null || (dagVarB = xs6Var.b(e8fVar)) == null) {
                        dagVarB = dagVar2;
                    } else if (dagVarB.a == vj9Var7) {
                        dagVarB = dag.a(dagVarB, vj9Var6, false, 2);
                    }
                    if (dagVarB != null) {
                        Object obj4 = dagVarB.a;
                        if (dagVarA == null) {
                            dagVarA = dagVarB;
                        } else {
                            Object obj5 = dagVarA.a;
                            boolean z20 = dagVarA.b;
                            boolean z21 = dagVarB.b;
                            if (!z21 || z20) {
                                if (z21 || !z20) {
                                    vj9 vj9Var8 = (vj9) obj4;
                                    Enum r7 = (Enum) obj5;
                                    if (vj9Var8.compareTo(r7) >= 0 && vj9Var8.compareTo(r7) > 0) {
                                        dagVarA = dagVarB;
                                    }
                                } else {
                                    dagVarA = dagVarB;
                                }
                            }
                        }
                    }
                    vj9 vj9Var9 = dagVarA != null ? (vj9) dagVarA.a : dagVar2;
                    h69 h69Var9 = dagVarC != null ? (h69) dagVarC.a : dagVar2;
                    if (dagVarA != null) {
                        z4 = true;
                        boolean z22 = dagVarA.b;
                        if (dagVarC == null && dagVarC.b == z4) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        wf7Var = new wf7(vj9Var9, h69Var9, z19, z22, z5);
                    } else {
                        z4 = true;
                    }
                    if (dagVarC == null) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    wf7Var = new wf7(vj9Var9, h69Var9, z19, z22, z5);
                }
                wf7Var2 = wf7Var;
                z7 = wf7Var2.d;
                arrayList2 = new ArrayList();
                it = arrayList.iterator();
                while (it.hasNext()) {
                    f5Var = (f5) s72.y0(i, (List) it.next());
                    if (f5Var != null) {
                        wf7Var4 = dagVar2;
                    } else {
                        wf7Var4 = dagVar2;
                    }
                    if (wf7Var4 != null) {
                        arrayList2.add(wf7Var4);
                    }
                }
                if (i == 0) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (i == 0) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                h69Var = wf7Var2.b;
                vj9Var = wf7Var2.a;
                arrayList3 = new ArrayList();
                while (r14.hasNext()) {
                    f00 f00Var4 = f00Var2;
                    if (wf7Var6.d) {
                        vj9Var5 = null;
                    } else {
                        vj9Var5 = wf7Var6.a;
                    }
                    if (vj9Var5 != null) {
                        arrayList3.add(vj9Var5);
                    }
                    f00Var2 = f00Var4;
                }
                f00Var = f00Var2;
                setO1 = s72.o1(arrayList3);
                if (z7) {
                    vj9Var2 = null;
                } else {
                    vj9Var2 = vj9Var;
                }
                if (vj9Var2 == vj9Var6) {
                    vj9Var3 = vj9Var6;
                } else {
                    vj9Var3 = (vj9) q3c.r(setO1, obj, vj9Var7, vj9Var2, z8);
                }
                if (vj9Var3 == null) {
                    arrayList6 = new ArrayList();
                    it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        vj9Var4 = ((wf7) it4.next()).a;
                        if (vj9Var4 != null) {
                            arrayList6.add(vj9Var4);
                        }
                    }
                    setO2 = s72.o1(arrayList6);
                    if (vj9Var != vj9Var6) {
                        vj9Var6 = (vj9) q3c.r(setO2, obj, vj9Var7, vj9Var, z8);
                    }
                } else {
                    vj9Var6 = vj9Var3;
                }
                if (vj9Var6 != null) {
                    vj9Var6 = null;
                } else {
                    vj9Var6 = null;
                }
                if (vj9Var6 == null) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (vj9Var6 != obj) {
                    z11 = false;
                } else if (z7 == z10) {
                    if (!arrayList2.isEmpty()) {
                        it3 = arrayList2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                wf7Var3 = (wf7) it3.next();
                                if (wf7Var3.d == z10) {
                                }
                            }
                        }
                    }
                    z11 = false;
                } else {
                    if (!arrayList2.isEmpty()) {
                        it3 = arrayList2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                wf7Var3 = (wf7) it3.next();
                                if (wf7Var3.d == z10) {
                                }
                            }
                        }
                    }
                    z11 = false;
                }
                arrayList4 = new ArrayList();
                while (r5.hasNext()) {
                    if (wf7Var7.e) {
                        h69Var8 = null;
                    } else {
                        h69Var8 = wf7Var7.b;
                    }
                    if (h69Var8 != null) {
                        arrayList4.add(h69Var8);
                    }
                }
                Set setO4 = s72.o1(arrayList4);
                if (wf7Var2.e) {
                    h69Var2 = null;
                } else {
                    h69Var2 = h69Var;
                }
                h69Var3 = h69.b;
                h69Var4 = h69.a;
                h69Var5 = (h69) q3c.r(setO4, h69Var3, h69Var4, h69Var2, z8);
                if (h69Var5 == null) {
                    arrayList5 = new ArrayList();
                    it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        h69Var7 = ((wf7) it2.next()).b;
                        if (h69Var7 != null) {
                            arrayList5.add(h69Var7);
                        }
                    }
                    h69Var6 = (h69) q3c.r(s72.o1(arrayList5), h69Var3, h69Var4, h69Var, z8);
                } else {
                    h69Var6 = h69Var5;
                }
                if (h69Var6 == null) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                wf7Var5 = new wf7(vj9Var6, h69Var6, z11, z10, z12);
            } else {
                f00Var = f00Var2;
                szcVar = szcVar;
                z3 = z13;
                arrayList = arrayList7;
                size = size;
                wf7VarArr = wf7VarArr2;
            }
            wf7VarArr[i] = wf7Var5;
            i++;
            f00Var2 = f00Var;
            z2 = z2;
            z13 = z3;
            arrayListG = arrayListG;
            arrayList7 = arrayList;
            szcVar = szcVar;
            wf7VarArr2 = wf7VarArr;
            size = size;
        }
        return (tt7) eu4.e(tt7Var.k0(), new d5(1, q7fVar, wf7VarArr2), 0, xs6Var.b).c;
    }

    public tt7 k(vd7 vd7Var, ca1 ca1Var, boolean z, szc szcVar, y00 y00Var, q7f q7fVar, boolean z2, a26 a26Var) {
        xs6 xs6Var = new xs6((f00) ca1Var, z, szcVar, y00Var, false);
        tt7 tt7Var = (tt7) a26Var.d(vd7Var);
        Collection collectionL = vd7Var.l();
        collectionL.getClass();
        Collection<ea1> collection = collectionL;
        ArrayList arrayList = new ArrayList(t72.u(collection, 10));
        for (ea1 ea1Var : collection) {
            ea1Var.getClass();
            arrayList.add((tt7) a26Var.d(ea1Var));
        }
        return i(xs6Var, tt7Var, arrayList, q7fVar, z2);
    }

    /* JADX WARN: Code duplicated, block: B:135:0x028e  */
    /* JADX WARN: Code duplicated, block: B:149:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:80:0x0175  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [ca1] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r24v0, types: [y25] */
    /* JADX WARN: Type inference failed for: r5v3, types: [bm3, ca1, ea1] */
    /* JADX WARN: Type inference failed for: r5v4, types: [vd7] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v38 */
    public ArrayList l(szc szcVar, Collection collection) {
        h10 annotations;
        tt7 type;
        lpa lpaVar;
        iy9 iy9Var;
        int i;
        List list;
        zxa zxaVar;
        vic vicVar = vic.E0;
        szcVar.getClass();
        Collection<??> collection2 = collection;
        int i2 = 10;
        ArrayList arrayList = new ArrayList(t72.u(collection2, 10));
        for (?? G0 : collection2) {
            if (!(G0 instanceof vd7)) {
                i = i2;
            } else if (G0.g() == 2 && G0.a().l().size() == 1) {
                i = 10;
            } else {
                y22 y22VarD = qk2.D(G0);
                int i3 = 0;
                if (y22VarD == null) {
                    annotations = ((m4) G0).getAnnotations();
                } else {
                    rx7 rx7Var = y22VarD instanceof rx7 ? (rx7) y22VarD : null;
                    List list2 = rx7Var != null ? (List) rx7Var.y.getValue() : null;
                    if (list2 == null || list2.isEmpty()) {
                        annotations = ((m4) G0).getAnnotations();
                    } else {
                        ArrayList arrayList2 = new ArrayList(t72.u(list2, i2));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(new ox7((tmb) it.next(), szcVar, true));
                        }
                        ArrayList arrayListO0 = s72.O0(((m4) G0).getAnnotations(), arrayList2);
                        annotations = arrayListO0.isEmpty() ? hj6.c : new j10(i3, arrayListO0);
                    }
                }
                szc szcVarS = if9.s(szcVar, annotations);
                ?? r12 = (!(G0 instanceof lf7) || (zxaVar = ((yxa) G0).M0) == null || zxaVar.f) ? G0 : zxaVar;
                nw7 nw7VarO = G0.O();
                y00 y00Var = y00.VALUE_PARAMETER;
                if (nw7VarO != null) {
                    c36 c36Var = r12 instanceof c36 ? (c36) r12 : null;
                    xrf xrfVar = c36Var != null ? (xrf) c36Var.o(if7.V0) : null;
                    type = k((vd7) G0, xrfVar, false, xrfVar != null ? if9.s(szcVarS, xrfVar.getAnnotations()) : szcVarS, y00Var, null, false, vic.X);
                } else {
                    type = null;
                }
                if7 if7Var = G0 instanceof if7 ? (if7) G0 : null;
                if (if7Var != null) {
                    bm3 bm3VarK = if7Var.k();
                    bm3VarK.getClass();
                    u09 u09Var = (u09) bm3VarK;
                    String strQ = xo1.q(if7Var, 3);
                    String str = qf7.a;
                    j22 j22VarH = qf7.h(qz3.g(u09Var).a);
                    lpaVar = (lpa) kpa.d.get((j22VarH != null ? gk7.c(j22VarH) : y41.f(u09Var, gec.y)) + '.' + strQ);
                    if (lpaVar != null) {
                        String str2 = lpaVar.c;
                        if (str2 != null && !c5e.C(str2, "2.", false)) {
                            qc0.p("Check failed.");
                            return null;
                        }
                        if (str2 != null) {
                            lpaVar = lpaVar.d;
                        }
                    } else {
                        lpaVar = null;
                    }
                } else {
                    lpaVar = null;
                }
                if (lpaVar != null) {
                    lpaVar.b.size();
                    ((if7) G0).G().size();
                }
                boolean z = ((x) ((mf7) szcVar.b).m.d).d(jf7.a) == csb.STRICT && (G0 instanceof c36) && pa7.t(G0.o(if7.W0), Boolean.TRUE);
                List<xrf> listG = r12.G();
                listG.getClass();
                ArrayList arrayList3 = new ArrayList(t72.u(listG, i2));
                for (xrf xrfVar2 : listG) {
                    arrayList3.add(k((vd7) G0, xrfVar2, false, xrfVar2 != null ? if9.s(szcVarS, xrfVar2.getAnnotations()) : szcVarS, y00Var, (lpaVar == null || (list = lpaVar.b) == null) ? null : (q7f) s72.y0(xrfVar2.g, list), z, new ymb(5, xrfVar2)));
                }
                wxa wxaVar = G0 instanceof wxa ? (wxa) G0 : null;
                vd7 vd7Var = (vd7) G0;
                tt7 tt7VarK = k(vd7Var, r12, true, szcVarS, (wxaVar == null || !lmg.l0(wxaVar)) ? y00.METHOD_RETURN_TYPE : y00.FIELD, lpaVar != null ? lpaVar.a : null, false, vic.Y);
                tt7 returnType = G0.getReturnType();
                returnType.getClass();
                if (w8f.c(returnType, vicVar, null)) {
                    iy9Var = new iy9(jgb.n, new ex3());
                } else {
                    nw7 nw7VarO2 = G0.O();
                    if (nw7VarO2 != null ? w8f.c(nw7VarO2.getType(), vicVar, null) : false) {
                        iy9Var = new iy9(jgb.n, new ex3());
                    } else {
                        List listG2 = G0.G();
                        listG2.getClass();
                        if (!listG2.isEmpty()) {
                            Iterator it2 = listG2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    tt7 type2 = ((xrf) it2.next()).getType();
                                    type2.getClass();
                                    if (w8f.c(type2, vicVar, null)) {
                                        iy9Var = new iy9(jgb.n, new ex3());
                                    }
                                }
                            }
                        }
                        iy9Var = null;
                    }
                }
                if (type == null && tt7VarK == null) {
                    if (!arrayList3.isEmpty()) {
                        Iterator it3 = arrayList3.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (((tt7) it3.next()) != null) {
                                }
                            } else if (iy9Var != null) {
                                i = 10;
                            }
                        }
                    } else if (iy9Var != null) {
                        i = 10;
                    }
                }
                if (type == null) {
                    nw7 nw7VarO3 = G0.O();
                    type = nw7VarO3 != null ? nw7VarO3.getType() : null;
                }
                i = 10;
                ArrayList arrayList4 = new ArrayList(t72.u(arrayList3, 10));
                int i4 = 0;
                for (Object obj : arrayList3) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        t72.Z();
                        throw null;
                    }
                    tt7 type3 = (tt7) obj;
                    if (type3 == null) {
                        type3 = ((xrf) G0.G().get(i4)).getType();
                        type3.getClass();
                    }
                    arrayList4.add(type3);
                    i4 = i5;
                }
                if (tt7VarK == null) {
                    tt7VarK = G0.getReturnType();
                    tt7VarK.getClass();
                }
                G0 = vd7Var.g0(type, arrayList4, tt7VarK, iy9Var);
            }
            arrayList.add(G0);
            i2 = i;
        }
        return arrayList;
    }

    @Override // defpackage.wjf
    public xjf o() {
        return new iv8();
    }

    @Override // defpackage.czc
    public Object v0(Object obj, abf abfVar, ke5 ke5Var) {
        js3 js3Var = ga4.a;
        Object objP0 = ynb.p0(hr3.c, new hd8(abfVar, (LocalStorage) obj, null), ke5Var);
        return objP0 == bw2.a ? objP0 : wef.a;
    }

    public /* synthetic */ y25(int i, Object obj) {
        this.a = i;
    }

    public /* synthetic */ y25(int i) {
        this.a = i;
    }

    @Override // defpackage.lwa
    public void m() {
    }

    public y25(ge8 ge8Var) {
        this.a = 24;
        String str = ge8.d;
        new ConcurrentHashMap(3, 1.0f, 2);
    }

    @Override // defpackage.sl9
    public int j(int i) {
        return i;
    }

    @Override // defpackage.sl9
    public int v(int i) {
        return i;
    }

    @Override // defpackage.lwa
    public void n(int i, Object obj) {
    }
}
