package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.DashPathEffect;
import android.util.Base64;
import android.util.Xml;
import android.view.DragEvent;
import android.view.View;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.personality.ShortCard;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rxg implements stc {
    public static final dd2 a = new dd2(new ym0(21), false, -609046494);
    public static final dd2 b = new dd2(new a7(12), false, -1230553282);
    public static final dd2 c = new dd2(new a7(13), false, -1563223641);
    public static final dd2 d = new dd2(new md2(29), false, 153240875);
    public static final dd2 e = new dd2(new xd2(7), false, 1836039802);
    public static final dd2 f = new dd2(new de2(12), false, 1802436810);
    public static final pb3 g = new pb3();
    public static final zea v = new zea(13);
    public static final hd2 w = new hd2(5);
    public static final znd x = new znd(25);
    public static gx6 y;

    public static final int A(ga7 ga7Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        float f2;
        if (i6 == 1) {
            f2 = cn1.I0;
        } else {
            f2 = i6 == 2 ? cn1.N0 : cn1.L0;
        }
        int iMax = Math.max(Math.max(kl2.i(j), ga7Var.D0(f2)), Math.max(i, Math.max(i3 + i4 + i5, i2)) + i7);
        int iG = kl2.g(j);
        return iMax > iG ? iG : iMax;
    }

    public static int B(long j) {
        int i = (int) j;
        pa7.x(j, ((long) i) == j, "Out of range: %s");
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0040  */
    public static final c78 C(we7 we7Var, boolean z) throws IllegalAccessException, InvocationTargetException {
        boolean z2;
        String strE;
        we7 we7Var2 = we7Var;
        Member member = we7Var2.d;
        c78 c78VarW = t72.w();
        c78 c78Var = null;
        if (!(we7Var2 instanceof ue7) && !Modifier.isStatic(member.getModifiers())) {
            ho7.y(member, "Only Java constructors and static functions are supported for now: ");
            return null;
        }
        if (member instanceof Constructor) {
            Class declaringClass = ((Constructor) member).getDeclaringClass();
            declaringClass.getClass();
            if (declaringClass.getDeclaringClass() == null || Modifier.isStatic(declaringClass.getModifiers())) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        Type[] typeArrY = we7Var2.y();
        if (z && z2) {
            Class<?> declaringClass2 = ((Constructor) member).getDeclaringClass().getDeclaringClass();
            declaringClass2.getClass();
            c78VarW.add(new v57(we7Var2, job.a.b(declaringClass2)));
        }
        ArrayList arrayListA = hj6.K0.A(member);
        int size = arrayListA != null ? arrayListA.size() - typeArrY.length : 0;
        TypeVariable[] typeVariableArrF = we7Var2.F();
        List typeParameters = we7Var2.getTypeParameters();
        typeVariableArrF.getClass();
        typeParameters.getClass();
        int length = typeVariableArrF.length;
        ArrayList arrayList = new ArrayList(Math.min(t72.u(typeParameters, 10), length));
        int i = 0;
        for (Object obj : typeParameters) {
            if (i >= length) {
                break;
            }
            arrayList.add(new iy9(typeVariableArrF[i], obj));
            i++;
            c78Var = c78Var;
        }
        c78 c78Var2 = c78Var;
        Map mapW = bm8.W(arrayList);
        int length2 = typeArrY.length;
        int i2 = 0;
        while (i2 < length2) {
            Type type = typeArrY[i2];
            if ((i2 != 0 || !z2 || typeArrY.length != we7Var2.G().length) && (i2 >= 2 || !member.getDeclaringClass().isEnum() || !(member instanceof Constructor) || typeArrY.length != we7Var2.G().length)) {
                if (arrayListA != null) {
                    strE = (String) s72.y0(i2 + size, arrayListA);
                    if (strE == null) {
                        yg5.f(i2, we7Var2.getName(), type, member, size);
                        return c78Var2;
                    }
                } else {
                    strE = tec.e(i2, "arg");
                }
                c78VarW.add(new bf7(we7Var2, strE, vpf.V(type, mapW, vpf.J(member) ? b8f.a : b8f.c, false, false, null, 28), c78VarW.c(), i2 == typeArrY.length - 1 && we7Var2.H()));
            }
            i2++;
            we7Var2 = we7Var;
        }
        return c78VarW.n();
    }

    public static Object D(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            qc0.j(tec.e(i, "must be power of 2 between 2^1 and 2^30: "));
            return null;
        }
        if (i <= 256) {
            return new byte[i];
        }
        return i <= 65536 ? new short[i] : new int[i];
    }

    public static final jgf E(tjd tjdVar, tjd tjdVar2) {
        tjdVar.getClass();
        tjdVar2.getClass();
        return tjdVar.equals(tjdVar2) ? tjdVar : new cj5(tjdVar, tjdVar2);
    }

    public static int F(byte b2, byte b3, byte b4, byte b5) {
        return (b2 << 24) | ((b3 & 255) << 16) | ((b4 & 255) << 8) | (b5 & 255);
    }

    public static final long G(fj4 fj4Var) {
        DragEvent dragEvent = fj4Var.a;
        float x2 = dragEvent.getX();
        float y2 = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x2)) << 32) | (((long) Float.floatToRawIntBits(y2)) & 4294967295L);
    }

    public static final gx6 H() {
        gx6 gx6Var = y;
        if (gx6Var != null) {
            return gx6Var;
        }
        fx6 fx6Var = new fx6("Filled.Refresh", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = msf.a;
        dtd dtdVar = new dtd(y72.b);
        s71 s71Var = new s71(1);
        s71Var.p(17.65f, 6.35f);
        s71Var.i(16.2f, 4.9f, 14.21f, 4.0f, 12.0f, 4.0f);
        s71Var.j(-4.42f, 0.0f, -7.99f, 3.58f, -7.99f, 8.0f);
        s71Var.r(3.57f, 8.0f, 7.99f, 8.0f);
        s71Var.j(3.73f, 0.0f, 6.84f, -2.55f, 7.73f, -6.0f);
        s71Var.m(-2.08f);
        s71Var.j(-0.82f, 2.33f, -3.04f, 4.0f, -5.65f, 4.0f);
        s71Var.j(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        s71Var.r(2.69f, -6.0f, 6.0f, -6.0f);
        s71Var.j(1.66f, 0.0f, 3.14f, 0.69f, 4.22f, 1.78f);
        s71Var.n(13.0f, 11.0f);
        s71Var.m(7.0f);
        s71Var.s(4.0f);
        s71Var.o(-2.35f, 2.35f);
        s71Var.h();
        fx6.a(fx6Var, s71Var.b, dtdVar, 1.0f, 1.0f, 2, 1.0f);
        gx6 gx6VarB = fx6Var.b();
        y = gx6VarB;
        return gx6VarB;
    }

    public static int I(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x0067 A[EDGE_INSN: B:109:0x0067->B:22:0x0067 BREAK  A[LOOP:2: B:16:0x0049->B:20:0x005a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044  */
    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    /* JADX WARN: Code duplicated, block: B:20:0x005a A[LOOP:2: B:16:0x0049->B:20:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:54:0x0102  */
    /* JADX WARN: Code duplicated, block: B:56:0x010b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0113  */
    /* JADX WARN: Code duplicated, block: B:59:0x0119  */
    /* JADX WARN: Code duplicated, block: B:61:0x0121  */
    /* JADX WARN: Code duplicated, block: B:63:0x012a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0133  */
    /* JADX WARN: Code duplicated, block: B:66:0x0138  */
    /* JADX WARN: Code duplicated, block: B:68:0x0140  */
    /* JADX WARN: Code duplicated, block: B:69:0x0146  */
    /* JADX WARN: Code duplicated, block: B:71:0x014e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0154  */
    /* JADX WARN: Code duplicated, block: B:74:0x015c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0162  */
    /* JADX WARN: Code duplicated, block: B:77:0x016a  */
    /* JADX WARN: Code duplicated, block: B:78:0x0172  */
    /* JADX WARN: Code duplicated, block: B:80:0x017a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0180  */
    /* JADX WARN: Code duplicated, block: B:83:0x0189  */
    /* JADX WARN: Code duplicated, block: B:84:0x0190  */
    /* JADX WARN: Code duplicated, block: B:86:0x0198  */
    /* JADX WARN: Code duplicated, block: B:87:0x019f  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a7  */
    public static c81 K(si6 si6Var) {
        int i;
        int length;
        int length2;
        int i2;
        String string;
        String string2;
        si6 si6Var2 = si6Var;
        int size = si6Var2.size();
        int i3 = 0;
        boolean z = true;
        String str = null;
        boolean z2 = false;
        boolean z3 = false;
        int iO = -1;
        int iO2 = -1;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int iO3 = -1;
        int iO4 = -1;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (i3 < size) {
            String strI = xdc.i(si6Var2, i3);
            String strK = xdc.k(si6Var2, i3);
            if (strI.equalsIgnoreCase("Cache-Control")) {
                if (str == null) {
                    str = strK;
                }
                i = 0;
                while (i < strK.length()) {
                    length = strK.length();
                    length2 = i;
                    while (true) {
                        if (length2 < length) {
                            i2 = size;
                            length2 = strK.length();
                            break;
                        }
                        i2 = size;
                        if (v4e.G("=,;", strK.charAt(length2))) {
                            break;
                        }
                        length2++;
                        size = i2;
                    }
                    string = v4e.o0(strK.substring(i, length2)).toString();
                    if (length2 != strK.length() || strK.charAt(length2) == ',' || strK.charAt(length2) == ';') {
                        i = length2 + 1;
                        string2 = null;
                    } else {
                        int length3 = length2 + 1;
                        byte[] bArr = ieg.a;
                        int length4 = strK.length();
                        while (true) {
                            if (length3 < length4) {
                                char cCharAt = strK.charAt(length3);
                                if (cCharAt != ' ' && cCharAt != '\t') {
                                    break;
                                }
                                length3++;
                            } else {
                                length3 = strK.length();
                                break;
                            }
                        }
                        if (length3 >= strK.length() || strK.charAt(length3) != '\"') {
                            int length5 = strK.length();
                            int length6 = length3;
                            while (true) {
                                if (length6 >= length5) {
                                    length6 = strK.length();
                                    break;
                                }
                                int i4 = length5;
                                if (v4e.G(",;", strK.charAt(length6))) {
                                    break;
                                }
                                length6++;
                                length5 = i4;
                            }
                            int i5 = length6;
                            string2 = v4e.o0(strK.substring(length3, length6)).toString();
                            i = i5;
                        } else {
                            int i6 = length3 + 1;
                            int iN = v4e.N(strK, '\"', i6, 4);
                            string2 = strK.substring(i6, iN);
                            i = iN + 1;
                        }
                    }
                    if ("no-cache".equalsIgnoreCase(string)) {
                        z2 = true;
                    } else if ("no-store".equalsIgnoreCase(string)) {
                        z3 = true;
                    } else if ("max-age".equalsIgnoreCase(string)) {
                        iO = ieg.o(-1, string2);
                    } else if ("s-maxage".equalsIgnoreCase(string)) {
                        iO2 = ieg.o(-1, string2);
                    } else if ("private".equalsIgnoreCase(string)) {
                        z4 = true;
                    } else if ("public".equalsIgnoreCase(string)) {
                        z5 = true;
                    } else if ("must-revalidate".equalsIgnoreCase(string)) {
                        z6 = true;
                    } else if ("max-stale".equalsIgnoreCase(string)) {
                        iO3 = ieg.o(Integer.MAX_VALUE, string2);
                    } else if ("min-fresh".equalsIgnoreCase(string)) {
                        iO4 = ieg.o(-1, string2);
                    } else if ("only-if-cached".equalsIgnoreCase(string)) {
                        z7 = true;
                    } else if ("no-transform".equalsIgnoreCase(string)) {
                        z8 = true;
                    } else if ("immutable".equalsIgnoreCase(string)) {
                        z9 = true;
                    }
                    size = i2;
                }
                i3++;
                si6Var2 = si6Var;
                size = size;
            } else {
                if (strI.equalsIgnoreCase("Pragma")) {
                }
                i3++;
                si6Var2 = si6Var;
                size = size;
            }
            z = false;
            i = 0;
            while (i < strK.length()) {
                length = strK.length();
                length2 = i;
                while (true) {
                    if (length2 < length) {
                        i2 = size;
                        length2 = strK.length();
                        break;
                    }
                    i2 = size;
                    if (v4e.G("=,;", strK.charAt(length2))) {
                        break;
                        break;
                    }
                    length2++;
                    size = i2;
                }
                string = v4e.o0(strK.substring(i, length2)).toString();
                if (length2 != strK.length()) {
                    i = length2 + 1;
                    string2 = null;
                } else {
                    i = length2 + 1;
                    string2 = null;
                }
                if ("no-cache".equalsIgnoreCase(string)) {
                    z2 = true;
                } else if ("no-store".equalsIgnoreCase(string)) {
                    z3 = true;
                } else if ("max-age".equalsIgnoreCase(string)) {
                    iO = ieg.o(-1, string2);
                } else if ("s-maxage".equalsIgnoreCase(string)) {
                    iO2 = ieg.o(-1, string2);
                } else if ("private".equalsIgnoreCase(string)) {
                    z4 = true;
                } else if ("public".equalsIgnoreCase(string)) {
                    z5 = true;
                } else if ("must-revalidate".equalsIgnoreCase(string)) {
                    z6 = true;
                } else if ("max-stale".equalsIgnoreCase(string)) {
                    iO3 = ieg.o(Integer.MAX_VALUE, string2);
                } else if ("min-fresh".equalsIgnoreCase(string)) {
                    iO4 = ieg.o(-1, string2);
                } else if ("only-if-cached".equalsIgnoreCase(string)) {
                    z7 = true;
                } else if ("no-transform".equalsIgnoreCase(string)) {
                    z8 = true;
                } else if ("immutable".equalsIgnoreCase(string)) {
                    z9 = true;
                }
                size = i2;
            }
            i3++;
            si6Var2 = si6Var;
            size = size;
        }
        return new c81(z2, z3, iO, iO2, z4, z5, z6, iO3, iO4, z7, z8, z9, !z ? null : str);
    }

    public static pq5 L(XmlResourceParser xmlResourceParser, Resources resources) throws Throwable {
        int next;
        int i;
        List list;
        ArrayList arrayList;
        TypedArray typedArray;
        do {
            next = xmlResourceParser.next();
            i = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            W(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), cbb.b);
        int i2 = 0;
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int i3 = 3;
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList2 = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), cbb.c);
                        int i4 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, Constants.MINIMAL_ERROR_STATUS_CODE);
                        boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i5 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i6 = typedArrayObtainAttributes2.getInt(i5, 0);
                        int i7 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i7, 0);
                        String string7 = typedArrayObtainAttributes2.getString(i7);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            W(xmlResourceParser);
                        }
                        arrayList2.add(new rq5(i4, i6, resourceId2, string7, string6, z));
                    } else {
                        W(xmlResourceParser);
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                return null;
            }
            return new qq5((rq5[]) arrayList2.toArray(new rq5[0]));
        }
        List listN = N(resources, resourceId);
        ArrayList arrayList3 = new ArrayList();
        while (xmlResourceParser.next() != i3) {
            if (xmlResourceParser.getEventType() == i) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), cbb.d);
                    try {
                        String string8 = typedArrayObtainAttributes3.getString(i2);
                        String string9 = typedArrayObtainAttributes3.getString(1);
                        String string10 = typedArrayObtainAttributes3.getString(i);
                        if (string8 == null) {
                            typedArray = typedArrayObtainAttributes3;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != i3) {
                            W(xmlResourceParser);
                        }
                        List list2 = listN;
                        arrayList = arrayList3;
                        list = list2;
                        typedArray = typedArrayObtainAttributes3;
                        try {
                            jq5 jq5Var = new jq5(string, string2, string8, string9, list, string10);
                            typedArray.recycle();
                            arrayList.add(jq5Var);
                        } catch (Throwable th) {
                            th = th;
                        }
                        th = th;
                    } catch (Throwable th2) {
                        th = th2;
                        typedArray = typedArrayObtainAttributes3;
                    }
                    typedArray.recycle();
                    throw th;
                }
                list = listN;
                arrayList = arrayList3;
                W(xmlResourceParser);
                arrayList3 = arrayList;
                integer = integer;
                listN = list;
                i2 = 0;
                i3 = i3;
                i = 2;
            }
        }
        List list3 = listN;
        ArrayList arrayList4 = arrayList3;
        int i8 = integer;
        if (!arrayList4.isEmpty()) {
            return new sq5(arrayList4, i8, integer2, string5);
        }
        if (string3 == null) {
            qc0.j("The provider font XML requires query attribute or fallback children.");
            return null;
        }
        arrayList4.add(new jq5(string, string2, string3, null, list3, null));
        if (string4 != null) {
            arrayList4.add(new jq5(string, string2, string4, null, list3, null));
        }
        return new sq5(arrayList4, i8, integer2, string5);
    }

    public static List N(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static int O(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iP = rs0.P(obj);
        int i2 = iP & i;
        int iX = X(i2, obj3);
        if (iX != 0) {
            int i3 = ~i;
            int i4 = iP & i3;
            int i5 = -1;
            while (true) {
                int i6 = iX - 1;
                int i7 = iArr[i6];
                if ((i7 & i3) == i4 && ok8.t(obj, objArr[i6]) && (objArr2 == null || ok8.t(obj2, objArr2[i6]))) {
                    int i8 = i7 & i;
                    if (i5 == -1) {
                        Y(i2, obj3, i8);
                        return i6;
                    }
                    iArr[i5] = I(iArr[i5], i8, i);
                    return i6;
                }
                int i9 = i7 & i;
                if (i9 == 0) {
                    break;
                }
                i5 = i6;
                iX = i9;
            }
        }
        return -1;
    }

    public static final String P(ex5 ex5Var) {
        ex5Var.getClass();
        List<t99> listF = ex5.f(ex5Var);
        StringBuilder sb = new StringBuilder();
        for (t99 t99Var : listF) {
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(Q(t99Var));
        }
        return sb.toString();
    }

    public static String Q(t99 t99Var) {
        t99Var.getClass();
        String strB = t99Var.b();
        strB.getClass();
        if (!kp7.a.contains(strB)) {
            for (int i = 0; i < strB.length(); i++) {
                char cCharAt = strB.charAt(i);
                if (Character.isLetterOrDigit(cCharAt) || cCharAt == '_') {
                }
            }
            if (strB.length() != 0 && Character.isJavaIdentifierStart(strB.codePointAt(0))) {
                return strB;
            }
        }
        return "`".concat(strB).concat("`");
    }

    public static int R(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static final tjd S(e7f e7fVar, u09 u09Var, List list) {
        e7fVar.getClass();
        u09Var.getClass();
        list.getClass();
        j7f j7fVarH = u09Var.h();
        j7fVarH.getClass();
        return T(e7fVar, j7fVarH, list, false);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a A[PHI: r1
  0x006a: PHI (r1v10 dr8) = (r1v9 dr8), (r1v11 dr8) binds: [B:33:0x0087, B:24:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    public static tjd T(e7f e7fVar, j7f j7fVar, List list, boolean z) {
        dr8 dr8VarE;
        u09 u09Var;
        dr8 dr8VarZ;
        dr8 dr8Var;
        e7fVar.getClass();
        j7fVar.getClass();
        list.getClass();
        if (e7fVar.isEmpty() && list.isEmpty() && !z && j7fVar.m() != null) {
            y22 y22VarM = j7fVar.m();
            y22VarM.getClass();
            tjd tjdVarS = y22VarM.S();
            tjdVarS.getClass();
            return tjdVarS;
        }
        y22 y22VarM2 = j7fVar.m();
        if (y22VarM2 instanceof c8f) {
            dr8VarE = ((c8f) y22VarM2).S().F();
        } else {
            if (y22VarM2 instanceof u09) {
                int i = qz3.a;
                w09 w09VarC = oz3.c(y22VarM2);
                w09VarC.getClass();
                qz3.h(w09VarC);
                zt7 zt7Var = zt7.p;
                if (list.isEmpty()) {
                    u09 u09Var2 = (u09) y22VarM2;
                    u09Var = u09Var2 instanceof u09 ? u09Var2 : null;
                    if (u09Var == null || (dr8VarZ = u09Var.l0(zt7Var)) == null) {
                        dr8VarE = u09Var2.k0();
                        dr8VarE.getClass();
                    } else {
                        dr8Var = dr8VarZ;
                    }
                } else {
                    u09 u09Var3 = (u09) y22VarM2;
                    o8f o8fVarG = l7f.b.g(j7fVar, list);
                    u09Var = u09Var3 instanceof u09 ? u09Var3 : null;
                    if (u09Var == null || (dr8VarZ = u09Var.Z(o8fVarG, zt7Var)) == null) {
                        dr8VarE = u09Var3.M(o8fVarG);
                        dr8VarE.getClass();
                    } else {
                        dr8Var = dr8VarZ;
                    }
                }
                return V(e7fVar, j7fVar, list, z, dr8Var, new wt7(e7fVar, j7fVar, list, z));
            }
            if (y22VarM2 instanceof s04) {
                String str = ((s04) y22VarM2).getName().a;
                str.getClass();
                dr8VarE = sy4.a(ny4.SCOPE_FOR_ABBREVIATION_TYPE, true, str);
            } else {
                if (!(j7fVar instanceof ca7)) {
                    ho7.o("Unsupported classifier: ", y22VarM2, " for constructor: ", j7fVar);
                    return null;
                }
                dr8VarE = u3c.e("member scope for intersection type", ((ca7) j7fVar).b);
            }
        }
        dr8Var = dr8VarE;
        return V(e7fVar, j7fVar, list, z, dr8Var, new wt7(e7fVar, j7fVar, list, z));
    }

    public static final tjd U(dr8 dr8Var, e7f e7fVar, j7f j7fVar, List list, boolean z) {
        e7fVar.getClass();
        j7fVar.getClass();
        list.getClass();
        dr8Var.getClass();
        ujd ujdVar = new ujd(j7fVar, list, z, dr8Var, new wt7(dr8Var, e7fVar, j7fVar, list, z));
        return e7fVar.isEmpty() ? ujdVar : new wjd(ujdVar, e7fVar);
    }

    public static final tjd V(e7f e7fVar, j7f j7fVar, List list, boolean z, dr8 dr8Var, a26 a26Var) {
        e7fVar.getClass();
        j7fVar.getClass();
        list.getClass();
        dr8Var.getClass();
        ujd ujdVar = new ujd(j7fVar, list, z, dr8Var, a26Var);
        return e7fVar.isEmpty() ? ujdVar : new wjd(ujdVar, e7fVar);
    }

    public static void W(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static int X(int i, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        return obj instanceof short[] ? ((short[]) obj)[i] & 65535 : ((int[]) obj)[i];
    }

    public static void Y(int i, Object obj, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static int[] Z(Collection collection) {
        if (collection instanceof va7) {
            va7 va7Var = (va7) collection;
            return Arrays.copyOfRange(va7Var.array, va7Var.start, va7Var.end);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static final void a(boolean z, x16 x16Var, l46 l46Var, int i, int i2) {
        boolean z2;
        int i3;
        boolean z3;
        l46Var.h0(-361453782);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            z2 = z;
        } else if ((i & 6) == 0) {
            z2 = z;
            i3 = (l46Var.h(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i3 = i;
        }
        int i5 = 16;
        if ((i & 48) == 0) {
            i3 |= l46Var.i(x16Var) ? 32 : 16;
        }
        int i6 = 0;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            z3 = i4 != 0 ? true : z2;
            Object objA = db8.a(l46Var);
            if (objA == null) {
                l46Var.f0(535274673);
                objA = eb8.a(l46Var);
            } else {
                l46Var.f0(535271790);
            }
            l46Var.r(false);
            if (objA == null) {
                qc0.p("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean zG = l46Var.g(objA);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (zG || objR == obj) {
                wb9 wb9Var = objA instanceof wb9 ? (wb9) objA : null;
                szc szcVarA = wb9Var != null ? wb9Var.a() : null;
                vm9 vm9Var = objA instanceof vm9 ? (vm9) objA : null;
                objR = new zr0(szcVarA, vm9Var != null ? vm9Var.b() : null);
                l46Var.p0(objR);
            }
            Object obj2 = (zr0) objR;
            long j = l46Var.T;
            boolean zG2 = l46Var.g(obj2) | l46Var.f(j);
            Object objR2 = l46Var.R();
            Object obj3 = objR2;
            if (zG2 || objR2 == obj) {
                je2 je2Var = new je2(new as0(j, objA));
                je2Var.c = new r02(28);
                l46Var.p0(je2Var);
                obj3 = je2Var;
            }
            Object obj4 = (je2) obj3;
            l46Var.f0(-585307852);
            boolean zI = l46Var.i(obj4) | ((i3 & 112) == 32);
            Object objR3 = l46Var.R();
            if (zI || objR3 == obj) {
                objR3 = new v6(i5, obj4, x16Var);
                l46Var.p0(objR3);
            }
            af1.u((x16) objR3, l46Var);
            Boolean boolValueOf = Boolean.valueOf(z3);
            int i7 = i3 & 14;
            boolean zI2 = l46Var.i(obj4) | (i7 == 4);
            Object objR4 = l46Var.R();
            if (zI2 || objR4 == obj) {
                objR4 = new bs0(obj4, z3, i6);
                l46Var.p0(objR4);
            }
            t72.j(boolValueOf, obj4, null, (a26) objR4, l46Var, i7);
            boolean zI3 = l46Var.i(obj2) | l46Var.i(obj4);
            Object objR5 = l46Var.R();
            if (zI3 || objR5 == obj) {
                objR5 = new l0(i5, obj2, obj4);
                l46Var.p0(objR5);
            }
            af1.h(obj2, obj4, (a26) objR5, l46Var);
            l46Var.r(false);
        } else {
            l46Var.Z();
            z3 = z2;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new cs0(z3, x16Var, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    public static Integer a0(String str) {
        byte b2;
        Long lValueOf;
        byte b3;
        str.getClass();
        if (!str.isEmpty()) {
            int i = str.charAt(0) == '-' ? 1 : 0;
            if (i != str.length()) {
                int i2 = i + 1;
                char cCharAt = str.charAt(i);
                if (cCharAt < 128) {
                    b2 = ig8.a[cCharAt];
                } else {
                    byte[] bArr = ig8.a;
                    b2 = -1;
                }
                if (b2 >= 0 && b2 < 10) {
                    long j = -b2;
                    while (true) {
                        if (i2 >= str.length()) {
                            if (i == 0) {
                                if (j != Long.MIN_VALUE) {
                                    lValueOf = Long.valueOf(-j);
                                    break;
                                }
                                break;
                            }
                            lValueOf = Long.valueOf(j);
                            break;
                        }
                        int i3 = i2 + 1;
                        char cCharAt2 = str.charAt(i2);
                        if (cCharAt2 < 128) {
                            b3 = ig8.a[cCharAt2];
                        } else {
                            byte[] bArr2 = ig8.a;
                            b3 = -1;
                        }
                        if (b3 >= 0 && b3 < 10 && j >= -922337203685477580L) {
                            long j2 = j * 10;
                            long j3 = b3;
                            if (j2 >= Long.MIN_VALUE + j3) {
                                j = j2 - j3;
                                i2 = i3;
                            }
                        }
                        lValueOf = null;
                        break;
                    }
                }
                lValueOf = null;
                break;
            }
            lValueOf = null;
            break;
        }
        lValueOf = null;
        break;
        if (lValueOf == null || lValueOf.longValue() != lValueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(lValueOf.intValue());
    }

    public static final void b(j09 j09Var, dsb dsbVar, a26 a26Var, l46 l46Var, int i) {
        int i2;
        j09 j09VarD0;
        dsbVar.getClass();
        l46Var.h0(-130996609);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? l46Var.g(dsbVar) : l46Var.i(dsbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = kv2.f(0, l46Var);
            }
            s69 s69Var = (s69) objR;
            boolean zBooleanValue = ((Boolean) l46Var.k(sad.a)).booleanValue();
            g09 g09Var = g09.a;
            j09 j09VarB0 = ynb.b0(58.0f, 0.0f, j09Var.D(zBooleanValue ? g09Var : b.c), 2);
            if (zBooleanValue) {
                l46Var.f0(-1333677721);
                l46Var.r(false);
                j09VarD0 = g09Var;
            } else {
                l46Var.f0(-1333676956);
                j09VarD0 = mh3.d0(g09Var, mh3.T(l46Var), false, 14);
                l46Var.r(false);
            }
            j09 j09VarD = j09VarB0.D(j09VarD0);
            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var, 0);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarD);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, c92VarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            o5c.f(l46Var, b.d(g09Var, 20.0f));
            g21.s(390.0f, af1.b0(367367025, new m65(a26Var, dsbVar, s69Var, 25), l46Var), l46Var, 54);
            tec.u(g09Var, 40.0f, l46Var, true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new gca(j09Var, dsbVar, a26Var, i, 1);
        }
    }

    public static final Object b0(qxc qxcVar, Object obj) {
        Object objD = qxcVar.d(obj);
        if (objD instanceof qw1) {
            return ((rw1) z5c.I(nu4.a, new tw1(qxcVar, obj, null))).a;
        }
        return wef.a;
    }

    public static final void c(TarotSkinIdentify tarotSkinIdentify, List list, jx7 jx7Var, l26 l26Var, j09 j09Var, l46 l46Var, int i) {
        list.getClass();
        jx7Var.getClass();
        l26Var.getClass();
        l46Var.h0(-149945318);
        int i2 = i | (l46Var.e(tarotSkinIdentify.ordinal()) ? 4 : 2) | (l46Var.g(list) ? 32 : 16) | (l46Var.g(jx7Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(l26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.g(j09Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        int i3 = 0;
        if (l46Var.W(i2 & 1, (i2 & 9363) != 9362)) {
            j09 j09VarC = b.c(j09Var, 1.0f);
            ye6 ye6Var = new ye6(3);
            bx9 bx9Var = new bx9(24.0f, 12.0f, 24.0f, 12.0f);
            uc0 uc0Var = new uc0(8.0f, true, new qc0(i3));
            uc0 uc0Var2 = new uc0(16.0f, true, new qc0(i3));
            boolean z = ((i2 & 112) == 32) | ((i2 & 7168) == 2048) | ((i2 & 14) == 4);
            Object objR = l46Var.R();
            if (z || objR == sf2.a) {
                objR = new w6(list, l26Var, tarotSkinIdentify, 27);
                l46Var.p0(objR);
            }
            an1.e(ye6Var, j09VarC, jx7Var, bx9Var, uc0Var2, uc0Var, null, false, null, (a26) objR, l46Var, (i2 & 896) | 1769472, 912);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new cm(tarotSkinIdentify, list, jx7Var, l26Var, j09Var, i, 6);
        }
    }

    public static final void d(boolean z, a26 a26Var, j09 j09Var, dd2 dd2Var, l46 l46Var, int i) {
        a26 a26Var2;
        dd2 dd2Var2;
        j09 j09Var2;
        boolean z2;
        l46Var.h0(1597265892);
        int i2 = i | (l46Var.h(z) ? 4 : 2) | 384;
        if (l46Var.W(i2 & 1, (i2 & 1171) != 1170)) {
            Object obj = (Configuration) l46Var.k(uq.a);
            View view = (View) l46Var.k(uq.f);
            boolean zG = l46Var.g(obj) | l46Var.g(view);
            Object objR = l46Var.R();
            Object obj2 = sf2.a;
            if (zG || objR == obj2) {
                objR = new z6g(view);
                l46Var.p0(objR);
            }
            z6g z6gVar = (z6g) objR;
            sw3 sw3Var = (sw3) l46Var.k(zg2.h);
            int iD0 = sw3Var.D0(48.0f);
            Object objR2 = l46Var.R();
            if (objR2 == obj2) {
                objR2 = q1c.f(null);
                l46Var.p0(objR2);
            }
            e89 e89Var = (e89) objR2;
            Object objR3 = l46Var.R();
            if (objR3 == obj2) {
                objR3 = kv2.f(0, l46Var);
            }
            s69 s69Var = (s69) objR3;
            Object objR4 = l46Var.R();
            if (objR4 == obj2) {
                objR4 = kv2.f(0, l46Var);
            }
            s69 s69Var2 = (s69) objR4;
            Object objR5 = l46Var.R();
            if (objR5 == obj2) {
                objR5 = new fo5();
                l46Var.p0(objR5);
            }
            fo5 fo5Var = (fo5) objR5;
            tgc.h(R.string.m3c_dropdown_menu_expanded, l46Var);
            tgc.h(R.string.m3c_dropdown_menu_collapsed, l46Var);
            tgc.h(R.string.m3c_dropdown_menu_toggle, l46Var);
            Object objR6 = l46Var.R();
            if (objR6 == obj2) {
                objR6 = q1c.f(new v75());
                l46Var.p0(objR6);
            }
            e89 e89Var2 = (e89) objR6;
            Object objR7 = l46Var.R();
            if (objR7 == obj2) {
                objR7 = q1c.f(Boolean.FALSE);
                l46Var.p0(objR7);
            }
            e89 e89Var3 = (e89) objR7;
            int i3 = i2 & 14;
            boolean zG2 = (i3 == 4) | l46Var.g(z6gVar) | l46Var.g(sw3Var);
            Object objR8 = l46Var.R();
            if (zG2 || objR8 == obj2) {
                objR8 = new y75(e89Var3, e89Var2, s69Var, s69Var2);
                l46Var.p0(objR8);
            }
            y75 y75Var = (y75) objR8;
            boolean zI = l46Var.i(z6gVar) | l46Var.e(iD0);
            Object objR9 = l46Var.R();
            if (zI || objR9 == obj2) {
                Object b92Var = new b92(z6gVar, iD0, e89Var, s69Var, s69Var2);
                l46Var.p0(b92Var);
                objR9 = b92Var;
            }
            g09 g09Var = g09.a;
            j09 j09VarW = nk8.w(g09Var, (a26) objR9);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iW = an1.w(l46Var);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarW);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            he2 he2Var = hj6.X;
            if (l46Var.S || !pa7.t(l46Var.R(), Integer.valueOf(iW))) {
                tec.r(iW, l46Var, iW, he2Var);
            }
            dec.l(hj6.x, l46Var, j09VarJ);
            dd2Var2 = dd2Var;
            dd2Var2.m(y75Var, l46Var, 48);
            l46Var.r(true);
            if (z) {
                l46Var.f0(209894723);
                boolean zI2 = l46Var.i(z6gVar) | l46Var.e(iD0);
                Object objR10 = l46Var.R();
                if (zI2 || objR10 == obj2) {
                    objR10 = new bl(z6gVar, iD0, e89Var, s69Var2);
                    l46Var.p0(objR10);
                }
                z2 = false;
                i7h.d((x16) objR10, l46Var, 0);
                l46Var.r(false);
            } else {
                z2 = false;
                l46Var.f0(210228190);
                l46Var.r(false);
            }
            int i4 = 4;
            if (i3 == 4) {
                z2 = true;
            }
            Object objR11 = l46Var.R();
            if (z2 || objR11 == obj2) {
                objR11 = new mv0(z, fo5Var, i4);
                l46Var.p0(objR11);
            }
            af1.u((x16) objR11, l46Var);
            Object objR12 = l46Var.R();
            if (objR12 == obj2) {
                a26Var2 = a26Var;
                objR12 = new zh1(a26Var2, 13);
                l46Var.p0(objR12);
            } else {
                a26Var2 = a26Var;
            }
            i7h.a(z, (x16) objR12, l46Var, i3);
            j09Var2 = g09Var;
        } else {
            a26Var2 = a26Var;
            dd2Var2 = dd2Var;
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o50(i, 12, a26Var2, j09Var2, dd2Var2, z);
        }
    }

    public static kd5 g(e1a e1aVar, zd5 zd5Var, String str, fib fibVar, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            fibVar = null;
        }
        return new kd5(e1aVar, zd5Var, str, fibVar);
    }

    public static ptd i(v41 v41Var, zd5 zd5Var) {
        return new ptd(v41Var, zd5Var, null);
    }

    public static final void k(dd2 dd2Var, j09 j09Var, q78 q78Var, l46 l46Var, int i) {
        int i2;
        l46Var.h0(487133126);
        if ((i & 6) == 0) {
            i2 = i | (l46Var.i(dd2Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.g(j09Var) ? 32 : 16;
        }
        int i3 = i2 | 224640;
        if ((i & 1572864) == 0) {
            i3 |= l46Var.g(q78Var) ? 1048576 : 524288;
        }
        int i4 = i3 | 113246208;
        if (l46Var.W(i4 & 1, (38347923 & i4) != 38347922)) {
            l46Var.b0();
            if ((i & 1) != 0 && !l46Var.C()) {
                l46Var.Z();
            }
            l46Var.s();
            dd2 dd2VarB0 = af1.b0(629852750, new fw0(8, q78Var, dd2Var), l46Var);
            l46Var.f0(-510713870);
            l46Var.r(false);
            l46Var.f0(-510395686);
            l46Var.r(false);
            l46Var.f0(-510083888);
            l46Var.r(false);
            l46Var.f0(-509666659);
            l46Var.r(false);
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = new tb7(25);
                l46Var.p0(objR);
            }
            int i5 = i4 >> 9;
            nae.a(vwc.b(g09.a, true, (a26) objR).D(j09Var), u5d.b(cn1.x, l46Var), q78Var.a, q78Var.b, 0.0f, 0.0f, null, af1.b0(1192488737, new bf3(null, null, dd2VarB0, null, null), l46Var), l46Var, (i5 & 458752) | (57344 & i5) | 12582912, 64);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new s48(i, dd2Var, j09Var, q78Var, 3);
        }
    }

    public static final void m(l26 l26Var, l26 l26Var2, dd2 dd2Var, l26 l26Var3, l26 l26Var4, l46 l46Var, int i) {
        l46Var.h0(-61277522);
        int i2 = 2;
        int i3 = i | (l46Var.i(l26Var) ? 4 : 2) | (l46Var.i(l26Var2) ? 32 : 16) | (l46Var.i(l26Var3) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(l26Var4) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        byte b2 = 0;
        if (l46Var.W(i3 & 1, (i3 & 9363) != 9362)) {
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = new w78();
                l46Var.p0(objR);
            }
            w78 w78Var = (w78) objR;
            dd2 dd2Var2 = new dd2(new ch3(t72.I(dd2Var, l26Var3 == null ? zd2.a : l26Var3, l26Var4 == null ? zd2.b : l26Var4, l26Var == null ? zd2.c : l26Var, l26Var2 == null ? zd2.d : l26Var2), i2, b2), true, 1271844412);
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = new x49(w78Var);
                l46Var.p0(objR2);
            }
            xn8 xn8Var = (xn8) objR2;
            int iW = an1.w(l46Var);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, g09.a);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8Var);
            dec.l(hj6.y, l46Var, u8aVarM);
            he2 he2Var = hj6.X;
            if (l46Var.S || !pa7.t(l46Var.R(), Integer.valueOf(iW))) {
                tec.r(iW, l46Var, iW, he2Var);
            }
            dec.l(hj6.x, l46Var, j09VarJ);
            tec.q(0, dd2Var2, l46Var, true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new cm((Object) l26Var, (Object) l26Var2, (m26) dd2Var, (m26) l26Var3, (m26) l26Var4, i, 15);
        }
    }

    public static final void n(j09 j09Var, dsb dsbVar, a26 a26Var, l46 l46Var, int i) {
        int i2;
        j09 j09VarD0;
        l46Var.h0(1753325547);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? l46Var.g(dsbVar) : l46Var.i(dsbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            boolean zBooleanValue = ((Boolean) l46Var.k(sad.a)).booleanValue();
            g09 g09Var = g09.a;
            j09 j09VarB0 = ynb.b0(80.0f, 0.0f, j09Var.D(zBooleanValue ? g09Var : b.c), 2);
            if (zBooleanValue) {
                l46Var.f0(1318680883);
                l46Var.r(false);
                j09VarD0 = g09Var;
            } else {
                l46Var.f0(1318681648);
                j09VarD0 = mh3.d0(g09Var, mh3.T(l46Var), false, 14);
                l46Var.r(false);
            }
            j09 j09VarD = j09VarB0.D(j09VarD0);
            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var, 0);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarD);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, c92VarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            g21.s(390.0f, af1.b0(-2043278115, new rk6(20, a26Var, dsbVar), l46Var), l46Var, 54);
            tec.u(g09Var, 40.0f, l46Var, true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new gca(j09Var, dsbVar, a26Var, i, 2);
        }
    }

    public static final void o(int i, l46 l46Var) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(1436327333);
        int i2 = i & 1;
        if (l46Var2.W(i2, i2 != 0)) {
            g09 g09Var = g09.a;
            j09 j09VarB0 = ynb.b0(32.0f, 0.0f, g09Var, 2);
            l46Var2.f0(1626068969);
            i00 i00Var = new i00();
            i00Var.f(afc.q(R.string.personality_share_title_qrcode, l46Var2));
            l46Var2.f0(1626072032);
            int iK = i00Var.k(new xtd(((m82) l46Var2.k(o82.a)).a, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
            try {
                i00Var.f(afc.q(R.string.personality_share_title_qrcode_highlight, l46Var2));
                i00Var.h(iK);
                l46Var2.r(false);
                k00 k00VarL = i00Var.l();
                l46Var2.r(false);
                mue mueVar = oue.a;
                nte.c(k00VarL, j09VarB0, 0L, 0L, null, null, 0L, new jme(3), 0L, 0, false, 0, 0, null, null, pue.a(l46Var2), l46Var, 48, 0, 261116);
                l46Var2 = l46Var;
                o5c.f(l46Var2, b.d(g09Var, 12.0f));
                j09 j09VarE = oa7.E(b.l(g09Var, 148.0f), a7c.b(2.0f));
                ca2.a.getClass();
                feg.j(od4.A(ca2.c ? R.drawable.qr_code_personality_global : R.drawable.qr_code_personality_cn, 0, l46Var2), "QR code", j09VarE, null, null, 0.0f, null, l46Var2, 56, 120);
                o5c.f(l46Var2, b.d(g09Var, 48.0f));
            } catch (Throwable th) {
                i00Var.h(iK);
                throw th;
            }
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new db9(i, 28);
        }
    }

    public static final void p(int i, x16 x16Var, x16 x16Var2, l46 l46Var, j09 j09Var) {
        j09 j09Var2;
        int i2;
        g09 g09Var;
        pr4 pr4Var;
        he2 he2Var;
        he2 he2Var2;
        he2 he2Var3;
        l46 l46Var2 = l46Var;
        x16Var.getClass();
        x16Var2.getClass();
        l46Var2.h0(1766497419);
        int i3 = i | 6 | (l46Var2.i(x16Var) ? 32 : 16) | (l46Var2.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var2.W(i3 & 1, (i3 & 147) != 146)) {
            Object objR = l46Var2.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = new rn8(2, null);
                l46Var2.p0(objR);
            }
            af1.o((l26) objR, l46Var2, wef.a);
            ia7 ia7Var = ia7.a;
            g09 g09Var2 = g09.a;
            j09 j09VarE = oa7.E(urg.F(g09Var2, ia7Var), a7c.b(32.0f));
            pr4 pr4Var2 = l8b.a;
            j09 j09VarO = tm7.o(j09VarE, ((e8b) l46Var2.k(pr4Var2)).a, g21.f);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarO);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var4 = hj6.z;
            dec.l(he2Var4, l46Var2, xn8VarC);
            he2 he2Var5 = hj6.y;
            dec.l(he2Var5, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var6 = hj6.X;
            dec.l(he2Var6, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var7 = hj6.x;
            dec.l(he2Var7, l46Var2, j09VarJ);
            boolean zE = k8b.e((e8b) l46Var2.k(pr4Var2));
            d31 d31Var = d31.a;
            if (zE) {
                l46Var2.f0(1886079511);
                he2Var2 = he2Var7;
                he2Var3 = he2Var6;
                g09Var = g09Var2;
                pr4Var = pr4Var2;
                he2Var = he2Var5;
                i2 = 0;
                feg.j(od4.A(R.drawable.bg_new_tarot_skins, 0, l46Var2), null, d31Var.b(g09Var2), null, an2.a, 0.0f, null, l46Var2, 24632, 104);
                l46Var2.r(false);
            } else {
                i2 = 0;
                g09Var = g09Var2;
                pr4Var = pr4Var2;
                he2Var = he2Var5;
                he2Var2 = he2Var7;
                he2Var3 = he2Var6;
                l46Var2.f0(1886289009);
                l46Var2.r(false);
            }
            j09 j09VarD0 = ynb.d0(0.0f, 9.0f, 9.0f, 0.0f, 9, d31Var.a(g09Var, ndb.d));
            int i4 = (i3 & 896) == 256 ? 1 : i2;
            Object objR2 = l46Var2.R();
            if (i4 != 0 || objR2 == i8cVar) {
                objR2 = new fn6(6, x16Var2);
                l46Var2.p0(objR2);
            }
            c8b.h(j09VarD0, false, 0L, 0L, null, (x16) objR2, l46Var, 0, 30);
            j09 j09VarZ = ynb.Z(g09Var, 32.0f);
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var, 48);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarZ);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var4, l46Var, c92VarA);
            dec.l(he2Var, l46Var, u8aVarM2);
            ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
            dec.l(he2Var2, l46Var, j09VarJ2);
            pr4 pr4Var3 = pr4Var;
            feg.j(od4.A(k8b.e((e8b) l46Var.k(pr4Var3)) ? R.drawable.new_tarot_skins_banner : R.drawable.new_tarot_skins_banner_greyscale, i2, l46Var), null, null, null, null, 0.0f, null, l46Var, 56, 124);
            String strQ = afc.q(R.string.may_day_2026_popup_title, l46Var);
            mue mueVar = pue.a;
            nte.b(strQ, null, ((e8b) l46Var.k(pr4Var3)).q, 0L, ar5.y, ((y8b) l46Var.k(x8b.a)).a, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.n(l46Var), l46Var, 1572864, 0, 129850);
            nte.b(ks0.h(8.0f, R.string.may_day_2026_popup_desc, l46Var, l46Var, g09Var), null, ((e8b) l46Var.k(pr4Var3)).r, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.e(l46Var), l46Var, 0, 0, 130042);
            String strH = ks0.h(24.0f, R.string.may_day_2026_popup_cta, l46Var, l46Var, g09Var);
            j09 j09VarB = b.b(0.0f, 56.0f, b.c(g09Var, 1.0f), 1);
            boolean z2 = (i3 & 112) == 32;
            Object objR3 = l46Var.R();
            if (z2 || objR3 == i8cVar) {
                objR3 = new fn6(7, x16Var);
                l46Var.p0(objR3);
            }
            c8b.i(j09VarB, strH, null, null, 0L, 0.0f, false, null, null, false, null, null, (x16) objR3, l46Var, 6, 0, 4092);
            l46Var2 = l46Var;
            l46Var2.r(true);
            l46Var2.r(true);
            j09Var2 = g09Var;
        } else {
            l46Var2.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o(j09Var2, x16Var, x16Var2, i, 5);
        }
    }

    public static final void q(String str, x16 x16Var, l46 l46Var, int i) {
        str.getClass();
        x16Var.getClass();
        l46Var.h0(-865674417);
        int i2 = (l46Var.g(str) ? 4 : 2) | i | (l46Var.i(x16Var) ? 32 : 16);
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            List listI = t72.I(oed.Long, oed.Card);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (z || objR == obj) {
                objR = new t8(str, 9);
                l46Var.p0(objR);
            }
            x16 x16Var2 = (x16) objR;
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            xsb xsbVar = (xsb) z5c.G(job.a.b(xsb.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), x16Var2);
            e89 e89VarT = tm7.t(xsbVar.c, l46Var);
            yrb yrbVar = (yrb) xsbVar.b.getValue();
            boolean zI = (i3 == 4) | l46Var.i(xsbVar) | ((i2 & 112) == 32);
            Object objR2 = l46Var.R();
            if (zI || objR2 == obj) {
                objR2 = new ica(xsbVar, str, x16Var, null);
                l46Var.p0(objR2);
            }
            af1.o((l26) objR2, l46Var, yrbVar);
            dj6.k(null, af1.b0(1481693437, new r19((Object) listI, x16Var, (Object) str, e89VarT, 3), l46Var), l46Var, 48, 1);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new mb(str, x16Var, i, 10);
        }
    }

    public static final void r(long j, q9f q9fVar, l26 l26Var, l46 l46Var, int i) {
        long j2;
        l46 l46Var2;
        l26 l26Var2;
        l46Var.h0(-285397024);
        int i2 = (l46Var.f(j) ? 4 : 2) | i | (l46Var.i(l26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            j2 = j;
            l46Var2 = l46Var;
            cgg.l(j2, r9f.a(q9fVar, l46Var), l26Var, l46Var2, i2 & 910);
            l26Var2 = l26Var;
        } else {
            j2 = j;
            l46Var2 = l46Var;
            l26Var2 = l26Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new cq1(j2, q9fVar, l26Var2, i);
        }
    }

    public static final void s(tr2 tr2Var, w4b w4bVar, a26 a26Var, x16 x16Var, boolean z, x16 x16Var2, l46 l46Var, int i) {
        a26Var.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(-236170549);
        int i2 = i | (l46Var.i(tr2Var) ? 4 : 2) | (l46Var.g(w4bVar) ? 32 : 16) | (l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.h(z) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(x16Var2) ? 131072 : 65536);
        if (l46Var.W(i2 & 1, (74899 & i2) != 74898)) {
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = new zea(19);
                l46Var.p0(objR);
            }
            a26 a26Var2 = (a26) objR;
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = new zea(20);
                l46Var.p0(objR2);
            }
            kn2.c(w4bVar, null, a26Var2, null, "question_flow", (a26) objR2, af1.b0(51878811, new gl0(tr2Var, a26Var, x16Var, z, x16Var2), l46Var), l46Var, ((i2 >> 3) & 14) | 1794432, 10);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new jt(tr2Var, w4bVar, a26Var, x16Var, z, x16Var2, i);
        }
    }

    public static final void t(j09 j09Var, dsb dsbVar, a26 a26Var, l46 l46Var, int i) {
        int i2;
        ov7 ov7Var;
        l46 l46Var2 = l46Var;
        dsbVar.getClass();
        ShortCard shortCard = dsbVar.b;
        zw2 zw2Var = dsbVar.f;
        iy9 iy9Var = zw2Var.d;
        a26Var.getClass();
        l46Var2.h0(485180712);
        if ((i & 6) == 0) {
            i2 = (l46Var2.g(j09Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? l46Var2.g(dsbVar) : l46Var2.i(dsbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var2.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var2.W(i2 & 1, (i2 & 147) != 146)) {
            j09 j09VarE = oa7.E(b.c(j09Var, 1.0f), a7c.b(12.0f));
            pr4 pr4Var = l8b.a;
            j09 j09VarO = tm7.o(j09VarE, ((e8b) l46Var2.k(pr4Var)).g, g21.f);
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarO);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z = l46Var2.S;
            int i3 = i2;
            ov7 ov7Var2 = LayoutNode.h1;
            if (z) {
                l46Var2.l(ov7Var2);
            } else {
                l46Var2.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var2, xn8VarC);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            d31 d31Var = d31.a;
            g09 g09Var = g09.a;
            feg.j(od4.A(R.drawable.bg_personality, 0, l46Var2), null, od4.i(pa7.p(d31Var.b(g09Var), 0.5f), 12.0f), null, an2.g, 0.0f, null, l46Var2, 24632, 104);
            j09 j09VarR = b.r(b.c(g09Var, 1.0f));
            jx0 jx0Var = ndb.Y;
            sc0 sc0Var = xc0.c;
            c92 c92VarA = a92.a(sc0Var, jx0Var, l46Var2, 0);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarR);
            l46Var2.j0();
            if (l46Var2.S) {
                ov7Var = ov7Var2;
                l46Var2.l(ov7Var);
            } else {
                ov7Var = ov7Var2;
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, c92VarA);
            dec.l(he2Var2, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ2);
            j09 j09VarC = b.c(tm7.o(ynb.d0(0.0f, 23.0f, 0.0f, 12.0f, 5, ynb.b0(16.0f, 0.0f, g09Var, 2)), y72.b(((e8b) l46Var2.k(pr4Var)).g, 0.48f), a7c.b(20.0f)), 1.0f);
            c92 c92VarA2 = a92.a(sc0Var, ndb.Z, l46Var2, 48);
            int iHashCode3 = Long.hashCode(l46Var2.T);
            u8a u8aVarM3 = l46Var2.m();
            j09 j09VarJ3 = m93.J(l46Var2, j09VarC);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, c92VarA2);
            dec.l(he2Var2, l46Var2, u8aVarM3);
            ib8.s(iHashCode3, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ3);
            o5c.f(l46Var2, b.d(g09Var, 32.0f));
            t6d.a(dsbVar, a26Var, l46Var2, (dsb.i << 3) | 6 | (i3 & 112) | (i3 & 896), 0);
            hkg.N(b.c(g09Var, 1.0f), shortCard, l46Var2, (ShortCard.$stable << 3) | 6);
            oa7.d(ynb.b0(0.0f, 24.0f, g09Var, 1), 0.0f, y72.e, l46Var, 438, 0);
            j09 j09VarD0 = ynb.d0(0.0f, 0.0f, 0.0f, 32.0f, 7, ynb.b0(32.0f, 0.0f, b.c(g09Var, 1.0f), 2));
            t7c t7cVarA = s7c.a(new uc0(24.0f, true, new qc0(0)), ndb.z, l46Var, 54);
            int iHashCode4 = Long.hashCode(l46Var.T);
            u8a u8aVarM4 = l46Var.m();
            j09 j09VarJ4 = m93.J(l46Var, j09VarD0);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, t7cVarA);
            dec.l(he2Var2, l46Var, u8aVarM4);
            ib8.s(iHashCode4, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ4);
            l46Var.f0(1933733001);
            i00 i00Var = new i00();
            mue mueVar = pue.a;
            mue mueVarP = pue.p(l46Var);
            pr4 pr4Var2 = x8b.a;
            int iK = i00Var.k(mue.a(mueVarP, 0L, 0L, null, ((y8b) l46Var.k(pr4Var2)).a, 0L, null, 0, 0L, null, null, 16777183).a);
            try {
                i00Var.f(shortCard.getCp());
                i00Var.h(iK);
                i00Var.append('\n');
                i00Var.append('\n');
                int iK2 = i00Var.k(mue.a(pue.m(l46Var), ((e8b) l46Var.k(pr4Var)).u, 0L, null, ((y8b) l46Var.k(pr4Var2)).a, 0L, null, 0, 0L, null, null, 16777182).a);
                try {
                    i00Var.f(zw2Var.b);
                    i00Var.h(iK2);
                    k00 k00VarL = i00Var.l();
                    l46Var.r(false);
                    nte.c(k00VarL, new jw7(1.0f, true), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, null, l46Var, 0, 0, 524284);
                    l46Var2 = l46Var;
                    v(null, (TarotCardChoice) iy9Var.d(), (TarotCardChoice) iy9Var.e(), l46Var2, 0);
                    l46Var2.r(true);
                    l46Var2.r(true);
                    v6d.a(6, l46Var2, ynb.Z(b.c(g09Var, 1.0f), 16.0f), afc.q(R.string.personal_test_sharing_footer_label, l46Var2));
                    l46Var2.r(true);
                    l46Var2.r(true);
                } catch (Throwable th) {
                    i00Var.h(iK2);
                    throw th;
                }
            } catch (Throwable th2) {
                i00Var.h(iK);
                throw th2;
            }
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new gca(j09Var, dsbVar, a26Var, i, 0);
        }
    }

    public static final void u(j09 j09Var, l46 l46Var, int i) {
        int i2;
        int i3;
        l46Var.h0(1918578856);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b2 = 0;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            if (g21.S(l46Var)) {
                l46Var.f0(1213314488);
                i3 = R.drawable.share_top_logo_light;
            } else {
                l46Var.f0(1213316227);
                i3 = R.drawable.share_top_logo_dark;
            }
            fy9 fy9VarA = od4.A(i3, 0, l46Var);
            l46Var.r(false);
            feg.j(fy9VarA, null, j09Var, null, an2.c, 0.0f, null, l46Var, 24632 | ((i2 << 6) & 896), 104);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new pb(j09Var, i, 5, b2);
        }
    }

    public static final void v(j09 j09Var, TarotCardChoice tarotCardChoice, TarotCardChoice tarotCardChoice2, l46 l46Var, int i) {
        j09 j09Var2;
        l46 l46Var2 = l46Var;
        l46Var2.h0(1213090956);
        int i2 = i | 6 | (l46Var2.g(tarotCardChoice) ? 32 : 16) | (l46Var2.g(tarotCardChoice2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var2.W(i2 & 1, (i2 & 147) != 146)) {
            g09 g09Var = g09.a;
            j09 j09VarP = b.p(b.d(g09Var, 86.0f), 84.0f);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarP);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, xn8VarC);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            j09 j09VarI = q6c.i(b.d(b.p(g09Var, 44.0f), 77.0f), 10.0f);
            y6c y6cVarB = a7c.b(5.5f);
            long j = y72.e;
            j09 j09VarW = db6.w(j09VarI, 1.0f, j, y6cVarB);
            lx0 lx0Var = ndb.g;
            d31 d31Var = d31.a;
            o7c.d(d31Var.a(j09VarW, lx0Var), qhe.a(q7c.r(tarotCardChoice)), null, false, null, 5.5f, null, false, l46Var2, 199680, 212);
            o7c.d(d31Var.a(db6.w(q6c.i(b.d(b.p(g09Var, 44.0f), 77.0f), -10.0f), 1.0f, j, a7c.b(5.5f)), ndb.e), qhe.a(q7c.r(tarotCardChoice2)), null, false, null, 5.5f, null, false, l46Var, 199680, 212);
            feg.j(od4.A(R.drawable.personal_cp_match, 0, l46Var), null, d31Var.a(b.r(b.p(ynb.d0(0.0f, 0.0f, 0.0f, 20.0f, 7, g09Var), 60.0f)), ndb.w), null, null, 0.0f, null, l46Var, 56, 120);
            l46Var2 = l46Var;
            l46Var2.r(true);
            j09Var2 = g09Var;
        } else {
            l46Var2.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new hca(j09Var2, tarotCardChoice, tarotCardChoice2, i, 0);
        }
    }

    public static final au w(float[] fArr) {
        return new au(new DashPathEffect(fArr, 0.0f));
    }

    public static List x(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new va7(0, iArr.length, iArr);
    }

    public static pa1 z(pu3 pu3Var) {
        la1 la1Var = new la1();
        la1Var.c = new qxb();
        pa1 pa1Var = new pa1(la1Var);
        la1Var.b = pa1Var;
        la1Var.a = kv2.class;
        try {
            pu3Var.E(new iv2(la1Var, pu3Var));
            la1Var.a = "Deferred.asListenableFuture";
            return pa1Var;
        } catch (Exception e2) {
            pa1Var.a(e2);
            return pa1Var;
        }
    }

    public abstract int J(int i);

    public abstract int M(int i);

    @Override // defpackage.stc
    public int e(int i) {
        int iJ = J(i);
        if (iJ == -1 || J(iJ) == -1) {
            return -1;
        }
        return iJ;
    }

    @Override // defpackage.stc
    public int h(int i) {
        int iM = M(i);
        if (iM == -1 || M(iM) == -1) {
            return -1;
        }
        return iM;
    }

    @Override // defpackage.stc
    public int j(int i) {
        return M(i);
    }

    @Override // defpackage.stc
    public int l(int i) {
        return J(i);
    }
}
