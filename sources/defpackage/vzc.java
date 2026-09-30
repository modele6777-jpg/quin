package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vzc extends uzc {
    public static vzc d(xjf xjfVar, Size size) {
        if (((jk1) xjfVar.a(xjf.g0, null)) == null) {
            s8f.h((String) xjfVar.a(kfe.a0, xjfVar.toString()), "Implementation is missing option unpacker for ");
            return null;
        }
        vzc vzcVar = new vzc();
        size.getClass();
        zzc zzcVar = (zzc) xjfVar.a(xjf.e0, null);
        bs9 bs9Var = bs9.c;
        bs9Var.getClass();
        int i = zzc.a().g.c;
        ArrayList arrayList = vzcVar.d;
        ArrayList arrayList2 = vzcVar.c;
        r1f r1fVar = vzcVar.b;
        if (zzcVar != null) {
            im1 im1Var = zzcVar.g;
            i = im1Var.c;
            for (CameraDevice.StateCallback stateCallback : zzcVar.c) {
                if (!arrayList2.contains(stateCallback)) {
                    arrayList2.add(stateCallback);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback2 : zzcVar.d) {
                if (!arrayList.contains(stateCallback2)) {
                    arrayList.add(stateCallback2);
                }
            }
            r1fVar.a(im1Var.d);
            bs9Var = im1Var.b;
        }
        r1fVar.c = k79.m(bs9Var);
        int i2 = 7;
        if (xjfVar instanceof yta) {
            Rational rational = aua.a;
            if (((PreviewPixelHDRnetQuirk) s74.a().b(PreviewPixelHDRnetQuirk.class)) != null && !pa7.t(aua.a, new Rational(size.getWidth(), size.getHeight()))) {
                k79 k79VarJ = k79.j();
                CaptureRequest.Key key = CaptureRequest.TONEMAP_MODE;
                key.getClass();
                k79VarJ.p(af1.D(key), 2);
                r1fVar.e(new od1(i2, bs9.d(k79VarJ)));
            }
        }
        Object objA = xjfVar.a(od1.d, Integer.valueOf(i));
        objA.getClass();
        r1fVar.a = ((Number) objA).intValue();
        CameraDevice.StateCallback stateCallback3 = (CameraDevice.StateCallback) xjfVar.a(od1.e, null);
        if (stateCallback3 != null && !arrayList2.contains(stateCallback3)) {
            arrayList2.add(stateCallback3);
        }
        CameraCaptureSession.StateCallback stateCallback4 = (CameraCaptureSession.StateCallback) xjfVar.a(od1.f, null);
        if (stateCallback4 != null && !arrayList.contains(stateCallback4)) {
            arrayList.add(stateCallback4);
        }
        CameraCaptureSession.CaptureCallback captureCallback = (CameraCaptureSession.CaptureCallback) xjfVar.a(od1.g, null);
        if (captureCallback != null) {
            gk1 gk1Var = new gk1(captureCallback);
            r1fVar.d(gk1Var);
            ArrayList arrayList3 = vzcVar.e;
            if (!arrayList3.contains(gk1Var)) {
                arrayList3.add(gk1Var);
            }
        }
        int iY = xjfVar.y();
        if (iY != 0 && iY != 0) {
            ((k79) r1fVar.c).p(xjf.q0, Integer.valueOf(iY));
        }
        int iT = xjfVar.t();
        if (iT != 0 && iT != 0) {
            ((k79) r1fVar.c).p(xjf.r0, Integer.valueOf(iT));
        }
        k79 k79VarJ2 = k79.j();
        no0 no0Var = od1.x;
        String str = (String) xjfVar.a(no0Var, null);
        if (str != null) {
            k79VarJ2.p(no0Var, str);
        }
        no0 no0Var2 = od1.v;
        Long l = (Long) xjfVar.a(no0Var2, null);
        if (l != null) {
            k79VarJ2.p(no0Var2, Long.valueOf(l.longValue()));
        }
        r1fVar.e(k79VarJ2);
        mjg mjgVar = new mjg(7);
        xjfVar.g(new bo1(0, mjgVar, xjfVar));
        r1fVar.e(new ssg(i2, bs9.d((k79) mjgVar.a)));
        return vzcVar;
    }

    public final void a(qh2 qh2Var) {
        this.b.e(qh2Var);
    }

    public final void b(lu3 lu3Var, qr4 qr4Var, int i) {
        a82 a82VarA = eq0.a(lu3Var);
        if (qr4Var == null) {
            r82.g("Null dynamicRange");
            return;
        }
        a82VarA.f = qr4Var;
        a82VarA.b = Integer.valueOf(i);
        this.a.add(a82VarA.s());
        ((HashSet) this.b.b).add(lu3Var);
    }

    public final zzc c() {
        return new zzc(new ArrayList(this.a), new ArrayList(this.c), new ArrayList(this.d), new ArrayList(this.e), this.b.j(), this.f, this.g, this.h, this.i);
    }
}
