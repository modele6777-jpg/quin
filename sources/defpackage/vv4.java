package defpackage;

import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vv4 {
    public static final String a = ff8.n("EnqueueRunnable");

    /* JADX WARN: Code duplicated, block: B:105:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:108:0x0302  */
    /* JADX WARN: Code duplicated, block: B:110:0x0306 A[LOOP:4: B:109:0x0304->B:110:0x0306, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x0348 A[LOOP:5: B:112:0x0342->B:114:0x0348, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x0364  */
    /* JADX WARN: Code duplicated, block: B:117:0x0385  */
    /* JADX WARN: Code duplicated, block: B:88:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:96:0x021a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0220  */
    /* JADX WARN: Instruction removed from duplicated block: B:108:0x0302, please report this as an issue */
    public static boolean a(lag lagVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        Iterator it;
        boolean z8;
        boolean z9;
        lbg lbgVar;
        UUID uuid;
        boolean zF;
        pbg pbgVarY;
        String string;
        Iterator it2;
        int i;
        lag lagVar2 = lagVar;
        HashSet hashSetB = lag.b(lagVar2);
        yag yagVar = lagVar2.a;
        List list = lagVar2.d;
        int i2 = 0;
        String[] strArr = (String[]) hashSetB.toArray(new String[0]);
        String str = lagVar2.b;
        d45 d45Var = lagVar2.c;
        uzd uzdVar = yagVar.b.d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase = yagVar.c;
        boolean z10 = strArr != null && strArr.length > 0;
        vag vagVar = vag.c;
        vag vagVar2 = vag.f;
        vag vagVar3 = vag.d;
        if (z10) {
            int length = strArr.length;
            z = false;
            z2 = false;
            z3 = true;
            while (true) {
                if (i2 < length) {
                    String str2 = strArr[i2];
                    List list2 = list;
                    lbg lbgVarD = workDatabase.x().d(str2);
                    if (lbgVarD == null) {
                        ff8.h().f(a, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    } else {
                        vag vagVar4 = lbgVarD.b;
                        z3 &= vagVar4 == vagVar;
                        if (vagVar4 == vagVar3) {
                            z2 = true;
                        } else if (vagVar4 == vagVar2) {
                            z = true;
                        }
                        i2++;
                        list = list2;
                    }
                }
                z9 = false;
                z8 = true;
                lagVar2.g = z8;
                return z9;
            }
        }
        z = false;
        z2 = false;
        z3 = true;
        List list3 = list;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        vag vagVar5 = vag.a;
        if (!zIsEmpty && !z10) {
            nbg nbgVarX = workDatabase.x();
            nbgVarX.getClass();
            str.getClass();
            z4 = zIsEmpty;
            z5 = z10;
            List list4 = (List) urg.I(nbgVarX.a, true, false, new alc(str, 28));
            if (!list4.isEmpty()) {
                d45 d45Var2 = d45.c;
                int i3 = 27;
                d45 d45Var3 = d45.d;
                if (d45Var == d45Var2 || d45Var == d45Var3) {
                    bx3 bx3VarS = workDatabase.s();
                    ArrayList arrayList = new ArrayList();
                    Iterator it3 = list4.iterator();
                    while (it3.hasNext()) {
                        Iterator it4 = it3;
                        jbg jbgVar = (jbg) it3.next();
                        WorkDatabase workDatabase2 = workDatabase;
                        String str3 = jbgVar.a;
                        bx3VarS.getClass();
                        str3.getClass();
                        bx3 bx3Var = bx3VarS;
                        yag yagVar2 = yagVar;
                        if (!((Boolean) urg.I(bx3VarS.a, true, false, new ia(str3, 12))).booleanValue()) {
                            vag vagVar6 = jbgVar.b;
                            boolean z11 = z3 & (vagVar6 == vagVar);
                            if (vagVar6 == vagVar3) {
                                z2 = true;
                            } else if (vagVar6 == vagVar2) {
                                z = true;
                            }
                            arrayList.add(jbgVar.a);
                            z3 = z11;
                        }
                        bx3VarS = bx3Var;
                        it3 = it4;
                        workDatabase = workDatabase2;
                        yagVar = yagVar2;
                    }
                    yagVar = yagVar;
                    workDatabase = workDatabase;
                    List list5 = arrayList;
                    list5 = arrayList;
                    if (d45Var == d45Var3 && (z || z2)) {
                        nbg nbgVarX2 = workDatabase.x();
                        nbgVarX2.getClass();
                        w5c w5cVar = nbgVarX2.a;
                        Iterator it5 = ((List) urg.I(w5cVar, true, false, new alc(str, 28))).iterator();
                        while (it5.hasNext()) {
                            String str4 = ((jbg) it5.next()).a;
                            str4.getClass();
                            urg.I(w5cVar, false, true, new alc(str4, 27));
                        }
                        z = false;
                        z2 = false;
                        list5 = Collections.EMPTY_LIST;
                    }
                    strArr = (String[]) list5.toArray(strArr);
                    z6 = strArr.length > 0;
                    z7 = false;
                } else {
                    if (d45Var == d45.b) {
                        Iterator it6 = list4.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                vag vagVar7 = ((jbg) it6.next()).b;
                                if (vagVar7 == vagVar5 || vagVar7 == vag.b) {
                                    z9 = false;
                                    z8 = true;
                                    lagVar2.g = z8;
                                    return z9;
                                }
                            }
                        }
                    }
                    workDatabase.p(new hla(11, new c0(workDatabase, str, yagVar, 6)));
                    nbg nbgVarX3 = workDatabase.x();
                    Iterator it7 = list4.iterator();
                    while (it7.hasNext()) {
                        String str5 = ((jbg) it7.next()).a;
                        nbgVarX3.getClass();
                        str5.getClass();
                        urg.I(nbgVarX3.a, false, true, new alc(str5, i3));
                        i3 = 27;
                    }
                    yagVar = yagVar;
                    workDatabase = workDatabase;
                    z6 = z5;
                    z7 = true;
                }
            }
            it = list3.iterator();
            while (it.hasNext()) {
                cq9 cq9Var = (cq9) it.next();
                lbgVar = cq9Var.b;
                uuid = cq9Var.a;
                if (z6 || z3) {
                    lbgVar.n = jCurrentTimeMillis;
                } else if (z2) {
                    lbgVar.b = vagVar3;
                } else if (z) {
                    lbgVar.b = vagVar2;
                } else {
                    lbgVar.b = vag.e;
                }
                if (lbgVar.b == vagVar5) {
                    z7 = true;
                }
                nbg nbgVarX4 = workDatabase.x();
                yag yagVar3 = yagVar;
                yagVar3.e.getClass();
                boolean z12 = z7;
                zF = lbgVar.e.f("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
                Iterator it8 = it;
                boolean zF2 = lbgVar.e.f("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
                boolean zF3 = lbgVar.e.f("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
                if (zF && zF2 && zF3) {
                    String str6 = lbgVar.c;
                    kb6 kb6Var = new kb6(11);
                    bb3 bb3Var = lbgVar.e;
                    bb3Var.getClass();
                    kb6Var.p(bb3Var.a);
                    ((LinkedHashMap) kb6Var.b).put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str6);
                    bb3 bb3VarI = kb6Var.i();
                    String str7 = lbgVar.a;
                    vag vagVar8 = lbgVar.b;
                    String str8 = lbgVar.d;
                    bb3 bb3Var2 = lbgVar.f;
                    long j = lbgVar.g;
                    long j2 = lbgVar.h;
                    long j3 = lbgVar.i;
                    jl2 jl2Var = lbgVar.j;
                    int i4 = lbgVar.k;
                    us0 us0Var = lbgVar.l;
                    long j4 = lbgVar.m;
                    long j5 = lbgVar.n;
                    long j6 = lbgVar.o;
                    long j7 = lbgVar.p;
                    boolean z13 = lbgVar.q;
                    rs9 rs9Var = lbgVar.r;
                    int i5 = lbgVar.s;
                    int i6 = lbgVar.t;
                    long j8 = lbgVar.u;
                    int i7 = lbgVar.v;
                    int i8 = lbgVar.w;
                    String str9 = lbgVar.x;
                    Boolean bool = lbgVar.y;
                    str7.getClass();
                    vagVar8.getClass();
                    str8.getClass();
                    bb3Var2.getClass();
                    jl2Var.getClass();
                    us0Var.getClass();
                    rs9Var.getClass();
                    lbgVar = new lbg(str7, vagVar8, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", str8, bb3VarI, bb3Var2, j, j2, j3, jl2Var, i4, us0Var, j4, j5, j6, j7, z13, rs9Var, i5, i6, j8, i7, i8, str9, bool);
                }
                nbgVarX4.getClass();
                urg.I(nbgVarX4.a, false, true, new p0g(9, nbgVarX4, lbgVar));
                if (z6) {
                    for (String str10 : strArr) {
                        String string2 = uuid.toString();
                        string2.getClass();
                        yw3 yw3Var = new yw3(string2, str10);
                        bx3 bx3VarS2 = workDatabase.s();
                        bx3VarS2.getClass();
                        urg.I(bx3VarS2.a, false, true, new ks2(17, bx3VarS2, yw3Var));
                    }
                }
                pbgVarY = workDatabase.y();
                string = uuid.toString();
                string.getClass();
                Set set = cq9Var.c;
                pbgVarY.getClass();
                it2 = set.iterator();
                while (it2.hasNext()) {
                    urg.I(pbgVarY.a, false, true, new p0g(10, pbgVarY, new obg((String) it2.next(), string)));
                }
                if (!z4) {
                    dbg dbgVarV = workDatabase.v();
                    String string3 = uuid.toString();
                    string3.getClass();
                    cbg cbgVar = new cbg(str, string3);
                    dbgVarV.getClass();
                    urg.I(dbgVarV.a, false, true, new p0g(5, dbgVarV, cbgVar));
                }
                yagVar = yagVar3;
                z7 = z12;
                it = it8;
                jCurrentTimeMillis = jCurrentTimeMillis;
            }
            z8 = true;
            z9 = z7;
            lagVar2 = lagVar;
            lagVar2.g = z8;
            return z9;
        }
        z4 = zIsEmpty;
        z5 = z10;
        z6 = z5;
        z7 = false;
        it = list3.iterator();
        while (it.hasNext()) {
            cq9 cq9Var2 = (cq9) it.next();
            lbgVar = cq9Var2.b;
            uuid = cq9Var2.a;
            if (z6) {
                lbgVar.n = jCurrentTimeMillis;
            } else {
                lbgVar.n = jCurrentTimeMillis;
            }
            if (lbgVar.b == vagVar5) {
                z7 = true;
            }
            nbg nbgVarX5 = workDatabase.x();
            yag yagVar4 = yagVar;
            yagVar4.e.getClass();
            boolean z14 = z7;
            zF = lbgVar.e.f("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
            Iterator it9 = it;
            boolean zF4 = lbgVar.e.f("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
            boolean zF5 = lbgVar.e.f("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
            if (zF) {
            }
            nbgVarX5.getClass();
            urg.I(nbgVarX5.a, false, true, new p0g(9, nbgVarX5, lbgVar));
            if (z6) {
                while (i < r0) {
                    String string4 = uuid.toString();
                    string4.getClass();
                    yw3 yw3Var2 = new yw3(string4, str10);
                    bx3 bx3VarS3 = workDatabase.s();
                    bx3VarS3.getClass();
                    urg.I(bx3VarS3.a, false, true, new ks2(17, bx3VarS3, yw3Var2));
                }
            }
            pbgVarY = workDatabase.y();
            string = uuid.toString();
            string.getClass();
            Set set2 = cq9Var2.c;
            pbgVarY.getClass();
            it2 = set2.iterator();
            while (it2.hasNext()) {
                urg.I(pbgVarY.a, false, true, new p0g(10, pbgVarY, new obg((String) it2.next(), string)));
            }
            if (!z4) {
                dbg dbgVarV2 = workDatabase.v();
                String string5 = uuid.toString();
                string5.getClass();
                cbg cbgVar2 = new cbg(str, string5);
                dbgVarV2.getClass();
                urg.I(dbgVarV2.a, false, true, new p0g(5, dbgVarV2, cbgVar2));
            }
            yagVar = yagVar4;
            z7 = z14;
            it = it9;
            jCurrentTimeMillis = jCurrentTimeMillis;
        }
        z8 = true;
        z9 = z7;
        lagVar2 = lagVar;
        lagVar2.g = z8;
        return z9;
    }
}
