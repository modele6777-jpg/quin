package defpackage;

import ai.askquin.ui.fourseasons.SeasonalSpreadEntry;
import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.EdgeEffect;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.node.LayoutNode;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.core.b1;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import tech.chatmind.api.ArcanaGroup;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.TarotCardType;
import tech.chatmind.api.seasonal.model.SeasonalCard;
import tech.chatmind.api.seasonal.model.SeasonalCareerStatus;
import tech.chatmind.api.seasonal.model.SeasonalGender;
import tech.chatmind.api.seasonal.model.SeasonalLoveStatus;
import tech.chatmind.api.seasonal.model.SeasonalPosition;
import tech.chatmind.api.seasonal.model.SeasonalUserInfo;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class an1 implements na1 {
    public static boolean N0 = true;
    public static gx6 O0;
    public static volatile zkf P0;
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData};
    public static final dd2 e = new dd2(new gd2(13), false, 544808435);
    public static final dd2 f = new dd2(new gd2(14), false, -1432026987);
    public static final dd2 g = new dd2(new a7(24), false, 2038901930);
    public static final dd2 v = new dd2(new a7(25), false, 151230880);
    public static final dd2 w = new dd2(new yd2(12), false, -742897280);
    public static final dd2 x = new dd2(new xd2(21), false, -495532328);
    public static final dd2 y = new dd2(new xd2(22), false, -1487006388);
    public static final dd2 z = new dd2(new xd2(23), false, -1052235716);
    public static final dd2 X = new dd2(new de2(26), false, 977769611);
    public static final n82 Y = n82.H0;
    public static final n82 Z = n82.v;
    public static final float E0 = 0.1f;
    public static final n82 F0 = n82.w;
    public static final float G0 = 0.38f;
    public static final float H0 = 1.0f;
    public static final float I0 = 3.0f;
    public static final n82 J0 = n82.z;
    public static final float K0 = 1.0f;
    public static final er4[] L0 = {new er4(120000000000L), new er4(300000000000L)};
    public static final Type[] M0 = new Type[0];

    public static Type A(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return A(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return A(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type B(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i >= 0 && i < actualTypeArguments.length) {
            Type type = actualTypeArguments[i];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder sbN = ub3.n(i, "Index ", " not in range [0,");
        sbN.append(actualTypeArguments.length);
        sbN.append(") for ");
        sbN.append(parameterizedType);
        throw new IllegalArgumentException(sbN.toString());
    }

    public static Class C(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            cva.s();
            return null;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) C(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return C(((WildcardType) type).getUpperBounds()[0]);
        }
        StringBuilder sb = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        sb.append(type);
        s8f.l(sb, "> is of type ", type.getClass().getName());
        return null;
    }

    public static Type D(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return N(type, cls, A(type, cls, Map.class));
        }
        cva.s();
        return null;
    }

    public static boolean E(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof GenericArrayType) {
                return E(((GenericArrayType) type).getGenericComponentType());
            }
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            s8f.k("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
            return false;
        }
        for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
            if (E(type2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean F(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static IllegalArgumentException G(Method method, Exception exc, String str, Object... objArr) {
        StringBuilder sbQ = kv2.q(String.format(str, objArr), "\n    for method ");
        sbQ.append(method.getDeclaringClass().getSimpleName());
        sbQ.append(".");
        sbQ.append(method.getName());
        return new IllegalArgumentException(sbQ.toString(), exc);
    }

    public static float H(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return js4.c(edgeEffect, f2, f3);
        }
        edgeEffect.onPull(f2, f3);
        return f2;
    }

    public static IllegalArgumentException I(Method method, int i, String str, Object... objArr) {
        return G(method, null, ub3.k(str, " (", tea.b.n(method, i), ")"), objArr);
    }

    public static IllegalArgumentException J(Method method, Exception exc, int i, String str, Object... objArr) {
        return G(method, exc, ub3.k(str, " (", tea.b.n(method, i), ")"), objArr);
    }

    public static bv8 K(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            yg5.m("Cannot read metadata.");
            return null;
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = byteBufferDuplicate.getInt();
                long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    byteBufferDuplicate.position((int) (j3 + j));
                    bv8 bv8Var = new bv8();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    bv8Var.d = byteBufferDuplicate;
                    bv8Var.a = iPosition;
                    int i6 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    bv8Var.b = i6;
                    bv8Var.c = ((ByteBuffer) bv8Var.d).getShort(i6);
                    return bv8Var;
                }
            }
        }
        yg5.m("Cannot read metadata.");
        return null;
    }

    public static final j46 L(l46 l46Var) {
        l46 l46Var2;
        l46Var.c0(206, wf2.e);
        if (l46Var.S) {
            opd.y(l46Var.I);
        }
        Object objJ = l46Var.J();
        p46 f0cVar = objJ instanceof p46 ? (p46) objJ : null;
        if (f0cVar == null) {
            l46Var2 = l46Var;
            f0cVar = new f0c(new i46(new j46(l46Var2, l46Var.T, l46Var.q, l46Var.C, l46Var.h.I0)), -1);
            l46Var2.q0(f0cVar);
        } else {
            l46Var2 = l46Var;
        }
        j46 j46Var = ((i46) f0cVar.a).a;
        j46Var.f.setValue(l46Var2.m());
        l46Var2.r(false);
        return j46Var;
    }

    public static final String[] M(Metadata metadata) {
        String[] strArrD1 = metadata.d1();
        if (strArrD1.length == 0) {
            strArrD1 = null;
        }
        if (strArrD1 != null) {
            return strArrD1;
        }
        throw new e17("Metadata is missing: kotlin.Metadata.data1 must not be an empty array", null);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    public static Type N(Type type, Class cls, Type type2) {
        Type type3;
        WildcardType wildcardType;
        Type typeN;
        Type type4;
        Type type5 = type2;
        while (true) {
            int i = 0;
            if (!(type5 instanceof TypeVariable)) {
                if (type5 instanceof Class) {
                    Class cls2 = (Class) type5;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        Type typeN2 = N(type, cls, componentType);
                        return componentType == typeN2 ? cls2 : new tqf(typeN2);
                    }
                }
                if (type5 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type5;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type typeN3 = N(type, cls, genericComponentType);
                    return genericComponentType == typeN3 ? genericArrayType : new tqf(typeN3);
                }
                if (type5 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type5;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type typeN4 = N(type, cls, ownerType);
                    boolean z2 = typeN4 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i < length) {
                        Type typeN5 = N(type, cls, actualTypeArguments[i]);
                        if (typeN5 != actualTypeArguments[i]) {
                            if (!z2) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z2 = true;
                            }
                            actualTypeArguments[i] = typeN5;
                        }
                        i++;
                    }
                    return z2 ? new uqf(typeN4, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                }
                if (type5 instanceof WildcardType) {
                    wildcardType = (WildcardType) type5;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type typeN6 = N(type, cls, lowerBounds[0]);
                        if (typeN6 != lowerBounds[0]) {
                            type3 = type5;
                            type3 = wildcardType;
                            return new vqf(new Type[]{Object.class}, new Type[]{typeN6});
                        }
                    } else if (upperBounds.length == 1 && (typeN = N(type, cls, upperBounds[0])) != upperBounds[0]) {
                        type3 = type5;
                        type3 = wildcardType;
                        type3 = wildcardType;
                        return new vqf(new Type[]{typeN}, M0);
                    }
                }
                type3 = type5;
                type3 = wildcardType;
                type3 = wildcardType;
                type3 = type5;
                type3 = wildcardType;
                type3 = type5;
                type3 = wildcardType;
                type3 = type5;
                return type3;
            }
            TypeVariable typeVariable = (TypeVariable) type5;
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls3 == null) {
                type4 = typeVariable;
            } else {
                Type typeA = A(type, cls, cls3);
                if (typeA instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls3.getTypeParameters();
                    while (true) {
                        if (i >= typeParameters.length) {
                            s8f.c();
                            return null;
                        }
                        if (typeVariable.equals(typeParameters[i])) {
                            type4 = ((ParameterizedType) typeA).getActualTypeArguments()[i];
                            break;
                        }
                        i++;
                    }
                } else {
                    type4 = typeVariable;
                }
            }
            if (type4 == typeVariable) {
                return type4;
            }
            type5 = type4;
        }
    }

    public static final uqc O(ka9 ka9Var, da9 da9Var, l46 l46Var) {
        String str;
        Object dzbVar;
        Object next;
        pwf pwfVarH;
        l46Var.f0(913384746);
        boolean zG = l46Var.g(da9Var) | l46Var.g(ka9Var);
        Object objR = l46Var.R();
        Object obj = sf2.a;
        uqc uqcVar = null;
        if (zG || objR == obj) {
            ya9 ya9Var = da9Var.b.c;
            if (ya9Var == null || (str = (String) ya9Var.b.f) == null) {
                objR = null;
            } else {
                try {
                    dzbVar = (SeasonalSpreadEntry) vfh.S(ka9Var.b(str), job.a.b(SeasonalSpreadEntry.class));
                } catch (Throwable th) {
                    dzbVar = new dzb(th);
                }
                if (dzbVar instanceof dzb) {
                    dzbVar = null;
                }
                objR = (SeasonalSpreadEntry) dzbVar;
            }
            l46Var.p0(objR);
        }
        SeasonalSpreadEntry seasonalSpreadEntry = (SeasonalSpreadEntry) objR;
        if (seasonalSpreadEntry == null) {
            l46Var.r(false);
            return null;
        }
        yic campaign = seasonalSpreadEntry.getCampaign();
        if (campaign == null) {
            l46Var.r(false);
            return null;
        }
        mic micVarB = campaign.b();
        if (micVarB == null) {
            l46Var.r(false);
            return null;
        }
        nfc nfcVarB = kr7.b(l46Var);
        if (((Boolean) l46Var.k(h57.a)).booleanValue()) {
            pwfVarH = ib8.h(l46Var, 1471494079, l46Var, false);
        } else {
            l46Var.f0(1471494731);
            Object objK = l46Var.k(uq.b);
            Object objR2 = l46Var.R();
            if (objR2 == obj) {
                objR2 = z03.M0;
                l46Var.p0(objR2);
            }
            Iterator it = fyc.u((a26) objR2, objK).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((Context) next) instanceof pwf));
            pwfVarH = (pwf) next;
            l46Var.r(false);
        }
        if (pwfVarH == null) {
            qc0.p("No ViewModelStoreOwner found in the context chain");
            return null;
        }
        xqc xqcVar = (xqc) z5c.G(job.a.b(xqc.class), pwfVarH.g(), null, b21.r(pwfVarH), nfcVarB, null);
        boolean zI = l46Var.i(xqcVar) | l46Var.i(campaign);
        Object objR3 = l46Var.R();
        if (zI || objR3 == obj) {
            objR3 = new zw5(xqcVar, campaign, null);
            l46Var.p0(objR3);
        }
        yic yicVar = yic.c;
        af1.o((l26) objR3, l46Var, campaign);
        lsc lscVar = (lsc) tm7.t(xqcVar.e, l46Var).getValue();
        if (lscVar != null) {
            if (lscVar.e != micVarB) {
                lscVar = null;
            }
            if (lscVar != null) {
                uqcVar = new uqc(xqcVar, lscVar, seasonalSpreadEntry.getAnalyticsEnabled());
            }
        }
        l46Var.r(false);
        return uqcVar;
    }

    public static boolean P(m95 m95Var, boolean z2) {
        int i;
        d0a d0aVar = new d0a(16);
        boolean z3 = true;
        while (true) {
            d0aVar.J(8);
            if (!m95Var.d(d0aVar.a, 0, 8, true)) {
                break;
            }
            long jB = d0aVar.B();
            int iM = d0aVar.m();
            if (jB != 1) {
                i = 8;
            } else {
                if (!m95Var.d(d0aVar.a, 8, 8, true)) {
                    break;
                }
                d0aVar.L(16);
                jB = d0aVar.F();
                i = 16;
            }
            long j = i;
            if (jB < j) {
                break;
            }
            int i2 = (int) (jB - j);
            if (z3) {
                if (iM != 1718909296 || i2 < 8) {
                    break;
                }
                d0aVar.J(4);
                m95Var.o(d0aVar.a, 0, 4);
                if (d0aVar.m() != 1751476579) {
                    break;
                }
                if (!z2) {
                    return true;
                }
                m95Var.f(i2 - 4);
                z3 = false;
            } else {
                if (iM == 1836086884) {
                    return true;
                }
                if (i2 != 0) {
                    m95Var.f(i2);
                }
            }
        }
        return false;
    }

    public static void Q(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static final void R(int i, int i2, nyc nycVar) {
        nycVar.getClass();
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(nycVar.f(i4));
            }
            i3 >>>= 1;
        }
        String strA = nycVar.a();
        strA.getClass();
        throw new ew8(arrayList.size() == 1 ? ks0.m(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", strA, "', but it was missing") : "Fields " + arrayList + " are required for type with serial name '" + strA + "', but they were missing", null, arrayList, strA);
    }

    public static final ArrayList S(List list) {
        ArcanaGroup arcanaGroup;
        SeasonalPosition seasonalPosition;
        list.getClass();
        ArrayList arrayList = new ArrayList(t72.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TarotCardChoice tarotCardChoice = (TarotCardChoice) it.next();
            TarotCardType card = tarotCardChoice.getCard();
            Iterator<E> it2 = ArcanaGroup.getEntries().iterator();
            do {
                if (!it2.hasNext()) {
                    r3.n("Collection contains no element matching the predicate.");
                    return null;
                }
                arcanaGroup = (ArcanaGroup) it2.next();
            } while (!arcanaGroup.getTypes().contains(card));
            int i = yw5.d[arcanaGroup.ordinal()];
            if (i == 1) {
                seasonalPosition = SeasonalPosition.MAJOR_ARCANA;
            } else if (i == 2) {
                seasonalPosition = SeasonalPosition.WANDS;
            } else if (i == 3) {
                seasonalPosition = SeasonalPosition.CUPS;
            } else if (i == 4) {
                seasonalPosition = SeasonalPosition.SWORDS;
            } else {
                if (i != 5) {
                    ap.c();
                    return null;
                }
                seasonalPosition = SeasonalPosition.PENTACLES;
            }
            arrayList.add(new SeasonalCard(seasonalPosition, tarotCardChoice.getCard().getCardKey(), tarotCardChoice.isReversed() ? 1 : 0));
        }
        return arrayList;
    }

    public static final SeasonalCareerStatus T(pu1 pu1Var) {
        int i = pu1Var == null ? -1 : yw5.b[pu1Var.ordinal()];
        if (i == -1) {
            return SeasonalCareerStatus.UNKNOWN;
        }
        if (i == 1) {
            return SeasonalCareerStatus.MIDDLE_HIGH_SCHOOL;
        }
        if (i == 2) {
            return SeasonalCareerStatus.COLLEGE_ABOVE;
        }
        if (i == 3) {
            return SeasonalCareerStatus.WORKER;
        }
        if (i == 4) {
            return SeasonalCareerStatus.FREELANCE;
        }
        ap.c();
        return null;
    }

    public static final SeasonalGender U(a56 a56Var) {
        int i = a56Var == null ? -1 : yw5.a[a56Var.ordinal()];
        if (i == -1) {
            return SeasonalGender.UNKNOWN;
        }
        if (i == 1) {
            return SeasonalGender.FEMALE;
        }
        if (i == 2) {
            return SeasonalGender.MALE;
        }
        if (i == 3) {
            return SeasonalGender.OTHER;
        }
        ap.c();
        return null;
    }

    public static final SeasonalLoveStatus V(kpb kpbVar) {
        int i = kpbVar == null ? -1 : yw5.c[kpbVar.ordinal()];
        if (i == -1) {
            return SeasonalLoveStatus.UNKNOWN;
        }
        if (i == 1) {
            return SeasonalLoveStatus.SINGLE;
        }
        if (i == 2) {
            return SeasonalLoveStatus.IN_RELATIONSHIP;
        }
        if (i == 3) {
            return SeasonalLoveStatus.AMBIGUOUS;
        }
        ap.c();
        return null;
    }

    public static final SeasonalUserInfo W(lsc lscVar) {
        SeasonalGender seasonalGenderU = U(lscVar.a);
        SeasonalCareerStatus seasonalCareerStatusT = T(lscVar.b);
        SeasonalLoveStatus seasonalLoveStatusV = V(lscVar.c);
        String string = lscVar.d.d().c.toString();
        if (v4e.Q(string)) {
            string = null;
        }
        return new SeasonalUserInfo(seasonalGenderU, seasonalCareerStatusT, seasonalLoveStatusV, string);
    }

    public static String X(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static final void a(x9 x9Var, String str, x16 x16Var, l46 l46Var, int i) {
        x9Var.getClass();
        x16Var.getClass();
        l46Var.h0(1169764559);
        int i2 = (l46Var.i(x9Var) ? 4 : 2) | i | (l46Var.g(str) ? 32 : 16) | (l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        int i3 = 1;
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            int i4 = i2 & 896;
            boolean z2 = ((i2 & 14) == 4 || l46Var.i(x9Var)) | (i4 == 256);
            Object objR = l46Var.R();
            if (z2 || objR == sf2.a) {
                objR = new u7(x9Var, x16Var, i3);
                l46Var.p0(objR);
            }
            c(str, (a26) objR, x16Var, l46Var, ((i2 >> 3) & 14) | i4);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new v7(x9Var, str, x16Var, i, 1);
        }
    }

    public static BitmapPainter b(cv6 cv6Var, int i) {
        BitmapPainter bitmapPainter = new BitmapPainter(cv6Var, (((long) ((ks) cv6Var).a.getHeight()) & 4294967295L) | (((long) ((ks) cv6Var).a.getWidth()) << 32));
        bitmapPainter.v = i;
        return bitmapPainter;
    }

    public static final void c(String str, a26 a26Var, x16 x16Var, l46 l46Var, int i) {
        int i2;
        l46Var.h0(-600936366);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = i | (l46Var.g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i4 = i2 | (l46Var.i(a26Var) ? 32 : 16) | (l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        int i5 = 1;
        if (l46Var.W(i4 & 1, (i4 & 147) != 146)) {
            xdc.a(b.c, af1.b0(-1110718186, new m(i3, x16Var), l46Var), null, null, null, 0, 0L, 0L, null, af1.b0(-855923999, new w7(i5, str, a26Var), l46Var), l46Var, 805306422, 508);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new x7(str, a26Var, x16Var, i, 1);
        }
    }

    public static final void d(int i, x16 x16Var, l46 l46Var, j09 j09Var) {
        ov7 ov7Var;
        l46 l46Var2 = l46Var;
        x16Var.getClass();
        l46Var2.h0(2083926472);
        int i2 = i | (l46Var2.i(x16Var) ? 32 : 16);
        if (l46Var2.W(i2 & 1, (i2 & 19) != 18)) {
            boolean z2 = (i2 & 112) == 32;
            Object objR = l46Var2.R();
            if (z2 || objR == sf2.a) {
                objR = new gc5(x16Var, null);
                l46Var2.p0(objR);
            }
            af1.o((l26) objR, l46Var2, wef.a);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var, j09Var);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z3 = l46Var2.S;
            ov7 ov7Var2 = LayoutNode.h1;
            if (z3) {
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
            FillElement fillElement = b.c;
            feg.j(od4.A(ai.askquin.R.drawable.bg_feedback_status, 0, l46Var2), null, fillElement, null, an2.g, 0.0f, null, l46Var2, 25016, 104);
            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var2, 0);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, fillElement);
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
            g09 g09Var = g09.a;
            j09 j09VarZ = ynb.Z(b.c(g09Var, 1.0f).D(new jw7(1.0f, true)), 24.0f);
            xn8 xn8VarC2 = s21.c(ndb.f, false);
            int iHashCode3 = Long.hashCode(l46Var2.T);
            u8a u8aVarM3 = l46Var2.m();
            j09 j09VarJ3 = m93.J(l46Var2, j09VarZ);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, xn8VarC2);
            dec.l(he2Var2, l46Var2, u8aVarM3);
            ib8.s(iHashCode3, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ3);
            String strQ = afc.q(ai.askquin.R.string.already_get_your_feedback, l46Var2);
            long j = y72.e;
            nte.b(strQ, null, j, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, ((p9f) l46Var2.k(r9f.a)).c, l46Var2, 384, 0, 130042);
            l46Var2.r(true);
            j09 j09VarN = mh3.N(ynb.d0(0.0f, 0.0f, 0.0f, 24.0f, 7, ynb.b0(16.0f, 0.0f, b.c(g09Var, 1.0f), 2)));
            String strQ2 = afc.q(ai.askquin.R.string.get_started, l46Var2);
            bx9 bx9Var = v51.a;
            l46Var2 = l46Var;
            c8b.i(j09VarN, strQ2, null, null, 0L, 0.0f, false, null, v51.a(j, ((m82) l46Var2.k(o82.a)).a, 0L, 0L, l46Var2, 12), false, null, null, x16Var, l46Var2, 0, (i2 << 3) & 896, 3836);
            l46Var2.r(true);
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new fc5(j09Var, x16Var, i, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x015b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0161  */
    /* JADX WARN: Code duplicated, block: B:111:0x0173  */
    /* JADX WARN: Code duplicated, block: B:113:0x0179  */
    /* JADX WARN: Code duplicated, block: B:119:0x0188 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:120:0x018a  */
    /* JADX WARN: Code duplicated, block: B:122:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:86:0x0104 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0106  */
    /* JADX WARN: Code duplicated, block: B:88:0x0109  */
    /* JADX WARN: Code duplicated, block: B:91:0x010e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0115  */
    /* JADX WARN: Code duplicated, block: B:94:0x0118  */
    /* JADX WARN: Code duplicated, block: B:95:0x011f  */
    /* JADX WARN: Code duplicated, block: B:98:0x012f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x0131  */
    public static final void e(ze6 ze6Var, j09 j09Var, jx7 jx7Var, xw9 xw9Var, wc0 wc0Var, tc0 tc0Var, gj5 gj5Var, boolean z2, lu9 lu9Var, a26 a26Var, l46 l46Var, int i, int i2) {
        int i3;
        j09 j09Var2;
        jx7 jx7Var2;
        int i4;
        int i5;
        int i6;
        wc0 wc0Var2;
        int i7;
        int i8;
        boolean z3;
        boolean z4;
        xw9 xw9Var2;
        gj5 gj5Var2;
        j09 j09Var3;
        jx7 jx7Var3;
        boolean z5;
        lu9 lu9Var2;
        ojb ojbVarV;
        int i9;
        j09 j09Var4;
        jx7 jx7VarA;
        xw9 bx9Var;
        ph3 ph3VarA;
        boolean zG;
        Object objR;
        gj5 gj5Var3;
        int i10;
        lu9 lu9VarB;
        boolean z6;
        int i11;
        int i12;
        boolean z7;
        Object objR2;
        int i13;
        int i14;
        int i15;
        l46Var.h0(-2072102870);
        if ((i & 6) == 0) {
            i3 = (l46Var.g(ze6Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i16 = i2 & 2;
        if (i16 == 0) {
            if ((i & 48) == 0) {
                j09Var2 = j09Var;
                i3 |= l46Var.g(j09Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    jx7Var2 = jx7Var;
                    if (l46Var.g(jx7Var2)) {
                        i15 = 256;
                    }
                    i3 |= i15;
                } else {
                    jx7Var2 = jx7Var;
                }
                i15 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                i3 |= i15;
            } else {
                jx7Var2 = jx7Var;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    if (l46Var.g(xw9Var)) {
                        i5 = 2048;
                    } else {
                        i5 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i3 |= i5;
                }
                i6 = i3 | 24576;
                if ((i & 196608) == 0) {
                    wc0Var2 = wc0Var;
                    if (l46Var.g(wc0Var2)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i6 |= i14;
                } else {
                    wc0Var2 = wc0Var;
                }
                if ((1572864 & i) == 0) {
                    if (l46Var.g(tc0Var)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i6 |= i13;
                }
                if ((12582912 & i) == 0) {
                    i6 |= 4194304;
                }
                i7 = 100663296 | i6;
                if ((i & 805306368) == 0) {
                    i7 = 369098752 | i6;
                }
                if (l46Var.i(a26Var)) {
                    i8 = 4;
                } else {
                    i8 = 2;
                }
                z3 = true;
                if ((i7 & 306783379) == 306783378 || (i8 & 3) != 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (l46Var.W(i7 & 1, z4)) {
                    l46Var.b0();
                    i9 = i & 1;
                    Object obj = sf2.a;
                    if (i9 != 0 || l46Var.C()) {
                        if (i16 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if ((i2 & 4) != 0) {
                            jx7VarA = lx7.a(0, 3, l46Var);
                            i7 &= -897;
                        } else {
                            jx7VarA = jx7Var2;
                        }
                        if (i4 != 0) {
                            bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            bx9Var = xw9Var;
                        }
                        ph3VarA = yud.a(l46Var);
                        zG = l46Var.g(ph3VarA);
                        objR = l46Var.R();
                        if (zG || objR == obj) {
                            objR = new uq3(ph3VarA);
                            l46Var.p0(objR);
                        }
                        gj5Var3 = (uq3) objR;
                        i10 = i7 & (-1908408321);
                        lu9VarB = mu9.b(l46Var);
                        z6 = true;
                    } else {
                        l46Var.Z();
                        if ((i2 & 4) != 0) {
                            i7 &= -897;
                        }
                        gj5Var3 = gj5Var;
                        lu9VarB = lu9Var;
                        i10 = i7 & (-1908408321);
                        j09Var4 = j09Var2;
                        jx7VarA = jx7Var2;
                        bx9Var = xw9Var;
                        z6 = z2;
                    }
                    l46Var.s();
                    i11 = (i10 & 14) | ((i10 >> 15) & 112);
                    i12 = 6;
                    boolean z8 = (((i11 & 14) ^ 6) <= 4 && l46Var.g(ze6Var)) || (i11 & 6) == 4;
                    if ((((i11 & 112) ^ 48) > 32 || !l46Var.g(tc0Var)) && (i11 & 48) != 32) {
                    }
                    z7 = z8 | z3;
                    objR2 = l46Var.R();
                    if (z7 || objR2 == obj) {
                        objR2 = new cf6(new rk6(i12, ze6Var, tc0Var));
                        l46Var.p0(objR2);
                    }
                    int i17 = i10 >> 3;
                    int i18 = ((i8 << 3) & 112) | ((i10 >> 18) & 14);
                    boolean z9 = z6;
                    j09Var3 = j09Var4;
                    jx7Var3 = jx7VarA;
                    xw9 xw9Var3 = bx9Var;
                    lu9 lu9Var3 = lu9VarB;
                    gj5 gj5Var4 = gj5Var3;
                    cn1.i(j09Var3, jx7Var3, (cf6) objR2, xw9Var3, gj5Var4, z9, lu9Var3, wc0Var2, tc0Var, a26Var, l46Var, (i10 & 7168) | (i17 & 14) | 196608 | (i17 & 112) | (57344 & i10) | (i17 & 29360128) | ((i10 << 12) & 1879048192), i18);
                    xw9Var2 = xw9Var3;
                    lu9Var2 = lu9Var3;
                    z5 = z9;
                    gj5Var2 = gj5Var4;
                } else {
                    l46Var.Z();
                    xw9Var2 = xw9Var;
                    gj5Var2 = gj5Var;
                    j09Var3 = j09Var2;
                    jx7Var3 = jx7Var2;
                    z5 = z2;
                    lu9Var2 = lu9Var;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new qw7(ze6Var, j09Var3, jx7Var3, xw9Var2, wc0Var, tc0Var, gj5Var2, z5, lu9Var2, a26Var, i, i2);
                }
            }
            i3 |= 3072;
            i6 = i3 | 24576;
            if ((i & 196608) == 0) {
                wc0Var2 = wc0Var;
                if (l46Var.g(wc0Var2)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i6 |= i14;
            } else {
                wc0Var2 = wc0Var;
            }
            if ((1572864 & i) == 0) {
                if (l46Var.g(tc0Var)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i6 |= i13;
            }
            if ((12582912 & i) == 0) {
                i6 |= 4194304;
            }
            i7 = 100663296 | i6;
            if ((i & 805306368) == 0) {
                i7 = 369098752 | i6;
            }
            if (l46Var.i(a26Var)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            z3 = true;
            if ((i7 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (l46Var.W(i7 & 1, z4)) {
                l46Var.b0();
                i9 = i & 1;
                Object obj2 = sf2.a;
                if (i9 != 0) {
                    if (i16 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if ((i2 & 4) != 0) {
                        jx7VarA = lx7.a(0, 3, l46Var);
                        i7 &= -897;
                    } else {
                        jx7VarA = jx7Var2;
                    }
                    if (i4 != 0) {
                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        bx9Var = xw9Var;
                    }
                    ph3VarA = yud.a(l46Var);
                    zG = l46Var.g(ph3VarA);
                    objR = l46Var.R();
                    if (zG) {
                        objR = new uq3(ph3VarA);
                        l46Var.p0(objR);
                    } else {
                        objR = new uq3(ph3VarA);
                        l46Var.p0(objR);
                    }
                    gj5Var3 = (uq3) objR;
                    i10 = i7 & (-1908408321);
                    lu9VarB = mu9.b(l46Var);
                    z6 = true;
                } else {
                    if (i16 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if ((i2 & 4) != 0) {
                        jx7VarA = lx7.a(0, 3, l46Var);
                        i7 &= -897;
                    } else {
                        jx7VarA = jx7Var2;
                    }
                    if (i4 != 0) {
                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        bx9Var = xw9Var;
                    }
                    ph3VarA = yud.a(l46Var);
                    zG = l46Var.g(ph3VarA);
                    objR = l46Var.R();
                    if (zG) {
                        objR = new uq3(ph3VarA);
                        l46Var.p0(objR);
                    } else {
                        objR = new uq3(ph3VarA);
                        l46Var.p0(objR);
                    }
                    gj5Var3 = (uq3) objR;
                    i10 = i7 & (-1908408321);
                    lu9VarB = mu9.b(l46Var);
                    z6 = true;
                }
                l46Var.s();
                i11 = (i10 & 14) | ((i10 >> 15) & 112);
                i12 = 6;
                boolean z10 = (((i11 & 14) ^ 6) <= 4 && l46Var.g(ze6Var)) || (i11 & 6) == 4;
                z3 = ((i11 & 112) ^ 48) > 32 ? false : false;
                z7 = z10 | z3;
                objR2 = l46Var.R();
                if (z7) {
                    objR2 = new cf6(new rk6(i12, ze6Var, tc0Var));
                    l46Var.p0(objR2);
                } else {
                    objR2 = new cf6(new rk6(i12, ze6Var, tc0Var));
                    l46Var.p0(objR2);
                }
                int i19 = i10 >> 3;
                int i110 = ((i8 << 3) & 112) | ((i10 >> 18) & 14);
                boolean z11 = z6;
                j09Var3 = j09Var4;
                jx7Var3 = jx7VarA;
                xw9 xw9Var4 = bx9Var;
                lu9 lu9Var4 = lu9VarB;
                gj5 gj5Var5 = gj5Var3;
                cn1.i(j09Var3, jx7Var3, (cf6) objR2, xw9Var4, gj5Var5, z11, lu9Var4, wc0Var2, tc0Var, a26Var, l46Var, (i10 & 7168) | (i19 & 14) | 196608 | (i19 & 112) | (57344 & i10) | (i19 & 29360128) | ((i10 << 12) & 1879048192), i110);
                xw9Var2 = xw9Var4;
                lu9Var2 = lu9Var4;
                z5 = z11;
                gj5Var2 = gj5Var5;
            } else {
                l46Var.Z();
                xw9Var2 = xw9Var;
                gj5Var2 = gj5Var;
                j09Var3 = j09Var2;
                jx7Var3 = jx7Var2;
                z5 = z2;
                lu9Var2 = lu9Var;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new qw7(ze6Var, j09Var3, jx7Var3, xw9Var2, wc0Var, tc0Var, gj5Var2, z5, lu9Var2, a26Var, i, i2);
            }
        }
        i3 |= 48;
        j09Var2 = j09Var;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                jx7Var2 = jx7Var;
                if (l46Var.g(jx7Var2)) {
                    i15 = 256;
                }
                i3 |= i15;
            } else {
                jx7Var2 = jx7Var;
            }
            i15 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            i3 |= i15;
        } else {
            jx7Var2 = jx7Var;
        }
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                if (l46Var.g(xw9Var)) {
                    i5 = 2048;
                } else {
                    i5 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i3 |= i5;
            }
            i6 = i3 | 24576;
            if ((i & 196608) == 0) {
                wc0Var2 = wc0Var;
                if (l46Var.g(wc0Var2)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i6 |= i14;
            } else {
                wc0Var2 = wc0Var;
            }
            if ((1572864 & i) == 0) {
                if (l46Var.g(tc0Var)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i6 |= i13;
            }
            if ((12582912 & i) == 0) {
                i6 |= 4194304;
            }
            i7 = 100663296 | i6;
            if ((i & 805306368) == 0) {
                i7 = 369098752 | i6;
            }
            if (l46Var.i(a26Var)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            z3 = true;
            if ((i7 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (l46Var.W(i7 & 1, z4)) {
                l46Var.b0();
                i9 = i & 1;
                Object obj3 = sf2.a;
                if (i9 != 0) {
                    if (i16 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if ((i2 & 4) != 0) {
                        jx7VarA = lx7.a(0, 3, l46Var);
                        i7 &= -897;
                    } else {
                        jx7VarA = jx7Var2;
                    }
                    if (i4 != 0) {
                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        bx9Var = xw9Var;
                    }
                    ph3VarA = yud.a(l46Var);
                    zG = l46Var.g(ph3VarA);
                    objR = l46Var.R();
                    if (zG) {
                        objR = new uq3(ph3VarA);
                        l46Var.p0(objR);
                    } else {
                        objR = new uq3(ph3VarA);
                        l46Var.p0(objR);
                    }
                    gj5Var3 = (uq3) objR;
                    i10 = i7 & (-1908408321);
                    lu9VarB = mu9.b(l46Var);
                    z6 = true;
                } else {
                    if (i16 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if ((i2 & 4) != 0) {
                        jx7VarA = lx7.a(0, 3, l46Var);
                        i7 &= -897;
                    } else {
                        jx7VarA = jx7Var2;
                    }
                    if (i4 != 0) {
                        bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        bx9Var = xw9Var;
                    }
                    ph3VarA = yud.a(l46Var);
                    zG = l46Var.g(ph3VarA);
                    objR = l46Var.R();
                    if (zG) {
                        objR = new uq3(ph3VarA);
                        l46Var.p0(objR);
                    } else {
                        objR = new uq3(ph3VarA);
                        l46Var.p0(objR);
                    }
                    gj5Var3 = (uq3) objR;
                    i10 = i7 & (-1908408321);
                    lu9VarB = mu9.b(l46Var);
                    z6 = true;
                }
                l46Var.s();
                i11 = (i10 & 14) | ((i10 >> 15) & 112);
                i12 = 6;
                boolean z12 = (((i11 & 14) ^ 6) <= 4 && l46Var.g(ze6Var)) || (i11 & 6) == 4;
                if (((i11 & 112) ^ 48) > 32) {
                }
                z7 = z12 | z3;
                objR2 = l46Var.R();
                if (z7) {
                    objR2 = new cf6(new rk6(i12, ze6Var, tc0Var));
                    l46Var.p0(objR2);
                } else {
                    objR2 = new cf6(new rk6(i12, ze6Var, tc0Var));
                    l46Var.p0(objR2);
                }
                int i111 = i10 >> 3;
                int i112 = ((i8 << 3) & 112) | ((i10 >> 18) & 14);
                boolean z13 = z6;
                j09Var3 = j09Var4;
                jx7Var3 = jx7VarA;
                xw9 xw9Var5 = bx9Var;
                lu9 lu9Var5 = lu9VarB;
                gj5 gj5Var6 = gj5Var3;
                cn1.i(j09Var3, jx7Var3, (cf6) objR2, xw9Var5, gj5Var6, z13, lu9Var5, wc0Var2, tc0Var, a26Var, l46Var, (i10 & 7168) | (i111 & 14) | 196608 | (i111 & 112) | (57344 & i10) | (i111 & 29360128) | ((i10 << 12) & 1879048192), i112);
                xw9Var2 = xw9Var5;
                lu9Var2 = lu9Var5;
                z5 = z13;
                gj5Var2 = gj5Var6;
            } else {
                l46Var.Z();
                xw9Var2 = xw9Var;
                gj5Var2 = gj5Var;
                j09Var3 = j09Var2;
                jx7Var3 = jx7Var2;
                z5 = z2;
                lu9Var2 = lu9Var;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new qw7(ze6Var, j09Var3, jx7Var3, xw9Var2, wc0Var, tc0Var, gj5Var2, z5, lu9Var2, a26Var, i, i2);
            }
        }
        i3 |= 3072;
        i6 = i3 | 24576;
        if ((i & 196608) == 0) {
            wc0Var2 = wc0Var;
            if (l46Var.g(wc0Var2)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i6 |= i14;
        } else {
            wc0Var2 = wc0Var;
        }
        if ((1572864 & i) == 0) {
            if (l46Var.g(tc0Var)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i6 |= i13;
        }
        if ((12582912 & i) == 0) {
            i6 |= 4194304;
        }
        i7 = 100663296 | i6;
        if ((i & 805306368) == 0) {
            i7 = 369098752 | i6;
        }
        if (l46Var.i(a26Var)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        z3 = true;
        if ((i7 & 306783379) == 306783378) {
            z4 = true;
        } else {
            z4 = true;
        }
        if (l46Var.W(i7 & 1, z4)) {
            l46Var.b0();
            i9 = i & 1;
            Object obj4 = sf2.a;
            if (i9 != 0) {
                if (i16 != 0) {
                    j09Var4 = g09.a;
                } else {
                    j09Var4 = j09Var2;
                }
                if ((i2 & 4) != 0) {
                    jx7VarA = lx7.a(0, 3, l46Var);
                    i7 &= -897;
                } else {
                    jx7VarA = jx7Var2;
                }
                if (i4 != 0) {
                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                } else {
                    bx9Var = xw9Var;
                }
                ph3VarA = yud.a(l46Var);
                zG = l46Var.g(ph3VarA);
                objR = l46Var.R();
                if (zG) {
                    objR = new uq3(ph3VarA);
                    l46Var.p0(objR);
                } else {
                    objR = new uq3(ph3VarA);
                    l46Var.p0(objR);
                }
                gj5Var3 = (uq3) objR;
                i10 = i7 & (-1908408321);
                lu9VarB = mu9.b(l46Var);
                z6 = true;
            } else {
                if (i16 != 0) {
                    j09Var4 = g09.a;
                } else {
                    j09Var4 = j09Var2;
                }
                if ((i2 & 4) != 0) {
                    jx7VarA = lx7.a(0, 3, l46Var);
                    i7 &= -897;
                } else {
                    jx7VarA = jx7Var2;
                }
                if (i4 != 0) {
                    bx9Var = new bx9(0.0f, 0.0f, 0.0f, 0.0f);
                } else {
                    bx9Var = xw9Var;
                }
                ph3VarA = yud.a(l46Var);
                zG = l46Var.g(ph3VarA);
                objR = l46Var.R();
                if (zG) {
                    objR = new uq3(ph3VarA);
                    l46Var.p0(objR);
                } else {
                    objR = new uq3(ph3VarA);
                    l46Var.p0(objR);
                }
                gj5Var3 = (uq3) objR;
                i10 = i7 & (-1908408321);
                lu9VarB = mu9.b(l46Var);
                z6 = true;
            }
            l46Var.s();
            i11 = (i10 & 14) | ((i10 >> 15) & 112);
            i12 = 6;
            boolean z14 = (((i11 & 14) ^ 6) <= 4 && l46Var.g(ze6Var)) || (i11 & 6) == 4;
            if (((i11 & 112) ^ 48) > 32) {
            }
            z7 = z14 | z3;
            objR2 = l46Var.R();
            if (z7) {
                objR2 = new cf6(new rk6(i12, ze6Var, tc0Var));
                l46Var.p0(objR2);
            } else {
                objR2 = new cf6(new rk6(i12, ze6Var, tc0Var));
                l46Var.p0(objR2);
            }
            int i113 = i10 >> 3;
            int i114 = ((i8 << 3) & 112) | ((i10 >> 18) & 14);
            boolean z15 = z6;
            j09Var3 = j09Var4;
            jx7Var3 = jx7VarA;
            xw9 xw9Var6 = bx9Var;
            lu9 lu9Var6 = lu9VarB;
            gj5 gj5Var7 = gj5Var3;
            cn1.i(j09Var3, jx7Var3, (cf6) objR2, xw9Var6, gj5Var7, z15, lu9Var6, wc0Var2, tc0Var, a26Var, l46Var, (i10 & 7168) | (i113 & 14) | 196608 | (i113 & 112) | (57344 & i10) | (i113 & 29360128) | ((i10 << 12) & 1879048192), i114);
            xw9Var2 = xw9Var6;
            lu9Var2 = lu9Var6;
            z5 = z15;
            gj5Var2 = gj5Var7;
        } else {
            l46Var.Z();
            xw9Var2 = xw9Var;
            gj5Var2 = gj5Var;
            j09Var3 = j09Var2;
            jx7Var3 = jx7Var2;
            z5 = z2;
            lu9Var2 = lu9Var;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new qw7(ze6Var, j09Var3, jx7Var3, xw9Var2, wc0Var, tc0Var, gj5Var2, z5, lu9Var2, a26Var, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:313:0x0611  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11, types: [ua9, ya9] */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [int] */
    public static final void f(final cb9 cb9Var, final ya9 ya9Var, final j09 j09Var, final yi yiVar, final a26 a26Var, final a26 a26Var2, final a26 a26Var3, final a26 a26Var4, l46 l46Var, final int i) {
        gc9 gc9Var;
        x48 x48Var;
        final e89 e89Var;
        ?? r15;
        q84 q84Var;
        l46 l46Var2;
        final se2 se2Var;
        a26 a26Var5;
        q84 q84Var2;
        boolean z2;
        se2 se2Var2;
        e89 e89Var2;
        Object obj;
        int[] intArray;
        int[] iArr;
        ArrayList arrayList;
        String strG0;
        ua9 ua9VarK;
        ya9 ya9Var2;
        Bundle bundle;
        ua9 ua9VarK2;
        ya9 ya9Var3;
        l46 l46Var3;
        l46Var.h0(-1964664536);
        int i2 = (i & 6) == 0 ? (l46Var.i(cb9Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= l46Var.i(ya9Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.g(yiVar) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var.i(a26Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= l46Var.i(a26Var2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= l46Var.i(a26Var3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= l46Var.i(a26Var4) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= l46Var.i(null) ? 67108864 : 33554432;
        }
        int i3 = i2;
        if ((38347923 & i3) == 38347922 && l46Var.F()) {
            l46Var.Z();
            l46Var3 = l46Var;
        } else {
            l46Var.b0();
            if ((i & 1) != 0 && !l46Var.C()) {
                l46Var.Z();
            }
            l46Var.s();
            x48 x48Var2 = (x48) l46Var.k(cb8.a);
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
                return;
            }
            owf owfVarG = pwfVarA.g();
            cb9Var.getClass();
            ma9 ma9Var = cb9Var.b;
            owfVarG.getClass();
            ma9Var.getClass();
            gc9 gc9Var2 = ma9Var.s;
            if (!pa7.t(ma9Var.o, vd0.T(owfVarG))) {
                if (!ma9Var.f.isEmpty()) {
                    qc0.p("ViewModelStore should be set before setGraph call");
                    return;
                }
                ma9Var.o = vd0.T(owfVarG);
            }
            ya9Var.getClass();
            ma9Var.getClass();
            LinkedHashMap linkedHashMap = ma9Var.t;
            r1f r1fVar = ya9Var.f;
            ad0<da9> ad0Var = ma9Var.f;
            if (!ad0Var.isEmpty() && ma9Var.k() == g48.a) {
                qc0.p("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
                return;
            }
            if (pa7.t(ma9Var.c, ya9Var)) {
                gc9Var = gc9Var2;
                x48Var = x48Var2;
                i3 = i3;
                int iD = ((fud) r1fVar.c).d();
                for (int i4 = 0; i4 < iD; i4++) {
                    ua9 ua9Var = (ua9) ((fud) r1fVar.c).e(i4);
                    ya9 ya9Var4 = ma9Var.c;
                    ya9Var4.getClass();
                    int iB = ((fud) ya9Var4.f.c).b(i4);
                    ya9 ya9Var5 = ma9Var.c;
                    ya9Var5.getClass();
                    fud fudVar = (fud) ya9Var5.f.c;
                    if (fudVar.a) {
                        abg.x(fudVar);
                    }
                    int iQ = cgg.q(fudVar.d, iB, fudVar.b);
                    if (iQ >= 0) {
                        Object[] objArr = fudVar.c;
                        Object obj2 = objArr[iQ];
                        objArr[iQ] = ua9Var;
                    }
                }
                for (da9 da9Var : ad0Var) {
                    int i5 = ua9.e;
                    sm8 sm8Var = new sm8(fyc.A(kj0.h0(da9Var.b)));
                    ua9 ua9VarK3 = ma9Var.c;
                    ua9VarK3.getClass();
                    Iterator it = sm8Var.iterator();
                    while (true) {
                        ListIterator listIterator = (ListIterator) ((m0c) it).b;
                        if (listIterator.hasPrevious()) {
                            ua9 ua9Var2 = (ua9) listIterator.previous();
                            if (!pa7.t(ua9Var2, ma9Var.c) || !ua9VarK3.equals(ya9Var)) {
                                if (ua9VarK3 instanceof ya9) {
                                    ua9VarK3 = ((ya9) ua9VarK3).f.k(ua9Var2.b.b);
                                    ua9VarK3.getClass();
                                }
                            }
                        }
                    }
                    da9Var.b = ua9VarK3;
                }
            } else {
                ya9 ya9Var6 = ma9Var.c;
                if (ya9Var6 != null) {
                    Iterator it2 = new ArrayList(ma9Var.l.keySet()).iterator();
                    while (it2.hasNext()) {
                        Integer num = (Integer) it2.next();
                        num.getClass();
                        int iIntValue = num.intValue();
                        Iterator it3 = linkedHashMap.values().iterator();
                        while (it3.hasNext()) {
                            ((ia9) it3.next()).d = true;
                            it2 = it2;
                        }
                        Iterator it4 = it2;
                        boolean zU = ma9Var.u(iIntValue, null, cn1.I(new d59(6)));
                        Iterator it5 = linkedHashMap.values().iterator();
                        while (it5.hasNext()) {
                            ((ia9) it5.next()).d = false;
                            it5 = it5;
                            zU = zU;
                        }
                        if (zU) {
                            ma9Var.p(iIntValue, true, false);
                        }
                        it2 = it4;
                    }
                    ma9Var.p(ya9Var6.b.b, true, false);
                }
                ma9Var.c = ya9Var;
                gc9 gc9Var3 = ma9Var.s;
                ka9 ka9Var = ma9Var.a;
                bs bsVar = ka9Var.c;
                Bundle bundle2 = ma9Var.d;
                if (bundle2 != null && bundle2.containsKey("android-support-nav:controller:navigatorState:names")) {
                    ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names");
                    if (stringArrayList == null) {
                        gdc.h("android-support-nav:controller:navigatorState:names");
                        throw null;
                    }
                    Iterator<String> it6 = stringArrayList.iterator();
                    while (it6.hasNext()) {
                        Iterator<String> it7 = it6;
                        String next = it6.next();
                        gc9Var3.b(next);
                        if (bundle2.containsKey(next)) {
                            fdc.l(next, bundle2);
                        }
                        it6 = it7;
                    }
                }
                Bundle[] bundleArr = ma9Var.e;
                if (bundleArr != null) {
                    int length = bundleArr.length;
                    int i6 = 0;
                    while (i6 < length) {
                        int i7 = i6;
                        Bundle bundle3 = bundleArr[i7];
                        bundle3.getClass();
                        int i8 = length;
                        bundle3.setClassLoader(ga9.class.getClassLoader());
                        String strN = fdc.n("nav-entry-state:id", bundle3);
                        int iK = fdc.k("nav-entry-state:destination-id", bundle3);
                        Bundle bundle4 = bundle3.getBundle("nav-entry-state:args");
                        if (bundle4 == null) {
                            gdc.h("nav-entry-state:args");
                            throw null;
                        }
                        Bundle bundle5 = bundle3.getBundle("nav-entry-state:saved-state");
                        if (bundle5 == null) {
                            gdc.h("nav-entry-state:saved-state");
                            throw null;
                        }
                        ua9 ua9VarD = ma9Var.d(iK, null);
                        if (ua9VarD == null) {
                            int i9 = ua9.e;
                            r3.k(tec.p("Restoring the Navigation back stack failed: destination ", kj0.g0(bsVar, iK), " cannot be found from the current destination "), ma9Var.i());
                            return;
                        }
                        g48 g48VarK = ma9Var.k();
                        na9 na9Var = ma9Var.o;
                        bsVar.getClass();
                        g48VarK.getClass();
                        Context context = bsVar.a;
                        bundle4.setClassLoader(context != null ? context.getClassLoader() : null);
                        da9 da9Var2 = new da9(bsVar, ua9VarD, bundle4, g48VarK, na9Var, strN, bundle5);
                        fc9 fc9VarB = gc9Var3.b(ua9VarD.a);
                        Object ia9Var = linkedHashMap.get(fc9VarB);
                        if (ia9Var == null) {
                            ia9Var = new ia9(ka9Var, fc9VarB);
                            linkedHashMap.put(fc9VarB, ia9Var);
                        }
                        ad0Var.addLast(da9Var2);
                        ((ia9) ia9Var).a(da9Var2);
                        ya9 ya9Var7 = da9Var2.b.c;
                        if (ya9Var7 != null) {
                            ma9Var.m(da9Var2, ma9Var.g(ya9Var7.b.b));
                        }
                        i6 = i7 + 1;
                        length = i8;
                    }
                    ma9Var.b.invoke();
                    ma9Var.e = null;
                }
                Collection collectionValues = bm8.X(gc9Var3.a).values();
                ArrayList<fc9> arrayList2 = new ArrayList();
                for (Object obj3 : collectionValues) {
                    if (!((fc9) obj3).b) {
                        arrayList2.add(obj3);
                    }
                }
                for (fc9 fc9Var : arrayList2) {
                    Object ia9Var2 = linkedHashMap.get(fc9Var);
                    if (ia9Var2 == null) {
                        fc9Var.getClass();
                        ia9Var2 = new ia9(ka9Var, fc9Var);
                        linkedHashMap.put(fc9Var, ia9Var2);
                    }
                    fc9Var.getClass();
                    fc9Var.a = (ia9) ia9Var2;
                    fc9Var.b = true;
                }
                if (ma9Var.c == null || !ad0Var.isEmpty()) {
                    gc9Var = gc9Var2;
                    x48Var = x48Var2;
                    i3 = i3;
                    ma9Var.b();
                } else {
                    Activity activity = ka9Var.d;
                    if (ka9Var.e || activity == null) {
                        gc9Var = gc9Var2;
                        x48Var = x48Var2;
                        i3 = i3;
                        ya9 ya9Var8 = ma9Var.c;
                        ya9Var8.getClass();
                        ma9Var.n(ya9Var8, null, null);
                    } else {
                        Intent intent = activity.getIntent();
                        ma9 ma9Var2 = ka9Var.b;
                        if (intent == null) {
                            gc9Var = gc9Var2;
                            x48Var = x48Var2;
                            i3 = i3;
                        } else {
                            Bundle extras = intent.getExtras();
                            if (extras != null) {
                                try {
                                    intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                                } catch (Exception e2) {
                                    b1.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e2);
                                    intArray = null;
                                }
                            } else {
                                intArray = null;
                            }
                            ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
                            Bundle bundleR = feg.r((iy9[]) Arrays.copyOf(new iy9[0], 0));
                            Bundle bundle6 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
                            if (bundle6 != null) {
                                bundleR.putAll(bundle6);
                            }
                            if (intArray == null || intArray.length == 0) {
                                ?? L = ma9Var2.l();
                                x48Var = x48Var2;
                                gc9Var = gc9Var2;
                                ta9 ta9VarG = L.g(new gg7(intent.getData(), intent.getAction(), intent.getType(), 14), L);
                                if (ta9VarG != null) {
                                    ua9 ua9Var3 = ta9VarG.a;
                                    ad0 ad0Var2 = new ad0();
                                    ua9 ua9Var4 = ua9Var3;
                                    while (true) {
                                        a80 a80Var = ua9Var4.b;
                                        ya9 ya9Var9 = ua9Var4.c;
                                        if (ya9Var9 == null || ya9Var9.f.a != a80Var.b) {
                                            ad0Var2.addFirst(ua9Var4);
                                        }
                                        if (pa7.t(ya9Var9, null) || ya9Var9 == null) {
                                            break;
                                        } else {
                                            ua9Var4 = ya9Var9;
                                        }
                                    }
                                    List listJ1 = s72.j1(ad0Var2);
                                    ArrayList arrayList3 = new ArrayList(t72.u(listJ1, 10));
                                    Iterator it8 = listJ1.iterator();
                                    while (it8.hasNext()) {
                                        arrayList3.add(Integer.valueOf(((ua9) it8.next()).b.b));
                                    }
                                    int[] iArrI1 = s72.i1(arrayList3);
                                    Bundle bundleC = ua9Var3.c(ta9VarG.b);
                                    if (bundleC != null) {
                                        bundleR.putAll(bundleC);
                                    }
                                    iArr = iArrI1;
                                    arrayList = null;
                                }
                                if (iArr == null && iArr.length != 0) {
                                    ma9Var2.getClass();
                                    ya9 ya9Var10 = ma9Var2.c;
                                    int length2 = iArr.length;
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 >= length2) {
                                            strG0 = null;
                                            break;
                                        }
                                        int i11 = iArr[i10];
                                        if (i10 == 0) {
                                            ya9 ya9Var11 = ma9Var2.c;
                                            ya9Var11.getClass();
                                            ua9VarK2 = ya9Var11.b.b == i11 ? ma9Var2.c : null;
                                        } else {
                                            ya9Var10.getClass();
                                            ua9VarK2 = ya9Var10.f.k(i11);
                                        }
                                        if (ua9VarK2 == null) {
                                            int i12 = ua9.e;
                                            strG0 = kj0.g0(ma9Var2.a.c, i11);
                                            break;
                                        }
                                        if (i10 != iArr.length - 1 && (ua9VarK2 instanceof ya9)) {
                                            while (true) {
                                                ya9Var3 = (ya9) ua9VarK2;
                                                ya9Var3.getClass();
                                                r1f r1fVar2 = ya9Var3.f;
                                                if (!(r1fVar2.k(r1fVar2.a) instanceof ya9)) {
                                                    break;
                                                } else {
                                                    ua9VarK2 = r1fVar2.k(r1fVar2.a);
                                                }
                                            }
                                            ya9Var10 = ya9Var3;
                                        }
                                        i10++;
                                    }
                                    if (strG0 != null) {
                                        Log.i("NavController", "Could not find destination " + strG0 + " in the navigation graph, ignoring the deep link from " + intent);
                                    } else {
                                        bundleR.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                                        int length3 = iArr.length;
                                        Bundle[] bundleArr2 = new Bundle[length3];
                                        for (int i13 = 0; i13 < length3; i13++) {
                                            Bundle bundleR2 = feg.r((iy9[]) Arrays.copyOf(new iy9[0], 0));
                                            bundleR2.putAll(bundleR);
                                            if (arrayList != null && (bundle = (Bundle) arrayList.get(i13)) != null) {
                                                bundleR2.putAll(bundle);
                                            }
                                            bundleArr2[i13] = bundleR2;
                                        }
                                        int flags = intent.getFlags();
                                        int i14 = 268435456 & flags;
                                        if (i14 != 0 && (flags & 32768) == 0) {
                                            intent.addFlags(32768);
                                            bvd bvdVar = new bvd(ka9Var.a);
                                            ComponentName component = intent.getComponent();
                                            if (component == null) {
                                                component = intent.resolveActivity(((Context) bvdVar.c).getPackageManager());
                                            }
                                            if (component != null) {
                                                bvdVar.a(component);
                                            }
                                            ((ArrayList) bvdVar.b).add(intent);
                                            bvdVar.c();
                                            activity.finish();
                                            activity.overridePendingTransition(0, 0);
                                        } else if (i14 != 0) {
                                            if (!ma9Var2.f.isEmpty()) {
                                                ya9 ya9Var12 = ma9Var2.c;
                                                ya9Var12.getClass();
                                                ma9Var2.p(ya9Var12.b.b, true, false);
                                            }
                                            int i15 = 0;
                                            while (i15 < iArr.length) {
                                                int i16 = iArr[i15];
                                                int i17 = i15 + 1;
                                                Bundle bundle7 = bundleArr2[i15];
                                                ua9 ua9VarD2 = ma9Var2.d(i16, null);
                                                if (ua9VarD2 == null) {
                                                    int i18 = ua9.e;
                                                    r3.k(tec.p("Deep Linking failed: destination ", kj0.g0(bsVar, i16), " cannot be found from the current destination "), ma9Var2.i());
                                                    return;
                                                } else {
                                                    ma9Var2.n(ua9VarD2, bundle7, cn1.I(new kz8(4, ua9VarD2, ka9Var)));
                                                    i15 = i17;
                                                }
                                            }
                                            ka9Var.e = true;
                                        } else {
                                            ya9 ya9Var13 = ma9Var2.c;
                                            int length4 = iArr.length;
                                            for (int i19 = 0; i19 < length4; i19++) {
                                                int i20 = iArr[i19];
                                                Bundle bundle8 = bundleArr2[i19];
                                                if (i19 == 0) {
                                                    ua9VarK = ma9Var2.c;
                                                } else {
                                                    ya9Var13.getClass();
                                                    ua9VarK = ya9Var13.f.k(i20);
                                                }
                                                if (ua9VarK == null) {
                                                    int i21 = ua9.e;
                                                    ho7.o("Deep Linking failed: destination ", kj0.g0(bsVar, i20), " cannot be found in graph ", ya9Var13);
                                                    return;
                                                }
                                                if (i19 == iArr.length - 1) {
                                                    ya9 ya9Var14 = ma9Var2.c;
                                                    ya9Var14.getClass();
                                                    ma9Var2.n(ua9VarK, bundle8, new pb9(false, false, ya9Var14.b.b, true, false, 0, 0));
                                                } else if (ua9VarK instanceof ya9) {
                                                    while (true) {
                                                        ya9Var2 = (ya9) ua9VarK;
                                                        ya9Var2.getClass();
                                                        r1f r1fVar3 = ya9Var2.f;
                                                        if (!(r1fVar3.k(r1fVar3.a) instanceof ya9)) {
                                                            break;
                                                        } else {
                                                            ua9VarK = r1fVar3.k(r1fVar3.a);
                                                        }
                                                    }
                                                    ya9Var13 = ya9Var2;
                                                }
                                            }
                                            ka9Var.e = true;
                                        }
                                    }
                                }
                            } else {
                                gc9Var = gc9Var2;
                                x48Var = x48Var2;
                            }
                            arrayList = parcelableArrayList;
                            iArr = intArray;
                            if (iArr == null) {
                            }
                        }
                        ya9 ya9Var15 = ma9Var.c;
                        ya9Var15.getClass();
                        ma9Var.n(ya9Var15, null, null);
                    }
                }
            }
            gc9 gc9Var4 = gc9Var;
            fc9 fc9VarB2 = gc9Var4.b("composable");
            se2 se2Var3 = fc9VarB2 instanceof se2 ? (se2) fc9VarB2 : null;
            if (se2Var3 == null) {
                ojb ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    final int i22 = 2;
                    ojbVarV.d = new l26() { // from class: gb9
                        @Override // defpackage.l26
                        public final Object z(Object obj4, Object obj5) {
                            int i23 = i22;
                            wef wefVar = wef.a;
                            int i24 = i;
                            switch (i23) {
                                case 0:
                                    ((Integer) obj5).getClass();
                                    int iP = k99.P(i24 | 1);
                                    an1.f(cb9Var, ya9Var, j09Var, yiVar, a26Var, a26Var2, a26Var3, a26Var4, (l46) obj4, iP);
                                    break;
                                case 1:
                                    ((Integer) obj5).getClass();
                                    int iP2 = k99.P(i24 | 1);
                                    an1.f(cb9Var, ya9Var, j09Var, yiVar, a26Var, a26Var2, a26Var3, a26Var4, (l46) obj4, iP2);
                                    break;
                                default:
                                    ((Integer) obj5).getClass();
                                    int iP3 = k99.P(i24 | 1);
                                    an1.f(cb9Var, ya9Var, j09Var, yiVar, a26Var, a26Var2, a26Var3, a26Var4, (l46) obj4, iP3);
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    return;
                }
                return;
            }
            whb whbVar = se2Var3.b().e;
            e89 e89VarI = jzb.i(whbVar, whbVar.getValue(), l46Var, 0, 0);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = new qz9(0.0f);
                l46Var.p0(objR);
            }
            n69 n69Var = (n69) objR;
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = q1c.f(Boolean.FALSE);
                l46Var.p0(objR2);
            }
            e89 e89Var3 = (e89) objR2;
            boolean z3 = ((List) e89VarI.getValue()).size() > 1;
            boolean zG = l46Var.g(e89VarI) | l46Var.i(se2Var3);
            Object objR3 = l46Var.R();
            if (zG || objR3 == i8cVar) {
                se2 se2Var4 = se2Var3;
                ib9 ib9Var = new ib9(se2Var4, e89VarI, n69Var, e89Var3, null);
                e89Var = e89Var3;
                se2Var3 = se2Var4;
                l46Var.p0(ib9Var);
                objR3 = ib9Var;
            } else {
                e89Var = e89Var3;
            }
            jgb.v(z3, (l26) objR3, l46Var, 0);
            x48 x48Var3 = x48Var;
            boolean zI = l46Var.i(cb9Var) | l46Var.i(x48Var3);
            Object objR4 = l46Var.R();
            if (zI || objR4 == i8cVar) {
                objR4 = new kz8(6, cb9Var, x48Var3);
                l46Var.p0(objR4);
            }
            af1.g(x48Var3, (a26) objR4, l46Var);
            rcc rccVarL = scc.l(l46Var);
            e89 e89VarJ = jzb.j(ma9Var.i, l46Var);
            Object objR5 = l46Var.R();
            if (objR5 == i8cVar) {
                objR5 = zrd.b(new zk1(9, e89VarJ));
                l46Var.p0(objR5);
            }
            h0e h0eVar = (h0e) objR5;
            da9 da9Var3 = (da9) s72.H0((List) h0eVar.getValue());
            Object objR6 = l46Var.R();
            if (objR6 == i8cVar) {
                int i23 = nk9.a;
                objR6 = new d79(6);
                l46Var.p0(objR6);
            }
            d79 d79Var = (d79) objR6;
            if (da9Var3 != null) {
                l46Var.f0(-1797563167);
                boolean zI2 = l46Var.i(se2Var3) | ((((i3 & 3670016) ^ 1572864) > 1048576 && l46Var.g(a26Var3)) || (i3 & 1572864) == 1048576) | ((i3 & 57344) == 16384);
                Object objR7 = l46Var.R();
                if (zI2 || objR7 == i8cVar) {
                    final int i24 = 0;
                    se2Var = se2Var3;
                    a26 a26Var6 = new a26() { // from class: eb9
                        /* JADX WARN: Code duplicated, block: B:21:0x0065  */
                        /* JADX WARN: Code duplicated, block: B:34:0x009a  */
                        /* JADX WARN: Code duplicated, block: B:53:0x00f7  */
                        /* JADX WARN: Code duplicated, block: B:66:0x012c  */
                        /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
                        @Override // defpackage.a26
                        public final Object d(Object obj4) {
                            a26 a26Var7;
                            a26 a26Var8;
                            a26 a26Var9;
                            a26 a26Var10;
                            int i25 = i24;
                            Object obj5 = null;
                            e89 e89Var4 = e89Var;
                            a26 a26Var11 = a26Var;
                            a26 a26Var12 = a26Var3;
                            se2 se2Var5 = se2Var;
                            my myVar = (my) obj4;
                            switch (i25) {
                                case 0:
                                    ua9 ua9Var5 = ((da9) myVar.d()).b;
                                    ua9Var5.getClass();
                                    re2 re2Var = (re2) ua9Var5;
                                    if (((Boolean) se2Var5.c.getValue()).booleanValue() || ((Boolean) e89Var4.getValue()).booleanValue()) {
                                        int i26 = ua9.e;
                                        for (ua9 ua9Var6 : kj0.h0(re2Var)) {
                                            bx4 bx4Var = (!(ua9Var6 instanceof re2) || (a26Var7 = ((re2) ua9Var6).w) == null) ? null : (bx4) a26Var7.d(myVar);
                                            if (bx4Var != null) {
                                                obj5 = bx4Var;
                                                if (obj5 == null) {
                                                    return (bx4) a26Var12.d(myVar);
                                                }
                                                return obj5;
                                            }
                                        }
                                        if (obj5 == null) {
                                            return (bx4) a26Var12.d(myVar);
                                        }
                                        return obj5;
                                    }
                                    int i27 = ua9.e;
                                    for (ua9 ua9Var7 : kj0.h0(re2Var)) {
                                        bx4 bx4Var2 = (!(ua9Var7 instanceof re2) || (a26Var8 = ((re2) ua9Var7).g) == null) ? null : (bx4) a26Var8.d(myVar);
                                        if (bx4Var2 != null) {
                                            obj5 = bx4Var2;
                                            if (obj5 == null) {
                                                return (bx4) a26Var11.d(myVar);
                                            }
                                            return obj5;
                                        }
                                    }
                                    if (obj5 == null) {
                                        return (bx4) a26Var11.d(myVar);
                                    }
                                    return obj5;
                                default:
                                    ua9 ua9Var8 = ((da9) myVar.b()).b;
                                    ua9Var8.getClass();
                                    re2 re2Var2 = (re2) ua9Var8;
                                    if (((Boolean) se2Var5.c.getValue()).booleanValue() || ((Boolean) e89Var4.getValue()).booleanValue()) {
                                        int i28 = ua9.e;
                                        for (ua9 ua9Var9 : kj0.h0(re2Var2)) {
                                            e45 e45Var = (!(ua9Var9 instanceof re2) || (a26Var9 = ((re2) ua9Var9).x) == null) ? null : (e45) a26Var9.d(myVar);
                                            if (e45Var != null) {
                                                obj5 = e45Var;
                                                if (obj5 == null) {
                                                    return (e45) a26Var12.d(myVar);
                                                }
                                                return obj5;
                                            }
                                        }
                                        if (obj5 == null) {
                                            return (e45) a26Var12.d(myVar);
                                        }
                                        return obj5;
                                    }
                                    int i29 = ua9.e;
                                    for (ua9 ua9Var10 : kj0.h0(re2Var2)) {
                                        e45 e45Var2 = (!(ua9Var10 instanceof re2) || (a26Var10 = ((re2) ua9Var10).v) == null) ? null : (e45) a26Var10.d(myVar);
                                        if (e45Var2 != null) {
                                            obj5 = e45Var2;
                                            if (obj5 == null) {
                                                return (e45) a26Var11.d(myVar);
                                            }
                                            return obj5;
                                        }
                                    }
                                    if (obj5 == null) {
                                        return (e45) a26Var11.d(myVar);
                                    }
                                    return obj5;
                            }
                        }
                    };
                    l46Var.p0(a26Var6);
                    objR7 = a26Var6;
                } else {
                    se2Var = se2Var3;
                }
                a26 a26Var7 = (a26) objR7;
                boolean zI3 = l46Var.i(se2Var) | ((((i3 & 29360128) ^ 12582912) > 8388608 && l46Var.g(a26Var4)) || (i3 & 12582912) == 8388608) | ((i3 & 458752) == 131072);
                Object objR8 = l46Var.R();
                if (zI3 || objR8 == i8cVar) {
                    final int i25 = 1;
                    a26Var5 = a26Var7;
                    a26 a26Var8 = new a26() { // from class: eb9
                        /* JADX WARN: Code duplicated, block: B:21:0x0065  */
                        /* JADX WARN: Code duplicated, block: B:34:0x009a  */
                        /* JADX WARN: Code duplicated, block: B:53:0x00f7  */
                        /* JADX WARN: Code duplicated, block: B:66:0x012c  */
                        /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
                        @Override // defpackage.a26
                        public final Object d(Object obj4) {
                            a26 a26Var9;
                            a26 a26Var10;
                            a26 a26Var11;
                            a26 a26Var12;
                            int i26 = i25;
                            Object obj5 = null;
                            e89 e89Var4 = e89Var;
                            a26 a26Var13 = a26Var2;
                            a26 a26Var14 = a26Var4;
                            se2 se2Var5 = se2Var;
                            my myVar = (my) obj4;
                            switch (i26) {
                                case 0:
                                    ua9 ua9Var5 = ((da9) myVar.d()).b;
                                    ua9Var5.getClass();
                                    re2 re2Var = (re2) ua9Var5;
                                    if (((Boolean) se2Var5.c.getValue()).booleanValue() || ((Boolean) e89Var4.getValue()).booleanValue()) {
                                        int i27 = ua9.e;
                                        for (ua9 ua9Var6 : kj0.h0(re2Var)) {
                                            bx4 bx4Var = (!(ua9Var6 instanceof re2) || (a26Var9 = ((re2) ua9Var6).w) == null) ? null : (bx4) a26Var9.d(myVar);
                                            if (bx4Var != null) {
                                                obj5 = bx4Var;
                                                if (obj5 == null) {
                                                    return (bx4) a26Var14.d(myVar);
                                                }
                                                return obj5;
                                            }
                                        }
                                        if (obj5 == null) {
                                            return (bx4) a26Var14.d(myVar);
                                        }
                                        return obj5;
                                    }
                                    int i28 = ua9.e;
                                    for (ua9 ua9Var7 : kj0.h0(re2Var)) {
                                        bx4 bx4Var2 = (!(ua9Var7 instanceof re2) || (a26Var10 = ((re2) ua9Var7).g) == null) ? null : (bx4) a26Var10.d(myVar);
                                        if (bx4Var2 != null) {
                                            obj5 = bx4Var2;
                                            if (obj5 == null) {
                                                return (bx4) a26Var13.d(myVar);
                                            }
                                            return obj5;
                                        }
                                    }
                                    if (obj5 == null) {
                                        return (bx4) a26Var13.d(myVar);
                                    }
                                    return obj5;
                                default:
                                    ua9 ua9Var8 = ((da9) myVar.b()).b;
                                    ua9Var8.getClass();
                                    re2 re2Var2 = (re2) ua9Var8;
                                    if (((Boolean) se2Var5.c.getValue()).booleanValue() || ((Boolean) e89Var4.getValue()).booleanValue()) {
                                        int i29 = ua9.e;
                                        for (ua9 ua9Var9 : kj0.h0(re2Var2)) {
                                            e45 e45Var = (!(ua9Var9 instanceof re2) || (a26Var11 = ((re2) ua9Var9).x) == null) ? null : (e45) a26Var11.d(myVar);
                                            if (e45Var != null) {
                                                obj5 = e45Var;
                                                if (obj5 == null) {
                                                    return (e45) a26Var14.d(myVar);
                                                }
                                                return obj5;
                                            }
                                        }
                                        if (obj5 == null) {
                                            return (e45) a26Var14.d(myVar);
                                        }
                                        return obj5;
                                    }
                                    int i210 = ua9.e;
                                    for (ua9 ua9Var10 : kj0.h0(re2Var2)) {
                                        e45 e45Var2 = (!(ua9Var10 instanceof re2) || (a26Var12 = ((re2) ua9Var10).v) == null) ? null : (e45) a26Var12.d(myVar);
                                        if (e45Var2 != null) {
                                            obj5 = e45Var2;
                                            if (obj5 == null) {
                                                return (e45) a26Var13.d(myVar);
                                            }
                                            return obj5;
                                        }
                                    }
                                    if (obj5 == null) {
                                        return (e45) a26Var13.d(myVar);
                                    }
                                    return obj5;
                            }
                        }
                    };
                    l46Var.p0(a26Var8);
                    objR8 = a26Var8;
                } else {
                    a26Var5 = a26Var7;
                }
                a26 a26Var9 = (a26) objR8;
                boolean z4 = (i3 & 234881024) == 67108864;
                Object objR9 = l46Var.R();
                if (z4 || objR9 == i8cVar) {
                    objR9 = new d59(13);
                    l46Var.p0(objR9);
                }
                a26 a26Var10 = (a26) objR9;
                Boolean bool = Boolean.TRUE;
                boolean zI4 = l46Var.i(se2Var);
                Object objR10 = l46Var.R();
                if (zI4 || objR10 == i8cVar) {
                    objR10 = new kz8(5, h0eVar, se2Var);
                    l46Var.p0(objR10);
                }
                af1.g(bool, (a26) objR10, l46Var);
                Object objR11 = l46Var.R();
                if (objR11 == i8cVar) {
                    objR11 = new ltc(da9Var3);
                    l46Var.p0(objR11);
                }
                ltc ltcVar = (ltc) objR11;
                e89 e89Var4 = e89Var;
                n3f n3fVarE0 = g21.e0(ltcVar, "entry", l46Var, 56, 0);
                if (((Boolean) e89Var4.getValue()).booleanValue()) {
                    l46Var.f0(-1795329152);
                    Float fValueOf = Float.valueOf(((qz9) n69Var).j());
                    boolean zG2 = l46Var.g(e89VarI) | l46Var.i(ltcVar);
                    Object objR12 = l46Var.R();
                    if (zG2 || objR12 == i8cVar) {
                        objR12 = new jb9(ltcVar, e89VarI, n69Var, null);
                        l46Var.p0(objR12);
                    }
                    af1.o((l26) objR12, l46Var, fValueOf);
                    z2 = false;
                    l46Var.r(false);
                    q84Var2 = null;
                } else {
                    h0eVar = h0eVar;
                    l46Var.f0(-1794910745);
                    boolean zI5 = l46Var.i(ltcVar) | l46Var.i(da9Var3) | l46Var.g(n3fVarE0);
                    Object objR13 = l46Var.R();
                    if (zI5 || objR13 == i8cVar) {
                        q84Var2 = null;
                        objR13 = new lb9(ltcVar, da9Var3, n3fVarE0, null);
                        l46Var.p0(objR13);
                    } else {
                        q84Var2 = null;
                    }
                    af1.o((l26) objR13, l46Var, da9Var3);
                    z2 = false;
                    l46Var.r(false);
                }
                boolean zI6 = l46Var.i(d79Var) | l46Var.i(se2Var) | l46Var.g(a26Var5) | l46Var.g(a26Var9) | l46Var.g(a26Var10);
                Object objR14 = l46Var.R();
                if (zI6 || objR14 == i8cVar) {
                    se2 se2Var5 = se2Var;
                    h0e h0eVar2 = h0eVar;
                    ms2 ms2Var = new ms2(d79Var, se2Var5, a26Var5, a26Var9, a26Var10, h0eVar2, e89Var4);
                    se2Var2 = se2Var5;
                    e89Var2 = e89Var4;
                    h0eVar = h0eVar2;
                    d79Var = d79Var;
                    l46Var.p0(ms2Var);
                    objR14 = ms2Var;
                } else {
                    se2Var2 = se2Var;
                    e89Var2 = e89Var4;
                }
                a26 a26Var11 = (a26) objR14;
                Object objR15 = l46Var.R();
                if (objR15 == i8cVar) {
                    objR15 = new d59(16);
                    l46Var.p0(objR15);
                }
                e89 e89Var5 = e89Var2;
                d79 d79Var2 = d79Var;
                q84Var = q84Var2;
                kn2.b(n3fVarE0, j09Var, a26Var11, yiVar, (a26) objR15, af1.b0(820763100, new zk6(ltcVar, da9Var3, rccVarL, e89Var5, h0eVar, 1), l46Var), l46Var, ((i3 >> 3) & 112) | 221184 | (i3 & 7168), 0);
                l46 l46Var4 = l46Var;
                Object objA = n3fVarE0.a.a();
                Object value = n3fVarE0.d.getValue();
                boolean zG3 = l46Var4.g(n3fVarE0) | l46Var4.i(cb9Var) | l46Var4.i(da9Var3) | l46Var4.i(se2Var2) | l46Var4.i(d79Var2);
                Object objR16 = l46Var4.R();
                if (zG3 || objR16 == i8cVar) {
                    se2 se2Var6 = se2Var2;
                    obj = objA;
                    mb9 mb9Var = new mb9(n3fVarE0, cb9Var, da9Var3, d79Var2, h0eVar, se2Var6, null);
                    l46Var4.p0(mb9Var);
                    objR16 = mb9Var;
                } else {
                    obj = objA;
                }
                af1.p(obj, value, (l26) objR16, l46Var4);
                l46Var4.r(z2);
                l46Var2 = l46Var4;
                r15 = z2;
            } else {
                l46 l46Var5 = l46Var;
                r15 = 0;
                q84Var = null;
                l46Var5.f0(-1789758886);
                l46Var5.r(false);
                l46Var2 = l46Var5;
            }
            fc9 fc9VarB3 = gc9Var4.b("dialog");
            q84 q84Var3 = fc9VarB3 instanceof q84 ? (q84) fc9VarB3 : q84Var;
            if (q84Var3 == null) {
                ojb ojbVarV2 = l46Var2.v();
                if (ojbVarV2 != null) {
                    final int i26 = 0;
                    ojbVarV2.d = new l26() { // from class: gb9
                        @Override // defpackage.l26
                        public final Object z(Object obj4, Object obj5) {
                            int i27 = i26;
                            wef wefVar = wef.a;
                            int i28 = i;
                            switch (i27) {
                                case 0:
                                    ((Integer) obj5).getClass();
                                    int iP = k99.P(i28 | 1);
                                    an1.f(cb9Var, ya9Var, j09Var, yiVar, a26Var, a26Var2, a26Var3, a26Var4, (l46) obj4, iP);
                                    break;
                                case 1:
                                    ((Integer) obj5).getClass();
                                    int iP2 = k99.P(i28 | 1);
                                    an1.f(cb9Var, ya9Var, j09Var, yiVar, a26Var, a26Var2, a26Var3, a26Var4, (l46) obj4, iP2);
                                    break;
                                default:
                                    ((Integer) obj5).getClass();
                                    int iP3 = k99.P(i28 | 1);
                                    an1.f(cb9Var, ya9Var, j09Var, yiVar, a26Var, a26Var2, a26Var3, a26Var4, (l46) obj4, iP3);
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    return;
                }
                return;
            }
            od4.c(q84Var3, l46Var2, r15);
            l46Var3 = l46Var2;
        }
        ojb ojbVarV3 = l46Var3.v();
        if (ojbVarV3 != null) {
            final int i27 = 1;
            ojbVarV3.d = new l26() { // from class: gb9
                @Override // defpackage.l26
                public final Object z(Object obj4, Object obj5) {
                    int i28 = i27;
                    wef wefVar = wef.a;
                    int i29 = i;
                    switch (i28) {
                        case 0:
                            ((Integer) obj5).getClass();
                            int iP = k99.P(i29 | 1);
                            an1.f(cb9Var, ya9Var, j09Var, yiVar, a26Var, a26Var2, a26Var3, a26Var4, (l46) obj4, iP);
                            break;
                        case 1:
                            ((Integer) obj5).getClass();
                            int iP2 = k99.P(i29 | 1);
                            an1.f(cb9Var, ya9Var, j09Var, yiVar, a26Var, a26Var2, a26Var3, a26Var4, (l46) obj4, iP2);
                            break;
                        default:
                            ((Integer) obj5).getClass();
                            int iP3 = k99.P(i29 | 1);
                            an1.f(cb9Var, ya9Var, j09Var, yiVar, a26Var, a26Var2, a26Var3, a26Var4, (l46) obj4, iP3);
                            break;
                    }
                    return wefVar;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:45:0x0094  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00df  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:63:0x0111  */
    /* JADX WARN: Code duplicated, block: B:64:0x0113  */
    /* JADX WARN: Code duplicated, block: B:67:0x011c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x011e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0156  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    public static final void g(final cb9 cb9Var, final Object obj, j09 j09Var, yi yiVar, Map map, a26 a26Var, a26 a26Var2, a26 a26Var3, a26 a26Var4, final a26 a26Var5, l46 l46Var, final int i, final int i2) {
        int i3;
        j09 j09Var2;
        int i4;
        int i5;
        int i6;
        i8c i8cVar;
        Object objR;
        a26 a26Var6;
        Object objR2;
        Map map2;
        a26 a26Var7;
        yi yiVar2;
        j09 j09Var3;
        a26 a26Var8;
        int i7;
        a26 a26Var9;
        boolean z2;
        boolean z3;
        Object objR3;
        final a26 a26Var10;
        final a26 a26Var11;
        final a26 a26Var12;
        final a26 a26Var13;
        final Map map3;
        final yi yiVar3;
        final j09 j09Var4;
        ojb ojbVarV;
        l46Var.h0(-1476019057);
        if ((i & 6) == 0) {
            i3 = (l46Var.i(cb9Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= l46Var.i(obj) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 == 0) {
            if ((i & 384) == 0) {
                j09Var2 = j09Var;
                i3 |= l46Var.g(j09Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i4 = 14380032 | i3;
            if ((i & 100663296) == 0) {
                i4 = 47934464 | i3;
            }
            if ((805306368 & i) == 0) {
                i4 |= 268435456;
            }
            i5 = (l46Var.i(a26Var5) ? ' ' : (char) 16) | 6;
            if ((306783379 & i4) != 306783378 && (i5 & 19) == 18 && l46Var.F()) {
                l46Var.Z();
                yiVar3 = yiVar;
                a26Var12 = a26Var;
                a26Var13 = a26Var2;
                a26Var10 = a26Var3;
                a26Var11 = a26Var4;
                j09Var4 = j09Var2;
                map3 = map;
            } else {
                l46Var.b0();
                i6 = i & 1;
                i8cVar = sf2.a;
                if (i6 != 0 || l46Var.C()) {
                    if (i8 != 0) {
                        j09Var2 = g09.a;
                    }
                    lx0 lx0Var = ndb.b;
                    objR = l46Var.R();
                    if (objR == i8cVar) {
                        objR = new d59(14);
                        l46Var.p0(objR);
                    }
                    a26Var6 = (a26) objR;
                    objR2 = l46Var.R();
                    if (objR2 == i8cVar) {
                        objR2 = new d59(15);
                        l46Var.p0(objR2);
                    }
                    map2 = qu4.a;
                    a26Var7 = (a26) objR2;
                    yiVar2 = lx0Var;
                    j09Var3 = j09Var2;
                    a26Var8 = a26Var7;
                    i7 = i4 & (-2113929217);
                    a26Var9 = a26Var6;
                } else {
                    l46Var.Z();
                    int i9 = i4 & (-2113929217);
                    map2 = map;
                    a26Var6 = a26Var;
                    a26Var9 = a26Var3;
                    i7 = i9;
                    j09Var3 = j09Var2;
                    yiVar2 = yiVar;
                    a26Var8 = a26Var2;
                    a26Var7 = a26Var4;
                }
                l46Var.s();
                boolean zG = l46Var.g(null) | l46Var.g(obj);
                if ((i5 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = zG | z2;
                objR3 = l46Var.R();
                if (z3 || objR3 == i8cVar) {
                    za9 za9Var = new za9(cb9Var.b.s, obj, null, map2);
                    a26Var5.d(za9Var);
                    objR3 = za9Var.a();
                    l46Var.p0(objR3);
                }
                int i10 = i7 & 8078;
                int i11 = i7 >> 6;
                int i12 = (i11 & 458752) | i10 | (57344 & i11) | 100663296;
                a26 a26Var14 = a26Var6;
                f(cb9Var, (ya9) objR3, j09Var3, yiVar2, a26Var14, a26Var8, a26Var9, a26Var7, l46Var, i12);
                a26Var10 = a26Var9;
                a26Var11 = a26Var7;
                a26Var12 = a26Var14;
                a26Var13 = a26Var8;
                map3 = map2;
                yiVar3 = yiVar2;
                j09Var4 = j09Var3;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: fb9
                    @Override // defpackage.l26
                    public final Object z(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        an1.g(cb9Var, obj, j09Var4, yiVar3, map3, a26Var12, a26Var13, a26Var10, a26Var11, a26Var5, (l46) obj2, k99.P(i | 1), i2);
                        return wef.a;
                    }
                };
            }
        }
        i3 |= 384;
        j09Var2 = j09Var;
        i4 = 14380032 | i3;
        if ((i & 100663296) == 0) {
            i4 = 47934464 | i3;
        }
        if ((805306368 & i) == 0) {
            i4 |= 268435456;
        }
        i5 = (l46Var.i(a26Var5) ? ' ' : (char) 16) | 6;
        if ((306783379 & i4) != 306783378) {
            l46Var.b0();
            i6 = i & 1;
            i8cVar = sf2.a;
            if (i6 != 0) {
                if (i8 != 0) {
                    j09Var2 = g09.a;
                }
                lx0 lx0Var2 = ndb.b;
                objR = l46Var.R();
                if (objR == i8cVar) {
                    objR = new d59(14);
                    l46Var.p0(objR);
                }
                a26Var6 = (a26) objR;
                objR2 = l46Var.R();
                if (objR2 == i8cVar) {
                    objR2 = new d59(15);
                    l46Var.p0(objR2);
                }
                map2 = qu4.a;
                a26Var7 = (a26) objR2;
                yiVar2 = lx0Var2;
                j09Var3 = j09Var2;
                a26Var8 = a26Var7;
                i7 = i4 & (-2113929217);
                a26Var9 = a26Var6;
            } else {
                if (i8 != 0) {
                    j09Var2 = g09.a;
                }
                lx0 lx0Var3 = ndb.b;
                objR = l46Var.R();
                if (objR == i8cVar) {
                    objR = new d59(14);
                    l46Var.p0(objR);
                }
                a26Var6 = (a26) objR;
                objR2 = l46Var.R();
                if (objR2 == i8cVar) {
                    objR2 = new d59(15);
                    l46Var.p0(objR2);
                }
                map2 = qu4.a;
                a26Var7 = (a26) objR2;
                yiVar2 = lx0Var3;
                j09Var3 = j09Var2;
                a26Var8 = a26Var7;
                i7 = i4 & (-2113929217);
                a26Var9 = a26Var6;
            }
            l46Var.s();
            boolean zG2 = l46Var.g(null) | l46Var.g(obj);
            if ((i5 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            z3 = zG2 | z2;
            objR3 = l46Var.R();
            if (z3) {
                za9 za9Var2 = new za9(cb9Var.b.s, obj, null, map2);
                a26Var5.d(za9Var2);
                objR3 = za9Var2.a();
                l46Var.p0(objR3);
            } else {
                za9 za9Var3 = new za9(cb9Var.b.s, obj, null, map2);
                a26Var5.d(za9Var3);
                objR3 = za9Var3.a();
                l46Var.p0(objR3);
            }
            int i13 = i7 & 8078;
            int i14 = i7 >> 6;
            int i15 = (i14 & 458752) | i13 | (57344 & i14) | 100663296;
            a26 a26Var15 = a26Var6;
            f(cb9Var, (ya9) objR3, j09Var3, yiVar2, a26Var15, a26Var8, a26Var9, a26Var7, l46Var, i15);
            a26Var10 = a26Var9;
            a26Var11 = a26Var7;
            a26Var12 = a26Var15;
            a26Var13 = a26Var8;
            map3 = map2;
            yiVar3 = yiVar2;
            j09Var4 = j09Var3;
        } else {
            l46Var.b0();
            i6 = i & 1;
            i8cVar = sf2.a;
            if (i6 != 0) {
                if (i8 != 0) {
                    j09Var2 = g09.a;
                }
                lx0 lx0Var4 = ndb.b;
                objR = l46Var.R();
                if (objR == i8cVar) {
                    objR = new d59(14);
                    l46Var.p0(objR);
                }
                a26Var6 = (a26) objR;
                objR2 = l46Var.R();
                if (objR2 == i8cVar) {
                    objR2 = new d59(15);
                    l46Var.p0(objR2);
                }
                map2 = qu4.a;
                a26Var7 = (a26) objR2;
                yiVar2 = lx0Var4;
                j09Var3 = j09Var2;
                a26Var8 = a26Var7;
                i7 = i4 & (-2113929217);
                a26Var9 = a26Var6;
            } else {
                if (i8 != 0) {
                    j09Var2 = g09.a;
                }
                lx0 lx0Var5 = ndb.b;
                objR = l46Var.R();
                if (objR == i8cVar) {
                    objR = new d59(14);
                    l46Var.p0(objR);
                }
                a26Var6 = (a26) objR;
                objR2 = l46Var.R();
                if (objR2 == i8cVar) {
                    objR2 = new d59(15);
                    l46Var.p0(objR2);
                }
                map2 = qu4.a;
                a26Var7 = (a26) objR2;
                yiVar2 = lx0Var5;
                j09Var3 = j09Var2;
                a26Var8 = a26Var7;
                i7 = i4 & (-2113929217);
                a26Var9 = a26Var6;
            }
            l46Var.s();
            boolean zG3 = l46Var.g(null) | l46Var.g(obj);
            if ((i5 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            z3 = zG3 | z2;
            objR3 = l46Var.R();
            if (z3) {
                za9 za9Var4 = new za9(cb9Var.b.s, obj, null, map2);
                a26Var5.d(za9Var4);
                objR3 = za9Var4.a();
                l46Var.p0(objR3);
            } else {
                za9 za9Var5 = new za9(cb9Var.b.s, obj, null, map2);
                a26Var5.d(za9Var5);
                objR3 = za9Var5.a();
                l46Var.p0(objR3);
            }
            int i16 = i7 & 8078;
            int i17 = i7 >> 6;
            int i18 = (i17 & 458752) | i16 | (57344 & i17) | 100663296;
            a26 a26Var16 = a26Var6;
            f(cb9Var, (ya9) objR3, j09Var3, yiVar2, a26Var16, a26Var8, a26Var9, a26Var7, l46Var, i18);
            a26Var10 = a26Var9;
            a26Var11 = a26Var7;
            a26Var12 = a26Var16;
            a26Var13 = a26Var8;
            map3 = map2;
            yiVar3 = yiVar2;
            j09Var4 = j09Var3;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: fb9
                @Override // defpackage.l26
                public final Object z(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    an1.g(cb9Var, obj, j09Var4, yiVar3, map3, a26Var12, a26Var13, a26Var10, a26Var11, a26Var5, (l46) obj2, k99.P(i | 1), i2);
                    return wef.a;
                }
            };
        }
    }

    public static final void h(j09 j09Var, nqd nqdVar, l46 l46Var, int i) {
        nqdVar.getClass();
        l46Var.h0(966143443);
        int i2 = (l46Var.g(nqdVar) ? 32 : 16) | i;
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            jrb.c(nqdVar, ynb.a0(b.q(0.0f, 360.0f, j09Var, 1), 16.0f, 32.0f), hkg.e, l46Var, ((i2 >> 3) & 14) | 384);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new rk6(j09Var, nqdVar, i, 26);
        }
    }

    public static final void i(fqd fqdVar, l46 l46Var, int i) {
        int i2;
        l46Var.h0(-841302524);
        if ((i & 6) == 0) {
            i2 = i | (l46Var.g(fqdVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            uqd uqdVar = ((lqd) fqdVar).a;
            Object obj = uqdVar != null ? uqdVar : null;
            if (obj == null) {
                obj = hj6.R0;
            }
            j09 j09VarJ = g21.J(g09.a);
            y6c y6cVar = ((s5d) l46Var.k(u5d.a)).c;
            pr4 pr4Var = o82.a;
            rrb.d(j09VarJ, af1.b0(1070864657, new wf8(uqdVar, fqdVar), l46Var), af1.b0(-127870608, new rk6(27, uqdVar, fqdVar), l46Var), y6cVar, ((m82) l46Var.k(pr4Var)).F, ((m82) l46Var.k(pr4Var)).q, 0L, 0L, af1.b0(70917129, new rk6(28, obj, uqdVar), l46Var), l46Var, 805306800, 392);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new st5(fqdVar, i, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:35:0x008a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object k(h48 h48Var, zn2 zn2Var) throws Throwable {
        h58 h58Var;
        h48 h48Var2;
        mmb mmbVar;
        Throwable th;
        w48 w48Var;
        w48 w48Var2;
        if (zn2Var instanceof h58) {
            h58Var = (h58) zn2Var;
            int i = h58Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                h58Var.label = i - Integer.MIN_VALUE;
            } else {
                h58Var = new h58(zn2Var);
            }
        } else {
            h58Var = new h58(zn2Var);
        }
        Object obj = h58Var.result;
        int i2 = h58Var.label;
        wef wefVar = wef.a;
        if (i2 != 0) {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mmbVar = (mmb) h58Var.L$1;
            h48Var2 = (h48) h58Var.L$0;
            try {
                jzb.q(obj);
                w48Var2 = (w48) mmbVar.element;
                if (w48Var2 != null) {
                    h48Var2.b(w48Var2);
                }
                return wefVar;
            } catch (Throwable th2) {
                th = th2;
                w48Var = (w48) mmbVar.element;
                if (w48Var != null) {
                    h48Var2.b(w48Var);
                }
                throw th;
            }
        }
        jzb.q(obj);
        if (((a58) h48Var).i.compareTo(g48.d) >= 0) {
            return wefVar;
        }
        mmb mmbVar2 = new mmb();
        try {
            h58Var.L$0 = h48Var;
            h58Var.L$1 = mmbVar2;
            h58Var.label = 1;
            pl1 pl1Var = new pl1(1, k99.D(h58Var));
            pl1Var.v();
            i58 i58Var = new i58(pl1Var);
            mmbVar2.element = i58Var;
            h48Var.a(i58Var);
            Object objT = pl1Var.t();
            bw2 bw2Var = bw2.a;
            if (objT == bw2Var) {
                return bw2Var;
            }
            h48Var2 = h48Var;
            mmbVar = mmbVar2;
            w48Var2 = (w48) mmbVar.element;
            if (w48Var2 != null) {
                h48Var2.b(w48Var2);
            }
            return wefVar;
        } catch (Throwable th3) {
            h48Var2 = h48Var;
            mmbVar = mmbVar2;
            th = th3;
            w48Var = (w48) mmbVar.element;
            if (w48Var != null) {
                h48Var2.b(w48Var);
            }
            throw th;
        }
    }

    public static final ArrayList l(int i, int i2, int i3) {
        int i4 = i - ((i2 - 1) * i3);
        int i5 = i4 / i2;
        int i6 = i4 % i2;
        ArrayList arrayList = new ArrayList(i2);
        int i7 = 0;
        while (i7 < i2) {
            arrayList.add(Integer.valueOf((i7 < i6 ? 1 : 0) + i5));
            i7++;
        }
        return arrayList;
    }

    public static void m(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            cva.s();
        }
    }

    public static qy1 n(long j, long j2, long j3, l46 l46Var, int i) {
        long j4 = (i & 2) != 0 ? y72.k : j2;
        long j5 = (i & 4) != 0 ? y72.k : j3;
        long j6 = y72.k;
        m82 m82Var = (m82) l46Var.k(o82.a);
        qy1 qy1Var = m82Var.d0;
        if (qy1Var == null) {
            long jC = o82.c(m82Var, ty1.c);
            long j7 = y72.j;
            n82 n82Var = ty1.a;
            long jC2 = o82.c(m82Var, n82Var);
            n82 n82Var2 = ty1.b;
            qy1Var = new qy1(jC, j7, jC2, j7, y72.b(o82.c(m82Var, n82Var2), 0.38f), j7, y72.b(o82.c(m82Var, n82Var2), 0.38f), o82.c(m82Var, n82Var), o82.c(m82Var, ty1.f), y72.b(o82.c(m82Var, n82Var2), 0.38f), y72.b(o82.c(m82Var, ty1.e), 0.38f), y72.b(o82.c(m82Var, n82Var2), 0.38f));
            m82Var.d0 = qy1Var;
        }
        long j8 = y72.j;
        return qy1Var.b(j5, j8, j, j8, j6, j8, j6, j, j4, j6, j6, j6);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0039  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:57:0x014d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0157  */
    /* JADX WARN: Code duplicated, block: B:60:0x015d  */
    public static final sa1 o(gy3 gy3Var, boolean z2) {
        qk7 qk7Var;
        Method method;
        sa1 db1Var;
        jl7 jl7VarT;
        sa1 fb1Var;
        Field fieldL;
        t99 t99Var;
        u09 u09Var;
        if (xm7.a.g(gy3Var.I().x)) {
            return swe.a;
        }
        j22 j22Var = n8c.a;
        m93 m93VarB = n8c.b(gy3Var.I().G());
        int i = 6;
        boolean z3 = false;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        byte b6 = 0;
        byte b7 = 0;
        byte b8 = 0;
        Class clsQ = null;
        if (m93VarB instanceof el7) {
            el7 el7Var = (el7) m93VarB;
            u99 u99Var = el7Var.u;
            ll7 ll7Var = el7Var.t;
            if (z2) {
                if (ll7Var.x()) {
                    jl7VarT = ll7Var.s();
                } else {
                    jl7VarT = null;
                }
            } else if (ll7Var.z()) {
                jl7VarT = ll7Var.t();
            } else {
                jl7VarT = null;
            }
            Method methodF = jl7VarT != null ? gy3Var.I().v.F(u99Var.getString(jl7VarT.o()), u99Var.getString(jl7VarT.n())) : null;
            if (methodF == null) {
                wxa wxaVarI = gy3Var.I().G();
                int i2 = n37.a;
                if (wxaVarI.O() == null && wxaVarI.T().isEmpty()) {
                    bm3 bm3VarK = wxaVarI.k();
                    u09 u09Var2 = bm3VarK instanceof u09 ? (u09) bm3VarK : null;
                    if (u09Var2 != null) {
                        int i3 = qz3.a;
                        orf orfVarN0 = u09Var2.n0();
                        m37 m37Var = orfVarN0 instanceof m37 ? (m37) orfVarN0 : null;
                        if (m37Var != null) {
                            t99Var = m37Var.a;
                        } else {
                            t99Var = null;
                        }
                    } else {
                        t99Var = null;
                    }
                    if (pa7.t(t99Var, wxaVarI.getName()) && pa7.t(gy3Var.I().G().getVisibility(), sz3.d)) {
                        bm3 bm3VarK2 = gy3Var.I().G().k();
                        if ((bm3VarK2 instanceof u09) && n37.a(bm3VarK2) && (clsQ = sqf.q((u09Var = (u09) bm3VarK2))) == null) {
                            StringBuilder sb = new StringBuilder("Class object for the class ");
                            sb.append(u09Var.getName());
                            j22 j22VarF = qz3.f((y22) bm3VarK2);
                            sb.append(" cannot be found (classId=");
                            sb.append(j22VarF);
                            sb.append(')');
                            throw new pt7(sb.toString());
                        }
                        if (clsQ == null) {
                            throw new pt7("Underlying property of inline class " + gy3Var.I() + " should have a field");
                        }
                        Method methodJ = w6c.j(clsQ, gy3Var.I());
                        db1Var = ynb.Q(gy3Var) ? new g97(methodJ, ynb.J(gy3Var.I())) : new h97(methodJ);
                    } else {
                        fieldL = gy3Var.I().l();
                        if (fieldL != null) {
                            yg5.t(gy3Var.I(), "No accessors or field is found for property ");
                            return null;
                        }
                        db1Var = p(gy3Var, z2, fieldL);
                    }
                } else {
                    fieldL = gy3Var.I().l();
                    if (fieldL != null) {
                        yg5.t(gy3Var.I(), "No accessors or field is found for property ");
                        return null;
                    }
                    db1Var = p(gy3Var, z2, fieldL);
                }
            } else {
                if (!Modifier.isStatic(methodF.getModifiers())) {
                    fb1Var = ynb.Q(gy3Var) ? new db1(methodF, ynb.J(gy3Var.I())) : new gb1(methodF, z3, i, b8 == true ? 1 : 0);
                } else if (gy3Var.I().G().getAnnotations().E(sqf.a)) {
                    int i4 = 4;
                    fb1Var = ynb.Q(gy3Var) ? new eb1(methodF, b7 == true ? 1 : 0, i4) : new gb1(methodF, true, i4, true ? 1 : 0);
                } else {
                    fb1Var = ynb.Q(gy3Var) ? new fb1(methodF, false, ynb.J(gy3Var.I())) : new gb1(methodF, b6 == true ? 1 : 0, i, 2);
                }
                db1Var = fb1Var;
            }
        } else if (m93VarB instanceof cl7) {
            db1Var = p(gy3Var, z2, ((cl7) m93VarB).r);
        } else {
            if (!(m93VarB instanceof dl7)) {
                if (!(m93VarB instanceof fl7)) {
                    ap.c();
                    return null;
                }
                if (z2) {
                    qk7Var = ((fl7) m93VarB).r;
                } else {
                    qk7Var = ((fl7) m93VarB).s;
                    if (qk7Var == null) {
                        yg5.t(gy3Var.I(), "No setter found for property ");
                        return null;
                    }
                }
                xm7 xm7Var = gy3Var.I().v;
                sk7 sk7Var = qk7Var.p;
                Method methodF2 = xm7Var.F(sk7Var.G0, sk7Var.H0);
                if (methodF2 != null) {
                    Modifier.isStatic(methodF2.getModifiers());
                    return ynb.Q(gy3Var) ? new db1(methodF2, ynb.J(gy3Var.I())) : new gb1(methodF2, b3 == true ? 1 : 0, i, b2 == true ? 1 : 0);
                }
                yg5.t(gy3Var.I(), "No accessor found for property ");
                return null;
            }
            if (z2) {
                method = ((dl7) m93VarB).r;
            } else {
                dl7 dl7Var = (dl7) m93VarB;
                method = dl7Var.s;
                if (method == null) {
                    yg5.t(dl7Var.r, "No source found for setter of Java method property: ");
                    return null;
                }
            }
            db1Var = ynb.Q(gy3Var) ? new db1(method, ynb.J(gy3Var.I())) : new gb1(method, b5 == true ? 1 : 0, i, b4 == true ? 1 : 0);
        }
        return w6c.h(db1Var, gy3Var, pu4.a, false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0083  */
    /* JADX WARN: Code duplicated, block: B:31:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0099  */
    /* JADX WARN: Code duplicated, block: B:34:0x009f  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ce  */
    public static final hb1 p(gy3 gy3Var, boolean z2, Field field) {
        wxa wxaVarI = gy3Var.I().G();
        bm3 bm3VarK = wxaVarI.k();
        bm3VarK.getClass();
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = true;
        boolean z7 = true;
        boolean z8 = true;
        int i = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        if (oz3.k(bm3VarK)) {
            bm3 bm3VarK2 = bm3VarK.k();
            if ((oz3.l(bm3VarK2, l22.INTERFACE) || oz3.l(bm3VarK2, l22.ANNOTATION_CLASS)) && (!(wxaVarI instanceof q04) || !sl7.d(((q04) wxaVarI).Q0))) {
                if (Modifier.isStatic(field.getModifiers())) {
                    if (gy3Var.I().G().getAnnotations().E(sqf.a)) {
                        int i2 = 2;
                        if (z2) {
                        }
                    }
                    if (z2) {
                        if (ynb.Q(gy3Var)) {
                        }
                    }
                    if (ynb.Q(gy3Var)) {
                    }
                }
            }
        } else if (Modifier.isStatic(field.getModifiers())) {
            if (gy3Var.I().G().getAnnotations().E(sqf.a)) {
                int i3 = 2;
                return z2 ? new xa1(field, b3 == true ? 1 : 0, i3) : new bb1(field, q(gy3Var), b2 == true ? 1 : 0, i3);
            }
            if (z2) {
                return ynb.Q(gy3Var) ? new wa1(field, false) : new xa1(field, z7 ? 1 : 0, z6 ? 1 : 0);
            }
            return ynb.Q(gy3Var) ? new ab1(field, q(gy3Var), false) : new bb1(field, q(gy3Var), z5 ? 1 : 0, z4 ? 1 : 0);
        }
        if (z2) {
            return ynb.Q(gy3Var) ? new va1(field, ynb.J(gy3Var.I())) : new xa1(field, z3, i);
        }
        return ynb.Q(gy3Var) ? new za1(field, q(gy3Var), ynb.J(gy3Var.I())) : new bb1(field, q(gy3Var), z8 ? 1 : 0, b4 == true ? 1 : 0);
    }

    public static final boolean q(gy3 gy3Var) {
        return !w8f.e(gy3Var.I().G().getType());
    }

    public static final Object r(Class cls, Map map, List list) {
        cls.getClass();
        list.getClass();
        ace aceVar = new ace(new j5(3, map));
        Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new s00(cls, map, new ace(new n5(cls, map, false, 2)), aceVar, list));
        objNewProxyInstance.getClass();
        return objNewProxyInstance;
    }

    public static /* synthetic */ Object s(Class cls, Map map) {
        Set setKeySet = map.keySet();
        ArrayList arrayList = new ArrayList(t72.u(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
        }
        return r(cls, map, arrayList);
    }

    public static he1 t(he1... he1VarArr) {
        List listAsList = Arrays.asList(he1VarArr);
        if (listAsList.isEmpty()) {
            return new je1();
        }
        return listAsList.size() == 1 ? (he1) listAsList.get(0) : new ie1(listAsList);
    }

    public static boolean u(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return u(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static ard v(yx9 yx9Var, sx9 sx9Var, ph3 ph3Var, l46 l46Var, int i, int i2) {
        int i3 = 1;
        if ((i2 & 2) != 0) {
            sx9Var = new sx9(1);
        }
        if ((i2 & 4) != 0) {
            ph3Var = yud.a(l46Var);
        }
        hkb hkbVar = qyf.a;
        fxd fxdVarP = b21.P(0.0f, 400.0f, 1, Float.valueOf(1.0f));
        Object obj = (sw3) l46Var.k(zg2.h);
        cv7 cv7Var = (cv7) l46Var.k(zg2.n);
        boolean zG = ((((i & 14) ^ 6) > 4 && l46Var.g(yx9Var)) || (i & 6) == 4) | l46Var.g(ph3Var) | l46Var.g(fxdVarP) | ((((i & 112) ^ 48) > 32 && l46Var.g(sx9Var)) || (i & 48) == 32) | l46Var.g(obj) | l46Var.e(cv7Var.ordinal());
        Object objR = l46Var.R();
        if (zG || objR == sf2.a) {
            Object ardVar = new ard(new um(yx9Var, new s19(yx9Var, cv7Var), sx9Var, i3), ph3Var, fxdVarP);
            l46Var.p0(ardVar);
            objR = ardVar;
        }
        return (ard) objR;
    }

    public static final int w(l46 l46Var) {
        l46Var.getClass();
        return Long.hashCode(l46Var.T);
    }

    public static final long y(l46 l46Var) {
        return l46Var.T;
    }

    public static float z(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return js4.b(edgeEffect);
        }
        return 0.0f;
    }

    public abstract int j(int i, int i2, cv7 cv7Var);
}
