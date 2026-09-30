package defpackage;

import ai.askquin.R;
import ai.askquin.ui.annual.model.AnnualActionFor;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.os.Build;
import android.text.InputFilter;
import android.util.Xml;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.widget.Toast;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.adjust.sdk.Constants;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.core.b1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qn4 {
    public static final Object a = new Object();
    public static final dd2 b = new dd2(new gd2(21), false, -1072190510);
    public static final dd2 c = new dd2(new kd2(7), false, 696933017);
    public static final dd2 d = new dd2(new gd2(22), false, -1564195594);
    public static final dd2 e = new dd2(new xd2(28), false, 369145366);
    public static final dd2 f = new dd2(new he2(1), false, 641200809);
    public static final float g = 1.0f;
    public static final String[] h = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] i = {44100, 48000, 32000};
    public static final int[] j = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] k = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] l = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] m = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] n = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};
    public static final long[] o = {2000, 2000, 3000, 3000, 5000};
    public static final String[] p = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] q = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] r = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static int B(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if ((i2 & (-2097152)) != -2097152 || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i8 = i[i6];
        if (i3 == 2) {
            i8 /= 2;
        } else if (i3 == 0) {
            i8 /= 4;
        }
        int i9 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? j[i5 - 1] : k[i5 - 1]) * 12) / i8) + i9) * 4;
        }
        if (i3 == 3) {
            i7 = i4 == 2 ? l[i5 - 1] : m[i5 - 1];
        } else {
            i7 = n[i5 - 1];
        }
        if (i3 == 3) {
            return ((i7 * 144) / i8) + i9;
        }
        return (((i4 == 1 ? 72 : 144) * i7) / i8) + i9;
    }

    public static final boolean C(mue mueVar) {
        ofa ofaVar;
        iga igaVar = mueVar.c;
        xt4 xt4Var = (igaVar == null || (ofaVar = igaVar.b) == null) ? null : new xt4(ofaVar.b);
        boolean z = false;
        if (xt4Var != null && xt4Var.a == 1) {
            z = true;
        }
        return !z;
    }

    public static boolean F(ea1 ea1Var) {
        if (!p51.d.contains(ea1Var.getName())) {
            return false;
        }
        if (s72.o0(p51.c, qz3.c(ea1Var)) && ea1Var.G().isEmpty()) {
            return true;
        }
        if (!xr7.A(ea1Var)) {
            return false;
        }
        Collection collectionL = ea1Var.l();
        collectionL.getClass();
        Collection<ea1> collection = collectionL;
        if (collection.isEmpty()) {
            return false;
        }
        for (ea1 ea1Var2 : collection) {
            ea1Var2.getClass();
            if (F(ea1Var2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void G(pn4 pn4Var) {
        if (((i09) pn4Var).a.Y) {
            vd0.p0(pn4Var, 1).p1();
        }
    }

    public static ArrayList H(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            Object obj = jSONArray.get(i2);
            if (obj instanceof JSONObject) {
                arrayList.add(I((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                arrayList.add(H((JSONArray) obj));
            } else {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static HashMap I(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                map.put(next, I((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                map.put(next, H((JSONArray) obj));
            } else {
                map.put(next, obj);
            }
        }
        return map;
    }

    public static zy1 J(String str) throws XmlPullParserException, IOException {
        int i2;
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!jcc.i(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw l0a.a(null, "Couldn't find xmp metadata");
        }
        ey6 ey6Var = jy6.b;
        yob yobVarK = yob.e;
        long j2 = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            i2 = 2;
            if (jcc.i(xmlPullParserNewPullParser, "rdf:Description")) {
                int i3 = 0;
                for (int i4 = 0; i4 < 4; i4++) {
                    String strE = jcc.e(xmlPullParserNewPullParser, p[i4]);
                    if (strE != null) {
                        if (Integer.parseInt(strE) != 1) {
                            break loop0;
                        }
                        int i5 = 0;
                        while (true) {
                            if (i5 < 4) {
                                String strE2 = jcc.e(xmlPullParserNewPullParser, q[i5]);
                                if (strE2 != null) {
                                    j2 = Long.parseLong(strE2);
                                    if (j2 != -1) {
                                        break;
                                    }
                                    break;
                                }
                                i5++;
                            }
                            j2 = -9223372036854775807L;
                            break;
                        }
                        while (true) {
                            if (i3 >= 2) {
                                ey6 ey6Var2 = jy6.b;
                                yobVarK = yob.e;
                                break;
                            }
                            String strE3 = jcc.e(xmlPullParserNewPullParser, r[i3]);
                            if (strE3 != null) {
                                yobVarK = jy6.t(new p39("image/jpeg", 0L, 0L), new p39("video/mp4", Long.parseLong(strE3), 0L));
                                break;
                            }
                            i3++;
                        }
                    }
                }
                return null;
            }
            if (jcc.i(xmlPullParserNewPullParser, "Container:Directory")) {
                yobVarK = K(xmlPullParserNewPullParser, "Container", "Item");
            } else if (jcc.i(xmlPullParserNewPullParser, "GContainer:Directory")) {
                yobVarK = K(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!jcc.h(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (yobVarK.isEmpty()) {
            break loop0;
        }
        return new zy1(j2, yobVarK, i2);
        return null;
    }

    public static yob K(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        dy6 dy6VarM = jy6.m();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (jcc.i(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strE = jcc.e(xmlPullParser, strConcat3);
                String strE2 = jcc.e(xmlPullParser, strConcat4);
                String strE3 = jcc.e(xmlPullParser, strConcat5);
                String strE4 = jcc.e(xmlPullParser, strConcat6);
                if (strE == null || strE2 == null) {
                    return yob.e;
                }
                dy6VarM.b(new p39(strE, strE3 != null ? Long.parseLong(strE3) : 0L, strE4 != null ? Long.parseLong(strE4) : 0L));
            }
        } while (!jcc.h(xmlPullParser, strConcat2));
        return dy6VarM.g();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void L(Context context, String str) {
        synchronized (a) {
            if (str.equals("")) {
                context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                return;
            }
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                try {
                    try {
                        xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                        xmlSerializerNewSerializer.startDocument(Constants.ENCODING, Boolean.TRUE);
                        xmlSerializerNewSerializer.startTag(null, "locales");
                        xmlSerializerNewSerializer.attribute(null, "application_locales", str);
                        xmlSerializerNewSerializer.endTag(null, "locales");
                        xmlSerializerNewSerializer.endDocument();
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (Exception e2) {
                        b1.n("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales in storage ", e2);
                        if (fileOutputStreamOpenFileOutput != null) {
                            fileOutputStreamOpenFileOutput.close();
                        }
                    }
                } catch (Throwable th) {
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused3) {
                b1.l("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
            }
        }
    }

    public static final long M(long j2, long j3) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) + ((int) (j3 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) + ((int) (j3 & 4294967295L)))) & 4294967295L);
    }

    /* JADX WARN: Code duplicated, block: B:116:0x02ac A[PHI: r14 r15
  0x02ac: PHI (r14v4 java.util.List) = (r14v3 java.util.List), (r14v5 java.util.List) binds: [B:102:0x0260, B:115:0x02aa] A[DONT_GENERATE, DONT_INLINE]
  0x02ac: PHI (r15v6 int) = (r15v5 int), (r15v7 int) binds: [B:102:0x0260, B:115:0x02aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:118:0x02b0 A[LOOP:3: B:101:0x0252->B:118:0x02b0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:119:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:180:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:185:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:189:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:192:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:194:0x03e3 A[LOOP:5: B:193:0x03e1->B:194:0x03e3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:203:0x0423  */
    /* JADX WARN: Code duplicated, block: B:208:0x0439  */
    /* JADX WARN: Code duplicated, block: B:232:0x02b8 A[EDGE_INSN: B:232:0x02b8->B:120:0x02b8 BREAK  A[LOOP:3: B:101:0x0252->B:118:0x02b0], SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:194:0x03e3, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r1v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [int] */
    /* JADX WARN: Type inference failed for: r38v12 */
    /* JADX WARN: Type inference failed for: r41v0, types: [android.view.ViewStructure] */
    public static final void N(ViewStructure viewStructure, LayoutNode layoutNode, AutofillId autofillId, String str, jkb jkbVar) {
        ?? r38;
        long j2;
        long j3;
        char c2;
        long j4;
        boolean zBooleanValue;
        ar arVar;
        k00 k00Var;
        yr yrVar;
        yye yyeVar;
        i5c i5cVar;
        boolean z;
        en2 en2Var;
        Boolean bool;
        boolean z2;
        Integer num;
        Object obj;
        List list;
        Integer numValueOf;
        int i2;
        int i3;
        int i4;
        int i5;
        ?? r15;
        String strL;
        int size;
        String str2;
        int i6;
        String[] strArrZ;
        String[] strArrZ2;
        int i7;
        int i8;
        int i9;
        boolean z3;
        ar arVar2;
        yye yyeVar2;
        k00 k00Var2;
        yr yrVar2;
        i5c i5cVar2;
        boolean z4;
        gxc gxcVar = cxc.a;
        gxc gxcVar2 = swc.a;
        twc twcVarH = layoutNode.H();
        boolean z5 = true;
        if (twcVarH != null) {
            w79 w79Var = twcVarH.a;
            j2 = 128;
            Object[] objArr = w79Var.b;
            Object[] objArr2 = w79Var.c;
            long[] jArr = w79Var.a;
            j3 = 255;
            int length = jArr.length - 2;
            if (length >= 0) {
                zBooleanValue = true;
                int i10 = 0;
                arVar2 = null;
                z = false;
                yyeVar2 = null;
                k00Var2 = null;
                yrVar2 = null;
                en2Var = null;
                bool = null;
                i5cVar2 = null;
                z2 = false;
                num = null;
                obj = null;
                c2 = 7;
                while (true) {
                    long j5 = jArr[i10];
                    j4 = -9187201950435737472L;
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        int i12 = 0;
                        while (i12 < i11) {
                            if ((j5 & 255) < 128) {
                                int i13 = (i10 << 3) + i12;
                                Object obj2 = objArr[i13];
                                Object obj3 = objArr2[i13];
                                gxc gxcVar3 = (gxc) obj2;
                                if (pa7.t(gxcVar3, cxc.s)) {
                                    obj3.getClass();
                                    arVar2 = (ar) obj3;
                                } else if (pa7.t(gxcVar3, cxc.a)) {
                                    obj3.getClass();
                                    String str3 = (String) s72.x0((List) obj3);
                                    if (str3 != null) {
                                        viewStructure.setContentDescription(str3);
                                    }
                                } else if (pa7.t(gxcVar3, cxc.r)) {
                                    obj3.getClass();
                                    en2Var = (en2) obj3;
                                } else if (pa7.t(gxcVar3, cxc.t)) {
                                    obj3.getClass();
                                    yrVar2 = (yr) obj3;
                                } else if (pa7.t(gxcVar3, cxc.G)) {
                                    obj3.getClass();
                                    k00Var2 = (k00) obj3;
                                } else if (pa7.t(gxcVar3, cxc.l)) {
                                    obj3.getClass();
                                    viewStructure.setFocused(((Boolean) obj3).booleanValue());
                                } else if (pa7.t(gxcVar3, cxc.R)) {
                                    obj3.getClass();
                                    num = (Integer) obj3;
                                } else if (pa7.t(gxcVar3, cxc.N)) {
                                    z2 = z5;
                                } else if (pa7.t(gxcVar3, cxc.o)) {
                                    obj3.getClass();
                                    zBooleanValue = ((Boolean) obj3).booleanValue();
                                } else if (pa7.t(gxcVar3, cxc.z)) {
                                    obj3.getClass();
                                    i5cVar2 = (i5c) obj3;
                                } else if (pa7.t(gxcVar3, cxc.K)) {
                                    obj3.getClass();
                                    bool = (Boolean) obj3;
                                } else if (pa7.t(gxcVar3, cxc.L)) {
                                    obj3.getClass();
                                    yyeVar2 = (yye) obj3;
                                } else if (pa7.t(gxcVar3, swc.b)) {
                                    viewStructure.setClickable(z5);
                                } else if (pa7.t(gxcVar3, swc.c)) {
                                    viewStructure.setLongClickable(z5);
                                } else if (pa7.t(gxcVar3, swc.w)) {
                                    viewStructure.setFocusable(z5);
                                } else if (pa7.t(gxcVar3, swc.k)) {
                                    z = z5;
                                }
                                z4 = z5;
                                if (Build.VERSION.SDK_INT >= 34 && pa7.t(gxcVar3, oa7.h)) {
                                    obj = obj3;
                                }
                            } else {
                                z4 = z5;
                            }
                            j5 >>= 8;
                            i12++;
                            z5 = z4;
                        }
                        z3 = z5;
                        z3 = z3;
                        if (i11 != 8) {
                            break;
                        }
                    } else {
                        z3 = z5 ? 1 : 0;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                    z5 = z3 ? 1 : 0;
                }
            } else {
                z3 = true;
                c2 = 7;
                j4 = -9187201950435737472L;
                zBooleanValue = true;
                arVar2 = null;
                z = false;
                yyeVar2 = null;
                k00Var2 = null;
                yrVar2 = null;
                en2Var = null;
                bool = null;
                i5cVar2 = null;
                z2 = false;
                num = null;
                obj = null;
            }
            arVar = arVar2;
            yyeVar = yyeVar2;
            k00Var = k00Var2;
            yrVar = yrVar2;
            i5cVar = i5cVar2;
            r38 = z3;
        } else {
            r38 = 1;
            j2 = 128;
            j3 = 255;
            c2 = 7;
            j4 = -9187201950435737472L;
            zBooleanValue = true;
            arVar = null;
            k00Var = null;
            yrVar = null;
            yyeVar = null;
            i5cVar = null;
            z = false;
            en2Var = null;
            bool = null;
            z2 = false;
            num = null;
            obj = null;
        }
        twc twcVarH2 = layoutNode.H();
        if (twcVarH2 != null && twcVarH2.c && !twcVarH2.d) {
            twcVarH2 = twcVarH2.d();
            i79 i79Var = new i79(layoutNode.getChildrenInfo().size());
            i79Var.j(layoutNode.getChildrenInfo());
            while (i79Var.e()) {
                LayoutNode layoutNode2 = (LayoutNode) i79Var.m(i79Var.b - 1);
                twc twcVarH3 = layoutNode2.H();
                if (twcVarH3 != null && !twcVarH3.c) {
                    twcVarH2.f(twcVarH3);
                    if (!twcVarH3.d) {
                        i79Var.j(layoutNode2.getChildrenInfo());
                    }
                }
            }
        }
        if (twcVarH2 != null) {
            w79 w79Var2 = twcVarH2.a;
            Object[] objArr3 = w79Var2.b;
            Object[] objArr4 = w79Var2.c;
            long[] jArr2 = w79Var2.a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i14 = 8;
                list = null;
                int i15 = 0;
                while (true) {
                    long j6 = jArr2[i15];
                    long[] jArr3 = jArr2;
                    Object[] objArr5 = objArr3;
                    if ((((~j6) << c2) & j6 & j4) == j4) {
                        i7 = i15;
                        if (i7 != length2) {
                            break;
                            break;
                        } else {
                            i15 = i7 + 1;
                            objArr3 = objArr5;
                            jArr2 = jArr3;
                        }
                    } else {
                        int i16 = 8 - ((~(i15 - length2)) >>> 31);
                        int i17 = 0;
                        while (i17 < i16) {
                            if ((j6 & j3) < j2) {
                                int i18 = (i15 << 3) + i17;
                                Object obj4 = objArr5[i18];
                                Object obj5 = objArr4[i18];
                                i9 = i14;
                                gxc gxcVar4 = (gxc) obj4;
                                i8 = i17;
                                if (pa7.t(gxcVar4, cxc.j)) {
                                    viewStructure.setEnabled(false);
                                } else if (pa7.t(gxcVar4, cxc.C)) {
                                    obj5.getClass();
                                    list = (List) obj5;
                                }
                            } else {
                                i8 = i17;
                                i9 = i14;
                            }
                            j6 >>= i9;
                            i17 = i8 + 1;
                            i14 = i9;
                        }
                        if (i16 != i14) {
                            break;
                        }
                        i7 = i15;
                        if (i7 != length2) {
                            break;
                        }
                        i15 = i7 + 1;
                        objArr3 = objArr5;
                        jArr2 = jArr3;
                    }
                }
            } else {
                list = null;
            }
        } else {
            list = null;
        }
        Integer numValueOf2 = Integer.valueOf(layoutNode.b);
        if (layoutNode.F() == null) {
            numValueOf2 = null;
        }
        int iIntValue = numValueOf2 != null ? numValueOf2.intValue() : -1;
        viewStructure.setAutofillId(autofillId, iIntValue);
        viewStructure.setId(iIntValue, str, null, null);
        if (arVar != null) {
            numValueOf = Integer.valueOf(arVar.a);
        } else if (z) {
            numValueOf = Integer.valueOf((int) r38);
        } else {
            numValueOf = yyeVar != null ? 2 : null;
        }
        if (numValueOf != null) {
            viewStructure.setAutofillType(numValueOf.intValue());
        }
        if (k00Var != null) {
            viewStructure.setAutofillValue(AutofillValue.forText(lmg.r0(k00Var.b)));
        }
        if (yrVar != null) {
            viewStructure.setAutofillValue(yrVar.a);
        }
        if (en2Var != null && (strArrZ2 = ym8.z(en2Var)) != null) {
            viewStructure.setAutofillHints(strArrZ2);
        }
        LayoutNode layoutNode3 = (LayoutNode) jkbVar.a.b(layoutNode.b);
        if (layoutNode3 == null || layoutNode3.g == -4) {
            i2 = 0;
        } else {
            os osVar = jkbVar.c;
            int iD = jkbVar.d(layoutNode3);
            long[] jArr4 = (long[]) osVar.c;
            long j7 = jArr4[iD];
            long j8 = jArr4[iD + 1];
            int i19 = (int) (j7 >> 32);
            int i20 = (int) j7;
            i2 = 0;
            viewStructure.setDimens(i19, i20, 0, 0, ((int) (j8 >> 32)) - i19, ((int) j8) - i20);
        }
        if (bool != null) {
            viewStructure.setSelected(bool.booleanValue());
        }
        if (yyeVar != null) {
            viewStructure.setCheckable(r38);
            viewStructure.setChecked(yyeVar == yye.a ? 1 : i2);
        } else if (bool != null && (i5cVar == null || i5cVar.a != 4)) {
            viewStructure.setCheckable(true);
            viewStructure.setChecked(bool.booleanValue());
        }
        en2.a.getClass();
        String str4 = (String) qd0.l0(ym8.z(dn2.b));
        if (en2Var != null && (strArrZ = ym8.z(en2Var)) != null) {
            boolean zV = qd0.V(strArrZ, str4);
            i3 = 1;
            if (zV) {
                i4 = 1;
            }
            if (z2 && i4 == 0) {
                i5 = i2;
            } else {
                i5 = i3;
            }
            if (i5 == 0 || zBooleanValue) {
                r15 = i3;
            } else {
                r15 = i2;
            }
            viewStructure.setDataIsSensitive(r15);
            viewStructure.setVisibility(layoutNode.getOuterCoordinator$ui().q1() ? 4 : i2);
            if (list != null) {
                size = list.size();
                str2 = "";
                for (i6 = i2; i6 < size; i6++) {
                    str2 = ((Object) str2) + ((k00) list.get(i6)).b + "\n";
                }
                viewStructure.setText(str2);
                viewStructure.setClassName("android.widget.TextView");
            }
            if (layoutNode.getChildrenInfo().isEmpty() && i5cVar != null && (strL = ndc.l(i5cVar.a)) != null) {
                viewStructure.setClassName(strL);
            }
            if (z) {
                viewStructure.setClassName("android.widget.EditText");
                if (Build.VERSION.SDK_INT >= 28 && num != null) {
                    s.c0(viewStructure, num.intValue());
                }
                if (i5 != 0) {
                    viewStructure.setInputType(129);
                }
            }
            if (Build.VERSION.SDK_INT >= 35 || obj == null) {
            }
            r3.f();
            return;
        }
        i3 = 1;
        i4 = i2;
        if (z2) {
            i5 = i3;
        } else {
            i5 = i3;
        }
        if (i5 == 0) {
            r15 = i3;
        } else {
            r15 = i3;
        }
        viewStructure.setDataIsSensitive(r15);
        viewStructure.setVisibility(layoutNode.getOuterCoordinator$ui().q1() ? 4 : i2);
        if (list != null) {
            size = list.size();
            str2 = "";
            while (i6 < size) {
                str2 = ((Object) str2) + ((k00) list.get(i6)).b + "\n";
            }
            viewStructure.setText(str2);
            viewStructure.setClassName("android.widget.TextView");
        }
        if (layoutNode.getChildrenInfo().isEmpty()) {
            viewStructure.setClassName(strL);
        }
        if (z) {
            viewStructure.setClassName("android.widget.EditText");
            if (Build.VERSION.SDK_INT >= 28) {
                s.c0(viewStructure, num.intValue());
            }
            if (i5 != 0) {
                viewStructure.setInputType(129);
            }
        }
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0046 A[EXC_TOP_SPLITTER, PHI: r1
  0x0046: PHI (r1v2 java.lang.String) = (r1v0 java.lang.String), (r1v4 java.lang.String) binds: [B:29:0x0053, B:23:0x0044] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public static String O(Context context) {
        String attributeValue;
        synchronized (a) {
            attributeValue = "";
            try {
                FileInputStream fileInputStreamOpenFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                try {
                    try {
                        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                        xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, Constants.ENCODING);
                        int depth = xmlPullParserNewPullParser.getDepth();
                        while (true) {
                            int next = xmlPullParserNewPullParser.next();
                            if (next != 1 && (next != 3 || xmlPullParserNewPullParser.getDepth() > depth)) {
                                if (next != 3 && next != 4 && xmlPullParserNewPullParser.getName().equals("locales")) {
                                    attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "application_locales");
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (fileInputStreamOpenFileInput != null) {
                            try {
                                fileInputStreamOpenFileInput.close();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (IOException | XmlPullParserException unused2) {
                        b1.l("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                    }
                    if (attributeValue.isEmpty()) {
                        context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    }
                } catch (Throwable th) {
                    if (fileInputStreamOpenFileInput != null) {
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused4) {
                return "";
            }
        }
        return attributeValue;
    }

    public static final yk8 P(mh3 mh3Var, a26 a26Var, l46 l46Var) {
        Object kfVar;
        mh3 mh3Var2;
        Object obj;
        q1c.i(mh3Var, l46Var);
        Object objI = q1c.i(a26Var, l46Var);
        Object[] objArr = new Object[0];
        Object objR = l46Var.R();
        Object obj2 = sf2.a;
        if (objR == obj2) {
            objR = new q(8);
            l46Var.p0(objR);
        }
        Object obj3 = (String) vfh.I(objArr, (x16) objR, l46Var, 48);
        mf mfVar = (mf) l46Var.k(fa8.a);
        if (mfVar == null) {
            l46Var.f0(1213380307);
            Object baseContext = (Context) l46Var.k(uq.b);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof mf) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            mfVar = (mf) baseContext;
        } else {
            l46Var.f0(1213379439);
        }
        l46Var.r(false);
        if (mfVar == null) {
            qc0.p("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
            return null;
        }
        Object objF = mfVar.f();
        Object objR2 = l46Var.R();
        if (objR2 == obj2) {
            objR2 = new ef();
            l46Var.p0(objR2);
        }
        ef efVar = (ef) objR2;
        Object objR3 = l46Var.R();
        if (objR3 == obj2) {
            objR3 = new yk8(efVar);
            l46Var.p0(objR3);
        }
        yk8 yk8Var = (yk8) objR3;
        boolean zI = l46Var.i(efVar) | l46Var.i(objF) | l46Var.g(obj3) | l46Var.i(mh3Var) | l46Var.g(objI);
        Object objR4 = l46Var.R();
        if (zI || objR4 == obj2) {
            mh3Var2 = mh3Var;
            obj = objF;
            kfVar = new kf(efVar, obj, obj3, mh3Var2, objI, 0);
            l46Var.p0(kfVar);
        } else {
            obj = objF;
            kfVar = objR4;
            mh3Var2 = mh3Var;
        }
        af1.i(obj, obj3, mh3Var2, (a26) kfVar, l46Var);
        return yk8Var;
    }

    public static final void Q(List list, ot8 ot8Var) {
        list.getClass();
        ot8Var.getClass();
        mh6 mh6Var = ot8Var instanceof mh6 ? (mh6) ot8Var : null;
        String id = mh6Var != null ? mh6Var.getId() : null;
        int i2 = -1;
        if (id != null) {
            Iterator it = list.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                ot8 ot8Var2 = (ot8) it.next();
                if ((ot8Var2 instanceof mh6) && pa7.t(((mh6) ot8Var2).getId(), id)) {
                    i2 = i3;
                    break;
                }
                i3++;
            }
        }
        if (i2 >= 0) {
            list.set(i2, ot8Var);
        } else {
            list.add(ot8Var);
        }
    }

    public static final long R(long j2) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j2 >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static final void U(Context context, int i2) {
        Toast.makeText(context, i2, 0).show();
    }

    public static final void a(AnnualActionFor annualActionFor, j09 j09Var, rcf rcfVar, egd egdVar, x16 x16Var, l46 l46Var, int i2) {
        l46Var.h0(-207258774);
        int i3 = i2 | (l46Var.e(annualActionFor.ordinal()) ? 4 : 2) | (l46Var.g(j09Var) ? 32 : 16) | (l46Var.i(rcfVar) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.g(egdVar) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(x16Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if (l46Var.W(i3 & 1, (i3 & 9363) != 9362)) {
            tn4 tn4VarG = rcfVar.g();
            rs0.a((i3 & 112) | 384, af1.b0(-1551878909, new cm(1, x16Var, tn4VarG, egdVar, rcfVar, annualActionFor), l46Var), l46Var, j09Var, hcc.k(tn4VarG, egdVar, rcfVar.h() != null, l46Var, (i3 >> 6) & 112));
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new cm(annualActionFor, j09Var, rcfVar, egdVar, x16Var, i2);
        }
    }

    public static final void b(final boolean z, final AnnualActionFor annualActionFor, final boolean z2, final x16 x16Var, final x16 x16Var2, l46 l46Var, int i2) {
        l46 l46Var2;
        int i3;
        l46Var.h0(-1021630627);
        int i4 = i2 | (l46Var.h(z) ? 4 : 2) | (l46Var.e(annualActionFor.ordinal()) ? 32 : 16) | (l46Var.h(z2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(x16Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if (l46Var.W(i4 & 1, (i4 & 9363) != 9362)) {
            j09 j09VarC = b.c(g09.a, 1.0f);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarC);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            if (z2) {
                int i5 = e60.a[annualActionFor.ordinal()];
                if (i5 == 1) {
                    i3 = R.string.annual_button_text_start_monthly_reading;
                } else {
                    if (i5 != 2) {
                        ap.c();
                        return;
                    }
                    i3 = R.string.annual_button_text_start_domain_reading;
                }
            } else {
                i3 = !z ? R.string.text_start_draw : R.string.draw_next_card;
            }
            String strQ = afc.q(i3, l46Var);
            boolean z3 = ((i4 & 896) == 256) | ((i4 & 112) == 32) | ((57344 & i4) == 16384) | ((i4 & 14) == 4) | ((i4 & 7168) == 2048);
            Object objR = l46Var.R();
            if (z3 || objR == sf2.a) {
                x16 x16Var3 = new x16() { // from class: y50
                    @Override // defpackage.x16
                    public final Object invoke() {
                        boolean z4 = z2;
                        AnnualActionFor annualActionFor2 = annualActionFor;
                        p05 p05Var = p05.a;
                        if (z4) {
                            int i6 = e60.a[annualActionFor2.ordinal()];
                            if (i6 == 1) {
                                x1f x1fVar = x1f.a;
                                x1f.k(p05Var, new zv(20), 2);
                            } else {
                                if (i6 != 2) {
                                    ap.c();
                                    return null;
                                }
                                x1f x1fVar2 = x1f.a;
                                x1f.k(p05Var, new zv(21), 2);
                            }
                            x16Var2.invoke();
                        } else {
                            if (!z) {
                                int i7 = e60.a[annualActionFor2.ordinal()];
                                if (i7 == 1) {
                                    x1f x1fVar3 = x1f.a;
                                    x1f.k(p05Var, new zv(22), 2);
                                } else {
                                    if (i7 != 2) {
                                        ap.c();
                                        return null;
                                    }
                                    x1f x1fVar4 = x1f.a;
                                    x1f.k(p05Var, new zv(23), 2);
                                }
                            }
                            x16Var.invoke();
                        }
                        return wef.a;
                    }
                };
                l46Var.p0(x16Var3);
                objR = x16Var3;
            }
            l46Var2 = l46Var;
            ym8.h(null, false, strQ, false, (x16) objR, l46Var2, 0, 11);
            l46Var2.r(true);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new z50(z, annualActionFor, z2, x16Var, x16Var2, i2);
        }
    }

    public static final void c(AnnualActionFor annualActionFor, boolean z, a26 a26Var, x16 x16Var, int i2, l46 l46Var, int i3) {
        annualActionFor.getClass();
        a26Var.getClass();
        x16Var.getClass();
        l46Var.h0(-598418824);
        int i4 = 4;
        int i5 = i3 | (l46Var.e(annualActionFor.ordinal()) ? 4 : 2) | (l46Var.h(z) ? 32 : 16) | (l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.e(i2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if (l46Var.W(i5 & 1, (i5 & 9363) != 9362)) {
            boolean z2 = ((i5 & 14) == 4) | ((i5 & 112) == 32);
            int i6 = i5 & 57344;
            boolean z3 = z2 | (i6 == 16384);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (z3 || objR == obj) {
                objR = new x50(annualActionFor, z, i2);
                l46Var.p0(objR);
            }
            x16 x16Var2 = (x16) objR;
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            w10 w10Var = (w10) z5c.G(job.a.b(w10.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), x16Var2);
            boolean zI = l46Var.i(w10Var) | (i6 == 16384);
            Object objR2 = l46Var.R();
            if (zI || objR2 == obj) {
                objR2 = new c60(i2, w10Var, null);
                l46Var.p0(objR2);
            }
            af1.o((l26) objR2, l46Var, wef.a);
            xdc.a(b.c, af1.b0(-1156978636, new m(6, x16Var), l46Var), null, af1.b0(-648199822, new i1(i4, w10Var), l46Var), null, 0, 0L, 0L, m93.o(0, 14), af1.b0(1956693577, new ck(w10Var, annualActionFor, a26Var, z), l46Var), l46Var, 805309494, 244);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new a60(annualActionFor, z, a26Var, x16Var, i2, i3);
        }
    }

    public static final BlurMaskFilter d(float f2) {
        return new BlurMaskFilter(f2, BlurMaskFilter.Blur.NORMAL);
    }

    public static final void e(x16 x16Var, x16 x16Var2, x16 x16Var3, l46 l46Var, int i2) {
        int i3;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-1861566956);
        if ((i2 & 6) == 0) {
            i3 = (l46Var2.i(x16Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var2.i(x16Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var2.i(x16Var3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var2.W(i3 & 1, (i3 & 147) != 146)) {
            g09 g09Var = g09.a;
            j09 j09VarA0 = ynb.a0(mh3.N(tm7.o(b.c(g09Var, 1.0f), y72.b(y72.b, 0.6f), g21.f)), 16.0f, 12.0f);
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var2, 48);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarA0);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z = l46Var2.S;
            int i4 = i3;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var2, c92VarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            nte.b(afc.q(R.string.photo_camera_guide, l46Var2), ynb.b0(16.0f, 0.0f, g09Var, 2), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a((mue) l46Var2.k(nte.a), y72.e, w6c.l(13), new ar5(Constants.MINIMAL_ERROR_STATUS_CODE), null, 0L, null, 3, 0L, null, null, 16744440), l46Var, 48, 0, 131068);
            j09 j09VarE = kv2.e(g09Var, 20.0f, l46Var, g09Var, 1.0f);
            t7c t7cVarA = s7c.a(xc0.f, ndb.z, l46Var, 54);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarE);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, t7cVarA);
            dec.l(he2Var2, l46Var, u8aVarM2);
            ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ2);
            bm8.h(x16Var, b.l(g09Var, 56.0f), false, null, null, rs0.d, l46Var, (i4 & 14) | 1572912, 60);
            l46Var2 = l46Var;
            bm8.h(x16Var2, b.l(g09Var, 72.0f), false, null, null, rs0.e, l46Var2, ((i4 >> 3) & 14) | 1572912, 60);
            bm8.h(x16Var3, b.l(g09Var, 56.0f), false, null, null, rs0.f, l46Var2, ((i4 >> 6) & 14) | 1572912, 60);
            l46Var2.r(true);
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ai1(x16Var, x16Var2, x16Var3, i2, 0);
        }
    }

    public static final void f(final float f2, final boolean z, final x16 x16Var, final x16 x16Var2, x16 x16Var3, x16 x16Var4, x16 x16Var5, final a26 a26Var, l46 l46Var, final int i2) {
        int i3;
        boolean z2;
        final x16 x16Var6 = x16Var3;
        final x16 x16Var7 = x16Var4;
        final x16 x16Var8 = x16Var5;
        lx0 lx0Var = ndb.c;
        lx0 lx0Var2 = ndb.w;
        lx0 lx0Var3 = ndb.e;
        lx0 lx0Var4 = ndb.g;
        l46Var.h0(-1145886793);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.d(f2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i3 |= l46Var.i(x16Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i2 & 24576) == 0) {
            i3 |= l46Var.i(x16Var6) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i2) == 0) {
            i3 |= l46Var.i(x16Var7) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= l46Var.i(x16Var8) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= l46Var.i(a26Var) ? 8388608 : 4194304;
        }
        if (l46Var.W(i3 & 1, (4793491 & i3) != 4793490)) {
            FillElement fillElement = b.c;
            int i4 = i3;
            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var, 0);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, fillElement);
            lf2.q.getClass();
            l46Var.j0();
            boolean z3 = l46Var.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z3) {
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
            u((i4 >> 3) & 1022, x16Var, x16Var2, l46Var, z);
            g09 g09Var = g09.a;
            j09 j09VarD = b.c(g09Var, 1.0f).D(new jw7(1.0f, true));
            boolean z4 = (i4 & 29360128) == 8388608;
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (z4 || objR == i8cVar) {
                objR = new hy0(a26Var, 3);
                l46Var.p0(objR);
            }
            j09 j09VarW = nk8.w(j09VarD, (a26) objR);
            lx0 lx0Var5 = ndb.f;
            xn8 xn8VarC = s21.c(lx0Var5, false);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarW);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, xn8VarC);
            dec.l(he2Var2, l46Var, u8aVarM2);
            ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ2);
            j09 j09VarZ = ynb.Z(fillElement, 24.0f);
            xn8 xn8VarC2 = s21.c(lx0Var5, false);
            int iHashCode3 = Long.hashCode(l46Var.T);
            u8a u8aVarM3 = l46Var.m();
            j09 j09VarJ3 = m93.J(l46Var, j09VarZ);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, xn8VarC2);
            dec.l(he2Var2, l46Var, u8aVarM3);
            ib8.s(iHashCode3, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ3);
            j09 j09VarW2 = dj6.w(b.b, 0.66071427f);
            xn8 xn8VarC3 = s21.c(ndb.b, false);
            int iHashCode4 = Long.hashCode(l46Var.T);
            u8a u8aVarM4 = l46Var.m();
            j09 j09VarJ4 = m93.J(l46Var, j09VarW2);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, xn8VarC3);
            dec.l(he2Var2, l46Var, u8aVarM4);
            ib8.s(iHashCode4, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ4);
            d31 d31Var = d31.a;
            j09 j09VarB = d31Var.b(g09Var);
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = new wu0(11);
                l46Var.p0(objR2);
            }
            nk8.e(48, (a26) objR2, l46Var, j09VarB);
            if (f2 == 90.0f) {
                l46Var.f0(918130883);
                k(afc.q(R.string.photo_direction_up, l46Var), 90.0f, tm7.N(12.0f, 0.0f, d31Var.a(g09Var, lx0Var4), 2), l46Var, 48);
                k(afc.q(R.string.photo_direction_down, l46Var), 90.0f, tm7.N(-12.0f, 0.0f, d31Var.a(g09Var, lx0Var3), 2), l46Var, 48);
                l46Var.r(false);
            } else {
                if (f2 == -90.0f) {
                    l46Var.f0(918707297);
                    k(afc.q(R.string.photo_direction_up, l46Var), -90.0f, tm7.N(-12.0f, 0.0f, d31Var.a(g09Var, lx0Var3), 2), l46Var, 0);
                    k(afc.q(R.string.photo_direction_down, l46Var), -90.0f, tm7.N(12.0f, 0.0f, d31Var.a(g09Var, lx0Var4), 2), l46Var, 0);
                    l46Var.r(false);
                } else if (f2 == 180.0f) {
                    l46Var.f0(919285664);
                    z2 = true;
                    k(afc.q(R.string.photo_direction_up, l46Var), 180.0f, tm7.N(0.0f, 12.0f, d31Var.a(g09Var, lx0Var2), 1), l46Var, 48);
                    k(afc.q(R.string.photo_direction_down, l46Var), 180.0f, tm7.N(0.0f, -12.0f, d31Var.a(g09Var, lx0Var), 1), l46Var, 48);
                    l46Var.r(false);
                } else {
                    z2 = true;
                    l46Var.f0(919864868);
                    k(afc.q(R.string.photo_direction_up, l46Var), 0.0f, tm7.N(0.0f, -12.0f, d31Var.a(g09Var, lx0Var), 1), l46Var, 48);
                    k(afc.q(R.string.photo_direction_down, l46Var), 0.0f, tm7.N(0.0f, 12.0f, d31Var.a(g09Var, lx0Var2), 1), l46Var, 48);
                    l46Var.r(false);
                }
                tec.s(l46Var, z2, z2, z2);
                x16Var6 = x16Var3;
                x16Var7 = x16Var4;
                x16Var8 = x16Var5;
                e(x16Var6, x16Var7, x16Var8, l46Var, (i4 >> 12) & 1022);
                l46Var.r(z2);
            }
            z2 = true;
            tec.s(l46Var, z2, z2, z2);
            x16Var6 = x16Var3;
            x16Var7 = x16Var4;
            x16Var8 = x16Var5;
            e(x16Var6, x16Var7, x16Var8, l46Var, (i4 >> 12) & 1022);
            l46Var.r(z2);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: yh1
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    qn4.f(f2, z, x16Var, x16Var2, x16Var6, x16Var7, x16Var8, a26Var, (l46) obj, k99.P(i2 | 1));
                    return wef.a;
                }
            };
        }
    }

    public static final void g(final j09 j09Var, final aee aeeVar, final boolean z, final float f2, final boolean z2, final boolean z3, final wae waeVar, final n26 n26Var, final x16 x16Var, final l26 l26Var, final x16 x16Var2, final x16 x16Var3, final x16 x16Var4, final x16 x16Var5, l46 l46Var, final int i2, final int i3) {
        int i4;
        boolean z4;
        boolean z5;
        i8c i8cVar;
        e89 e89Var;
        int i5;
        int i6;
        final e89 e89Var2;
        int i7;
        l46 l46Var2 = l46Var;
        l46Var2.h0(1133559646);
        int i8 = i2 | (l46Var2.g(aeeVar) ? 32 : 16) | (l46Var2.h(z) ? 256 : 128) | (l46Var2.d(f2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        boolean zH = l46Var2.h(z2);
        int i9 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
        int i10 = i8 | (zH ? 16384 : 8192) | (l46Var2.h(z3) ? 131072 : 65536) | (l46Var2.i(waeVar) ? 1048576 : 524288) | (l46Var2.i(n26Var) ? 8388608 : 4194304) | (l46Var2.i(x16Var) ? 67108864 : 33554432) | (l46Var2.i(l26Var) ? 536870912 : 268435456);
        if ((i3 & 6) == 0) {
            i4 = i3 | (l46Var2.i(x16Var2) ? 4 : 2);
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= l46Var2.i(x16Var3) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= l46Var2.i(x16Var4) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= l46Var2.i(x16Var5) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i3 & 24576) == 0) {
            if (l46Var2.i(null)) {
                i9 = 16384;
            }
            i4 |= i9;
        }
        int i11 = i4;
        if (l46Var2.W(i10 & 1, ((i10 & 306783379) == 306783378 && (i11 & 9363) == 9362) ? false : true)) {
            Object objR = l46Var2.R();
            i8c i8cVar2 = sf2.a;
            if (objR == i8cVar2) {
                objR = new qz9(0.0f);
                l46Var2.p0(objR);
            }
            n69 n69Var = (n69) objR;
            Object objR2 = l46Var2.R();
            hkb hkbVar = hkb.e;
            if (objR2 == i8cVar2) {
                objR2 = q1c.f(hkbVar);
                l46Var2.p0(objR2);
            }
            e89 e89Var3 = (e89) objR2;
            Object objR3 = l46Var2.R();
            if (objR3 == i8cVar2) {
                objR3 = q1c.f(hkbVar);
                l46Var2.p0(objR3);
            }
            e89 e89Var4 = (e89) objR3;
            Bitmap bitmap = aeeVar.a;
            boolean z6 = (i10 & 112) == 32;
            Object objR4 = l46Var2.R();
            if (z6 || objR4 == i8cVar2) {
                objR4 = new fi1(aeeVar, n69Var, null);
                l46Var2.p0(objR4);
            }
            af1.o((l26) objR4, l46Var2, bitmap);
            j09 j09VarO = tm7.o(j09Var, y72.b, g21.f);
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarO);
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
            if (aeeVar.a == null) {
                l46Var2.f0(1268428236);
                g09 g09Var = g09.a;
                if (waeVar != null) {
                    l46Var2.f0(1268439706);
                    j09 j09VarB = d31.a.b(g09Var);
                    Object objR5 = l46Var2.R();
                    if (objR5 == i8cVar2) {
                        objR5 = new pg(e89Var4, 11);
                        l46Var2.p0(objR5);
                    }
                    x57.e(waeVar, nk8.w(j09VarB, (a26) objR5), null, null, null, l46Var2, (i10 >> 18) & 14);
                    z4 = false;
                    l46Var2.r(false);
                } else {
                    z4 = false;
                    l46Var2.f0(1268701098);
                    l46Var2.r(false);
                }
                if (z3) {
                    l46Var2.f0(1268749303);
                    j09 j09VarB0 = ynb.b0(48.0f, 0.0f, g09Var, 2);
                    e89Var = e89Var4;
                    z5 = z4;
                    i8cVar = i8cVar2;
                    i5 = 131072;
                    nte.b(afc.q(R.string.photo_unexpected_error, l46Var2), j09VarB0, y72.e, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, null, l46Var, 432, 0, 261112);
                    l46Var2 = l46Var;
                    l46Var2.r(z5);
                } else {
                    z5 = z4;
                    i8cVar = i8cVar2;
                    e89Var = e89Var4;
                    i5 = 131072;
                    l46Var2.f0(1268960010);
                    l46Var2.r(z5);
                }
                boolean z7 = ((29360128 & i10) == 8388608 ? true : z5) | ((458752 & i10) == i5 ? true : z5) | ((i10 & 7168) == 2048 ? true : z5);
                Object objR6 = l46Var2.R();
                i8c i8cVar3 = i8cVar;
                if (z7 || objR6 == i8cVar3) {
                    i6 = i10;
                    e89Var2 = e89Var3;
                    final e89 e89Var5 = e89Var;
                    i7 = 10;
                    x16 x16Var6 = new x16() { // from class: ei1
                        @Override // defpackage.x16
                        public final Object invoke() {
                            if (!z3) {
                                n26Var.m((hkb) e89Var2.getValue(), (hkb) e89Var5.getValue(), Float.valueOf(f2));
                            }
                            return wef.a;
                        }
                    };
                    l46Var2.p0(x16Var6);
                    objR6 = x16Var6;
                } else {
                    i6 = i10;
                    e89Var2 = e89Var3;
                    i7 = 10;
                }
                x16 x16Var7 = (x16) objR6;
                Object objR7 = l46Var2.R();
                if (objR7 == i8cVar3) {
                    objR7 = new pg(e89Var2, i7);
                    l46Var2.p0(objR7);
                }
                int i12 = i6 >> 9;
                int i13 = i11 << 6;
                int i14 = (i12 & 112) | (i12 & 14) | 12582912 | (i13 & 896) | (i13 & 7168) | (i13 & 57344) | (3670016 & (i11 << 9));
                l46 l46Var3 = l46Var2;
                f(f2, z2, x16Var2, x16Var3, x16Var4, x16Var7, x16Var5, (a26) objR7, l46Var3, i14);
                l46Var2 = l46Var3;
                l46Var2.r(z5);
            } else {
                l46Var2.f0(1269505455);
                xdc.a(null, null, af1.b0(875987791, new l30(aeeVar, z, x16Var, l26Var, n69Var, 1), l46Var2), null, null, 0, y72.j, 0L, null, af1.b0(1577385413, new w7(10, aeeVar, n69Var), l46Var2), l46Var, 806879616, 443);
                l46Var2 = l46Var;
                l46Var2.r(false);
            }
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(aeeVar, z, f2, z2, z3, waeVar, n26Var, x16Var, l26Var, x16Var2, x16Var3, x16Var4, x16Var5, i2, i3) { // from class: vh1
                public final /* synthetic */ x16 X;
                public final /* synthetic */ x16 Y;
                public final /* synthetic */ int Z;
                public final /* synthetic */ aee b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ float d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ wae g;
                public final /* synthetic */ n26 v;
                public final /* synthetic */ x16 w;
                public final /* synthetic */ l26 x;
                public final /* synthetic */ x16 y;
                public final /* synthetic */ x16 z;

                {
                    this.Z = i3;
                }

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(7);
                    int iP2 = k99.P(this.Z);
                    qn4.g(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, this.y, this.z, this.X, this.Y, (l46) obj, iP, iP2);
                    return wef.a;
                }
            };
        }
    }

    public static final void h(Integer num, a26 a26Var, x16 x16Var, l46 l46Var, int i2) {
        int i3;
        Object obj;
        Object obj2;
        boolean z;
        Object obj3;
        Object obj4;
        Class cls;
        a26Var.getClass();
        x16Var.getClass();
        l46Var.h0(-1780518199);
        if ((i2 & 6) == 0) {
            i3 = i2 | (l46Var.g(num) ? 4 : 2);
        } else {
            i3 = i2;
        }
        int i4 = i3 | (l46Var.i(a26Var) ? 32 : 16) | (l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i4 & 1, (i4 & 147) != 146)) {
            boolean z2 = (i4 & 14) == 4;
            Object objR = l46Var.R();
            Object obj5 = sf2.a;
            Object obj6 = objR;
            if (z2 || objR == obj5) {
                Object pVar = new p(17, num);
                l46Var.p0(pVar);
                obj6 = pVar;
            }
            x16 x16Var2 = (x16) obj6;
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            pi1 pi1Var = (pi1) z5c.G(job.a.b(pi1.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), x16Var2);
            e89 e89VarT = tm7.t(pi1Var.e, l46Var);
            x48 x48Var = (x48) l46Var.k(cb8.a);
            e89 e89VarT2 = tm7.t(pi1Var.g, l46Var);
            e89 e89VarT3 = tm7.t(pi1Var.w, l46Var);
            e89 e89VarT4 = tm7.t(pi1Var.z, l46Var);
            Context context = (Context) l46Var.k(uq.b);
            Object objR2 = l46Var.R();
            if (objR2 == obj5) {
                obj = objR2;
                Object ls9Var = new ls9(context);
                l46Var.p0(ls9Var);
                obj = ls9Var;
            }
            obj = objR2;
            ls9 ls9Var2 = (ls9) obj;
            e89 e89VarT5 = tm7.t(ls9Var2.d, l46Var);
            boolean zI = l46Var.i(ls9Var2);
            Object objR3 = l46Var.R();
            if (zI || objR3 == obj5) {
                Object c1Var = new c1(28, ls9Var2);
                l46Var.p0(c1Var);
                obj2 = c1Var;
            } else {
                obj2 = objR3;
            }
            af1.g(wef.a, (a26) obj2, l46Var);
            boolean zI2 = l46Var.i(pi1Var) | l46Var.i(x48Var);
            Object objR4 = l46Var.R();
            Object obj7 = objR4;
            if (zI2 || objR4 == obj5) {
                Object gi1Var = new gi1(pi1Var, x48Var, null);
                l46Var.p0(gi1Var);
                obj7 = gi1Var;
            }
            af1.o((l26) obj7, l46Var, x48Var);
            af afVar = new af(1);
            boolean zI3 = l46Var.i(pi1Var);
            Object objR5 = l46Var.R();
            if (zI3 || objR5 == obj5) {
                z = false;
                Object di1Var = new di1(pi1Var, false ? 1 : 0);
                l46Var.p0(di1Var);
                obj3 = di1Var;
            } else {
                z = false;
                obj3 = objR5;
            }
            yk8 yk8VarP = P(afVar, (a26) obj3, l46Var);
            l46Var.f0(-568823879);
            l46Var.r(z);
            FillElement fillElement = b.c;
            aee aeeVar = (aee) e89VarT2.getValue();
            boolean zBooleanValue = ((Boolean) pi1Var.X.getValue()).booleanValue();
            float fFloatValue = ((Number) e89VarT5.getValue()).floatValue();
            boolean zBooleanValue2 = ((Boolean) e89VarT3.getValue()).booleanValue();
            boolean zBooleanValue3 = ((Boolean) e89VarT4.getValue()).booleanValue();
            wae waeVar = (wae) e89VarT.getValue();
            boolean zI4 = l46Var.i(pi1Var);
            Object objR6 = l46Var.R();
            if (zI4 || objR6 == obj5) {
                Object g20Var = new g20(5, pi1Var);
                l46Var.p0(g20Var);
                obj4 = g20Var;
            } else {
                obj4 = objR6;
            }
            n26 n26Var = (n26) obj4;
            boolean zI5 = l46Var.i(pi1Var) | l46Var.i(x48Var);
            Object objR7 = l46Var.R();
            Object obj8 = objR7;
            if (zI5 || objR7 == obj5) {
                Object ad1Var = new ad1(1, pi1Var, x48Var);
                l46Var.p0(ad1Var);
                obj8 = ad1Var;
            }
            x16 x16Var3 = (x16) obj8;
            boolean zI6 = ((i4 & 112) == 32) | l46Var.i(pi1Var);
            Object objR8 = l46Var.R();
            Object obj9 = objR8;
            if (zI6 || objR8 == obj5) {
                Object h8Var = new h8(9, pi1Var, a26Var);
                l46Var.p0(h8Var);
                obj9 = h8Var;
            }
            l26 l26Var = (l26) obj9;
            boolean zI7 = l46Var.i(pi1Var);
            Object objR9 = l46Var.R();
            if (zI7 || objR9 == obj5) {
                cls = pi1.class;
                objR9 = new hl(0, pi1Var, cls, "toggleFlash", "toggleFlash()V", 0, 9);
                l46Var.p0(objR9);
            } else {
                cls = pi1.class;
            }
            x16 x16Var4 = (x16) ((ym7) objR9);
            boolean zI8 = l46Var.i(pi1Var);
            Object objR10 = l46Var.R();
            if (zI8 || objR10 == obj5) {
                objR10 = new hl(0, pi1Var, cls, "switchCamera", "switchCamera()V", 0, 10);
                l46Var.p0(objR10);
            }
            x16 x16Var5 = (x16) ((ym7) objR10);
            boolean zI9 = l46Var.i(yk8VarP);
            Object objR11 = l46Var.R();
            Object obj10 = objR11;
            if (zI9 || objR11 == obj5) {
                Object u11Var = new u11(yk8VarP, 1);
                l46Var.p0(u11Var);
                obj10 = u11Var;
            }
            l46Var.f0(-567599628);
            l46Var.r(false);
            g(fillElement, aeeVar, zBooleanValue, fFloatValue, zBooleanValue2, zBooleanValue3, waeVar, n26Var, x16Var3, l26Var, x16Var, x16Var4, x16Var5, (x16) obj10, l46Var, 6, (i4 >> 6) & 14);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b8(i2, num, a26Var, x16Var, 6);
        }
    }

    public static final void i(String str, List list, y23 y23Var, j09 j09Var, l46 l46Var, int i2) {
        String str2;
        int i3;
        j09 j09VarH;
        long jA;
        x4d x4dVarB;
        long jI;
        long jM;
        l46 l46Var2 = l46Var;
        l46Var2.h0(1040141960);
        if ((i2 & 6) == 0) {
            str2 = str;
            i3 = (l46Var2.g(str2) ? 4 : 2) | i2;
        } else {
            str2 = str;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? l46Var2.g(list) : l46Var2.i(list) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var2.e(y23Var.ordinal()) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i3 |= l46Var2.g(j09Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        int i4 = 0;
        if (l46Var2.W(i3 & 1, (i3 & 1171) != 1170)) {
            pr4 pr4Var = l8b.a;
            boolean zF = k8b.f((e8b) l46Var2.k(pr4Var));
            int iOrdinal = y23Var.ordinal();
            if (iOrdinal == 0) {
                l46Var2.f0(-1150948246);
                j09VarH = dj6.H(j09Var, l46Var2, 0);
                l46Var2.r(false);
            } else {
                if (iOrdinal != 1 && iOrdinal != 2) {
                    throw tec.d(-1150949355, l46Var2, false);
                }
                l46Var2.f0(-1319482261);
                boolean z = y23Var == y23.b;
                if (z) {
                    x4dVarB = a7c.b(zF ? 8.0f : 20.0f);
                } else {
                    x4dVarB = zF ? g21.f : a7c.b(12.0f);
                }
                if (z) {
                    l46Var2.f0(-1319180631);
                    if (zF) {
                        l46Var2.f0(-1150931855);
                        jI = l8b.h(l46Var2);
                        l46Var2.r(false);
                    } else {
                        l46Var2.f0(-1150931143);
                        long j2 = ((e8b) l46Var2.k(pr4Var)).h;
                        l46Var2.r(false);
                        jI = j2;
                    }
                    l46Var2.r(false);
                } else {
                    l46Var2.f0(-1319095660);
                    jI = l8b.i(l46Var2);
                    l46Var2.r(false);
                }
                long j3 = jI;
                if (z) {
                    l46Var2.f0(-1319014471);
                    if (zF) {
                        l46Var2.f0(-1150926500);
                        jM = l8b.l(l46Var2);
                    } else {
                        l46Var2.f0(-1150925442);
                        jM = l8b.k(l46Var2);
                    }
                    l46Var2.r(false);
                    l46Var2.r(false);
                } else {
                    l46Var2.f0(-1318913845);
                    jM = l8b.m(l46Var2);
                    l46Var2.r(false);
                }
                j09VarH = db6.w(tm7.o(j09Var, j3, x4dVarB), 0.5f, jM, x4dVarB);
                l46Var2.r(false);
            }
            int iOrdinal2 = y23Var.ordinal();
            if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                l46Var2.f0(-1318636085);
                if (zF) {
                    l46Var2.f0(-1150914345);
                    jA = l8b.e(l46Var2);
                } else {
                    l46Var2.f0(-1150913451);
                    jA = l8b.a(l46Var2);
                }
                l46Var2.r(false);
                l46Var2.r(false);
            } else {
                if (iOrdinal2 != 2) {
                    throw tec.d(-1150918304, l46Var2, false);
                }
                l46Var2.f0(-1150911209);
                jA = l8b.e(l46Var2);
                l46Var2.r(false);
            }
            j09 j09VarZ = ynb.Z(j09VarH, 20.0f);
            c92 c92VarA = a92.a(new uc0(12.0f, true, new qc0(i4)), ndb.Y, l46Var2, 6);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarZ);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, c92VarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            mue mueVar = pue.a;
            nte.b(str2, null, jA, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.e(l46Var2), l46Var2, i3 & 14, 0, 131066);
            nte.b(s72.D0(list, "\n", null, null, null, 62), null, l8b.b(l46Var), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.c(l46Var), l46Var, 0, 0, 131066);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new rb(i2, 9, str, list, y23Var, j09Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:63:0x011b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0127  */
    /* JADX WARN: Code duplicated, block: B:67:0x0129  */
    /* JADX WARN: Code duplicated, block: B:71:0x0153  */
    /* JADX WARN: Code duplicated, block: B:74:0x015c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0173  */
    /* JADX WARN: Code duplicated, block: B:80:0x017f  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    public static final void j(final List list, final List list2, j09 j09Var, y23 y23Var, l46 l46Var, final int i2, final int i3) {
        j09 j09Var2;
        int i4;
        int iOrdinal;
        int i5;
        int i6;
        int i7;
        boolean z;
        final y23 y23Var2;
        final j09 j09Var3;
        ojb ojbVarV;
        l26 l26Var;
        final j09 j09Var4;
        l46 l46Var2;
        final y23 y23Var3;
        float f2;
        list.getClass();
        list2.getClass();
        l46Var.h0(-458429328);
        int i8 = (l46Var.g(list) ? 4 : 2) | i2 | (l46Var.g(list2) ? 32 : 16);
        int i9 = i3 & 4;
        if (i9 == 0) {
            if ((i2 & 384) == 0) {
                j09Var2 = j09Var;
                i8 |= l46Var.g(j09Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i4 = i3 & 8;
            if (i4 != 0) {
                i8 |= 3072;
            } else if ((i2 & 3072) == 0) {
                if (y23Var == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = y23Var.ordinal();
                }
                if (l46Var.e(iOrdinal)) {
                    i5 = 2048;
                } else {
                    i5 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i8 |= i5;
            }
            i6 = i8;
            i7 = 0;
            if ((i6 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i6 & 1, z)) {
                if (i9 != 0) {
                    j09Var4 = g09.a;
                } else {
                    j09Var4 = j09Var2;
                }
                if (i4 != 0) {
                    y23Var3 = y23.a;
                    l46Var2 = l46Var;
                } else {
                    l46Var2 = l46Var;
                    y23Var3 = y23Var;
                }
                if (list.isEmpty() || !list2.isEmpty()) {
                    j09Var2 = j09Var4;
                    y23 y23Var4 = y23Var3;
                    j09 j09VarF = urg.F(b.c(j09Var2, 1.0f), ia7.a);
                    t7c t7cVarA = s7c.a(new uc0(12.0f, true, new qc0(i7)), ndb.y, l46Var2, 54);
                    int iHashCode = Long.hashCode(l46Var2.T);
                    u8a u8aVarM = l46Var2.m();
                    j09 j09VarJ = m93.J(l46Var2, j09VarF);
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
                    String strQ = afc.q(R.string.daily_fortune_action_do, l46Var2);
                    if (1.0f <= 0.0d) {
                        g37.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f2 = Float.MAX_VALUE;
                    } else {
                        f2 = 1.0f;
                    }
                    jw7 jw7Var = new jw7(f2, true);
                    FillElement fillElement = b.b;
                    int i10 = (i6 >> 3) & 896;
                    l46 l46Var3 = l46Var2;
                    i(strQ, list, y23Var4, jw7Var.D(fillElement), l46Var3, ((i6 << 3) & 112) | i10);
                    String strQ2 = afc.q(R.string.daily_fortune_action_dont, l46Var3);
                    if (1.0f <= 0.0d) {
                        g37.a("invalid weight; must be greater than zero");
                    }
                    i(strQ2, list2, y23Var4, new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true).D(fillElement), l46Var3, (i6 & 112) | i10);
                    l46Var3.r(true);
                    y23Var2 = y23Var4;
                } else {
                    ojbVarV = l46Var2.v();
                    if (ojbVarV == null) {
                        return;
                    }
                    final int i11 = 0;
                    l26Var = new l26() { // from class: x23
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            int i12 = i11;
                            wef wefVar = wef.a;
                            int i13 = i2;
                            switch (i12) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iP = k99.P(i13 | 1);
                                    qn4.j(list, list2, j09Var4, y23Var3, (l46) obj, iP, i3);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iP2 = k99.P(i13 | 1);
                                    qn4.j(list, list2, j09Var4, y23Var3, (l46) obj, iP2, i3);
                                    break;
                            }
                            return wefVar;
                        }
                    };
                }
                ojbVarV.d = l26Var;
            }
            l46Var.Z();
            y23Var2 = y23Var;
            j09Var3 = j09Var2;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                final int i12 = 1;
                l26Var = new l26() { // from class: x23
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        int i13 = i12;
                        wef wefVar = wef.a;
                        int i14 = i2;
                        switch (i13) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iP = k99.P(i14 | 1);
                                qn4.j(list, list2, j09Var3, y23Var2, (l46) obj, iP, i3);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iP2 = k99.P(i14 | 1);
                                qn4.j(list, list2, j09Var3, y23Var2, (l46) obj, iP2, i3);
                                break;
                        }
                        return wefVar;
                    }
                };
                ojbVarV.d = l26Var;
            }
        }
        i8 |= 384;
        j09Var2 = j09Var;
        i4 = i3 & 8;
        if (i4 != 0) {
            i8 |= 3072;
        } else if ((i2 & 3072) == 0) {
            if (y23Var == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = y23Var.ordinal();
            }
            if (l46Var.e(iOrdinal)) {
                i5 = 2048;
            } else {
                i5 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i8 |= i5;
        }
        i6 = i8;
        i7 = 0;
        if ((i6 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (l46Var.W(i6 & 1, z)) {
            if (i9 != 0) {
                j09Var4 = g09.a;
            } else {
                j09Var4 = j09Var2;
            }
            if (i4 != 0) {
                y23Var3 = y23.a;
                l46Var2 = l46Var;
            } else {
                l46Var2 = l46Var;
                y23Var3 = y23Var;
            }
            if (list.isEmpty()) {
            }
            j09Var2 = j09Var4;
            y23 y23Var5 = y23Var3;
            j09 j09VarF2 = urg.F(b.c(j09Var2, 1.0f), ia7.a);
            t7c t7cVarA2 = s7c.a(new uc0(12.0f, true, new qc0(i7)), ndb.y, l46Var2, 54);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarF2);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, t7cVarA2);
            dec.l(hj6.y, l46Var2, u8aVarM2);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode2));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ2);
            String strQ3 = afc.q(R.string.daily_fortune_action_do, l46Var2);
            if (1.0f <= 0.0d) {
                g37.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f2 = Float.MAX_VALUE;
            } else {
                f2 = 1.0f;
            }
            jw7 jw7Var2 = new jw7(f2, true);
            FillElement fillElement2 = b.b;
            int i13 = (i6 >> 3) & 896;
            l46 l46Var4 = l46Var2;
            i(strQ3, list, y23Var5, jw7Var2.D(fillElement2), l46Var4, ((i6 << 3) & 112) | i13);
            String strQ4 = afc.q(R.string.daily_fortune_action_dont, l46Var4);
            if (1.0f <= 0.0d) {
                g37.a("invalid weight; must be greater than zero");
            }
            i(strQ4, list2, y23Var5, new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true).D(fillElement2), l46Var4, (i6 & 112) | i13);
            l46Var4.r(true);
            y23Var2 = y23Var5;
        } else {
            l46Var.Z();
            y23Var2 = y23Var;
        }
        j09Var3 = j09Var2;
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            final int i14 = 1;
            l26Var = new l26() { // from class: x23
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    int i15 = i14;
                    wef wefVar = wef.a;
                    int i16 = i2;
                    switch (i15) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iP = k99.P(i16 | 1);
                            qn4.j(list, list2, j09Var3, y23Var2, (l46) obj, iP, i3);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iP2 = k99.P(i16 | 1);
                            qn4.j(list, list2, j09Var3, y23Var2, (l46) obj, iP2, i3);
                            break;
                    }
                    return wefVar;
                }
            };
            ojbVarV.d = l26Var;
        }
    }

    public static final void k(String str, float f2, j09 j09Var, l46 l46Var, int i2) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(-1894372275);
        int i3 = i2 | (l46Var2.g(str) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i3 |= l46Var2.d(f2) ? 32 : 16;
        }
        int i4 = i3 | (l46Var2.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var2.W(i4 & 1, (i4 & 147) != 146)) {
            j09 j09VarI = q6c.i(j09Var, f2);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarI);
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
            j09 j09VarO = tm7.o(g09.a, y72.b(y72.b, 0.5f), a7c.b(4.0f));
            long j2 = y72.e;
            nte.b(str, ynb.a0(db6.w(j09VarO, 0.5f, j2, a7c.b(4.0f)), 8.0f, 4.0f), j2, w6c.l(14), new ar5(Constants.MINIMAL_ERROR_STATUS_CODE), null, w6c.k(-0.28d), null, new jme(3), w6c.l(21), 0, false, 0, 0, null, null, l46Var, (i4 & 14) | 1597824, 48, 258728);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new bi1(str, f2, j09Var, i2);
        }
    }

    public static final void l(boolean z, a26 a26Var, x16 x16Var, x16 x16Var2, l46 l46Var, int i2) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(758499625);
        int i3 = i2 | (l46Var2.h(z) ? 4 : 2) | (l46Var2.i(a26Var) ? 32 : 16) | (l46Var2.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var2.i(x16Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var2.i(null) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        int i4 = 0;
        if (l46Var2.W(i3 & 1, (i3 & 9363) != 9362)) {
            j09 j09VarN = mh3.N(ynb.b0(16.0f, 0.0f, b.c(g09.a, 1.0f), 2));
            t7c t7cVarA = s7c.a(xc0.a, ndb.y, l46Var2, 0);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarN);
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
            bm8.h(x16Var, null, false, null, null, rs0.g, l46Var2, ((i3 >> 6) & 14) | 1572864, 62);
            int i5 = i3 & 112;
            boolean z2 = i5 == 32;
            Object objR = l46Var2.R();
            i8c i8cVar = sf2.a;
            if (z2 || objR == i8cVar) {
                objR = new zh1(a26Var, i4);
                l46Var2.p0(objR);
            }
            bm8.h((x16) objR, null, false, null, null, rs0.h, l46Var2, 1572864, 62);
            boolean z3 = i5 == 32;
            Object objR2 = l46Var2.R();
            if (z3 || objR2 == i8cVar) {
                objR2 = new zh1(a26Var, 1);
                l46Var2.p0(objR2);
            }
            bm8.h((x16) objR2, null, false, null, null, rs0.i, l46Var2, 1572864, 62);
            l46Var2.f0(-401469827);
            l46Var2.r(false);
            o5c.f(l46Var2, new jw7(1.0f, true));
            c8b.j(null, afc.q(R.string.common_ok, l46Var2), false, z ? ed.E0 : dd.E0, 2.0f, we6.f(a7c.b(8.0f), l46Var2), c8b.m(l46Var2), we6.a(null, l46Var2, 1), false, x16Var2, l46Var, 28672 | ((i3 << 18) & 1879048192), 261);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o50(z, a26Var, x16Var, x16Var2, i2);
        }
    }

    public static final void m(x16 x16Var, a16 a16Var, l46 l46Var, int i2) {
        x16 x16Var2;
        a16 a16Var2;
        int i3;
        e89 e89Var;
        l46 l46Var2 = l46Var;
        x16Var.getClass();
        l46Var2.h0(677410275);
        int i4 = (l46Var2.i(x16Var) ? 4 : 2) | i2 | 16;
        if (l46Var2.W(i4 & 1, (i4 & 19) != 18)) {
            l46Var2.b0();
            int i5 = i2 & 1;
            i8c i8cVar = sf2.a;
            if (i5 == 0 || l46Var2.C()) {
                nfc nfcVarB = kr7.b(l46Var2);
                boolean zG = l46Var2.g(null) | l46Var2.g(nfcVarB);
                Object objR = l46Var2.R();
                if (zG || objR == i8cVar) {
                    objR = nfcVarB.b(job.a.b(a16.class), null, null);
                    l46Var2.p0(objR);
                }
                i3 = i4 & (-113);
                a16Var2 = (a16) objR;
            } else {
                l46Var2.Z();
                i3 = i4 & (-113);
                a16Var2 = a16Var;
            }
            l46Var2.s();
            Context context = (Context) l46Var2.k(uq.b);
            Object objR2 = l46Var2.R();
            if (objR2 == i8cVar) {
                objR2 = af1.E(l46Var2);
                l46Var2.p0(objR2);
            }
            aw2 aw2Var = (aw2) objR2;
            boolean zG2 = l46Var2.g(context);
            Object objR3 = l46Var2.R();
            if (zG2 || objR3 == i8cVar) {
                objR3 = new d16(new fs(context, 0));
                l46Var2.p0(objR3);
            }
            d16 d16Var = (d16) objR3;
            boolean zG3 = l46Var2.g(context);
            Object objR4 = l46Var2.R();
            if (zG3 || objR4 == i8cVar) {
                objR4 = BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_logo);
                if (objR4 == null) {
                    qc0.j("Required value was null.");
                    return;
                }
                l46Var2.p0(objR4);
            }
            Bitmap bitmap = (Bitmap) objR4;
            Object objR5 = l46Var2.R();
            if (objR5 == i8cVar) {
                objR5 = q1c.f(null);
                l46Var2.p0(objR5);
            }
            e89 e89Var2 = (e89) objR5;
            Object objR6 = l46Var2.R();
            if (objR6 == i8cVar) {
                objR6 = q1c.f(pu4.a);
                l46Var2.p0(objR6);
            }
            e89 e89Var3 = (e89) objR6;
            Object objR7 = l46Var2.R();
            if (objR7 == i8cVar) {
                objR7 = q1c.f(Boolean.FALSE);
                l46Var2.p0(objR7);
            }
            e89 e89Var4 = (e89) objR7;
            boolean zI = l46Var2.i(a16Var2) | l46Var2.i(context) | l46Var2.i(d16Var);
            Object objR8 = l46Var2.R();
            if (zI || objR8 == i8cVar) {
                objR8 = new it3(a16Var2, context, d16Var, 9);
                l46Var2.p0(objR8);
            }
            a26 a26Var = (a26) objR8;
            boolean zI2 = l46Var2.i(a16Var2) | l46Var2.i(context);
            Object objR9 = l46Var2.R();
            if (zI2 || objR9 == i8cVar) {
                wg wgVar = new wg(a16Var2, context, e89Var3, e89Var2, 14);
                l46Var2.p0(wgVar);
                objR9 = wgVar;
            }
            n16.k(x16Var, a26Var, (a26) objR9, null, null, null, l46Var, i3 & 14);
            x16Var2 = x16Var;
            l46Var2 = l46Var;
            l06 l06Var = (l06) e89Var2.getValue();
            if (l06Var == null) {
                l46Var2.f0(-1320428641);
                l46Var2.r(false);
            } else {
                l46Var2.f0(-1320428640);
                List list = (List) e89Var3.getValue();
                boolean z = !((Boolean) e89Var4.getValue()).booleanValue();
                boolean zI3 = l46Var2.i(aw2Var) | l46Var2.i(a16Var2) | l46Var2.i(context) | l46Var2.i(d16Var) | l46Var2.i(l06Var) | l46Var2.i(bitmap);
                Object objR10 = l46Var2.R();
                if (zI3 || objR10 == i8cVar) {
                    a16 a16Var3 = a16Var2;
                    sy1 sy1Var = new sy1(aw2Var, e89Var4, a16Var3, context, l06Var, bitmap, d16Var, e89Var2, 1);
                    a16Var2 = a16Var3;
                    e89Var = e89Var2;
                    l46Var2.p0(sy1Var);
                    objR10 = sy1Var;
                } else {
                    e89Var = e89Var2;
                }
                a26 a26Var2 = (a26) objR10;
                boolean zI4 = l46Var2.i(a16Var2);
                Object objR11 = l46Var2.R();
                if (zI4 || objR11 == i8cVar) {
                    objR11 = new jt3(24, a16Var2, e89Var);
                    l46Var2.p0(objR11);
                }
                db6.h(0, (x16) objR11, a26Var2, l46Var2, null, list, z);
                l46Var2.r(false);
            }
        } else {
            x16Var2 = x16Var;
            l46Var2.Z();
            a16Var2 = a16Var;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o14(x16Var2, a16Var2, i2, 21);
        }
    }

    public static final c16 n(d16 d16Var, l06 l06Var) {
        int i2 = l06Var.e;
        String str = l06Var.b;
        fs fsVar = d16Var.a;
        str.getClass();
        if (i2 <= 0) {
            qc0.j("Failed requirement.");
            return null;
        }
        if (v4e.Q(str)) {
            qc0.j("Failed requirement.");
            return null;
        }
        Context context = fsVar.a;
        String string = context.getString(R.string.friend_coupon_share_card_title, Integer.valueOf(i2));
        string.getClass();
        String string2 = context.getString(R.string.friend_coupon_share_text_title, Integer.valueOf(i2));
        string2.getClass();
        String string3 = context.getString(R.string.friend_coupon_share_card_description);
        string3.getClass();
        String strK = ub3.k(string2, "\n", string3, "\n");
        return new c16(str, string, string2, string3, strK, ib8.j(strK, "\n", str));
    }

    public static final void o(int i2, l46 l46Var) {
        Object next;
        pwf pwfVarH;
        l46Var.h0(-1818285985);
        boolean z = true;
        if (l46Var.W(i2 & 1, i2 != 0)) {
            nfc nfcVarB = kr7.b(l46Var);
            boolean zBooleanValue = ((Boolean) l46Var.k(h57.a)).booleanValue();
            Object obj = sf2.a;
            if (zBooleanValue) {
                pwfVarH = ib8.h(l46Var, 1471494079, l46Var, false);
            } else {
                l46Var.f0(1471494731);
                Object objK = l46Var.k(uq.b);
                Object objR = l46Var.R();
                if (objR == obj) {
                    objR = z03.P0;
                    l46Var.p0(objR);
                }
                Iterator it = fyc.u((a26) objR, objK).iterator();
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
                return;
            }
            mma mmaVar = (mma) z5c.G(job.a.b(mma.class), pwfVarH.g(), null, b21.r(pwfVarH), nfcVarB, null);
            Object obj2 = (x48) l46Var.k(cb8.a);
            Object objR2 = l46Var.R();
            if (objR2 == obj) {
                objR2 = af1.E(l46Var);
                l46Var.p0(objR2);
            }
            Object obj3 = (aw2) objR2;
            if (!((Boolean) tm7.t(mmaVar.Q0, l46Var).getValue()).booleanValue() && ua0.a() == null) {
                z = false;
            }
            Object objI = q1c.i(Boolean.valueOf(z), l46Var);
            boolean zI = l46Var.i(obj3) | l46Var.g(objI) | l46Var.i(obj2) | l46Var.i(mmaVar);
            Object objR3 = l46Var.R();
            if (zI || objR3 == obj) {
                Object wgVar = new wg(obj2, obj3, mmaVar, objI, 16);
                l46Var.p0(wgVar);
                objR3 = wgVar;
            }
            af1.h(obj2, obj3, (a26) objR3, l46Var);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new sz5(i2, 11);
        }
    }

    public static final void p(uh8 uh8Var, j09 j09Var, float f2, x16 x16Var, l46 l46Var, int i2) {
        int i3;
        j09 j09Var2;
        x16Var.getClass();
        l46Var.h0(1930117092);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.i(uh8Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            j09Var2 = j09Var;
            i3 |= l46Var.g(j09Var2) ? 32 : 16;
        } else {
            j09Var2 = j09Var;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var.d(f2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i3 |= l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = i3 & 14;
            eh8 eh8Var = (eh8) rs0.l(uh8Var, true, false, false, 0.0f, 1, l46Var, 956);
            Float fValueOf = Float.valueOf(eh8Var.d());
            Float fValueOf2 = Float.valueOf(f2);
            boolean zG = l46Var.g(eh8Var) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (zG || objR == obj) {
                objR = new rh8(eh8Var, f2, x16Var, null);
                l46Var.p0(objR);
            }
            af1.p(fValueOf, fValueOf2, (l26) objR, l46Var);
            boolean zG2 = l46Var.g(eh8Var);
            Object objR2 = l46Var.R();
            if (zG2 || objR2 == obj) {
                objR2 = new zv6(13, eh8Var);
                l46Var.p0(objR2);
            }
            mh3.e(uh8Var, (x16) objR2, j09Var2, false, false, false, false, null, false, null, null, false, false, null, null, false, l46Var, i4 | ((i3 << 3) & 896), 0, 131064);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new vr5(uh8Var, j09Var, f2, x16Var, i2);
        }
    }

    public static final void q(x16 x16Var, l46 l46Var, int i2) {
        int i3;
        x16Var.getClass();
        l46Var.h0(-2119224917);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.i(x16Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (l46Var.W(i3 & 1, (i3 & 3) != 2)) {
            kj0.F(afc.q(R.string.mixed_storage_title, l46Var), qk2.y, afc.q(R.string.mixed_storage_confirm, l46Var), null, false, false, null, null, null, x16Var, l46Var, ((i3 << 27) & 1879048192) | 100663344, 248);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new lk3(i2, 7, x16Var);
        }
    }

    public static final void r(x16 x16Var, x16 x16Var2, l46 l46Var, int i2) {
        x16 x16Var3;
        l46 l46Var2;
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(858133188);
        int i3 = (l46Var.i(x16Var) ? 4 : 2) | i2 | (l46Var.i(x16Var2) ? 32 : 16);
        boolean z = false;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            x16Var3 = x16Var2;
            l46Var2 = l46Var;
            t72.b(x16Var3, new s84(true, false, false), af1.b0(-682649523, new b20(x16Var2, x16Var, z, 22), l46Var), l46Var2, ((i3 >> 3) & 14) | 432, 0);
        } else {
            x16Var3 = x16Var2;
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b20(i2, 23, x16Var, x16Var3);
        }
    }

    public static final void s(Bitmap bitmap, float f2, l46 l46Var, int i2) {
        l46Var.h0(-1969881129);
        int i3 = i2 | (l46Var.i(bitmap) ? 32 : 16) | (l46Var.d(f2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i3 & 1, (i3 & 145) != 144)) {
            h0e h0eVarB = vx.b(f2, b21.T(800, 0, null, 6), "rotation", null, l46Var, ((i3 >> 6) & 14) | 3120, 20);
            float width = bitmap.getWidth() / bitmap.getHeight();
            float fFloatValue = ((((Number) h0eVarB.getValue()).floatValue() % 360.0f) + 360.0f) % 360.0f;
            float fN = mh3.n(Math.min(Math.abs(fFloatValue - 0.0f), Math.min(Math.abs(fFloatValue - 180.0f), Math.abs(fFloatValue - 360.0f))) / 90.0f, 0.0f, 1.0f);
            float fP = abg.P(width, 1.0f / width, fN);
            String strQ = afc.q(R.string.photo_direction_up, l46Var);
            long j2 = y72.e;
            y6c y6cVarB = a7c.b(4.0f);
            g09 g09Var = g09.a;
            nte.b(strQ, ynb.a0(db6.w(g09Var, 0.0f, j2, y6cVarB), 4.0f, 2.0f), j2, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var, 384, 0, 262136);
            j09 j09VarE = oa7.E(dj6.w(b.c(g09Var, 0.8f), fP), a7c.b(12.0f));
            int i4 = 0;
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarE);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            j09 j09VarW = dj6.w(fN < 0.5f ? b.b : b.c(g09Var, 1.0f), width);
            boolean zG = l46Var.g(h0eVarB);
            Object objR = l46Var.R();
            if (zG || objR == sf2.a) {
                objR = new wh1(i4, h0eVarB);
                l46Var.p0(objR);
            }
            gdc.a(bitmap, null, bzd.x(j09VarW, (a26) objR), an2.b, null, l46Var, ((i3 >> 3) & 14) | 1572912, 1976);
            l46Var.r(true);
            nte.b(afc.q(R.string.photo_direction_down, l46Var), ynb.a0(db6.w(g09Var, 0.0f, j2, a7c.b(4.0f)), 4.0f, 2.0f), j2, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var, 384, 0, 262136);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new xh1(bitmap, f2, i2);
        }
    }

    public static final void t(int i2, l46 l46Var) {
        Object next;
        pwf pwfVarH;
        l46Var.h0(-825581);
        int i3 = 25;
        if (l46Var.W(i2 & 1, i2 != 0)) {
            nfc nfcVarB = kr7.b(l46Var);
            boolean zBooleanValue = ((Boolean) l46Var.k(h57.a)).booleanValue();
            Object obj = sf2.a;
            if (zBooleanValue) {
                pwfVarH = ib8.h(l46Var, 1471494079, l46Var, false);
            } else {
                l46Var.f0(1471494731);
                Object objK = l46Var.k(uq.b);
                Object objR = l46Var.R();
                if (objR == obj) {
                    objR = d5a.w;
                    l46Var.p0(objR);
                }
                Iterator it = fyc.u((a26) objR, objK).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((Context) next) instanceof pwf));
                l46Var.r(false);
                pwfVarH = (pwf) next;
            }
            if (pwfVarH == null) {
                qc0.p("No ViewModelStoreOwner found in the context chain");
                return;
            }
            edb edbVar = (edb) z5c.G(job.a.b(edb.class), pwfVarH.g(), null, b21.r(pwfVarH), nfcVarB, null);
            Context context = (Context) l46Var.k(uq.b);
            q0c q0cVar = (q0c) edbVar.d.getValue();
            boolean zI = l46Var.i(edbVar) | l46Var.i(context);
            Object objR2 = l46Var.R();
            if (zI || objR2 == obj) {
                objR2 = new adb(edbVar, context, null);
                l46Var.p0(objR2);
            }
            af1.o((l26) objR2, l46Var, q0cVar);
            if (!((Boolean) edbVar.c.getValue()).booleanValue()) {
                ojb ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new b3b(i2, 24);
                    return;
                }
                return;
            }
            String strQ = afc.q(R.string.rating_title, l46Var);
            String strQ2 = afc.q(R.string.rating_positive_text, l46Var);
            String strQ3 = afc.q(R.string.button_cancel, l46Var);
            dd2 dd2Var = lmg.j;
            boolean zI2 = l46Var.i(edbVar);
            Object objR3 = l46Var.R();
            if (zI2 || objR3 == obj) {
                objR3 = new hla(5, edbVar);
                l46Var.p0(objR3);
            }
            x16 x16Var = (x16) objR3;
            boolean zI3 = l46Var.i(edbVar) | l46Var.i(context);
            Object objR4 = l46Var.R();
            if (zI3 || objR4 == obj) {
                objR4 = new ek9(i3, edbVar, context);
                l46Var.p0(objR4);
            }
            kj0.F(strQ, dd2Var, strQ2, strQ3, false, false, null, null, x16Var, (x16) objR4, l46Var, 48, 240);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV2 = l46Var.v();
        if (ojbVarV2 != null) {
            ojbVarV2.d = new b3b(i2, i3);
        }
    }

    public static final void u(int i2, x16 x16Var, x16 x16Var2, l46 l46Var, boolean z) {
        int i3;
        boolean z2;
        l46Var.h0(-425289390);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.h(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.i(x16Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i4 = 0;
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            g09 g09Var = g09.a;
            j09 j09VarA0 = ynb.a0(mh3.W(tm7.o(b.c(g09Var, 1.0f), y72.b(y72.b, 0.6f), g21.f)), 16.0f, 12.0f);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarA0);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            lx0 lx0Var = ndb.e;
            d31 d31Var = d31.a;
            bm8.h(x16Var, b.l(d31Var.a(g09Var, lx0Var), 44.0f), false, null, null, rs0.c, l46Var, ((i3 >> 3) & 14) | 1572864, 60);
            z2 = z;
            bm8.h(x16Var2, b.l(d31Var.a(g09Var, ndb.g), 44.0f), false, null, null, af1.b0(1009304749, new ci1(z2, i4), l46Var), l46Var, ((i3 >> 6) & 14) | 1572864, 60);
            l46Var.r(true);
        } else {
            z2 = z;
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new e21(z2, x16Var, x16Var2, i2, 2);
        }
    }

    public static final void v(int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        qc0.j(kv2.h(i2, i3, "Class declares ", " type parameters, but ", " were provided."));
    }

    public static final j2 w(um7 um7Var, List list, boolean z, List list2) {
        um7Var.getClass();
        list.getClass();
        list2.getClass();
        return y(um7Var, list, z, list2, null);
    }

    public static /* synthetic */ j2 x(um7 um7Var, List list, boolean z, int i2) {
        int i3 = i2 & 1;
        pu4 pu4Var = pu4.a;
        if (i3 != 0) {
            list = pu4Var;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        return w(um7Var, list, z, pu4Var);
    }

    public static final j2 y(um7 um7Var, List list, boolean z, List list2, em7 em7Var) {
        y22 y22VarT;
        dzd dzdVar;
        um7Var.getClass();
        list.getClass();
        list2.getClass();
        if (!rce.a) {
            em7 em7Var2 = um7Var instanceof em7 ? (em7) um7Var : null;
            List listG = em7Var2 != null ? xo1.g(em7Var2) : null;
            if (listG == null) {
                listG = pu4.a;
            }
            v(listG.size(), list.size());
            return new ljd(um7Var, list, z, list2, null, false, false, false, em7Var, null);
        }
        if (um7Var instanceof nm7) {
            y22VarT = ((nm7) um7Var).T();
            if (em7Var != null) {
                ex5 ex5VarF = oz3.f(y22VarT);
                String str = qf7.a;
                dx5 dx5VarI = qf7.i(ex5VarF);
                if (dx5VarI == null) {
                    r3.m(y22VarT, " is not a read-only collection", "Given class ");
                    return null;
                }
                y22VarT = qz3.e(y22VarT).j(dx5VarI);
            }
        } else {
            if (!(um7Var instanceof ao7)) {
                StringBuilder sb = new StringBuilder("Cannot create type for an unsupported classifier: ");
                sb.append(um7Var);
                Class<?> cls = um7Var.getClass();
                sb.append(" (");
                sb.append(cls);
                sb.append(')');
                throw new pt7(sb.toString());
            }
            ao7 ao7Var = (ao7) um7Var;
            c8f c8fVar = ao7Var.e;
            if (c8fVar == null) {
                pd4.i(ao7Var, "Descriptor-less type parameter: ");
                return null;
            }
            y22VarT = c8fVar;
        }
        v(y22VarT.h().getParameters().size(), list.size());
        j7f j7fVarH = y22VarT.h();
        j7fVarH.getClass();
        List parameters = j7fVarH.getParameters();
        parameters.getClass();
        e7f.b.getClass();
        e7f e7fVar = e7f.c;
        ArrayList arrayList = new ArrayList(t72.u(list, 10));
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                t72.Z();
                throw null;
            }
            do7 do7Var = (do7) obj;
            zy3 zy3Var = (zy3) do7Var.b;
            tt7 tt7Var = zy3Var != null ? zy3Var.b : null;
            io7 io7Var = do7Var.a;
            int i4 = io7Var == null ? -1 : am7.a[io7Var.ordinal()];
            if (i4 == -1) {
                Object obj2 = parameters.get(i2);
                obj2.getClass();
                dzdVar = new dzd((c8f) obj2);
            } else if (i4 == 1) {
                tt7Var.getClass();
                dzdVar = new dzd(tt7Var, dsf.INVARIANT);
            } else if (i4 == 2) {
                tt7Var.getClass();
                dzdVar = new dzd(tt7Var, dsf.IN_VARIANCE);
            } else {
                if (i4 != 3) {
                    ap.c();
                    return null;
                }
                tt7Var.getClass();
                dzdVar = new dzd(tt7Var, dsf.OUT_VARIANCE);
            }
            arrayList.add(dzdVar);
            i2 = i3;
        }
        return new zy3(rxg.T(e7fVar, j7fVarH, arrayList, z), null, false);
    }

    public abstract InputFilter[] A(InputFilter[] inputFilterArr);

    public abstract os D();

    public Object E(int i2) {
        Object objD;
        da7 da7VarF = D().f(i2);
        int i3 = i2 - da7VarF.a;
        a26 key = da7VarF.c.getKey();
        return (key == null || (objD = key.d(Integer.valueOf(i3))) == null) ? new pr3(i2) : objD;
    }

    public abstract void S(boolean z);

    public abstract void T(boolean z);

    public Object z(int i2) {
        da7 da7VarF = D().f(i2);
        return da7VarF.c.getType().d(Integer.valueOf(i2 - da7VarF.a));
    }
}
