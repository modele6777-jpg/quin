package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class phb {
    public final jsd a = new jsd();
    public final vz9 b = q1c.f(xu4.a);

    public final String a() {
        return s72.D0(b(), "\n", null, null, new z8b(16), 30);
    }

    public final List b() {
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = this.a.listIterator();
        while (true) {
            ql6 ql6Var = (ql6) listIterator;
            if (!ql6Var.hasNext()) {
                return s72.b1(arrayList, new va2(2, new b3b(27)));
            }
            Object next = ql6Var.next();
            lhb lhbVar = (lhb) next;
            if (lhbVar.a() != null && ((ste) lhbVar.b.getValue()) != null) {
                arrayList.add(next);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object c(long j, qwc qwcVar, zn2 zn2Var) {
        nhb nhbVar;
        char c;
        long j2;
        kmb kmbVar;
        qwc qwcVar2 = qwcVar;
        if (zn2Var instanceof nhb) {
            nhbVar = (nhb) zn2Var;
            int i = nhbVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nhbVar.label = i - Integer.MIN_VALUE;
            } else {
                nhbVar = new nhb(this, zn2Var);
            }
        } else {
            nhbVar = new nhb(this, zn2Var);
        }
        Object obj = nhbVar.result;
        int i2 = nhbVar.label;
        vz9 vz9Var = this.b;
        wef wefVar = wef.a;
        xu4 xu4Var = xu4.a;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                kmb kmbVar2 = new kmb();
                List listB = b();
                ArrayList arrayList = new ArrayList();
                Iterator it = listB.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        c = ' ';
                        break;
                    }
                    Object next = it.next();
                    c = ' ';
                    int i3 = kmbVar2.element;
                    ste steVar = (ste) ((lhb) next).b.getValue();
                    steVar.getClass();
                    int length = steVar.a.a.b.length() + i3;
                    int i4 = eue.c;
                    boolean z = length <= ((int) (j >> 32));
                    if (z) {
                        kmbVar2.element = length;
                    }
                    if (!z) {
                        break;
                    }
                    arrayList.add(next);
                }
                int i5 = eue.c;
                if (((int) (j >> c)) != kmbVar2.element || arrayList.isEmpty()) {
                    qwcVar2.b(j);
                    return wefVar;
                }
                vz9Var.setValue(s72.o1(arrayList));
                ybc ybcVarP = jzb.p(new ep9(1, arrayList));
                ohb ohbVar = new ohb(2, null);
                nhbVar.L$0 = qwcVar2;
                nhbVar.L$1 = kmbVar2;
                nhbVar.L$2 = null;
                nhbVar.J$0 = j;
                nhbVar.label = 1;
                Object objC = tm7.C(ybcVarP, ohbVar, nhbVar);
                bw2 bw2Var = bw2.a;
                if (objC == bw2Var) {
                    return bw2Var;
                }
                j2 = j;
                kmbVar = kmbVar2;
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j2 = nhbVar.J$0;
                kmbVar = (kmb) nhbVar.L$1;
                qwcVar2 = (qwc) nhbVar.L$0;
                jzb.q(obj);
            }
            int i6 = eue.c;
            qwcVar2.b(u3c.b(0, ((int) (j2 & 4294967295L)) - kmbVar.element));
            vz9Var.setValue(xu4Var);
            return wefVar;
        } catch (Throwable th) {
            vz9Var.setValue(xu4Var);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0237  */
    /* JADX WARN: Code duplicated, block: B:119:0x023a  */
    /* JADX WARN: Code duplicated, block: B:129:0x0265  */
    /* JADX WARN: Code duplicated, block: B:134:0x0276 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:135:0x0278  */
    /* JADX WARN: Code duplicated, block: B:136:0x027a  */
    /* JADX WARN: Code duplicated, block: B:144:0x0296  */
    /* JADX WARN: Code duplicated, block: B:146:0x029e  */
    /* JADX WARN: Code duplicated, block: B:154:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:158:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:162:0x02de  */
    /* JADX WARN: Code duplicated, block: B:170:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:172:0x0302  */
    /* JADX WARN: Code duplicated, block: B:173:0x0305  */
    /* JADX WARN: Code duplicated, block: B:176:0x0310  */
    /* JADX WARN: Code duplicated, block: B:178:0x031a  */
    /* JADX WARN: Code duplicated, block: B:179:0x031c  */
    /* JADX WARN: Code duplicated, block: B:181:0x0321  */
    /* JADX WARN: Code duplicated, block: B:182:0x0324  */
    /* JADX WARN: Code duplicated, block: B:185:0x0333  */
    /* JADX WARN: Code duplicated, block: B:186:0x0335  */
    /* JADX WARN: Code duplicated, block: B:188:0x033a  */
    /* JADX WARN: Code duplicated, block: B:189:0x033d  */
    /* JADX WARN: Code duplicated, block: B:191:0x0340  */
    /* JADX WARN: Code duplicated, block: B:195:0x034b  */
    /* JADX WARN: Code duplicated, block: B:196:0x034d  */
    /* JADX WARN: Code duplicated, block: B:205:0x0355 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x036c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x02bb A[EDGE_INSN: B:208:0x02bb->B:156:0x02bb BREAK  A[LOOP:1: B:36:0x0102->B:155:0x02b6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x02b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x011f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x025d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x025d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x0257 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x018f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x01b4 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x0289 A[EDGE_INSN: B:242:0x0289->B:141:0x0289 BREAK  A[LOOP:7: B:127:0x025d->B:245:0x025d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x027e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x0289 A[EDGE_INSN: B:244:0x0289->B:141:0x0289 BREAK  A[LOOP:7: B:127:0x025d->B:245:0x025d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x025d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x025d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x02f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:39:0x0109  */
    /* JADX WARN: Code duplicated, block: B:41:0x0111  */
    /* JADX WARN: Code duplicated, block: B:43:0x0115  */
    /* JADX WARN: Code duplicated, block: B:45:0x0119  */
    /* JADX WARN: Code duplicated, block: B:49:0x0124  */
    /* JADX WARN: Code duplicated, block: B:52:0x0138 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x013c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0162  */
    /* JADX WARN: Code duplicated, block: B:64:0x0169  */
    /* JADX WARN: Code duplicated, block: B:66:0x0171  */
    /* JADX WARN: Code duplicated, block: B:81:0x0199  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:91:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v46 */
    public final eue d(long j) {
        int i;
        int i2;
        Object next;
        Integer num;
        eue eueVar;
        String str;
        ArrayList arrayList;
        int i3;
        int i4;
        eue eueVarC;
        int i5;
        int iO;
        Iterator it;
        Object next2;
        eue eueVar2;
        Iterator it2;
        Object next3;
        long j2;
        int i6;
        int i7;
        int i8;
        Object next4;
        long j3;
        int i9;
        int i10;
        int i11;
        long j4;
        char cCharAt;
        int i12;
        char c;
        int i13;
        int i14;
        Character chK;
        eue eueVarC2;
        char cCharAt2;
        char cCharAt3;
        ?? r0;
        boolean zG;
        Character chK2;
        int i15;
        Character chK3;
        int length;
        int i16;
        Character chValueOf;
        char cCharValue;
        int i17;
        String lowerCase;
        int i18;
        char cCharAt4;
        int length2 = 0;
        for (lhb lhbVar : b()) {
            ste steVar = (ste) lhbVar.b.getValue();
            steVar.getClass();
            k00 k00Var = steVar.a.a;
            bv7 bv7Var = (bv7) lhbVar.a.getValue();
            bv7Var.getClass();
            int i19 = 1;
            if (vd0.S(bv7Var).M(bv7Var, true).a(j)) {
                long jK = bv7Var.K(vd0.S(bv7Var), j);
                pr4 pr4Var = mhb.a;
                b59 b59Var = steVar.b;
                String str2 = k00Var.b;
                if (str2.length() == 0) {
                    i = length2;
                    i2 = 0;
                } else {
                    i = length2;
                    i2 = 0;
                    int i20 = (int) (jK & 4294967295L);
                    int iE = b59Var.e(Float.intBitsToFloat(i20));
                    if (Float.intBitsToFloat(i20) >= b59Var.f(iE) && Float.intBitsToFloat(i20) < b59Var.b(iE)) {
                        int i21 = (int) (jK >> 32);
                        if (Float.intBitsToFloat(i21) >= steVar.h(iE) && Float.intBitsToFloat(i21) < steVar.i(iE)) {
                            Iterator it3 = mh3.c0(steVar.j(iE), b59Var.c(iE, true)).iterator();
                            do {
                                if (!((y67) it3).c) {
                                    next = null;
                                    break;
                                }
                                next = ((q67) it3).next();
                            } while (!steVar.b(((Number) next).intValue()).a(jK));
                            num = (Integer) next;
                            if (num != null) {
                                int iIntValue = num.intValue();
                                if (str2.charAt(iIntValue) == '\n' || str2.charAt(iIntValue) == '\r') {
                                }
                            }
                        }
                    }
                    if (num != null) {
                        int iIntValue2 = num.intValue();
                        str = k00Var.b;
                        Set set = sgb.a;
                        str.getClass();
                        arrayList = new ArrayList();
                        i3 = i2;
                        while (true) {
                            i4 = i3;
                            while (true) {
                                if (i3 < str.length()) {
                                    break;
                                }
                                cCharAt = str.charAt(i3);
                                if (cCharAt != '\n') {
                                    c = '\r';
                                    if (cCharAt == '\r') {
                                        if (cCharAt != 8232) {
                                            if (cCharAt == 8233) {
                                                c = '\r';
                                            } else {
                                                cCharAt2 = str.charAt(i3);
                                                if (!v4e.G("。！？；!?;…", cCharAt2)) {
                                                    if (cCharAt2 != '.') {
                                                        chK2 = v4e.K(str, i3 - 1);
                                                        i15 = i3 + 1;
                                                        chK3 = v4e.K(str, i15);
                                                        if (chK2 != null || sgb.a(chK2.charValue()) != i19 || chK3 == null || sgb.a(chK3.charValue()) != i19) {
                                                            length = str.length();
                                                            i16 = i15;
                                                            while (true) {
                                                                if (i16 < length) {
                                                                    cCharAt4 = str.charAt(i16);
                                                                    if (cCharAt4 == '\n' && cCharAt4 != '\r' && cCharAt4 != 8232 && cCharAt4 != 8233) {
                                                                        if (!sgb.b(cCharAt4)) {
                                                                            chValueOf = Character.valueOf(cCharAt4);
                                                                            if (!sgb.a(cCharAt4)) {
                                                                                break;
                                                                            }
                                                                            break;
                                                                        }
                                                                        i16++;
                                                                    }
                                                                }
                                                                chValueOf = null;
                                                                break;
                                                            }
                                                            if (chValueOf != null) {
                                                                cCharValue = chValueOf.charValue();
                                                                i17 = i3;
                                                                while (i17 > 0) {
                                                                    i18 = i17 - 1;
                                                                    if (sgb.a(str.charAt(i18)) && str.charAt(i18) != '.') {
                                                                        break;
                                                                    }
                                                                    i17--;
                                                                }
                                                                lowerCase = str.substring(i17, i15).toLowerCase(Locale.ROOT);
                                                                lowerCase.getClass();
                                                                if (!sgb.a.contains(lowerCase)) {
                                                                    if ('a' <= cCharValue || cCharValue >= '{') {
                                                                        i19 = 1;
                                                                    } else if (!sgb.b.contains(lowerCase)) {
                                                                        if (v4e.I(lowerCase, '.')) {
                                                                            char[] cArr = new char[1];
                                                                            cArr[i2] = '.';
                                                                            List listD0 = v4e.d0(lowerCase, cArr, 6);
                                                                            ArrayList arrayList2 = new ArrayList();
                                                                            for (Object obj : listD0) {
                                                                                if (((String) obj).length() > 0) {
                                                                                    arrayList2.add(obj);
                                                                                }
                                                                            }
                                                                            if (arrayList2.size() < 2) {
                                                                                i19 = 1;
                                                                            } else if (!arrayList2.isEmpty()) {
                                                                                Iterator it4 = arrayList2.iterator();
                                                                                while (true) {
                                                                                    if (it4.hasNext()) {
                                                                                        i19 = 1;
                                                                                        if (((String) it4.next()).length() == 1) {
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            i19 = 1;
                                                                        }
                                                                    }
                                                                    if (chK3 != null || sgb.b(chK3.charValue()) || v4e.G("\"')]}»’”〉》」』】〕〗〙〛）", chK3.charValue()) || chK3.charValue() == '.') {
                                                                    }
                                                                }
                                                                i19 = 1;
                                                            } else {
                                                                i19 = 1;
                                                                if (chK3 != null) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                    i3++;
                                                }
                                                while (true) {
                                                    i3++;
                                                    if (i3 < str.length()) {
                                                        break;
                                                    }
                                                    cCharAt3 = str.charAt(i3);
                                                    if (cCharAt == '.' && cCharAt != 8230) {
                                                        zG = v4e.G("。！？；!?;…", cCharAt3);
                                                    } else if (cCharAt3 == cCharAt) {
                                                        r0 = i19;
                                                    } else {
                                                        r0 = i2;
                                                    }
                                                    if (r0 == 0) {
                                                        r0 = zG;
                                                        if (v4e.G("\"')]}»’”〉》」』】〕〗〙〛）", str.charAt(i3))) {
                                                            break;
                                                        }
                                                    } else {
                                                        r0 = zG;
                                                    }
                                                }
                                                i14 = i3;
                                            }
                                        }
                                        eueVarC2 = sgb.c(i4, i3, str);
                                        if (eueVarC2 != null) {
                                            arrayList.add(eueVarC2);
                                        }
                                        i3 = i14;
                                    }
                                    i12 = 2;
                                    if (cCharAt != c && (chK = v4e.K(str, i3 + 1)) != null) {
                                        if (chK.charValue() == '\n') {
                                            i13 = i12;
                                        }
                                        i14 = i13 + i3;
                                        eueVarC2 = sgb.c(i4, i3, str);
                                        if (eueVarC2 != null) {
                                            arrayList.add(eueVarC2);
                                        }
                                        i3 = i14;
                                    }
                                    i14 = i13 + i3;
                                    eueVarC2 = sgb.c(i4, i3, str);
                                    if (eueVarC2 != null) {
                                        arrayList.add(eueVarC2);
                                    }
                                    i3 = i14;
                                }
                                i12 = 2;
                                c = '\r';
                                i13 = cCharAt != c ? i19 : i19;
                                i14 = i13 + i3;
                                eueVarC2 = sgb.c(i4, i3, str);
                                if (eueVarC2 != null) {
                                    arrayList.add(eueVarC2);
                                }
                                i3 = i14;
                            }
                        }
                        eueVarC = sgb.c(i4, str.length(), str);
                        if (eueVarC != null) {
                            arrayList.add(eueVarC);
                        }
                        i5 = i2;
                        iO = mh3.o(iIntValue2, i5, str.length());
                        it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it.next();
                            j4 = ((eue) next2).a;
                            if (iO < ((int) (j4 >> 32)) && iO < ((int) (j4 & 4294967295L))) {
                                break;
                            }
                        }
                        eueVar2 = (eue) next2;
                        if (eueVar2 == null) {
                            it2 = arrayList.iterator();
                            if (it2.hasNext()) {
                                next3 = it2.next();
                                if (it2.hasNext()) {
                                    j2 = ((eue) next3).a;
                                    i6 = (int) (j2 >> 32);
                                    if (iO < i6) {
                                        i8 = i6 - iO;
                                    } else {
                                        i7 = (int) (j2 & 4294967295L);
                                        if (iO > i7) {
                                            i8 = iO - i7;
                                        } else {
                                            i8 = i5;
                                        }
                                    }
                                    do {
                                        next4 = it2.next();
                                        j3 = ((eue) next4).a;
                                        i9 = (int) (j3 >> 32);
                                        if (iO < i9) {
                                            i11 = i9 - iO;
                                        } else {
                                            i10 = (int) (j3 & 4294967295L);
                                            if (iO > i10) {
                                                i11 = iO - i10;
                                            } else {
                                                i11 = i5;
                                            }
                                        }
                                        if (i8 > i11) {
                                            next3 = next4;
                                            i8 = i11;
                                        }
                                    } while (it2.hasNext());
                                }
                            } else {
                                next3 = null;
                            }
                            eueVar = (eue) next3;
                        } else {
                            eueVar = eueVar2;
                        }
                    } else {
                        eueVar = null;
                    }
                    if (eueVar != null) {
                        long j5 = eueVar.a;
                        return new eue(u3c.b(i + ((int) (j5 >> 32)), ((int) (j5 & 4294967295L)) + i));
                    }
                }
                num = null;
                if (num != null) {
                    int iIntValue3 = num.intValue();
                    str = k00Var.b;
                    Set set2 = sgb.a;
                    str.getClass();
                    arrayList = new ArrayList();
                    i3 = i2;
                    while (true) {
                        i4 = i3;
                        while (true) {
                            if (i3 < str.length()) {
                                break;
                                break;
                            }
                            cCharAt = str.charAt(i3);
                            if (cCharAt != '\n') {
                                c = '\r';
                                if (cCharAt == '\r') {
                                    if (cCharAt != 8232) {
                                        if (cCharAt == 8233) {
                                            c = '\r';
                                        } else {
                                            cCharAt2 = str.charAt(i3);
                                            if (!v4e.G("。！？；!?;…", cCharAt2)) {
                                                if (cCharAt2 != '.') {
                                                    chK2 = v4e.K(str, i3 - 1);
                                                    i15 = i3 + 1;
                                                    chK3 = v4e.K(str, i15);
                                                    if (chK2 != null) {
                                                        length = str.length();
                                                        i16 = i15;
                                                        while (true) {
                                                            if (i16 < length) {
                                                                cCharAt4 = str.charAt(i16);
                                                                if (cCharAt4 == '\n') {
                                                                }
                                                            }
                                                            chValueOf = null;
                                                            i16++;
                                                        }
                                                        if (chValueOf != null) {
                                                            cCharValue = chValueOf.charValue();
                                                            i17 = i3;
                                                            while (i17 > 0) {
                                                                i18 = i17 - 1;
                                                                if (sgb.a(str.charAt(i18))) {
                                                                }
                                                                i17--;
                                                            }
                                                            lowerCase = str.substring(i17, i15).toLowerCase(Locale.ROOT);
                                                            lowerCase.getClass();
                                                            if (!sgb.a.contains(lowerCase)) {
                                                                if ('a' <= cCharValue) {
                                                                    i19 = 1;
                                                                } else {
                                                                    i19 = 1;
                                                                }
                                                                if (chK3 != null) {
                                                                }
                                                            }
                                                            i19 = 1;
                                                        } else {
                                                            i19 = 1;
                                                            if (chK3 != null) {
                                                            }
                                                        }
                                                    } else {
                                                        length = str.length();
                                                        i16 = i15;
                                                        while (true) {
                                                            if (i16 < length) {
                                                                cCharAt4 = str.charAt(i16);
                                                                if (cCharAt4 == '\n') {
                                                                }
                                                            }
                                                            chValueOf = null;
                                                            i16++;
                                                        }
                                                        if (chValueOf != null) {
                                                            cCharValue = chValueOf.charValue();
                                                            i17 = i3;
                                                            while (i17 > 0) {
                                                                i18 = i17 - 1;
                                                                if (sgb.a(str.charAt(i18))) {
                                                                }
                                                                i17--;
                                                            }
                                                            lowerCase = str.substring(i17, i15).toLowerCase(Locale.ROOT);
                                                            lowerCase.getClass();
                                                            if (!sgb.a.contains(lowerCase)) {
                                                                if ('a' <= cCharValue) {
                                                                    i19 = 1;
                                                                } else {
                                                                    i19 = 1;
                                                                }
                                                                if (chK3 != null) {
                                                                }
                                                            }
                                                            i19 = 1;
                                                        } else {
                                                            i19 = 1;
                                                            if (chK3 != null) {
                                                            }
                                                        }
                                                    }
                                                }
                                                i3++;
                                            }
                                            while (true) {
                                                i3++;
                                                if (i3 < str.length()) {
                                                    break;
                                                    break;
                                                }
                                                cCharAt3 = str.charAt(i3);
                                                if (cCharAt == '.') {
                                                    if (cCharAt3 == cCharAt) {
                                                        r0 = i19;
                                                    } else {
                                                        r0 = i2;
                                                    }
                                                } else if (cCharAt3 == cCharAt) {
                                                    r0 = i19;
                                                } else {
                                                    r0 = i2;
                                                }
                                                if (r0 == 0) {
                                                    r0 = zG;
                                                    if (v4e.G("\"')]}»’”〉》」』】〕〗〙〛）", str.charAt(i3))) {
                                                        break;
                                                        break;
                                                    }
                                                } else {
                                                    r0 = zG;
                                                }
                                            }
                                            i14 = i3;
                                        }
                                    }
                                    eueVarC2 = sgb.c(i4, i3, str);
                                    if (eueVarC2 != null) {
                                        arrayList.add(eueVarC2);
                                    }
                                    i3 = i14;
                                }
                                i12 = 2;
                                if (cCharAt != c) {
                                }
                                i14 = i13 + i3;
                                eueVarC2 = sgb.c(i4, i3, str);
                                if (eueVarC2 != null) {
                                    arrayList.add(eueVarC2);
                                }
                                i3 = i14;
                            }
                            i12 = 2;
                            c = '\r';
                            if (cCharAt != c) {
                            }
                            i14 = i13 + i3;
                            eueVarC2 = sgb.c(i4, i3, str);
                            if (eueVarC2 != null) {
                                arrayList.add(eueVarC2);
                            }
                            i3 = i14;
                        }
                    }
                    eueVarC = sgb.c(i4, str.length(), str);
                    if (eueVarC != null) {
                        arrayList.add(eueVarC);
                    }
                    i5 = i2;
                    iO = mh3.o(iIntValue3, i5, str.length());
                    it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        j4 = ((eue) next2).a;
                        if (iO < ((int) (j4 >> 32))) {
                        }
                    }
                    eueVar2 = (eue) next2;
                    if (eueVar2 == null) {
                        it2 = arrayList.iterator();
                        if (it2.hasNext()) {
                            next3 = null;
                        } else {
                            next3 = it2.next();
                            if (it2.hasNext()) {
                                j2 = ((eue) next3).a;
                                i6 = (int) (j2 >> 32);
                                if (iO < i6) {
                                    i8 = i6 - iO;
                                } else {
                                    i7 = (int) (j2 & 4294967295L);
                                    if (iO > i7) {
                                        i8 = iO - i7;
                                    } else {
                                        i8 = i5;
                                    }
                                }
                                do {
                                    next4 = it2.next();
                                    j3 = ((eue) next4).a;
                                    i9 = (int) (j3 >> 32);
                                    if (iO < i9) {
                                        i11 = i9 - iO;
                                    } else {
                                        i10 = (int) (j3 & 4294967295L);
                                        if (iO > i10) {
                                            i11 = iO - i10;
                                        } else {
                                            i11 = i5;
                                        }
                                    }
                                    if (i8 > i11) {
                                        next3 = next4;
                                        i8 = i11;
                                    }
                                } while (it2.hasNext());
                            }
                        }
                        eueVar = (eue) next3;
                    } else {
                        eueVar = eueVar2;
                    }
                } else {
                    eueVar = null;
                }
                if (eueVar != null) {
                    long j6 = eueVar.a;
                    return new eue(u3c.b(i + ((int) (j6 >> 32)), ((int) (j6 & 4294967295L)) + i));
                }
            } else {
                i = length2;
            }
            length2 = k00Var.b.length() + i;
        }
        return null;
    }
}
