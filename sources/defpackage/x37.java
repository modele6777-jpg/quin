package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class x37 implements t37 {
    public int X;
    public ow3 Y;
    public f31 Z;
    public final a80 a;
    public final ArrayList b;
    public final HashMap c;
    public final ArrayList d;
    public final BitSet e;
    public final BitSet f;
    public final int g;
    public final boolean v;
    public final IdentityHashMap w = new IdentityHashMap();
    public HashMap x;
    public xg3 y;
    public boolean z;

    public x37(a80 a80Var) {
        this.a = a80Var;
        ArrayList arrayList = new ArrayList((List) a80Var.c);
        arrayList.add(new yq0(true ? 1 : 0));
        arrayList.add(new yq0(2));
        arrayList.add(new yq0(3));
        arrayList.add(new yq0(0));
        arrayList.add(new yq0(4));
        this.b = arrayList;
        List list = (List) a80Var.d;
        HashMap map = new HashMap();
        Object[] objArr = {new kg0('*'), new kg0('_')};
        ArrayList arrayList2 = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList2.add(obj);
        }
        c(Collections.unmodifiableList(arrayList2), map);
        c(list, map);
        this.c = map;
        ArrayList arrayList3 = new ArrayList((List) a80Var.e);
        arrayList3.add(new iu2());
        this.d = arrayList3;
        Set set = (Set) a80Var.f;
        BitSet bitSet = new BitSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            bitSet.set(((Character) it.next()).charValue());
        }
        bitSet.set(33);
        this.f = bitSet;
        int i2 = a80Var.b;
        this.g = i2;
        this.v = i2 != Integer.MAX_VALUE;
        Set setKeySet = this.c.keySet();
        ArrayList arrayList4 = this.b;
        BitSet bitSet2 = (BitSet) bitSet.clone();
        Iterator it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            bitSet2.set(((Character) it2.next()).charValue());
        }
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Iterator it4 = ((yq0) it3.next()).a().iterator();
            while (it4.hasNext()) {
                bitSet2.set(((Character) it4.next()).charValue());
            }
        }
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(33);
        bitSet2.set(10);
        this.e = bitSet2;
    }

    public static void b(char c, pw3 pw3Var, HashMap map) {
        if (((pw3) map.put(Character.valueOf(c), pw3Var)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c + "'");
    }

    public static void c(Iterable iterable, HashMap map) {
        fyd fydVar;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            pw3 pw3Var = (pw3) it.next();
            char cD = pw3Var.d();
            char cB = pw3Var.b();
            if (cD == cB) {
                pw3 pw3Var2 = (pw3) map.get(Character.valueOf(cD));
                if (pw3Var2 == null || pw3Var2.d() != pw3Var2.b()) {
                    b(cD, pw3Var, map);
                } else {
                    if (pw3Var2 instanceof fyd) {
                        fydVar = (fyd) pw3Var2;
                    } else {
                        fyd fydVar2 = new fyd(cD);
                        fydVar2.e(pw3Var2);
                        fydVar = fydVar2;
                    }
                    fydVar.e(pw3Var);
                    map.put(Character.valueOf(cD), fydVar);
                }
            } else {
                b(cD, pw3Var, map);
                b(cB, pw3Var, map);
            }
        }
    }

    public static ime j(mx mxVar) {
        ime imeVar = new ime(mxVar.e());
        imeVar.g(mxVar.f());
        return imeVar;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0297  */
    /* JADX WARN: Code duplicated, block: B:104:0x029a  */
    /* JADX WARN: Code duplicated, block: B:108:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:110:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:114:0x02af  */
    /* JADX WARN: Code duplicated, block: B:116:0x02b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:120:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:122:0x02bd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:126:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:129:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:130:0x02cc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:133:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:135:0x02d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:138:0x02db  */
    /* JADX WARN: Code duplicated, block: B:139:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:140:0x02df  */
    /* JADX WARN: Code duplicated, block: B:143:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:145:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:148:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:152:0x0301  */
    /* JADX WARN: Code duplicated, block: B:153:0x0303  */
    /* JADX WARN: Code duplicated, block: B:155:0x031a  */
    /* JADX WARN: Code duplicated, block: B:159:0x0321  */
    /* JADX WARN: Code duplicated, block: B:178:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:191:0x03ea A[PHI: r10
  0x03ea: PHI (r10v4 char) = (r10v3 char), (r10v5 char), (r10v6 char) binds: [B:185:0x03df, B:187:0x03e3, B:190:0x03e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:194:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:196:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:211:0x045e  */
    /* JADX WARN: Code duplicated, block: B:238:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:239:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:242:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:244:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:245:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:250:0x0503  */
    /* JADX WARN: Code duplicated, block: B:253:0x051b  */
    /* JADX WARN: Code duplicated, block: B:254:0x051d  */
    /* JADX WARN: Code duplicated, block: B:257:0x052b  */
    /* JADX WARN: Code duplicated, block: B:258:0x0534  */
    /* JADX WARN: Code duplicated, block: B:260:0x0537 A[LOOP:7: B:240:0x04d6->B:260:0x0537, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:268:0x055c A[LOOP:8: B:267:0x055a->B:268:0x055c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:271:0x0567  */
    /* JADX WARN: Code duplicated, block: B:275:0x056e  */
    /* JADX WARN: Code duplicated, block: B:284:0x059c  */
    /* JADX WARN: Code duplicated, block: B:290:0x05af  */
    /* JADX WARN: Code duplicated, block: B:292:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:294:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:297:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:298:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:327:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:328:0x01b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:329:0x023d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:330:0x053d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:0x04c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:335:0x05ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0125  */
    /* JADX WARN: Code duplicated, block: B:43:0x013f  */
    /* JADX WARN: Code duplicated, block: B:45:0x014d  */
    /* JADX WARN: Code duplicated, block: B:48:0x015d  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ac A[LOOP:5: B:46:0x0157->B:56:0x01ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:59:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:61:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:63:0x01d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:67:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:73:0x020b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0213  */
    /* JADX WARN: Code duplicated, block: B:77:0x0227 A[LOOP:6: B:75:0x021d->B:77:0x0227, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x0243  */
    /* JADX WARN: Code duplicated, block: B:82:0x0253  */
    /* JADX WARN: Code duplicated, block: B:86:0x026a  */
    /* JADX WARN: Code duplicated, block: B:87:0x026f  */
    /* JADX WARN: Code duplicated, block: B:89:0x027c  */
    /* JADX WARN: Code duplicated, block: B:90:0x027f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0282  */
    /* JADX WARN: Code duplicated, block: B:96:0x028b  */
    /* JADX WARN: Code duplicated, block: B:98:0x028e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v40, types: [zw0] */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v51 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v65 */
    /* JADX WARN: Type inference failed for: r6v66 */
    /* JADX WARN: Type inference failed for: r6v67 */
    /* JADX WARN: Type inference failed for: r6v68 */
    /* JADX WARN: Type inference failed for: r6v69 */
    /* JADX WARN: Type inference failed for: r6v70 */
    /* JADX WARN: Type inference failed for: r7v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v54 */
    @Override // defpackage.t37
    public final void a(mx mxVar, sf9 sf9Var) {
        int i;
        ?? UnmodifiableList;
        String strE;
        String strB;
        String strB2;
        w37 w37Var;
        String str;
        a82 a82Var;
        a82 a82Var2;
        ime imeVar;
        una unaVarN;
        Iterator it;
        xg3 xg3Var;
        String str2;
        String str3;
        mv3 mv3Var;
        Object obj;
        o68 o68Var;
        egh eghVarA;
        sf9 sf9Var2;
        boolean z;
        boolean z2;
        sf9 sf9Var3;
        int i2;
        f31 f31Var;
        f31 f31Var2;
        una unaVar;
        sf9 sf9VarJ;
        List list;
        pw3 pw3Var;
        Object objUnmodifiableList;
        xg3 xg3Var2;
        int i3;
        int codePoint;
        una unaVarN2;
        ArrayList arrayList;
        boolean zK;
        xg3 xg3Var3;
        int i4;
        int codePoint2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        ?? r6;
        ?? r7;
        int i13;
        char cCharAt;
        int i14;
        char cCharAt2;
        ?? r10;
        ow3 ow3Var;
        ow3 ow3Var2;
        char cCharAt3;
        char cCharAt4;
        una unaVarN3;
        Iterator it2;
        fz3 fz3VarA;
        sf9 sf9Var4;
        r37 zq0Var;
        this.y = new xg3(mxVar.a);
        this.z = !mxVar.f().isEmpty();
        int i15 = 0;
        this.X = 0;
        w37 w37Var2 = null;
        this.Y = null;
        this.Z = null;
        IdentityHashMap identityHashMap = this.w;
        identityHashMap.clear();
        HashMap map = new HashMap();
        for (yq0 yq0Var : this.b) {
            switch (yq0Var.a) {
                case 0:
                    zq0Var = new zq0();
                    break;
                case 1:
                    zq0Var = new ws0();
                    break;
                case 2:
                    zq0Var = new xs0();
                    break;
                case 3:
                    zq0Var = new dx4();
                    break;
                default:
                    zq0Var = new nr6();
                    break;
            }
            Iterator it3 = yq0Var.a().iterator();
            while (it3.hasNext()) {
                ((List) map.computeIfAbsent((Character) it3.next(), new fj0(4))).add(zq0Var);
            }
        }
        this.x = map;
        while (true) {
            char cM = this.y.m();
            if (cM == 0) {
                i = i15;
                UnmodifiableList = 0;
            } else if (cM == '\n') {
                i = i15;
                this.y.j();
                int i16 = this.X >= 2 ? 1 : i;
                this.X = i;
                Object ih6Var = i16 != 0 ? new ih6() : new usd();
                ArrayList arrayList2 = new ArrayList(1);
                Object obj2 = new Object[]{ih6Var}[i];
                Objects.requireNonNull(obj2);
                arrayList2.add(obj2);
                UnmodifiableList = Collections.unmodifiableList(arrayList2);
            } else if (cM == '[') {
                una unaVarN4 = this.y.n();
                this.y.j();
                una unaVarN5 = this.y.n();
                ime imeVarJ = j(this.y.e(unaVarN4, unaVarN5));
                f31 f31Var3 = this.Z;
                f31 f31Var4 = new f31(null, null, imeVarJ, unaVarN4, unaVarN5, f31Var3, this.Y);
                if (f31Var3 != null) {
                    f31Var3.i = true;
                }
                this.Z = f31Var4;
                ArrayList arrayList3 = new ArrayList(1);
                i = 0;
                Object obj3 = new Object[]{imeVarJ}[0];
                Objects.requireNonNull(obj3);
                arrayList3.add(obj3);
                UnmodifiableList = Collections.unmodifiableList(arrayList3);
            } else if (cM != ']') {
                if (this.f.get(cM)) {
                    una unaVarN6 = this.y.n();
                    una unaVarN7 = this.y.n();
                    this.y.j();
                    una unaVarN8 = this.y.n();
                    if (this.y.k('[')) {
                        una unaVarN9 = this.y.n();
                        ime imeVarJ2 = j(this.y.e(unaVarN7, unaVarN8));
                        ime imeVarJ3 = j(this.y.e(unaVarN8, unaVarN9));
                        f31 f31Var5 = this.Z;
                        f31 f31Var6 = new f31(imeVarJ2, unaVarN7, imeVarJ3, unaVarN8, unaVarN9, f31Var5, this.Y);
                        if (f31Var5 != null) {
                            f31Var5.i = true;
                        }
                        this.Z = f31Var6;
                        Object[] objArr = {imeVarJ2, imeVarJ3};
                        ArrayList arrayList4 = new ArrayList(2);
                        for (int i17 = i15; i17 < 2; i17++) {
                            Object obj4 = objArr[i17];
                            Objects.requireNonNull(obj4);
                            arrayList4.add(obj4);
                        }
                        objUnmodifiableList = Collections.unmodifiableList(arrayList4);
                    } else {
                        objUnmodifiableList = w37Var2;
                    }
                    if (objUnmodifiableList == null) {
                        this.y.o(unaVarN6);
                        if (this.e.get(cM)) {
                            list = (List) this.x.get(Character.valueOf(cM));
                            if (list != null) {
                                unaVarN3 = this.y.n();
                                it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        fz3VarA = ((r37) it2.next()).a(this);
                                        if (fz3VarA != null) {
                                            sf9Var4 = (sf9) fz3VarA.b;
                                            this.y.o((una) fz3VarA.c);
                                            if (this.z && sf9Var4.d().isEmpty()) {
                                                xg3 xg3Var4 = this.y;
                                                sf9Var4.g(xg3Var4.e(unaVarN3, xg3Var4.n()).f());
                                            }
                                            ArrayList arrayList5 = new ArrayList(1);
                                            Object obj5 = new Object[]{sf9Var4}[i15];
                                            Objects.requireNonNull(obj5);
                                            arrayList5.add(obj5);
                                            objUnmodifiableList = Collections.unmodifiableList(arrayList5);
                                        } else {
                                            this.y.o(unaVarN3);
                                        }
                                    } else {
                                        pw3Var = (pw3) this.c.get(Character.valueOf(cM));
                                        if (pw3Var == null) {
                                            Object[] objArr2 = {f()};
                                            ArrayList arrayList6 = new ArrayList(1);
                                            Object obj6 = objArr2[i15];
                                            Objects.requireNonNull(obj6);
                                            arrayList6.add(obj6);
                                            objUnmodifiableList = Collections.unmodifiableList(arrayList6);
                                        } else {
                                            xg3Var2 = this.y;
                                            i3 = xg3Var2.b;
                                            if (i3 > 0) {
                                                int i18 = i3 - 1;
                                                cCharAt3 = ((std) xg3Var2.e).a.charAt(i18);
                                                if (Character.isLowSurrogate(cCharAt3) && i18 > 0) {
                                                    cCharAt4 = ((std) xg3Var2.e).a.charAt(i3 - 2);
                                                    codePoint = cCharAt3;
                                                    if (Character.isHighSurrogate(cCharAt4)) {
                                                        codePoint = Character.toCodePoint(cCharAt4, cCharAt3);
                                                    }
                                                }
                                            } else if (xg3Var2.a > 0) {
                                                codePoint = 10;
                                            } else {
                                                codePoint = i15;
                                            }
                                            codePoint = cCharAt3;
                                            codePoint = cCharAt3;
                                            unaVarN2 = this.y.n();
                                            if (this.y.h(cM) < pw3Var.c()) {
                                                this.y.o(unaVarN2);
                                                r10 = w37Var2;
                                            } else {
                                                arrayList = new ArrayList();
                                                this.y.o(unaVarN2);
                                                while (true) {
                                                    zK = this.y.k(cM);
                                                    xg3Var3 = this.y;
                                                    if (zK) {
                                                        arrayList.add(j(xg3Var3.e(unaVarN2, xg3Var3.n())));
                                                        unaVarN2 = this.y.n();
                                                    } else {
                                                        i4 = xg3Var3.b;
                                                        if (i4 < xg3Var3.c) {
                                                            cCharAt = ((std) xg3Var3.e).a.charAt(i4);
                                                            if (Character.isHighSurrogate(cCharAt) && (i14 = xg3Var3.b + 1) < xg3Var3.c) {
                                                                cCharAt2 = ((std) xg3Var3.e).a.charAt(i14);
                                                                if (Character.isLowSurrogate(cCharAt2)) {
                                                                    codePoint2 = cCharAt;
                                                                    codePoint2 = cCharAt;
                                                                    codePoint2 = cCharAt;
                                                                    codePoint2 = Character.toCodePoint(cCharAt, cCharAt2);
                                                                }
                                                            }
                                                        } else if (xg3Var3.a < ((ArrayList) xg3Var3.d).size() - 1) {
                                                            codePoint2 = 10;
                                                        } else {
                                                            codePoint2 = i15;
                                                        }
                                                        if (codePoint != 0 || vfh.C(codePoint)) {
                                                            i5 = 1;
                                                        } else {
                                                            i5 = i15;
                                                        }
                                                        if (codePoint != 0 || vfh.D(codePoint)) {
                                                            i6 = 1;
                                                        } else {
                                                            i6 = i15;
                                                        }
                                                        if (codePoint2 != 0 || vfh.C(codePoint2)) {
                                                            i7 = 1;
                                                        } else {
                                                            i7 = i15;
                                                        }
                                                        if (codePoint2 != 0 || vfh.D(codePoint2)) {
                                                            i8 = 1;
                                                        } else {
                                                            i8 = i15;
                                                        }
                                                        if (i8 == 0 || (i7 != 0 && i6 == 0 && i5 == 0)) {
                                                            i9 = i15;
                                                        } else {
                                                            i9 = 1;
                                                        }
                                                        if (i6 == 0 || (i5 != 0 && i8 == 0 && i7 == 0)) {
                                                            i10 = i15;
                                                        } else {
                                                            i10 = 1;
                                                        }
                                                        if (cM == '_') {
                                                            if (i9 != 0 || (i10 != 0 && i5 == 0)) {
                                                                i13 = i15;
                                                            } else {
                                                                i13 = 1;
                                                            }
                                                            if (i10 != 0 || (i9 != 0 && i7 == 0)) {
                                                                r7 = i15;
                                                                r6 = i13;
                                                            } else {
                                                                r7 = 1;
                                                                r6 = i13;
                                                            }
                                                        } else {
                                                            if (i9 == 0 && cM == pw3Var.d()) {
                                                                i11 = 1;
                                                            } else {
                                                                i11 = i15;
                                                            }
                                                            if (i10 == 0 && cM == pw3Var.b()) {
                                                                i12 = 1;
                                                            } else {
                                                                i12 = i15;
                                                            }
                                                            r6 = i11;
                                                            r7 = i12;
                                                        }
                                                        zw0 zw0Var = new zw0();
                                                        zw0Var.c = arrayList;
                                                        zw0Var.b = r6;
                                                        zw0Var.a = r7;
                                                        r10 = zw0Var;
                                                    }
                                                }
                                            }
                                            if (r10 == 0) {
                                                objUnmodifiableList = w37Var2;
                                            } else {
                                                ArrayList arrayList7 = (ArrayList) r10.c;
                                                ow3Var = new ow3(arrayList7, cM, r10.b, r10.a, this.Y);
                                                this.Y = ow3Var;
                                                ow3Var2 = ow3Var.f;
                                                if (ow3Var2 != null) {
                                                    ow3Var2.g = ow3Var;
                                                }
                                                objUnmodifiableList = arrayList7;
                                            }
                                            if (objUnmodifiableList == null) {
                                                Object[] objArr3 = {f()};
                                                ArrayList arrayList8 = new ArrayList(1);
                                                Object obj7 = objArr3[i15];
                                                Objects.requireNonNull(obj7);
                                                arrayList8.add(obj7);
                                                objUnmodifiableList = Collections.unmodifiableList(arrayList8);
                                            }
                                        }
                                    }
                                }
                            } else {
                                pw3Var = (pw3) this.c.get(Character.valueOf(cM));
                                if (pw3Var == null) {
                                    Object[] objArr4 = {f()};
                                    ArrayList arrayList9 = new ArrayList(1);
                                    Object obj8 = objArr4[i15];
                                    Objects.requireNonNull(obj8);
                                    arrayList9.add(obj8);
                                    objUnmodifiableList = Collections.unmodifiableList(arrayList9);
                                } else {
                                    xg3Var2 = this.y;
                                    i3 = xg3Var2.b;
                                    if (i3 > 0) {
                                        int i19 = i3 - 1;
                                        cCharAt3 = ((std) xg3Var2.e).a.charAt(i19);
                                        if (Character.isLowSurrogate(cCharAt3)) {
                                            cCharAt4 = ((std) xg3Var2.e).a.charAt(i3 - 2);
                                            codePoint = cCharAt3;
                                            if (Character.isHighSurrogate(cCharAt4)) {
                                                codePoint = Character.toCodePoint(cCharAt4, cCharAt3);
                                            }
                                        }
                                    } else if (xg3Var2.a > 0) {
                                        codePoint = 10;
                                    } else {
                                        codePoint = i15;
                                    }
                                    codePoint = cCharAt3;
                                    codePoint = cCharAt3;
                                    unaVarN2 = this.y.n();
                                    if (this.y.h(cM) < pw3Var.c()) {
                                        this.y.o(unaVarN2);
                                        r10 = w37Var2;
                                    } else {
                                        arrayList = new ArrayList();
                                        this.y.o(unaVarN2);
                                        while (true) {
                                            zK = this.y.k(cM);
                                            xg3Var3 = this.y;
                                            if (zK) {
                                                arrayList.add(j(xg3Var3.e(unaVarN2, xg3Var3.n())));
                                                unaVarN2 = this.y.n();
                                            } else {
                                                i4 = xg3Var3.b;
                                                if (i4 < xg3Var3.c) {
                                                    cCharAt = ((std) xg3Var3.e).a.charAt(i4);
                                                    if (Character.isHighSurrogate(cCharAt)) {
                                                        cCharAt2 = ((std) xg3Var3.e).a.charAt(i14);
                                                        if (Character.isLowSurrogate(cCharAt2)) {
                                                            codePoint2 = cCharAt;
                                                            codePoint2 = cCharAt;
                                                            codePoint2 = cCharAt;
                                                            codePoint2 = Character.toCodePoint(cCharAt, cCharAt2);
                                                        }
                                                    }
                                                } else if (xg3Var3.a < ((ArrayList) xg3Var3.d).size() - 1) {
                                                    codePoint2 = 10;
                                                } else {
                                                    codePoint2 = i15;
                                                }
                                                if (codePoint != 0) {
                                                    i5 = 1;
                                                } else {
                                                    i5 = 1;
                                                }
                                                if (codePoint != 0) {
                                                    i6 = 1;
                                                } else {
                                                    i6 = 1;
                                                }
                                                if (codePoint2 != 0) {
                                                    i7 = 1;
                                                } else {
                                                    i7 = 1;
                                                }
                                                if (codePoint2 != 0) {
                                                    i8 = 1;
                                                } else {
                                                    i8 = 1;
                                                }
                                                if (i8 == 0) {
                                                    i9 = i15;
                                                } else {
                                                    i9 = i15;
                                                }
                                                if (i6 == 0) {
                                                    i10 = i15;
                                                } else {
                                                    i10 = i15;
                                                }
                                                if (cM == '_') {
                                                    if (i9 != 0) {
                                                        i13 = i15;
                                                    } else {
                                                        i13 = i15;
                                                    }
                                                    if (i10 != 0) {
                                                        r7 = i15;
                                                        r6 = i13;
                                                    } else {
                                                        r7 = i15;
                                                        r6 = i13;
                                                    }
                                                } else {
                                                    if (i9 == 0) {
                                                        i11 = i15;
                                                    } else {
                                                        i11 = i15;
                                                    }
                                                    if (i10 == 0) {
                                                        i12 = i15;
                                                    } else {
                                                        i12 = i15;
                                                    }
                                                    r6 = i11;
                                                    r7 = i12;
                                                }
                                                zw0 zw0Var2 = new zw0();
                                                zw0Var2.c = arrayList;
                                                zw0Var2.b = r6;
                                                zw0Var2.a = r7;
                                                r10 = zw0Var2;
                                            }
                                        }
                                    }
                                    if (r10 == 0) {
                                        objUnmodifiableList = w37Var2;
                                    } else {
                                        ArrayList arrayList10 = (ArrayList) r10.c;
                                        ow3Var = new ow3(arrayList10, cM, r10.b, r10.a, this.Y);
                                        this.Y = ow3Var;
                                        ow3Var2 = ow3Var.f;
                                        if (ow3Var2 != null) {
                                            ow3Var2.g = ow3Var;
                                        }
                                        objUnmodifiableList = arrayList10;
                                    }
                                    if (objUnmodifiableList == null) {
                                        Object[] objArr5 = {f()};
                                        ArrayList arrayList11 = new ArrayList(1);
                                        Object obj9 = objArr5[i15];
                                        Objects.requireNonNull(obj9);
                                        arrayList11.add(obj9);
                                        objUnmodifiableList = Collections.unmodifiableList(arrayList11);
                                    }
                                }
                            }
                        } else {
                            Object[] objArr6 = {f()};
                            ArrayList arrayList12 = new ArrayList(1);
                            Object obj10 = objArr6[i15];
                            Objects.requireNonNull(obj10);
                            arrayList12.add(obj10);
                            objUnmodifiableList = Collections.unmodifiableList(arrayList12);
                        }
                    }
                } else if (this.e.get(cM)) {
                    Object[] objArr7 = {f()};
                    ArrayList arrayList13 = new ArrayList(1);
                    Object obj11 = objArr7[i15];
                    Objects.requireNonNull(obj11);
                    arrayList13.add(obj11);
                    objUnmodifiableList = Collections.unmodifiableList(arrayList13);
                } else {
                    list = (List) this.x.get(Character.valueOf(cM));
                    if (list != null) {
                        unaVarN3 = this.y.n();
                        it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                fz3VarA = ((r37) it2.next()).a(this);
                                if (fz3VarA != null) {
                                    sf9Var4 = (sf9) fz3VarA.b;
                                    this.y.o((una) fz3VarA.c);
                                    if (this.z) {
                                        xg3 xg3Var5 = this.y;
                                        sf9Var4.g(xg3Var5.e(unaVarN3, xg3Var5.n()).f());
                                    }
                                    ArrayList arrayList14 = new ArrayList(1);
                                    Object obj12 = new Object[]{sf9Var4}[i15];
                                    Objects.requireNonNull(obj12);
                                    arrayList14.add(obj12);
                                    objUnmodifiableList = Collections.unmodifiableList(arrayList14);
                                } else {
                                    this.y.o(unaVarN3);
                                }
                            } else {
                                pw3Var = (pw3) this.c.get(Character.valueOf(cM));
                                if (pw3Var == null) {
                                    Object[] objArr8 = {f()};
                                    ArrayList arrayList15 = new ArrayList(1);
                                    Object obj13 = objArr8[i15];
                                    Objects.requireNonNull(obj13);
                                    arrayList15.add(obj13);
                                    objUnmodifiableList = Collections.unmodifiableList(arrayList15);
                                } else {
                                    xg3Var2 = this.y;
                                    i3 = xg3Var2.b;
                                    if (i3 > 0) {
                                        int i110 = i3 - 1;
                                        cCharAt3 = ((std) xg3Var2.e).a.charAt(i110);
                                        if (Character.isLowSurrogate(cCharAt3)) {
                                            cCharAt4 = ((std) xg3Var2.e).a.charAt(i3 - 2);
                                            codePoint = cCharAt3;
                                            if (Character.isHighSurrogate(cCharAt4)) {
                                                codePoint = Character.toCodePoint(cCharAt4, cCharAt3);
                                            }
                                        }
                                    } else if (xg3Var2.a > 0) {
                                        codePoint = 10;
                                    } else {
                                        codePoint = i15;
                                    }
                                    codePoint = cCharAt3;
                                    codePoint = cCharAt3;
                                    unaVarN2 = this.y.n();
                                    if (this.y.h(cM) < pw3Var.c()) {
                                        this.y.o(unaVarN2);
                                        r10 = w37Var2;
                                    } else {
                                        arrayList = new ArrayList();
                                        this.y.o(unaVarN2);
                                        while (true) {
                                            zK = this.y.k(cM);
                                            xg3Var3 = this.y;
                                            if (zK) {
                                                arrayList.add(j(xg3Var3.e(unaVarN2, xg3Var3.n())));
                                                unaVarN2 = this.y.n();
                                            } else {
                                                i4 = xg3Var3.b;
                                                if (i4 < xg3Var3.c) {
                                                    cCharAt = ((std) xg3Var3.e).a.charAt(i4);
                                                    if (Character.isHighSurrogate(cCharAt)) {
                                                        cCharAt2 = ((std) xg3Var3.e).a.charAt(i14);
                                                        if (Character.isLowSurrogate(cCharAt2)) {
                                                            codePoint2 = cCharAt;
                                                            codePoint2 = cCharAt;
                                                            codePoint2 = cCharAt;
                                                            codePoint2 = Character.toCodePoint(cCharAt, cCharAt2);
                                                        }
                                                    }
                                                } else if (xg3Var3.a < ((ArrayList) xg3Var3.d).size() - 1) {
                                                    codePoint2 = 10;
                                                } else {
                                                    codePoint2 = i15;
                                                }
                                                if (codePoint != 0) {
                                                    i5 = 1;
                                                } else {
                                                    i5 = 1;
                                                }
                                                if (codePoint != 0) {
                                                    i6 = 1;
                                                } else {
                                                    i6 = 1;
                                                }
                                                if (codePoint2 != 0) {
                                                    i7 = 1;
                                                } else {
                                                    i7 = 1;
                                                }
                                                if (codePoint2 != 0) {
                                                    i8 = 1;
                                                } else {
                                                    i8 = 1;
                                                }
                                                if (i8 == 0) {
                                                    i9 = i15;
                                                } else {
                                                    i9 = i15;
                                                }
                                                if (i6 == 0) {
                                                    i10 = i15;
                                                } else {
                                                    i10 = i15;
                                                }
                                                if (cM == '_') {
                                                    if (i9 != 0) {
                                                        i13 = i15;
                                                    } else {
                                                        i13 = i15;
                                                    }
                                                    if (i10 != 0) {
                                                        r7 = i15;
                                                        r6 = i13;
                                                    } else {
                                                        r7 = i15;
                                                        r6 = i13;
                                                    }
                                                } else {
                                                    if (i9 == 0) {
                                                        i11 = i15;
                                                    } else {
                                                        i11 = i15;
                                                    }
                                                    if (i10 == 0) {
                                                        i12 = i15;
                                                    } else {
                                                        i12 = i15;
                                                    }
                                                    r6 = i11;
                                                    r7 = i12;
                                                }
                                                zw0 zw0Var3 = new zw0();
                                                zw0Var3.c = arrayList;
                                                zw0Var3.b = r6;
                                                zw0Var3.a = r7;
                                                r10 = zw0Var3;
                                            }
                                        }
                                    }
                                    if (r10 == 0) {
                                        objUnmodifiableList = w37Var2;
                                    } else {
                                        ArrayList arrayList16 = (ArrayList) r10.c;
                                        ow3Var = new ow3(arrayList16, cM, r10.b, r10.a, this.Y);
                                        this.Y = ow3Var;
                                        ow3Var2 = ow3Var.f;
                                        if (ow3Var2 != null) {
                                            ow3Var2.g = ow3Var;
                                        }
                                        objUnmodifiableList = arrayList16;
                                    }
                                    if (objUnmodifiableList == null) {
                                        Object[] objArr9 = {f()};
                                        ArrayList arrayList17 = new ArrayList(1);
                                        Object obj14 = objArr9[i15];
                                        Objects.requireNonNull(obj14);
                                        arrayList17.add(obj14);
                                        objUnmodifiableList = Collections.unmodifiableList(arrayList17);
                                    }
                                }
                            }
                        }
                    } else {
                        pw3Var = (pw3) this.c.get(Character.valueOf(cM));
                        if (pw3Var == null) {
                            Object[] objArr10 = {f()};
                            ArrayList arrayList18 = new ArrayList(1);
                            Object obj15 = objArr10[i15];
                            Objects.requireNonNull(obj15);
                            arrayList18.add(obj15);
                            objUnmodifiableList = Collections.unmodifiableList(arrayList18);
                        } else {
                            xg3Var2 = this.y;
                            i3 = xg3Var2.b;
                            if (i3 > 0) {
                                int i111 = i3 - 1;
                                cCharAt3 = ((std) xg3Var2.e).a.charAt(i111);
                                if (Character.isLowSurrogate(cCharAt3)) {
                                    cCharAt4 = ((std) xg3Var2.e).a.charAt(i3 - 2);
                                    codePoint = cCharAt3;
                                    if (Character.isHighSurrogate(cCharAt4)) {
                                        codePoint = Character.toCodePoint(cCharAt4, cCharAt3);
                                    }
                                }
                            } else if (xg3Var2.a > 0) {
                                codePoint = 10;
                            } else {
                                codePoint = i15;
                            }
                            codePoint = cCharAt3;
                            codePoint = cCharAt3;
                            unaVarN2 = this.y.n();
                            if (this.y.h(cM) < pw3Var.c()) {
                                this.y.o(unaVarN2);
                                r10 = w37Var2;
                            } else {
                                arrayList = new ArrayList();
                                this.y.o(unaVarN2);
                                while (true) {
                                    zK = this.y.k(cM);
                                    xg3Var3 = this.y;
                                    if (zK) {
                                        arrayList.add(j(xg3Var3.e(unaVarN2, xg3Var3.n())));
                                        unaVarN2 = this.y.n();
                                    } else {
                                        i4 = xg3Var3.b;
                                        if (i4 < xg3Var3.c) {
                                            cCharAt = ((std) xg3Var3.e).a.charAt(i4);
                                            if (Character.isHighSurrogate(cCharAt)) {
                                                cCharAt2 = ((std) xg3Var3.e).a.charAt(i14);
                                                if (Character.isLowSurrogate(cCharAt2)) {
                                                    codePoint2 = cCharAt;
                                                    codePoint2 = cCharAt;
                                                    codePoint2 = cCharAt;
                                                    codePoint2 = Character.toCodePoint(cCharAt, cCharAt2);
                                                }
                                            }
                                        } else if (xg3Var3.a < ((ArrayList) xg3Var3.d).size() - 1) {
                                            codePoint2 = 10;
                                        } else {
                                            codePoint2 = i15;
                                        }
                                        if (codePoint != 0) {
                                            i5 = 1;
                                        } else {
                                            i5 = 1;
                                        }
                                        if (codePoint != 0) {
                                            i6 = 1;
                                        } else {
                                            i6 = 1;
                                        }
                                        if (codePoint2 != 0) {
                                            i7 = 1;
                                        } else {
                                            i7 = 1;
                                        }
                                        if (codePoint2 != 0) {
                                            i8 = 1;
                                        } else {
                                            i8 = 1;
                                        }
                                        if (i8 == 0) {
                                            i9 = i15;
                                        } else {
                                            i9 = i15;
                                        }
                                        if (i6 == 0) {
                                            i10 = i15;
                                        } else {
                                            i10 = i15;
                                        }
                                        if (cM == '_') {
                                            if (i9 != 0) {
                                                i13 = i15;
                                            } else {
                                                i13 = i15;
                                            }
                                            if (i10 != 0) {
                                                r7 = i15;
                                                r6 = i13;
                                            } else {
                                                r7 = i15;
                                                r6 = i13;
                                            }
                                        } else {
                                            if (i9 == 0) {
                                                i11 = i15;
                                            } else {
                                                i11 = i15;
                                            }
                                            if (i10 == 0) {
                                                i12 = i15;
                                            } else {
                                                i12 = i15;
                                            }
                                            r6 = i11;
                                            r7 = i12;
                                        }
                                        zw0 zw0Var4 = new zw0();
                                        zw0Var4.c = arrayList;
                                        zw0Var4.b = r6;
                                        zw0Var4.a = r7;
                                        r10 = zw0Var4;
                                    }
                                }
                            }
                            if (r10 == 0) {
                                objUnmodifiableList = w37Var2;
                            } else {
                                ArrayList arrayList19 = (ArrayList) r10.c;
                                ow3Var = new ow3(arrayList19, cM, r10.b, r10.a, this.Y);
                                this.Y = ow3Var;
                                ow3Var2 = ow3Var.f;
                                if (ow3Var2 != null) {
                                    ow3Var2.g = ow3Var;
                                }
                                objUnmodifiableList = arrayList19;
                            }
                            if (objUnmodifiableList == null) {
                                Object[] objArr11 = {f()};
                                ArrayList arrayList110 = new ArrayList(1);
                                Object obj16 = objArr11[i15];
                                Objects.requireNonNull(obj16);
                                arrayList110.add(obj16);
                                objUnmodifiableList = Collections.unmodifiableList(arrayList110);
                            }
                        }
                    }
                }
                i = i15;
                UnmodifiableList = objUnmodifiableList;
            } else {
                una unaVarN10 = this.y.n();
                this.y.j();
                una unaVarN11 = this.y.n();
                f31 f31Var7 = this.Z;
                if (f31Var7 == null) {
                    sf9VarJ = j(this.y.e(unaVarN10, unaVarN11));
                } else {
                    ime imeVar2 = f31Var7.a;
                    una unaVar2 = f31Var7.e;
                    if (f31Var7.h) {
                        una unaVarN12 = this.y.n();
                        xg3 xg3Var6 = this.y;
                        if (xg3Var6.k('(')) {
                            xg3Var6.p();
                            char cM2 = xg3Var6.m();
                            una unaVarN13 = xg3Var6.n();
                            if (cgg.L(xg3Var6)) {
                                if (cM2 == '<') {
                                    String strE2 = xg3Var6.e(unaVarN13, xg3Var6.n()).e();
                                    strE = strE2.substring(1, strE2.length() - 1);
                                } else {
                                    strE = xg3Var6.e(unaVarN13, xg3Var6.n()).e();
                                }
                                strB = uy4.b(strE);
                            } else {
                                strB = null;
                            }
                            if (strB != null) {
                                if (xg3Var6.p() >= 1) {
                                    una unaVarN14 = xg3Var6.n();
                                    if (xg3Var6.f()) {
                                        char cM3 = xg3Var6.m();
                                        char c = '\"';
                                        if (cM3 != '\"') {
                                            c = '\'';
                                            if (cM3 == '\'') {
                                                xg3Var6.j();
                                                if (!cgg.N(xg3Var6, c) && xg3Var6.f()) {
                                                    xg3Var6.j();
                                                    String strE3 = xg3Var6.e(unaVarN14, xg3Var6.n()).e();
                                                    strB2 = uy4.b(strE3.substring(1, strE3.length() - 1));
                                                } else {
                                                    strB2 = null;
                                                }
                                            } else if (cM3 != '(') {
                                                strB2 = null;
                                            } else {
                                                c = ')';
                                                xg3Var6.j();
                                                if (cgg.N(xg3Var6, c)) {
                                                    strB2 = null;
                                                } else {
                                                    xg3Var6.j();
                                                    String strE4 = xg3Var6.e(unaVarN14, xg3Var6.n()).e();
                                                    strB2 = uy4.b(strE4.substring(1, strE4.length() - 1));
                                                }
                                            }
                                        } else {
                                            xg3Var6.j();
                                            if (cgg.N(xg3Var6, c)) {
                                                strB2 = null;
                                            } else {
                                                xg3Var6.j();
                                                String strE5 = xg3Var6.e(unaVarN14, xg3Var6.n()).e();
                                                strB2 = uy4.b(strE5.substring(1, strE5.length() - 1));
                                            }
                                        }
                                    } else {
                                        strB2 = null;
                                    }
                                    xg3Var6.p();
                                } else {
                                    strB2 = null;
                                }
                                if (xg3Var6.k(')')) {
                                    w37Var = new w37(strB, strB2);
                                } else {
                                    w37Var = null;
                                }
                            } else {
                                w37Var = null;
                            }
                        } else {
                            w37Var = w37Var2;
                        }
                        xg3 xg3Var7 = this.y;
                        if (w37Var != null) {
                            a82Var = new a82(f31Var7.a, xg3Var7.e(unaVar2, unaVarN10).e(), (Object) null, w37Var.b, w37Var.c, 14);
                        } else {
                            xg3Var7.o(unaVarN12);
                            xg3 xg3Var8 = this.y;
                            if (xg3Var8.k('[')) {
                                una unaVarN15 = xg3Var8.n();
                                if (cgg.M(xg3Var8)) {
                                    una unaVarN16 = xg3Var8.n();
                                    if (xg3Var8.k(']')) {
                                        String strE6 = xg3Var8.e(unaVarN15, unaVarN16).e();
                                        if (strE6.length() > 999) {
                                            str = null;
                                        } else {
                                            str = strE6;
                                        }
                                    } else {
                                        str = null;
                                    }
                                } else {
                                    str = null;
                                }
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                this.y.o(unaVarN12);
                            }
                            boolean z3 = str == null || str.isEmpty();
                            if (f31Var7.i && z3 && imeVar2 == null) {
                                a82Var2 = null;
                            } else {
                                a82Var = new a82(f31Var7.a, this.y.e(unaVar2, unaVarN10).e(), str, (Object) null, (Object) null, 14);
                            }
                            imeVar = f31Var7.c;
                            if (a82Var2 == null) {
                                sf9Var2 = null;
                            } else {
                                unaVarN = this.y.n();
                                it = this.d.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        iu2 iu2Var = (iu2) it.next();
                                        xg3Var = this.y;
                                        iu2Var.getClass();
                                        str2 = (String) a82Var2.e;
                                        if (str2 != null) {
                                            eghVarA = iu2.a(a82Var2, xg3Var, str2, (String) a82Var2.f);
                                        } else {
                                            str3 = (String) a82Var2.b;
                                            if (str3 != null || str3.isEmpty()) {
                                                str3 = (String) a82Var2.d;
                                            }
                                            mv3Var = (mv3) ((HashMap) ((kd9) this.a.g).b).get(o68.class);
                                            if (mv3Var == null) {
                                                obj = null;
                                            } else {
                                                obj = mv3Var.a.get(uy4.a(str3));
                                            }
                                            o68Var = (o68) obj;
                                            if (o68Var != null) {
                                                eghVarA = iu2.a(a82Var2, xg3Var, o68Var.h, o68Var.i);
                                            } else {
                                                eghVarA = null;
                                            }
                                        }
                                        if (eghVarA == null) {
                                            this.y.o(unaVarN);
                                        } else {
                                            sf9Var2 = (sf9) eghVarA.c;
                                            una unaVar3 = (una) eghVarA.d;
                                            z = eghVarA.b;
                                            this.y.o(unaVar3);
                                            z2 = this.v;
                                            if (z2 || f31Var7.j < this.g) {
                                                sf9Var3 = imeVar.e;
                                                while (sf9Var3 != null) {
                                                    sf9 sf9Var5 = sf9Var3.e;
                                                    sf9Var2.c(sf9Var3);
                                                    sf9Var3 = sf9Var5;
                                                }
                                                if (this.z) {
                                                    if (z || (unaVar = f31Var7.b) == null) {
                                                        unaVar = f31Var7.d;
                                                    }
                                                    xg3 xg3Var9 = this.y;
                                                    sf9Var2.g(xg3Var9.e(unaVar, xg3Var9.n()).f());
                                                }
                                                g(f31Var7.g);
                                                d(sf9Var2);
                                                if (z && imeVar2 != null) {
                                                    imeVar2.i();
                                                }
                                                imeVar.i();
                                                i();
                                                i2 = f31Var7.j + 1;
                                                if (z2) {
                                                    identityHashMap.put(sf9Var2, Integer.valueOf(i2));
                                                    f31Var2 = this.Z;
                                                    if (f31Var2 != null && i2 > f31Var2.j) {
                                                        f31Var2.j = i2;
                                                    }
                                                }
                                                if (imeVar2 == null) {
                                                    for (f31Var = this.Z; f31Var != null; f31Var = f31Var.f) {
                                                        if (f31Var.a == null) {
                                                            f31Var.h = false;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    sf9Var2 = null;
                                }
                            }
                            if (sf9Var2 != null) {
                                sf9VarJ = sf9Var2;
                            } else {
                                this.y.o(unaVarN11);
                                i();
                                sf9VarJ = j(this.y.e(unaVarN10, unaVarN11));
                            }
                        }
                        a82Var2 = a82Var;
                        imeVar = f31Var7.c;
                        if (a82Var2 == null) {
                            sf9Var2 = null;
                        } else {
                            unaVarN = this.y.n();
                            it = this.d.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    iu2 iu2Var2 = (iu2) it.next();
                                    xg3Var = this.y;
                                    iu2Var2.getClass();
                                    str2 = (String) a82Var2.e;
                                    if (str2 != null) {
                                        eghVarA = iu2.a(a82Var2, xg3Var, str2, (String) a82Var2.f);
                                    } else {
                                        str3 = (String) a82Var2.b;
                                        if (str3 != null) {
                                            str3 = (String) a82Var2.d;
                                        } else {
                                            str3 = (String) a82Var2.d;
                                        }
                                        mv3Var = (mv3) ((HashMap) ((kd9) this.a.g).b).get(o68.class);
                                        if (mv3Var == null) {
                                            obj = null;
                                        } else {
                                            obj = mv3Var.a.get(uy4.a(str3));
                                        }
                                        o68Var = (o68) obj;
                                        if (o68Var != null) {
                                            eghVarA = iu2.a(a82Var2, xg3Var, o68Var.h, o68Var.i);
                                        } else {
                                            eghVarA = null;
                                        }
                                    }
                                    if (eghVarA == null) {
                                        this.y.o(unaVarN);
                                    } else {
                                        sf9Var2 = (sf9) eghVarA.c;
                                        una unaVar4 = (una) eghVarA.d;
                                        z = eghVarA.b;
                                        this.y.o(unaVar4);
                                        z2 = this.v;
                                        if (z2) {
                                        }
                                        sf9Var3 = imeVar.e;
                                        while (sf9Var3 != null) {
                                            sf9 sf9Var6 = sf9Var3.e;
                                            sf9Var2.c(sf9Var3);
                                            sf9Var3 = sf9Var6;
                                        }
                                        if (this.z) {
                                            if (z) {
                                                unaVar = f31Var7.d;
                                            } else {
                                                unaVar = f31Var7.d;
                                            }
                                            xg3 xg3Var10 = this.y;
                                            sf9Var2.g(xg3Var10.e(unaVar, xg3Var10.n()).f());
                                        }
                                        g(f31Var7.g);
                                        d(sf9Var2);
                                        if (z) {
                                            imeVar2.i();
                                        }
                                        imeVar.i();
                                        i();
                                        i2 = f31Var7.j + 1;
                                        if (z2) {
                                            identityHashMap.put(sf9Var2, Integer.valueOf(i2));
                                            f31Var2 = this.Z;
                                            if (f31Var2 != null) {
                                                f31Var2.j = i2;
                                            }
                                        }
                                        if (imeVar2 == null) {
                                            while (f31Var != null) {
                                                if (f31Var.a == null) {
                                                    f31Var.h = false;
                                                }
                                            }
                                        }
                                    }
                                }
                                sf9Var2 = null;
                            }
                        }
                        if (sf9Var2 != null) {
                            sf9VarJ = sf9Var2;
                        } else {
                            this.y.o(unaVarN11);
                            i();
                            sf9VarJ = j(this.y.e(unaVarN10, unaVarN11));
                        }
                    } else {
                        i();
                        sf9VarJ = j(this.y.e(unaVarN10, unaVarN11));
                    }
                }
                ArrayList arrayList20 = new ArrayList(1);
                Object obj17 = new Object[]{sf9VarJ}[0];
                Objects.requireNonNull(obj17);
                arrayList20.add(obj17);
                i = 0;
                UnmodifiableList = Collections.unmodifiableList(arrayList20);
            }
            if (UnmodifiableList == 0) {
                g(null);
                d(sf9Var);
                return;
            } else {
                Iterator it4 = UnmodifiableList.iterator();
                while (it4.hasNext()) {
                    sf9Var.c((sf9) it4.next());
                }
                w37Var2 = null;
                i15 = i;
            }
        }
    }

    public final void d(sf9 sf9Var) {
        if (sf9Var.b == null) {
            return;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addLast(sf9Var);
        while (!arrayDeque.isEmpty()) {
            sf9 sf9Var2 = (sf9) arrayDeque.removeLast();
            sf9 sf9Var3 = sf9Var2.c;
            ime imeVar = null;
            ime imeVar2 = null;
            int length = 0;
            for (sf9 sf9Var4 = sf9Var2.b; sf9Var4 != null; sf9Var4 = sf9Var4.e) {
                if (sf9Var4 instanceof ime) {
                    imeVar2 = (ime) sf9Var4;
                    if (imeVar == null) {
                        imeVar = imeVar2;
                    }
                    length = imeVar2.g.length() + length;
                } else {
                    e(imeVar, imeVar2, length);
                    if (sf9Var4.b != null) {
                        arrayDeque.addLast(sf9Var4);
                    }
                    imeVar = null;
                    imeVar2 = null;
                    length = 0;
                }
                if (sf9Var4 == sf9Var3) {
                    break;
                }
            }
            e(imeVar, imeVar2, length);
        }
    }

    public final void e(ime imeVar, ime imeVar2, int i) {
        qi6 qi6Var;
        if (imeVar == null || imeVar2 == null || imeVar == imeVar2) {
            return;
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(imeVar.g);
        if (this.z) {
            qi6Var = new qi6();
            qi6Var.b(imeVar.d());
        } else {
            qi6Var = null;
        }
        sf9 sf9Var = imeVar.e;
        sf9 sf9Var2 = imeVar2.e;
        while (sf9Var != sf9Var2) {
            sb.append(((ime) sf9Var).g);
            if (qi6Var != null) {
                qi6Var.b(sf9Var.d());
            }
            sf9 sf9Var3 = sf9Var.e;
            sf9Var.i();
            sf9Var = sf9Var3;
        }
        imeVar.g = sb.toString();
        if (qi6Var != null) {
            List list = qi6Var.a;
            if (list == null) {
                list = Collections.EMPTY_LIST;
            }
            imeVar.g(list);
        }
    }

    public final ime f() {
        char cM;
        una unaVarN = this.y.n();
        this.y.j();
        while (true) {
            cM = this.y.m();
            if (cM == 0 || this.e.get(cM)) {
                break;
            }
            this.y.j();
        }
        xg3 xg3Var = this.y;
        mx mxVarE = xg3Var.e(unaVarN, xg3Var.n());
        String strE = mxVarE.e();
        if (cM == '\n') {
            int length = strE.length() - 1;
            while (true) {
                if (length < 0) {
                    length = -1;
                    break;
                }
                if (strE.charAt(length) != ' ') {
                    break;
                }
                length--;
            }
            int i = length + 1;
            this.X = strE.length() - i;
            strE = strE.substring(0, i);
        } else if (cM == 0) {
            strE = strE.substring(0, vfh.P(strE, strE.length() - 1, 0) + 1);
        }
        ime imeVar = new ime(strE);
        imeVar.g(mxVarE.f());
        return imeVar;
    }

    public final void g(ow3 ow3Var) {
        IdentityHashMap identityHashMap;
        boolean z;
        boolean z2;
        sf9 sf9Var;
        boolean z3;
        int i;
        HashMap map = new HashMap();
        ow3 ow3Var2 = this.Y;
        while (ow3Var2 != null) {
            ow3 ow3Var3 = ow3Var2.f;
            if (ow3Var3 == ow3Var) {
                break;
            } else {
                ow3Var2 = ow3Var3;
            }
        }
        while (ow3Var2 != null) {
            ArrayList arrayList = ow3Var2.a;
            boolean z4 = ow3Var2.d;
            char c = ow3Var2.b;
            pw3 pw3Var = (pw3) this.c.get(Character.valueOf(c));
            if (!ow3Var2.e || pw3Var == null) {
                ow3Var2 = ow3Var2.g;
            } else {
                int i2 = ow3Var2.c % 3;
                int i3 = z4 ? 3 : 0;
                v37 v37Var = new v37();
                v37Var.a = c;
                v37Var.b = i2 + i3;
                ow3 ow3Var4 = (ow3) map.get(v37Var);
                char cD = pw3Var.d();
                ow3 ow3Var5 = ow3Var2.f;
                ime imeVar = (ime) arrayList.get(0);
                int iMax = 0;
                int iA = 0;
                while (true) {
                    identityHashMap = this.w;
                    boolean z5 = this.v;
                    if (ow3Var5 == null || ow3Var5 == ow3Var || ow3Var5 == ow3Var4) {
                        z = z4;
                        z2 = z5;
                        sf9Var = null;
                        z3 = false;
                        i = 0;
                        break;
                    }
                    z = z4;
                    if (z5) {
                        sf9 sf9Var2 = ow3Var5.b().e;
                        int iIntValue = 0;
                        while (sf9Var2 != null && sf9Var2 != imeVar) {
                            Integer num = (Integer) identityHashMap.get(sf9Var2);
                            boolean z6 = z5;
                            if (num != null && num.intValue() > iIntValue) {
                                iIntValue = num.intValue();
                            }
                            sf9Var2 = sf9Var2.e;
                            z5 = z6;
                        }
                        z2 = z5;
                        iMax = Math.max(iMax, iIntValue);
                        ime imeVarB = ow3Var5.b();
                        if (iMax >= this.g) {
                            sf9Var = null;
                            z3 = false;
                            i = 0;
                            break;
                        }
                        imeVar = imeVarB;
                    } else {
                        z2 = z5;
                    }
                    if (ow3Var5.d && ow3Var5.b == cD && (iA = pw3Var.a(ow3Var5, ow3Var2)) > 0) {
                        i = iMax + 1;
                        sf9Var = ow3Var5.b().e;
                        z3 = true;
                        break;
                    } else {
                        ow3Var5 = ow3Var5.f;
                        z4 = z;
                        ow3Var4 = ow3Var4;
                    }
                }
                if (z3) {
                    for (int i4 = 0; i4 < iA; i4++) {
                        ArrayList arrayList2 = ow3Var5.a;
                        ((ime) arrayList2.remove(arrayList2.size() - 1)).i();
                    }
                    for (int i5 = 0; i5 < iA; i5++) {
                        ((ime) arrayList.remove(0)).i();
                    }
                    ow3 ow3Var6 = ow3Var2.f;
                    while (ow3Var6 != null && ow3Var6 != ow3Var5) {
                        ow3 ow3Var7 = ow3Var6.f;
                        h(ow3Var6);
                        ow3Var6 = ow3Var7;
                    }
                    if (sf9Var != null && z2) {
                        identityHashMap.put(sf9Var, Integer.valueOf(i));
                        f31 f31Var = this.Z;
                        if (f31Var != null && i > f31Var.j) {
                            f31Var.j = i;
                        }
                    }
                    if (ow3Var5.a.size() == 0) {
                        h(ow3Var5);
                    }
                    if (arrayList.size() == 0) {
                        ow3 ow3Var8 = ow3Var2.g;
                        h(ow3Var2);
                        ow3Var2 = ow3Var8;
                    }
                } else {
                    map.put(v37Var, ow3Var2.f);
                    if (!z) {
                        h(ow3Var2);
                    }
                    ow3Var2 = ow3Var2.g;
                }
            }
        }
        while (true) {
            ow3 ow3Var9 = this.Y;
            if (ow3Var9 == null || ow3Var9 == ow3Var) {
                return;
            } else {
                h(ow3Var9);
            }
        }
    }

    public final void h(ow3 ow3Var) {
        ow3 ow3Var2 = ow3Var.f;
        if (ow3Var2 != null) {
            ow3Var2.g = ow3Var.g;
        }
        ow3 ow3Var3 = ow3Var.g;
        if (ow3Var3 == null) {
            this.Y = ow3Var2;
        } else {
            ow3Var3.f = ow3Var2;
        }
    }

    public final void i() {
        int i;
        f31 f31Var = this.Z;
        f31 f31Var2 = f31Var.f;
        this.Z = f31Var2;
        if (f31Var2 == null || (i = f31Var.j) <= f31Var2.j) {
            return;
        }
        f31Var2.j = i;
    }
}
