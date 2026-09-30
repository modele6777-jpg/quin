package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.material3.c;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b21 {
    public static final int[] a = {1, 2, 3, 6};
    public static final int[] b = {48000, 44100, 32000};
    public static final int[] c = {24000, 22050, 16000};
    public static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, UserMetadata.MAX_ROLLOUT_ASSIGNMENTS, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final dd2 g = new dd2(new a7(22), false, -2126648592);
    public static final dd2 h = new dd2(new yd2(6), false, -2098909875);
    public static final dd2 i = new dd2(new xd2(19), false, -1637209008);
    public static final dd2 j = new dd2(new ed2(12), false, 47839659);
    public static final qu k = new qu(18);
    public static final c1b l = new c1b(new zib(0));
    public static gx6 m = null;
    public static int n = 3;

    public static final Object A(as9 as9Var, q95 q95Var) {
        Object obj = as9Var.j.a.get(q95Var);
        return obj == null ? q95Var.a : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final yib B(p09 p09Var) {
        if (((i09) p09Var).a.Y) {
            return (yib) p09Var.L(l);
        }
        return null;
    }

    public static void C(String str, String str2) {
        if (F(4, str)) {
            Log.i(str, str2);
        }
    }

    public static l27 D(br4 br4Var, lrb lrbVar, int i2) {
        if ((i2 & 2) != 0) {
            lrbVar = lrb.a;
        }
        return new l27(br4Var, lrbVar, 0L);
    }

    public static String E(ly1 ly1Var, if7 if7Var) {
        if (ly1Var.a(if7Var)) {
            return null;
        }
        return ly1Var.getDescription();
    }

    public static boolean F(int i2, String str) {
        return n <= i2 || Log.isLoggable(str, i2);
    }

    public static final boolean G(LayoutNode layoutNode) {
        if (layoutNode.w == null) {
            return false;
        }
        LayoutNode layoutNodeF = layoutNode.F();
        return (layoutNodeF != null ? layoutNodeF.w : null) == null || layoutNode.getLayoutDelegate().b;
    }

    public static final int H(vz7 vz7Var, boolean z) {
        int iO;
        int iH;
        if (z) {
            iO = vz7Var.i();
            iH = vz7Var.l();
        } else {
            iO = vz7Var.o();
            iH = vz7Var.h();
        }
        return iH + iO;
    }

    public static final void I(za9 za9Var, em7 em7Var, Object obj, a26 a26Var) {
        em7Var.getClass();
        obj.getClass();
        za9 za9Var2 = new za9(za9Var.g, obj, em7Var, qu4.a);
        a26Var.d(za9Var2);
        za9Var.j.add(za9Var2.a());
    }

    public static iy8 J(JSONObject jSONObject) throws JSONException {
        Object objL;
        if (jSONObject == null) {
            db6.F("MixpanelAPI.JsonUtils", "Cannot parse null flag definition");
            throw new JSONException("Cannot parse null flag definition");
        }
        try {
            if (!jSONObject.has("variant_key") || jSONObject.isNull("variant_key")) {
                db6.h1("MixpanelAPI.JsonUtils", "Flag definition missing required 'variant_key' field");
                throw new JSONException("Flag variant missing required 'variant_key' field");
            }
            String string = jSONObject.getString("variant_key");
            Boolean boolValueOf = null;
            if (jSONObject.has("variant_value")) {
                objL = L(jSONObject.get("variant_value"));
            } else {
                db6.h1("MixpanelAPI.JsonUtils", "Flag definition missing 'variant_value'. Assuming null value.");
                objL = null;
            }
            String string2 = (!jSONObject.has("experiment_id") || jSONObject.isNull("experiment_id")) ? null : jSONObject.getString("experiment_id");
            Boolean boolValueOf2 = (!jSONObject.has("is_experiment_active") || jSONObject.isNull("is_experiment_active")) ? null : Boolean.valueOf(jSONObject.getBoolean("is_experiment_active"));
            if (jSONObject.has("is_qa_tester") && !jSONObject.isNull("is_qa_tester")) {
                boolValueOf = Boolean.valueOf(jSONObject.getBoolean("is_qa_tester"));
            }
            return new iy8(string, objL, string2, boolValueOf2, boolValueOf);
        } catch (JSONException e2) {
            db6.G("MixpanelAPI.JsonUtils", "Error parsing flag variant", e2);
            throw e2;
        }
    }

    public static HashMap K(JSONObject jSONObject) {
        HashMap map = new HashMap();
        try {
            if (!jSONObject.has("flags") || jSONObject.isNull("flags")) {
                db6.h1("MixpanelAPI.JsonUtils", "Flags response JSON does not contain 'flags' key or it's null.");
                return map;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("flags");
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    if (jSONObject2.isNull(next)) {
                        db6.h1("MixpanelAPI.JsonUtils", "Flag definition is null for key: " + next);
                    } else {
                        map.put(next, J(jSONObject2.getJSONObject(next)));
                    }
                } catch (JSONException e2) {
                    db6.G("MixpanelAPI.JsonUtils", "Error parsing individual flag definition for key: " + next, e2);
                }
            }
            return map;
        } catch (JSONException e3) {
            db6.G("MixpanelAPI.JsonUtils", "Error parsing outer 'flags' object in response", e3);
        }
    }

    public static Object L(Object obj) throws JSONException {
        if (obj == null || obj == JSONObject.NULL) {
            return null;
        }
        if ((obj instanceof Boolean) || (obj instanceof String) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Number)) {
            return obj;
        }
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, L(jSONObject.get(next)));
            }
            return map;
        }
        if (!(obj instanceof JSONArray)) {
            db6.h1("MixpanelAPI.JsonUtils", "Could not parse JSON value of type: ".concat(obj.getClass().getSimpleName()));
            throw new JSONException("Unsupported JSON type encountered: ".concat(obj.getClass().getSimpleName()));
        }
        JSONArray jSONArray = (JSONArray) obj;
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(L(jSONArray.get(i2)));
        }
        return arrayList;
    }

    public static final z88 M(int i2, int i3, l46 l46Var) {
        int i4 = 0;
        int i5 = 1;
        boolean z = (i3 & 4) != 0;
        Object systemService = ((Context) l46Var.k(uq.b)).getSystemService("accessibility");
        systemService.getClass();
        Object obj = (AccessibilityManager) systemService;
        boolean z2 = ((((i2 & 896) ^ 384) > 256 && l46Var.h(z)) || (i2 & 384) == 256) | ((((i2 & 14) ^ 6) > 4 && l46Var.h(true)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && l46Var.h(true)) || (i2 & 48) == 32);
        Object objR = l46Var.R();
        Object obj2 = sf2.a;
        if (z2 || objR == obj2) {
            objR = new z88(true, true, z);
            l46Var.p0(objR);
        }
        z88 z88Var = (z88) objR;
        x48 x48Var = (x48) l46Var.k(cb8.a);
        boolean zG = l46Var.g(z88Var) | l46Var.i(obj);
        Object objR2 = l46Var.R();
        if (zG || objR2 == obj2) {
            objR2 = new l0(i5, z88Var, obj);
            l46Var.p0(objR2);
        }
        a26 a26Var = (a26) objR2;
        boolean zG2 = l46Var.g(z88Var) | l46Var.i(obj);
        Object objR3 = l46Var.R();
        if (zG2 || objR3 == obj2) {
            objR3 = new v6(i4, z88Var, obj);
            l46Var.p0(objR3);
        }
        i(x48Var, a26Var, (x16) objR3, l46Var, 0);
        return z88Var;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00a5 A[PHI: r0
  0x00a5: PHI (r0v11 int) = (r0v5 int), (r0v6 int), (r0v7 int), (r0v8 int) binds: [B:54:0x00a3, B:57:0x00a8, B:60:0x00ac, B:63:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    public static final Object N(oo5 oo5Var, int i2, a26 a26Var) {
        int i3;
        int i4;
        Object objD;
        i09 i09VarM0;
        yy7 yy7VarP1;
        wo0 wo0Var;
        if (!oo5Var.a.Y) {
            i37.c("visitAncestors called on an unattached node");
        }
        i09 i09Var = oo5Var.a.e;
        LayoutNode layoutNodeS0 = vd0.s0(oo5Var);
        loop0: while (true) {
            i3 = 0;
            i4 = 1;
            objD = null;
            if (layoutNodeS0 == null) {
                i09VarM0 = null;
                break;
            }
            if ((((i09) layoutNodeS0.V0.g).d & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                while (i09Var != null) {
                    if ((i09Var.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                        i09VarM0 = i09Var;
                        p89 p89Var = null;
                        while (i09VarM0 != null) {
                            if (i09VarM0 instanceof oo5) {
                                break loop0;
                            }
                            if ((i09VarM0.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && (i09VarM0 instanceof sv3)) {
                                int i5 = 0;
                                for (i09 i09Var2 = ((sv3) i09VarM0).E0; i09Var2 != null; i09Var2 = i09Var2.f) {
                                    if ((i09Var2.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            i09VarM0 = i09Var2;
                                        } else {
                                            if (p89Var == null) {
                                                p89Var = new p89(0, new i09[16]);
                                            }
                                            if (i09VarM0 != null) {
                                                p89Var.b(i09VarM0);
                                                i09VarM0 = null;
                                            }
                                            p89Var.b(i09Var2);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            i09VarM0 = vd0.m0(p89Var);
                        }
                    }
                    i09Var = i09Var.e;
                }
            }
            layoutNodeS0 = layoutNodeS0.F();
            i09Var = (layoutNodeS0 == null || (wo0Var = layoutNodeS0.V0) == null) ? null : (zde) wo0Var.f;
        }
        oo5 oo5Var2 = (oo5) i09VarM0;
        if ((oo5Var2 == null || !pa7.t(oo5Var2.p1(), oo5Var.p1())) && (yy7VarP1 = oo5Var.p1()) != null) {
            int i6 = 5;
            if (i2 == 5) {
                i4 = i6;
            } else {
                i6 = 6;
                if (i2 == 6) {
                    i4 = i6;
                } else {
                    i6 = 3;
                    if (i2 == 3) {
                        i4 = i6;
                    } else {
                        i6 = 4;
                        if (i2 == 4) {
                            i4 = i6;
                        } else if (i2 == 1) {
                            i4 = 2;
                        } else if (i2 != 2) {
                            qc0.p("Unsupported direction for beyond bounds layout");
                        }
                    }
                }
            }
            if (yy7VarP1.Z.a() <= 0 || !yy7VarP1.Z.d() || !yy7VarP1.Y) {
                return a26Var.d(yy7.G0);
            }
            boolean zM1 = yy7VarP1.m1(i4);
            zy7 zy7Var = yy7VarP1.Z;
            int iB = zM1 ? zy7Var.b() : zy7Var.e();
            mmb mmbVar = new mmb();
            ssg ssgVar = yy7VarP1.E0;
            ssgVar.getClass();
            uy7 uy7Var = new uy7(iB, iB);
            ((p89) ssgVar.b).b(uy7Var);
            mmbVar.element = uy7Var;
            int iC = yy7VarP1.Z.c() * 2;
            int iA = yy7VarP1.Z.a();
            if (iC > iA) {
                iC = iA;
            }
            while (objD == null && yy7VarP1.l1((uy7) mmbVar.element, i4) && i3 < iC) {
                uy7 uy7Var2 = (uy7) mmbVar.element;
                int i7 = uy7Var2.a;
                int i8 = uy7Var2.b;
                if (yy7VarP1.m1(i4)) {
                    i8++;
                } else {
                    i7--;
                }
                ssg ssgVar2 = yy7VarP1.E0;
                ssgVar2.getClass();
                uy7 uy7Var3 = new uy7(i7, i8);
                ((p89) ssgVar2.b).b(uy7Var3);
                ((p89) yy7VarP1.E0.b).j((uy7) mmbVar.element);
                mmbVar.element = uy7Var3;
                i3++;
                vd0.s0(yy7VarP1).m();
                objD = a26Var.d(new xy7(yy7VarP1, mmbVar, i4));
            }
            ((p89) yy7VarP1.E0.b).j((uy7) mmbVar.element);
            vd0.s0(yy7VarP1).m();
            return objD;
        }
        return null;
    }

    public static grd O() {
        return new grd(0);
    }

    public static fxd P(float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 1500.0f;
        }
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return new fxd(f2, f3, obj);
    }

    public static final j09 Q(j09 j09Var, boolean z, t69 t69Var, c cVar, boolean z2, i5c i5cVar, a26 a26Var) {
        j09 j09VarD;
        if (cVar != null) {
            j09VarD = new vye(z, t69Var, cVar, false, z2, i5cVar, a26Var);
        } else if (cVar == null) {
            j09VarD = new vye(z, t69Var, null, false, z2, i5cVar, a26Var);
        } else {
            g09 g09Var = g09.a;
            j09VarD = t69Var != null ? o17.a(g09Var, t69Var, cVar).D(new vye(z, t69Var, null, false, z2, i5cVar, a26Var)) : m93.u(g09Var, new huc(cVar, z, z2, i5cVar, a26Var, 1));
        }
        return j09Var.D(j09VarD);
    }

    public static j09 R(j09 j09Var, boolean z, boolean z2, i5c i5cVar, a26 a26Var, int i2) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        return j09Var.D(new vye(z, null, null, true, z2, i5cVar, a26Var));
    }

    public static final j09 S(yye yyeVar, c cVar, boolean z, i5c i5cVar, x16 x16Var) {
        if (cVar != null) {
            return new l4f(yyeVar, null, cVar, z, i5cVar, x16Var);
        }
        if (cVar == null) {
            return new l4f(yyeVar, null, null, z, i5cVar, x16Var);
        }
        return m93.u(g09.a, new wye(cVar, yyeVar, z, i5cVar, x16Var));
    }

    public static x6f T(int i2, int i3, fs4 fs4Var, int i4) {
        if ((i4 & 1) != 0) {
            i2 = 300;
        }
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        if ((i4 & 4) != 0) {
            fs4Var = hs4.a;
        }
        return new x6f(i2, i3, fs4Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [xh6] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v7, types: [p01] */
    public static final void U(xh6 xh6Var, vv7 vv7Var) {
        ?? r4;
        Object dzbVar;
        boolean z = Build.VERSION.SDK_INT >= 31 && mp.b(vv7Var.a.b.p()).isHardwareAccelerated();
        boolean zC = zh6.c(xh6Var);
        if (zC && z) {
            p01 oqbVar = xh6Var.c1;
            if (!(oqbVar instanceof oqb)) {
                oqbVar = new oqb(xh6Var);
            }
            xh6Var.p1(oqbVar);
            return;
        }
        if (zC) {
            p01 p01Var = xh6Var.c1;
            if (!(p01Var instanceof zqb)) {
                Object obj = null;
                if (zqb.h) {
                    try {
                        r4 = p01Var;
                        dzbVar = new zqb(xh6Var);
                    } catch (Throwable th) {
                        dzbVar = new dzb(th);
                    }
                    if (ezb.a(dzbVar) != null) {
                        zqb.h = false;
                    }
                    obj = (zqb) (dzbVar instanceof dzb ? null : dzbVar);
                }
                r4 = p01Var;
                r4 = obj;
            }
            if (r4 != 0) {
                xh6Var.p1(r4);
                return;
            }
        }
        if (xh6Var.c1 instanceof ogc) {
            return;
        }
        xh6Var.p1(new ogc(xh6Var));
    }

    public static final List V(int i2, int i3, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return pu4.a;
        }
        ArrayList arrayList2 = new ArrayList(list);
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            vz7 vz7Var = (vz7) arrayList.get(i4);
            int index = vz7Var.getIndex();
            if (i2 <= index && index <= i3) {
                arrayList2.add(vz7Var);
            }
        }
        w72.f0(arrayList2, k);
        return arrayList2;
    }

    public static void W(String str, String str2) {
        if (F(5, str)) {
            b1.l(str, str2);
        }
    }

    public static void X(String str, String str2, Throwable th) {
        if (F(5, str)) {
            b1.n(str, str2, th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x008c  */
    /* JADX WARN: Code duplicated, block: B:46:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0099  */
    /* JADX WARN: Code duplicated, block: B:51:0x009c  */
    /* JADX WARN: Code duplicated, block: B:53:0x009f  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:61:0x0122  */
    /* JADX WARN: Code duplicated, block: B:62:0x0126  */
    /* JADX WARN: Code duplicated, block: B:65:0x016f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0173  */
    /* JADX WARN: Code duplicated, block: B:69:0x0184  */
    /* JADX WARN: Code duplicated, block: B:70:0x0192  */
    /* JADX WARN: Code duplicated, block: B:72:0x020c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0217  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    public static final void a(String str, j09 j09Var, boolean z, boolean z2, x16 x16Var, x16 x16Var2, l46 l46Var, int i2, int i3) {
        String str2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        boolean z4;
        String str3;
        boolean z5;
        ojb ojbVarV;
        String str4;
        boolean z6;
        String strQ;
        String strQ2;
        pr4 pr4Var;
        boolean z7;
        ov7 ov7Var;
        boolean z8;
        boolean z9;
        boolean z10;
        int i7;
        int i8;
        l46 l46Var2 = l46Var;
        x16Var2.getClass();
        l46Var2.h0(1057085526);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i2 | 6;
            str2 = str;
        } else {
            str2 = str;
            i4 = (l46Var2.g(str2) ? 4 : 2) | i2;
        }
        int i10 = i4 | 48 | (l46Var2.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        int i11 = i3 & 8;
        if (i11 == 0) {
            if ((i2 & 3072) == 0) {
                z3 = z;
                i10 |= l46Var2.h(z3) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            if ((i2 & 24576) == 0) {
                if (l46Var2.h(z2)) {
                    i8 = 16384;
                } else {
                    i8 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i10 |= i8;
            }
            if ((196608 & i2) == 0) {
                if (l46Var2.i(x16Var)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i10 |= i7;
            }
            if (l46Var2.i(x16Var2)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i6 = i10 | i5;
            if ((599187 & i6) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (l46Var2.W(i6 & 1, z4)) {
                if (i9 != 0) {
                    str4 = "";
                } else {
                    str4 = str2;
                }
                if (i11 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                l46Var2.f0(-2048049782);
                if (str4.length() == 0) {
                    strQ = afc.q(R.string.annual_continue, l46Var2);
                } else {
                    strQ = str4;
                }
                l46Var2.r(false);
                l46Var2.f0(-2048046915);
                strQ2 = afc.q(R.string.text_prev_step, l46Var2);
                l46Var2.r(false);
                y72 y72Var = new y72(y72.j);
                pr4Var = l8b.a;
                j09 j09VarZ = ynb.Z(tm7.n(j09Var, gec.N(0.0f, 14, t72.I(y72Var, new y72(((e8b) l46Var2.k(pr4Var)).b))), null, 6), 16.0f);
                xn8 xn8VarC = s21.c(ndb.b, false);
                int iHashCode = Long.hashCode(l46Var2.T);
                u8a u8aVarM = l46Var2.m();
                j09 j09VarJ = m93.J(l46Var2, j09VarZ);
                lf2.q.getClass();
                l46Var2.j0();
                z7 = l46Var2.S;
                ov7Var = LayoutNode.h1;
                if (z7) {
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
                String str5 = str4;
                j09 j09VarC = b.c(g09.a, 1.0f);
                t7c t7cVarA = s7c.a(xc0.g, ndb.z, l46Var2, 54);
                int iHashCode2 = Long.hashCode(l46Var2.T);
                u8a u8aVarM2 = l46Var2.m();
                j09 j09VarJ2 = m93.J(l46Var2, j09VarC);
                l46Var2.j0();
                z8 = z6;
                if (l46Var2.S) {
                    l46Var2.l(ov7Var);
                } else {
                    l46Var2.s0();
                }
                dec.l(he2Var, l46Var2, t7cVarA);
                dec.l(he2Var2, l46Var2, u8aVarM2);
                ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                dec.l(he2Var4, l46Var2, j09VarJ2);
                if (x16Var == null) {
                    l46Var2.f0(405189349);
                    l46Var2.r(false);
                    z10 = z8;
                    z9 = true;
                } else {
                    l46Var2.f0(405189350);
                    bx9 bx9Var = v51.a;
                    z9 = true;
                    cgg.m(x16Var, null, z8, null, v51.h(((e8b) l46Var2.k(pr4Var)).q, l46Var2), null, af1.b0(-138768, new ob0(strQ2, 5), l46Var2), l46Var2, ((i6 >> 15) & 14) | 805306368 | ((i6 >> 3) & 896), 490);
                    z10 = z8;
                    l46Var2.r(false);
                }
                o5c.f(l46Var2, new jw7(1.0f, z9));
                c8b.i(null, strQ, null, null, 0L, 0.0f, z2, null, null, false, null, null, x16Var2, l46Var2, (i6 << 6) & 3670016, (i6 >> 12) & 896, 4029);
                l46Var2 = l46Var2;
                l46Var2.r(z9);
                l46Var2.r(z9);
                z5 = z10;
                str3 = str5;
            } else {
                l46Var2.Z();
                str3 = str2;
                z5 = z3;
            }
            ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                ojbVarV.d = new pb0(str3, j09Var, z5, z2, x16Var, x16Var2, i2, i3);
            }
        }
        i10 |= 3072;
        z3 = z;
        if ((i2 & 24576) == 0) {
            if (l46Var2.h(z2)) {
                i8 = 16384;
            } else {
                i8 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i10 |= i8;
        }
        if ((196608 & i2) == 0) {
            if (l46Var2.i(x16Var)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i10 |= i7;
        }
        if (l46Var2.i(x16Var2)) {
            i5 = 1048576;
        } else {
            i5 = 524288;
        }
        i6 = i10 | i5;
        if ((599187 & i6) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (l46Var2.W(i6 & 1, z4)) {
            if (i9 != 0) {
                str4 = "";
            } else {
                str4 = str2;
            }
            if (i11 != 0) {
                z6 = true;
            } else {
                z6 = z3;
            }
            l46Var2.f0(-2048049782);
            if (str4.length() == 0) {
                strQ = afc.q(R.string.annual_continue, l46Var2);
            } else {
                strQ = str4;
            }
            l46Var2.r(false);
            l46Var2.f0(-2048046915);
            strQ2 = afc.q(R.string.text_prev_step, l46Var2);
            l46Var2.r(false);
            y72 y72Var2 = new y72(y72.j);
            pr4Var = l8b.a;
            j09 j09VarZ2 = ynb.Z(tm7.n(j09Var, gec.N(0.0f, 14, t72.I(y72Var2, new y72(((e8b) l46Var2.k(pr4Var)).b))), null, 6), 16.0f);
            xn8 xn8VarC2 = s21.c(ndb.b, false);
            int iHashCode3 = Long.hashCode(l46Var2.T);
            u8a u8aVarM3 = l46Var2.m();
            j09 j09VarJ3 = m93.J(l46Var2, j09VarZ2);
            lf2.q.getClass();
            l46Var2.j0();
            z7 = l46Var2.S;
            ov7Var = LayoutNode.h1;
            if (z7) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var5 = hj6.z;
            dec.l(he2Var5, l46Var2, xn8VarC2);
            he2 he2Var6 = hj6.y;
            dec.l(he2Var6, l46Var2, u8aVarM3);
            Integer numValueOf2 = Integer.valueOf(iHashCode3);
            he2 he2Var7 = hj6.X;
            dec.l(he2Var7, l46Var2, numValueOf2);
            dec.k(l46Var2);
            he2 he2Var8 = hj6.x;
            dec.l(he2Var8, l46Var2, j09VarJ3);
            String str6 = str4;
            j09 j09VarC2 = b.c(g09.a, 1.0f);
            t7c t7cVarA2 = s7c.a(xc0.g, ndb.z, l46Var2, 54);
            int iHashCode4 = Long.hashCode(l46Var2.T);
            u8a u8aVarM4 = l46Var2.m();
            j09 j09VarJ4 = m93.J(l46Var2, j09VarC2);
            l46Var2.j0();
            z8 = z6;
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var5, l46Var2, t7cVarA2);
            dec.l(he2Var6, l46Var2, u8aVarM4);
            ib8.s(iHashCode4, l46Var2, he2Var7, l46Var2);
            dec.l(he2Var8, l46Var2, j09VarJ4);
            if (x16Var == null) {
                l46Var2.f0(405189349);
                l46Var2.r(false);
                z10 = z8;
                z9 = true;
            } else {
                l46Var2.f0(405189350);
                bx9 bx9Var2 = v51.a;
                z9 = true;
                cgg.m(x16Var, null, z8, null, v51.h(((e8b) l46Var2.k(pr4Var)).q, l46Var2), null, af1.b0(-138768, new ob0(strQ2, 5), l46Var2), l46Var2, ((i6 >> 15) & 14) | 805306368 | ((i6 >> 3) & 896), 490);
                z10 = z8;
                l46Var2.r(false);
            }
            o5c.f(l46Var2, new jw7(1.0f, z9));
            c8b.i(null, strQ, null, null, 0L, 0.0f, z2, null, null, false, null, null, x16Var2, l46Var2, (i6 << 6) & 3670016, (i6 >> 12) & 896, 4029);
            l46Var2 = l46Var2;
            l46Var2.r(z9);
            l46Var2.r(z9);
            z5 = z10;
            str3 = str6;
        } else {
            l46Var2.Z();
            str3 = str2;
            z5 = z3;
        }
        ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new pb0(str3, j09Var, z5, z2, x16Var, x16Var2, i2, i3);
        }
    }

    public static final void b(int i2, l46 l46Var, j09 j09Var, String str) {
        String str2;
        j09 j09Var2;
        str.getClass();
        l46Var.h0(-303609254);
        int i3 = (l46Var.g(str) ? 4 : 2) | i2 | 48;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            mue mueVar = pue.a;
            mue mueVarM = pue.m(l46Var);
            j09Var2 = g09.a;
            str2 = str;
            nte.b(str2, j09Var2, ((e8b) l46Var.k(l8b.a)).q, 0L, null, cr5.c, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarM, l46Var, i3 & 126, 0, 130936);
        } else {
            str2 = str;
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new p8(str2, j09Var2, i2, 3);
        }
    }

    public static final void c(v08 v08Var, int i2, a26 a26Var, lm2 lm2Var, dd2 dd2Var, a26 a26Var2) {
        lm2Var.getClass();
        v08.Y(v08Var, i2, new hy0(a26Var, 2), new dd2(new o91(a26Var, lm2Var, a26Var2, dd2Var), true, -868131948), 4);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x010f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0112  */
    /* JADX WARN: Code duplicated, block: B:105:0x0146  */
    /* JADX WARN: Code duplicated, block: B:107:0x014c  */
    /* JADX WARN: Code duplicated, block: B:110:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:112:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:116:0x0203  */
    /* JADX WARN: Code duplicated, block: B:119:0x020b  */
    /* JADX WARN: Code duplicated, block: B:121:0x020f  */
    /* JADX WARN: Code duplicated, block: B:122:0x021e  */
    /* JADX WARN: Code duplicated, block: B:124:0x024e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0268  */
    /* JADX WARN: Code duplicated, block: B:129:0x0278  */
    /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:94:0x0100  */
    /* JADX WARN: Code duplicated, block: B:95:0x0103  */
    /* JADX WARN: Code duplicated, block: B:98:0x0108  */
    /* JADX WARN: Code duplicated, block: B:99:0x010b  */
    public static final void d(j09 j09Var, TarotCardChoice tarotCardChoice, boolean z, j09 j09Var2, a26 a26Var, float f2, mue mueVar, y72 y72Var, l46 l46Var, int i2, int i3) {
        int i4;
        int i5;
        j09 j09Var3;
        int i6;
        a26 a26Var2;
        int i7;
        float f3;
        int i8;
        int i9;
        mue mueVar2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z2;
        boolean z3;
        y72 y72Var2;
        j09 j09Var4;
        float f4;
        mue mueVar3;
        ojb ojbVarV;
        boolean z4;
        j09 j09Var5;
        float f5;
        mue mueVar4;
        y72 y72Var3;
        jx0 jx0Var;
        boolean z5;
        ov7 ov7Var;
        he2 he2Var;
        he2 he2Var2;
        he2 he2Var3;
        he2 he2Var4;
        int i15;
        float f6;
        boolean z6;
        y72 y72Var4;
        int i16;
        y72 y72Var5;
        mue mueVar5;
        boolean z7;
        String tarotCardDesc;
        String str;
        j09 j09Var6;
        int i17;
        TarotCardChoice tarotCardChoice2 = tarotCardChoice;
        j09Var.getClass();
        tarotCardChoice2.getClass();
        l46Var.h0(-1063529804);
        if ((i2 & 6) == 0) {
            i4 = (l46Var.g(j09Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= l46Var.g(tarotCardChoice2) ? 32 : 16;
        }
        int i18 = i3 & 4;
        if (i18 == 0) {
            if ((i2 & 384) == 0) {
                i4 |= l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 3072) == 0) {
                    j09Var3 = j09Var2;
                    if (l46Var.g(j09Var3)) {
                        i6 = 2048;
                    } else {
                        i6 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i4 |= i6;
                }
                if ((i2 & 24576) == 0) {
                    a26Var2 = a26Var;
                    if (l46Var.i(a26Var2)) {
                        i17 = 16384;
                    } else {
                        i17 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i4 |= i17;
                } else {
                    a26Var2 = a26Var;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    if ((196608 & i2) == 0) {
                        f3 = f2;
                        if (l46Var.d(f3)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i4 |= i8;
                    }
                    i9 = i3 & 64;
                    if (i9 != 0) {
                        if ((1572864 & i2) == 0) {
                            mueVar2 = mueVar;
                            if (l46Var.g(mueVar2)) {
                                i10 = 1048576;
                            } else {
                                i10 = 524288;
                            }
                            i4 |= i10;
                        }
                        i11 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                        if (i11 != 0) {
                            i4 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            if (l46Var.g(y72Var)) {
                                i12 = 8388608;
                            } else {
                                i12 = 4194304;
                            }
                            i4 |= i12;
                        }
                        i13 = i4;
                        i14 = 0;
                        if ((i13 & 4793491) != 4793490) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (l46Var.W(i13 & 1, z2)) {
                            if (i18 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            j09Var5 = g09.a;
                            if (i5 == 0) {
                                j09Var5 = j09Var3;
                            }
                            if (i7 != 0) {
                                f5 = 18.0f;
                            } else {
                                f5 = f3;
                            }
                            if (i9 != 0) {
                                mueVar4 = null;
                            } else {
                                mueVar4 = mueVar2;
                            }
                            if (i11 != 0) {
                                y72Var3 = null;
                            } else {
                                y72Var3 = y72Var;
                            }
                            jx0Var = ndb.Z;
                            c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(i14)), jx0Var, l46Var, 54);
                            int iHashCode = Long.hashCode(l46Var.T);
                            u8a u8aVarM = l46Var.m();
                            j09 j09VarJ = m93.J(l46Var, j09Var);
                            lf2.q.getClass();
                            l46Var.j0();
                            z5 = l46Var.S;
                            ov7Var = LayoutNode.h1;
                            if (z5) {
                                l46Var.l(ov7Var);
                            } else {
                                l46Var.s0();
                            }
                            he2Var = hj6.z;
                            dec.l(he2Var, l46Var, c92VarA);
                            he2Var2 = hj6.y;
                            dec.l(he2Var2, l46Var, u8aVarM);
                            Integer numValueOf = Integer.valueOf(iHashCode);
                            he2Var3 = hj6.X;
                            dec.l(he2Var3, l46Var, numValueOf);
                            dec.k(l46Var);
                            he2Var4 = hj6.x;
                            dec.l(he2Var4, l46Var, j09VarJ);
                            i15 = i13 >> 9;
                            f6 = f5;
                            z6 = z4;
                            y72Var4 = y72Var3;
                            i16 = 0;
                            o7c.d(j09Var5, q7c.r(tarotCardChoice2), null, false, an2.d, 8.0f, a26Var2, false, l46Var, (i15 & 14) | 221184 | ((i13 << 6) & 3670016), 140);
                            j09 j09Var7 = j09Var5;
                            if (z6) {
                                l46Var.f0(1011574536);
                                z7 = true;
                                c92 c92VarA2 = a92.a(new uc0(f6, true, new qc0(i16)), jx0Var, l46Var, 48);
                                int iHashCode2 = Long.hashCode(l46Var.T);
                                u8a u8aVarM2 = l46Var.m();
                                j09 j09VarJ2 = m93.J(l46Var, j09Var5);
                                l46Var.j0();
                                if (l46Var.S) {
                                    l46Var.l(ov7Var);
                                } else {
                                    l46Var.s0();
                                }
                                dec.l(he2Var, l46Var, c92VarA2);
                                dec.l(he2Var2, l46Var, u8aVarM2);
                                ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
                                dec.l(he2Var4, l46Var, j09VarJ2);
                                tarotCardDesc = tarotCardChoice.getTarotCardDesc();
                                if (tarotCardDesc != null || v4e.Q(tarotCardDesc)) {
                                    str = null;
                                } else {
                                    str = tarotCardDesc;
                                }
                                if (str == null) {
                                    l46Var.f0(1294992120);
                                    l46Var.r(false);
                                    y72Var5 = y72Var4;
                                    j09Var6 = j09Var5;
                                    mueVar5 = mueVar4;
                                } else {
                                    l46Var.f0(1294992121);
                                    y72Var5 = y72Var4;
                                    mueVar5 = mueVar4;
                                    cgg.b(j09Var5, str, true, mueVar5, y72Var5, l46Var, (i15 & 7168) | 390 | (i15 & 57344), 0);
                                    j09Var6 = j09Var5;
                                    l46Var.r(false);
                                }
                                tarotCardChoice2 = tarotCardChoice;
                                cgg.c(j09Var6, tarotCardChoice2, l46Var, (i13 & 112) | 6, 0);
                                l46Var.r(true);
                                l46Var.r(false);
                            } else {
                                tarotCardChoice2 = tarotCardChoice;
                                y72Var5 = y72Var4;
                                mueVar5 = mueVar4;
                                z7 = true;
                                l46Var.f0(1012099428);
                                l46Var.r(false);
                            }
                            l46Var.r(z7);
                            y72Var2 = y72Var5;
                            j09Var4 = j09Var7;
                            z3 = z6;
                            mueVar3 = mueVar5;
                            f4 = f6;
                        } else {
                            l46Var.Z();
                            z3 = z;
                            y72Var2 = y72Var;
                            j09Var4 = j09Var3;
                            f4 = f3;
                            mueVar3 = mueVar2;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new zs1(j09Var, tarotCardChoice2, z3, j09Var4, a26Var, f4, mueVar3, y72Var2, i2, i3);
                        }
                    }
                    i4 |= 1572864;
                    mueVar2 = mueVar;
                    i11 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    if (i11 != 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (l46Var.g(y72Var)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i4 |= i12;
                    }
                    i13 = i4;
                    i14 = 0;
                    if ((i13 & 4793491) != 4793490) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (l46Var.W(i13 & 1, z2)) {
                        if (i18 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        j09Var5 = g09.a;
                        if (i5 == 0) {
                            j09Var5 = j09Var3;
                        }
                        if (i7 != 0) {
                            f5 = 18.0f;
                        } else {
                            f5 = f3;
                        }
                        if (i9 != 0) {
                            mueVar4 = null;
                        } else {
                            mueVar4 = mueVar2;
                        }
                        if (i11 != 0) {
                            y72Var3 = null;
                        } else {
                            y72Var3 = y72Var;
                        }
                        jx0Var = ndb.Z;
                        c92 c92VarA3 = a92.a(new uc0(8.0f, true, new qc0(i14)), jx0Var, l46Var, 54);
                        int iHashCode3 = Long.hashCode(l46Var.T);
                        u8a u8aVarM3 = l46Var.m();
                        j09 j09VarJ3 = m93.J(l46Var, j09Var);
                        lf2.q.getClass();
                        l46Var.j0();
                        z5 = l46Var.S;
                        ov7Var = LayoutNode.h1;
                        if (z5) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        he2Var = hj6.z;
                        dec.l(he2Var, l46Var, c92VarA3);
                        he2Var2 = hj6.y;
                        dec.l(he2Var2, l46Var, u8aVarM3);
                        Integer numValueOf2 = Integer.valueOf(iHashCode3);
                        he2Var3 = hj6.X;
                        dec.l(he2Var3, l46Var, numValueOf2);
                        dec.k(l46Var);
                        he2Var4 = hj6.x;
                        dec.l(he2Var4, l46Var, j09VarJ3);
                        i15 = i13 >> 9;
                        f6 = f5;
                        z6 = z4;
                        y72Var4 = y72Var3;
                        i16 = 0;
                        o7c.d(j09Var5, q7c.r(tarotCardChoice2), null, false, an2.d, 8.0f, a26Var2, false, l46Var, (i15 & 14) | 221184 | ((i13 << 6) & 3670016), 140);
                        j09 j09Var8 = j09Var5;
                        if (z6) {
                            l46Var.f0(1011574536);
                            z7 = true;
                            c92 c92VarA4 = a92.a(new uc0(f6, true, new qc0(i16)), jx0Var, l46Var, 48);
                            int iHashCode4 = Long.hashCode(l46Var.T);
                            u8a u8aVarM4 = l46Var.m();
                            j09 j09VarJ4 = m93.J(l46Var, j09Var5);
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(ov7Var);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(he2Var, l46Var, c92VarA4);
                            dec.l(he2Var2, l46Var, u8aVarM4);
                            ib8.s(iHashCode4, l46Var, he2Var3, l46Var);
                            dec.l(he2Var4, l46Var, j09VarJ4);
                            tarotCardDesc = tarotCardChoice.getTarotCardDesc();
                            if (tarotCardDesc != null) {
                                str = null;
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                l46Var.f0(1294992120);
                                l46Var.r(false);
                                y72Var5 = y72Var4;
                                j09Var6 = j09Var5;
                                mueVar5 = mueVar4;
                            } else {
                                l46Var.f0(1294992121);
                                y72Var5 = y72Var4;
                                mueVar5 = mueVar4;
                                cgg.b(j09Var5, str, true, mueVar5, y72Var5, l46Var, (i15 & 7168) | 390 | (i15 & 57344), 0);
                                j09Var6 = j09Var5;
                                l46Var.r(false);
                            }
                            tarotCardChoice2 = tarotCardChoice;
                            cgg.c(j09Var6, tarotCardChoice2, l46Var, (i13 & 112) | 6, 0);
                            l46Var.r(true);
                            l46Var.r(false);
                        } else {
                            tarotCardChoice2 = tarotCardChoice;
                            y72Var5 = y72Var4;
                            mueVar5 = mueVar4;
                            z7 = true;
                            l46Var.f0(1012099428);
                            l46Var.r(false);
                        }
                        l46Var.r(z7);
                        y72Var2 = y72Var5;
                        j09Var4 = j09Var8;
                        z3 = z6;
                        mueVar3 = mueVar5;
                        f4 = f6;
                    } else {
                        l46Var.Z();
                        z3 = z;
                        y72Var2 = y72Var;
                        j09Var4 = j09Var3;
                        f4 = f3;
                        mueVar3 = mueVar2;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new zs1(j09Var, tarotCardChoice2, z3, j09Var4, a26Var, f4, mueVar3, y72Var2, i2, i3);
                    }
                }
                i4 |= 196608;
                f3 = f2;
                i9 = i3 & 64;
                if (i9 != 0) {
                    if ((1572864 & i2) == 0) {
                        mueVar2 = mueVar;
                        if (l46Var.g(mueVar2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i4 |= i10;
                    }
                    i11 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    if (i11 != 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (l46Var.g(y72Var)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i4 |= i12;
                    }
                    i13 = i4;
                    i14 = 0;
                    if ((i13 & 4793491) != 4793490) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (l46Var.W(i13 & 1, z2)) {
                        if (i18 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        j09Var5 = g09.a;
                        if (i5 == 0) {
                            j09Var5 = j09Var3;
                        }
                        if (i7 != 0) {
                            f5 = 18.0f;
                        } else {
                            f5 = f3;
                        }
                        if (i9 != 0) {
                            mueVar4 = null;
                        } else {
                            mueVar4 = mueVar2;
                        }
                        if (i11 != 0) {
                            y72Var3 = null;
                        } else {
                            y72Var3 = y72Var;
                        }
                        jx0Var = ndb.Z;
                        c92 c92VarA5 = a92.a(new uc0(8.0f, true, new qc0(i14)), jx0Var, l46Var, 54);
                        int iHashCode5 = Long.hashCode(l46Var.T);
                        u8a u8aVarM5 = l46Var.m();
                        j09 j09VarJ5 = m93.J(l46Var, j09Var);
                        lf2.q.getClass();
                        l46Var.j0();
                        z5 = l46Var.S;
                        ov7Var = LayoutNode.h1;
                        if (z5) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        he2Var = hj6.z;
                        dec.l(he2Var, l46Var, c92VarA5);
                        he2Var2 = hj6.y;
                        dec.l(he2Var2, l46Var, u8aVarM5);
                        Integer numValueOf3 = Integer.valueOf(iHashCode5);
                        he2Var3 = hj6.X;
                        dec.l(he2Var3, l46Var, numValueOf3);
                        dec.k(l46Var);
                        he2Var4 = hj6.x;
                        dec.l(he2Var4, l46Var, j09VarJ5);
                        i15 = i13 >> 9;
                        f6 = f5;
                        z6 = z4;
                        y72Var4 = y72Var3;
                        i16 = 0;
                        o7c.d(j09Var5, q7c.r(tarotCardChoice2), null, false, an2.d, 8.0f, a26Var2, false, l46Var, (i15 & 14) | 221184 | ((i13 << 6) & 3670016), 140);
                        j09 j09Var9 = j09Var5;
                        if (z6) {
                            l46Var.f0(1011574536);
                            z7 = true;
                            c92 c92VarA6 = a92.a(new uc0(f6, true, new qc0(i16)), jx0Var, l46Var, 48);
                            int iHashCode6 = Long.hashCode(l46Var.T);
                            u8a u8aVarM6 = l46Var.m();
                            j09 j09VarJ6 = m93.J(l46Var, j09Var5);
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(ov7Var);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(he2Var, l46Var, c92VarA6);
                            dec.l(he2Var2, l46Var, u8aVarM6);
                            ib8.s(iHashCode6, l46Var, he2Var3, l46Var);
                            dec.l(he2Var4, l46Var, j09VarJ6);
                            tarotCardDesc = tarotCardChoice.getTarotCardDesc();
                            if (tarotCardDesc != null) {
                                str = null;
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                l46Var.f0(1294992120);
                                l46Var.r(false);
                                y72Var5 = y72Var4;
                                j09Var6 = j09Var5;
                                mueVar5 = mueVar4;
                            } else {
                                l46Var.f0(1294992121);
                                y72Var5 = y72Var4;
                                mueVar5 = mueVar4;
                                cgg.b(j09Var5, str, true, mueVar5, y72Var5, l46Var, (i15 & 7168) | 390 | (i15 & 57344), 0);
                                j09Var6 = j09Var5;
                                l46Var.r(false);
                            }
                            tarotCardChoice2 = tarotCardChoice;
                            cgg.c(j09Var6, tarotCardChoice2, l46Var, (i13 & 112) | 6, 0);
                            l46Var.r(true);
                            l46Var.r(false);
                        } else {
                            tarotCardChoice2 = tarotCardChoice;
                            y72Var5 = y72Var4;
                            mueVar5 = mueVar4;
                            z7 = true;
                            l46Var.f0(1012099428);
                            l46Var.r(false);
                        }
                        l46Var.r(z7);
                        y72Var2 = y72Var5;
                        j09Var4 = j09Var9;
                        z3 = z6;
                        mueVar3 = mueVar5;
                        f4 = f6;
                    } else {
                        l46Var.Z();
                        z3 = z;
                        y72Var2 = y72Var;
                        j09Var4 = j09Var3;
                        f4 = f3;
                        mueVar3 = mueVar2;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new zs1(j09Var, tarotCardChoice2, z3, j09Var4, a26Var, f4, mueVar3, y72Var2, i2, i3);
                    }
                }
                i4 |= 1572864;
                mueVar2 = mueVar;
                i11 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                if (i11 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (l46Var.g(y72Var)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i4 |= i12;
                }
                i13 = i4;
                i14 = 0;
                if ((i13 & 4793491) != 4793490) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (l46Var.W(i13 & 1, z2)) {
                    if (i18 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    j09Var5 = g09.a;
                    if (i5 == 0) {
                        j09Var5 = j09Var3;
                    }
                    if (i7 != 0) {
                        f5 = 18.0f;
                    } else {
                        f5 = f3;
                    }
                    if (i9 != 0) {
                        mueVar4 = null;
                    } else {
                        mueVar4 = mueVar2;
                    }
                    if (i11 != 0) {
                        y72Var3 = null;
                    } else {
                        y72Var3 = y72Var;
                    }
                    jx0Var = ndb.Z;
                    c92 c92VarA7 = a92.a(new uc0(8.0f, true, new qc0(i14)), jx0Var, l46Var, 54);
                    int iHashCode7 = Long.hashCode(l46Var.T);
                    u8a u8aVarM7 = l46Var.m();
                    j09 j09VarJ7 = m93.J(l46Var, j09Var);
                    lf2.q.getClass();
                    l46Var.j0();
                    z5 = l46Var.S;
                    ov7Var = LayoutNode.h1;
                    if (z5) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    he2Var = hj6.z;
                    dec.l(he2Var, l46Var, c92VarA7);
                    he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var, u8aVarM7);
                    Integer numValueOf4 = Integer.valueOf(iHashCode7);
                    he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var, numValueOf4);
                    dec.k(l46Var);
                    he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var, j09VarJ7);
                    i15 = i13 >> 9;
                    f6 = f5;
                    z6 = z4;
                    y72Var4 = y72Var3;
                    i16 = 0;
                    o7c.d(j09Var5, q7c.r(tarotCardChoice2), null, false, an2.d, 8.0f, a26Var2, false, l46Var, (i15 & 14) | 221184 | ((i13 << 6) & 3670016), 140);
                    j09 j09Var10 = j09Var5;
                    if (z6) {
                        l46Var.f0(1011574536);
                        z7 = true;
                        c92 c92VarA8 = a92.a(new uc0(f6, true, new qc0(i16)), jx0Var, l46Var, 48);
                        int iHashCode8 = Long.hashCode(l46Var.T);
                        u8a u8aVarM8 = l46Var.m();
                        j09 j09VarJ8 = m93.J(l46Var, j09Var5);
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(he2Var, l46Var, c92VarA8);
                        dec.l(he2Var2, l46Var, u8aVarM8);
                        ib8.s(iHashCode8, l46Var, he2Var3, l46Var);
                        dec.l(he2Var4, l46Var, j09VarJ8);
                        tarotCardDesc = tarotCardChoice.getTarotCardDesc();
                        if (tarotCardDesc != null) {
                            str = null;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            l46Var.f0(1294992120);
                            l46Var.r(false);
                            y72Var5 = y72Var4;
                            j09Var6 = j09Var5;
                            mueVar5 = mueVar4;
                        } else {
                            l46Var.f0(1294992121);
                            y72Var5 = y72Var4;
                            mueVar5 = mueVar4;
                            cgg.b(j09Var5, str, true, mueVar5, y72Var5, l46Var, (i15 & 7168) | 390 | (i15 & 57344), 0);
                            j09Var6 = j09Var5;
                            l46Var.r(false);
                        }
                        tarotCardChoice2 = tarotCardChoice;
                        cgg.c(j09Var6, tarotCardChoice2, l46Var, (i13 & 112) | 6, 0);
                        l46Var.r(true);
                        l46Var.r(false);
                    } else {
                        tarotCardChoice2 = tarotCardChoice;
                        y72Var5 = y72Var4;
                        mueVar5 = mueVar4;
                        z7 = true;
                        l46Var.f0(1012099428);
                        l46Var.r(false);
                    }
                    l46Var.r(z7);
                    y72Var2 = y72Var5;
                    j09Var4 = j09Var10;
                    z3 = z6;
                    mueVar3 = mueVar5;
                    f4 = f6;
                } else {
                    l46Var.Z();
                    z3 = z;
                    y72Var2 = y72Var;
                    j09Var4 = j09Var3;
                    f4 = f3;
                    mueVar3 = mueVar2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new zs1(j09Var, tarotCardChoice2, z3, j09Var4, a26Var, f4, mueVar3, y72Var2, i2, i3);
                }
            }
            i4 |= 3072;
            j09Var3 = j09Var2;
            if ((i2 & 24576) == 0) {
                a26Var2 = a26Var;
                if (l46Var.i(a26Var2)) {
                    i17 = 16384;
                } else {
                    i17 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i4 |= i17;
            } else {
                a26Var2 = a26Var;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                if ((196608 & i2) == 0) {
                    f3 = f2;
                    if (l46Var.d(f3)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                    if ((1572864 & i2) == 0) {
                        mueVar2 = mueVar;
                        if (l46Var.g(mueVar2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i4 |= i10;
                    }
                    i11 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    if (i11 != 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (l46Var.g(y72Var)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i4 |= i12;
                    }
                    i13 = i4;
                    i14 = 0;
                    if ((i13 & 4793491) != 4793490) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (l46Var.W(i13 & 1, z2)) {
                        if (i18 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        j09Var5 = g09.a;
                        if (i5 == 0) {
                            j09Var5 = j09Var3;
                        }
                        if (i7 != 0) {
                            f5 = 18.0f;
                        } else {
                            f5 = f3;
                        }
                        if (i9 != 0) {
                            mueVar4 = null;
                        } else {
                            mueVar4 = mueVar2;
                        }
                        if (i11 != 0) {
                            y72Var3 = null;
                        } else {
                            y72Var3 = y72Var;
                        }
                        jx0Var = ndb.Z;
                        c92 c92VarA9 = a92.a(new uc0(8.0f, true, new qc0(i14)), jx0Var, l46Var, 54);
                        int iHashCode9 = Long.hashCode(l46Var.T);
                        u8a u8aVarM9 = l46Var.m();
                        j09 j09VarJ9 = m93.J(l46Var, j09Var);
                        lf2.q.getClass();
                        l46Var.j0();
                        z5 = l46Var.S;
                        ov7Var = LayoutNode.h1;
                        if (z5) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        he2Var = hj6.z;
                        dec.l(he2Var, l46Var, c92VarA9);
                        he2Var2 = hj6.y;
                        dec.l(he2Var2, l46Var, u8aVarM9);
                        Integer numValueOf5 = Integer.valueOf(iHashCode9);
                        he2Var3 = hj6.X;
                        dec.l(he2Var3, l46Var, numValueOf5);
                        dec.k(l46Var);
                        he2Var4 = hj6.x;
                        dec.l(he2Var4, l46Var, j09VarJ9);
                        i15 = i13 >> 9;
                        f6 = f5;
                        z6 = z4;
                        y72Var4 = y72Var3;
                        i16 = 0;
                        o7c.d(j09Var5, q7c.r(tarotCardChoice2), null, false, an2.d, 8.0f, a26Var2, false, l46Var, (i15 & 14) | 221184 | ((i13 << 6) & 3670016), 140);
                        j09 j09Var11 = j09Var5;
                        if (z6) {
                            l46Var.f0(1011574536);
                            z7 = true;
                            c92 c92VarA10 = a92.a(new uc0(f6, true, new qc0(i16)), jx0Var, l46Var, 48);
                            int iHashCode10 = Long.hashCode(l46Var.T);
                            u8a u8aVarM10 = l46Var.m();
                            j09 j09VarJ10 = m93.J(l46Var, j09Var5);
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(ov7Var);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(he2Var, l46Var, c92VarA10);
                            dec.l(he2Var2, l46Var, u8aVarM10);
                            ib8.s(iHashCode10, l46Var, he2Var3, l46Var);
                            dec.l(he2Var4, l46Var, j09VarJ10);
                            tarotCardDesc = tarotCardChoice.getTarotCardDesc();
                            if (tarotCardDesc != null) {
                                str = null;
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                l46Var.f0(1294992120);
                                l46Var.r(false);
                                y72Var5 = y72Var4;
                                j09Var6 = j09Var5;
                                mueVar5 = mueVar4;
                            } else {
                                l46Var.f0(1294992121);
                                y72Var5 = y72Var4;
                                mueVar5 = mueVar4;
                                cgg.b(j09Var5, str, true, mueVar5, y72Var5, l46Var, (i15 & 7168) | 390 | (i15 & 57344), 0);
                                j09Var6 = j09Var5;
                                l46Var.r(false);
                            }
                            tarotCardChoice2 = tarotCardChoice;
                            cgg.c(j09Var6, tarotCardChoice2, l46Var, (i13 & 112) | 6, 0);
                            l46Var.r(true);
                            l46Var.r(false);
                        } else {
                            tarotCardChoice2 = tarotCardChoice;
                            y72Var5 = y72Var4;
                            mueVar5 = mueVar4;
                            z7 = true;
                            l46Var.f0(1012099428);
                            l46Var.r(false);
                        }
                        l46Var.r(z7);
                        y72Var2 = y72Var5;
                        j09Var4 = j09Var11;
                        z3 = z6;
                        mueVar3 = mueVar5;
                        f4 = f6;
                    } else {
                        l46Var.Z();
                        z3 = z;
                        y72Var2 = y72Var;
                        j09Var4 = j09Var3;
                        f4 = f3;
                        mueVar3 = mueVar2;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new zs1(j09Var, tarotCardChoice2, z3, j09Var4, a26Var, f4, mueVar3, y72Var2, i2, i3);
                    }
                }
                i4 |= 1572864;
                mueVar2 = mueVar;
                i11 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                if (i11 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (l46Var.g(y72Var)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i4 |= i12;
                }
                i13 = i4;
                i14 = 0;
                if ((i13 & 4793491) != 4793490) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (l46Var.W(i13 & 1, z2)) {
                    if (i18 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    j09Var5 = g09.a;
                    if (i5 == 0) {
                        j09Var5 = j09Var3;
                    }
                    if (i7 != 0) {
                        f5 = 18.0f;
                    } else {
                        f5 = f3;
                    }
                    if (i9 != 0) {
                        mueVar4 = null;
                    } else {
                        mueVar4 = mueVar2;
                    }
                    if (i11 != 0) {
                        y72Var3 = null;
                    } else {
                        y72Var3 = y72Var;
                    }
                    jx0Var = ndb.Z;
                    c92 c92VarA11 = a92.a(new uc0(8.0f, true, new qc0(i14)), jx0Var, l46Var, 54);
                    int iHashCode11 = Long.hashCode(l46Var.T);
                    u8a u8aVarM11 = l46Var.m();
                    j09 j09VarJ11 = m93.J(l46Var, j09Var);
                    lf2.q.getClass();
                    l46Var.j0();
                    z5 = l46Var.S;
                    ov7Var = LayoutNode.h1;
                    if (z5) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    he2Var = hj6.z;
                    dec.l(he2Var, l46Var, c92VarA11);
                    he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var, u8aVarM11);
                    Integer numValueOf6 = Integer.valueOf(iHashCode11);
                    he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var, numValueOf6);
                    dec.k(l46Var);
                    he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var, j09VarJ11);
                    i15 = i13 >> 9;
                    f6 = f5;
                    z6 = z4;
                    y72Var4 = y72Var3;
                    i16 = 0;
                    o7c.d(j09Var5, q7c.r(tarotCardChoice2), null, false, an2.d, 8.0f, a26Var2, false, l46Var, (i15 & 14) | 221184 | ((i13 << 6) & 3670016), 140);
                    j09 j09Var12 = j09Var5;
                    if (z6) {
                        l46Var.f0(1011574536);
                        z7 = true;
                        c92 c92VarA12 = a92.a(new uc0(f6, true, new qc0(i16)), jx0Var, l46Var, 48);
                        int iHashCode12 = Long.hashCode(l46Var.T);
                        u8a u8aVarM12 = l46Var.m();
                        j09 j09VarJ12 = m93.J(l46Var, j09Var5);
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(he2Var, l46Var, c92VarA12);
                        dec.l(he2Var2, l46Var, u8aVarM12);
                        ib8.s(iHashCode12, l46Var, he2Var3, l46Var);
                        dec.l(he2Var4, l46Var, j09VarJ12);
                        tarotCardDesc = tarotCardChoice.getTarotCardDesc();
                        if (tarotCardDesc != null) {
                            str = null;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            l46Var.f0(1294992120);
                            l46Var.r(false);
                            y72Var5 = y72Var4;
                            j09Var6 = j09Var5;
                            mueVar5 = mueVar4;
                        } else {
                            l46Var.f0(1294992121);
                            y72Var5 = y72Var4;
                            mueVar5 = mueVar4;
                            cgg.b(j09Var5, str, true, mueVar5, y72Var5, l46Var, (i15 & 7168) | 390 | (i15 & 57344), 0);
                            j09Var6 = j09Var5;
                            l46Var.r(false);
                        }
                        tarotCardChoice2 = tarotCardChoice;
                        cgg.c(j09Var6, tarotCardChoice2, l46Var, (i13 & 112) | 6, 0);
                        l46Var.r(true);
                        l46Var.r(false);
                    } else {
                        tarotCardChoice2 = tarotCardChoice;
                        y72Var5 = y72Var4;
                        mueVar5 = mueVar4;
                        z7 = true;
                        l46Var.f0(1012099428);
                        l46Var.r(false);
                    }
                    l46Var.r(z7);
                    y72Var2 = y72Var5;
                    j09Var4 = j09Var12;
                    z3 = z6;
                    mueVar3 = mueVar5;
                    f4 = f6;
                } else {
                    l46Var.Z();
                    z3 = z;
                    y72Var2 = y72Var;
                    j09Var4 = j09Var3;
                    f4 = f3;
                    mueVar3 = mueVar2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new zs1(j09Var, tarotCardChoice2, z3, j09Var4, a26Var, f4, mueVar3, y72Var2, i2, i3);
                }
            }
            i4 |= 196608;
            f3 = f2;
            i9 = i3 & 64;
            if (i9 != 0) {
                if ((1572864 & i2) == 0) {
                    mueVar2 = mueVar;
                    if (l46Var.g(mueVar2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i4 |= i10;
                }
                i11 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                if (i11 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (l46Var.g(y72Var)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i4 |= i12;
                }
                i13 = i4;
                i14 = 0;
                if ((i13 & 4793491) != 4793490) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (l46Var.W(i13 & 1, z2)) {
                    if (i18 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    j09Var5 = g09.a;
                    if (i5 == 0) {
                        j09Var5 = j09Var3;
                    }
                    if (i7 != 0) {
                        f5 = 18.0f;
                    } else {
                        f5 = f3;
                    }
                    if (i9 != 0) {
                        mueVar4 = null;
                    } else {
                        mueVar4 = mueVar2;
                    }
                    if (i11 != 0) {
                        y72Var3 = null;
                    } else {
                        y72Var3 = y72Var;
                    }
                    jx0Var = ndb.Z;
                    c92 c92VarA13 = a92.a(new uc0(8.0f, true, new qc0(i14)), jx0Var, l46Var, 54);
                    int iHashCode13 = Long.hashCode(l46Var.T);
                    u8a u8aVarM13 = l46Var.m();
                    j09 j09VarJ13 = m93.J(l46Var, j09Var);
                    lf2.q.getClass();
                    l46Var.j0();
                    z5 = l46Var.S;
                    ov7Var = LayoutNode.h1;
                    if (z5) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    he2Var = hj6.z;
                    dec.l(he2Var, l46Var, c92VarA13);
                    he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var, u8aVarM13);
                    Integer numValueOf7 = Integer.valueOf(iHashCode13);
                    he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var, numValueOf7);
                    dec.k(l46Var);
                    he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var, j09VarJ13);
                    i15 = i13 >> 9;
                    f6 = f5;
                    z6 = z4;
                    y72Var4 = y72Var3;
                    i16 = 0;
                    o7c.d(j09Var5, q7c.r(tarotCardChoice2), null, false, an2.d, 8.0f, a26Var2, false, l46Var, (i15 & 14) | 221184 | ((i13 << 6) & 3670016), 140);
                    j09 j09Var13 = j09Var5;
                    if (z6) {
                        l46Var.f0(1011574536);
                        z7 = true;
                        c92 c92VarA14 = a92.a(new uc0(f6, true, new qc0(i16)), jx0Var, l46Var, 48);
                        int iHashCode14 = Long.hashCode(l46Var.T);
                        u8a u8aVarM14 = l46Var.m();
                        j09 j09VarJ14 = m93.J(l46Var, j09Var5);
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(he2Var, l46Var, c92VarA14);
                        dec.l(he2Var2, l46Var, u8aVarM14);
                        ib8.s(iHashCode14, l46Var, he2Var3, l46Var);
                        dec.l(he2Var4, l46Var, j09VarJ14);
                        tarotCardDesc = tarotCardChoice.getTarotCardDesc();
                        if (tarotCardDesc != null) {
                            str = null;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            l46Var.f0(1294992120);
                            l46Var.r(false);
                            y72Var5 = y72Var4;
                            j09Var6 = j09Var5;
                            mueVar5 = mueVar4;
                        } else {
                            l46Var.f0(1294992121);
                            y72Var5 = y72Var4;
                            mueVar5 = mueVar4;
                            cgg.b(j09Var5, str, true, mueVar5, y72Var5, l46Var, (i15 & 7168) | 390 | (i15 & 57344), 0);
                            j09Var6 = j09Var5;
                            l46Var.r(false);
                        }
                        tarotCardChoice2 = tarotCardChoice;
                        cgg.c(j09Var6, tarotCardChoice2, l46Var, (i13 & 112) | 6, 0);
                        l46Var.r(true);
                        l46Var.r(false);
                    } else {
                        tarotCardChoice2 = tarotCardChoice;
                        y72Var5 = y72Var4;
                        mueVar5 = mueVar4;
                        z7 = true;
                        l46Var.f0(1012099428);
                        l46Var.r(false);
                    }
                    l46Var.r(z7);
                    y72Var2 = y72Var5;
                    j09Var4 = j09Var13;
                    z3 = z6;
                    mueVar3 = mueVar5;
                    f4 = f6;
                } else {
                    l46Var.Z();
                    z3 = z;
                    y72Var2 = y72Var;
                    j09Var4 = j09Var3;
                    f4 = f3;
                    mueVar3 = mueVar2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new zs1(j09Var, tarotCardChoice2, z3, j09Var4, a26Var, f4, mueVar3, y72Var2, i2, i3);
                }
            }
            i4 |= 1572864;
            mueVar2 = mueVar;
            i11 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (i11 != 0) {
                i4 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (l46Var.g(y72Var)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i4 |= i12;
            }
            i13 = i4;
            i14 = 0;
            if ((i13 & 4793491) != 4793490) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (l46Var.W(i13 & 1, z2)) {
                if (i18 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                j09Var5 = g09.a;
                if (i5 == 0) {
                    j09Var5 = j09Var3;
                }
                if (i7 != 0) {
                    f5 = 18.0f;
                } else {
                    f5 = f3;
                }
                if (i9 != 0) {
                    mueVar4 = null;
                } else {
                    mueVar4 = mueVar2;
                }
                if (i11 != 0) {
                    y72Var3 = null;
                } else {
                    y72Var3 = y72Var;
                }
                jx0Var = ndb.Z;
                c92 c92VarA15 = a92.a(new uc0(8.0f, true, new qc0(i14)), jx0Var, l46Var, 54);
                int iHashCode15 = Long.hashCode(l46Var.T);
                u8a u8aVarM15 = l46Var.m();
                j09 j09VarJ15 = m93.J(l46Var, j09Var);
                lf2.q.getClass();
                l46Var.j0();
                z5 = l46Var.S;
                ov7Var = LayoutNode.h1;
                if (z5) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                he2Var = hj6.z;
                dec.l(he2Var, l46Var, c92VarA15);
                he2Var2 = hj6.y;
                dec.l(he2Var2, l46Var, u8aVarM15);
                Integer numValueOf8 = Integer.valueOf(iHashCode15);
                he2Var3 = hj6.X;
                dec.l(he2Var3, l46Var, numValueOf8);
                dec.k(l46Var);
                he2Var4 = hj6.x;
                dec.l(he2Var4, l46Var, j09VarJ15);
                i15 = i13 >> 9;
                f6 = f5;
                z6 = z4;
                y72Var4 = y72Var3;
                i16 = 0;
                o7c.d(j09Var5, q7c.r(tarotCardChoice2), null, false, an2.d, 8.0f, a26Var2, false, l46Var, (i15 & 14) | 221184 | ((i13 << 6) & 3670016), 140);
                j09 j09Var14 = j09Var5;
                if (z6) {
                    l46Var.f0(1011574536);
                    z7 = true;
                    c92 c92VarA16 = a92.a(new uc0(f6, true, new qc0(i16)), jx0Var, l46Var, 48);
                    int iHashCode16 = Long.hashCode(l46Var.T);
                    u8a u8aVarM16 = l46Var.m();
                    j09 j09VarJ16 = m93.J(l46Var, j09Var5);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var, l46Var, c92VarA16);
                    dec.l(he2Var2, l46Var, u8aVarM16);
                    ib8.s(iHashCode16, l46Var, he2Var3, l46Var);
                    dec.l(he2Var4, l46Var, j09VarJ16);
                    tarotCardDesc = tarotCardChoice.getTarotCardDesc();
                    if (tarotCardDesc != null) {
                        str = null;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        l46Var.f0(1294992120);
                        l46Var.r(false);
                        y72Var5 = y72Var4;
                        j09Var6 = j09Var5;
                        mueVar5 = mueVar4;
                    } else {
                        l46Var.f0(1294992121);
                        y72Var5 = y72Var4;
                        mueVar5 = mueVar4;
                        cgg.b(j09Var5, str, true, mueVar5, y72Var5, l46Var, (i15 & 7168) | 390 | (i15 & 57344), 0);
                        j09Var6 = j09Var5;
                        l46Var.r(false);
                    }
                    tarotCardChoice2 = tarotCardChoice;
                    cgg.c(j09Var6, tarotCardChoice2, l46Var, (i13 & 112) | 6, 0);
                    l46Var.r(true);
                    l46Var.r(false);
                } else {
                    tarotCardChoice2 = tarotCardChoice;
                    y72Var5 = y72Var4;
                    mueVar5 = mueVar4;
                    z7 = true;
                    l46Var.f0(1012099428);
                    l46Var.r(false);
                }
                l46Var.r(z7);
                y72Var2 = y72Var5;
                j09Var4 = j09Var14;
                z3 = z6;
                mueVar3 = mueVar5;
                f4 = f6;
            } else {
                l46Var.Z();
                z3 = z;
                y72Var2 = y72Var;
                j09Var4 = j09Var3;
                f4 = f3;
                mueVar3 = mueVar2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new zs1(j09Var, tarotCardChoice2, z3, j09Var4, a26Var, f4, mueVar3, y72Var2, i2, i3);
            }
        }
        i4 |= 384;
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i2 & 3072) == 0) {
                j09Var3 = j09Var2;
                if (l46Var.g(j09Var3)) {
                    i6 = 2048;
                } else {
                    i6 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i4 |= i6;
            }
            if ((i2 & 24576) == 0) {
                a26Var2 = a26Var;
                if (l46Var.i(a26Var2)) {
                    i17 = 16384;
                } else {
                    i17 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i4 |= i17;
            } else {
                a26Var2 = a26Var;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                if ((196608 & i2) == 0) {
                    f3 = f2;
                    if (l46Var.d(f3)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                    if ((1572864 & i2) == 0) {
                        mueVar2 = mueVar;
                        if (l46Var.g(mueVar2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i4 |= i10;
                    }
                    i11 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    if (i11 != 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (l46Var.g(y72Var)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i4 |= i12;
                    }
                    i13 = i4;
                    i14 = 0;
                    if ((i13 & 4793491) != 4793490) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (l46Var.W(i13 & 1, z2)) {
                        if (i18 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        j09Var5 = g09.a;
                        if (i5 == 0) {
                            j09Var5 = j09Var3;
                        }
                        if (i7 != 0) {
                            f5 = 18.0f;
                        } else {
                            f5 = f3;
                        }
                        if (i9 != 0) {
                            mueVar4 = null;
                        } else {
                            mueVar4 = mueVar2;
                        }
                        if (i11 != 0) {
                            y72Var3 = null;
                        } else {
                            y72Var3 = y72Var;
                        }
                        jx0Var = ndb.Z;
                        c92 c92VarA17 = a92.a(new uc0(8.0f, true, new qc0(i14)), jx0Var, l46Var, 54);
                        int iHashCode17 = Long.hashCode(l46Var.T);
                        u8a u8aVarM17 = l46Var.m();
                        j09 j09VarJ17 = m93.J(l46Var, j09Var);
                        lf2.q.getClass();
                        l46Var.j0();
                        z5 = l46Var.S;
                        ov7Var = LayoutNode.h1;
                        if (z5) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        he2Var = hj6.z;
                        dec.l(he2Var, l46Var, c92VarA17);
                        he2Var2 = hj6.y;
                        dec.l(he2Var2, l46Var, u8aVarM17);
                        Integer numValueOf9 = Integer.valueOf(iHashCode17);
                        he2Var3 = hj6.X;
                        dec.l(he2Var3, l46Var, numValueOf9);
                        dec.k(l46Var);
                        he2Var4 = hj6.x;
                        dec.l(he2Var4, l46Var, j09VarJ17);
                        i15 = i13 >> 9;
                        f6 = f5;
                        z6 = z4;
                        y72Var4 = y72Var3;
                        i16 = 0;
                        o7c.d(j09Var5, q7c.r(tarotCardChoice2), null, false, an2.d, 8.0f, a26Var2, false, l46Var, (i15 & 14) | 221184 | ((i13 << 6) & 3670016), 140);
                        j09 j09Var15 = j09Var5;
                        if (z6) {
                            l46Var.f0(1011574536);
                            z7 = true;
                            c92 c92VarA18 = a92.a(new uc0(f6, true, new qc0(i16)), jx0Var, l46Var, 48);
                            int iHashCode18 = Long.hashCode(l46Var.T);
                            u8a u8aVarM18 = l46Var.m();
                            j09 j09VarJ18 = m93.J(l46Var, j09Var5);
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(ov7Var);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(he2Var, l46Var, c92VarA18);
                            dec.l(he2Var2, l46Var, u8aVarM18);
                            ib8.s(iHashCode18, l46Var, he2Var3, l46Var);
                            dec.l(he2Var4, l46Var, j09VarJ18);
                            tarotCardDesc = tarotCardChoice.getTarotCardDesc();
                            if (tarotCardDesc != null) {
                                str = null;
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                l46Var.f0(1294992120);
                                l46Var.r(false);
                                y72Var5 = y72Var4;
                                j09Var6 = j09Var5;
                                mueVar5 = mueVar4;
                            } else {
                                l46Var.f0(1294992121);
                                y72Var5 = y72Var4;
                                mueVar5 = mueVar4;
                                cgg.b(j09Var5, str, true, mueVar5, y72Var5, l46Var, (i15 & 7168) | 390 | (i15 & 57344), 0);
                                j09Var6 = j09Var5;
                                l46Var.r(false);
                            }
                            tarotCardChoice2 = tarotCardChoice;
                            cgg.c(j09Var6, tarotCardChoice2, l46Var, (i13 & 112) | 6, 0);
                            l46Var.r(true);
                            l46Var.r(false);
                        } else {
                            tarotCardChoice2 = tarotCardChoice;
                            y72Var5 = y72Var4;
                            mueVar5 = mueVar4;
                            z7 = true;
                            l46Var.f0(1012099428);
                            l46Var.r(false);
                        }
                        l46Var.r(z7);
                        y72Var2 = y72Var5;
                        j09Var4 = j09Var15;
                        z3 = z6;
                        mueVar3 = mueVar5;
                        f4 = f6;
                    } else {
                        l46Var.Z();
                        z3 = z;
                        y72Var2 = y72Var;
                        j09Var4 = j09Var3;
                        f4 = f3;
                        mueVar3 = mueVar2;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new zs1(j09Var, tarotCardChoice2, z3, j09Var4, a26Var, f4, mueVar3, y72Var2, i2, i3);
                    }
                }
                i4 |= 1572864;
                mueVar2 = mueVar;
                i11 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                if (i11 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (l46Var.g(y72Var)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i4 |= i12;
                }
                i13 = i4;
                i14 = 0;
                if ((i13 & 4793491) != 4793490) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (l46Var.W(i13 & 1, z2)) {
                    if (i18 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    j09Var5 = g09.a;
                    if (i5 == 0) {
                        j09Var5 = j09Var3;
                    }
                    if (i7 != 0) {
                        f5 = 18.0f;
                    } else {
                        f5 = f3;
                    }
                    if (i9 != 0) {
                        mueVar4 = null;
                    } else {
                        mueVar4 = mueVar2;
                    }
                    if (i11 != 0) {
                        y72Var3 = null;
                    } else {
                        y72Var3 = y72Var;
                    }
                    jx0Var = ndb.Z;
                    c92 c92VarA19 = a92.a(new uc0(8.0f, true, new qc0(i14)), jx0Var, l46Var, 54);
                    int iHashCode19 = Long.hashCode(l46Var.T);
                    u8a u8aVarM19 = l46Var.m();
                    j09 j09VarJ19 = m93.J(l46Var, j09Var);
                    lf2.q.getClass();
                    l46Var.j0();
                    z5 = l46Var.S;
                    ov7Var = LayoutNode.h1;
                    if (z5) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    he2Var = hj6.z;
                    dec.l(he2Var, l46Var, c92VarA19);
                    he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var, u8aVarM19);
                    Integer numValueOf10 = Integer.valueOf(iHashCode19);
                    he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var, numValueOf10);
                    dec.k(l46Var);
                    he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var, j09VarJ19);
                    i15 = i13 >> 9;
                    f6 = f5;
                    z6 = z4;
                    y72Var4 = y72Var3;
                    i16 = 0;
                    o7c.d(j09Var5, q7c.r(tarotCardChoice2), null, false, an2.d, 8.0f, a26Var2, false, l46Var, (i15 & 14) | 221184 | ((i13 << 6) & 3670016), 140);
                    j09 j09Var16 = j09Var5;
                    if (z6) {
                        l46Var.f0(1011574536);
                        z7 = true;
                        c92 c92VarA110 = a92.a(new uc0(f6, true, new qc0(i16)), jx0Var, l46Var, 48);
                        int iHashCode110 = Long.hashCode(l46Var.T);
                        u8a u8aVarM110 = l46Var.m();
                        j09 j09VarJ110 = m93.J(l46Var, j09Var5);
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(he2Var, l46Var, c92VarA110);
                        dec.l(he2Var2, l46Var, u8aVarM110);
                        ib8.s(iHashCode110, l46Var, he2Var3, l46Var);
                        dec.l(he2Var4, l46Var, j09VarJ110);
                        tarotCardDesc = tarotCardChoice.getTarotCardDesc();
                        if (tarotCardDesc != null) {
                            str = null;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            l46Var.f0(1294992120);
                            l46Var.r(false);
                            y72Var5 = y72Var4;
                            j09Var6 = j09Var5;
                            mueVar5 = mueVar4;
                        } else {
                            l46Var.f0(1294992121);
                            y72Var5 = y72Var4;
                            mueVar5 = mueVar4;
                            cgg.b(j09Var5, str, true, mueVar5, y72Var5, l46Var, (i15 & 7168) | 390 | (i15 & 57344), 0);
                            j09Var6 = j09Var5;
                            l46Var.r(false);
                        }
                        tarotCardChoice2 = tarotCardChoice;
                        cgg.c(j09Var6, tarotCardChoice2, l46Var, (i13 & 112) | 6, 0);
                        l46Var.r(true);
                        l46Var.r(false);
                    } else {
                        tarotCardChoice2 = tarotCardChoice;
                        y72Var5 = y72Var4;
                        mueVar5 = mueVar4;
                        z7 = true;
                        l46Var.f0(1012099428);
                        l46Var.r(false);
                    }
                    l46Var.r(z7);
                    y72Var2 = y72Var5;
                    j09Var4 = j09Var16;
                    z3 = z6;
                    mueVar3 = mueVar5;
                    f4 = f6;
                } else {
                    l46Var.Z();
                    z3 = z;
                    y72Var2 = y72Var;
                    j09Var4 = j09Var3;
                    f4 = f3;
                    mueVar3 = mueVar2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new zs1(j09Var, tarotCardChoice2, z3, j09Var4, a26Var, f4, mueVar3, y72Var2, i2, i3);
                }
            }
            i4 |= 196608;
            f3 = f2;
            i9 = i3 & 64;
            if (i9 != 0) {
                if ((1572864 & i2) == 0) {
                    mueVar2 = mueVar;
                    if (l46Var.g(mueVar2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i4 |= i10;
                }
                i11 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                if (i11 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (l46Var.g(y72Var)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i4 |= i12;
                }
                i13 = i4;
                i14 = 0;
                if ((i13 & 4793491) != 4793490) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (l46Var.W(i13 & 1, z2)) {
                    if (i18 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    j09Var5 = g09.a;
                    if (i5 == 0) {
                        j09Var5 = j09Var3;
                    }
                    if (i7 != 0) {
                        f5 = 18.0f;
                    } else {
                        f5 = f3;
                    }
                    if (i9 != 0) {
                        mueVar4 = null;
                    } else {
                        mueVar4 = mueVar2;
                    }
                    if (i11 != 0) {
                        y72Var3 = null;
                    } else {
                        y72Var3 = y72Var;
                    }
                    jx0Var = ndb.Z;
                    c92 c92VarA111 = a92.a(new uc0(8.0f, true, new qc0(i14)), jx0Var, l46Var, 54);
                    int iHashCode111 = Long.hashCode(l46Var.T);
                    u8a u8aVarM111 = l46Var.m();
                    j09 j09VarJ111 = m93.J(l46Var, j09Var);
                    lf2.q.getClass();
                    l46Var.j0();
                    z5 = l46Var.S;
                    ov7Var = LayoutNode.h1;
                    if (z5) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    he2Var = hj6.z;
                    dec.l(he2Var, l46Var, c92VarA111);
                    he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var, u8aVarM111);
                    Integer numValueOf11 = Integer.valueOf(iHashCode111);
                    he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var, numValueOf11);
                    dec.k(l46Var);
                    he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var, j09VarJ111);
                    i15 = i13 >> 9;
                    f6 = f5;
                    z6 = z4;
                    y72Var4 = y72Var3;
                    i16 = 0;
                    o7c.d(j09Var5, q7c.r(tarotCardChoice2), null, false, an2.d, 8.0f, a26Var2, false, l46Var, (i15 & 14) | 221184 | ((i13 << 6) & 3670016), 140);
                    j09 j09Var17 = j09Var5;
                    if (z6) {
                        l46Var.f0(1011574536);
                        z7 = true;
                        c92 c92VarA112 = a92.a(new uc0(f6, true, new qc0(i16)), jx0Var, l46Var, 48);
                        int iHashCode112 = Long.hashCode(l46Var.T);
                        u8a u8aVarM112 = l46Var.m();
                        j09 j09VarJ112 = m93.J(l46Var, j09Var5);
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(he2Var, l46Var, c92VarA112);
                        dec.l(he2Var2, l46Var, u8aVarM112);
                        ib8.s(iHashCode112, l46Var, he2Var3, l46Var);
                        dec.l(he2Var4, l46Var, j09VarJ112);
                        tarotCardDesc = tarotCardChoice.getTarotCardDesc();
                        if (tarotCardDesc != null) {
                            str = null;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            l46Var.f0(1294992120);
                            l46Var.r(false);
                            y72Var5 = y72Var4;
                            j09Var6 = j09Var5;
                            mueVar5 = mueVar4;
                        } else {
                            l46Var.f0(1294992121);
                            y72Var5 = y72Var4;
                            mueVar5 = mueVar4;
                            cgg.b(j09Var5, str, true, mueVar5, y72Var5, l46Var, (i15 & 7168) | 390 | (i15 & 57344), 0);
                            j09Var6 = j09Var5;
                            l46Var.r(false);
                        }
                        tarotCardChoice2 = tarotCardChoice;
                        cgg.c(j09Var6, tarotCardChoice2, l46Var, (i13 & 112) | 6, 0);
                        l46Var.r(true);
                        l46Var.r(false);
                    } else {
                        tarotCardChoice2 = tarotCardChoice;
                        y72Var5 = y72Var4;
                        mueVar5 = mueVar4;
                        z7 = true;
                        l46Var.f0(1012099428);
                        l46Var.r(false);
                    }
                    l46Var.r(z7);
                    y72Var2 = y72Var5;
                    j09Var4 = j09Var17;
                    z3 = z6;
                    mueVar3 = mueVar5;
                    f4 = f6;
                } else {
                    l46Var.Z();
                    z3 = z;
                    y72Var2 = y72Var;
                    j09Var4 = j09Var3;
                    f4 = f3;
                    mueVar3 = mueVar2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new zs1(j09Var, tarotCardChoice2, z3, j09Var4, a26Var, f4, mueVar3, y72Var2, i2, i3);
                }
            }
            i4 |= 1572864;
            mueVar2 = mueVar;
            i11 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (i11 != 0) {
                i4 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (l46Var.g(y72Var)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i4 |= i12;
            }
            i13 = i4;
            i14 = 0;
            if ((i13 & 4793491) != 4793490) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (l46Var.W(i13 & 1, z2)) {
                if (i18 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                j09Var5 = g09.a;
                if (i5 == 0) {
                    j09Var5 = j09Var3;
                }
                if (i7 != 0) {
                    f5 = 18.0f;
                } else {
                    f5 = f3;
                }
                if (i9 != 0) {
                    mueVar4 = null;
                } else {
                    mueVar4 = mueVar2;
                }
                if (i11 != 0) {
                    y72Var3 = null;
                } else {
                    y72Var3 = y72Var;
                }
                jx0Var = ndb.Z;
                c92 c92VarA113 = a92.a(new uc0(8.0f, true, new qc0(i14)), jx0Var, l46Var, 54);
                int iHashCode113 = Long.hashCode(l46Var.T);
                u8a u8aVarM113 = l46Var.m();
                j09 j09VarJ113 = m93.J(l46Var, j09Var);
                lf2.q.getClass();
                l46Var.j0();
                z5 = l46Var.S;
                ov7Var = LayoutNode.h1;
                if (z5) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                he2Var = hj6.z;
                dec.l(he2Var, l46Var, c92VarA113);
                he2Var2 = hj6.y;
                dec.l(he2Var2, l46Var, u8aVarM113);
                Integer numValueOf12 = Integer.valueOf(iHashCode113);
                he2Var3 = hj6.X;
                dec.l(he2Var3, l46Var, numValueOf12);
                dec.k(l46Var);
                he2Var4 = hj6.x;
                dec.l(he2Var4, l46Var, j09VarJ113);
                i15 = i13 >> 9;
                f6 = f5;
                z6 = z4;
                y72Var4 = y72Var3;
                i16 = 0;
                o7c.d(j09Var5, q7c.r(tarotCardChoice2), null, false, an2.d, 8.0f, a26Var2, false, l46Var, (i15 & 14) | 221184 | ((i13 << 6) & 3670016), 140);
                j09 j09Var18 = j09Var5;
                if (z6) {
                    l46Var.f0(1011574536);
                    z7 = true;
                    c92 c92VarA114 = a92.a(new uc0(f6, true, new qc0(i16)), jx0Var, l46Var, 48);
                    int iHashCode114 = Long.hashCode(l46Var.T);
                    u8a u8aVarM114 = l46Var.m();
                    j09 j09VarJ114 = m93.J(l46Var, j09Var5);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var, l46Var, c92VarA114);
                    dec.l(he2Var2, l46Var, u8aVarM114);
                    ib8.s(iHashCode114, l46Var, he2Var3, l46Var);
                    dec.l(he2Var4, l46Var, j09VarJ114);
                    tarotCardDesc = tarotCardChoice.getTarotCardDesc();
                    if (tarotCardDesc != null) {
                        str = null;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        l46Var.f0(1294992120);
                        l46Var.r(false);
                        y72Var5 = y72Var4;
                        j09Var6 = j09Var5;
                        mueVar5 = mueVar4;
                    } else {
                        l46Var.f0(1294992121);
                        y72Var5 = y72Var4;
                        mueVar5 = mueVar4;
                        cgg.b(j09Var5, str, true, mueVar5, y72Var5, l46Var, (i15 & 7168) | 390 | (i15 & 57344), 0);
                        j09Var6 = j09Var5;
                        l46Var.r(false);
                    }
                    tarotCardChoice2 = tarotCardChoice;
                    cgg.c(j09Var6, tarotCardChoice2, l46Var, (i13 & 112) | 6, 0);
                    l46Var.r(true);
                    l46Var.r(false);
                } else {
                    tarotCardChoice2 = tarotCardChoice;
                    y72Var5 = y72Var4;
                    mueVar5 = mueVar4;
                    z7 = true;
                    l46Var.f0(1012099428);
                    l46Var.r(false);
                }
                l46Var.r(z7);
                y72Var2 = y72Var5;
                j09Var4 = j09Var18;
                z3 = z6;
                mueVar3 = mueVar5;
                f4 = f6;
            } else {
                l46Var.Z();
                z3 = z;
                y72Var2 = y72Var;
                j09Var4 = j09Var3;
                f4 = f3;
                mueVar3 = mueVar2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new zs1(j09Var, tarotCardChoice2, z3, j09Var4, a26Var, f4, mueVar3, y72Var2, i2, i3);
            }
        }
        i4 |= 3072;
        j09Var3 = j09Var2;
        if ((i2 & 24576) == 0) {
            a26Var2 = a26Var;
            if (l46Var.i(a26Var2)) {
                i17 = 16384;
            } else {
                i17 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i4 |= i17;
        } else {
            a26Var2 = a26Var;
        }
        i7 = i3 & 32;
        if (i7 != 0) {
            if ((196608 & i2) == 0) {
                f3 = f2;
                if (l46Var.d(f3)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i4 |= i8;
            }
            i9 = i3 & 64;
            if (i9 != 0) {
                if ((1572864 & i2) == 0) {
                    mueVar2 = mueVar;
                    if (l46Var.g(mueVar2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i4 |= i10;
                }
                i11 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                if (i11 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (l46Var.g(y72Var)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i4 |= i12;
                }
                i13 = i4;
                i14 = 0;
                if ((i13 & 4793491) != 4793490) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (l46Var.W(i13 & 1, z2)) {
                    if (i18 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    j09Var5 = g09.a;
                    if (i5 == 0) {
                        j09Var5 = j09Var3;
                    }
                    if (i7 != 0) {
                        f5 = 18.0f;
                    } else {
                        f5 = f3;
                    }
                    if (i9 != 0) {
                        mueVar4 = null;
                    } else {
                        mueVar4 = mueVar2;
                    }
                    if (i11 != 0) {
                        y72Var3 = null;
                    } else {
                        y72Var3 = y72Var;
                    }
                    jx0Var = ndb.Z;
                    c92 c92VarA115 = a92.a(new uc0(8.0f, true, new qc0(i14)), jx0Var, l46Var, 54);
                    int iHashCode115 = Long.hashCode(l46Var.T);
                    u8a u8aVarM115 = l46Var.m();
                    j09 j09VarJ115 = m93.J(l46Var, j09Var);
                    lf2.q.getClass();
                    l46Var.j0();
                    z5 = l46Var.S;
                    ov7Var = LayoutNode.h1;
                    if (z5) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    he2Var = hj6.z;
                    dec.l(he2Var, l46Var, c92VarA115);
                    he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var, u8aVarM115);
                    Integer numValueOf13 = Integer.valueOf(iHashCode115);
                    he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var, numValueOf13);
                    dec.k(l46Var);
                    he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var, j09VarJ115);
                    i15 = i13 >> 9;
                    f6 = f5;
                    z6 = z4;
                    y72Var4 = y72Var3;
                    i16 = 0;
                    o7c.d(j09Var5, q7c.r(tarotCardChoice2), null, false, an2.d, 8.0f, a26Var2, false, l46Var, (i15 & 14) | 221184 | ((i13 << 6) & 3670016), 140);
                    j09 j09Var19 = j09Var5;
                    if (z6) {
                        l46Var.f0(1011574536);
                        z7 = true;
                        c92 c92VarA116 = a92.a(new uc0(f6, true, new qc0(i16)), jx0Var, l46Var, 48);
                        int iHashCode116 = Long.hashCode(l46Var.T);
                        u8a u8aVarM116 = l46Var.m();
                        j09 j09VarJ116 = m93.J(l46Var, j09Var5);
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(he2Var, l46Var, c92VarA116);
                        dec.l(he2Var2, l46Var, u8aVarM116);
                        ib8.s(iHashCode116, l46Var, he2Var3, l46Var);
                        dec.l(he2Var4, l46Var, j09VarJ116);
                        tarotCardDesc = tarotCardChoice.getTarotCardDesc();
                        if (tarotCardDesc != null) {
                            str = null;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            l46Var.f0(1294992120);
                            l46Var.r(false);
                            y72Var5 = y72Var4;
                            j09Var6 = j09Var5;
                            mueVar5 = mueVar4;
                        } else {
                            l46Var.f0(1294992121);
                            y72Var5 = y72Var4;
                            mueVar5 = mueVar4;
                            cgg.b(j09Var5, str, true, mueVar5, y72Var5, l46Var, (i15 & 7168) | 390 | (i15 & 57344), 0);
                            j09Var6 = j09Var5;
                            l46Var.r(false);
                        }
                        tarotCardChoice2 = tarotCardChoice;
                        cgg.c(j09Var6, tarotCardChoice2, l46Var, (i13 & 112) | 6, 0);
                        l46Var.r(true);
                        l46Var.r(false);
                    } else {
                        tarotCardChoice2 = tarotCardChoice;
                        y72Var5 = y72Var4;
                        mueVar5 = mueVar4;
                        z7 = true;
                        l46Var.f0(1012099428);
                        l46Var.r(false);
                    }
                    l46Var.r(z7);
                    y72Var2 = y72Var5;
                    j09Var4 = j09Var19;
                    z3 = z6;
                    mueVar3 = mueVar5;
                    f4 = f6;
                } else {
                    l46Var.Z();
                    z3 = z;
                    y72Var2 = y72Var;
                    j09Var4 = j09Var3;
                    f4 = f3;
                    mueVar3 = mueVar2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new zs1(j09Var, tarotCardChoice2, z3, j09Var4, a26Var, f4, mueVar3, y72Var2, i2, i3);
                }
            }
            i4 |= 1572864;
            mueVar2 = mueVar;
            i11 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (i11 != 0) {
                i4 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (l46Var.g(y72Var)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i4 |= i12;
            }
            i13 = i4;
            i14 = 0;
            if ((i13 & 4793491) != 4793490) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (l46Var.W(i13 & 1, z2)) {
                if (i18 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                j09Var5 = g09.a;
                if (i5 == 0) {
                    j09Var5 = j09Var3;
                }
                if (i7 != 0) {
                    f5 = 18.0f;
                } else {
                    f5 = f3;
                }
                if (i9 != 0) {
                    mueVar4 = null;
                } else {
                    mueVar4 = mueVar2;
                }
                if (i11 != 0) {
                    y72Var3 = null;
                } else {
                    y72Var3 = y72Var;
                }
                jx0Var = ndb.Z;
                c92 c92VarA117 = a92.a(new uc0(8.0f, true, new qc0(i14)), jx0Var, l46Var, 54);
                int iHashCode117 = Long.hashCode(l46Var.T);
                u8a u8aVarM117 = l46Var.m();
                j09 j09VarJ117 = m93.J(l46Var, j09Var);
                lf2.q.getClass();
                l46Var.j0();
                z5 = l46Var.S;
                ov7Var = LayoutNode.h1;
                if (z5) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                he2Var = hj6.z;
                dec.l(he2Var, l46Var, c92VarA117);
                he2Var2 = hj6.y;
                dec.l(he2Var2, l46Var, u8aVarM117);
                Integer numValueOf14 = Integer.valueOf(iHashCode117);
                he2Var3 = hj6.X;
                dec.l(he2Var3, l46Var, numValueOf14);
                dec.k(l46Var);
                he2Var4 = hj6.x;
                dec.l(he2Var4, l46Var, j09VarJ117);
                i15 = i13 >> 9;
                f6 = f5;
                z6 = z4;
                y72Var4 = y72Var3;
                i16 = 0;
                o7c.d(j09Var5, q7c.r(tarotCardChoice2), null, false, an2.d, 8.0f, a26Var2, false, l46Var, (i15 & 14) | 221184 | ((i13 << 6) & 3670016), 140);
                j09 j09Var110 = j09Var5;
                if (z6) {
                    l46Var.f0(1011574536);
                    z7 = true;
                    c92 c92VarA118 = a92.a(new uc0(f6, true, new qc0(i16)), jx0Var, l46Var, 48);
                    int iHashCode118 = Long.hashCode(l46Var.T);
                    u8a u8aVarM118 = l46Var.m();
                    j09 j09VarJ118 = m93.J(l46Var, j09Var5);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var, l46Var, c92VarA118);
                    dec.l(he2Var2, l46Var, u8aVarM118);
                    ib8.s(iHashCode118, l46Var, he2Var3, l46Var);
                    dec.l(he2Var4, l46Var, j09VarJ118);
                    tarotCardDesc = tarotCardChoice.getTarotCardDesc();
                    if (tarotCardDesc != null) {
                        str = null;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        l46Var.f0(1294992120);
                        l46Var.r(false);
                        y72Var5 = y72Var4;
                        j09Var6 = j09Var5;
                        mueVar5 = mueVar4;
                    } else {
                        l46Var.f0(1294992121);
                        y72Var5 = y72Var4;
                        mueVar5 = mueVar4;
                        cgg.b(j09Var5, str, true, mueVar5, y72Var5, l46Var, (i15 & 7168) | 390 | (i15 & 57344), 0);
                        j09Var6 = j09Var5;
                        l46Var.r(false);
                    }
                    tarotCardChoice2 = tarotCardChoice;
                    cgg.c(j09Var6, tarotCardChoice2, l46Var, (i13 & 112) | 6, 0);
                    l46Var.r(true);
                    l46Var.r(false);
                } else {
                    tarotCardChoice2 = tarotCardChoice;
                    y72Var5 = y72Var4;
                    mueVar5 = mueVar4;
                    z7 = true;
                    l46Var.f0(1012099428);
                    l46Var.r(false);
                }
                l46Var.r(z7);
                y72Var2 = y72Var5;
                j09Var4 = j09Var110;
                z3 = z6;
                mueVar3 = mueVar5;
                f4 = f6;
            } else {
                l46Var.Z();
                z3 = z;
                y72Var2 = y72Var;
                j09Var4 = j09Var3;
                f4 = f3;
                mueVar3 = mueVar2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new zs1(j09Var, tarotCardChoice2, z3, j09Var4, a26Var, f4, mueVar3, y72Var2, i2, i3);
            }
        }
        i4 |= 196608;
        f3 = f2;
        i9 = i3 & 64;
        if (i9 != 0) {
            if ((1572864 & i2) == 0) {
                mueVar2 = mueVar;
                if (l46Var.g(mueVar2)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i4 |= i10;
            }
            i11 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (i11 != 0) {
                i4 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (l46Var.g(y72Var)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i4 |= i12;
            }
            i13 = i4;
            i14 = 0;
            if ((i13 & 4793491) != 4793490) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (l46Var.W(i13 & 1, z2)) {
                if (i18 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                j09Var5 = g09.a;
                if (i5 == 0) {
                    j09Var5 = j09Var3;
                }
                if (i7 != 0) {
                    f5 = 18.0f;
                } else {
                    f5 = f3;
                }
                if (i9 != 0) {
                    mueVar4 = null;
                } else {
                    mueVar4 = mueVar2;
                }
                if (i11 != 0) {
                    y72Var3 = null;
                } else {
                    y72Var3 = y72Var;
                }
                jx0Var = ndb.Z;
                c92 c92VarA119 = a92.a(new uc0(8.0f, true, new qc0(i14)), jx0Var, l46Var, 54);
                int iHashCode119 = Long.hashCode(l46Var.T);
                u8a u8aVarM119 = l46Var.m();
                j09 j09VarJ119 = m93.J(l46Var, j09Var);
                lf2.q.getClass();
                l46Var.j0();
                z5 = l46Var.S;
                ov7Var = LayoutNode.h1;
                if (z5) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                he2Var = hj6.z;
                dec.l(he2Var, l46Var, c92VarA119);
                he2Var2 = hj6.y;
                dec.l(he2Var2, l46Var, u8aVarM119);
                Integer numValueOf15 = Integer.valueOf(iHashCode119);
                he2Var3 = hj6.X;
                dec.l(he2Var3, l46Var, numValueOf15);
                dec.k(l46Var);
                he2Var4 = hj6.x;
                dec.l(he2Var4, l46Var, j09VarJ119);
                i15 = i13 >> 9;
                f6 = f5;
                z6 = z4;
                y72Var4 = y72Var3;
                i16 = 0;
                o7c.d(j09Var5, q7c.r(tarotCardChoice2), null, false, an2.d, 8.0f, a26Var2, false, l46Var, (i15 & 14) | 221184 | ((i13 << 6) & 3670016), 140);
                j09 j09Var111 = j09Var5;
                if (z6) {
                    l46Var.f0(1011574536);
                    z7 = true;
                    c92 c92VarA1110 = a92.a(new uc0(f6, true, new qc0(i16)), jx0Var, l46Var, 48);
                    int iHashCode1110 = Long.hashCode(l46Var.T);
                    u8a u8aVarM1110 = l46Var.m();
                    j09 j09VarJ1110 = m93.J(l46Var, j09Var5);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var, l46Var, c92VarA1110);
                    dec.l(he2Var2, l46Var, u8aVarM1110);
                    ib8.s(iHashCode1110, l46Var, he2Var3, l46Var);
                    dec.l(he2Var4, l46Var, j09VarJ1110);
                    tarotCardDesc = tarotCardChoice.getTarotCardDesc();
                    if (tarotCardDesc != null) {
                        str = null;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        l46Var.f0(1294992120);
                        l46Var.r(false);
                        y72Var5 = y72Var4;
                        j09Var6 = j09Var5;
                        mueVar5 = mueVar4;
                    } else {
                        l46Var.f0(1294992121);
                        y72Var5 = y72Var4;
                        mueVar5 = mueVar4;
                        cgg.b(j09Var5, str, true, mueVar5, y72Var5, l46Var, (i15 & 7168) | 390 | (i15 & 57344), 0);
                        j09Var6 = j09Var5;
                        l46Var.r(false);
                    }
                    tarotCardChoice2 = tarotCardChoice;
                    cgg.c(j09Var6, tarotCardChoice2, l46Var, (i13 & 112) | 6, 0);
                    l46Var.r(true);
                    l46Var.r(false);
                } else {
                    tarotCardChoice2 = tarotCardChoice;
                    y72Var5 = y72Var4;
                    mueVar5 = mueVar4;
                    z7 = true;
                    l46Var.f0(1012099428);
                    l46Var.r(false);
                }
                l46Var.r(z7);
                y72Var2 = y72Var5;
                j09Var4 = j09Var111;
                z3 = z6;
                mueVar3 = mueVar5;
                f4 = f6;
            } else {
                l46Var.Z();
                z3 = z;
                y72Var2 = y72Var;
                j09Var4 = j09Var3;
                f4 = f3;
                mueVar3 = mueVar2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new zs1(j09Var, tarotCardChoice2, z3, j09Var4, a26Var, f4, mueVar3, y72Var2, i2, i3);
            }
        }
        i4 |= 1572864;
        mueVar2 = mueVar;
        i11 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        if (i11 != 0) {
            i4 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            if (l46Var.g(y72Var)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i4 |= i12;
        }
        i13 = i4;
        i14 = 0;
        if ((i13 & 4793491) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (l46Var.W(i13 & 1, z2)) {
            if (i18 != 0) {
                z4 = true;
            } else {
                z4 = z;
            }
            j09Var5 = g09.a;
            if (i5 == 0) {
                j09Var5 = j09Var3;
            }
            if (i7 != 0) {
                f5 = 18.0f;
            } else {
                f5 = f3;
            }
            if (i9 != 0) {
                mueVar4 = null;
            } else {
                mueVar4 = mueVar2;
            }
            if (i11 != 0) {
                y72Var3 = null;
            } else {
                y72Var3 = y72Var;
            }
            jx0Var = ndb.Z;
            c92 c92VarA1111 = a92.a(new uc0(8.0f, true, new qc0(i14)), jx0Var, l46Var, 54);
            int iHashCode1111 = Long.hashCode(l46Var.T);
            u8a u8aVarM1111 = l46Var.m();
            j09 j09VarJ1111 = m93.J(l46Var, j09Var);
            lf2.q.getClass();
            l46Var.j0();
            z5 = l46Var.S;
            ov7Var = LayoutNode.h1;
            if (z5) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            he2Var = hj6.z;
            dec.l(he2Var, l46Var, c92VarA1111);
            he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var, u8aVarM1111);
            Integer numValueOf16 = Integer.valueOf(iHashCode1111);
            he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var, numValueOf16);
            dec.k(l46Var);
            he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var, j09VarJ1111);
            i15 = i13 >> 9;
            f6 = f5;
            z6 = z4;
            y72Var4 = y72Var3;
            i16 = 0;
            o7c.d(j09Var5, q7c.r(tarotCardChoice2), null, false, an2.d, 8.0f, a26Var2, false, l46Var, (i15 & 14) | 221184 | ((i13 << 6) & 3670016), 140);
            j09 j09Var112 = j09Var5;
            if (z6) {
                l46Var.f0(1011574536);
                z7 = true;
                c92 c92VarA1112 = a92.a(new uc0(f6, true, new qc0(i16)), jx0Var, l46Var, 48);
                int iHashCode1112 = Long.hashCode(l46Var.T);
                u8a u8aVarM1112 = l46Var.m();
                j09 j09VarJ1112 = m93.J(l46Var, j09Var5);
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var, l46Var, c92VarA1112);
                dec.l(he2Var2, l46Var, u8aVarM1112);
                ib8.s(iHashCode1112, l46Var, he2Var3, l46Var);
                dec.l(he2Var4, l46Var, j09VarJ1112);
                tarotCardDesc = tarotCardChoice.getTarotCardDesc();
                if (tarotCardDesc != null) {
                    str = null;
                } else {
                    str = null;
                }
                if (str == null) {
                    l46Var.f0(1294992120);
                    l46Var.r(false);
                    y72Var5 = y72Var4;
                    j09Var6 = j09Var5;
                    mueVar5 = mueVar4;
                } else {
                    l46Var.f0(1294992121);
                    y72Var5 = y72Var4;
                    mueVar5 = mueVar4;
                    cgg.b(j09Var5, str, true, mueVar5, y72Var5, l46Var, (i15 & 7168) | 390 | (i15 & 57344), 0);
                    j09Var6 = j09Var5;
                    l46Var.r(false);
                }
                tarotCardChoice2 = tarotCardChoice;
                cgg.c(j09Var6, tarotCardChoice2, l46Var, (i13 & 112) | 6, 0);
                l46Var.r(true);
                l46Var.r(false);
            } else {
                tarotCardChoice2 = tarotCardChoice;
                y72Var5 = y72Var4;
                mueVar5 = mueVar4;
                z7 = true;
                l46Var.f0(1012099428);
                l46Var.r(false);
            }
            l46Var.r(z7);
            y72Var2 = y72Var5;
            j09Var4 = j09Var112;
            z3 = z6;
            mueVar3 = mueVar5;
            f4 = f6;
        } else {
            l46Var.Z();
            z3 = z;
            y72Var2 = y72Var;
            j09Var4 = j09Var3;
            f4 = f3;
            mueVar3 = mueVar2;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new zs1(j09Var, tarotCardChoice2, z3, j09Var4, a26Var, f4, mueVar3, y72Var2, i2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0158  */
    /* JADX WARN: Code duplicated, block: B:102:0x016c  */
    /* JADX WARN: Code duplicated, block: B:108:0x017a  */
    /* JADX WARN: Code duplicated, block: B:110:0x017d  */
    /* JADX WARN: Code duplicated, block: B:111:0x0180  */
    /* JADX WARN: Code duplicated, block: B:114:0x018e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0190  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:124:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:125:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:129:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:132:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:134:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:137:0x0231  */
    /* JADX WARN: Code duplicated, block: B:139:0x0237  */
    /* JADX WARN: Code duplicated, block: B:142:0x0258  */
    /* JADX WARN: Code duplicated, block: B:145:0x0285  */
    /* JADX WARN: Code duplicated, block: B:146:0x0289  */
    /* JADX WARN: Code duplicated, block: B:149:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:150:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:157:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:159:0x032e  */
    /* JADX WARN: Code duplicated, block: B:162:0x0339  */
    /* JADX WARN: Code duplicated, block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    /* JADX WARN: Code duplicated, block: B:33:0x0069  */
    /* JADX WARN: Code duplicated, block: B:34:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:90:0x010b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0120  */
    /* JADX WARN: Code duplicated, block: B:99:0x0150  */
    public static final void e(sdd sddVar, j09 j09Var, xw9 xw9Var, Integer num, boolean z, a26 a26Var, l26 l26Var, x16 x16Var, dd2 dd2Var, l46 l46Var, int i2, int i3) {
        int i4;
        j09 j09Var2;
        boolean z2;
        boolean z3;
        j09 j09Var3;
        ojb ojbVarV;
        j09 j09VarI;
        j09 j09Var4;
        Object objR;
        i8c i8cVar;
        e89 e89Var;
        Object objR2;
        e89 e89Var2;
        e89 e89VarI;
        Object objR3;
        x16 x16Var2;
        boolean zG;
        Object objR4;
        Integer num2;
        ft1 ft1Var;
        boolean z4;
        et1 et1Var;
        boolean z5;
        boolean z6;
        boolean z7;
        Object jp4Var;
        e89 e89Var3;
        fs4 fs4Var;
        ft1 ft1Var2;
        e89 e89Var4;
        boolean z8;
        float f2;
        boolean z9;
        e89 e89Var5;
        h0e h0eVarA;
        float f3;
        boolean z10;
        ov7 ov7Var;
        boolean z11;
        Object objR5;
        Integer num3;
        int i5;
        int i6;
        int i7;
        boolean zI;
        int i8;
        int i9;
        int i10;
        int i11;
        l46 l46Var2 = l46Var;
        a26Var.getClass();
        l26Var.getClass();
        x16Var.getClass();
        l46Var2.h0(489931370);
        if ((i2 & 6) == 0) {
            i4 = (l46Var2.g(sddVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i12 = i3 & 1;
        if (i12 == 0) {
            if ((i2 & 48) == 0) {
                j09Var2 = j09Var;
                i4 |= l46Var2.g(j09Var2) ? 32 : 16;
            }
            if ((i2 & 384) != 0) {
                if (l46Var2.g(xw9Var)) {
                    i11 = 256;
                } else {
                    i11 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                i4 |= i11;
            }
            if ((i2 & 3072) == 0) {
                if (l46Var2.g(num)) {
                    i10 = 2048;
                } else {
                    i10 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i4 |= i10;
            }
            if ((i2 & 24576) == 0) {
                if (l46Var2.h(z)) {
                    i9 = 16384;
                } else {
                    i9 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i4 |= i9;
            }
            if ((196608 & i2) == 0) {
                if ((262144 & i2) == 0) {
                    zI = l46Var2.g(a26Var);
                } else {
                    zI = l46Var2.i(a26Var);
                }
                if (zI) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i4 |= i8;
            }
            if ((1572864 & i2) != 0) {
                if (l46Var2.i(l26Var)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i4 |= i7;
            }
            if ((i2 & 12582912) == 0) {
                if (l46Var2.i(x16Var)) {
                    i6 = 8388608;
                } else {
                    i6 = 4194304;
                }
                i4 |= i6;
            }
            if ((i2 & 100663296) == 0) {
                if (l46Var2.i(dd2Var)) {
                    i5 = 67108864;
                } else {
                    i5 = 33554432;
                }
                i4 |= i5;
            }
            if ((i4 & 38347923) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (l46Var2.W(i4 & 1, z2)) {
                j09VarI = g09.a;
                if (i12 != 0) {
                    j09Var4 = j09VarI;
                } else {
                    j09Var4 = j09Var2;
                }
                objR = l46Var2.R();
                i8cVar = sf2.a;
                if (objR == i8cVar) {
                    objR = q1c.f(null);
                    l46Var2.p0(objR);
                }
                e89Var = (e89) objR;
                objR2 = l46Var2.R();
                if (objR2 == i8cVar) {
                    objR2 = q1c.f(et1.a);
                    l46Var2.p0(objR2);
                }
                e89Var2 = (e89) objR2;
                e89VarI = q1c.i(x16Var, l46Var2);
                objR3 = l46Var2.R();
                if (objR3 == i8cVar) {
                    objR3 = new vi3(e89Var2, e89Var, e89VarI, 1);
                    l46Var2.p0(objR3);
                }
                x16Var2 = (x16) objR3;
                zG = l46Var2.g((Integer) e89Var.getValue()) | l46Var2.e(((et1) e89Var2.getValue()).ordinal());
                objR4 = l46Var2.R();
                if (!zG || objR4 == i8cVar) {
                    num2 = (Integer) e89Var.getValue();
                    if (num2 != null) {
                        objR4 = new ft1(num2.intValue(), (et1) e89Var2.getValue(), x16Var2);
                    } else {
                        objR4 = null;
                    }
                    l46Var2.p0(objR4);
                } else {
                    e89Var = e89Var;
                }
                ft1Var = (ft1) objR4;
                if (num == null && ft1Var == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (ft1Var != null) {
                    et1Var = ft1Var.b;
                } else {
                    et1Var = null;
                }
                boolean zG2 = l46Var2.g(ft1Var);
                z5 = z4;
                if ((i4 & 14) == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = zG2 | z6;
                Object objR6 = l46Var2.R();
                if (!z7 || objR6 == i8cVar) {
                    e89Var3 = e89Var2;
                    e89 e89Var6 = e89Var;
                    fs4Var = null;
                    ft1Var2 = ft1Var;
                    jp4Var = new jp4(ft1Var2, sddVar, e89Var6, e89Var3, null);
                    e89Var4 = e89Var6;
                    l46Var2.p0(jp4Var);
                } else {
                    jp4Var = objR6;
                    e89Var3 = e89Var2;
                    fs4Var = null;
                    ft1Var2 = ft1Var;
                    e89Var4 = e89Var;
                }
                af1.o((l26) jp4Var, l46Var2, et1Var);
                if (Build.VERSION.SDK_INT >= 31) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z5 || !z8) {
                    f2 = 0.0f;
                } else {
                    f2 = 16.0f;
                }
                z9 = z8;
                Object obj = ft1Var2;
                e89Var5 = e89Var3;
                h0eVarA = vx.a(f2, T(300, 0, fs4Var, 6), "background_blur", l46Var2, 432, 8);
                if (z9) {
                    f3 = 0.18f;
                } else {
                    f3 = 0.8f;
                }
                FillElement fillElement = b.c;
                j09 j09VarD = j09Var4.D(fillElement);
                lx0 lx0Var = ndb.b;
                j09 j09Var5 = j09Var4;
                xn8 xn8VarC = s21.c(lx0Var, false);
                int iHashCode = Long.hashCode(l46Var2.T);
                u8a u8aVarM = l46Var2.m();
                j09 j09VarJ = m93.J(l46Var2, j09VarD);
                lf2.q.getClass();
                l46Var2.j0();
                z10 = l46Var2.S;
                ov7Var = LayoutNode.h1;
                if (z10) {
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
                if (z9) {
                    j09VarI = od4.i(j09VarI, ((yi4) h0eVarA.getValue()).a);
                }
                j09 j09VarD2 = fillElement.D(j09VarI);
                xn8 xn8VarC2 = s21.c(lx0Var, false);
                int iHashCode2 = Long.hashCode(l46Var2.T);
                u8a u8aVarM2 = l46Var2.m();
                j09 j09VarJ2 = m93.J(l46Var2, j09VarD2);
                l46Var2.j0();
                if (l46Var2.S) {
                    l46Var2.l(ov7Var);
                } else {
                    l46Var2.s0();
                }
                dec.l(he2Var, l46Var2, xn8VarC2);
                dec.l(he2Var2, l46Var2, u8aVarM2);
                ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                dec.l(he2Var4, l46Var2, j09VarJ2);
                dd2Var.t(d31.a, obj, l46Var2, Integer.valueOf(6 | ((i4 >> 18) & 896)));
                l46Var2.r(true);
                m93.d(z5, null, rw4.f(T(300, 0, null, 6), 2), rw4.g(T(300, 0, null, 6), 2), null, af1.b0(142283724, new fp4(0, f3), l46Var2), l46Var, 200064, 18);
                l46Var2 = l46Var;
                if ((i4 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objR5 = l46Var2.R();
                if (!z11 || objR5 == i8cVar) {
                    num3 = num;
                    objR5 = new j8((Object) num3, e89Var4, (Object) e89Var5, 29);
                    l46Var2.p0(objR5);
                } else {
                    num3 = num;
                }
                g21.e(sddVar, null, xw9Var, num3, z5, a26Var, l26Var, (x16) objR5, l46Var2, i4 & 4136846);
                z3 = z;
                rfc.n(z3, l46Var2, (i4 >> 12) & 14, 2);
                l46Var2.r(true);
                j09Var3 = j09Var5;
            } else {
                z3 = z;
                l46Var2.Z();
                j09Var3 = j09Var2;
            }
            ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                ojbVarV.d = new b61(sddVar, j09Var3, xw9Var, num, z3, a26Var, l26Var, x16Var, dd2Var, i2, i3);
            }
        }
        i4 |= 48;
        j09Var2 = j09Var;
        if ((i2 & 384) != 0) {
            if (l46Var2.g(xw9Var)) {
                i11 = 256;
            } else {
                i11 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i4 |= i11;
        }
        if ((i2 & 3072) == 0) {
            if (l46Var2.g(num)) {
                i10 = 2048;
            } else {
                i10 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i4 |= i10;
        }
        if ((i2 & 24576) == 0) {
            if (l46Var2.h(z)) {
                i9 = 16384;
            } else {
                i9 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i4 |= i9;
        }
        if ((196608 & i2) == 0) {
            if ((262144 & i2) == 0) {
                zI = l46Var2.g(a26Var);
            } else {
                zI = l46Var2.i(a26Var);
            }
            if (zI) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i4 |= i8;
        }
        if ((1572864 & i2) != 0) {
            if (l46Var2.i(l26Var)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i4 |= i7;
        }
        if ((i2 & 12582912) == 0) {
            if (l46Var2.i(x16Var)) {
                i6 = 8388608;
            } else {
                i6 = 4194304;
            }
            i4 |= i6;
        }
        if ((i2 & 100663296) == 0) {
            if (l46Var2.i(dd2Var)) {
                i5 = 67108864;
            } else {
                i5 = 33554432;
            }
            i4 |= i5;
        }
        if ((i4 & 38347923) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (l46Var2.W(i4 & 1, z2)) {
            j09VarI = g09.a;
            if (i12 != 0) {
                j09Var4 = j09VarI;
            } else {
                j09Var4 = j09Var2;
            }
            objR = l46Var2.R();
            i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = q1c.f(null);
                l46Var2.p0(objR);
            }
            e89Var = (e89) objR;
            objR2 = l46Var2.R();
            if (objR2 == i8cVar) {
                objR2 = q1c.f(et1.a);
                l46Var2.p0(objR2);
            }
            e89Var2 = (e89) objR2;
            e89VarI = q1c.i(x16Var, l46Var2);
            objR3 = l46Var2.R();
            if (objR3 == i8cVar) {
                objR3 = new vi3(e89Var2, e89Var, e89VarI, 1);
                l46Var2.p0(objR3);
            }
            x16Var2 = (x16) objR3;
            zG = l46Var2.g((Integer) e89Var.getValue()) | l46Var2.e(((et1) e89Var2.getValue()).ordinal());
            objR4 = l46Var2.R();
            if (zG) {
                num2 = (Integer) e89Var.getValue();
                if (num2 != null) {
                    objR4 = new ft1(num2.intValue(), (et1) e89Var2.getValue(), x16Var2);
                } else {
                    objR4 = null;
                }
                l46Var2.p0(objR4);
            } else {
                num2 = (Integer) e89Var.getValue();
                if (num2 != null) {
                    objR4 = new ft1(num2.intValue(), (et1) e89Var2.getValue(), x16Var2);
                } else {
                    objR4 = null;
                }
                l46Var2.p0(objR4);
            }
            ft1Var = (ft1) objR4;
            if (num == null) {
                z4 = false;
            } else {
                z4 = false;
            }
            if (ft1Var != null) {
                et1Var = ft1Var.b;
            } else {
                et1Var = null;
            }
            boolean zG3 = l46Var2.g(ft1Var);
            z5 = z4;
            if ((i4 & 14) == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            z7 = zG3 | z6;
            Object objR7 = l46Var2.R();
            if (z7) {
                e89Var3 = e89Var2;
                e89 e89Var7 = e89Var;
                fs4Var = null;
                ft1Var2 = ft1Var;
                jp4Var = new jp4(ft1Var2, sddVar, e89Var7, e89Var3, null);
                e89Var4 = e89Var7;
                l46Var2.p0(jp4Var);
            } else {
                e89Var3 = e89Var2;
                e89 e89Var8 = e89Var;
                fs4Var = null;
                ft1Var2 = ft1Var;
                jp4Var = new jp4(ft1Var2, sddVar, e89Var8, e89Var3, null);
                e89Var4 = e89Var8;
                l46Var2.p0(jp4Var);
            }
            af1.o((l26) jp4Var, l46Var2, et1Var);
            if (Build.VERSION.SDK_INT >= 31) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z5) {
                f2 = 0.0f;
            } else {
                f2 = 0.0f;
            }
            z9 = z8;
            Object obj2 = ft1Var2;
            e89Var5 = e89Var3;
            h0eVarA = vx.a(f2, T(300, 0, fs4Var, 6), "background_blur", l46Var2, 432, 8);
            if (z9) {
                f3 = 0.18f;
            } else {
                f3 = 0.8f;
            }
            FillElement fillElement2 = b.c;
            j09 j09VarD3 = j09Var4.D(fillElement2);
            lx0 lx0Var2 = ndb.b;
            j09 j09Var6 = j09Var4;
            xn8 xn8VarC3 = s21.c(lx0Var2, false);
            int iHashCode3 = Long.hashCode(l46Var2.T);
            u8a u8aVarM3 = l46Var2.m();
            j09 j09VarJ3 = m93.J(l46Var2, j09VarD3);
            lf2.q.getClass();
            l46Var2.j0();
            z10 = l46Var2.S;
            ov7Var = LayoutNode.h1;
            if (z10) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var5 = hj6.z;
            dec.l(he2Var5, l46Var2, xn8VarC3);
            he2 he2Var6 = hj6.y;
            dec.l(he2Var6, l46Var2, u8aVarM3);
            Integer numValueOf2 = Integer.valueOf(iHashCode3);
            he2 he2Var7 = hj6.X;
            dec.l(he2Var7, l46Var2, numValueOf2);
            dec.k(l46Var2);
            he2 he2Var8 = hj6.x;
            dec.l(he2Var8, l46Var2, j09VarJ3);
            if (z9) {
                j09VarI = od4.i(j09VarI, ((yi4) h0eVarA.getValue()).a);
            }
            j09 j09VarD4 = fillElement2.D(j09VarI);
            xn8 xn8VarC4 = s21.c(lx0Var2, false);
            int iHashCode4 = Long.hashCode(l46Var2.T);
            u8a u8aVarM4 = l46Var2.m();
            j09 j09VarJ4 = m93.J(l46Var2, j09VarD4);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var5, l46Var2, xn8VarC4);
            dec.l(he2Var6, l46Var2, u8aVarM4);
            ib8.s(iHashCode4, l46Var2, he2Var7, l46Var2);
            dec.l(he2Var8, l46Var2, j09VarJ4);
            dd2Var.t(d31.a, obj2, l46Var2, Integer.valueOf(6 | ((i4 >> 18) & 896)));
            l46Var2.r(true);
            m93.d(z5, null, rw4.f(T(300, 0, null, 6), 2), rw4.g(T(300, 0, null, 6), 2), null, af1.b0(142283724, new fp4(0, f3), l46Var2), l46Var, 200064, 18);
            l46Var2 = l46Var;
            if ((i4 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            objR5 = l46Var2.R();
            if (z11) {
                num3 = num;
                objR5 = new j8((Object) num3, e89Var4, (Object) e89Var5, 29);
                l46Var2.p0(objR5);
            } else {
                num3 = num;
                objR5 = new j8((Object) num3, e89Var4, (Object) e89Var5, 29);
                l46Var2.p0(objR5);
            }
            g21.e(sddVar, null, xw9Var, num3, z5, a26Var, l26Var, (x16) objR5, l46Var2, i4 & 4136846);
            z3 = z;
            rfc.n(z3, l46Var2, (i4 >> 12) & 14, 2);
            l46Var2.r(true);
            j09Var3 = j09Var6;
        } else {
            z3 = z;
            l46Var2.Z();
            j09Var3 = j09Var2;
        }
        ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b61(sddVar, j09Var3, xw9Var, num, z3, a26Var, l26Var, x16Var, dd2Var, i2, i3);
        }
    }

    public static final void f(x16 x16Var, x16 x16Var2, l46 l46Var, int i2) {
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(826810817);
        int i3 = (l46Var.i(x16Var) ? 4 : 2) | i2 | (l46Var.i(x16Var2) ? 32 : 16);
        boolean z = false;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            bx5.a(mic.AutumnEquinox2026, af1.b0(-816922082, new b20(x16Var, x16Var2, z, 6), l46Var), l46Var, 54);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b20(i2, 7, x16Var, x16Var2);
        }
    }

    public static final void g(x16 x16Var, x16 x16Var2, l46 l46Var, int i2) {
        x16 x16Var3 = x16Var2;
        l46 l46Var2 = l46Var;
        l46Var2.h0(437781446);
        int i3 = 16;
        int i4 = i2 | (l46Var2.i(x16Var) ? 4 : 2) | (l46Var2.i(x16Var3) ? 32 : 16);
        if (l46Var2.W(i4 & 1, (i4 & 19) != 18)) {
            y6c y6cVarB = a7c.b(24.0f);
            g09 g09Var = g09.a;
            j09 j09VarG = k8b.g(tm7.o(oa7.E(b.c(g09Var, 1.0f), y6cVarB), ((m82) l46Var2.k(o82.a)).p, g21.f), new ie2(i3), l46Var2, 0);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarG);
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
            j09 j09VarZ = ynb.Z(b.c(g09Var, 1.0f), 32.0f);
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var2, 48);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarZ);
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
            String strQ = afc.q(R.string.four_seasons_notify_popup_title, l46Var2);
            mue mueVar = pue.a;
            nte.b(strQ, null, l8b.b(l46Var2), 0L, null, ((y8b) l46Var2.k(x8b.a)).a, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.n(l46Var2), l46Var2, 0, 0, 129914);
            nte.b(ks0.h(8.0f, R.string.four_seasons_notify_popup_desc, l46Var2, l46Var2, g09Var), null, l8b.b(l46Var2), 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.b(l46Var2), l46Var2, 0, 0, 130042);
            l46Var2 = l46Var2;
            o5c.f(l46Var2, b.d(g09Var, 16.0f));
            af1.m(mic.AutumnEquinox2026, null, a7c.b(12.0f), l8b.i(l46Var2), x57.b(l8b.m(l46Var2), 0.5f), l46Var2, 6, 2);
            c8b.i(b.b(0.0f, 56.0f, kv2.e(g09Var, 24.0f, l46Var2, g09Var, 1.0f), 1), afc.q(R.string.four_seasons_notify_popup_confirm, l46Var2), null, null, 0L, 0.0f, false, null, bx5.c(l46Var2), false, null, null, x16Var, l46Var2, 6, (i4 << 6) & 896, 3836);
            l46Var2.r(true);
            c8b.h(ynb.d0(0.0f, 9.0f, 9.0f, 0.0f, 9, d31.a.a(g09Var, ndb.d)), false, 0L, l8b.e(l46Var2), null, x16Var2, l46Var2, (i4 << 12) & 458752, 22);
            x16Var3 = x16Var2;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b20(i2, 8, x16Var, x16Var3);
        }
    }

    public static final void h(int i2, x16 x16Var, x16 x16Var2, l46 l46Var, boolean z) {
        int i3;
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(-2146322226);
        int i4 = 4;
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
        boolean z2 = false;
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            Context context = (Context) l46Var.k(uq.b);
            uo uoVarY = null;
            if (z) {
                l46Var.f0(-1907066898);
                Object objR = l46Var.R();
                i8c i8cVar = sf2.a;
                if (objR == i8cVar) {
                    objR = new ei9("four_seasons_intro", "seasonal_fortune", null);
                    l46Var.p0(objR);
                }
                ei9 ei9Var = (ei9) objR;
                Object objR2 = l46Var.R();
                if (objR2 == i8cVar) {
                    objR2 = new mz4(25);
                    l46Var.p0(objR2);
                }
                uoVarY = oa7.Y(ei9Var, (x16) objR2, l46Var, 48);
                l46Var.r(false);
            } else {
                l46Var.f0(-1906870234);
                l46Var.r(false);
            }
            t72.b(x16Var2, new s84(z2, z2, i4), af1.b0(-1882204969, new q8(19, x16Var, uoVarY, context, x16Var2), l46Var), l46Var, ((i3 >> 6) & 14) | 432, 0);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new e21(z, x16Var, x16Var2, i2, 4);
        }
    }

    public static final void i(x48 x48Var, a26 a26Var, x16 x16Var, l46 l46Var, int i2) {
        l46Var.h0(-1868327245);
        int i3 = (l46Var.i(x48Var) ? 4 : 2) | i2 | (l46Var.i(a26Var) ? 32 : 16) | (l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        int i4 = 0;
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            boolean zI = ((i3 & 112) == 32) | l46Var.i(x48Var) | ((i3 & 896) == 256);
            Object objR = l46Var.R();
            if (zI || objR == sf2.a) {
                objR = new w6(x48Var, a26Var, x16Var, i4);
                l46Var.p0(objR);
            }
            af1.g(x48Var, (a26) objR, l46Var);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new x6(i2, x48Var, a26Var, x16Var, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0151  */
    /* JADX WARN: Code duplicated, block: B:104:0x0184  */
    /* JADX WARN: Code duplicated, block: B:108:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:110:0x0205  */
    /* JADX WARN: Code duplicated, block: B:113:0x0223  */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    /* JADX WARN: Code duplicated, block: B:47:0x008c  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00db  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:84:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x011d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0120  */
    /* JADX WARN: Code duplicated, block: B:89:0x0131  */
    /* JADX WARN: Code duplicated, block: B:90:0x0133  */
    /* JADX WARN: Code duplicated, block: B:92:0x0137  */
    /* JADX WARN: Code duplicated, block: B:94:0x013a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0141  */
    public static final void j(final use useVar, j09 j09Var, boolean z, mue mueVar, rpe rpeVar, n26 n26Var, l26 l26Var, l26 l26Var2, wo7 wo7Var, ype ypeVar, ghc ghcVar, x4d x4dVar, wne wneVar, xw9 xw9Var, l46 l46Var, final int i2, final int i3, final int i4) {
        j09 j09Var2;
        int i5;
        int i6;
        int i7;
        int i8;
        l26 l26Var3;
        int i9;
        int i10;
        int i11;
        int i12;
        l26 l26Var4;
        int i13;
        int i14;
        ype ypeVar2;
        x4d x4dVarB;
        boolean z2;
        final boolean z3;
        final rpe rpeVar2;
        final wo7 wo7Var2;
        final wne wneVar2;
        final x4d x4dVar2;
        final j09 j09Var3;
        final l26 l26Var5;
        final l26 l26Var6;
        final ype ypeVar3;
        final mue mueVar2;
        final n26 n26Var2;
        final ghc ghcVar2;
        final xw9 bx9Var;
        ojb ojbVarV;
        j09 j09Var4;
        mue mueVar3;
        n26 n26Var3;
        x4d x4dVar3;
        wo7 wo7Var3;
        ghc ghcVar3;
        l26 l26Var7;
        boolean z4;
        j09 j09Var5;
        rpe rpeVar3;
        n26 n26Var4;
        wne wneVarR0;
        l26 l26Var8;
        Object objR;
        t69 t69Var;
        long jC;
        l46Var.h0(-2007078942);
        int i15 = i2 | (l46Var.g(useVar) ? 4 : 2);
        int i16 = i4 & 2;
        if (i16 == 0) {
            if ((i2 & 48) == 0) {
                j09Var2 = j09Var;
                i15 |= l46Var.g(j09Var2) ? 32 : 16;
            }
            i5 = 77184 | i15;
            i6 = i4 & 64;
            if (i6 != 0) {
                if ((i2 & 1572864) == 0) {
                    if (l46Var.i(n26Var)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i5 |= i7;
                }
                i8 = i4 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                if (i8 != 0) {
                    if ((i2 & 12582912) == 0) {
                        l26Var3 = l26Var;
                        if (l46Var.i(l26Var3)) {
                            i9 = 8388608;
                        } else {
                            i9 = 4194304;
                        }
                        i5 |= i9;
                    }
                    i10 = i5 | 905969664;
                    i11 = i3 | 6;
                    i12 = i4 & 2048;
                    if (i12 != 0) {
                        if ((i3 & 48) == 0) {
                            l26Var4 = l26Var2;
                            if (l46Var.i(l26Var4)) {
                                i13 = 32;
                            } else {
                                i13 = 16;
                            }
                            i11 |= i13;
                        }
                        i14 = i11 | 14380416;
                        if ((i3 & 100663296) == 0) {
                            if ((i4 & 262144) == 0) {
                                ypeVar2 = ypeVar;
                                int i17 = l46Var.g(ypeVar2) ? 67108864 : 33554432;
                                i14 |= i17;
                            } else {
                                ypeVar2 = ypeVar;
                            }
                            i14 |= i17;
                        } else {
                            ypeVar2 = ypeVar;
                        }
                        int i18 = i14 | 805306368;
                        x4dVarB = x4dVar;
                        int i19 = (((i4 & 2097152) == 0 || !l46Var.g(x4dVarB)) ? (char) 16 : ' ') | 25730;
                        if ((i10 & 306783379) != 306783378 && (i18 & 306783379) == 306783378 && (i19 & 9363) == 9362) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (l46Var.W(i10 & 1, z2)) {
                            l46Var.b0();
                            if ((i2 & 1) != 0 || l46Var.C()) {
                                if (i16 != 0) {
                                    j09Var4 = g09.a;
                                } else {
                                    j09Var4 = j09Var2;
                                }
                                mueVar3 = (mue) l46Var.k(nte.a);
                                rpe rpeVar4 = new rpe();
                                if (i6 != 0) {
                                    n26Var3 = null;
                                } else {
                                    n26Var3 = n26Var;
                                }
                                if (i8 != 0) {
                                    l26Var3 = null;
                                }
                                if (i12 != 0) {
                                    l26Var4 = null;
                                }
                                wo7 wo7Var4 = wo7.g;
                                if ((i4 & 262144) != 0) {
                                    ype.c0.getClass();
                                    ypeVar2 = wpe.b;
                                }
                                ghc ghcVarT = mh3.T(l46Var);
                                if ((i4 & 2097152) != 0) {
                                    x4dVarB = u5d.b(bm8.e, l46Var);
                                }
                                x4dVar3 = x4dVarB;
                                wo7Var3 = wo7Var4;
                                ghcVar3 = ghcVarT;
                                l26Var7 = l26Var4;
                                z4 = true;
                                j09Var5 = j09Var4;
                                rpeVar3 = rpeVar4;
                                n26Var4 = n26Var3;
                                wneVarR0 = qk6.r0(6, l46Var);
                                bx9Var = new bx9(16.0f, 16.0f, 16.0f, 16.0f);
                                ypeVar3 = ypeVar2;
                                l26Var8 = l26Var3;
                            } else {
                                l46Var.Z();
                                z4 = z;
                                mueVar3 = mueVar;
                                n26Var4 = n26Var;
                                wo7Var3 = wo7Var;
                                ghcVar3 = ghcVar;
                                wneVarR0 = wneVar;
                                x4dVar3 = x4dVarB;
                                j09Var5 = j09Var2;
                                l26Var7 = l26Var4;
                                rpeVar3 = rpeVar;
                                bx9Var = xw9Var;
                                l26Var8 = l26Var3;
                                ypeVar3 = ypeVar2;
                            }
                            l46Var.s();
                            l46Var.f0(1647415065);
                            objR = l46Var.R();
                            if (objR == sf2.a) {
                                objR = ib8.e(l46Var);
                            }
                            t69Var = (t69) objR;
                            l46Var.r(false);
                            l46Var.f0(-362494116);
                            jC = mueVar3.c();
                            if (jC == 16) {
                                jC = wneVarR0.d(z4, false, ((Boolean) z7f.w(t69Var, l46Var, 0).getValue()).booleanValue());
                            }
                            long j2 = jC;
                            l46Var.r(false);
                            mh3.a(iue.a.a(wneVarR0.k), af1.b0(-416142558, new et9(j09Var5, n26Var4, rpeVar3, wneVarR0, useVar, z4, ypeVar3, t69Var, l26Var8, l26Var7, bx9Var, mueVar3.e(new mue(j2, 0L, null, null, null, 0L, 0L, 0, 0, 0L, null, null, 16777214)), wo7Var3, ghcVar3, x4dVar3), l46Var), l46Var, 56);
                            j09 j09Var6 = j09Var5;
                            mueVar2 = mueVar3;
                            j09Var3 = j09Var6;
                            rpe rpeVar5 = rpeVar3;
                            n26Var2 = n26Var4;
                            rpeVar2 = rpeVar5;
                            z3 = z4;
                            l26Var6 = l26Var7;
                            wo7Var2 = wo7Var3;
                            ghcVar2 = ghcVar3;
                            wneVar2 = wneVarR0;
                            l26Var5 = l26Var8;
                            x4dVar2 = x4dVar3;
                        } else {
                            l46Var.Z();
                            z3 = z;
                            rpeVar2 = rpeVar;
                            wo7Var2 = wo7Var;
                            wneVar2 = wneVar;
                            x4dVar2 = x4dVarB;
                            j09Var3 = j09Var2;
                            l26Var5 = l26Var3;
                            l26Var6 = l26Var4;
                            ypeVar3 = ypeVar2;
                            mueVar2 = mueVar;
                            n26Var2 = n26Var;
                            ghcVar2 = ghcVar;
                            bx9Var = xw9Var;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new l26() { // from class: ys9
                                @Override // defpackage.l26
                                public final Object z(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iP = k99.P(i2 | 1);
                                    int iP2 = k99.P(i3);
                                    b21.j(useVar, j09Var3, z3, mueVar2, rpeVar2, n26Var2, l26Var5, l26Var6, wo7Var2, ypeVar3, ghcVar2, x4dVar2, wneVar2, bx9Var, (l46) obj, iP, iP2, i4);
                                    return wef.a;
                                }
                            };
                        }
                    }
                    i11 = i3 | 54;
                    l26Var4 = l26Var2;
                    i14 = i11 | 14380416;
                    if ((i3 & 100663296) == 0) {
                        if ((i4 & 262144) == 0) {
                            ypeVar2 = ypeVar;
                            if (l46Var.g(ypeVar2)) {
                            }
                            i14 |= i17;
                        } else {
                            ypeVar2 = ypeVar;
                        }
                        i14 |= i17;
                    } else {
                        ypeVar2 = ypeVar;
                    }
                    int i110 = i14 | 805306368;
                    x4dVarB = x4dVar;
                    int i111 = (((i4 & 2097152) == 0 || !l46Var.g(x4dVarB)) ? (char) 16 : ' ') | 25730;
                    if ((i10 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (l46Var.W(i10 & 1, z2)) {
                        l46Var.b0();
                        if ((i2 & 1) != 0) {
                            if (i16 != 0) {
                                j09Var4 = g09.a;
                            } else {
                                j09Var4 = j09Var2;
                            }
                            mueVar3 = (mue) l46Var.k(nte.a);
                            rpe rpeVar6 = new rpe();
                            if (i6 != 0) {
                                n26Var3 = null;
                            } else {
                                n26Var3 = n26Var;
                            }
                            if (i8 != 0) {
                                l26Var3 = null;
                            }
                            if (i12 != 0) {
                                l26Var4 = null;
                            }
                            wo7 wo7Var5 = wo7.g;
                            if ((i4 & 262144) != 0) {
                                ype.c0.getClass();
                                ypeVar2 = wpe.b;
                            }
                            ghc ghcVarT2 = mh3.T(l46Var);
                            if ((i4 & 2097152) != 0) {
                                x4dVarB = u5d.b(bm8.e, l46Var);
                            }
                            x4dVar3 = x4dVarB;
                            wo7Var3 = wo7Var5;
                            ghcVar3 = ghcVarT2;
                            l26Var7 = l26Var4;
                            z4 = true;
                            j09Var5 = j09Var4;
                            rpeVar3 = rpeVar6;
                            n26Var4 = n26Var3;
                            wneVarR0 = qk6.r0(6, l46Var);
                            bx9Var = new bx9(16.0f, 16.0f, 16.0f, 16.0f);
                            ypeVar3 = ypeVar2;
                            l26Var8 = l26Var3;
                        } else {
                            if (i16 != 0) {
                                j09Var4 = g09.a;
                            } else {
                                j09Var4 = j09Var2;
                            }
                            mueVar3 = (mue) l46Var.k(nte.a);
                            rpe rpeVar7 = new rpe();
                            if (i6 != 0) {
                                n26Var3 = null;
                            } else {
                                n26Var3 = n26Var;
                            }
                            if (i8 != 0) {
                                l26Var3 = null;
                            }
                            if (i12 != 0) {
                                l26Var4 = null;
                            }
                            wo7 wo7Var6 = wo7.g;
                            if ((i4 & 262144) != 0) {
                                ype.c0.getClass();
                                ypeVar2 = wpe.b;
                            }
                            ghc ghcVarT3 = mh3.T(l46Var);
                            if ((i4 & 2097152) != 0) {
                                x4dVarB = u5d.b(bm8.e, l46Var);
                            }
                            x4dVar3 = x4dVarB;
                            wo7Var3 = wo7Var6;
                            ghcVar3 = ghcVarT3;
                            l26Var7 = l26Var4;
                            z4 = true;
                            j09Var5 = j09Var4;
                            rpeVar3 = rpeVar7;
                            n26Var4 = n26Var3;
                            wneVarR0 = qk6.r0(6, l46Var);
                            bx9Var = new bx9(16.0f, 16.0f, 16.0f, 16.0f);
                            ypeVar3 = ypeVar2;
                            l26Var8 = l26Var3;
                        }
                        l46Var.s();
                        l46Var.f0(1647415065);
                        objR = l46Var.R();
                        if (objR == sf2.a) {
                            objR = ib8.e(l46Var);
                        }
                        t69Var = (t69) objR;
                        l46Var.r(false);
                        l46Var.f0(-362494116);
                        jC = mueVar3.c();
                        if (jC == 16) {
                            jC = wneVarR0.d(z4, false, ((Boolean) z7f.w(t69Var, l46Var, 0).getValue()).booleanValue());
                        }
                        long j3 = jC;
                        l46Var.r(false);
                        mh3.a(iue.a.a(wneVarR0.k), af1.b0(-416142558, new et9(j09Var5, n26Var4, rpeVar3, wneVarR0, useVar, z4, ypeVar3, t69Var, l26Var8, l26Var7, bx9Var, mueVar3.e(new mue(j3, 0L, null, null, null, 0L, 0L, 0, 0, 0L, null, null, 16777214)), wo7Var3, ghcVar3, x4dVar3), l46Var), l46Var, 56);
                        j09 j09Var7 = j09Var5;
                        mueVar2 = mueVar3;
                        j09Var3 = j09Var7;
                        rpe rpeVar8 = rpeVar3;
                        n26Var2 = n26Var4;
                        rpeVar2 = rpeVar8;
                        z3 = z4;
                        l26Var6 = l26Var7;
                        wo7Var2 = wo7Var3;
                        ghcVar2 = ghcVar3;
                        wneVar2 = wneVarR0;
                        l26Var5 = l26Var8;
                        x4dVar2 = x4dVar3;
                    } else {
                        l46Var.Z();
                        z3 = z;
                        rpeVar2 = rpeVar;
                        wo7Var2 = wo7Var;
                        wneVar2 = wneVar;
                        x4dVar2 = x4dVarB;
                        j09Var3 = j09Var2;
                        l26Var5 = l26Var3;
                        l26Var6 = l26Var4;
                        ypeVar3 = ypeVar2;
                        mueVar2 = mueVar;
                        n26Var2 = n26Var;
                        ghcVar2 = ghcVar;
                        bx9Var = xw9Var;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new l26() { // from class: ys9
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iP = k99.P(i2 | 1);
                                int iP2 = k99.P(i3);
                                b21.j(useVar, j09Var3, z3, mueVar2, rpeVar2, n26Var2, l26Var5, l26Var6, wo7Var2, ypeVar3, ghcVar2, x4dVar2, wneVar2, bx9Var, (l46) obj, iP, iP2, i4);
                                return wef.a;
                            }
                        };
                    }
                }
                i5 |= 12582912;
                l26Var3 = l26Var;
                i10 = i5 | 905969664;
                i11 = i3 | 6;
                i12 = i4 & 2048;
                if (i12 != 0) {
                    if ((i3 & 48) == 0) {
                        l26Var4 = l26Var2;
                        if (l46Var.i(l26Var4)) {
                            i13 = 32;
                        } else {
                            i13 = 16;
                        }
                        i11 |= i13;
                    }
                    i14 = i11 | 14380416;
                    if ((i3 & 100663296) == 0) {
                        if ((i4 & 262144) == 0) {
                            ypeVar2 = ypeVar;
                            if (l46Var.g(ypeVar2)) {
                            }
                            i14 |= i17;
                        } else {
                            ypeVar2 = ypeVar;
                        }
                        i14 |= i17;
                    } else {
                        ypeVar2 = ypeVar;
                    }
                    int i112 = i14 | 805306368;
                    x4dVarB = x4dVar;
                    int i113 = (((i4 & 2097152) == 0 || !l46Var.g(x4dVarB)) ? (char) 16 : ' ') | 25730;
                    if ((i10 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (l46Var.W(i10 & 1, z2)) {
                        l46Var.b0();
                        if ((i2 & 1) != 0) {
                            if (i16 != 0) {
                                j09Var4 = g09.a;
                            } else {
                                j09Var4 = j09Var2;
                            }
                            mueVar3 = (mue) l46Var.k(nte.a);
                            rpe rpeVar9 = new rpe();
                            if (i6 != 0) {
                                n26Var3 = null;
                            } else {
                                n26Var3 = n26Var;
                            }
                            if (i8 != 0) {
                                l26Var3 = null;
                            }
                            if (i12 != 0) {
                                l26Var4 = null;
                            }
                            wo7 wo7Var7 = wo7.g;
                            if ((i4 & 262144) != 0) {
                                ype.c0.getClass();
                                ypeVar2 = wpe.b;
                            }
                            ghc ghcVarT4 = mh3.T(l46Var);
                            if ((i4 & 2097152) != 0) {
                                x4dVarB = u5d.b(bm8.e, l46Var);
                            }
                            x4dVar3 = x4dVarB;
                            wo7Var3 = wo7Var7;
                            ghcVar3 = ghcVarT4;
                            l26Var7 = l26Var4;
                            z4 = true;
                            j09Var5 = j09Var4;
                            rpeVar3 = rpeVar9;
                            n26Var4 = n26Var3;
                            wneVarR0 = qk6.r0(6, l46Var);
                            bx9Var = new bx9(16.0f, 16.0f, 16.0f, 16.0f);
                            ypeVar3 = ypeVar2;
                            l26Var8 = l26Var3;
                        } else {
                            if (i16 != 0) {
                                j09Var4 = g09.a;
                            } else {
                                j09Var4 = j09Var2;
                            }
                            mueVar3 = (mue) l46Var.k(nte.a);
                            rpe rpeVar10 = new rpe();
                            if (i6 != 0) {
                                n26Var3 = null;
                            } else {
                                n26Var3 = n26Var;
                            }
                            if (i8 != 0) {
                                l26Var3 = null;
                            }
                            if (i12 != 0) {
                                l26Var4 = null;
                            }
                            wo7 wo7Var8 = wo7.g;
                            if ((i4 & 262144) != 0) {
                                ype.c0.getClass();
                                ypeVar2 = wpe.b;
                            }
                            ghc ghcVarT5 = mh3.T(l46Var);
                            if ((i4 & 2097152) != 0) {
                                x4dVarB = u5d.b(bm8.e, l46Var);
                            }
                            x4dVar3 = x4dVarB;
                            wo7Var3 = wo7Var8;
                            ghcVar3 = ghcVarT5;
                            l26Var7 = l26Var4;
                            z4 = true;
                            j09Var5 = j09Var4;
                            rpeVar3 = rpeVar10;
                            n26Var4 = n26Var3;
                            wneVarR0 = qk6.r0(6, l46Var);
                            bx9Var = new bx9(16.0f, 16.0f, 16.0f, 16.0f);
                            ypeVar3 = ypeVar2;
                            l26Var8 = l26Var3;
                        }
                        l46Var.s();
                        l46Var.f0(1647415065);
                        objR = l46Var.R();
                        if (objR == sf2.a) {
                            objR = ib8.e(l46Var);
                        }
                        t69Var = (t69) objR;
                        l46Var.r(false);
                        l46Var.f0(-362494116);
                        jC = mueVar3.c();
                        if (jC == 16) {
                            jC = wneVarR0.d(z4, false, ((Boolean) z7f.w(t69Var, l46Var, 0).getValue()).booleanValue());
                        }
                        long j4 = jC;
                        l46Var.r(false);
                        mh3.a(iue.a.a(wneVarR0.k), af1.b0(-416142558, new et9(j09Var5, n26Var4, rpeVar3, wneVarR0, useVar, z4, ypeVar3, t69Var, l26Var8, l26Var7, bx9Var, mueVar3.e(new mue(j4, 0L, null, null, null, 0L, 0L, 0, 0, 0L, null, null, 16777214)), wo7Var3, ghcVar3, x4dVar3), l46Var), l46Var, 56);
                        j09 j09Var8 = j09Var5;
                        mueVar2 = mueVar3;
                        j09Var3 = j09Var8;
                        rpe rpeVar11 = rpeVar3;
                        n26Var2 = n26Var4;
                        rpeVar2 = rpeVar11;
                        z3 = z4;
                        l26Var6 = l26Var7;
                        wo7Var2 = wo7Var3;
                        ghcVar2 = ghcVar3;
                        wneVar2 = wneVarR0;
                        l26Var5 = l26Var8;
                        x4dVar2 = x4dVar3;
                    } else {
                        l46Var.Z();
                        z3 = z;
                        rpeVar2 = rpeVar;
                        wo7Var2 = wo7Var;
                        wneVar2 = wneVar;
                        x4dVar2 = x4dVarB;
                        j09Var3 = j09Var2;
                        l26Var5 = l26Var3;
                        l26Var6 = l26Var4;
                        ypeVar3 = ypeVar2;
                        mueVar2 = mueVar;
                        n26Var2 = n26Var;
                        ghcVar2 = ghcVar;
                        bx9Var = xw9Var;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new l26() { // from class: ys9
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iP = k99.P(i2 | 1);
                                int iP2 = k99.P(i3);
                                b21.j(useVar, j09Var3, z3, mueVar2, rpeVar2, n26Var2, l26Var5, l26Var6, wo7Var2, ypeVar3, ghcVar2, x4dVar2, wneVar2, bx9Var, (l46) obj, iP, iP2, i4);
                                return wef.a;
                            }
                        };
                    }
                }
                i11 = i3 | 54;
                l26Var4 = l26Var2;
                i14 = i11 | 14380416;
                if ((i3 & 100663296) == 0) {
                    if ((i4 & 262144) == 0) {
                        ypeVar2 = ypeVar;
                        if (l46Var.g(ypeVar2)) {
                        }
                        i14 |= i17;
                    } else {
                        ypeVar2 = ypeVar;
                    }
                    i14 |= i17;
                } else {
                    ypeVar2 = ypeVar;
                }
                int i114 = i14 | 805306368;
                x4dVarB = x4dVar;
                int i115 = (((i4 & 2097152) == 0 || !l46Var.g(x4dVarB)) ? (char) 16 : ' ') | 25730;
                if ((i10 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (l46Var.W(i10 & 1, z2)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if (i16 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        mueVar3 = (mue) l46Var.k(nte.a);
                        rpe rpeVar12 = new rpe();
                        if (i6 != 0) {
                            n26Var3 = null;
                        } else {
                            n26Var3 = n26Var;
                        }
                        if (i8 != 0) {
                            l26Var3 = null;
                        }
                        if (i12 != 0) {
                            l26Var4 = null;
                        }
                        wo7 wo7Var9 = wo7.g;
                        if ((i4 & 262144) != 0) {
                            ype.c0.getClass();
                            ypeVar2 = wpe.b;
                        }
                        ghc ghcVarT6 = mh3.T(l46Var);
                        if ((i4 & 2097152) != 0) {
                            x4dVarB = u5d.b(bm8.e, l46Var);
                        }
                        x4dVar3 = x4dVarB;
                        wo7Var3 = wo7Var9;
                        ghcVar3 = ghcVarT6;
                        l26Var7 = l26Var4;
                        z4 = true;
                        j09Var5 = j09Var4;
                        rpeVar3 = rpeVar12;
                        n26Var4 = n26Var3;
                        wneVarR0 = qk6.r0(6, l46Var);
                        bx9Var = new bx9(16.0f, 16.0f, 16.0f, 16.0f);
                        ypeVar3 = ypeVar2;
                        l26Var8 = l26Var3;
                    } else {
                        if (i16 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        mueVar3 = (mue) l46Var.k(nte.a);
                        rpe rpeVar13 = new rpe();
                        if (i6 != 0) {
                            n26Var3 = null;
                        } else {
                            n26Var3 = n26Var;
                        }
                        if (i8 != 0) {
                            l26Var3 = null;
                        }
                        if (i12 != 0) {
                            l26Var4 = null;
                        }
                        wo7 wo7Var10 = wo7.g;
                        if ((i4 & 262144) != 0) {
                            ype.c0.getClass();
                            ypeVar2 = wpe.b;
                        }
                        ghc ghcVarT7 = mh3.T(l46Var);
                        if ((i4 & 2097152) != 0) {
                            x4dVarB = u5d.b(bm8.e, l46Var);
                        }
                        x4dVar3 = x4dVarB;
                        wo7Var3 = wo7Var10;
                        ghcVar3 = ghcVarT7;
                        l26Var7 = l26Var4;
                        z4 = true;
                        j09Var5 = j09Var4;
                        rpeVar3 = rpeVar13;
                        n26Var4 = n26Var3;
                        wneVarR0 = qk6.r0(6, l46Var);
                        bx9Var = new bx9(16.0f, 16.0f, 16.0f, 16.0f);
                        ypeVar3 = ypeVar2;
                        l26Var8 = l26Var3;
                    }
                    l46Var.s();
                    l46Var.f0(1647415065);
                    objR = l46Var.R();
                    if (objR == sf2.a) {
                        objR = ib8.e(l46Var);
                    }
                    t69Var = (t69) objR;
                    l46Var.r(false);
                    l46Var.f0(-362494116);
                    jC = mueVar3.c();
                    if (jC == 16) {
                        jC = wneVarR0.d(z4, false, ((Boolean) z7f.w(t69Var, l46Var, 0).getValue()).booleanValue());
                    }
                    long j5 = jC;
                    l46Var.r(false);
                    mh3.a(iue.a.a(wneVarR0.k), af1.b0(-416142558, new et9(j09Var5, n26Var4, rpeVar3, wneVarR0, useVar, z4, ypeVar3, t69Var, l26Var8, l26Var7, bx9Var, mueVar3.e(new mue(j5, 0L, null, null, null, 0L, 0L, 0, 0, 0L, null, null, 16777214)), wo7Var3, ghcVar3, x4dVar3), l46Var), l46Var, 56);
                    j09 j09Var9 = j09Var5;
                    mueVar2 = mueVar3;
                    j09Var3 = j09Var9;
                    rpe rpeVar14 = rpeVar3;
                    n26Var2 = n26Var4;
                    rpeVar2 = rpeVar14;
                    z3 = z4;
                    l26Var6 = l26Var7;
                    wo7Var2 = wo7Var3;
                    ghcVar2 = ghcVar3;
                    wneVar2 = wneVarR0;
                    l26Var5 = l26Var8;
                    x4dVar2 = x4dVar3;
                } else {
                    l46Var.Z();
                    z3 = z;
                    rpeVar2 = rpeVar;
                    wo7Var2 = wo7Var;
                    wneVar2 = wneVar;
                    x4dVar2 = x4dVarB;
                    j09Var3 = j09Var2;
                    l26Var5 = l26Var3;
                    l26Var6 = l26Var4;
                    ypeVar3 = ypeVar2;
                    mueVar2 = mueVar;
                    n26Var2 = n26Var;
                    ghcVar2 = ghcVar;
                    bx9Var = xw9Var;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: ys9
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = k99.P(i2 | 1);
                            int iP2 = k99.P(i3);
                            b21.j(useVar, j09Var3, z3, mueVar2, rpeVar2, n26Var2, l26Var5, l26Var6, wo7Var2, ypeVar3, ghcVar2, x4dVar2, wneVar2, bx9Var, (l46) obj, iP, iP2, i4);
                            return wef.a;
                        }
                    };
                }
            }
            i5 = 1650048 | i15;
            i8 = i4 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (i8 != 0) {
                if ((i2 & 12582912) == 0) {
                    l26Var3 = l26Var;
                    if (l46Var.i(l26Var3)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i5 |= i9;
                }
                i10 = i5 | 905969664;
                i11 = i3 | 6;
                i12 = i4 & 2048;
                if (i12 != 0) {
                    if ((i3 & 48) == 0) {
                        l26Var4 = l26Var2;
                        if (l46Var.i(l26Var4)) {
                            i13 = 32;
                        } else {
                            i13 = 16;
                        }
                        i11 |= i13;
                    }
                    i14 = i11 | 14380416;
                    if ((i3 & 100663296) == 0) {
                        if ((i4 & 262144) == 0) {
                            ypeVar2 = ypeVar;
                            if (l46Var.g(ypeVar2)) {
                            }
                            i14 |= i17;
                        } else {
                            ypeVar2 = ypeVar;
                        }
                        i14 |= i17;
                    } else {
                        ypeVar2 = ypeVar;
                    }
                    int i116 = i14 | 805306368;
                    x4dVarB = x4dVar;
                    int i117 = (((i4 & 2097152) == 0 || !l46Var.g(x4dVarB)) ? (char) 16 : ' ') | 25730;
                    if ((i10 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (l46Var.W(i10 & 1, z2)) {
                        l46Var.b0();
                        if ((i2 & 1) != 0) {
                            if (i16 != 0) {
                                j09Var4 = g09.a;
                            } else {
                                j09Var4 = j09Var2;
                            }
                            mueVar3 = (mue) l46Var.k(nte.a);
                            rpe rpeVar15 = new rpe();
                            if (i6 != 0) {
                                n26Var3 = null;
                            } else {
                                n26Var3 = n26Var;
                            }
                            if (i8 != 0) {
                                l26Var3 = null;
                            }
                            if (i12 != 0) {
                                l26Var4 = null;
                            }
                            wo7 wo7Var11 = wo7.g;
                            if ((i4 & 262144) != 0) {
                                ype.c0.getClass();
                                ypeVar2 = wpe.b;
                            }
                            ghc ghcVarT8 = mh3.T(l46Var);
                            if ((i4 & 2097152) != 0) {
                                x4dVarB = u5d.b(bm8.e, l46Var);
                            }
                            x4dVar3 = x4dVarB;
                            wo7Var3 = wo7Var11;
                            ghcVar3 = ghcVarT8;
                            l26Var7 = l26Var4;
                            z4 = true;
                            j09Var5 = j09Var4;
                            rpeVar3 = rpeVar15;
                            n26Var4 = n26Var3;
                            wneVarR0 = qk6.r0(6, l46Var);
                            bx9Var = new bx9(16.0f, 16.0f, 16.0f, 16.0f);
                            ypeVar3 = ypeVar2;
                            l26Var8 = l26Var3;
                        } else {
                            if (i16 != 0) {
                                j09Var4 = g09.a;
                            } else {
                                j09Var4 = j09Var2;
                            }
                            mueVar3 = (mue) l46Var.k(nte.a);
                            rpe rpeVar16 = new rpe();
                            if (i6 != 0) {
                                n26Var3 = null;
                            } else {
                                n26Var3 = n26Var;
                            }
                            if (i8 != 0) {
                                l26Var3 = null;
                            }
                            if (i12 != 0) {
                                l26Var4 = null;
                            }
                            wo7 wo7Var12 = wo7.g;
                            if ((i4 & 262144) != 0) {
                                ype.c0.getClass();
                                ypeVar2 = wpe.b;
                            }
                            ghc ghcVarT9 = mh3.T(l46Var);
                            if ((i4 & 2097152) != 0) {
                                x4dVarB = u5d.b(bm8.e, l46Var);
                            }
                            x4dVar3 = x4dVarB;
                            wo7Var3 = wo7Var12;
                            ghcVar3 = ghcVarT9;
                            l26Var7 = l26Var4;
                            z4 = true;
                            j09Var5 = j09Var4;
                            rpeVar3 = rpeVar16;
                            n26Var4 = n26Var3;
                            wneVarR0 = qk6.r0(6, l46Var);
                            bx9Var = new bx9(16.0f, 16.0f, 16.0f, 16.0f);
                            ypeVar3 = ypeVar2;
                            l26Var8 = l26Var3;
                        }
                        l46Var.s();
                        l46Var.f0(1647415065);
                        objR = l46Var.R();
                        if (objR == sf2.a) {
                            objR = ib8.e(l46Var);
                        }
                        t69Var = (t69) objR;
                        l46Var.r(false);
                        l46Var.f0(-362494116);
                        jC = mueVar3.c();
                        if (jC == 16) {
                            jC = wneVarR0.d(z4, false, ((Boolean) z7f.w(t69Var, l46Var, 0).getValue()).booleanValue());
                        }
                        long j6 = jC;
                        l46Var.r(false);
                        mh3.a(iue.a.a(wneVarR0.k), af1.b0(-416142558, new et9(j09Var5, n26Var4, rpeVar3, wneVarR0, useVar, z4, ypeVar3, t69Var, l26Var8, l26Var7, bx9Var, mueVar3.e(new mue(j6, 0L, null, null, null, 0L, 0L, 0, 0, 0L, null, null, 16777214)), wo7Var3, ghcVar3, x4dVar3), l46Var), l46Var, 56);
                        j09 j09Var10 = j09Var5;
                        mueVar2 = mueVar3;
                        j09Var3 = j09Var10;
                        rpe rpeVar17 = rpeVar3;
                        n26Var2 = n26Var4;
                        rpeVar2 = rpeVar17;
                        z3 = z4;
                        l26Var6 = l26Var7;
                        wo7Var2 = wo7Var3;
                        ghcVar2 = ghcVar3;
                        wneVar2 = wneVarR0;
                        l26Var5 = l26Var8;
                        x4dVar2 = x4dVar3;
                    } else {
                        l46Var.Z();
                        z3 = z;
                        rpeVar2 = rpeVar;
                        wo7Var2 = wo7Var;
                        wneVar2 = wneVar;
                        x4dVar2 = x4dVarB;
                        j09Var3 = j09Var2;
                        l26Var5 = l26Var3;
                        l26Var6 = l26Var4;
                        ypeVar3 = ypeVar2;
                        mueVar2 = mueVar;
                        n26Var2 = n26Var;
                        ghcVar2 = ghcVar;
                        bx9Var = xw9Var;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new l26() { // from class: ys9
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iP = k99.P(i2 | 1);
                                int iP2 = k99.P(i3);
                                b21.j(useVar, j09Var3, z3, mueVar2, rpeVar2, n26Var2, l26Var5, l26Var6, wo7Var2, ypeVar3, ghcVar2, x4dVar2, wneVar2, bx9Var, (l46) obj, iP, iP2, i4);
                                return wef.a;
                            }
                        };
                    }
                }
                i11 = i3 | 54;
                l26Var4 = l26Var2;
                i14 = i11 | 14380416;
                if ((i3 & 100663296) == 0) {
                    if ((i4 & 262144) == 0) {
                        ypeVar2 = ypeVar;
                        if (l46Var.g(ypeVar2)) {
                        }
                        i14 |= i17;
                    } else {
                        ypeVar2 = ypeVar;
                    }
                    i14 |= i17;
                } else {
                    ypeVar2 = ypeVar;
                }
                int i118 = i14 | 805306368;
                x4dVarB = x4dVar;
                int i119 = (((i4 & 2097152) == 0 || !l46Var.g(x4dVarB)) ? (char) 16 : ' ') | 25730;
                if ((i10 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (l46Var.W(i10 & 1, z2)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if (i16 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        mueVar3 = (mue) l46Var.k(nte.a);
                        rpe rpeVar18 = new rpe();
                        if (i6 != 0) {
                            n26Var3 = null;
                        } else {
                            n26Var3 = n26Var;
                        }
                        if (i8 != 0) {
                            l26Var3 = null;
                        }
                        if (i12 != 0) {
                            l26Var4 = null;
                        }
                        wo7 wo7Var13 = wo7.g;
                        if ((i4 & 262144) != 0) {
                            ype.c0.getClass();
                            ypeVar2 = wpe.b;
                        }
                        ghc ghcVarT10 = mh3.T(l46Var);
                        if ((i4 & 2097152) != 0) {
                            x4dVarB = u5d.b(bm8.e, l46Var);
                        }
                        x4dVar3 = x4dVarB;
                        wo7Var3 = wo7Var13;
                        ghcVar3 = ghcVarT10;
                        l26Var7 = l26Var4;
                        z4 = true;
                        j09Var5 = j09Var4;
                        rpeVar3 = rpeVar18;
                        n26Var4 = n26Var3;
                        wneVarR0 = qk6.r0(6, l46Var);
                        bx9Var = new bx9(16.0f, 16.0f, 16.0f, 16.0f);
                        ypeVar3 = ypeVar2;
                        l26Var8 = l26Var3;
                    } else {
                        if (i16 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        mueVar3 = (mue) l46Var.k(nte.a);
                        rpe rpeVar19 = new rpe();
                        if (i6 != 0) {
                            n26Var3 = null;
                        } else {
                            n26Var3 = n26Var;
                        }
                        if (i8 != 0) {
                            l26Var3 = null;
                        }
                        if (i12 != 0) {
                            l26Var4 = null;
                        }
                        wo7 wo7Var14 = wo7.g;
                        if ((i4 & 262144) != 0) {
                            ype.c0.getClass();
                            ypeVar2 = wpe.b;
                        }
                        ghc ghcVarT11 = mh3.T(l46Var);
                        if ((i4 & 2097152) != 0) {
                            x4dVarB = u5d.b(bm8.e, l46Var);
                        }
                        x4dVar3 = x4dVarB;
                        wo7Var3 = wo7Var14;
                        ghcVar3 = ghcVarT11;
                        l26Var7 = l26Var4;
                        z4 = true;
                        j09Var5 = j09Var4;
                        rpeVar3 = rpeVar19;
                        n26Var4 = n26Var3;
                        wneVarR0 = qk6.r0(6, l46Var);
                        bx9Var = new bx9(16.0f, 16.0f, 16.0f, 16.0f);
                        ypeVar3 = ypeVar2;
                        l26Var8 = l26Var3;
                    }
                    l46Var.s();
                    l46Var.f0(1647415065);
                    objR = l46Var.R();
                    if (objR == sf2.a) {
                        objR = ib8.e(l46Var);
                    }
                    t69Var = (t69) objR;
                    l46Var.r(false);
                    l46Var.f0(-362494116);
                    jC = mueVar3.c();
                    if (jC == 16) {
                        jC = wneVarR0.d(z4, false, ((Boolean) z7f.w(t69Var, l46Var, 0).getValue()).booleanValue());
                    }
                    long j7 = jC;
                    l46Var.r(false);
                    mh3.a(iue.a.a(wneVarR0.k), af1.b0(-416142558, new et9(j09Var5, n26Var4, rpeVar3, wneVarR0, useVar, z4, ypeVar3, t69Var, l26Var8, l26Var7, bx9Var, mueVar3.e(new mue(j7, 0L, null, null, null, 0L, 0L, 0, 0, 0L, null, null, 16777214)), wo7Var3, ghcVar3, x4dVar3), l46Var), l46Var, 56);
                    j09 j09Var11 = j09Var5;
                    mueVar2 = mueVar3;
                    j09Var3 = j09Var11;
                    rpe rpeVar110 = rpeVar3;
                    n26Var2 = n26Var4;
                    rpeVar2 = rpeVar110;
                    z3 = z4;
                    l26Var6 = l26Var7;
                    wo7Var2 = wo7Var3;
                    ghcVar2 = ghcVar3;
                    wneVar2 = wneVarR0;
                    l26Var5 = l26Var8;
                    x4dVar2 = x4dVar3;
                } else {
                    l46Var.Z();
                    z3 = z;
                    rpeVar2 = rpeVar;
                    wo7Var2 = wo7Var;
                    wneVar2 = wneVar;
                    x4dVar2 = x4dVarB;
                    j09Var3 = j09Var2;
                    l26Var5 = l26Var3;
                    l26Var6 = l26Var4;
                    ypeVar3 = ypeVar2;
                    mueVar2 = mueVar;
                    n26Var2 = n26Var;
                    ghcVar2 = ghcVar;
                    bx9Var = xw9Var;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: ys9
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = k99.P(i2 | 1);
                            int iP2 = k99.P(i3);
                            b21.j(useVar, j09Var3, z3, mueVar2, rpeVar2, n26Var2, l26Var5, l26Var6, wo7Var2, ypeVar3, ghcVar2, x4dVar2, wneVar2, bx9Var, (l46) obj, iP, iP2, i4);
                            return wef.a;
                        }
                    };
                }
            }
            i5 |= 12582912;
            l26Var3 = l26Var;
            i10 = i5 | 905969664;
            i11 = i3 | 6;
            i12 = i4 & 2048;
            if (i12 != 0) {
                if ((i3 & 48) == 0) {
                    l26Var4 = l26Var2;
                    if (l46Var.i(l26Var4)) {
                        i13 = 32;
                    } else {
                        i13 = 16;
                    }
                    i11 |= i13;
                }
                i14 = i11 | 14380416;
                if ((i3 & 100663296) == 0) {
                    if ((i4 & 262144) == 0) {
                        ypeVar2 = ypeVar;
                        if (l46Var.g(ypeVar2)) {
                        }
                        i14 |= i17;
                    } else {
                        ypeVar2 = ypeVar;
                    }
                    i14 |= i17;
                } else {
                    ypeVar2 = ypeVar;
                }
                int i1110 = i14 | 805306368;
                x4dVarB = x4dVar;
                int i1111 = (((i4 & 2097152) == 0 || !l46Var.g(x4dVarB)) ? (char) 16 : ' ') | 25730;
                if ((i10 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (l46Var.W(i10 & 1, z2)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if (i16 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        mueVar3 = (mue) l46Var.k(nte.a);
                        rpe rpeVar111 = new rpe();
                        if (i6 != 0) {
                            n26Var3 = null;
                        } else {
                            n26Var3 = n26Var;
                        }
                        if (i8 != 0) {
                            l26Var3 = null;
                        }
                        if (i12 != 0) {
                            l26Var4 = null;
                        }
                        wo7 wo7Var15 = wo7.g;
                        if ((i4 & 262144) != 0) {
                            ype.c0.getClass();
                            ypeVar2 = wpe.b;
                        }
                        ghc ghcVarT12 = mh3.T(l46Var);
                        if ((i4 & 2097152) != 0) {
                            x4dVarB = u5d.b(bm8.e, l46Var);
                        }
                        x4dVar3 = x4dVarB;
                        wo7Var3 = wo7Var15;
                        ghcVar3 = ghcVarT12;
                        l26Var7 = l26Var4;
                        z4 = true;
                        j09Var5 = j09Var4;
                        rpeVar3 = rpeVar111;
                        n26Var4 = n26Var3;
                        wneVarR0 = qk6.r0(6, l46Var);
                        bx9Var = new bx9(16.0f, 16.0f, 16.0f, 16.0f);
                        ypeVar3 = ypeVar2;
                        l26Var8 = l26Var3;
                    } else {
                        if (i16 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        mueVar3 = (mue) l46Var.k(nte.a);
                        rpe rpeVar112 = new rpe();
                        if (i6 != 0) {
                            n26Var3 = null;
                        } else {
                            n26Var3 = n26Var;
                        }
                        if (i8 != 0) {
                            l26Var3 = null;
                        }
                        if (i12 != 0) {
                            l26Var4 = null;
                        }
                        wo7 wo7Var16 = wo7.g;
                        if ((i4 & 262144) != 0) {
                            ype.c0.getClass();
                            ypeVar2 = wpe.b;
                        }
                        ghc ghcVarT13 = mh3.T(l46Var);
                        if ((i4 & 2097152) != 0) {
                            x4dVarB = u5d.b(bm8.e, l46Var);
                        }
                        x4dVar3 = x4dVarB;
                        wo7Var3 = wo7Var16;
                        ghcVar3 = ghcVarT13;
                        l26Var7 = l26Var4;
                        z4 = true;
                        j09Var5 = j09Var4;
                        rpeVar3 = rpeVar112;
                        n26Var4 = n26Var3;
                        wneVarR0 = qk6.r0(6, l46Var);
                        bx9Var = new bx9(16.0f, 16.0f, 16.0f, 16.0f);
                        ypeVar3 = ypeVar2;
                        l26Var8 = l26Var3;
                    }
                    l46Var.s();
                    l46Var.f0(1647415065);
                    objR = l46Var.R();
                    if (objR == sf2.a) {
                        objR = ib8.e(l46Var);
                    }
                    t69Var = (t69) objR;
                    l46Var.r(false);
                    l46Var.f0(-362494116);
                    jC = mueVar3.c();
                    if (jC == 16) {
                        jC = wneVarR0.d(z4, false, ((Boolean) z7f.w(t69Var, l46Var, 0).getValue()).booleanValue());
                    }
                    long j8 = jC;
                    l46Var.r(false);
                    mh3.a(iue.a.a(wneVarR0.k), af1.b0(-416142558, new et9(j09Var5, n26Var4, rpeVar3, wneVarR0, useVar, z4, ypeVar3, t69Var, l26Var8, l26Var7, bx9Var, mueVar3.e(new mue(j8, 0L, null, null, null, 0L, 0L, 0, 0, 0L, null, null, 16777214)), wo7Var3, ghcVar3, x4dVar3), l46Var), l46Var, 56);
                    j09 j09Var12 = j09Var5;
                    mueVar2 = mueVar3;
                    j09Var3 = j09Var12;
                    rpe rpeVar113 = rpeVar3;
                    n26Var2 = n26Var4;
                    rpeVar2 = rpeVar113;
                    z3 = z4;
                    l26Var6 = l26Var7;
                    wo7Var2 = wo7Var3;
                    ghcVar2 = ghcVar3;
                    wneVar2 = wneVarR0;
                    l26Var5 = l26Var8;
                    x4dVar2 = x4dVar3;
                } else {
                    l46Var.Z();
                    z3 = z;
                    rpeVar2 = rpeVar;
                    wo7Var2 = wo7Var;
                    wneVar2 = wneVar;
                    x4dVar2 = x4dVarB;
                    j09Var3 = j09Var2;
                    l26Var5 = l26Var3;
                    l26Var6 = l26Var4;
                    ypeVar3 = ypeVar2;
                    mueVar2 = mueVar;
                    n26Var2 = n26Var;
                    ghcVar2 = ghcVar;
                    bx9Var = xw9Var;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: ys9
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = k99.P(i2 | 1);
                            int iP2 = k99.P(i3);
                            b21.j(useVar, j09Var3, z3, mueVar2, rpeVar2, n26Var2, l26Var5, l26Var6, wo7Var2, ypeVar3, ghcVar2, x4dVar2, wneVar2, bx9Var, (l46) obj, iP, iP2, i4);
                            return wef.a;
                        }
                    };
                }
            }
            i11 = i3 | 54;
            l26Var4 = l26Var2;
            i14 = i11 | 14380416;
            if ((i3 & 100663296) == 0) {
                if ((i4 & 262144) == 0) {
                    ypeVar2 = ypeVar;
                    if (l46Var.g(ypeVar2)) {
                    }
                    i14 |= i17;
                } else {
                    ypeVar2 = ypeVar;
                }
                i14 |= i17;
            } else {
                ypeVar2 = ypeVar;
            }
            int i1112 = i14 | 805306368;
            x4dVarB = x4dVar;
            int i1113 = (((i4 & 2097152) == 0 || !l46Var.g(x4dVarB)) ? (char) 16 : ' ') | 25730;
            if ((i10 & 306783379) != 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (l46Var.W(i10 & 1, z2)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if (i16 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    mueVar3 = (mue) l46Var.k(nte.a);
                    rpe rpeVar114 = new rpe();
                    if (i6 != 0) {
                        n26Var3 = null;
                    } else {
                        n26Var3 = n26Var;
                    }
                    if (i8 != 0) {
                        l26Var3 = null;
                    }
                    if (i12 != 0) {
                        l26Var4 = null;
                    }
                    wo7 wo7Var17 = wo7.g;
                    if ((i4 & 262144) != 0) {
                        ype.c0.getClass();
                        ypeVar2 = wpe.b;
                    }
                    ghc ghcVarT14 = mh3.T(l46Var);
                    if ((i4 & 2097152) != 0) {
                        x4dVarB = u5d.b(bm8.e, l46Var);
                    }
                    x4dVar3 = x4dVarB;
                    wo7Var3 = wo7Var17;
                    ghcVar3 = ghcVarT14;
                    l26Var7 = l26Var4;
                    z4 = true;
                    j09Var5 = j09Var4;
                    rpeVar3 = rpeVar114;
                    n26Var4 = n26Var3;
                    wneVarR0 = qk6.r0(6, l46Var);
                    bx9Var = new bx9(16.0f, 16.0f, 16.0f, 16.0f);
                    ypeVar3 = ypeVar2;
                    l26Var8 = l26Var3;
                } else {
                    if (i16 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    mueVar3 = (mue) l46Var.k(nte.a);
                    rpe rpeVar115 = new rpe();
                    if (i6 != 0) {
                        n26Var3 = null;
                    } else {
                        n26Var3 = n26Var;
                    }
                    if (i8 != 0) {
                        l26Var3 = null;
                    }
                    if (i12 != 0) {
                        l26Var4 = null;
                    }
                    wo7 wo7Var18 = wo7.g;
                    if ((i4 & 262144) != 0) {
                        ype.c0.getClass();
                        ypeVar2 = wpe.b;
                    }
                    ghc ghcVarT15 = mh3.T(l46Var);
                    if ((i4 & 2097152) != 0) {
                        x4dVarB = u5d.b(bm8.e, l46Var);
                    }
                    x4dVar3 = x4dVarB;
                    wo7Var3 = wo7Var18;
                    ghcVar3 = ghcVarT15;
                    l26Var7 = l26Var4;
                    z4 = true;
                    j09Var5 = j09Var4;
                    rpeVar3 = rpeVar115;
                    n26Var4 = n26Var3;
                    wneVarR0 = qk6.r0(6, l46Var);
                    bx9Var = new bx9(16.0f, 16.0f, 16.0f, 16.0f);
                    ypeVar3 = ypeVar2;
                    l26Var8 = l26Var3;
                }
                l46Var.s();
                l46Var.f0(1647415065);
                objR = l46Var.R();
                if (objR == sf2.a) {
                    objR = ib8.e(l46Var);
                }
                t69Var = (t69) objR;
                l46Var.r(false);
                l46Var.f0(-362494116);
                jC = mueVar3.c();
                if (jC == 16) {
                    jC = wneVarR0.d(z4, false, ((Boolean) z7f.w(t69Var, l46Var, 0).getValue()).booleanValue());
                }
                long j9 = jC;
                l46Var.r(false);
                mh3.a(iue.a.a(wneVarR0.k), af1.b0(-416142558, new et9(j09Var5, n26Var4, rpeVar3, wneVarR0, useVar, z4, ypeVar3, t69Var, l26Var8, l26Var7, bx9Var, mueVar3.e(new mue(j9, 0L, null, null, null, 0L, 0L, 0, 0, 0L, null, null, 16777214)), wo7Var3, ghcVar3, x4dVar3), l46Var), l46Var, 56);
                j09 j09Var13 = j09Var5;
                mueVar2 = mueVar3;
                j09Var3 = j09Var13;
                rpe rpeVar116 = rpeVar3;
                n26Var2 = n26Var4;
                rpeVar2 = rpeVar116;
                z3 = z4;
                l26Var6 = l26Var7;
                wo7Var2 = wo7Var3;
                ghcVar2 = ghcVar3;
                wneVar2 = wneVarR0;
                l26Var5 = l26Var8;
                x4dVar2 = x4dVar3;
            } else {
                l46Var.Z();
                z3 = z;
                rpeVar2 = rpeVar;
                wo7Var2 = wo7Var;
                wneVar2 = wneVar;
                x4dVar2 = x4dVarB;
                j09Var3 = j09Var2;
                l26Var5 = l26Var3;
                l26Var6 = l26Var4;
                ypeVar3 = ypeVar2;
                mueVar2 = mueVar;
                n26Var2 = n26Var;
                ghcVar2 = ghcVar;
                bx9Var = xw9Var;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: ys9
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = k99.P(i2 | 1);
                        int iP2 = k99.P(i3);
                        b21.j(useVar, j09Var3, z3, mueVar2, rpeVar2, n26Var2, l26Var5, l26Var6, wo7Var2, ypeVar3, ghcVar2, x4dVar2, wneVar2, bx9Var, (l46) obj, iP, iP2, i4);
                        return wef.a;
                    }
                };
            }
        }
        i15 |= 48;
        j09Var2 = j09Var;
        i5 = 77184 | i15;
        i6 = i4 & 64;
        if (i6 != 0) {
            if ((i2 & 1572864) == 0) {
                if (l46Var.i(n26Var)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i5 |= i7;
            }
            i8 = i4 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (i8 != 0) {
                if ((i2 & 12582912) == 0) {
                    l26Var3 = l26Var;
                    if (l46Var.i(l26Var3)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i5 |= i9;
                }
                i10 = i5 | 905969664;
                i11 = i3 | 6;
                i12 = i4 & 2048;
                if (i12 != 0) {
                    if ((i3 & 48) == 0) {
                        l26Var4 = l26Var2;
                        if (l46Var.i(l26Var4)) {
                            i13 = 32;
                        } else {
                            i13 = 16;
                        }
                        i11 |= i13;
                    }
                    i14 = i11 | 14380416;
                    if ((i3 & 100663296) == 0) {
                        if ((i4 & 262144) == 0) {
                            ypeVar2 = ypeVar;
                            if (l46Var.g(ypeVar2)) {
                            }
                            i14 |= i17;
                        } else {
                            ypeVar2 = ypeVar;
                        }
                        i14 |= i17;
                    } else {
                        ypeVar2 = ypeVar;
                    }
                    int i1114 = i14 | 805306368;
                    x4dVarB = x4dVar;
                    int i1115 = (((i4 & 2097152) == 0 || !l46Var.g(x4dVarB)) ? (char) 16 : ' ') | 25730;
                    if ((i10 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (l46Var.W(i10 & 1, z2)) {
                        l46Var.b0();
                        if ((i2 & 1) != 0) {
                            if (i16 != 0) {
                                j09Var4 = g09.a;
                            } else {
                                j09Var4 = j09Var2;
                            }
                            mueVar3 = (mue) l46Var.k(nte.a);
                            rpe rpeVar117 = new rpe();
                            if (i6 != 0) {
                                n26Var3 = null;
                            } else {
                                n26Var3 = n26Var;
                            }
                            if (i8 != 0) {
                                l26Var3 = null;
                            }
                            if (i12 != 0) {
                                l26Var4 = null;
                            }
                            wo7 wo7Var19 = wo7.g;
                            if ((i4 & 262144) != 0) {
                                ype.c0.getClass();
                                ypeVar2 = wpe.b;
                            }
                            ghc ghcVarT16 = mh3.T(l46Var);
                            if ((i4 & 2097152) != 0) {
                                x4dVarB = u5d.b(bm8.e, l46Var);
                            }
                            x4dVar3 = x4dVarB;
                            wo7Var3 = wo7Var19;
                            ghcVar3 = ghcVarT16;
                            l26Var7 = l26Var4;
                            z4 = true;
                            j09Var5 = j09Var4;
                            rpeVar3 = rpeVar117;
                            n26Var4 = n26Var3;
                            wneVarR0 = qk6.r0(6, l46Var);
                            bx9Var = new bx9(16.0f, 16.0f, 16.0f, 16.0f);
                            ypeVar3 = ypeVar2;
                            l26Var8 = l26Var3;
                        } else {
                            if (i16 != 0) {
                                j09Var4 = g09.a;
                            } else {
                                j09Var4 = j09Var2;
                            }
                            mueVar3 = (mue) l46Var.k(nte.a);
                            rpe rpeVar118 = new rpe();
                            if (i6 != 0) {
                                n26Var3 = null;
                            } else {
                                n26Var3 = n26Var;
                            }
                            if (i8 != 0) {
                                l26Var3 = null;
                            }
                            if (i12 != 0) {
                                l26Var4 = null;
                            }
                            wo7 wo7Var110 = wo7.g;
                            if ((i4 & 262144) != 0) {
                                ype.c0.getClass();
                                ypeVar2 = wpe.b;
                            }
                            ghc ghcVarT17 = mh3.T(l46Var);
                            if ((i4 & 2097152) != 0) {
                                x4dVarB = u5d.b(bm8.e, l46Var);
                            }
                            x4dVar3 = x4dVarB;
                            wo7Var3 = wo7Var110;
                            ghcVar3 = ghcVarT17;
                            l26Var7 = l26Var4;
                            z4 = true;
                            j09Var5 = j09Var4;
                            rpeVar3 = rpeVar118;
                            n26Var4 = n26Var3;
                            wneVarR0 = qk6.r0(6, l46Var);
                            bx9Var = new bx9(16.0f, 16.0f, 16.0f, 16.0f);
                            ypeVar3 = ypeVar2;
                            l26Var8 = l26Var3;
                        }
                        l46Var.s();
                        l46Var.f0(1647415065);
                        objR = l46Var.R();
                        if (objR == sf2.a) {
                            objR = ib8.e(l46Var);
                        }
                        t69Var = (t69) objR;
                        l46Var.r(false);
                        l46Var.f0(-362494116);
                        jC = mueVar3.c();
                        if (jC == 16) {
                            jC = wneVarR0.d(z4, false, ((Boolean) z7f.w(t69Var, l46Var, 0).getValue()).booleanValue());
                        }
                        long j10 = jC;
                        l46Var.r(false);
                        mh3.a(iue.a.a(wneVarR0.k), af1.b0(-416142558, new et9(j09Var5, n26Var4, rpeVar3, wneVarR0, useVar, z4, ypeVar3, t69Var, l26Var8, l26Var7, bx9Var, mueVar3.e(new mue(j10, 0L, null, null, null, 0L, 0L, 0, 0, 0L, null, null, 16777214)), wo7Var3, ghcVar3, x4dVar3), l46Var), l46Var, 56);
                        j09 j09Var14 = j09Var5;
                        mueVar2 = mueVar3;
                        j09Var3 = j09Var14;
                        rpe rpeVar119 = rpeVar3;
                        n26Var2 = n26Var4;
                        rpeVar2 = rpeVar119;
                        z3 = z4;
                        l26Var6 = l26Var7;
                        wo7Var2 = wo7Var3;
                        ghcVar2 = ghcVar3;
                        wneVar2 = wneVarR0;
                        l26Var5 = l26Var8;
                        x4dVar2 = x4dVar3;
                    } else {
                        l46Var.Z();
                        z3 = z;
                        rpeVar2 = rpeVar;
                        wo7Var2 = wo7Var;
                        wneVar2 = wneVar;
                        x4dVar2 = x4dVarB;
                        j09Var3 = j09Var2;
                        l26Var5 = l26Var3;
                        l26Var6 = l26Var4;
                        ypeVar3 = ypeVar2;
                        mueVar2 = mueVar;
                        n26Var2 = n26Var;
                        ghcVar2 = ghcVar;
                        bx9Var = xw9Var;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new l26() { // from class: ys9
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iP = k99.P(i2 | 1);
                                int iP2 = k99.P(i3);
                                b21.j(useVar, j09Var3, z3, mueVar2, rpeVar2, n26Var2, l26Var5, l26Var6, wo7Var2, ypeVar3, ghcVar2, x4dVar2, wneVar2, bx9Var, (l46) obj, iP, iP2, i4);
                                return wef.a;
                            }
                        };
                    }
                }
                i11 = i3 | 54;
                l26Var4 = l26Var2;
                i14 = i11 | 14380416;
                if ((i3 & 100663296) == 0) {
                    if ((i4 & 262144) == 0) {
                        ypeVar2 = ypeVar;
                        if (l46Var.g(ypeVar2)) {
                        }
                        i14 |= i17;
                    } else {
                        ypeVar2 = ypeVar;
                    }
                    i14 |= i17;
                } else {
                    ypeVar2 = ypeVar;
                }
                int i1116 = i14 | 805306368;
                x4dVarB = x4dVar;
                int i1117 = (((i4 & 2097152) == 0 || !l46Var.g(x4dVarB)) ? (char) 16 : ' ') | 25730;
                if ((i10 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (l46Var.W(i10 & 1, z2)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if (i16 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        mueVar3 = (mue) l46Var.k(nte.a);
                        rpe rpeVar1110 = new rpe();
                        if (i6 != 0) {
                            n26Var3 = null;
                        } else {
                            n26Var3 = n26Var;
                        }
                        if (i8 != 0) {
                            l26Var3 = null;
                        }
                        if (i12 != 0) {
                            l26Var4 = null;
                        }
                        wo7 wo7Var111 = wo7.g;
                        if ((i4 & 262144) != 0) {
                            ype.c0.getClass();
                            ypeVar2 = wpe.b;
                        }
                        ghc ghcVarT18 = mh3.T(l46Var);
                        if ((i4 & 2097152) != 0) {
                            x4dVarB = u5d.b(bm8.e, l46Var);
                        }
                        x4dVar3 = x4dVarB;
                        wo7Var3 = wo7Var111;
                        ghcVar3 = ghcVarT18;
                        l26Var7 = l26Var4;
                        z4 = true;
                        j09Var5 = j09Var4;
                        rpeVar3 = rpeVar1110;
                        n26Var4 = n26Var3;
                        wneVarR0 = qk6.r0(6, l46Var);
                        bx9Var = new bx9(16.0f, 16.0f, 16.0f, 16.0f);
                        ypeVar3 = ypeVar2;
                        l26Var8 = l26Var3;
                    } else {
                        if (i16 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        mueVar3 = (mue) l46Var.k(nte.a);
                        rpe rpeVar1111 = new rpe();
                        if (i6 != 0) {
                            n26Var3 = null;
                        } else {
                            n26Var3 = n26Var;
                        }
                        if (i8 != 0) {
                            l26Var3 = null;
                        }
                        if (i12 != 0) {
                            l26Var4 = null;
                        }
                        wo7 wo7Var112 = wo7.g;
                        if ((i4 & 262144) != 0) {
                            ype.c0.getClass();
                            ypeVar2 = wpe.b;
                        }
                        ghc ghcVarT19 = mh3.T(l46Var);
                        if ((i4 & 2097152) != 0) {
                            x4dVarB = u5d.b(bm8.e, l46Var);
                        }
                        x4dVar3 = x4dVarB;
                        wo7Var3 = wo7Var112;
                        ghcVar3 = ghcVarT19;
                        l26Var7 = l26Var4;
                        z4 = true;
                        j09Var5 = j09Var4;
                        rpeVar3 = rpeVar1111;
                        n26Var4 = n26Var3;
                        wneVarR0 = qk6.r0(6, l46Var);
                        bx9Var = new bx9(16.0f, 16.0f, 16.0f, 16.0f);
                        ypeVar3 = ypeVar2;
                        l26Var8 = l26Var3;
                    }
                    l46Var.s();
                    l46Var.f0(1647415065);
                    objR = l46Var.R();
                    if (objR == sf2.a) {
                        objR = ib8.e(l46Var);
                    }
                    t69Var = (t69) objR;
                    l46Var.r(false);
                    l46Var.f0(-362494116);
                    jC = mueVar3.c();
                    if (jC == 16) {
                        jC = wneVarR0.d(z4, false, ((Boolean) z7f.w(t69Var, l46Var, 0).getValue()).booleanValue());
                    }
                    long j11 = jC;
                    l46Var.r(false);
                    mh3.a(iue.a.a(wneVarR0.k), af1.b0(-416142558, new et9(j09Var5, n26Var4, rpeVar3, wneVarR0, useVar, z4, ypeVar3, t69Var, l26Var8, l26Var7, bx9Var, mueVar3.e(new mue(j11, 0L, null, null, null, 0L, 0L, 0, 0, 0L, null, null, 16777214)), wo7Var3, ghcVar3, x4dVar3), l46Var), l46Var, 56);
                    j09 j09Var15 = j09Var5;
                    mueVar2 = mueVar3;
                    j09Var3 = j09Var15;
                    rpe rpeVar1112 = rpeVar3;
                    n26Var2 = n26Var4;
                    rpeVar2 = rpeVar1112;
                    z3 = z4;
                    l26Var6 = l26Var7;
                    wo7Var2 = wo7Var3;
                    ghcVar2 = ghcVar3;
                    wneVar2 = wneVarR0;
                    l26Var5 = l26Var8;
                    x4dVar2 = x4dVar3;
                } else {
                    l46Var.Z();
                    z3 = z;
                    rpeVar2 = rpeVar;
                    wo7Var2 = wo7Var;
                    wneVar2 = wneVar;
                    x4dVar2 = x4dVarB;
                    j09Var3 = j09Var2;
                    l26Var5 = l26Var3;
                    l26Var6 = l26Var4;
                    ypeVar3 = ypeVar2;
                    mueVar2 = mueVar;
                    n26Var2 = n26Var;
                    ghcVar2 = ghcVar;
                    bx9Var = xw9Var;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: ys9
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = k99.P(i2 | 1);
                            int iP2 = k99.P(i3);
                            b21.j(useVar, j09Var3, z3, mueVar2, rpeVar2, n26Var2, l26Var5, l26Var6, wo7Var2, ypeVar3, ghcVar2, x4dVar2, wneVar2, bx9Var, (l46) obj, iP, iP2, i4);
                            return wef.a;
                        }
                    };
                }
            }
            i5 |= 12582912;
            l26Var3 = l26Var;
            i10 = i5 | 905969664;
            i11 = i3 | 6;
            i12 = i4 & 2048;
            if (i12 != 0) {
                if ((i3 & 48) == 0) {
                    l26Var4 = l26Var2;
                    if (l46Var.i(l26Var4)) {
                        i13 = 32;
                    } else {
                        i13 = 16;
                    }
                    i11 |= i13;
                }
                i14 = i11 | 14380416;
                if ((i3 & 100663296) == 0) {
                    if ((i4 & 262144) == 0) {
                        ypeVar2 = ypeVar;
                        if (l46Var.g(ypeVar2)) {
                        }
                        i14 |= i17;
                    } else {
                        ypeVar2 = ypeVar;
                    }
                    i14 |= i17;
                } else {
                    ypeVar2 = ypeVar;
                }
                int i1118 = i14 | 805306368;
                x4dVarB = x4dVar;
                int i1119 = (((i4 & 2097152) == 0 || !l46Var.g(x4dVarB)) ? (char) 16 : ' ') | 25730;
                if ((i10 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (l46Var.W(i10 & 1, z2)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if (i16 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        mueVar3 = (mue) l46Var.k(nte.a);
                        rpe rpeVar1113 = new rpe();
                        if (i6 != 0) {
                            n26Var3 = null;
                        } else {
                            n26Var3 = n26Var;
                        }
                        if (i8 != 0) {
                            l26Var3 = null;
                        }
                        if (i12 != 0) {
                            l26Var4 = null;
                        }
                        wo7 wo7Var113 = wo7.g;
                        if ((i4 & 262144) != 0) {
                            ype.c0.getClass();
                            ypeVar2 = wpe.b;
                        }
                        ghc ghcVarT110 = mh3.T(l46Var);
                        if ((i4 & 2097152) != 0) {
                            x4dVarB = u5d.b(bm8.e, l46Var);
                        }
                        x4dVar3 = x4dVarB;
                        wo7Var3 = wo7Var113;
                        ghcVar3 = ghcVarT110;
                        l26Var7 = l26Var4;
                        z4 = true;
                        j09Var5 = j09Var4;
                        rpeVar3 = rpeVar1113;
                        n26Var4 = n26Var3;
                        wneVarR0 = qk6.r0(6, l46Var);
                        bx9Var = new bx9(16.0f, 16.0f, 16.0f, 16.0f);
                        ypeVar3 = ypeVar2;
                        l26Var8 = l26Var3;
                    } else {
                        if (i16 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        mueVar3 = (mue) l46Var.k(nte.a);
                        rpe rpeVar1114 = new rpe();
                        if (i6 != 0) {
                            n26Var3 = null;
                        } else {
                            n26Var3 = n26Var;
                        }
                        if (i8 != 0) {
                            l26Var3 = null;
                        }
                        if (i12 != 0) {
                            l26Var4 = null;
                        }
                        wo7 wo7Var114 = wo7.g;
                        if ((i4 & 262144) != 0) {
                            ype.c0.getClass();
                            ypeVar2 = wpe.b;
                        }
                        ghc ghcVarT111 = mh3.T(l46Var);
                        if ((i4 & 2097152) != 0) {
                            x4dVarB = u5d.b(bm8.e, l46Var);
                        }
                        x4dVar3 = x4dVarB;
                        wo7Var3 = wo7Var114;
                        ghcVar3 = ghcVarT111;
                        l26Var7 = l26Var4;
                        z4 = true;
                        j09Var5 = j09Var4;
                        rpeVar3 = rpeVar1114;
                        n26Var4 = n26Var3;
                        wneVarR0 = qk6.r0(6, l46Var);
                        bx9Var = new bx9(16.0f, 16.0f, 16.0f, 16.0f);
                        ypeVar3 = ypeVar2;
                        l26Var8 = l26Var3;
                    }
                    l46Var.s();
                    l46Var.f0(1647415065);
                    objR = l46Var.R();
                    if (objR == sf2.a) {
                        objR = ib8.e(l46Var);
                    }
                    t69Var = (t69) objR;
                    l46Var.r(false);
                    l46Var.f0(-362494116);
                    jC = mueVar3.c();
                    if (jC == 16) {
                        jC = wneVarR0.d(z4, false, ((Boolean) z7f.w(t69Var, l46Var, 0).getValue()).booleanValue());
                    }
                    long j12 = jC;
                    l46Var.r(false);
                    mh3.a(iue.a.a(wneVarR0.k), af1.b0(-416142558, new et9(j09Var5, n26Var4, rpeVar3, wneVarR0, useVar, z4, ypeVar3, t69Var, l26Var8, l26Var7, bx9Var, mueVar3.e(new mue(j12, 0L, null, null, null, 0L, 0L, 0, 0, 0L, null, null, 16777214)), wo7Var3, ghcVar3, x4dVar3), l46Var), l46Var, 56);
                    j09 j09Var16 = j09Var5;
                    mueVar2 = mueVar3;
                    j09Var3 = j09Var16;
                    rpe rpeVar1115 = rpeVar3;
                    n26Var2 = n26Var4;
                    rpeVar2 = rpeVar1115;
                    z3 = z4;
                    l26Var6 = l26Var7;
                    wo7Var2 = wo7Var3;
                    ghcVar2 = ghcVar3;
                    wneVar2 = wneVarR0;
                    l26Var5 = l26Var8;
                    x4dVar2 = x4dVar3;
                } else {
                    l46Var.Z();
                    z3 = z;
                    rpeVar2 = rpeVar;
                    wo7Var2 = wo7Var;
                    wneVar2 = wneVar;
                    x4dVar2 = x4dVarB;
                    j09Var3 = j09Var2;
                    l26Var5 = l26Var3;
                    l26Var6 = l26Var4;
                    ypeVar3 = ypeVar2;
                    mueVar2 = mueVar;
                    n26Var2 = n26Var;
                    ghcVar2 = ghcVar;
                    bx9Var = xw9Var;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: ys9
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = k99.P(i2 | 1);
                            int iP2 = k99.P(i3);
                            b21.j(useVar, j09Var3, z3, mueVar2, rpeVar2, n26Var2, l26Var5, l26Var6, wo7Var2, ypeVar3, ghcVar2, x4dVar2, wneVar2, bx9Var, (l46) obj, iP, iP2, i4);
                            return wef.a;
                        }
                    };
                }
            }
            i11 = i3 | 54;
            l26Var4 = l26Var2;
            i14 = i11 | 14380416;
            if ((i3 & 100663296) == 0) {
                if ((i4 & 262144) == 0) {
                    ypeVar2 = ypeVar;
                    if (l46Var.g(ypeVar2)) {
                    }
                    i14 |= i17;
                } else {
                    ypeVar2 = ypeVar;
                }
                i14 |= i17;
            } else {
                ypeVar2 = ypeVar;
            }
            int i11110 = i14 | 805306368;
            x4dVarB = x4dVar;
            int i11111 = (((i4 & 2097152) == 0 || !l46Var.g(x4dVarB)) ? (char) 16 : ' ') | 25730;
            if ((i10 & 306783379) != 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (l46Var.W(i10 & 1, z2)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if (i16 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    mueVar3 = (mue) l46Var.k(nte.a);
                    rpe rpeVar1116 = new rpe();
                    if (i6 != 0) {
                        n26Var3 = null;
                    } else {
                        n26Var3 = n26Var;
                    }
                    if (i8 != 0) {
                        l26Var3 = null;
                    }
                    if (i12 != 0) {
                        l26Var4 = null;
                    }
                    wo7 wo7Var115 = wo7.g;
                    if ((i4 & 262144) != 0) {
                        ype.c0.getClass();
                        ypeVar2 = wpe.b;
                    }
                    ghc ghcVarT112 = mh3.T(l46Var);
                    if ((i4 & 2097152) != 0) {
                        x4dVarB = u5d.b(bm8.e, l46Var);
                    }
                    x4dVar3 = x4dVarB;
                    wo7Var3 = wo7Var115;
                    ghcVar3 = ghcVarT112;
                    l26Var7 = l26Var4;
                    z4 = true;
                    j09Var5 = j09Var4;
                    rpeVar3 = rpeVar1116;
                    n26Var4 = n26Var3;
                    wneVarR0 = qk6.r0(6, l46Var);
                    bx9Var = new bx9(16.0f, 16.0f, 16.0f, 16.0f);
                    ypeVar3 = ypeVar2;
                    l26Var8 = l26Var3;
                } else {
                    if (i16 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    mueVar3 = (mue) l46Var.k(nte.a);
                    rpe rpeVar1117 = new rpe();
                    if (i6 != 0) {
                        n26Var3 = null;
                    } else {
                        n26Var3 = n26Var;
                    }
                    if (i8 != 0) {
                        l26Var3 = null;
                    }
                    if (i12 != 0) {
                        l26Var4 = null;
                    }
                    wo7 wo7Var116 = wo7.g;
                    if ((i4 & 262144) != 0) {
                        ype.c0.getClass();
                        ypeVar2 = wpe.b;
                    }
                    ghc ghcVarT113 = mh3.T(l46Var);
                    if ((i4 & 2097152) != 0) {
                        x4dVarB = u5d.b(bm8.e, l46Var);
                    }
                    x4dVar3 = x4dVarB;
                    wo7Var3 = wo7Var116;
                    ghcVar3 = ghcVarT113;
                    l26Var7 = l26Var4;
                    z4 = true;
                    j09Var5 = j09Var4;
                    rpeVar3 = rpeVar1117;
                    n26Var4 = n26Var3;
                    wneVarR0 = qk6.r0(6, l46Var);
                    bx9Var = new bx9(16.0f, 16.0f, 16.0f, 16.0f);
                    ypeVar3 = ypeVar2;
                    l26Var8 = l26Var3;
                }
                l46Var.s();
                l46Var.f0(1647415065);
                objR = l46Var.R();
                if (objR == sf2.a) {
                    objR = ib8.e(l46Var);
                }
                t69Var = (t69) objR;
                l46Var.r(false);
                l46Var.f0(-362494116);
                jC = mueVar3.c();
                if (jC == 16) {
                    jC = wneVarR0.d(z4, false, ((Boolean) z7f.w(t69Var, l46Var, 0).getValue()).booleanValue());
                }
                long j13 = jC;
                l46Var.r(false);
                mh3.a(iue.a.a(wneVarR0.k), af1.b0(-416142558, new et9(j09Var5, n26Var4, rpeVar3, wneVarR0, useVar, z4, ypeVar3, t69Var, l26Var8, l26Var7, bx9Var, mueVar3.e(new mue(j13, 0L, null, null, null, 0L, 0L, 0, 0, 0L, null, null, 16777214)), wo7Var3, ghcVar3, x4dVar3), l46Var), l46Var, 56);
                j09 j09Var17 = j09Var5;
                mueVar2 = mueVar3;
                j09Var3 = j09Var17;
                rpe rpeVar1118 = rpeVar3;
                n26Var2 = n26Var4;
                rpeVar2 = rpeVar1118;
                z3 = z4;
                l26Var6 = l26Var7;
                wo7Var2 = wo7Var3;
                ghcVar2 = ghcVar3;
                wneVar2 = wneVarR0;
                l26Var5 = l26Var8;
                x4dVar2 = x4dVar3;
            } else {
                l46Var.Z();
                z3 = z;
                rpeVar2 = rpeVar;
                wo7Var2 = wo7Var;
                wneVar2 = wneVar;
                x4dVar2 = x4dVarB;
                j09Var3 = j09Var2;
                l26Var5 = l26Var3;
                l26Var6 = l26Var4;
                ypeVar3 = ypeVar2;
                mueVar2 = mueVar;
                n26Var2 = n26Var;
                ghcVar2 = ghcVar;
                bx9Var = xw9Var;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: ys9
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = k99.P(i2 | 1);
                        int iP2 = k99.P(i3);
                        b21.j(useVar, j09Var3, z3, mueVar2, rpeVar2, n26Var2, l26Var5, l26Var6, wo7Var2, ypeVar3, ghcVar2, x4dVar2, wneVar2, bx9Var, (l46) obj, iP, iP2, i4);
                        return wef.a;
                    }
                };
            }
        }
        i5 = 1650048 | i15;
        i8 = i4 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        if (i8 != 0) {
            if ((i2 & 12582912) == 0) {
                l26Var3 = l26Var;
                if (l46Var.i(l26Var3)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i5 |= i9;
            }
            i10 = i5 | 905969664;
            i11 = i3 | 6;
            i12 = i4 & 2048;
            if (i12 != 0) {
                if ((i3 & 48) == 0) {
                    l26Var4 = l26Var2;
                    if (l46Var.i(l26Var4)) {
                        i13 = 32;
                    } else {
                        i13 = 16;
                    }
                    i11 |= i13;
                }
                i14 = i11 | 14380416;
                if ((i3 & 100663296) == 0) {
                    if ((i4 & 262144) == 0) {
                        ypeVar2 = ypeVar;
                        if (l46Var.g(ypeVar2)) {
                        }
                        i14 |= i17;
                    } else {
                        ypeVar2 = ypeVar;
                    }
                    i14 |= i17;
                } else {
                    ypeVar2 = ypeVar;
                }
                int i11112 = i14 | 805306368;
                x4dVarB = x4dVar;
                int i11113 = (((i4 & 2097152) == 0 || !l46Var.g(x4dVarB)) ? (char) 16 : ' ') | 25730;
                if ((i10 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (l46Var.W(i10 & 1, z2)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if (i16 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        mueVar3 = (mue) l46Var.k(nte.a);
                        rpe rpeVar1119 = new rpe();
                        if (i6 != 0) {
                            n26Var3 = null;
                        } else {
                            n26Var3 = n26Var;
                        }
                        if (i8 != 0) {
                            l26Var3 = null;
                        }
                        if (i12 != 0) {
                            l26Var4 = null;
                        }
                        wo7 wo7Var117 = wo7.g;
                        if ((i4 & 262144) != 0) {
                            ype.c0.getClass();
                            ypeVar2 = wpe.b;
                        }
                        ghc ghcVarT114 = mh3.T(l46Var);
                        if ((i4 & 2097152) != 0) {
                            x4dVarB = u5d.b(bm8.e, l46Var);
                        }
                        x4dVar3 = x4dVarB;
                        wo7Var3 = wo7Var117;
                        ghcVar3 = ghcVarT114;
                        l26Var7 = l26Var4;
                        z4 = true;
                        j09Var5 = j09Var4;
                        rpeVar3 = rpeVar1119;
                        n26Var4 = n26Var3;
                        wneVarR0 = qk6.r0(6, l46Var);
                        bx9Var = new bx9(16.0f, 16.0f, 16.0f, 16.0f);
                        ypeVar3 = ypeVar2;
                        l26Var8 = l26Var3;
                    } else {
                        if (i16 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        mueVar3 = (mue) l46Var.k(nte.a);
                        rpe rpeVar11110 = new rpe();
                        if (i6 != 0) {
                            n26Var3 = null;
                        } else {
                            n26Var3 = n26Var;
                        }
                        if (i8 != 0) {
                            l26Var3 = null;
                        }
                        if (i12 != 0) {
                            l26Var4 = null;
                        }
                        wo7 wo7Var118 = wo7.g;
                        if ((i4 & 262144) != 0) {
                            ype.c0.getClass();
                            ypeVar2 = wpe.b;
                        }
                        ghc ghcVarT115 = mh3.T(l46Var);
                        if ((i4 & 2097152) != 0) {
                            x4dVarB = u5d.b(bm8.e, l46Var);
                        }
                        x4dVar3 = x4dVarB;
                        wo7Var3 = wo7Var118;
                        ghcVar3 = ghcVarT115;
                        l26Var7 = l26Var4;
                        z4 = true;
                        j09Var5 = j09Var4;
                        rpeVar3 = rpeVar11110;
                        n26Var4 = n26Var3;
                        wneVarR0 = qk6.r0(6, l46Var);
                        bx9Var = new bx9(16.0f, 16.0f, 16.0f, 16.0f);
                        ypeVar3 = ypeVar2;
                        l26Var8 = l26Var3;
                    }
                    l46Var.s();
                    l46Var.f0(1647415065);
                    objR = l46Var.R();
                    if (objR == sf2.a) {
                        objR = ib8.e(l46Var);
                    }
                    t69Var = (t69) objR;
                    l46Var.r(false);
                    l46Var.f0(-362494116);
                    jC = mueVar3.c();
                    if (jC == 16) {
                        jC = wneVarR0.d(z4, false, ((Boolean) z7f.w(t69Var, l46Var, 0).getValue()).booleanValue());
                    }
                    long j14 = jC;
                    l46Var.r(false);
                    mh3.a(iue.a.a(wneVarR0.k), af1.b0(-416142558, new et9(j09Var5, n26Var4, rpeVar3, wneVarR0, useVar, z4, ypeVar3, t69Var, l26Var8, l26Var7, bx9Var, mueVar3.e(new mue(j14, 0L, null, null, null, 0L, 0L, 0, 0, 0L, null, null, 16777214)), wo7Var3, ghcVar3, x4dVar3), l46Var), l46Var, 56);
                    j09 j09Var18 = j09Var5;
                    mueVar2 = mueVar3;
                    j09Var3 = j09Var18;
                    rpe rpeVar11111 = rpeVar3;
                    n26Var2 = n26Var4;
                    rpeVar2 = rpeVar11111;
                    z3 = z4;
                    l26Var6 = l26Var7;
                    wo7Var2 = wo7Var3;
                    ghcVar2 = ghcVar3;
                    wneVar2 = wneVarR0;
                    l26Var5 = l26Var8;
                    x4dVar2 = x4dVar3;
                } else {
                    l46Var.Z();
                    z3 = z;
                    rpeVar2 = rpeVar;
                    wo7Var2 = wo7Var;
                    wneVar2 = wneVar;
                    x4dVar2 = x4dVarB;
                    j09Var3 = j09Var2;
                    l26Var5 = l26Var3;
                    l26Var6 = l26Var4;
                    ypeVar3 = ypeVar2;
                    mueVar2 = mueVar;
                    n26Var2 = n26Var;
                    ghcVar2 = ghcVar;
                    bx9Var = xw9Var;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: ys9
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = k99.P(i2 | 1);
                            int iP2 = k99.P(i3);
                            b21.j(useVar, j09Var3, z3, mueVar2, rpeVar2, n26Var2, l26Var5, l26Var6, wo7Var2, ypeVar3, ghcVar2, x4dVar2, wneVar2, bx9Var, (l46) obj, iP, iP2, i4);
                            return wef.a;
                        }
                    };
                }
            }
            i11 = i3 | 54;
            l26Var4 = l26Var2;
            i14 = i11 | 14380416;
            if ((i3 & 100663296) == 0) {
                if ((i4 & 262144) == 0) {
                    ypeVar2 = ypeVar;
                    if (l46Var.g(ypeVar2)) {
                    }
                    i14 |= i17;
                } else {
                    ypeVar2 = ypeVar;
                }
                i14 |= i17;
            } else {
                ypeVar2 = ypeVar;
            }
            int i11114 = i14 | 805306368;
            x4dVarB = x4dVar;
            int i11115 = (((i4 & 2097152) == 0 || !l46Var.g(x4dVarB)) ? (char) 16 : ' ') | 25730;
            if ((i10 & 306783379) != 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (l46Var.W(i10 & 1, z2)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if (i16 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    mueVar3 = (mue) l46Var.k(nte.a);
                    rpe rpeVar11112 = new rpe();
                    if (i6 != 0) {
                        n26Var3 = null;
                    } else {
                        n26Var3 = n26Var;
                    }
                    if (i8 != 0) {
                        l26Var3 = null;
                    }
                    if (i12 != 0) {
                        l26Var4 = null;
                    }
                    wo7 wo7Var119 = wo7.g;
                    if ((i4 & 262144) != 0) {
                        ype.c0.getClass();
                        ypeVar2 = wpe.b;
                    }
                    ghc ghcVarT116 = mh3.T(l46Var);
                    if ((i4 & 2097152) != 0) {
                        x4dVarB = u5d.b(bm8.e, l46Var);
                    }
                    x4dVar3 = x4dVarB;
                    wo7Var3 = wo7Var119;
                    ghcVar3 = ghcVarT116;
                    l26Var7 = l26Var4;
                    z4 = true;
                    j09Var5 = j09Var4;
                    rpeVar3 = rpeVar11112;
                    n26Var4 = n26Var3;
                    wneVarR0 = qk6.r0(6, l46Var);
                    bx9Var = new bx9(16.0f, 16.0f, 16.0f, 16.0f);
                    ypeVar3 = ypeVar2;
                    l26Var8 = l26Var3;
                } else {
                    if (i16 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    mueVar3 = (mue) l46Var.k(nte.a);
                    rpe rpeVar11113 = new rpe();
                    if (i6 != 0) {
                        n26Var3 = null;
                    } else {
                        n26Var3 = n26Var;
                    }
                    if (i8 != 0) {
                        l26Var3 = null;
                    }
                    if (i12 != 0) {
                        l26Var4 = null;
                    }
                    wo7 wo7Var1110 = wo7.g;
                    if ((i4 & 262144) != 0) {
                        ype.c0.getClass();
                        ypeVar2 = wpe.b;
                    }
                    ghc ghcVarT117 = mh3.T(l46Var);
                    if ((i4 & 2097152) != 0) {
                        x4dVarB = u5d.b(bm8.e, l46Var);
                    }
                    x4dVar3 = x4dVarB;
                    wo7Var3 = wo7Var1110;
                    ghcVar3 = ghcVarT117;
                    l26Var7 = l26Var4;
                    z4 = true;
                    j09Var5 = j09Var4;
                    rpeVar3 = rpeVar11113;
                    n26Var4 = n26Var3;
                    wneVarR0 = qk6.r0(6, l46Var);
                    bx9Var = new bx9(16.0f, 16.0f, 16.0f, 16.0f);
                    ypeVar3 = ypeVar2;
                    l26Var8 = l26Var3;
                }
                l46Var.s();
                l46Var.f0(1647415065);
                objR = l46Var.R();
                if (objR == sf2.a) {
                    objR = ib8.e(l46Var);
                }
                t69Var = (t69) objR;
                l46Var.r(false);
                l46Var.f0(-362494116);
                jC = mueVar3.c();
                if (jC == 16) {
                    jC = wneVarR0.d(z4, false, ((Boolean) z7f.w(t69Var, l46Var, 0).getValue()).booleanValue());
                }
                long j15 = jC;
                l46Var.r(false);
                mh3.a(iue.a.a(wneVarR0.k), af1.b0(-416142558, new et9(j09Var5, n26Var4, rpeVar3, wneVarR0, useVar, z4, ypeVar3, t69Var, l26Var8, l26Var7, bx9Var, mueVar3.e(new mue(j15, 0L, null, null, null, 0L, 0L, 0, 0, 0L, null, null, 16777214)), wo7Var3, ghcVar3, x4dVar3), l46Var), l46Var, 56);
                j09 j09Var19 = j09Var5;
                mueVar2 = mueVar3;
                j09Var3 = j09Var19;
                rpe rpeVar11114 = rpeVar3;
                n26Var2 = n26Var4;
                rpeVar2 = rpeVar11114;
                z3 = z4;
                l26Var6 = l26Var7;
                wo7Var2 = wo7Var3;
                ghcVar2 = ghcVar3;
                wneVar2 = wneVarR0;
                l26Var5 = l26Var8;
                x4dVar2 = x4dVar3;
            } else {
                l46Var.Z();
                z3 = z;
                rpeVar2 = rpeVar;
                wo7Var2 = wo7Var;
                wneVar2 = wneVar;
                x4dVar2 = x4dVarB;
                j09Var3 = j09Var2;
                l26Var5 = l26Var3;
                l26Var6 = l26Var4;
                ypeVar3 = ypeVar2;
                mueVar2 = mueVar;
                n26Var2 = n26Var;
                ghcVar2 = ghcVar;
                bx9Var = xw9Var;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: ys9
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = k99.P(i2 | 1);
                        int iP2 = k99.P(i3);
                        b21.j(useVar, j09Var3, z3, mueVar2, rpeVar2, n26Var2, l26Var5, l26Var6, wo7Var2, ypeVar3, ghcVar2, x4dVar2, wneVar2, bx9Var, (l46) obj, iP, iP2, i4);
                        return wef.a;
                    }
                };
            }
        }
        i5 |= 12582912;
        l26Var3 = l26Var;
        i10 = i5 | 905969664;
        i11 = i3 | 6;
        i12 = i4 & 2048;
        if (i12 != 0) {
            if ((i3 & 48) == 0) {
                l26Var4 = l26Var2;
                if (l46Var.i(l26Var4)) {
                    i13 = 32;
                } else {
                    i13 = 16;
                }
                i11 |= i13;
            }
            i14 = i11 | 14380416;
            if ((i3 & 100663296) == 0) {
                if ((i4 & 262144) == 0) {
                    ypeVar2 = ypeVar;
                    if (l46Var.g(ypeVar2)) {
                    }
                    i14 |= i17;
                } else {
                    ypeVar2 = ypeVar;
                }
                i14 |= i17;
            } else {
                ypeVar2 = ypeVar;
            }
            int i11116 = i14 | 805306368;
            x4dVarB = x4dVar;
            int i11117 = (((i4 & 2097152) == 0 || !l46Var.g(x4dVarB)) ? (char) 16 : ' ') | 25730;
            if ((i10 & 306783379) != 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (l46Var.W(i10 & 1, z2)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if (i16 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    mueVar3 = (mue) l46Var.k(nte.a);
                    rpe rpeVar11115 = new rpe();
                    if (i6 != 0) {
                        n26Var3 = null;
                    } else {
                        n26Var3 = n26Var;
                    }
                    if (i8 != 0) {
                        l26Var3 = null;
                    }
                    if (i12 != 0) {
                        l26Var4 = null;
                    }
                    wo7 wo7Var1111 = wo7.g;
                    if ((i4 & 262144) != 0) {
                        ype.c0.getClass();
                        ypeVar2 = wpe.b;
                    }
                    ghc ghcVarT118 = mh3.T(l46Var);
                    if ((i4 & 2097152) != 0) {
                        x4dVarB = u5d.b(bm8.e, l46Var);
                    }
                    x4dVar3 = x4dVarB;
                    wo7Var3 = wo7Var1111;
                    ghcVar3 = ghcVarT118;
                    l26Var7 = l26Var4;
                    z4 = true;
                    j09Var5 = j09Var4;
                    rpeVar3 = rpeVar11115;
                    n26Var4 = n26Var3;
                    wneVarR0 = qk6.r0(6, l46Var);
                    bx9Var = new bx9(16.0f, 16.0f, 16.0f, 16.0f);
                    ypeVar3 = ypeVar2;
                    l26Var8 = l26Var3;
                } else {
                    if (i16 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    mueVar3 = (mue) l46Var.k(nte.a);
                    rpe rpeVar11116 = new rpe();
                    if (i6 != 0) {
                        n26Var3 = null;
                    } else {
                        n26Var3 = n26Var;
                    }
                    if (i8 != 0) {
                        l26Var3 = null;
                    }
                    if (i12 != 0) {
                        l26Var4 = null;
                    }
                    wo7 wo7Var1112 = wo7.g;
                    if ((i4 & 262144) != 0) {
                        ype.c0.getClass();
                        ypeVar2 = wpe.b;
                    }
                    ghc ghcVarT119 = mh3.T(l46Var);
                    if ((i4 & 2097152) != 0) {
                        x4dVarB = u5d.b(bm8.e, l46Var);
                    }
                    x4dVar3 = x4dVarB;
                    wo7Var3 = wo7Var1112;
                    ghcVar3 = ghcVarT119;
                    l26Var7 = l26Var4;
                    z4 = true;
                    j09Var5 = j09Var4;
                    rpeVar3 = rpeVar11116;
                    n26Var4 = n26Var3;
                    wneVarR0 = qk6.r0(6, l46Var);
                    bx9Var = new bx9(16.0f, 16.0f, 16.0f, 16.0f);
                    ypeVar3 = ypeVar2;
                    l26Var8 = l26Var3;
                }
                l46Var.s();
                l46Var.f0(1647415065);
                objR = l46Var.R();
                if (objR == sf2.a) {
                    objR = ib8.e(l46Var);
                }
                t69Var = (t69) objR;
                l46Var.r(false);
                l46Var.f0(-362494116);
                jC = mueVar3.c();
                if (jC == 16) {
                    jC = wneVarR0.d(z4, false, ((Boolean) z7f.w(t69Var, l46Var, 0).getValue()).booleanValue());
                }
                long j16 = jC;
                l46Var.r(false);
                mh3.a(iue.a.a(wneVarR0.k), af1.b0(-416142558, new et9(j09Var5, n26Var4, rpeVar3, wneVarR0, useVar, z4, ypeVar3, t69Var, l26Var8, l26Var7, bx9Var, mueVar3.e(new mue(j16, 0L, null, null, null, 0L, 0L, 0, 0, 0L, null, null, 16777214)), wo7Var3, ghcVar3, x4dVar3), l46Var), l46Var, 56);
                j09 j09Var110 = j09Var5;
                mueVar2 = mueVar3;
                j09Var3 = j09Var110;
                rpe rpeVar11117 = rpeVar3;
                n26Var2 = n26Var4;
                rpeVar2 = rpeVar11117;
                z3 = z4;
                l26Var6 = l26Var7;
                wo7Var2 = wo7Var3;
                ghcVar2 = ghcVar3;
                wneVar2 = wneVarR0;
                l26Var5 = l26Var8;
                x4dVar2 = x4dVar3;
            } else {
                l46Var.Z();
                z3 = z;
                rpeVar2 = rpeVar;
                wo7Var2 = wo7Var;
                wneVar2 = wneVar;
                x4dVar2 = x4dVarB;
                j09Var3 = j09Var2;
                l26Var5 = l26Var3;
                l26Var6 = l26Var4;
                ypeVar3 = ypeVar2;
                mueVar2 = mueVar;
                n26Var2 = n26Var;
                ghcVar2 = ghcVar;
                bx9Var = xw9Var;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: ys9
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = k99.P(i2 | 1);
                        int iP2 = k99.P(i3);
                        b21.j(useVar, j09Var3, z3, mueVar2, rpeVar2, n26Var2, l26Var5, l26Var6, wo7Var2, ypeVar3, ghcVar2, x4dVar2, wneVar2, bx9Var, (l46) obj, iP, iP2, i4);
                        return wef.a;
                    }
                };
            }
        }
        i11 = i3 | 54;
        l26Var4 = l26Var2;
        i14 = i11 | 14380416;
        if ((i3 & 100663296) == 0) {
            if ((i4 & 262144) == 0) {
                ypeVar2 = ypeVar;
                if (l46Var.g(ypeVar2)) {
                }
                i14 |= i17;
            } else {
                ypeVar2 = ypeVar;
            }
            i14 |= i17;
        } else {
            ypeVar2 = ypeVar;
        }
        int i11118 = i14 | 805306368;
        x4dVarB = x4dVar;
        int i11119 = (((i4 & 2097152) == 0 || !l46Var.g(x4dVarB)) ? (char) 16 : ' ') | 25730;
        if ((i10 & 306783379) != 306783378) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (l46Var.W(i10 & 1, z2)) {
            l46Var.b0();
            if ((i2 & 1) != 0) {
                if (i16 != 0) {
                    j09Var4 = g09.a;
                } else {
                    j09Var4 = j09Var2;
                }
                mueVar3 = (mue) l46Var.k(nte.a);
                rpe rpeVar11118 = new rpe();
                if (i6 != 0) {
                    n26Var3 = null;
                } else {
                    n26Var3 = n26Var;
                }
                if (i8 != 0) {
                    l26Var3 = null;
                }
                if (i12 != 0) {
                    l26Var4 = null;
                }
                wo7 wo7Var1113 = wo7.g;
                if ((i4 & 262144) != 0) {
                    ype.c0.getClass();
                    ypeVar2 = wpe.b;
                }
                ghc ghcVarT1110 = mh3.T(l46Var);
                if ((i4 & 2097152) != 0) {
                    x4dVarB = u5d.b(bm8.e, l46Var);
                }
                x4dVar3 = x4dVarB;
                wo7Var3 = wo7Var1113;
                ghcVar3 = ghcVarT1110;
                l26Var7 = l26Var4;
                z4 = true;
                j09Var5 = j09Var4;
                rpeVar3 = rpeVar11118;
                n26Var4 = n26Var3;
                wneVarR0 = qk6.r0(6, l46Var);
                bx9Var = new bx9(16.0f, 16.0f, 16.0f, 16.0f);
                ypeVar3 = ypeVar2;
                l26Var8 = l26Var3;
            } else {
                if (i16 != 0) {
                    j09Var4 = g09.a;
                } else {
                    j09Var4 = j09Var2;
                }
                mueVar3 = (mue) l46Var.k(nte.a);
                rpe rpeVar11119 = new rpe();
                if (i6 != 0) {
                    n26Var3 = null;
                } else {
                    n26Var3 = n26Var;
                }
                if (i8 != 0) {
                    l26Var3 = null;
                }
                if (i12 != 0) {
                    l26Var4 = null;
                }
                wo7 wo7Var1114 = wo7.g;
                if ((i4 & 262144) != 0) {
                    ype.c0.getClass();
                    ypeVar2 = wpe.b;
                }
                ghc ghcVarT1111 = mh3.T(l46Var);
                if ((i4 & 2097152) != 0) {
                    x4dVarB = u5d.b(bm8.e, l46Var);
                }
                x4dVar3 = x4dVarB;
                wo7Var3 = wo7Var1114;
                ghcVar3 = ghcVarT1111;
                l26Var7 = l26Var4;
                z4 = true;
                j09Var5 = j09Var4;
                rpeVar3 = rpeVar11119;
                n26Var4 = n26Var3;
                wneVarR0 = qk6.r0(6, l46Var);
                bx9Var = new bx9(16.0f, 16.0f, 16.0f, 16.0f);
                ypeVar3 = ypeVar2;
                l26Var8 = l26Var3;
            }
            l46Var.s();
            l46Var.f0(1647415065);
            objR = l46Var.R();
            if (objR == sf2.a) {
                objR = ib8.e(l46Var);
            }
            t69Var = (t69) objR;
            l46Var.r(false);
            l46Var.f0(-362494116);
            jC = mueVar3.c();
            if (jC == 16) {
                jC = wneVarR0.d(z4, false, ((Boolean) z7f.w(t69Var, l46Var, 0).getValue()).booleanValue());
            }
            long j17 = jC;
            l46Var.r(false);
            mh3.a(iue.a.a(wneVarR0.k), af1.b0(-416142558, new et9(j09Var5, n26Var4, rpeVar3, wneVarR0, useVar, z4, ypeVar3, t69Var, l26Var8, l26Var7, bx9Var, mueVar3.e(new mue(j17, 0L, null, null, null, 0L, 0L, 0, 0, 0L, null, null, 16777214)), wo7Var3, ghcVar3, x4dVar3), l46Var), l46Var, 56);
            j09 j09Var111 = j09Var5;
            mueVar2 = mueVar3;
            j09Var3 = j09Var111;
            rpe rpeVar111110 = rpeVar3;
            n26Var2 = n26Var4;
            rpeVar2 = rpeVar111110;
            z3 = z4;
            l26Var6 = l26Var7;
            wo7Var2 = wo7Var3;
            ghcVar2 = ghcVar3;
            wneVar2 = wneVarR0;
            l26Var5 = l26Var8;
            x4dVar2 = x4dVar3;
        } else {
            l46Var.Z();
            z3 = z;
            rpeVar2 = rpeVar;
            wo7Var2 = wo7Var;
            wneVar2 = wneVar;
            x4dVar2 = x4dVarB;
            j09Var3 = j09Var2;
            l26Var5 = l26Var3;
            l26Var6 = l26Var4;
            ypeVar3 = ypeVar2;
            mueVar2 = mueVar;
            n26Var2 = n26Var;
            ghcVar2 = ghcVar;
            bx9Var = xw9Var;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: ys9
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(i2 | 1);
                    int iP2 = k99.P(i3);
                    b21.j(useVar, j09Var3, z3, mueVar2, rpeVar2, n26Var2, l26Var5, l26Var6, wo7Var2, ypeVar3, ghcVar2, x4dVar2, wneVar2, bx9Var, (l46) obj, iP, iP2, i4);
                    return wef.a;
                }
            };
        }
    }

    public static final void k(final zse zseVar, final a26 a26Var, final j09 j09Var, boolean z, mue mueVar, final l26 l26Var, final l26 l26Var2, final l26 l26Var3, final boolean z2, final syf syfVar, final wo7 wo7Var, uo7 uo7Var, final boolean z3, int i2, int i3, x4d x4dVar, final wne wneVar, l46 l46Var, final int i4) {
        int i5;
        a26 a26Var2;
        j09 j09Var2;
        l26 l26Var4;
        l26 l26Var5;
        l46 l46Var2;
        final boolean z4;
        final mue mueVar2;
        final uo7 uo7Var2;
        final int i6;
        final int i7;
        final x4d x4dVar2;
        uo7 uo7Var3;
        x4d x4dVar3;
        int i8;
        mue mueVar3;
        boolean z5;
        l46Var.h0(2057288437);
        if ((i4 & 6) == 0) {
            i5 = (l46Var.g(zseVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            a26Var2 = a26Var;
            i5 |= l46Var.i(a26Var2) ? 32 : 16;
        } else {
            a26Var2 = a26Var;
        }
        if ((i4 & 384) == 0) {
            j09Var2 = j09Var;
            i5 |= l46Var.g(j09Var2) ? 256 : 128;
        } else {
            j09Var2 = j09Var;
        }
        int i9 = i5 | 27648;
        if ((196608 & i4) == 0) {
            i9 = 93184 | i5;
        }
        if ((1572864 & i4) == 0) {
            l26Var4 = l26Var;
            i9 |= l46Var.i(l26Var4) ? 1048576 : 524288;
        } else {
            l26Var4 = l26Var;
        }
        if ((12582912 & i4) == 0) {
            l26Var5 = l26Var2;
            i9 |= l46Var.i(l26Var5) ? 8388608 : 4194304;
        } else {
            l26Var5 = l26Var2;
        }
        int i10 = i9 | 905969664;
        int i11 = 1;
        if (l46Var.W(i10 & 1, ((i10 & 306783379) == 306783378 && (((((l46Var.h(z2) ? (char) 2048 : (char) 1024) | 438) | (l46Var.g(syfVar) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE)) | 840433664) & 306783379) == 306783378 && (((l46Var.g(wneVar) ? (char) 256 : (char) 128) | 22) & 147) == 146) ? false : true)) {
            l46Var.b0();
            if ((i4 & 1) == 0 || l46Var.C()) {
                mue mueVar4 = (mue) l46Var.k(nte.a);
                int i12 = z3 ? 1 : Integer.MAX_VALUE;
                x4d x4dVarB = u5d.b(bm8.e, l46Var);
                uo7Var3 = uo7.a;
                x4dVar3 = x4dVarB;
                i8 = i12;
                mueVar3 = mueVar4;
                z5 = true;
            } else {
                l46Var.Z();
                z5 = z;
                mueVar3 = mueVar;
                uo7Var3 = uo7Var;
                i8 = i2;
                i11 = i3;
                x4dVar3 = x4dVar;
            }
            l46Var.s();
            l46Var.f0(-502250010);
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = ib8.e(l46Var);
            }
            t69 t69Var = (t69) objR;
            l46Var.r(false);
            l46Var.f0(1369277167);
            long jC = mueVar3.c();
            long jD = jC != 16 ? jC : wneVar.d(z5, z2, ((Boolean) z7f.w(t69Var, l46Var, 0).getValue()).booleanValue());
            l46Var.r(false);
            mue mueVarE = mueVar3.e(new mue(jD, 0L, null, null, null, 0L, 0L, 0, 0, 0L, null, null, 16777214));
            e1b e1bVarA = iue.a.a(wneVar.k);
            j09 j09Var3 = j09Var2;
            boolean z6 = z5;
            mue mueVar5 = mueVar3;
            uo7 uo7Var4 = uo7Var3;
            int i13 = i11;
            jt9 jt9Var = new jt9(j09Var3, l26Var4, z2, wneVar, zseVar, a26Var2, z6, mueVarE, wo7Var, uo7Var4, z3, i8, i13, syfVar, t69Var, l26Var5, l26Var3, x4dVar3);
            l46Var2 = l46Var;
            mh3.a(e1bVarA, af1.b0(-2094276683, jt9Var, l46Var2), l46Var2, 56);
            z4 = z6;
            i6 = i8;
            i7 = i13;
            x4dVar2 = x4dVar3;
            mueVar2 = mueVar5;
            uo7Var2 = uo7Var4;
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
            z4 = z;
            mueVar2 = mueVar;
            uo7Var2 = uo7Var;
            i6 = i2;
            i7 = i3;
            x4dVar2 = x4dVar;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: ct9
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(i4 | 1);
                    b21.k(zseVar, a26Var, j09Var, z4, mueVar2, l26Var, l26Var2, l26Var3, z2, syfVar, wo7Var, uo7Var2, z3, i6, i7, x4dVar2, wneVar, (l46) obj, iP);
                    return wef.a;
                }
            };
        }
    }

    public static final void l(final String str, final a26 a26Var, final j09 j09Var, final boolean z, final mue mueVar, final l26 l26Var, syf syfVar, final wo7 wo7Var, uo7 uo7Var, final boolean z2, int i2, int i3, final x4d x4dVar, final wne wneVar, l46 l46Var, final int i4) {
        l46 l46Var2;
        final syf syfVar2;
        final uo7 uo7Var2;
        final int i5;
        final int i6;
        syf syfVar3;
        int i7;
        int i8;
        uo7 uo7Var3;
        l46Var.h0(1901501544);
        int i9 = i4 | (l46Var.g(str) ? 4 : 2) | (l46Var.i(a26Var) ? 32 : 16) | (l46Var.g(j09Var) ? 256 : 128) | (l46Var.h(z) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | 24576 | (l46Var.g(mueVar) ? 131072 : 65536) | 907542528;
        if (l46Var.W(i9 & 1, ((306783379 & i9) == 306783378 && ((((l46Var.g(x4dVar) ? ' ' : (char) 16) | 6) | (l46Var.g(wneVar) ? (char) 256 : (char) 128)) & 147) == 146) ? false : true)) {
            l46Var.b0();
            if ((i4 & 1) == 0 || l46Var.C()) {
                syfVar3 = m8c.w;
                i7 = 1;
                i8 = z2 ? 1 : Integer.MAX_VALUE;
                uo7Var3 = uo7.a;
            } else {
                l46Var.Z();
                syfVar3 = syfVar;
                uo7Var3 = uo7Var;
                i8 = i2;
                i7 = i3;
            }
            l46Var.s();
            l46Var.f0(1310051731);
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = ib8.e(l46Var);
            }
            t69 t69Var = (t69) objR;
            l46Var.r(false);
            l46Var.f0(1981927842);
            long jC = mueVar.c();
            if (jC == 16) {
                jC = wneVar.d(z, false, ((Boolean) z7f.w(t69Var, l46Var, 0).getValue()).booleanValue());
            }
            long j2 = jC;
            l46Var.r(false);
            int i10 = i7;
            l46Var2 = l46Var;
            mh3.a(iue.a.a(wneVar.k), af1.b0(1874034984, new gt9(j09Var, wneVar, str, a26Var, z, mueVar.e(new mue(j2, 0L, null, null, null, 0L, 0L, 0, 0, 0L, null, null, 16777214)), wo7Var, uo7Var3, z2, i8, i10, syfVar3, t69Var, l26Var, x4dVar), l46Var2), l46Var2, 56);
            uo7Var2 = uo7Var3;
            syfVar2 = syfVar3;
            i6 = i10;
            i5 = i8;
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
            syfVar2 = syfVar;
            uo7Var2 = uo7Var;
            i5 = i2;
            i6 = i3;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(str, a26Var, j09Var, z, mueVar, l26Var, syfVar2, wo7Var, uo7Var2, z2, i5, i6, x4dVar, wneVar, i4) { // from class: bt9
                public final /* synthetic */ x4d X;
                public final /* synthetic */ wne Y;
                public final /* synthetic */ String a;
                public final /* synthetic */ a26 b;
                public final /* synthetic */ j09 c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ mue e;
                public final /* synthetic */ l26 f;
                public final /* synthetic */ syf g;
                public final /* synthetic */ wo7 v;
                public final /* synthetic */ uo7 w;
                public final /* synthetic */ boolean x;
                public final /* synthetic */ int y;
                public final /* synthetic */ int z;

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(12582913);
                    b21.l(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, this.y, this.z, this.X, this.Y, (l46) obj, iP);
                    return wef.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:162:0x025f  */
    /* JADX WARN: Code duplicated, block: B:164:0x0289  */
    /* JADX WARN: Code duplicated, block: B:165:0x028d  */
    /* JADX WARN: Code duplicated, block: B:170:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:172:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:174:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:176:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:177:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:182:0x0316  */
    /* JADX WARN: Code duplicated, block: B:185:0x0334  */
    /* JADX WARN: Code duplicated, block: B:188:0x0349  */
    /* JADX WARN: Code duplicated, block: B:190:0x034f  */
    /* JADX WARN: Code duplicated, block: B:193:0x0354  */
    /* JADX WARN: Code duplicated, block: B:195:0x035a  */
    /* JADX WARN: Code duplicated, block: B:198:0x035f  */
    /* JADX WARN: Code duplicated, block: B:200:0x039a  */
    /* JADX WARN: Code duplicated, block: B:201:0x039e  */
    /* JADX WARN: Code duplicated, block: B:206:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:208:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:210:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:212:0x0423  */
    /* JADX WARN: Code duplicated, block: B:213:0x0427  */
    /* JADX WARN: Code duplicated, block: B:218:0x0442  */
    /* JADX WARN: Code duplicated, block: B:221:0x0462  */
    /* JADX WARN: Code duplicated, block: B:224:0x047b  */
    /* JADX WARN: Code duplicated, block: B:225:0x047e  */
    /* JADX WARN: Code duplicated, block: B:227:0x0482  */
    /* JADX WARN: Code duplicated, block: B:228:0x0485  */
    /* JADX WARN: Code duplicated, block: B:231:0x0493  */
    /* JADX WARN: Code duplicated, block: B:232:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:235:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:236:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:241:0x0502  */
    /* JADX WARN: Code duplicated, block: B:244:0x051b  */
    /* JADX WARN: Code duplicated, block: B:246:0x0526  */
    /* JADX WARN: Code duplicated, block: B:248:0x052a  */
    /* JADX WARN: Code duplicated, block: B:251:0x0533  */
    /* JADX WARN: Code duplicated, block: B:253:0x0537  */
    /* JADX WARN: Code duplicated, block: B:257:0x0540  */
    /* JADX WARN: Code duplicated, block: B:259:0x0544  */
    /* JADX WARN: Code duplicated, block: B:262:0x0580  */
    /* JADX WARN: Code duplicated, block: B:263:0x0584  */
    /* JADX WARN: Code duplicated, block: B:266:0x0591  */
    /* JADX WARN: Code duplicated, block: B:268:0x059f  */
    /* JADX WARN: Code duplicated, block: B:270:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:272:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:274:0x0604  */
    /* JADX WARN: Code duplicated, block: B:275:0x0608  */
    /* JADX WARN: Code duplicated, block: B:280:0x0623  */
    /* JADX WARN: Code duplicated, block: B:282:0x063f  */
    public static final void m(final l26 l26Var, n26 n26Var, l26 l26Var2, final l26 l26Var3, final l26 l26Var4, final l26 l26Var5, l26 l26Var6, final boolean z, final rpe rpeVar, final mpe mpeVar, final a26 a26Var, final dd2 dd2Var, l26 l26Var7, xw9 xw9Var, l46 l46Var, final int i2, final int i3) {
        int i4;
        int i5;
        l26 l26Var8;
        n26 n26Var2;
        l26 l26Var9;
        final l26 l26Var10;
        l46 l46Var2;
        lx0 lx0Var;
        l46 l46Var3;
        lx0 lx0Var2;
        he2 he2Var;
        xv8 xv8Var;
        boolean z2;
        float fB;
        float fA;
        float f2;
        l26 l26Var11;
        lx0 lx0Var3;
        l26 l26Var12;
        float f3;
        float f4;
        float f5;
        j09 j09VarD0;
        n26 n26Var3;
        int iW;
        l26 l26Var13;
        l26 l26Var14;
        boolean z3;
        int iW2;
        mpe mpeVar2;
        boolean z4;
        Object objR;
        int iW3;
        int iW4;
        int iW5;
        int iW6;
        int iW7;
        l26 l26Var15 = l26Var6;
        xw9 xw9Var2 = xw9Var;
        lx0 lx0Var4 = ndb.f;
        lx0 lx0Var5 = ndb.b;
        l46Var.h0(753699262);
        int i6 = i2 & 6;
        g09 g09Var = g09.a;
        if (i6 == 0) {
            i4 = i2 | (l46Var.g(g09Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= l46Var.i(l26Var) ? 32 : 16;
        }
        int i7 = i2 & 384;
        int i8 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        if (i7 == 0) {
            i4 |= l46Var.i(n26Var) ? 256 : 128;
        }
        int i9 = i2 & 3072;
        int i10 = UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i9 == 0) {
            i4 |= l46Var.i(l26Var2) ? 2048 : 1024;
        }
        int i11 = i2 & 24576;
        int i12 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
        if (i11 == 0) {
            i4 |= l46Var.i(l26Var3) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= l46Var.i(l26Var4) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= l46Var.i(l26Var5) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= l46Var.i(l26Var15) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= l46Var.h(z) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= l46Var.g(rpeVar) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | ((i3 & 8) == 0 ? l46Var.g(mpeVar) : l46Var.i(mpeVar) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= l46Var.i(a26Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            if (l46Var.i(dd2Var)) {
                i8 = 256;
            }
            i5 |= i8;
        }
        if ((i3 & 3072) == 0) {
            if (l46Var.i(l26Var7)) {
                i10 = 2048;
            }
            i5 |= i10;
        }
        if ((i3 & 24576) == 0) {
            if (l46Var.g(xw9Var2)) {
                i12 = 16384;
            }
            i5 |= i12;
        }
        int i13 = i5;
        if (l46Var.W(i4 & 1, ((i4 & 306783379) == 306783378 && (i13 & 9363) == 9362) ? false : true)) {
            float fP = iec.p(l46Var);
            int i14 = i13 & 14;
            boolean zD = ((i13 & 57344) == 16384) | ((i13 & 112) == 32) | ((i4 & 234881024) == 67108864) | ((i4 & 1879048192) == 536870912) | (i14 == 4 || ((i13 & 8) != 0 && l46Var.g(mpeVar))) | l46Var.d(fP);
            Object objR2 = l46Var.R();
            i8c i8cVar = sf2.a;
            if (zD || objR2 == i8cVar) {
                lx0Var = lx0Var4;
                l46 l46Var4 = l46Var;
                lt9 lt9Var = new lt9(a26Var, z, rpeVar, mpeVar, xw9Var2, fP);
                l46Var4.p0(lt9Var);
                objR2 = lt9Var;
                l46Var3 = l46Var4;
            } else {
                lx0Var = lx0Var4;
                l46Var3 = l46Var;
            }
            lt9 lt9Var2 = (lt9) objR2;
            cv7 cv7Var = (cv7) l46Var3.k(zg2.n);
            int iW8 = an1.w(l46Var3);
            u8a u8aVarM = l46Var3.m();
            j09 j09VarJ = m93.J(l46Var3, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0208: INVOKE (r7v3 'j09VarJ' j09) = (r3v5 'l46Var3' l46), (r21v2 j09) STATIC call: m93.J(l46, j09):j09 A[DECLARE_VAR, MD:(l46, j09):j09 (m)] (LINE:521) in method: b21.m(l26, n26, l26, l26, l26, l26, l26, boolean, rpe, mpe, a26, dd2, l26, xw9, l46, int, int):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v2 j09
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 1669
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.b21.m(l26, n26, l26, l26, l26, l26, l26, boolean, rpe, mpe, a26, dd2, l26, xw9, l46, int, int):void");
        }

        public static final void n(j09 j09Var, dd2 dd2Var, l46 l46Var, int i2) {
            int i3;
            j09 j09Var2;
            dd2 dd2Var2;
            l46Var.h0(790527681);
            if ((i2 & 6) == 0) {
                i3 = (l46Var.g(j09Var) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= l46Var.i(dd2Var) ? 32 : 16;
            }
            if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
                Object objR = l46Var.R();
                i8c i8cVar = sf2.a;
                if (objR == i8cVar) {
                    vz9 vz9Var = new vz9(null, qk6.L0);
                    l46Var.p0(vz9Var);
                    objR = vz9Var;
                }
                e89 e89Var = (e89) objR;
                Object objR2 = l46Var.R();
                if (objR2 == i8cVar) {
                    objR2 = new x08(e89Var, 25);
                    l46Var.p0(objR2);
                }
                x16 x16Var = (x16) objR2;
                nma nmaVar = lt3.a;
                ev0 ev0VarG = jgb.G(pa7.b, l46Var, 6);
                j09Var2 = j09Var;
                dd2Var2 = dd2Var;
                mh3.b(new e1b[]{fne.b.a(vfh.F(x16Var, l46Var, 2)), fne.a.a(ev0VarG)}, af1.b0(1070596993, new cm(18, x16Var, j09Var2, e89Var, dd2Var2, ev0VarG), l46Var), l46Var, 56);
            } else {
                j09Var2 = j09Var;
                dd2Var2 = dd2Var;
                l46Var.Z();
            }
            ojb ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new sv(j09Var2, dd2Var2, i2, 5);
            }
        }

        public static final void o(j09 j09Var, dd2 dd2Var, l46 l46Var, int i2) {
            int i3;
            l46Var.h0(155925518);
            int i4 = 4;
            if ((i2 & 6) == 0) {
                i3 = (l46Var.g(j09Var) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= l46Var.i(dd2Var) ? 32 : 16;
            }
            if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
                boolean z = l46Var.k(fne.a) != null;
                boolean z2 = l46Var.k(fne.b) != null;
                if (z && z2) {
                    l46Var.f0(-1977187922);
                    xn8 xn8VarC = s21.c(ndb.b, true);
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
                    dec.l(hj6.z, l46Var, xn8VarC);
                    dec.l(hj6.y, l46Var, u8aVarM);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ);
                    dd2Var.z(l46Var, Integer.valueOf((i3 >> 3) & 14));
                    l46Var.r(true);
                    l46Var.r(false);
                } else if (z) {
                    l46Var.f0(-1976997706);
                    vfh.k(j09Var, dd2Var, l46Var, i3 & 126);
                    l46Var.r(false);
                } else if (z2) {
                    l46Var.f0(-1976846922);
                    lt3.d(j09Var, dd2Var, l46Var, i3 & 126);
                    l46Var.r(false);
                } else {
                    l46Var.f0(-1976716505);
                    n(j09Var, dd2Var, l46Var, i3 & 126);
                    l46Var.r(false);
                }
            } else {
                l46Var.Z();
            }
            ojb ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new sv(j09Var, dd2Var, i2, i4);
            }
        }

        public static final void p(final j09 j09Var, final TarotCardChoice tarotCardChoice, float f2, boolean z, l46 l46Var, final int i2) {
            int i3;
            final float f3;
            final boolean z2;
            tarotCardChoice.getClass();
            l46Var.h0(-2119787616);
            if ((i2 & 6) == 0) {
                i3 = i2 | (l46Var.g(j09Var) ? 4 : 2);
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= l46Var.g(tarotCardChoice) ? 32 : 16;
            }
            int i4 = i3 | 3456;
            if (l46Var.W(i4 & 1, (i4 & 1171) != 1170)) {
                bzd.d(urg.T(j09Var), a7c.b(0.0f), null, null, null, af1.b0(-1632915218, new k43(tarotCardChoice, 4.0f, 5), l46Var), l46Var, 196608, 28);
                z2 = true;
                f3 = 4.0f;
            } else {
                l46Var.Z();
                f3 = f2;
                z2 = z;
            }
            ojb ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: d8b
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        b21.p(j09Var, tarotCardChoice, f3, z2, (l46) obj, k99.P(i2 | 1));
                        return wef.a;
                    }
                };
            }
        }

        public static void q(String str, String str2) {
            if (F(3, str)) {
                Log.d(str, str2);
            }
        }

        public static final gy2 r(pwf pwfVar) {
            pwfVar.getClass();
            return pwfVar instanceof lh6 ? ((lh6) pwfVar).e() : ey2.b;
        }

        public static final j09 s(j09 j09Var, a26 a26Var) {
            return j09Var.D(new hm4(a26Var));
        }

        public static final j09 t(j09 j09Var, a26 a26Var) {
            return j09Var.D(new wn4(a26Var));
        }

        public static final j09 u(j09 j09Var, a26 a26Var) {
            return j09Var.D(new xn4(a26Var));
        }

        public static void v(String str, String str2) {
            if (F(6, str)) {
                b1.d(str, str2);
            }
        }

        public static void w(String str, String str2, Throwable th) {
            if (F(6, str)) {
                b1.e(str, str2, th);
            }
        }

        public static fr8 x(qk2 qk2Var) {
            if (qk2Var instanceof sk7) {
                sk7 sk7Var = (sk7) qk2Var;
                String str = sk7Var.G0;
                String str2 = sk7Var.H0;
                str.getClass();
                str2.getClass();
                return new fr8(str.concat(str2));
            }
            if (!(qk2Var instanceof rk7)) {
                ap.c();
                return null;
            }
            rk7 rk7Var = (rk7) qk2Var;
            String str3 = rk7Var.G0;
            String str4 = rk7Var.H0;
            str3.getClass();
            str4.getClass();
            return new fr8(str3 + '#' + str4);
        }

        public static int y(int i2, int i3) {
            int i4 = i3 / 2;
            if (i2 < 0 || i2 >= 3 || i3 < 0 || i4 >= 19) {
                return -1;
            }
            int i5 = b[i2];
            if (i5 == 44100) {
                return ((i3 % 2) + f[i4]) * 2;
            }
            int i6 = e[i4];
            return i5 == 32000 ? i6 * 6 : i6 * 4;
        }

        public static final Object z(sw6 sw6Var, q95 q95Var) {
            Object obj = sw6Var.r.a.get(q95Var);
            if (obj != null) {
                return obj;
            }
            Object obj2 = sw6Var.t.n.a.get(q95Var);
            return obj2 == null ? q95Var.a : obj2;
        }
    }
