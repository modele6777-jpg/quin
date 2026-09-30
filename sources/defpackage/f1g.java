package defpackage;

import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.SparseArray;
import android.widget.FrameLayout;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f1g extends FrameLayout implements h8e {
    public final am1 a;
    public final d1g b;
    public List c;
    public gm1 d;
    public float e;
    public float f;

    public f1g(Context context) {
        super(context, null);
        this.c = Collections.EMPTY_LIST;
        this.d = gm1.g;
        this.e = 0.0533f;
        this.f = 0.08f;
        am1 am1Var = new am1(context, 0);
        this.a = am1Var;
        d1g d1gVar = new d1g(context, null);
        this.b = d1gVar;
        d1gVar.setBackgroundColor(0);
        d1gVar.getSettings().setAllowContentAccess(false);
        addView(am1Var);
        addView(d1gVar);
    }

    @Override // defpackage.h8e
    public final void a(List list, gm1 gm1Var, float f, float f2) {
        this.d = gm1Var;
        this.e = f;
        this.f = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            t03 t03Var = (t03) list.get(i);
            if (t03Var.d != null) {
                arrayList.add(t03Var);
            } else {
                arrayList2.add(t03Var);
            }
        }
        if (!this.c.isEmpty() || !arrayList2.isEmpty()) {
            this.c = arrayList2;
            c();
        }
        this.a.a(arrayList, gm1Var, f, f2);
        invalidate();
    }

    public final String b(int i, float f) {
        float fN = jrb.n(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (fN == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(fN / getContext().getResources().getDisplayMetrics().density)};
        String str = pqf.a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0232  */
    /* JADX WARN: Code duplicated, block: B:104:0x0248  */
    /* JADX WARN: Code duplicated, block: B:106:0x024e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0260  */
    /* JADX WARN: Code duplicated, block: B:109:0x027e A[LOOP:2: B:108:0x027c->B:109:0x027e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x02a1 A[LOOP:3: B:111:0x029b->B:113:0x02a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:118:0x0300  */
    /* JADX WARN: Code duplicated, block: B:121:0x0312  */
    /* JADX WARN: Code duplicated, block: B:123:0x0318  */
    /* JADX WARN: Code duplicated, block: B:124:0x0330  */
    /* JADX WARN: Code duplicated, block: B:126:0x0336  */
    /* JADX WARN: Code duplicated, block: B:127:0x034c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0352  */
    /* JADX WARN: Code duplicated, block: B:130:0x0355  */
    /* JADX WARN: Code duplicated, block: B:132:0x0359  */
    /* JADX WARN: Code duplicated, block: B:134:0x0362  */
    /* JADX WARN: Code duplicated, block: B:135:0x0368  */
    /* JADX WARN: Code duplicated, block: B:137:0x0382  */
    /* JADX WARN: Code duplicated, block: B:139:0x0386  */
    /* JADX WARN: Code duplicated, block: B:140:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:142:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:144:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:145:0x03be  */
    /* JADX WARN: Code duplicated, block: B:146:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:148:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:150:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:152:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:155:0x03db  */
    /* JADX WARN: Code duplicated, block: B:156:0x03df  */
    /* JADX WARN: Code duplicated, block: B:157:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:158:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:160:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:162:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:164:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:167:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:168:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:169:0x0402  */
    /* JADX WARN: Code duplicated, block: B:170:0x0406  */
    /* JADX WARN: Code duplicated, block: B:172:0x040a  */
    /* JADX WARN: Code duplicated, block: B:173:0x040e  */
    /* JADX WARN: Code duplicated, block: B:175:0x0412  */
    /* JADX WARN: Code duplicated, block: B:177:0x0425  */
    /* JADX WARN: Code duplicated, block: B:180:0x0429  */
    /* JADX WARN: Code duplicated, block: B:181:0x042f  */
    /* JADX WARN: Code duplicated, block: B:183:0x0437  */
    /* JADX WARN: Code duplicated, block: B:185:0x043a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:186:0x043c  */
    /* JADX WARN: Code duplicated, block: B:188:0x043f  */
    /* JADX WARN: Code duplicated, block: B:189:0x0443  */
    /* JADX WARN: Code duplicated, block: B:190:0x0449  */
    /* JADX WARN: Code duplicated, block: B:191:0x044f  */
    /* JADX WARN: Code duplicated, block: B:192:0x0455  */
    /* JADX WARN: Code duplicated, block: B:195:0x0463  */
    /* JADX WARN: Code duplicated, block: B:196:0x0466  */
    /* JADX WARN: Code duplicated, block: B:199:0x0478  */
    /* JADX WARN: Code duplicated, block: B:211:0x0490  */
    /* JADX WARN: Code duplicated, block: B:241:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:243:0x050b  */
    /* JADX WARN: Code duplicated, block: B:246:0x0520  */
    /* JADX WARN: Code duplicated, block: B:252:0x054f  */
    /* JADX WARN: Code duplicated, block: B:255:0x057b A[LOOP:6: B:253:0x0575->B:255:0x057b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:259:0x0596 A[LOOP:7: B:257:0x0590->B:259:0x0596, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:265:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:267:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:271:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:275:0x060c  */
    /* JADX WARN: Code duplicated, block: B:277:0x060f  */
    /* JADX WARN: Code duplicated, block: B:281:0x0616  */
    /* JADX WARN: Code duplicated, block: B:284:0x062f  */
    /* JADX WARN: Code duplicated, block: B:287:0x064c  */
    /* JADX WARN: Code duplicated, block: B:289:0x0657  */
    /* JADX WARN: Code duplicated, block: B:291:0x065a  */
    /* JADX WARN: Code duplicated, block: B:292:0x065d  */
    /* JADX WARN: Code duplicated, block: B:293:0x0660  */
    /* JADX WARN: Code duplicated, block: B:295:0x067e  */
    /* JADX WARN: Code duplicated, block: B:313:0x052d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0173  */
    /* JADX WARN: Code duplicated, block: B:57:0x0184  */
    /* JADX WARN: Code duplicated, block: B:60:0x0191  */
    /* JADX WARN: Code duplicated, block: B:62:0x0198  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:73:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:74:0x01be  */
    /* JADX WARN: Code duplicated, block: B:77:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:91:0x01fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x020b  */
    /* JADX WARN: Instruction removed from duplicated block: B:113:0x02a1, please report this as an issue */
    public final void c() {
        String strConcat;
        String str;
        String str2;
        boolean z;
        float f;
        String str3;
        Layout.Alignment alignment;
        int i;
        Locale locale;
        int i2;
        Object obj;
        String str4;
        int i3;
        String str5;
        String str6;
        Object obj2;
        String str7;
        int i4;
        CharSequence charSequence;
        float f2;
        String str8;
        String str9;
        Spanned spanned;
        HashSet hashSet;
        BackgroundColorSpan[] backgroundColorSpanArr;
        int length;
        int i5;
        HashMap map;
        Iterator it;
        float f3;
        SparseArray sparseArray;
        Object[] spans;
        int length2;
        int i6;
        StringBuilder sb;
        int i7;
        int i8;
        ue1 ue1Var;
        Iterator it2;
        Iterator it3;
        Object obj3;
        boolean z2;
        boolean z3;
        Object[] objArr;
        tne tneVar;
        int i9;
        int i10;
        StringBuilder sb2;
        int i11;
        String str10;
        String strJ;
        int i12;
        int style;
        String family;
        AbsoluteSizeSpan absoluteSizeSpan;
        float size;
        String str11;
        int spanStart;
        int spanEnd;
        cud cudVar;
        cud cudVar2;
        float f4;
        String str12;
        Layout.Alignment alignment2;
        String str13;
        int i13;
        int i14;
        String str14;
        String str15;
        String str16;
        boolean z4;
        Locale locale2 = Locale.US;
        StringBuilder sb3 = new StringBuilder();
        String strZ = nk8.z(this.d.a);
        int i15 = 0;
        String strB = b(0, this.e);
        float f5 = 1.2f;
        Float fValueOf = Float.valueOf(1.2f);
        gm1 gm1Var = this.d;
        int i16 = gm1Var.d;
        int i17 = gm1Var.e;
        int i18 = 2;
        int i19 = 1;
        if (i16 == 1) {
            Object[] objArr2 = {nk8.z(i17)};
            String str17 = pqf.a;
            strConcat = String.format(locale2, "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", objArr2);
        } else if (i16 == 2) {
            String strZ2 = nk8.z(i17);
            String str18 = pqf.a;
            strConcat = "0.1em 0.12em 0.15em ".concat(strZ2);
        } else if (i16 == 3) {
            String strZ3 = nk8.z(i17);
            String str19 = pqf.a;
            strConcat = "0.06em 0.08em 0.15em ".concat(strZ3);
        } else if (i16 != 4) {
            strConcat = "unset";
        } else {
            String strZ4 = nk8.z(i17);
            String str20 = pqf.a;
            strConcat = "-0.05em -0.05em 0.15em ".concat(strZ4);
        }
        Object[] objArr3 = {strZ, strB, fValueOf, strConcat};
        String str21 = pqf.a;
        sb3.append(String.format(locale2, "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", objArr3));
        HashMap map2 = new HashMap();
        String strZ5 = nk8.z(this.d.b);
        String str22 = "background-color:";
        StringBuilder sb4 = new StringBuilder("background-color:");
        sb4.append(strZ5);
        String str23 = ";";
        sb4.append(";");
        map2.put(".default_bg,.default_bg *", sb4.toString());
        int i20 = 0;
        while (i20 < this.c.size()) {
            t03 t03Var = (t03) this.c.get(i20);
            float f6 = t03Var.h;
            int i21 = t03Var.p;
            float f7 = f6 != -3.4028235E38f ? f6 * 100.0f : 50.0f;
            float f8 = f5;
            int i22 = t03Var.i;
            int i23 = -100;
            int i24 = i22 != i19 ? i22 != i18 ? i15 : -100 : -50;
            float f9 = t03Var.e;
            if (f9 != -3.4028235E38f) {
                if (t03Var.f != i19) {
                    str = String.format(Locale.US, "%.2f%%", Float.valueOf(f9 * 100.0f));
                    int i25 = t03Var.g;
                    if (i21 == i19) {
                        i23 = -(i25 != i19 ? i25 != 2 ? 0 : -100 : -50);
                    } else {
                        i23 = i25 != i19 ? i25 != 2 ? 0 : -100 : -50;
                    }
                } else {
                    i24 = i24;
                    if (f9 >= 0.0f) {
                        str2 = String.format(Locale.US, "%.2fem", Float.valueOf(f9 * f8));
                        z = false;
                    } else {
                        str2 = String.format(Locale.US, "%.2fem", Float.valueOf(((-f9) - 1.0f) * f8));
                        z = true;
                    }
                    i23 = 0;
                }
                f = t03Var.j;
                if (f != -3.4028235E38f) {
                    str3 = String.format(locale2, "%.2f%%", Float.valueOf(f * 100.0f));
                } else {
                    str3 = "fit-content";
                }
                String str24 = str3;
                alignment = t03Var.b;
                if (alignment == null) {
                    locale = locale2;
                    obj = "center";
                    i2 = 2;
                } else {
                    i = e1g.a[alignment.ordinal()];
                    locale = locale2;
                    if (i != 1) {
                        i2 = 2;
                        if (i != 2) {
                            obj = "center";
                        } else {
                            obj = "end";
                        }
                    } else {
                        i2 = 2;
                        obj = "start";
                    }
                }
                if (i21 != 1) {
                    str4 = "vertical-rl";
                } else if (i21 != i2) {
                    str4 = "horizontal-tb";
                } else {
                    str4 = "vertical-lr";
                }
                String str25 = str4;
                String strB2 = b(t03Var.n, t03Var.o);
                if (t03Var.l) {
                    i3 = t03Var.m;
                } else {
                    i3 = this.d.c;
                }
                String strZ6 = nk8.z(i3);
                if (i21 != 1) {
                    if (z) {
                        str5 = "left";
                    } else {
                        str5 = "right";
                    }
                    str6 = str5;
                    obj2 = "top";
                } else if (i21 != 2) {
                    obj2 = "left";
                    str6 = z ? "bottom" : "top";
                } else {
                    if (z) {
                        str5 = "right";
                    } else {
                        str5 = "left";
                    }
                    str6 = str5;
                    obj2 = "top";
                }
                if (i21 != 2 || i21 == 1) {
                    str7 = "height";
                    i4 = i23;
                    i23 = i24;
                } else {
                    str7 = "width";
                    i4 = i24;
                }
                String str26 = str7;
                charSequence = t03Var.a;
                f2 = getContext().getResources().getDisplayMetrics().density;
                Pattern pattern = dud.a;
                int i26 = i4;
                int i27 = i20;
                str8 = "";
                if (charSequence == null) {
                    str9 = "start";
                    ue1Var = new ue1("", (char) 0);
                } else {
                    str9 = "start";
                    if (charSequence instanceof Spanned) {
                        str8 = "";
                        spanned = (Spanned) charSequence;
                        hashSet = new HashSet();
                        backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                        i5 = 0;
                        for (length = backgroundColorSpanArr.length; i5 < length; length = length) {
                            hashSet.add(Integer.valueOf(backgroundColorSpanArr[i5].getBackgroundColor()));
                            i5++;
                        }
                        map = new HashMap();
                        it = hashSet.iterator();
                        while (it.hasNext()) {
                            int iIntValue = ((Integer) it.next()).intValue();
                            String strE = tec.e(iIntValue, "bg_");
                            Iterator it4 = it;
                            String strM = tec.m(".", strE, ",.", strE, " *");
                            String strZ7 = nk8.z(iIntValue);
                            String str27 = pqf.a;
                            Locale locale3 = Locale.US;
                            map.put(strM, str22 + strZ7 + str23);
                            it = it4;
                            f7 = f7;
                        }
                        f3 = f7;
                        sparseArray = new SparseArray();
                        spans = spanned.getSpans(0, spanned.length(), Object.class);
                        i6 = 0;
                        for (length2 = spans.length; i6 < length2; length2 = length2) {
                            obj3 = spans[i6];
                            String str28 = str23;
                            z2 = obj3 instanceof StrikethroughSpan;
                            String str29 = null;
                            if (z2) {
                                z3 = z2;
                                strJ = "<span style='text-decoration:line-through;'>";
                            } else {
                                z3 = z2;
                                if (obj3 instanceof ForegroundColorSpan) {
                                    String strZ8 = nk8.z(((ForegroundColorSpan) obj3).getForegroundColor());
                                    String str30 = pqf.a;
                                    Locale locale4 = Locale.US;
                                    strJ = ib8.j("<span style='color:", strZ8, ";'>");
                                } else {
                                    str22 = str22;
                                    if (obj3 instanceof BackgroundColorSpan) {
                                        int backgroundColor = ((BackgroundColorSpan) obj3).getBackgroundColor();
                                        String str31 = pqf.a;
                                        Locale locale5 = Locale.US;
                                        objArr = spans;
                                        strJ = tec.f(backgroundColor, "<span class='bg_", "'>");
                                    } else {
                                        objArr = spans;
                                        if (obj3 instanceof tq6) {
                                            strJ = "<span style='text-combine-upright:all;'>";
                                        } else if (obj3 instanceof AbsoluteSizeSpan) {
                                            absoluteSizeSpan = (AbsoluteSizeSpan) obj3;
                                            if (absoluteSizeSpan.getDip()) {
                                                size = absoluteSizeSpan.getSize();
                                            } else {
                                                size = absoluteSizeSpan.getSize() / f2;
                                            }
                                            Object[] objArr4 = {Float.valueOf(size)};
                                            String str32 = pqf.a;
                                            strJ = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr4);
                                        } else if (obj3 instanceof RelativeSizeSpan) {
                                            Object[] objArr5 = {Float.valueOf(((RelativeSizeSpan) obj3).getSizeChange() * 100.0f)};
                                            String str33 = pqf.a;
                                            strJ = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr5);
                                        } else if (obj3 instanceof TypefaceSpan) {
                                            family = ((TypefaceSpan) obj3).getFamily();
                                            if (family != null) {
                                                String str34 = pqf.a;
                                                Locale locale6 = Locale.US;
                                                strJ = ib8.j("<span style='font-family:\"", family, "\";'>");
                                            } else {
                                                strJ = null;
                                            }
                                        } else if (obj3 instanceof StyleSpan) {
                                            style = ((StyleSpan) obj3).getStyle();
                                            if (style != 1) {
                                                strJ = "<b>";
                                            } else if (style != 2) {
                                                strJ = "<i>";
                                            } else if (style != 3) {
                                                strJ = null;
                                            } else {
                                                strJ = "<b><i>";
                                            }
                                        } else if (obj3 instanceof y7c) {
                                            i12 = ((y7c) obj3).b;
                                            if (i12 != -1) {
                                                strJ = "<ruby style='ruby-position:unset;'>";
                                            } else if (i12 != 1) {
                                                strJ = "<ruby style='ruby-position:over;'>";
                                            } else if (i12 != 2) {
                                                strJ = null;
                                            } else {
                                                strJ = "<ruby style='ruby-position:under;'>";
                                            }
                                        } else if (obj3 instanceof UnderlineSpan) {
                                            strJ = "<u>";
                                        } else if (obj3 instanceof tne) {
                                            tneVar = (tne) obj3;
                                            i9 = tneVar.a;
                                            i10 = tneVar.b;
                                            sb2 = new StringBuilder();
                                            if (i10 != 1) {
                                                i11 = 2;
                                                if (i10 == 2) {
                                                    sb2.append("open ");
                                                }
                                            } else {
                                                i11 = 2;
                                                sb2.append("filled ");
                                            }
                                            if (i9 != 0) {
                                                sb2.append("none");
                                            } else if (i9 != 1) {
                                                sb2.append("circle");
                                            } else if (i9 != i11) {
                                                sb2.append("dot");
                                            } else if (i9 != 3) {
                                                sb2.append("unset");
                                            } else {
                                                sb2.append("sesame");
                                            }
                                            String string = sb2.toString();
                                            if (tneVar.c != 2) {
                                                str10 = "over right";
                                            } else {
                                                str10 = "under left";
                                            }
                                            Object[] objArr6 = {string, str10};
                                            String str35 = pqf.a;
                                            strJ = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr6);
                                        } else {
                                            strJ = null;
                                        }
                                    }
                                }
                                if (z3 && !(obj3 instanceof ForegroundColorSpan) && !(obj3 instanceof BackgroundColorSpan) && !(obj3 instanceof tq6) && !(obj3 instanceof AbsoluteSizeSpan) && !(obj3 instanceof RelativeSizeSpan) && !(obj3 instanceof tne)) {
                                    if (obj3 instanceof TypefaceSpan) {
                                        str11 = ((TypefaceSpan) obj3).getFamily() != null ? "</span>" : null;
                                    } else {
                                        if (obj3 instanceof StyleSpan) {
                                            int style2 = ((StyleSpan) obj3).getStyle();
                                            if (style2 == 1) {
                                                str29 = "</b>";
                                            } else if (style2 == 2) {
                                                str29 = "</i>";
                                            } else if (style2 == 3) {
                                                str29 = "</i></b>";
                                            }
                                        } else if (obj3 instanceof y7c) {
                                            str29 = "<rt>" + dud.a(((y7c) obj3).a) + "</rt></ruby>";
                                        } else if (obj3 instanceof UnderlineSpan) {
                                            str29 = "</u>";
                                        }
                                        str11 = str29;
                                    }
                                }
                                spanStart = spanned.getSpanStart(obj3);
                                spanEnd = spanned.getSpanEnd(obj3);
                                if (strJ != null) {
                                    str11.getClass();
                                    bud budVar = new bud(strJ, spanStart, str11, spanEnd);
                                    cudVar = (cud) sparseArray.get(spanStart);
                                    if (cudVar == null) {
                                        cudVar = new cud();
                                        sparseArray.put(spanStart, cudVar);
                                    }
                                    cudVar.a.add(budVar);
                                    cudVar2 = (cud) sparseArray.get(spanEnd);
                                    if (cudVar2 == null) {
                                        cudVar2 = new cud();
                                        sparseArray.put(spanEnd, cudVar2);
                                    }
                                    cudVar2.b.add(budVar);
                                }
                                i6++;
                                spans = objArr;
                                str23 = str28;
                                str22 = str22;
                            }
                            objArr = spans;
                            str11 = z3 ? "</span>" : "</span>";
                            spanStart = spanned.getSpanStart(obj3);
                            spanEnd = spanned.getSpanEnd(obj3);
                            if (strJ != null) {
                                str11.getClass();
                                bud budVar2 = new bud(strJ, spanStart, str11, spanEnd);
                                cudVar = (cud) sparseArray.get(spanStart);
                                if (cudVar == null) {
                                    cudVar = new cud();
                                    sparseArray.put(spanStart, cudVar);
                                }
                                cudVar.a.add(budVar2);
                                cudVar2 = (cud) sparseArray.get(spanEnd);
                                if (cudVar2 == null) {
                                    cudVar2 = new cud();
                                    sparseArray.put(spanEnd, cudVar2);
                                }
                                cudVar2.b.add(budVar2);
                            }
                            i6++;
                            spans = objArr;
                            str23 = str28;
                            str22 = str22;
                        }
                        str23 = str23;
                        str22 = str22;
                        sb = new StringBuilder(spanned.length());
                        i7 = 0;
                        i8 = 0;
                        while (i7 < sparseArray.size()) {
                            int iKeyAt = sparseArray.keyAt(i7);
                            sb.append(dud.a(spanned.subSequence(i8, iKeyAt)));
                            cud cudVar3 = (cud) sparseArray.get(iKeyAt);
                            ArrayList arrayList = cudVar3.b;
                            ArrayList arrayList2 = cudVar3.a;
                            SparseArray sparseArray2 = sparseArray;
                            Collections.sort(arrayList, bud.f);
                            it2 = cudVar3.b.iterator();
                            while (it2.hasNext()) {
                                sb.append(((bud) it2.next()).d);
                            }
                            Collections.sort(arrayList2, bud.e);
                            it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                sb.append(((bud) it3.next()).c);
                            }
                            i7++;
                            i8 = iKeyAt;
                            sparseArray = sparseArray2;
                        }
                        sb.append(dud.a(spanned.subSequence(i8, spanned.length())));
                        ue1Var = new ue1(sb.toString(), (char) 0);
                    } else {
                        ue1Var = new ue1(dud.a(charSequence), (char) 0);
                    }
                    for (String str36 : map2.keySet()) {
                        str16 = (String) map2.put(str36, (String) map2.get(str36));
                        if (str16 != null || str16.equals(map2.get(str36))) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        pa7.J(z4);
                    }
                    Integer numValueOf = Integer.valueOf(i27);
                    Float fValueOf2 = Float.valueOf(f3);
                    Integer numValueOf2 = Integer.valueOf(i26);
                    Integer numValueOf3 = Integer.valueOf(i23);
                    f4 = t03Var.q;
                    if (f4 != 0.0f) {
                        if (i21 != 2 || i21 == 1) {
                            str15 = "skewY";
                        } else {
                            str15 = "skewX";
                        }
                        Object[] objArr7 = {str15, Float.valueOf(f4)};
                        String str37 = pqf.a;
                        str12 = String.format(Locale.US, "%s(%.2fdeg)", objArr7);
                    } else {
                        str12 = str8;
                    }
                    sb3.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf, obj2, fValueOf2, str6, str2, str26, str24, obj, str25, strB2, strZ6, numValueOf2, numValueOf3, str12));
                    sb3.append("<span class='default_bg'>");
                    alignment2 = t03Var.c;
                    str13 = ue1Var.a;
                    if (alignment2 != null) {
                        i14 = e1g.a[alignment2.ordinal()];
                        if (i14 != 1) {
                            i13 = 2;
                            if (i14 != 2) {
                                str14 = "center";
                            } else {
                                str14 = "end";
                            }
                        } else {
                            i13 = 2;
                            str14 = str9;
                        }
                        sb3.append("<span style='display:inline-block; text-align:" + str14 + ";'>");
                        sb3.append(str13);
                        sb3.append("</span>");
                    } else {
                        i13 = 2;
                        sb3.append(str13);
                    }
                    sb3.append("</span></div>");
                    i20 = i27 + 1;
                    i18 = i13;
                    locale2 = locale;
                    f5 = f8;
                    str23 = str23;
                    str22 = str22;
                    i15 = 0;
                    i19 = 1;
                }
                f3 = f7;
                while (r4.hasNext()) {
                    str16 = (String) map2.put(str36, (String) map2.get(str36));
                    if (str16 != null) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    pa7.J(z4);
                }
                Integer numValueOf4 = Integer.valueOf(i27);
                Float fValueOf3 = Float.valueOf(f3);
                Integer numValueOf5 = Integer.valueOf(i26);
                Integer numValueOf6 = Integer.valueOf(i23);
                f4 = t03Var.q;
                if (f4 != 0.0f) {
                    if (i21 != 2) {
                        str15 = "skewY";
                    } else {
                        str15 = "skewY";
                    }
                    Object[] objArr8 = {str15, Float.valueOf(f4)};
                    String str38 = pqf.a;
                    str12 = String.format(Locale.US, "%s(%.2fdeg)", objArr8);
                } else {
                    str12 = str8;
                }
                sb3.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf4, obj2, fValueOf3, str6, str2, str26, str24, obj, str25, strB2, strZ6, numValueOf5, numValueOf6, str12));
                sb3.append("<span class='default_bg'>");
                alignment2 = t03Var.c;
                str13 = ue1Var.a;
                if (alignment2 != null) {
                    i14 = e1g.a[alignment2.ordinal()];
                    if (i14 != 1) {
                        i13 = 2;
                        if (i14 != 2) {
                            str14 = "center";
                        } else {
                            str14 = "end";
                        }
                    } else {
                        i13 = 2;
                        str14 = str9;
                    }
                    sb3.append("<span style='display:inline-block; text-align:" + str14 + ";'>");
                    sb3.append(str13);
                    sb3.append("</span>");
                } else {
                    i13 = 2;
                    sb3.append(str13);
                }
                sb3.append("</span></div>");
                i20 = i27 + 1;
                i18 = i13;
                locale2 = locale;
                f5 = f8;
                str23 = str23;
                str22 = str22;
                i15 = 0;
                i19 = 1;
            } else {
                str = String.format(Locale.US, "%.2f%%", Float.valueOf((1.0f - this.f) * 100.0f));
            }
            str2 = str;
            z = false;
            f = t03Var.j;
            if (f != -3.4028235E38f) {
                str3 = String.format(locale2, "%.2f%%", Float.valueOf(f * 100.0f));
            } else {
                str3 = "fit-content";
            }
            String str210 = str3;
            alignment = t03Var.b;
            if (alignment == null) {
                locale = locale2;
                obj = "center";
                i2 = 2;
            } else {
                i = e1g.a[alignment.ordinal()];
                locale = locale2;
                if (i != 1) {
                    i2 = 2;
                    if (i != 2) {
                        obj = "center";
                    } else {
                        obj = "end";
                    }
                } else {
                    i2 = 2;
                    obj = "start";
                }
            }
            if (i21 != 1) {
                str4 = "vertical-rl";
            } else if (i21 != i2) {
                str4 = "horizontal-tb";
            } else {
                str4 = "vertical-lr";
            }
            String str211 = str4;
            String strB3 = b(t03Var.n, t03Var.o);
            if (t03Var.l) {
                i3 = t03Var.m;
            } else {
                i3 = this.d.c;
            }
            String strZ9 = nk8.z(i3);
            if (i21 != 1) {
                if (z) {
                    str5 = "left";
                } else {
                    str5 = "right";
                }
                str6 = str5;
                obj2 = "top";
            } else if (i21 != 2) {
                obj2 = "left";
                str6 = z ? "bottom" : "top";
            } else {
                if (z) {
                    str5 = "right";
                } else {
                    str5 = "left";
                }
                str6 = str5;
                obj2 = "top";
            }
            if (i21 != 2) {
                str7 = "height";
                i4 = i23;
                i23 = i24;
            } else {
                str7 = "height";
                i4 = i23;
                i23 = i24;
            }
            String str212 = str7;
            charSequence = t03Var.a;
            f2 = getContext().getResources().getDisplayMetrics().density;
            Pattern pattern2 = dud.a;
            int i28 = i4;
            int i29 = i20;
            str8 = "";
            if (charSequence == null) {
                str9 = "start";
                ue1Var = new ue1("", (char) 0);
            } else {
                str9 = "start";
                if (charSequence instanceof Spanned) {
                    ue1Var = new ue1(dud.a(charSequence), (char) 0);
                } else {
                    str8 = "";
                    spanned = (Spanned) charSequence;
                    hashSet = new HashSet();
                    backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                    i5 = 0;
                    while (i5 < length) {
                        hashSet.add(Integer.valueOf(backgroundColorSpanArr[i5].getBackgroundColor()));
                        i5++;
                    }
                    map = new HashMap();
                    it = hashSet.iterator();
                    while (it.hasNext()) {
                        int iIntValue2 = ((Integer) it.next()).intValue();
                        String strE2 = tec.e(iIntValue2, "bg_");
                        Iterator it5 = it;
                        String strM2 = tec.m(".", strE2, ",.", strE2, " *");
                        String strZ10 = nk8.z(iIntValue2);
                        String str213 = pqf.a;
                        Locale locale7 = Locale.US;
                        map.put(strM2, str22 + strZ10 + str23);
                        it = it5;
                        f7 = f7;
                    }
                    f3 = f7;
                    sparseArray = new SparseArray();
                    spans = spanned.getSpans(0, spanned.length(), Object.class);
                    i6 = 0;
                    while (i6 < length2) {
                        obj3 = spans[i6];
                        String str214 = str23;
                        z2 = obj3 instanceof StrikethroughSpan;
                        String str215 = null;
                        if (z2) {
                            z3 = z2;
                            strJ = "<span style='text-decoration:line-through;'>";
                        } else {
                            z3 = z2;
                            if (obj3 instanceof ForegroundColorSpan) {
                                String strZ11 = nk8.z(((ForegroundColorSpan) obj3).getForegroundColor());
                                String str39 = pqf.a;
                                Locale locale8 = Locale.US;
                                strJ = ib8.j("<span style='color:", strZ11, ";'>");
                            } else {
                                str22 = str22;
                                if (obj3 instanceof BackgroundColorSpan) {
                                    int backgroundColor2 = ((BackgroundColorSpan) obj3).getBackgroundColor();
                                    String str310 = pqf.a;
                                    Locale locale9 = Locale.US;
                                    objArr = spans;
                                    strJ = tec.f(backgroundColor2, "<span class='bg_", "'>");
                                } else {
                                    objArr = spans;
                                    if (obj3 instanceof tq6) {
                                        strJ = "<span style='text-combine-upright:all;'>";
                                    } else if (obj3 instanceof AbsoluteSizeSpan) {
                                        absoluteSizeSpan = (AbsoluteSizeSpan) obj3;
                                        if (absoluteSizeSpan.getDip()) {
                                            size = absoluteSizeSpan.getSize();
                                        } else {
                                            size = absoluteSizeSpan.getSize() / f2;
                                        }
                                        Object[] objArr9 = {Float.valueOf(size)};
                                        String str311 = pqf.a;
                                        strJ = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr9);
                                    } else if (obj3 instanceof RelativeSizeSpan) {
                                        Object[] objArr10 = {Float.valueOf(((RelativeSizeSpan) obj3).getSizeChange() * 100.0f)};
                                        String str312 = pqf.a;
                                        strJ = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr10);
                                    } else if (obj3 instanceof TypefaceSpan) {
                                        family = ((TypefaceSpan) obj3).getFamily();
                                        if (family != null) {
                                            String str313 = pqf.a;
                                            Locale locale10 = Locale.US;
                                            strJ = ib8.j("<span style='font-family:\"", family, "\";'>");
                                        } else {
                                            strJ = null;
                                        }
                                    } else if (obj3 instanceof StyleSpan) {
                                        style = ((StyleSpan) obj3).getStyle();
                                        if (style != 1) {
                                            strJ = "<b>";
                                        } else if (style != 2) {
                                            strJ = "<i>";
                                        } else if (style != 3) {
                                            strJ = null;
                                        } else {
                                            strJ = "<b><i>";
                                        }
                                    } else if (obj3 instanceof y7c) {
                                        i12 = ((y7c) obj3).b;
                                        if (i12 != -1) {
                                            strJ = "<ruby style='ruby-position:unset;'>";
                                        } else if (i12 != 1) {
                                            strJ = "<ruby style='ruby-position:over;'>";
                                        } else if (i12 != 2) {
                                            strJ = null;
                                        } else {
                                            strJ = "<ruby style='ruby-position:under;'>";
                                        }
                                    } else if (obj3 instanceof UnderlineSpan) {
                                        strJ = "<u>";
                                    } else if (obj3 instanceof tne) {
                                        tneVar = (tne) obj3;
                                        i9 = tneVar.a;
                                        i10 = tneVar.b;
                                        sb2 = new StringBuilder();
                                        if (i10 != 1) {
                                            i11 = 2;
                                            if (i10 == 2) {
                                                sb2.append("open ");
                                            }
                                        } else {
                                            i11 = 2;
                                            sb2.append("filled ");
                                        }
                                        if (i9 != 0) {
                                            sb2.append("none");
                                        } else if (i9 != 1) {
                                            sb2.append("circle");
                                        } else if (i9 != i11) {
                                            sb2.append("dot");
                                        } else if (i9 != 3) {
                                            sb2.append("unset");
                                        } else {
                                            sb2.append("sesame");
                                        }
                                        String string2 = sb2.toString();
                                        if (tneVar.c != 2) {
                                            str10 = "over right";
                                        } else {
                                            str10 = "under left";
                                        }
                                        Object[] objArr11 = {string2, str10};
                                        String str314 = pqf.a;
                                        strJ = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr11);
                                    } else {
                                        strJ = null;
                                    }
                                }
                            }
                            if (z3) {
                            }
                            spanStart = spanned.getSpanStart(obj3);
                            spanEnd = spanned.getSpanEnd(obj3);
                            if (strJ != null) {
                                str11.getClass();
                                bud budVar3 = new bud(strJ, spanStart, str11, spanEnd);
                                cudVar = (cud) sparseArray.get(spanStart);
                                if (cudVar == null) {
                                    cudVar = new cud();
                                    sparseArray.put(spanStart, cudVar);
                                }
                                cudVar.a.add(budVar3);
                                cudVar2 = (cud) sparseArray.get(spanEnd);
                                if (cudVar2 == null) {
                                    cudVar2 = new cud();
                                    sparseArray.put(spanEnd, cudVar2);
                                }
                                cudVar2.b.add(budVar3);
                            }
                            i6++;
                            spans = objArr;
                            str23 = str214;
                            str22 = str22;
                        }
                        objArr = spans;
                        if (z3) {
                        }
                        spanStart = spanned.getSpanStart(obj3);
                        spanEnd = spanned.getSpanEnd(obj3);
                        if (strJ != null) {
                            str11.getClass();
                            bud budVar4 = new bud(strJ, spanStart, str11, spanEnd);
                            cudVar = (cud) sparseArray.get(spanStart);
                            if (cudVar == null) {
                                cudVar = new cud();
                                sparseArray.put(spanStart, cudVar);
                            }
                            cudVar.a.add(budVar4);
                            cudVar2 = (cud) sparseArray.get(spanEnd);
                            if (cudVar2 == null) {
                                cudVar2 = new cud();
                                sparseArray.put(spanEnd, cudVar2);
                            }
                            cudVar2.b.add(budVar4);
                        }
                        i6++;
                        spans = objArr;
                        str23 = str214;
                        str22 = str22;
                    }
                    str23 = str23;
                    str22 = str22;
                    sb = new StringBuilder(spanned.length());
                    i7 = 0;
                    i8 = 0;
                    while (i7 < sparseArray.size()) {
                        int iKeyAt2 = sparseArray.keyAt(i7);
                        sb.append(dud.a(spanned.subSequence(i8, iKeyAt2)));
                        cud cudVar4 = (cud) sparseArray.get(iKeyAt2);
                        ArrayList arrayList3 = cudVar4.b;
                        ArrayList arrayList4 = cudVar4.a;
                        SparseArray sparseArray3 = sparseArray;
                        Collections.sort(arrayList3, bud.f);
                        it2 = cudVar4.b.iterator();
                        while (it2.hasNext()) {
                            sb.append(((bud) it2.next()).d);
                        }
                        Collections.sort(arrayList4, bud.e);
                        it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            sb.append(((bud) it3.next()).c);
                        }
                        i7++;
                        i8 = iKeyAt2;
                        sparseArray = sparseArray3;
                    }
                    sb.append(dud.a(spanned.subSequence(i8, spanned.length())));
                    ue1Var = new ue1(sb.toString(), (char) 0);
                }
                while (r4.hasNext()) {
                    str16 = (String) map2.put(str36, (String) map2.get(str36));
                    if (str16 != null) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    pa7.J(z4);
                }
                Integer numValueOf7 = Integer.valueOf(i29);
                Float fValueOf4 = Float.valueOf(f3);
                Integer numValueOf8 = Integer.valueOf(i28);
                Integer numValueOf9 = Integer.valueOf(i23);
                f4 = t03Var.q;
                if (f4 != 0.0f) {
                    if (i21 != 2) {
                        str15 = "skewY";
                    } else {
                        str15 = "skewY";
                    }
                    Object[] objArr12 = {str15, Float.valueOf(f4)};
                    String str315 = pqf.a;
                    str12 = String.format(Locale.US, "%s(%.2fdeg)", objArr12);
                } else {
                    str12 = str8;
                }
                sb3.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf7, obj2, fValueOf4, str6, str2, str212, str210, obj, str211, strB3, strZ9, numValueOf8, numValueOf9, str12));
                sb3.append("<span class='default_bg'>");
                alignment2 = t03Var.c;
                str13 = ue1Var.a;
                if (alignment2 != null) {
                    i14 = e1g.a[alignment2.ordinal()];
                    if (i14 != 1) {
                        i13 = 2;
                        if (i14 != 2) {
                            str14 = "center";
                        } else {
                            str14 = "end";
                        }
                    } else {
                        i13 = 2;
                        str14 = str9;
                    }
                    sb3.append("<span style='display:inline-block; text-align:" + str14 + ";'>");
                    sb3.append(str13);
                    sb3.append("</span>");
                } else {
                    i13 = 2;
                    sb3.append(str13);
                }
                sb3.append("</span></div>");
                i20 = i29 + 1;
                i18 = i13;
                locale2 = locale;
                f5 = f8;
                str23 = str23;
                str22 = str22;
                i15 = 0;
                i19 = 1;
            }
            f3 = f7;
            while (r4.hasNext()) {
                str16 = (String) map2.put(str36, (String) map2.get(str36));
                if (str16 != null) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                pa7.J(z4);
            }
            Integer numValueOf10 = Integer.valueOf(i29);
            Float fValueOf5 = Float.valueOf(f3);
            Integer numValueOf11 = Integer.valueOf(i28);
            Integer numValueOf12 = Integer.valueOf(i23);
            f4 = t03Var.q;
            if (f4 != 0.0f) {
                if (i21 != 2) {
                    str15 = "skewY";
                } else {
                    str15 = "skewY";
                }
                Object[] objArr13 = {str15, Float.valueOf(f4)};
                String str316 = pqf.a;
                str12 = String.format(Locale.US, "%s(%.2fdeg)", objArr13);
            } else {
                str12 = str8;
            }
            sb3.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf10, obj2, fValueOf5, str6, str2, str212, str210, obj, str211, strB3, strZ9, numValueOf11, numValueOf12, str12));
            sb3.append("<span class='default_bg'>");
            alignment2 = t03Var.c;
            str13 = ue1Var.a;
            if (alignment2 != null) {
                i14 = e1g.a[alignment2.ordinal()];
                if (i14 != 1) {
                    i13 = 2;
                    if (i14 != 2) {
                        str14 = "center";
                    } else {
                        str14 = "end";
                    }
                } else {
                    i13 = 2;
                    str14 = str9;
                }
                sb3.append("<span style='display:inline-block; text-align:" + str14 + ";'>");
                sb3.append(str13);
                sb3.append("</span>");
            } else {
                i13 = 2;
                sb3.append(str13);
            }
            sb3.append("</span></div>");
            i20 = i29 + 1;
            i18 = i13;
            locale2 = locale;
            f5 = f8;
            str23 = str23;
            str22 = str22;
            i15 = 0;
            i19 = 1;
        }
        sb3.append("</div></body></html>");
        StringBuilder sb5 = new StringBuilder();
        sb5.append("<html><head><style>");
        for (String str40 : map2.keySet()) {
            sb5.append(str40);
            sb5.append("{");
            sb5.append((String) map2.get(str40));
            sb5.append("}");
        }
        sb5.append("</style></head>");
        sb3.insert(0, (CharSequence) sb5);
        this.b.loadData(Base64.encodeToString(sb3.toString().getBytes(StandardCharsets.UTF_8), 1), "text/html", "base64");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.c.isEmpty()) {
            return;
        }
        c();
    }
}
