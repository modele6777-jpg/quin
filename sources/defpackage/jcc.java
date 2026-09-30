package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewParent;
import android.widget.Toast;
import androidx.compose.foundation.layout.b;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class jcc {
    public static final void a(final int i, final List list, final a26 a26Var, final float f, final j09 j09Var, l46 l46Var, final int i2) {
        int i3;
        list.getClass();
        a26Var.getClass();
        j09Var.getClass();
        l46Var.h0(-1130591255);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.i(list) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i3 |= l46Var.d(f) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i2 & 24576) == 0) {
            i3 |= l46Var.g(j09Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if (l46Var.W(i3 & 1, (i3 & 9363) != 9362)) {
            boolean zI = ((i3 & 14) == 4) | l46Var.i(list) | ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object objR = l46Var.R();
            if (zI || objR == sf2.a) {
                objR = new bi1(i, f, list, a26Var);
                l46Var.p0(objR);
            }
            m6e.a(j09Var, (l26) objR, l46Var, (i3 >> 12) & 14, 0);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: pjd
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    jcc.a(i, list, a26Var, f, j09Var, (l46) obj, k99.P(i2 | 1));
                    return wef.a;
                }
            };
        }
    }

    public static final void b(final g8d g8dVar, final e8d e8dVar, final float f, final boolean z, final boolean z2, final x4d x4dVar, final x16 x16Var, j18 j18Var, o26 o26Var, n26 n26Var, l46 l46Var, final int i) {
        final j18 j18Var2;
        final o26 o26Var2;
        final n26 n26Var2;
        final n26 n26Var3;
        final o26 o26Var3;
        final j18 j18Var3;
        g8dVar.getClass();
        e8dVar.getClass();
        x16Var.getClass();
        l46Var.h0(1165264100);
        int i2 = i | (l46Var.i(g8dVar) ? 4 : 2) | (l46Var.e(e8dVar.ordinal()) ? 32 : 16) | (l46Var.d(f) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.h(z) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.h(z2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.g(x4dVar) ? 131072 : 65536) | (l46Var.i(x16Var) ? 1048576 : 524288) | 306184192;
        if (l46Var.W(i2 & 1, (306783379 & i2) != 306783378)) {
            l46Var.b0();
            if ((i & 1) == 0 || l46Var.C()) {
                j18 j18VarA = k18.a(0, 3, l46Var);
                Object objR = l46Var.R();
                i8c i8cVar = sf2.a;
                if (objR == i8cVar) {
                    objR = new vcf(4, null);
                    l46Var.p0(objR);
                }
                o26 o26Var4 = (o26) objR;
                boolean z3 = (i2 & 112) == 32;
                Object objR2 = l46Var.R();
                if (z3 || objR2 == i8cVar) {
                    objR2 = new wcf(e8dVar, null);
                    l46Var.p0(objR2);
                }
                n26Var3 = (n26) objR2;
                o26Var3 = o26Var4;
                j18Var3 = j18VarA;
            } else {
                l46Var.Z();
                j18Var3 = j18Var;
                o26Var3 = o26Var;
                n26Var3 = n26Var;
            }
            l46Var.s();
            nk8.d(b.c, null, af1.b0(929028430, new n26() { // from class: scf
                /* JADX WARN: Code duplicated, block: B:100:0x0336  */
                /* JADX WARN: Code duplicated, block: B:102:0x0358  */
                /* JADX WARN: Code duplicated, block: B:29:0x009a  */
                /* JADX WARN: Code duplicated, block: B:97:0x031c  */
                /* JADX WARN: Code restructure failed: missing block: B:41:0x00e1, code lost:
                
                    if ((((r26 * r4) * 4) + r16) > 67108864) goto L45;
                 */
                @Override // defpackage.n26
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object m(java.lang.Object r38, java.lang.Object r39, java.lang.Object r40) {
                    /*
                        Method dump skipped, instruction units count: 919
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.scf.m(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, l46Var), l46Var, 3078, 6);
            j18Var2 = j18Var3;
            n26Var2 = n26Var3;
            o26Var2 = o26Var3;
        } else {
            l46Var.Z();
            j18Var2 = j18Var;
            o26Var2 = o26Var;
            n26Var2 = n26Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(e8dVar, f, z, z2, x4dVar, x16Var, j18Var2, o26Var2, n26Var2, i) { // from class: tcf
                public final /* synthetic */ e8d b;
                public final /* synthetic */ float c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ x4d f;
                public final /* synthetic */ x16 g;
                public final /* synthetic */ j18 v;
                public final /* synthetic */ o26 w;
                public final /* synthetic */ n26 x;

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(9);
                    jcc.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, (l46) obj, iP);
                    return wef.a;
                }
            };
        }
    }

    public static final Object c(gfh gfhVar, q57 q57Var) throws Exception {
        if (!gfhVar.l()) {
            pl1 pl1Var = new pl1(1, k99.D(q57Var));
            pl1Var.v();
            gfhVar.c(g94.c, new hy2(pl1Var, 3));
            return pl1Var.t();
        }
        Exception excH = gfhVar.h();
        if (excH != null) {
            throw excH;
        }
        if (!gfhVar.d) {
            return gfhVar.i();
        }
        throw new CancellationException("Task " + gfhVar + " was cancelled normally.");
    }

    public static icc d(byte[] bArr, Parcelable.Creator creator) {
        oa7.A(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        icc iccVar = (icc) creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return iccVar;
    }

    public static String e(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static final Object f(twc twcVar, gxc gxcVar) {
        Object objG = twcVar.a.g(gxcVar);
        if (objG == null) {
            return null;
        }
        return objG;
    }

    public static final ViewParent g(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static boolean h(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean i(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static os j(String str) throws ProtocolException {
        int i;
        String strSubstring;
        boolean zC = c5e.C(str, "HTTP/1.", false);
        a1b a1bVar = a1b.HTTP_1_0;
        a1b a1bVar2 = a1b.HTTP_1_1;
        if (zC) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                a1bVar = a1bVar2;
            }
        } else if (c5e.C(str, "ICY ", false)) {
            i = 4;
        } else {
            if (!c5e.C(str, "SOURCETABLE ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 12;
            a1bVar = a1bVar2;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        Integer numD = c5e.D(str.substring(i, i2));
        if (numD == null) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int iIntValue = numD.intValue();
        if (str.length() <= i2) {
            strSubstring = "";
        } else {
            if (str.charAt(i2) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            strSubstring = str.substring(i + 4);
        }
        return new os(a1bVar, iIntValue, strSubstring);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0063 A[PHI: r1
  0x0063: PHI (r1v7 java.lang.String) = (r1v6 java.lang.String), (r1v9 java.lang.String), (r1v9 java.lang.String), (r1v9 java.lang.String) binds: [B:23:0x0058, B:12:0x0031, B:14:0x003b, B:18:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void k(int i, Object obj) {
        String simpleName;
        String message;
        String string;
        Context context = cn1.P0;
        context.getClass();
        if (obj instanceof Integer) {
            Toast.makeText(context, ((Number) obj).intValue(), i).show();
            return;
        }
        if (obj instanceof String) {
            simpleName = (String) obj;
        } else {
            if (obj instanceof owa) {
                message = context.getString(R.string.account_profile_edit_update_failed);
                message.getClass();
                String str = ((owa) obj).a;
                if (str == null || (string = v4e.o0(str).toString()) == null) {
                    simpleName = message;
                } else {
                    String str2 = string.length() > 0 ? string : null;
                    if (str2 != null) {
                        simpleName = ib8.j(message, "\n", str2);
                    } else {
                        simpleName = message;
                    }
                }
            } else if (obj instanceof Throwable) {
                message = ((Throwable) obj).getMessage();
                if (message == null) {
                    simpleName = obj.getClass().getSimpleName();
                } else {
                    simpleName = message;
                }
            } else {
                simpleName = null;
            }
        }
        if (simpleName != null) {
            Toast.makeText(context, simpleName, i).show();
        }
    }

    public static final void l(Object obj) {
        obj.getClass();
        k(0, obj);
    }

    public static void m(String str, int i, List list) {
        if (list.size() == i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i + " parameters found " + list.size());
    }

    public static void n(String str, int i, List list) {
        if (list.size() >= i) {
            return;
        }
        s8f.j(str, " operation requires at least ", i, " parameters found ", list.size());
    }

    public static void o(int i, String str, ArrayList arrayList) {
        if (arrayList.size() <= i) {
            return;
        }
        s8f.j(str, " operation requires at most ", i, " parameters found ", arrayList.size());
    }

    public static boolean p(vqg vqgVar) {
        if (vqgVar == null) {
            return false;
        }
        Double dJ = vqgVar.j();
        return !dJ.isNaN() && dJ.doubleValue() >= 0.0d && dJ.equals(Double.valueOf(Math.floor(dJ.doubleValue())));
    }

    public static isg q(String str) {
        isg isgVar;
        if (str == null || str.isEmpty()) {
            isgVar = null;
        } else {
            isgVar = (isg) isg.z1.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (isgVar != null) {
            return isgVar;
        }
        qc0.j(ub3.i("Unsupported commandId ", str));
        return null;
    }

    public static boolean r(vqg vqgVar, vqg vqgVar2) {
        if (!vqgVar.getClass().equals(vqgVar2.getClass())) {
            return false;
        }
        if ((vqgVar instanceof grg) || (vqgVar instanceof tqg)) {
            return true;
        }
        if (vqgVar instanceof vog) {
            if (Double.isNaN(vqgVar.j().doubleValue()) || Double.isNaN(vqgVar2.j().doubleValue())) {
                return false;
            }
            return vqgVar.j().equals(vqgVar2.j());
        }
        if (vqgVar instanceof erg) {
            return vqgVar.d().equals(vqgVar2.d());
        }
        if (vqgVar instanceof lng) {
            return vqgVar.a().equals(vqgVar2.a());
        }
        return vqgVar == vqgVar2;
    }

    public static int s(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) ((((double) (d > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d))) % 4.294967296E9d);
    }

    public static double t(double d) {
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || d == 0.0d) {
            return d;
        }
        return ((double) (d > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d));
    }

    public static Object u(vqg vqgVar) {
        if (vqg.w0.equals(vqgVar)) {
            return null;
        }
        if (vqg.v0.equals(vqgVar)) {
            return "";
        }
        if (vqgVar instanceof rqg) {
            return v((rqg) vqgVar);
        }
        if (!(vqgVar instanceof smg)) {
            return !vqgVar.j().isNaN() ? vqgVar.j() : vqgVar.d();
        }
        ArrayList arrayList = new ArrayList();
        smg smgVar = (smg) vqgVar;
        int i = 0;
        while (i < smgVar.p()) {
            if (i >= smgVar.p()) {
                r3.n(ub3.h(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
                return null;
            }
            int i2 = i + 1;
            Object objU = u(smgVar.q(i));
            if (objU != null) {
                arrayList.add(objU);
            }
            i = i2;
        }
        return arrayList;
    }

    public static HashMap v(rqg rqgVar) {
        HashMap map = new HashMap();
        for (String str : new ArrayList(rqgVar.a.keySet())) {
            Object objU = u(rqgVar.e(str));
            if (objU != null) {
                map.put(str, objU);
            }
        }
        return map;
    }

    public static void w(kxa kxaVar) {
        int iS = s(kxaVar.z("runtime.counter").j().doubleValue() + 1.0d);
        if (iS <= 1000000) {
            kxaVar.x("runtime.counter", new vog(Double.valueOf(iS)));
        } else {
            qc0.p("Instructions allowed exceeded");
        }
    }
}
