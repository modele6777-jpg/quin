package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.SparseIntArray;
import androidx.compose.ui.node.LayoutNode;
import com.adjust.sdk.sig.r3;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.core.b1;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class fz3 implements cu2, ut4, t07, b22, o6e, uj9, ia1, qr9 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public fz3(int i) {
        this.a = i;
        switch (i) {
            case 5:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.b = byteArrayOutputStream;
                this.c = new DataOutputStream(byteArrayOutputStream);
                break;
            case 6:
                this.b = new HashMap();
                this.c = b72.b;
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                this.b = new SparseIntArray();
                this.c = new SparseIntArray();
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                this.b = new Object();
                this.c = new ArrayList();
                break;
            case 15:
                this.b = new ArrayList(0);
                this.c = new ArrayList(0);
                break;
            case 23:
                this.b = new w79();
                this.c = new w79();
                break;
            case 26:
                this.b = new p89(0, new LayoutNode[16]);
                break;
            default:
                this.b = new ArrayList();
                float[] fArr = new float[5];
                for (int i2 = 0; i2 < 5; i2++) {
                    fArr[i2] = Float.NaN;
                }
                this.c = fArr;
                break;
        }
    }

    public static b72 m(b72 b72Var, List list) {
        b72Var.getClass();
        Map map = b72Var.a;
        HashMap map2 = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                map2.remove(str);
            }
        }
        return new b72(map2);
    }

    public static void o(LayoutNode layoutNode) {
        if (layoutNode.e1 > 0) {
            layoutNode.j();
            layoutNode.d1 = false;
            p89 p89VarL = layoutNode.L();
            Object[] objArr = p89VarL.a;
            int i = p89VarL.c;
            for (int i2 = 0; i2 < i; i2++) {
                o((LayoutNode) objArr[i2]);
            }
        }
    }

    public static int t(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    @Override // defpackage.t07
    public void a() {
        synchronized (this.b) {
            try {
                for (u07 u07Var : (ArrayList) this.c) {
                    ((dg1) u07Var.c).l(u07Var.a, null);
                    u07Var.b.a();
                }
                ((ArrayList) this.c).clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.o6e
    public p6e apply() {
        return ((gw7) this.b).e(this.c);
    }

    @Override // defpackage.t07
    public void b(int i, lu3 lu3Var, yf1 yf1Var) {
        lu3Var.getClass();
        yf1Var.getClass();
        synchronized (this.b) {
            ((ArrayList) this.c).add(new u07(i, lu3Var, yf1Var));
        }
    }

    @Override // defpackage.ut4
    public Object c() {
        return (off) this.b;
    }

    @Override // defpackage.ia1
    public void d(v91 v91Var, ryb rybVar) {
        ha1 ha1Var = (ha1) this.b;
        fm9 fm9Var = (fm9) this.c;
        try {
            try {
                ha1Var.p(fm9Var, fm9Var.c(rybVar));
            } catch (Throwable th) {
                an1.Q(th);
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            an1.Q(th2);
            try {
                ha1Var.w(fm9Var, th2);
            } catch (Throwable th3) {
                an1.Q(th3);
                th3.printStackTrace();
            }
        }
    }

    @Override // defpackage.qr9
    public List e(Integer num) {
        List listE = ((qr9) this.b).e(null);
        opd opdVar = (opd) this.c;
        int i = opdVar.v;
        return i < 0 ? listE : s72.Q0(cn1.p(opdVar, num, i, Integer.valueOf(opdVar.F(opdVar.b, i))), listE);
    }

    @Override // defpackage.t07
    public void f(lu3 lu3Var) {
        synchronized (this.b) {
            for (u07 u07Var : (ArrayList) this.c) {
                u07Var.getClass();
                if (pa7.t(u07Var.b, lu3Var)) {
                    lu3Var.a();
                }
            }
        }
    }

    @Override // defpackage.qr9
    public boolean g() {
        return ((qr9) this.b).g();
    }

    @Override // defpackage.ia1
    public void h(v91 v91Var, IOException iOException) {
        try {
            ((ha1) this.b).w((fm9) this.c, iOException);
        } catch (Throwable th) {
            an1.Q(th);
            th.printStackTrace();
        }
    }

    @Override // defpackage.ut4
    public boolean i(CharSequence charSequence, int i, int i2, g9f g9fVar) {
        if ((g9fVar.c & 4) > 0) {
            return true;
        }
        if (((off) this.b) == null) {
            this.b = new off(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((m8c) this.c).getClass();
        ((off) this.b).setSpan(new h9f(g9fVar), i, i2, 33);
        return true;
    }

    public zse j(List list) throws IOException {
        vs4 vs4Var = null;
        try {
            int size = list.size();
            int i = 0;
            vs4 vs4Var2 = null;
            while (i < size) {
                try {
                    vs4 vs4Var3 = (vs4) list.get(i);
                    try {
                        vs4Var3.a((er0) this.c);
                        i++;
                        vs4Var2 = vs4Var3;
                    } catch (Exception e) {
                        e = e;
                        vs4Var = vs4Var3;
                        StringBuilder sb = new StringBuilder();
                        int iC = ((p90) ((er0) this.c).f).C();
                        eue eueVarG = ((er0) this.c).g();
                        er0 er0Var = (er0) this.c;
                        sb.append("Error while applying EditCommand batch to buffer (length=" + iC + ", composition=" + eueVarG + ", selection=" + eue.i(u3c.b(er0Var.b, er0Var.c)) + "):");
                        sb.append('\n');
                        s72.C0(list, sb, "\n", null, null, new ot1(vs4Var, this), 60);
                        throw new RuntimeException(sb.toString(), e);
                    }
                } catch (Exception e2) {
                    e = e2;
                    vs4Var = vs4Var2;
                }
            }
            er0 er0Var2 = (er0) this.c;
            er0Var2.getClass();
            k00 k00Var = new k00(((p90) er0Var2.f).toString());
            er0 er0Var3 = (er0) this.c;
            long jB = u3c.b(er0Var3.b, er0Var3.c);
            eue eueVar = eue.h(((zse) this.b).b) ? null : new eue(jB);
            zse zseVar = new zse(k00Var, eueVar != null ? eueVar.a : u3c.b(eue.f(jB), eue.g(jB)), ((er0) this.c).g());
            this.b = zseVar;
            return zseVar;
        } catch (Exception e3) {
            e = e3;
        }
    }

    public void k(float f, Object obj) {
        ArrayList arrayList = (ArrayList) this.b;
        arrayList.add(obj);
        if (((float[]) this.c).length < arrayList.size()) {
            this.c = Arrays.copyOf((float[]) this.c, arrayList.size() + 2);
        }
        ((float[]) this.c)[arrayList.size() - 1] = f;
    }

    public void l() {
        this.b = null;
        this.c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void n() {
        Object[] objArr;
        p89 p89Var = (p89) this.b;
        Arrays.sort(p89Var.a, 0, p89Var.c, ww2.f);
        int i = p89Var.c;
        LayoutNode[] layoutNodeArr = (LayoutNode[]) this.c;
        if (layoutNodeArr == null || layoutNodeArr.length < i) {
            objArr = layoutNodeArr;
            objArr = new LayoutNode[Math.max(16, i)];
        }
        objArr = layoutNodeArr;
        this.c = null;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = p89Var.a[i2];
        }
        p89Var.g();
        while (true) {
            i--;
            if (-1 >= i) {
                this.c = objArr;
                return;
            }
            LayoutNode layoutNode = objArr[i];
            layoutNode.getClass();
            if (layoutNode.d1) {
                o(layoutNode);
            }
            objArr[i] = 0;
        }
    }

    public void p(String str, PrintWriter printWriter) {
        ba8 ba8Var = (ba8) this.c;
        if (ba8Var.b.d() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String strConcat = str.concat("    ");
            for (int i = 0; i < ba8Var.b.d(); i++) {
                z98 z98Var = (z98) ba8Var.b.e(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(ba8Var.b.b(i));
                printWriter.print(": ");
                printWriter.println(z98Var.toString());
                printWriter.print(strConcat);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(strConcat);
                printWriter.print("mLoader=");
                printWriter.println(z98Var.l);
                djg djgVar = z98Var.l;
                String strConcat2 = strConcat.concat("  ");
                djgVar.getClass();
                printWriter.print(strConcat2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mListener=");
                printWriter.println(djgVar.a);
                if (djgVar.b || djgVar.e) {
                    printWriter.print(strConcat2);
                    printWriter.print("mStarted=");
                    printWriter.print(djgVar.b);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(djgVar.e);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (djgVar.c || djgVar.d) {
                    printWriter.print(strConcat2);
                    printWriter.print("mAbandoned=");
                    printWriter.print(djgVar.c);
                    printWriter.print(" mReset=");
                    printWriter.println(djgVar.d);
                }
                if (djgVar.g != null) {
                    printWriter.print(strConcat2);
                    printWriter.print("mTask=");
                    printWriter.print(djgVar.g);
                    printWriter.print(" waiting=");
                    djgVar.g.getClass();
                    printWriter.println(false);
                }
                if (djgVar.h != null) {
                    printWriter.print(strConcat2);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(djgVar.h);
                    printWriter.print(" waiting=");
                    djgVar.h.getClass();
                    printWriter.println(false);
                }
                if (z98Var.n != null) {
                    printWriter.print(strConcat);
                    printWriter.print("mCallbacks=");
                    printWriter.println(z98Var.n);
                    aa8 aa8Var = z98Var.n;
                    String strConcat3 = strConcat.concat("  ");
                    aa8Var.getClass();
                    printWriter.print(strConcat3);
                    printWriter.print("mDeliveredData=");
                    printWriter.println(aa8Var.b);
                }
                printWriter.print(strConcat);
                printWriter.print("mData=");
                djg djgVar2 = z98Var.l;
                Object objD = z98Var.d();
                djgVar2.getClass();
                StringBuilder sb = new StringBuilder(64);
                if (objD == null) {
                    sb.append("null");
                } else {
                    Class<?> cls = objD.getClass();
                    sb.append(cls.getSimpleName());
                    sb.append("{");
                    sb.append(Integer.toHexString(System.identityHashCode(cls)));
                    sb.append("}");
                }
                printWriter.println(sb.toString());
                printWriter.print(strConcat);
                printWriter.print("mStarted=");
                printWriter.println(z98Var.c > 0);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    public CctBackendFactory q(String str) {
        Bundle bundle;
        Object obj;
        Map map = (Map) this.c;
        if (map == null) {
            Context context = (Context) this.b;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    b1.l("BackendRegistry", "Context has no PackageManager.");
                } else {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                    if (serviceInfo == null) {
                        b1.l("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    } else {
                        bundle = serviceInfo.metaData;
                    }
                    if (bundle == null) {
                        b1.l("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap map2 = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            obj = bundle.get(str2);
                            if (!(obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String strTrim = str3.trim();
                                    if (!strTrim.isEmpty()) {
                                        map2.put(strTrim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = map2;
                    }
                    this.c = map;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                b1.l("BackendRegistry", "Application info not found.");
            }
            bundle = null;
            if (bundle == null) {
                b1.l("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                map = Collections.EMPTY_MAP;
            } else {
                HashMap map3 = new HashMap();
                while (r6.hasNext()) {
                    obj = bundle.get(str2);
                    if (!(obj instanceof String)) {
                    }
                }
                map = map3;
            }
            this.c = map;
        }
        String str4 = (String) map.get(str);
        if (str4 != null) {
            try {
                return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e) {
                b1.n("BackendRegistry", "Class " + str4 + " is not found.", e);
            } catch (IllegalAccessException e2) {
                b1.n("BackendRegistry", "Could not instantiate " + str4 + ".", e2);
            } catch (InstantiationException e3) {
                b1.n("BackendRegistry", "Could not instantiate " + str4 + ".", e3);
            } catch (NoSuchMethodException e4) {
                b1.n("BackendRegistry", "Could not instantiate ".concat(str4), e4);
            } catch (InvocationTargetException e5) {
                b1.n("BackendRegistry", "Could not instantiate ".concat(str4), e5);
            }
        }
        return null;
    }

    @Override // defpackage.b22
    public a22 r(j22 j22Var) {
        j22Var.getClass();
        g5b g5bVar = (g5b) this.b;
        h04 h04Var = (h04) this.c;
        h04Var.c().c.getClass();
        cob cobVarW = abg.w(g5bVar, j22Var, fv8.g);
        if (cobVarW == null) {
            return null;
        }
        smb.a(cobVarW.a).equals(j22Var);
        return h04Var.g(cobVarW);
    }

    public xn8 s() {
        return (xn8) ((vz9) this.c).getValue();
    }

    public String toString() {
        switch (this.a) {
            case 18:
                StringBuilder sb = new StringBuilder(UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                sb.append("LoaderManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                Class<?> cls = ((x48) this.b).getClass();
                sb.append(cls.getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(cls)));
                sb.append("}}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u() {
        ((SparseIntArray) this.b).clear();
    }

    @Override // defpackage.cu2
    public Object v(Object obj) {
        vyb vybVar = (vyb) obj;
        vybVar.getClass();
        kb6 kb6Var = (kb6) this.c;
        return ((wg7) kb6Var.b).b((xn7) this.b, vybVar.u());
    }

    public void w(b72 b72Var) {
        for (Map.Entry entry : new HashMap((HashMap) this.b).entrySet()) {
            if (entry.getKey() != null) {
                r3.f();
                return;
            } else {
                List list = (List) entry.getValue();
                if (!m(b72Var, list).equals(m((b72) this.c, list))) {
                    throw null;
                }
            }
        }
        this.c = b72Var;
    }

    @Override // defpackage.o6e
    public boolean w0() {
        return true;
    }

    public void x(g49 g49Var) {
        w79 w79Var = (w79) this.b;
        Object objG = ((w79) this.c).g(g49Var);
        if (objG != null) {
            int i = 3;
            if (!(objG instanceof i79)) {
                w59.c(w79Var, (e49) objG, new p59(i, g49Var));
                return;
            }
            qk9 qk9Var = (qk9) objG;
            Object[] objArr = qk9Var.a;
            int i2 = qk9Var.b;
            for (int i3 = 0; i3 < i2; i3++) {
                Object obj = objArr[i3];
                obj.getClass();
                w59.c(w79Var, (e49) obj, new p59(i, g49Var));
            }
        }
    }

    public void y(int i, p90 p90Var) throws IOException {
        Iterator it = (Iterator) this.b;
        while (true) {
            Map.Entry entry = (Map.Entry) this.c;
            if (entry == null || ((r56) entry.getKey()).a >= i) {
                return;
            }
            r56 r56Var = (r56) ((Map.Entry) this.c).getKey();
            Object value = ((Map.Entry) this.c).getValue();
            xc5 xc5Var = xc5.c;
            x9g x9gVar = r56Var.b;
            int i2 = r56Var.a;
            if (r56Var.c) {
                for (Object obj : (List) value) {
                    if (x9gVar == x9g.c) {
                        p90Var.s0(i2, 3);
                        ((ut8) obj).d(p90Var);
                        p90Var.s0(i2, 4);
                    } else {
                        p90Var.s0(i2, x9gVar.b());
                        xc5.k(p90Var, x9gVar, obj);
                    }
                }
            } else if (x9gVar == x9g.c) {
                p90Var.s0(i2, 3);
                ((ut8) value).d(p90Var);
                p90Var.s0(i2, 4);
            } else {
                p90Var.s0(i2, x9gVar.b());
                xc5.k(p90Var, x9gVar, value);
            }
            if (it.hasNext()) {
                this.c = (Map.Entry) it.next();
            } else {
                this.c = null;
            }
        }
    }

    @Override // defpackage.o6e
    public boolean y0(bo1 bo1Var) {
        return true;
    }

    @Override // defpackage.o6e
    public void cancel() {
    }

    public /* synthetic */ fz3(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ fz3(Cloneable cloneable, Object obj, int i) {
        this.a = i;
        this.c = cloneable;
        this.b = obj;
    }

    public fz3(LayoutNode layoutNode, xn8 xn8Var) {
        this.a = 12;
        this.b = layoutNode;
        this.c = q1c.f(xn8Var);
    }

    public fz3(x48 x48Var, owf owfVar) {
        this.a = 18;
        this.b = x48Var;
        owfVar.getClass();
        ey2 ey2Var = ey2.b;
        ey2Var.getClass();
        kxa kxaVar = new kxa(owfVar, ba8.d, ey2Var);
        em7 em7VarB = job.a.b(ba8.class);
        String strG = em7VarB.g();
        if (strG != null) {
            this.c = (ba8) kxaVar.f(em7VarB, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strG));
        } else {
            qc0.j("Local and anonymous classes can not be ViewModels");
            throw null;
        }
    }

    public fz3(String str, Set set) {
        this.a = 0;
        str.getClass();
        this.b = str;
        this.c = set;
    }

    public fz3(i1b i1bVar) {
        this.a = 29;
        this.c = Collections.synchronizedMap(new HashMap());
        this.b = i1bVar;
    }

    public fz3(Context context) {
        this.a = 19;
        this.c = null;
        this.b = context;
    }

    public fz3(Map map) {
        this.a = 24;
        this.b = map;
        this.c = new ge8("Java nullability annotation states").c(new x(27, this));
    }

    public fz3(q56 q56Var) {
        this.a = 9;
        xc5 xc5Var = q56Var.extensions;
        xc5Var.getClass();
        Iterator it = ((ed0) xc5Var.a.entrySet()).iterator();
        this.b = it;
        if (it.hasNext()) {
            this.c = (Map.Entry) it.next();
        }
    }

    public fz3(yob yobVar, int[] iArr) {
        this.a = 22;
        this.b = jy6.o(yobVar);
        this.c = iArr;
    }

    public /* synthetic */ fz3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
