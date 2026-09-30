package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ffe {
    public static final dee a = new dee(3, null);

    /* JADX WARN: Code duplicated, block: B:17:0x004d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0057  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004b -> B:18:0x004e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(defpackage.mbe r5, boolean r6, defpackage.iia r7, defpackage.xn2 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.eee
            if (r0 == 0) goto L13
            r0 = r8
            eee r0 = (defpackage.eee) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            eee r0 = new eee
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L33
            boolean r5 = r0.Z$0
            java.lang.Object r6 = r0.L$1
            iia r6 = (defpackage.iia) r6
            java.lang.Object r7 = r0.L$0
            mbe r7 = (defpackage.mbe) r7
            defpackage.jzb.q(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4e
        L33:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r5)
            r5 = 0
            return r5
        L3a:
            defpackage.jzb.q(r8)
        L3d:
            r0.L$0 = r5
            r0.L$1 = r7
            r0.Z$0 = r6
            r0.label = r2
            java.lang.Object r8 = r5.a(r7, r0)
            bw2 r1 = defpackage.bw2.a
            if (r8 != r1) goto L4e
            return r1
        L4e:
            hia r8 = (defpackage.hia) r8
            r1 = 0
            boolean r3 = f(r8, r6, r1)
            if (r3 == 0) goto L3d
            java.util.List r5 = r8.a
            java.lang.Object r5 = r5.get(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffe.a(mbe, boolean, iia, xn2):java.lang.Object");
    }

    public static /* synthetic */ Object b(mbe mbeVar, xn2 xn2Var, int i) {
        return a(mbeVar, (i & 1) != 0, (i & 2) != 0 ? iia.b : iia.a, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0051 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0065  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0052 -> B:19:0x0056). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(defpackage.mbe r6, defpackage.iia r7, defpackage.pt0 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.fee
            if (r0 == 0) goto L13
            r0 = r8
            fee r0 = (defpackage.fee) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            fee r0 = new fee
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3c
            if (r1 != r3) goto L35
            boolean r6 = r0.Z$0
            java.lang.Object r7 = r0.L$1
            iia r7 = (defpackage.iia) r7
            java.lang.Object r1 = r0.L$0
            mbe r1 = (defpackage.mbe) r1
            defpackage.jzb.q(r8)
            r5 = r7
            r7 = r6
            r6 = r1
            r1 = r0
            r0 = r5
            goto L56
        L35:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            r6 = 0
            return r6
        L3c:
            defpackage.jzb.q(r8)
            r8 = r7
            r7 = r2
        L41:
            r0.L$0 = r6
            r0.L$1 = r8
            r0.Z$0 = r7
            r0.label = r3
            java.lang.Object r1 = r6.a(r8, r0)
            bw2 r4 = defpackage.bw2.a
            if (r1 != r4) goto L52
            return r4
        L52:
            r5 = r0
            r0 = r8
            r8 = r1
            r1 = r5
        L56:
            hia r8 = (defpackage.hia) r8
            boolean r4 = f(r8, r7, r3)
            if (r4 == 0) goto L65
            java.util.List r6 = r8.a
            java.lang.Object r6 = r6.get(r2)
            return r6
        L65:
            r8 = r0
            r0 = r1
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffe.c(mbe, iia, pt0):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0041 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004e A[LOOP:0: B:19:0x004c->B:20:0x004e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:26:0x006d A[LOOP:1: B:22:0x0060->B:26:0x006d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003f -> B:18:0x0042). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:23:0x0062
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(defpackage.mbe r7, defpackage.zn2 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.hee
            if (r0 == 0) goto L13
            r0 = r8
            hee r0 = (defpackage.hee) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            hee r0 = new hee
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            java.lang.Object r7 = r0.L$0
            mbe r7 = (defpackage.mbe) r7
            defpackage.jzb.q(r8)
            goto L42
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            r7 = 0
            return r7
        L30:
            defpackage.jzb.q(r8)
        L33:
            r0.L$0 = r7
            r0.label = r2
            iia r8 = defpackage.iia.b
            java.lang.Object r8 = r7.a(r8, r0)
            bw2 r1 = defpackage.bw2.a
            if (r8 != r1) goto L42
            return r1
        L42:
            hia r8 = (defpackage.hia) r8
            java.util.List r1 = r8.a
            int r3 = r1.size()
            r4 = 0
            r5 = r4
        L4c:
            if (r5 >= r3) goto L5a
            java.lang.Object r6 = r1.get(r5)
            oia r6 = (defpackage.oia) r6
            r6.a()
            int r5 = r5 + 1
            goto L4c
        L5a:
            java.util.List r8 = r8.a
            int r1 = r8.size()
        L60:
            if (r4 >= r1) goto L70
            java.lang.Object r3 = r8.get(r4)
            oia r3 = (defpackage.oia) r3
            boolean r3 = r3.d
            if (r3 == 0) goto L6d
            goto L33
        L6d:
            int r4 = r4 + 1
            goto L60
        L70:
            wef r7 = defpackage.wef.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffe.d(mbe, zn2):java.lang.Object");
    }

    public static Object e(tia tiaVar, a26 a26Var, feb febVar, dpd dpdVar, a26 a26Var2, xn2 xn2Var, int i) {
        a26 a26Var3 = (i & 1) != 0 ? null : a26Var;
        feb febVar2 = (i & 2) != 0 ? null : febVar;
        n26 n26Var = dpdVar;
        if ((i & 4) != 0) {
            n26Var = a;
        }
        Object objO = jgb.O(new pee(tiaVar, a26Var3, febVar2, n26Var, (i & 8) != 0 ? null : a26Var2, null), xn2Var);
        return objO == bw2.a ? objO : wef.a;
    }

    public static final boolean f(hia hiaVar, boolean z, boolean z2) {
        if (z2) {
            List list = hiaVar.a;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    if ((hiaVar.d & 33) != 0) {
                        break;
                    }
                    return false;
                }
                if (((oia) list.get(i)).i != 2) {
                    break;
                }
                i++;
            }
        }
        List list2 = hiaVar.a;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            oia oiaVar = (oia) list2.get(i2);
            if (!(z ? xo1.k(oiaVar) : xo1.l(oiaVar))) {
                return false;
            }
        }
        return true;
    }

    public static lyd g(aw2 aw2Var, dg7 dg7Var, l26 l26Var) {
        return ynb.V(aw2Var, null, dw2.d, new qee(dg7Var, l26Var, null), 1);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:103:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:106:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:26:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:28:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:31:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:33:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:36:0x0204  */
    /* JADX WARN: Code duplicated, block: B:39:0x0214  */
    /* JADX WARN: Code duplicated, block: B:42:0x023c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0248  */
    /* JADX WARN: Code duplicated, block: B:47:0x024c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0251  */
    /* JADX WARN: Code duplicated, block: B:50:0x0255  */
    /* JADX WARN: Code duplicated, block: B:53:0x025e  */
    /* JADX WARN: Code duplicated, block: B:54:0x026b  */
    /* JADX WARN: Code duplicated, block: B:56:0x027c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x027e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0280  */
    /* JADX WARN: Code duplicated, block: B:60:0x028b  */
    /* JADX WARN: Code duplicated, block: B:63:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:66:0x02ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:69:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:71:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:73:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:76:0x030d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0319  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x0337  */
    /* JADX WARN: Code duplicated, block: B:84:0x0349  */
    /* JADX WARN: Code duplicated, block: B:87:0x0371  */
    /* JADX WARN: Code duplicated, block: B:90:0x037c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0380  */
    /* JADX WARN: Code duplicated, block: B:93:0x038c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0390  */
    /* JADX WARN: Code duplicated, block: B:97:0x039a  */
    /* JADX WARN: Code duplicated, block: B:99:0x03b1  */
    public static final Object h(mbe mbeVar, aw2 aw2Var, nta ntaVar, a26 a26Var, a26 a26Var2, n26 n26Var, a26 a26Var3, pt0 pt0Var) throws Throwable {
        ree reeVar;
        a26 a26Var4;
        a26 a26Var5;
        mbe mbeVar2;
        a26 a26Var6;
        aw2 aw2Var2;
        nta ntaVar2;
        n26 n26Var2;
        oia oiaVar;
        wef wefVar;
        sf8 sf8Var;
        dg7 dg7VarV;
        Object objI;
        a26 a26Var7;
        n26 n26Var3;
        oia oiaVar2;
        a26 a26Var8;
        mbe mbeVar3;
        a26 a26Var9;
        dg7 dg7Var;
        n26 n26Var4;
        a26 a26Var10;
        a26 a26Var11;
        oia oiaVar3;
        mbe mbeVar4;
        sf8 sf8Var2;
        lyd lydVarG;
        a26 a26Var12;
        lyd lydVar;
        a26 a26Var13;
        Object objE;
        oia oiaVar4;
        aw2 aw2Var3;
        a26 a26Var14;
        a26 a26Var15;
        nta ntaVar3;
        dg7 dg7Var2;
        n26 n26Var5;
        a26 a26Var16;
        tf8 tf8Var;
        xn2 xn2Var;
        dg7 dg7Var3;
        nta ntaVar4;
        aw2 aw2Var4;
        oia oiaVar5;
        a26 a26Var17;
        lyd lydVarV;
        a26 a26Var18;
        Object objI2;
        dg7 dg7Var4;
        oia oiaVar6;
        a26 a26Var19;
        a26 a26Var20;
        oia oiaVar7;
        nta ntaVar5;
        dg7 dg7Var5;
        oia oiaVar8;
        a26 a26Var21;
        aw2 aw2Var5;
        nta ntaVar6;
        a26 a26Var22;
        oia oiaVar9;
        tf8 tf8Var2;
        xn2 xn2Var2;
        dg7 dg7Var6;
        aw2 aw2Var6;
        if (pt0Var instanceof ree) {
            reeVar = (ree) pt0Var;
            int i = reeVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                reeVar.label = i - Integer.MIN_VALUE;
            } else {
                reeVar = new ree(pt0Var);
            }
        } else {
            reeVar = new ree(pt0Var);
        }
        Object objJ = reeVar.result;
        int i2 = reeVar.label;
        dw2 dw2Var = dw2.d;
        iia iiaVar = iia.b;
        sf8 sf8Var3 = sf8.a;
        dee deeVar = a;
        wef wefVar2 = wef.a;
        bw2 bw2Var = bw2.a;
        switch (i2) {
            case 0:
                jzb.q(objJ);
                reeVar.L$0 = mbeVar;
                reeVar.L$1 = aw2Var;
                reeVar.L$2 = ntaVar;
                a26Var4 = a26Var;
                reeVar.L$3 = a26Var4;
                a26Var5 = a26Var2;
                reeVar.L$4 = a26Var5;
                reeVar.L$5 = n26Var;
                reeVar.L$6 = a26Var3;
                reeVar.label = 1;
                Object objB = b(mbeVar, reeVar, 3);
                if (objB != bw2Var) {
                    mbeVar2 = mbeVar;
                    a26Var6 = a26Var3;
                    aw2Var2 = aw2Var;
                    objJ = objB;
                    ntaVar2 = ntaVar;
                    n26Var2 = n26Var;
                    oiaVar = (oia) objJ;
                    oiaVar.a();
                    wefVar = wefVar2;
                    sf8Var = sf8Var3;
                    dg7VarV = ynb.V(aw2Var2, null, dw2Var, new afe(ntaVar2, null), 1);
                    if (n26Var2 != deeVar) {
                        g(aw2Var2, dg7VarV, new see(n26Var2, ntaVar2, oiaVar, null));
                    }
                    if (a26Var5 == null) {
                        reeVar.L$0 = mbeVar2;
                        reeVar.L$1 = aw2Var2;
                        reeVar.L$2 = ntaVar2;
                        reeVar.L$3 = a26Var4;
                        reeVar.L$4 = a26Var5;
                        reeVar.L$5 = n26Var2;
                        reeVar.L$6 = a26Var6;
                        reeVar.L$7 = dg7VarV;
                        reeVar.label = 2;
                        objJ = j(mbeVar2, iiaVar, reeVar);
                        if (objJ != bw2Var) {
                            n26 n26Var6 = n26Var2;
                            a26Var9 = a26Var6;
                            dg7Var = dg7VarV;
                            n26Var4 = n26Var6;
                            a26 a26Var23 = a26Var5;
                            a26Var10 = a26Var4;
                            a26Var11 = a26Var23;
                            oiaVar3 = (oia) objJ;
                            mbeVar4 = mbeVar2;
                            sf8Var2 = sf8Var;
                            if (oiaVar3 == null) {
                                lydVarG = g(aw2Var2, dg7Var, new uee(ntaVar2, null));
                            } else {
                                oiaVar3.a();
                                lydVarG = g(aw2Var2, dg7Var, new vee(ntaVar2, null));
                            }
                            if (oiaVar3 != null) {
                                if (a26Var10 == null) {
                                    reeVar.L$0 = mbeVar4;
                                    reeVar.L$1 = aw2Var2;
                                    reeVar.L$2 = ntaVar2;
                                    reeVar.L$3 = a26Var10;
                                    reeVar.L$4 = a26Var11;
                                    reeVar.L$5 = n26Var4;
                                    reeVar.L$6 = a26Var9;
                                    reeVar.L$7 = oiaVar3;
                                    reeVar.L$8 = lydVarG;
                                    reeVar.label = 5;
                                    a26Var12 = a26Var11;
                                    lydVar = lydVarG;
                                    a26Var13 = a26Var9;
                                    objE = mbeVar4.e(mbeVar4.c().a(), new gee(oiaVar3, null), reeVar);
                                    if (objE != bw2Var) {
                                        oiaVar4 = oiaVar3;
                                        aw2Var3 = aw2Var2;
                                        a26Var14 = a26Var12;
                                        objJ = objE;
                                        a26Var15 = a26Var10;
                                        ntaVar3 = ntaVar2;
                                        dg7Var2 = lydVar;
                                        n26Var5 = n26Var4;
                                        a26Var16 = a26Var13;
                                        oiaVar5 = (oia) objJ;
                                        if (oiaVar5 != null) {
                                            a26Var17 = a26Var14;
                                            lydVarV = ynb.V(aw2Var3, null, dw2Var, new wee(dg7Var2, ntaVar3, null), 1);
                                            if (n26Var5 != deeVar) {
                                                g(aw2Var3, lydVarV, new xee(n26Var5, ntaVar3, oiaVar5, null));
                                            }
                                            if (a26Var17 == null) {
                                                reeVar.L$0 = aw2Var3;
                                                reeVar.L$1 = ntaVar3;
                                                reeVar.L$2 = a26Var15;
                                                reeVar.L$3 = a26Var16;
                                                reeVar.L$4 = lydVarV;
                                                reeVar.L$5 = oiaVar4;
                                                reeVar.L$6 = null;
                                                reeVar.L$7 = null;
                                                reeVar.L$8 = null;
                                                reeVar.label = 6;
                                                objJ = j(mbeVar4, iiaVar, reeVar);
                                                if (objJ != bw2Var) {
                                                    oia oiaVar10 = oiaVar4;
                                                    dg7Var5 = lydVarV;
                                                    oiaVar8 = oiaVar10;
                                                    a26Var21 = a26Var16;
                                                    aw2Var5 = aw2Var3;
                                                    ntaVar6 = ntaVar3;
                                                    a26Var22 = a26Var15;
                                                    oiaVar9 = (oia) objJ;
                                                    if (oiaVar9 != null) {
                                                        oiaVar9.a();
                                                        g(aw2Var5, dg7Var5, new yee(ntaVar6, null));
                                                        a26Var22.d(new hl9(oiaVar9.c));
                                                        return wefVar;
                                                    }
                                                    g(aw2Var5, dg7Var5, new zee(ntaVar6, null));
                                                    if (a26Var21 != null) {
                                                        a26Var21.d(new hl9(oiaVar8.c));
                                                        return wefVar;
                                                    }
                                                }
                                            } else {
                                                reeVar.L$0 = mbeVar4;
                                                reeVar.L$1 = aw2Var3;
                                                reeVar.L$2 = ntaVar3;
                                                reeVar.L$3 = a26Var15;
                                                a26Var18 = a26Var17;
                                                reeVar.L$4 = a26Var18;
                                                reeVar.L$5 = a26Var16;
                                                reeVar.L$6 = lydVarV;
                                                reeVar.L$7 = oiaVar4;
                                                reeVar.L$8 = oiaVar5;
                                                reeVar.label = 7;
                                                objI2 = i(mbeVar4, iiaVar, reeVar);
                                                if (objI2 != bw2Var) {
                                                    dg7Var4 = lydVarV;
                                                    oiaVar6 = oiaVar5;
                                                    objJ = objI2;
                                                    a26Var19 = a26Var16;
                                                    a26Var20 = a26Var15;
                                                    oiaVar7 = oiaVar4;
                                                    ntaVar5 = ntaVar3;
                                                    tf8Var2 = (tf8) objJ;
                                                    if (pa7.t(tf8Var2, sf8Var2)) {
                                                        a26Var18.d(new hl9(oiaVar6.c));
                                                        reeVar.L$0 = aw2Var3;
                                                        reeVar.L$1 = ntaVar5;
                                                        reeVar.L$2 = dg7Var4;
                                                        xn2Var2 = null;
                                                        reeVar.L$3 = null;
                                                        reeVar.L$4 = null;
                                                        reeVar.L$5 = null;
                                                        reeVar.L$6 = null;
                                                        reeVar.L$7 = null;
                                                        reeVar.L$8 = null;
                                                        reeVar.label = 8;
                                                        if (d(mbeVar4, reeVar) != bw2Var) {
                                                            dg7Var6 = dg7Var4;
                                                            aw2Var6 = aw2Var3;
                                                            g(aw2Var6, dg7Var6, new bfe(ntaVar5, xn2Var2));
                                                            return wefVar;
                                                        }
                                                    } else {
                                                        if (tf8Var2 instanceof rf8) {
                                                            oiaVar9 = ((rf8) tf8Var2).a;
                                                            a26 a26Var24 = a26Var19;
                                                            ntaVar6 = ntaVar5;
                                                            dg7Var5 = dg7Var4;
                                                            a26Var21 = a26Var24;
                                                            oiaVar8 = oiaVar7;
                                                            a26Var22 = a26Var20;
                                                            aw2Var5 = aw2Var3;
                                                        } else {
                                                            if (tf8Var2 instanceof qf8) {
                                                                ap.c();
                                                                return null;
                                                            }
                                                            a26 a26Var25 = a26Var19;
                                                            ntaVar6 = ntaVar5;
                                                            dg7Var5 = dg7Var4;
                                                            a26Var21 = a26Var25;
                                                            oiaVar8 = oiaVar7;
                                                            a26Var22 = a26Var20;
                                                            aw2Var5 = aw2Var3;
                                                            oiaVar9 = null;
                                                        }
                                                        if (oiaVar9 != null) {
                                                            oiaVar9.a();
                                                            g(aw2Var5, dg7Var5, new yee(ntaVar6, null));
                                                            a26Var22.d(new hl9(oiaVar9.c));
                                                            return wefVar;
                                                        }
                                                        g(aw2Var5, dg7Var5, new zee(ntaVar6, null));
                                                        if (a26Var21 != null) {
                                                            a26Var21.d(new hl9(oiaVar8.c));
                                                            return wefVar;
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (a26Var16 != null) {
                                            a26Var16.d(new hl9(oiaVar4.c));
                                            return wefVar;
                                        }
                                    }
                                } else if (a26Var9 != null) {
                                    a26Var9.d(new hl9(oiaVar3.c));
                                    return wefVar;
                                }
                            }
                            return wefVar;
                        }
                    } else {
                        reeVar.L$0 = mbeVar2;
                        reeVar.L$1 = aw2Var2;
                        reeVar.L$2 = ntaVar2;
                        reeVar.L$3 = a26Var4;
                        reeVar.L$4 = a26Var5;
                        reeVar.L$5 = n26Var2;
                        reeVar.L$6 = a26Var6;
                        reeVar.L$7 = oiaVar;
                        reeVar.L$8 = dg7VarV;
                        reeVar.label = 3;
                        objI = i(mbeVar2, iiaVar, reeVar);
                        if (objI != bw2Var) {
                            a26Var7 = a26Var4;
                            n26Var3 = n26Var2;
                            oiaVar2 = oiaVar;
                            objJ = objI;
                            a26Var8 = a26Var6;
                            mbeVar3 = mbeVar2;
                            tf8Var = (tf8) objJ;
                            sf8Var2 = sf8Var;
                            if (!pa7.t(tf8Var, sf8Var2)) {
                                if (tf8Var instanceof rf8) {
                                    oiaVar3 = ((rf8) tf8Var).a;
                                } else {
                                    if (!(tf8Var instanceof qf8)) {
                                        ap.c();
                                        return null;
                                    }
                                    oiaVar3 = null;
                                }
                                a26Var9 = a26Var8;
                                mbeVar4 = mbeVar3;
                                dg7Var = dg7VarV;
                                n26Var4 = n26Var3;
                                a26Var11 = a26Var5;
                                a26Var10 = a26Var7;
                                if (oiaVar3 == null) {
                                    lydVarG = g(aw2Var2, dg7Var, new uee(ntaVar2, null));
                                } else {
                                    oiaVar3.a();
                                    lydVarG = g(aw2Var2, dg7Var, new vee(ntaVar2, null));
                                }
                                if (oiaVar3 != null) {
                                    if (a26Var10 == null) {
                                        reeVar.L$0 = mbeVar4;
                                        reeVar.L$1 = aw2Var2;
                                        reeVar.L$2 = ntaVar2;
                                        reeVar.L$3 = a26Var10;
                                        reeVar.L$4 = a26Var11;
                                        reeVar.L$5 = n26Var4;
                                        reeVar.L$6 = a26Var9;
                                        reeVar.L$7 = oiaVar3;
                                        reeVar.L$8 = lydVarG;
                                        reeVar.label = 5;
                                        a26Var12 = a26Var11;
                                        lydVar = lydVarG;
                                        a26Var13 = a26Var9;
                                        objE = mbeVar4.e(mbeVar4.c().a(), new gee(oiaVar3, null), reeVar);
                                        if (objE != bw2Var) {
                                            oiaVar4 = oiaVar3;
                                            aw2Var3 = aw2Var2;
                                            a26Var14 = a26Var12;
                                            objJ = objE;
                                            a26Var15 = a26Var10;
                                            ntaVar3 = ntaVar2;
                                            dg7Var2 = lydVar;
                                            n26Var5 = n26Var4;
                                            a26Var16 = a26Var13;
                                            oiaVar5 = (oia) objJ;
                                            if (oiaVar5 != null) {
                                                a26Var17 = a26Var14;
                                                lydVarV = ynb.V(aw2Var3, null, dw2Var, new wee(dg7Var2, ntaVar3, null), 1);
                                                if (n26Var5 != deeVar) {
                                                    g(aw2Var3, lydVarV, new xee(n26Var5, ntaVar3, oiaVar5, null));
                                                }
                                                if (a26Var17 == null) {
                                                    reeVar.L$0 = aw2Var3;
                                                    reeVar.L$1 = ntaVar3;
                                                    reeVar.L$2 = a26Var15;
                                                    reeVar.L$3 = a26Var16;
                                                    reeVar.L$4 = lydVarV;
                                                    reeVar.L$5 = oiaVar4;
                                                    reeVar.L$6 = null;
                                                    reeVar.L$7 = null;
                                                    reeVar.L$8 = null;
                                                    reeVar.label = 6;
                                                    objJ = j(mbeVar4, iiaVar, reeVar);
                                                    if (objJ != bw2Var) {
                                                        oia oiaVar11 = oiaVar4;
                                                        dg7Var5 = lydVarV;
                                                        oiaVar8 = oiaVar11;
                                                        a26Var21 = a26Var16;
                                                        aw2Var5 = aw2Var3;
                                                        ntaVar6 = ntaVar3;
                                                        a26Var22 = a26Var15;
                                                        oiaVar9 = (oia) objJ;
                                                        if (oiaVar9 != null) {
                                                            oiaVar9.a();
                                                            g(aw2Var5, dg7Var5, new yee(ntaVar6, null));
                                                            a26Var22.d(new hl9(oiaVar9.c));
                                                            return wefVar;
                                                        }
                                                        g(aw2Var5, dg7Var5, new zee(ntaVar6, null));
                                                        if (a26Var21 != null) {
                                                            a26Var21.d(new hl9(oiaVar8.c));
                                                            return wefVar;
                                                        }
                                                    }
                                                } else {
                                                    reeVar.L$0 = mbeVar4;
                                                    reeVar.L$1 = aw2Var3;
                                                    reeVar.L$2 = ntaVar3;
                                                    reeVar.L$3 = a26Var15;
                                                    a26Var18 = a26Var17;
                                                    reeVar.L$4 = a26Var18;
                                                    reeVar.L$5 = a26Var16;
                                                    reeVar.L$6 = lydVarV;
                                                    reeVar.L$7 = oiaVar4;
                                                    reeVar.L$8 = oiaVar5;
                                                    reeVar.label = 7;
                                                    objI2 = i(mbeVar4, iiaVar, reeVar);
                                                    if (objI2 != bw2Var) {
                                                        dg7Var4 = lydVarV;
                                                        oiaVar6 = oiaVar5;
                                                        objJ = objI2;
                                                        a26Var19 = a26Var16;
                                                        a26Var20 = a26Var15;
                                                        oiaVar7 = oiaVar4;
                                                        ntaVar5 = ntaVar3;
                                                        tf8Var2 = (tf8) objJ;
                                                        if (pa7.t(tf8Var2, sf8Var2)) {
                                                            a26Var18.d(new hl9(oiaVar6.c));
                                                            reeVar.L$0 = aw2Var3;
                                                            reeVar.L$1 = ntaVar5;
                                                            reeVar.L$2 = dg7Var4;
                                                            xn2Var2 = null;
                                                            reeVar.L$3 = null;
                                                            reeVar.L$4 = null;
                                                            reeVar.L$5 = null;
                                                            reeVar.L$6 = null;
                                                            reeVar.L$7 = null;
                                                            reeVar.L$8 = null;
                                                            reeVar.label = 8;
                                                            if (d(mbeVar4, reeVar) != bw2Var) {
                                                                dg7Var6 = dg7Var4;
                                                                aw2Var6 = aw2Var3;
                                                                g(aw2Var6, dg7Var6, new bfe(ntaVar5, xn2Var2));
                                                                return wefVar;
                                                            }
                                                        } else {
                                                            if (tf8Var2 instanceof rf8) {
                                                                oiaVar9 = ((rf8) tf8Var2).a;
                                                                a26 a26Var26 = a26Var19;
                                                                ntaVar6 = ntaVar5;
                                                                dg7Var5 = dg7Var4;
                                                                a26Var21 = a26Var26;
                                                                oiaVar8 = oiaVar7;
                                                                a26Var22 = a26Var20;
                                                                aw2Var5 = aw2Var3;
                                                            } else {
                                                                if (tf8Var2 instanceof qf8) {
                                                                    ap.c();
                                                                    return null;
                                                                }
                                                                a26 a26Var27 = a26Var19;
                                                                ntaVar6 = ntaVar5;
                                                                dg7Var5 = dg7Var4;
                                                                a26Var21 = a26Var27;
                                                                oiaVar8 = oiaVar7;
                                                                a26Var22 = a26Var20;
                                                                aw2Var5 = aw2Var3;
                                                                oiaVar9 = null;
                                                            }
                                                            if (oiaVar9 != null) {
                                                                oiaVar9.a();
                                                                g(aw2Var5, dg7Var5, new yee(ntaVar6, null));
                                                                a26Var22.d(new hl9(oiaVar9.c));
                                                                return wefVar;
                                                            }
                                                            g(aw2Var5, dg7Var5, new zee(ntaVar6, null));
                                                            if (a26Var21 != null) {
                                                                a26Var21.d(new hl9(oiaVar8.c));
                                                                return wefVar;
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (a26Var16 != null) {
                                                a26Var16.d(new hl9(oiaVar4.c));
                                                return wefVar;
                                            }
                                        }
                                    } else if (a26Var9 != null) {
                                        a26Var9.d(new hl9(oiaVar3.c));
                                        return wefVar;
                                    }
                                }
                                return wefVar;
                            }
                            a26Var5.d(new hl9(oiaVar2.c));
                            reeVar.L$0 = aw2Var2;
                            reeVar.L$1 = ntaVar2;
                            reeVar.L$2 = dg7VarV;
                            xn2Var = null;
                            reeVar.L$3 = null;
                            reeVar.L$4 = null;
                            reeVar.L$5 = null;
                            reeVar.L$6 = null;
                            reeVar.L$7 = null;
                            reeVar.L$8 = null;
                            reeVar.label = 4;
                            if (d(mbeVar3, reeVar) != bw2Var) {
                                dg7Var3 = dg7VarV;
                                ntaVar4 = ntaVar2;
                                aw2Var4 = aw2Var2;
                                g(aw2Var4, dg7Var3, new tee(ntaVar4, xn2Var));
                                return wefVar;
                            }
                        }
                    }
                }
                return bw2Var;
            case 1:
                a26Var6 = (a26) reeVar.L$6;
                n26Var2 = (n26) reeVar.L$5;
                a26 a26Var28 = (a26) reeVar.L$4;
                a26 a26Var29 = (a26) reeVar.L$3;
                ntaVar2 = (nta) reeVar.L$2;
                aw2Var2 = (aw2) reeVar.L$1;
                mbeVar2 = (mbe) reeVar.L$0;
                jzb.q(objJ);
                a26Var5 = a26Var28;
                a26Var4 = a26Var29;
                oiaVar = (oia) objJ;
                oiaVar.a();
                wefVar = wefVar2;
                sf8Var = sf8Var3;
                dg7VarV = ynb.V(aw2Var2, null, dw2Var, new afe(ntaVar2, null), 1);
                if (n26Var2 != deeVar) {
                    g(aw2Var2, dg7VarV, new see(n26Var2, ntaVar2, oiaVar, null));
                }
                if (a26Var5 == null) {
                    reeVar.L$0 = mbeVar2;
                    reeVar.L$1 = aw2Var2;
                    reeVar.L$2 = ntaVar2;
                    reeVar.L$3 = a26Var4;
                    reeVar.L$4 = a26Var5;
                    reeVar.L$5 = n26Var2;
                    reeVar.L$6 = a26Var6;
                    reeVar.L$7 = dg7VarV;
                    reeVar.label = 2;
                    objJ = j(mbeVar2, iiaVar, reeVar);
                    if (objJ != bw2Var) {
                        n26 n26Var7 = n26Var2;
                        a26Var9 = a26Var6;
                        dg7Var = dg7VarV;
                        n26Var4 = n26Var7;
                        a26 a26Var210 = a26Var5;
                        a26Var10 = a26Var4;
                        a26Var11 = a26Var210;
                        oiaVar3 = (oia) objJ;
                        mbeVar4 = mbeVar2;
                        sf8Var2 = sf8Var;
                        if (oiaVar3 == null) {
                            lydVarG = g(aw2Var2, dg7Var, new uee(ntaVar2, null));
                        } else {
                            oiaVar3.a();
                            lydVarG = g(aw2Var2, dg7Var, new vee(ntaVar2, null));
                        }
                        if (oiaVar3 != null) {
                            if (a26Var10 == null) {
                                reeVar.L$0 = mbeVar4;
                                reeVar.L$1 = aw2Var2;
                                reeVar.L$2 = ntaVar2;
                                reeVar.L$3 = a26Var10;
                                reeVar.L$4 = a26Var11;
                                reeVar.L$5 = n26Var4;
                                reeVar.L$6 = a26Var9;
                                reeVar.L$7 = oiaVar3;
                                reeVar.L$8 = lydVarG;
                                reeVar.label = 5;
                                a26Var12 = a26Var11;
                                lydVar = lydVarG;
                                a26Var13 = a26Var9;
                                objE = mbeVar4.e(mbeVar4.c().a(), new gee(oiaVar3, null), reeVar);
                                if (objE != bw2Var) {
                                    oiaVar4 = oiaVar3;
                                    aw2Var3 = aw2Var2;
                                    a26Var14 = a26Var12;
                                    objJ = objE;
                                    a26Var15 = a26Var10;
                                    ntaVar3 = ntaVar2;
                                    dg7Var2 = lydVar;
                                    n26Var5 = n26Var4;
                                    a26Var16 = a26Var13;
                                    oiaVar5 = (oia) objJ;
                                    if (oiaVar5 != null) {
                                        a26Var17 = a26Var14;
                                        lydVarV = ynb.V(aw2Var3, null, dw2Var, new wee(dg7Var2, ntaVar3, null), 1);
                                        if (n26Var5 != deeVar) {
                                            g(aw2Var3, lydVarV, new xee(n26Var5, ntaVar3, oiaVar5, null));
                                        }
                                        if (a26Var17 == null) {
                                            reeVar.L$0 = aw2Var3;
                                            reeVar.L$1 = ntaVar3;
                                            reeVar.L$2 = a26Var15;
                                            reeVar.L$3 = a26Var16;
                                            reeVar.L$4 = lydVarV;
                                            reeVar.L$5 = oiaVar4;
                                            reeVar.L$6 = null;
                                            reeVar.L$7 = null;
                                            reeVar.L$8 = null;
                                            reeVar.label = 6;
                                            objJ = j(mbeVar4, iiaVar, reeVar);
                                            if (objJ != bw2Var) {
                                                oia oiaVar12 = oiaVar4;
                                                dg7Var5 = lydVarV;
                                                oiaVar8 = oiaVar12;
                                                a26Var21 = a26Var16;
                                                aw2Var5 = aw2Var3;
                                                ntaVar6 = ntaVar3;
                                                a26Var22 = a26Var15;
                                                oiaVar9 = (oia) objJ;
                                                if (oiaVar9 != null) {
                                                    oiaVar9.a();
                                                    g(aw2Var5, dg7Var5, new yee(ntaVar6, null));
                                                    a26Var22.d(new hl9(oiaVar9.c));
                                                    return wefVar;
                                                }
                                                g(aw2Var5, dg7Var5, new zee(ntaVar6, null));
                                                if (a26Var21 != null) {
                                                    a26Var21.d(new hl9(oiaVar8.c));
                                                    return wefVar;
                                                }
                                            }
                                        } else {
                                            reeVar.L$0 = mbeVar4;
                                            reeVar.L$1 = aw2Var3;
                                            reeVar.L$2 = ntaVar3;
                                            reeVar.L$3 = a26Var15;
                                            a26Var18 = a26Var17;
                                            reeVar.L$4 = a26Var18;
                                            reeVar.L$5 = a26Var16;
                                            reeVar.L$6 = lydVarV;
                                            reeVar.L$7 = oiaVar4;
                                            reeVar.L$8 = oiaVar5;
                                            reeVar.label = 7;
                                            objI2 = i(mbeVar4, iiaVar, reeVar);
                                            if (objI2 != bw2Var) {
                                                dg7Var4 = lydVarV;
                                                oiaVar6 = oiaVar5;
                                                objJ = objI2;
                                                a26Var19 = a26Var16;
                                                a26Var20 = a26Var15;
                                                oiaVar7 = oiaVar4;
                                                ntaVar5 = ntaVar3;
                                                tf8Var2 = (tf8) objJ;
                                                if (pa7.t(tf8Var2, sf8Var2)) {
                                                    a26Var18.d(new hl9(oiaVar6.c));
                                                    reeVar.L$0 = aw2Var3;
                                                    reeVar.L$1 = ntaVar5;
                                                    reeVar.L$2 = dg7Var4;
                                                    xn2Var2 = null;
                                                    reeVar.L$3 = null;
                                                    reeVar.L$4 = null;
                                                    reeVar.L$5 = null;
                                                    reeVar.L$6 = null;
                                                    reeVar.L$7 = null;
                                                    reeVar.L$8 = null;
                                                    reeVar.label = 8;
                                                    if (d(mbeVar4, reeVar) != bw2Var) {
                                                        dg7Var6 = dg7Var4;
                                                        aw2Var6 = aw2Var3;
                                                        g(aw2Var6, dg7Var6, new bfe(ntaVar5, xn2Var2));
                                                        return wefVar;
                                                    }
                                                } else {
                                                    if (tf8Var2 instanceof rf8) {
                                                        oiaVar9 = ((rf8) tf8Var2).a;
                                                        a26 a26Var211 = a26Var19;
                                                        ntaVar6 = ntaVar5;
                                                        dg7Var5 = dg7Var4;
                                                        a26Var21 = a26Var211;
                                                        oiaVar8 = oiaVar7;
                                                        a26Var22 = a26Var20;
                                                        aw2Var5 = aw2Var3;
                                                    } else {
                                                        if (tf8Var2 instanceof qf8) {
                                                            ap.c();
                                                            return null;
                                                        }
                                                        a26 a26Var212 = a26Var19;
                                                        ntaVar6 = ntaVar5;
                                                        dg7Var5 = dg7Var4;
                                                        a26Var21 = a26Var212;
                                                        oiaVar8 = oiaVar7;
                                                        a26Var22 = a26Var20;
                                                        aw2Var5 = aw2Var3;
                                                        oiaVar9 = null;
                                                    }
                                                    if (oiaVar9 != null) {
                                                        oiaVar9.a();
                                                        g(aw2Var5, dg7Var5, new yee(ntaVar6, null));
                                                        a26Var22.d(new hl9(oiaVar9.c));
                                                        return wefVar;
                                                    }
                                                    g(aw2Var5, dg7Var5, new zee(ntaVar6, null));
                                                    if (a26Var21 != null) {
                                                        a26Var21.d(new hl9(oiaVar8.c));
                                                        return wefVar;
                                                    }
                                                }
                                            }
                                        }
                                    } else if (a26Var16 != null) {
                                        a26Var16.d(new hl9(oiaVar4.c));
                                        return wefVar;
                                    }
                                }
                            } else if (a26Var9 != null) {
                                a26Var9.d(new hl9(oiaVar3.c));
                                return wefVar;
                            }
                        }
                        return wefVar;
                    }
                } else {
                    reeVar.L$0 = mbeVar2;
                    reeVar.L$1 = aw2Var2;
                    reeVar.L$2 = ntaVar2;
                    reeVar.L$3 = a26Var4;
                    reeVar.L$4 = a26Var5;
                    reeVar.L$5 = n26Var2;
                    reeVar.L$6 = a26Var6;
                    reeVar.L$7 = oiaVar;
                    reeVar.L$8 = dg7VarV;
                    reeVar.label = 3;
                    objI = i(mbeVar2, iiaVar, reeVar);
                    if (objI != bw2Var) {
                        a26Var7 = a26Var4;
                        n26Var3 = n26Var2;
                        oiaVar2 = oiaVar;
                        objJ = objI;
                        a26Var8 = a26Var6;
                        mbeVar3 = mbeVar2;
                        tf8Var = (tf8) objJ;
                        sf8Var2 = sf8Var;
                        if (!pa7.t(tf8Var, sf8Var2)) {
                            if (tf8Var instanceof rf8) {
                                oiaVar3 = ((rf8) tf8Var).a;
                            } else {
                                if (!(tf8Var instanceof qf8)) {
                                    ap.c();
                                    return null;
                                }
                                oiaVar3 = null;
                            }
                            a26Var9 = a26Var8;
                            mbeVar4 = mbeVar3;
                            dg7Var = dg7VarV;
                            n26Var4 = n26Var3;
                            a26Var11 = a26Var5;
                            a26Var10 = a26Var7;
                            if (oiaVar3 == null) {
                                lydVarG = g(aw2Var2, dg7Var, new uee(ntaVar2, null));
                            } else {
                                oiaVar3.a();
                                lydVarG = g(aw2Var2, dg7Var, new vee(ntaVar2, null));
                            }
                            if (oiaVar3 != null) {
                                if (a26Var10 == null) {
                                    reeVar.L$0 = mbeVar4;
                                    reeVar.L$1 = aw2Var2;
                                    reeVar.L$2 = ntaVar2;
                                    reeVar.L$3 = a26Var10;
                                    reeVar.L$4 = a26Var11;
                                    reeVar.L$5 = n26Var4;
                                    reeVar.L$6 = a26Var9;
                                    reeVar.L$7 = oiaVar3;
                                    reeVar.L$8 = lydVarG;
                                    reeVar.label = 5;
                                    a26Var12 = a26Var11;
                                    lydVar = lydVarG;
                                    a26Var13 = a26Var9;
                                    objE = mbeVar4.e(mbeVar4.c().a(), new gee(oiaVar3, null), reeVar);
                                    if (objE != bw2Var) {
                                        oiaVar4 = oiaVar3;
                                        aw2Var3 = aw2Var2;
                                        a26Var14 = a26Var12;
                                        objJ = objE;
                                        a26Var15 = a26Var10;
                                        ntaVar3 = ntaVar2;
                                        dg7Var2 = lydVar;
                                        n26Var5 = n26Var4;
                                        a26Var16 = a26Var13;
                                        oiaVar5 = (oia) objJ;
                                        if (oiaVar5 != null) {
                                            a26Var17 = a26Var14;
                                            lydVarV = ynb.V(aw2Var3, null, dw2Var, new wee(dg7Var2, ntaVar3, null), 1);
                                            if (n26Var5 != deeVar) {
                                                g(aw2Var3, lydVarV, new xee(n26Var5, ntaVar3, oiaVar5, null));
                                            }
                                            if (a26Var17 == null) {
                                                reeVar.L$0 = aw2Var3;
                                                reeVar.L$1 = ntaVar3;
                                                reeVar.L$2 = a26Var15;
                                                reeVar.L$3 = a26Var16;
                                                reeVar.L$4 = lydVarV;
                                                reeVar.L$5 = oiaVar4;
                                                reeVar.L$6 = null;
                                                reeVar.L$7 = null;
                                                reeVar.L$8 = null;
                                                reeVar.label = 6;
                                                objJ = j(mbeVar4, iiaVar, reeVar);
                                                if (objJ != bw2Var) {
                                                    oia oiaVar13 = oiaVar4;
                                                    dg7Var5 = lydVarV;
                                                    oiaVar8 = oiaVar13;
                                                    a26Var21 = a26Var16;
                                                    aw2Var5 = aw2Var3;
                                                    ntaVar6 = ntaVar3;
                                                    a26Var22 = a26Var15;
                                                    oiaVar9 = (oia) objJ;
                                                    if (oiaVar9 != null) {
                                                        oiaVar9.a();
                                                        g(aw2Var5, dg7Var5, new yee(ntaVar6, null));
                                                        a26Var22.d(new hl9(oiaVar9.c));
                                                        return wefVar;
                                                    }
                                                    g(aw2Var5, dg7Var5, new zee(ntaVar6, null));
                                                    if (a26Var21 != null) {
                                                        a26Var21.d(new hl9(oiaVar8.c));
                                                        return wefVar;
                                                    }
                                                }
                                            } else {
                                                reeVar.L$0 = mbeVar4;
                                                reeVar.L$1 = aw2Var3;
                                                reeVar.L$2 = ntaVar3;
                                                reeVar.L$3 = a26Var15;
                                                a26Var18 = a26Var17;
                                                reeVar.L$4 = a26Var18;
                                                reeVar.L$5 = a26Var16;
                                                reeVar.L$6 = lydVarV;
                                                reeVar.L$7 = oiaVar4;
                                                reeVar.L$8 = oiaVar5;
                                                reeVar.label = 7;
                                                objI2 = i(mbeVar4, iiaVar, reeVar);
                                                if (objI2 != bw2Var) {
                                                    dg7Var4 = lydVarV;
                                                    oiaVar6 = oiaVar5;
                                                    objJ = objI2;
                                                    a26Var19 = a26Var16;
                                                    a26Var20 = a26Var15;
                                                    oiaVar7 = oiaVar4;
                                                    ntaVar5 = ntaVar3;
                                                    tf8Var2 = (tf8) objJ;
                                                    if (pa7.t(tf8Var2, sf8Var2)) {
                                                        a26Var18.d(new hl9(oiaVar6.c));
                                                        reeVar.L$0 = aw2Var3;
                                                        reeVar.L$1 = ntaVar5;
                                                        reeVar.L$2 = dg7Var4;
                                                        xn2Var2 = null;
                                                        reeVar.L$3 = null;
                                                        reeVar.L$4 = null;
                                                        reeVar.L$5 = null;
                                                        reeVar.L$6 = null;
                                                        reeVar.L$7 = null;
                                                        reeVar.L$8 = null;
                                                        reeVar.label = 8;
                                                        if (d(mbeVar4, reeVar) != bw2Var) {
                                                            dg7Var6 = dg7Var4;
                                                            aw2Var6 = aw2Var3;
                                                            g(aw2Var6, dg7Var6, new bfe(ntaVar5, xn2Var2));
                                                            return wefVar;
                                                        }
                                                    } else {
                                                        if (tf8Var2 instanceof rf8) {
                                                            oiaVar9 = ((rf8) tf8Var2).a;
                                                            a26 a26Var213 = a26Var19;
                                                            ntaVar6 = ntaVar5;
                                                            dg7Var5 = dg7Var4;
                                                            a26Var21 = a26Var213;
                                                            oiaVar8 = oiaVar7;
                                                            a26Var22 = a26Var20;
                                                            aw2Var5 = aw2Var3;
                                                        } else {
                                                            if (tf8Var2 instanceof qf8) {
                                                                ap.c();
                                                                return null;
                                                            }
                                                            a26 a26Var214 = a26Var19;
                                                            ntaVar6 = ntaVar5;
                                                            dg7Var5 = dg7Var4;
                                                            a26Var21 = a26Var214;
                                                            oiaVar8 = oiaVar7;
                                                            a26Var22 = a26Var20;
                                                            aw2Var5 = aw2Var3;
                                                            oiaVar9 = null;
                                                        }
                                                        if (oiaVar9 != null) {
                                                            oiaVar9.a();
                                                            g(aw2Var5, dg7Var5, new yee(ntaVar6, null));
                                                            a26Var22.d(new hl9(oiaVar9.c));
                                                            return wefVar;
                                                        }
                                                        g(aw2Var5, dg7Var5, new zee(ntaVar6, null));
                                                        if (a26Var21 != null) {
                                                            a26Var21.d(new hl9(oiaVar8.c));
                                                            return wefVar;
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (a26Var16 != null) {
                                            a26Var16.d(new hl9(oiaVar4.c));
                                            return wefVar;
                                        }
                                    }
                                } else if (a26Var9 != null) {
                                    a26Var9.d(new hl9(oiaVar3.c));
                                    return wefVar;
                                }
                            }
                            return wefVar;
                        }
                        a26Var5.d(new hl9(oiaVar2.c));
                        reeVar.L$0 = aw2Var2;
                        reeVar.L$1 = ntaVar2;
                        reeVar.L$2 = dg7VarV;
                        xn2Var = null;
                        reeVar.L$3 = null;
                        reeVar.L$4 = null;
                        reeVar.L$5 = null;
                        reeVar.L$6 = null;
                        reeVar.L$7 = null;
                        reeVar.L$8 = null;
                        reeVar.label = 4;
                        if (d(mbeVar3, reeVar) != bw2Var) {
                            dg7Var3 = dg7VarV;
                            ntaVar4 = ntaVar2;
                            aw2Var4 = aw2Var2;
                            g(aw2Var4, dg7Var3, new tee(ntaVar4, xn2Var));
                            return wefVar;
                        }
                    }
                }
                return bw2Var;
            case 2:
                dg7Var = (dg7) reeVar.L$7;
                a26Var9 = (a26) reeVar.L$6;
                n26Var4 = (n26) reeVar.L$5;
                a26Var11 = (a26) reeVar.L$4;
                a26Var10 = (a26) reeVar.L$3;
                ntaVar2 = (nta) reeVar.L$2;
                aw2Var2 = (aw2) reeVar.L$1;
                mbeVar2 = (mbe) reeVar.L$0;
                jzb.q(objJ);
                sf8Var = sf8Var3;
                wefVar = wefVar2;
                oiaVar3 = (oia) objJ;
                mbeVar4 = mbeVar2;
                sf8Var2 = sf8Var;
                if (oiaVar3 == null) {
                    lydVarG = g(aw2Var2, dg7Var, new uee(ntaVar2, null));
                } else {
                    oiaVar3.a();
                    lydVarG = g(aw2Var2, dg7Var, new vee(ntaVar2, null));
                }
                if (oiaVar3 != null) {
                    if (a26Var10 == null) {
                        reeVar.L$0 = mbeVar4;
                        reeVar.L$1 = aw2Var2;
                        reeVar.L$2 = ntaVar2;
                        reeVar.L$3 = a26Var10;
                        reeVar.L$4 = a26Var11;
                        reeVar.L$5 = n26Var4;
                        reeVar.L$6 = a26Var9;
                        reeVar.L$7 = oiaVar3;
                        reeVar.L$8 = lydVarG;
                        reeVar.label = 5;
                        a26Var12 = a26Var11;
                        lydVar = lydVarG;
                        a26Var13 = a26Var9;
                        objE = mbeVar4.e(mbeVar4.c().a(), new gee(oiaVar3, null), reeVar);
                        if (objE != bw2Var) {
                            oiaVar4 = oiaVar3;
                            aw2Var3 = aw2Var2;
                            a26Var14 = a26Var12;
                            objJ = objE;
                            a26Var15 = a26Var10;
                            ntaVar3 = ntaVar2;
                            dg7Var2 = lydVar;
                            n26Var5 = n26Var4;
                            a26Var16 = a26Var13;
                            oiaVar5 = (oia) objJ;
                            if (oiaVar5 != null) {
                                a26Var17 = a26Var14;
                                lydVarV = ynb.V(aw2Var3, null, dw2Var, new wee(dg7Var2, ntaVar3, null), 1);
                                if (n26Var5 != deeVar) {
                                    g(aw2Var3, lydVarV, new xee(n26Var5, ntaVar3, oiaVar5, null));
                                }
                                if (a26Var17 == null) {
                                    reeVar.L$0 = aw2Var3;
                                    reeVar.L$1 = ntaVar3;
                                    reeVar.L$2 = a26Var15;
                                    reeVar.L$3 = a26Var16;
                                    reeVar.L$4 = lydVarV;
                                    reeVar.L$5 = oiaVar4;
                                    reeVar.L$6 = null;
                                    reeVar.L$7 = null;
                                    reeVar.L$8 = null;
                                    reeVar.label = 6;
                                    objJ = j(mbeVar4, iiaVar, reeVar);
                                    if (objJ != bw2Var) {
                                        oia oiaVar14 = oiaVar4;
                                        dg7Var5 = lydVarV;
                                        oiaVar8 = oiaVar14;
                                        a26Var21 = a26Var16;
                                        aw2Var5 = aw2Var3;
                                        ntaVar6 = ntaVar3;
                                        a26Var22 = a26Var15;
                                        oiaVar9 = (oia) objJ;
                                        if (oiaVar9 != null) {
                                            oiaVar9.a();
                                            g(aw2Var5, dg7Var5, new yee(ntaVar6, null));
                                            a26Var22.d(new hl9(oiaVar9.c));
                                            return wefVar;
                                        }
                                        g(aw2Var5, dg7Var5, new zee(ntaVar6, null));
                                        if (a26Var21 != null) {
                                            a26Var21.d(new hl9(oiaVar8.c));
                                            return wefVar;
                                        }
                                    }
                                } else {
                                    reeVar.L$0 = mbeVar4;
                                    reeVar.L$1 = aw2Var3;
                                    reeVar.L$2 = ntaVar3;
                                    reeVar.L$3 = a26Var15;
                                    a26Var18 = a26Var17;
                                    reeVar.L$4 = a26Var18;
                                    reeVar.L$5 = a26Var16;
                                    reeVar.L$6 = lydVarV;
                                    reeVar.L$7 = oiaVar4;
                                    reeVar.L$8 = oiaVar5;
                                    reeVar.label = 7;
                                    objI2 = i(mbeVar4, iiaVar, reeVar);
                                    if (objI2 != bw2Var) {
                                        dg7Var4 = lydVarV;
                                        oiaVar6 = oiaVar5;
                                        objJ = objI2;
                                        a26Var19 = a26Var16;
                                        a26Var20 = a26Var15;
                                        oiaVar7 = oiaVar4;
                                        ntaVar5 = ntaVar3;
                                        tf8Var2 = (tf8) objJ;
                                        if (pa7.t(tf8Var2, sf8Var2)) {
                                            a26Var18.d(new hl9(oiaVar6.c));
                                            reeVar.L$0 = aw2Var3;
                                            reeVar.L$1 = ntaVar5;
                                            reeVar.L$2 = dg7Var4;
                                            xn2Var2 = null;
                                            reeVar.L$3 = null;
                                            reeVar.L$4 = null;
                                            reeVar.L$5 = null;
                                            reeVar.L$6 = null;
                                            reeVar.L$7 = null;
                                            reeVar.L$8 = null;
                                            reeVar.label = 8;
                                            if (d(mbeVar4, reeVar) != bw2Var) {
                                                dg7Var6 = dg7Var4;
                                                aw2Var6 = aw2Var3;
                                                g(aw2Var6, dg7Var6, new bfe(ntaVar5, xn2Var2));
                                                return wefVar;
                                            }
                                        } else {
                                            if (tf8Var2 instanceof rf8) {
                                                oiaVar9 = ((rf8) tf8Var2).a;
                                                a26 a26Var215 = a26Var19;
                                                ntaVar6 = ntaVar5;
                                                dg7Var5 = dg7Var4;
                                                a26Var21 = a26Var215;
                                                oiaVar8 = oiaVar7;
                                                a26Var22 = a26Var20;
                                                aw2Var5 = aw2Var3;
                                            } else {
                                                if (tf8Var2 instanceof qf8) {
                                                    ap.c();
                                                    return null;
                                                }
                                                a26 a26Var216 = a26Var19;
                                                ntaVar6 = ntaVar5;
                                                dg7Var5 = dg7Var4;
                                                a26Var21 = a26Var216;
                                                oiaVar8 = oiaVar7;
                                                a26Var22 = a26Var20;
                                                aw2Var5 = aw2Var3;
                                                oiaVar9 = null;
                                            }
                                            if (oiaVar9 != null) {
                                                oiaVar9.a();
                                                g(aw2Var5, dg7Var5, new yee(ntaVar6, null));
                                                a26Var22.d(new hl9(oiaVar9.c));
                                                return wefVar;
                                            }
                                            g(aw2Var5, dg7Var5, new zee(ntaVar6, null));
                                            if (a26Var21 != null) {
                                                a26Var21.d(new hl9(oiaVar8.c));
                                                return wefVar;
                                            }
                                        }
                                    }
                                }
                            } else if (a26Var16 != null) {
                                a26Var16.d(new hl9(oiaVar4.c));
                                return wefVar;
                            }
                        }
                        return bw2Var;
                    }
                    if (a26Var9 != null) {
                        a26Var9.d(new hl9(oiaVar3.c));
                        return wefVar;
                    }
                }
                return wefVar;
            case 3:
                dg7 dg7Var7 = (dg7) reeVar.L$8;
                oiaVar2 = (oia) reeVar.L$7;
                a26 a26Var30 = (a26) reeVar.L$6;
                n26Var3 = (n26) reeVar.L$5;
                a26Var5 = (a26) reeVar.L$4;
                a26 a26Var31 = (a26) reeVar.L$3;
                nta ntaVar7 = (nta) reeVar.L$2;
                aw2 aw2Var7 = (aw2) reeVar.L$1;
                mbeVar3 = (mbe) reeVar.L$0;
                jzb.q(objJ);
                sf8Var = sf8Var3;
                wefVar = wefVar2;
                a26Var7 = a26Var31;
                ntaVar2 = ntaVar7;
                aw2Var2 = aw2Var7;
                a26Var8 = a26Var30;
                dg7VarV = dg7Var7;
                tf8Var = (tf8) objJ;
                sf8Var2 = sf8Var;
                if (!pa7.t(tf8Var, sf8Var2)) {
                    if (tf8Var instanceof rf8) {
                        oiaVar3 = ((rf8) tf8Var).a;
                    } else {
                        if (!(tf8Var instanceof qf8)) {
                            ap.c();
                            return null;
                        }
                        oiaVar3 = null;
                    }
                    a26Var9 = a26Var8;
                    mbeVar4 = mbeVar3;
                    dg7Var = dg7VarV;
                    n26Var4 = n26Var3;
                    a26Var11 = a26Var5;
                    a26Var10 = a26Var7;
                    if (oiaVar3 == null) {
                        lydVarG = g(aw2Var2, dg7Var, new uee(ntaVar2, null));
                    } else {
                        oiaVar3.a();
                        lydVarG = g(aw2Var2, dg7Var, new vee(ntaVar2, null));
                    }
                    if (oiaVar3 != null) {
                        if (a26Var10 == null) {
                            reeVar.L$0 = mbeVar4;
                            reeVar.L$1 = aw2Var2;
                            reeVar.L$2 = ntaVar2;
                            reeVar.L$3 = a26Var10;
                            reeVar.L$4 = a26Var11;
                            reeVar.L$5 = n26Var4;
                            reeVar.L$6 = a26Var9;
                            reeVar.L$7 = oiaVar3;
                            reeVar.L$8 = lydVarG;
                            reeVar.label = 5;
                            a26Var12 = a26Var11;
                            lydVar = lydVarG;
                            a26Var13 = a26Var9;
                            objE = mbeVar4.e(mbeVar4.c().a(), new gee(oiaVar3, null), reeVar);
                            if (objE != bw2Var) {
                                oiaVar4 = oiaVar3;
                                aw2Var3 = aw2Var2;
                                a26Var14 = a26Var12;
                                objJ = objE;
                                a26Var15 = a26Var10;
                                ntaVar3 = ntaVar2;
                                dg7Var2 = lydVar;
                                n26Var5 = n26Var4;
                                a26Var16 = a26Var13;
                                oiaVar5 = (oia) objJ;
                                if (oiaVar5 != null) {
                                    a26Var17 = a26Var14;
                                    lydVarV = ynb.V(aw2Var3, null, dw2Var, new wee(dg7Var2, ntaVar3, null), 1);
                                    if (n26Var5 != deeVar) {
                                        g(aw2Var3, lydVarV, new xee(n26Var5, ntaVar3, oiaVar5, null));
                                    }
                                    if (a26Var17 == null) {
                                        reeVar.L$0 = aw2Var3;
                                        reeVar.L$1 = ntaVar3;
                                        reeVar.L$2 = a26Var15;
                                        reeVar.L$3 = a26Var16;
                                        reeVar.L$4 = lydVarV;
                                        reeVar.L$5 = oiaVar4;
                                        reeVar.L$6 = null;
                                        reeVar.L$7 = null;
                                        reeVar.L$8 = null;
                                        reeVar.label = 6;
                                        objJ = j(mbeVar4, iiaVar, reeVar);
                                        if (objJ != bw2Var) {
                                            oia oiaVar15 = oiaVar4;
                                            dg7Var5 = lydVarV;
                                            oiaVar8 = oiaVar15;
                                            a26Var21 = a26Var16;
                                            aw2Var5 = aw2Var3;
                                            ntaVar6 = ntaVar3;
                                            a26Var22 = a26Var15;
                                            oiaVar9 = (oia) objJ;
                                            if (oiaVar9 != null) {
                                                oiaVar9.a();
                                                g(aw2Var5, dg7Var5, new yee(ntaVar6, null));
                                                a26Var22.d(new hl9(oiaVar9.c));
                                                return wefVar;
                                            }
                                            g(aw2Var5, dg7Var5, new zee(ntaVar6, null));
                                            if (a26Var21 != null) {
                                                a26Var21.d(new hl9(oiaVar8.c));
                                                return wefVar;
                                            }
                                        }
                                    } else {
                                        reeVar.L$0 = mbeVar4;
                                        reeVar.L$1 = aw2Var3;
                                        reeVar.L$2 = ntaVar3;
                                        reeVar.L$3 = a26Var15;
                                        a26Var18 = a26Var17;
                                        reeVar.L$4 = a26Var18;
                                        reeVar.L$5 = a26Var16;
                                        reeVar.L$6 = lydVarV;
                                        reeVar.L$7 = oiaVar4;
                                        reeVar.L$8 = oiaVar5;
                                        reeVar.label = 7;
                                        objI2 = i(mbeVar4, iiaVar, reeVar);
                                        if (objI2 != bw2Var) {
                                            dg7Var4 = lydVarV;
                                            oiaVar6 = oiaVar5;
                                            objJ = objI2;
                                            a26Var19 = a26Var16;
                                            a26Var20 = a26Var15;
                                            oiaVar7 = oiaVar4;
                                            ntaVar5 = ntaVar3;
                                            tf8Var2 = (tf8) objJ;
                                            if (pa7.t(tf8Var2, sf8Var2)) {
                                                a26Var18.d(new hl9(oiaVar6.c));
                                                reeVar.L$0 = aw2Var3;
                                                reeVar.L$1 = ntaVar5;
                                                reeVar.L$2 = dg7Var4;
                                                xn2Var2 = null;
                                                reeVar.L$3 = null;
                                                reeVar.L$4 = null;
                                                reeVar.L$5 = null;
                                                reeVar.L$6 = null;
                                                reeVar.L$7 = null;
                                                reeVar.L$8 = null;
                                                reeVar.label = 8;
                                                if (d(mbeVar4, reeVar) != bw2Var) {
                                                    dg7Var6 = dg7Var4;
                                                    aw2Var6 = aw2Var3;
                                                    g(aw2Var6, dg7Var6, new bfe(ntaVar5, xn2Var2));
                                                    return wefVar;
                                                }
                                            } else {
                                                if (tf8Var2 instanceof rf8) {
                                                    oiaVar9 = ((rf8) tf8Var2).a;
                                                    a26 a26Var217 = a26Var19;
                                                    ntaVar6 = ntaVar5;
                                                    dg7Var5 = dg7Var4;
                                                    a26Var21 = a26Var217;
                                                    oiaVar8 = oiaVar7;
                                                    a26Var22 = a26Var20;
                                                    aw2Var5 = aw2Var3;
                                                } else {
                                                    if (tf8Var2 instanceof qf8) {
                                                        ap.c();
                                                        return null;
                                                    }
                                                    a26 a26Var218 = a26Var19;
                                                    ntaVar6 = ntaVar5;
                                                    dg7Var5 = dg7Var4;
                                                    a26Var21 = a26Var218;
                                                    oiaVar8 = oiaVar7;
                                                    a26Var22 = a26Var20;
                                                    aw2Var5 = aw2Var3;
                                                    oiaVar9 = null;
                                                }
                                                if (oiaVar9 != null) {
                                                    oiaVar9.a();
                                                    g(aw2Var5, dg7Var5, new yee(ntaVar6, null));
                                                    a26Var22.d(new hl9(oiaVar9.c));
                                                    return wefVar;
                                                }
                                                g(aw2Var5, dg7Var5, new zee(ntaVar6, null));
                                                if (a26Var21 != null) {
                                                    a26Var21.d(new hl9(oiaVar8.c));
                                                    return wefVar;
                                                }
                                            }
                                        }
                                    }
                                } else if (a26Var16 != null) {
                                    a26Var16.d(new hl9(oiaVar4.c));
                                    return wefVar;
                                }
                            }
                        } else if (a26Var9 != null) {
                            a26Var9.d(new hl9(oiaVar3.c));
                            return wefVar;
                        }
                    }
                    return wefVar;
                }
                a26Var5.d(new hl9(oiaVar2.c));
                reeVar.L$0 = aw2Var2;
                reeVar.L$1 = ntaVar2;
                reeVar.L$2 = dg7VarV;
                xn2Var = null;
                reeVar.L$3 = null;
                reeVar.L$4 = null;
                reeVar.L$5 = null;
                reeVar.L$6 = null;
                reeVar.L$7 = null;
                reeVar.L$8 = null;
                reeVar.label = 4;
                if (d(mbeVar3, reeVar) != bw2Var) {
                    dg7Var3 = dg7VarV;
                    ntaVar4 = ntaVar2;
                    aw2Var4 = aw2Var2;
                    g(aw2Var4, dg7Var3, new tee(ntaVar4, xn2Var));
                    return wefVar;
                }
                return bw2Var;
            case 4:
                dg7Var3 = (dg7) reeVar.L$2;
                ntaVar4 = (nta) reeVar.L$1;
                aw2Var4 = (aw2) reeVar.L$0;
                jzb.q(objJ);
                wefVar = wefVar2;
                xn2Var = null;
                g(aw2Var4, dg7Var3, new tee(ntaVar4, xn2Var));
                return wefVar;
            case 5:
                dg7 dg7Var8 = (dg7) reeVar.L$8;
                oiaVar4 = (oia) reeVar.L$7;
                a26Var16 = (a26) reeVar.L$6;
                n26Var5 = (n26) reeVar.L$5;
                a26Var14 = (a26) reeVar.L$4;
                a26Var15 = (a26) reeVar.L$3;
                ntaVar3 = (nta) reeVar.L$2;
                aw2Var3 = (aw2) reeVar.L$1;
                mbe mbeVar5 = (mbe) reeVar.L$0;
                jzb.q(objJ);
                sf8Var2 = sf8Var3;
                wefVar = wefVar2;
                mbeVar4 = mbeVar5;
                dg7Var2 = dg7Var8;
                oiaVar5 = (oia) objJ;
                if (oiaVar5 != null) {
                    a26Var17 = a26Var14;
                    lydVarV = ynb.V(aw2Var3, null, dw2Var, new wee(dg7Var2, ntaVar3, null), 1);
                    if (n26Var5 != deeVar) {
                        g(aw2Var3, lydVarV, new xee(n26Var5, ntaVar3, oiaVar5, null));
                    }
                    if (a26Var17 == null) {
                        reeVar.L$0 = aw2Var3;
                        reeVar.L$1 = ntaVar3;
                        reeVar.L$2 = a26Var15;
                        reeVar.L$3 = a26Var16;
                        reeVar.L$4 = lydVarV;
                        reeVar.L$5 = oiaVar4;
                        reeVar.L$6 = null;
                        reeVar.L$7 = null;
                        reeVar.L$8 = null;
                        reeVar.label = 6;
                        objJ = j(mbeVar4, iiaVar, reeVar);
                        if (objJ != bw2Var) {
                            oia oiaVar16 = oiaVar4;
                            dg7Var5 = lydVarV;
                            oiaVar8 = oiaVar16;
                            a26Var21 = a26Var16;
                            aw2Var5 = aw2Var3;
                            ntaVar6 = ntaVar3;
                            a26Var22 = a26Var15;
                            oiaVar9 = (oia) objJ;
                            if (oiaVar9 != null) {
                                oiaVar9.a();
                                g(aw2Var5, dg7Var5, new yee(ntaVar6, null));
                                a26Var22.d(new hl9(oiaVar9.c));
                                return wefVar;
                            }
                            g(aw2Var5, dg7Var5, new zee(ntaVar6, null));
                            if (a26Var21 != null) {
                                a26Var21.d(new hl9(oiaVar8.c));
                                return wefVar;
                            }
                        }
                    } else {
                        reeVar.L$0 = mbeVar4;
                        reeVar.L$1 = aw2Var3;
                        reeVar.L$2 = ntaVar3;
                        reeVar.L$3 = a26Var15;
                        a26Var18 = a26Var17;
                        reeVar.L$4 = a26Var18;
                        reeVar.L$5 = a26Var16;
                        reeVar.L$6 = lydVarV;
                        reeVar.L$7 = oiaVar4;
                        reeVar.L$8 = oiaVar5;
                        reeVar.label = 7;
                        objI2 = i(mbeVar4, iiaVar, reeVar);
                        if (objI2 != bw2Var) {
                            dg7Var4 = lydVarV;
                            oiaVar6 = oiaVar5;
                            objJ = objI2;
                            a26Var19 = a26Var16;
                            a26Var20 = a26Var15;
                            oiaVar7 = oiaVar4;
                            ntaVar5 = ntaVar3;
                            tf8Var2 = (tf8) objJ;
                            if (pa7.t(tf8Var2, sf8Var2)) {
                                a26Var18.d(new hl9(oiaVar6.c));
                                reeVar.L$0 = aw2Var3;
                                reeVar.L$1 = ntaVar5;
                                reeVar.L$2 = dg7Var4;
                                xn2Var2 = null;
                                reeVar.L$3 = null;
                                reeVar.L$4 = null;
                                reeVar.L$5 = null;
                                reeVar.L$6 = null;
                                reeVar.L$7 = null;
                                reeVar.L$8 = null;
                                reeVar.label = 8;
                                if (d(mbeVar4, reeVar) != bw2Var) {
                                    dg7Var6 = dg7Var4;
                                    aw2Var6 = aw2Var3;
                                    g(aw2Var6, dg7Var6, new bfe(ntaVar5, xn2Var2));
                                    return wefVar;
                                }
                            } else {
                                if (tf8Var2 instanceof rf8) {
                                    oiaVar9 = ((rf8) tf8Var2).a;
                                    a26 a26Var219 = a26Var19;
                                    ntaVar6 = ntaVar5;
                                    dg7Var5 = dg7Var4;
                                    a26Var21 = a26Var219;
                                    oiaVar8 = oiaVar7;
                                    a26Var22 = a26Var20;
                                    aw2Var5 = aw2Var3;
                                } else {
                                    if (tf8Var2 instanceof qf8) {
                                        ap.c();
                                        return null;
                                    }
                                    a26 a26Var2110 = a26Var19;
                                    ntaVar6 = ntaVar5;
                                    dg7Var5 = dg7Var4;
                                    a26Var21 = a26Var2110;
                                    oiaVar8 = oiaVar7;
                                    a26Var22 = a26Var20;
                                    aw2Var5 = aw2Var3;
                                    oiaVar9 = null;
                                }
                                if (oiaVar9 != null) {
                                    oiaVar9.a();
                                    g(aw2Var5, dg7Var5, new yee(ntaVar6, null));
                                    a26Var22.d(new hl9(oiaVar9.c));
                                    return wefVar;
                                }
                                g(aw2Var5, dg7Var5, new zee(ntaVar6, null));
                                if (a26Var21 != null) {
                                    a26Var21.d(new hl9(oiaVar8.c));
                                    return wefVar;
                                }
                            }
                        }
                    }
                    return bw2Var;
                }
                if (a26Var16 != null) {
                    a26Var16.d(new hl9(oiaVar4.c));
                    return wefVar;
                }
                return wefVar;
            case 6:
                oiaVar8 = (oia) reeVar.L$5;
                dg7Var5 = (dg7) reeVar.L$4;
                a26Var21 = (a26) reeVar.L$3;
                a26Var22 = (a26) reeVar.L$2;
                ntaVar6 = (nta) reeVar.L$1;
                aw2Var5 = (aw2) reeVar.L$0;
                jzb.q(objJ);
                wefVar = wefVar2;
                oiaVar9 = (oia) objJ;
                if (oiaVar9 != null) {
                    oiaVar9.a();
                    g(aw2Var5, dg7Var5, new yee(ntaVar6, null));
                    a26Var22.d(new hl9(oiaVar9.c));
                    return wefVar;
                }
                g(aw2Var5, dg7Var5, new zee(ntaVar6, null));
                if (a26Var21 != null) {
                    a26Var21.d(new hl9(oiaVar8.c));
                    return wefVar;
                }
                return wefVar;
            case 7:
                oiaVar6 = (oia) reeVar.L$8;
                oia oiaVar17 = (oia) reeVar.L$7;
                dg7Var4 = (dg7) reeVar.L$6;
                a26 a26Var32 = (a26) reeVar.L$5;
                a26 a26Var33 = (a26) reeVar.L$4;
                a26Var20 = (a26) reeVar.L$3;
                nta ntaVar8 = (nta) reeVar.L$2;
                aw2 aw2Var8 = (aw2) reeVar.L$1;
                mbe mbeVar6 = (mbe) reeVar.L$0;
                jzb.q(objJ);
                sf8Var2 = sf8Var3;
                wefVar = wefVar2;
                mbeVar4 = mbeVar6;
                a26Var18 = a26Var33;
                a26Var19 = a26Var32;
                oiaVar7 = oiaVar17;
                ntaVar5 = ntaVar8;
                aw2Var3 = aw2Var8;
                tf8Var2 = (tf8) objJ;
                if (pa7.t(tf8Var2, sf8Var2)) {
                    a26Var18.d(new hl9(oiaVar6.c));
                    reeVar.L$0 = aw2Var3;
                    reeVar.L$1 = ntaVar5;
                    reeVar.L$2 = dg7Var4;
                    xn2Var2 = null;
                    reeVar.L$3 = null;
                    reeVar.L$4 = null;
                    reeVar.L$5 = null;
                    reeVar.L$6 = null;
                    reeVar.L$7 = null;
                    reeVar.L$8 = null;
                    reeVar.label = 8;
                    if (d(mbeVar4, reeVar) != bw2Var) {
                        dg7Var6 = dg7Var4;
                        aw2Var6 = aw2Var3;
                        g(aw2Var6, dg7Var6, new bfe(ntaVar5, xn2Var2));
                        return wefVar;
                    }
                    return bw2Var;
                }
                if (tf8Var2 instanceof rf8) {
                    oiaVar9 = ((rf8) tf8Var2).a;
                    a26 a26Var2111 = a26Var19;
                    ntaVar6 = ntaVar5;
                    dg7Var5 = dg7Var4;
                    a26Var21 = a26Var2111;
                    oiaVar8 = oiaVar7;
                    a26Var22 = a26Var20;
                    aw2Var5 = aw2Var3;
                } else {
                    if (tf8Var2 instanceof qf8) {
                        ap.c();
                        return null;
                    }
                    a26 a26Var2112 = a26Var19;
                    ntaVar6 = ntaVar5;
                    dg7Var5 = dg7Var4;
                    a26Var21 = a26Var2112;
                    oiaVar8 = oiaVar7;
                    a26Var22 = a26Var20;
                    aw2Var5 = aw2Var3;
                    oiaVar9 = null;
                }
                if (oiaVar9 != null) {
                    oiaVar9.a();
                    g(aw2Var5, dg7Var5, new yee(ntaVar6, null));
                    a26Var22.d(new hl9(oiaVar9.c));
                    return wefVar;
                }
                g(aw2Var5, dg7Var5, new zee(ntaVar6, null));
                if (a26Var21 != null) {
                    a26Var21.d(new hl9(oiaVar8.c));
                    return wefVar;
                }
                return wefVar;
            case 8:
                dg7Var6 = (dg7) reeVar.L$2;
                ntaVar5 = (nta) reeVar.L$1;
                aw2Var6 = (aw2) reeVar.L$0;
                jzb.q(objJ);
                wefVar = wefVar2;
                xn2Var2 = null;
                g(aw2Var6, dg7Var6, new bfe(ntaVar5, xn2Var2));
                return wefVar;
            default:
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object i(mbe mbeVar, iia iiaVar, zn2 zn2Var) throws Throwable {
        cfe cfeVar;
        mmb mmbVar;
        if (zn2Var instanceof cfe) {
            cfeVar = (cfe) zn2Var;
            int i = cfeVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cfeVar.label = i - Integer.MIN_VALUE;
            } else {
                cfeVar = new cfe(zn2Var);
            }
        } else {
            cfeVar = new cfe(zn2Var);
        }
        Object obj = cfeVar.result;
        int i2 = cfeVar.label;
        try {
            if (i2 == 0) {
                mmb mmbVarD = ks0.d(obj);
                mmbVarD.element = qf8.a;
                long jB = mbeVar.c().b();
                l26 dfeVar = new dfe(iiaVar, mmbVarD, null);
                cfeVar.L$0 = mmbVarD;
                cfeVar.label = 1;
                Object objD = mbeVar.d(jB, dfeVar, cfeVar);
                Object obj2 = bw2.a;
                if (objD == obj2) {
                    return obj2;
                }
                mmbVar = mmbVarD;
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mmbVar = (mmb) cfeVar.L$0;
                jzb.q(obj);
            }
            return mmbVar.element;
        } catch (jia unused) {
            return sf8.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0078  */
    /* JADX WARN: Code duplicated, block: B:28:0x008b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d5 A[LOOP:1: B:23:0x0076->B:44:0x00d5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00cf A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b5 -> B:13:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object j(defpackage.mbe r17, defpackage.iia r18, defpackage.pt0 r19) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffe.j(mbe, iia, pt0):java.lang.Object");
    }
}
