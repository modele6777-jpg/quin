package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hg4 {
    public static final LinkedHashSet w;
    public static final Map x;
    public std a;
    public boolean e;
    public boolean i;
    public final ArrayList j;
    public final u37 k;
    public final ArrayList l;
    public final ArrayList m;
    public final ArrayList n;
    public final HashSet o;
    public final int p;
    public final int q;
    public final int r;
    public final cg4 s;
    public final ArrayList u;
    public final ArrayList v;
    public int b = -1;
    public int c = 0;
    public int d = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;
    public final kd9 t = new kd9(9);

    static {
        Object[] objArr = {e01.class, ti6.class, lc5.class, kr6.class, bve.class, y68.class, i17.class};
        ArrayList arrayList = new ArrayList(7);
        for (int i = 0; i < 7; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        w = new LinkedHashSet(Collections.unmodifiableList(arrayList));
        HashMap map = new HashMap();
        map.put(e01.class, new i01(0));
        map.put(ti6.class, new i01(2));
        map.put(lc5.class, new i01(1));
        map.put(kr6.class, new i01(3));
        map.put(bve.class, new i01(7));
        map.put(y68.class, new i01(5));
        map.put(i17.class, new i01(4));
        x = Collections.unmodifiableMap(map);
    }

    public hg4(ArrayList arrayList, u37 u37Var, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, HashSet hashSet, int i) {
        ArrayList arrayList5 = new ArrayList();
        this.u = arrayList5;
        this.v = new ArrayList();
        this.j = arrayList;
        this.k = u37Var;
        this.l = arrayList2;
        this.m = arrayList3;
        this.n = arrayList4;
        this.o = hashSet;
        this.p = i;
        this.q = 100;
        this.r = 100;
        cg4 cg4Var = new cg4(0);
        this.s = cg4Var;
        arrayList5.add(new gg4(cg4Var, 0));
    }

    public final void a(gg4 gg4Var) {
        b0 b0Var = gg4Var.a;
        while (!g().c(b0Var.f())) {
            e(1);
        }
        g().f().c(b0Var.f());
        this.u.add(gg4Var);
    }

    public final void b() {
        CharSequence charSequenceSubSequence;
        int i;
        vtd vtdVar;
        int i2;
        boolean z = this.e;
        int i3 = this.c;
        std stdVar = this.a;
        if (z) {
            CharSequence charSequence = stdVar.a;
            CharSequence charSequenceSubSequence2 = charSequence.subSequence(i3 + 1, charSequence.length());
            int i4 = 4 - (this.d % 4);
            StringBuilder sb = new StringBuilder(charSequenceSubSequence2.length() + i4);
            for (int i5 = 0; i5 < i4; i5++) {
                sb.append(' ');
            }
            sb.append(charSequenceSubSequence2);
            charSequenceSubSequence = sb.toString();
        } else if (i3 == 0) {
            charSequenceSubSequence = stdVar.a;
        } else {
            CharSequence charSequence2 = stdVar.a;
            charSequenceSubSequence = charSequence2.subSequence(i3, charSequence2.length());
        }
        g().a(new std(charSequenceSubSequence, (this.p != 3 || (i = this.c) >= (i2 = (vtdVar = this.a.b).d)) ? null : vtdVar.a(i, i2)));
        c();
    }

    public final void c() {
        int i = 1;
        if (this.p == 1) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.u;
            if (i >= arrayList.size()) {
                return;
            }
            gg4 gg4Var = (gg4) arrayList.get(i);
            int iMin = Math.min(gg4Var.b, this.c);
            if (this.a.a.length() - iMin != 0) {
                b0 b0Var = gg4Var.a;
                vtd vtdVar = this.a.b;
                b0Var.b(vtdVar.a(iMin, vtdVar.d));
            }
            i++;
        }
    }

    public final void d() {
        char cCharAt = this.a.a.charAt(this.c);
        this.c++;
        int i = this.d;
        if (cCharAt == '\t') {
            this.d = (4 - (i % 4)) + i;
        } else {
            this.d = i + 1;
        }
    }

    public final void e(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList = this.u;
            b0 b0Var = ((gg4) arrayList.remove(arrayList.size() - 1)).a;
            for (mv3 mv3Var : b0Var.g()) {
                kd9 kd9Var = this.t;
                kd9Var.getClass();
                HashMap map = (HashMap) kd9Var.b;
                mv3Var.getClass();
                mv3 mv3Var2 = (mv3) map.get(o68.class);
                if (mv3Var2 == null) {
                    map.put(o68.class, mv3Var);
                } else {
                    for (Map.Entry entry : mv3Var.a.entrySet()) {
                        mv3Var2.a.putIfAbsent((String) entry.getKey(), entry.getValue());
                    }
                }
            }
            b0Var.e();
            this.v.add(b0Var);
        }
    }

    public final void f() {
        int i = this.c;
        int i2 = this.d;
        this.i = true;
        int length = this.a.a.length();
        while (i < length) {
            char cCharAt = this.a.a.charAt(i);
            if (cCharAt == '\t') {
                i++;
                i2 += 4 - (i2 % 4);
            } else if (cCharAt != ' ') {
                this.i = false;
                break;
            } else {
                i++;
                i2++;
            }
        }
        this.f = i;
        this.g = i2;
        this.h = i2 - this.d;
    }

    public final b0 g() {
        return ((gg4) ks0.f(1, this.u)).a;
    }

    /* JADX WARN: Code duplicated, block: B:149:0x029e A[PHI: r23
  0x029e: PHI (r23v10 b0) = 
  (r23v4 b0)
  (r23v4 b0)
  (r23v5 b0)
  (r23v5 b0)
  (r23v5 b0)
  (r23v5 b0)
  (r23v6 b0)
  (r23v6 b0)
  (r23v6 b0)
  (r23v7 b0)
  (r23v7 b0)
  (r23v7 b0)
  (r23v9 b0)
  (r23v9 b0)
  (r23v11 b0)
  (r23v13 b0)
  (r23v13 b0)
  (r23v13 b0)
 binds: [B:342:0x0641, B:364:0x0690, B:263:0x04ca, B:334:0x0606, B:336:0x0612, B:340:0x0635, B:246:0x0469, B:248:0x0471, B:486:0x029e, B:239:0x0431, B:241:0x0435, B:243:0x0441, B:151:0x02aa, B:218:0x03ba, B:148:0x029c, B:142:0x0266, B:144:0x026c, B:146:0x0281] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:193:0x0366  */
    /* JADX WARN: Code duplicated, block: B:323:0x05de  */
    /* JADX WARN: Code duplicated, block: B:332:0x0603  */
    /* JADX WARN: Code duplicated, block: B:333:0x0605  */
    /* JADX WARN: Code duplicated, block: B:359:0x067d  */
    /* JADX WARN: Code duplicated, block: B:398:0x072f  */
    /* JADX WARN: Failed to find 'out' block for switch in B:166:0x02e9. Please report as an issue. */
    public final void h(int i, String str) {
        ArrayList arrayList;
        b0 b0Var;
        int i2;
        k01 k01Var;
        char cCharAt;
        int i3;
        mc5 mc5Var;
        k01 k01Var2;
        int i4;
        char c;
        ui6 ui6Var;
        char c2;
        char c3;
        boolean z;
        int i5;
        z68 z68Var;
        char cCharAt2;
        boolean z2;
        z68 z68Var2;
        int i6;
        char cCharAt3;
        int i7;
        boolean z3;
        boolean z4;
        int i8;
        int i9;
        int i10;
        List listUnmodifiableList;
        String strReplace = str;
        this.b++;
        int i11 = 0;
        this.c = 0;
        this.d = 0;
        this.e = false;
        if (strReplace.indexOf(0) != -1) {
            strReplace = strReplace.replace((char) 0, (char) 65533);
        }
        this.a = new std(strReplace, this.p != 1 ? new vtd(this.b, 0, i, strReplace.length()) : null);
        int i12 = 1;
        int i13 = 1;
        while (true) {
            arrayList = this.u;
            if (i12 >= arrayList.size()) {
                break;
            }
            gg4 gg4Var = (gg4) arrayList.get(i12);
            b0 b0Var2 = gg4Var.a;
            f();
            c72 c72VarJ = b0Var2.j(this);
            if (c72VarJ == null) {
                break;
            }
            gg4Var.b = this.c;
            if (c72VarJ.c) {
                c();
                e(arrayList.size() - i12);
                return;
            }
            int i14 = c72VarJ.a;
            if (i14 != -1) {
                j(i14);
            } else {
                int i15 = c72VarJ.b;
                if (i15 != -1) {
                    i(i15);
                }
            }
            i13++;
            i12++;
        }
        int size = arrayList.size() - i13;
        b0 b0Var3 = ((gg4) arrayList.get(i13 - 1)).a;
        int i16 = this.c;
        boolean zH = (b0Var3.f() instanceof ny9) || b0Var3.h();
        boolean z5 = false;
        while (true) {
            if (zH) {
                i16 = this.c;
                f();
                if (!this.i) {
                    int i17 = 4;
                    if (this.h >= 4 || !Character.isLetter(Character.codePointAt(this.a.a, this.f))) {
                        if (arrayList.size() > this.q) {
                            b0Var = b0Var3;
                            k01Var = null;
                        } else {
                            m6c m6cVar = new m6c(15, b0Var3);
                            Iterator it = this.j.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    char c4 = '*';
                                    char c5 = ' ';
                                    int i18 = i11;
                                    char c6 = '\t';
                                    switch (((i01) it.next()).a) {
                                        case 0:
                                            b0Var = b0Var3;
                                            int i19 = this.f;
                                            CharSequence charSequence = this.a.a;
                                            i2 = 4;
                                            if (this.h >= 4 || i19 >= charSequence.length() || charSequence.charAt(i19) != '>') {
                                                k01Var = null;
                                            } else {
                                                int i20 = this.d + this.h;
                                                int i21 = i20 + 1;
                                                CharSequence charSequence2 = this.a.a;
                                                int i22 = i19 + 1;
                                                if (i22 < charSequence2.length() && ((cCharAt = charSequence2.charAt(i22)) == '\t' || cCharAt == ' ')) {
                                                    i21 = i20 + 2;
                                                }
                                                k01Var = new k01(new j01());
                                                k01Var.b = i21;
                                            }
                                            break;
                                        case 1:
                                            b0Var = b0Var3;
                                            int i23 = this.h;
                                            if (i23 < 4) {
                                                int i24 = this.f;
                                                CharSequence charSequence3 = this.a.a;
                                                int length = charSequence3.length();
                                                int i25 = i24;
                                                int i26 = 0;
                                                int i27 = 0;
                                                while (true) {
                                                    i3 = i24;
                                                    if (i25 < length) {
                                                        char cCharAt4 = charSequence3.charAt(i25);
                                                        if (cCharAt4 == '`') {
                                                            i26++;
                                                        } else if (cCharAt4 == '~') {
                                                            i27++;
                                                        }
                                                        i25++;
                                                        i24 = i3;
                                                    }
                                                }
                                                if (i26 < 3 || i27 != 0) {
                                                    if (i27 < 3 || i26 != 0) {
                                                        mc5Var = null;
                                                    } else {
                                                        mc5Var = new mc5(i27, i23, '~');
                                                    }
                                                } else if (vfh.s('`', charSequence3, i3 + i26) != -1) {
                                                    mc5Var = null;
                                                } else {
                                                    mc5Var = new mc5(i26, i23, '`');
                                                }
                                                if (mc5Var != null) {
                                                    k01Var2 = new k01(mc5Var);
                                                    k01Var2.a = mc5Var.a.h.intValue() + i3;
                                                    k01Var = k01Var2;
                                                }
                                                i2 = 4;
                                            }
                                            k01Var = null;
                                            i2 = 4;
                                            break;
                                        case 2:
                                            b0Var = b0Var3;
                                            if (this.h >= 4) {
                                                k01Var = null;
                                            } else {
                                                std stdVar = this.a;
                                                int i28 = this.f;
                                                CharSequence charSequence4 = stdVar.a;
                                                if (charSequence4.charAt(i28) == '#') {
                                                    std stdVarA = stdVar.a(i28, charSequence4.length());
                                                    ArrayList arrayList2 = new ArrayList();
                                                    arrayList2.add(stdVarA);
                                                    xg3 xg3Var = new xg3(arrayList2);
                                                    int iH = xg3Var.h('#');
                                                    if (iH == 0 || iH > 6) {
                                                        c = 0;
                                                        ui6Var = null;
                                                    } else {
                                                        if (xg3Var.f()) {
                                                            char cM = xg3Var.m();
                                                            if (cM != ' ') {
                                                                c2 = '\t';
                                                                if (cM != '\t') {
                                                                    ui6Var = null;
                                                                }
                                                            } else {
                                                                c2 = '\t';
                                                            }
                                                            xg3Var.p();
                                                            una unaVarN = xg3Var.n();
                                                            una unaVarN2 = unaVarN;
                                                            boolean z6 = true;
                                                            while (xg3Var.f()) {
                                                                char cM2 = xg3Var.m();
                                                                if (cM2 == c2 || cM2 == ' ') {
                                                                    c3 = '#';
                                                                    xg3Var.j();
                                                                    z6 = true;
                                                                } else {
                                                                    c3 = '#';
                                                                    if (cM2 != '#') {
                                                                        xg3Var.j();
                                                                        unaVarN2 = xg3Var.n();
                                                                        z6 = false;
                                                                    } else if (z6) {
                                                                        xg3Var.h('#');
                                                                        int iP = xg3Var.p();
                                                                        if (xg3Var.f()) {
                                                                            unaVarN2 = xg3Var.n();
                                                                        }
                                                                        z6 = iP > 0;
                                                                    } else {
                                                                        xg3Var.j();
                                                                        unaVarN2 = xg3Var.n();
                                                                    }
                                                                }
                                                                c2 = '\t';
                                                            }
                                                            mx mxVarE = xg3Var.e(unaVarN, unaVarN2);
                                                            if (mxVarE.e().isEmpty()) {
                                                                c = 0;
                                                                ui6Var = new ui6(iH, new mx(3, false));
                                                            } else {
                                                                c = 0;
                                                                ui6Var = new ui6(iH, mxVarE);
                                                            }
                                                        } else {
                                                            ui6Var = new ui6(iH, new mx(3, false));
                                                        }
                                                        c = 0;
                                                    }
                                                    if (ui6Var != null) {
                                                        b0[] b0VarArr = new b0[1];
                                                        b0VarArr[c] = ui6Var;
                                                        k01Var = new k01(b0VarArr);
                                                        k01Var.a = charSequence4.length();
                                                    }
                                                }
                                                char cCharAt5 = charSequence4.charAt(i28);
                                                if (cCharAt5 == '-') {
                                                    int length2 = charSequence4.length();
                                                    for (int i29 = i28 + 1; i29 < length2; i29++) {
                                                        if (charSequence4.charAt(i29) != '-') {
                                                            length2 = i29;
                                                            if (vfh.O(charSequence4, length2, charSequence4.length()) >= charSequence4.length()) {
                                                                i4 = 2;
                                                            } else {
                                                                i4 = 0;
                                                            }
                                                        }
                                                    }
                                                    if (vfh.O(charSequence4, length2, charSequence4.length()) >= charSequence4.length()) {
                                                        i4 = 2;
                                                    } else {
                                                        i4 = 0;
                                                    }
                                                } else if (cCharAt5 != '=') {
                                                    i4 = 0;
                                                } else {
                                                    int length3 = charSequence4.length();
                                                    for (int i30 = i28 + 1; i30 < length3; i30++) {
                                                        if (charSequence4.charAt(i30) != '=') {
                                                            length3 = i30;
                                                            if (vfh.O(charSequence4, length3, charSequence4.length()) >= charSequence4.length()) {
                                                                i4 = 1;
                                                            } else {
                                                                i4 = 0;
                                                            }
                                                        }
                                                    }
                                                    if (vfh.O(charSequence4, length3, charSequence4.length()) >= charSequence4.length()) {
                                                        i4 = 1;
                                                    } else {
                                                        i4 = 0;
                                                    }
                                                }
                                                if (i4 > 0) {
                                                    mx mxVarD = m6cVar.D();
                                                    ArrayList arrayList3 = mxVarD.a;
                                                    if (!arrayList3.isEmpty()) {
                                                        k01Var2 = new k01(new ui6(i4, mxVarD));
                                                        k01Var2.a = charSequence4.length();
                                                        int size2 = arrayList3.size();
                                                        if (size2 >= 1) {
                                                            k01Var2.c = size2;
                                                            k01Var = k01Var2;
                                                        } else {
                                                            qc0.j("Lines must be >= 1");
                                                        }
                                                    }
                                                }
                                                k01Var = null;
                                            }
                                            i2 = 4;
                                            break;
                                        case 3:
                                            b0Var = b0Var3;
                                            int i31 = this.f;
                                            CharSequence charSequence5 = this.a.a;
                                            if (this.h >= 4 || charSequence5.charAt(i31) != '<') {
                                                k01Var = null;
                                            } else {
                                                int i32 = 1;
                                                while (true) {
                                                    if (i32 <= 7) {
                                                        if (i32 != 7 || (!(((b0) m6cVar.b).f() instanceof ny9) && !g().d())) {
                                                            Pattern[] patternArr = lr6.e[i32];
                                                            Pattern pattern = patternArr[0];
                                                            Pattern pattern2 = patternArr[1];
                                                            if (pattern.matcher(charSequence5.subSequence(i31, charSequence5.length())).find()) {
                                                                k01Var = new k01(new lr6(pattern2));
                                                                k01Var.a = this.c;
                                                            }
                                                        }
                                                        i32++;
                                                    } else {
                                                        k01Var = null;
                                                    }
                                                }
                                            }
                                            i2 = 4;
                                            break;
                                        case 4:
                                            b0Var = b0Var3;
                                            if (this.h < 4 || this.i || (g().f() instanceof ny9)) {
                                                k01Var = null;
                                            } else {
                                                k01Var = new k01(new ui6());
                                                k01Var.b = this.d + 4;
                                            }
                                            i2 = 4;
                                            break;
                                        case 5:
                                            b0Var = b0Var3;
                                            b0 b0Var4 = (b0) m6cVar.b;
                                            int i33 = this.h;
                                            if (i33 >= 4) {
                                                k01Var = null;
                                            } else {
                                                int i34 = this.f;
                                                int i35 = this.d + i33;
                                                boolean zIsEmpty = m6cVar.D().a.isEmpty();
                                                CharSequence charSequence6 = this.a.a;
                                                char cCharAt6 = charSequence6.charAt(i34);
                                                if (cCharAt6 == '*' || cCharAt6 == '+' || cCharAt6 == '-') {
                                                    z = zIsEmpty;
                                                    i5 = i35;
                                                    int i36 = i34 + 1;
                                                    if (i36 >= charSequence6.length() || (cCharAt2 = charSequence6.charAt(i36)) == '\t' || cCharAt2 == ' ') {
                                                        r51 r51Var = new r51();
                                                        r51Var.g = String.valueOf(cCharAt6);
                                                        z68Var = new z68(r51Var, i36);
                                                    } else {
                                                        z68Var = null;
                                                    }
                                                } else {
                                                    int length4 = charSequence6.length();
                                                    int i37 = i34;
                                                    int i38 = 0;
                                                    while (true) {
                                                        z = zIsEmpty;
                                                        if (i37 < length4) {
                                                            char cCharAt7 = charSequence6.charAt(i37);
                                                            i5 = i35;
                                                            if (cCharAt7 != ')' && cCharAt7 != '.') {
                                                                switch (cCharAt7) {
                                                                    case z7c.f /* 48 */:
                                                                    case '1':
                                                                    case '2':
                                                                    case '3':
                                                                    case '4':
                                                                    case '5':
                                                                    case '6':
                                                                    case '7':
                                                                    case '8':
                                                                    case '9':
                                                                        i38++;
                                                                        if (i38 <= 9) {
                                                                            i37++;
                                                                            zIsEmpty = z;
                                                                            i35 = i5;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            } else if (i38 >= 1 && ((i6 = i37 + 1) >= charSequence6.length() || (cCharAt3 = charSequence6.charAt(i6)) == '\t' || cCharAt3 == ' ')) {
                                                                String string = charSequence6.subSequence(i34, i37).toString();
                                                                ds9 ds9Var = new ds9();
                                                                ds9Var.h = Integer.valueOf(Integer.parseInt(string));
                                                                ds9Var.g = String.valueOf(cCharAt7);
                                                                z68Var = new z68(ds9Var, i6);
                                                            }
                                                        } else {
                                                            i5 = i35;
                                                        }
                                                        z68Var = null;
                                                    }
                                                }
                                                if (z68Var == null) {
                                                    z68Var2 = null;
                                                } else {
                                                    y68 y68Var = z68Var.a;
                                                    int i39 = z68Var.b;
                                                    int i40 = (i39 - i34) + i5;
                                                    int length5 = charSequence6.length();
                                                    int i41 = i40;
                                                    while (true) {
                                                        if (i39 < length5) {
                                                            char cCharAt8 = charSequence6.charAt(i39);
                                                            int i42 = i39;
                                                            if (cCharAt8 == '\t') {
                                                                i41 = (4 - (i41 % 4)) + i41;
                                                            } else if (cCharAt8 == ' ') {
                                                                i41++;
                                                            } else {
                                                                z2 = true;
                                                            }
                                                            i39 = i42 + 1;
                                                        } else {
                                                            z2 = false;
                                                        }
                                                    }
                                                    if (z || ((!(y68Var instanceof ds9) || ((ds9) y68Var).h.intValue() == 1) && z2)) {
                                                        if (!z2 || i41 - i40 > 4) {
                                                            i41 = i40 + 1;
                                                        }
                                                        z68Var2 = new z68(y68Var, i41);
                                                    } else {
                                                        z68Var2 = null;
                                                    }
                                                }
                                                if (z68Var2 == null) {
                                                    k01Var = null;
                                                } else {
                                                    y68 y68Var2 = z68Var2.a;
                                                    int i43 = z68Var2.b;
                                                    x78 x78Var = new x78(i43 - this.d);
                                                    if (b0Var4 instanceof a78) {
                                                        y68 y68Var3 = ((a78) b0Var4).a;
                                                        if (((y68Var3 instanceof r51) && (y68Var2 instanceof r51)) ? Objects.equals(((r51) y68Var3).g, ((r51) y68Var2).g) : ((y68Var3 instanceof ds9) && (y68Var2 instanceof ds9)) ? Objects.equals(((ds9) y68Var3).g, ((ds9) y68Var2).g) : false) {
                                                            k01Var2 = new k01(x78Var);
                                                            k01Var2.b = i43;
                                                            k01Var = k01Var2;
                                                        }
                                                    }
                                                    k01Var = new k01(new a78(y68Var2), x78Var);
                                                    k01Var.b = i43;
                                                }
                                            }
                                            i2 = 4;
                                            break;
                                        case 6:
                                            ArrayList arrayList4 = m6cVar.D().a;
                                            if (arrayList4.size() >= 1 && vfh.s('|', ((std) ks0.f(1, arrayList4)).a, i18) != -1) {
                                                std stdVar2 = this.a;
                                                CharSequence charSequence7 = stdVar2.a(this.c, stdVar2.a.length()).a;
                                                ArrayList arrayList5 = new ArrayList();
                                                int i44 = 0;
                                                boolean z7 = false;
                                                int i45 = 0;
                                                while (true) {
                                                    if (i44 < charSequence7.length()) {
                                                        char cCharAt9 = charSequence7.charAt(i44);
                                                        if (cCharAt9 == c6 || cCharAt9 == ' ') {
                                                            b0Var = b0Var3;
                                                            i44++;
                                                        } else {
                                                            b0Var = b0Var3;
                                                            if (cCharAt9 == '-' || cCharAt9 == ':') {
                                                                if (i45 != 0 || arrayList5.isEmpty()) {
                                                                    if (cCharAt9 == ':') {
                                                                        i44++;
                                                                        i7 = 1;
                                                                        z3 = true;
                                                                    } else {
                                                                        i7 = 0;
                                                                        z3 = false;
                                                                    }
                                                                    boolean z8 = false;
                                                                    while (i44 < charSequence7.length() && charSequence7.charAt(i44) == '-') {
                                                                        i44++;
                                                                        i7++;
                                                                        z8 = true;
                                                                    }
                                                                    if (z8) {
                                                                        if (i44 >= charSequence7.length() || charSequence7.charAt(i44) != ':') {
                                                                            z4 = false;
                                                                        } else {
                                                                            i44++;
                                                                            i7++;
                                                                            z4 = true;
                                                                        }
                                                                        if (z3 && z4) {
                                                                            i8 = 2;
                                                                        } else if (z3) {
                                                                            i8 = 1;
                                                                        } else {
                                                                            i8 = z4 ? 3 : 0;
                                                                        }
                                                                        arrayList5.add(new ede(i8, i7));
                                                                        i45 = 0;
                                                                    }
                                                                }
                                                            } else if (cCharAt9 == '|') {
                                                                i44++;
                                                                int i46 = i45 + 1;
                                                                if (i46 <= 1) {
                                                                    i45 = i46;
                                                                    z7 = true;
                                                                }
                                                            }
                                                        }
                                                        b0Var3 = b0Var;
                                                        c6 = '\t';
                                                    } else {
                                                        b0Var = b0Var3;
                                                        if (!z7) {
                                                        }
                                                    }
                                                    arrayList5 = null;
                                                }
                                                if (arrayList5 != null && !arrayList5.isEmpty()) {
                                                    std stdVar3 = (std) ks0.f(1, arrayList4);
                                                    if (arrayList5.size() >= fde.l(stdVar3).size()) {
                                                        k01 k01Var3 = new k01(new fde(arrayList5, stdVar3));
                                                        k01Var3.a = this.c;
                                                        k01Var3.c = 1;
                                                        k01Var = k01Var3;
                                                    }
                                                }
                                                i2 = 4;
                                            } else {
                                                b0Var = b0Var3;
                                            }
                                            k01Var = null;
                                            i2 = 4;
                                            break;
                                        default:
                                            if (this.h >= i17) {
                                                k01Var = null;
                                            } else {
                                                int i47 = this.f;
                                                CharSequence charSequence8 = this.a.a;
                                                int length6 = charSequence8.length();
                                                int i48 = i18;
                                                int i49 = i48;
                                                int i50 = i49;
                                                while (true) {
                                                    if (i47 >= length6) {
                                                        int i51 = i48;
                                                        int i52 = i49;
                                                        int i53 = i50;
                                                        if ((i51 >= 3 && i52 == 0 && i53 == 0) || ((i52 >= 3 && i51 == 0 && i53 == 0) || (i53 >= 3 && i51 == 0 && i52 == 0))) {
                                                            String.valueOf(charSequence8.subSequence(this.c, charSequence8.length()));
                                                            b0[] b0VarArr2 = new b0[1];
                                                            b0VarArr2[i18] = new cg4(1);
                                                            k01Var = new k01(b0VarArr2);
                                                            k01Var.a = charSequence8.length();
                                                        }
                                                    } else {
                                                        char cCharAt10 = charSequence8.charAt(i47);
                                                        if (cCharAt10 == '\t' || cCharAt10 == c5) {
                                                            i9 = i48;
                                                            i50 = i50;
                                                            i49 = i49;
                                                        } else if (cCharAt10 != c4) {
                                                            if (cCharAt10 == '-') {
                                                                i48++;
                                                            } else if (cCharAt10 == '_') {
                                                                i49++;
                                                            }
                                                            i9 = i48;
                                                        } else {
                                                            i9 = i48;
                                                            i50++;
                                                        }
                                                        i47++;
                                                        i48 = i9;
                                                        c5 = ' ';
                                                        c4 = '*';
                                                    }
                                                    k01Var = null;
                                                }
                                            }
                                            b0Var = b0Var3;
                                            i2 = 4;
                                            break;
                                    }
                                    if (k01Var == null) {
                                        i17 = i2;
                                        b0Var3 = b0Var;
                                        i11 = 0;
                                    }
                                } else {
                                    b0Var = b0Var3;
                                    k01Var = null;
                                }
                            }
                        }
                        if (k01Var == null) {
                            j(this.f);
                        } else {
                            int i54 = this.c;
                            if (size > 0) {
                                e(size);
                                size = 0;
                            }
                            int i55 = k01Var.a;
                            if (i55 != -1) {
                                j(i55);
                            } else {
                                int i56 = k01Var.b;
                                if (i56 != -1) {
                                    i(i56);
                                }
                            }
                            if (k01Var.c < 1) {
                                i10 = 0;
                                listUnmodifiableList = null;
                            } else {
                                b0 b0VarG = g();
                                if (b0VarG instanceof sy9) {
                                    int i57 = k01Var.c;
                                    p68 p68Var = ((sy9) b0VarG).b;
                                    ArrayList arrayList6 = p68Var.d;
                                    i10 = 0;
                                    listUnmodifiableList = Collections.unmodifiableList(new ArrayList(arrayList6.subList(Math.max(arrayList6.size() - i57, 0), arrayList6.size())));
                                    ArrayList arrayList7 = p68Var.b;
                                    if (i57 >= arrayList7.size()) {
                                        arrayList7.clear();
                                    } else {
                                        for (int i58 = 0; i58 < i57; i58++) {
                                            arrayList7.remove(arrayList7.size() - 1);
                                        }
                                    }
                                    if (i57 >= arrayList6.size()) {
                                        arrayList6.clear();
                                    } else {
                                        for (int i59 = 0; i59 < i57; i59++) {
                                            arrayList6.remove(arrayList6.size() - 1);
                                        }
                                    }
                                    e(1);
                                } else {
                                    i10 = 0;
                                    listUnmodifiableList = null;
                                }
                            }
                            b0[] b0VarArr3 = (b0[]) k01Var.d;
                            int length7 = b0VarArr3.length;
                            int i60 = i10;
                            while (i60 < length7) {
                                b0 b0Var5 = b0VarArr3[i60];
                                a(new gg4(b0Var5, i54));
                                if (listUnmodifiableList != null) {
                                    b0Var5.f().g(listUnmodifiableList);
                                }
                                i60++;
                                b0Var = b0Var5;
                                zH = b0Var5.h();
                            }
                            i11 = i10;
                            b0Var3 = b0Var;
                            z5 = true;
                        }
                    }
                }
                b0Var = b0Var3;
                j(this.f);
            } else {
                b0Var = b0Var3;
            }
            if (!z5 && !this.i && g().d()) {
                ((gg4) ks0.f(1, arrayList)).b = i16;
                b();
                return;
            }
            if (size > 0) {
                e(size);
            }
            if (!b0Var.h()) {
                b();
                return;
            } else if (this.i) {
                c();
                return;
            } else {
                a(new gg4(new sy9(), i16));
                b();
                return;
            }
        }
    }

    public final void i(int i) {
        int i2;
        int i3 = this.g;
        if (i >= i3) {
            this.c = this.f;
            this.d = i3;
        }
        int length = this.a.a.length();
        while (true) {
            i2 = this.d;
            if (i2 >= i || this.c == length) {
                break;
            } else {
                d();
            }
        }
        if (i2 <= i) {
            this.e = false;
            return;
        }
        this.c--;
        this.d = i;
        this.e = true;
    }

    public final void j(int i) {
        int i2 = this.f;
        if (i >= i2) {
            this.c = i2;
            this.d = this.g;
        }
        int length = this.a.a.length();
        while (true) {
            int i3 = this.c;
            if (i3 >= i || i3 == length) {
                break;
            } else {
                d();
            }
        }
        this.e = false;
    }
}
