package defpackage;

import ai.askquin.R;
import ai.askquin.ui.draw.mixed.MixedDeckSnapshot;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.node.LayoutNode;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.core.b1;
import java.lang.ref.WeakReference;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class od4 {
    public static final n82 A;
    public static final n82 B;
    public static final n82 C;
    public static final n82 D;
    public static final n82 E;
    public static final n82 F;
    public static final n82 G;
    public static final n82 H;
    public static final n82 I;
    public static final n82 J;
    public static final n82 K;
    public static final n82 L;
    public static final n82 M;
    public static final n82 N;
    public static final n82 O;
    public static final n82 P;
    public static final n82 Q;
    public static final n82 R;
    public static final n82 S;
    public static final n82 T;
    public static final n82 U;
    public static final gg7 V;
    public static gg7 W;
    public static final s8f X;
    public static final s8f Y;
    public static Object Z;
    public static final n82 a = n82.Z;
    public static volatile xk3 a0;
    public static final n82 b;
    public static gx6 b0;
    public static final n82 c;
    public static final n82 d;
    public static final n82 e;
    public static final n82 f;
    public static final dd2 g;
    public static final dd2 h;
    public static final dd2 i;
    public static final dd2 j;
    public static final n82 k;
    public static final n82 l;
    public static final n82 m;
    public static final g5d n;
    public static final n82 o;
    public static final float p;
    public static final n82 q;
    public static final float r;
    public static final n82 s;
    public static final float t;
    public static final n82 u;
    public static final float v;
    public static final n82 w;
    public static final float x;
    public static final n82 y;
    public static final float z;

    static {
        n82 n82Var = n82.v;
        b = n82Var;
        c = n82.E0;
        n82 n82Var2 = n82.w;
        d = n82Var2;
        e = n82Var;
        f = n82Var2;
        g = new dd2(new gd2(19), false, -572235197);
        h = new dd2(new gd2(20), false, -682480252);
        i = new dd2(new xd2(27), false, 1073656909);
        j = new dd2(new ce2(29), false, -531888191);
        k = n82Var2;
        n82 n82Var3 = n82.z;
        l = n82Var3;
        m = n82.G0;
        n = g5d.c;
        o = n82Var;
        p = 0.38f;
        q = n82Var;
        r = 0.38f;
        s = n82Var;
        t = 0.38f;
        u = n82Var;
        v = 0.38f;
        w = n82Var;
        x = 0.38f;
        y = n82Var;
        z = 0.38f;
        n82 n82Var4 = n82.a;
        A = n82Var4;
        B = n82Var4;
        C = n82Var;
        D = n82Var4;
        E = n82Var2;
        F = n82Var4;
        G = n82Var4;
        H = n82Var3;
        I = n82Var;
        J = n82Var3;
        K = n82Var2;
        L = n82Var2;
        M = n82Var2;
        N = n82Var;
        O = n82Var2;
        P = n82Var2;
        Q = n82Var2;
        R = n82Var2;
        S = n82Var2;
        T = n82Var2;
        U = n82Var2;
        Object obj = null;
        V = new gg7(obj, obj, obj, 11);
        X = new s8f(15);
        Y = new s8f(16);
    }

    /* JADX WARN: Code duplicated, block: B:172:0x0403  */
    /* JADX WARN: Code duplicated, block: B:191:0x0482  */
    /* JADX WARN: Code duplicated, block: B:192:0x0487  */
    /* JADX WARN: Code duplicated, block: B:197:0x04a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:198:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:199:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:205:0x04c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:206:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:207:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:210:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:211:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:214:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b0  */
    public static final fy9 A(int i2, int i3, l46 l46Var) {
        TypedValue typedValue;
        int i4;
        Object obj;
        long jC;
        int i5;
        int i6;
        byte b2;
        int i7;
        TypedArray typedArrayObtainStyledAttributes;
        int i8;
        TypedArray typedArrayObtainStyledAttributes2;
        int i9;
        int i10;
        int i11;
        int i12;
        Shader shader;
        int i13;
        b41 dtdVar;
        Shader shader2;
        int i14;
        b41 dtdVar2;
        int i15;
        int i16;
        ColorStateList colorStateListA;
        Context context = (Context) l46Var.k(uq.b);
        Resources resources = (Resources) l46Var.k(uq.c);
        ayb aybVar = (ayb) l46Var.k(uq.e);
        synchronized (aybVar) {
            typedValue = (TypedValue) aybVar.a.b(i2);
            i4 = 1;
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i2, typedValue, true);
                q69 q69Var = aybVar.a;
                int iD = q69Var.d(i2);
                Object[] objArr = q69Var.c;
                Object obj2 = objArr[iD];
                q69Var.b[iD] = i2;
                objArr[iD] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        boolean z2 = false;
        if (charSequence == null || !v4e.J(charSequence, ".xml")) {
            l46Var.f0(-1771643000);
            Object theme = context.getTheme();
            boolean zG = l46Var.g(charSequence);
            if ((((i3 & 14) ^ 6) <= 4 || !l46Var.e(i2)) && (i3 & 6) != 4) {
                i4 = 0;
            }
            int i17 = (l46Var.g(theme) ? 1 : 0) | (zG ? 1 : 0) | i4;
            Object objR = l46Var.R();
            if (i17 != 0 || objR == sf2.a) {
                obj = objR;
                try {
                    Drawable drawable = resources.getDrawable(i2, null);
                    drawable.getClass();
                    Object ksVar = new ks(((BitmapDrawable) drawable).getBitmap());
                    l46Var.p0(ksVar);
                    obj = ksVar;
                } catch (Exception e2) {
                    throw new eyb("Error attempting to load resource: " + ((Object) charSequence), e2);
                }
            }
            obj = objR;
            cv6 cv6Var = (cv6) obj;
            BitmapPainter bitmapPainter = new BitmapPainter(cv6Var, (((long) ((ks) cv6Var).a.getHeight()) & 4294967295L) | (((long) ((ks) cv6Var).a.getWidth()) << 32));
            l46Var.r(false);
            return bitmapPainter;
        }
        l46Var.f0(-1771798434);
        Resources.Theme theme2 = context.getTheme();
        int i18 = typedValue.changingConfigurations;
        jx6 jx6Var = (jx6) l46Var.k(uq.d);
        ix6 ix6Var = new ix6(theme2, i2);
        WeakReference weakReference = (WeakReference) jx6Var.a.get(ix6Var);
        hx6 hx6Var = weakReference != null ? (hx6) weakReference.get() : null;
        if (hx6Var == null) {
            XmlResourceParser xml = resources.getXml(i2);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (!pa7.t(xml.getName(), "vector")) {
                qc0.j("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                return null;
            }
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            rw rwVar = new rw();
            rwVar.c = xml;
            rwVar.a = 0;
            kd9 kd9Var = new kd9(23, z2);
            kd9Var.b = new float[64];
            rwVar.e = kd9Var;
            int[] iArr = an1.a;
            TypedArray typedArrayObtainAttributes = theme2 == null ? resources.obtainAttributes(attributeSetAsAttributeSet, iArr) : theme2.obtainStyledAttributes(attributeSetAsAttributeSet, iArr, 0, 0);
            rwVar.k(typedArrayObtainAttributes.getChangingConfigurations());
            boolean z3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null ? typedArrayObtainAttributes.getBoolean(5, false) : false;
            rwVar.k(typedArrayObtainAttributes.getChangingConfigurations());
            float f2 = rwVar.f(typedArrayObtainAttributes, "viewportWidth", 7, 0.0f);
            float f3 = rwVar.f(typedArrayObtainAttributes, "viewportHeight", 8, 0.0f);
            if (f2 <= 0.0f) {
                throw new XmlPullParserException(tec.l(typedArrayObtainAttributes.getPositionDescription(), "<VectorGraphic> tag requires viewportWidth > 0"));
            }
            if (f3 <= 0.0f) {
                throw new XmlPullParserException(tec.l(typedArrayObtainAttributes.getPositionDescription(), "<VectorGraphic> tag requires viewportHeight > 0"));
            }
            float dimension = typedArrayObtainAttributes.getDimension(3, 0.0f);
            rwVar.k(typedArrayObtainAttributes.getChangingConfigurations());
            float dimension2 = typedArrayObtainAttributes.getDimension(2, 0.0f);
            rwVar.k(typedArrayObtainAttributes.getChangingConfigurations());
            if (typedArrayObtainAttributes.hasValue(1)) {
                TypedValue typedValue2 = new TypedValue();
                typedArrayObtainAttributes.getValue(1, typedValue2);
                if (typedValue2.type == 2) {
                    jC = y72.k;
                } else {
                    if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
                        TypedValue typedValue3 = new TypedValue();
                        typedArrayObtainAttributes.getValue(1, typedValue3);
                        int i19 = typedValue3.type;
                        if (i19 == 2) {
                            s8f.n(typedValue3, "Failed to resolve attribute at index 1: ");
                            return null;
                        }
                        if (i19 < 28 || i19 > 31) {
                            Resources resources2 = typedArrayObtainAttributes.getResources();
                            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
                            ThreadLocal threadLocal = t82.a;
                            try {
                                colorStateListA = t82.a(resources2, resources2.getXml(resourceId), theme2);
                            } catch (Exception e3) {
                                b1.e("CSLCompat", "Failed to inflate ColorStateList.", e3);
                                colorStateListA = null;
                            }
                        } else {
                            colorStateListA = ColorStateList.valueOf(typedValue3.data);
                        }
                    } else {
                        colorStateListA = null;
                    }
                    rwVar.k(typedArrayObtainAttributes.getChangingConfigurations());
                    jC = colorStateListA != null ? abg.c(colorStateListA.getDefaultColor()) : y72.k;
                }
            } else {
                jC = y72.k;
            }
            long j2 = jC;
            int i20 = typedArrayObtainAttributes.getInt(6, -1);
            rwVar.k(typedArrayObtainAttributes.getChangingConfigurations());
            if (i20 == -1) {
                i5 = 5;
            } else if (i20 == 3) {
                i5 = 3;
            } else if (i20 == 5) {
                i5 = 5;
            } else if (i20 != 9) {
                switch (i20) {
                    case 14:
                        i5 = 13;
                        break;
                    case 15:
                        i5 = 14;
                        break;
                    case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                        i5 = 12;
                        break;
                    default:
                        i5 = 5;
                        break;
                }
            } else {
                i5 = 9;
            }
            float f4 = dimension / resources.getDisplayMetrics().density;
            float f5 = dimension2 / resources.getDisplayMetrics().density;
            typedArrayObtainAttributes.recycle();
            fx6 fx6Var = new fx6(null, f4, f5, f2, f3, j2, i5, z3, 1);
            int i21 = 0;
            for (int i22 = 3; xml.getEventType() != i4 && (xml.getDepth() >= i4 || xml.getEventType() != i22); i22 = 3) {
                List listK = pu4.a;
                XmlPullParser xmlPullParser = (XmlPullParser) rwVar.c;
                kd9 kd9Var2 = (kd9) rwVar.e;
                int i23 = i4;
                int eventType = xmlPullParser.getEventType();
                int i24 = i18;
                if (eventType != 2) {
                    if (eventType != i22) {
                        i6 = i21;
                        i4 = i23;
                    } else {
                        if ("group".equals(xmlPullParser.getName())) {
                            int i25 = i21 + 1;
                            int i26 = 0;
                            while (i26 < i25) {
                                ArrayList arrayList = fx6Var.i;
                                if (fx6Var.k) {
                                    i37.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                ex6 ex6Var = (ex6) arrayList.remove(arrayList.size() - 1);
                                ((ex6) ks0.f(i23, arrayList)).j.add(new lsf(ex6Var.a, ex6Var.b, ex6Var.c, ex6Var.d, ex6Var.e, ex6Var.f, ex6Var.g, ex6Var.h, ex6Var.i, ex6Var.j));
                                i26++;
                                i23 = 1;
                            }
                            int[] iArr2 = (int[]) rwVar.d;
                            if (iArr2 == null || (i16 = rwVar.b) == 0) {
                                i4 = 1;
                                i21 = 0;
                            } else {
                                int i27 = i16 - 1;
                                rwVar.b = i27;
                                i21 = iArr2[i27];
                                i4 = 1;
                            }
                            b2 = -1;
                        }
                        i6 = i21;
                        i4 = 1;
                    }
                    b2 = -1;
                    i21 = i6;
                } else {
                    String name = xmlPullParser.getName();
                    if (name != null) {
                        int iHashCode = name.hashCode();
                        if (iHashCode != -1649314686) {
                            i6 = i21;
                            if (iHashCode != 3433509) {
                                if (iHashCode == 98629247 && name.equals("group")) {
                                    int[] iArr3 = an1.b;
                                    TypedArray typedArrayObtainAttributes2 = theme2 == null ? resources.obtainAttributes(attributeSetAsAttributeSet, iArr3) : theme2.obtainStyledAttributes(attributeSetAsAttributeSet, iArr3, 0, 0);
                                    rwVar.k(typedArrayObtainAttributes2.getChangingConfigurations());
                                    float f6 = rwVar.f(typedArrayObtainAttributes2, "rotation", 5, 0.0f);
                                    float f7 = typedArrayObtainAttributes2.getFloat(1, 0.0f);
                                    rwVar.k(typedArrayObtainAttributes2.getChangingConfigurations());
                                    float f8 = typedArrayObtainAttributes2.getFloat(2, 0.0f);
                                    rwVar.k(typedArrayObtainAttributes2.getChangingConfigurations());
                                    float f9 = rwVar.f(typedArrayObtainAttributes2, "scaleX", 3, 1.0f);
                                    float f10 = rwVar.f(typedArrayObtainAttributes2, "scaleY", 4, 1.0f);
                                    float f11 = rwVar.f(typedArrayObtainAttributes2, "translateX", 6, 0.0f);
                                    float f12 = rwVar.f(typedArrayObtainAttributes2, "translateY", 7, 0.0f);
                                    String string = typedArrayObtainAttributes2.getString(0);
                                    rwVar.k(typedArrayObtainAttributes2.getChangingConfigurations());
                                    String str = string == null ? "" : string;
                                    typedArrayObtainAttributes2.recycle();
                                    int i28 = msf.a;
                                    if (fx6Var.k) {
                                        i37.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    fx6Var.i.add(new ex6(str, f6, f7, f8, f9, f10, f11, f12, listK, 512));
                                    int[] iArrCopyOf = (int[]) rwVar.d;
                                    if (iArrCopyOf == null) {
                                        iArrCopyOf = new int[4];
                                        rwVar.d = iArrCopyOf;
                                    } else if (rwVar.b >= iArrCopyOf.length) {
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
                                        rwVar.d = iArrCopyOf;
                                    }
                                    int i29 = rwVar.b;
                                    rwVar.b = i29 + 1;
                                    iArrCopyOf[i29] = i6;
                                    i4 = 1;
                                    i21 = 0;
                                    b2 = -1;
                                }
                            } else if (name.equals("path")) {
                                int[] iArr4 = an1.c;
                                if (theme2 == null) {
                                    typedArrayObtainStyledAttributes2 = resources.obtainAttributes(attributeSetAsAttributeSet, iArr4);
                                    i8 = 0;
                                } else {
                                    i8 = 0;
                                    typedArrayObtainStyledAttributes2 = theme2.obtainStyledAttributes(attributeSetAsAttributeSet, iArr4, 0, 0);
                                }
                                rwVar.k(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                                    qc0.j("No path data available");
                                    return null;
                                }
                                String string2 = typedArrayObtainStyledAttributes2.getString(i8);
                                rwVar.k(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                String str2 = string2 == null ? "" : string2;
                                String string3 = typedArrayObtainStyledAttributes2.getString(2);
                                rwVar.k(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                if (string3 == null) {
                                    int i30 = msf.a;
                                } else {
                                    listK = kd9.K(kd9Var2, string3);
                                }
                                List list = listK;
                                sug sugVarE = rwVar.e(typedArrayObtainStyledAttributes2, theme2, "fillColor", 1);
                                float f13 = rwVar.f(typedArrayObtainStyledAttributes2, "fillAlpha", 12, 1.0f);
                                int i31 = !z7c.l((XmlPullParser) rwVar.c, "strokeLineCap") ? -1 : typedArrayObtainStyledAttributes2.getInt(8, -1);
                                rwVar.k(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                if (i31 == 0) {
                                    i9 = 0;
                                } else if (i31 == 1) {
                                    i9 = 1;
                                } else if (i31 != 2) {
                                    i9 = 0;
                                } else {
                                    i9 = 2;
                                }
                                if (z7c.l((XmlPullParser) rwVar.c, "strokeLineJoin")) {
                                    b2 = -1;
                                    i10 = typedArrayObtainStyledAttributes2.getInt(9, -1);
                                } else {
                                    i10 = -1;
                                    b2 = -1;
                                }
                                rwVar.k(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                if (i10 != 0) {
                                    if (i10 == 1) {
                                        i11 = 1;
                                    } else if (i10 == 2) {
                                        i11 = 2;
                                    }
                                    float f14 = rwVar.f(typedArrayObtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                    sug sugVarE2 = rwVar.e(typedArrayObtainStyledAttributes2, theme2, "strokeColor", 3);
                                    float f15 = rwVar.f(typedArrayObtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                    float f16 = rwVar.f(typedArrayObtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                    float f17 = rwVar.f(typedArrayObtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                    float f18 = rwVar.f(typedArrayObtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                    float f19 = rwVar.f(typedArrayObtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                    if (z7c.l((XmlPullParser) rwVar.c, "fillType")) {
                                        i12 = typedArrayObtainStyledAttributes2.getInt(13, 0);
                                    } else {
                                        i12 = 0;
                                    }
                                    rwVar.k(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                    typedArrayObtainStyledAttributes2.recycle();
                                    shader = (Shader) sugVarE.c;
                                    i13 = sugVarE.b;
                                    if (shader == null && i13 == 0) {
                                        dtdVar = null;
                                    } else if (shader != null) {
                                        dtdVar = new c41(shader);
                                    } else {
                                        dtdVar = new dtd(abg.c(i13));
                                    }
                                    shader2 = (Shader) sugVarE2.c;
                                    i14 = sugVarE2.b;
                                    if (shader2 == null && i14 == 0) {
                                        dtdVar2 = null;
                                    } else if (shader2 != null) {
                                        dtdVar2 = new c41(shader2);
                                    } else {
                                        dtdVar2 = new dtd(abg.c(i14));
                                    }
                                    if (i12 == 0) {
                                        i15 = 0;
                                    } else {
                                        i15 = 1;
                                    }
                                    if (fx6Var.k) {
                                        i37.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    ((ex6) ks0.f(1, fx6Var.i)).j.add(new osf(str2, list, i15, dtdVar, f13, dtdVar2, f15, f16, i9, i11, f14, f19, f17, f18));
                                    i21 = i6;
                                    i4 = 1;
                                }
                                i11 = 0;
                                float f110 = rwVar.f(typedArrayObtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                sug sugVarE3 = rwVar.e(typedArrayObtainStyledAttributes2, theme2, "strokeColor", 3);
                                float f111 = rwVar.f(typedArrayObtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                float f112 = rwVar.f(typedArrayObtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                float f113 = rwVar.f(typedArrayObtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                float f114 = rwVar.f(typedArrayObtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                float f115 = rwVar.f(typedArrayObtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                if (z7c.l((XmlPullParser) rwVar.c, "fillType")) {
                                    i12 = 0;
                                } else {
                                    i12 = typedArrayObtainStyledAttributes2.getInt(13, 0);
                                }
                                rwVar.k(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                typedArrayObtainStyledAttributes2.recycle();
                                shader = (Shader) sugVarE.c;
                                i13 = sugVarE.b;
                                if (shader == null) {
                                    dtdVar = null;
                                } else if (shader != null) {
                                    dtdVar = new c41(shader);
                                } else {
                                    dtdVar = new dtd(abg.c(i13));
                                }
                                shader2 = (Shader) sugVarE3.c;
                                i14 = sugVarE3.b;
                                if (shader2 == null) {
                                    dtdVar2 = null;
                                } else if (shader2 != null) {
                                    dtdVar2 = new c41(shader2);
                                } else {
                                    dtdVar2 = new dtd(abg.c(i14));
                                }
                                if (i12 == 0) {
                                    i15 = 0;
                                } else {
                                    i15 = 1;
                                }
                                if (fx6Var.k) {
                                    i37.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                ((ex6) ks0.f(1, fx6Var.i)).j.add(new osf(str2, list, i15, dtdVar, f13, dtdVar2, f111, f112, i9, i11, f110, f115, f113, f114));
                                i21 = i6;
                                i4 = 1;
                            }
                        } else {
                            i6 = i21;
                            ix6Var = ix6Var;
                            b2 = -1;
                            if (name.equals("clip-path")) {
                                int[] iArr5 = an1.d;
                                if (theme2 == null) {
                                    typedArrayObtainStyledAttributes = resources.obtainAttributes(attributeSetAsAttributeSet, iArr5);
                                    i7 = 0;
                                } else {
                                    i7 = 0;
                                    typedArrayObtainStyledAttributes = theme2.obtainStyledAttributes(attributeSetAsAttributeSet, iArr5, 0, 0);
                                }
                                rwVar.k(typedArrayObtainStyledAttributes.getChangingConfigurations());
                                String string4 = typedArrayObtainStyledAttributes.getString(i7);
                                rwVar.k(typedArrayObtainStyledAttributes.getChangingConfigurations());
                                String str3 = string4 == null ? "" : string4;
                                i4 = 1;
                                String string5 = typedArrayObtainStyledAttributes.getString(1);
                                rwVar.k(typedArrayObtainStyledAttributes.getChangingConfigurations());
                                if (string5 == null) {
                                    int i32 = msf.a;
                                } else {
                                    listK = kd9.K(kd9Var2, string5);
                                }
                                List list2 = listK;
                                typedArrayObtainStyledAttributes.recycle();
                                if (fx6Var.k) {
                                    i37.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                fx6Var.i.add(new ex6(str3, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list2, 512));
                                i21 = i6 + 1;
                            } else {
                                i4 = 1;
                                i21 = i6;
                            }
                        }
                    } else {
                        i6 = i21;
                    }
                    i4 = 1;
                    b2 = -1;
                    i21 = i6;
                }
                xml.next();
                ix6Var = ix6Var;
                i18 = i24;
            }
            ix6 ix6Var2 = ix6Var;
            hx6Var = new hx6(fx6Var.b(), i18 | rwVar.a);
            jx6Var.a.put(ix6Var2, new WeakReference(hx6Var));
        }
        VectorPainter vectorPainterX = o7c.x(hx6Var.a, l46Var);
        l46Var.r(false);
        return vectorPainterX;
    }

    public static final Object B(u8a u8aVar, b1b b1bVar) {
        b1bVar.getClass();
        Object objB = u8aVar.get(b1bVar);
        if (objB == null) {
            objB = b1bVar.b();
        }
        return ((srf) objB).a(u8aVar);
    }

    public static final fi8 C(String str, l46 l46Var) {
        str.getClass();
        return y41.K(new gi8(str), ub3.k(v4e.k0(str, '/'), "/images/", v4e.k0(v4e.g0('/', str, str), '.'), "/"), l46Var, 0, 60);
    }

    public static final v1e D(boolean z2, x16 x16Var, l46 l46Var, int i2) {
        w31 w31Var = (w31) l46Var.k(y31.a);
        cv7 cv7Var = (cv7) l46Var.k(zg2.n);
        boolean zE = ((((i2 & 896) ^ 384) > 256 && l46Var.g(x16Var)) || (i2 & 384) == 256) | ((((i2 & 14) ^ 6) > 4 && l46Var.h(false)) || (i2 & 6) == 4) | l46Var.e(cv7Var.ordinal()) | l46Var.g(w31Var) | ((((i2 & 112) ^ 48) > 32 && l46Var.h(z2)) || (i2 & 48) == 32);
        Object objR = l46Var.R();
        if (zE || objR == sf2.a) {
            objR = new v1e(x16Var, cv7Var, z2, w31Var);
            l46Var.p0(objR);
        }
        return (v1e) objR;
    }

    public static final j09 E(j09 j09Var, zhc zhcVar, ks9 ks9Var, lu9 lu9Var, boolean z2, gj5 gj5Var, u69 u69Var, w31 w31Var) {
        ks9 ks9Var2 = ks9.a;
        g09 g09Var = g09.a;
        return j09Var.D(ks9Var == ks9Var2 ? oa7.E(g09Var, y02.d) : oa7.E(g09Var, y02.c)).D(new hhc(w31Var, gj5Var, u69Var, ks9Var, lu9Var, zhcVar, z2, false));
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
  (r0v0 int) from 0x0007: SWITCH (r0v0 int)
 case -1811142716: goto B:118:0x0130
 case -1811142715: goto B:113:0x0123
 case -1811142714: goto B:108:0x0116
 case -1811142713: goto B:103:0x0109
 case -1811142712: goto B:98:0x00fc
 case -1811142711: goto B:93:0x00ef
 case -1811142710: goto B:88:0x00e2
 case -1811142709: goto B:83:0x00d5
 case -1811142708: goto B:78:0x00c8
 case -1811142707: goto B:73:0x00bb
 default: goto B:5:0x000a A[RegionRef:SW:4] (LINE:8)
  (r0v0 int) from 0x000a: SWITCH (r0v0 int)
 case -1811142685: goto B:68:0x00ae
 case -1811142684: goto B:63:0x00a1
 case -1811142683: goto B:58:0x0094
 default: goto B:6:0x000d A[RegionRef:SW:5] (LINE:11)
  (r0v0 int) from 0x000d: SWITCH (r0v0 int)
 case 80123371: goto B:53:0x0087
 case 80123372: goto B:48:0x007a
 case 80123373: goto B:43:0x006d
 case 80123374: goto B:38:0x0060
 case 80123375: goto B:33:0x0053
 case 80123376: goto B:28:0x0046
 case 80123377: goto B:23:0x0039
 case 80123378: goto B:18:0x002c
 case 80123379: goto B:13:0x001f
 case 80123380: goto B:8:0x0012
 default: goto B:313:? A[RegionRef:SW:6] (LINE:14)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String F(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "Companion";
            case "java.lang.Integer":
                return "Int";
            case "java.lang.Cloneable":
                return "Cloneable";
            case "java.lang.annotation.Annotation":
                return "Annotation";
            case "java.lang.Comparable":
                return "Comparable";
            case "java.util.Map":
                return "Map";
            case "java.util.Set":
                return "Set";
            case "double":
                return "Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "Companion";
            case "java.lang.CharSequence":
                return "CharSequence";
            case "java.util.Collection":
                return "Collection";
            case "java.lang.Float":
                return "Float";
            case "java.lang.Short":
                return "Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "Companion";
            case "java.util.Map$Entry":
                return "Entry";
            case "int":
                return "Int";
            case "byte":
                return "Byte";
            case "char":
                return "Char";
            case "long":
                return "Long";
            case "boolean":
                return "Boolean";
            case "java.util.List":
                return "List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "Companion";
            case "float":
                return "Float";
            case "short":
                return "Short";
            case "java.lang.Character":
                return "Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "Companion";
            case "java.lang.Boolean":
                return "Boolean";
            case "java.lang.Byte":
                return "Byte";
            case "java.lang.Enum":
                return "Enum";
            case "java.lang.Long":
                return "Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "Companion";
            case "java.util.Iterator":
                return "Iterator";
            case "java.util.ListIterator":
                return "ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "Companion";
            case "java.lang.Double":
                return "Double";
            case "java.lang.Number":
                return "Number";
            case "java.lang.Object":
                return "Any";
            case "java.lang.String":
                return "String";
            case "java.lang.Iterable":
                return "Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "Companion";
            case "java.lang.Throwable":
                return "Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static int G(int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (i2 == 1) {
            return 90;
        }
        if (i2 == 2) {
            return 180;
        }
        if (i2 == 3) {
            return 270;
        }
        qc0.j(tec.e(i2, "Unsupported surface rotation: "));
        return 0;
    }

    public static final u8a H(e1b[] e1bVarArr, u8a u8aVar, u8a u8aVar2) {
        u8a u8aVar3 = u8a.d;
        t8a t8aVar = new t8a(u8aVar3);
        t8aVar.g = u8aVar3;
        for (e1b e1bVar : e1bVarArr) {
            b1b b1bVar = e1bVar.a;
            if (e1bVar.g || !u8aVar.containsKey(b1bVar)) {
                t8aVar.put(b1bVar, b1bVar.d(e1bVar, (srf) u8aVar2.get(b1bVar)));
            }
        }
        return t8aVar.f();
    }

    public static final j09 I(g7g g7gVar) {
        return new hx3(g7gVar, Y);
    }

    public static final j09 J(fx fxVar) {
        return new hx3(fxVar, X);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0090 A[PHI: r0
  0x0090: PHI (r0v32 java.lang.String) = (r0v4 java.lang.String), (r0v15 java.lang.String), (r0v18 java.lang.String), (r0v19 java.lang.String) binds: [B:43:0x008e, B:76:0x010f, B:65:0x00e1, B:54:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    public static yc4 K(yc4 yc4Var) {
        Object dzbVar;
        List list;
        String str;
        String str2;
        iy9 iy9Var;
        String str3;
        try {
            dzbVar = cn1.z().getString(R.string.history_wait_additional_info_preview);
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        if (dzbVar instanceof dzb) {
            dzbVar = "";
        }
        String strH = (String) dzbVar;
        strH.getClass();
        rob robVar = kd4.a;
        fb4 fb4Var = yc4Var.h;
        fb4Var.getClass();
        List list2 = fb4Var.b;
        jd4 jd4Var = fb4Var.a;
        cm4 cm4Var = fb4Var.h;
        if (cm4Var == null || (list = cm4Var.d) == null) {
            boolean z2 = jd4Var instanceof bd4;
            pu4 pu4Var = pu4.a;
            if (z2) {
                dd4 dd4Var = ((bd4) jd4Var).b;
                ad4 ad4Var = dd4Var instanceof ad4 ? (ad4) dd4Var : null;
                list = ad4Var != null ? ad4Var.b : null;
                if (list == null) {
                    list = pu4Var;
                }
            } else if (jd4Var instanceof ad4) {
                list = ((ad4) jd4Var).b;
            } else {
                if (!(jd4Var instanceof zc4) && !(jd4Var instanceof gd4) && !(jd4Var instanceof fd4) && !pa7.t(jd4Var, hd4.a) && !(jd4Var instanceof id4) && !pa7.t(jd4Var, cd4.a)) {
                    ap.c();
                    return null;
                }
                list = pu4Var;
            }
        }
        Set set = qp5.a;
        List list3 = qp5.a(qu4.a, list2).c;
        if (jd4Var instanceof fd4) {
            str = strH;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (obj instanceof et8) {
                    arrayList.add(obj);
                }
            }
            et8 et8Var = (et8) s72.x0(arrayList);
            if (et8Var == null || (strH = et8Var.b) == null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (obj2 instanceof kt8) {
                        arrayList2.add(obj2);
                    }
                }
                kt8 kt8Var = (kt8) s72.H0(arrayList2);
                if (kt8Var == null || (str2 = kt8Var.b) == null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : list2) {
                        if (obj3 instanceof ct8) {
                            arrayList3.add(obj3);
                        }
                    }
                    ct8 ct8Var = (ct8) s72.H0(arrayList3);
                    strH = ct8Var != null ? ct8Var.a : null;
                    if (strH == null) {
                        str = "";
                    }
                } else {
                    strH = kd4.a.h(str2, "");
                }
                str = strH;
            } else {
                str = strH;
            }
        }
        tdb tdbVar = jd4Var instanceof bd4 ? tdb.a : (cm4Var == null || !((jd4Var instanceof hd4) || (jd4Var instanceof cd4))) ? tdb.b : tdb.c;
        ArrayList<TarotCardChoice> arrayListQ0 = s72.Q0(list, list3);
        ArrayList arrayList4 = new ArrayList();
        for (TarotCardChoice tarotCardChoice : arrayListQ0) {
            MixedDeckSnapshot mixedDeckSnapshot = fb4Var.i;
            if (mixedDeckSnapshot != null) {
                String cardKey = tarotCardChoice.getCard().getCardKey();
                if (mixedDeckSnapshot.getVersion() != 1 || (str3 = mixedDeckSnapshot.getSkinsByCard().get(cardKey)) == null) {
                    str3 = "";
                }
                iy9Var = new iy9(cardKey, str3);
            } else {
                iy9Var = null;
            }
            if (iy9Var != null) {
                arrayList4.add(iy9Var);
            }
        }
        return yc4.a(yc4Var, null, false, null, null, 0, null, null, null, null, null, str, tdbVar, new ld4(list, list3, bm8.W(arrayList4)), 524287);
    }

    public static final void a(int i2, dd2 dd2Var, x16 x16Var, l46 l46Var, String str, boolean z2) {
        x16 x16Var2;
        l46 l46Var2 = l46Var;
        x16Var.getClass();
        l46Var2.h0(1843770582);
        int i3 = i2 | (l46Var2.h(z2) ? 4 : 2);
        int i4 = 0;
        if (!l46Var2.W(i3 & 1, (i3 & 1171) != 1170)) {
            l46Var2.Z();
        } else if (z2) {
            l46Var2.f0(-567099124);
            ted tedVarF = zz8.f(6, 2, null, l46Var2);
            Object objR = l46Var2.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = af1.E(l46Var2);
                l46Var2.p0(objR);
            }
            aw2 aw2Var = (aw2) objR;
            j09 j09VarW = mh3.W(g09.a);
            long j2 = ((e8b) l46Var2.k(l8b.a)).e;
            y6c y6cVarD = a7c.d(32.0f, 32.0f, 0.0f, 12);
            boolean zI = l46Var2.i(aw2Var) | l46Var2.g(tedVarF);
            Object objR2 = l46Var2.R();
            if (zI || objR2 == i8cVar) {
                x16Var2 = x16Var;
                objR2 = new m50(aw2Var, tedVarF, x16Var2, i4);
                l46Var2.p0(objR2);
            } else {
                x16Var2 = x16Var;
            }
            zz8.a((x16) objR2, j09VarW, tedVarF, 0.0f, false, y6cVarD, j2, 0L, 0L, i7h.c, new ai(29), null, af1.b0(-897551409, new n50(aw2Var, tedVarF, x16Var2, str, dd2Var, 0), l46Var2), l46Var, 0, 3078, 5016);
            l46Var2 = l46Var;
            l46Var2.r(false);
        } else {
            l46Var2.f0(-564392948);
            l46Var2.r(false);
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o50(i2, 0, x16Var, str, dd2Var, z2);
        }
    }

    public static final void b(j09 j09Var, l46 l46Var, int i2) {
        j09 j09Var2;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-196202180);
        int i3 = i2 | 6;
        int i4 = 0;
        if (l46Var2.W(i3 & 1, (i3 & 3) != 2)) {
            t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(i4)), ndb.z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            g09 g09Var = g09.a;
            j09 j09VarJ = m93.J(l46Var2, g09Var);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, t7cVarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            feg.j(A(R.drawable.logo_quin, 0, l46Var2), "Quin Logo", b.d(g09Var, 36.0f), null, null, 0.0f, null, l46Var, 440, 120);
            j09 j09VarD0 = ynb.d0(0.0f, 0.0f, 6.0f, 0.0f, 11, b.d(g09Var, 16.0f));
            pr4 pr4Var = l8b.a;
            oa7.n(j09VarD0, 0.5f, ((e8b) l46Var.k(pr4Var)).z, l46Var, 54, 0);
            String strQ = afc.q(R.string.annual_fortune_share_footer, l46Var);
            mue mueVar = pue.a;
            nte.b(strQ, null, ((e8b) l46Var.k(pr4Var)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.g(l46Var), l46Var, 0, 0, 131066);
            l46Var2 = l46Var;
            l46Var2.r(true);
            j09Var2 = g09Var;
        } else {
            l46Var2.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l50(i2, 0, j09Var2);
        }
    }

    public static final void c(q84 q84Var, l46 l46Var, int i2) {
        q84 q84Var2;
        l46 l46Var2;
        q84 q84Var3 = q84Var;
        l46 l46Var3 = l46Var;
        l46Var3.h0(294589392);
        if ((((l46Var3.i(q84Var3) ? 4 : 2) | i2) & 3) == 2 && l46Var3.F()) {
            l46Var3.Z();
            q84Var2 = q84Var3;
            l46Var2 = l46Var3;
        } else {
            rcc rccVarL = scc.l(l46Var3);
            whb whbVar = q84Var3.b().e;
            e89 e89VarI = jzb.i(whbVar, whbVar.getValue(), l46Var3, 0, 0);
            List list = (List) e89VarI.getValue();
            boolean zBooleanValue = ((Boolean) l46Var3.k(h57.a)).booleanValue();
            boolean zG = l46Var3.g(list);
            Object objR = l46Var3.R();
            i8c i8cVar = sf2.a;
            Object obj = objR;
            if (zG || objR == i8cVar) {
                jsd jsdVar = new jsd();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    da9 da9Var = (da9) obj2;
                    if (zBooleanValue || da9Var.v.j.i.compareTo(g48.d) >= 0) {
                        arrayList.add(obj2);
                    }
                }
                jsdVar.addAll(arrayList);
                l46Var3.p0(jsdVar);
                obj = jsdVar;
            }
            jsd jsdVar2 = (jsd) obj;
            h(jsdVar2, (List) e89VarI.getValue(), l46Var3, 0);
            whb whbVar2 = q84Var3.b().f;
            e89 e89VarI2 = jzb.i(whbVar2, whbVar2.getValue(), l46Var3, 0, 0);
            Object objR2 = l46Var3.R();
            if (objR2 == i8cVar) {
                objR2 = new jsd();
                l46Var3.p0(objR2);
            }
            jsd jsdVar3 = (jsd) objR2;
            l46Var3.f0(-367418626);
            ListIterator listIterator = jsdVar2.listIterator();
            l46 l46Var4 = l46Var3;
            while (true) {
                ql6 ql6Var = (ql6) listIterator;
                if (!ql6Var.hasNext()) {
                    break;
                }
                da9 da9Var2 = (da9) ql6Var.next();
                ua9 ua9Var = da9Var2.b;
                ua9Var.getClass();
                p84 p84Var = (p84) ua9Var;
                boolean zI = l46Var4.i(q84Var3) | l46Var4.i(da9Var2);
                Object objR3 = l46Var4.R();
                if (zI || objR3 == i8cVar) {
                    objR3 = new jt3(8, q84Var3, da9Var2);
                    l46Var4.p0(objR3);
                }
                x16 x16Var = (x16) objR3;
                s84 s84Var = p84Var.f;
                q84 q84Var4 = q84Var3;
                rcc rccVar = rccVarL;
                dd2 dd2VarB0 = af1.b0(1129586364, new bf3(da9Var2, q84Var3, rccVarL, jsdVar3, p84Var, 2), l46Var4);
                l46 l46Var5 = l46Var4;
                t72.b(x16Var, s84Var, dd2VarB0, l46Var5, 384, 0);
                q84Var3 = q84Var4;
                jsdVar3 = jsdVar3;
                l46Var4 = l46Var5;
                rccVarL = rccVar;
            }
            q84Var2 = q84Var3;
            l46 l46Var6 = l46Var4;
            jsd jsdVar4 = jsdVar3;
            l46Var6.r(false);
            Set set = (Set) e89VarI2.getValue();
            boolean zG2 = l46Var6.g(e89VarI2) | l46Var6.i(q84Var2);
            Object objR4 = l46Var6.R();
            if (zG2 || objR4 == i8cVar) {
                objR4 = new n84(e89VarI2, q84Var2, jsdVar4, null);
                l46Var6.p0(objR4);
            }
            af1.p(set, jsdVar4, (l26) objR4, l46Var6);
            l46Var2 = l46Var6;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new i1(q84Var2, i2, 19);
        }
    }

    public static final void d(final int i2, final g06 g06Var, final int i3, final int i4, final x16 x16Var, final x16 x16Var2, final x16 x16Var3, l46 l46Var, final int i5) {
        int i6;
        int i7;
        x16Var.getClass();
        x16Var2.getClass();
        x16Var3.getClass();
        l46Var.h0(289627005);
        int i8 = (l46Var.e(i2) ? 4 : 2) | i5 | (l46Var.e(g06Var.ordinal()) ? 32 : 16);
        if ((i5 & 384) == 0) {
            i6 = i3;
            i8 |= l46Var.e(i6) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        } else {
            i6 = i3;
        }
        if ((i5 & 3072) == 0) {
            i7 = i4;
            i8 |= l46Var.e(i7) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        } else {
            i7 = i4;
        }
        int i9 = i8 | (l46Var.i(x16Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(x16Var2) ? 131072 : 65536) | (l46Var.i(x16Var3) ? 1048576 : 524288);
        if (l46Var.W(i9 & 1, (599187 & i9) != 599186)) {
            pr4 pr4Var = l8b.a;
            nae.a(androidx.compose.ui.platform.b.a(ynb.b0(12.0f, 0.0f, b.c(g09.a, 1.0f), 2), "friendCouponGrant"), a7c.b(32.0f), ((e8b) l46Var.k(pr4Var)).c, 0L, 0.0f, 0.0f, null, af1.b0(-1674541566, new c06(x16Var3, i6, i7, i2, k8b.f((e8b) l46Var.k(pr4Var)), g06Var, x16Var, x16Var2), l46Var), l46Var, 12582918, 120);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: d06
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    od4.d(i2, g06Var, i3, i4, x16Var, x16Var2, x16Var3, (l46) obj, k99.P(i5 | 1));
                    return wef.a;
                }
            };
        }
    }

    public static final void e(final int i2, final g06 g06Var, final int i3, final int i4, final x16 x16Var, final x16 x16Var2, final x16 x16Var3, final x16 x16Var4, l46 l46Var, final int i5) {
        x16Var.getClass();
        x16Var2.getClass();
        x16Var3.getClass();
        x16Var4.getClass();
        l46Var.h0(-1560015956);
        int i6 = i5 | (l46Var.e(i2) ? 4 : 2) | (l46Var.e(g06Var.ordinal()) ? 32 : 16) | (l46Var.e(i3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.e(i4) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(x16Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(x16Var2) ? 131072 : 65536) | (l46Var.i(x16Var3) ? 1048576 : 524288) | (l46Var.i(x16Var4) ? 8388608 : 4194304);
        boolean z2 = false;
        if (l46Var.W(i6 & 1, (4793491 & i6) != 4793490)) {
            boolean z3 = (57344 & i6) == 16384;
            Object objR = l46Var.R();
            if (z3 || objR == sf2.a) {
                objR = new e06(x16Var, null);
                l46Var.p0(objR);
            }
            af1.o((l26) objR, l46Var, wef.a);
            t72.b(x16Var4, new s84(z2, z2, 3), af1.b0(-87991357, new wr5(i2, g06Var, i3, i4, x16Var2, x16Var3, x16Var4), l46Var), l46Var, ((i6 >> 21) & 14) | 432, 0);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(i2, g06Var, i3, i4, x16Var, x16Var2, x16Var3, x16Var4, i5) { // from class: b06
                public final /* synthetic */ int a;
                public final /* synthetic */ g06 b;
                public final /* synthetic */ int c;
                public final /* synthetic */ int d;
                public final /* synthetic */ x16 e;
                public final /* synthetic */ x16 f;
                public final /* synthetic */ x16 g;
                public final /* synthetic */ x16 v;

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(1);
                    od4.e(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, (l46) obj, iP);
                    return wef.a;
                }
            };
        }
    }

    public static final void f(j09 j09Var, ma8 ma8Var, x16 x16Var, n26 n26Var, l46 l46Var, int i2) {
        j09 j09Var2;
        n26 n26Var2;
        n26 n26Var3;
        l46Var.h0(261373954);
        int i3 = i2 | 54 | (l46Var.i(ma8Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | 24576;
        if (l46Var.W(i3 & 1, (i3 & 9363) != 9362)) {
            l46Var.b0();
            if ((i2 & 1) == 0 || l46Var.C()) {
                n26Var3 = i7h.d;
                j09Var = g09.a;
            } else {
                l46Var.Z();
                n26Var3 = n26Var;
            }
            l46Var.s();
            Context context = (Context) l46Var.k(uq.b);
            j09 j09Var3 = j09Var;
            n26 n26Var4 = n26Var3;
            v70.c(af1.b0(632576454, new m65(ma8Var, context, x16Var, 11), l46Var), j09Var3, null, n26Var4, 0.0f, null, fdc.v(y72.b(((m82) l46Var.k(o82.a)).n, 0.0f), 0L, 0L, 0L, l46Var, 62), l46Var, 3126, 180);
            j09Var2 = j09Var3;
            n26Var2 = n26Var4;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
            n26Var2 = n26Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new q8(j09Var2, ma8Var, x16Var, n26Var2, i2, 24);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:38:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:49:0x00df  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:61:0x0117  */
    /* JADX WARN: Code duplicated, block: B:63:0x0157  */
    /* JADX WARN: Code duplicated, block: B:66:0x0167  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public static final void g(final j09 j09Var, final String str, boolean z2, final int i2, float f2, yi yiVar, x16 x16Var, l46 l46Var, final int i3, final int i4) {
        j09 j09Var2;
        int i5;
        yi yiVar2;
        int i6;
        boolean z3;
        final float f3;
        final x16 x16Var2;
        final yi yiVar3;
        final boolean z4;
        ojb ojbVarV;
        Object objR;
        Object obj;
        x16 x16Var3;
        ug8 ug8VarL;
        boolean z5;
        boolean z6;
        boolean z7;
        Object objR2;
        boolean zG;
        Object objR3;
        l46Var.h0(1848169916);
        if ((i3 & 6) == 0) {
            j09Var2 = j09Var;
            i5 = (l46Var.g(j09Var2) ? 4 : 2) | i3;
        } else {
            j09Var2 = j09Var;
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= l46Var.g(str) ? 32 : 16;
        }
        int i7 = i5 | 384;
        if ((i3 & 3072) == 0) {
            i7 |= l46Var.e(i2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        int i8 = i7 | 24576;
        int i9 = i4 & 32;
        if (i9 == 0) {
            if ((196608 & i3) == 0) {
                yiVar2 = yiVar;
                i8 |= l46Var.g(yiVar2) ? 131072 : 65536;
            }
            i6 = i8 | 1572864;
            if ((599187 & i6) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i6 & 1, z3)) {
                if (i9 != 0) {
                    yiVar2 = ndb.f;
                }
                yi yiVar4 = yiVar2;
                objR = l46Var.R();
                obj = sf2.a;
                if (objR == obj) {
                    objR = new ov7(29);
                    l46Var.p0(objR);
                }
                x16Var3 = (x16) objR;
                fi8 fi8VarK = y41.K(new gi8(str), null, l46Var, 0, 62);
                ug8VarL = rs0.l((uh8) fi8VarK.getValue(), true, false, false, 1.0f, i2, l46Var, 924);
                Float fValueOf = Float.valueOf(((Number) ((eh8) ug8VarL).getValue()).floatValue());
                boolean zG2 = l46Var.g(ug8VarL);
                if ((i6 & 7168) == 2048) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean z8 = zG2 | z5;
                if ((3670016 & i6) == 1048576) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = z8 | z6;
                objR2 = l46Var.R();
                if (z7 || objR2 == obj) {
                    objR2 = new ih8(i2, x16Var3, ug8VarL, null);
                    l46Var.p0(objR2);
                }
                af1.o((l26) objR2, l46Var, fValueOf);
                uh8 uh8Var = (uh8) fi8VarK.getValue();
                zG = l46Var.g(ug8VarL);
                objR3 = l46Var.R();
                if (zG || objR3 == obj) {
                    objR3 = new fh8(ug8VarL, 0);
                    l46Var.p0(objR3);
                }
                mh3.e(uh8Var, (x16) objR3, j09Var2, false, false, false, false, null, false, yiVar4, an2.d, false, false, null, null, false, l46Var, (i6 << 6) & 896, ((i6 >> 15) & 14) | 48, 127992);
                x16Var2 = x16Var3;
                yiVar3 = yiVar4;
                z4 = true;
                f3 = 1.0f;
            } else {
                l46Var.Z();
                f3 = f2;
                x16Var2 = x16Var;
                yiVar3 = yiVar2;
                z4 = z2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: gh8
                    @Override // defpackage.l26
                    public final Object z(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        od4.g(j09Var, str, z4, i2, f3, yiVar3, x16Var2, (l46) obj2, k99.P(i3 | 1), i4);
                        return wef.a;
                    }
                };
            }
        }
        i8 = 221184 | i7;
        yiVar2 = yiVar;
        i6 = i8 | 1572864;
        if ((599187 & i6) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (l46Var.W(i6 & 1, z3)) {
            if (i9 != 0) {
                yiVar2 = ndb.f;
            }
            yi yiVar5 = yiVar2;
            objR = l46Var.R();
            obj = sf2.a;
            if (objR == obj) {
                objR = new ov7(29);
                l46Var.p0(objR);
            }
            x16Var3 = (x16) objR;
            fi8 fi8VarK2 = y41.K(new gi8(str), null, l46Var, 0, 62);
            ug8VarL = rs0.l((uh8) fi8VarK2.getValue(), true, false, false, 1.0f, i2, l46Var, 924);
            Float fValueOf2 = Float.valueOf(((Number) ((eh8) ug8VarL).getValue()).floatValue());
            boolean zG3 = l46Var.g(ug8VarL);
            if ((i6 & 7168) == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z9 = zG3 | z5;
            if ((3670016 & i6) == 1048576) {
                z6 = true;
            } else {
                z6 = false;
            }
            z7 = z9 | z6;
            objR2 = l46Var.R();
            if (z7) {
                objR2 = new ih8(i2, x16Var3, ug8VarL, null);
                l46Var.p0(objR2);
            } else {
                objR2 = new ih8(i2, x16Var3, ug8VarL, null);
                l46Var.p0(objR2);
            }
            af1.o((l26) objR2, l46Var, fValueOf2);
            uh8 uh8Var2 = (uh8) fi8VarK2.getValue();
            zG = l46Var.g(ug8VarL);
            objR3 = l46Var.R();
            if (zG) {
                objR3 = new fh8(ug8VarL, 0);
                l46Var.p0(objR3);
            } else {
                objR3 = new fh8(ug8VarL, 0);
                l46Var.p0(objR3);
            }
            mh3.e(uh8Var2, (x16) objR3, j09Var2, false, false, false, false, null, false, yiVar5, an2.d, false, false, null, null, false, l46Var, (i6 << 6) & 896, ((i6 >> 15) & 14) | 48, 127992);
            x16Var2 = x16Var3;
            yiVar3 = yiVar5;
            z4 = true;
            f3 = 1.0f;
        } else {
            l46Var.Z();
            f3 = f2;
            x16Var2 = x16Var;
            yiVar3 = yiVar2;
            z4 = z2;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: gh8
                @Override // defpackage.l26
                public final Object z(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    od4.g(j09Var, str, z4, i2, f3, yiVar3, x16Var2, (l46) obj2, k99.P(i3 | 1), i4);
                    return wef.a;
                }
            };
        }
    }

    public static final void h(List list, Collection collection, l46 l46Var, int i2) {
        l46Var.h0(1537894851);
        int i3 = 2;
        if ((((l46Var.i(list) ? 4 : 2) | i2 | (l46Var.i(collection) ? 32 : 16)) & 19) == 18 && l46Var.F()) {
            l46Var.Z();
        } else {
            boolean zBooleanValue = ((Boolean) l46Var.k(h57.a)).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                da9 da9Var = (da9) it.next();
                a58 a58Var = da9Var.v.j;
                boolean zH = l46Var.h(zBooleanValue) | l46Var.i(list) | l46Var.i(da9Var);
                Object objR = l46Var.R();
                if (zH || objR == sf2.a) {
                    objR = new so2(da9Var, zBooleanValue, list, i3);
                    l46Var.p0(objR);
                }
                af1.g(a58Var, (a26) objR, l46Var);
            }
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o14(list, collection, i2, 12);
        }
    }

    public static j09 i(j09 j09Var, final float f2) {
        if (yi4.a(f2, 0.0f) > 0) {
            yi4.a(f2, 0.0f);
        }
        final int i2 = 0;
        final boolean z2 = true;
        return bzd.x(j09Var, new a26() { // from class: u01
            @Override // defpackage.a26
            public final Object d(Object obj) {
                y02 y02Var = g21.f;
                g0c g0cVar = (g0c) obj;
                float density = g0cVar.I0.getDensity() * f2;
                float density2 = g0cVar.I0.getDensity() * f2;
                g0cVar.k((density <= 0.0f || density2 <= 0.0f) ? null : new q01(density, density2, i2));
                g0cVar.w(y02Var);
                g0cVar.g(z2);
                return wef.a;
            }
        });
    }

    public static final void j(View view) {
        view.getClass();
        dyc dycVarI = dec.i(new xvf(view, null));
        while (dycVarI.hasNext()) {
            ArrayList arrayList = u((View) dycVarI.next()).a;
            int size = arrayList.size();
            while (true) {
                size--;
                if (-1 < size) {
                    ((pvf) arrayList.get(size)).a.e();
                }
            }
        }
    }

    public static int k(int i2, int i3) {
        long j2 = ((long) i2) + ((long) i3);
        int i4 = (int) j2;
        if (j2 == ((long) i4)) {
            return i4;
        }
        throw new ArithmeticException(kv2.h(i2, i3, "overflow: checkedAdd(", ", ", ")"));
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
  (r0v0 int) from 0x0007: SWITCH (r0v0 int)
 case -1811142716: goto B:118:0x0130
 case -1811142715: goto B:113:0x0123
 case -1811142714: goto B:108:0x0116
 case -1811142713: goto B:103:0x0109
 case -1811142712: goto B:98:0x00fc
 case -1811142711: goto B:93:0x00ef
 case -1811142710: goto B:88:0x00e2
 case -1811142709: goto B:83:0x00d5
 case -1811142708: goto B:78:0x00c8
 case -1811142707: goto B:73:0x00bb
 default: goto B:5:0x000a A[RegionRef:SW:4] (LINE:8)
  (r0v0 int) from 0x000a: SWITCH (r0v0 int)
 case -1811142685: goto B:68:0x00ae
 case -1811142684: goto B:63:0x00a1
 case -1811142683: goto B:58:0x0094
 default: goto B:6:0x000d A[RegionRef:SW:5] (LINE:11)
  (r0v0 int) from 0x000d: SWITCH (r0v0 int)
 case 80123371: goto B:53:0x0087
 case 80123372: goto B:48:0x007a
 case 80123373: goto B:43:0x006d
 case 80123374: goto B:38:0x0060
 case 80123375: goto B:33:0x0053
 case 80123376: goto B:28:0x0046
 case 80123377: goto B:23:0x0039
 case 80123378: goto B:18:0x002c
 case 80123379: goto B:13:0x001f
 case 80123380: goto B:8:0x0012
 default: goto B:331:? A[RegionRef:SW:6] (LINE:14)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String l(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "kotlin.Double.Companion";
            case "java.lang.Integer":
                return "kotlin.Int";
            case "java.lang.Cloneable":
                return "kotlin.Cloneable";
            case "java.lang.annotation.Annotation":
                return "kotlin.Annotation";
            case "java.lang.Comparable":
                return "kotlin.Comparable";
            case "java.util.Map":
                return "kotlin.collections.Map";
            case "java.util.Set":
                return "kotlin.collections.Set";
            case "double":
                return "kotlin.Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "kotlin.Byte.Companion";
            case "java.lang.CharSequence":
                return "kotlin.CharSequence";
            case "java.util.Collection":
                return "kotlin.collections.Collection";
            case "java.lang.Float":
                return "kotlin.Float";
            case "java.lang.Short":
                return "kotlin.Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "kotlin.Char.Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "kotlin.Long.Companion";
            case "java.util.Map$Entry":
                return "kotlin.collections.Map.Entry";
            case "int":
                return "kotlin.Int";
            case "byte":
                return "kotlin.Byte";
            case "char":
                return "kotlin.Char";
            case "long":
                return "kotlin.Long";
            case "boolean":
                return "kotlin.Boolean";
            case "java.util.List":
                return "kotlin.collections.List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "kotlin.Short.Companion";
            case "float":
                return "kotlin.Float";
            case "short":
                return "kotlin.Short";
            case "java.lang.Character":
                return "kotlin.Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "kotlin.Enum.Companion";
            case "java.lang.Boolean":
                return "kotlin.Boolean";
            case "java.lang.Byte":
                return "kotlin.Byte";
            case "java.lang.Enum":
                return "kotlin.Enum";
            case "java.lang.Long":
                return "kotlin.Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "kotlin.Float.Companion";
            case "java.util.Iterator":
                return "kotlin.collections.Iterator";
            case "java.util.ListIterator":
                return "kotlin.collections.ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "kotlin.String.Companion";
            case "java.lang.Double":
                return "kotlin.Double";
            case "java.lang.Number":
                return "kotlin.Number";
            case "java.lang.Object":
                return "kotlin.Any";
            case "java.lang.String":
                return "kotlin.String";
            case "java.lang.Iterable":
                return "kotlin.collections.Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "kotlin.Boolean.Companion";
            case "java.lang.Throwable":
                return "kotlin.Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "kotlin.Int.Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static Object m(List list, m23 m23Var, mh3 mh3Var) {
        mjg mjgVar = new mjg(11);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o(it.next(), m23Var, mjgVar, mh3Var);
        }
        return mh3Var.U();
    }

    public static int n(int i2, int i3) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i3 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i4 = i2 / i3;
        int i5 = i2 - (i3 * i4);
        if (i5 == 0) {
            return i4;
        }
        int i6 = ((i2 ^ i3) >> 31) | 1;
        switch (t67.a[roundingMode.ordinal()]) {
            case 1:
                feg.t(i5 == 0);
                return i4;
            case 2:
                return i4;
            case 3:
                if (i6 >= 0) {
                    return i4;
                }
                break;
            case 4:
                break;
            case 5:
                if (i6 <= 0) {
                    return i4;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i5);
                int iAbs2 = iAbs - (Math.abs(i3) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i4;
                }
                if (iAbs2 <= 0) {
                    return i4;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i4 + i6;
    }

    public static void o(Object obj, m23 m23Var, mjg mjgVar, mh3 mh3Var) {
        if (obj != null) {
            if (((HashSet) mjgVar.a).add(obj) && mh3Var.i(obj)) {
                Iterator it = m23Var.q(obj).iterator();
                while (it.hasNext()) {
                    o(it.next(), m23Var, mjgVar, mh3Var);
                }
                mh3Var.h(obj);
                return;
            }
            return;
        }
        Object[] objArr = new Object[3];
        switch (22) {
            case 1:
            case 5:
            case 8:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (22) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static final u09 p(w09 w09Var, j22 j22Var) {
        w09Var.getClass();
        j22Var.getClass();
        y22 y22VarQ = q(w09Var, j22Var);
        if (y22VarQ instanceof u09) {
            return (u09) y22VarQ;
        }
        return null;
    }

    public static final y22 q(w09 w09Var, j22 j22Var) {
        w09Var.getClass();
        j22Var.getClass();
        if (w09Var.f0(lxb.a) != null) {
            r3.f();
            return null;
        }
        n18 n18VarW = w09Var.W(j22Var.a);
        ex5 ex5Var = j22Var.b.a;
        ex5Var.getClass();
        List listF = ex5.f(ex5Var);
        p18 p18Var = n18VarW.v;
        t99 t99Var = (t99) s72.v0(listF);
        lf9 lf9Var = lf9.g;
        y22 y22VarE = p18Var.e(t99Var, lf9Var);
        if (y22VarE != null) {
            for (t99 t99Var2 : listF.subList(1, listF.size())) {
                if (y22VarE instanceof u09) {
                    y22 y22VarE2 = ((u09) y22VarE).j0().e(t99Var2, lf9Var);
                    y22VarE = y22VarE2 instanceof u09 ? (u09) y22VarE2 : null;
                    if (y22VarE != null) {
                    }
                }
            }
            return y22VarE;
        }
        return null;
    }

    public static final u09 r(w09 w09Var, j22 j22Var, szc szcVar) {
        w09Var.getClass();
        j22Var.getClass();
        szcVar.getClass();
        u09 u09VarP = p(w09Var, j22Var);
        return u09VarP != null ? u09VarP : szcVar.J(j22Var, fyc.A(fyc.x(fyc.u(xe5.a, j22Var), z03.H0)));
    }

    public static Set s() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static String t(Class cls) {
        LinkedHashMap linkedHashMap = gc9.b;
        String strValue = (String) linkedHashMap.get(cls);
        if (strValue == null) {
            ec9 ec9Var = (ec9) cls.getAnnotation(ec9.class);
            strValue = ec9Var != null ? ec9Var.value() : null;
            if (strValue == null || strValue.length() <= 0) {
                qc0.o("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()));
                return null;
            }
            linkedHashMap.put(cls, strValue);
        }
        strValue.getClass();
        return strValue;
    }

    public static final rja u(View view) {
        rja rjaVar = (rja) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (rjaVar != null) {
            return rjaVar;
        }
        rja rjaVar2 = new rja();
        view.setTag(R.id.pooling_container_listener_holder_tag, rjaVar2);
        return rjaVar2;
    }

    public static int v(int i2, int i3, boolean z2) {
        int i4 = z2 ? ((i3 - i2) + 360) % 360 : (i3 + i2) % 360;
        if (b21.F(2, "CameraOrientationUtil")) {
            StringBuilder sbN = ib8.n(i2, i3, "getRelativeImageRotation: destRotationDegrees=", ", sourceRotationDegrees=", ", isOppositeFacing=");
            sbN.append(z2);
            sbN.append(", result=");
            sbN.append(i4);
            b21.q("CameraOrientationUtil", sbN.toString());
        }
        return i4;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean[], java.io.Serializable] */
    public static Boolean w(List list, m23 m23Var, a26 a26Var) {
        return (Boolean) m(list, m23Var, new l23(a26Var, new boolean[1], 0));
    }

    public static final boolean x(cm7 cm7Var) {
        sa1 sa1VarN;
        if (cm7Var instanceof in7) {
            wn7 wn7Var = (wn7) cm7Var;
            Field fieldZ = abg.z(wn7Var);
            if (!(fieldZ != null ? fieldZ.isAccessible() : true)) {
                return false;
            }
            Method methodA = abg.A(wn7Var.b());
            if (!(methodA != null ? methodA.isAccessible() : true)) {
                return false;
            }
            Method methodA2 = abg.A(((in7) cm7Var).c());
            if (!(methodA2 != null ? methodA2.isAccessible() : true)) {
                return false;
            }
        } else if (cm7Var instanceof wn7) {
            wn7 wn7Var2 = (wn7) cm7Var;
            Field fieldZ2 = abg.z(wn7Var2);
            if (!(fieldZ2 != null ? fieldZ2.isAccessible() : true)) {
                return false;
            }
            Method methodA3 = abg.A(wn7Var2.b());
            if (!(methodA3 != null ? methodA3.isAccessible() : true)) {
                return false;
            }
        } else if (cm7Var instanceof qn7) {
            Field fieldZ3 = abg.z(((qn7) cm7Var).f());
            if (!(fieldZ3 != null ? fieldZ3.isAccessible() : true)) {
                return false;
            }
            Method methodA4 = abg.A((ym7) cm7Var);
            if (!(methodA4 != null ? methodA4.isAccessible() : true)) {
                return false;
            }
        } else if (cm7Var instanceof dn7) {
            Field fieldZ4 = abg.z(((dn7) cm7Var).f());
            if (!(fieldZ4 != null ? fieldZ4.isAccessible() : true)) {
                return false;
            }
            Method methodA5 = abg.A((ym7) cm7Var);
            if (!(methodA5 != null ? methodA5.isAccessible() : true)) {
                return false;
            }
        } else {
            if (!(cm7Var instanceof ym7)) {
                StringBuilder sb = new StringBuilder("Unknown callable: ");
                sb.append(cm7Var);
                Class<?> cls = cm7Var.getClass();
                sb.append(" (");
                sb.append(cls);
                sb.append(')');
                throw new UnsupportedOperationException(sb.toString());
            }
            ym7 ym7Var = (ym7) cm7Var;
            Method methodA6 = abg.A(ym7Var);
            if (!(methodA6 != null ? methodA6.isAccessible() : true)) {
                return false;
            }
            wnb wnbVarA = sqf.a(cm7Var);
            Member memberB = (wnbVarA == null || (sa1VarN = wnbVarA.n()) == null) ? null : sa1VarN.b();
            AccessibleObject accessibleObject = memberB instanceof AccessibleObject ? (AccessibleObject) memberB : null;
            if (!(accessibleObject != null ? accessibleObject.isAccessible() : true)) {
                return false;
            }
            Constructor constructorY = abg.y(ym7Var);
            if (!(constructorY != null ? constructorY.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }

    public static int z(int i2) {
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        if (i2 <= 0) {
            qc0.j(tec.f(i2, "x (", ") must be > 0"));
            return 0;
        }
        switch (t67.a[roundingMode.ordinal()]) {
            case 1:
                feg.t((i2 > 0) & (((i2 + (-1)) & i2) == 0));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i2 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i2);
                return (31 - iNumberOfLeadingZeros) + ((~(~(((-1257966797) >>> iNumberOfLeadingZeros) - i2))) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i2);
    }

    public abstract void y(Object obj, eb3 eb3Var);
}
