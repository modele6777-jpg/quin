package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.compat.quirk.ZslDisablerQuirk;
import io.sentry.android.core.b1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class deg implements ceg {
    public final yg1 a;
    public final ace b = new ace(new h2e(25, this));
    public final vea c = new vea(new s8f(18));
    public boolean d;
    public boolean e;
    public final boolean f;
    public sbc g;
    public vx6 h;

    public deg(gh1 gh1Var) {
        this.a = gh1Var.b;
        this.f = s74.a().b(ZslDisablerQuirk.class) != null;
    }

    @Override // defpackage.ceg
    public final void a() throws Exception {
        j();
    }

    @Override // defpackage.ceg
    public final void b(vzc vzcVar) throws Exception {
        r1f r1fVar = vzcVar.b;
        j();
        int i = 1;
        if (this.d) {
            r1fVar.a = 1;
            return;
        }
        if (this.f) {
            r1fVar.a = 1;
            return;
        }
        yg1.o.getClass();
        yg1 yg1Var = this.a;
        yg1Var.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        key.getClass();
        int[] iArr = (int[]) ((nc1) yg1Var).c(key);
        if (iArr == null) {
            iArr = xg1.b;
        }
        if (!qd0.T(iArr, 4)) {
            if (b21.F(4, "CXCP")) {
                Log.i("CXCP", "ZslControlImpl: Private reprocessing isn't supported");
            }
            r1fVar.a = 1;
            return;
        }
        ace aceVar = this.b;
        Size[] inputSizes = ((StreamConfigurationMap) aceVar.getValue()).getInputSizes(34);
        inputSizes.getClass();
        Iterator it = qd0.G0(inputSizes).iterator();
        if (!it.hasNext()) {
            s8f.c();
            return;
        }
        Object next = it.next();
        if (it.hasNext()) {
            Size size = (Size) next;
            size.getClass();
            int height = size.getHeight() * size.getWidth();
            do {
                Object next2 = it.next();
                Size size2 = (Size) next2;
                size2.getClass();
                int height2 = size2.getHeight() * size2.getWidth();
                if (height < height2) {
                    next = next2;
                    height = height2;
                }
            } while (it.hasNext());
        }
        Size size3 = (Size) next;
        if (size3 == null) {
            if (b21.F(5, "CXCP")) {
                b1.l("CXCP", "ZslControlImpl: Unable to find a supported size for ZSL");
                return;
            }
            return;
        }
        if (b21.F(3, "CXCP")) {
            Log.d("CXCP", "ZslControlImpl: Selected ZSL size: " + size3);
        }
        int[] validOutputFormatsForInput = ((StreamConfigurationMap) aceVar.getValue()).getValidOutputFormatsForInput(34);
        validOutputFormatsForInput.getClass();
        if (!qd0.T(validOutputFormatsForInput, 256)) {
            if (b21.F(5, "CXCP")) {
                b1.l("CXCP", "ZslControlImpl: JPEG isn't valid output for ZSL format");
                return;
            }
            return;
        }
        yu8 yu8Var = new yu8(size3.getWidth(), size3.getHeight(), 34, 9);
        ie1 ie1Var = yu8Var.b;
        ie1Var.getClass();
        sbc sbcVar = new sbc(yu8Var);
        yu8Var.h0(new xag(i, this), dd7.a());
        Surface surface = sbcVar.getSurface();
        if (surface == null) {
            qc0.p("Required value was null.");
            return;
        }
        vx6 vx6Var = new vx6(surface, new Size(sbcVar.d(), sbcVar.c()), 34);
        bm8.J(vx6Var.e).b(new nm1(sbcVar, 3), ok8.w());
        vzcVar.b(vx6Var, qr4.d, -1);
        r1fVar.d(ie1Var);
        ArrayList arrayList = vzcVar.e;
        if (!arrayList.contains(ie1Var)) {
            arrayList.add(ie1Var);
        }
        vzcVar.g = new InputConfiguration(sbcVar.d(), sbcVar.c(), sbcVar.v());
        this.g = sbcVar;
        this.h = vx6Var;
    }

    @Override // defpackage.ceg
    public final boolean c() {
        return this.d;
    }

    @Override // defpackage.ceg
    public final boolean d() {
        return this.e;
    }

    @Override // defpackage.ceg
    public final void e(boolean z) {
        this.e = z;
    }

    @Override // defpackage.ceg
    public final void f(boolean z) throws Exception {
        if (this.d != z && z) {
            i();
        }
        this.d = z;
    }

    @Override // defpackage.ceg
    public final iw6 g() {
        try {
            return (iw6) this.c.p();
        } catch (NoSuchElementException unused) {
            if (!b21.F(5, "CXCP")) {
                return null;
            }
            b1.l("CXCP", "ZslControlImpl#dequeueImageFromBuffer: No such element");
            return null;
        }
    }

    @Override // defpackage.ceg
    public final boolean h(lu3 lu3Var, zzc zzcVar) {
        Size size = lu3Var.h;
        zzcVar.getClass();
        InputConfiguration inputConfiguration = zzcVar.i;
        return inputConfiguration != null && lu3Var.i == inputConfiguration.getFormat() && size.getWidth() == inputConfiguration.getWidth() && size.getHeight() == inputConfiguration.getHeight();
    }

    public final void i() throws Exception {
        boolean zIsEmpty;
        vea veaVar = this.c;
        while (true) {
            synchronized (veaVar.c) {
                zIsEmpty = ((ArrayDeque) veaVar.b).isEmpty();
            }
            if (zIsEmpty) {
                return;
            } else {
                ((iw6) veaVar.p()).close();
            }
        }
    }

    public final void j() throws Exception {
        vx6 vx6Var = this.h;
        if (vx6Var != null) {
            sbc sbcVar = this.g;
            if (sbcVar != null) {
                bm8.J(vx6Var.e).b(new nm1(sbcVar, 4), ok8.w());
                sbcVar.B();
                this.g = null;
            }
            vx6Var.a();
            this.h = null;
        }
        i();
    }
}
