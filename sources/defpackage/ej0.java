package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.media.AudioDeviceInfo;
import android.media.ImageReader;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Size;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ej0 implements goe {
    public boolean a;
    public final Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object v;
    public Object w;
    public Object x;
    public Object y;

    public ej0(Context context, jv2 jv2Var, xi0 xi0Var, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.c = jv2Var;
        this.y = xi0Var;
        this.x = audioDeviceInfo;
        String str = pqf.a;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.d = handler;
        this.e = new cj0(this);
        this.f = new n80(1, this);
        yob yobVar = bj0.e;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.g = uriFor != null ? new dj0(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    @Override // defpackage.goe
    public void V(dd2 dd2Var, l46 l46Var, int i) {
        l46Var.h0(794272399);
        int i2 = i | (l46Var.g(this) ? 32 : 16);
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            iec.a(yse.b, ((use) this.b).d().c, dd2Var, (rpe) this.d, (n26) this.e, (l26) this.f, (l26) this.g, null, pa7.t((ype) this.c, gec.x), this.a, false, (m77) this.v, (xw9) this.w, (wne) this.x, (dd2) this.y, l46Var, 390, 0);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new rk6(this, dd2Var, i, 15);
        }
    }

    public List a() {
        iud iudVar;
        if (Build.VERSION.SDK_INT >= 32 && (iudVar = (iud) this.v) != null) {
            return iudVar.b();
        }
        ey6 ey6Var = jy6.b;
        return yob.e;
    }

    public void b(bj0 bj0Var) {
        if (!this.a || bj0Var.equals((bj0) this.w)) {
            return;
        }
        this.w = bj0Var;
        cl0 cl0Var = (cl0) ((jv2) this.c).b;
        cl0Var.f();
        bj0 bj0Var2 = cl0Var.g;
        if (bj0Var2 == null || bj0Var.equals(bj0Var2)) {
            return;
        }
        cl0Var.g = bj0Var;
        f98 f98Var = cl0Var.e;
        if (f98Var != null) {
            f98Var.e(-1, new qc0(7));
        }
    }

    public iw6 c(xp0 xp0Var) throws Exception {
        sp0 sp0VarM;
        b21.q("ProcessingNode", "processInMemoryCapture: request ID = " + xp0Var.a.a);
        uva uvaVar = xp0Var.a;
        sp0 sp0Var = (sp0) ((jy4) this.d).apply(xp0Var);
        ArrayList arrayList = ((wp0) this.c).d;
        ok8.l(!arrayList.isEmpty());
        int iIntValue = ((Integer) arrayList.get(0)).intValue();
        if ((sp0Var.c == 35 || this.a) && iIntValue == 256) {
            m6c m6cVar = (m6c) this.e;
            fp0 fp0Var = new fp0(sp0Var, uvaVar.e);
            m6cVar.getClass();
            try {
                Object obj = sp0Var.a;
                int i = sp0Var.c;
                if (i != 35) {
                    if (i != 256 && i != 4101) {
                        throw new IllegalArgumentException("Unexpected format: " + i);
                    }
                    sp0VarM = m6cVar.L(fp0Var, i);
                } else {
                    sp0VarM = m6c.M(fp0Var);
                }
                ((iw6) obj).close();
                ((y25) this.w).getClass();
                sbc sbcVar = new sbc(new egh(ImageReader.newInstance(sp0VarM.d.getWidth(), sp0VarM.d.getHeight(), 256, 2)));
                iw6 iw6VarA = ImageProcessingUtil.a(sbcVar, (byte[]) sp0VarM.a);
                sbcVar.a();
                Objects.requireNonNull(iw6VarA);
                e35 e35Var = sp0VarM.b;
                Objects.requireNonNull(e35Var);
                Rect rect = sp0VarM.e;
                int i2 = sp0VarM.f;
                Matrix matrix = sp0VarM.g;
                oe1 oe1Var = sp0VarM.h;
                gs5 gs5Var = (gs5) iw6VarA;
                Size size = new Size(gs5Var.d(), gs5Var.c());
                gs5Var.getFormat();
                sp0Var = new sp0(iw6VarA, e35Var, gs5Var.getFormat(), size, rect, i2, matrix, oe1Var);
            } catch (Throwable th) {
                ((iw6) sp0Var.a).close();
                throw th;
            }
        }
        ((eu4) this.v).getClass();
        iw6 iw6Var = (iw6) sp0Var.a;
        p3d p3dVar = new p3d(iw6Var, sp0Var.d, new gp0(iw6Var.u0().c(), iw6Var.u0().i(), sp0Var.f, sp0Var.g, iw6Var.u0().e()));
        Rect rect2 = new Rect(sp0Var.e);
        if (!rect2.intersect(0, 0, p3dVar.f, p3dVar.g)) {
            rect2.setEmpty();
        }
        synchronized (p3dVar.d) {
        }
        if (arrayList.size() > 1) {
            uvaVar.b.b(p3dVar.getFormat());
        }
        return p3dVar;
    }

    public void d() {
        List listA = a();
        Context context = (Context) this.b;
        xi0 xi0Var = (xi0) this.y;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.x;
        yob yobVar = bj0.e;
        b(bj0.b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), xi0Var, audioDeviceInfo, listA));
    }

    public ej0(Executor executor, CameraCharacteristics cameraCharacteristics) {
        k9b k9bVar = q74.a;
        if (q74.a.b(LowMemoryQuirk.class) != null) {
            this.b = new lyc(executor);
        } else {
            this.b = executor;
        }
        this.y = k9bVar;
        this.a = k9bVar.a(IncorrectJpegMetadataQuirk.class);
    }

    public ej0(use useVar, ype ypeVar, rpe rpeVar, n26 n26Var, l26 l26Var, l26 l26Var2, boolean z, m77 m77Var, xw9 xw9Var, wne wneVar, dd2 dd2Var) {
        this.b = useVar;
        this.c = ypeVar;
        this.d = rpeVar;
        this.e = n26Var;
        this.f = l26Var;
        this.g = l26Var2;
        this.a = z;
        this.v = m77Var;
        this.w = xw9Var;
        this.x = wneVar;
        this.y = dd2Var;
    }
}
