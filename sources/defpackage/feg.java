package defpackage;

import ai.askquin.R;
import ai.askquin.data.QuotaBlockReason;
import ai.askquin.ui.account.component.AuthOption;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.media.ImageWriter;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.Process;
import android.text.Html;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Size;
import android.util.SizeF;
import android.view.Surface;
import androidx.compose.foundation.b;
import androidx.compose.ui.draw.a;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.core.b1;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import tech.chatmind.api.giftcard.GiftCardItem;
import tech.chatmind.api.giftcard.GiftCardSku;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class feg {
    public static final dd2 b;
    public static final dd2 f;
    public static gx6 l;
    public static fz3 m;
    public static final dd2 a = new dd2(new ym0(12), false, 815550621);
    public static final dd2 c = new dd2(new ym0(13), false, 1703646781);
    public static final dd2 d = new dd2(new ym0(14), false, -160570050);
    public static final dd2 e = new dd2(new xd2(1), false, 1263553320);
    public static final Object g = new Object();
    public static final or6 h = new or6();
    public static final StackTraceElement[] i = new StackTraceElement[0];
    public static final float j = 0.38f;
    public static final n82 k = n82.z;

    static {
        int i2 = 8;
        b = new dd2(new a7(i2), false, 51179042);
        f = new dd2(new de2(i2), false, 439448468);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public static final List A(nya nyaVar, bu3 bu3Var) {
        nyaVar.getClass();
        bu3Var.getClass();
        List listN0 = nyaVar.n0();
        boolean zIsEmpty = listN0.isEmpty();
        ?? arrayList = listN0;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List<Integer> listM0 = nyaVar.m0();
            listM0.getClass();
            arrayList = new ArrayList(t72.u(listM0, 10));
            for (Integer num : listM0) {
                num.getClass();
                arrayList.add(bu3Var.a(num.intValue()));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public static final List B(dza dzaVar, bu3 bu3Var) {
        dzaVar.getClass();
        bu3Var.getClass();
        List listC0 = dzaVar.c0();
        boolean zIsEmpty = listC0.isEmpty();
        ?? arrayList = listC0;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List<Integer> listB0 = dzaVar.b0();
            listB0.getClass();
            arrayList = new ArrayList(t72.u(listB0, 10));
            for (Integer num : listB0) {
                num.getClass();
                arrayList.add(bu3Var.a(num.intValue()));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public static final List C(kza kzaVar, bu3 bu3Var) {
        kzaVar.getClass();
        bu3Var.getClass();
        List listM0 = kzaVar.m0();
        boolean zIsEmpty = listM0.isEmpty();
        ?? arrayList = listM0;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List<Integer> listL0 = kzaVar.l0();
            listL0.getClass();
            arrayList = new ArrayList(t72.u(listL0, 10));
            for (Integer num : listL0) {
                num.getClass();
                arrayList.add(bu3Var.a(num.intValue()));
            }
        }
        return arrayList;
    }

    public static ns D(Surface surface, int i2, y2e y2eVar, Handler handler) {
        ImageWriter imageWriterNewInstance;
        handler.getClass();
        int i3 = Build.VERSION.SDK_INT;
        int i4 = y2eVar.a;
        if (i3 >= 29) {
            imageWriterNewInstance = bp.z(i4, surface);
        } else {
            b1.l("CXCP", "Ignoring format (" + ((Object) y2e.b(i4)) + ") for " + ((Object) ("Input-" + i2)) + ". Android " + i3 + " does not support creating ImageWriters with formats. This may lead to unexpected behaviors.");
            imageWriterNewInstance = ImageWriter.newInstance(surface, 1);
            imageWriterNewInstance.getClass();
        }
        ns nsVar = new ns(imageWriterNewInstance, i2);
        imageWriterNewInstance.setOnImageReleasedListener(nsVar, handler);
        return nsVar;
    }

    public static final vza E(xza xzaVar, bu3 bu3Var) {
        bu3Var.getClass();
        if (xzaVar.U()) {
            vza vzaVarM = xzaVar.M();
            vzaVarM.getClass();
            return vzaVarM;
        }
        if (xzaVar.V()) {
            return bu3Var.a(xzaVar.N());
        }
        qc0.p("No expandedType in ProtoBuf.TypeAlias");
        return null;
    }

    public static final Type F(znb znbVar) {
        Type[] lowerBounds;
        if (znbVar.isSuspend()) {
            Object objH0 = s72.H0(znbVar.h().a());
            ParameterizedType parameterizedType = objH0 instanceof ParameterizedType ? (ParameterizedType) objH0 : null;
            if (pa7.t(parameterizedType != null ? parameterizedType.getRawType() : null, xn2.class)) {
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                actualTypeArguments.getClass();
                Object objY0 = qd0.y0(actualTypeArguments);
                WildcardType wildcardType = objY0 instanceof WildcardType ? (WildcardType) objY0 : null;
                if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                    return (Type) qd0.l0(lowerBounds);
                }
            }
        }
        return null;
    }

    public static final vza G(vza vzaVar, bu3 bu3Var) {
        vzaVar.getClass();
        bu3Var.getClass();
        if (vzaVar.i0()) {
            return vzaVar.V();
        }
        if (vzaVar.j0()) {
            return bu3Var.a(vzaVar.W());
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0334  */
    public static k00 H(String str) {
        ete eteVar;
        int i2;
        String url;
        yp5 w98Var;
        xtd xtdVar;
        ete eteVar2 = null;
        Spanned spannedFromHtml = Html.fromHtml(ub3.i("<ContentHandlerReplacementTag />", str), 63, null, h);
        i00 i00Var = new i00(spannedFromHtml.length());
        i00Var.e(spannedFromHtml);
        Object[] spans = spannedFromHtml.getSpans(0, i00Var.a.length(), Object.class);
        int length = spans.length;
        int i3 = 0;
        while (i3 < length) {
            Object obj = spans[i3];
            long jB = u3c.b(spannedFromHtml.getSpanStart(obj), spannedFromHtml.getSpanEnd(obj));
            int i4 = eue.c;
            int i5 = (int) (jB >> 32);
            int i6 = (int) (jB & 4294967295L);
            if (obj instanceof AbsoluteSizeSpan) {
                eteVar = eteVar2;
                i2 = length;
            } else {
                boolean z = obj instanceof AlignmentSpan;
                ArrayList arrayList = i00Var.c;
                int i7 = 3;
                if (z) {
                    Layout.Alignment alignment = ((AlignmentSpan) obj).getAlignment();
                    int i8 = alignment == null ? -1 : pr6.a[alignment.ordinal()];
                    if (i8 == 1) {
                        i7 = 5;
                    } else if (i8 != 2) {
                        i7 = i8 != 3 ? 0 : 6;
                    }
                    arrayList.add(new h00(i5, i6, 8, new ty9(i7, eteVar2, 510), null));
                } else if (obj instanceof z00) {
                    z00 z00Var = (z00) obj;
                    arrayList.add(new h00(new m4e(z00Var.b), i5, i6, z00Var.a));
                } else if (obj instanceof BackgroundColorSpan) {
                    i00Var.b(new xtd(0L, 0L, null, null, null, null, null, 0L, null, null, null, abg.c(((BackgroundColorSpan) obj).getBackgroundColor()), null, null, 63487), i5, i6);
                } else {
                    if (obj instanceof s51) {
                        long j2 = q51.d;
                        s51 s51Var = (s51) obj;
                        int i9 = s51Var.b;
                        w6c.f(j2);
                        i2 = length;
                        long jR = w6c.r(j2 & 1095216660480L, wue.c(j2) * i9);
                        q51 q51Var = s51Var.a;
                        String str2 = null;
                        int i10 = 8;
                        arrayList.add(new h00(i5, i6, i10, new ty9(0, new ete(jR, jR), 503), str2));
                        arrayList.add(new h00(i5, i6, i10, q51Var, str2));
                    } else {
                        i2 = length;
                        if (obj instanceof ForegroundColorSpan) {
                            i00Var.b(new xtd(abg.c(((ForegroundColorSpan) obj).getForegroundColor()), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), i5, i6);
                        } else if (obj instanceof RelativeSizeSpan) {
                            i00Var.b(new xtd(0L, w6c.r(8589934592L, ((RelativeSizeSpan) obj).getSizeChange()), null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65533), i5, i6);
                        } else if (obj instanceof StrikethroughSpan) {
                            i00Var.b(new xtd(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, mne.d, null, 61439), i5, i6);
                        } else if (obj instanceof StyleSpan) {
                            int style = ((StyleSpan) obj).getStyle();
                            if (style == 1) {
                                xtdVar = new xtd(0L, 0L, ar5.z, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531);
                            } else if (style != 2) {
                                xtdVar = style != 3 ? null : new xtd(0L, 0L, ar5.z, new wq5(1), null, null, null, 0L, null, null, null, 0L, null, null, 65523);
                            } else {
                                xtdVar = new xtd(0L, 0L, null, new wq5(1), null, null, null, 0L, null, null, null, 0L, null, null, 65527);
                            }
                            if (xtdVar != null) {
                                i00Var.b(xtdVar, i5, i6);
                            }
                        } else if (obj instanceof SubscriptSpan) {
                            i00Var.b(new xtd(0L, 0L, null, null, null, null, null, 0L, new ou0(-0.5f), null, null, 0L, null, null, 65279), i5, i6);
                        } else if (obj instanceof SuperscriptSpan) {
                            i00Var.b(new xtd(0L, 0L, null, null, null, null, null, 0L, new ou0(0.5f), null, null, 0L, null, null, 65279), i5, i6);
                        } else if (obj instanceof TypefaceSpan) {
                            TypefaceSpan typefaceSpan = (TypefaceSpan) obj;
                            String family = typefaceSpan.getFamily();
                            if (pa7.t(family, "cursive")) {
                                w98Var = yp5.e;
                            } else if (pa7.t(family, "monospace")) {
                                w98Var = yp5.d;
                            } else if (pa7.t(family, "sans-serif")) {
                                w98Var = yp5.b;
                            } else if (pa7.t(family, "serif")) {
                                w98Var = yp5.c;
                            } else {
                                String family2 = typefaceSpan.getFamily();
                                if (family2 == null || family2.length() == 0) {
                                    w98Var = null;
                                } else {
                                    Typeface typefaceCreate = Typeface.create(family2, 0);
                                    Typeface typeface = Typeface.DEFAULT;
                                    if (pa7.t(typefaceCreate, typeface) || pa7.t(typefaceCreate, Typeface.create(typeface, 0))) {
                                        typefaceCreate = null;
                                    }
                                    if (typefaceCreate != null) {
                                        w98Var = new w98(new kb6(4, typefaceCreate));
                                    } else {
                                        w98Var = null;
                                    }
                                }
                            }
                            i00Var.b(new xtd(0L, 0L, null, null, null, w98Var, null, 0L, null, null, null, 0L, null, null, 65503), i5, i6);
                        } else if (obj instanceof UnderlineSpan) {
                            i00Var.b(new xtd(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, mne.c, null, 61439), i5, i6);
                        } else if ((obj instanceof URLSpan) && (url = ((URLSpan) obj).getURL()) != null) {
                            eteVar = null;
                            i00Var.a(new k68(url, null), i5, i6);
                        }
                    }
                    eteVar = null;
                }
                eteVar = eteVar2;
                i2 = length;
            }
            i3++;
            eteVar2 = eteVar;
            length = i2;
        }
        return i00Var.l();
    }

    public static final List I() {
        AuthOption authOption = AuthOption.Google;
        Map map = y41.p;
        if (map == null) {
            pa7.g0("supportedLoginEntriesInitInitializers");
            throw null;
        }
        if (!map.containsKey(authOption.getLoginWay())) {
            authOption = null;
        }
        AuthOption authOption2 = AuthOption.OneLogin;
        Map map2 = y41.p;
        if (map2 == null) {
            pa7.g0("supportedLoginEntriesInitInitializers");
            throw null;
        }
        if (!map2.containsKey(authOption2.getLoginWay())) {
            authOption2 = null;
        }
        AuthOption authOption3 = AuthOption.WeChat;
        Map map3 = y41.p;
        if (map3 == null) {
            pa7.g0("supportedLoginEntriesInitInitializers");
            throw null;
        }
        if (!map3.containsKey(authOption3.getLoginWay())) {
            authOption3 = null;
        }
        AuthOption authOption4 = AuthOption.Email;
        AuthOption authOption5 = AuthOption.Phone;
        ca2.a.getClass();
        return qd0.k0(new AuthOption[]{authOption, authOption2, authOption3, authOption4, ca2.c ? null : authOption5});
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    public static cob J(m0b m0bVar, boolean z, boolean z2, Boolean bool, boolean z3, g5b g5bVar, fv8 fv8Var) {
        yk7 yk7Var;
        cob cobVar;
        k0b k0bVar;
        mya myaVar;
        m0bVar.getClass();
        ntd ntdVar = m0bVar.c;
        fv8Var.getClass();
        mya myaVar2 = mya.INTERFACE;
        if (z) {
            if (bool == null) {
                oo3.g(41, m0bVar, "isConst should not be null for property (container=");
                return null;
            }
            if (m0bVar instanceof k0b) {
                k0b k0bVar2 = (k0b) m0bVar;
                if (k0bVar2.g == myaVar2) {
                    return abg.w(g5bVar, k0bVar2.f.d(t99.e("DefaultImpls")), fv8Var);
                }
            }
            if (bool.booleanValue() && (m0bVar instanceof l0b)) {
                yk7 yk7Var2 = ntdVar instanceof yk7 ? (yk7) ntdVar : null;
                gk7 gk7Var = yk7Var2 != null ? yk7Var2.b : null;
                if (gk7Var != null) {
                    String str = gk7Var.a;
                    if (str == null) {
                        gk7.a(10);
                        throw null;
                    }
                    String strReplace = str.replace('/', '.');
                    strReplace.getClass();
                    dx5 dx5Var = new dx5(strReplace);
                    dx5 dx5VarB = dx5Var.b();
                    t99 t99VarG = dx5Var.a.g();
                    dx5 dx5Var2 = dx5.c;
                    ex5 ex5Var = cn1.V(t99VarG).a;
                    ex5Var.c();
                    String strZ = c5e.z(ex5Var.a, '.', '$');
                    if (!dx5VarB.a.c()) {
                        strZ = dx5VarB + '.' + strZ;
                    }
                    ssg ssgVarP = g5bVar.p(strZ);
                    if (ssgVarP != null) {
                        return (cob) ssgVarP.b;
                    }
                    return null;
                }
            }
        }
        if (z2 && (m0bVar instanceof k0b)) {
            k0b k0bVar3 = (k0b) m0bVar;
            if (k0bVar3.g == mya.COMPANION_OBJECT && (k0bVar = k0bVar3.e) != null && ((myaVar = k0bVar.g) == mya.CLASS || myaVar == mya.ENUM_CLASS || (z3 && (myaVar == myaVar2 || myaVar == mya.ANNOTATION_CLASS)))) {
                ntd ntdVar2 = k0bVar.c;
                ls7 ls7Var = ntdVar2 instanceof ls7 ? (ls7) ntdVar2 : null;
                if (ls7Var != null) {
                    return ls7Var.a;
                }
            } else if (m0bVar instanceof l0b) {
                yk7Var = (yk7) ntdVar;
                cobVar = yk7Var.c;
                if (cobVar == null) {
                    return abg.w(g5bVar, yk7Var.a(), fv8Var);
                }
                return cobVar;
            }
        } else if ((m0bVar instanceof l0b) && (ntdVar instanceof yk7)) {
            yk7Var = (yk7) ntdVar;
            cobVar = yk7Var.c;
            if (cobVar == null) {
                return abg.w(g5bVar, yk7Var.a(), fv8Var);
            }
            return cobVar;
        }
        return null;
    }

    public static final String K(AuthOption authOption) {
        authOption.getClass();
        int i2 = tl0.a[authOption.ordinal()];
        if (i2 == 1 || i2 == 2) {
            return "sms";
        }
        String lowerCase = authOption.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }

    public static final vza L(nya nyaVar, bu3 bu3Var) {
        nyaVar.getClass();
        bu3Var.getClass();
        if (nyaVar.J0()) {
            return nyaVar.t0();
        }
        if (nyaVar.K0()) {
            return bu3Var.a(nyaVar.u0());
        }
        return null;
    }

    public static final vza M(vza vzaVar, bu3 bu3Var) {
        vzaVar.getClass();
        bu3Var.getClass();
        if (vzaVar.l0()) {
            return vzaVar.Y();
        }
        if (vzaVar.m0()) {
            return bu3Var.a(vzaVar.Z());
        }
        return null;
    }

    public static final fz3 N(znb znbVar, String str) {
        str.getClass();
        fz3 fz3VarO = sqf.o(str);
        ArrayList arrayList = (ArrayList) fz3VarO.c;
        boolean zT = pa7.t(s72.H0(arrayList), "Lkotlin/jvm/internal/DefaultConstructorMarker;");
        int size = mh3.J(znbVar).size() + (zT ? 1 : 0);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(s72.c1(arrayList, arrayList.size() - size));
        for (iy9 iy9Var : s72.r1(mh3.J(znbVar), s72.d1(size, arrayList))) {
            aob aobVar = (aob) iy9Var.a();
            String str2 = (String) iy9Var.b();
            aobVar.getClass();
            if (aobVar.f() && sqf.i(aobVar.u())) {
                Iterator it = fyc.q(fyc.u(qqf.b, aobVar.u()), 1).iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (sqf.k((yn7) it.next())) {
                            linkedHashSet.add(Integer.valueOf(arrayList2.size()));
                            um7 um7VarB = aobVar.u().B();
                            um7VarB.getClass();
                            StringBuilder sb = new StringBuilder("L");
                            String strReplace = ((nm7) ((em7) um7VarB)).b.getName().replace('.', '/');
                            strReplace.getClass();
                            sb.append(strReplace);
                            sb.append(';');
                            arrayList2.add(sb.toString());
                            break;
                        }
                    }
                }
            }
            arrayList2.add(str2);
        }
        if (zT) {
            arrayList2.add("Lkotlin/jvm/internal/DefaultConstructorMarker;");
        }
        return linkedHashSet.isEmpty() ? new fz3(str, xu4.a) : new fz3(s72.D0(arrayList2, "", "(", ")", null, 56).concat((String) fz3VarO.b), linkedHashSet);
    }

    public static cgg O(Metadata metadata) {
        String string;
        if (metadata.mv().length == 0) {
            qc0.j("Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.");
            return null;
        }
        fv8 fv8Var = new fv8(metadata.mv(), (metadata.xi() & 8) != 0);
        boolean zA = fv8Var.a(1, 1, 0);
        if (!zA) {
            if (zA) {
                StringBuilder sb = new StringBuilder("while maximum supported version is ");
                sb.append(fv8Var.f ? fv8.g : fv8.h);
                sb.append(". To support newer versions, update the kotlin-metadata-jvm library.");
                string = sb.toString();
            } else {
                string = "while minimum supported version is 1.1.0 (Kotlin 1.0).";
            }
            s8f.k("Provided Metadata instance has version ", fv8Var, ", ", string);
            return null;
        }
        try {
            int iK = metadata.k();
            if (iK == 1) {
                return new as7(metadata);
            }
            if (iK == 2) {
                return new bs7(metadata);
            }
            if (iK == 3) {
                return new es7(metadata);
            }
            if (iK != 4) {
                if (iK == 5) {
                    return new ds7(metadata);
                }
                es7 es7Var = new es7();
                new uk7(metadata.mv());
                metadata.xi();
                return es7Var;
            }
            List listR = qd0.R(metadata.d1());
            new uk7(metadata.mv());
            metadata.xi();
            cs7 cs7Var = new cs7();
            cs7Var.s = listR;
            return cs7Var;
        } catch (Throwable th) {
            if ((th instanceof IllegalArgumentException) || (th instanceof VirtualMachineError) || (th instanceof ThreadDeath)) {
                throw th;
            }
            throw new e17("Exception occurred when reading Kotlin metadata", th);
        }
    }

    public static final vza P(dza dzaVar, bu3 bu3Var) {
        dzaVar.getClass();
        bu3Var.getClass();
        if (dzaVar.u0()) {
            return dzaVar.i0();
        }
        if (dzaVar.v0()) {
            return bu3Var.a(dzaVar.j0());
        }
        return null;
    }

    public static final vza Q(kza kzaVar, bu3 bu3Var) {
        kzaVar.getClass();
        bu3Var.getClass();
        if (kzaVar.K0()) {
            return kzaVar.v0();
        }
        if (kzaVar.L0()) {
            return bu3Var.a(kzaVar.w0());
        }
        return null;
    }

    public static final vza R(dza dzaVar, bu3 bu3Var) {
        dzaVar.getClass();
        bu3Var.getClass();
        if (dzaVar.w0()) {
            vza vzaVarK0 = dzaVar.k0();
            vzaVarK0.getClass();
            return vzaVarK0;
        }
        if (dzaVar.x0()) {
            return bu3Var.a(dzaVar.l0());
        }
        qc0.p("No returnType in ProtoBuf.Function");
        return null;
    }

    public static final vza S(kza kzaVar, bu3 bu3Var) {
        kzaVar.getClass();
        bu3Var.getClass();
        if (kzaVar.M0()) {
            vza vzaVarX0 = kzaVar.x0();
            vzaVarX0.getClass();
            return vzaVarX0;
        }
        if (kzaVar.N0()) {
            return bu3Var.a(kzaVar.y0());
        }
        qc0.p("No returnType in ProtoBuf.Property");
        return null;
    }

    public static final void T(float[] fArr) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        fArr[0] = 0.213f;
        fArr[1] = 0.715f;
        fArr[2] = 0.072f;
        fArr[5] = 0.213f;
        fArr[6] = 0.715f;
        fArr[7] = 0.072f;
        fArr[10] = 0.213f;
        fArr[11] = 0.715f;
        fArr[12] = 0.072f;
    }

    public static final xt7 U(xt7 xt7Var, xt7 xt7Var2) {
        bj5 bj5VarR;
        qfc qfcVar = qfc.d;
        tjd tjdVarS = db6.s(xt7Var);
        if (tjdVarS == null && ((bj5VarR = db6.r(xt7Var)) == null || (tjdVarS = db6.u0(bj5VarR)) == null)) {
            tjdVarS = db6.s(xt7Var);
            tjdVarS.getClass();
        }
        if (db6.U(db6.d1(tjdVarS)) != null) {
            return db6.n0(xt7Var) ? qfcVar.L0(xt7Var2) : xt7Var2;
        }
        d7f d7fVar = (d7f) s72.X0(db6.K(xt7Var));
        if (o55.a[db6.V(d7fVar).ordinal()] == 1) {
            qfcVar.f();
            throw null;
        }
        jgf jgfVarT = db6.T(qfcVar, d7fVar);
        jgfVarT.getClass();
        xt7 xt7VarU = U(jgfVarT, xt7Var2);
        xt7VarU.getClass();
        if (xt7VarU instanceof tt7) {
            qfcVar.f();
            throw null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(qfcVar);
        sb.append(", ");
        throw new IllegalArgumentException(tec.j(job.a, qfcVar.getClass(), sb).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public static final List V(nya nyaVar, bu3 bu3Var) {
        nyaVar.getClass();
        bu3Var.getClass();
        List listZ0 = nyaVar.z0();
        boolean zIsEmpty = listZ0.isEmpty();
        ?? arrayList = listZ0;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List<Integer> listY0 = nyaVar.y0();
            listY0.getClass();
            arrayList = new ArrayList(t72.u(listY0, 10));
            for (Integer num : listY0) {
                num.getClass();
                arrayList.add(bu3Var.a(num.intValue()));
            }
        }
        return arrayList;
    }

    public static final ma8 W(LocalDate localDate) {
        localDate.getClass();
        return new ma8(localDate);
    }

    public static final vza X(tza tzaVar, bu3 bu3Var) {
        bu3Var.getClass();
        if (tzaVar.s()) {
            return tzaVar.p();
        }
        if (tzaVar.t()) {
            return bu3Var.a(tzaVar.q());
        }
        return null;
    }

    public static final vza Y(d0b d0bVar, bu3 bu3Var) {
        bu3Var.getClass();
        if (d0bVar.Q()) {
            vza vzaVarJ = d0bVar.J();
            vzaVarJ.getClass();
            return vzaVarJ;
        }
        if (d0bVar.R()) {
            return bu3Var.a(d0bVar.K());
        }
        qc0.p("No type in ProtoBuf.ValueParameter");
        return null;
    }

    public static final vza Z(xza xzaVar, bu3 bu3Var) {
        bu3Var.getClass();
        if (xzaVar.Y()) {
            vza vzaVarR = xzaVar.R();
            vzaVarR.getClass();
            return vzaVarR;
        }
        if (xzaVar.Z()) {
            return bu3Var.a(xzaVar.S());
        }
        qc0.p("No underlyingType in ProtoBuf.TypeAlias");
        return null;
    }

    public static final void a(int i2, a26 a26Var, l46 l46Var, j09 j09Var) {
        l46Var.h0(-1706232048);
        int i3 = (l46Var.i(a26Var) ? 32 : 16) | i2;
        int i4 = 0;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            List listI = I();
            Collection collectionH0 = x72.h0(s72.j1(s72.A0(qd0.I0(new AuthOption[]{AuthOption.Email, AuthOption.Phone}), I())));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object obj : (ArrayList) listI) {
                if (!collectionH0.contains(obj)) {
                    linkedHashSet.add(obj);
                }
            }
            b(((i3 << 3) & 896) | 6, a26Var, l46Var, j09Var, s72.j1(linkedHashSet));
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new sl0(i2, i4, a26Var, j09Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public static final List a0(a0b a0bVar, bu3 bu3Var) {
        a0bVar.getClass();
        bu3Var.getClass();
        List listL = a0bVar.L();
        boolean zIsEmpty = listL.isEmpty();
        ?? arrayList = listL;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List<Integer> listK = a0bVar.K();
            listK.getClass();
            arrayList = new ArrayList(t72.u(listK, 10));
            for (Integer num : listK) {
                num.getClass();
                arrayList.add(bu3Var.a(num.intValue()));
            }
        }
        return arrayList;
    }

    public static final void b(int i2, a26 a26Var, l46 l46Var, j09 j09Var, List list) {
        int i3;
        l46Var.h0(-1332077132);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.g(j09Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? l46Var.g(list) : l46Var.i(list) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i4 = 0;
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            int i5 = 6;
            c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(i4)), ndb.Y, l46Var, 6);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09Var);
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
            Iterator itS = kv2.s(l46Var, j09VarJ, hj6.x, -505574189, list);
            int i6 = 0;
            while (itS.hasNext()) {
                Object next = itS.next();
                int i7 = i6 + 1;
                if (i6 < 0) {
                    t72.Z();
                    throw null;
                }
                jgb.D(null, false, null, af1.b0(-1003813885, new w7(a26Var, (AuthOption) next, i5), l46Var), l46Var, 3072);
                i6 = i7;
            }
            l46Var.r(false);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b8(j09Var, list, a26Var, i2, 3);
        }
    }

    public static final vza b0(d0b d0bVar, bu3 bu3Var) {
        bu3Var.getClass();
        if (d0bVar.S()) {
            return d0bVar.L();
        }
        if (d0bVar.T()) {
            return bu3Var.a(d0bVar.M());
        }
        return null;
    }

    public static final x16 c(x16 x16Var, l46 l46Var, int i2) {
        x16Var.getClass();
        Object objR = l46Var.R();
        i8c i8cVar = sf2.a;
        if (objR == i8cVar) {
            objR = q1c.f(Boolean.TRUE);
            l46Var.p0(objR);
        }
        e89 e89Var = (e89) objR;
        boolean z = ((((i2 & 112) ^ 48) > 32 && l46Var.g(x16Var)) || (i2 & 48) == 32) | ((((i2 & 14) ^ 6) > 4 && l46Var.f(500L)) || (i2 & 6) == 4);
        Object objR2 = l46Var.R();
        if (z || objR2 == i8cVar) {
            objR2 = new k8(x16Var, e89Var, 3);
            l46Var.p0(objR2);
        }
        return (x16) objR2;
    }

    public static final void d(int i2, Integer num, x16 x16Var, j09 j09Var, l46 l46Var, int i3) {
        int i4;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-1526867713);
        if ((i3 & 6) == 0) {
            i4 = (l46Var2.e(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= l46Var2.g(num) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= l46Var2.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i3 & 3072) == 0) {
            i4 |= l46Var2.g(j09Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (l46Var2.W(i4 & 1, (i4 & 1171) != 1170)) {
            j09 j09VarB0 = ynb.b0(0.0f, 2.0f, b.c(androidx.compose.foundation.layout.b.f(24.0f, 0.0f, j09Var, 2), false, null, null, x16Var, 15), 1);
            t7c t7cVarA = s7c.a(xc0.e, ndb.z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarB0);
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
            gx6 gx6VarB = an1.O0;
            if (gx6VarB == null) {
                fx6 fx6Var = new fx6("Info", 28.0f, 28.0f, 28.0f, 28.0f, 0L, 0, false, 224);
                dtd dtdVar = new dtd(abg.d(4294967295L));
                s71 s71Var = new s71(1);
                s71Var.p(14.0f, 24.1348f);
                s71Var.i(12.6068f, 24.1348f, 11.2949f, 23.8678f, 10.0645f, 23.334f);
                s71Var.i(8.834f, 22.8066f, 7.75f, 22.0742f, 6.8125f, 21.1367f);
                s71Var.i(5.875f, 20.1992f, 5.1393f, 19.1185f, 4.6055f, 17.8945f);
                s71Var.i(4.0781f, 16.6641f, 3.8145f, 15.349f, 3.8145f, 13.9492f);
                s71Var.i(3.8145f, 12.556f, 4.0781f, 11.2474f, 4.6055f, 10.0234f);
                s71Var.i(5.1393f, 8.793f, 5.8717f, 7.709f, 6.8027f, 6.7715f);
                s71Var.i(7.7402f, 5.834f, 8.8242f, 5.1016f, 10.0547f, 4.5742f);
                s71Var.i(11.2852f, 4.0404f, 12.597f, 3.7734f, 13.9902f, 3.7734f);
                s71Var.i(15.3835f, 3.7734f, 16.6953f, 4.0404f, 17.9258f, 4.5742f);
                s71Var.i(19.1628f, 5.1016f, 20.2467f, 5.834f, 21.1777f, 6.7715f);
                s71Var.i(22.1152f, 7.709f, 22.8509f, 8.793f, 23.3848f, 10.0234f);
                s71Var.i(23.9186f, 11.2474f, 24.1855f, 12.556f, 24.1855f, 13.9492f);
                s71Var.i(24.1855f, 15.349f, 23.9186f, 16.6641f, 23.3848f, 17.8945f);
                s71Var.i(22.8509f, 19.1185f, 22.1152f, 20.1992f, 21.1777f, 21.1367f);
                s71Var.i(20.2467f, 22.0742f, 19.166f, 22.8066f, 17.9355f, 23.334f);
                s71Var.i(16.7051f, 23.8678f, 15.3932f, 24.1348f, 14.0f, 24.1348f);
                s71Var.h();
                s71Var.p(14.0f, 21.8984f);
                s71Var.i(15.1003f, 21.8984f, 16.1289f, 21.6934f, 17.0859f, 21.2832f);
                s71Var.i(18.0495f, 20.873f, 18.8958f, 20.3066f, 19.625f, 19.584f);
                s71Var.i(20.3542f, 18.8548f, 20.9238f, 18.0117f, 21.334f, 17.0547f);
                s71Var.i(21.7441f, 16.0911f, 21.9492f, 15.056f, 21.9492f, 13.9492f);
                s71Var.i(21.9492f, 12.849f, 21.7409f, 11.8203f, 21.3242f, 10.8633f);
                s71Var.i(20.9141f, 9.8997f, 20.3444f, 9.0534f, 19.6152f, 8.3242f);
                s71Var.i(18.8926f, 7.595f, 18.0495f, 7.0254f, 17.0859f, 6.6152f);
                s71Var.i(16.1289f, 6.2051f, 15.097f, 6.0f, 13.9902f, 6.0f);
                s71Var.i(12.89f, 6.0f, 11.8581f, 6.2051f, 10.8945f, 6.6152f);
                s71Var.i(9.9375f, 7.0254f, 9.0944f, 7.595f, 8.3652f, 8.3242f);
                s71Var.i(7.6426f, 9.0534f, 7.0762f, 9.8997f, 6.666f, 10.8633f);
                s71Var.i(6.2624f, 11.8203f, 6.0606f, 12.849f, 6.0606f, 13.9492f);
                s71Var.i(6.0606f, 15.056f, 6.2624f, 16.0911f, 6.666f, 17.0547f);
                s71Var.i(7.0762f, 18.0117f, 7.6458f, 18.8548f, 8.375f, 19.584f);
                s71Var.i(9.1042f, 20.3066f, 9.9473f, 20.873f, 10.9043f, 21.2832f);
                s71Var.i(11.8678f, 21.6934f, 12.8997f, 21.8984f, 14.0f, 21.8984f);
                s71Var.h();
                s71Var.p(12.291f, 19.2422f);
                s71Var.i(12.0632f, 19.2422f, 11.8711f, 19.1706f, 11.7148f, 19.0273f);
                s71Var.i(11.5586f, 18.8776f, 11.4805f, 18.6855f, 11.4805f, 18.4512f);
                s71Var.i(11.4805f, 18.2298f, 11.5586f, 18.0443f, 11.7148f, 17.8945f);
                s71Var.i(11.8711f, 17.7448f, 12.0632f, 17.6699f, 12.291f, 17.6699f);
                s71Var.l(13.4141f);
                s71Var.s(13.8809f);
                s71Var.l(12.4668f);
                s71Var.i(12.2389f, 13.8809f, 12.0469f, 13.8092f, 11.8906f, 13.666f);
                s71Var.i(11.7344f, 13.5163f, 11.6562f, 13.3242f, 11.6562f, 13.0898f);
                s71Var.i(11.6562f, 12.8685f, 11.7344f, 12.6829f, 11.8906f, 12.5332f);
                s71Var.i(12.0469f, 12.3835f, 12.2389f, 12.3086f, 12.4668f, 12.3086f);
                s71Var.l(14.3125f);
                s71Var.i(14.599f, 12.3086f, 14.8171f, 12.403f, 14.9668f, 12.5918f);
                s71Var.i(15.1165f, 12.7741f, 15.1914f, 13.0182f, 15.1914f, 13.3242f);
                s71Var.s(17.6699f);
                s71Var.l(16.1973f);
                s71Var.i(16.4251f, 17.6699f, 16.6172f, 17.7448f, 16.7734f, 17.8945f);
                s71Var.i(16.9297f, 18.0443f, 17.0078f, 18.2298f, 17.0078f, 18.4512f);
                s71Var.i(17.0078f, 18.6855f, 16.9297f, 18.8776f, 16.7734f, 19.0273f);
                s71Var.i(16.6172f, 19.1706f, 16.4251f, 19.2422f, 16.1973f, 19.2422f);
                s71Var.l(12.291f);
                s71Var.h();
                s71Var.p(13.9609f, 10.873f);
                s71Var.i(13.5898f, 10.873f, 13.2708f, 10.7428f, 13.0039f, 10.4824f);
                s71Var.i(12.737f, 10.2155f, 12.6035f, 9.8965f, 12.6035f, 9.5254f);
                s71Var.i(12.6035f, 9.1413f, 12.737f, 8.819f, 13.0039f, 8.5586f);
                s71Var.i(13.2708f, 8.2917f, 13.5898f, 8.1582f, 13.9609f, 8.1582f);
                s71Var.i(14.3385f, 8.1582f, 14.6576f, 8.2917f, 14.918f, 8.5586f);
                s71Var.i(15.1784f, 8.819f, 15.3086f, 9.1413f, 15.3086f, 9.5254f);
                s71Var.i(15.3086f, 9.8965f, 15.1784f, 10.2155f, 14.918f, 10.4824f);
                s71Var.i(14.6576f, 10.7428f, 14.3385f, 10.873f, 13.9609f, 10.873f);
                s71Var.h();
                fx6.a(fx6Var, s71Var.b, dtdVar, 0.88f, 0.0f, 0, 4.0f);
                gx6VarB = fx6Var.b();
                an1.O0 = gx6VarB;
            }
            VectorPainter vectorPainterX = o7c.x(gx6VarB, l46Var2);
            g09 g09Var = g09.a;
            j09 j09VarN = tm7.N(0.0f, 1.0f, androidx.compose.foundation.layout.b.l(g09Var, 14.0f), 1);
            pr4 pr4Var = l8b.a;
            gu6.b(vectorPainterX, null, j09VarN, ((e8b) l46Var2.k(pr4Var)).u, l46Var2, 440, 0);
            o5c.f(l46Var2, androidx.compose.foundation.layout.b.p(g09Var, 4.0f));
            String strQ = afc.q(i2, l46Var2);
            mue mueVar = pue.a;
            nte.b(strQ, null, ((e8b) l46Var2.k(pr4Var)).u, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.a, l46Var, 0, 0, 131066);
            l46Var2 = l46Var;
            if (num != null) {
                l46Var2.f0(1929179467);
                o5c.f(l46Var2, androidx.compose.foundation.layout.b.p(g09Var, 16.0f));
                nte.b(afc.q(num.intValue(), l46Var2), null, ((e8b) l46Var2.k(pr4Var)).u, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.i(l46Var2), l46Var, 0, 0, 131066);
                l46Var2 = l46Var;
                l46Var2.r(false);
            } else {
                l46Var2.f0(1929352447);
                l46Var2.r(false);
            }
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new kr(i2, num, x16Var, j09Var, i3);
        }
    }

    public static final void e(QuotaBlockReason quotaBlockReason, x16 x16Var, x16 x16Var2, j09 j09Var, String str, ep5 ep5Var, sp5 sp5Var, l46 l46Var, int i2) {
        j09 j09Var2;
        int i3;
        int i4;
        quotaBlockReason.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(1268339125);
        int i5 = i2 | (l46Var.e(quotaBlockReason.ordinal()) ? 4 : 2) | (l46Var.i(x16Var) ? 32 : 16) | (l46Var.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.g(str) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.e(ep5Var.ordinal()) ? 131072 : 65536) | (l46Var.e(sp5Var.ordinal()) ? 1048576 : 524288);
        if (l46Var.W(i5 & 1, (599187 & i5) != 599186)) {
            int i6 = hp5.a[quotaBlockReason.ordinal()];
            if (i6 == 1) {
                l46Var.f0(-2030983233);
                j09Var2 = j09Var;
                hfc.a(((i5 >> 12) & 14) | 48, l46Var, j09Var2, str);
                l46Var.r(false);
            } else if (i6 == 2) {
                l46Var.f0(-2030825567);
                int iOrdinal = sp5Var.ordinal();
                if (iOrdinal == 0) {
                    i3 = R.string.follow_up_usage_empty_monthly_notice;
                } else {
                    if (iOrdinal != 1) {
                        ap.c();
                        return;
                    }
                    i3 = R.string.follow_up_usage_empty_weekly_notice;
                }
                j09Var2 = j09Var;
                d(i3, Integer.valueOf(R.string.follow_up_usage_empty_cta), x16Var, j09Var2, l46Var, ((i5 << 3) & 896) | 3072);
                l46Var.r(false);
            } else if (i6 != 3) {
                l46Var.f0(-896780423);
                l46Var.r(false);
                j09Var2 = j09Var;
            } else {
                l46Var.f0(-2030577288);
                int iOrdinal2 = ep5Var.ordinal();
                if (iOrdinal2 == 0) {
                    i4 = R.string.follow_up_no_permission_upgrade_notice;
                } else {
                    if (iOrdinal2 != 1) {
                        ap.c();
                        return;
                    }
                    i4 = R.string.follow_up_no_permission_renew_notice;
                }
                j09Var2 = j09Var;
                d(i4, null, x16Var2, j09Var2, l46Var, (i5 & 896) | 3120);
                l46Var.r(false);
            }
        } else {
            j09Var2 = j09Var;
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ug(quotaBlockReason, x16Var, x16Var2, j09Var2, str, ep5Var, sp5Var, i2);
        }
    }

    public static final void f(int i2, l46 l46Var, j09 j09Var, String str) {
        boolean z;
        l46 l46Var2 = l46Var;
        l46Var2.h0(1840901767);
        int i3 = i2 | (l46Var2.g(str) ? 4 : 2);
        int i4 = 0;
        if (l46Var2.W(i3 & 1, (i3 & 19) != 18)) {
            uc0 uc0Var = new uc0(16.0f, true, new qc0(i4));
            kx0 kx0Var = ndb.z;
            t7c t7cVarA = s7c.a(uc0Var, kx0Var, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var, j09Var);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z2 = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z2) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var2, t7cVarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            g09 g09Var = g09.a;
            h7d.h(6, 0, l46Var2, androidx.compose.foundation.layout.b.d(g09Var, 36.0f));
            String str2 = null;
            if (str != null && !v4e.Q(str)) {
                str2 = str;
            }
            if (str2 == null) {
                l46Var2.f0(-2030574007);
                l46Var2.r(false);
                z = true;
            } else {
                l46Var2.f0(-2030574006);
                if (1.0f <= 0.0d) {
                    g37.a("invalid weight; must be greater than zero");
                }
                jw7 jw7Var = new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                t7c t7cVarA2 = s7c.a(new uc0(8.0f, true, new qc0(0)), kx0Var, l46Var2, 54);
                int iHashCode2 = Long.hashCode(l46Var2.T);
                u8a u8aVarM2 = l46Var2.m();
                j09 j09VarJ2 = m93.J(l46Var2, jw7Var);
                l46Var2.j0();
                if (l46Var2.S) {
                    l46Var2.l(ov7Var);
                } else {
                    l46Var2.s0();
                }
                dec.l(he2Var, l46Var2, t7cVarA2);
                dec.l(he2Var2, l46Var2, u8aVarM2);
                ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                dec.l(he2Var4, l46Var2, j09VarJ2);
                String strQ = afc.q(R.string.gift_card_share_image_qr_hint, l46Var2);
                long j2 = sa6.a;
                mue mueVar = pue.a;
                mue mueVarJ = pue.j(l46Var2);
                if (1.0f <= 0.0d) {
                    g37.a("invalid weight; must be greater than zero");
                }
                nte.b(strQ, new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), j2, 0L, null, null, 0L, null, new jme(6), 0L, 0, false, 0, 0, null, mueVarJ, l46Var, 384, 0, 130040);
                l46Var2 = l46Var;
                x76.d(48, l46Var2, g09Var, str2);
                z = true;
                l46Var2.r(true);
                l46Var2.r(false);
            }
            l46Var2.r(z);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new p8(str, j09Var, i2, 7);
        }
    }

    public static final void g(GiftCardItem giftCardItem, long j2, j09 j09Var, l46 l46Var, int i2) {
        int i3;
        GiftCardItem giftCardItem2;
        l46 l46Var2 = l46Var;
        y02 y02Var = g21.f;
        l46Var2.h0(-1073752174);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? l46Var2.g(giftCardItem) : l46Var2.i(giftCardItem) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var2.f(j2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var2.g(y02Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i3 |= l46Var2.g(j09Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (l46Var2.W(i3 & 1, (i3 & 1171) != 1170)) {
            ii6 ii6VarB0 = g21.b0(l46Var2);
            j09 j09VarA = androidx.compose.ui.platform.b.a(oa7.E(j09Var, y02Var), "gift_card_share_image");
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarA);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
                l46Var2.l(ov7Var);
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
            fy9 fy9VarA = od4.A(x76.g(giftCardItem.getSku()).a, 0, l46Var2);
            d31 d31Var = d31.a;
            g09 g09Var = g09.a;
            j(fy9VarA, null, g21.P(d31Var.b(g09Var), ii6VarB0), null, an2.a, 0.0f, null, l46Var2, 24632, 104);
            s21.a(z7f.J(d31Var.b(g09Var), ii6VarB0, new ji6(sa6.b, 24, y72.j), null, 4), l46Var2, 0);
            s21.a(tm7.o(d31Var.b(g09Var), j2, y02Var), l46Var2, 0);
            j09 j09VarD0 = ynb.d0(0.0f, sa6.e, 0.0f, 0.0f, 13, ynb.a0(androidx.compose.foundation.layout.b.c(g09Var, 1.0f), sa6.c, sa6.d));
            int i4 = 1;
            c92 c92VarA = a92.a(new uc0(sa6.f, true, new qc0(0)), ndb.Z, l46Var2, 54);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarD0);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, c92VarA);
            dec.l(he2Var2, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ2);
            String strQ = afc.q(R.string.gift_card_share_image_title, l46Var2);
            long j3 = y72.e;
            mue mueVar = pue.a;
            nte.b(strQ, androidx.compose.ui.platform.b.a(androidx.compose.foundation.layout.b.c(g09Var, 1.0f), "gift_card_share_title"), j3, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mue.a(pue.n(l46Var2), 0L, 0L, null, cr5.c, 0L, null, 0, 0L, null, null, 16777183), l46Var, 432, 0, 130040);
            l46Var2 = l46Var;
            giftCardItem2 = giftCardItem;
            g21.s(361.0f, af1.b0(-314077122, new la6(giftCardItem2, i4), l46Var2), l46Var2, 54);
            f(48, l46Var2, androidx.compose.ui.platform.b.a(androidx.compose.foundation.layout.b.c(g09Var, 1.0f), "gift_card_share_footer"), giftCardItem2.getShareUrl());
            l46Var2.r(true);
            l46Var2.r(true);
        } else {
            giftCardItem2 = giftCardItem;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new xb(giftCardItem2, j2, j09Var, i2);
        }
    }

    public static final void h(GiftCardItem giftCardItem, a26 a26Var, j09 j09Var, l46 l46Var, int i2) {
        int i3;
        j09 j09Var2;
        boolean z;
        e89 e89Var;
        l46Var.h0(-1191341342);
        if ((i2 & 6) == 0) {
            i3 = i2 | ((i2 & 8) == 0 ? l46Var.g(giftCardItem) : l46Var.i(giftCardItem) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.i(a26Var) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if (l46Var.W(i4 & 1, (i4 & 147) != 146)) {
            boolean zBooleanValue = ((Boolean) l46Var.k(sad.b)).booleanValue();
            GiftCardSku sku = giftCardItem.getSku();
            Resources resources = ((Context) l46Var.k(uq.b)).getResources();
            int i5 = x76.g(sku).a;
            boolean zBooleanValue2 = ((Boolean) l46Var.k(h57.a)).booleanValue();
            boolean zE = l46Var.e(sku.ordinal());
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (zE || objR == i8cVar) {
                float[] fArr = new float[3];
                z = false;
                Color.colorToHSV(abg.Z(vpf.N(sku).c), fArr);
                objR = Float.valueOf(fArr[0]);
                l46Var.p0(objR);
            } else {
                z = false;
            }
            float fFloatValue = ((Number) objR).floatValue();
            boolean zG = l46Var.g(resources) | l46Var.e(i5) | l46Var.h(zBooleanValue2);
            Object objR2 = l46Var.R();
            if (zG || objR2 == i8cVar) {
                Object objValueOf = (Float) ra6.a.get(Integer.valueOf(i5));
                if (objValueOf == null) {
                    if (zBooleanValue2) {
                        resources.getClass();
                        Float fB = ra6.b(resources, i5);
                        objValueOf = Float.valueOf(fB != null ? fB.floatValue() : fFloatValue);
                    } else {
                        objValueOf = null;
                    }
                }
                objR2 = objValueOf;
                l46Var.p0(objR2);
            }
            Float f2 = (Float) objR2;
            boolean zE2 = l46Var.e(i5);
            Object objR3 = l46Var.R();
            if (zE2 || objR3 == i8cVar) {
                objR3 = q1c.f(f2);
                l46Var.p0(objR3);
            }
            e89 e89Var2 = (e89) objR3;
            Integer numValueOf = Integer.valueOf(i5);
            boolean zG2 = l46Var.g(e89Var2) | l46Var.i(resources) | l46Var.e(i5) | l46Var.d(fFloatValue);
            Object objR4 = l46Var.R();
            if (zG2 || objR4 == i8cVar) {
                e89Var = e89Var2;
                Object fb6Var = new fb6(fFloatValue, e89Var, resources, i5, null);
                l46Var.p0(fb6Var);
                objR4 = fb6Var;
            } else {
                e89Var = e89Var2;
            }
            af1.p(resources, numValueOf, (l26) objR4, l46Var);
            Float f3 = (Float) e89Var.getValue();
            if (f3 != null) {
                fFloatValue = f3.floatValue();
            }
            int i6 = y72.l;
            long jF = gec.F(fFloatValue, 0.45f, 0.275f, 0.9f, 16);
            boolean z2 = ((Float) e89Var.getValue()) != null ? true : z;
            g09 g09Var = g09.a;
            j09 j09VarC = androidx.compose.foundation.layout.b.c(g09Var, 1.0f);
            boolean zS = g21.S(l46Var);
            boolean z3 = (zBooleanValue && z2) ? true : z;
            if ((i4 & 112) == 32) {
                z = true;
            }
            Object objR5 = l46Var.R();
            if (z || objR5 == i8cVar) {
                objR5 = new k50(a26Var, 8);
                l46Var.p0(objR5);
            }
            g(giftCardItem, jF, dj6.z(16, (l26) objR5, j09VarC, giftCardItem, "gift_card", zS, z3, true), l46Var, GiftCardItem.$stable | 384 | (i4 & 14));
            j09Var2 = g09Var;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b8(i2, giftCardItem, a26Var, j09Var2, 23);
        }
    }

    public static final void i(GiftCardItem giftCardItem, x16 x16Var, l46 l46Var, int i2) {
        int i3;
        x16Var.getClass();
        l46Var.h0(153473370);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? l46Var.g(giftCardItem) : l46Var.i(giftCardItem) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.i(x16Var) ? 32 : 16;
        }
        int i4 = 1;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = v2c.s(xad.GiftCard, "gift_card");
                l46Var.p0(objR);
            }
            x6d x6dVar = (x6d) objR;
            t4c.e(androidx.compose.ui.platform.b.a(g09.a, "gift_card_unified_share"), "", x6dVar, new y43(x6dVar, i4), x16Var, af1.b0(826391837, new wt(5, giftCardItem), l46Var), l46Var, 197174 | ((i3 << 9) & 57344), 0);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new gc(giftCardItem, x16Var, i2, 25);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0119  */
    /* JADX WARN: Code duplicated, block: B:102:0x011b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0122 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:106:0x0124  */
    /* JADX WARN: Code duplicated, block: B:108:0x0138  */
    /* JADX WARN: Code duplicated, block: B:111:0x015b  */
    /* JADX WARN: Code duplicated, block: B:114:0x017c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0182  */
    /* JADX WARN: Code duplicated, block: B:117:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:120:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0056  */
    /* JADX WARN: Code duplicated, block: B:35:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0071  */
    /* JADX WARN: Code duplicated, block: B:46:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x007a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:55:0x008e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x0095  */
    /* JADX WARN: Code duplicated, block: B:61:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:84:0x00de  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:89:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:95:0x0100  */
    /* JADX WARN: Code duplicated, block: B:96:0x0107  */
    /* JADX WARN: Code duplicated, block: B:99:0x010d  */
    public static final void j(fy9 fy9Var, String str, j09 j09Var, yi yiVar, bn2 bn2Var, float f2, c82 c82Var, l46 l46Var, int i2, int i3) {
        int i4;
        j09 j09Var2;
        int i5;
        int i6;
        int i7;
        bn2 bn2Var2;
        int i8;
        int i9;
        float f3;
        int i10;
        int i11;
        c82 c82Var2;
        int i12;
        int i13;
        boolean z;
        j09 j09Var3;
        bn2 bn2Var3;
        float f4;
        c82 c82Var3;
        yi yiVar2;
        ojb ojbVarV;
        j09 j09VarB;
        j09 j09Var4;
        yi yiVar3;
        bn2 bn2Var4;
        float f5;
        c82 c82Var4;
        i8c i8cVar;
        Object objR;
        boolean z2;
        Object objR2;
        l46Var.h0(1142754848);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? l46Var.g(fy9Var) : l46Var.i(fy9Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= l46Var.g(str) ? 32 : 16;
        }
        int i14 = i3 & 4;
        if (i14 == 0) {
            if ((i2 & 384) == 0) {
                j09Var2 = j09Var;
                i4 |= l46Var.g(j09Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 3072) == 0) {
                    if (l46Var.g(yiVar)) {
                        i6 = 2048;
                    } else {
                        i6 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 16;
                if (i7 != 0) {
                    if ((i2 & 24576) == 0) {
                        bn2Var2 = bn2Var;
                        if (l46Var.g(bn2Var2)) {
                            i8 = 16384;
                        } else {
                            i8 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        i4 |= i8;
                    }
                    i9 = i3 & 32;
                    if (i9 != 0) {
                        if ((196608 & i2) == 0) {
                            f3 = f2;
                            if (l46Var.d(f3)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                            i4 |= i10;
                        }
                        i11 = i3 & 64;
                        if (i11 != 0) {
                            if ((1572864 & i2) == 0) {
                                c82Var2 = c82Var;
                                if (l46Var.g(c82Var2)) {
                                    i12 = 1048576;
                                } else {
                                    i12 = 524288;
                                }
                                i4 |= i12;
                            }
                            i13 = i4;
                            if ((i4 & 599187) != 599186) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (l46Var.W(i13 & 1, z)) {
                                j09VarB = g09.a;
                                if (i14 != 0) {
                                    j09Var4 = j09VarB;
                                } else {
                                    j09Var4 = j09Var2;
                                }
                                if (i5 != 0) {
                                    yiVar3 = ndb.f;
                                } else {
                                    yiVar3 = yiVar;
                                }
                                if (i7 != 0) {
                                    bn2Var4 = an2.b;
                                } else {
                                    bn2Var4 = bn2Var2;
                                }
                                if (i9 != 0) {
                                    f5 = 1.0f;
                                } else {
                                    f5 = f3;
                                }
                                if (i11 != 0) {
                                    c82Var4 = null;
                                } else {
                                    c82Var4 = c82Var2;
                                }
                                i8cVar = sf2.a;
                                if (str != null) {
                                    l46Var.f0(1899222916);
                                    if ((i13 & 112) == 32) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    objR2 = l46Var.R();
                                    if (z2 || objR2 == i8cVar) {
                                        objR2 = new bt5(str, 8);
                                        l46Var.p0(objR2);
                                    }
                                    j09VarB = vwc.b(j09VarB, false, (a26) objR2);
                                    l46Var.r(false);
                                } else {
                                    l46Var.f0(1899381698);
                                    l46Var.r(false);
                                }
                                yi yiVar4 = yiVar3;
                                j09 j09Var5 = j09Var4;
                                j09 j09VarA = a.a(oa7.F(j09Var4.D(j09VarB)), fy9Var, yiVar4, bn2Var4, f5, c82Var4, 2);
                                objR = l46Var.R();
                                if (objR == i8cVar) {
                                    objR = mr.i;
                                    l46Var.p0(objR);
                                }
                                xn8 xn8Var = (xn8) objR;
                                int iHashCode = Long.hashCode(l46Var.T);
                                j09 j09VarJ = m93.J(l46Var, j09VarA);
                                u8a u8aVarM = l46Var.m();
                                lf2.q.getClass();
                                l46Var.j0();
                                if (l46Var.S) {
                                    l46Var.l(LayoutNode.h1);
                                } else {
                                    l46Var.s0();
                                }
                                dec.l(hj6.z, l46Var, xn8Var);
                                dec.l(hj6.y, l46Var, u8aVarM);
                                dec.k(l46Var);
                                dec.l(hj6.x, l46Var, j09VarJ);
                                dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                                l46Var.r(true);
                                f4 = f5;
                                c82Var3 = c82Var4;
                                yiVar2 = yiVar4;
                                bn2Var3 = bn2Var4;
                                j09Var3 = j09Var5;
                            } else {
                                l46Var.Z();
                                j09Var3 = j09Var2;
                                bn2Var3 = bn2Var2;
                                f4 = f3;
                                c82Var3 = c82Var2;
                                yiVar2 = yiVar;
                            }
                            ojbVarV = l46Var.v();
                            if (ojbVarV != null) {
                                ojbVarV.d = new t70(fy9Var, str, j09Var3, yiVar2, bn2Var3, f4, c82Var3, i2, i3);
                            }
                        }
                        i4 |= 1572864;
                        c82Var2 = c82Var;
                        i13 = i4;
                        if ((i4 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (l46Var.W(i13 & 1, z)) {
                            j09VarB = g09.a;
                            if (i14 != 0) {
                                j09Var4 = j09VarB;
                            } else {
                                j09Var4 = j09Var2;
                            }
                            if (i5 != 0) {
                                yiVar3 = ndb.f;
                            } else {
                                yiVar3 = yiVar;
                            }
                            if (i7 != 0) {
                                bn2Var4 = an2.b;
                            } else {
                                bn2Var4 = bn2Var2;
                            }
                            if (i9 != 0) {
                                f5 = 1.0f;
                            } else {
                                f5 = f3;
                            }
                            if (i11 != 0) {
                                c82Var4 = null;
                            } else {
                                c82Var4 = c82Var2;
                            }
                            i8cVar = sf2.a;
                            if (str != null) {
                                l46Var.f0(1899222916);
                                if ((i13 & 112) == 32) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                objR2 = l46Var.R();
                                if (z2) {
                                    objR2 = new bt5(str, 8);
                                    l46Var.p0(objR2);
                                } else {
                                    objR2 = new bt5(str, 8);
                                    l46Var.p0(objR2);
                                }
                                j09VarB = vwc.b(j09VarB, false, (a26) objR2);
                                l46Var.r(false);
                            } else {
                                l46Var.f0(1899381698);
                                l46Var.r(false);
                            }
                            yi yiVar5 = yiVar3;
                            j09 j09Var6 = j09Var4;
                            j09 j09VarA2 = a.a(oa7.F(j09Var4.D(j09VarB)), fy9Var, yiVar5, bn2Var4, f5, c82Var4, 2);
                            objR = l46Var.R();
                            if (objR == i8cVar) {
                                objR = mr.i;
                                l46Var.p0(objR);
                            }
                            xn8 xn8Var2 = (xn8) objR;
                            int iHashCode2 = Long.hashCode(l46Var.T);
                            j09 j09VarJ2 = m93.J(l46Var, j09VarA2);
                            u8a u8aVarM2 = l46Var.m();
                            lf2.q.getClass();
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(LayoutNode.h1);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(hj6.z, l46Var, xn8Var2);
                            dec.l(hj6.y, l46Var, u8aVarM2);
                            dec.k(l46Var);
                            dec.l(hj6.x, l46Var, j09VarJ2);
                            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode2));
                            l46Var.r(true);
                            f4 = f5;
                            c82Var3 = c82Var4;
                            yiVar2 = yiVar5;
                            bn2Var3 = bn2Var4;
                            j09Var3 = j09Var6;
                        } else {
                            l46Var.Z();
                            j09Var3 = j09Var2;
                            bn2Var3 = bn2Var2;
                            f4 = f3;
                            c82Var3 = c82Var2;
                            yiVar2 = yiVar;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new t70(fy9Var, str, j09Var3, yiVar2, bn2Var3, f4, c82Var3, i2, i3);
                        }
                    }
                    i4 |= 196608;
                    f3 = f2;
                    i11 = i3 & 64;
                    if (i11 != 0) {
                        if ((1572864 & i2) == 0) {
                            c82Var2 = c82Var;
                            if (l46Var.g(c82Var2)) {
                                i12 = 1048576;
                            } else {
                                i12 = 524288;
                            }
                            i4 |= i12;
                        }
                        i13 = i4;
                        if ((i4 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (l46Var.W(i13 & 1, z)) {
                            j09VarB = g09.a;
                            if (i14 != 0) {
                                j09Var4 = j09VarB;
                            } else {
                                j09Var4 = j09Var2;
                            }
                            if (i5 != 0) {
                                yiVar3 = ndb.f;
                            } else {
                                yiVar3 = yiVar;
                            }
                            if (i7 != 0) {
                                bn2Var4 = an2.b;
                            } else {
                                bn2Var4 = bn2Var2;
                            }
                            if (i9 != 0) {
                                f5 = 1.0f;
                            } else {
                                f5 = f3;
                            }
                            if (i11 != 0) {
                                c82Var4 = null;
                            } else {
                                c82Var4 = c82Var2;
                            }
                            i8cVar = sf2.a;
                            if (str != null) {
                                l46Var.f0(1899222916);
                                if ((i13 & 112) == 32) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                objR2 = l46Var.R();
                                if (z2) {
                                    objR2 = new bt5(str, 8);
                                    l46Var.p0(objR2);
                                } else {
                                    objR2 = new bt5(str, 8);
                                    l46Var.p0(objR2);
                                }
                                j09VarB = vwc.b(j09VarB, false, (a26) objR2);
                                l46Var.r(false);
                            } else {
                                l46Var.f0(1899381698);
                                l46Var.r(false);
                            }
                            yi yiVar6 = yiVar3;
                            j09 j09Var7 = j09Var4;
                            j09 j09VarA3 = a.a(oa7.F(j09Var4.D(j09VarB)), fy9Var, yiVar6, bn2Var4, f5, c82Var4, 2);
                            objR = l46Var.R();
                            if (objR == i8cVar) {
                                objR = mr.i;
                                l46Var.p0(objR);
                            }
                            xn8 xn8Var3 = (xn8) objR;
                            int iHashCode3 = Long.hashCode(l46Var.T);
                            j09 j09VarJ3 = m93.J(l46Var, j09VarA3);
                            u8a u8aVarM3 = l46Var.m();
                            lf2.q.getClass();
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(LayoutNode.h1);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(hj6.z, l46Var, xn8Var3);
                            dec.l(hj6.y, l46Var, u8aVarM3);
                            dec.k(l46Var);
                            dec.l(hj6.x, l46Var, j09VarJ3);
                            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode3));
                            l46Var.r(true);
                            f4 = f5;
                            c82Var3 = c82Var4;
                            yiVar2 = yiVar6;
                            bn2Var3 = bn2Var4;
                            j09Var3 = j09Var7;
                        } else {
                            l46Var.Z();
                            j09Var3 = j09Var2;
                            bn2Var3 = bn2Var2;
                            f4 = f3;
                            c82Var3 = c82Var2;
                            yiVar2 = yiVar;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new t70(fy9Var, str, j09Var3, yiVar2, bn2Var3, f4, c82Var3, i2, i3);
                        }
                    }
                    i4 |= 1572864;
                    c82Var2 = c82Var;
                    i13 = i4;
                    if ((i4 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (l46Var.W(i13 & 1, z)) {
                        j09VarB = g09.a;
                        if (i14 != 0) {
                            j09Var4 = j09VarB;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i5 != 0) {
                            yiVar3 = ndb.f;
                        } else {
                            yiVar3 = yiVar;
                        }
                        if (i7 != 0) {
                            bn2Var4 = an2.b;
                        } else {
                            bn2Var4 = bn2Var2;
                        }
                        if (i9 != 0) {
                            f5 = 1.0f;
                        } else {
                            f5 = f3;
                        }
                        if (i11 != 0) {
                            c82Var4 = null;
                        } else {
                            c82Var4 = c82Var2;
                        }
                        i8cVar = sf2.a;
                        if (str != null) {
                            l46Var.f0(1899222916);
                            if ((i13 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objR2 = l46Var.R();
                            if (z2) {
                                objR2 = new bt5(str, 8);
                                l46Var.p0(objR2);
                            } else {
                                objR2 = new bt5(str, 8);
                                l46Var.p0(objR2);
                            }
                            j09VarB = vwc.b(j09VarB, false, (a26) objR2);
                            l46Var.r(false);
                        } else {
                            l46Var.f0(1899381698);
                            l46Var.r(false);
                        }
                        yi yiVar7 = yiVar3;
                        j09 j09Var8 = j09Var4;
                        j09 j09VarA4 = a.a(oa7.F(j09Var4.D(j09VarB)), fy9Var, yiVar7, bn2Var4, f5, c82Var4, 2);
                        objR = l46Var.R();
                        if (objR == i8cVar) {
                            objR = mr.i;
                            l46Var.p0(objR);
                        }
                        xn8 xn8Var4 = (xn8) objR;
                        int iHashCode4 = Long.hashCode(l46Var.T);
                        j09 j09VarJ4 = m93.J(l46Var, j09VarA4);
                        u8a u8aVarM4 = l46Var.m();
                        lf2.q.getClass();
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(LayoutNode.h1);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(hj6.z, l46Var, xn8Var4);
                        dec.l(hj6.y, l46Var, u8aVarM4);
                        dec.k(l46Var);
                        dec.l(hj6.x, l46Var, j09VarJ4);
                        dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode4));
                        l46Var.r(true);
                        f4 = f5;
                        c82Var3 = c82Var4;
                        yiVar2 = yiVar7;
                        bn2Var3 = bn2Var4;
                        j09Var3 = j09Var8;
                    } else {
                        l46Var.Z();
                        j09Var3 = j09Var2;
                        bn2Var3 = bn2Var2;
                        f4 = f3;
                        c82Var3 = c82Var2;
                        yiVar2 = yiVar;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new t70(fy9Var, str, j09Var3, yiVar2, bn2Var3, f4, c82Var3, i2, i3);
                    }
                }
                i4 |= 24576;
                bn2Var2 = bn2Var;
                i9 = i3 & 32;
                if (i9 != 0) {
                    if ((196608 & i2) == 0) {
                        f3 = f2;
                        if (l46Var.d(f3)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i4 |= i10;
                    }
                    i11 = i3 & 64;
                    if (i11 != 0) {
                        if ((1572864 & i2) == 0) {
                            c82Var2 = c82Var;
                            if (l46Var.g(c82Var2)) {
                                i12 = 1048576;
                            } else {
                                i12 = 524288;
                            }
                            i4 |= i12;
                        }
                        i13 = i4;
                        if ((i4 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (l46Var.W(i13 & 1, z)) {
                            j09VarB = g09.a;
                            if (i14 != 0) {
                                j09Var4 = j09VarB;
                            } else {
                                j09Var4 = j09Var2;
                            }
                            if (i5 != 0) {
                                yiVar3 = ndb.f;
                            } else {
                                yiVar3 = yiVar;
                            }
                            if (i7 != 0) {
                                bn2Var4 = an2.b;
                            } else {
                                bn2Var4 = bn2Var2;
                            }
                            if (i9 != 0) {
                                f5 = 1.0f;
                            } else {
                                f5 = f3;
                            }
                            if (i11 != 0) {
                                c82Var4 = null;
                            } else {
                                c82Var4 = c82Var2;
                            }
                            i8cVar = sf2.a;
                            if (str != null) {
                                l46Var.f0(1899222916);
                                if ((i13 & 112) == 32) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                objR2 = l46Var.R();
                                if (z2) {
                                    objR2 = new bt5(str, 8);
                                    l46Var.p0(objR2);
                                } else {
                                    objR2 = new bt5(str, 8);
                                    l46Var.p0(objR2);
                                }
                                j09VarB = vwc.b(j09VarB, false, (a26) objR2);
                                l46Var.r(false);
                            } else {
                                l46Var.f0(1899381698);
                                l46Var.r(false);
                            }
                            yi yiVar8 = yiVar3;
                            j09 j09Var9 = j09Var4;
                            j09 j09VarA5 = a.a(oa7.F(j09Var4.D(j09VarB)), fy9Var, yiVar8, bn2Var4, f5, c82Var4, 2);
                            objR = l46Var.R();
                            if (objR == i8cVar) {
                                objR = mr.i;
                                l46Var.p0(objR);
                            }
                            xn8 xn8Var5 = (xn8) objR;
                            int iHashCode5 = Long.hashCode(l46Var.T);
                            j09 j09VarJ5 = m93.J(l46Var, j09VarA5);
                            u8a u8aVarM5 = l46Var.m();
                            lf2.q.getClass();
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(LayoutNode.h1);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(hj6.z, l46Var, xn8Var5);
                            dec.l(hj6.y, l46Var, u8aVarM5);
                            dec.k(l46Var);
                            dec.l(hj6.x, l46Var, j09VarJ5);
                            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode5));
                            l46Var.r(true);
                            f4 = f5;
                            c82Var3 = c82Var4;
                            yiVar2 = yiVar8;
                            bn2Var3 = bn2Var4;
                            j09Var3 = j09Var9;
                        } else {
                            l46Var.Z();
                            j09Var3 = j09Var2;
                            bn2Var3 = bn2Var2;
                            f4 = f3;
                            c82Var3 = c82Var2;
                            yiVar2 = yiVar;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new t70(fy9Var, str, j09Var3, yiVar2, bn2Var3, f4, c82Var3, i2, i3);
                        }
                    }
                    i4 |= 1572864;
                    c82Var2 = c82Var;
                    i13 = i4;
                    if ((i4 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (l46Var.W(i13 & 1, z)) {
                        j09VarB = g09.a;
                        if (i14 != 0) {
                            j09Var4 = j09VarB;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i5 != 0) {
                            yiVar3 = ndb.f;
                        } else {
                            yiVar3 = yiVar;
                        }
                        if (i7 != 0) {
                            bn2Var4 = an2.b;
                        } else {
                            bn2Var4 = bn2Var2;
                        }
                        if (i9 != 0) {
                            f5 = 1.0f;
                        } else {
                            f5 = f3;
                        }
                        if (i11 != 0) {
                            c82Var4 = null;
                        } else {
                            c82Var4 = c82Var2;
                        }
                        i8cVar = sf2.a;
                        if (str != null) {
                            l46Var.f0(1899222916);
                            if ((i13 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objR2 = l46Var.R();
                            if (z2) {
                                objR2 = new bt5(str, 8);
                                l46Var.p0(objR2);
                            } else {
                                objR2 = new bt5(str, 8);
                                l46Var.p0(objR2);
                            }
                            j09VarB = vwc.b(j09VarB, false, (a26) objR2);
                            l46Var.r(false);
                        } else {
                            l46Var.f0(1899381698);
                            l46Var.r(false);
                        }
                        yi yiVar9 = yiVar3;
                        j09 j09Var10 = j09Var4;
                        j09 j09VarA6 = a.a(oa7.F(j09Var4.D(j09VarB)), fy9Var, yiVar9, bn2Var4, f5, c82Var4, 2);
                        objR = l46Var.R();
                        if (objR == i8cVar) {
                            objR = mr.i;
                            l46Var.p0(objR);
                        }
                        xn8 xn8Var6 = (xn8) objR;
                        int iHashCode6 = Long.hashCode(l46Var.T);
                        j09 j09VarJ6 = m93.J(l46Var, j09VarA6);
                        u8a u8aVarM6 = l46Var.m();
                        lf2.q.getClass();
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(LayoutNode.h1);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(hj6.z, l46Var, xn8Var6);
                        dec.l(hj6.y, l46Var, u8aVarM6);
                        dec.k(l46Var);
                        dec.l(hj6.x, l46Var, j09VarJ6);
                        dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode6));
                        l46Var.r(true);
                        f4 = f5;
                        c82Var3 = c82Var4;
                        yiVar2 = yiVar9;
                        bn2Var3 = bn2Var4;
                        j09Var3 = j09Var10;
                    } else {
                        l46Var.Z();
                        j09Var3 = j09Var2;
                        bn2Var3 = bn2Var2;
                        f4 = f3;
                        c82Var3 = c82Var2;
                        yiVar2 = yiVar;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new t70(fy9Var, str, j09Var3, yiVar2, bn2Var3, f4, c82Var3, i2, i3);
                    }
                }
                i4 |= 196608;
                f3 = f2;
                i11 = i3 & 64;
                if (i11 != 0) {
                    if ((1572864 & i2) == 0) {
                        c82Var2 = c82Var;
                        if (l46Var.g(c82Var2)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                        i4 |= i12;
                    }
                    i13 = i4;
                    if ((i4 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (l46Var.W(i13 & 1, z)) {
                        j09VarB = g09.a;
                        if (i14 != 0) {
                            j09Var4 = j09VarB;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i5 != 0) {
                            yiVar3 = ndb.f;
                        } else {
                            yiVar3 = yiVar;
                        }
                        if (i7 != 0) {
                            bn2Var4 = an2.b;
                        } else {
                            bn2Var4 = bn2Var2;
                        }
                        if (i9 != 0) {
                            f5 = 1.0f;
                        } else {
                            f5 = f3;
                        }
                        if (i11 != 0) {
                            c82Var4 = null;
                        } else {
                            c82Var4 = c82Var2;
                        }
                        i8cVar = sf2.a;
                        if (str != null) {
                            l46Var.f0(1899222916);
                            if ((i13 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objR2 = l46Var.R();
                            if (z2) {
                                objR2 = new bt5(str, 8);
                                l46Var.p0(objR2);
                            } else {
                                objR2 = new bt5(str, 8);
                                l46Var.p0(objR2);
                            }
                            j09VarB = vwc.b(j09VarB, false, (a26) objR2);
                            l46Var.r(false);
                        } else {
                            l46Var.f0(1899381698);
                            l46Var.r(false);
                        }
                        yi yiVar10 = yiVar3;
                        j09 j09Var11 = j09Var4;
                        j09 j09VarA7 = a.a(oa7.F(j09Var4.D(j09VarB)), fy9Var, yiVar10, bn2Var4, f5, c82Var4, 2);
                        objR = l46Var.R();
                        if (objR == i8cVar) {
                            objR = mr.i;
                            l46Var.p0(objR);
                        }
                        xn8 xn8Var7 = (xn8) objR;
                        int iHashCode7 = Long.hashCode(l46Var.T);
                        j09 j09VarJ7 = m93.J(l46Var, j09VarA7);
                        u8a u8aVarM7 = l46Var.m();
                        lf2.q.getClass();
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(LayoutNode.h1);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(hj6.z, l46Var, xn8Var7);
                        dec.l(hj6.y, l46Var, u8aVarM7);
                        dec.k(l46Var);
                        dec.l(hj6.x, l46Var, j09VarJ7);
                        dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode7));
                        l46Var.r(true);
                        f4 = f5;
                        c82Var3 = c82Var4;
                        yiVar2 = yiVar10;
                        bn2Var3 = bn2Var4;
                        j09Var3 = j09Var11;
                    } else {
                        l46Var.Z();
                        j09Var3 = j09Var2;
                        bn2Var3 = bn2Var2;
                        f4 = f3;
                        c82Var3 = c82Var2;
                        yiVar2 = yiVar;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new t70(fy9Var, str, j09Var3, yiVar2, bn2Var3, f4, c82Var3, i2, i3);
                    }
                }
                i4 |= 1572864;
                c82Var2 = c82Var;
                i13 = i4;
                if ((i4 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (l46Var.W(i13 & 1, z)) {
                    j09VarB = g09.a;
                    if (i14 != 0) {
                        j09Var4 = j09VarB;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i5 != 0) {
                        yiVar3 = ndb.f;
                    } else {
                        yiVar3 = yiVar;
                    }
                    if (i7 != 0) {
                        bn2Var4 = an2.b;
                    } else {
                        bn2Var4 = bn2Var2;
                    }
                    if (i9 != 0) {
                        f5 = 1.0f;
                    } else {
                        f5 = f3;
                    }
                    if (i11 != 0) {
                        c82Var4 = null;
                    } else {
                        c82Var4 = c82Var2;
                    }
                    i8cVar = sf2.a;
                    if (str != null) {
                        l46Var.f0(1899222916);
                        if ((i13 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objR2 = l46Var.R();
                        if (z2) {
                            objR2 = new bt5(str, 8);
                            l46Var.p0(objR2);
                        } else {
                            objR2 = new bt5(str, 8);
                            l46Var.p0(objR2);
                        }
                        j09VarB = vwc.b(j09VarB, false, (a26) objR2);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(1899381698);
                        l46Var.r(false);
                    }
                    yi yiVar11 = yiVar3;
                    j09 j09Var12 = j09Var4;
                    j09 j09VarA8 = a.a(oa7.F(j09Var4.D(j09VarB)), fy9Var, yiVar11, bn2Var4, f5, c82Var4, 2);
                    objR = l46Var.R();
                    if (objR == i8cVar) {
                        objR = mr.i;
                        l46Var.p0(objR);
                    }
                    xn8 xn8Var8 = (xn8) objR;
                    int iHashCode8 = Long.hashCode(l46Var.T);
                    j09 j09VarJ8 = m93.J(l46Var, j09VarA8);
                    u8a u8aVarM8 = l46Var.m();
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(LayoutNode.h1);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, xn8Var8);
                    dec.l(hj6.y, l46Var, u8aVarM8);
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ8);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode8));
                    l46Var.r(true);
                    f4 = f5;
                    c82Var3 = c82Var4;
                    yiVar2 = yiVar11;
                    bn2Var3 = bn2Var4;
                    j09Var3 = j09Var12;
                } else {
                    l46Var.Z();
                    j09Var3 = j09Var2;
                    bn2Var3 = bn2Var2;
                    f4 = f3;
                    c82Var3 = c82Var2;
                    yiVar2 = yiVar;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new t70(fy9Var, str, j09Var3, yiVar2, bn2Var3, f4, c82Var3, i2, i3);
                }
            }
            i4 |= 3072;
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((i2 & 24576) == 0) {
                    bn2Var2 = bn2Var;
                    if (l46Var.g(bn2Var2)) {
                        i8 = 16384;
                    } else {
                        i8 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 32;
                if (i9 != 0) {
                    if ((196608 & i2) == 0) {
                        f3 = f2;
                        if (l46Var.d(f3)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i4 |= i10;
                    }
                    i11 = i3 & 64;
                    if (i11 != 0) {
                        if ((1572864 & i2) == 0) {
                            c82Var2 = c82Var;
                            if (l46Var.g(c82Var2)) {
                                i12 = 1048576;
                            } else {
                                i12 = 524288;
                            }
                            i4 |= i12;
                        }
                        i13 = i4;
                        if ((i4 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (l46Var.W(i13 & 1, z)) {
                            j09VarB = g09.a;
                            if (i14 != 0) {
                                j09Var4 = j09VarB;
                            } else {
                                j09Var4 = j09Var2;
                            }
                            if (i5 != 0) {
                                yiVar3 = ndb.f;
                            } else {
                                yiVar3 = yiVar;
                            }
                            if (i7 != 0) {
                                bn2Var4 = an2.b;
                            } else {
                                bn2Var4 = bn2Var2;
                            }
                            if (i9 != 0) {
                                f5 = 1.0f;
                            } else {
                                f5 = f3;
                            }
                            if (i11 != 0) {
                                c82Var4 = null;
                            } else {
                                c82Var4 = c82Var2;
                            }
                            i8cVar = sf2.a;
                            if (str != null) {
                                l46Var.f0(1899222916);
                                if ((i13 & 112) == 32) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                objR2 = l46Var.R();
                                if (z2) {
                                    objR2 = new bt5(str, 8);
                                    l46Var.p0(objR2);
                                } else {
                                    objR2 = new bt5(str, 8);
                                    l46Var.p0(objR2);
                                }
                                j09VarB = vwc.b(j09VarB, false, (a26) objR2);
                                l46Var.r(false);
                            } else {
                                l46Var.f0(1899381698);
                                l46Var.r(false);
                            }
                            yi yiVar12 = yiVar3;
                            j09 j09Var13 = j09Var4;
                            j09 j09VarA9 = a.a(oa7.F(j09Var4.D(j09VarB)), fy9Var, yiVar12, bn2Var4, f5, c82Var4, 2);
                            objR = l46Var.R();
                            if (objR == i8cVar) {
                                objR = mr.i;
                                l46Var.p0(objR);
                            }
                            xn8 xn8Var9 = (xn8) objR;
                            int iHashCode9 = Long.hashCode(l46Var.T);
                            j09 j09VarJ9 = m93.J(l46Var, j09VarA9);
                            u8a u8aVarM9 = l46Var.m();
                            lf2.q.getClass();
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(LayoutNode.h1);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(hj6.z, l46Var, xn8Var9);
                            dec.l(hj6.y, l46Var, u8aVarM9);
                            dec.k(l46Var);
                            dec.l(hj6.x, l46Var, j09VarJ9);
                            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode9));
                            l46Var.r(true);
                            f4 = f5;
                            c82Var3 = c82Var4;
                            yiVar2 = yiVar12;
                            bn2Var3 = bn2Var4;
                            j09Var3 = j09Var13;
                        } else {
                            l46Var.Z();
                            j09Var3 = j09Var2;
                            bn2Var3 = bn2Var2;
                            f4 = f3;
                            c82Var3 = c82Var2;
                            yiVar2 = yiVar;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new t70(fy9Var, str, j09Var3, yiVar2, bn2Var3, f4, c82Var3, i2, i3);
                        }
                    }
                    i4 |= 1572864;
                    c82Var2 = c82Var;
                    i13 = i4;
                    if ((i4 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (l46Var.W(i13 & 1, z)) {
                        j09VarB = g09.a;
                        if (i14 != 0) {
                            j09Var4 = j09VarB;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i5 != 0) {
                            yiVar3 = ndb.f;
                        } else {
                            yiVar3 = yiVar;
                        }
                        if (i7 != 0) {
                            bn2Var4 = an2.b;
                        } else {
                            bn2Var4 = bn2Var2;
                        }
                        if (i9 != 0) {
                            f5 = 1.0f;
                        } else {
                            f5 = f3;
                        }
                        if (i11 != 0) {
                            c82Var4 = null;
                        } else {
                            c82Var4 = c82Var2;
                        }
                        i8cVar = sf2.a;
                        if (str != null) {
                            l46Var.f0(1899222916);
                            if ((i13 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objR2 = l46Var.R();
                            if (z2) {
                                objR2 = new bt5(str, 8);
                                l46Var.p0(objR2);
                            } else {
                                objR2 = new bt5(str, 8);
                                l46Var.p0(objR2);
                            }
                            j09VarB = vwc.b(j09VarB, false, (a26) objR2);
                            l46Var.r(false);
                        } else {
                            l46Var.f0(1899381698);
                            l46Var.r(false);
                        }
                        yi yiVar13 = yiVar3;
                        j09 j09Var14 = j09Var4;
                        j09 j09VarA10 = a.a(oa7.F(j09Var4.D(j09VarB)), fy9Var, yiVar13, bn2Var4, f5, c82Var4, 2);
                        objR = l46Var.R();
                        if (objR == i8cVar) {
                            objR = mr.i;
                            l46Var.p0(objR);
                        }
                        xn8 xn8Var10 = (xn8) objR;
                        int iHashCode10 = Long.hashCode(l46Var.T);
                        j09 j09VarJ10 = m93.J(l46Var, j09VarA10);
                        u8a u8aVarM10 = l46Var.m();
                        lf2.q.getClass();
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(LayoutNode.h1);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(hj6.z, l46Var, xn8Var10);
                        dec.l(hj6.y, l46Var, u8aVarM10);
                        dec.k(l46Var);
                        dec.l(hj6.x, l46Var, j09VarJ10);
                        dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode10));
                        l46Var.r(true);
                        f4 = f5;
                        c82Var3 = c82Var4;
                        yiVar2 = yiVar13;
                        bn2Var3 = bn2Var4;
                        j09Var3 = j09Var14;
                    } else {
                        l46Var.Z();
                        j09Var3 = j09Var2;
                        bn2Var3 = bn2Var2;
                        f4 = f3;
                        c82Var3 = c82Var2;
                        yiVar2 = yiVar;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new t70(fy9Var, str, j09Var3, yiVar2, bn2Var3, f4, c82Var3, i2, i3);
                    }
                }
                i4 |= 196608;
                f3 = f2;
                i11 = i3 & 64;
                if (i11 != 0) {
                    if ((1572864 & i2) == 0) {
                        c82Var2 = c82Var;
                        if (l46Var.g(c82Var2)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                        i4 |= i12;
                    }
                    i13 = i4;
                    if ((i4 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (l46Var.W(i13 & 1, z)) {
                        j09VarB = g09.a;
                        if (i14 != 0) {
                            j09Var4 = j09VarB;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i5 != 0) {
                            yiVar3 = ndb.f;
                        } else {
                            yiVar3 = yiVar;
                        }
                        if (i7 != 0) {
                            bn2Var4 = an2.b;
                        } else {
                            bn2Var4 = bn2Var2;
                        }
                        if (i9 != 0) {
                            f5 = 1.0f;
                        } else {
                            f5 = f3;
                        }
                        if (i11 != 0) {
                            c82Var4 = null;
                        } else {
                            c82Var4 = c82Var2;
                        }
                        i8cVar = sf2.a;
                        if (str != null) {
                            l46Var.f0(1899222916);
                            if ((i13 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objR2 = l46Var.R();
                            if (z2) {
                                objR2 = new bt5(str, 8);
                                l46Var.p0(objR2);
                            } else {
                                objR2 = new bt5(str, 8);
                                l46Var.p0(objR2);
                            }
                            j09VarB = vwc.b(j09VarB, false, (a26) objR2);
                            l46Var.r(false);
                        } else {
                            l46Var.f0(1899381698);
                            l46Var.r(false);
                        }
                        yi yiVar14 = yiVar3;
                        j09 j09Var15 = j09Var4;
                        j09 j09VarA11 = a.a(oa7.F(j09Var4.D(j09VarB)), fy9Var, yiVar14, bn2Var4, f5, c82Var4, 2);
                        objR = l46Var.R();
                        if (objR == i8cVar) {
                            objR = mr.i;
                            l46Var.p0(objR);
                        }
                        xn8 xn8Var11 = (xn8) objR;
                        int iHashCode11 = Long.hashCode(l46Var.T);
                        j09 j09VarJ11 = m93.J(l46Var, j09VarA11);
                        u8a u8aVarM11 = l46Var.m();
                        lf2.q.getClass();
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(LayoutNode.h1);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(hj6.z, l46Var, xn8Var11);
                        dec.l(hj6.y, l46Var, u8aVarM11);
                        dec.k(l46Var);
                        dec.l(hj6.x, l46Var, j09VarJ11);
                        dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode11));
                        l46Var.r(true);
                        f4 = f5;
                        c82Var3 = c82Var4;
                        yiVar2 = yiVar14;
                        bn2Var3 = bn2Var4;
                        j09Var3 = j09Var15;
                    } else {
                        l46Var.Z();
                        j09Var3 = j09Var2;
                        bn2Var3 = bn2Var2;
                        f4 = f3;
                        c82Var3 = c82Var2;
                        yiVar2 = yiVar;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new t70(fy9Var, str, j09Var3, yiVar2, bn2Var3, f4, c82Var3, i2, i3);
                    }
                }
                i4 |= 1572864;
                c82Var2 = c82Var;
                i13 = i4;
                if ((i4 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (l46Var.W(i13 & 1, z)) {
                    j09VarB = g09.a;
                    if (i14 != 0) {
                        j09Var4 = j09VarB;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i5 != 0) {
                        yiVar3 = ndb.f;
                    } else {
                        yiVar3 = yiVar;
                    }
                    if (i7 != 0) {
                        bn2Var4 = an2.b;
                    } else {
                        bn2Var4 = bn2Var2;
                    }
                    if (i9 != 0) {
                        f5 = 1.0f;
                    } else {
                        f5 = f3;
                    }
                    if (i11 != 0) {
                        c82Var4 = null;
                    } else {
                        c82Var4 = c82Var2;
                    }
                    i8cVar = sf2.a;
                    if (str != null) {
                        l46Var.f0(1899222916);
                        if ((i13 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objR2 = l46Var.R();
                        if (z2) {
                            objR2 = new bt5(str, 8);
                            l46Var.p0(objR2);
                        } else {
                            objR2 = new bt5(str, 8);
                            l46Var.p0(objR2);
                        }
                        j09VarB = vwc.b(j09VarB, false, (a26) objR2);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(1899381698);
                        l46Var.r(false);
                    }
                    yi yiVar15 = yiVar3;
                    j09 j09Var16 = j09Var4;
                    j09 j09VarA12 = a.a(oa7.F(j09Var4.D(j09VarB)), fy9Var, yiVar15, bn2Var4, f5, c82Var4, 2);
                    objR = l46Var.R();
                    if (objR == i8cVar) {
                        objR = mr.i;
                        l46Var.p0(objR);
                    }
                    xn8 xn8Var12 = (xn8) objR;
                    int iHashCode12 = Long.hashCode(l46Var.T);
                    j09 j09VarJ12 = m93.J(l46Var, j09VarA12);
                    u8a u8aVarM12 = l46Var.m();
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(LayoutNode.h1);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, xn8Var12);
                    dec.l(hj6.y, l46Var, u8aVarM12);
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ12);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode12));
                    l46Var.r(true);
                    f4 = f5;
                    c82Var3 = c82Var4;
                    yiVar2 = yiVar15;
                    bn2Var3 = bn2Var4;
                    j09Var3 = j09Var16;
                } else {
                    l46Var.Z();
                    j09Var3 = j09Var2;
                    bn2Var3 = bn2Var2;
                    f4 = f3;
                    c82Var3 = c82Var2;
                    yiVar2 = yiVar;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new t70(fy9Var, str, j09Var3, yiVar2, bn2Var3, f4, c82Var3, i2, i3);
                }
            }
            i4 |= 24576;
            bn2Var2 = bn2Var;
            i9 = i3 & 32;
            if (i9 != 0) {
                if ((196608 & i2) == 0) {
                    f3 = f2;
                    if (l46Var.d(f3)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i4 |= i10;
                }
                i11 = i3 & 64;
                if (i11 != 0) {
                    if ((1572864 & i2) == 0) {
                        c82Var2 = c82Var;
                        if (l46Var.g(c82Var2)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                        i4 |= i12;
                    }
                    i13 = i4;
                    if ((i4 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (l46Var.W(i13 & 1, z)) {
                        j09VarB = g09.a;
                        if (i14 != 0) {
                            j09Var4 = j09VarB;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i5 != 0) {
                            yiVar3 = ndb.f;
                        } else {
                            yiVar3 = yiVar;
                        }
                        if (i7 != 0) {
                            bn2Var4 = an2.b;
                        } else {
                            bn2Var4 = bn2Var2;
                        }
                        if (i9 != 0) {
                            f5 = 1.0f;
                        } else {
                            f5 = f3;
                        }
                        if (i11 != 0) {
                            c82Var4 = null;
                        } else {
                            c82Var4 = c82Var2;
                        }
                        i8cVar = sf2.a;
                        if (str != null) {
                            l46Var.f0(1899222916);
                            if ((i13 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objR2 = l46Var.R();
                            if (z2) {
                                objR2 = new bt5(str, 8);
                                l46Var.p0(objR2);
                            } else {
                                objR2 = new bt5(str, 8);
                                l46Var.p0(objR2);
                            }
                            j09VarB = vwc.b(j09VarB, false, (a26) objR2);
                            l46Var.r(false);
                        } else {
                            l46Var.f0(1899381698);
                            l46Var.r(false);
                        }
                        yi yiVar16 = yiVar3;
                        j09 j09Var17 = j09Var4;
                        j09 j09VarA13 = a.a(oa7.F(j09Var4.D(j09VarB)), fy9Var, yiVar16, bn2Var4, f5, c82Var4, 2);
                        objR = l46Var.R();
                        if (objR == i8cVar) {
                            objR = mr.i;
                            l46Var.p0(objR);
                        }
                        xn8 xn8Var13 = (xn8) objR;
                        int iHashCode13 = Long.hashCode(l46Var.T);
                        j09 j09VarJ13 = m93.J(l46Var, j09VarA13);
                        u8a u8aVarM13 = l46Var.m();
                        lf2.q.getClass();
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(LayoutNode.h1);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(hj6.z, l46Var, xn8Var13);
                        dec.l(hj6.y, l46Var, u8aVarM13);
                        dec.k(l46Var);
                        dec.l(hj6.x, l46Var, j09VarJ13);
                        dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode13));
                        l46Var.r(true);
                        f4 = f5;
                        c82Var3 = c82Var4;
                        yiVar2 = yiVar16;
                        bn2Var3 = bn2Var4;
                        j09Var3 = j09Var17;
                    } else {
                        l46Var.Z();
                        j09Var3 = j09Var2;
                        bn2Var3 = bn2Var2;
                        f4 = f3;
                        c82Var3 = c82Var2;
                        yiVar2 = yiVar;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new t70(fy9Var, str, j09Var3, yiVar2, bn2Var3, f4, c82Var3, i2, i3);
                    }
                }
                i4 |= 1572864;
                c82Var2 = c82Var;
                i13 = i4;
                if ((i4 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (l46Var.W(i13 & 1, z)) {
                    j09VarB = g09.a;
                    if (i14 != 0) {
                        j09Var4 = j09VarB;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i5 != 0) {
                        yiVar3 = ndb.f;
                    } else {
                        yiVar3 = yiVar;
                    }
                    if (i7 != 0) {
                        bn2Var4 = an2.b;
                    } else {
                        bn2Var4 = bn2Var2;
                    }
                    if (i9 != 0) {
                        f5 = 1.0f;
                    } else {
                        f5 = f3;
                    }
                    if (i11 != 0) {
                        c82Var4 = null;
                    } else {
                        c82Var4 = c82Var2;
                    }
                    i8cVar = sf2.a;
                    if (str != null) {
                        l46Var.f0(1899222916);
                        if ((i13 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objR2 = l46Var.R();
                        if (z2) {
                            objR2 = new bt5(str, 8);
                            l46Var.p0(objR2);
                        } else {
                            objR2 = new bt5(str, 8);
                            l46Var.p0(objR2);
                        }
                        j09VarB = vwc.b(j09VarB, false, (a26) objR2);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(1899381698);
                        l46Var.r(false);
                    }
                    yi yiVar17 = yiVar3;
                    j09 j09Var18 = j09Var4;
                    j09 j09VarA14 = a.a(oa7.F(j09Var4.D(j09VarB)), fy9Var, yiVar17, bn2Var4, f5, c82Var4, 2);
                    objR = l46Var.R();
                    if (objR == i8cVar) {
                        objR = mr.i;
                        l46Var.p0(objR);
                    }
                    xn8 xn8Var14 = (xn8) objR;
                    int iHashCode14 = Long.hashCode(l46Var.T);
                    j09 j09VarJ14 = m93.J(l46Var, j09VarA14);
                    u8a u8aVarM14 = l46Var.m();
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(LayoutNode.h1);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, xn8Var14);
                    dec.l(hj6.y, l46Var, u8aVarM14);
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ14);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode14));
                    l46Var.r(true);
                    f4 = f5;
                    c82Var3 = c82Var4;
                    yiVar2 = yiVar17;
                    bn2Var3 = bn2Var4;
                    j09Var3 = j09Var18;
                } else {
                    l46Var.Z();
                    j09Var3 = j09Var2;
                    bn2Var3 = bn2Var2;
                    f4 = f3;
                    c82Var3 = c82Var2;
                    yiVar2 = yiVar;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new t70(fy9Var, str, j09Var3, yiVar2, bn2Var3, f4, c82Var3, i2, i3);
                }
            }
            i4 |= 196608;
            f3 = f2;
            i11 = i3 & 64;
            if (i11 != 0) {
                if ((1572864 & i2) == 0) {
                    c82Var2 = c82Var;
                    if (l46Var.g(c82Var2)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                    i4 |= i12;
                }
                i13 = i4;
                if ((i4 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (l46Var.W(i13 & 1, z)) {
                    j09VarB = g09.a;
                    if (i14 != 0) {
                        j09Var4 = j09VarB;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i5 != 0) {
                        yiVar3 = ndb.f;
                    } else {
                        yiVar3 = yiVar;
                    }
                    if (i7 != 0) {
                        bn2Var4 = an2.b;
                    } else {
                        bn2Var4 = bn2Var2;
                    }
                    if (i9 != 0) {
                        f5 = 1.0f;
                    } else {
                        f5 = f3;
                    }
                    if (i11 != 0) {
                        c82Var4 = null;
                    } else {
                        c82Var4 = c82Var2;
                    }
                    i8cVar = sf2.a;
                    if (str != null) {
                        l46Var.f0(1899222916);
                        if ((i13 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objR2 = l46Var.R();
                        if (z2) {
                            objR2 = new bt5(str, 8);
                            l46Var.p0(objR2);
                        } else {
                            objR2 = new bt5(str, 8);
                            l46Var.p0(objR2);
                        }
                        j09VarB = vwc.b(j09VarB, false, (a26) objR2);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(1899381698);
                        l46Var.r(false);
                    }
                    yi yiVar18 = yiVar3;
                    j09 j09Var19 = j09Var4;
                    j09 j09VarA15 = a.a(oa7.F(j09Var4.D(j09VarB)), fy9Var, yiVar18, bn2Var4, f5, c82Var4, 2);
                    objR = l46Var.R();
                    if (objR == i8cVar) {
                        objR = mr.i;
                        l46Var.p0(objR);
                    }
                    xn8 xn8Var15 = (xn8) objR;
                    int iHashCode15 = Long.hashCode(l46Var.T);
                    j09 j09VarJ15 = m93.J(l46Var, j09VarA15);
                    u8a u8aVarM15 = l46Var.m();
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(LayoutNode.h1);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, xn8Var15);
                    dec.l(hj6.y, l46Var, u8aVarM15);
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ15);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode15));
                    l46Var.r(true);
                    f4 = f5;
                    c82Var3 = c82Var4;
                    yiVar2 = yiVar18;
                    bn2Var3 = bn2Var4;
                    j09Var3 = j09Var19;
                } else {
                    l46Var.Z();
                    j09Var3 = j09Var2;
                    bn2Var3 = bn2Var2;
                    f4 = f3;
                    c82Var3 = c82Var2;
                    yiVar2 = yiVar;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new t70(fy9Var, str, j09Var3, yiVar2, bn2Var3, f4, c82Var3, i2, i3);
                }
            }
            i4 |= 1572864;
            c82Var2 = c82Var;
            i13 = i4;
            if ((i4 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i13 & 1, z)) {
                j09VarB = g09.a;
                if (i14 != 0) {
                    j09Var4 = j09VarB;
                } else {
                    j09Var4 = j09Var2;
                }
                if (i5 != 0) {
                    yiVar3 = ndb.f;
                } else {
                    yiVar3 = yiVar;
                }
                if (i7 != 0) {
                    bn2Var4 = an2.b;
                } else {
                    bn2Var4 = bn2Var2;
                }
                if (i9 != 0) {
                    f5 = 1.0f;
                } else {
                    f5 = f3;
                }
                if (i11 != 0) {
                    c82Var4 = null;
                } else {
                    c82Var4 = c82Var2;
                }
                i8cVar = sf2.a;
                if (str != null) {
                    l46Var.f0(1899222916);
                    if ((i13 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objR2 = l46Var.R();
                    if (z2) {
                        objR2 = new bt5(str, 8);
                        l46Var.p0(objR2);
                    } else {
                        objR2 = new bt5(str, 8);
                        l46Var.p0(objR2);
                    }
                    j09VarB = vwc.b(j09VarB, false, (a26) objR2);
                    l46Var.r(false);
                } else {
                    l46Var.f0(1899381698);
                    l46Var.r(false);
                }
                yi yiVar19 = yiVar3;
                j09 j09Var110 = j09Var4;
                j09 j09VarA16 = a.a(oa7.F(j09Var4.D(j09VarB)), fy9Var, yiVar19, bn2Var4, f5, c82Var4, 2);
                objR = l46Var.R();
                if (objR == i8cVar) {
                    objR = mr.i;
                    l46Var.p0(objR);
                }
                xn8 xn8Var16 = (xn8) objR;
                int iHashCode16 = Long.hashCode(l46Var.T);
                j09 j09VarJ16 = m93.J(l46Var, j09VarA16);
                u8a u8aVarM16 = l46Var.m();
                lf2.q.getClass();
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(LayoutNode.h1);
                } else {
                    l46Var.s0();
                }
                dec.l(hj6.z, l46Var, xn8Var16);
                dec.l(hj6.y, l46Var, u8aVarM16);
                dec.k(l46Var);
                dec.l(hj6.x, l46Var, j09VarJ16);
                dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode16));
                l46Var.r(true);
                f4 = f5;
                c82Var3 = c82Var4;
                yiVar2 = yiVar19;
                bn2Var3 = bn2Var4;
                j09Var3 = j09Var110;
            } else {
                l46Var.Z();
                j09Var3 = j09Var2;
                bn2Var3 = bn2Var2;
                f4 = f3;
                c82Var3 = c82Var2;
                yiVar2 = yiVar;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new t70(fy9Var, str, j09Var3, yiVar2, bn2Var3, f4, c82Var3, i2, i3);
            }
        }
        i4 |= 384;
        j09Var2 = j09Var;
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i2 & 3072) == 0) {
                if (l46Var.g(yiVar)) {
                    i6 = 2048;
                } else {
                    i6 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i4 |= i6;
            }
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((i2 & 24576) == 0) {
                    bn2Var2 = bn2Var;
                    if (l46Var.g(bn2Var2)) {
                        i8 = 16384;
                    } else {
                        i8 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 32;
                if (i9 != 0) {
                    if ((196608 & i2) == 0) {
                        f3 = f2;
                        if (l46Var.d(f3)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i4 |= i10;
                    }
                    i11 = i3 & 64;
                    if (i11 != 0) {
                        if ((1572864 & i2) == 0) {
                            c82Var2 = c82Var;
                            if (l46Var.g(c82Var2)) {
                                i12 = 1048576;
                            } else {
                                i12 = 524288;
                            }
                            i4 |= i12;
                        }
                        i13 = i4;
                        if ((i4 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (l46Var.W(i13 & 1, z)) {
                            j09VarB = g09.a;
                            if (i14 != 0) {
                                j09Var4 = j09VarB;
                            } else {
                                j09Var4 = j09Var2;
                            }
                            if (i5 != 0) {
                                yiVar3 = ndb.f;
                            } else {
                                yiVar3 = yiVar;
                            }
                            if (i7 != 0) {
                                bn2Var4 = an2.b;
                            } else {
                                bn2Var4 = bn2Var2;
                            }
                            if (i9 != 0) {
                                f5 = 1.0f;
                            } else {
                                f5 = f3;
                            }
                            if (i11 != 0) {
                                c82Var4 = null;
                            } else {
                                c82Var4 = c82Var2;
                            }
                            i8cVar = sf2.a;
                            if (str != null) {
                                l46Var.f0(1899222916);
                                if ((i13 & 112) == 32) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                objR2 = l46Var.R();
                                if (z2) {
                                    objR2 = new bt5(str, 8);
                                    l46Var.p0(objR2);
                                } else {
                                    objR2 = new bt5(str, 8);
                                    l46Var.p0(objR2);
                                }
                                j09VarB = vwc.b(j09VarB, false, (a26) objR2);
                                l46Var.r(false);
                            } else {
                                l46Var.f0(1899381698);
                                l46Var.r(false);
                            }
                            yi yiVar110 = yiVar3;
                            j09 j09Var111 = j09Var4;
                            j09 j09VarA17 = a.a(oa7.F(j09Var4.D(j09VarB)), fy9Var, yiVar110, bn2Var4, f5, c82Var4, 2);
                            objR = l46Var.R();
                            if (objR == i8cVar) {
                                objR = mr.i;
                                l46Var.p0(objR);
                            }
                            xn8 xn8Var17 = (xn8) objR;
                            int iHashCode17 = Long.hashCode(l46Var.T);
                            j09 j09VarJ17 = m93.J(l46Var, j09VarA17);
                            u8a u8aVarM17 = l46Var.m();
                            lf2.q.getClass();
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(LayoutNode.h1);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(hj6.z, l46Var, xn8Var17);
                            dec.l(hj6.y, l46Var, u8aVarM17);
                            dec.k(l46Var);
                            dec.l(hj6.x, l46Var, j09VarJ17);
                            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode17));
                            l46Var.r(true);
                            f4 = f5;
                            c82Var3 = c82Var4;
                            yiVar2 = yiVar110;
                            bn2Var3 = bn2Var4;
                            j09Var3 = j09Var111;
                        } else {
                            l46Var.Z();
                            j09Var3 = j09Var2;
                            bn2Var3 = bn2Var2;
                            f4 = f3;
                            c82Var3 = c82Var2;
                            yiVar2 = yiVar;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new t70(fy9Var, str, j09Var3, yiVar2, bn2Var3, f4, c82Var3, i2, i3);
                        }
                    }
                    i4 |= 1572864;
                    c82Var2 = c82Var;
                    i13 = i4;
                    if ((i4 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (l46Var.W(i13 & 1, z)) {
                        j09VarB = g09.a;
                        if (i14 != 0) {
                            j09Var4 = j09VarB;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i5 != 0) {
                            yiVar3 = ndb.f;
                        } else {
                            yiVar3 = yiVar;
                        }
                        if (i7 != 0) {
                            bn2Var4 = an2.b;
                        } else {
                            bn2Var4 = bn2Var2;
                        }
                        if (i9 != 0) {
                            f5 = 1.0f;
                        } else {
                            f5 = f3;
                        }
                        if (i11 != 0) {
                            c82Var4 = null;
                        } else {
                            c82Var4 = c82Var2;
                        }
                        i8cVar = sf2.a;
                        if (str != null) {
                            l46Var.f0(1899222916);
                            if ((i13 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objR2 = l46Var.R();
                            if (z2) {
                                objR2 = new bt5(str, 8);
                                l46Var.p0(objR2);
                            } else {
                                objR2 = new bt5(str, 8);
                                l46Var.p0(objR2);
                            }
                            j09VarB = vwc.b(j09VarB, false, (a26) objR2);
                            l46Var.r(false);
                        } else {
                            l46Var.f0(1899381698);
                            l46Var.r(false);
                        }
                        yi yiVar111 = yiVar3;
                        j09 j09Var112 = j09Var4;
                        j09 j09VarA18 = a.a(oa7.F(j09Var4.D(j09VarB)), fy9Var, yiVar111, bn2Var4, f5, c82Var4, 2);
                        objR = l46Var.R();
                        if (objR == i8cVar) {
                            objR = mr.i;
                            l46Var.p0(objR);
                        }
                        xn8 xn8Var18 = (xn8) objR;
                        int iHashCode18 = Long.hashCode(l46Var.T);
                        j09 j09VarJ18 = m93.J(l46Var, j09VarA18);
                        u8a u8aVarM18 = l46Var.m();
                        lf2.q.getClass();
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(LayoutNode.h1);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(hj6.z, l46Var, xn8Var18);
                        dec.l(hj6.y, l46Var, u8aVarM18);
                        dec.k(l46Var);
                        dec.l(hj6.x, l46Var, j09VarJ18);
                        dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode18));
                        l46Var.r(true);
                        f4 = f5;
                        c82Var3 = c82Var4;
                        yiVar2 = yiVar111;
                        bn2Var3 = bn2Var4;
                        j09Var3 = j09Var112;
                    } else {
                        l46Var.Z();
                        j09Var3 = j09Var2;
                        bn2Var3 = bn2Var2;
                        f4 = f3;
                        c82Var3 = c82Var2;
                        yiVar2 = yiVar;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new t70(fy9Var, str, j09Var3, yiVar2, bn2Var3, f4, c82Var3, i2, i3);
                    }
                }
                i4 |= 196608;
                f3 = f2;
                i11 = i3 & 64;
                if (i11 != 0) {
                    if ((1572864 & i2) == 0) {
                        c82Var2 = c82Var;
                        if (l46Var.g(c82Var2)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                        i4 |= i12;
                    }
                    i13 = i4;
                    if ((i4 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (l46Var.W(i13 & 1, z)) {
                        j09VarB = g09.a;
                        if (i14 != 0) {
                            j09Var4 = j09VarB;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i5 != 0) {
                            yiVar3 = ndb.f;
                        } else {
                            yiVar3 = yiVar;
                        }
                        if (i7 != 0) {
                            bn2Var4 = an2.b;
                        } else {
                            bn2Var4 = bn2Var2;
                        }
                        if (i9 != 0) {
                            f5 = 1.0f;
                        } else {
                            f5 = f3;
                        }
                        if (i11 != 0) {
                            c82Var4 = null;
                        } else {
                            c82Var4 = c82Var2;
                        }
                        i8cVar = sf2.a;
                        if (str != null) {
                            l46Var.f0(1899222916);
                            if ((i13 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objR2 = l46Var.R();
                            if (z2) {
                                objR2 = new bt5(str, 8);
                                l46Var.p0(objR2);
                            } else {
                                objR2 = new bt5(str, 8);
                                l46Var.p0(objR2);
                            }
                            j09VarB = vwc.b(j09VarB, false, (a26) objR2);
                            l46Var.r(false);
                        } else {
                            l46Var.f0(1899381698);
                            l46Var.r(false);
                        }
                        yi yiVar112 = yiVar3;
                        j09 j09Var113 = j09Var4;
                        j09 j09VarA19 = a.a(oa7.F(j09Var4.D(j09VarB)), fy9Var, yiVar112, bn2Var4, f5, c82Var4, 2);
                        objR = l46Var.R();
                        if (objR == i8cVar) {
                            objR = mr.i;
                            l46Var.p0(objR);
                        }
                        xn8 xn8Var19 = (xn8) objR;
                        int iHashCode19 = Long.hashCode(l46Var.T);
                        j09 j09VarJ19 = m93.J(l46Var, j09VarA19);
                        u8a u8aVarM19 = l46Var.m();
                        lf2.q.getClass();
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(LayoutNode.h1);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(hj6.z, l46Var, xn8Var19);
                        dec.l(hj6.y, l46Var, u8aVarM19);
                        dec.k(l46Var);
                        dec.l(hj6.x, l46Var, j09VarJ19);
                        dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode19));
                        l46Var.r(true);
                        f4 = f5;
                        c82Var3 = c82Var4;
                        yiVar2 = yiVar112;
                        bn2Var3 = bn2Var4;
                        j09Var3 = j09Var113;
                    } else {
                        l46Var.Z();
                        j09Var3 = j09Var2;
                        bn2Var3 = bn2Var2;
                        f4 = f3;
                        c82Var3 = c82Var2;
                        yiVar2 = yiVar;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new t70(fy9Var, str, j09Var3, yiVar2, bn2Var3, f4, c82Var3, i2, i3);
                    }
                }
                i4 |= 1572864;
                c82Var2 = c82Var;
                i13 = i4;
                if ((i4 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (l46Var.W(i13 & 1, z)) {
                    j09VarB = g09.a;
                    if (i14 != 0) {
                        j09Var4 = j09VarB;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i5 != 0) {
                        yiVar3 = ndb.f;
                    } else {
                        yiVar3 = yiVar;
                    }
                    if (i7 != 0) {
                        bn2Var4 = an2.b;
                    } else {
                        bn2Var4 = bn2Var2;
                    }
                    if (i9 != 0) {
                        f5 = 1.0f;
                    } else {
                        f5 = f3;
                    }
                    if (i11 != 0) {
                        c82Var4 = null;
                    } else {
                        c82Var4 = c82Var2;
                    }
                    i8cVar = sf2.a;
                    if (str != null) {
                        l46Var.f0(1899222916);
                        if ((i13 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objR2 = l46Var.R();
                        if (z2) {
                            objR2 = new bt5(str, 8);
                            l46Var.p0(objR2);
                        } else {
                            objR2 = new bt5(str, 8);
                            l46Var.p0(objR2);
                        }
                        j09VarB = vwc.b(j09VarB, false, (a26) objR2);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(1899381698);
                        l46Var.r(false);
                    }
                    yi yiVar113 = yiVar3;
                    j09 j09Var114 = j09Var4;
                    j09 j09VarA110 = a.a(oa7.F(j09Var4.D(j09VarB)), fy9Var, yiVar113, bn2Var4, f5, c82Var4, 2);
                    objR = l46Var.R();
                    if (objR == i8cVar) {
                        objR = mr.i;
                        l46Var.p0(objR);
                    }
                    xn8 xn8Var110 = (xn8) objR;
                    int iHashCode110 = Long.hashCode(l46Var.T);
                    j09 j09VarJ110 = m93.J(l46Var, j09VarA110);
                    u8a u8aVarM110 = l46Var.m();
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(LayoutNode.h1);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, xn8Var110);
                    dec.l(hj6.y, l46Var, u8aVarM110);
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ110);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode110));
                    l46Var.r(true);
                    f4 = f5;
                    c82Var3 = c82Var4;
                    yiVar2 = yiVar113;
                    bn2Var3 = bn2Var4;
                    j09Var3 = j09Var114;
                } else {
                    l46Var.Z();
                    j09Var3 = j09Var2;
                    bn2Var3 = bn2Var2;
                    f4 = f3;
                    c82Var3 = c82Var2;
                    yiVar2 = yiVar;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new t70(fy9Var, str, j09Var3, yiVar2, bn2Var3, f4, c82Var3, i2, i3);
                }
            }
            i4 |= 24576;
            bn2Var2 = bn2Var;
            i9 = i3 & 32;
            if (i9 != 0) {
                if ((196608 & i2) == 0) {
                    f3 = f2;
                    if (l46Var.d(f3)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i4 |= i10;
                }
                i11 = i3 & 64;
                if (i11 != 0) {
                    if ((1572864 & i2) == 0) {
                        c82Var2 = c82Var;
                        if (l46Var.g(c82Var2)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                        i4 |= i12;
                    }
                    i13 = i4;
                    if ((i4 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (l46Var.W(i13 & 1, z)) {
                        j09VarB = g09.a;
                        if (i14 != 0) {
                            j09Var4 = j09VarB;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i5 != 0) {
                            yiVar3 = ndb.f;
                        } else {
                            yiVar3 = yiVar;
                        }
                        if (i7 != 0) {
                            bn2Var4 = an2.b;
                        } else {
                            bn2Var4 = bn2Var2;
                        }
                        if (i9 != 0) {
                            f5 = 1.0f;
                        } else {
                            f5 = f3;
                        }
                        if (i11 != 0) {
                            c82Var4 = null;
                        } else {
                            c82Var4 = c82Var2;
                        }
                        i8cVar = sf2.a;
                        if (str != null) {
                            l46Var.f0(1899222916);
                            if ((i13 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objR2 = l46Var.R();
                            if (z2) {
                                objR2 = new bt5(str, 8);
                                l46Var.p0(objR2);
                            } else {
                                objR2 = new bt5(str, 8);
                                l46Var.p0(objR2);
                            }
                            j09VarB = vwc.b(j09VarB, false, (a26) objR2);
                            l46Var.r(false);
                        } else {
                            l46Var.f0(1899381698);
                            l46Var.r(false);
                        }
                        yi yiVar114 = yiVar3;
                        j09 j09Var115 = j09Var4;
                        j09 j09VarA111 = a.a(oa7.F(j09Var4.D(j09VarB)), fy9Var, yiVar114, bn2Var4, f5, c82Var4, 2);
                        objR = l46Var.R();
                        if (objR == i8cVar) {
                            objR = mr.i;
                            l46Var.p0(objR);
                        }
                        xn8 xn8Var111 = (xn8) objR;
                        int iHashCode111 = Long.hashCode(l46Var.T);
                        j09 j09VarJ111 = m93.J(l46Var, j09VarA111);
                        u8a u8aVarM111 = l46Var.m();
                        lf2.q.getClass();
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(LayoutNode.h1);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(hj6.z, l46Var, xn8Var111);
                        dec.l(hj6.y, l46Var, u8aVarM111);
                        dec.k(l46Var);
                        dec.l(hj6.x, l46Var, j09VarJ111);
                        dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode111));
                        l46Var.r(true);
                        f4 = f5;
                        c82Var3 = c82Var4;
                        yiVar2 = yiVar114;
                        bn2Var3 = bn2Var4;
                        j09Var3 = j09Var115;
                    } else {
                        l46Var.Z();
                        j09Var3 = j09Var2;
                        bn2Var3 = bn2Var2;
                        f4 = f3;
                        c82Var3 = c82Var2;
                        yiVar2 = yiVar;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new t70(fy9Var, str, j09Var3, yiVar2, bn2Var3, f4, c82Var3, i2, i3);
                    }
                }
                i4 |= 1572864;
                c82Var2 = c82Var;
                i13 = i4;
                if ((i4 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (l46Var.W(i13 & 1, z)) {
                    j09VarB = g09.a;
                    if (i14 != 0) {
                        j09Var4 = j09VarB;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i5 != 0) {
                        yiVar3 = ndb.f;
                    } else {
                        yiVar3 = yiVar;
                    }
                    if (i7 != 0) {
                        bn2Var4 = an2.b;
                    } else {
                        bn2Var4 = bn2Var2;
                    }
                    if (i9 != 0) {
                        f5 = 1.0f;
                    } else {
                        f5 = f3;
                    }
                    if (i11 != 0) {
                        c82Var4 = null;
                    } else {
                        c82Var4 = c82Var2;
                    }
                    i8cVar = sf2.a;
                    if (str != null) {
                        l46Var.f0(1899222916);
                        if ((i13 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objR2 = l46Var.R();
                        if (z2) {
                            objR2 = new bt5(str, 8);
                            l46Var.p0(objR2);
                        } else {
                            objR2 = new bt5(str, 8);
                            l46Var.p0(objR2);
                        }
                        j09VarB = vwc.b(j09VarB, false, (a26) objR2);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(1899381698);
                        l46Var.r(false);
                    }
                    yi yiVar115 = yiVar3;
                    j09 j09Var116 = j09Var4;
                    j09 j09VarA112 = a.a(oa7.F(j09Var4.D(j09VarB)), fy9Var, yiVar115, bn2Var4, f5, c82Var4, 2);
                    objR = l46Var.R();
                    if (objR == i8cVar) {
                        objR = mr.i;
                        l46Var.p0(objR);
                    }
                    xn8 xn8Var112 = (xn8) objR;
                    int iHashCode112 = Long.hashCode(l46Var.T);
                    j09 j09VarJ112 = m93.J(l46Var, j09VarA112);
                    u8a u8aVarM112 = l46Var.m();
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(LayoutNode.h1);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, xn8Var112);
                    dec.l(hj6.y, l46Var, u8aVarM112);
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ112);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode112));
                    l46Var.r(true);
                    f4 = f5;
                    c82Var3 = c82Var4;
                    yiVar2 = yiVar115;
                    bn2Var3 = bn2Var4;
                    j09Var3 = j09Var116;
                } else {
                    l46Var.Z();
                    j09Var3 = j09Var2;
                    bn2Var3 = bn2Var2;
                    f4 = f3;
                    c82Var3 = c82Var2;
                    yiVar2 = yiVar;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new t70(fy9Var, str, j09Var3, yiVar2, bn2Var3, f4, c82Var3, i2, i3);
                }
            }
            i4 |= 196608;
            f3 = f2;
            i11 = i3 & 64;
            if (i11 != 0) {
                if ((1572864 & i2) == 0) {
                    c82Var2 = c82Var;
                    if (l46Var.g(c82Var2)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                    i4 |= i12;
                }
                i13 = i4;
                if ((i4 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (l46Var.W(i13 & 1, z)) {
                    j09VarB = g09.a;
                    if (i14 != 0) {
                        j09Var4 = j09VarB;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i5 != 0) {
                        yiVar3 = ndb.f;
                    } else {
                        yiVar3 = yiVar;
                    }
                    if (i7 != 0) {
                        bn2Var4 = an2.b;
                    } else {
                        bn2Var4 = bn2Var2;
                    }
                    if (i9 != 0) {
                        f5 = 1.0f;
                    } else {
                        f5 = f3;
                    }
                    if (i11 != 0) {
                        c82Var4 = null;
                    } else {
                        c82Var4 = c82Var2;
                    }
                    i8cVar = sf2.a;
                    if (str != null) {
                        l46Var.f0(1899222916);
                        if ((i13 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objR2 = l46Var.R();
                        if (z2) {
                            objR2 = new bt5(str, 8);
                            l46Var.p0(objR2);
                        } else {
                            objR2 = new bt5(str, 8);
                            l46Var.p0(objR2);
                        }
                        j09VarB = vwc.b(j09VarB, false, (a26) objR2);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(1899381698);
                        l46Var.r(false);
                    }
                    yi yiVar116 = yiVar3;
                    j09 j09Var117 = j09Var4;
                    j09 j09VarA113 = a.a(oa7.F(j09Var4.D(j09VarB)), fy9Var, yiVar116, bn2Var4, f5, c82Var4, 2);
                    objR = l46Var.R();
                    if (objR == i8cVar) {
                        objR = mr.i;
                        l46Var.p0(objR);
                    }
                    xn8 xn8Var113 = (xn8) objR;
                    int iHashCode113 = Long.hashCode(l46Var.T);
                    j09 j09VarJ113 = m93.J(l46Var, j09VarA113);
                    u8a u8aVarM113 = l46Var.m();
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(LayoutNode.h1);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, xn8Var113);
                    dec.l(hj6.y, l46Var, u8aVarM113);
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ113);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode113));
                    l46Var.r(true);
                    f4 = f5;
                    c82Var3 = c82Var4;
                    yiVar2 = yiVar116;
                    bn2Var3 = bn2Var4;
                    j09Var3 = j09Var117;
                } else {
                    l46Var.Z();
                    j09Var3 = j09Var2;
                    bn2Var3 = bn2Var2;
                    f4 = f3;
                    c82Var3 = c82Var2;
                    yiVar2 = yiVar;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new t70(fy9Var, str, j09Var3, yiVar2, bn2Var3, f4, c82Var3, i2, i3);
                }
            }
            i4 |= 1572864;
            c82Var2 = c82Var;
            i13 = i4;
            if ((i4 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i13 & 1, z)) {
                j09VarB = g09.a;
                if (i14 != 0) {
                    j09Var4 = j09VarB;
                } else {
                    j09Var4 = j09Var2;
                }
                if (i5 != 0) {
                    yiVar3 = ndb.f;
                } else {
                    yiVar3 = yiVar;
                }
                if (i7 != 0) {
                    bn2Var4 = an2.b;
                } else {
                    bn2Var4 = bn2Var2;
                }
                if (i9 != 0) {
                    f5 = 1.0f;
                } else {
                    f5 = f3;
                }
                if (i11 != 0) {
                    c82Var4 = null;
                } else {
                    c82Var4 = c82Var2;
                }
                i8cVar = sf2.a;
                if (str != null) {
                    l46Var.f0(1899222916);
                    if ((i13 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objR2 = l46Var.R();
                    if (z2) {
                        objR2 = new bt5(str, 8);
                        l46Var.p0(objR2);
                    } else {
                        objR2 = new bt5(str, 8);
                        l46Var.p0(objR2);
                    }
                    j09VarB = vwc.b(j09VarB, false, (a26) objR2);
                    l46Var.r(false);
                } else {
                    l46Var.f0(1899381698);
                    l46Var.r(false);
                }
                yi yiVar117 = yiVar3;
                j09 j09Var118 = j09Var4;
                j09 j09VarA114 = a.a(oa7.F(j09Var4.D(j09VarB)), fy9Var, yiVar117, bn2Var4, f5, c82Var4, 2);
                objR = l46Var.R();
                if (objR == i8cVar) {
                    objR = mr.i;
                    l46Var.p0(objR);
                }
                xn8 xn8Var114 = (xn8) objR;
                int iHashCode114 = Long.hashCode(l46Var.T);
                j09 j09VarJ114 = m93.J(l46Var, j09VarA114);
                u8a u8aVarM114 = l46Var.m();
                lf2.q.getClass();
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(LayoutNode.h1);
                } else {
                    l46Var.s0();
                }
                dec.l(hj6.z, l46Var, xn8Var114);
                dec.l(hj6.y, l46Var, u8aVarM114);
                dec.k(l46Var);
                dec.l(hj6.x, l46Var, j09VarJ114);
                dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode114));
                l46Var.r(true);
                f4 = f5;
                c82Var3 = c82Var4;
                yiVar2 = yiVar117;
                bn2Var3 = bn2Var4;
                j09Var3 = j09Var118;
            } else {
                l46Var.Z();
                j09Var3 = j09Var2;
                bn2Var3 = bn2Var2;
                f4 = f3;
                c82Var3 = c82Var2;
                yiVar2 = yiVar;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new t70(fy9Var, str, j09Var3, yiVar2, bn2Var3, f4, c82Var3, i2, i3);
            }
        }
        i4 |= 3072;
        i7 = i3 & 16;
        if (i7 != 0) {
            if ((i2 & 24576) == 0) {
                bn2Var2 = bn2Var;
                if (l46Var.g(bn2Var2)) {
                    i8 = 16384;
                } else {
                    i8 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i4 |= i8;
            }
            i9 = i3 & 32;
            if (i9 != 0) {
                if ((196608 & i2) == 0) {
                    f3 = f2;
                    if (l46Var.d(f3)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i4 |= i10;
                }
                i11 = i3 & 64;
                if (i11 != 0) {
                    if ((1572864 & i2) == 0) {
                        c82Var2 = c82Var;
                        if (l46Var.g(c82Var2)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                        i4 |= i12;
                    }
                    i13 = i4;
                    if ((i4 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (l46Var.W(i13 & 1, z)) {
                        j09VarB = g09.a;
                        if (i14 != 0) {
                            j09Var4 = j09VarB;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i5 != 0) {
                            yiVar3 = ndb.f;
                        } else {
                            yiVar3 = yiVar;
                        }
                        if (i7 != 0) {
                            bn2Var4 = an2.b;
                        } else {
                            bn2Var4 = bn2Var2;
                        }
                        if (i9 != 0) {
                            f5 = 1.0f;
                        } else {
                            f5 = f3;
                        }
                        if (i11 != 0) {
                            c82Var4 = null;
                        } else {
                            c82Var4 = c82Var2;
                        }
                        i8cVar = sf2.a;
                        if (str != null) {
                            l46Var.f0(1899222916);
                            if ((i13 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objR2 = l46Var.R();
                            if (z2) {
                                objR2 = new bt5(str, 8);
                                l46Var.p0(objR2);
                            } else {
                                objR2 = new bt5(str, 8);
                                l46Var.p0(objR2);
                            }
                            j09VarB = vwc.b(j09VarB, false, (a26) objR2);
                            l46Var.r(false);
                        } else {
                            l46Var.f0(1899381698);
                            l46Var.r(false);
                        }
                        yi yiVar118 = yiVar3;
                        j09 j09Var119 = j09Var4;
                        j09 j09VarA115 = a.a(oa7.F(j09Var4.D(j09VarB)), fy9Var, yiVar118, bn2Var4, f5, c82Var4, 2);
                        objR = l46Var.R();
                        if (objR == i8cVar) {
                            objR = mr.i;
                            l46Var.p0(objR);
                        }
                        xn8 xn8Var115 = (xn8) objR;
                        int iHashCode115 = Long.hashCode(l46Var.T);
                        j09 j09VarJ115 = m93.J(l46Var, j09VarA115);
                        u8a u8aVarM115 = l46Var.m();
                        lf2.q.getClass();
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(LayoutNode.h1);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(hj6.z, l46Var, xn8Var115);
                        dec.l(hj6.y, l46Var, u8aVarM115);
                        dec.k(l46Var);
                        dec.l(hj6.x, l46Var, j09VarJ115);
                        dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode115));
                        l46Var.r(true);
                        f4 = f5;
                        c82Var3 = c82Var4;
                        yiVar2 = yiVar118;
                        bn2Var3 = bn2Var4;
                        j09Var3 = j09Var119;
                    } else {
                        l46Var.Z();
                        j09Var3 = j09Var2;
                        bn2Var3 = bn2Var2;
                        f4 = f3;
                        c82Var3 = c82Var2;
                        yiVar2 = yiVar;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new t70(fy9Var, str, j09Var3, yiVar2, bn2Var3, f4, c82Var3, i2, i3);
                    }
                }
                i4 |= 1572864;
                c82Var2 = c82Var;
                i13 = i4;
                if ((i4 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (l46Var.W(i13 & 1, z)) {
                    j09VarB = g09.a;
                    if (i14 != 0) {
                        j09Var4 = j09VarB;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i5 != 0) {
                        yiVar3 = ndb.f;
                    } else {
                        yiVar3 = yiVar;
                    }
                    if (i7 != 0) {
                        bn2Var4 = an2.b;
                    } else {
                        bn2Var4 = bn2Var2;
                    }
                    if (i9 != 0) {
                        f5 = 1.0f;
                    } else {
                        f5 = f3;
                    }
                    if (i11 != 0) {
                        c82Var4 = null;
                    } else {
                        c82Var4 = c82Var2;
                    }
                    i8cVar = sf2.a;
                    if (str != null) {
                        l46Var.f0(1899222916);
                        if ((i13 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objR2 = l46Var.R();
                        if (z2) {
                            objR2 = new bt5(str, 8);
                            l46Var.p0(objR2);
                        } else {
                            objR2 = new bt5(str, 8);
                            l46Var.p0(objR2);
                        }
                        j09VarB = vwc.b(j09VarB, false, (a26) objR2);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(1899381698);
                        l46Var.r(false);
                    }
                    yi yiVar119 = yiVar3;
                    j09 j09Var1110 = j09Var4;
                    j09 j09VarA116 = a.a(oa7.F(j09Var4.D(j09VarB)), fy9Var, yiVar119, bn2Var4, f5, c82Var4, 2);
                    objR = l46Var.R();
                    if (objR == i8cVar) {
                        objR = mr.i;
                        l46Var.p0(objR);
                    }
                    xn8 xn8Var116 = (xn8) objR;
                    int iHashCode116 = Long.hashCode(l46Var.T);
                    j09 j09VarJ116 = m93.J(l46Var, j09VarA116);
                    u8a u8aVarM116 = l46Var.m();
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(LayoutNode.h1);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, xn8Var116);
                    dec.l(hj6.y, l46Var, u8aVarM116);
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ116);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode116));
                    l46Var.r(true);
                    f4 = f5;
                    c82Var3 = c82Var4;
                    yiVar2 = yiVar119;
                    bn2Var3 = bn2Var4;
                    j09Var3 = j09Var1110;
                } else {
                    l46Var.Z();
                    j09Var3 = j09Var2;
                    bn2Var3 = bn2Var2;
                    f4 = f3;
                    c82Var3 = c82Var2;
                    yiVar2 = yiVar;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new t70(fy9Var, str, j09Var3, yiVar2, bn2Var3, f4, c82Var3, i2, i3);
                }
            }
            i4 |= 196608;
            f3 = f2;
            i11 = i3 & 64;
            if (i11 != 0) {
                if ((1572864 & i2) == 0) {
                    c82Var2 = c82Var;
                    if (l46Var.g(c82Var2)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                    i4 |= i12;
                }
                i13 = i4;
                if ((i4 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (l46Var.W(i13 & 1, z)) {
                    j09VarB = g09.a;
                    if (i14 != 0) {
                        j09Var4 = j09VarB;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i5 != 0) {
                        yiVar3 = ndb.f;
                    } else {
                        yiVar3 = yiVar;
                    }
                    if (i7 != 0) {
                        bn2Var4 = an2.b;
                    } else {
                        bn2Var4 = bn2Var2;
                    }
                    if (i9 != 0) {
                        f5 = 1.0f;
                    } else {
                        f5 = f3;
                    }
                    if (i11 != 0) {
                        c82Var4 = null;
                    } else {
                        c82Var4 = c82Var2;
                    }
                    i8cVar = sf2.a;
                    if (str != null) {
                        l46Var.f0(1899222916);
                        if ((i13 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objR2 = l46Var.R();
                        if (z2) {
                            objR2 = new bt5(str, 8);
                            l46Var.p0(objR2);
                        } else {
                            objR2 = new bt5(str, 8);
                            l46Var.p0(objR2);
                        }
                        j09VarB = vwc.b(j09VarB, false, (a26) objR2);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(1899381698);
                        l46Var.r(false);
                    }
                    yi yiVar1110 = yiVar3;
                    j09 j09Var1111 = j09Var4;
                    j09 j09VarA117 = a.a(oa7.F(j09Var4.D(j09VarB)), fy9Var, yiVar1110, bn2Var4, f5, c82Var4, 2);
                    objR = l46Var.R();
                    if (objR == i8cVar) {
                        objR = mr.i;
                        l46Var.p0(objR);
                    }
                    xn8 xn8Var117 = (xn8) objR;
                    int iHashCode117 = Long.hashCode(l46Var.T);
                    j09 j09VarJ117 = m93.J(l46Var, j09VarA117);
                    u8a u8aVarM117 = l46Var.m();
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(LayoutNode.h1);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, xn8Var117);
                    dec.l(hj6.y, l46Var, u8aVarM117);
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ117);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode117));
                    l46Var.r(true);
                    f4 = f5;
                    c82Var3 = c82Var4;
                    yiVar2 = yiVar1110;
                    bn2Var3 = bn2Var4;
                    j09Var3 = j09Var1111;
                } else {
                    l46Var.Z();
                    j09Var3 = j09Var2;
                    bn2Var3 = bn2Var2;
                    f4 = f3;
                    c82Var3 = c82Var2;
                    yiVar2 = yiVar;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new t70(fy9Var, str, j09Var3, yiVar2, bn2Var3, f4, c82Var3, i2, i3);
                }
            }
            i4 |= 1572864;
            c82Var2 = c82Var;
            i13 = i4;
            if ((i4 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i13 & 1, z)) {
                j09VarB = g09.a;
                if (i14 != 0) {
                    j09Var4 = j09VarB;
                } else {
                    j09Var4 = j09Var2;
                }
                if (i5 != 0) {
                    yiVar3 = ndb.f;
                } else {
                    yiVar3 = yiVar;
                }
                if (i7 != 0) {
                    bn2Var4 = an2.b;
                } else {
                    bn2Var4 = bn2Var2;
                }
                if (i9 != 0) {
                    f5 = 1.0f;
                } else {
                    f5 = f3;
                }
                if (i11 != 0) {
                    c82Var4 = null;
                } else {
                    c82Var4 = c82Var2;
                }
                i8cVar = sf2.a;
                if (str != null) {
                    l46Var.f0(1899222916);
                    if ((i13 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objR2 = l46Var.R();
                    if (z2) {
                        objR2 = new bt5(str, 8);
                        l46Var.p0(objR2);
                    } else {
                        objR2 = new bt5(str, 8);
                        l46Var.p0(objR2);
                    }
                    j09VarB = vwc.b(j09VarB, false, (a26) objR2);
                    l46Var.r(false);
                } else {
                    l46Var.f0(1899381698);
                    l46Var.r(false);
                }
                yi yiVar1111 = yiVar3;
                j09 j09Var1112 = j09Var4;
                j09 j09VarA118 = a.a(oa7.F(j09Var4.D(j09VarB)), fy9Var, yiVar1111, bn2Var4, f5, c82Var4, 2);
                objR = l46Var.R();
                if (objR == i8cVar) {
                    objR = mr.i;
                    l46Var.p0(objR);
                }
                xn8 xn8Var118 = (xn8) objR;
                int iHashCode118 = Long.hashCode(l46Var.T);
                j09 j09VarJ118 = m93.J(l46Var, j09VarA118);
                u8a u8aVarM118 = l46Var.m();
                lf2.q.getClass();
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(LayoutNode.h1);
                } else {
                    l46Var.s0();
                }
                dec.l(hj6.z, l46Var, xn8Var118);
                dec.l(hj6.y, l46Var, u8aVarM118);
                dec.k(l46Var);
                dec.l(hj6.x, l46Var, j09VarJ118);
                dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode118));
                l46Var.r(true);
                f4 = f5;
                c82Var3 = c82Var4;
                yiVar2 = yiVar1111;
                bn2Var3 = bn2Var4;
                j09Var3 = j09Var1112;
            } else {
                l46Var.Z();
                j09Var3 = j09Var2;
                bn2Var3 = bn2Var2;
                f4 = f3;
                c82Var3 = c82Var2;
                yiVar2 = yiVar;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new t70(fy9Var, str, j09Var3, yiVar2, bn2Var3, f4, c82Var3, i2, i3);
            }
        }
        i4 |= 24576;
        bn2Var2 = bn2Var;
        i9 = i3 & 32;
        if (i9 != 0) {
            if ((196608 & i2) == 0) {
                f3 = f2;
                if (l46Var.d(f3)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i4 |= i10;
            }
            i11 = i3 & 64;
            if (i11 != 0) {
                if ((1572864 & i2) == 0) {
                    c82Var2 = c82Var;
                    if (l46Var.g(c82Var2)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                    i4 |= i12;
                }
                i13 = i4;
                if ((i4 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (l46Var.W(i13 & 1, z)) {
                    j09VarB = g09.a;
                    if (i14 != 0) {
                        j09Var4 = j09VarB;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i5 != 0) {
                        yiVar3 = ndb.f;
                    } else {
                        yiVar3 = yiVar;
                    }
                    if (i7 != 0) {
                        bn2Var4 = an2.b;
                    } else {
                        bn2Var4 = bn2Var2;
                    }
                    if (i9 != 0) {
                        f5 = 1.0f;
                    } else {
                        f5 = f3;
                    }
                    if (i11 != 0) {
                        c82Var4 = null;
                    } else {
                        c82Var4 = c82Var2;
                    }
                    i8cVar = sf2.a;
                    if (str != null) {
                        l46Var.f0(1899222916);
                        if ((i13 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objR2 = l46Var.R();
                        if (z2) {
                            objR2 = new bt5(str, 8);
                            l46Var.p0(objR2);
                        } else {
                            objR2 = new bt5(str, 8);
                            l46Var.p0(objR2);
                        }
                        j09VarB = vwc.b(j09VarB, false, (a26) objR2);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(1899381698);
                        l46Var.r(false);
                    }
                    yi yiVar1112 = yiVar3;
                    j09 j09Var1113 = j09Var4;
                    j09 j09VarA119 = a.a(oa7.F(j09Var4.D(j09VarB)), fy9Var, yiVar1112, bn2Var4, f5, c82Var4, 2);
                    objR = l46Var.R();
                    if (objR == i8cVar) {
                        objR = mr.i;
                        l46Var.p0(objR);
                    }
                    xn8 xn8Var119 = (xn8) objR;
                    int iHashCode119 = Long.hashCode(l46Var.T);
                    j09 j09VarJ119 = m93.J(l46Var, j09VarA119);
                    u8a u8aVarM119 = l46Var.m();
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(LayoutNode.h1);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, xn8Var119);
                    dec.l(hj6.y, l46Var, u8aVarM119);
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ119);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode119));
                    l46Var.r(true);
                    f4 = f5;
                    c82Var3 = c82Var4;
                    yiVar2 = yiVar1112;
                    bn2Var3 = bn2Var4;
                    j09Var3 = j09Var1113;
                } else {
                    l46Var.Z();
                    j09Var3 = j09Var2;
                    bn2Var3 = bn2Var2;
                    f4 = f3;
                    c82Var3 = c82Var2;
                    yiVar2 = yiVar;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new t70(fy9Var, str, j09Var3, yiVar2, bn2Var3, f4, c82Var3, i2, i3);
                }
            }
            i4 |= 1572864;
            c82Var2 = c82Var;
            i13 = i4;
            if ((i4 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i13 & 1, z)) {
                j09VarB = g09.a;
                if (i14 != 0) {
                    j09Var4 = j09VarB;
                } else {
                    j09Var4 = j09Var2;
                }
                if (i5 != 0) {
                    yiVar3 = ndb.f;
                } else {
                    yiVar3 = yiVar;
                }
                if (i7 != 0) {
                    bn2Var4 = an2.b;
                } else {
                    bn2Var4 = bn2Var2;
                }
                if (i9 != 0) {
                    f5 = 1.0f;
                } else {
                    f5 = f3;
                }
                if (i11 != 0) {
                    c82Var4 = null;
                } else {
                    c82Var4 = c82Var2;
                }
                i8cVar = sf2.a;
                if (str != null) {
                    l46Var.f0(1899222916);
                    if ((i13 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objR2 = l46Var.R();
                    if (z2) {
                        objR2 = new bt5(str, 8);
                        l46Var.p0(objR2);
                    } else {
                        objR2 = new bt5(str, 8);
                        l46Var.p0(objR2);
                    }
                    j09VarB = vwc.b(j09VarB, false, (a26) objR2);
                    l46Var.r(false);
                } else {
                    l46Var.f0(1899381698);
                    l46Var.r(false);
                }
                yi yiVar1113 = yiVar3;
                j09 j09Var1114 = j09Var4;
                j09 j09VarA1110 = a.a(oa7.F(j09Var4.D(j09VarB)), fy9Var, yiVar1113, bn2Var4, f5, c82Var4, 2);
                objR = l46Var.R();
                if (objR == i8cVar) {
                    objR = mr.i;
                    l46Var.p0(objR);
                }
                xn8 xn8Var1110 = (xn8) objR;
                int iHashCode1110 = Long.hashCode(l46Var.T);
                j09 j09VarJ1110 = m93.J(l46Var, j09VarA1110);
                u8a u8aVarM1110 = l46Var.m();
                lf2.q.getClass();
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(LayoutNode.h1);
                } else {
                    l46Var.s0();
                }
                dec.l(hj6.z, l46Var, xn8Var1110);
                dec.l(hj6.y, l46Var, u8aVarM1110);
                dec.k(l46Var);
                dec.l(hj6.x, l46Var, j09VarJ1110);
                dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode1110));
                l46Var.r(true);
                f4 = f5;
                c82Var3 = c82Var4;
                yiVar2 = yiVar1113;
                bn2Var3 = bn2Var4;
                j09Var3 = j09Var1114;
            } else {
                l46Var.Z();
                j09Var3 = j09Var2;
                bn2Var3 = bn2Var2;
                f4 = f3;
                c82Var3 = c82Var2;
                yiVar2 = yiVar;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new t70(fy9Var, str, j09Var3, yiVar2, bn2Var3, f4, c82Var3, i2, i3);
            }
        }
        i4 |= 196608;
        f3 = f2;
        i11 = i3 & 64;
        if (i11 != 0) {
            if ((1572864 & i2) == 0) {
                c82Var2 = c82Var;
                if (l46Var.g(c82Var2)) {
                    i12 = 1048576;
                } else {
                    i12 = 524288;
                }
                i4 |= i12;
            }
            i13 = i4;
            if ((i4 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i13 & 1, z)) {
                j09VarB = g09.a;
                if (i14 != 0) {
                    j09Var4 = j09VarB;
                } else {
                    j09Var4 = j09Var2;
                }
                if (i5 != 0) {
                    yiVar3 = ndb.f;
                } else {
                    yiVar3 = yiVar;
                }
                if (i7 != 0) {
                    bn2Var4 = an2.b;
                } else {
                    bn2Var4 = bn2Var2;
                }
                if (i9 != 0) {
                    f5 = 1.0f;
                } else {
                    f5 = f3;
                }
                if (i11 != 0) {
                    c82Var4 = null;
                } else {
                    c82Var4 = c82Var2;
                }
                i8cVar = sf2.a;
                if (str != null) {
                    l46Var.f0(1899222916);
                    if ((i13 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objR2 = l46Var.R();
                    if (z2) {
                        objR2 = new bt5(str, 8);
                        l46Var.p0(objR2);
                    } else {
                        objR2 = new bt5(str, 8);
                        l46Var.p0(objR2);
                    }
                    j09VarB = vwc.b(j09VarB, false, (a26) objR2);
                    l46Var.r(false);
                } else {
                    l46Var.f0(1899381698);
                    l46Var.r(false);
                }
                yi yiVar1114 = yiVar3;
                j09 j09Var1115 = j09Var4;
                j09 j09VarA1111 = a.a(oa7.F(j09Var4.D(j09VarB)), fy9Var, yiVar1114, bn2Var4, f5, c82Var4, 2);
                objR = l46Var.R();
                if (objR == i8cVar) {
                    objR = mr.i;
                    l46Var.p0(objR);
                }
                xn8 xn8Var1111 = (xn8) objR;
                int iHashCode1111 = Long.hashCode(l46Var.T);
                j09 j09VarJ1111 = m93.J(l46Var, j09VarA1111);
                u8a u8aVarM1111 = l46Var.m();
                lf2.q.getClass();
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(LayoutNode.h1);
                } else {
                    l46Var.s0();
                }
                dec.l(hj6.z, l46Var, xn8Var1111);
                dec.l(hj6.y, l46Var, u8aVarM1111);
                dec.k(l46Var);
                dec.l(hj6.x, l46Var, j09VarJ1111);
                dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode1111));
                l46Var.r(true);
                f4 = f5;
                c82Var3 = c82Var4;
                yiVar2 = yiVar1114;
                bn2Var3 = bn2Var4;
                j09Var3 = j09Var1115;
            } else {
                l46Var.Z();
                j09Var3 = j09Var2;
                bn2Var3 = bn2Var2;
                f4 = f3;
                c82Var3 = c82Var2;
                yiVar2 = yiVar;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new t70(fy9Var, str, j09Var3, yiVar2, bn2Var3, f4, c82Var3, i2, i3);
            }
        }
        i4 |= 1572864;
        c82Var2 = c82Var;
        i13 = i4;
        if ((i4 & 599187) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (l46Var.W(i13 & 1, z)) {
            j09VarB = g09.a;
            if (i14 != 0) {
                j09Var4 = j09VarB;
            } else {
                j09Var4 = j09Var2;
            }
            if (i5 != 0) {
                yiVar3 = ndb.f;
            } else {
                yiVar3 = yiVar;
            }
            if (i7 != 0) {
                bn2Var4 = an2.b;
            } else {
                bn2Var4 = bn2Var2;
            }
            if (i9 != 0) {
                f5 = 1.0f;
            } else {
                f5 = f3;
            }
            if (i11 != 0) {
                c82Var4 = null;
            } else {
                c82Var4 = c82Var2;
            }
            i8cVar = sf2.a;
            if (str != null) {
                l46Var.f0(1899222916);
                if ((i13 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objR2 = l46Var.R();
                if (z2) {
                    objR2 = new bt5(str, 8);
                    l46Var.p0(objR2);
                } else {
                    objR2 = new bt5(str, 8);
                    l46Var.p0(objR2);
                }
                j09VarB = vwc.b(j09VarB, false, (a26) objR2);
                l46Var.r(false);
            } else {
                l46Var.f0(1899381698);
                l46Var.r(false);
            }
            yi yiVar1115 = yiVar3;
            j09 j09Var1116 = j09Var4;
            j09 j09VarA1112 = a.a(oa7.F(j09Var4.D(j09VarB)), fy9Var, yiVar1115, bn2Var4, f5, c82Var4, 2);
            objR = l46Var.R();
            if (objR == i8cVar) {
                objR = mr.i;
                l46Var.p0(objR);
            }
            xn8 xn8Var1112 = (xn8) objR;
            int iHashCode1112 = Long.hashCode(l46Var.T);
            j09 j09VarJ1112 = m93.J(l46Var, j09VarA1112);
            u8a u8aVarM1112 = l46Var.m();
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8Var1112);
            dec.l(hj6.y, l46Var, u8aVarM1112);
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ1112);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode1112));
            l46Var.r(true);
            f4 = f5;
            c82Var3 = c82Var4;
            yiVar2 = yiVar1115;
            bn2Var3 = bn2Var4;
            j09Var3 = j09Var1116;
        } else {
            l46Var.Z();
            j09Var3 = j09Var2;
            bn2Var3 = bn2Var2;
            f4 = f3;
            c82Var3 = c82Var2;
            yiVar2 = yiVar;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new t70(fy9Var, str, j09Var3, yiVar2, bn2Var3, f4, c82Var3, i2, i3);
        }
    }

    public static final void k(cv6 cv6Var, String str, j09 j09Var, bn2 bn2Var, int i2, l46 l46Var, int i3, int i4) {
        lx0 lx0Var = ndb.f;
        if ((i4 & 16) != 0) {
            bn2Var = an2.b;
        }
        bn2 bn2Var2 = bn2Var;
        if ((i4 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            i2 = 1;
        }
        boolean zG = l46Var.g(cv6Var);
        Object objR = l46Var.R();
        if (zG || objR == sf2.a) {
            objR = an1.b(cv6Var, i2);
            l46Var.p0(objR);
        }
        j((BitmapPainter) objR, str, j09Var, lx0Var, bn2Var2, 1.0f, null, l46Var, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3), 0);
    }

    public static final void l(final ma8 ma8Var, boolean z, final x16 x16Var, a26 a26Var, final x16 x16Var2, final a26 a26Var2, l46 l46Var, int i2) {
        int i3;
        boolean z2;
        ma8Var.getClass();
        x16Var.getClass();
        a26Var.getClass();
        x16Var2.getClass();
        a26Var2.getClass();
        l46Var.h0(-1891711750);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.i(ma8Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            z2 = z;
            i3 |= l46Var.h(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i3 |= l46Var.i(a26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i2 & 24576) == 0) {
            i3 |= l46Var.i(x16Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i2) == 0) {
            i3 |= l46Var.i(a26Var2) ? 131072 : 65536;
        }
        int i4 = 1;
        if (l46Var.W(i3 & 1, (74899 & i3) != 74898)) {
            th5 th5Var = cye.b;
            final ma8 ma8VarA = gcc.E(z57.a.a(), fbc.d()).a();
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (objR == obj) {
                objR = q1c.f(Boolean.FALSE);
                l46Var.p0(objR);
            }
            final e89 e89Var = (e89) objR;
            final xf3 xf3VarP = vf3.p(Long.valueOf(gcc.c(ma8Var, cye.b).e()), new a8(ma8VarA, i4), l46Var, 14);
            e89 e89VarI = q1c.i(a26Var, l46Var);
            final e89 e89VarI2 = q1c.i(x16Var, l46Var);
            boolean zG = l46Var.g(xf3VarP) | l46Var.g(e89VarI2) | l46Var.g(e89VarI);
            Object objR2 = l46Var.R();
            if (zG || objR2 == obj) {
                objR2 = new tn9(xf3VarP, e89VarI2, e89VarI, null);
                l46Var.p0(objR2);
            }
            af1.o((l26) objR2, l46Var, xf3VarP);
            final boolean z3 = z2;
            lmg.J(androidx.compose.foundation.layout.b.c, af1.b0(-1828704605, new l26() { // from class: sn9
                @Override // defpackage.l26
                public final Object z(Object obj2, Object obj3) {
                    l46 l46Var2 = (l46) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                        long j2 = y72.j;
                        boolean z4 = z3;
                        dd2 dd2VarB0 = af1.b0(912087391, new mb0(z4, x16Var2, 4), l46Var2);
                        wf3 wf3Var = xf3VarP;
                        a26 a26Var3 = a26Var2;
                        e89 e89Var2 = e89Var;
                        xdc.a(null, dd2VarB0, af1.b0(-691916482, new o50(z4, wf3Var, a26Var3, e89Var2, 16), l46Var2), null, null, 0, j2, 0L, null, af1.b0(-1360231628, new qi3(wf3Var, ma8Var, e89VarI2, ma8VarA, x16Var, e89Var2), l46Var2), l46Var2, 806879664, 441);
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, 54);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new tg(ma8Var, z, x16Var, a26Var, x16Var2, a26Var2, i2);
        }
    }

    public static final void m(x16 x16Var, x16 x16Var2, l46 l46Var, int i2) {
        Class cls;
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(-496648074);
        int i3 = (l46Var.i(x16Var) ? 4 : 2) | i2 | (l46Var.i(x16Var2) ? 32 : 16);
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            bo9 bo9Var = (bo9) z5c.G(job.a.b(bo9.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), null);
            whb whbVar = bo9Var.v;
            e89 e89VarI = jzb.i(whbVar, whbVar.getValue(), l46Var, 0, 0);
            x48 x48Var = (x48) l46Var.k(cb8.a);
            e89 e89VarI2 = q1c.i(x16Var2, l46Var);
            boolean zI = l46Var.i(x48Var) | l46Var.i(bo9Var) | l46Var.g(e89VarI2);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (zI || objR == obj) {
                objR = new wn9(x48Var, bo9Var, e89VarI2, null);
                l46Var.p0(objR);
            }
            af1.p(bo9Var, x48Var, (l26) objR, l46Var);
            Object[] objArr = new Object[0];
            Object objR2 = l46Var.R();
            if (objR2 == obj) {
                objR2 = new ik9(5);
                l46Var.p0(objR2);
            }
            e89 e89Var = (e89) vfh.I(objArr, (x16) objR2, l46Var, 48);
            ma8 ma8Var = bo9Var.f;
            boolean zBooleanValue = ((Boolean) e89VarI.getValue()).booleanValue();
            boolean zI2 = l46Var.i(bo9Var);
            Object objR3 = l46Var.R();
            if (zI2 || objR3 == obj) {
                cls = bo9.class;
                objR3 = new sk3(0, bo9Var, cls, "markEdited", "markEdited()V", 0, 27);
                l46Var.p0(objR3);
            } else {
                cls = bo9.class;
            }
            x16 x16Var3 = (x16) ((ym7) objR3);
            boolean zI3 = l46Var.i(bo9Var);
            Object objR4 = l46Var.R();
            if (zI3 || objR4 == obj) {
                objR4 = new vx7(1, bo9Var, cls, "select", "select(Lkotlinx/datetime/LocalDate;)V", 0, 8);
                l46Var.p0(objR4);
            }
            a26 a26Var = (a26) ((ym7) objR4);
            boolean zI4 = l46Var.i(bo9Var) | l46Var.g(e89Var);
            Object objR5 = l46Var.R();
            if (zI4 || objR5 == obj) {
                objR5 = new kz8(11, bo9Var, e89Var);
                l46Var.p0(objR5);
            }
            int i4 = 12;
            l(ma8Var, zBooleanValue, x16Var3, a26Var, x16Var, (a26) objR5, l46Var, 57344 & (i3 << 12));
            if (((Boolean) e89Var.getValue()).booleanValue()) {
                l46Var.f0(520371319);
                Object objR6 = l46Var.R();
                if (objR6 == obj) {
                    objR6 = new yn9(2, null);
                    l46Var.p0(objR6);
                }
                af1.o((l26) objR6, l46Var, wef.a);
                boolean zG = l46Var.g(e89Var);
                Object objR7 = l46Var.R();
                if (zG || objR7 == obj) {
                    objR7 = new x08(e89Var, i4);
                    l46Var.p0(objR7);
                }
                n((x16) objR7, l46Var, 0);
                l46Var.r(false);
            } else {
                l46Var.f0(520791276);
                l46Var.r(false);
            }
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b20(i2, 25, x16Var, x16Var2);
        }
    }

    public static final void n(x16 x16Var, l46 l46Var, int i2) {
        l46 l46Var2;
        x16Var.getClass();
        l46Var.h0(-1322215002);
        int i3 = (l46Var.i(x16Var) ? 4 : 2) | i2;
        if (l46Var.W(i3 & 1, (i3 & 3) != 2)) {
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = new ik9(6);
                l46Var.p0(objR);
            }
            l46Var2 = l46Var;
            t72.b((x16) objR, new s84(false, false, false), af1.b0(1849244527, new fi4(21, x16Var), l46Var), l46Var2, 438, 0);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new fi4(i2, 22, x16Var);
        }
    }

    public static final void o(String str, t58 t58Var, j09 j09Var, float f2, final float f3, l46 l46Var, int i2) {
        l46 l46Var2;
        j09 j09Var2;
        float f4;
        final ArrayList arrayList;
        str.getClass();
        l46Var.h0(-1731806327);
        int i3 = i2 | (l46Var.g(str) ? 4 : 2) | (l46Var.g(t58Var) ? 32 : 16) | 3456;
        if (l46Var.W(i3 & 1, (i3 & 9363) != 9362)) {
            ArrayList arrayList2 = t58Var.a;
            final ArrayList arrayList3 = t58Var.b;
            iy9 iy9Var = new iy9(s72.L0(arrayList2), s72.J0(arrayList2));
            final Float f5 = (Float) iy9Var.a();
            final Float f6 = (Float) iy9Var.b();
            if (f5 == null || f6 == null) {
                float f7 = 128.0f;
                ojb ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new r58(str, t58Var, f7, f3, i2);
                    return;
                }
                return;
            }
            final List listI = t72.I(new y72(y72.b(abg.d(4285153521L), 0.1f)), new y72(abg.d(4285153521L)), new y72(abg.d(4285153521L)));
            g09 g09Var = g09.a;
            j09 j09VarB0 = ynb.b0(8.0f, 0.0f, g09Var, 2);
            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var, 0);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarB0);
            lf2.q.getClass();
            l46Var.j0();
            boolean z = l46Var.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var, c92VarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var, numValueOf);
            dec.k(l46Var);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var, j09VarJ);
            j09Var2 = g09Var;
            nte.b(str, ynb.d0(0.0f, 0.0f, 0.0f, 16.0f, 7, g09Var), y72.c, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var, (i3 & 14) | 432, 0, 262136);
            l46Var2 = l46Var;
            float f8 = 1.0f;
            j09 j09VarD = androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(j09Var2, 1.0f), 128.0f);
            boolean zI = l46Var2.i(arrayList2) | l46Var2.g(f6) | l46Var2.g(f5) | l46Var2.i(arrayList3);
            Object objR = l46Var2.R();
            if (zI || objR == sf2.a) {
                arrayList = arrayList2;
                a26 a26Var = new a26() { // from class: s58
                    @Override // defpackage.a26
                    public final Object d(Object obj) {
                        sn4 sn4Var;
                        sn4 sn4Var2 = (sn4) obj;
                        sn4Var2.getClass();
                        char c2 = ' ';
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (sn4Var2.f() >> 32));
                        ArrayList arrayList4 = arrayList;
                        float size = fIntBitsToFloat / (arrayList4.size() - 1);
                        float fFloatValue = f6.floatValue();
                        Float f9 = f5;
                        float fFloatValue2 = fFloatValue - f9.floatValue();
                        float fIntBitsToFloat2 = fFloatValue2 != 0.0f ? (Float.intBitsToFloat((int) (sn4Var2.f() & 4294967295L)) * 0.8f) / fFloatValue2 : 0.0f;
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (sn4Var2.f() & 4294967295L)) * 0.1f;
                        ArrayList arrayList5 = new ArrayList(t72.u(arrayList4, 10));
                        int i4 = 0;
                        int i5 = 0;
                        for (Object obj2 : arrayList4) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                t72.Z();
                                throw null;
                            }
                            char c3 = c2;
                            float f10 = fIntBitsToFloat3;
                            arrayList5.add(new hl9((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (sn4Var2.f() & 4294967295L)) - (((((Number) obj2).floatValue() - f9.floatValue()) * fIntBitsToFloat2) + f10))) & 4294967295L) | (((long) Float.floatToRawIntBits(i5 * size)) << c3)));
                            c2 = c3;
                            i5 = i6;
                            fIntBitsToFloat3 = f10;
                        }
                        char c4 = c2;
                        zt ztVarA = cu.a();
                        if (!arrayList5.isEmpty()) {
                            ztVarA.h(Float.intBitsToFloat((int) (((hl9) s72.v0(arrayList5)).a >> c4)), Float.intBitsToFloat((int) (((hl9) s72.v0(arrayList5)).a & 4294967295L)));
                            int size2 = arrayList5.size() - 1;
                            while (i4 < size2) {
                                long j2 = ((hl9) arrayList5.get(i4)).a;
                                i4++;
                                long j3 = ((hl9) arrayList5.get(i4)).a;
                                int i7 = (int) (j2 >> c4);
                                int i8 = (int) (j3 >> c4);
                                int i9 = (int) (j3 & 4294967295L);
                                ztVarA.a.cubicTo((Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7)) / 2.0f, Float.intBitsToFloat((int) (j2 & 4294967295L)), (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7)) / 2.0f, Float.intBitsToFloat(i9), Float.intBitsToFloat(i8), Float.intBitsToFloat(i9));
                            }
                        }
                        sn4.s(sn4Var2, ztVarA, gec.D(listI), 0.0f, new d5e(f3, 0.0f, 0, 0, null, 30), null, 0, 52);
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            int iIntValue = ((Number) it.next()).intValue();
                            if (iIntValue < 0 || iIntValue >= arrayList5.size()) {
                                sn4Var = sn4Var2;
                            } else {
                                sn4Var = sn4Var2;
                                sn4.w0(sn4Var, y72.e, 10.0f, ((hl9) arrayList5.get(iIntValue)).a, null, 120);
                                sn4.w0(sn4Var, abg.d(4285153521L), 10.0f, ((hl9) arrayList5.get(iIntValue)).a, new d5e(4.0f, 0.0f, 0, 0, null, 30), 104);
                            }
                            sn4Var2 = sn4Var;
                        }
                        return wef.a;
                    }
                };
                l46Var2.p0(a26Var);
                objR = a26Var;
            } else {
                arrayList = arrayList2;
            }
            nk8.e(0, (a26) objR, l46Var2, j09VarD);
            j09 j09VarD0 = ynb.d0(0.0f, 8.0f, 0.0f, 0.0f, 13, androidx.compose.foundation.layout.b.c(j09Var2, 1.0f));
            t7c t7cVarA = s7c.a(xc0.g, ndb.y, l46Var2, 6);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarD0);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, t7cVarA);
            dec.l(he2Var2, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ2);
            l46Var2.f0(237805085);
            int i4 = 0;
            for (Object obj : arrayList) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    t72.Z();
                    throw null;
                }
                ((Number) obj).floatValue();
                nte.b(String.valueOf(i5), new jw7(f8, false), y72.c, w6c.l(12), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var, 24960, 0, 262120);
                l46Var2 = l46Var;
                i4 = i5;
                f8 = f8;
            }
            tec.s(l46Var2, false, true, true);
            f4 = 128.0f;
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
            j09Var2 = j09Var;
            f4 = f2;
        }
        ojb ojbVarV2 = l46Var2.v();
        if (ojbVarV2 != null) {
            ojbVarV2.d = new c12(str, t58Var, j09Var2, f4, f3, i2, 1);
        }
    }

    public static final vza p(vza vzaVar, bu3 bu3Var) {
        vzaVar.getClass();
        bu3Var.getClass();
        if (vzaVar.d0()) {
            return vzaVar.N();
        }
        if (vzaVar.e0()) {
            return bu3Var.a(vzaVar.O());
        }
        return null;
    }

    public static final e8f q(xt7 xt7Var) {
        boolean z;
        jgf jgfVarK0;
        bj5 bj5VarR;
        tjd tjdVarS = db6.s(xt7Var);
        if (tjdVarS == null && ((bj5VarR = db6.r(xt7Var)) == null || (tjdVarS = db6.u0(bj5VarR)) == null)) {
            tjdVarS = db6.s(xt7Var);
            tjdVarS.getClass();
        }
        c8f c8fVarU = db6.U(db6.d1(tjdVarS));
        if (c8fVarU != null) {
            return c8fVarU;
        }
        if (xt7Var instanceof tt7) {
            z = xr7.z((tt7) xt7Var);
        } else {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(xt7Var);
            sb.append(", ");
            qc0.o(tec.j(job.a, xt7Var.getClass(), sb));
            z = false;
        }
        if (z) {
            d7f d7fVar = (d7f) s72.X0(db6.K(xt7Var));
            d7fVar.getClass();
            if (db6.r0(d7fVar)) {
                jgfVarK0 = null;
            } else {
                if (!(d7fVar instanceof i8f)) {
                    StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb2.append(d7fVar);
                    sb2.append(", ");
                    qc0.o(tec.j(job.a, d7fVar.getClass(), sb2));
                    return null;
                }
                jgfVarK0 = ((i8f) d7fVar).b().k0();
            }
            if (jgfVarK0 != null) {
                return q(jgfVarK0);
            }
        }
        return null;
    }

    public static final Bundle r(iy9... iy9VarArr) {
        Bundle bundle = new Bundle(iy9VarArr.length);
        for (iy9 iy9Var : iy9VarArr) {
            String str = (String) iy9Var.a();
            Object objB = iy9Var.b();
            if (objB == null) {
                bundle.putString(str, null);
            } else if (objB instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) objB).booleanValue());
            } else if (objB instanceof Byte) {
                bundle.putByte(str, ((Number) objB).byteValue());
            } else if (objB instanceof Character) {
                bundle.putChar(str, ((Character) objB).charValue());
            } else if (objB instanceof Double) {
                bundle.putDouble(str, ((Number) objB).doubleValue());
            } else if (objB instanceof Float) {
                bundle.putFloat(str, ((Number) objB).floatValue());
            } else if (objB instanceof Integer) {
                bundle.putInt(str, ((Number) objB).intValue());
            } else if (objB instanceof Long) {
                bundle.putLong(str, ((Number) objB).longValue());
            } else if (objB instanceof Short) {
                bundle.putShort(str, ((Number) objB).shortValue());
            } else if (objB instanceof Bundle) {
                bundle.putBundle(str, (Bundle) objB);
            } else if (objB instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) objB);
            } else if (objB instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) objB);
            } else if (objB instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) objB);
            } else if (objB instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) objB);
            } else if (objB instanceof char[]) {
                bundle.putCharArray(str, (char[]) objB);
            } else if (objB instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) objB);
            } else if (objB instanceof float[]) {
                bundle.putFloatArray(str, (float[]) objB);
            } else if (objB instanceof int[]) {
                bundle.putIntArray(str, (int[]) objB);
            } else if (objB instanceof long[]) {
                bundle.putLongArray(str, (long[]) objB);
            } else if (objB instanceof short[]) {
                bundle.putShortArray(str, (short[]) objB);
            } else if (objB instanceof Object[]) {
                Class<?> componentType = objB.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) objB);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) objB);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) objB);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        qc0.j(tec.m("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, "\""));
                        return null;
                    }
                    bundle.putSerializable(str, (Serializable) objB);
                }
            } else if (objB instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) objB);
            } else if (objB instanceof IBinder) {
                bundle.putBinder(str, (IBinder) objB);
            } else if (objB instanceof Size) {
                bundle.putSize(str, (Size) objB);
            } else {
                if (!(objB instanceof SizeF)) {
                    qc0.j(tec.m("Illegal value type ", objB.getClass().getCanonicalName(), " for key \"", str, "\""));
                    return null;
                }
                bundle.putSizeF(str, (SizeF) objB);
            }
        }
        return bundle;
    }

    public static void s(long j2, String str) {
        if (j2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j2 + ") must be >= 0");
    }

    public static void t(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static int u(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, bp.v(context)) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static int v(long j2, long j3) {
        if (j2 > 0 && j3 > 0) {
            long jN = pqf.N(j2, 8000000L, j3, RoundingMode.HALF_UP);
            if (jN > 0 && jN <= 2147483647L) {
                return (int) jN;
            }
        }
        return -2147483647;
    }

    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:87:0x01cc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:88:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d4  */
    public static final xt7 w(xt7 xt7Var, HashSet hashSet) {
        tjd tjdVar;
        e8f e8fVarQ;
        xt7 xt7VarU;
        xt7 xt7VarW;
        j7f j7fVarH;
        qfc qfcVar = qfc.d;
        k7f k7fVarI0 = qfcVar.i0(xt7Var);
        if (hashSet.add(k7fVarI0)) {
            c8f c8fVarU = db6.U(k7fVarI0);
            int i2 = 1;
            int i3 = 0;
            if (c8fVarU != null) {
                xt7 xt7VarS = db6.S(c8fVarU);
                xt7 xt7VarW2 = w(xt7VarS, hashSet);
                if (xt7VarW2 != null) {
                    if (!db6.i0(qfcVar.i0(xt7VarS)) && (!(xt7VarS instanceof vjd) || !db6.o0((vjd) xt7VarS))) {
                        i2 = 0;
                    }
                    if ((xt7VarW2 instanceof vjd) && db6.o0((vjd) xt7VarW2) && db6.n0(xt7Var) && i2 != 0) {
                        return qfcVar.L0(xt7VarS);
                    }
                    return (db6.n0(xt7VarW2) || !db6.l0(xt7Var)) ? xt7VarW2 : qfcVar.L0(xt7VarW2);
                }
            } else {
                if (!db6.i0(k7fVarI0)) {
                    return xt7Var;
                }
                List<e8f> listR = db6.R(qfcVar.i0(xt7Var));
                List listK = db6.K(xt7Var);
                ArrayList arrayList = new ArrayList(t72.u(listK, 10));
                for (Object obj : listK) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        t72.Z();
                        throw null;
                    }
                    tt7 tt7VarT = db6.T(qfcVar, (d7f) obj);
                    if (tt7VarT == null) {
                        tt7VarT = db6.S((e8f) listR.get(i3));
                    }
                    arrayList.add(tt7VarT);
                    i3 = i4;
                }
                ArrayList arrayList2 = new ArrayList(t72.u(listR, 10));
                for (e8f e8fVar : listR) {
                    e8fVar.getClass();
                    if (e8fVar instanceof c8f) {
                        j7fVarH = ((c8f) e8fVar).h();
                        j7fVarH.getClass();
                    } else {
                        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                        sb.append(e8fVar);
                        sb.append(", ");
                        qc0.o(tec.j(job.a, e8fVar.getClass(), sb));
                        j7fVarH = null;
                    }
                    arrayList2.add(j7fVarH);
                }
                Map mapW = bm8.W(s72.r1(arrayList2, arrayList));
                ArrayList arrayList3 = new ArrayList(mapW.size());
                for (Map.Entry entry : mapW.entrySet()) {
                    k7f k7fVar = (k7f) entry.getKey();
                    xt7 xt7Var2 = (xt7) entry.getValue();
                    k7fVar.getClass();
                    xt7Var2.getClass();
                    arrayList3.add(new iy9((j7f) k7fVar, new dzd((tt7) xt7Var2)));
                }
                q8f q8fVar = new q8f(new ezd(i2, bm8.W(arrayList3)));
                xt7Var.getClass();
                if (xt7Var instanceof tt7) {
                    int i5 = n37.a;
                    y22 y22VarM = ((tt7) xt7Var).c0().m();
                    u09 u09Var = y22VarM instanceof u09 ? (u09) y22VarM : null;
                    if (u09Var != null) {
                        int i6 = qz3.a;
                        orf orfVarN0 = u09Var.n0();
                        m37 m37Var = orfVarN0 instanceof m37 ? (m37) orfVarN0 : null;
                        tjdVar = m37Var != null ? (tjd) m37Var.b : null;
                    }
                    if (tjdVar == null) {
                        xt7VarU = null;
                    } else {
                        e8fVarQ = q(tjdVar);
                        if (e8fVarQ == null) {
                            xt7VarU = db6.K0(q8fVar, tjdVar);
                        } else {
                            xt7VarU = U(tjdVar, db6.K0(q8fVar, db6.S(e8fVarQ)));
                        }
                    }
                    if (xt7VarU != null && (xt7VarW = w(xt7VarU, hashSet)) != null) {
                        if (!db6.n0(xt7Var)) {
                            return xt7VarW;
                        }
                        if (db6.n0(xt7VarW)) {
                            return xt7Var;
                        }
                        return ((xt7VarW instanceof vjd) || !db6.o0((vjd) xt7VarW)) ? qfcVar.L0(xt7VarW) : xt7Var;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb2.append(xt7Var);
                    sb2.append(", ");
                    qc0.o(tec.j(job.a, xt7Var.getClass(), sb2));
                }
                if (tjdVar == null) {
                    xt7VarU = null;
                } else {
                    e8fVarQ = q(tjdVar);
                    if (e8fVarQ == null) {
                        xt7VarU = db6.K0(q8fVar, tjdVar);
                    } else {
                        xt7VarU = U(tjdVar, db6.K0(q8fVar, db6.S(e8fVarQ)));
                    }
                }
                if (xt7VarU != null) {
                    if (!db6.n0(xt7Var)) {
                        return xt7VarW;
                    }
                    if (db6.n0(xt7VarW)) {
                        return xt7Var;
                    }
                    if (xt7VarW instanceof vjd) {
                    }
                }
            }
        }
        return null;
    }

    public static float[] x() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    }

    public static void y(long j2, d0a d0aVar, k1f[] k1fVarArr) {
        int i2;
        int iZ;
        while (true) {
            if (d0aVar.a() <= 1) {
                return;
            }
            int i3 = 0;
            while (true) {
                if (d0aVar.a() == 0) {
                    i2 = -1;
                    break;
                }
                int iZ2 = d0aVar.z();
                i3 += iZ2;
                if (iZ2 != 255) {
                    i2 = i3;
                    break;
                }
            }
            int i4 = 0;
            do {
                if (d0aVar.a() == 0) {
                    i4 = -1;
                    break;
                } else {
                    iZ = d0aVar.z();
                    i4 += iZ;
                }
            } while (iZ == 255);
            int i5 = d0aVar.b + i4;
            if (i4 == -1 || i4 > d0aVar.a()) {
                xo1.V("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i5 = d0aVar.c;
            } else if (i2 == 4 && i4 >= 8) {
                int iZ3 = d0aVar.z();
                int iG = d0aVar.G();
                int iM = iG == 49 ? d0aVar.m() : 0;
                int iZ4 = d0aVar.z();
                if (iG == 47) {
                    d0aVar.N(1);
                }
                boolean z = iZ3 == 181 && (iG == 49 || iG == 47) && iZ4 == 3;
                if (iG == 49) {
                    z &= iM == 1195456820;
                }
                if (z) {
                    z(j2, d0aVar, k1fVarArr);
                }
            }
            d0aVar.M(i5);
        }
    }

    public static void z(long j2, d0a d0aVar, k1f[] k1fVarArr) {
        int iZ = d0aVar.z();
        if ((iZ & 64) != 0) {
            d0aVar.N(1);
            int i2 = (iZ & 31) * 3;
            int i3 = d0aVar.b;
            for (k1f k1fVar : k1fVarArr) {
                d0aVar.M(i3);
                k1fVar.e(i2, d0aVar);
                pa7.J(j2 != -9223372036854775807L);
                k1fVar.a(j2, 1, i2, 0, null);
            }
        }
    }
}
