package defpackage;

import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xt implements qy9 {
    public final int X;
    public final String a;
    public final mue b;
    public final List c;
    public final List d;
    public final xp5 e;
    public final sw3 f;
    public final ew g;
    public final CharSequence v;
    public final hv7 w;
    public psd x;
    public final boolean y;
    public final int z;

    /* JADX WARN: Code duplicated, block: B:15:0x0071  */
    /* JADX WARN: Code duplicated, block: B:18:0x0076  */
    /* JADX WARN: Code duplicated, block: B:243:0x0490  */
    /* JADX WARN: Code duplicated, block: B:249:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:255:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:256:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:258:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:259:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:262:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:263:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:265:0x0508  */
    /* JADX WARN: Code duplicated, block: B:266:0x050e  */
    /* JADX WARN: Code duplicated, block: B:270:0x053b  */
    /* JADX WARN: Code duplicated, block: B:272:0x0547  */
    /* JADX WARN: Code duplicated, block: B:281:0x055d  */
    /* JADX WARN: Code duplicated, block: B:294:0x0578  */
    /* JADX WARN: Code duplicated, block: B:297:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:299:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:302:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:304:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:306:0x05f9 A[LOOP:9: B:305:0x05f7->B:306:0x05f9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:309:0x0611  */
    /* JADX WARN: Code duplicated, block: B:311:0x0616  */
    /* JADX WARN: Code duplicated, block: B:313:0x061d  */
    /* JADX WARN: Code duplicated, block: B:315:0x0621  */
    /* JADX WARN: Code duplicated, block: B:316:0x062a  */
    /* JADX WARN: Code duplicated, block: B:318:0x0633  */
    /* JADX WARN: Code duplicated, block: B:329:0x066b  */
    /* JADX WARN: Code duplicated, block: B:334:0x0688  */
    /* JADX WARN: Code duplicated, block: B:336:0x0694  */
    /* JADX WARN: Code duplicated, block: B:343:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:397:0x07df  */
    /* JADX WARN: Code duplicated, block: B:399:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:401:0x07f4  */
    /* JADX WARN: Code duplicated, block: B:408:0x0808  */
    /* JADX WARN: Code duplicated, block: B:421:0x0855  */
    /* JADX WARN: Code duplicated, block: B:423:0x0866  */
    /* JADX WARN: Code duplicated, block: B:424:0x086b  */
    /* JADX WARN: Code duplicated, block: B:426:0x0876  */
    /* JADX WARN: Code duplicated, block: B:427:0x087d  */
    /* JADX WARN: Code duplicated, block: B:429:0x0881  */
    /* JADX WARN: Code duplicated, block: B:432:0x088a  */
    /* JADX WARN: Code duplicated, block: B:434:0x0896  */
    /* JADX WARN: Code duplicated, block: B:435:0x0899  */
    /* JADX WARN: Code duplicated, block: B:437:0x089d  */
    /* JADX WARN: Code duplicated, block: B:444:0x08d7  */
    /* JADX WARN: Code duplicated, block: B:449:0x08e8  */
    /* JADX WARN: Code duplicated, block: B:451:0x0900 A[LOOP:8: B:450:0x08fe->B:451:0x0900, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:454:0x0929  */
    /* JADX WARN: Code duplicated, block: B:456:0x0932  */
    /* JADX WARN: Code duplicated, block: B:458:0x093d  */
    /* JADX WARN: Code duplicated, block: B:459:0x0940  */
    /* JADX WARN: Code duplicated, block: B:462:0x0956  */
    /* JADX WARN: Code duplicated, block: B:463:0x095d  */
    /* JADX WARN: Code duplicated, block: B:465:0x0968  */
    /* JADX WARN: Code duplicated, block: B:466:0x096a  */
    /* JADX WARN: Code duplicated, block: B:471:0x0991  */
    /* JADX WARN: Code duplicated, block: B:483:0x0560 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:449:0x08e8, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xt] */
    public xt(String str, mue mueVar, List list, List list2, xp5 xp5Var, sw3 sw3Var, boolean z) throws Throwable {
        boolean zBooleanValue;
        Locale locale;
        int i;
        Object obj;
        wt wtVar;
        Typeface typeface;
        CharSequence charSequenceG;
        int i2;
        int i3;
        ete eteVar;
        ArrayList arrayList;
        int size;
        int i4;
        yp5 yp5Var;
        xtd xtdVar;
        s19 s19Var;
        int size2;
        int i5;
        int[] iArr;
        int size3;
        int i6;
        int i7;
        int i8;
        int i9;
        int size4;
        int i10;
        ArrayList arrayList2;
        int i11;
        int i12;
        int i13;
        int i14;
        int size5;
        int i15;
        boolean z2;
        Spannable spannable;
        ete eteVar2;
        float f;
        int size6;
        int i16;
        int size7;
        int i17;
        xt xtVar;
        int i18;
        long jB;
        int i19;
        long jB2;
        int i20;
        Object obj2;
        q51 q51Var;
        int i21;
        int i22;
        float fG;
        long j;
        long jB3;
        float fC;
        int size8;
        int i23;
        j00 j00Var;
        g00 g00Var;
        int i24;
        int i25;
        int i26;
        j00 j00Var2;
        Object obj3;
        int i27;
        int i28;
        Spannable spannable2;
        int i29;
        int i30;
        j00 j00Var3;
        Object obj4;
        xtd xtdVar2;
        long j2;
        long j3;
        int i31;
        long jB4;
        float fC2;
        long jB5;
        float fC3;
        ofa ofaVar;
        ofa ofaVar2;
        ?? obj5 = new Object();
        obj5.a = str;
        obj5.b = mueVar;
        obj5.c = list;
        obj5.d = list2;
        obj5.e = xp5Var;
        obj5.f = sw3Var;
        float density = sw3Var.getDensity();
        ew ewVar = new ew(1);
        ((TextPaint) ewVar).density = density;
        ewVar.b = mne.b;
        ewVar.c = 3;
        ewVar.d = o4d.d;
        obj5.g = ewVar;
        boolean zC = qn4.C(mueVar);
        xtd xtdVar3 = mueVar.a;
        ty9 ty9Var = mueVar.b;
        int i32 = 0;
        if (zC) {
            kd9 kd9Var = nt4.a;
            kd9 kd9Var2 = nt4.a;
            h0e h0eVarG = (h0e) kd9Var2.b;
            if (h0eVarG == null) {
                if (jt4.d()) {
                    h0eVarG = kd9Var2.G();
                    kd9Var2.b = h0eVarG;
                } else {
                    h0eVarG = cn1.v;
                }
            }
            zBooleanValue = ((Boolean) h0eVarG.getValue()).booleanValue();
        } else {
            zBooleanValue = false;
        }
        obj5.y = zBooleanValue;
        int i33 = ty9Var.b;
        sd8 sd8Var = xtdVar3.k;
        if (i33 == 4) {
            i = 2;
        } else if (i33 == 5) {
            i = 3;
        } else if (i33 == 1) {
            i = 0;
        } else if (i33 == 2) {
            i = 1;
        } else {
            if (i33 != 3 && i33 != 0) {
                qc0.p("Invalid TextDirection.");
                throw null;
            }
            int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((sd8Var == null || (locale = ((rd8) sd8Var.a.get(0)).a) == null) ? Locale.getDefault() : locale);
            if (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) {
                i = 2;
            } else {
                i = 3;
            }
        }
        obj5.z = i;
        obj5.X = -1;
        wt wtVar2 = new wt(i32, obj5);
        cue cueVar = ty9Var.i;
        cueVar = cueVar == null ? cue.c : cueVar;
        ewVar.setFlags(cueVar.b ? ewVar.getFlags() | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS : ewVar.getFlags() & (-129));
        int i34 = cueVar.a;
        if (i34 == 1) {
            ewVar.setFlags(ewVar.getFlags() | 64);
            ewVar.setHinting(0);
        } else if (i34 == 2) {
            ewVar.getFlags();
            ewVar.setHinting(1);
        } else if (i34 == 3) {
            ewVar.getFlags();
            ewVar.setHinting(0);
        } else {
            ewVar.getFlags();
        }
        int size9 = list.size();
        int i35 = 0;
        while (true) {
            if (i35 >= size9) {
                obj = null;
                break;
            }
            obj = list.get(i35);
            if (((j00) obj).a instanceof xtd) {
                break;
            } else {
                i35++;
            }
        }
        boolean z3 = obj != null;
        long j4 = xtdVar3.b;
        ar5 ar5Var = xtdVar3.c;
        wq5 wq5Var = xtdVar3.d;
        String str2 = xtdVar3.g;
        sd8 sd8Var2 = xtdVar3.k;
        bte bteVar = xtdVar3.a;
        cte cteVar = xtdVar3.j;
        long j5 = xtdVar3.h;
        long jB6 = wue.b(j4);
        boolean z4 = z3;
        if (xue.a(jB6, 4294967296L)) {
            ewVar.setTextSize(sw3Var.Q0(j4));
        } else if (xue.a(jB6, 8589934592L)) {
            ewVar.setTextSize(wue.c(j4) * ewVar.getTextSize());
        }
        yp5 yp5Var2 = xtdVar3.f;
        if (yp5Var2 == null && wq5Var == null && ar5Var == null) {
            wtVar = wtVar2;
        } else {
            ar5 ar5Var2 = ar5Var == null ? ar5.w : ar5Var;
            int i36 = wq5Var != null ? wq5Var.a : 0;
            xq5 xq5Var = xtdVar3.e;
            int i37 = xq5Var != null ? xq5Var.a : 65535;
            wtVar = wtVar2;
            xt xtVar2 = (xt) wtVar.b;
            l9f l9fVarB = ((zp5) xtVar2.e).b(yp5Var2, ar5Var2, i36, i37);
            if (l9fVarB instanceof k9f) {
                Object obj6 = ((k9f) l9fVarB).a;
                obj6.getClass();
                typeface = (Typeface) obj6;
            } else {
                psd psdVar = new psd(l9fVarB, xtVar2.x);
                xtVar2.x = psdVar;
                Object obj7 = psdVar.c;
                obj7.getClass();
                typeface = (Typeface) obj7;
            }
            ewVar.setTypeface(typeface);
        }
        if (sd8Var2 != null) {
            sd8 sd8Var3 = sd8.c;
            if (!sd8Var2.equals(cfa.a.s())) {
                ArrayList arrayList3 = new ArrayList(t72.u(sd8Var2, 10));
                Iterator it = sd8Var2.a.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((rd8) it.next()).a);
                }
                Locale[] localeArr = (Locale[]) arrayList3.toArray(new Locale[0]);
                ewVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
            }
        }
        if (str2 != null && !str2.equals("")) {
            ewVar.setFontFeatureSettings(str2);
        }
        if (cteVar != null && !cteVar.equals(cte.c)) {
            ewVar.setTextScaleX(ewVar.getTextScaleX() * cteVar.a);
            ewVar.setTextSkewX(ewVar.getTextSkewX() + cteVar.b);
        }
        ewVar.d(bteVar.b());
        ewVar.c(bteVar.c(), 9205357640488583168L, bteVar.a());
        ewVar.f(xtdVar3.n);
        ewVar.g(xtdVar3.m);
        ewVar.e(xtdVar3.p);
        if (xue.a(wue.b(j5), 4294967296L) && wue.c(j5) != 0.0f) {
            float textScaleX = ewVar.getTextScaleX() * ewVar.getTextSize();
            float fQ0 = sw3Var.Q0(j5);
            if (textScaleX != 0.0f) {
                ewVar.setLetterSpacing(fQ0 / textScaleX);
            }
        } else if (xue.a(wue.b(j5), 8589934592L)) {
            ewVar.setLetterSpacing(wue.c(j5));
        }
        long j6 = xtdVar3.l;
        ou0 ou0Var = xtdVar3.i;
        boolean z5 = z4 && xue.a(wue.b(j5), 4294967296L) && wue.c(j5) != 0.0f;
        long j7 = y72.k;
        boolean z6 = (faf.a(j6, j7) || faf.a(j6, y72.j)) ? false : true;
        boolean z7 = (ou0Var == null || Float.compare(ou0Var.a, 0.0f) == 0) ? false : true;
        xtd xtdVar4 = (z5 || z6 || z7) ? new xtd(0L, 0L, null, null, null, null, null, z5 ? j5 : wue.c, z7 ? ou0Var : null, null, null, z6 ? j6 : j7, null, null, 63103) : null;
        List list3 = obj5.c;
        if (xtdVar4 != null) {
            int size10 = list3.size() + 1;
            ArrayList arrayList4 = new ArrayList(size10);
            int i38 = 0;
            while (i38 < size10) {
                arrayList4.add(i38 == 0 ? new j00(xtdVar4, 0, obj5.a.length()) : (j00) obj5.c.get(i38 - 1));
                i38++;
            }
            list3 = arrayList4;
        }
        String str3 = obj5.a;
        float textSize = obj5.g.getTextSize();
        mue mueVar2 = obj5.b;
        List list4 = obj5.d;
        sw3 sw3Var2 = obj5.f;
        boolean z8 = obj5.y;
        String str4 = obj5.a;
        if (obj5.X == -1) {
            obj5.X = (str4.length() > 512 || v4e.G(str4, '\n')) ? 1 : 0;
        }
        ut utVar = vt.a;
        if (z8 && jt4.d()) {
            iga igaVar = mueVar2.c;
            xt4 xt4Var = (igaVar == null || (ofaVar2 = igaVar.b) == null) ? null : new xt4(ofaVar2.b);
            int i39 = (xt4Var != null && xt4Var.a == 2) ? 1 : 0;
            charSequenceG = jt4.a().g(0, str3.length(), i39, str3);
            charSequenceG.getClass();
        } else {
            charSequenceG = str3;
        }
        if (!list3.isEmpty() || !list4.isEmpty() || !pa7.t(mueVar2.b.d, ete.c) || (mueVar2.b.c & 1095216660480L) != 0) {
            xtVar = obj5;
            Spannable spannableString = charSequenceG instanceof Spannable ? (Spannable) charSequenceG : new SpannableString(charSequenceG);
            xtd xtdVar5 = mueVar2.a;
            ty9 ty9Var2 = mueVar2.b;
            if (pa7.t(xtdVar5.m, mne.c)) {
                spannableString.setSpan(vt.a, 0, str3.length(), 33);
            }
            iga igaVar2 = mueVar2.c;
            if (((igaVar2 == null || (ofaVar = igaVar2.b) == null) ? false : ofaVar.a) && ty9Var2.f == null) {
                float fH = q6c.h(ty9Var2.c, textSize, sw3Var2);
                if (!Float.isNaN(fH)) {
                    spannableString.setSpan(new u58(fH), 0, spannableString.length(), 33);
                }
                i2 = 16;
            } else {
                y58 y58Var = ty9Var2.f;
                y58Var = y58Var == null ? y58.d : y58Var;
                i2 = 16;
                float fH2 = q6c.h(ty9Var2.c, textSize, sw3Var2);
                if (!Float.isNaN(fH2)) {
                    int length = (spannableString.length() == 0 || v4e.R(spannableString) == '\n') ? spannableString.length() + 1 : spannableString.length();
                    int i40 = y58Var.b;
                    i3 = 0;
                    spannableString.setSpan(new z58(fH2, length, (i40 & 1) > 0, (i40 & 16) > 0, y58Var.a, y58Var.c), 0, spannableString.length(), 33);
                }
                eteVar = ty9Var2.d;
                if (eteVar != null) {
                    j2 = eteVar.a;
                    j3 = eteVar.b;
                    i31 = i3;
                    if ((wue.a(j2, w6c.l(i31)) || !wue.a(j3, w6c.l(i31))) && (j2 & 1095216660480L) != 0 && (j3 & 1095216660480L) != 0) {
                        jB4 = wue.b(j2);
                        if (xue.a(jB4, 4294967296L)) {
                            fC2 = sw3Var2.Q0(j2);
                        } else if (xue.a(jB4, 8589934592L)) {
                            fC2 = wue.c(j2) * textSize;
                        } else {
                            fC2 = 0.0f;
                        }
                        jB5 = wue.b(j3);
                        if (xue.a(jB5, 4294967296L)) {
                            fC3 = sw3Var2.Q0(j3);
                        } else if (xue.a(jB5, 8589934592L)) {
                            fC3 = wue.c(j3) * textSize;
                        } else {
                            fC3 = 0.0f;
                        }
                        spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC2), (int) Math.ceil(fC3)), 0, spannableString.length(), 33);
                    }
                }
                arrayList = new ArrayList(list3.size());
                size = list3.size();
                for (i4 = 0; i4 < size; i4++) {
                    j00Var3 = (j00) list3.get(i4);
                    obj4 = j00Var3.a;
                    if (obj4 instanceof xtd) {
                        xtdVar2 = (xtd) obj4;
                        if (xtdVar2.f == null || xtdVar2.d != null || xtdVar2.c != null || ((xtd) obj4).e != null) {
                            arrayList.add(j00Var3);
                        }
                    }
                }
                yp5Var = xtdVar5.f;
                if (yp5Var != null && xtdVar5.d == null && xtdVar5.c == null && xtdVar5.e == null) {
                    xtdVar = null;
                } else {
                    xtdVar = new xtd(0L, 0L, xtdVar5.c, xtdVar5.d, xtdVar5.e, yp5Var, null, 0L, null, null, null, 0L, null, null, 65475);
                }
                s19Var = new s19(i2, spannableString, wtVar);
                if (arrayList.size() <= 1) {
                    size2 = arrayList.size();
                    i5 = size2 * 2;
                    iArr = new int[i5];
                    size3 = arrayList.size();
                    for (i6 = 0; i6 < size3; i6++) {
                        j00 j00Var4 = (j00) arrayList.get(i6);
                        iArr[i6] = j00Var4.b;
                        iArr[i6 + size2] = j00Var4.c;
                    }
                    if (i5 > 1) {
                        Arrays.sort(iArr);
                    }
                    if (i5 != 0) {
                        r3.n("Array is empty.");
                        throw null;
                    }
                    i7 = iArr[0];
                    i8 = 0;
                    while (i8 < i5) {
                        i9 = iArr[i8];
                        if (i9 == i7) {
                            arrayList2 = arrayList;
                            i11 = i8;
                            i12 = i5;
                        } else {
                            size4 = arrayList.size();
                            i10 = 0;
                            while (i10 < size4) {
                                ArrayList arrayList5 = arrayList;
                                j00 j00Var5 = (j00) arrayList.get(i10);
                                int i41 = i8;
                                i13 = j00Var5.b;
                                int i42 = i5;
                                i14 = j00Var5.c;
                                if (i13 == i14 && l00.b(i7, i9, i13, i14)) {
                                    xtd xtdVar6 = (xtd) j00Var5.a;
                                    xtdVar = xtdVar != null ? xtdVar.d(xtdVar6) : xtdVar6;
                                }
                                i10++;
                                arrayList = arrayList5;
                                i8 = i41;
                                i5 = i42;
                            }
                            arrayList2 = arrayList;
                            i11 = i8;
                            i12 = i5;
                            if (xtdVar != null) {
                                s19Var.m(xtdVar, Integer.valueOf(i7), Integer.valueOf(i9));
                            }
                            i7 = i9;
                        }
                        i8 = i11 + 1;
                        xtdVar = xtdVar;
                        arrayList = arrayList2;
                        i5 = i12;
                    }
                } else if (!arrayList.isEmpty()) {
                    xtd xtdVar7 = (xtd) ((j00) arrayList.get(0)).a;
                    s19Var.m(xtdVar != null ? xtdVar.d(xtdVar7) : xtdVar7, Integer.valueOf(((j00) arrayList.get(0)).b), Integer.valueOf(((j00) arrayList.get(0)).c));
                }
                size5 = list3.size();
                i15 = 0;
                z2 = false;
                while (i15 < size5) {
                    j00Var2 = (j00) list3.get(i15);
                    obj3 = j00Var2.a;
                    if (obj3 instanceof xtd) {
                        i29 = j00Var2.b;
                        int i43 = j00Var2.c;
                        if (i29 >= 0 || i29 >= spannableString.length() || i43 <= i29 || i43 > spannableString.length()) {
                            i27 = size5;
                            i28 = i15;
                            z2 = z2;
                            spannable2 = spannableString;
                        } else {
                            xtd xtdVar8 = (xtd) obj3;
                            i27 = size5;
                            i28 = i15;
                            long j8 = xtdVar8.h;
                            ou0 ou0Var2 = xtdVar8.i;
                            bte bteVar2 = xtdVar8.a;
                            if (ou0Var2 != null) {
                                spannableString.setSpan(new pu0(0, ou0Var2.a), i29, i43, 33);
                            }
                            q6c.k(spannableString, bteVar2.b(), i29, i43);
                            b41 b41VarC = bteVar2.c();
                            float fA = bteVar2.a();
                            if (b41VarC != null) {
                                if (b41VarC instanceof dtd) {
                                    q6c.k(spannableString, ((dtd) b41VarC).a, i29, i43);
                                } else {
                                    spannableString.setSpan(new m4d((l4d) b41VarC, fA), i29, i43, 33);
                                }
                            }
                            mne mneVar = xtdVar8.m;
                            if (mneVar != null) {
                                int i44 = mneVar.a;
                                nne nneVar = new nne((i44 | 1) == i44, (i44 | 2) == i44);
                                i30 = 33;
                                spannableString.setSpan(nneVar, i29, i43, 33);
                            } else {
                                i30 = 33;
                            }
                            q6c.m(spannableString, xtdVar8.b, sw3Var2, i29, i43);
                            spannable2 = spannableString;
                            String str5 = xtdVar8.g;
                            if (str5 != null) {
                                spannable2.setSpan(new bq5(0, str5), i29, i43, i30);
                            }
                            cte cteVar2 = xtdVar8.j;
                            if (cteVar2 != null) {
                                spannable2.setSpan(new ScaleXSpan(cteVar2.a), i29, i43, i30);
                                spannable2.setSpan(new pu0(1, cteVar2.b), i29, i43, i30);
                            }
                            q6c.n(spannable2, xtdVar8.k, i29, i43);
                            long j9 = xtdVar8.l;
                            if (j9 != 16) {
                                spannable2.setSpan(new BackgroundColorSpan(abg.Z(j9)), i29, i43, i30);
                            }
                            o4d o4dVar = xtdVar8.n;
                            if (o4dVar != null) {
                                long j10 = o4dVar.b;
                                int iZ = abg.Z(o4dVar.a);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
                                float f2 = o4dVar.c;
                                t4d t4dVar = new t4d(fIntBitsToFloat, fIntBitsToFloat2, f2 == 0.0f ? Float.MIN_VALUE : f2, iZ);
                                i30 = 33;
                                spannable2.setSpan(t4dVar, i29, i43, 33);
                            }
                            un4 un4Var = xtdVar8.p;
                            if (un4Var != null) {
                                spannable2.setSpan(new vn4(un4Var), i29, i43, i30);
                            }
                            z2 = (xue.a(wue.b(j8), 4294967296L) || xue.a(wue.b(j8), 8589934592L)) ? true : z2;
                        }
                        z2 = z2;
                    } else {
                        i27 = size5;
                        i28 = i15;
                        z2 = z2;
                        spannable2 = spannableString;
                        z2 = z2;
                    }
                    i15 = i28 + 1;
                    size5 = i27;
                    spannableString = spannable2;
                    ty9Var2 = ty9Var2;
                }
                spannable = spannableString;
                ty9 ty9Var3 = ty9Var2;
                if (z2) {
                    size8 = list3.size();
                    i23 = 0;
                    while (i23 < size8) {
                        j00Var = (j00) list3.get(i23);
                        g00Var = (g00) j00Var.a;
                        if (g00Var instanceof xtd) {
                            i26 = j00Var.b;
                            int i45 = j00Var.c;
                            if (i26 >= 0 || i26 >= spannable.length() || i45 <= i26 || i45 > spannable.length()) {
                                i24 = size8;
                                i25 = i23;
                            } else {
                                long j11 = ((xtd) g00Var).h;
                                long jB7 = wue.b(j11);
                                i24 = size8;
                                i25 = i23;
                                Object z38Var = xue.a(jB7, 4294967296L) ? new z38(sw3Var2.Q0(j11)) : xue.a(jB7, 8589934592L) ? new y38(wue.c(j11)) : null;
                                if (z38Var != null) {
                                    spannable.setSpan(z38Var, i26, i45, 33);
                                }
                            }
                        } else {
                            i24 = size8;
                            i25 = i23;
                        }
                        i23 = i25 + 1;
                        size8 = i24;
                    }
                }
                eteVar2 = ty9Var3.d;
                if (eteVar2 != null) {
                    j = eteVar2.a;
                    jB3 = wue.b(j);
                    if (xue.a(jB3, 4294967296L)) {
                        fC = sw3Var2.Q0(j);
                    } else if (xue.a(jB3, 8589934592L)) {
                        fC = wue.c(j) * textSize;
                    } else {
                        fC = 0.0f;
                    }
                    f = fC;
                } else {
                    f = 0.0f;
                }
                i16 = 0;
                for (size6 = list3.size(); i16 < size6; size6 = i21) {
                    j00 j00Var6 = (j00) list3.get(i16);
                    obj2 = j00Var6.a;
                    if (obj2 instanceof q51) {
                        q51Var = (q51) obj2;
                    } else {
                        q51Var = null;
                    }
                    if (q51Var != null) {
                        fG = q6c.g(q51Var.a, textSize, sw3Var2);
                        i21 = size6;
                        i22 = i16;
                        float fG2 = q6c.g(q51Var.b, textSize, sw3Var2);
                        float fG3 = q6c.g(q51Var.c, textSize, sw3Var2);
                        if (Float.isNaN(fG) && !Float.isNaN(fG2) && !Float.isNaN(fG3)) {
                            sw3 sw3Var3 = sw3Var2;
                            sw3Var2 = sw3Var3;
                            spannable.setSpan(new l13(fG, fG2, fG3, sw3Var3, f), j00Var6.b, j00Var6.c, 33);
                        }
                        i16 = i22 + 1;
                    } else {
                        i21 = size6;
                        i22 = i16;
                    }
                    i16 = i22 + 1;
                }
                size7 = list4.size();
                i17 = 0;
                while (i17 < size7) {
                    j00 j00Var7 = (j00) list4.get(i17);
                    fea feaVar = (fea) j00Var7.a;
                    int i46 = j00Var7.b;
                    int i47 = j00Var7.c;
                    for (Object obj8 : spannable.getSpans(i46, i47, h9f.class)) {
                        spannable.removeSpan((h9f) obj8);
                    }
                    long j12 = feaVar.a;
                    long j13 = feaVar.b;
                    float fC4 = wue.c(j12);
                    int i48 = size7;
                    jB = wue.b(feaVar.a);
                    int i49 = i17;
                    if (xue.a(jB, 4294967296L)) {
                        i19 = 0;
                    } else if (xue.a(jB, 8589934592L)) {
                        i19 = 1;
                    } else {
                        i19 = 2;
                    }
                    sw3 sw3Var4 = sw3Var2;
                    float fC5 = wue.c(j13);
                    jB2 = wue.b(j13);
                    if (xue.a(jB2, 4294967296L)) {
                        i20 = 0;
                    } else if (xue.a(jB2, 8589934592L)) {
                        i20 = 1;
                    } else {
                        i20 = 2;
                    }
                    nea neaVar = new nea(fC4, i19, fC5, i20, sw3Var4, 0);
                    sw3Var2 = sw3Var4;
                    spannable.setSpan(neaVar, i46, i47, 33);
                    size7 = i48;
                    i17 = i49 + 1;
                }
                xtVar = this;
                charSequenceG = spannable;
            }
            i3 = 0;
            eteVar = ty9Var2.d;
            if (eteVar != null) {
                j2 = eteVar.a;
                j3 = eteVar.b;
                i31 = i3;
                if (wue.a(j2, w6c.l(i31))) {
                    jB4 = wue.b(j2);
                    if (xue.a(jB4, 4294967296L)) {
                        fC2 = sw3Var2.Q0(j2);
                    } else if (xue.a(jB4, 8589934592L)) {
                        fC2 = wue.c(j2) * textSize;
                    } else {
                        fC2 = 0.0f;
                    }
                    jB5 = wue.b(j3);
                    if (xue.a(jB5, 4294967296L)) {
                        fC3 = sw3Var2.Q0(j3);
                    } else if (xue.a(jB5, 8589934592L)) {
                        fC3 = wue.c(j3) * textSize;
                    } else {
                        fC3 = 0.0f;
                    }
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC2), (int) Math.ceil(fC3)), 0, spannableString.length(), 33);
                } else {
                    jB4 = wue.b(j2);
                    if (xue.a(jB4, 4294967296L)) {
                        fC2 = sw3Var2.Q0(j2);
                    } else if (xue.a(jB4, 8589934592L)) {
                        fC2 = wue.c(j2) * textSize;
                    } else {
                        fC2 = 0.0f;
                    }
                    jB5 = wue.b(j3);
                    if (xue.a(jB5, 4294967296L)) {
                        fC3 = sw3Var2.Q0(j3);
                    } else if (xue.a(jB5, 8589934592L)) {
                        fC3 = wue.c(j3) * textSize;
                    } else {
                        fC3 = 0.0f;
                    }
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC2), (int) Math.ceil(fC3)), 0, spannableString.length(), 33);
                }
            }
            arrayList = new ArrayList(list3.size());
            size = list3.size();
            while (i4 < size) {
                j00Var3 = (j00) list3.get(i4);
                obj4 = j00Var3.a;
                if (obj4 instanceof xtd) {
                    xtdVar2 = (xtd) obj4;
                    if (xtdVar2.f == null) {
                        arrayList.add(j00Var3);
                    } else {
                        arrayList.add(j00Var3);
                    }
                }
            }
            yp5Var = xtdVar5.f;
            if (yp5Var != null) {
                xtdVar = new xtd(0L, 0L, xtdVar5.c, xtdVar5.d, xtdVar5.e, yp5Var, null, 0L, null, null, null, 0L, null, null, 65475);
            } else {
                xtdVar = new xtd(0L, 0L, xtdVar5.c, xtdVar5.d, xtdVar5.e, yp5Var, null, 0L, null, null, null, 0L, null, null, 65475);
            }
            s19Var = new s19(i2, spannableString, wtVar);
            if (arrayList.size() <= 1) {
                size2 = arrayList.size();
                i5 = size2 * 2;
                iArr = new int[i5];
                size3 = arrayList.size();
                while (i6 < size3) {
                    j00 j00Var8 = (j00) arrayList.get(i6);
                    iArr[i6] = j00Var8.b;
                    iArr[i6 + size2] = j00Var8.c;
                }
                if (i5 > 1) {
                    Arrays.sort(iArr);
                }
                if (i5 != 0) {
                    r3.n("Array is empty.");
                    throw null;
                }
                i7 = iArr[0];
                i8 = 0;
                while (i8 < i5) {
                    i9 = iArr[i8];
                    if (i9 == i7) {
                        arrayList2 = arrayList;
                        i11 = i8;
                        i12 = i5;
                    } else {
                        size4 = arrayList.size();
                        i10 = 0;
                        while (i10 < size4) {
                            ArrayList arrayList6 = arrayList;
                            j00 j00Var9 = (j00) arrayList.get(i10);
                            int i410 = i8;
                            i13 = j00Var9.b;
                            int i411 = i5;
                            i14 = j00Var9.c;
                            if (i13 == i14) {
                            }
                            i10++;
                            arrayList = arrayList6;
                            i8 = i410;
                            i5 = i411;
                        }
                        arrayList2 = arrayList;
                        i11 = i8;
                        i12 = i5;
                        if (xtdVar != null) {
                            s19Var.m(xtdVar, Integer.valueOf(i7), Integer.valueOf(i9));
                        }
                        i7 = i9;
                    }
                    i8 = i11 + 1;
                    xtdVar = xtdVar;
                    arrayList = arrayList2;
                    i5 = i12;
                }
            } else if (!arrayList.isEmpty()) {
                xtd xtdVar9 = (xtd) ((j00) arrayList.get(0)).a;
                s19Var.m(xtdVar != null ? xtdVar.d(xtdVar9) : xtdVar9, Integer.valueOf(((j00) arrayList.get(0)).b), Integer.valueOf(((j00) arrayList.get(0)).c));
            }
            size5 = list3.size();
            i15 = 0;
            z2 = false;
            while (i15 < size5) {
                j00Var2 = (j00) list3.get(i15);
                obj3 = j00Var2.a;
                if (obj3 instanceof xtd) {
                    i29 = j00Var2.b;
                    int i412 = j00Var2.c;
                    if (i29 >= 0) {
                        i27 = size5;
                        i28 = i15;
                        z2 = z2;
                        spannable2 = spannableString;
                        z2 = z2;
                    } else {
                        i27 = size5;
                        i28 = i15;
                        z2 = z2;
                        spannable2 = spannableString;
                        z2 = z2;
                    }
                } else {
                    i27 = size5;
                    i28 = i15;
                    z2 = z2;
                    spannable2 = spannableString;
                    z2 = z2;
                }
                i15 = i28 + 1;
                size5 = i27;
                spannableString = spannable2;
                ty9Var2 = ty9Var2;
            }
            spannable = spannableString;
            ty9 ty9Var4 = ty9Var2;
            if (z2) {
                size8 = list3.size();
                i23 = 0;
                while (i23 < size8) {
                    j00Var = (j00) list3.get(i23);
                    g00Var = (g00) j00Var.a;
                    if (g00Var instanceof xtd) {
                        i26 = j00Var.b;
                        int i413 = j00Var.c;
                        if (i26 >= 0) {
                            i24 = size8;
                            i25 = i23;
                        } else {
                            i24 = size8;
                            i25 = i23;
                        }
                    } else {
                        i24 = size8;
                        i25 = i23;
                    }
                    i23 = i25 + 1;
                    size8 = i24;
                }
            }
            eteVar2 = ty9Var4.d;
            if (eteVar2 != null) {
                j = eteVar2.a;
                jB3 = wue.b(j);
                if (xue.a(jB3, 4294967296L)) {
                    fC = sw3Var2.Q0(j);
                } else if (xue.a(jB3, 8589934592L)) {
                    fC = wue.c(j) * textSize;
                } else {
                    fC = 0.0f;
                }
                f = fC;
            } else {
                f = 0.0f;
            }
            i16 = 0;
            while (i16 < size6) {
                j00 j00Var10 = (j00) list3.get(i16);
                obj2 = j00Var10.a;
                if (obj2 instanceof q51) {
                    q51Var = (q51) obj2;
                } else {
                    q51Var = null;
                }
                if (q51Var != null) {
                    fG = q6c.g(q51Var.a, textSize, sw3Var2);
                    i21 = size6;
                    i22 = i16;
                    float fG4 = q6c.g(q51Var.b, textSize, sw3Var2);
                    float fG5 = q6c.g(q51Var.c, textSize, sw3Var2);
                    if (Float.isNaN(fG)) {
                    }
                    i16 = i22 + 1;
                } else {
                    i21 = size6;
                    i22 = i16;
                }
                i16 = i22 + 1;
            }
            size7 = list4.size();
            i17 = 0;
            while (i17 < size7) {
                j00 j00Var11 = (j00) list4.get(i17);
                fea feaVar2 = (fea) j00Var11.a;
                int i414 = j00Var11.b;
                int i415 = j00Var11.c;
                while (i18 < r9) {
                    spannable.removeSpan((h9f) obj8);
                }
                long j14 = feaVar2.a;
                long j15 = feaVar2.b;
                float fC6 = wue.c(j14);
                int i416 = size7;
                jB = wue.b(feaVar2.a);
                int i417 = i17;
                if (xue.a(jB, 4294967296L)) {
                    i19 = 0;
                } else if (xue.a(jB, 8589934592L)) {
                    i19 = 1;
                } else {
                    i19 = 2;
                }
                sw3 sw3Var5 = sw3Var2;
                float fC7 = wue.c(j15);
                jB2 = wue.b(j15);
                if (xue.a(jB2, 4294967296L)) {
                    i20 = 0;
                } else if (xue.a(jB2, 8589934592L)) {
                    i20 = 1;
                } else {
                    i20 = 2;
                }
                nea neaVar2 = new nea(fC6, i19, fC7, i20, sw3Var5, 0);
                sw3Var2 = sw3Var5;
                spannable.setSpan(neaVar2, i414, i415, 33);
                size7 = i416;
                i17 = i417 + 1;
            }
            xtVar = this;
            charSequenceG = spannable;
        }
        xtVar = obj5;
        xtVar.v = charSequenceG;
        xtVar.w = new hv7(charSequenceG, xtVar.g, xtVar.z);
    }

    @Override // defpackage.qy9
    public final boolean e() {
        psd psdVar = this.x;
        if (psdVar != null ? psdVar.w() : false) {
            return true;
        }
        if (!this.y && qn4.C(this.b)) {
            kd9 kd9Var = nt4.a;
            kd9 kd9Var2 = nt4.a;
            h0e h0eVarG = (h0e) kd9Var2.b;
            if (h0eVarG == null) {
                if (jt4.d()) {
                    h0eVarG = kd9Var2.G();
                    kd9Var2.b = h0eVarG;
                } else {
                    h0eVarG = cn1.v;
                }
            }
            if (((Boolean) h0eVarG.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.qy9
    public final float g() {
        hv7 hv7Var = this.w;
        float f = hv7Var.e;
        TextPaint textPaint = hv7Var.b;
        if (!Float.isNaN(f)) {
            return hv7Var.e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = hv7Var.a;
        lineInstance.setText(new hx1(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, tq.g);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new z67(i, next, 1));
            } else {
                z67 z67Var = (z67) priorityQueue.peek();
                if (z67Var != null && z67Var.b - z67Var.a < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new z67(i, next, 1));
                }
            }
            i = next;
        }
        float desiredWidth = 0.0f;
        if (!priorityQueue.isEmpty()) {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                s8f.c();
                return 0.0f;
            }
            z67 z67Var2 = (z67) it.next();
            desiredWidth = Layout.getDesiredWidth(hv7Var.b(), z67Var2.a, z67Var2.b, textPaint);
            while (it.hasNext()) {
                z67 z67Var3 = (z67) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(hv7Var.b(), z67Var3.a, z67Var3.b, textPaint));
            }
        }
        hv7Var.e = desiredWidth;
        return desiredWidth;
    }

    @Override // defpackage.qy9
    public final float i() {
        return this.w.c();
    }
}
