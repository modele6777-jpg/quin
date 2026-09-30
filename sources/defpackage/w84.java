package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.ArrayMap;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import android.widget.EditText;
import androidx.compose.ui.node.LayoutNode;
import androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks;
import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import io.sentry.android.core.b1;
import io.sentry.config.a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class w84 implements s36, rsd, o6e, t6e, h1b, lw6, yb3, rl1, x22, goe {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public w84(String str, int i) {
        this.a = i;
        switch (i) {
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                str.getClass();
                this.b = str;
                this.c = new ArrayList(0);
                wu8.a.getClass();
                List listA = vu8.a();
                new ArrayList();
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    ((wu8) it.next()).getClass();
                }
                break;
            default:
                this.b = str.concat(".lck");
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003a A[Catch: IOException -> 0x006d, TryCatch #0 {IOException -> 0x006d, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:25:0x005b), top: B:30:0x0000 }] */
    public static w84 b1(String... strArr) {
        String str;
        try {
            a71[] a71VarArr = new a71[strArr.length];
            f41 f41Var = new f41();
            for (int i = 0; i < strArr.length; i++) {
                String str2 = strArr[i];
                String[] strArr2 = cj7.e;
                f41Var.i1(34);
                int length = str2.length();
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    char cCharAt = str2.charAt(i3);
                    if (cCharAt < 128) {
                        str = strArr2[cCharAt];
                        if (str != null) {
                            if (i2 < i3) {
                                f41Var.m1(i2, i3, str2);
                            }
                            f41Var.n1(str);
                            i2 = i3 + 1;
                        }
                    } else {
                        if (cCharAt == 8232) {
                            str = "\\u2028";
                        } else if (cCharAt == 8233) {
                            str = "\\u2029";
                        }
                        if (i2 < i3) {
                            f41Var.m1(i2, i3, str2);
                        }
                        f41Var.n1(str);
                        i2 = i3 + 1;
                    }
                }
                if (i2 < length) {
                    f41Var.m1(i2, length, str2);
                }
                f41Var.i1(34);
                f41Var.h0();
                a71VarArr[i] = f41Var.p0(f41Var.b);
            }
            return new w84(15, (String[]) strArr.clone(), jgb.b0(a71VarArr));
        } catch (IOException e) {
            qc0.i(e);
            return null;
        }
    }

    @Override // defpackage.r8f
    public /* bridge */ x8f A(e8f e8fVar) {
        return db6.W(e8fVar);
    }

    @Override // defpackage.lw6
    public iw6 A0() {
        return H0(((egh) this.b).A0());
    }

    @Override // defpackage.lw6
    public void B() {
        ((egh) this.b).B();
    }

    @Override // defpackage.r8f
    public w4c C(xt7 xt7Var) {
        tjd tjdVarU0;
        xt7Var.getClass();
        bj5 bj5VarR = db6.r(xt7Var);
        if (bj5VarR != null && (tjdVarU0 = db6.u0(bj5VarR)) != null) {
            return tjdVarU0;
        }
        tjd tjdVarS = db6.s(xt7Var);
        tjdVarS.getClass();
        return tjdVarS;
    }

    @Override // defpackage.r8f
    public /* bridge */ c7f C0(w4c w4cVar) {
        return db6.o(w4cVar);
    }

    @Override // defpackage.r8f
    public /* bridge */ xt7 D(fp1 fp1Var) {
        return db6.v0(fp1Var);
    }

    @Override // defpackage.x22
    public /* bridge */ jgf D0(vjd vjdVar, vjd vjdVar2) {
        return db6.C(this, vjdVar, vjdVar2);
    }

    @Override // defpackage.r8f
    public /* bridge */ Collection E(k7f k7fVar) {
        return db6.O0(k7fVar);
    }

    @Override // defpackage.r8f
    public /* bridge */ xt7 E0(xt7 xt7Var) {
        return db6.j1(this, xt7Var);
    }

    @Override // defpackage.r8f
    public /* bridge */ boolean F(k7f k7fVar) {
        return db6.f0(k7fVar);
    }

    @Override // defpackage.r8f
    public /* bridge */ boolean F0(xt7 xt7Var) {
        return db6.g0(xt7Var);
    }

    @Override // defpackage.r8f
    public /* bridge */ k7f G(w4c w4cVar) {
        return db6.d1(w4cVar);
    }

    public void G0(Object obj, String str) {
        int length = str.length();
        String strValueOf = String.valueOf(obj);
        ((ArrayList) this.b).add(ib8.m(new StringBuilder(length + 1 + strValueOf.length()), str, "=", strValueOf));
    }

    @Override // defpackage.r8f
    public /* bridge */ to1 H(fp1 fp1Var) {
        return db6.z(fp1Var);
    }

    public p3d H0(iw6 iw6Var) {
        wde wdeVar;
        Object obj = null;
        if (iw6Var == null) {
            return null;
        }
        if (((uva) this.c) == null) {
            wdeVar = wde.b;
        } else {
            uva uvaVar = (uva) this.c;
            Pair pair = new Pair(uvaVar.h, uvaVar.i.get(0));
            wde wdeVar2 = wde.b;
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put((String) pair.first, pair.second);
            wdeVar = new wde(arrayMap);
        }
        this.c = null;
        return new p3d(iw6Var, new Size(iw6Var.d(), iw6Var.c()), new pe1(new xj0(iw6Var.u0().i(), obj, wdeVar)));
    }

    @Override // defpackage.r8f
    public boolean I(xt7 xt7Var) {
        xt7Var.getClass();
        return db6.l0(C(xt7Var)) != db6.l0(U(xt7Var));
    }

    public void I0(kx5 kx5Var, boolean z) {
        kx5 kx5Var2 = ((zx5) this.b).y;
        if (kx5Var2 != null) {
            kx5Var2.j().o.I0(kx5Var, true);
        }
        for (qx5 qx5Var : (CopyOnWriteArrayList) this.c) {
            if (z) {
                qx5Var.getClass();
            }
            FragmentManager$FragmentLifecycleCallbacks fragmentManager$FragmentLifecycleCallbacks = qx5Var.a;
        }
    }

    @Override // defpackage.r8f
    public boolean J(xt7 xt7Var) {
        xt7Var.getClass();
        tjd tjdVarS = db6.s(xt7Var);
        return (tjdVarS != null ? db6.q(tjdVarS) : null) != null;
    }

    public void J0(kx5 kx5Var, boolean z) {
        zx5 zx5Var = (zx5) this.b;
        Context context = zx5Var.w.H0;
        kx5 kx5Var2 = zx5Var.y;
        if (kx5Var2 != null) {
            kx5Var2.j().o.J0(kx5Var, true);
        }
        for (qx5 qx5Var : (CopyOnWriteArrayList) this.c) {
            if (z) {
                qx5Var.getClass();
            }
            qx5Var.a.a(zx5Var, kx5Var, context);
        }
    }

    @Override // defpackage.x22
    public /* bridge */ tjd K(tt7 tt7Var) {
        return db6.s(tt7Var);
    }

    public void K0(kx5 kx5Var, Bundle bundle, boolean z) {
        zx5 zx5Var = (zx5) this.b;
        kx5 kx5Var2 = zx5Var.y;
        if (kx5Var2 != null) {
            kx5Var2.j().o.K0(kx5Var, bundle, true);
        }
        for (qx5 qx5Var : (CopyOnWriteArrayList) this.c) {
            if (z) {
                qx5Var.getClass();
            }
            qx5Var.a.b(zx5Var, kx5Var);
        }
    }

    @Override // defpackage.r8f
    public boolean L(w4c w4cVar) {
        w4cVar.getClass();
        return db6.q(w4cVar) != null;
    }

    public void L0(kx5 kx5Var, boolean z) {
        zx5 zx5Var = (zx5) this.b;
        kx5 kx5Var2 = zx5Var.y;
        if (kx5Var2 != null) {
            kx5Var2.j().o.L0(kx5Var, true);
        }
        for (qx5 qx5Var : (CopyOnWriteArrayList) this.c) {
            if (z) {
                qx5Var.getClass();
            }
            qx5Var.a.c(zx5Var, kx5Var);
        }
    }

    @Override // defpackage.r8f
    public boolean M(w4c w4cVar) {
        return db6.j0(db6.d1(w4cVar));
    }

    public void M0(kx5 kx5Var, boolean z) {
        zx5 zx5Var = (zx5) this.b;
        kx5 kx5Var2 = zx5Var.y;
        if (kx5Var2 != null) {
            kx5Var2.j().o.M0(kx5Var, true);
        }
        for (qx5 qx5Var : (CopyOnWriteArrayList) this.c) {
            if (z) {
                qx5Var.getClass();
            }
            qx5Var.a.d(zx5Var, kx5Var);
        }
    }

    @Override // defpackage.t6e
    public boolean N(Object obj, Object obj2) {
        qz7 qz7Var = (qz7) this.b;
        return pa7.t(qz7Var.b(obj), qz7Var.b(obj2));
    }

    public void N0(kx5 kx5Var, boolean z) {
        zx5 zx5Var = (zx5) this.b;
        kx5 kx5Var2 = zx5Var.y;
        if (kx5Var2 != null) {
            kx5Var2.j().o.N0(kx5Var, true);
        }
        for (qx5 qx5Var : (CopyOnWriteArrayList) this.c) {
            if (z) {
                qx5Var.getClass();
            }
            qx5Var.a.e(zx5Var, kx5Var);
        }
    }

    @Override // defpackage.r8f
    public l26 O() {
        return null;
    }

    public void O0(kx5 kx5Var, boolean z) {
        zx5 zx5Var = (zx5) this.b;
        Context context = zx5Var.w.H0;
        kx5 kx5Var2 = zx5Var.y;
        if (kx5Var2 != null) {
            kx5Var2.j().o.O0(kx5Var, true);
        }
        for (qx5 qx5Var : (CopyOnWriteArrayList) this.c) {
            if (z) {
                qx5Var.getClass();
            }
            FragmentManager$FragmentLifecycleCallbacks fragmentManager$FragmentLifecycleCallbacks = qx5Var.a;
        }
    }

    @Override // defpackage.r8f
    public /* bridge */ v2c P(w4c w4cVar) {
        return db6.N0(this, w4cVar);
    }

    public void P0(kx5 kx5Var, boolean z) {
        kx5 kx5Var2 = ((zx5) this.b).y;
        if (kx5Var2 != null) {
            kx5Var2.j().o.P0(kx5Var, true);
        }
        for (qx5 qx5Var : (CopyOnWriteArrayList) this.c) {
            if (z) {
                qx5Var.getClass();
            }
            FragmentManager$FragmentLifecycleCallbacks fragmentManager$FragmentLifecycleCallbacks = qx5Var.a;
        }
    }

    @Override // defpackage.r8f
    public /* bridge */ Collection Q(w4c w4cVar) {
        return db6.B0(this, w4cVar);
    }

    public void Q0(kx5 kx5Var, boolean z) {
        zx5 zx5Var = (zx5) this.b;
        kx5 kx5Var2 = zx5Var.y;
        if (kx5Var2 != null) {
            kx5Var2.j().o.Q0(kx5Var, true);
        }
        for (qx5 qx5Var : (CopyOnWriteArrayList) this.c) {
            if (z) {
                qx5Var.getClass();
            }
            qx5Var.a.f(zx5Var, kx5Var);
        }
    }

    @Override // defpackage.r8f
    public xt7 R(xt7 xt7Var) {
        return db6.w0(xt7Var);
    }

    public void R0(kx5 kx5Var, Bundle bundle, boolean z) {
        zx5 zx5Var = (zx5) this.b;
        kx5 kx5Var2 = zx5Var.y;
        if (kx5Var2 != null) {
            kx5Var2.j().o.R0(kx5Var, bundle, true);
        }
        for (qx5 qx5Var : (CopyOnWriteArrayList) this.c) {
            if (z) {
                qx5Var.getClass();
            }
            qx5Var.a.g(zx5Var, kx5Var, bundle);
        }
    }

    @Override // defpackage.r8f
    public /* bridge */ void S(w4c w4cVar) {
        db6.s0(w4cVar);
    }

    public void S0(kx5 kx5Var, boolean z) {
        zx5 zx5Var = (zx5) this.b;
        kx5 kx5Var2 = zx5Var.y;
        if (kx5Var2 != null) {
            kx5Var2.j().o.S0(kx5Var, true);
        }
        for (qx5 qx5Var : (CopyOnWriteArrayList) this.c) {
            if (z) {
                qx5Var.getClass();
            }
            qx5Var.a.h(zx5Var, kx5Var);
        }
    }

    @Override // defpackage.r8f
    public /* bridge */ int T(k7f k7fVar) {
        return db6.z0(k7fVar);
    }

    public void T0(kx5 kx5Var, boolean z) {
        zx5 zx5Var = (zx5) this.b;
        kx5 kx5Var2 = zx5Var.y;
        if (kx5Var2 != null) {
            kx5Var2.j().o.T0(kx5Var, true);
        }
        for (qx5 qx5Var : (CopyOnWriteArrayList) this.c) {
            if (z) {
                qx5Var.getClass();
            }
            qx5Var.a.i(zx5Var, kx5Var);
        }
    }

    @Override // defpackage.r8f
    public w4c U(xt7 xt7Var) {
        tjd tjdVarE1;
        xt7Var.getClass();
        bj5 bj5VarR = db6.r(xt7Var);
        if (bj5VarR != null && (tjdVarE1 = db6.e1(bj5VarR)) != null) {
            return tjdVarE1;
        }
        tjd tjdVarS = db6.s(xt7Var);
        tjdVarS.getClass();
        return tjdVarS;
    }

    public void U0(kx5 kx5Var, boolean z) {
        zx5 zx5Var = (zx5) this.b;
        kx5 kx5Var2 = zx5Var.y;
        if (kx5Var2 != null) {
            kx5Var2.j().o.U0(kx5Var, true);
        }
        for (qx5 qx5Var : (CopyOnWriteArrayList) this.c) {
            if (z) {
                qx5Var.getClass();
            }
            qx5Var.a.j(zx5Var, kx5Var);
        }
    }

    @Override // defpackage.goe
    public void V(dd2 dd2Var, l46 l46Var, int i) {
        l46Var.h0(283603257);
        int i2 = i | (l46Var.g(this) ? 32 : 16);
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = ib8.e(l46Var);
            }
            qk6.O0.V(((use) this.b).d().c.toString(), dd2Var, true, true, m8c.w, (t69) objR, false, null, af1.b0(-1210139903, new o8((String) this.c, 23), l46Var), null, m8c.p(eze.a(l46Var).b.w(l46Var), eze.a(l46Var).b.w(l46Var), eze.a(l46Var).b.w(l46Var), 0L, 0L, 0L, 0L, 0L, l46Var, 2147483471), new bx9(16.0f, 0.0f, 16.0f, 0.0f), ynb.f, l46Var, 100887984, 16064);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new rk6(this, dd2Var, i, 21);
        }
    }

    public void V0(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = (HashMap) this.b;
        y0b y0bVar = new y0b(byteArrayOutputStream, map, (HashMap) this.c);
        if (obj == null) {
            return;
        }
        lk9 lk9Var = (lk9) map.get(obj.getClass());
        if (lk9Var != null) {
            lk9Var.encode(obj, y0bVar);
            return;
        }
        throw new kv4("No encoder for " + obj.getClass());
    }

    @Override // defpackage.r8f
    public /* bridge */ fp1 W(vjd vjdVar) {
        return db6.p(this, vjdVar);
    }

    public File W0() {
        if (((File) this.b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.b) == null) {
                        String str = "PersistedInstallation." + ((ff5) this.c).e() + ".json";
                        ff5 ff5Var = (ff5) this.c;
                        ff5Var.a();
                        File file = new File(ff5Var.a.getNoBackupFilesDir(), str);
                        this.b = file;
                        if (file.exists()) {
                            return (File) this.b;
                        }
                        ff5 ff5Var2 = (ff5) this.c;
                        ff5Var2.a();
                        File file2 = new File(ff5Var2.a.getFilesDir(), str);
                        if (file2.exists() && !file2.renameTo((File) this.b)) {
                            b1.e("PersistedInstallation", "Unable to move the file from back up to non back up directory", new IOException("Unable to move the file from back up to non back up directory"));
                            return file2;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (File) this.b;
    }

    @Override // defpackage.r8f
    public xt7 X(ArrayList arrayList) {
        tjd tjdVar;
        int size = arrayList.size();
        if (size == 0) {
            qc0.p("Expected some types");
            return null;
        }
        if (size == 1) {
            return (jgf) s72.W0(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(t72.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            jgf jgfVar = (jgf) it.next();
            z = z || i7h.x(jgfVar);
            if (jgfVar instanceof tjd) {
                tjdVar = (tjd) jgfVar;
            } else {
                if (!(jgfVar instanceof bj5)) {
                    ap.c();
                    return null;
                }
                tjdVar = ((bj5) jgfVar).b;
                z2 = true;
            }
            arrayList2.add(tjdVar);
        }
        if (z) {
            return sy4.c(qy4.K0, arrayList.toString());
        }
        y7f y7fVar = y7f.a;
        if (!z2) {
            return y7fVar.b(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(t72.u(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(pa7.j0((jgf) it2.next()));
        }
        return rxg.E(y7fVar.b(arrayList2), y7fVar.b(arrayList3));
    }

    public zv7 X0() {
        gw7 gw7Var = (gw7) this.b;
        LayoutNode layoutNode = (LayoutNode) gw7Var.x.g(this.c);
        if (layoutNode != null) {
            return (zv7) gw7Var.f.g(layoutNode);
        }
        return null;
    }

    @Override // defpackage.r8f
    public /* bridge */ d7f Y(xt7 xt7Var) {
        return db6.t(xt7Var);
    }

    public synchronized Map Y0() {
        Map mapUnmodifiableMap;
        mapUnmodifiableMap = (Map) this.c;
        if (mapUnmodifiableMap == null) {
            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap((HashMap) this.b));
            this.c = mapUnmodifiableMap;
        }
        return mapUnmodifiableMap;
    }

    @Override // defpackage.r8f
    public /* bridge */ d7f Z(ep1 ep1Var) {
        return db6.C0(ep1Var);
    }

    public void Z0(vp0 vp0Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", vp0Var.a);
            jSONObject.put("Status", kv2.B(vp0Var.b));
            jSONObject.put("AuthToken", vp0Var.c);
            jSONObject.put("RefreshToken", vp0Var.d);
            jSONObject.put("TokenCreationEpochInSecs", vp0Var.f);
            jSONObject.put("ExpiresInSecs", vp0Var.e);
            jSONObject.put("FisError", vp0Var.g);
            ff5 ff5Var = (ff5) this.c;
            ff5Var.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", ff5Var.a.getFilesDir());
            FileOutputStream fileOutputStreamE = a.e(new FileOutputStream(fileCreateTempFile), fileCreateTempFile);
            fileOutputStreamE.write(jSONObject.toString().getBytes(Constants.ENCODING));
            fileOutputStreamE.close();
            if (fileCreateTempFile.renameTo(W0())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    @Override // defpackage.s36
    public void a(Object obj) {
        oae oaeVar = (oae) obj;
        oaeVar.getClass();
        ((pae) ((a82) this.c).c).c(oaeVar);
    }

    @Override // defpackage.r8f
    public /* bridge */ boolean a0(w4c w4cVar, w4c w4cVar2) {
        return db6.a0(w4cVar, w4cVar2);
    }

    public void a1() throws IOException {
        String str = (String) this.b;
        if (((FileChannel) this.c) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = a.e(new FileOutputStream(file), file).getChannel();
            this.c = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.c;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.c = null;
            ho7.r(ib8.j("Unable to lock file: '", str, "'."), th);
        }
    }

    @Override // defpackage.o6e
    public p6e apply() {
        gw7 gw7Var = (gw7) this.b;
        zv7 zv7VarX0 = X0();
        if (zv7VarX0 != null) {
            gw7Var.a(zv7VarX0, false);
        }
        return gw7Var.e(this.c);
    }

    @Override // defpackage.r8f
    public /* bridge */ boolean b(e8f e8fVar, k7f k7fVar) {
        return db6.Y(e8fVar, k7fVar);
    }

    @Override // defpackage.r8f
    public /* bridge */ e8f b0(k7f k7fVar, int i) {
        return db6.Q(k7fVar, i);
    }

    @Override // defpackage.lw6
    public int c() {
        return ((egh) this.b).c();
    }

    @Override // defpackage.r8f
    public boolean c0(k7f k7fVar, k7f k7fVar2) {
        k7fVar.getClass();
        k7fVar2.getClass();
        if (!(k7fVar instanceof j7f)) {
            qc0.j("Failed requirement.");
            return false;
        }
        if (!(k7fVar2 instanceof j7f)) {
            qc0.j("Failed requirement.");
            return false;
        }
        if (db6.m(k7fVar, k7fVar2)) {
            return true;
        }
        j7f j7fVar = (j7f) k7fVar;
        j7f j7fVar2 = (j7f) k7fVar2;
        Map map = (Map) this.b;
        if (((ut7) this.c).a(j7fVar, j7fVar2)) {
            return true;
        }
        if (map != null) {
            j7f j7fVar3 = (j7f) map.get(j7fVar);
            j7f j7fVar4 = (j7f) map.get(j7fVar2);
            if (j7fVar3 != null && j7fVar3.equals(j7fVar2)) {
                return true;
            }
            if (j7fVar4 != null && j7fVar4.equals(j7fVar)) {
                return true;
            }
        }
        return false;
    }

    public vjd c1(w4c w4cVar) {
        tjd tjdVar;
        kv3 kv3VarQ = db6.q(w4cVar);
        return (kv3VarQ == null || (tjdVar = kv3VarQ.b) == null) ? (vjd) w4cVar : tjdVar;
    }

    @Override // defpackage.o6e
    public void cancel() {
        switch (this.a) {
            case 17:
                zv7 zv7VarX0 = X0();
                if ((zv7VarX0 != null ? zv7VarX0.f : null) != null) {
                    ((gw7) this.b).g(this.c);
                }
                break;
            default:
                if (!((xh0) this.c).compareAndSet(1, 1)) {
                    ((j8) this.b).invoke();
                }
                break;
        }
    }

    @Override // defpackage.lw6
    public void close() {
        ((egh) this.b).close();
    }

    @Override // defpackage.lw6
    public int d() {
        return ((egh) this.b).d();
    }

    @Override // defpackage.r8f
    public boolean d0(w4c w4cVar) {
        tjd tjdVarS = db6.s(w4cVar);
        return (tjdVarS != null ? db6.p(this, c1(tjdVarS)) : null) != null;
    }

    public vp0 d1() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            File fileW0 = W0();
            FileInputStream fileInputStreamB = a.b(fileW0, new FileInputStream(fileW0));
            while (true) {
                try {
                    int i = fileInputStreamB.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        fileInputStreamB.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStreamB.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i2 = vp0.h;
        byte b = (byte) (((byte) (0 | 2)) | 1);
        int i3 = kv2.C(5)[iOptInt];
        if (i3 == 0) {
            r82.g("Null registrationStatus");
            return null;
        }
        byte b2 = (byte) (((byte) (b | 2)) | 1);
        if (b2 == 3 && i3 != 0) {
            return new vp0(strOptString, i3, strOptString2, strOptString3, jOptLong2, jOptLong, strOptString4);
        }
        StringBuilder sb = new StringBuilder();
        if (i3 == 0) {
            sb.append(" registrationStatus");
        }
        if ((b2 & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((b2 & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        qc0.p(kv2.o("Missing required properties:", sb));
        return null;
    }

    @Override // defpackage.rsd
    public mtd e() {
        return (s25) this.c;
    }

    @Override // defpackage.r8f
    public boolean e0(xt7 xt7Var) {
        xt7Var.getClass();
        return xt7Var instanceof zg9;
    }

    @Override // defpackage.x22
    public xr7 f() {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override // defpackage.r8f
    public /* bridge */ void f0(w4c w4cVar) {
        db6.t0(w4cVar);
    }

    @Override // defpackage.r8f
    public /* bridge */ w4c g(w4c w4cVar) {
        return db6.k1(w4cVar, false);
    }

    @Override // defpackage.r8f
    public /* bridge */ dj5 g0(xt7 xt7Var) {
        return db6.r(xt7Var);
    }

    @Override // defpackage.h1b
    public Object get() {
        return new uu8((Context) ((kb6) this.b).b, (ta0) ((m6c) this.c).get());
    }

    @Override // defpackage.lw6
    public Surface getSurface() {
        return ((egh) this.b).getSurface();
    }

    @Override // defpackage.r8f
    public /* bridge */ w4c h(dj5 dj5Var) {
        return db6.e1(dj5Var);
    }

    @Override // defpackage.lw6
    public void h0(kw6 kw6Var, Executor executor) {
        ((egh) this.b).h0(new bo1(17, this, kw6Var), executor);
    }

    @Override // defpackage.s36
    public void i(Throwable th) {
        int i = ((iae) this.b).f;
        if (i == 2 && (th instanceof CancellationException)) {
            b21.q("DualSurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
            return;
        }
        b21.X("DualSurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + u3c.f(i), th);
    }

    @Override // defpackage.r8f
    public k7f i0(xt7 xt7Var) {
        xt7Var.getClass();
        w4c w4cVarS = db6.s(xt7Var);
        if (w4cVarS == null) {
            w4cVarS = C(xt7Var);
        }
        return db6.d1(w4cVarS);
    }

    @Override // defpackage.r8f
    public /* bridge */ w4c j(dj5 dj5Var) {
        return db6.u0(dj5Var);
    }

    @Override // defpackage.r8f
    public /* bridge */ boolean j0(k7f k7fVar) {
        return db6.j0(k7fVar);
    }

    @Override // defpackage.t6e
    public void k(s6e s6eVar) {
        e79 e79Var = (e79) this.c;
        e79Var.a();
        l79 l79Var = s6eVar.a;
        Object[] objArr = l79Var.b;
        long[] jArr = l79Var.c;
        int i = l79Var.e;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            Object objB = ((qz7) this.b).b(obj);
            int iD = e79Var.d(objB);
            int i3 = iD >= 0 ? e79Var.c[iD] : 0;
            if (i3 == 7) {
                s6eVar.remove(obj);
            } else {
                e79Var.g(i3 + 1, objB);
            }
            i = i2;
        }
    }

    @Override // defpackage.r8f
    public /* bridge */ w4c k0(w4c w4cVar) {
        return db6.y(w4cVar);
    }

    @Override // defpackage.r8f
    public /* bridge */ int l(xt7 xt7Var) {
        return db6.n(xt7Var);
    }

    @Override // defpackage.yb3
    public ac3 l0() {
        return new im9((hm9) this.c, (w84) this.b);
    }

    @Override // defpackage.r8f
    public boolean m(fp1 fp1Var) {
        return fp1Var instanceof yo1;
    }

    @Override // defpackage.r8f
    public /* bridge */ w4c m0(xt7 xt7Var) {
        return db6.s(xt7Var);
    }

    @Override // defpackage.r8f
    public /* bridge */ boolean n(d7f d7fVar) {
        return db6.r0(d7fVar);
    }

    @Override // defpackage.r8f
    public fp1 n0(w4c w4cVar) {
        return db6.p(this, c1(w4cVar));
    }

    @Override // defpackage.r8f
    public int o(c7f c7fVar) {
        c7fVar.getClass();
        if (c7fVar instanceof w4c) {
            return db6.n((xt7) c7fVar);
        }
        if (c7fVar instanceof pc0) {
            return ((pc0) c7fVar).size();
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(c7fVar);
        cva.r(sb, job.a.b(c7fVar.getClass()));
        return 0;
    }

    @Override // defpackage.r8f
    public /* bridge */ boolean o0(k7f k7fVar) {
        return db6.c0(k7fVar);
    }

    @Override // defpackage.r8f
    public /* bridge */ x8f p(d7f d7fVar) {
        return db6.V(d7fVar);
    }

    @Override // defpackage.r8f
    public /* bridge */ boolean p0(fp1 fp1Var) {
        return db6.p0(fp1Var);
    }

    @Override // defpackage.lw6
    public iw6 q() {
        return H0(((egh) this.b).q());
    }

    @Override // defpackage.r8f
    public /* bridge */ boolean q0(k7f k7fVar) {
        return db6.m0(k7fVar);
    }

    @Override // defpackage.r8f
    public void r(xt7 xt7Var) {
        xt7Var.getClass();
        db6.r(xt7Var);
    }

    @Override // defpackage.rsd
    public wkd r0() {
        return (r25) this.b;
    }

    @Override // defpackage.r8f
    public /* bridge */ xt7 s(d7f d7fVar) {
        return db6.T(this, d7fVar);
    }

    @Override // defpackage.r8f
    public d7f s0(c7f c7fVar, int i) {
        c7fVar.getClass();
        if (c7fVar instanceof vjd) {
            return db6.J((xt7) c7fVar, i);
        }
        if (c7fVar instanceof pc0) {
            E e = ((pc0) c7fVar).get(i);
            e.getClass();
            return (d7f) e;
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(c7fVar);
        cva.r(sb, job.a.b(c7fVar.getClass()));
        return null;
    }

    @Override // defpackage.r8f
    public /* bridge */ boolean t(k7f k7fVar) {
        return db6.k0(k7fVar);
    }

    @Override // defpackage.r8f
    public /* bridge */ boolean t0(k7f k7fVar) {
        return db6.e0(k7fVar);
    }

    public String toString() {
        switch (this.a) {
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return (String) this.b;
            case 22:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.c.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.r8f
    public /* bridge */ ep1 u(fp1 fp1Var) {
        return db6.c1(fp1Var);
    }

    @Override // defpackage.r8f
    public /* bridge */ d7f u0(xt7 xt7Var, int i) {
        return db6.J(xt7Var, i);
    }

    @Override // defpackage.lw6
    public int v() {
        return ((egh) this.b).v();
    }

    @Override // defpackage.lw6
    public int v0() {
        return ((egh) this.b).v0();
    }

    @Override // defpackage.r8f
    public /* bridge */ boolean w(k7f k7fVar) {
        return db6.d0(k7fVar);
    }

    @Override // defpackage.o6e
    public boolean w0() {
        p2a p2aVar;
        zv7 zv7VarX0 = X0();
        if (zv7VarX0 == null || (p2aVar = zv7VarX0.f) == null) {
            return true;
        }
        return p2aVar.c();
    }

    @Override // defpackage.r8f
    public boolean x(w4c w4cVar) {
        w4cVar.getClass();
        return db6.m0(i0(w4cVar)) && !db6.n0(w4cVar);
    }

    @Override // defpackage.r8f
    public boolean x0(xt7 xt7Var) {
        xt7Var.getClass();
        return !pa7.t(db6.d1(C(xt7Var)), db6.d1(U(xt7Var)));
    }

    @Override // defpackage.r8f
    public boolean y(w4c w4cVar) {
        w4cVar.getClass();
        return db6.d0(db6.d1(w4cVar));
    }

    @Override // defpackage.o6e
    public boolean y0(bo1 bo1Var) {
        zv7 zv7VarX0 = X0();
        p2a p2aVar = zv7VarX0 != null ? zv7VarX0.f : null;
        if (p2aVar == null || p2aVar.c()) {
            return true;
        }
        ird irdVarJ = iqf.j();
        a26 a26VarE = irdVarJ != null ? irdVarJ.e() : null;
        ird irdVarL = iqf.l(irdVarJ);
        try {
            boolean zE = p2aVar.e(bo1Var);
            iqf.p(irdVarJ, irdVarL, a26VarE);
            return zE;
        } catch (Throwable th) {
            try {
                zv7VarX0.getClass();
                throw th;
            } catch (Throwable th2) {
                iqf.p(irdVarJ, irdVarL, a26VarE);
                throw th2;
            }
        }
    }

    @Override // defpackage.r8f
    public d7f z(w4c w4cVar, int i) {
        if (i < 0 || i >= db6.n(w4cVar)) {
            return null;
        }
        return db6.J(w4cVar, i);
    }

    @Override // defpackage.r8f
    public /* bridge */ boolean z0(xt7 xt7Var) {
        return db6.l0(xt7Var);
    }

    @Override // defpackage.x22, defpackage.r8f
    public /* bridge */ tjd h(dj5 dj5Var) {
        return db6.e1(dj5Var);
    }

    @Override // defpackage.x22, defpackage.r8f
    public /* bridge */ tjd j(dj5 dj5Var) {
        return db6.u0(dj5Var);
    }

    @Override // defpackage.x22, defpackage.r8f
    public /* bridge */ tjd g(w4c w4cVar) {
        return db6.k1(w4cVar, true);
    }

    @Override // defpackage.r8f
    public void B0(w4c w4cVar, k7f k7fVar) {
    }

    public /* synthetic */ w84(Object obj) {
        this.a = 22;
        this.c = obj;
        this.b = new ArrayList();
    }

    public w84(HashMap map, ut7 ut7Var) {
        this.a = 25;
        ut7Var.getClass();
        this.b = map;
        this.c = ut7Var;
    }

    public w84(int i) {
        this.a = i;
        switch (i) {
            case 5:
                break;
            case 8:
                this.b = new ArrayList();
                this.c = new ArrayList();
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                this.b = new HashMap();
                break;
            default:
                this.b = new btf(true);
                this.c = new btf(true);
                break;
        }
    }

    public w84(zx5 zx5Var) {
        this.a = 9;
        this.b = zx5Var;
        this.c = new CopyOnWriteArrayList();
    }

    public w84(w5c w5cVar) {
        this.a = 13;
        this.b = w5cVar;
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        setNewSetFromMap.getClass();
        this.c = setNewSetFromMap;
    }

    public /* synthetic */ w84(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public w84(j8 j8Var) {
        this.a = 24;
        this.b = j8Var;
        this.c = new xh0(0);
    }

    public w84(egh eghVar) {
        this.a = 21;
        this.b = eghVar;
    }

    public w84(ff5 ff5Var) {
        this.a = 26;
        this.c = ff5Var;
    }

    public w84(hm9 hm9Var) {
        this.a = 23;
        this.c = hm9Var;
        this.b = new w84(12);
    }

    public w84(qz7 qz7Var) {
        this.a = 18;
        this.b = qz7Var;
        e79 e79Var = ok9.a;
        this.c = new e79();
    }

    public w84(zi0 zi0Var) {
        this.a = 4;
        u25 u25Var = (u25) zi0Var.d;
        this.b = new r25(zi0Var, u25Var.i().r0(), -1L, true);
        this.c = new s25(zi0Var, u25Var.i().e(), -1L, true);
    }

    public w84(ArrayList arrayList, ArrayList arrayList2) {
        this.a = 11;
        int size = arrayList.size();
        this.b = new int[size];
        this.c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public w84(int i, int i2) {
        this.a = 11;
        this.b = new int[]{i, i2};
        this.c = new float[]{0.0f, 1.0f};
    }

    public w84(EditText editText) {
        this.a = 2;
        this.b = editText;
        bu4 bu4Var = new bu4(editText);
        this.c = bu4Var;
        editText.addTextChangedListener(bu4Var);
        if (ot4.b == null) {
            synchronized (ot4.a) {
                try {
                    if (ot4.b == null) {
                        ot4 ot4Var = new ot4();
                        try {
                            ot4.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, ot4.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        ot4.b = ot4Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        editText.setEditableFactory(ot4.b);
    }

    public w84(int i, int i2, int i3) {
        this.a = 11;
        this.b = new int[]{i, i2, i3};
        this.c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public w84(a82 a82Var, iae iaeVar) {
        this.a = 1;
        this.c = a82Var;
        this.b = iaeVar;
    }
}
