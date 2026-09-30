package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y5f {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final c6f f;
    public final String[] g;
    public final String h;
    public final String i;
    public final y5f j;
    public final HashMap k;
    public final HashMap l;
    public ArrayList m;

    public y5f(String str, String str2, long j, long j2, c6f c6fVar, String[] strArr, String str3, String str4, y5f y5fVar) {
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = c6fVar;
        this.g = strArr;
        this.c = str2 != null;
        this.d = j;
        this.e = j2;
        str3.getClass();
        this.h = str3;
        this.j = y5fVar;
        this.k = new HashMap();
        this.l = new HashMap();
    }

    public static y5f a(String str) {
        return new y5f(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            s03 s03Var = new s03();
            s03Var.a = new SpannableStringBuilder();
            s03Var.b = null;
            treeMap.put(str, s03Var);
        }
        CharSequence charSequence = ((s03) treeMap.get(str)).a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final y5f b(int i) {
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            return (y5f) arrayList.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z) {
        String str = this.a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z || zEquals || (zEquals2 && this.i != null)) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.m == null) {
            return;
        }
        for (int i = 0; i < this.m.size(); i++) {
            ((y5f) this.m.get(i)).d(treeSet, z || zEquals);
        }
    }

    public final boolean f(long j) {
        long j2 = this.d;
        long j3 = this.e;
        if (j2 == -9223372036854775807L && j3 == -9223372036854775807L) {
            return true;
        }
        if (j2 <= j && j3 == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= j3) {
            return j2 <= j && j < j3;
        }
        return true;
    }

    public final void g(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j) && "div".equals(this.a) && (str2 = this.i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < c(); i++) {
            b(i).g(j, str, arrayList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:143:0x020a  */
    /* JADX WARN: Code duplicated, block: B:146:0x0218  */
    /* JADX WARN: Code duplicated, block: B:148:0x021b  */
    /* JADX WARN: Code duplicated, block: B:150:0x021e  */
    /* JADX WARN: Code duplicated, block: B:151:0x0224  */
    /* JADX WARN: Code duplicated, block: B:153:0x0237  */
    /* JADX WARN: Code duplicated, block: B:165:0x0269  */
    /* JADX WARN: Code duplicated, block: B:168:0x0281  */
    /* JADX WARN: Code duplicated, block: B:169:0x0290  */
    /* JADX WARN: Code duplicated, block: B:172:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:174:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:177:0x02be  */
    /* JADX WARN: Code duplicated, block: B:180:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:193:0x02cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x02cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00be  */
    public final void h(long j, Map map, HashMap map2, String str, TreeMap treeMap) {
        Iterator it;
        int i;
        y5f y5fVar;
        int i2;
        c6f c6fVarU;
        int i3;
        float f;
        float f2;
        float f3;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        RelativeSizeSpan[] relativeSizeSpanArr;
        int length;
        float sizeChange;
        int i4;
        RelativeSizeSpan relativeSizeSpan;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Map map3 = map;
        if (f(j)) {
            String str2 = this.h;
            String str3 = "".equals(str2) ? str : str2;
            Iterator it2 = this.l.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap map4 = this.k;
                int iIntValue = map4.containsKey(str4) ? ((Integer) map4.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    s03 s03Var = (s03) treeMap.get(str4);
                    s03Var.getClass();
                    b6f b6fVar = (b6f) map2.get(str3);
                    b6fVar.getClass();
                    int i10 = b6fVar.j;
                    c6f c6fVarU2 = vtb.u(this.f, this.g, map3);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) s03Var.a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        s03Var.a = spannableStringBuilder;
                        s03Var.b = null;
                    }
                    if (c6fVarU2 != null) {
                        int i11 = c6fVarU2.h;
                        int i12 = 1;
                        if (((i11 == -1 && c6fVarU2.i == -1) ? -1 : (i11 == 1 ? (char) 1 : (char) 0) | (c6fVarU2.i == 1 ? (char) 2 : (char) 0)) != -1) {
                            int i13 = c6fVarU2.h;
                            if (i13 != -1) {
                                if (i13 == i12) {
                                    i7 = i12;
                                } else {
                                    i7 = 0;
                                }
                                if (c6fVarU2.i == i12) {
                                    i8 = 2;
                                } else {
                                    i8 = 0;
                                }
                                i9 = i7 | i8;
                            } else if (c6fVarU2.i == -1) {
                                i9 = -1;
                                i12 = 1;
                            } else {
                                i12 = 1;
                                if (i13 == i12) {
                                    i7 = i12;
                                } else {
                                    i7 = 0;
                                }
                                if (c6fVarU2.i == i12) {
                                    i8 = 2;
                                } else {
                                    i8 = 0;
                                }
                                i9 = i7 | i8;
                            }
                            StyleSpan styleSpan = new StyleSpan(i9);
                            i = 33;
                            spannableStringBuilder.setSpan(styleSpan, iIntValue, iIntValue2, 33);
                        } else {
                            i = 33;
                        }
                        if (c6fVarU2.f == i12) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, i);
                        }
                        if (c6fVarU2.g == i12) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, i);
                        }
                        if (c6fVarU2.c) {
                            if (!c6fVarU2.c) {
                                qc0.p("Font color has not been defined.");
                                return;
                            }
                            a6c.e(spannableStringBuilder, new ForegroundColorSpan(c6fVarU2.b), iIntValue, iIntValue2);
                        }
                        if (c6fVarU2.e) {
                            if (!c6fVarU2.e) {
                                qc0.p("Background color has not been defined.");
                                return;
                            }
                            a6c.e(spannableStringBuilder, new BackgroundColorSpan(c6fVarU2.d), iIntValue, iIntValue2);
                        }
                        if (c6fVarU2.a != null) {
                            a6c.e(spannableStringBuilder, new TypefaceSpan(c6fVarU2.a), iIntValue, iIntValue2);
                        }
                        sne sneVar = c6fVarU2.r;
                        if (sneVar != null) {
                            int i14 = sneVar.a;
                            if (i14 == -1) {
                                i14 = (i10 == 2 || i10 == 1) ? 3 : 1;
                                i6 = 1;
                            } else {
                                i6 = sneVar.b;
                            }
                            int i15 = sneVar.c;
                            if (i15 == -2) {
                                i15 = 1;
                            }
                            a6c.e(spannableStringBuilder, new tne(i14, i6, i15), iIntValue, iIntValue2);
                        }
                        int i16 = c6fVarU2.m;
                        if (i16 == 2) {
                            y5f y5fVar2 = this.j;
                            while (true) {
                                if (y5fVar2 == null) {
                                    y5fVar2 = null;
                                    break;
                                }
                                c6f c6fVarU3 = vtb.u(y5fVar2.f, y5fVar2.g, map3);
                                if (c6fVarU3 != null && c6fVarU3.m == 1) {
                                    break;
                                } else {
                                    y5fVar2 = y5fVar2.j;
                                }
                            }
                            if (y5fVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(y5fVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        y5fVar = null;
                                        break;
                                    }
                                    y5f y5fVar3 = (y5f) arrayDeque.pop();
                                    c6f c6fVarU4 = vtb.u(y5fVar3.f, y5fVar3.g, map3);
                                    if (c6fVarU4 != null && c6fVarU4.m == 3) {
                                        y5fVar = y5fVar3;
                                        break;
                                    }
                                    for (int iC = y5fVar3.c() - 1; iC >= 0; iC--) {
                                        arrayDeque.push(y5fVar3.b(iC));
                                    }
                                }
                                if (y5fVar != null) {
                                    if (y5fVar.c() == 1) {
                                        i2 = 0;
                                        if (y5fVar.b(0).b != null) {
                                            String str5 = y5fVar.b(0).b;
                                            String str6 = pqf.a;
                                            c6f c6fVarU5 = vtb.u(y5fVar.f, y5fVar.g, map3);
                                            int i17 = c6fVarU5 != null ? c6fVarU5.n : -1;
                                            if (i17 == -1 && (c6fVarU = vtb.u(y5fVar2.f, y5fVar2.g, map3)) != null) {
                                                i17 = c6fVarU.n;
                                            }
                                            spannableStringBuilder.setSpan(new y7c(str5, i17), iIntValue, iIntValue2, 33);
                                        }
                                    } else {
                                        i2 = 0;
                                    }
                                    xo1.D("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                }
                            }
                            if (c6fVarU2.q == 1) {
                                a6c.e(spannableStringBuilder, new tq6(), iIntValue, iIntValue2);
                            }
                            i3 = c6fVarU2.j;
                            f = 100.0f;
                            if (i3 != 1) {
                                it = it2;
                                f2 = 100.0f;
                                a6c.e(spannableStringBuilder, new AbsoluteSizeSpan((int) c6fVarU2.k, true), iIntValue, iIntValue2);
                            } else if (i3 != 2) {
                                it = it2;
                                f2 = 100.0f;
                                a6c.e(spannableStringBuilder, new RelativeSizeSpan(c6fVarU2.k), iIntValue, iIntValue2);
                            } else if (i3 != 3) {
                                it = it2;
                                f2 = 100.0f;
                            } else {
                                float f4 = c6fVarU2.k / 100.0f;
                                relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                                length = relativeSizeSpanArr.length;
                                int i18 = i2;
                                sizeChange = f4;
                                i4 = i18;
                                while (i4 < length) {
                                    float f5 = f;
                                    relativeSizeSpan = relativeSizeSpanArr[i4];
                                    Iterator it3 = it2;
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= iIntValue2) {
                                        sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                    }
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue || spannableStringBuilder.getSpanEnd(relativeSizeSpan) != iIntValue2) {
                                        i5 = i4;
                                    } else {
                                        i5 = i4;
                                        if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                            spannableStringBuilder.removeSpan(relativeSizeSpan);
                                        }
                                    }
                                    i4 = i5 + 1;
                                    f = f5;
                                    it2 = it3;
                                }
                                it = it2;
                                f2 = f;
                                spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                            }
                            if ("p".equals(this.a)) {
                                f3 = c6fVarU2.s;
                                if (f3 != Float.MAX_VALUE) {
                                    s03Var.q = (f3 * (-90.0f)) / f2;
                                }
                                alignment = c6fVarU2.o;
                                if (alignment != null) {
                                    s03Var.c = alignment;
                                }
                                alignment2 = c6fVarU2.p;
                                if (alignment2 != null) {
                                    s03Var.d = alignment2;
                                }
                            }
                        } else if (i16 == 3 || i16 == 4) {
                            spannableStringBuilder.setSpan(new kw3(), iIntValue, iIntValue2, 33);
                        }
                        i2 = 0;
                        if (c6fVarU2.q == 1) {
                            a6c.e(spannableStringBuilder, new tq6(), iIntValue, iIntValue2);
                        }
                        i3 = c6fVarU2.j;
                        f = 100.0f;
                        if (i3 != 1) {
                            it = it2;
                            f2 = 100.0f;
                            a6c.e(spannableStringBuilder, new AbsoluteSizeSpan((int) c6fVarU2.k, true), iIntValue, iIntValue2);
                        } else if (i3 != 2) {
                            it = it2;
                            f2 = 100.0f;
                            a6c.e(spannableStringBuilder, new RelativeSizeSpan(c6fVarU2.k), iIntValue, iIntValue2);
                        } else if (i3 != 3) {
                            it = it2;
                            f2 = 100.0f;
                        } else {
                            float f6 = c6fVarU2.k / 100.0f;
                            relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                            length = relativeSizeSpanArr.length;
                            int i19 = i2;
                            sizeChange = f6;
                            i4 = i19;
                            while (i4 < length) {
                                float f7 = f;
                                relativeSizeSpan = relativeSizeSpanArr[i4];
                                Iterator it4 = it2;
                                if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue) {
                                    sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                }
                                if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue) {
                                    i5 = i4;
                                } else {
                                    i5 = i4;
                                }
                                i4 = i5 + 1;
                                f = f7;
                                it2 = it4;
                            }
                            it = it2;
                            f2 = f;
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                        }
                        if ("p".equals(this.a)) {
                            f3 = c6fVarU2.s;
                            if (f3 != Float.MAX_VALUE) {
                                s03Var.q = (f3 * (-90.0f)) / f2;
                            }
                            alignment = c6fVarU2.o;
                            if (alignment != null) {
                                s03Var.c = alignment;
                            }
                            alignment2 = c6fVarU2.p;
                            if (alignment2 != null) {
                                s03Var.d = alignment2;
                            }
                        }
                    }
                    it2 = it;
                }
                it = it2;
                it2 = it;
            }
            int i20 = 0;
            while (i20 < c()) {
                b(i20).h(j, map3, map2, str3, treeMap);
                i20++;
                map3 = map;
            }
        }
    }

    public final void i(long j, boolean z, String str, TreeMap treeMap) {
        HashMap map = this.k;
        map.clear();
        HashMap map2 = this.l;
        map2.clear();
        String str2 = this.a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.c && z) {
            SpannableStringBuilder spannableStringBuilderE = e(str4, treeMap);
            String str5 = this.b;
            str5.getClass();
            spannableStringBuilderE.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z) {
            e(str4, treeMap).append('\n');
            return;
        }
        if (f(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((s03) entry.getValue()).a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i = 0; i < c(); i++) {
                b(i).i(j, z || zEquals, str4, treeMap);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderE2 = e(str4, treeMap);
                int length = spannableStringBuilderE2.length() - 1;
                while (length >= 0 && spannableStringBuilderE2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderE2.charAt(length) != '\n') {
                    spannableStringBuilderE2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((s03) entry2.getValue()).a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
