package defpackage;

import android.util.Log;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z1b {
    public final xzb a;
    public final hd1 b;
    public final nd1 c;
    public final aw2 d;
    public final f2b e;
    public final LinkedHashSet f;
    public final ArrayList g;

    public z1b(s8a s8aVar, xzb xzbVar, hd1 hd1Var, nd1 nd1Var, qwe qweVar) {
        s8aVar.getClass();
        xzbVar.getClass();
        hd1Var.getClass();
        nd1Var.getClass();
        qweVar.getClass();
        this.a = xzbVar;
        this.b = hd1Var;
        this.c = nd1Var;
        aw2 aw2Var = qweVar.a;
        this.d = aw2Var;
        f2b f2bVar = new f2b(new vx7(1, this, z1b.class, "prune", "prune$camera_camera2_pipe(Ljava/util/List;)V", 0, 14), new x1b(this, null));
        aw2Var.getClass();
        if (!f2bVar.d.a()) {
            qc0.p("PruningProcessingQueue cannot be re-started!");
            throw null;
        }
        if (ynb.V(aw2Var, null, null, new a2b(f2bVar, null), 3).isCancelled()) {
            f2bVar.a(null);
        }
        this.e = f2bVar;
        this.f = new LinkedHashSet();
        this.g = new ArrayList();
    }

    public final void a(String str) {
        str.getClass();
        ktb ktbVar = new ktb(str);
        if (this.e.e.d(ktbVar) instanceof qw1) {
            b1.d("CXCP", "Camera close by ID request failed for " + ((Object) ig1.b(str)) + '!');
            ktbVar.b.R(wef.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0072  */
    /* JADX WARN: Code duplicated, block: B:26:0x0094  */
    /* JADX WARN: Code duplicated, block: B:29:0x009e  */
    /* JADX WARN: Code duplicated, block: B:31:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00e0 -> B:44:0x00e3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:29:0x009e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.util.Set r11, defpackage.zn2 r12) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z1b.b(java.util.Set, zn2):java.lang.Object");
    }

    public final void c(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            n1b n1bVar = (n1b) it.next();
            n1bVar.c.b();
            this.g.remove(n1bVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, List list, yb1 yb1Var, aw2 aw2Var, zn2 zn2Var) {
        s1b s1bVar;
        if (zn2Var instanceof s1b) {
            s1bVar = (s1b) zn2Var;
            int i = s1bVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                s1bVar.label = i - Integer.MIN_VALUE;
            } else {
                s1bVar = new s1b(this, zn2Var);
            }
        } else {
            s1bVar = new s1b(this, zn2Var);
        }
        Object objB = s1bVar.result;
        int i2 = s1bVar.label;
        if (i2 == 0) {
            jzb.q(objB);
            Log.d("CXCP", "Opening " + ((Object) ig1.b(str)) + " with retries...");
            s1bVar.L$0 = str;
            s1bVar.L$1 = list;
            s1bVar.L$2 = aw2Var;
            s1bVar.label = 1;
            objB = this.a.b(str, this.b, yb1Var, s1bVar);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aw2Var = (aw2) s1bVar.L$2;
            list = (List) s1bVar.L$1;
            str = (String) s1bVar.L$0;
            jzb.q(objB);
        }
        eq9 eq9Var = (eq9) objB;
        kp kpVar = eq9Var.a;
        return kpVar == null ? new k1b(eq9Var.b) : new l1b(new id(kpVar, s72.o1(s72.R0(list, new ig1(str))), aw2Var, new p59(21, this)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(itb itbVar, zn2 zn2Var) {
        t1b t1bVar;
        if (zn2Var instanceof t1b) {
            t1bVar = (t1b) zn2Var;
            int i = t1bVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                t1bVar.label = i - Integer.MIN_VALUE;
            } else {
                t1bVar = new t1b(this, zn2Var);
            }
        } else {
            t1bVar = new t1b(this, zn2Var);
        }
        Object obj = t1bVar.result;
        int i2 = t1bVar.label;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        if (i2 == 0) {
            jzb.q(obj);
            id idVar = itbVar.a;
            Log.i("CXCP", "PruningCamera2DeviceManager#processRequestClose(" + ((Object) ig1.b(idVar.a.a)) + ')');
            LinkedHashSet linkedHashSet = this.f;
            if (linkedHashSet.contains(idVar)) {
                linkedHashSet.remove(idVar);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : this.g) {
                if (((n1b) obj2).b == idVar) {
                    arrayList.add(obj2);
                }
            }
            t1bVar.L$0 = itbVar;
            t1bVar.label = 1;
            c(arrayList);
            if (wefVar != bw2Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                jzb.q(obj);
                return wefVar;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        itbVar = (itb) t1bVar.L$0;
        jzb.q(obj);
        itbVar.a.c();
        id idVar2 = itbVar.a;
        t1bVar.L$0 = null;
        t1bVar.label = 2;
        return idVar2.b(t1bVar) == bw2Var ? bw2Var : wefVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:32:0x008c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:? A[LOOP:0: B:24:0x0074->B:34:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r2 == r6) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.jtb r8, defpackage.zn2 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.u1b
            if (r0 == 0) goto L13
            r0 = r9
            u1b r0 = (defpackage.u1b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            u1b r0 = new u1b
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            wef r2 = defpackage.wef.a
            r3 = 2
            r4 = 1
            java.util.LinkedHashSet r5 = r7.f
            bw2 r6 = defpackage.bw2.a
            if (r1 == 0) goto L46
            if (r1 == r4) goto L3d
            if (r1 != r3) goto L36
            java.lang.Object r7 = r0.L$1
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r0.L$0
            jtb r8 = (defpackage.jtb) r8
            defpackage.jzb.q(r9)
            goto L74
        L36:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            r7 = 0
            return r7
        L3d:
            java.lang.Object r7 = r0.L$0
            r8 = r7
            jtb r8 = (defpackage.jtb) r8
            defpackage.jzb.q(r9)
            goto L5c
        L46:
            defpackage.jzb.q(r9)
            java.lang.String r9 = "CXCP"
            java.lang.String r1 = "PruningCamera2DeviceManager#processRequestCloseAll()"
            android.util.Log.i(r9, r1)
            r0.L$0 = r8
            r0.label = r4
            java.util.ArrayList r9 = r7.g
            r7.c(r9)
            if (r2 != r6) goto L5c
            goto L8c
        L5c:
            java.util.Iterator r7 = r5.iterator()
        L60:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L70
            java.lang.Object r9 = r7.next()
            id r9 = (defpackage.id) r9
            r9.c()
            goto L60
        L70:
            java.util.Iterator r7 = r5.iterator()
        L74:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L8d
            java.lang.Object r9 = r7.next()
            id r9 = (defpackage.id) r9
            r0.L$0 = r8
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r9 = r9.b(r0)
            if (r9 != r6) goto L74
        L8c:
            return r6
        L8d:
            r5.clear()
            za2 r7 = r8.a
            r7.R(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z1b.f(jtb, zn2):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(ktb ktbVar, zn2 zn2Var) {
        v1b v1bVar;
        ktb ktbVar2;
        String str;
        Object next;
        ktb ktbVar3;
        if (zn2Var instanceof v1b) {
            v1bVar = (v1b) zn2Var;
            int i = v1bVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                v1bVar.label = i - Integer.MIN_VALUE;
            } else {
                v1bVar = new v1b(this, zn2Var);
            }
        } else {
            v1bVar = new v1b(this, zn2Var);
        }
        Object obj = v1bVar.result;
        int i2 = v1bVar.label;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        if (i2 != 0) {
            if (i2 == 1) {
                str = (String) v1bVar.L$1;
                ktbVar2 = (ktb) v1bVar.L$0;
                jzb.q(obj);
            } else {
                if (i2 != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ktbVar3 = (ktb) v1bVar.L$0;
                jzb.q(obj);
            }
            ktbVar2 = ktbVar3;
            ktbVar2.b.R(wefVar);
            return wefVar;
        }
        jzb.q(obj);
        String str2 = ktbVar.a;
        Log.i("CXCP", "PruningCamera2DeviceManager#processRequestCloseById(" + ((Object) ig1.b(ktbVar.a)) + ')');
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : this.g) {
            if (pa7.t(((n1b) obj2).a.a.a, str2)) {
                arrayList.add(obj2);
            }
        }
        v1bVar.L$0 = ktbVar;
        v1bVar.L$1 = str2;
        v1bVar.label = 1;
        c(arrayList);
        if (wefVar != bw2Var) {
            ktbVar2 = ktbVar;
            str = str2;
        }
        return bw2Var;
        LinkedHashSet linkedHashSet = this.f;
        Iterator it = linkedHashSet.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!pa7.t(((id) next).a.a, str));
        id idVar = (id) next;
        if (idVar != null) {
            linkedHashSet.remove(idVar);
            idVar.c();
            v1bVar.L$0 = ktbVar2;
            v1bVar.L$1 = null;
            v1bVar.label = 2;
            if (idVar.b(v1bVar) != bw2Var) {
                ktbVar3 = ktbVar2;
                ktbVar2 = ktbVar3;
            }
            return bw2Var;
        }
        ktbVar2.b.R(wefVar);
        return wefVar;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x027e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0292  */
    /* JADX WARN: Code duplicated, block: B:115:0x0182 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x024a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x028e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:? A[LOOP:2: B:50:0x0154->B:125:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0146 A[LOOP:3: B:46:0x0140->B:48:0x0146, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x015a  */
    /* JADX WARN: Code duplicated, block: B:64:0x019e  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:77:0x0207  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x0210  */
    /* JADX WARN: Code duplicated, block: B:83:0x021a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0226  */
    /* JADX WARN: Code duplicated, block: B:88:0x022d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0237  */
    /* JADX WARN: Code duplicated, block: B:99:0x0268  */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0278, code lost:
    
        if (b(r10, r0) == r1) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x028c, code lost:
    
        if (defpackage.wef.a == r1) goto L107;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x01ae, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x01d6, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.stb r10, defpackage.zn2 r11) {
        /*
            Method dump skipped, instruction units count: 686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z1b.h(stb, zn2):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0063  */
    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[LOOP:0: B:17:0x005b->B:57:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x008e -> B:28:0x0090). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object i(java.lang.String r13, defpackage.stb r14, defpackage.zn2 r15) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z1b.i(java.lang.String, stb, zn2):java.lang.Object");
    }
}
