package defpackage;

import android.text.Layout;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a6f implements f8e {
    public static final Pattern b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern v = Pattern.compile("^(\\d+) (\\d+)$");
    public static final z5f w = new z5f(30.0f, 1, 1);
    public final XmlPullParserFactory a;

    public a6f() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            cva.q("Couldn't create XmlPullParserFactory instance", e2);
            throw null;
        }
    }

    public static c6f a(c6f c6fVar) {
        return c6fVar == null ? new c6f() : c6fVar;
    }

    public static boolean b(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static int c(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = v.matcher(attributeValue);
        if (!matcher.matches()) {
            xo1.V("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z = true;
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i2 = Integer.parseInt(strGroup2);
            if (i == 0 || i2 == 0) {
                z = false;
            }
            pa7.y("Invalid cell resolution %s %s", i, i2, z);
            return i2;
        } catch (NumberFormatException unused) {
            xo1.V("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void d(String str, c6f c6fVar) throws z7e {
        Matcher matcher;
        String str2 = pqf.a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = d;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new z7e(tec.g(strArrSplit.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
            }
            matcher = pattern.matcher(strArrSplit[1]);
            xo1.V("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new z7e(ib8.j("Invalid expression for fontSize: '", str, "'."));
        }
        String strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                c6fVar.j = 3;
                break;
            case "em":
                c6fVar.j = 2;
                break;
            case "px":
                c6fVar.j = 1;
                break;
            default:
                throw new z7e(ib8.j("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        c6fVar.k = Float.parseFloat(strGroup2);
    }

    public static z5f e(XmlPullParser xmlPullParser) {
        float f2;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String str = pqf.a;
            String[] strArrSplit = attributeValue2.split(" ", -1);
            pa7.z("frameRateMultiplier doesn't have 2 parts", strArrSplit.length == 2);
            f2 = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
        } else {
            f2 = 1.0f;
        }
        z5f z5fVar = w;
        int i2 = z5fVar.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = z5fVar.c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new z5f(i * f2, i2, i3);
    }

    /* JADX WARN: Failed to calculate best type for var: r11v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v8 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v9 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v20 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v21 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v21 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v26 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v26 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v1 ??, new type: float
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static void f(org.xmlpull.v1.XmlPullParser r21, java.util.HashMap r22, int r23, defpackage.h71 r24, java.util.HashMap r25, java.util.HashMap r26) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a6f.f(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, h71, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:6:0x003c  */
    public static y5f h(XmlPullParser xmlPullParser, y5f y5fVar, HashMap map, z5f z5fVar) throws z7e {
        long j;
        String[] strArrSplit;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        c6f c6fVarI = i(xmlPullParser, null);
        String strSubstring = null;
        String str = "";
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        long j4 = -9223372036854775807L;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            attributeName.getClass();
            switch (attributeName) {
                case "region":
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                    break;
                case "dur":
                    j4 = j(attributeValue, z5fVar);
                    break;
                case "end":
                    j3 = j(attributeValue, z5fVar);
                    break;
                case "begin":
                    j2 = j(attributeValue, z5fVar);
                    break;
                case "style":
                    String strTrim = attributeValue.trim();
                    if (strTrim.isEmpty()) {
                        strArrSplit = new String[0];
                    } else {
                        String str2 = pqf.a;
                        strArrSplit = strTrim.split("\\s+", -1);
                    }
                    if (strArrSplit.length > 0) {
                        strArr = strArrSplit;
                        break;
                    }
                    break;
                case "backgroundImage":
                    if (attributeValue.startsWith("#")) {
                        strSubstring = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (y5fVar != null) {
            long j5 = y5fVar.d;
            if (j5 != -9223372036854775807L) {
                j2 = j2 != -9223372036854775807L ? j2 + j5 : j5;
                if (j3 != -9223372036854775807L) {
                    j3 += j5;
                }
            }
        }
        if (j3 != -9223372036854775807L) {
            j = j3;
        } else {
            if (j4 != -9223372036854775807L) {
                j3 = j2 + j4;
            } else if (y5fVar != null) {
                long j6 = y5fVar.e;
                if (j6 != -9223372036854775807L) {
                    j = j6;
                }
            }
            j = j3;
        }
        return new y5f(xmlPullParser.getName(), null, j2, j, c6fVarI, strArr, str, strSubstring, y5fVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:125:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:150:0x0229  */
    /* JADX WARN: Code duplicated, block: B:152:0x023d  */
    /* JADX WARN: Code duplicated, block: B:158:0x024b  */
    /* JADX WARN: Code duplicated, block: B:161:0x0259  */
    /* JADX WARN: Code duplicated, block: B:166:0x0279  */
    /* JADX WARN: Code duplicated, block: B:168:0x0286  */
    /* JADX WARN: Code duplicated, block: B:169:0x028b  */
    /* JADX WARN: Code duplicated, block: B:172:0x0297  */
    /* JADX WARN: Code duplicated, block: B:175:0x029d  */
    /* JADX WARN: Code duplicated, block: B:178:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:182:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:183:0x02be  */
    /* JADX WARN: Code duplicated, block: B:186:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:188:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:191:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:194:0x02df  */
    /* JADX WARN: Code duplicated, block: B:196:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:197:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
    /* JADX WARN: Code duplicated, block: B:84:0x012e  */
    public static c6f i(XmlPullParser xmlPullParser, c6f c6fVar) {
        byte b2;
        int i;
        j3d j3dVarM;
        j3d j3dVarM2;
        j3d j3dVarM3;
        jd7 jd7Var;
        Object next;
        String str;
        int iHashCode;
        jd7 jd7Var2;
        Object next2;
        String str2;
        int iHashCode2;
        int i2;
        sne sneVar;
        String str3;
        int iHashCode3;
        int attributeCount = xmlPullParser.getAttributeCount();
        c6f c6fVarA = c6fVar;
        for (int i3 = 0; i3 < attributeCount; i3++) {
            String attributeValue = xmlPullParser.getAttributeValue(i3);
            String attributeName = xmlPullParser.getAttributeName(i3);
            attributeName.getClass();
            switch (attributeName) {
                case "fontStyle":
                    b2 = 0;
                    break;
                case "extent":
                    b2 = 1;
                    break;
                case "fontFamily":
                    b2 = 2;
                    break;
                case "textAlign":
                    b2 = 3;
                    break;
                case "origin":
                    b2 = 4;
                    break;
                case "textDecoration":
                    b2 = 5;
                    break;
                case "fontWeight":
                    b2 = 6;
                    break;
                case "id":
                    b2 = 7;
                    break;
                case "ruby":
                    b2 = 8;
                    break;
                case "color":
                    b2 = 9;
                    break;
                case "shear":
                    b2 = 10;
                    break;
                case "textCombine":
                    b2 = 11;
                    break;
                case "fontSize":
                    b2 = 12;
                    break;
                case "textEmphasis":
                    b2 = 13;
                    break;
                case "rubyPosition":
                    b2 = 14;
                    break;
                case "backgroundColor":
                    b2 = 15;
                    break;
                case "displayAlign":
                    b2 = 16;
                    break;
                case "multiRowAlign":
                    b2 = 17;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            Layout.Alignment alignment = null;
            switch (b2) {
                case 0:
                    c6fVarA = a(c6fVarA);
                    c6fVarA.i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 1:
                    c6fVarA = a(c6fVarA);
                    c6fVarA.u = attributeValue;
                    break;
                case 2:
                    c6fVarA = a(c6fVarA);
                    c6fVarA.a = attributeValue;
                    break;
                case 3:
                    c6fVarA = a(c6fVarA);
                    String strV = bm8.V(attributeValue);
                    strV.getClass();
                    switch (strV) {
                        case "center":
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case "end":
                        case "right":
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case "left":
                        case "start":
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    c6fVarA.o = alignment;
                    break;
                case 4:
                    c6fVarA = a(c6fVarA);
                    c6fVarA.t = attributeValue;
                    break;
                case 5:
                    String strV2 = bm8.V(attributeValue);
                    strV2.getClass();
                    switch (strV2) {
                        case "nounderline":
                            c6fVarA = a(c6fVarA);
                            c6fVarA.g = 0;
                            break;
                        case "underline":
                            c6fVarA = a(c6fVarA);
                            c6fVarA.g = 1;
                            break;
                        case "nolinethrough":
                            c6fVarA = a(c6fVarA);
                            c6fVarA.f = 0;
                            break;
                        case "linethrough":
                            c6fVarA = a(c6fVarA);
                            c6fVarA.f = 1;
                            break;
                    }
                    break;
                case 6:
                    c6fVarA = a(c6fVarA);
                    c6fVarA.h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 7:
                    if ("style".equals(xmlPullParser.getName())) {
                        c6fVarA = a(c6fVarA);
                        c6fVarA.l = attributeValue;
                    }
                    break;
                case 8:
                    String strV3 = bm8.V(attributeValue);
                    strV3.getClass();
                    switch (strV3) {
                        case "baseContainer":
                        case "base":
                            c6fVarA = a(c6fVarA);
                            c6fVarA.m = 2;
                            break;
                        case "container":
                            c6fVarA = a(c6fVarA);
                            c6fVarA.m = 1;
                            break;
                        case "delimiter":
                            c6fVarA = a(c6fVarA);
                            c6fVarA.m = 4;
                            break;
                        case "textContainer":
                        case "text":
                            c6fVarA = a(c6fVarA);
                            c6fVarA.m = 3;
                            break;
                    }
                    break;
                case 9:
                    c6fVarA = a(c6fVarA);
                    try {
                        c6fVarA.b = j82.a(attributeValue, false);
                        c6fVarA.c = true;
                    } catch (IllegalArgumentException unused) {
                        ks0.v("Failed parsing color value: ", attributeValue, "TtmlParser");
                    }
                    break;
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    c6f c6fVarA2 = a(c6fVarA);
                    Matcher matcher = e.matcher(attributeValue);
                    float fMin = Float.MAX_VALUE;
                    if (matcher.matches()) {
                        try {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup)));
                        } catch (NumberFormatException e2) {
                            xo1.W("TtmlParser", "Failed to parse shear: " + attributeValue, e2);
                        }
                    } else {
                        ks0.v("Invalid value for shear: ", attributeValue, "TtmlParser");
                    }
                    c6fVarA2.s = fMin;
                    c6fVarA = c6fVarA2;
                    break;
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    String strV4 = bm8.V(attributeValue);
                    strV4.getClass();
                    if (strV4.equals("all")) {
                        c6fVarA = a(c6fVarA);
                        c6fVarA.q = 1;
                    } else if (strV4.equals("none")) {
                        c6fVarA = a(c6fVarA);
                        c6fVarA.q = 0;
                    }
                    break;
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    try {
                        c6fVarA = a(c6fVarA);
                        d(attributeValue, c6fVarA);
                    } catch (z7e unused2) {
                        ks0.v("Failed parsing fontSize value: ", attributeValue, "TtmlParser");
                    }
                    break;
                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    c6fVarA = a(c6fVarA);
                    Pattern pattern = sne.d;
                    if (attributeValue == null) {
                        sneVar = null;
                    } else {
                        String strV5 = bm8.V(attributeValue.trim());
                        if (strV5.isEmpty()) {
                            sneVar = null;
                        } else {
                            ry6 ry6VarO = ry6.o(TextUtils.split(strV5, sne.d));
                            jd7 jd7Var3 = new jd7(aic.m(sne.h, ry6VarO));
                            String str4 = (String) (jd7Var3.hasNext() ? jd7Var3.next() : "outside");
                            int iHashCode4 = str4.hashCode();
                            if (iHashCode4 != -1392885889) {
                                if (iHashCode4 != -1106037339) {
                                    if (iHashCode4 == 92734940 && str4.equals("after")) {
                                        i = 2;
                                    }
                                } else if (str4.equals("outside")) {
                                    i = -2;
                                }
                                j3dVarM = aic.m(sne.e, ry6VarO);
                                if (j3dVarM.isEmpty()) {
                                    j3dVarM2 = aic.m(sne.g, ry6VarO);
                                    j3dVarM3 = aic.m(sne.f, ry6VarO);
                                    if (j3dVarM2.isEmpty() || !j3dVarM3.isEmpty()) {
                                        jd7Var = new jd7(j3dVarM2);
                                        if (jd7Var.hasNext()) {
                                            next = jd7Var.next();
                                        } else {
                                            next = "filled";
                                        }
                                        str = (String) next;
                                        iHashCode = str.hashCode();
                                        if (iHashCode != -1274499742) {
                                            int i4 = (iHashCode != 3417674 && str.equals("open")) ? 2 : 1;
                                            jd7Var2 = new jd7(j3dVarM3);
                                            if (jd7Var2.hasNext()) {
                                                next2 = jd7Var2.next();
                                            } else {
                                                next2 = "circle";
                                            }
                                            str2 = (String) next2;
                                            iHashCode2 = str2.hashCode();
                                            if (iHashCode2 != -1360216880) {
                                                if (iHashCode2 != -905816648) {
                                                    if (iHashCode2 == 99657 && str2.equals("dot")) {
                                                        i2 = 2;
                                                    }
                                                } else if (str2.equals("sesame")) {
                                                    i2 = 3;
                                                }
                                                sneVar = new sne(i2, i4, i);
                                            } else {
                                                str2.equals("circle");
                                            }
                                            i2 = 1;
                                            sneVar = new sne(i2, i4, i);
                                        } else {
                                            str.equals("filled");
                                        }
                                        jd7Var2 = new jd7(j3dVarM3);
                                        if (jd7Var2.hasNext()) {
                                            next2 = jd7Var2.next();
                                        } else {
                                            next2 = "circle";
                                        }
                                        str2 = (String) next2;
                                        iHashCode2 = str2.hashCode();
                                        if (iHashCode2 != -1360216880) {
                                            if (iHashCode2 != -905816648) {
                                                if (iHashCode2 == 99657) {
                                                    i2 = 2;
                                                }
                                            } else if (str2.equals("sesame")) {
                                                i2 = 3;
                                            }
                                            sneVar = new sne(i2, i4, i);
                                        } else {
                                            str2.equals("circle");
                                        }
                                        i2 = 1;
                                        sneVar = new sne(i2, i4, i);
                                    } else {
                                        sneVar = new sne(-1, 0, i);
                                    }
                                } else {
                                    str3 = (String) new jd7(j3dVarM).next();
                                    iHashCode3 = str3.hashCode();
                                    if (iHashCode3 != 3005871) {
                                        int i5 = (iHashCode3 != 3387192 && str3.equals("none")) ? 0 : -1;
                                        sneVar = new sne(i5, 0, i);
                                    } else {
                                        str3.equals("auto");
                                    }
                                    sneVar = new sne(i5, 0, i);
                                }
                            } else {
                                str4.equals("before");
                            }
                            i = 1;
                            j3dVarM = aic.m(sne.e, ry6VarO);
                            if (j3dVarM.isEmpty()) {
                                str3 = (String) new jd7(j3dVarM).next();
                                iHashCode3 = str3.hashCode();
                                if (iHashCode3 != 3005871) {
                                    if (iHashCode3 != 3387192) {
                                    }
                                    sneVar = new sne(i5, 0, i);
                                } else {
                                    str3.equals("auto");
                                }
                                sneVar = new sne(i5, 0, i);
                            } else {
                                j3dVarM2 = aic.m(sne.g, ry6VarO);
                                j3dVarM3 = aic.m(sne.f, ry6VarO);
                                if (j3dVarM2.isEmpty()) {
                                    jd7Var = new jd7(j3dVarM2);
                                    if (jd7Var.hasNext()) {
                                        next = jd7Var.next();
                                    } else {
                                        next = "filled";
                                    }
                                    str = (String) next;
                                    iHashCode = str.hashCode();
                                    if (iHashCode != -1274499742) {
                                        if (iHashCode != 3417674) {
                                        }
                                        jd7Var2 = new jd7(j3dVarM3);
                                        if (jd7Var2.hasNext()) {
                                            next2 = jd7Var2.next();
                                        } else {
                                            next2 = "circle";
                                        }
                                        str2 = (String) next2;
                                        iHashCode2 = str2.hashCode();
                                        if (iHashCode2 != -1360216880) {
                                            if (iHashCode2 != -905816648) {
                                                if (iHashCode2 == 99657) {
                                                    i2 = 2;
                                                }
                                            } else if (str2.equals("sesame")) {
                                                i2 = 3;
                                            }
                                            sneVar = new sne(i2, i4, i);
                                        } else {
                                            str2.equals("circle");
                                        }
                                        i2 = 1;
                                        sneVar = new sne(i2, i4, i);
                                    } else {
                                        str.equals("filled");
                                    }
                                    jd7Var2 = new jd7(j3dVarM3);
                                    if (jd7Var2.hasNext()) {
                                        next2 = jd7Var2.next();
                                    } else {
                                        next2 = "circle";
                                    }
                                    str2 = (String) next2;
                                    iHashCode2 = str2.hashCode();
                                    if (iHashCode2 != -1360216880) {
                                        if (iHashCode2 != -905816648) {
                                            if (iHashCode2 == 99657) {
                                                i2 = 2;
                                            }
                                        } else if (str2.equals("sesame")) {
                                            i2 = 3;
                                        }
                                        sneVar = new sne(i2, i4, i);
                                    } else {
                                        str2.equals("circle");
                                    }
                                    i2 = 1;
                                    sneVar = new sne(i2, i4, i);
                                } else {
                                    jd7Var = new jd7(j3dVarM2);
                                    if (jd7Var.hasNext()) {
                                        next = jd7Var.next();
                                    } else {
                                        next = "filled";
                                    }
                                    str = (String) next;
                                    iHashCode = str.hashCode();
                                    if (iHashCode != -1274499742) {
                                        if (iHashCode != 3417674) {
                                        }
                                        jd7Var2 = new jd7(j3dVarM3);
                                        if (jd7Var2.hasNext()) {
                                            next2 = jd7Var2.next();
                                        } else {
                                            next2 = "circle";
                                        }
                                        str2 = (String) next2;
                                        iHashCode2 = str2.hashCode();
                                        if (iHashCode2 != -1360216880) {
                                            if (iHashCode2 != -905816648) {
                                                if (iHashCode2 == 99657) {
                                                    i2 = 2;
                                                }
                                            } else if (str2.equals("sesame")) {
                                                i2 = 3;
                                            }
                                            sneVar = new sne(i2, i4, i);
                                        } else {
                                            str2.equals("circle");
                                        }
                                        i2 = 1;
                                        sneVar = new sne(i2, i4, i);
                                    } else {
                                        str.equals("filled");
                                    }
                                    jd7Var2 = new jd7(j3dVarM3);
                                    if (jd7Var2.hasNext()) {
                                        next2 = jd7Var2.next();
                                    } else {
                                        next2 = "circle";
                                    }
                                    str2 = (String) next2;
                                    iHashCode2 = str2.hashCode();
                                    if (iHashCode2 != -1360216880) {
                                        if (iHashCode2 != -905816648) {
                                            if (iHashCode2 == 99657) {
                                                i2 = 2;
                                            }
                                        } else if (str2.equals("sesame")) {
                                            i2 = 3;
                                        }
                                        sneVar = new sne(i2, i4, i);
                                    } else {
                                        str2.equals("circle");
                                    }
                                    i2 = 1;
                                    sneVar = new sne(i2, i4, i);
                                }
                            }
                        }
                    }
                    c6fVarA.r = sneVar;
                    break;
                case 14:
                    String strV6 = bm8.V(attributeValue);
                    strV6.getClass();
                    if (strV6.equals("before")) {
                        c6fVarA = a(c6fVarA);
                        c6fVarA.n = 1;
                    } else if (strV6.equals("after")) {
                        c6fVarA = a(c6fVarA);
                        c6fVarA.n = 2;
                    }
                    break;
                case 15:
                    c6fVarA = a(c6fVarA);
                    try {
                        c6fVarA.d = j82.a(attributeValue, false);
                        c6fVarA.e = true;
                    } catch (IllegalArgumentException unused3) {
                        ks0.v("Failed parsing background value: ", attributeValue, "TtmlParser");
                    }
                    break;
                case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                    c6fVarA = a(c6fVarA);
                    c6fVarA.v = attributeValue;
                    break;
                case 17:
                    c6fVarA = a(c6fVarA);
                    String strV7 = bm8.V(attributeValue);
                    strV7.getClass();
                    switch (strV7) {
                        case "center":
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case "end":
                        case "right":
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case "left":
                        case "start":
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    c6fVarA.p = alignment;
                    break;
            }
        }
        return c6fVarA;
    }

    public static long j(String str, z5f z5fVar) throws z7e {
        double d2;
        double d3;
        Matcher matcher = b.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            double d4 = Long.parseLong(strGroup) * 3600;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            double d5 = d4 + (Long.parseLong(strGroup2) * 60);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            double d6 = d5 + Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d7 = d6 + (strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d);
            String strGroup5 = matcher.group(5);
            double d8 = d7 + (strGroup5 != null ? Long.parseLong(strGroup5) / z5fVar.a : 0.0d);
            String strGroup6 = matcher.group(6);
            return (long) ((d8 + (strGroup6 != null ? (Long.parseLong(strGroup6) / ((double) z5fVar.b)) / ((double) z5fVar.a) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = c.matcher(str);
        if (!matcher2.matches()) {
            throw new z7e(ub3.i("Malformed time expression: ", str));
        }
        String strGroup7 = matcher2.group(1);
        strGroup7.getClass();
        double d9 = Double.parseDouble(strGroup7);
        String strGroup8 = matcher2.group(2);
        strGroup8.getClass();
        switch (strGroup8) {
            case "f":
                d2 = z5fVar.a;
                d9 /= d2;
                return (long) (d9 * 1000000.0d);
            case "h":
                d3 = 3600.0d;
                break;
            case "m":
                d3 = 60.0d;
                break;
            case "t":
                d2 = z5fVar.c;
                d9 /= d2;
                return (long) (d9 * 1000000.0d);
            case "ms":
                d2 = 1000.0d;
                d9 /= d2;
                return (long) (d9 * 1000000.0d);
            default:
                return (long) (d9 * 1000000.0d);
        }
        d9 *= d3;
        return (long) (d9 * 1000000.0d);
    }

    public static h71 k(XmlPullParser xmlPullParser) {
        String strE = jcc.e(xmlPullParser, "extent");
        if (strE == null) {
            return null;
        }
        Matcher matcher = g.matcher(strE);
        if (!matcher.matches()) {
            xo1.V("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strE));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new h71(i, Integer.parseInt(strGroup2), 7);
        } catch (NumberFormatException unused) {
            xo1.V("TtmlParser", "Ignoring malformed tts extent: ".concat(strE));
            return null;
        }
    }

    @Override // defpackage.f8e
    public final x7e g(byte[] bArr, int i, int i2) {
        x7e x7eVar;
        x7e x7eVar2 = null;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.a.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new b6f("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int eventType = xmlPullParserNewPullParser.getEventType();
            z5f z5fVarE = w;
            int iC = 15;
            int i3 = 0;
            a82 a82Var = null;
            h71 h71VarK = null;
            while (eventType != 1) {
                y5f y5fVar = (y5f) arrayDeque.peek();
                if (i3 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    x7eVar = x7eVar2;
                    if (eventType == 2) {
                        try {
                            if ("tt".equals(name)) {
                                z5fVarE = e(xmlPullParserNewPullParser);
                                iC = c(xmlPullParserNewPullParser);
                                h71VarK = k(xmlPullParserNewPullParser);
                            }
                            z5f z5fVar = z5fVarE;
                            int i4 = iC;
                            h71 h71Var = h71VarK;
                            if (b(name)) {
                                if ("head".equals(name)) {
                                    f(xmlPullParserNewPullParser, map, i4, h71Var, map2, map3);
                                } else {
                                    try {
                                        y5f y5fVarH = h(xmlPullParserNewPullParser, y5fVar, map2, z5fVar);
                                        arrayDeque.push(y5fVarH);
                                        if (y5fVar != null) {
                                            ArrayList arrayList = y5fVar.m;
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                                y5fVar.m = arrayList;
                                            }
                                            arrayList.add(y5fVarH);
                                        }
                                    } catch (z7e e2) {
                                        xo1.W("TtmlParser", "Suppressing parser error", e2);
                                        i3++;
                                    }
                                }
                                h71VarK = h71Var;
                                iC = i4;
                                z5fVarE = z5fVar;
                            } else {
                                xo1.D("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            }
                            i3++;
                            h71VarK = h71Var;
                            iC = i4;
                            z5fVarE = z5fVar;
                        } catch (IOException e3) {
                            e = e3;
                            ho7.r("Unexpected error when reading input.", e);
                            return x7eVar;
                        } catch (XmlPullParserException e4) {
                            e = e4;
                            ho7.r("Unable to decode source", e);
                            return x7eVar;
                        }
                    } else if (eventType == 4) {
                        y5fVar.getClass();
                        y5f y5fVarA = y5f.a(xmlPullParserNewPullParser.getText());
                        ArrayList arrayList2 = y5fVar.m;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            y5fVar.m = arrayList2;
                        }
                        arrayList2.add(y5fVarA);
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            y5f y5fVar2 = (y5f) arrayDeque.peek();
                            y5fVar2.getClass();
                            a82Var = new a82(y5fVar2, map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else {
                    x7eVar = x7eVar2;
                    if (eventType == 2) {
                        i3++;
                    } else if (eventType == 3) {
                        i3--;
                    }
                }
                xmlPullParserNewPullParser.next();
                eventType = xmlPullParserNewPullParser.getEventType();
                x7eVar2 = x7eVar;
            }
            x7eVar = x7eVar2;
            a82Var.getClass();
            return a82Var;
        } catch (IOException e5) {
            e = e5;
            x7eVar = x7eVar2;
        } catch (XmlPullParserException e6) {
            e = e6;
            x7eVar = x7eVar2;
        }
    }

    @Override // defpackage.f8e
    public final void s(byte[] bArr, int i, int i2, e8e e8eVar, xl2 xl2Var) {
        z5c.L(g(bArr, i, i2), e8eVar, xl2Var);
    }
}
