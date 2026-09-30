package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.OutputConfiguration;
import android.media.MediaCodec;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.core.b1;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class qfc implements czc, x22, bae, odc, f8f, pkf, af0, ov2, bn2, d8e, m23 {
    public static final qfc a = new qfc();
    public static final qfc b = new qfc();
    public static final g0d c = new g0d(null, null, null, null, null);
    public static final qfc d = new qfc();
    public static final qfc e = new qfc();
    public static final qfc f = new qfc();
    public static final qfc g = new qfc();
    public static final qfc v = new qfc();
    public static final qfc w = new qfc();
    public static final x8g x = new x8g();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [android.hardware.camera2.params.OutputConfiguration] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.StringBuilder] */
    public static ot A0(Surface surface, Integer num, af8 af8Var, au9 au9Var, zt9 zt9Var, bu9 bu9Var, List list, Size size, boolean z, int i, String str, int i2) {
        Class cls;
        ?? outputConfiguration;
        OutputConfiguration outputConfigurationA;
        ?? outputConfiguration2 = surface;
        af8 af8Var2 = af8.M0;
        Integer num2 = (i2 & 2) != 0 ? null : num;
        af8 af8Var3 = (i2 & 4) != 0 ? af8Var2 : af8Var;
        boolean z2 = (i2 & 512) != 0 ? false : z;
        int i3 = (i2 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? -1 : i;
        af8Var3.getClass();
        if (af8Var3 == af8.P0 && Build.VERSION.SDK_INT >= 35) {
            if (num2 == null) {
                qc0.p("Required value was null.");
                return null;
            }
            if (size == null) {
                qc0.p("Required value was null.");
                return null;
            }
            outputConfigurationA = u60.a(num2.intValue(), size);
        } else if (af8Var3 != af8Var2) {
            if (size == null) {
                qc0.p("Size must defined when creating a deferred OutputConfiguration.");
                return null;
            }
            if (af8Var3 == af8.O0) {
                cls = SurfaceTexture.class;
            } else if (af8Var3 == af8.N0) {
                cls = SurfaceHolder.class;
            } else if (af8Var3 != af8.Q0) {
                if (af8Var3 != af8.R0) {
                    yg5.r(af8Var3, "Unsupported OutputType: ");
                    return null;
                }
                if (Build.VERSION.SDK_INT < 35) {
                    qc0.p("OutputType.MEDIA_RECORDER requires API 35 or higher.");
                    return null;
                }
                cls = MediaRecorder.class;
            } else {
                if (Build.VERSION.SDK_INT < 35) {
                    qc0.p("OutputType.MEDIA_CODEC requires API 35 or higher.");
                    return null;
                }
                cls = MediaCodec.class;
            }
            outputConfiguration = new OutputConfiguration(size, cls);
        } else {
            if (outputConfiguration2 == 0) {
                qc0.p("non-null surface!");
                return null;
            }
            try {
                outputConfiguration2 = i3 != -1 ? new OutputConfiguration(i3, (Surface) outputConfiguration2) : new OutputConfiguration(outputConfiguration2);
                outputConfiguration = outputConfiguration2;
            } catch (Throwable th) {
                b1.n("CXCP", "Failed to create an OutputConfiguration for " + outputConfiguration2 + '!', th);
                return null;
            }
        }
        if (z2) {
            outputConfiguration = outputConfigurationA;
            outputConfiguration.enableSurfaceSharing();
        }
        outputConfiguration = outputConfigurationA;
        if (str != null) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 < 28) {
                ho7.j(tec.f(i4, "physicalCameraId is not supported on API ", " (requires API 28)"));
                return null;
            }
            if (i4 >= 28) {
                s.d0(outputConfiguration, str);
            }
        }
        if (au9Var != null) {
            int i5 = au9Var.a;
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 33) {
                q6.L(outputConfiguration, i5);
            } else if (i5 != 0) {
                StringBuilder sbN = ub3.n(i6, "Cannot set mirrorMode to a non-default value on API ", ". This may result in unexpected behavior. Requested ");
                sbN.append((Object) au9.a(i5));
                b1.l("CXCP", sbN.toString());
            }
        }
        if (zt9Var != null) {
            long j = zt9Var.a;
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 33) {
                q6.H(outputConfiguration, j);
            } else if (j != 1) {
                StringBuilder sbN2 = ub3.n(i7, "Cannot set dynamicRangeProfile to a non-default value on API ", ". This may result in unexpected behavior. Requested ");
                sbN2.append((Object) zt9.a(j));
                b1.l("CXCP", sbN2.toString());
            }
        }
        if (bu9Var != null && Build.VERSION.SDK_INT >= 33) {
            q6.N(outputConfiguration, bu9Var.a);
        }
        if (!list.isEmpty()) {
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 31) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw kv2.g(it);
                }
            } else {
                b1.l("CXCP", "Cannot add sensorPixelModeUsed value on API " + i8 + ". This may result in unexpected behavior. Requested " + list);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            s.x(outputConfiguration);
        }
        return new ot(outputConfiguration);
    }

    public static qz1 J0(String str) {
        qz1 qz1Var = new qz1(str);
        qz1.d.put(str, qz1Var);
        return qz1Var;
    }

    public static kv3 K0(jgf jgfVar, boolean z) {
        boolean zE;
        jgfVar.getClass();
        if (jgfVar instanceof kv3) {
            return (kv3) jgfVar;
        }
        jgfVar.c0();
        if ((jgfVar.c0().m() instanceof c8f) || (jgfVar instanceof ue9)) {
            y22 y22VarM = jgfVar.c0().m();
            d8f d8fVar = y22VarM instanceof d8f ? (d8f) y22VarM : null;
            zE = true;
            if (d8fVar == null || d8fVar.X) {
                zE = (z && (jgfVar.c0().m() instanceof c8f)) ? w8f.e(jgfVar) : true ^ vfh.x(d.M0(), pa7.Z(jgfVar), g7f.b);
            }
        } else {
            zE = false;
        }
        if (!zE) {
            return null;
        }
        if (jgfVar instanceof bj5) {
            bj5 bj5Var = (bj5) jgfVar;
            pa7.t(bj5Var.b.c0(), bj5Var.c.c0());
        }
        return new kv3(pa7.Z(jgfVar).l0(false), z);
    }

    @Override // defpackage.r8f
    public /* bridge */ x8f A(e8f e8fVar) {
        return db6.W(e8fVar);
    }

    @Override // defpackage.czc
    public Object B(FileInputStream fileInputStream) throws mw2 {
        try {
            vg7 vg7Var = wg7.d;
            String str = new String(lmg.p0(fileInputStream), ox1.a);
            vg7Var.getClass();
            return (g0d) vg7Var.b(g0d.Companion.serializer(), str);
        } catch (Exception e2) {
            throw new mw2("Cannot parse session configs", e2);
        }
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

    public List G0(Executor executor) {
        return Collections.singletonList(new qp3(executor));
    }

    @Override // defpackage.r8f
    public /* bridge */ to1 H(fp1 fp1Var) {
        return db6.z(fp1Var);
    }

    public List H0() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.r8f
    public boolean I(xt7 xt7Var) {
        xt7Var.getClass();
        return db6.l0(C(xt7Var)) != db6.l0(U(xt7Var));
    }

    public synchronized qz1 I0(String str) {
        qz1 qz1Var;
        String strConcat;
        try {
            str.getClass();
            LinkedHashMap linkedHashMap = qz1.d;
            qz1Var = (qz1) linkedHashMap.get(str);
            if (qz1Var == null) {
                if (c5e.C(str, "TLS_", false)) {
                    strConcat = "SSL_".concat(str.substring(4));
                } else {
                    strConcat = c5e.C(str, "SSL_", false) ? "TLS_".concat(str.substring(4)) : str;
                }
                qz1Var = (qz1) linkedHashMap.get(strConcat);
                if (qz1Var == null) {
                    qz1Var = new qz1(str);
                }
                linkedHashMap.put(str, qz1Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return qz1Var;
    }

    @Override // defpackage.r8f
    public boolean J(xt7 xt7Var) {
        xt7Var.getClass();
        tjd tjdVarS = db6.s(xt7Var);
        return (tjdVarS != null ? db6.q(tjdVarS) : null) != null;
    }

    @Override // defpackage.x22
    public /* bridge */ tjd K(tt7 tt7Var) {
        return db6.s(tt7Var);
    }

    @Override // defpackage.r8f
    public boolean L(w4c w4cVar) {
        w4cVar.getClass();
        return db6.q(w4cVar) != null;
    }

    public xt7 L0(xt7 xt7Var) {
        tjd tjdVarK1;
        xt7Var.getClass();
        tjd tjdVarS = db6.s(xt7Var);
        return (tjdVarS == null || (tjdVarK1 = db6.k1(tjdVarS, true)) == null) ? xt7Var : tjdVarK1;
    }

    @Override // defpackage.r8f
    public boolean M(w4c w4cVar) {
        return db6.j0(db6.d1(w4cVar));
    }

    public h7f M0() {
        return n16.A(false, this, null, 24);
    }

    @Override // defpackage.odc
    public Object N(pcc pccVar, Object obj) {
        List listI;
        use useVar = (use) obj;
        String string = useVar.d().c.toString();
        long j = useVar.d().d;
        int i = eue.c;
        Integer numValueOf = Integer.valueOf((int) (j >> 32));
        Integer numValueOf2 = Integer.valueOf((int) (useVar.d().d & 4294967295L));
        lqb lqbVar = useVar.a;
        vue vueVar = (vue) ((vz9) lqbVar.c).getValue();
        if (vueVar != null) {
            Integer numValueOf3 = Integer.valueOf(vueVar.a);
            String str = vueVar.b;
            String str2 = vueVar.c;
            long j2 = vueVar.d;
            int i2 = eue.c;
            Integer numValueOf4 = Integer.valueOf((int) (j2 >> 32));
            Integer numValueOf5 = Integer.valueOf((int) (j2 & 4294967295L));
            long j3 = vueVar.e;
            listI = t72.I(numValueOf3, str, str2, numValueOf4, numValueOf5, Integer.valueOf((int) (j3 >> 32)), Integer.valueOf((int) (j3 & 4294967295L)), Long.valueOf(vueVar.f));
        } else {
            listI = null;
        }
        return t72.I(string, numValueOf, numValueOf2, t72.I(listI, uue.a.N(pccVar, (ibf) lqbVar.b)));
    }

    public vjd N0(w4c w4cVar) {
        tjd tjdVar;
        kv3 kv3VarQ = db6.q(w4cVar);
        return (kv3VarQ == null || (tjdVar = kv3VarQ.b) == null) ? (vjd) w4cVar : tjdVar;
    }

    @Override // defpackage.r8f
    public l26 O() {
        return null;
    }

    public List O0(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (lb2 lb2Var : componentRegistrar.getComponents()) {
            String str = lb2Var.a;
            if (str != null) {
                lb2Var = new lb2(str, lb2Var.b, lb2Var.c, lb2Var.d, lb2Var.e, new bo1(1, str, lb2Var), lb2Var.g);
            }
            arrayList.add(lb2Var);
        }
        return arrayList;
    }

    @Override // defpackage.r8f
    public /* bridge */ v2c P(w4c w4cVar) {
        return db6.N0(this, w4cVar);
    }

    @Override // defpackage.r8f
    public /* bridge */ Collection Q(w4c w4cVar) {
        return db6.B0(this, w4cVar);
    }

    @Override // defpackage.r8f
    public xt7 R(xt7 xt7Var) {
        return db6.w0(xt7Var);
    }

    @Override // defpackage.r8f
    public /* bridge */ void S(w4c w4cVar) {
        db6.s0(w4cVar);
    }

    @Override // defpackage.r8f
    public /* bridge */ int T(k7f k7fVar) {
        return db6.z0(k7fVar);
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

    @Override // defpackage.d8e
    public f8e V(rr5 rr5Var) {
        String str = rr5Var.p;
        List list = rr5Var.s;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new hc2(list);
                case "application/pgs":
                    return new szc(28);
                case "application/x-mp4-vtt":
                    return new kd9(20);
                case "text/vtt":
                    return new vea(21);
                case "application/x-quicktime-tx3g":
                    return new z6f(list);
                case "text/x-ssa":
                    return new gxd(list);
                case "application/vobsub":
                    return new uyf(list);
                case "application/x-subrip":
                    return new x6e();
                case "application/ttml+xml":
                    return new a6f();
            }
        }
        qc0.j(ub3.i("Unsupported MIME type: ", str));
        return null;
    }

    @Override // defpackage.r8f
    public /* bridge */ fp1 W(vjd vjdVar) {
        return db6.p(this, vjdVar);
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

    @Override // defpackage.r8f
    public /* bridge */ d7f Y(xt7 xt7Var) {
        return db6.t(xt7Var);
    }

    @Override // defpackage.r8f
    public /* bridge */ d7f Z(ep1 ep1Var) {
        return db6.C0(ep1Var);
    }

    @Override // defpackage.r8f
    public /* bridge */ boolean a0(w4c w4cVar, w4c w4cVar2) {
        return db6.a0(w4cVar, w4cVar2);
    }

    @Override // defpackage.r8f
    public /* bridge */ boolean b(e8f e8fVar, k7f k7fVar) {
        return db6.Y(e8fVar, k7fVar);
    }

    @Override // defpackage.r8f
    public /* bridge */ e8f b0(k7f k7fVar, int i) {
        return db6.Q(k7fVar, i);
    }

    @Override // defpackage.d8e
    public boolean c(rr5 rr5Var) {
        String str = rr5Var.p;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // defpackage.r8f
    public /* bridge */ boolean c0(k7f k7fVar, k7f k7fVar2) {
        return db6.m(k7fVar, k7fVar2);
    }

    @Override // defpackage.af0
    public boolean d(df0 df0Var) {
        return true;
    }

    @Override // defpackage.r8f
    public boolean d0(w4c w4cVar) {
        tjd tjdVarS = db6.s(w4cVar);
        return (tjdVarS != null ? db6.p(this, N0(tjdVarS)) : null) != null;
    }

    @Override // defpackage.czc
    public Object e() {
        return c;
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

    @Override // defpackage.r8f
    public /* bridge */ w4c h(dj5 dj5Var) {
        return db6.e1(dj5Var);
    }

    @Override // defpackage.bae
    public Surface h0() {
        return null;
    }

    @Override // defpackage.f8f
    public c8f i(tnb tnbVar) {
        tnbVar.getClass();
        return null;
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

    @Override // defpackage.bn2
    public long k(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        int i = cec.a;
        return jFloatToRawIntBits;
    }

    @Override // defpackage.r8f
    public /* bridge */ w4c k0(w4c w4cVar) {
        return db6.y(w4cVar);
    }

    @Override // defpackage.r8f
    public /* bridge */ int l(xt7 xt7Var) {
        return db6.n(xt7Var);
    }

    @Override // defpackage.pkf
    public boolean l0() {
        return true;
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
        return db6.p(this, N0(w4cVar));
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

    @Override // defpackage.m23
    public Iterable q(Object obj) {
        Collection collectionL;
        ea1 ea1Var = (ea1) obj;
        return (ea1Var == null || (collectionL = ea1Var.l()) == null) ? pu4.a : collectionL;
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

    @Override // defpackage.bae
    public boolean r0(bae baeVar) {
        return false;
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
            E e2 = ((pc0) c7fVar).get(i);
            e2.getClass();
            return (d7f) e2;
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

    @Override // defpackage.r8f
    public /* bridge */ ep1 u(fp1 fp1Var) {
        return db6.c1(fp1Var);
    }

    @Override // defpackage.r8f
    public /* bridge */ d7f u0(xt7 xt7Var, int i) {
        return db6.J(xt7Var, i);
    }

    @Override // defpackage.odc
    public Object v(Object obj) {
        List list = (List) obj;
        Object obj2 = list.get(0);
        Object obj3 = list.get(1);
        Object obj4 = list.get(2);
        Object obj5 = list.get(3);
        obj2.getClass();
        String str = (String) obj2;
        obj3.getClass();
        int iIntValue = ((Integer) obj3).intValue();
        obj4.getClass();
        long jB = u3c.b(iIntValue, ((Integer) obj4).intValue());
        obj5.getClass();
        List list2 = (List) obj5;
        Object obj6 = list2.get(0);
        Object obj7 = list2.get(1);
        vue vueVar = obj6 != null ? (vue) vue.i.v(obj6) : null;
        obj7.getClass();
        return new use(str, jB, new lqb(vueVar, (ibf) uue.a.v(obj7)));
    }

    @Override // defpackage.czc
    public Object v0(Object obj, abf abfVar, ke5 ke5Var) throws IOException {
        byte[] bytes = wg7.d.d(g0d.Companion.serializer(), (g0d) obj).getBytes(ox1.a);
        bytes.getClass();
        abfVar.a.write(bytes);
        return wef.a;
    }

    @Override // defpackage.r8f
    public /* bridge */ boolean w(k7f k7fVar) {
        return db6.d0(k7fVar);
    }

    @Override // defpackage.d8e
    public int w0(rr5 rr5Var) {
        String str = rr5Var.p;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        qc0.j(ub3.i("Unsupported MIME type: ", str));
        return 0;
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

    @Override // defpackage.af0
    public void y0(c4c c4cVar, rf0 rf0Var, dd2 dd2Var, l46 l46Var, int i) {
        rf0Var.getClass();
        l46Var.f0(-1256053540);
        z5c z5cVar = rf0Var.a;
        int i2 = 0;
        if (z5cVar instanceof ef0) {
            l46Var.f0(-181636238);
            dd2Var.m(rf0Var, l46Var, Integer.valueOf((i >> 3) & 126));
            l46Var.r(false);
        } else if (z5cVar instanceof bf0) {
            l46Var.f0(-1335705891);
            h01.a(c4cVar, af1.b0(301482436, new w7(7, dd2Var, rf0Var), l46Var), l46Var, (i & 14) | 48);
            l46Var.r(false);
        } else if (z5cVar instanceof jg0) {
            l46Var.f0(-1335592214);
            zr5.a(c4cVar, j88.b, fyc.A(arb.i(rf0Var, v8.I0)), 0, af1.b0(-996206079, new uu0(dd2Var, i2), l46Var), l46Var, (i & 14) | 24624, 4);
            l46Var.r(false);
        } else {
            int i3 = 1;
            if (z5cVar instanceof wf0) {
                l46Var.f0(-1335153161);
                zr5.a(c4cVar, j88.a, fyc.A(arb.i(rf0Var, v8.J0)), ((wf0) z5cVar).l - 1, af1.b0(-1232823904, new uu0(dd2Var, i3), l46Var), l46Var, (i & 14) | 24624, 0);
                l46Var.r(false);
            } else if (z5cVar instanceof ig0) {
                l46Var.f0(-1334676412);
                pa7.f(c4cVar, l46Var, i & 14);
                l46Var.r(false);
            } else if (z5cVar instanceof if0) {
                l46Var.f0(-1334614784);
                t72.f(((if0) z5cVar).l, (i & 14) | 384, af1.b0(727548192, new vu0(rf0Var, i2), l46Var), l46Var, c4cVar);
                l46Var.r(false);
            } else if (z5cVar instanceof mf0) {
                l46Var.f0(-1334449368);
                s62.b(c4cVar, v4e.o0(((mf0) z5cVar).l).toString(), l46Var, i & 14);
                l46Var.r(false);
            } else if (z5cVar instanceof gf0) {
                l46Var.f0(-1334355128);
                s62.b(c4cVar, v4e.o0(((gf0) z5cVar).p).toString(), l46Var, i & 14);
                l46Var.r(false);
            } else if (z5cVar instanceof jf0) {
                l46Var.f0(-1334263523);
                l46Var.f0(-181587418);
                i00 i00Var = new i00(16);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                o37 o37Var = new o37(null, af1.b0(-1003319804, new p50(i3, c4cVar, z5cVar), l46Var), 3);
                String strValueOf = String.valueOf(0);
                linkedHashMap.put("inline:" + strValueOf, o37Var);
                i00Var.j("androidx.compose.foundation.text.inlineContent", strValueOf);
                i00Var.f("�");
                i00Var.g();
                m4c m4cVar = new m4c(i00Var.l(), bm8.X(linkedHashMap));
                l46Var.r(false);
                rrb.f(c4cVar, m4cVar, null, null, false, 0, 0, l46Var, i & 14, 62);
                l46Var.r(false);
            } else if (z5cVar instanceof pf0) {
                l46Var.f0(-1334058613);
                l46Var.r(false);
            } else if (z5cVar instanceof xf0) {
                l46Var.f0(-1333973797);
                bzd.i(c4cVar, rf0Var, null, l46Var, i & 126, 2);
                l46Var.r(false);
            } else if (z5cVar instanceof fg0) {
                l46Var.f0(-1333904512);
                drb.a(c4cVar, rf0Var, l46Var, i & 126);
                l46Var.r(false);
            } else if (z5cVar instanceof hg0) {
                l46Var.f0(-1333609020);
                System.out.println((Object) "Unexpected raw text while traversing the Abstract Syntax Tree.");
                StringBuilder sb = new StringBuilder(16);
                new ArrayList();
                ArrayList arrayList = new ArrayList();
                new ArrayList();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                String str = ((hg0) z5cVar).l;
                str.getClass();
                sb.append(str);
                String string = sb.toString();
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList2.add(((h00) arrayList.get(i4)).a(sb.length()));
                }
                rrb.f(c4cVar, new m4c(new k00(string, arrayList2), bm8.X(linkedHashMap2)), null, null, false, 0, 0, l46Var, i & 14, 62);
                l46Var.r(false);
            } else if (z5cVar instanceof qf0) {
                l46Var.f0(-1333362570);
                l46Var.r(false);
                System.out.println((Object) "MarkdownRichText: Unexpected AstListItem while traversing the Abstract Syntax Tree.");
            } else if (z5cVar instanceof nf0) {
                l46Var.f0(-1333218575);
                l46Var.r(false);
                System.out.println((Object) ("MarkdownRichText: Unexpected AstInlineNodeType " + z5cVar + " while traversing the Abstract Syntax Tree."));
            } else {
                if (!z5cVar.equals(bg0.l) && !z5cVar.equals(eg0.l) && !z5cVar.equals(gg0.l) && !(z5cVar instanceof cg0)) {
                    throw tec.d(-181635336, l46Var, false);
                }
                l46Var.f0(-1332984649);
                l46Var.r(false);
                System.out.println((Object) "MarkdownRichText: Unexpected Table node while traversing the Abstract Syntax Tree.");
            }
        }
        l46Var.r(false);
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

    @Override // defpackage.bae
    public void a() {
    }

    @Override // defpackage.r8f
    public void B0(w4c w4cVar, k7f k7fVar) {
    }
}
