package defpackage;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tc4 implements hf8 {
    public static final /* synthetic */ int e = 0;
    public final nb4 a;
    public final g6b b;
    public final yt6 c;
    public final m62 d;

    public tc4(nb4 nb4Var, g6b g6bVar, yt6 yt6Var, s7 s7Var, m62 m62Var) {
        this.a = nb4Var;
        this.b = g6bVar;
        this.c = yt6Var;
        this.d = m62Var;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x014f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0173  */
    /* JADX WARN: Code duplicated, block: B:48:0x017d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0185  */
    /* JADX WARN: Code duplicated, block: B:51:0x0186 A[PHI: r1 r2 r4 r14 r15
  0x0186: PHI (r1v6 int) = (r1v3 int), (r1v11 int) binds: [B:41:0x014d, B:50:0x0185] A[DONT_GENERATE, DONT_INLINE]
  0x0186: PHI (r2v20 java.util.List) = (r2v44 java.util.List), (r2v30 java.util.List) binds: [B:41:0x014d, B:50:0x0185] A[DONT_GENERATE, DONT_INLINE]
  0x0186: PHI (r4v7 java.util.List) = (r4v32 java.util.List), (r4v33 java.util.List) binds: [B:41:0x014d, B:50:0x0185] A[DONT_GENERATE, DONT_INLINE]
  0x0186: PHI (r14v4 java.time.Instant) = (r14v2 java.time.Instant), (r14v6 java.time.Instant) binds: [B:41:0x014d, B:50:0x0185] A[DONT_GENERATE, DONT_INLINE]
  0x0186: PHI (r15v12 java.lang.String) = (r15v10 java.lang.String), (r15v14 java.lang.String) binds: [B:41:0x014d, B:50:0x0185] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x018e  */
    /* JADX WARN: Code duplicated, block: B:55:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:57:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:58:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:61:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:65:0x020f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0234  */
    /* JADX WARN: Code duplicated, block: B:71:0x023e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:72:0x0240  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Instruction removed from duplicated block: B:53:0x018e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:55:0x01aa, please report this as an issue */
    public final Object a(String str, Collection collection, Collection collection2, zn2 zn2Var) {
        mc4 mc4Var;
        Instant instantNow;
        String str2;
        List list;
        List list2;
        List list3;
        List list4;
        List list5;
        int i;
        boolean zIsEmpty;
        Object objK;
        List list6;
        List list7;
        List list8;
        List list9;
        int i2;
        List list10;
        List list11;
        Instant instant;
        List list12;
        String str3;
        List list13;
        int i3;
        String str4;
        List list14;
        int i4;
        List list15;
        List list16;
        int iIntValue;
        List list17;
        List list18;
        if (zn2Var instanceof mc4) {
            mc4Var = (mc4) zn2Var;
            int i5 = mc4Var.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                mc4Var.label = i5 - Integer.MIN_VALUE;
            } else {
                mc4Var = new mc4(this, zn2Var);
            }
        } else {
            mc4Var = new mc4(this, zn2Var);
        }
        Object objK2 = mc4Var.result;
        int i6 = mc4Var.label;
        g6b g6bVar = this.b;
        nb4 nb4Var = this.a;
        int iIntValue2 = 0;
        int i7 = 1;
        bw2 bw2Var = bw2.a;
        if (i6 != 0) {
            if (i6 == 1) {
                List list19 = (List) mc4Var.L$5;
                List list20 = (List) mc4Var.L$4;
                instantNow = (Instant) mc4Var.L$3;
                str2 = (String) mc4Var.L$0;
                jzb.q(objK2);
                list = list19;
                list7 = list20;
            } else {
                if (i6 == 2) {
                    i = mc4Var.I$0;
                    List list21 = (List) mc4Var.L$5;
                    List list22 = (List) mc4Var.L$4;
                    instantNow = (Instant) mc4Var.L$3;
                    str2 = (String) mc4Var.L$0;
                    jzb.q(objK2);
                    list17 = list21;
                    list6 = list22;
                    if (((Collection) objK2).isEmpty()) {
                        list9 = list6;
                        list8 = list17;
                        List list23 = list8;
                        i2 = i;
                        list10 = list23;
                        list11 = list9;
                        i7 = 0;
                    } else {
                        List list24 = list17;
                        i2 = i;
                        list10 = list24;
                        list11 = list6;
                    }
                    instant = instantNow;
                    if (i2 != 0) {
                        d().g("Skipping divination sweep for " + str2 + ": empty cloud keep-list but local has synced rows (likely backend regression)");
                    }
                    if (i7 != 0) {
                        d().g("Skipping quickDecision sweep for " + str2 + ": empty cloud keep-list but local has synced rows");
                    }
                    if (i2 != 0) {
                        i4 = i2;
                        list15 = list11;
                        list16 = list10;
                        iIntValue = 0;
                        if (i7 == 0) {
                            mc4Var.L$0 = null;
                            mc4Var.L$1 = null;
                            mc4Var.L$2 = null;
                            mc4Var.L$3 = null;
                            mc4Var.L$4 = list15;
                            mc4Var.L$5 = list16;
                            mc4Var.I$0 = i4;
                            mc4Var.I$1 = i7;
                            mc4Var.I$2 = iIntValue;
                            mc4Var.label = 4;
                            n6b n6bVar = (n6b) g6bVar;
                            objK2 = urg.J(n6bVar.a, new m6b(n6bVar, str2, list16, null), mc4Var);
                            if (objK2 != bw2Var) {
                                list18 = list15;
                                list16 = list16;
                            }
                        }
                        if (iIntValue <= 0) {
                            m8b m8bVarD = d();
                            int size = list15.size();
                            int size2 = list16.size();
                            StringBuilder sbN = ib8.n(iIntValue, iIntValue2, "Cloud sync sweep: divination=", " soft-deleted, quickDecision=", " hard-deleted (keep divination=");
                            sbN.append(size);
                            sbN.append(", quickDecision=");
                            sbN.append(size2);
                            sbN.append(")");
                            m8bVarD.e(sbN.toString());
                        } else {
                            m8b m8bVarD2 = d();
                            int size3 = list15.size();
                            int size4 = list16.size();
                            StringBuilder sbN2 = ib8.n(iIntValue, iIntValue2, "Cloud sync sweep: divination=", " soft-deleted, quickDecision=", " hard-deleted (keep divination=");
                            sbN2.append(size3);
                            sbN2.append(", quickDecision=");
                            sbN2.append(size4);
                            sbN2.append(")");
                            m8bVarD2.e(sbN2.toString());
                        }
                        return wef.a;
                    }
                    instant.getClass();
                    mc4Var.L$0 = str2;
                    mc4Var.L$1 = null;
                    mc4Var.L$2 = null;
                    mc4Var.L$3 = null;
                    mc4Var.L$4 = list11;
                    mc4Var.L$5 = list10;
                    mc4Var.I$0 = i2;
                    mc4Var.I$1 = i7;
                    mc4Var.label = 3;
                    vb4 vb4Var = (vb4) nb4Var;
                    list12 = list11;
                    str3 = str2;
                    objK2 = urg.J(vb4Var.a, new tb4(vb4Var, str3, list12, instant, null), mc4Var);
                    if (objK2 != bw2Var) {
                        list13 = list10;
                        i3 = i7;
                        str4 = str3;
                        list14 = list12;
                        i7 = i3;
                        iIntValue = ((Number) objK2).intValue();
                        i4 = i2;
                        list16 = list13;
                        str2 = str4;
                        list15 = list14;
                        if (i7 == 0) {
                            mc4Var.L$0 = null;
                            mc4Var.L$1 = null;
                            mc4Var.L$2 = null;
                            mc4Var.L$3 = null;
                            mc4Var.L$4 = list15;
                            mc4Var.L$5 = list16;
                            mc4Var.I$0 = i4;
                            mc4Var.I$1 = i7;
                            mc4Var.I$2 = iIntValue;
                            mc4Var.label = 4;
                            n6b n6bVar2 = (n6b) g6bVar;
                            objK2 = urg.J(n6bVar2.a, new m6b(n6bVar2, str2, list16, null), mc4Var);
                            if (objK2 != bw2Var) {
                                list18 = list15;
                                list16 = list16;
                            }
                        }
                        if (iIntValue <= 0) {
                            m8b m8bVarD3 = d();
                            int size5 = list15.size();
                            int size6 = list16.size();
                            StringBuilder sbN3 = ib8.n(iIntValue, iIntValue2, "Cloud sync sweep: divination=", " soft-deleted, quickDecision=", " hard-deleted (keep divination=");
                            sbN3.append(size5);
                            sbN3.append(", quickDecision=");
                            sbN3.append(size6);
                            sbN3.append(")");
                            m8bVarD3.e(sbN3.toString());
                        } else {
                            m8b m8bVarD4 = d();
                            int size7 = list15.size();
                            int size8 = list16.size();
                            StringBuilder sbN4 = ib8.n(iIntValue, iIntValue2, "Cloud sync sweep: divination=", " soft-deleted, quickDecision=", " hard-deleted (keep divination=");
                            sbN4.append(size7);
                            sbN4.append(", quickDecision=");
                            sbN4.append(size8);
                            sbN4.append(")");
                            m8bVarD4.e(sbN4.toString());
                        }
                        return wef.a;
                    }
                    return bw2Var;
                }
                if (i6 == 3) {
                    i3 = mc4Var.I$1;
                    i2 = mc4Var.I$0;
                    List list25 = (List) mc4Var.L$5;
                    List list26 = (List) mc4Var.L$4;
                    str4 = (String) mc4Var.L$0;
                    jzb.q(objK2);
                    list13 = list25;
                    list14 = list26;
                    i7 = i3;
                    iIntValue = ((Number) objK2).intValue();
                    i4 = i2;
                    list16 = list13;
                    str2 = str4;
                    list15 = list14;
                    if (i7 == 0) {
                        mc4Var.L$0 = null;
                        mc4Var.L$1 = null;
                        mc4Var.L$2 = null;
                        mc4Var.L$3 = null;
                        mc4Var.L$4 = list15;
                        mc4Var.L$5 = list16;
                        mc4Var.I$0 = i4;
                        mc4Var.I$1 = i7;
                        mc4Var.I$2 = iIntValue;
                        mc4Var.label = 4;
                        n6b n6bVar3 = (n6b) g6bVar;
                        objK2 = urg.J(n6bVar3.a, new m6b(n6bVar3, str2, list16, null), mc4Var);
                        if (objK2 != bw2Var) {
                            list18 = list15;
                            list16 = list16;
                        }
                        return bw2Var;
                    }
                    if (iIntValue <= 0 || iIntValue2 > 0) {
                        m8b m8bVarD5 = d();
                        int size9 = list15.size();
                        int size10 = list16.size();
                        StringBuilder sbN5 = ib8.n(iIntValue, iIntValue2, "Cloud sync sweep: divination=", " soft-deleted, quickDecision=", " hard-deleted (keep divination=");
                        sbN5.append(size9);
                        sbN5.append(", quickDecision=");
                        sbN5.append(size10);
                        sbN5.append(")");
                        m8bVarD5.e(sbN5.toString());
                    }
                    return wef.a;
                }
                if (i6 != 4) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                iIntValue = mc4Var.I$2;
                List list27 = (List) mc4Var.L$5;
                List list28 = (List) mc4Var.L$4;
                jzb.q(objK2);
                list16 = list27;
                list18 = list28;
            }
            iIntValue2 = ((Number) objK2).intValue();
            list15 = list18;
            if (iIntValue <= 0) {
                m8b m8bVarD6 = d();
                int size11 = list15.size();
                int size12 = list16.size();
                StringBuilder sbN6 = ib8.n(iIntValue, iIntValue2, "Cloud sync sweep: divination=", " soft-deleted, quickDecision=", " hard-deleted (keep divination=");
                sbN6.append(size11);
                sbN6.append(", quickDecision=");
                sbN6.append(size12);
                sbN6.append(")");
                m8bVarD6.e(sbN6.toString());
            } else {
                m8b m8bVarD7 = d();
                int size13 = list15.size();
                int size14 = list16.size();
                StringBuilder sbN7 = ib8.n(iIntValue, iIntValue2, "Cloud sync sweep: divination=", " soft-deleted, quickDecision=", " hard-deleted (keep divination=");
                sbN7.append(size13);
                sbN7.append(", quickDecision=");
                sbN7.append(size14);
                sbN7.append(")");
                m8bVarD7.e(sbN7.toString());
            }
            return wef.a;
        }
        jzb.q(objK2);
        instantNow = Instant.now();
        Collection collection3 = collection;
        ArrayList arrayList = new ArrayList(t72.u(collection3, 10));
        Iterator it = collection3.iterator();
        while (it.hasNext()) {
            arrayList.add(k99.J((String) it.next()));
        }
        Collection collection4 = collection2;
        ArrayList arrayList2 = new ArrayList(t72.u(collection4, 10));
        Iterator it2 = collection4.iterator();
        while (it2.hasNext()) {
            arrayList2.add(k99.J((String) it2.next()));
        }
        if (arrayList.isEmpty()) {
            mc4Var.L$0 = str;
            mc4Var.L$1 = null;
            mc4Var.L$2 = null;
            mc4Var.L$3 = instantNow;
            mc4Var.L$4 = arrayList;
            mc4Var.L$5 = arrayList2;
            mc4Var.label = 1;
            objK2 = urg.K(mc4Var, new ia(str, 20), ((vb4) nb4Var).a, true, false);
            if (objK2 != bw2Var) {
                str2 = str;
                list = arrayList2;
                list7 = arrayList;
            }
        } else {
            str2 = str;
            list3 = arrayList;
            list2 = arrayList2;
            list4 = list3;
            list5 = list2;
            i = 0;
            zIsEmpty = list5.isEmpty();
            list9 = list4;
            list8 = list5;
            if (zIsEmpty) {
                mc4Var.L$0 = str2;
                mc4Var.L$1 = null;
                mc4Var.L$2 = null;
                mc4Var.L$3 = instantNow;
                mc4Var.L$4 = list4;
                mc4Var.L$5 = list5;
                mc4Var.I$0 = i;
                mc4Var.label = 2;
                objK = urg.K(mc4Var, new bt5(str2, 23), ((n6b) g6bVar).a, true, false);
                if (objK != bw2Var) {
                    list6 = list4;
                    objK2 = objK;
                    list17 = list5;
                    if (((Collection) objK2).isEmpty()) {
                        List list29 = list17;
                        i2 = i;
                        list10 = list29;
                        list11 = list6;
                    } else {
                        list9 = list6;
                        list8 = list17;
                        List list210 = list8;
                        i2 = i;
                        list10 = list210;
                        list11 = list9;
                        i7 = 0;
                    }
                    instant = instantNow;
                    if (i2 != 0) {
                        d().g("Skipping divination sweep for " + str2 + ": empty cloud keep-list but local has synced rows (likely backend regression)");
                    }
                    if (i7 != 0) {
                        d().g("Skipping quickDecision sweep for " + str2 + ": empty cloud keep-list but local has synced rows");
                    }
                    if (i2 != 0) {
                        i4 = i2;
                        list15 = list11;
                        list16 = list10;
                        iIntValue = 0;
                        if (i7 == 0) {
                            mc4Var.L$0 = null;
                            mc4Var.L$1 = null;
                            mc4Var.L$2 = null;
                            mc4Var.L$3 = null;
                            mc4Var.L$4 = list15;
                            mc4Var.L$5 = list16;
                            mc4Var.I$0 = i4;
                            mc4Var.I$1 = i7;
                            mc4Var.I$2 = iIntValue;
                            mc4Var.label = 4;
                            n6b n6bVar4 = (n6b) g6bVar;
                            objK2 = urg.J(n6bVar4.a, new m6b(n6bVar4, str2, list16, null), mc4Var);
                            if (objK2 != bw2Var) {
                                list18 = list15;
                                list16 = list16;
                                iIntValue2 = ((Number) objK2).intValue();
                                list15 = list18;
                            }
                        }
                        if (iIntValue <= 0) {
                            m8b m8bVarD8 = d();
                            int size15 = list15.size();
                            int size16 = list16.size();
                            StringBuilder sbN8 = ib8.n(iIntValue, iIntValue2, "Cloud sync sweep: divination=", " soft-deleted, quickDecision=", " hard-deleted (keep divination=");
                            sbN8.append(size15);
                            sbN8.append(", quickDecision=");
                            sbN8.append(size16);
                            sbN8.append(")");
                            m8bVarD8.e(sbN8.toString());
                        } else {
                            m8b m8bVarD9 = d();
                            int size17 = list15.size();
                            int size18 = list16.size();
                            StringBuilder sbN9 = ib8.n(iIntValue, iIntValue2, "Cloud sync sweep: divination=", " soft-deleted, quickDecision=", " hard-deleted (keep divination=");
                            sbN9.append(size17);
                            sbN9.append(", quickDecision=");
                            sbN9.append(size18);
                            sbN9.append(")");
                            m8bVarD9.e(sbN9.toString());
                        }
                        return wef.a;
                    }
                    instant.getClass();
                    mc4Var.L$0 = str2;
                    mc4Var.L$1 = null;
                    mc4Var.L$2 = null;
                    mc4Var.L$3 = null;
                    mc4Var.L$4 = list11;
                    mc4Var.L$5 = list10;
                    mc4Var.I$0 = i2;
                    mc4Var.I$1 = i7;
                    mc4Var.label = 3;
                    vb4 vb4Var2 = (vb4) nb4Var;
                    list12 = list11;
                    str3 = str2;
                    objK2 = urg.J(vb4Var2.a, new tb4(vb4Var2, str3, list12, instant, null), mc4Var);
                    if (objK2 != bw2Var) {
                        list13 = list10;
                        i3 = i7;
                        str4 = str3;
                        list14 = list12;
                        i7 = i3;
                        iIntValue = ((Number) objK2).intValue();
                        i4 = i2;
                        list16 = list13;
                        str2 = str4;
                        list15 = list14;
                        if (i7 == 0) {
                            mc4Var.L$0 = null;
                            mc4Var.L$1 = null;
                            mc4Var.L$2 = null;
                            mc4Var.L$3 = null;
                            mc4Var.L$4 = list15;
                            mc4Var.L$5 = list16;
                            mc4Var.I$0 = i4;
                            mc4Var.I$1 = i7;
                            mc4Var.I$2 = iIntValue;
                            mc4Var.label = 4;
                            n6b n6bVar5 = (n6b) g6bVar;
                            objK2 = urg.J(n6bVar5.a, new m6b(n6bVar5, str2, list16, null), mc4Var);
                            if (objK2 != bw2Var) {
                                list18 = list15;
                                list16 = list16;
                                iIntValue2 = ((Number) objK2).intValue();
                                list15 = list18;
                            }
                        }
                        if (iIntValue <= 0) {
                            m8b m8bVarD10 = d();
                            int size19 = list15.size();
                            int size110 = list16.size();
                            StringBuilder sbN10 = ib8.n(iIntValue, iIntValue2, "Cloud sync sweep: divination=", " soft-deleted, quickDecision=", " hard-deleted (keep divination=");
                            sbN10.append(size19);
                            sbN10.append(", quickDecision=");
                            sbN10.append(size110);
                            sbN10.append(")");
                            m8bVarD10.e(sbN10.toString());
                        } else {
                            m8b m8bVarD11 = d();
                            int size111 = list15.size();
                            int size112 = list16.size();
                            StringBuilder sbN11 = ib8.n(iIntValue, iIntValue2, "Cloud sync sweep: divination=", " soft-deleted, quickDecision=", " hard-deleted (keep divination=");
                            sbN11.append(size111);
                            sbN11.append(", quickDecision=");
                            sbN11.append(size112);
                            sbN11.append(")");
                            m8bVarD11.e(sbN11.toString());
                        }
                        return wef.a;
                    }
                }
            } else {
                List list211 = list8;
                i2 = i;
                list10 = list211;
                list11 = list9;
                i7 = 0;
                instant = instantNow;
                if (i2 != 0) {
                    d().g("Skipping divination sweep for " + str2 + ": empty cloud keep-list but local has synced rows (likely backend regression)");
                }
                if (i7 != 0) {
                    d().g("Skipping quickDecision sweep for " + str2 + ": empty cloud keep-list but local has synced rows");
                }
                if (i2 != 0) {
                    i4 = i2;
                    list15 = list11;
                    list16 = list10;
                    iIntValue = 0;
                    if (i7 == 0) {
                        mc4Var.L$0 = null;
                        mc4Var.L$1 = null;
                        mc4Var.L$2 = null;
                        mc4Var.L$3 = null;
                        mc4Var.L$4 = list15;
                        mc4Var.L$5 = list16;
                        mc4Var.I$0 = i4;
                        mc4Var.I$1 = i7;
                        mc4Var.I$2 = iIntValue;
                        mc4Var.label = 4;
                        n6b n6bVar6 = (n6b) g6bVar;
                        objK2 = urg.J(n6bVar6.a, new m6b(n6bVar6, str2, list16, null), mc4Var);
                        if (objK2 != bw2Var) {
                            list18 = list15;
                            list16 = list16;
                            iIntValue2 = ((Number) objK2).intValue();
                            list15 = list18;
                        }
                    }
                    if (iIntValue <= 0) {
                        m8b m8bVarD12 = d();
                        int size113 = list15.size();
                        int size114 = list16.size();
                        StringBuilder sbN12 = ib8.n(iIntValue, iIntValue2, "Cloud sync sweep: divination=", " soft-deleted, quickDecision=", " hard-deleted (keep divination=");
                        sbN12.append(size113);
                        sbN12.append(", quickDecision=");
                        sbN12.append(size114);
                        sbN12.append(")");
                        m8bVarD12.e(sbN12.toString());
                    } else {
                        m8b m8bVarD13 = d();
                        int size115 = list15.size();
                        int size116 = list16.size();
                        StringBuilder sbN13 = ib8.n(iIntValue, iIntValue2, "Cloud sync sweep: divination=", " soft-deleted, quickDecision=", " hard-deleted (keep divination=");
                        sbN13.append(size115);
                        sbN13.append(", quickDecision=");
                        sbN13.append(size116);
                        sbN13.append(")");
                        m8bVarD13.e(sbN13.toString());
                    }
                    return wef.a;
                }
                instant.getClass();
                mc4Var.L$0 = str2;
                mc4Var.L$1 = null;
                mc4Var.L$2 = null;
                mc4Var.L$3 = null;
                mc4Var.L$4 = list11;
                mc4Var.L$5 = list10;
                mc4Var.I$0 = i2;
                mc4Var.I$1 = i7;
                mc4Var.label = 3;
                vb4 vb4Var3 = (vb4) nb4Var;
                list12 = list11;
                str3 = str2;
                objK2 = urg.J(vb4Var3.a, new tb4(vb4Var3, str3, list12, instant, null), mc4Var);
                if (objK2 != bw2Var) {
                    list13 = list10;
                    i3 = i7;
                    str4 = str3;
                    list14 = list12;
                    i7 = i3;
                    iIntValue = ((Number) objK2).intValue();
                    i4 = i2;
                    list16 = list13;
                    str2 = str4;
                    list15 = list14;
                    if (i7 == 0) {
                        mc4Var.L$0 = null;
                        mc4Var.L$1 = null;
                        mc4Var.L$2 = null;
                        mc4Var.L$3 = null;
                        mc4Var.L$4 = list15;
                        mc4Var.L$5 = list16;
                        mc4Var.I$0 = i4;
                        mc4Var.I$1 = i7;
                        mc4Var.I$2 = iIntValue;
                        mc4Var.label = 4;
                        n6b n6bVar7 = (n6b) g6bVar;
                        objK2 = urg.J(n6bVar7.a, new m6b(n6bVar7, str2, list16, null), mc4Var);
                        if (objK2 != bw2Var) {
                            list18 = list15;
                            list16 = list16;
                            iIntValue2 = ((Number) objK2).intValue();
                            list15 = list18;
                        }
                    }
                    if (iIntValue <= 0) {
                        m8b m8bVarD14 = d();
                        int size117 = list15.size();
                        int size118 = list16.size();
                        StringBuilder sbN14 = ib8.n(iIntValue, iIntValue2, "Cloud sync sweep: divination=", " soft-deleted, quickDecision=", " hard-deleted (keep divination=");
                        sbN14.append(size117);
                        sbN14.append(", quickDecision=");
                        sbN14.append(size118);
                        sbN14.append(")");
                        m8bVarD14.e(sbN14.toString());
                    } else {
                        m8b m8bVarD15 = d();
                        int size119 = list15.size();
                        int size1110 = list16.size();
                        StringBuilder sbN15 = ib8.n(iIntValue, iIntValue2, "Cloud sync sweep: divination=", " soft-deleted, quickDecision=", " hard-deleted (keep divination=");
                        sbN15.append(size119);
                        sbN15.append(", quickDecision=");
                        sbN15.append(size1110);
                        sbN15.append(")");
                        m8bVarD15.e(sbN15.toString());
                    }
                    return wef.a;
                }
            }
        }
        return bw2Var;
        if (((Collection) objK2).isEmpty()) {
            list2 = list;
            list3 = list7;
            list4 = list3;
            list5 = list2;
            i = 0;
        } else {
            list4 = list7;
            list5 = list;
            i = 1;
        }
        zIsEmpty = list5.isEmpty();
        list9 = list4;
        list8 = list5;
        if (zIsEmpty) {
            mc4Var.L$0 = str2;
            mc4Var.L$1 = null;
            mc4Var.L$2 = null;
            mc4Var.L$3 = instantNow;
            mc4Var.L$4 = list4;
            mc4Var.L$5 = list5;
            mc4Var.I$0 = i;
            mc4Var.label = 2;
            objK = urg.K(mc4Var, new bt5(str2, 23), ((n6b) g6bVar).a, true, false);
            if (objK != bw2Var) {
                list6 = list4;
                objK2 = objK;
                list17 = list5;
                if (((Collection) objK2).isEmpty()) {
                    List list212 = list17;
                    i2 = i;
                    list10 = list212;
                    list11 = list6;
                } else {
                    list9 = list6;
                    list8 = list17;
                    List list213 = list8;
                    i2 = i;
                    list10 = list213;
                    list11 = list9;
                    i7 = 0;
                }
                instant = instantNow;
                if (i2 != 0) {
                    d().g("Skipping divination sweep for " + str2 + ": empty cloud keep-list but local has synced rows (likely backend regression)");
                }
                if (i7 != 0) {
                    d().g("Skipping quickDecision sweep for " + str2 + ": empty cloud keep-list but local has synced rows");
                }
                if (i2 != 0) {
                    i4 = i2;
                    list15 = list11;
                    list16 = list10;
                    iIntValue = 0;
                    if (i7 == 0) {
                        mc4Var.L$0 = null;
                        mc4Var.L$1 = null;
                        mc4Var.L$2 = null;
                        mc4Var.L$3 = null;
                        mc4Var.L$4 = list15;
                        mc4Var.L$5 = list16;
                        mc4Var.I$0 = i4;
                        mc4Var.I$1 = i7;
                        mc4Var.I$2 = iIntValue;
                        mc4Var.label = 4;
                        n6b n6bVar8 = (n6b) g6bVar;
                        objK2 = urg.J(n6bVar8.a, new m6b(n6bVar8, str2, list16, null), mc4Var);
                        if (objK2 != bw2Var) {
                            list18 = list15;
                            list16 = list16;
                            iIntValue2 = ((Number) objK2).intValue();
                            list15 = list18;
                        }
                    }
                    if (iIntValue <= 0) {
                        m8b m8bVarD16 = d();
                        int size1111 = list15.size();
                        int size1112 = list16.size();
                        StringBuilder sbN16 = ib8.n(iIntValue, iIntValue2, "Cloud sync sweep: divination=", " soft-deleted, quickDecision=", " hard-deleted (keep divination=");
                        sbN16.append(size1111);
                        sbN16.append(", quickDecision=");
                        sbN16.append(size1112);
                        sbN16.append(")");
                        m8bVarD16.e(sbN16.toString());
                    } else {
                        m8b m8bVarD17 = d();
                        int size1113 = list15.size();
                        int size1114 = list16.size();
                        StringBuilder sbN17 = ib8.n(iIntValue, iIntValue2, "Cloud sync sweep: divination=", " soft-deleted, quickDecision=", " hard-deleted (keep divination=");
                        sbN17.append(size1113);
                        sbN17.append(", quickDecision=");
                        sbN17.append(size1114);
                        sbN17.append(")");
                        m8bVarD17.e(sbN17.toString());
                    }
                    return wef.a;
                }
                instant.getClass();
                mc4Var.L$0 = str2;
                mc4Var.L$1 = null;
                mc4Var.L$2 = null;
                mc4Var.L$3 = null;
                mc4Var.L$4 = list11;
                mc4Var.L$5 = list10;
                mc4Var.I$0 = i2;
                mc4Var.I$1 = i7;
                mc4Var.label = 3;
                vb4 vb4Var4 = (vb4) nb4Var;
                list12 = list11;
                str3 = str2;
                objK2 = urg.J(vb4Var4.a, new tb4(vb4Var4, str3, list12, instant, null), mc4Var);
                if (objK2 != bw2Var) {
                    list13 = list10;
                    i3 = i7;
                    str4 = str3;
                    list14 = list12;
                    i7 = i3;
                    iIntValue = ((Number) objK2).intValue();
                    i4 = i2;
                    list16 = list13;
                    str2 = str4;
                    list15 = list14;
                    if (i7 == 0) {
                        mc4Var.L$0 = null;
                        mc4Var.L$1 = null;
                        mc4Var.L$2 = null;
                        mc4Var.L$3 = null;
                        mc4Var.L$4 = list15;
                        mc4Var.L$5 = list16;
                        mc4Var.I$0 = i4;
                        mc4Var.I$1 = i7;
                        mc4Var.I$2 = iIntValue;
                        mc4Var.label = 4;
                        n6b n6bVar9 = (n6b) g6bVar;
                        objK2 = urg.J(n6bVar9.a, new m6b(n6bVar9, str2, list16, null), mc4Var);
                        if (objK2 != bw2Var) {
                            list18 = list15;
                            list16 = list16;
                            iIntValue2 = ((Number) objK2).intValue();
                            list15 = list18;
                        }
                    }
                    if (iIntValue <= 0) {
                        m8b m8bVarD18 = d();
                        int size1115 = list15.size();
                        int size1116 = list16.size();
                        StringBuilder sbN18 = ib8.n(iIntValue, iIntValue2, "Cloud sync sweep: divination=", " soft-deleted, quickDecision=", " hard-deleted (keep divination=");
                        sbN18.append(size1115);
                        sbN18.append(", quickDecision=");
                        sbN18.append(size1116);
                        sbN18.append(")");
                        m8bVarD18.e(sbN18.toString());
                    } else {
                        m8b m8bVarD19 = d();
                        int size1117 = list15.size();
                        int size1118 = list16.size();
                        StringBuilder sbN19 = ib8.n(iIntValue, iIntValue2, "Cloud sync sweep: divination=", " soft-deleted, quickDecision=", " hard-deleted (keep divination=");
                        sbN19.append(size1117);
                        sbN19.append(", quickDecision=");
                        sbN19.append(size1118);
                        sbN19.append(")");
                        m8bVarD19.e(sbN19.toString());
                    }
                    return wef.a;
                }
            }
        } else {
            List list214 = list8;
            i2 = i;
            list10 = list214;
            list11 = list9;
            i7 = 0;
            instant = instantNow;
            if (i2 != 0) {
                d().g("Skipping divination sweep for " + str2 + ": empty cloud keep-list but local has synced rows (likely backend regression)");
            }
            if (i7 != 0) {
                d().g("Skipping quickDecision sweep for " + str2 + ": empty cloud keep-list but local has synced rows");
            }
            if (i2 != 0) {
                i4 = i2;
                list15 = list11;
                list16 = list10;
                iIntValue = 0;
                if (i7 == 0) {
                    mc4Var.L$0 = null;
                    mc4Var.L$1 = null;
                    mc4Var.L$2 = null;
                    mc4Var.L$3 = null;
                    mc4Var.L$4 = list15;
                    mc4Var.L$5 = list16;
                    mc4Var.I$0 = i4;
                    mc4Var.I$1 = i7;
                    mc4Var.I$2 = iIntValue;
                    mc4Var.label = 4;
                    n6b n6bVar10 = (n6b) g6bVar;
                    objK2 = urg.J(n6bVar10.a, new m6b(n6bVar10, str2, list16, null), mc4Var);
                    if (objK2 != bw2Var) {
                        list18 = list15;
                        list16 = list16;
                        iIntValue2 = ((Number) objK2).intValue();
                        list15 = list18;
                    }
                }
                if (iIntValue <= 0) {
                    m8b m8bVarD110 = d();
                    int size1119 = list15.size();
                    int size11110 = list16.size();
                    StringBuilder sbN110 = ib8.n(iIntValue, iIntValue2, "Cloud sync sweep: divination=", " soft-deleted, quickDecision=", " hard-deleted (keep divination=");
                    sbN110.append(size1119);
                    sbN110.append(", quickDecision=");
                    sbN110.append(size11110);
                    sbN110.append(")");
                    m8bVarD110.e(sbN110.toString());
                } else {
                    m8b m8bVarD111 = d();
                    int size11111 = list15.size();
                    int size11112 = list16.size();
                    StringBuilder sbN111 = ib8.n(iIntValue, iIntValue2, "Cloud sync sweep: divination=", " soft-deleted, quickDecision=", " hard-deleted (keep divination=");
                    sbN111.append(size11111);
                    sbN111.append(", quickDecision=");
                    sbN111.append(size11112);
                    sbN111.append(")");
                    m8bVarD111.e(sbN111.toString());
                }
                return wef.a;
            }
            instant.getClass();
            mc4Var.L$0 = str2;
            mc4Var.L$1 = null;
            mc4Var.L$2 = null;
            mc4Var.L$3 = null;
            mc4Var.L$4 = list11;
            mc4Var.L$5 = list10;
            mc4Var.I$0 = i2;
            mc4Var.I$1 = i7;
            mc4Var.label = 3;
            vb4 vb4Var5 = (vb4) nb4Var;
            list12 = list11;
            str3 = str2;
            objK2 = urg.J(vb4Var5.a, new tb4(vb4Var5, str3, list12, instant, null), mc4Var);
            if (objK2 != bw2Var) {
                list13 = list10;
                i3 = i7;
                str4 = str3;
                list14 = list12;
                i7 = i3;
                iIntValue = ((Number) objK2).intValue();
                i4 = i2;
                list16 = list13;
                str2 = str4;
                list15 = list14;
                if (i7 == 0) {
                    mc4Var.L$0 = null;
                    mc4Var.L$1 = null;
                    mc4Var.L$2 = null;
                    mc4Var.L$3 = null;
                    mc4Var.L$4 = list15;
                    mc4Var.L$5 = list16;
                    mc4Var.I$0 = i4;
                    mc4Var.I$1 = i7;
                    mc4Var.I$2 = iIntValue;
                    mc4Var.label = 4;
                    n6b n6bVar11 = (n6b) g6bVar;
                    objK2 = urg.J(n6bVar11.a, new m6b(n6bVar11, str2, list16, null), mc4Var);
                    if (objK2 != bw2Var) {
                        list18 = list15;
                        list16 = list16;
                        iIntValue2 = ((Number) objK2).intValue();
                        list15 = list18;
                    }
                }
                if (iIntValue <= 0) {
                    m8b m8bVarD112 = d();
                    int size11113 = list15.size();
                    int size11114 = list16.size();
                    StringBuilder sbN112 = ib8.n(iIntValue, iIntValue2, "Cloud sync sweep: divination=", " soft-deleted, quickDecision=", " hard-deleted (keep divination=");
                    sbN112.append(size11113);
                    sbN112.append(", quickDecision=");
                    sbN112.append(size11114);
                    sbN112.append(")");
                    m8bVarD112.e(sbN112.toString());
                } else {
                    m8b m8bVarD113 = d();
                    int size11115 = list15.size();
                    int size11116 = list16.size();
                    StringBuilder sbN113 = ib8.n(iIntValue, iIntValue2, "Cloud sync sweep: divination=", " soft-deleted, quickDecision=", " hard-deleted (keep divination=");
                    sbN113.append(size11115);
                    sbN113.append(", quickDecision=");
                    sbN113.append(size11116);
                    sbN113.append(")");
                    m8bVarD113.e(sbN113.toString());
                }
                return wef.a;
            }
        }
        return bw2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j, zn2 zn2Var) {
        nc4 nc4Var;
        if (zn2Var instanceof nc4) {
            nc4Var = (nc4) zn2Var;
            int i = nc4Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nc4Var.label = i - Integer.MIN_VALUE;
            } else {
                nc4Var = new nc4(this, zn2Var);
            }
        } else {
            nc4Var = new nc4(this, zn2Var);
        }
        Object objK = nc4Var.result;
        int i2 = nc4Var.label;
        g6b g6bVar = this.b;
        bw2 bw2Var = bw2.a;
        if (i2 == 0) {
            jzb.q(objK);
            nc4Var.J$0 = j;
            nc4Var.label = 1;
            n6b n6bVar = (n6b) g6bVar;
            objK = urg.K(nc4Var, new ac(j, n6bVar), n6bVar.a, true, false);
            if (objK != bw2Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                jzb.q(objK);
                return objK;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j = nc4Var.J$0;
        jzb.q(objK);
        x6b x6bVar = (x6b) objK;
        Object obj = wef.a;
        if (x6bVar == null) {
            return obj;
        }
        nc4Var.J$0 = j;
        nc4Var.label = 2;
        Object objK2 = urg.K(nc4Var, new ac(j, 13), ((n6b) g6bVar).a, false, true);
        if (objK2 == bw2Var) {
            obj = objK2;
        }
        return obj == bw2Var ? bw2Var : obj;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:57:0x0110  */
    /* JADX WARN: Code duplicated, block: B:76:0x0145 A[Catch: all -> 0x004f, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x004f, blocks: (B:16:0x004a, B:71:0x0129, B:76:0x0145), top: B:87:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0159 A[Catch: all -> 0x0171, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0171, blocks: (B:73:0x013d, B:78:0x0159, B:84:0x0174), top: B:87:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fc A[EXC_TOP_SPLITTER, PHI: r0 r2 r5
  0x00fc: PHI (r0v11 int) = (r0v10 int), (r0v26 int) binds: [B:52:0x00f9, B:28:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x00fc: PHI (r2v17 d99) = (r2v16 d99), (r2v23 d99) binds: [B:52:0x00f9, B:28:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x00fc: PHI (r5v7 java.lang.String) = (r5v6 java.lang.String), (r5v21 java.lang.String) binds: [B:52:0x00f9, B:28:0x0063] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bc, code lost:
    
        if (r2 == r14) goto L56;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x0145, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:78:0x0159, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [d99] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2, types: [d99] */
    /* JADX WARN: Type inference failed for: r5v23, types: [d99] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r17, defpackage.zn2 r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tc4.c(java.lang.String, zn2):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x045b  */
    /* JADX WARN: Code duplicated, block: B:341:0x0381 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:353:0x037b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:360:0x03a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:392:0x0372 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:394:0x03b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:403:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:46:0x02bb A[LOOP:2: B:44:0x02b5->B:46:0x02bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x0359  */
    /* JADX WARN: Code duplicated, block: B:68:0x039e  */
    /* JADX WARN: Code duplicated, block: B:73:0x03b1 A[Catch: Exception -> 0x04c6, CancellationException -> 0x08ea, TryCatch #15 {CancellationException -> 0x08ea, blocks: (B:278:0x081a, B:60:0x037b, B:62:0x0381, B:69:0x03a0, B:71:0x03a8, B:73:0x03b1, B:74:0x03b8, B:76:0x03d7, B:78:0x03dd, B:80:0x03e3, B:82:0x03e9, B:84:0x03ef, B:85:0x03f6, B:87:0x03fc, B:89:0x040b, B:94:0x042e, B:96:0x0439, B:124:0x04d6, B:270:0x07d0, B:274:0x07db, B:276:0x07e2, B:287:0x086e, B:288:0x086f, B:25:0x01d9), top: B:332:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0415  */
    /* JADX WARN: Code duplicated, block: B:96:0x0439 A[Catch: Exception -> 0x0447, CancellationException -> 0x08ea, TRY_LEAVE, TryCatch #15 {CancellationException -> 0x08ea, blocks: (B:278:0x081a, B:60:0x037b, B:62:0x0381, B:69:0x03a0, B:71:0x03a8, B:73:0x03b1, B:74:0x03b8, B:76:0x03d7, B:78:0x03dd, B:80:0x03e3, B:82:0x03e9, B:84:0x03ef, B:85:0x03f6, B:87:0x03fc, B:89:0x040b, B:94:0x042e, B:96:0x0439, B:124:0x04d6, B:270:0x07d0, B:274:0x07db, B:276:0x07e2, B:287:0x086e, B:288:0x086f, B:25:0x01d9), top: B:332:0x0030 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0136: MOVE (r9 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r13 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) (LINE:311), block:B:19:0x0135 */
    /* JADX WARN: Not initialized variable reg: 18, insn: 0x0158: MOVE (r4 I:??[OBJECT, ARRAY]) = (r18 I:??[OBJECT, ARRAY]) (LINE:345), block:B:19:0x0135 */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x0137: MOVE (r13 I:??[OBJECT, ARRAY]) = (r19 I:??[OBJECT, ARRAY]) (LINE:312), block:B:19:0x0135 */
    /* JADX WARN: Not initialized variable reg: 20, insn: 0x0139: MOVE (r17 I:??[OBJECT, ARRAY]) = (r20 I:??[OBJECT, ARRAY]) (LINE:314), block:B:19:0x0135 */
    /* JADX WARN: Not initialized variable reg: 21, insn: 0x013b: MOVE (r15 I:??[OBJECT, ARRAY]) = (r21 I:??[OBJECT, ARRAY]) (LINE:316), block:B:19:0x0135 */
    /* JADX WARN: Not initialized variable reg: 22, insn: 0x013d: MOVE (r1 I:??[OBJECT, ARRAY]) = (r22 I:??[OBJECT, ARRAY]) (LINE:318), block:B:19:0x0135 */
    /* JADX WARN: Not initialized variable reg: 23, insn: 0x014b: MOVE (r7 I:??[OBJECT, ARRAY]) = (r23 I:??[OBJECT, ARRAY]) (LINE:332), block:B:19:0x0135 */
    /* JADX WARN: Not initialized variable reg: 24, insn: 0x014d: MOVE (r10 I:??[OBJECT, ARRAY]) = (r24 I:??[OBJECT, ARRAY]) (LINE:334), block:B:19:0x0135 */
    /* JADX WARN: Not initialized variable reg: 25, insn: 0x014f: MOVE (r11 I:??[OBJECT, ARRAY]) = (r25 I:??[OBJECT, ARRAY]) (LINE:336), block:B:19:0x0135 */
    /* JADX WARN: Not initialized variable reg: 26, insn: 0x013f: MOVE (r6 I:??[OBJECT, ARRAY]) = (r26 I:??[OBJECT, ARRAY]) (LINE:320), block:B:19:0x0135 */
    /* JADX WARN: Not initialized variable reg: 27, insn: 0x0151: MOVE (r2 I:??[OBJECT, ARRAY]) = (r27 I:??[OBJECT, ARRAY]) (LINE:338), block:B:19:0x0135 */
    /* JADX WARN: Not initialized variable reg: 28, insn: 0x0141: MOVE (r22 I:??[OBJECT, ARRAY]) = (r28 I:??[OBJECT, ARRAY]) (LINE:322), block:B:19:0x0135 */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v11 */
    /* JADX WARN: Type inference failed for: r26v82 */
    /* JADX WARN: Type inference failed for: r26v83 */
    /* JADX WARN: Type inference failed for: r26v84 */
    /* JADX WARN: Type inference failed for: r26v9 */
    /* JADX WARN: Type inference failed for: r44v10 */
    /* JADX WARN: Type inference failed for: r44v11 */
    /* JADX WARN: Type inference failed for: r44v12 */
    /* JADX WARN: Type inference failed for: r44v13 */
    /* JADX WARN: Type inference failed for: r44v14 */
    /* JADX WARN: Type inference failed for: r44v15 */
    /* JADX WARN: Type inference failed for: r44v28 */
    /* JADX WARN: Type inference failed for: r44v30 */
    /* JADX WARN: Type inference failed for: r44v32 */
    /* JADX WARN: Type inference failed for: r44v34 */
    /* JADX WARN: Type inference failed for: r44v7 */
    /* JADX WARN: Type inference failed for: r44v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:156:0x0553 -> B:365:0x0573). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:277:0x07ff -> B:159:0x058f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object e(java.lang.String r44, java.lang.String r45, int r46, defpackage.zn2 r47) {
        /*
            Method dump skipped, instruction units count: 2546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tc4.e(java.lang.String, java.lang.String, int, zn2):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(String str, int i, zn2 zn2Var) throws Throwable {
        qc4 qc4Var;
        String str2;
        d99 d99Var;
        Throwable th;
        d99 d99Var2;
        if (zn2Var instanceof qc4) {
            qc4Var = (qc4) zn2Var;
            int i2 = qc4Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qc4Var.label = i2 - Integer.MIN_VALUE;
            } else {
                qc4Var = new qc4(this, zn2Var);
            }
        } else {
            qc4Var = new qc4(this, zn2Var);
        }
        Object objE = qc4Var.result;
        int i3 = qc4Var.label;
        Object obj = bw2.a;
        try {
            if (i3 == 0) {
                jzb.q(objE);
                f99 f99Var = this.d.a;
                qc4Var.L$0 = str;
                qc4Var.L$1 = f99Var;
                qc4Var.I$0 = i;
                qc4Var.label = 1;
                if (f99Var.b(qc4Var) != obj) {
                    str2 = str;
                    d99Var = f99Var;
                }
                return obj;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d99Var2 = (d99) qc4Var.L$1;
                try {
                    jzb.q(objE);
                    l62 l62Var = (l62) objE;
                    d99Var2.h(null);
                    return l62Var;
                } catch (Throwable th2) {
                    th = th2;
                    d99Var2.h(null);
                    throw th;
                }
            }
            i = qc4Var.I$0;
            d99Var = (d99) qc4Var.L$1;
            str2 = (String) qc4Var.L$0;
            jzb.q(objE);
            qc4Var.L$0 = null;
            qc4Var.L$1 = d99Var;
            qc4Var.I$0 = i;
            qc4Var.label = 2;
            objE = e(str2, null, i, qc4Var);
            if (objE != obj) {
                d99Var2 = d99Var;
                l62 l62Var2 = (l62) objE;
                d99Var2.h(null);
                return l62Var2;
            }
            return obj;
        } catch (Throwable th3) {
            d99 d99Var3 = d99Var;
            th = th3;
            d99Var2 = d99Var3;
            d99Var2.h(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(String str, String str2, int i, zn2 zn2Var) throws Throwable {
        rc4 rc4Var;
        String str3;
        d99 d99Var;
        Throwable th;
        d99 d99Var2;
        if (zn2Var instanceof rc4) {
            rc4Var = (rc4) zn2Var;
            int i2 = rc4Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rc4Var.label = i2 - Integer.MIN_VALUE;
            } else {
                rc4Var = new rc4(this, zn2Var);
            }
        } else {
            rc4Var = new rc4(this, zn2Var);
        }
        Object objE = rc4Var.result;
        int i3 = rc4Var.label;
        Object obj = bw2.a;
        try {
            if (i3 == 0) {
                jzb.q(objE);
                f99 f99Var = this.d.a;
                rc4Var.L$0 = str;
                rc4Var.L$1 = str2;
                rc4Var.L$2 = f99Var;
                rc4Var.I$0 = i;
                rc4Var.label = 1;
                if (f99Var.b(rc4Var) != obj) {
                    str3 = str;
                    d99Var = f99Var;
                }
                return obj;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d99Var2 = (d99) rc4Var.L$2;
                try {
                    jzb.q(objE);
                    l62 l62Var = (l62) objE;
                    d99Var2.h(null);
                    return l62Var;
                } catch (Throwable th2) {
                    th = th2;
                    d99Var2.h(null);
                    throw th;
                }
            }
            i = rc4Var.I$0;
            d99Var = (d99) rc4Var.L$2;
            str2 = (String) rc4Var.L$1;
            str3 = (String) rc4Var.L$0;
            jzb.q(objE);
            rc4Var.L$0 = null;
            rc4Var.L$1 = null;
            rc4Var.L$2 = d99Var;
            rc4Var.I$0 = i;
            rc4Var.label = 2;
            objE = e(str3, str2, i, rc4Var);
            if (objE != obj) {
                d99Var2 = d99Var;
                l62 l62Var2 = (l62) objE;
                d99Var2.h(null);
                return l62Var2;
            }
            return obj;
        } catch (Throwable th3) {
            d99 d99Var3 = d99Var;
            th = th3;
            d99Var2 = d99Var3;
            d99Var2.h(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        if (r8 == r5) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
    
        if (r8 == null) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [d99] */
    /* JADX WARN: Type inference failed for: r1v14, types: [d99] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [d99] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [hf8, tc4] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0077 -> B:32:0x007a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.zn2 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.sc4
            if (r0 == 0) goto L13
            r0 = r8
            sc4 r0 = (defpackage.sc4) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            sc4 r0 = new sc4
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            r4 = 0
            bw2 r5 = defpackage.bw2.a
            if (r1 == 0) goto L4f
            if (r1 == r3) goto L43
            if (r1 != r2) goto L3d
            java.lang.Object r1 = r0.L$2
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r0.L$1
            d99 r1 = (defpackage.d99) r1
            java.lang.Object r3 = r0.L$0
            java.lang.String r3 = (java.lang.String) r3
            defpackage.jzb.q(r8)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L3b
            goto L7a
        L37:
            r7 = move-exception
            goto L91
        L39:
            r8 = move-exception
            goto L81
        L3b:
            r7 = move-exception
            goto L90
        L3d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            return r4
        L43:
            java.lang.Object r1 = r0.L$1
            d99 r1 = (defpackage.d99) r1
            java.lang.Object r3 = r0.L$0
            java.lang.String r3 = (java.lang.String) r3
            defpackage.jzb.q(r8)
            goto L68
        L4f:
            defpackage.jzb.q(r8)
            java.lang.String r8 = defpackage.s7.a()
            m62 r1 = r7.d
            f99 r1 = r1.a
            r0.L$0 = r8
            r0.L$1 = r1
            r0.label = r3
            java.lang.Object r3 = r1.b(r0)
            if (r3 != r5) goto L67
            goto L79
        L67:
            r3 = r8
        L68:
            r8 = r4
        L69:
            r0.L$0 = r3     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L3b
            r0.L$1 = r1     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L3b
            r0.L$2 = r4     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L3b
            r0.label = r2     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L3b
            r6 = 100
            java.lang.Object r8 = r7.e(r3, r8, r6, r0)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L3b
            if (r8 != r5) goto L7a
        L79:
            return r5
        L7a:
            l62 r8 = (defpackage.l62) r8     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L3b
            java.lang.String r8 = r8.a     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L3b
            if (r8 != 0) goto L69
            goto L8a
        L81:
            m8b r7 = r7.d()     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = "Cloud sync failed, using local cache"
            r7.h(r0, r8)     // Catch: java.lang.Throwable -> L37
        L8a:
            r1.h(r4)
            wef r7 = defpackage.wef.a
            return r7
        L90:
            throw r7     // Catch: java.lang.Throwable -> L37
        L91:
            r1.h(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tc4.h(zn2):java.lang.Object");
    }
}
