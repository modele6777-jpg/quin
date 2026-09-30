package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hv6 extends oif {
    public static final fv6 C = new fv6();
    public wzc A;
    public final kb6 B;
    public final int r;
    public final AtomicReference s;
    public final int t;
    public final int u;
    public Rational v;
    public final vfc w;
    public vzc x;
    public szc y;
    public cee z;

    public hv6(iv6 iv6Var) {
        super(iv6Var);
        this.s = new AtomicReference(null);
        this.u = -1;
        this.v = null;
        this.B = new kb6(17, this);
        iv6 iv6Var2 = (iv6) this.i;
        no0 no0Var = iv6.b;
        if (iv6Var2.h(no0Var)) {
            this.r = ((Integer) iv6Var2.c(no0Var)).intValue();
        } else {
            this.r = 1;
        }
        this.t = ((Integer) iv6Var2.a(iv6.w, 0)).intValue();
        this.w = new vfc((vfc) iv6Var2.a(iv6.y, null));
    }

    public static boolean H(int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    public final void E(boolean z) {
        cee ceeVar;
        Log.d("ImageCapture", "clearPipeline");
        p8c.m();
        wzc wzcVar = this.A;
        if (wzcVar != null) {
            wzcVar.b();
            this.A = null;
        }
        szc szcVar = this.y;
        if (szcVar != null) {
            szcVar.C();
            this.y = null;
        }
        if (!z && (ceeVar = this.z) != null) {
            ceeVar.b();
            this.z = null;
        }
        e().a();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00de  */
    /* JADX WARN: Code duplicated, block: B:7:0x005b  */
    public final vzc F(String str, iv6 iv6Var, hq0 hq0Var) {
        qh2 qh2VarA;
        HashSet hashSet;
        vx6 vx6Var;
        boolean zContains;
        int i = 0;
        p8c.m();
        Log.d("ImageCapture", "createPipeline(cameraId: " + str + ", streamSpec: " + hq0Var + ")");
        Size size = hq0Var.a;
        pg1 pg1VarD = d();
        Objects.requireNonNull(pg1VarD);
        boolean zO = pg1VarD.o() ^ true;
        CameraCharacteristics cameraCharacteristics = null;
        if (this.y != null) {
            ok8.o(null, zO);
            this.y.C();
        }
        kg1 kg1VarB = d().b();
        if ((kg1VarB instanceof vf) && (qh2VarA = ((akf) ((vf) kg1VarB).c.a(te1.j, akf.a)).a(zjf.a, 1)) != null) {
            no0 no0Var = ew6.M;
            bs9 bs9Var = (bs9) qh2VarA;
            if (bs9Var.a.containsKey(no0Var)) {
                hashSet = new HashSet();
                hashSet.add(0);
                Iterator it = ((List) bs9Var.c(no0Var)).iterator();
                while (it.hasNext()) {
                    if (((Integer) ((Pair) it.next()).first).intValue() == 4101) {
                        hashSet.add(1);
                        break;
                    }
                }
            } else {
                hashSet = null;
            }
        } else {
            hashSet = null;
        }
        if (hashSet == null) {
            hashSet = new HashSet();
            hashSet.add(0);
            if (kg1VarB != null ? ((ng1) kg1VarB).w().contains(4101) : false) {
                hashSet.add(1);
            }
            if (kg1VarB != null) {
                ng1 ng1Var = (ng1) kg1VarB;
                if (ng1Var.v().contains(3)) {
                    zContains = ng1Var.w().contains(32);
                } else {
                    zContains = false;
                }
            } else {
                zContains = false;
            }
            if (zContains) {
                hashSet.add(2);
                hashSet.add(3);
            }
        }
        xjf xjfVar = this.i;
        no0 no0Var2 = iv6.f;
        Integer num = (Integer) xjfVar.a(no0Var2, 0);
        num.getClass();
        boolean zContains2 = hashSet.contains(num);
        StringBuilder sb = new StringBuilder("The specified output format (");
        Integer num2 = (Integer) this.i.a(no0Var2, 0);
        num2.getClass();
        sb.append(num2.intValue());
        sb.append(") is not supported by current configuration. Supported output formats: ");
        sb.append(hashSet);
        ok8.k(sb.toString(), zContains2);
        if (((Boolean) this.i.a(iv6.z, Boolean.FALSE)).booleanValue()) {
            iv6Var.l();
            d().g().u();
        }
        if (d() != null) {
            try {
                Object objQ = d().q().q();
                if (objQ instanceof CameraCharacteristics) {
                    cameraCharacteristics = (CameraCharacteristics) objQ;
                }
            } catch (Exception e) {
                b1.e("ImageCapture", "getCameraCharacteristics failed", e);
            }
        }
        this.y = new szc(iv6Var, size, cameraCharacteristics, zO);
        cee ceeVar = this.z;
        if (ceeVar == null) {
            Objects.requireNonNull((vjf) this.i.a(xjf.t0, new vjf()));
            cee ceeVar2 = new cee(this.B);
            this.z = ceeVar2;
            ceeVar = ceeVar2;
        }
        szc szcVar = this.y;
        p8c.m();
        ceeVar.c = szcVar;
        szcVar.getClass();
        p8c.m();
        hbc hbcVar = (hbc) szcVar.d;
        p8c.m();
        ok8.o("The ImageReader is not initialized.", ((sbc) hbcVar.b) != null);
        sbc sbcVar = (sbc) hbcVar.b;
        synchronized (sbcVar.a) {
            sbcVar.f = ceeVar;
        }
        szc szcVar2 = this.y;
        vzc vzcVarD = vzc.d((iv6) szcVar2.b, hq0Var.a);
        ko0 ko0Var = (ko0) szcVar2.e;
        vx6 vx6Var2 = ko0Var.c;
        Objects.requireNonNull(vx6Var2);
        qr4 qr4Var = qr4.d;
        a82 a82VarA = eq0.a(vx6Var2);
        a82VarA.f = qr4Var;
        vzcVarD.a.add(a82VarA.s());
        if (ko0Var.h.size() > 1 && (vx6Var = ko0Var.d) != null) {
            a82 a82VarA2 = eq0.a(vx6Var);
            a82VarA2.f = qr4Var;
            vzcVarD.a.add(a82VarA2.s());
        }
        vx6 vx6Var3 = ko0Var.e;
        if (vx6Var3 != null) {
            vzcVarD.i = eq0.a(vx6Var3).s();
        }
        vzcVarD.h = hq0Var.d;
        if (this.r == 2 && !hq0Var.g) {
            e().b(vzcVarD);
        }
        qh2 qh2Var = hq0Var.f;
        if (qh2Var != null) {
            vzcVarD.b.e(qh2Var);
        }
        wzc wzcVar = this.A;
        if (wzcVar != null) {
            wzcVar.b();
        }
        wzc wzcVar2 = new wzc(new ev6(i, this));
        this.A = wzcVar2;
        vzcVarD.f = wzcVar2;
        return vzcVarD;
    }

    public final int G() {
        int iIntValue;
        synchronized (this.s) {
            iIntValue = this.u;
            if (iIntValue == -1) {
                iIntValue = ((Integer) ((iv6) this.i).a(iv6.c, 2)).intValue();
            }
        }
        return iIntValue;
    }

    public final void I(Executor executor, bu0 bu0Var) {
        int i;
        int iRound;
        int i2;
        int i3;
        int i4;
        int iIntValue;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            ((ah6) ok8.w()).execute(new c0(this, executor, bu0Var, 20));
            return;
        }
        p8c.m();
        if (G() == 3 && this.w.a == null) {
            qc0.j("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
            return;
        }
        Log.d("ImageCapture", "takePictureInternal");
        pg1 pg1VarD = d();
        Rect rect = null;
        if (pg1VarD == null || !this.a) {
            new jv6(4, "Not bound to a valid Camera [" + this + "]", null);
            return;
        }
        boolean z = ((Integer) this.i.a(wv6.D, 0)).intValue() != 0;
        cee ceeVar = this.z;
        Objects.requireNonNull(ceeVar);
        Rect rect2 = this.l;
        Size sizeC = c();
        Objects.requireNonNull(sizeC);
        if (rect2 != null) {
            i = 2;
        } else {
            Rational rational = this.v;
            if (rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) {
                i = 2;
                rect2 = new Rect(0, 0, sizeC.getWidth(), sizeC.getHeight());
            } else {
                pg1 pg1VarD2 = d();
                Objects.requireNonNull(pg1VarD2);
                int i5 = i(pg1VarD2, false);
                Rational rational2 = new Rational(this.v.getDenominator(), this.v.getNumerator());
                if (!s2f.c(i5)) {
                    rational2 = this.v;
                }
                if (rational2 == null || rational2.floatValue() <= 0.0f || rational2.isNaN()) {
                    i = 2;
                    b21.W("ImageUtil", "Invalid view ratio.");
                } else {
                    int width = sizeC.getWidth();
                    int height = sizeC.getHeight();
                    float f = width;
                    float f2 = height;
                    float f3 = f / f2;
                    int numerator = rational2.getNumerator();
                    i = 2;
                    int denominator = rational2.getDenominator();
                    if (rational2.floatValue() > f3) {
                        int iRound2 = Math.round((f / numerator) * denominator);
                        i4 = (height - iRound2) / 2;
                        i3 = iRound2;
                        iRound = width;
                        i2 = 0;
                    } else {
                        iRound = Math.round((f2 / denominator) * numerator);
                        i2 = (width - iRound) / 2;
                        i3 = height;
                        i4 = 0;
                    }
                    rect = new Rect(i2, i4, iRound + i2, i3 + i4);
                }
                Objects.requireNonNull(rect);
                rect2 = rect;
            }
        }
        Matrix matrix = this.m;
        int i6 = i(pg1VarD, false);
        iv6 iv6Var = (iv6) this.i;
        no0 no0Var = iv6.x;
        if (iv6Var.h(no0Var)) {
            iIntValue = ((Integer) iv6Var.c(no0Var)).intValue();
        } else {
            int i7 = this.r;
            if (i7 == 0) {
                iIntValue = 100;
            } else {
                if (i7 != 1 && i7 != i) {
                    qc0.p(tec.f(i7, "CaptureMode ", " is invalid"));
                    return;
                }
                iIntValue = 95;
            }
        }
        oq0 oq0Var = new oq0(executor, bu0Var, rect2, matrix, i6, iIntValue, this.r, z, Collections.unmodifiableList(this.x.e));
        if (z) {
            Boolean bool = Boolean.FALSE;
            HashMap map = oq0Var.b;
            map.put(32, bool);
            map.put(256, bool);
        }
        p8c.m();
        ceeVar.a.offer(oq0Var);
        ceeVar.c();
    }

    public final void J() {
        synchronized (this.s) {
            try {
                if (this.s.get() != null) {
                    return;
                }
                e().d(G());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.oif
    public final xjf g(boolean z, akf akfVar) {
        C.getClass();
        iv6 iv6Var = fv6.a;
        qh2 qh2VarA = akfVar.a(iv6Var.s(), this.r);
        if (z) {
            qh2VarA = qh2.q(qh2VarA, iv6Var);
        }
        if (qh2VarA == null) {
            return null;
        }
        return new iv6(bs9.d(((sk1) m(qh2VarA)).b));
    }

    @Override // defpackage.oif
    public final Set l() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    @Override // defpackage.oif
    public final wjf m(qh2 qh2Var) {
        return new sk1(k79.m(qh2Var), 1);
    }

    @Override // defpackage.oif
    public final void s() {
        ok8.n(d(), "Attached camera cannot be null");
        if (G() == 3) {
            pg1 pg1VarD = d();
            if ((pg1VarD != null ? pg1VarD.b().m() : -1) == 0) {
                return;
            }
            qc0.j("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
        }
    }

    @Override // defpackage.oif
    public final void t() {
        b21.q("ImageCapture", "onCameraControlReady");
        J();
        e().e(this.w);
    }

    public final String toString() {
        return "ImageCapture:".concat(h());
    }

    @Override // defpackage.oif
    public final xjf u(ng1 ng1Var, wjf wjfVar) {
        HashSet<gf6> hashSet = this.h;
        boolean z = false;
        if (hashSet != null) {
            int i = 0;
            for (gf6 gf6Var : hashSet) {
                if (gf6Var instanceof uv6) {
                    i = ((uv6) gf6Var).a;
                }
            }
            wjfVar.h().p(iv6.f, Integer.valueOf(i));
        }
        if (ng1Var.s().a(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            k79 k79VarH = wjfVar.h();
            no0 no0Var = iv6.v;
            Boolean bool2 = Boolean.TRUE;
            if (bool.equals(k79VarH.a(no0Var, bool2))) {
                b21.W("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                b21.C("ImageCapture", "Requesting software JPEG due to device quirk.");
                wjfVar.h().p(no0Var, bool2);
            }
        }
        k79 k79VarH2 = wjfVar.h();
        Boolean bool3 = Boolean.TRUE;
        no0 no0Var2 = iv6.v;
        Boolean bool4 = Boolean.FALSE;
        if (bool3.equals(k79VarH2.a(no0Var2, bool4))) {
            if (d() != null) {
                d().g().u();
            }
            Integer num = (Integer) k79VarH2.a(iv6.e, null);
            if (num == null || num.intValue() == 256) {
                z = true;
            } else {
                b21.W("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z) {
                b21.W("ImageCapture", "Unable to support software JPEG. Disabling.");
                k79VarH2.p(no0Var2, bool4);
            }
        }
        Integer num2 = (Integer) wjfVar.h().a(iv6.e, null);
        if (num2 != null) {
            if (d() != null) {
                d().g().u();
            }
            wjfVar.h().p(wv6.C, Integer.valueOf(z ? 35 : num2.intValue()));
        } else {
            k79 k79VarH3 = wjfVar.h();
            no0 no0Var3 = iv6.f;
            if (Objects.equals(k79VarH3.a(no0Var3, null), 2)) {
                wjfVar.h().p(wv6.C, 32);
            } else if (Objects.equals(wjfVar.h().a(no0Var3, null), 3)) {
                wjfVar.h().p(wv6.C, 32);
                wjfVar.h().p(wv6.D, 256);
            } else if (Objects.equals(wjfVar.h().a(no0Var3, null), 1)) {
                wjfVar.h().p(wv6.C, 4101);
                wjfVar.h().p(wv6.E, qr4.c);
            } else if (z) {
                wjfVar.h().p(wv6.C, 35);
            } else {
                List list = (List) wjfVar.h().a(ew6.M, null);
                if (list == null || H(256, list)) {
                    wjfVar.h().p(wv6.C, 256);
                } else if (H(35, list)) {
                    wjfVar.h().p(wv6.C, 35);
                }
            }
        }
        return wjfVar.o();
    }

    @Override // defpackage.oif
    public final void w() {
        vfc vfcVar = this.w;
        vfcVar.c();
        vfcVar.b();
        cee ceeVar = this.z;
        if (ceeVar != null) {
            ceeVar.b();
        }
    }

    @Override // defpackage.oif
    public final hq0 x(qh2 qh2Var) {
        this.x.a(qh2Var);
        Object[] objArr = {this.x.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        C(Collections.unmodifiableList(arrayList));
        hc2 hc2VarB = this.j.b();
        hc2VarB.g = qh2Var;
        return hc2VarB.c();
    }

    @Override // defpackage.oif
    public final hq0 y(hq0 hq0Var, hq0 hq0Var2) {
        b21.q("ImageCapture", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + hq0Var + ", secondaryStreamSpec " + hq0Var2);
        vzc vzcVarF = F(f(), (iv6) this.i, hq0Var);
        this.x = vzcVarF;
        Object[] objArr = {vzcVarF.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        C(Collections.unmodifiableList(arrayList));
        p();
        return hq0Var;
    }

    @Override // defpackage.oif
    public final void z() {
        vfc vfcVar = this.w;
        vfcVar.c();
        vfcVar.b();
        cee ceeVar = this.z;
        if (ceeVar != null) {
            ceeVar.b();
        }
        E(false);
        e().e(null);
    }
}
