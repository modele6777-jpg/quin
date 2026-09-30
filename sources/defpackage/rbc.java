package defpackage;

import android.graphics.Matrix;
import android.util.Log;
import android.util.Xml;
import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.core.b1;
import io.sentry.q6;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rbc {
    public gg7 a;
    public dac b;
    public boolean c;
    public int d;
    public boolean e;
    public pbc f;
    public StringBuilder g;
    public boolean h;
    public StringBuilder i;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:150:0x0270  */
    /* JADX WARN: Code duplicated, block: B:174:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:235:0x037e  */
    /* JADX WARN: Code duplicated, block: B:310:0x0492  */
    /* JADX WARN: Code duplicated, block: B:343:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:388:0x058a  */
    public static void C(z9c z9cVar, String str, String str2) {
        Boolean bool;
        int i;
        String strR;
        l9c l9cVarS;
        String strSubstring;
        l9c l9cVarS2;
        int i2;
        int i3;
        l9c l9cVarO;
        l9c[] l9cVarArr;
        int i4;
        int i5;
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        int iOrdinal = obc.a(str).ordinal();
        int i6 = 5;
        if (iOrdinal == 1) {
            kxa kxaVar = null;
            if (!"auto".equals(str2) && str2.startsWith("rect(")) {
                p90 p90Var = new p90(str2.substring(5));
                p90Var.f0();
                l9c l9cVarU = u(p90Var);
                p90Var.e0();
                l9c l9cVarU2 = u(p90Var);
                p90Var.e0();
                l9c l9cVarU3 = u(p90Var);
                p90Var.e0();
                l9c l9cVarU4 = u(p90Var);
                p90Var.f0();
                if (p90Var.v(')') || p90Var.z()) {
                    kxaVar = new kxa();
                    kxaVar.a = l9cVarU;
                    kxaVar.b = l9cVarU2;
                    kxaVar.c = l9cVarU3;
                    kxaVar.d = l9cVarU4;
                }
            }
            kxa kxaVar2 = kxaVar;
            z9cVar.E0 = kxaVar2;
            if (kxaVar2 != null) {
                z9cVar.a |= q6.MAX_EVENT_SIZE_BYTES;
                return;
            }
            return;
        }
        if (iOrdinal == 2) {
            z9cVar.M0 = r(str2);
            z9cVar.a |= 268435456;
            return;
        }
        if (iOrdinal == 4) {
            z9cVar.Z0 = "nonzero".equals(str2) ? 1 : "evenodd".equals(str2) ? 2 : 0;
            z9cVar.a |= 536870912;
        }
        try {
            if (iOrdinal == 5) {
                z9cVar.y = n(str2);
                z9cVar.a |= 4096;
                return;
            }
            if (iOrdinal == 8) {
                int i7 = str2.equals("ltr") ? 1 : !str2.equals("rtl") ? 0 : 2;
                z9cVar.X0 = i7;
                if (i7 != 0) {
                    z9cVar.a |= 68719476736L;
                    return;
                }
                return;
            }
            if (iOrdinal == 35) {
                z9cVar.N0 = r(str2);
                z9cVar.a |= 1073741824;
                return;
            }
            if (iOrdinal == 40) {
                z9cVar.x = v(str2);
                z9cVar.a |= 2048;
                return;
            }
            if (iOrdinal == 42) {
                switch (str2) {
                    case "hidden":
                    case "scroll":
                        bool = Boolean.FALSE;
                        break;
                    case "auto":
                    case "visible":
                        bool = Boolean.TRUE;
                        break;
                    default:
                        bool = null;
                        break;
                }
                z9cVar.Z = bool;
                if (bool != null) {
                    z9cVar.a |= 524288;
                    return;
                }
                return;
            }
            if (iOrdinal == 78) {
                int i8 = str2.equals("none") ? 1 : !str2.equals("non-scaling-stroke") ? 0 : 2;
                z9cVar.a1 = i8;
                if (i8 != 0) {
                    z9cVar.a |= 34359738368L;
                    return;
                }
                return;
            }
            d9c d9cVar = d9c.a;
            if (iOrdinal == 58) {
                if (str2.equals("currentColor")) {
                    z9cVar.O0 = d9cVar;
                } else {
                    try {
                        z9cVar.O0 = n(str2);
                    } catch (ibc e) {
                        b1.l("SVGParser", e.getMessage());
                        return;
                    }
                }
                z9cVar.a |= 2147483648L;
                return;
            }
            if (iOrdinal == 59) {
                z9cVar.P0 = v(str2);
                z9cVar.a |= 4294967296L;
                return;
            }
            if (iOrdinal == 74) {
                switch (str2) {
                    case "middle":
                        i = 2;
                        break;
                    case "end":
                        i = 3;
                        break;
                    case "start":
                        i = 1;
                        break;
                    default:
                        i = 0;
                        break;
                }
                z9cVar.Y0 = i;
                if (i != 0) {
                    z9cVar.a |= 262144;
                    return;
                }
                return;
            }
            if (iOrdinal == 75) {
                switch (str2) {
                    case "line-through":
                        i6 = 4;
                        break;
                    case "underline":
                        i6 = 2;
                        break;
                    case "none":
                        i6 = 1;
                        break;
                    case "blink":
                        break;
                    case "overline":
                        i6 = 3;
                        break;
                    default:
                        i6 = 0;
                        break;
                }
                z9cVar.W0 = i6;
                if (i6 != 0) {
                    z9cVar.a |= 131072;
                    return;
                }
                return;
            }
            switch (iOrdinal) {
                case 14:
                    if (str2.indexOf(124) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains("|" + str2 + '|')) {
                            z9cVar.I0 = Boolean.valueOf(!str2.equals("none"));
                            z9cVar.a |= 16777216;
                            break;
                        }
                    }
                    break;
                case 15:
                    iac iacVarW = w(str2);
                    z9cVar.b = iacVarW;
                    if (iacVarW != null) {
                        z9cVar.a |= 1;
                    }
                    break;
                case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                    int i9 = "nonzero".equals(str2) ? 1 : "evenodd".equals(str2) ? 2 : 0;
                    z9cVar.S0 = i9;
                    if (i9 != 0) {
                        z9cVar.a |= 2;
                    }
                    break;
                case 17:
                    Float fV = v(str2);
                    z9cVar.c = fV;
                    if (fV != null) {
                        z9cVar.a |= 4;
                    }
                    break;
                case 18:
                    if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains("|" + str2 + '|')) {
                        p90 p90Var2 = new p90(str2);
                        Integer num = null;
                        String str3 = null;
                        int i10 = 0;
                        while (true) {
                            strR = p90Var2.R('/', false);
                            p90Var2.f0();
                            if (strR == null) {
                                break;
                            } else if (num == null || i10 == 0) {
                                if (!strR.equals(Constants.NORMAL) && (num != null || (num = (Integer) mbc.a.get(strR)) == null)) {
                                    if (i10 == 0) {
                                        switch (strR) {
                                            case "oblique":
                                                i10 = 3;
                                                break;
                                            case "italic":
                                                i10 = 2;
                                                break;
                                            case "normal":
                                                i10 = 1;
                                                break;
                                            default:
                                                i10 = 0;
                                                break;
                                        }
                                        if (i10 != 0) {
                                            continue;
                                        }
                                    }
                                    if (str3 == null && strR.equals("small-caps")) {
                                        str3 = strR;
                                    }
                                }
                            }
                        }
                        try {
                            l9cVarS = (l9c) lbc.a.get(strR);
                            if (l9cVarS == null) {
                                l9cVarS = s(strR);
                            }
                        } catch (ibc unused) {
                            l9cVarS = null;
                        }
                        if (p90Var2.v('/')) {
                            p90Var2.f0();
                            String strQ = p90Var2.Q();
                            if (strQ != null) {
                                s(strQ);
                            }
                            p90Var2.f0();
                        }
                        if (p90Var2.z()) {
                            strSubstring = null;
                        } else {
                            int i11 = p90Var2.b;
                            p90Var2.b = p90Var2.c;
                            strSubstring = ((String) p90Var2.d).substring(i11);
                        }
                        z9cVar.z = q(strSubstring);
                        z9cVar.X = l9cVarS;
                        z9cVar.Y = Integer.valueOf(num == null ? Constants.MINIMAL_ERROR_STATUS_CODE : num.intValue());
                        if (i10 == 0) {
                            i10 = 1;
                        }
                        z9cVar.V0 = i10;
                        z9cVar.a |= 122880;
                        break;
                    }
                    break;
                case 19:
                    ArrayList arrayListQ = q(str2);
                    z9cVar.z = arrayListQ;
                    if (arrayListQ != null) {
                        z9cVar.a |= 8192;
                    }
                    break;
                case 20:
                    try {
                        l9c l9cVar = (l9c) lbc.a.get(str2);
                        l9cVarS2 = l9cVar == null ? s(str2) : l9cVar;
                    } catch (ibc unused2) {
                        l9cVarS2 = null;
                    }
                    z9cVar.X = l9cVarS2;
                    if (l9cVarS2 != null) {
                        z9cVar.a |= 16384;
                    }
                    break;
                case 21:
                    Integer num2 = (Integer) mbc.a.get(str2);
                    z9cVar.Y = num2;
                    if (num2 != null) {
                        z9cVar.a |= 32768;
                    }
                    break;
                case 22:
                    switch (str2) {
                        case "oblique":
                            i2 = 3;
                            break;
                        case "italic":
                            i2 = 2;
                            break;
                        case "normal":
                            i2 = 1;
                            break;
                        default:
                            i2 = 0;
                            break;
                    }
                    z9cVar.V0 = i2;
                    if (i2 != 0) {
                        z9cVar.a |= 65536;
                    }
                    break;
                default:
                    switch (iOrdinal) {
                        case 27:
                            switch (str2) {
                                case "optimizeQuality":
                                    i3 = 2;
                                    break;
                                case "auto":
                                    i3 = 1;
                                    break;
                                case "optimizeSpeed":
                                    i3 = 3;
                                    break;
                                default:
                                    i3 = 0;
                                    break;
                            }
                            z9cVar.b1 = i3;
                            if (i3 != 0) {
                                z9cVar.a |= 137438953472L;
                            }
                            break;
                        case 28:
                            String strR2 = r(str2);
                            z9cVar.F0 = strR2;
                            z9cVar.G0 = strR2;
                            z9cVar.H0 = strR2;
                            z9cVar.a |= 14680064;
                            break;
                        case 29:
                            z9cVar.F0 = r(str2);
                            z9cVar.a |= 2097152;
                            break;
                        case 30:
                            z9cVar.G0 = r(str2);
                            z9cVar.a |= 4194304;
                            break;
                        case 31:
                            z9cVar.H0 = r(str2);
                            z9cVar.a |= 8388608;
                            break;
                        default:
                            switch (iOrdinal) {
                                case 62:
                                    if (str2.equals("currentColor")) {
                                        z9cVar.K0 = d9cVar;
                                    } else {
                                        try {
                                            z9cVar.K0 = n(str2);
                                        } catch (ibc e2) {
                                            b1.l("SVGParser", e2.getMessage());
                                            return;
                                        }
                                    }
                                    z9cVar.a |= 67108864;
                                    break;
                                case 63:
                                    z9cVar.L0 = v(str2);
                                    z9cVar.a |= 134217728;
                                    break;
                                case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                                    iac iacVarW2 = w(str2);
                                    z9cVar.d = iacVarW2;
                                    if (iacVarW2 != null) {
                                        z9cVar.a |= 8;
                                    }
                                    break;
                                case 65:
                                    if (!"none".equals(str2)) {
                                        p90 p90Var3 = new p90(str2);
                                        p90Var3.f0();
                                        if (p90Var3.z() || (l9cVarO = p90Var3.O()) == null || l9cVarO.f()) {
                                            l9cVarArr = null;
                                        } else {
                                            float f = l9cVarO.a;
                                            ArrayList arrayList = new ArrayList();
                                            arrayList.add(l9cVarO);
                                            while (true) {
                                                if (!p90Var3.z()) {
                                                    p90Var3.e0();
                                                    l9c l9cVarO2 = p90Var3.O();
                                                    if (l9cVarO2 != null && !l9cVarO2.f()) {
                                                        arrayList.add(l9cVarO2);
                                                        f += l9cVarO2.a;
                                                    }
                                                } else if (f != 0.0f) {
                                                    l9cVarArr = (l9c[]) arrayList.toArray(new l9c[arrayList.size()]);
                                                }
                                                l9cVarArr = null;
                                            }
                                        }
                                        z9cVar.v = l9cVarArr;
                                        if (l9cVarArr != null) {
                                            z9cVar.a |= 512;
                                        }
                                    } else {
                                        z9cVar.v = null;
                                        z9cVar.a |= 512;
                                    }
                                    break;
                                case 66:
                                    z9cVar.w = s(str2);
                                    z9cVar.a |= 1024;
                                    break;
                                case 67:
                                    if ("butt".equals(str2)) {
                                        i4 = 1;
                                    } else if ("round".equals(str2)) {
                                        i4 = 2;
                                    } else {
                                        i4 = "square".equals(str2) ? 3 : 0;
                                    }
                                    z9cVar.T0 = i4;
                                    if (i4 != 0) {
                                        z9cVar.a |= 64;
                                    }
                                    break;
                                case 68:
                                    if ("miter".equals(str2)) {
                                        i5 = 1;
                                    } else if ("round".equals(str2)) {
                                        i5 = 2;
                                    } else {
                                        i5 = "bevel".equals(str2) ? 3 : 0;
                                    }
                                    z9cVar.U0 = i5;
                                    if (i5 != 0) {
                                        z9cVar.a |= 128;
                                    }
                                    break;
                                case 69:
                                    z9cVar.g = Float.valueOf(p(str2));
                                    z9cVar.a |= 256;
                                    break;
                                case 70:
                                    Float fV2 = v(str2);
                                    z9cVar.e = fV2;
                                    if (fV2 != null) {
                                        z9cVar.a |= 16;
                                    }
                                    break;
                                case 71:
                                    z9cVar.f = s(str2);
                                    z9cVar.a |= 32;
                                    break;
                                default:
                                    switch (iOrdinal) {
                                        case 88:
                                            if (str2.equals("currentColor")) {
                                                z9cVar.Q0 = d9cVar;
                                            } else {
                                                try {
                                                    z9cVar.Q0 = n(str2);
                                                } catch (ibc e3) {
                                                    b1.l("SVGParser", e3.getMessage());
                                                    return;
                                                }
                                            }
                                            z9cVar.a |= 8589934592L;
                                            break;
                                        case 89:
                                            z9cVar.R0 = v(str2);
                                            z9cVar.a |= 17179869184L;
                                            break;
                                        case 90:
                                            if (str2.indexOf(124) < 0) {
                                                if ("|visible|hidden|collapse|".contains("|" + str2 + '|')) {
                                                    z9cVar.J0 = Boolean.valueOf(str2.equals("visible"));
                                                    z9cVar.a |= 33554432;
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } catch (ibc unused3) {
        }
    }

    public static int b(float f) {
        if (f < 0.0f) {
            return 0;
        }
        if (f > 255.0f) {
            return 255;
        }
        return Math.round(f);
    }

    public static int d(float f, float f2, float f3) {
        float f4 = 0.0f;
        float f5 = f % 360.0f;
        if (f < 0.0f) {
            f5 += 360.0f;
        }
        float f6 = f5 / 60.0f;
        float f7 = f2 / 100.0f;
        float f8 = f3 / 100.0f;
        if (f7 < 0.0f) {
            f7 = 0.0f;
        } else if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        if (f8 >= 0.0f) {
            f4 = f8 > 1.0f ? 1.0f : f8;
        }
        float f9 = f4 <= 0.5f ? (f7 + 1.0f) * f4 : (f4 + f7) - (f7 * f4);
        float f10 = (f4 * 2.0f) - f9;
        return b(e(f10, f9, f6 - 2.0f) * 256.0f) | (b(e(f10, f9, f6 + 2.0f) * 256.0f) << 16) | (b(e(f10, f9, f6) * 256.0f) << 8);
    }

    public static float e(float f, float f2, float f3) {
        if (f3 < 0.0f) {
            f3 += 6.0f;
        }
        if (f3 >= 6.0f) {
            f3 -= 6.0f;
        }
        if (f3 < 1.0f) {
            return ks0.a(f2, f, f3, f);
        }
        if (f3 < 3.0f) {
            return f2;
        }
        return f3 < 4.0f ? ks0.a(4.0f, f3, f2 - f, f) : f;
    }

    public static void f(bac bacVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iD = ib8.d(attributes, i);
            if (iD != 73) {
                switch (iD) {
                    case 52:
                        p90 p90Var = new p90(strTrim);
                        HashSet hashSet = new HashSet();
                        while (!p90Var.z()) {
                            String strQ = p90Var.Q();
                            if (strQ.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                                hashSet.add(strQ.substring(35));
                            } else {
                                hashSet.add("UNSUPPORTED");
                            }
                            p90Var.f0();
                        }
                        bacVar.e(hashSet);
                        break;
                    case 53:
                        bacVar.i(strTrim);
                        break;
                    case 54:
                        p90 p90Var2 = new p90(strTrim);
                        HashSet hashSet2 = new HashSet();
                        while (!p90Var2.z()) {
                            hashSet2.add(p90Var2.Q());
                            p90Var2.f0();
                        }
                        bacVar.j(hashSet2);
                        break;
                    case 55:
                        ArrayList arrayListQ = q(strTrim);
                        bacVar.h(arrayListQ != null ? new HashSet(arrayListQ) : new HashSet(0));
                        break;
                }
            } else {
                p90 p90Var3 = new p90(strTrim);
                HashSet hashSet3 = new HashSet();
                while (!p90Var3.z()) {
                    String strQ2 = p90Var3.Q();
                    int iIndexOf = strQ2.indexOf(45);
                    if (iIndexOf != -1) {
                        strQ2 = strQ2.substring(0, iIndexOf);
                    }
                    hashSet3.add(new Locale(strQ2, "", "").getLanguage());
                    p90Var3.f0();
                }
                bacVar.k(hashSet3);
            }
        }
    }

    public static void g(fac facVar, Attributes attributes) throws ibc {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                facVar.c = attributes.getValue(i).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i).trim();
                if ("default".equals(strTrim)) {
                    facVar.d = Boolean.FALSE;
                    return;
                } else {
                    if (!"preserve".equals(strTrim)) {
                        throw new ibc(ub3.i("Invalid value for \"xml:space\" attribute: ", strTrim));
                    }
                    facVar.d = Boolean.TRUE;
                    return;
                }
            }
        }
    }

    public static void h(g9c g9cVar, Attributes attributes) throws ibc {
        int i;
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            int iD = ib8.d(attributes, i2);
            if (iD == 23) {
                g9cVar.j = z(strTrim);
            } else if (iD != 24) {
                if (iD != 26) {
                    if (iD == 60) {
                        if (strTrim != null) {
                            try {
                                if (strTrim.equals("pad")) {
                                    i = 1;
                                } else if (strTrim.equals("reflect")) {
                                    i = 2;
                                } else if (strTrim.equals("repeat")) {
                                    i = 3;
                                } else {
                                    qc0.j("No enum constant com.caverock.androidsvg.SVG.GradientSpread.".concat(strTrim));
                                }
                                g9cVar.k = i;
                            } catch (IllegalArgumentException unused) {
                                throw new ibc(ib8.j("Invalid spreadMethod attribute. \"", strTrim, "\" is not a valid value."));
                            }
                        } else {
                            r82.g("Name is null");
                        }
                        i = 0;
                        g9cVar.k = i;
                    } else {
                        continue;
                    }
                } else if ("".equals(attributes.getURI(i2)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i2))) {
                    g9cVar.l = strTrim;
                }
            } else if ("objectBoundingBox".equals(strTrim)) {
                g9cVar.i = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(strTrim)) {
                    cva.l("Invalid value for attribute gradientUnits");
                    return;
                }
                g9cVar.i = Boolean.TRUE;
            }
        }
    }

    public static void i(u9c u9cVar, Attributes attributes, String str) throws ibc {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (obc.a(attributes.getLocalName(i)) == obc.b) {
                p90 p90Var = new p90(attributes.getValue(i));
                ArrayList arrayList = new ArrayList();
                p90Var.f0();
                while (!p90Var.z()) {
                    float fN = p90Var.N();
                    if (Float.isNaN(fN)) {
                        throw new ibc(ib8.j("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                    p90Var.e0();
                    float fN2 = p90Var.N();
                    if (Float.isNaN(fN2)) {
                        throw new ibc(ib8.j("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                    }
                    p90Var.e0();
                    arrayList.add(Float.valueOf(fN));
                    arrayList.add(Float.valueOf(fN2));
                }
                u9cVar.o = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    u9cVar.o[i2] = ((Float) it.next()).floatValue();
                    i2++;
                }
            }
        }
    }

    public static void j(fac facVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            if (strTrim.length() != 0) {
                int iD = ib8.d(attributes, i);
                if (iD == 0) {
                    i71 i71Var = new i71(strTrim);
                    ArrayList arrayList = null;
                    while (!i71Var.z()) {
                        String strQ = i71Var.Q();
                        if (strQ != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(strQ);
                            i71Var.f0();
                        }
                    }
                    facVar.g = arrayList;
                } else if (iD != 72) {
                    z9c z9cVar = facVar.e;
                    if (z9cVar == null) {
                        z9cVar = new z9c();
                        facVar.e = z9cVar;
                    }
                    C(z9cVar, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    p90 p90Var = new p90(strTrim.replaceAll("/\\*.*?\\*/", ""));
                    while (true) {
                        String strR = p90Var.R(':', false);
                        p90Var.f0();
                        if (!p90Var.v(':')) {
                            break;
                        }
                        p90Var.f0();
                        String strR2 = p90Var.R(';', true);
                        if (strR2 == null) {
                            break;
                        }
                        p90Var.f0();
                        if (p90Var.z() || p90Var.v(';')) {
                            z9c z9cVar2 = facVar.f;
                            if (z9cVar2 == null) {
                                z9cVar2 = new z9c();
                                facVar.f = z9cVar2;
                            }
                            C(z9cVar2, strR, strR2);
                            p90Var.f0();
                        }
                    }
                }
            }
        }
    }

    public static void k(uac uacVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iD = ib8.d(attributes, i);
            if (iD == 9) {
                uacVar.p = t(strTrim);
            } else if (iD == 10) {
                uacVar.q = t(strTrim);
            } else if (iD == 82) {
                uacVar.n = t(strTrim);
            } else if (iD == 83) {
                uacVar.o = t(strTrim);
            }
        }
    }

    public static void l(j9c j9cVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (obc.a(attributes.getLocalName(i)) == obc.c) {
                j9cVar.l(z(attributes.getValue(i)));
            }
        }
    }

    public static void m(lac lacVar, Attributes attributes) throws ibc {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iD = ib8.d(attributes, i);
            if (iD == 48) {
                x(lacVar, strTrim);
            } else if (iD != 80) {
                continue;
            } else {
                p90 p90Var = new p90(strTrim);
                p90Var.f0();
                float fN = p90Var.N();
                p90Var.e0();
                float fN2 = p90Var.N();
                p90Var.e0();
                float fN3 = p90Var.N();
                p90Var.e0();
                float fN4 = p90Var.N();
                if (Float.isNaN(fN) || Float.isNaN(fN2) || Float.isNaN(fN3) || Float.isNaN(fN4)) {
                    cva.l("Invalid viewBox definition - should have four numbers");
                    return;
                } else if (fN3 < 0.0f) {
                    cva.l("Invalid viewBox. width cannot be negative");
                    return;
                } else {
                    if (fN4 < 0.0f) {
                        cva.l("Invalid viewBox. height cannot be negative");
                        return;
                    }
                    lacVar.o = new v79(fN, fN2, fN3, fN4);
                }
            }
        }
    }

    public static c9c n(String str) throws ibc {
        long j;
        int i;
        if (str.charAt(0) == '#') {
            int length = str.length();
            a67 a67Var = null;
            if (1 < length) {
                long j2 = 0;
                int i2 = 1;
                while (true) {
                    if (i2 < length) {
                        char cCharAt = str.charAt(i2);
                        if (cCharAt < '0' || cCharAt > '9') {
                            if (cCharAt >= 'A' && cCharAt <= 'F') {
                                j = j2 * 16;
                                i = cCharAt - 'A';
                            } else if (cCharAt >= 'a' && cCharAt <= 'f') {
                                j = j2 * 16;
                                i = cCharAt - 'a';
                            }
                            j2 = j + ((long) i) + 10;
                        } else {
                            j2 = (j2 * 16) + ((long) (cCharAt - '0'));
                        }
                        if (j2 <= 4294967295L) {
                            i2++;
                        }
                    }
                    if (i2 != 1) {
                        a67Var = new a67(j2, i2);
                    }
                }
            }
            if (a67Var == null) {
                throw new ibc("Bad hex colour value: ".concat(str));
            }
            long j3 = a67Var.b;
            int i3 = a67Var.a;
            if (i3 == 4) {
                int i4 = (int) j3;
                int i5 = i4 & 3840;
                int i6 = i4 & 240;
                int i7 = i4 & 15;
                return new c9c(i7 | (i5 << 8) | (-16777216) | (i5 << 12) | (i6 << 8) | (i6 << 4) | (i7 << 4));
            }
            if (i3 != 5) {
                if (i3 == 7) {
                    return new c9c(((int) j3) | (-16777216));
                }
                if (i3 != 9) {
                    throw new ibc("Bad hex colour value: ".concat(str));
                }
                int i8 = (int) j3;
                return new c9c((i8 >>> 8) | (i8 << 24));
            }
            int i9 = (int) j3;
            int i10 = 61440 & i9;
            int i11 = i9 & 3840;
            int i12 = i9 & 240;
            int i13 = i9 & 15;
            return new c9c((i13 << 24) | (i13 << 28) | (i10 << 8) | (i10 << 4) | (i11 << 4) | i11 | i12 | (i12 >> 4));
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        if (zStartsWith || lowerCase.startsWith("rgb(")) {
            p90 p90Var = new p90(str.substring(zStartsWith ? 5 : 4));
            p90Var.f0();
            float fN = p90Var.N();
            if (!Float.isNaN(fN) && p90Var.v('%')) {
                fN = (fN * 256.0f) / 100.0f;
            }
            float fL = p90Var.l(fN);
            if (!Float.isNaN(fL) && p90Var.v('%')) {
                fL = (fL * 256.0f) / 100.0f;
            }
            float fL2 = p90Var.l(fL);
            if (!Float.isNaN(fL2) && p90Var.v('%')) {
                fL2 = (fL2 * 256.0f) / 100.0f;
            }
            if (!zStartsWith) {
                p90Var.f0();
                if (Float.isNaN(fL2) || !p90Var.v(')')) {
                    throw new ibc("Bad rgb() colour value: ".concat(str));
                }
                return new c9c((b(fN) << 16) | (-16777216) | (b(fL) << 8) | b(fL2));
            }
            float fL3 = p90Var.l(fL2);
            p90Var.f0();
            if (Float.isNaN(fL3) || !p90Var.v(')')) {
                throw new ibc("Bad rgba() colour value: ".concat(str));
            }
            return new c9c((b(fL3 * 256.0f) << 24) | (b(fN) << 16) | (b(fL) << 8) | b(fL2));
        }
        boolean zStartsWith2 = lowerCase.startsWith("hsla(");
        if (!zStartsWith2 && !lowerCase.startsWith("hsl(")) {
            Integer num = (Integer) kbc.a.get(lowerCase);
            if (num != null) {
                return new c9c(num.intValue());
            }
            throw new ibc("Invalid colour keyword: ".concat(lowerCase));
        }
        p90 p90Var2 = new p90(str.substring(zStartsWith2 ? 5 : 4));
        p90Var2.f0();
        float fN2 = p90Var2.N();
        float fL4 = p90Var2.l(fN2);
        if (!Float.isNaN(fL4)) {
            p90Var2.v('%');
        }
        float fL5 = p90Var2.l(fL4);
        if (!Float.isNaN(fL5)) {
            p90Var2.v('%');
        }
        if (!zStartsWith2) {
            p90Var2.f0();
            if (Float.isNaN(fL5) || !p90Var2.v(')')) {
                throw new ibc("Bad hsl() colour value: ".concat(str));
            }
            return new c9c(d(fN2, fL4, fL5) | (-16777216));
        }
        float fL6 = p90Var2.l(fL5);
        p90Var2.f0();
        if (Float.isNaN(fL6) || !p90Var2.v(')')) {
            throw new ibc("Bad hsla() colour value: ".concat(str));
        }
        return new c9c((b(fL6 * 256.0f) << 24) | d(fN2, fL4, fL5));
    }

    public static float o(int i, String str) throws ibc {
        float fM = new ff8(1).m(0, i, str);
        if (Float.isNaN(fM)) {
            throw new ibc(ub3.i("Invalid float value: ", str));
        }
        return fM;
    }

    public static float p(String str) throws ibc {
        int length = str.length();
        if (length != 0) {
            return o(length, str);
        }
        cva.l("Invalid float value (empty string)");
        return 0.0f;
    }

    public static ArrayList q(String str) {
        p90 p90Var = new p90(str);
        ArrayList arrayList = null;
        do {
            String strP = p90Var.P();
            if (strP == null) {
                strP = p90Var.R(',', true);
            }
            if (strP == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strP);
            p90Var.e0();
        } while (!p90Var.z());
        return arrayList;
    }

    public static String r(String str) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    public static l9c s(String str) throws ibc {
        int iZ;
        if (str.length() == 0) {
            cva.l("Invalid length value (empty string)");
            return null;
        }
        int length = str.length();
        char cCharAt = str.charAt(length - 1);
        if (cCharAt == '%') {
            length--;
            iZ = 9;
        } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                iZ = ib8.z(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new ibc("Invalid length unit specifier: ".concat(str));
            }
        } else {
            iZ = 1;
        }
        try {
            return new l9c(iZ, o(length, str));
        } catch (NumberFormatException e) {
            throw new ibc("Invalid length value: ".concat(str), e);
        }
    }

    public static ArrayList t(String str) throws ibc {
        if (str.length() == 0) {
            cva.l("Invalid length list (empty string)");
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        p90 p90Var = new p90(str);
        p90Var.f0();
        while (!p90Var.z()) {
            float fN = p90Var.N();
            if (Float.isNaN(fN)) {
                StringBuilder sb = new StringBuilder("Invalid length list value: ");
                String str2 = (String) p90Var.d;
                int i = p90Var.b;
                while (!p90Var.z() && !p90.J(str2.charAt(p90Var.b))) {
                    p90Var.b++;
                }
                String strSubstring = str2.substring(i, p90Var.b);
                p90Var.b = i;
                sb.append(strSubstring);
                throw new ibc(sb.toString());
            }
            int iS = p90Var.S();
            if (iS == 0) {
                iS = 1;
            }
            arrayList.add(new l9c(iS, fN));
            p90Var.e0();
        }
        return arrayList;
    }

    public static l9c u(p90 p90Var) {
        return p90Var.w("auto") ? new l9c(0.0f) : p90Var.O();
    }

    public static Float v(String str) {
        try {
            float fP = p(str);
            float f = 0.0f;
            if (fP < 0.0f) {
                fP = f;
            } else {
                f = 1.0f;
                if (fP > 1.0f) {
                    fP = f;
                }
            }
            return Float.valueOf(fP);
        } catch (ibc unused) {
            return null;
        }
    }

    public static iac w(String str) {
        boolean zStartsWith = str.startsWith("url(");
        iac iacVarN = c9c.c;
        d9c d9cVar = d9c.a;
        iac iacVar = null;
        if (!zStartsWith) {
            if (str.equals("none")) {
                return iacVarN;
            }
            if (str.equals("currentColor")) {
                return d9cVar;
            }
            try {
                return n(str);
            } catch (ibc unused) {
                return null;
            }
        }
        int iIndexOf = str.indexOf(")");
        if (iIndexOf == -1) {
            return new q9c(str.substring(4).trim(), null);
        }
        String strTrim = str.substring(4, iIndexOf).trim();
        String strTrim2 = str.substring(iIndexOf + 1).trim();
        if (strTrim2.length() > 0) {
            if (!strTrim2.equals("none")) {
                if (strTrim2.equals("currentColor")) {
                    iacVarN = d9cVar;
                } else {
                    try {
                        iacVarN = n(strTrim2);
                    } catch (ibc unused2) {
                        iacVarN = null;
                    }
                }
            }
            iacVar = iacVarN;
        }
        return new q9c(strTrim, iacVar);
    }

    public static void x(jac jacVar, String str) throws ibc {
        int i;
        p90 p90Var = new p90(str);
        p90Var.f0();
        String strQ = p90Var.Q();
        if ("defer".equals(strQ)) {
            p90Var.f0();
            strQ = p90Var.Q();
        }
        hta htaVar = (hta) jbc.a.get(strQ);
        p90Var.f0();
        if (p90Var.z()) {
            i = 0;
        } else {
            String strQ2 = p90Var.Q();
            strQ2.getClass();
            if (strQ2.equals("meet")) {
                i = 1;
            } else {
                if (!strQ2.equals("slice")) {
                    throw new ibc("Invalid preserveAspectRatio definition: ".concat(str));
                }
                i = 2;
            }
        }
        jacVar.n = new ita(htaVar, i);
    }

    public static HashMap y(p90 p90Var) {
        HashMap map = new HashMap();
        p90Var.f0();
        String strR = p90Var.R('=', false);
        while (strR != null) {
            p90Var.v('=');
            map.put(strR, p90Var.P());
            p90Var.f0();
            strR = p90Var.R('=', false);
        }
        return map;
    }

    public static Matrix z(String str) throws ibc {
        Matrix matrix = new Matrix();
        p90 p90Var = new p90(str);
        p90Var.f0();
        while (!p90Var.z()) {
            String str2 = (String) p90Var.d;
            String strSubstring = null;
            if (!p90Var.z()) {
                int i = p90Var.b;
                int iCharAt = str2.charAt(i);
                while (true) {
                    if ((iCharAt >= 97 && iCharAt <= 122) || (iCharAt >= 65 && iCharAt <= 90)) {
                        iCharAt = p90Var.h();
                    }
                }
                int i2 = p90Var.b;
                while (p90.J(iCharAt)) {
                    iCharAt = p90Var.h();
                }
                if (iCharAt == 40) {
                    p90Var.b++;
                    strSubstring = str2.substring(i, i2);
                } else {
                    p90Var.b = i;
                }
            }
            if (strSubstring == null) {
                throw new ibc("Bad transform function encountered in transform list: ".concat(str));
            }
            switch (strSubstring) {
                case "matrix":
                    p90Var.f0();
                    float fN = p90Var.N();
                    p90Var.e0();
                    float fN2 = p90Var.N();
                    p90Var.e0();
                    float fN3 = p90Var.N();
                    p90Var.e0();
                    float fN4 = p90Var.N();
                    p90Var.e0();
                    float fN5 = p90Var.N();
                    p90Var.e0();
                    float fN6 = p90Var.N();
                    p90Var.f0();
                    if (Float.isNaN(fN6) || !p90Var.v(')')) {
                        throw new ibc("Invalid transform list: ".concat(str));
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{fN, fN3, fN5, fN2, fN4, fN6, 0.0f, 0.0f, 1.0f});
                    matrix.preConcat(matrix2);
                    break;
                    break;
                case "rotate":
                    p90Var.f0();
                    float fN7 = p90Var.N();
                    float fZ = p90Var.Z();
                    float fZ2 = p90Var.Z();
                    p90Var.f0();
                    if (Float.isNaN(fN7) || !p90Var.v(')')) {
                        throw new ibc("Invalid transform list: ".concat(str));
                    }
                    if (Float.isNaN(fZ)) {
                        matrix.preRotate(fN7);
                    } else {
                        if (Float.isNaN(fZ2)) {
                            throw new ibc("Invalid transform list: ".concat(str));
                        }
                        matrix.preRotate(fN7, fZ, fZ2);
                    }
                    break;
                    break;
                case "scale":
                    p90Var.f0();
                    float fN8 = p90Var.N();
                    float fZ3 = p90Var.Z();
                    p90Var.f0();
                    if (Float.isNaN(fN8) || !p90Var.v(')')) {
                        throw new ibc("Invalid transform list: ".concat(str));
                    }
                    if (!Float.isNaN(fZ3)) {
                        matrix.preScale(fN8, fZ3);
                    } else {
                        matrix.preScale(fN8, fN8);
                    }
                    break;
                    break;
                case "skewX":
                    p90Var.f0();
                    float fN9 = p90Var.N();
                    p90Var.f0();
                    if (Float.isNaN(fN9) || !p90Var.v(')')) {
                        throw new ibc("Invalid transform list: ".concat(str));
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians(fN9)), 0.0f);
                    break;
                    break;
                case "skewY":
                    p90Var.f0();
                    float fN10 = p90Var.N();
                    p90Var.f0();
                    if (Float.isNaN(fN10) || !p90Var.v(')')) {
                        throw new ibc("Invalid transform list: ".concat(str));
                    }
                    matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(fN10)));
                    break;
                    break;
                case "translate":
                    p90Var.f0();
                    float fN11 = p90Var.N();
                    float fZ4 = p90Var.Z();
                    p90Var.f0();
                    if (Float.isNaN(fN11) || !p90Var.v(')')) {
                        throw new ibc("Invalid transform list: ".concat(str));
                    }
                    if (!Float.isNaN(fZ4)) {
                        matrix.preTranslate(fN11, fZ4);
                    } else {
                        matrix.preTranslate(fN11, 0.0f);
                    }
                    break;
                    break;
                default:
                    throw new ibc(ib8.j("Invalid transform list fn: ", strSubstring, ")"));
            }
            if (p90Var.z()) {
                return matrix;
            }
            p90Var.e0();
        }
        return matrix;
    }

    public final void A(InputStream inputStream) throws ibc {
        Log.d("SVGParser", "Falling back to SAX parser");
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            nbc nbcVar = new nbc(this);
            xMLReader.setContentHandler(nbcVar);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", nbcVar);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e) {
            throw new ibc("Stream error", e);
        } catch (ParserConfigurationException e2) {
            throw new ibc("XML parser problem", e2);
        } catch (SAXException e3) {
            throw new ibc("SVG parse error", e3);
        }
    }

    public final void B(InputStream inputStream) throws ibc {
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                qbc qbcVar = new qbc();
                qbcVar.a = xmlPullParserNewPullParser;
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType == 0) {
                        D();
                    } else if (eventType == 8) {
                        Log.d("SVGParser", "PROC INSTR: " + xmlPullParserNewPullParser.getText());
                        p90 p90Var = new p90(xmlPullParserNewPullParser.getText());
                        String strQ = p90Var.Q();
                        y(p90Var);
                        strQ.equals("xml-stylesheet");
                    } else if (eventType == 10) {
                        if (((aac) this.a.b) == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                Log.d("SVGParser", "Switching to SAX parser to process entities");
                                inputStream.reset();
                                A(inputStream);
                                return;
                            } catch (IOException unused) {
                                b1.l("SVGParser", "Detected internal entity definitions, but could not parse them.");
                                return;
                            }
                        }
                    } else if (eventType == 2) {
                        String name = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name = xmlPullParserNewPullParser.getPrefix() + ':' + name;
                        }
                        E(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, qbcVar);
                    } else if (eventType == 3) {
                        String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name2 = xmlPullParserNewPullParser.getPrefix() + ':' + name2;
                        }
                        c(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        G(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                    } else if (eventType == 5) {
                        F(xmlPullParserNewPullParser.getText());
                    }
                }
            } catch (IOException e) {
                throw new ibc("Stream error", e);
            }
        } catch (XmlPullParserException e2) {
            throw new ibc("XML parser problem", e2);
        }
    }

    public final void D() {
        gg7 gg7Var = new gg7(22, false);
        gg7Var.b = null;
        gg7Var.c = new s71(0);
        gg7Var.d = new HashMap();
        this.a = gg7Var;
    }

    /* JADX WARN: Code duplicated, block: B:461:0x093c  */
    /* JADX WARN: Code duplicated, block: B:464:0x0943  */
    /* JADX WARN: Code duplicated, block: B:834:0x0980 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:841:0x0963 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void E(String str, String str2, String str3, Attributes attributes) throws ibc {
        int iIntValue;
        char c;
        float fN;
        float f;
        float f2;
        float f3;
        int i;
        char cCharAt;
        byte b;
        if (this.c) {
            this.d++;
            return;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            pbc pbcVar = (pbc) pbc.e.get(str2.length() > 0 ? str2 : str3);
            if (pbcVar == null) {
                pbcVar = pbc.d;
            }
            int i2 = 77;
            byte b2 = 0;
            switch (pbcVar.ordinal()) {
                case 0:
                    aac aacVar = new aac();
                    aacVar.a = this.a;
                    aacVar.b = this.b;
                    g(aacVar, attributes);
                    j(aacVar, attributes);
                    f(aacVar, attributes);
                    m(aacVar, attributes);
                    for (int i3 = 0; i3 < attributes.getLength(); i3++) {
                        String strTrim = attributes.getValue(i3).trim();
                        int iD = ib8.d(attributes, i3);
                        if (iD == 25) {
                            l9c l9cVarS = s(strTrim);
                            aacVar.s = l9cVarS;
                            if (l9cVarS.f()) {
                                cva.l("Invalid <svg> element. height cannot be negative");
                                return;
                            }
                        } else if (iD != 79) {
                            switch (iD) {
                                case 81:
                                    l9c l9cVarS2 = s(strTrim);
                                    aacVar.r = l9cVarS2;
                                    if (l9cVarS2.f()) {
                                        cva.l("Invalid <svg> element. width cannot be negative");
                                        return;
                                    }
                                    break;
                                    break;
                                case 82:
                                    aacVar.p = s(strTrim);
                                    break;
                                case 83:
                                    aacVar.q = s(strTrim);
                                    break;
                            }
                        } else {
                            continue;
                        }
                    }
                    dac dacVar = this.b;
                    if (dacVar == null) {
                        this.a.b = aacVar;
                    } else {
                        dacVar.f(aacVar);
                    }
                    this.b = aacVar;
                    return;
                case 1:
                case 7:
                    if (this.b == null) {
                        cva.l("Invalid document. Root element must be <svg>");
                        return;
                    }
                    i9c i9cVar = new i9c();
                    i9cVar.a = this.a;
                    i9cVar.b = this.b;
                    g(i9cVar, attributes);
                    j(i9cVar, attributes);
                    l(i9cVar, attributes);
                    f(i9cVar, attributes);
                    this.b.f(i9cVar);
                    this.b = i9cVar;
                    return;
                case 2:
                    dac dacVar2 = this.b;
                    if (dacVar2 == null) {
                        cva.l("Invalid document. Root element must be <svg>");
                        return;
                    }
                    a9c a9cVar = new a9c();
                    a9cVar.a = this.a;
                    a9cVar.b = dacVar2;
                    g(a9cVar, attributes);
                    j(a9cVar, attributes);
                    l(a9cVar, attributes);
                    f(a9cVar, attributes);
                    for (int i4 = 0; i4 < attributes.getLength(); i4++) {
                        String strTrim2 = attributes.getValue(i4).trim();
                        int iD2 = ib8.d(attributes, i4);
                        if (iD2 == 6) {
                            a9cVar.o = s(strTrim2);
                        } else if (iD2 == 7) {
                            a9cVar.p = s(strTrim2);
                        } else if (iD2 != 49) {
                            continue;
                        } else {
                            l9c l9cVarS3 = s(strTrim2);
                            a9cVar.q = l9cVarS3;
                            if (l9cVarS3.f()) {
                                cva.l("Invalid <circle> element. r cannot be negative");
                                return;
                            }
                        }
                    }
                    this.b.f(a9cVar);
                    return;
                case 3:
                    if (this.b == null) {
                        cva.l("Invalid document. Root element must be <svg>");
                        return;
                    }
                    b9c b9cVar = new b9c();
                    b9cVar.a = this.a;
                    b9cVar.b = this.b;
                    g(b9cVar, attributes);
                    j(b9cVar, attributes);
                    l(b9cVar, attributes);
                    f(b9cVar, attributes);
                    for (int i5 = 0; i5 < attributes.getLength(); i5++) {
                        String strTrim3 = attributes.getValue(i5).trim();
                        if (ib8.d(attributes, i5) == 3) {
                            if ("objectBoundingBox".equals(strTrim3)) {
                                b9cVar.o = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(strTrim3)) {
                                    cva.l("Invalid value for attribute clipPathUnits");
                                    return;
                                }
                                b9cVar.o = Boolean.TRUE;
                            }
                        }
                    }
                    this.b.f(b9cVar);
                    this.b = b9cVar;
                    return;
                case 4:
                    if (this.b == null) {
                        cva.l("Invalid document. Root element must be <svg>");
                        return;
                    }
                    e9c e9cVar = new e9c();
                    e9cVar.a = this.a;
                    e9cVar.b = this.b;
                    g(e9cVar, attributes);
                    j(e9cVar, attributes);
                    l(e9cVar, attributes);
                    this.b.f(e9cVar);
                    this.b = e9cVar;
                    return;
                case 5:
                case 26:
                    this.e = true;
                    this.f = pbcVar;
                    return;
                case 6:
                    dac dacVar3 = this.b;
                    if (dacVar3 == null) {
                        cva.l("Invalid document. Root element must be <svg>");
                        return;
                    }
                    f9c f9cVar = new f9c();
                    f9cVar.a = this.a;
                    f9cVar.b = dacVar3;
                    g(f9cVar, attributes);
                    j(f9cVar, attributes);
                    l(f9cVar, attributes);
                    f(f9cVar, attributes);
                    for (int i6 = 0; i6 < attributes.getLength(); i6++) {
                        String strTrim4 = attributes.getValue(i6).trim();
                        int iD3 = ib8.d(attributes, i6);
                        if (iD3 == 6) {
                            f9cVar.o = s(strTrim4);
                        } else if (iD3 == 7) {
                            f9cVar.p = s(strTrim4);
                        } else if (iD3 == 56) {
                            l9c l9cVarS4 = s(strTrim4);
                            f9cVar.q = l9cVarS4;
                            if (l9cVarS4.f()) {
                                cva.l("Invalid <ellipse> element. rx cannot be negative");
                                return;
                            }
                        } else if (iD3 != 57) {
                            continue;
                        } else {
                            l9c l9cVarS5 = s(strTrim4);
                            f9cVar.r = l9cVarS5;
                            if (l9cVarS5.f()) {
                                cva.l("Invalid <ellipse> element. ry cannot be negative");
                                return;
                            }
                        }
                    }
                    this.b.f(f9cVar);
                    return;
                case 8:
                    if (this.b == null) {
                        cva.l("Invalid document. Root element must be <svg>");
                        return;
                    }
                    k9c k9cVar = new k9c();
                    k9cVar.a = this.a;
                    k9cVar.b = this.b;
                    g(k9cVar, attributes);
                    j(k9cVar, attributes);
                    l(k9cVar, attributes);
                    f(k9cVar, attributes);
                    for (int i7 = 0; i7 < attributes.getLength(); i7++) {
                        String strTrim5 = attributes.getValue(i7).trim();
                        int iD4 = ib8.d(attributes, i7);
                        if (iD4 == 25) {
                            l9c l9cVarS6 = s(strTrim5);
                            k9cVar.s = l9cVarS6;
                            if (l9cVarS6.f()) {
                                cva.l("Invalid <use> element. height cannot be negative");
                                return;
                            }
                        } else if (iD4 != 26) {
                            if (iD4 != 48) {
                                switch (iD4) {
                                    case 81:
                                        l9c l9cVarS7 = s(strTrim5);
                                        k9cVar.r = l9cVarS7;
                                        if (l9cVarS7.f()) {
                                            cva.l("Invalid <use> element. width cannot be negative");
                                            return;
                                        }
                                        break;
                                        break;
                                    case 82:
                                        k9cVar.p = s(strTrim5);
                                        break;
                                    case 83:
                                        k9cVar.q = s(strTrim5);
                                        break;
                                }
                            } else {
                                x(k9cVar, strTrim5);
                            }
                        } else if ("".equals(attributes.getURI(i7)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i7))) {
                            k9cVar.o = strTrim5;
                        }
                    }
                    this.b.f(k9cVar);
                    this.b = k9cVar;
                    return;
                case 9:
                    dac dacVar4 = this.b;
                    if (dacVar4 == null) {
                        cva.l("Invalid document. Root element must be <svg>");
                        return;
                    }
                    m9c m9cVar = new m9c();
                    m9cVar.a = this.a;
                    m9cVar.b = dacVar4;
                    g(m9cVar, attributes);
                    j(m9cVar, attributes);
                    l(m9cVar, attributes);
                    f(m9cVar, attributes);
                    for (int i8 = 0; i8 < attributes.getLength(); i8++) {
                        String strTrim6 = attributes.getValue(i8).trim();
                        switch (ib8.d(attributes, i8)) {
                            case 84:
                                m9cVar.o = s(strTrim6);
                                break;
                            case 85:
                                m9cVar.p = s(strTrim6);
                                break;
                            case 86:
                                m9cVar.q = s(strTrim6);
                                break;
                            case 87:
                                m9cVar.r = s(strTrim6);
                                break;
                        }
                    }
                    this.b.f(m9cVar);
                    return;
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    if (this.b == null) {
                        cva.l("Invalid document. Root element must be <svg>");
                        return;
                    }
                    gac gacVar = new gac();
                    gacVar.a = this.a;
                    gacVar.b = this.b;
                    g(gacVar, attributes);
                    j(gacVar, attributes);
                    h(gacVar, attributes);
                    for (int i9 = 0; i9 < attributes.getLength(); i9++) {
                        String strTrim7 = attributes.getValue(i9).trim();
                        switch (ib8.d(attributes, i9)) {
                            case 84:
                                gacVar.m = s(strTrim7);
                                break;
                            case 85:
                                gacVar.n = s(strTrim7);
                                break;
                            case 86:
                                gacVar.o = s(strTrim7);
                                break;
                            case 87:
                                gacVar.p = s(strTrim7);
                                break;
                        }
                    }
                    this.b.f(gacVar);
                    this.b = gacVar;
                    return;
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    if (this.b == null) {
                        cva.l("Invalid document. Root element must be <svg>");
                        return;
                    }
                    n9c n9cVar = new n9c();
                    n9cVar.a = this.a;
                    n9cVar.b = this.b;
                    g(n9cVar, attributes);
                    j(n9cVar, attributes);
                    f(n9cVar, attributes);
                    m(n9cVar, attributes);
                    for (int i10 = 0; i10 < attributes.getLength(); i10++) {
                        String strTrim8 = attributes.getValue(i10).trim();
                        int iD5 = ib8.d(attributes, i10);
                        if (iD5 != 41) {
                            if (iD5 == 50) {
                                n9cVar.q = s(strTrim8);
                            } else if (iD5 != 51) {
                                switch (iD5) {
                                    case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                                        l9c l9cVarS8 = s(strTrim8);
                                        n9cVar.t = l9cVarS8;
                                        if (l9cVarS8.f()) {
                                            cva.l("Invalid <marker> element. markerHeight cannot be negative");
                                            return;
                                        }
                                        continue;
                                    case 33:
                                        if ("strokeWidth".equals(strTrim8)) {
                                            n9cVar.p = false;
                                            continue;
                                        } else {
                                            if (!"userSpaceOnUse".equals(strTrim8)) {
                                                cva.l("Invalid value for attribute markerUnits");
                                                return;
                                            }
                                            n9cVar.p = true;
                                        }
                                        break;
                                    case 34:
                                        l9c l9cVarS9 = s(strTrim8);
                                        n9cVar.s = l9cVarS9;
                                        if (l9cVarS9.f()) {
                                            cva.l("Invalid <marker> element. markerWidth cannot be negative");
                                            return;
                                        }
                                        break;
                                }
                            } else {
                                n9cVar.r = s(strTrim8);
                            }
                        } else if ("auto".equals(strTrim8)) {
                            n9cVar.u = Float.valueOf(Float.NaN);
                        } else {
                            n9cVar.u = Float.valueOf(p(strTrim8));
                        }
                    }
                    this.b.f(n9cVar);
                    this.b = n9cVar;
                    return;
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    if (this.b == null) {
                        cva.l("Invalid document. Root element must be <svg>");
                        return;
                    }
                    o9c o9cVar = new o9c();
                    o9cVar.a = this.a;
                    o9cVar.b = this.b;
                    g(o9cVar, attributes);
                    j(o9cVar, attributes);
                    f(o9cVar, attributes);
                    for (int i11 = 0; i11 < attributes.getLength(); i11++) {
                        String strTrim9 = attributes.getValue(i11).trim();
                        int iD6 = ib8.d(attributes, i11);
                        if (iD6 == 25) {
                            l9c l9cVarS10 = s(strTrim9);
                            o9cVar.q = l9cVarS10;
                            if (l9cVarS10.f()) {
                                cva.l("Invalid <mask> element. height cannot be negative");
                                return;
                            }
                        } else if (iD6 != 36) {
                            if (iD6 != 37) {
                                switch (iD6) {
                                    case 81:
                                        l9c l9cVarS11 = s(strTrim9);
                                        o9cVar.p = l9cVarS11;
                                        if (l9cVarS11.f()) {
                                            cva.l("Invalid <mask> element. width cannot be negative");
                                            return;
                                        }
                                        break;
                                        break;
                                    case 82:
                                        s(strTrim9);
                                        break;
                                    case 83:
                                        s(strTrim9);
                                        break;
                                }
                            } else if ("objectBoundingBox".equals(strTrim9)) {
                                o9cVar.n = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(strTrim9)) {
                                    cva.l("Invalid value for attribute maskUnits");
                                    return;
                                }
                                o9cVar.n = Boolean.TRUE;
                            }
                        } else if ("objectBoundingBox".equals(strTrim9)) {
                            o9cVar.o = Boolean.FALSE;
                        } else {
                            if (!"userSpaceOnUse".equals(strTrim9)) {
                                cva.l("Invalid value for attribute maskContentUnits");
                                return;
                            }
                            o9cVar.o = Boolean.TRUE;
                        }
                    }
                    this.b.f(o9cVar);
                    this.b = o9cVar;
                    return;
                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    dac dacVar5 = this.b;
                    if (dacVar5 == null) {
                        cva.l("Invalid document. Root element must be <svg>");
                        return;
                    }
                    r9c r9cVar = new r9c();
                    r9cVar.a = this.a;
                    r9cVar.b = dacVar5;
                    g(r9cVar, attributes);
                    j(r9cVar, attributes);
                    l(r9cVar, attributes);
                    f(r9cVar, attributes);
                    int i12 = 0;
                    while (i12 < attributes.getLength()) {
                        String strTrim10 = attributes.getValue(i12).trim();
                        int iD7 = ib8.d(attributes, i12);
                        if (iD7 == 13) {
                            p90 p90Var = new p90(strTrim10);
                            p90 p90Var2 = new p90(6, b2);
                            p90Var2.b = b2;
                            p90Var2.c = b2;
                            p90Var2.d = new byte[8];
                            p90Var2.e = new float[16];
                            if (!p90Var.z() && ((iIntValue = p90Var.M().intValue()) == i2 || iIntValue == 109)) {
                                float f4 = 0.0f;
                                float f5 = 0.0f;
                                float f6 = 0.0f;
                                float f7 = 0.0f;
                                float f8 = 0.0f;
                                float f9 = 0.0f;
                                while (true) {
                                    p90Var.f0();
                                    switch (iIntValue) {
                                        case 65:
                                        case 97:
                                            i12 = i12;
                                            p90 p90Var3 = p90Var2;
                                            c = 'm';
                                            float fN2 = p90Var.N();
                                            float fL = p90Var.l(fN2);
                                            float fL2 = p90Var.l(fL);
                                            Boolean boolK = p90Var.k(Float.valueOf(fL2));
                                            Boolean boolK2 = p90Var.k(boolK);
                                            if (boolK2 == null) {
                                                fN = Float.NaN;
                                            } else {
                                                p90Var.e0();
                                                fN = p90Var.N();
                                            }
                                            float fL3 = p90Var.l(fN);
                                            if (Float.isNaN(fL3) || fN2 < 0.0f || fL < 0.0f) {
                                                p90Var2 = p90Var3;
                                                b1.d("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                            } else {
                                                float f10 = fN;
                                                if (iIntValue == 97) {
                                                    fL3 += f6;
                                                    f = f10 + f4;
                                                } else {
                                                    f = f10;
                                                }
                                                float f11 = fL3;
                                                p90Var3.d(fN2, fL, fL2, boolK.booleanValue(), boolK2.booleanValue(), f, f11);
                                                p90Var2 = p90Var3;
                                                f4 = f;
                                                f5 = f4;
                                                f6 = f11;
                                                f7 = f6;
                                                p90Var.e0();
                                                if (p90Var.z()) {
                                                    i = p90Var.b;
                                                    if (i != p90Var.c && (((cCharAt = ((String) p90Var.d).charAt(i)) >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z'))) {
                                                        iIntValue = p90Var.M().intValue();
                                                    }
                                                    p90Var2 = p90Var2;
                                                    i12 = i12;
                                                }
                                            }
                                            break;
                                        case 67:
                                        case 99:
                                            i12 = i12;
                                            p90 p90Var4 = p90Var2;
                                            c = 'm';
                                            float fN3 = p90Var.N();
                                            float fL4 = p90Var.l(fN3);
                                            float fL5 = p90Var.l(fL4);
                                            float fL6 = p90Var.l(fL5);
                                            float fL7 = p90Var.l(fL6);
                                            float fL8 = p90Var.l(fL7);
                                            if (Float.isNaN(fL8)) {
                                                b1.d("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                                p90Var2 = p90Var4;
                                            } else {
                                                if (iIntValue == 99) {
                                                    fL7 += f4;
                                                    fL4 += f6;
                                                    fL5 += f4;
                                                    fL6 += f6;
                                                    f2 = fL8 + f6;
                                                    f3 = fN3 + f4;
                                                } else {
                                                    f2 = fL8;
                                                    f3 = fN3;
                                                }
                                                float f12 = fL6;
                                                float f13 = fL7;
                                                float f14 = fL5;
                                                p90Var4.c(f3, fL4, f14, f12, f13, f2);
                                                f5 = f14;
                                                f7 = f12;
                                                f4 = f13;
                                                f6 = f2;
                                                p90Var2 = p90Var4;
                                                p90Var.e0();
                                                if (p90Var.z()) {
                                                    i = p90Var.b;
                                                    if (i != p90Var.c) {
                                                        iIntValue = p90Var.M().intValue();
                                                    }
                                                    p90Var2 = p90Var2;
                                                    i12 = i12;
                                                }
                                            }
                                            break;
                                        case 72:
                                        case 104:
                                            i12 = i12;
                                            p90Var2 = p90Var2;
                                            c = 'm';
                                            float fN4 = p90Var.N();
                                            if (Float.isNaN(fN4)) {
                                                b1.d("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                            } else {
                                                if (iIntValue == 104) {
                                                    fN4 += f4;
                                                }
                                                f4 = fN4;
                                                p90Var2.e(f4, f6);
                                                f5 = f4;
                                                p90Var.e0();
                                                if (p90Var.z()) {
                                                    i = p90Var.b;
                                                    if (i != p90Var.c) {
                                                        iIntValue = p90Var.M().intValue();
                                                    }
                                                    p90Var2 = p90Var2;
                                                    i12 = i12;
                                                }
                                            }
                                            break;
                                        case 76:
                                        case 108:
                                            i12 = i12;
                                            p90Var2 = p90Var2;
                                            float fN5 = p90Var.N();
                                            float fL9 = p90Var.l(fN5);
                                            if (Float.isNaN(fL9)) {
                                                b1.d("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                            } else {
                                                if (iIntValue == 108) {
                                                    fN5 += f4;
                                                    fL9 += f6;
                                                }
                                                f4 = fN5;
                                                f6 = fL9;
                                                p90Var2.e(f4, f6);
                                                f5 = f4;
                                                c = 'm';
                                                f7 = f6;
                                                p90Var.e0();
                                                if (p90Var.z()) {
                                                    i = p90Var.b;
                                                    if (i != p90Var.c) {
                                                        iIntValue = p90Var.M().intValue();
                                                    }
                                                    p90Var2 = p90Var2;
                                                    i12 = i12;
                                                }
                                            }
                                            break;
                                        case 77:
                                        case 109:
                                            i12 = i12;
                                            p90Var2 = p90Var2;
                                            float fN6 = p90Var.N();
                                            float fL10 = p90Var.l(fN6);
                                            if (Float.isNaN(fL10)) {
                                                b1.d("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                            } else {
                                                if (iIntValue == 109 && p90Var2.b != 0) {
                                                    fN6 += f4;
                                                    fL10 += f6;
                                                }
                                                f4 = fN6;
                                                f6 = fL10;
                                                p90Var2.b(f4, f6);
                                                f5 = f4;
                                                f8 = f5;
                                                iIntValue = iIntValue == 109 ? 108 : 76;
                                                f9 = f6;
                                                c = 'm';
                                                f7 = f9;
                                                p90Var.e0();
                                                if (p90Var.z()) {
                                                    i = p90Var.b;
                                                    if (i != p90Var.c) {
                                                        iIntValue = p90Var.M().intValue();
                                                    }
                                                    p90Var2 = p90Var2;
                                                    i12 = i12;
                                                }
                                            }
                                            break;
                                        case 81:
                                        case 113:
                                            i12 = i12;
                                            p90Var2 = p90Var2;
                                            float fN7 = p90Var.N();
                                            float fL11 = p90Var.l(fN7);
                                            float fL12 = p90Var.l(fL11);
                                            float fL13 = p90Var.l(fL12);
                                            if (Float.isNaN(fL13)) {
                                                b1.d("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                            } else {
                                                if (iIntValue == 113) {
                                                    fL12 += f4;
                                                    fL13 += f6;
                                                    fN7 += f4;
                                                    fL11 += f6;
                                                }
                                                f4 = fL12;
                                                f6 = fL13;
                                                f7 = fL11;
                                                f5 = fN7;
                                                p90Var2.a(f5, f7, f4, f6);
                                                c = 'm';
                                                p90Var.e0();
                                                if (p90Var.z()) {
                                                    i = p90Var.b;
                                                    if (i != p90Var.c) {
                                                        iIntValue = p90Var.M().intValue();
                                                    }
                                                    p90Var2 = p90Var2;
                                                    i12 = i12;
                                                }
                                            }
                                            break;
                                        case 83:
                                        case 115:
                                            i12 = i12;
                                            float f15 = (f4 * 2.0f) - f5;
                                            float f16 = (2.0f * f6) - f7;
                                            float fN8 = p90Var.N();
                                            float fL14 = p90Var.l(fN8);
                                            float fL15 = p90Var.l(fL14);
                                            float fL16 = p90Var.l(fL15);
                                            if (Float.isNaN(fL16)) {
                                                b1.d("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                                p90Var2 = p90Var2;
                                            } else {
                                                if (iIntValue == 115) {
                                                    fL15 += f4;
                                                    fL16 += f6;
                                                    fN8 += f4;
                                                    fL14 += f6;
                                                }
                                                float f17 = fN8;
                                                p90 p90Var5 = p90Var2;
                                                float f18 = fL14;
                                                float f19 = fL15;
                                                float f20 = fL16;
                                                p90Var5.c(f15, f16, f17, f18, f19, f20);
                                                f5 = f17;
                                                f7 = f18;
                                                f4 = f19;
                                                f6 = f20;
                                                p90Var2 = p90Var5;
                                                c = 'm';
                                                p90Var.e0();
                                                if (p90Var.z()) {
                                                    i = p90Var.b;
                                                    if (i != p90Var.c) {
                                                        iIntValue = p90Var.M().intValue();
                                                    }
                                                    p90Var2 = p90Var2;
                                                    i12 = i12;
                                                }
                                            }
                                            break;
                                        case 84:
                                        case 116:
                                            f5 = (f4 * 2.0f) - f5;
                                            f7 = (2.0f * f6) - f7;
                                            i12 = i12;
                                            float fN9 = p90Var.N();
                                            float fL17 = p90Var.l(fN9);
                                            if (Float.isNaN(fL17)) {
                                                b1.d("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                                p90Var2 = p90Var2;
                                            } else {
                                                if (iIntValue == 116) {
                                                    fN9 += f4;
                                                    fL17 += f6;
                                                }
                                                f4 = fN9;
                                                f6 = fL17;
                                                p90Var2.a(f5, f7, f4, f6);
                                                p90Var2 = p90Var2;
                                                c = 'm';
                                                p90Var.e0();
                                                if (p90Var.z()) {
                                                    i = p90Var.b;
                                                    if (i != p90Var.c) {
                                                        iIntValue = p90Var.M().intValue();
                                                    }
                                                    p90Var2 = p90Var2;
                                                    i12 = i12;
                                                }
                                            }
                                            break;
                                        case 86:
                                        case 118:
                                            float fN10 = p90Var.N();
                                            if (Float.isNaN(fN10)) {
                                                b1.d("SVGParser", "Bad path coords for " + ((char) iIntValue) + " path segment");
                                                i12 = i12;
                                                p90Var2 = p90Var2;
                                            } else {
                                                if (iIntValue == 118) {
                                                    fN10 += f6;
                                                }
                                                f6 = fN10;
                                                p90Var2.e(f4, f6);
                                                f7 = f6;
                                                c = 'm';
                                                p90Var.e0();
                                                if (p90Var.z()) {
                                                    i = p90Var.b;
                                                    if (i != p90Var.c) {
                                                        iIntValue = p90Var.M().intValue();
                                                    }
                                                    p90Var2 = p90Var2;
                                                    i12 = i12;
                                                }
                                            }
                                            break;
                                        case 90:
                                        case 122:
                                            p90Var2.close();
                                            f4 = f8;
                                            f5 = f4;
                                            f6 = f9;
                                            f7 = f6;
                                            c = 'm';
                                            p90Var.e0();
                                            if (p90Var.z()) {
                                                i = p90Var.b;
                                                if (i != p90Var.c) {
                                                    iIntValue = p90Var.M().intValue();
                                                }
                                                p90Var2 = p90Var2;
                                                i12 = i12;
                                            }
                                            break;
                                        default:
                                            i12 = i12;
                                            p90Var2 = p90Var2;
                                            break;
                                    }
                                }
                            } else {
                                i12 = i12;
                                p90Var2 = p90Var2;
                            }
                            r9cVar.o = p90Var2;
                        } else {
                            if (iD7 == 43 && p(strTrim10) < 0.0f) {
                                cva.l("Invalid <path> element. pathLength cannot be negative");
                                return;
                            }
                            i12 = i12;
                        }
                        i12++;
                        i2 = 77;
                        b2 = 0;
                    }
                    this.b.f(r9cVar);
                    return;
                case 14:
                    if (this.b == null) {
                        cva.l("Invalid document. Root element must be <svg>");
                        return;
                    }
                    t9c t9cVar = new t9c();
                    t9cVar.a = this.a;
                    t9cVar.b = this.b;
                    g(t9cVar, attributes);
                    j(t9cVar, attributes);
                    f(t9cVar, attributes);
                    m(t9cVar, attributes);
                    for (int i13 = 0; i13 < attributes.getLength(); i13++) {
                        String strTrim11 = attributes.getValue(i13).trim();
                        int iD8 = ib8.d(attributes, i13);
                        if (iD8 == 25) {
                            l9c l9cVarS12 = s(strTrim11);
                            t9cVar.v = l9cVarS12;
                            if (l9cVarS12.f()) {
                                cva.l("Invalid <pattern> element. height cannot be negative");
                                return;
                            }
                        } else if (iD8 != 26) {
                            switch (iD8) {
                                case 44:
                                    if ("objectBoundingBox".equals(strTrim11)) {
                                        t9cVar.q = Boolean.FALSE;
                                    } else {
                                        if (!"userSpaceOnUse".equals(strTrim11)) {
                                            cva.l("Invalid value for attribute patternContentUnits");
                                            return;
                                        }
                                        t9cVar.q = Boolean.TRUE;
                                    }
                                    break;
                                case 45:
                                    t9cVar.r = z(strTrim11);
                                    break;
                                case 46:
                                    if ("objectBoundingBox".equals(strTrim11)) {
                                        t9cVar.p = Boolean.FALSE;
                                    } else {
                                        if (!"userSpaceOnUse".equals(strTrim11)) {
                                            cva.l("Invalid value for attribute patternUnits");
                                            return;
                                        }
                                        t9cVar.p = Boolean.TRUE;
                                    }
                                    break;
                                default:
                                    switch (iD8) {
                                        case 81:
                                            l9c l9cVarS13 = s(strTrim11);
                                            t9cVar.u = l9cVarS13;
                                            if (l9cVarS13.f()) {
                                                cva.l("Invalid <pattern> element. width cannot be negative");
                                                return;
                                            }
                                            break;
                                            break;
                                        case 82:
                                            t9cVar.s = s(strTrim11);
                                            break;
                                        case 83:
                                            t9cVar.t = s(strTrim11);
                                            break;
                                    }
                                    break;
                            }
                        } else if ("".equals(attributes.getURI(i13)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i13))) {
                            t9cVar.w = strTrim11;
                        }
                    }
                    this.b.f(t9cVar);
                    this.b = t9cVar;
                    return;
                case 15:
                    dac dacVar6 = this.b;
                    if (dacVar6 == null) {
                        cva.l("Invalid document. Root element must be <svg>");
                        return;
                    }
                    v9c v9cVar = new v9c();
                    v9cVar.a = this.a;
                    v9cVar.b = dacVar6;
                    g(v9cVar, attributes);
                    j(v9cVar, attributes);
                    l(v9cVar, attributes);
                    f(v9cVar, attributes);
                    i(v9cVar, attributes, "polygon");
                    this.b.f(v9cVar);
                    return;
                case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                    dac dacVar7 = this.b;
                    if (dacVar7 == null) {
                        cva.l("Invalid document. Root element must be <svg>");
                        return;
                    }
                    u9c u9cVar = new u9c();
                    u9cVar.a = this.a;
                    u9cVar.b = dacVar7;
                    g(u9cVar, attributes);
                    j(u9cVar, attributes);
                    l(u9cVar, attributes);
                    f(u9cVar, attributes);
                    i(u9cVar, attributes, "polyline");
                    this.b.f(u9cVar);
                    return;
                case 17:
                    if (this.b == null) {
                        cva.l("Invalid document. Root element must be <svg>");
                        return;
                    }
                    kac kacVar = new kac();
                    kacVar.a = this.a;
                    kacVar.b = this.b;
                    g(kacVar, attributes);
                    j(kacVar, attributes);
                    h(kacVar, attributes);
                    for (int i14 = 0; i14 < attributes.getLength(); i14++) {
                        String strTrim12 = attributes.getValue(i14).trim();
                        int iD9 = ib8.d(attributes, i14);
                        if (iD9 == 6) {
                            kacVar.m = s(strTrim12);
                        } else if (iD9 == 7) {
                            kacVar.n = s(strTrim12);
                        } else if (iD9 == 11) {
                            kacVar.p = s(strTrim12);
                        } else if (iD9 == 12) {
                            kacVar.q = s(strTrim12);
                        } else if (iD9 != 49) {
                            continue;
                        } else {
                            l9c l9cVarS14 = s(strTrim12);
                            kacVar.o = l9cVarS14;
                            if (l9cVarS14.f()) {
                                cva.l("Invalid <radialGradient> element. r cannot be negative");
                                return;
                            }
                        }
                    }
                    this.b.f(kacVar);
                    this.b = kacVar;
                    return;
                case 18:
                    dac dacVar8 = this.b;
                    if (dacVar8 == null) {
                        cva.l("Invalid document. Root element must be <svg>");
                        return;
                    }
                    w9c w9cVar = new w9c();
                    w9cVar.a = this.a;
                    w9cVar.b = dacVar8;
                    g(w9cVar, attributes);
                    j(w9cVar, attributes);
                    l(w9cVar, attributes);
                    f(w9cVar, attributes);
                    for (int i15 = 0; i15 < attributes.getLength(); i15++) {
                        String strTrim13 = attributes.getValue(i15).trim();
                        int iD10 = ib8.d(attributes, i15);
                        if (iD10 == 25) {
                            l9c l9cVarS15 = s(strTrim13);
                            w9cVar.r = l9cVarS15;
                            if (l9cVarS15.f()) {
                                cva.l("Invalid <rect> element. height cannot be negative");
                                return;
                            }
                        } else if (iD10 == 56) {
                            l9c l9cVarS16 = s(strTrim13);
                            w9cVar.s = l9cVarS16;
                            if (l9cVarS16.f()) {
                                cva.l("Invalid <rect> element. rx cannot be negative");
                                return;
                            }
                        } else if (iD10 != 57) {
                            switch (iD10) {
                                case 81:
                                    l9c l9cVarS17 = s(strTrim13);
                                    w9cVar.q = l9cVarS17;
                                    if (l9cVarS17.f()) {
                                        cva.l("Invalid <rect> element. width cannot be negative");
                                        return;
                                    }
                                    break;
                                    break;
                                case 82:
                                    w9cVar.o = s(strTrim13);
                                    break;
                                case 83:
                                    w9cVar.p = s(strTrim13);
                                    break;
                            }
                        } else {
                            l9c l9cVarS18 = s(strTrim13);
                            w9cVar.t = l9cVarS18;
                            if (l9cVarS18.f()) {
                                cva.l("Invalid <rect> element. ry cannot be negative");
                                return;
                            }
                        }
                    }
                    this.b.f(w9cVar);
                    return;
                case 19:
                    dac dacVar9 = this.b;
                    if (dacVar9 == null) {
                        cva.l("Invalid document. Root element must be <svg>");
                        return;
                    }
                    x9c x9cVar = new x9c();
                    x9cVar.a = this.a;
                    x9cVar.b = dacVar9;
                    g(x9cVar, attributes);
                    j(x9cVar, attributes);
                    this.b.f(x9cVar);
                    this.b = x9cVar;
                    return;
                case 20:
                    dac dacVar10 = this.b;
                    if (dacVar10 == null) {
                        cva.l("Invalid document. Root element must be <svg>");
                        return;
                    }
                    if (!(dacVar10 instanceof g9c)) {
                        cva.l("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
                        return;
                    }
                    y9c y9cVar = new y9c();
                    y9cVar.a = this.a;
                    y9cVar.b = dacVar10;
                    g(y9cVar, attributes);
                    j(y9cVar, attributes);
                    for (int i16 = 0; i16 < attributes.getLength(); i16++) {
                        String strTrim14 = attributes.getValue(i16).trim();
                        if (ib8.d(attributes, i16) == 39) {
                            if (strTrim14.length() == 0) {
                                cva.l("Invalid offset value in <stop> (empty string)");
                                return;
                            }
                            int length = strTrim14.length();
                            if (strTrim14.charAt(strTrim14.length() - 1) == '%') {
                                length--;
                                b = true;
                            } else {
                                b = false;
                            }
                            try {
                                float fO = o(length, strTrim14);
                                float f21 = 100.0f;
                                if (b != false) {
                                    fO /= 100.0f;
                                }
                                if (fO < 0.0f) {
                                    f21 = 0.0f;
                                } else if (fO <= 100.0f) {
                                    f21 = fO;
                                }
                                y9cVar.h = Float.valueOf(f21);
                            } catch (NumberFormatException e) {
                                throw new ibc("Invalid offset value in <stop>: ".concat(strTrim14), e);
                            }
                        }
                    }
                    this.b.f(y9cVar);
                    this.b = y9cVar;
                    return;
                case 21:
                    if (this.b == null) {
                        cva.l("Invalid document. Root element must be <svg>");
                        return;
                    }
                    String str4 = "all";
                    boolean zEquals = true;
                    for (int i17 = 0; i17 < attributes.getLength(); i17++) {
                        String strTrim15 = attributes.getValue(i17).trim();
                        int iD11 = ib8.d(attributes, i17);
                        if (iD11 == 38) {
                            str4 = strTrim15;
                        } else if (iD11 == 77) {
                            zEquals = strTrim15.equals("text/css");
                        }
                    }
                    if (zEquals) {
                        i71 i71Var = new i71(str4);
                        i71Var.f0();
                        for (j71 j71Var : v71.f(i71Var)) {
                            if (j71Var == j71.a || j71Var == j71.b) {
                                this.h = true;
                                return;
                            }
                        }
                    }
                    this.c = true;
                    this.d = 1;
                    return;
                case 22:
                    if (this.b == null) {
                        cva.l("Invalid document. Root element must be <svg>");
                        return;
                    }
                    mac macVar = new mac();
                    macVar.a = this.a;
                    macVar.b = this.b;
                    g(macVar, attributes);
                    j(macVar, attributes);
                    l(macVar, attributes);
                    f(macVar, attributes);
                    this.b.f(macVar);
                    this.b = macVar;
                    return;
                case 23:
                    if (this.b == null) {
                        cva.l("Invalid document. Root element must be <svg>");
                        return;
                    }
                    nac nacVar = new nac();
                    nacVar.a = this.a;
                    nacVar.b = this.b;
                    g(nacVar, attributes);
                    j(nacVar, attributes);
                    f(nacVar, attributes);
                    m(nacVar, attributes);
                    this.b.f(nacVar);
                    this.b = nacVar;
                    return;
                case 24:
                    if (this.b == null) {
                        cva.l("Invalid document. Root element must be <svg>");
                        return;
                    }
                    qac qacVar = new qac();
                    qacVar.a = this.a;
                    qacVar.b = this.b;
                    g(qacVar, attributes);
                    j(qacVar, attributes);
                    l(qacVar, attributes);
                    f(qacVar, attributes);
                    k(qacVar, attributes);
                    this.b.f(qacVar);
                    this.b = qacVar;
                    return;
                case 25:
                    if (this.b == null) {
                        cva.l("Invalid document. Root element must be <svg>");
                        return;
                    }
                    tac tacVar = new tac();
                    tacVar.a = this.a;
                    tacVar.b = this.b;
                    g(tacVar, attributes);
                    j(tacVar, attributes);
                    f(tacVar, attributes);
                    for (int i18 = 0; i18 < attributes.getLength(); i18++) {
                        String strTrim16 = attributes.getValue(i18).trim();
                        int iD12 = ib8.d(attributes, i18);
                        if (iD12 != 26) {
                            if (iD12 == 61) {
                                tacVar.o = s(strTrim16);
                            }
                        } else if ("".equals(attributes.getURI(i18)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i18))) {
                            tacVar.n = strTrim16;
                        }
                    }
                    this.b.f(tacVar);
                    this.b = tacVar;
                    dac dacVar11 = tacVar.b;
                    if (dacVar11 instanceof qac) {
                        tacVar.p = (qac) dacVar11;
                        return;
                    } else {
                        tacVar.p = ((rac) dacVar11).d();
                        return;
                    }
                case 27:
                    dac dacVar12 = this.b;
                    if (dacVar12 == null) {
                        cva.l("Invalid document. Root element must be <svg>");
                        return;
                    }
                    if (!(dacVar12 instanceof sac)) {
                        cva.l("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
                        return;
                    }
                    oac oacVar = new oac();
                    oacVar.a = this.a;
                    oacVar.b = this.b;
                    g(oacVar, attributes);
                    j(oacVar, attributes);
                    f(oacVar, attributes);
                    for (int i19 = 0; i19 < attributes.getLength(); i19++) {
                        String strTrim17 = attributes.getValue(i19).trim();
                        if (ib8.d(attributes, i19) == 26 && ("".equals(attributes.getURI(i19)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i19)))) {
                            oacVar.n = strTrim17;
                        }
                    }
                    this.b.f(oacVar);
                    dac dacVar13 = oacVar.b;
                    if (dacVar13 instanceof qac) {
                        oacVar.o = (qac) dacVar13;
                        return;
                    } else {
                        oacVar.o = ((rac) dacVar13).d();
                        return;
                    }
                case 28:
                    dac dacVar14 = this.b;
                    if (dacVar14 == null) {
                        cva.l("Invalid document. Root element must be <svg>");
                        return;
                    }
                    if (!(dacVar14 instanceof sac)) {
                        cva.l("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
                        return;
                    }
                    pac pacVar = new pac();
                    pacVar.a = this.a;
                    pacVar.b = this.b;
                    g(pacVar, attributes);
                    j(pacVar, attributes);
                    f(pacVar, attributes);
                    k(pacVar, attributes);
                    this.b.f(pacVar);
                    this.b = pacVar;
                    dac dacVar15 = pacVar.b;
                    if (dacVar15 instanceof qac) {
                        pacVar.r = (qac) dacVar15;
                        return;
                    } else {
                        pacVar.r = ((rac) dacVar15).d();
                        return;
                    }
                case 29:
                    if (this.b == null) {
                        cva.l("Invalid document. Root element must be <svg>");
                        return;
                    }
                    wac wacVar = new wac();
                    wacVar.a = this.a;
                    wacVar.b = this.b;
                    g(wacVar, attributes);
                    j(wacVar, attributes);
                    l(wacVar, attributes);
                    f(wacVar, attributes);
                    for (int i20 = 0; i20 < attributes.getLength(); i20++) {
                        String strTrim18 = attributes.getValue(i20).trim();
                        int iD13 = ib8.d(attributes, i20);
                        if (iD13 == 25) {
                            l9c l9cVarS19 = s(strTrim18);
                            wacVar.s = l9cVarS19;
                            if (l9cVarS19.f()) {
                                cva.l("Invalid <use> element. height cannot be negative");
                                return;
                            }
                        } else if (iD13 != 26) {
                            switch (iD13) {
                                case 81:
                                    l9c l9cVarS20 = s(strTrim18);
                                    wacVar.r = l9cVarS20;
                                    if (l9cVarS20.f()) {
                                        cva.l("Invalid <use> element. width cannot be negative");
                                        return;
                                    }
                                    break;
                                    break;
                                case 82:
                                    wacVar.p = s(strTrim18);
                                    break;
                                case 83:
                                    wacVar.q = s(strTrim18);
                                    break;
                            }
                        } else if ("".equals(attributes.getURI(i20)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i20))) {
                            wacVar.o = strTrim18;
                        }
                    }
                    this.b.f(wacVar);
                    this.b = wacVar;
                    return;
                case 30:
                    if (this.b == null) {
                        cva.l("Invalid document. Root element must be <svg>");
                        return;
                    }
                    xac xacVar = new xac();
                    xacVar.a = this.a;
                    xacVar.b = this.b;
                    g(xacVar, attributes);
                    f(xacVar, attributes);
                    m(xacVar, attributes);
                    this.b.f(xacVar);
                    this.b = xacVar;
                    return;
                default:
                    this.c = true;
                    this.d = 1;
                    return;
            }
        }
    }

    public final void F(String str) {
        if (this.c) {
            return;
        }
        if (this.e) {
            StringBuilder sb = this.g;
            if (sb == null) {
                sb = new StringBuilder(str.length());
                this.g = sb;
            }
            sb.append(str);
            return;
        }
        if (!this.h) {
            if (this.b instanceof sac) {
                a(str);
            }
        } else {
            StringBuilder sb2 = this.i;
            if (sb2 == null) {
                sb2 = new StringBuilder(str.length());
                this.i = sb2;
            }
            sb2.append(str);
        }
    }

    public final void G(char[] cArr, int i, int i2) {
        if (this.c) {
            return;
        }
        if (this.e) {
            StringBuilder sb = this.g;
            if (sb == null) {
                sb = new StringBuilder(i2);
                this.g = sb;
            }
            sb.append(cArr, i, i2);
            return;
        }
        if (!this.h) {
            if (this.b instanceof sac) {
                a(new String(cArr, i, i2));
            }
        } else {
            StringBuilder sb2 = this.i;
            if (sb2 == null) {
                sb2 = new StringBuilder(i2);
                this.i = sb2;
            }
            sb2.append(cArr, i, i2);
        }
    }

    public final void a(String str) {
        cac cacVar = (cac) this.b;
        int size = cacVar.i.size();
        hac hacVar = size == 0 ? null : (hac) cacVar.i.get(size - 1);
        if (hacVar instanceof vac) {
            vac vacVar = (vac) hacVar;
            vacVar.c = ks0.l(new StringBuilder(), vacVar.c, str);
        } else {
            dac dacVar = this.b;
            vac vacVar2 = new vac();
            vacVar2.c = str;
            dacVar.f(vacVar2);
        }
    }

    public final void c(String str, String str2, String str3) {
        if (this.c) {
            int i = this.d - 1;
            this.d = i;
            if (i == 0) {
                this.c = false;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            pbc pbcVar = (pbc) pbc.e.get(str2);
            if (pbcVar == null) {
                pbcVar = pbc.d;
            }
            switch (pbcVar.ordinal()) {
                case 0:
                case 3:
                case 4:
                case 7:
                case 8:
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                case 14:
                case 17:
                case 19:
                case 20:
                case 22:
                case 23:
                case 24:
                case 25:
                case 28:
                case 29:
                case 30:
                    this.b = ((hac) this.b).b;
                    break;
                case 5:
                case 26:
                    this.e = false;
                    if (this.g != null) {
                        pbc pbcVar2 = this.f;
                        if (pbcVar2 == pbc.c || pbcVar2 == pbc.a) {
                            this.a.getClass();
                        }
                        this.g.setLength(0);
                    }
                    break;
                case 21:
                    StringBuilder sb = this.i;
                    if (sb != null) {
                        this.h = false;
                        String string = sb.toString();
                        v71 v71Var = new v71(1);
                        gg7 gg7Var = this.a;
                        i71 i71Var = new i71(string);
                        i71Var.f0();
                        ((s71) gg7Var.c).g(v71Var.h(i71Var));
                        this.i.setLength(0);
                    }
                    break;
            }
        }
    }
}
