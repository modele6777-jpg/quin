package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.widget.ImageView;
import androidx.camera.camera2.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.camera2.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class os implements g1b, zx0 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;

    /* JADX WARN: Code duplicated, block: B:30:0x00de  */
    public os(z67 z67Var, qn4 qn4Var) {
        Object pr3Var;
        this.a = 8;
        os osVarD = qn4Var.D();
        int i = z67Var.a;
        if (i < 0) {
            l37.c("negative nearestRange.first");
        }
        int iMin = Math.min(z67Var.b, osVarD.b - 1);
        if (iMin < i) {
            e79 e79Var = ok9.a;
            e79Var.getClass();
            this.c = e79Var;
            this.d = new Object[0];
            this.b = 0;
            return;
        }
        int i2 = (iMin - i) + 1;
        this.d = new Object[i2];
        this.b = i;
        e79 e79Var2 = new e79(i2);
        p89 p89Var = (p89) osVarD.c;
        if (i < 0 || i >= osVarD.b) {
            l37.e("Index " + i + ", size " + osVarD.b);
        }
        if (iMin < 0 || iMin >= osVarD.b) {
            l37.e("Index " + iMin + ", size " + osVarD.b);
        }
        if (iMin < i) {
            l37.a("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i + ")");
        }
        int iN = ym8.n(i, p89Var);
        int i3 = ((da7) p89Var.a[iN]).a;
        while (i3 <= iMin) {
            da7 da7Var = (da7) p89Var.a[iN];
            a26 key = da7Var.c.getKey();
            int i4 = da7Var.a;
            int iMax = Math.max(i, i4);
            int iMin2 = Math.min(iMin, (da7Var.b + i4) - 1);
            if (iMax <= iMin2) {
                while (true) {
                    if (key != null) {
                        pr3Var = key.d(Integer.valueOf(iMax - i4));
                        pr3Var = pr3Var == null ? new pr3(iMax) : pr3Var;
                    }
                    e79Var2.g(iMax, pr3Var);
                    ((Object[]) this.d)[iMax - this.b] = pr3Var;
                    iMax = iMax != iMin2 ? iMax + 1 : iMax;
                }
            }
            i3 += da7Var.b;
            iN++;
        }
        this.c = e79Var2;
    }

    public static void b(os osVar, o37 o37Var) {
        int i = osVar.b;
        osVar.b = i + 1;
        String strValueOf = String.valueOf(i);
        ((LinkedHashMap) osVar.d).put("inline:" + strValueOf, o37Var);
        i00 i00Var = (i00) osVar.c;
        if ("�".length() <= 0) {
            l37.a("alternateText can't be an empty string.");
        }
        i00Var.j("androidx.compose.foundation.text.inlineContent", strValueOf);
        i00Var.f("�");
        i00Var.g();
    }

    public void a(int i, az7 az7Var) {
        if (i < 0) {
            l37.a("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        da7 da7Var = new da7(this.b, i, az7Var);
        this.b += i;
        ((p89) this.c).b(da7Var);
    }

    public void c() {
        gk2 gk2Var;
        ImageView imageView = (ImageView) this.c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            do4.a(drawable);
        }
        if (drawable == null || (gk2Var = (gk2) this.d) == null) {
            return;
        }
        int[] drawableState = imageView.getDrawableState();
        PorterDuff.Mode mode = s80.b;
        cyb.i(drawable, gk2Var, drawableState);
    }

    @Override // defpackage.zx0
    public yx0 d(m95 m95Var, long j) {
        long j2;
        long position = m95Var.getPosition();
        int iMin = (int) Math.min(112800L, m95Var.getLength() - position);
        d0a d0aVar = (d0a) this.d;
        d0aVar.J(iMin);
        m95Var.o(d0aVar.a, 0, iMin);
        int i = d0aVar.c;
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (true) {
            if (d0aVar.a() < 188) {
                j2 = -9223372036854775807L;
                break;
            }
            byte[] bArr = d0aVar.a;
            int i2 = d0aVar.b;
            while (true) {
                if (i2 >= i) {
                    j2 = -9223372036854775807L;
                    break;
                }
                j2 = -9223372036854775807L;
                if (bArr[i2] == 71) {
                    break;
                }
                i2++;
            }
            int i3 = i2 + 188;
            if (i3 > i) {
                break;
            }
            long jO = iqf.o(d0aVar, i2, this.b);
            if (jO != j2) {
                long jB = ((rye) this.c).b(jO);
                if (jB > j) {
                    return j5 == j2 ? new yx0(jB, -1, position) : new yx0(-9223372036854775807L, 0, position + j4);
                }
                j5 = jB;
                if (100000 + j5 > j) {
                    return new yx0(-9223372036854775807L, 0, position + ((long) i2));
                }
                j4 = i2;
            }
            d0aVar.M(i3);
            j3 = i3;
        }
        return j5 != j2 ? new yx0(j5, -2, position + j3) : yx0.e;
    }

    public dpb e(boolean z) {
        ly6 ly6Var;
        ly6 ly6Var2;
        if (z && (ly6Var2 = (ly6) this.d) != null) {
            throw ly6Var2.a();
        }
        dpb dpbVarH = dpb.h(this.b, (Object[]) this.c, this);
        if (!z || (ly6Var = (ly6) this.d) == null) {
            return dpbVarH;
        }
        throw ly6Var.a();
    }

    public da7 f(int i) {
        if (i < 0 || i >= this.b) {
            l37.e("Index " + i + ", size " + this.b);
        }
        da7 da7Var = (da7) this.d;
        if (da7Var != null) {
            int i2 = da7Var.a;
            if (i < da7Var.b + i2 && i2 <= i) {
                return da7Var;
            }
        }
        p89 p89Var = (p89) this.c;
        da7 da7Var2 = (da7) p89Var.a[ym8.n(i, p89Var)];
        this.d = da7Var2;
        return da7Var2;
    }

    public Object g(int i) {
        SparseArray sparseArray = (SparseArray) this.c;
        if (this.b == -1) {
            this.b = 0;
        }
        while (true) {
            int i2 = this.b;
            if (i2 <= 0 || i >= sparseArray.keyAt(i2)) {
                break;
            }
            this.b--;
        }
        while (this.b < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.b + 1)) {
            this.b++;
        }
        return sparseArray.valueAt(this.b);
    }

    @Override // defpackage.h1b
    public Object get() {
        Object sg1Var;
        Object ekfVar;
        Object ud6Var;
        Object jaeVar;
        switch (this.a) {
            case 2:
                n23 n23Var = (n23) this.c;
                o23 o23Var = (o23) this.d;
                int i = this.b;
                switch (i) {
                    case 0:
                        ue1 ue1Var = o23Var.a;
                        ue1Var.getClass();
                        sg1Var = new sg1(ue1Var, (ekf) o23Var.H.get(), (ng1) o23Var.F.get(), (ef1) o23Var.I.get(), (lkf) o23Var.k.get(), (aj1) o23Var.y.get());
                        return sg1Var;
                    case 1:
                        hbc hbcVar = n23Var.a;
                        hbc hbcVar2 = n23Var.a;
                        hh1 hh1Var = (hh1) hbcVar.c;
                        nk8.o(hh1Var);
                        if1 if1Var = (if1) hbcVar2.e;
                        nk8.o(if1Var);
                        k47 k47Var = new k47(26, n23Var, o23Var);
                        ceg cegVar = (ceg) o23Var.f.get();
                        dj8 dj8Var = (dj8) o23Var.n.get();
                        nq7 nq7Var = new nq7();
                        nq7Var.a(o23Var.p.get());
                        nq7Var.a(o23Var.r.get());
                        nq7Var.a(o23Var.s.get());
                        nq7Var.a(o23Var.l.get());
                        nq7Var.a(o23Var.t.get());
                        nq7Var.a(o23Var.q.get());
                        nq7Var.a(o23Var.n.get());
                        nq7Var.a(o23Var.u.get());
                        nq7Var.a(o23Var.v.get());
                        ArrayList arrayList = nq7Var.a;
                        Set setSingleton = arrayList.isEmpty() ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : Collections.unmodifiableSet(new HashSet(arrayList));
                        wb1 wb1Var = (wb1) o23Var.x.get();
                        aj1 aj1Var = (aj1) o23Var.y.get();
                        vd9 vd9Var = o23Var.z;
                        g1b g1bVar = o23Var.k;
                        g1b g1bVar2 = o23Var.F;
                        hv4 hv4Var = (hv4) o23Var.D.get();
                        gh1 gh1Var = (gh1) o23Var.e.get();
                        uk1 uk1Var = (uk1) hbcVar2.f;
                        ag1 ag1Var = (ag1) o23Var.G.get();
                        Context context = (Context) hbcVar2.a;
                        ekfVar = new ekf(hh1Var, if1Var, k47Var, cegVar, dj8Var, setSingleton, wb1Var, aj1Var, vd9Var, g1bVar, g1bVar2, hv4Var, gh1Var, uk1Var, ag1Var, context, ja4.g.x(context));
                        return ekfVar;
                    case 2:
                        gh1 gh1Var2 = (gh1) o23Var.e.get();
                        gh1Var2.getClass();
                        return new deg(gh1Var2);
                    case 3:
                        ue1 ue1Var2 = o23Var.a;
                        ue1Var2.getClass();
                        return new gh1(ue1Var2, (yg1) o23Var.d.get());
                    case 4:
                        hh1 hh1Var2 = (hh1) n23Var.a.c;
                        nk8.o(hh1Var2);
                        ue1 ue1Var3 = o23Var.a;
                        ue1Var3.getClass();
                        try {
                            return mf1.b(hh1Var2.b(), ue1Var3.a);
                        } catch (ag4 unused) {
                            if (!b21.F(6, "CXCP")) {
                                return null;
                            }
                            b1.d("CXCP", "Failed to inject camera metadata: Do Not Disturb mode is on.");
                            return null;
                        }
                    case 5:
                        return new dj8((yg1) o23Var.d.get(), (n0e) o23Var.l.get(), (lkf) o23Var.k.get(), (w92) o23Var.m.get());
                    case 6:
                        gh1 gh1Var3 = (gh1) o23Var.e.get();
                        ui1 ui1Var = (ui1) o23Var.j.get();
                        ui1Var.getClass();
                        return new n0e(gh1Var3, (s74.a().b(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) == null && !ui1Var.a().a(ImageCaptureFailWithAutoFlashQuirk.class)) ? ndb.d1 : qk6.d, (lkf) o23Var.k.get());
                    case 7:
                        return new ui1((yg1) o23Var.d.get(), (w2e) o23Var.i.get());
                    case 8:
                        return new w2e((StreamConfigurationMap) o23Var.g.get(), (ut9) o23Var.h.get());
                    case 9:
                        yg1 yg1Var = (yg1) o23Var.d.get();
                        if (yg1Var == null) {
                            return null;
                        }
                        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                        key.getClass();
                        return (StreamConfigurationMap) ((nc1) yg1Var).c(key);
                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        yg1 yg1Var2 = (yg1) o23Var.d.get();
                        return new ut9(yg1Var2);
                    case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        ue1 ue1Var4 = o23Var.a;
                        ue1Var4.getClass();
                        Executor executor = ((jo0) n23Var.a.b).a;
                        executor.getClass();
                        sv2 sv2VarZ = t72.z(executor);
                        ekfVar = new lkf(jgb.k(i7h.I(iqf.d(), sv2VarZ).p0(new wv2("CXCP-UseCase-" + ue1Var4.a))), executor, sv2VarZ);
                        return ekfVar;
                    case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        return new w92();
                    case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        return new wy4((yy4) o23Var.o.get());
                    case 14:
                        return new yy4((gh1) o23Var.e.get(), (lkf) o23Var.k.get(), (w92) o23Var.m.get());
                    case 15:
                        gh1 gh1Var4 = (gh1) o23Var.e.get();
                        n0e n0eVar = (n0e) o23Var.l.get();
                        lkf lkfVar = (lkf) o23Var.k.get();
                        s0f s0fVar = (s0f) o23Var.q.get();
                        ui1 ui1Var2 = (ui1) o23Var.j.get();
                        ui1Var2.getClass();
                        sg1Var = new xi5(gh1Var4, n0eVar, lkfVar, s0fVar, ui1Var2.a().a(TorchFlashRequiredFor3aUpdateQuirk.class) ? qfc.w : qk6.N0);
                        return sg1Var;
                    case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                        return new s0f((gh1) o23Var.e.get(), (n0e) o23Var.l.get(), (lkf) o23Var.k.get());
                    case 17:
                        gh1 gh1Var5 = (gh1) o23Var.e.get();
                        ui1 ui1Var3 = (ui1) o23Var.j.get();
                        ui1Var3.getClass();
                        ekfVar = new yn5(gh1Var5, ui1Var3.a().a(AfRegionFlipHorizontallyQuirk.class) ? ndb.b1 : qk6.M0, (n0e) o23Var.l.get(), (lkf) o23Var.k.get(), o23Var.b());
                        return ekfVar;
                    case 18:
                        return new f2e((xi5) o23Var.r.get(), (lkf) o23Var.k.get());
                    case 19:
                        return new yuf();
                    case 20:
                        return new aeg(o23Var.b());
                    case 21:
                        xb1 xb1Var = (xb1) o23Var.w.get();
                        lkf lkfVar2 = (lkf) o23Var.k.get();
                        w92 w92Var = (w92) o23Var.m.get();
                        xb1Var.getClass();
                        lkfVar2.getClass();
                        w92Var.getClass();
                        ekfVar = new wb1(xb1Var, lkfVar2, w92Var);
                        return ekfVar;
                    case 22:
                        return new xb1();
                    case 23:
                        return new aj1();
                    case 24:
                        gh1 gh1Var6 = (gh1) o23Var.e.get();
                        ue1 ue1Var5 = o23Var.a;
                        ue1Var5.getClass();
                        return new mg1(gh1Var6, ue1Var5, (aj1) o23Var.y.get(), (ff1) o23Var.A.get(), (ge1) o23Var.B.get(), (yn5) o23Var.s.get(), (ui1) o23Var.j.get(), (hv4) o23Var.D.get(), (w2e) o23Var.i.get(), (na7) o23Var.E.get(), o23Var.b);
                    case 25:
                        return new ff1((aeg) o23Var.v.get(), (wy4) o23Var.p.get(), (s0f) o23Var.q.get(), (dj8) o23Var.n.get());
                    case 26:
                        return new ge1();
                    case 27:
                        String str = (String) o23Var.C.get();
                        ui1 ui1Var4 = (ui1) o23Var.j.get();
                        str.getClass();
                        ui1Var4.getClass();
                        return new iv4(str, ui1Var4.a());
                    case 28:
                        ue1 ue1Var6 = o23Var.a;
                        ue1Var6.getClass();
                        String str2 = ue1Var6.a;
                        nk8.o(str2);
                        return str2;
                    case 29:
                        return new na7(n23Var.a());
                    case 30:
                        ge1 ge1Var = (ge1) o23Var.B.get();
                        w92 w92Var2 = (w92) o23Var.m.get();
                        ue1 ue1Var7 = o23Var.a;
                        ue1Var7.getClass();
                        ui1 ui1Var5 = (ui1) o23Var.j.get();
                        ceg cegVar2 = (ceg) o23Var.f.get();
                        xle xleVarA = o23Var.a();
                        yg1 yg1Var3 = (yg1) o23Var.d.get();
                        hbc hbcVar3 = n23Var.a;
                        ekfVar = new ag1(ge1Var, w92Var2, ue1Var7, ui1Var5, cegVar2, xleVarA, yg1Var3, (uk1) hbcVar3.f, (k47) hbcVar3.d);
                        return ekfVar;
                    case 31:
                        return new bf1((gh1) o23Var.e.get(), (wy4) o23Var.p.get(), (xi5) o23Var.r.get(), (yn5) o23Var.s.get(), (f2e) o23Var.t.get(), (s0f) o23Var.q.get(), (dj8) o23Var.n.get(), (aeg) o23Var.v.get(), (ceg) o23Var.f.get(), (wb1) o23Var.x.get(), (ekf) o23Var.H.get(), (lkf) o23Var.k.get(), (yuf) o23Var.u.get());
                    default:
                        throw new AssertionError(i);
                }
            case 3:
                r23 r23Var = (r23) this.c;
                bw bwVar = (bw) this.d;
                hbc hbcVar4 = (hbc) bwVar.a;
                int i2 = this.b;
                switch (i2) {
                    case 0:
                        aw2 aw2Var = (aw2) ((g1b) bwVar.c).get();
                        qwe qweVar = (qwe) ((g1b) r23Var.f).get();
                        i4e i4eVar = (i4e) ((g1b) r23Var.o).get();
                        uf1 uf1Var = (uf1) hbcVar4.b;
                        ud6 ud6Var2 = (ud6) hbcVar4.c;
                        jae jaeVar2 = (jae) hbcVar4.e;
                        rc1 rc1Var = (rc1) ((g1b) bwVar.d).get();
                        fo1 fo1Var = (fo1) ((g1b) bwVar.x).get();
                        r23 r23Var2 = (r23) bwVar.b;
                        return new gc1(aw2Var, qweVar, i4eVar, uf1Var, ud6Var2, jaeVar2, rc1Var, fo1Var, new a82((qwe) ((g1b) r23Var2.f).get(), (uf1) hbcVar4.b, (d3e) hbcVar4.d, (sd1) ((g1b) r23Var2.p).get(), (i4e) ((g1b) r23Var2.o).get()), (z1b) ((g1b) r23Var.u).get(), (bk1) ((g1b) r23Var.y).get(), (sd1) ((g1b) r23Var.p).get(), (uce) ((g1b) r23Var.m).get(), (bg1) hbcVar4.a, (nb1) hbcVar4.f, (d3e) hbcVar4.d, (mh2) ((g1b) r23Var.z).get());
                    case 1:
                        qwe qweVar2 = (qwe) ((g1b) r23Var.f).get();
                        dg7 dg7Var = (dg7) ((g1b) r23Var.d).get();
                        qweVar2.getClass();
                        dg7Var.getClass();
                        return jgb.k(i7h.I(new t8e(dg7Var), i7h.I(qweVar2.h, new wv2("CXCP-Camera2Controller"))));
                    case 2:
                        g1b g1bVar3 = (g1b) r23Var.g;
                        qwe qweVar3 = (qwe) ((g1b) r23Var.f).get();
                        uf1 uf1Var2 = (uf1) hbcVar4.b;
                        dg7 dg7Var2 = (dg7) ((g1b) r23Var.d).get();
                        g1bVar3.getClass();
                        qweVar3.getClass();
                        dg7Var2.getClass();
                        return new rc1(g1bVar3, qweVar3, uf1Var2.a, dg7Var2);
                    case 3:
                        os osVar = (os) bwVar.e;
                        os osVar2 = (os) bwVar.f;
                        os osVar3 = (os) bwVar.g;
                        os osVar4 = (os) bwVar.v;
                        os osVar5 = (os) bwVar.w;
                        uf1 uf1Var3 = (uf1) hbcVar4.b;
                        osVar.getClass();
                        osVar2.getClass();
                        osVar3.getClass();
                        osVar4.getClass();
                        osVar5.getClass();
                        int i3 = uf1Var3.h;
                        if (i3 != 2) {
                            if (Build.VERSION.SDK_INT >= 28) {
                                return (fo1) osVar4.get();
                            }
                            return i3 == 1 ? (fo1) osVar2.get() : (fo1) osVar3.get();
                        }
                        if (Build.VERSION.SDK_INT >= 31) {
                            return (fo1) osVar5.get();
                        }
                        qc0.p("Cannot use Extension sessions below Android S");
                        return null;
                    case 4:
                        return new et((qwe) ((g1b) r23Var.f).get(), (d3e) hbcVar4.d, (uf1) hbcVar4.b, 0);
                    case 5:
                        return new dt((d3e) hbcVar4.d, (qwe) ((g1b) r23Var.f).get());
                    case 6:
                        return new et((qwe) ((g1b) r23Var.f).get(), (d3e) hbcVar4.d, (uf1) hbcVar4.b, 1);
                    case 7:
                        return new qt((qwe) ((g1b) r23Var.f).get(), (uf1) hbcVar4.b, (d3e) hbcVar4.d);
                    case 8:
                        return new wr((qwe) ((g1b) r23Var.f).get(), (uf1) hbcVar4.b, (d3e) hbcVar4.d, (rd1) ((g1b) r23Var.n).get(), (i4e) ((g1b) r23Var.o).get());
                    default:
                        throw new AssertionError(i2);
                }
            default:
                int i4 = this.b;
                switch (i4) {
                    case 0:
                        q23 q23Var = (q23) this.d;
                        uf1 uf1Var4 = (uf1) q23Var.a.b;
                        yg1 yg1Var4 = (yg1) q23Var.c.get();
                        ud6 ud6Var3 = (ud6) ((q23) this.d).e.get();
                        ud6 ud6Var4 = (ud6) ((q23) this.d).e.get();
                        d3e d3eVar = (d3e) ((q23) this.d).f.get();
                        jae jaeVar3 = (jae) ((q23) this.d).h.get();
                        gc1 gc1Var = (gc1) ((q23) this.d).g.get();
                        sy5 sy5Var = (sy5) ((q23) this.d).k.get();
                        qy5 qy5Var = (qy5) ((q23) this.d).i.get();
                        lk0 lk0Var = (lk0) ((g1b) ((r23) this.c).r).get();
                        q23 q23Var2 = (q23) this.d;
                        return new dg1(uf1Var4, yg1Var4, ud6Var3, ud6Var4, d3eVar, jaeVar3, gc1Var, sy5Var, qy5Var, lk0Var, (bg1) q23Var2.a.c, (eg1) q23Var2.o.get(), (fg1) ((q23) this.d).p.get(), (yd6) ((q23) this.d).m.get(), (aw2) ((q23) this.d).n.get(), (ho2) ((q23) this.d).r.get());
                    case 1:
                        q23 q23Var3 = (q23) this.d;
                        uf1 uf1Var5 = (uf1) q23Var3.a.b;
                        vd1 vd1Var = (vd1) q23Var3.b.get();
                        vd1Var.getClass();
                        String str3 = uf1Var5.a;
                        str3.getClass();
                        return ((nb1) vd1Var).c.a(str3);
                    case 2:
                        yd1 yd1Var = (yd1) ((g1b) ((r23) this.c).v).get();
                        k47 k47Var2 = ((q23) this.d).a;
                        ph1 ph1Var = (ph1) ((g1b) ((r23) this.c).x).get();
                        yd1Var.getClass();
                        ph1Var.getClass();
                        vd1 vd1Var2 = yd1Var.d;
                        nk8.o(vd1Var2);
                        return vd1Var2;
                    case 3:
                        qwe qweVar4 = (qwe) ((g1b) ((r23) this.c).f).get();
                        q23 q23Var4 = (q23) this.d;
                        k47 k47Var3 = q23Var4.a;
                        ud6Var = new ud6(qweVar4, (bg1) k47Var3.c, (uf1) k47Var3.b, (y88) q23Var4.d.get(), (List) ((q23) this.d).l.get(), (sd1) ((g1b) ((r23) this.c).p).get());
                        return ud6Var;
                    case 4:
                        return new y88();
                    case 5:
                        q23 q23Var5 = (q23) this.d;
                        uf1 uf1Var6 = (uf1) q23Var5.a.b;
                        y88 y88Var = (y88) q23Var5.d.get();
                        sy5 sy5Var2 = (sy5) ((q23) this.d).k.get();
                        y88Var.getClass();
                        sy5Var2.getClass();
                        ArrayList arrayListK = t72.K(y88Var);
                        arrayListK.add(y88Var);
                        arrayListK.add(sy5Var2);
                        arrayListK.addAll(uf1Var6.j);
                        jaeVar = arrayListK;
                        return jaeVar;
                    case 6:
                        d3e d3eVar2 = (d3e) ((q23) this.d).f.get();
                        qy5 qy5Var2 = (qy5) ((q23) this.d).i.get();
                        yg1 yg1Var5 = (yg1) ((q23) this.d).c.get();
                        fce fceVar = (fce) ((q23) this.d).j.get();
                        d3eVar2.getClass();
                        qy5Var2.getClass();
                        yg1Var5.getClass();
                        fceVar.getClass();
                        CameraCharacteristics.Key key2 = CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE;
                        key2.getClass();
                        Integer num = (Integer) ((nc1) yg1Var5).c(key2);
                        if (num != null) {
                            num.intValue();
                        }
                        return new sy5(d3eVar2, qy5Var2);
                    case 7:
                        yg1 yg1Var6 = (yg1) ((q23) this.d).c.get();
                        uf1 uf1Var7 = (uf1) ((q23) this.d).a.b;
                        ((qwe) ((g1b) ((r23) this.c).f).get()).getClass();
                        ud6Var = new d3e(yg1Var6, uf1Var7, new jy4(7), ((q23) this.d).g);
                        return ud6Var;
                    case 8:
                        q23 q23Var6 = (q23) this.d;
                        k47 k47Var4 = q23Var6.a;
                        bg1 bg1Var = (bg1) k47Var4.c;
                        uf1 uf1Var8 = (uf1) k47Var4.b;
                        vd1 vd1Var3 = (vd1) q23Var6.b.get();
                        ph1 ph1Var2 = (ph1) ((g1b) ((r23) this.c).x).get();
                        ud6 ud6Var5 = (ud6) ((q23) this.d).e.get();
                        d3e d3eVar3 = (d3e) ((q23) this.d).f.get();
                        jae jaeVar4 = (jae) ((q23) this.d).h.get();
                        vd1Var3.getClass();
                        ph1Var2.getClass();
                        ud6Var5.getClass();
                        d3eVar3.getClass();
                        jaeVar4.getClass();
                        nb1 nb1Var = (nb1) vd1Var3;
                        ssg ssgVar = nb1Var.e;
                        hbc hbcVar5 = new hbc();
                        hbcVar5.a = bg1Var;
                        hbcVar5.b = uf1Var8;
                        hbcVar5.c = ud6Var5;
                        hbcVar5.d = d3eVar3;
                        hbcVar5.e = jaeVar4;
                        hbcVar5.f = nb1Var;
                        gc1 gc1Var2 = (gc1) ((g1b) new bw((r23) ssgVar.b, hbcVar5).y).get();
                        synchronized (nb1Var.f) {
                            nb1Var.g.add(gc1Var2);
                        }
                        nk8.o(gc1Var2);
                        return gc1Var2;
                    case 9:
                        d3e d3eVar4 = (d3e) ((q23) this.d).f.get();
                        vd9 vd9Var2 = ((q23) this.d).g;
                        bk1 bk1Var = (bk1) ((g1b) ((r23) this.c).y).get();
                        d3eVar4.getClass();
                        vd9Var2.getClass();
                        bk1Var.getClass();
                        jaeVar = new jae(d3eVar4, vd9Var2, bk1Var, d3eVar4.e);
                        return jaeVar;
                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        return new qy5();
                    case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        long j = Long.MAX_VALUE;
                        long j2 = Long.MAX_VALUE;
                        for (int i5 = 0; i5 < 3; i5++) {
                            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                            System.currentTimeMillis();
                            long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
                            if (jElapsedRealtimeNanos2 < j2) {
                                j2 = jElapsedRealtimeNanos2;
                            }
                        }
                        for (int i6 = 0; i6 < 3; i6++) {
                            long jNanoTime = System.nanoTime();
                            SystemClock.elapsedRealtimeNanos();
                            long jNanoTime2 = System.nanoTime() - jNanoTime;
                            if (jNanoTime2 < j) {
                                j = jNanoTime2;
                            }
                        }
                        return new fce();
                    case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        ud6Var = new eg1((yd6) ((q23) this.d).m.get(), (ud6) ((q23) this.d).e.get(), (aw2) ((q23) this.d).n.get());
                        return ud6Var;
                    case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        return new yd6();
                    case 14:
                        qwe qweVar5 = (qwe) ((g1b) ((r23) this.c).f).get();
                        dg7 dg7Var3 = (dg7) ((g1b) ((r23) this.c).d).get();
                        qweVar5.getClass();
                        dg7Var3.getClass();
                        return jgb.k(i7h.I(new t8e(dg7Var3), i7h.I(qweVar5.h, new wv2("CXCP-Graph"))));
                    case 15:
                        ud6Var = new fg1((yd6) ((q23) this.d).m.get(), (ud6) ((q23) this.d).e.get(), (aw2) ((q23) this.d).n.get());
                        return ud6Var;
                    case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                        ud6Var = new ho2((ud6) ((q23) this.d).e.get(), (yg1) ((q23) this.d).c.get(), (de6) ((q23) this.d).q.get(), (y88) ((q23) this.d).d.get());
                        return ud6Var;
                    case 17:
                        return new de6();
                    default:
                        throw new AssertionError(i4);
                }
        }
    }

    public int h(Object obj) {
        e79 e79Var = (e79) this.c;
        int iD = e79Var.d(obj);
        if (iD >= 0) {
            return e79Var.c[iD];
        }
        return -1;
    }

    public Object i(int i) {
        Object[] objArr = (Object[]) this.d;
        int i2 = i - this.b;
        if (i2 < 0 || i2 >= objArr.length) {
            return null;
        }
        return objArr[i2];
    }

    public int j() {
        int i = this.b;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int k(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3) {
        int i8 = i & 33554431;
        long[] jArr = (long[]) this.c;
        int i9 = this.b;
        int i10 = i9 + 3;
        this.b = i10;
        int length = jArr.length;
        if (length <= i10) {
            int iMax = Math.max(length * 2, i10);
            this.c = Arrays.copyOf(jArr, iMax);
            this.d = Arrays.copyOf((long[]) this.d, iMax);
        }
        long[] jArr2 = (long[]) this.c;
        jArr2[i9] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
        jArr2[i9 + 1] = (((long) i4) << 32) | (((long) i5) & 4294967295L);
        int i11 = i6 & 33554431;
        jArr2[i9 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | 1152921504606846976L | (((long) Math.min(0, 1023)) << 50) | (((long) i11) << 25) | ((long) (i & 33554431));
        if (i6 == -1) {
            return i9;
        }
        if ((i7 != -4) == false) {
            i37.c("Inserted child " + i8 + " without valid parent index");
        }
        int i12 = i7 + 2;
        long j = jArr2[i12];
        if (!((33554431 & ((int) j)) == i11)) {
            i37.c("Inserted child " + i8 + " without valid parent index or parent " + i11 + " not found");
        }
        int i13 = ikb.b;
        jArr2[i12] = ((-1151795604700004353L) & j) | (((long) Math.min((i9 - i7) / 3, 1023)) << 50);
        return i9;
    }

    public void l(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.c;
        Context context = imageView.getContext();
        int[] iArr = hbb.f;
        psd psdVarX = psd.x(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) psdVarX.c;
        nvf.i(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) psdVarX.c, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = x57.T(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                do4.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(psdVarX.o(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(do4.b(typedArray.getInt(3, -1), null));
            }
        } finally {
            psdVarX.z();
        }
    }

    @Override // defpackage.zx0
    public void m() {
        d0a d0aVar = (d0a) this.d;
        byte[] bArr = pqf.b;
        d0aVar.K(bArr, bArr.length);
    }

    public bo8 n(r7d r7dVar, int i) throws Throwable {
        Double dValueOf;
        int iIntValue;
        Integer numValueOf;
        Integer numValueOf2;
        int i2 = i;
        r7dVar.getClass();
        r6e r6eVar = (r6e) this.c;
        int i3 = 0;
        if (r7dVar instanceof v7d) {
            aue aueVar = (aue) this.d;
            v7d v7dVar = (v7d) r7dVar;
            k00 k00Var = v7dVar.a;
            mue mueVar = v7dVar.b;
            int i4 = v7dVar.c ? i2 : 0;
            if (i2 < 1) {
                i2 = 1;
            }
            ste steVarB = aue.b(aueVar, k00Var, mueVar, 3, false, 0, pa7.S(i4, i2, 0, 4096), null, null, null, 1976);
            return new bo8((int) (steVarB.c >> 32), Math.ceil(steVarB.b.e), null, steVarB, null, null, null, 116);
        }
        Throwable th = null;
        if (r7dVar instanceof u7d) {
            int i5 = this.b;
            this.b = i5 + 1;
            cea ceaVarV = ((tn8) s72.X0(r6eVar.z0(new dd2(new wf8(28, r7dVar), true, 2101392485), Integer.valueOf(i5)))).v(pa7.S(0, i2, 0, 16384));
            int i6 = ceaVarV.b;
            if (i6 >= 16384) {
                qc0.p("Share document slot exceeds its supported height");
                return null;
            }
            int i7 = ceaVarV.a;
            double d = i6;
            return new bo8(i2, d, t72.H(new vna(new bo8(i7, d, null, null, ceaVarV, null, null, 108), ((u7d) r7dVar).b.a(i7, i2, r6eVar.getLayoutDirection()), 0.0d)), null, null, null, null, 120);
        }
        if (r7dVar instanceof p7d) {
            p7d p7dVar = (p7d) r7dVar;
            fg4 fg4VarO = o(p7dVar.b);
            int i8 = fg4VarO.c;
            int i9 = fg4VarO.a;
            int iIntValue2 = (i - i9) - i8;
            if (iIntValue2 < 0) {
                iIntValue2 = 0;
            }
            List list = p7dVar.a;
            ArrayList arrayList = new ArrayList(t72.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(n((r7d) it.next(), iIntValue2));
            }
            if (!p7dVar.e) {
                Iterator it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    numValueOf2 = Integer.valueOf(((bo8) it2.next()).a);
                    while (it2.hasNext()) {
                        Integer numValueOf3 = Integer.valueOf(((bo8) it2.next()).a);
                        if (numValueOf2.compareTo(numValueOf3) < 0) {
                            numValueOf2 = numValueOf3;
                        }
                    }
                } else {
                    numValueOf2 = null;
                }
                iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : 0;
            }
            double dD0 = fg4VarO.b;
            ArrayList arrayList2 = new ArrayList(t72.u(arrayList, 10));
            for (Object obj : arrayList) {
                int i10 = i3 + 1;
                if (i3 < 0) {
                    Throwable th2 = th;
                    t72.Z();
                    throw th2;
                }
                bo8 bo8Var = (bo8) obj;
                if (i3 > 0) {
                    dD0 += (double) r6eVar.D0(p7dVar.c);
                }
                double d2 = dD0;
                int i11 = i9;
                vna vnaVar = new vna(bo8Var, ((double) i11) + ((double) p7dVar.d.a(bo8Var.a, iIntValue2, r6eVar.getLayoutDirection())), d2);
                dD0 = d2 + bo8Var.b;
                arrayList2.add(vnaVar);
                i9 = i11;
                i3 = i10;
                th = th;
            }
            int i12 = iIntValue2 + i9 + i8;
            return new bo8(i12, Math.max(dD0 + ((double) fg4VarO.d), ym8.M(((double) i12) * ((double) p7dVar.f))), arrayList2, null, null, p7dVar.g, p7dVar.h, 24);
        }
        if (!(r7dVar instanceof t7d)) {
            ap.c();
            return null;
        }
        t7d t7dVar = (t7d) r7dVar;
        List list2 = t7dVar.a;
        fg4 fg4VarO2 = o(t7dVar.b);
        int i13 = fg4VarO2.b;
        int i14 = fg4VarO2.a;
        int iD0 = r6eVar.D0(t7dVar.c);
        int i15 = (i - i14) - fg4VarO2.c;
        if (i15 < 0) {
            i15 = 0;
        }
        ArrayList<Integer> arrayList3 = new ArrayList(t72.u(list2, 10));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            yi4 yi4Var = ((o7d) it3.next()).b;
            arrayList3.add(yi4Var != null ? Integer.valueOf(r6eVar.D0(yi4Var.a)) : null);
        }
        ArrayList arrayList4 = new ArrayList(t72.u(list2, 10));
        Iterator it4 = list2.iterator();
        while (it4.hasNext()) {
            ((o7d) it4.next()).getClass();
            arrayList4.add(Float.valueOf(1.0f));
        }
        if (arrayList3.size() != arrayList4.size()) {
            qc0.j("Failed requirement.");
            return null;
        }
        if (!arrayList4.isEmpty()) {
            Iterator it5 = arrayList4.iterator();
            while (it5.hasNext()) {
                float fFloatValue = ((Number) it5.next()).floatValue();
                if (Math.abs(fFloatValue) > Float.MAX_VALUE || fFloatValue <= 0.0f) {
                    qc0.j("Failed requirement.");
                    return null;
                }
            }
        }
        int size = arrayList3.size() - 1;
        if (size < 0) {
            size = 0;
        }
        int i16 = i15 - (size * iD0);
        if (i16 < 0) {
            i16 = 0;
        }
        ArrayList arrayList5 = new ArrayList(t72.u(arrayList3, 10));
        for (Integer num : arrayList3) {
            if (num != null) {
                int iO = mh3.o(num.intValue(), 0, i16);
                numValueOf = Integer.valueOf(iO);
                i16 -= iO;
            } else {
                numValueOf = null;
            }
            arrayList5.add(numValueOf);
        }
        Iterator it6 = t72.B(arrayList4).iterator();
        double dFloatValue = 0.0d;
        while (((y67) it6).c) {
            int iNextInt = ((q67) it6).nextInt();
            dFloatValue += arrayList5.get(iNextInt) == null ? ((Number) arrayList4.get(iNextInt)).floatValue() : 0.0d;
        }
        ArrayList arrayList6 = new ArrayList(t72.u(arrayList5, 10));
        Iterator it7 = arrayList5.iterator();
        int i17 = 0;
        while (it7.hasNext()) {
            Object next = it7.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                t72.Z();
                throw null;
            }
            Integer num2 = (Integer) next;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                double dFloatValue2 = ((Number) arrayList4.get(i17)).floatValue();
                int iO2 = mh3.o((int) ((((double) i16) * dFloatValue2) / dFloatValue), 0, i16);
                i16 -= iO2;
                dFloatValue -= dFloatValue2;
                iIntValue = iO2;
            }
            arrayList6.add(Integer.valueOf(iIntValue));
            it7 = it7;
            i17 = i18;
        }
        ArrayList arrayList7 = new ArrayList(t72.u(list2, 10));
        double dIntValue = i14;
        for (Object obj2 : list2) {
            int i19 = i3 + 1;
            if (i3 < 0) {
                t72.Z();
                throw null;
            }
            vna vnaVar2 = new vna(n(((o7d) obj2).a, ((Number) arrayList6.get(i3)).intValue()), dIntValue, i13);
            dIntValue += (double) (((Number) arrayList6.get(i3)).intValue() + iD0);
            arrayList7.add(vnaVar2);
            i3 = i19;
        }
        double d3 = i13 + fg4VarO2.d;
        Iterator it8 = arrayList7.iterator();
        if (it8.hasNext()) {
            double dMax = ((vna) it8.next()).a.b;
            while (it8.hasNext()) {
                dMax = Math.max(dMax, ((vna) it8.next()).a.b);
            }
            dValueOf = Double.valueOf(dMax);
        } else {
            dValueOf = null;
        }
        return new bo8(i, d3 + (dValueOf != null ? dValueOf.doubleValue() : 0.0d), arrayList7, null, null, null, t7dVar.d, 24);
    }

    public fg4 o(xw9 xw9Var) {
        r6e r6eVar = (r6e) this.c;
        return new fg4(r6eVar.D0(xw9Var.b(r6eVar.getLayoutDirection())), r6eVar.D0(xw9Var.d()), r6eVar.D0(xw9Var.c(r6eVar.getLayoutDirection())), r6eVar.D0(xw9Var.a()));
    }

    public int p(l4c l4cVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
        int i = this.b;
        this.b = i + 1;
        String strValueOf = String.valueOf(i);
        strValueOf.getClass();
        String strConcat = l4cVar.a;
        if (strConcat == null) {
            linkedHashMap.put(strValueOf, l4cVar);
            strConcat = "format:".concat(strValueOf);
        }
        return ((i00) this.c).j(l4c.b, strConcat);
    }

    public void q(Object obj, Object obj2) {
        int i = (this.b + 1) * 2;
        Object[] objArr = (Object[]) this.c;
        if (i > objArr.length) {
            this.c = Arrays.copyOf(objArr, yx6.f(objArr.length, i));
        }
        ynb.C(obj, obj2);
        Object[] objArr2 = (Object[]) this.c;
        int i2 = this.b;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.b = i2 + 1;
    }

    public void r(Set set) {
        if (set instanceof Collection) {
            int size = (set.size() + this.b) * 2;
            Object[] objArr = (Object[]) this.c;
            if (size > objArr.length) {
                this.c = Arrays.copyOf(objArr, yx6.f(objArr.length, size));
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            q(entry.getKey(), entry.getValue());
        }
    }

    public void s(int i, int i2, int i3, long j) {
        long j2;
        char c;
        int i4;
        char c2 = '2';
        if ((((int) (j >> 50)) & 1023) > 0) {
            int i5 = ikb.b;
            long j3 = -1125899873288193L;
            int i6 = 33554431;
            char c3 = 25;
            long[] jArr = (long[]) this.c;
            long[] jArr2 = (long[]) this.d;
            int i7 = this.b;
            jArr2[0] = (j & (-1125899873288193L)) | (((long) (i & 33554431)) << 25);
            int i8 = 1;
            while (i8 > 0) {
                i8--;
                long j4 = jArr2[i8];
                int i9 = ((int) j4) & i6;
                int i10 = ((int) (j4 >> c3)) & i6;
                int i11 = ((int) (j4 >> c2)) & 1023;
                int i12 = i11 == 1023 ? i7 : (i11 * 3) + i10;
                if (i10 < 0) {
                    return;
                }
                while (i10 < i7 - 2 && i10 <= i12) {
                    int i13 = i10 + 2;
                    long j5 = jArr[i13];
                    char c4 = c2;
                    int i14 = i6;
                    if ((((int) (j5 >> c3)) & i14) == i9) {
                        long j6 = jArr[i10];
                        int i15 = i10 + 1;
                        j2 = j3;
                        long j7 = jArr[i15];
                        c = c3;
                        i4 = i12;
                        jArr[i10] = (((long) (((int) j6) + i3)) & 4294967295L) | (((long) (((int) (j6 >> 32)) + i2)) << 32);
                        jArr[i15] = (((long) (((int) j7) + i3)) & 4294967295L) | (((long) (((int) (j7 >> 32)) + i2)) << 32);
                        jArr[i13] = (((j5 >> 63) & 1) << 60) | j5;
                        if ((((int) (j5 >> c4)) & 1023) > 0) {
                            int i16 = ikb.b;
                            jArr2[i8] = (j5 & j2) | (((long) ((i10 + 3) & i14)) << c);
                            i8++;
                        }
                    } else {
                        j2 = j3;
                        c = c3;
                        i4 = i12;
                    }
                    i10 += 3;
                    i12 = i4;
                    c3 = c;
                    i6 = i14;
                    c2 = c4;
                    j3 = j2;
                }
                c3 = c3;
                i6 = i6;
                c2 = c2;
                j3 = j3;
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 14:
                StringBuilder sb = new StringBuilder();
                if (((a1b) this.c) == a1b.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.b);
                sb.append(' ');
                sb.append((String) this.d);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public os(int i, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.a = 18;
        this.b = i;
        this.d = str;
        this.c = arrayList;
    }

    public /* synthetic */ os(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    public os(String str, String[] strArr) {
        String string;
        this.a = 6;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
            }
            sb.append("] ");
            string = sb.toString();
        }
        this.d = string;
        this.c = str;
        int length = str.length();
        Object[] objArr = {str, 23};
        if (length <= 23) {
            int i = 2;
            while (i <= 7 && !Log.isLoggable((String) this.c, i)) {
                i++;
            }
            this.b = i;
            return;
        }
        throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
    }

    public os(a1b a1bVar, int i, String str) {
        this.a = 14;
        this.c = a1bVar;
        this.b = i;
        this.d = str;
    }

    public os(ArrayList arrayList, int i, MotionEvent motionEvent) {
        this.a = 0;
        this.c = arrayList;
        this.b = i;
        this.d = motionEvent;
        if (arrayList.isEmpty()) {
            qc0.j("changes cannot be empty");
            throw null;
        }
    }

    public os(ImageView imageView) {
        this.a = 1;
        this.b = 0;
        this.c = imageView;
    }

    public /* synthetic */ os(int i, char c) {
        this.a = i;
    }

    public os(cva cvaVar) {
        this.a = 13;
        this.c = new SparseArray();
        this.d = cvaVar;
        this.b = -1;
    }

    public os(int i, rye ryeVar) {
        this.a = 15;
        this.b = i;
        this.c = ryeVar;
        this.d = new d0a();
    }

    public os(int i, byte b) {
        this.a = i;
        switch (i) {
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                this.c = new i00(16);
                this.d = new LinkedHashMap();
                break;
            default:
                this.c = new p89(0, new da7[16]);
                break;
        }
    }

    public os(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.a = 16;
        this.b = i2;
        if (arrayList == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.c = listUnmodifiableList;
        this.d = bArr;
    }

    public os(r6e r6eVar, aue aueVar) {
        this.a = 11;
        aueVar.getClass();
        this.c = r6eVar;
        this.d = aueVar;
    }

    public os(int i) {
        this.a = 5;
        this.c = new Object[i * 2];
        this.b = 0;
    }
}
